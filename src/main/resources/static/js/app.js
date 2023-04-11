function answerRequest(target){
    if($('#answerInput').val() === null){
        return
    }
   $.ajax({
     url: "/answer",
     type: "GET",
     cache: false,
     dataType: "json",
     data: {
       operand: $('#operand' + target).val(),
       answerInput: $('#answerInput' + target).val()
     },
     success: function(o){
        //form要素はval()だが、pタグなどはtext()
       $('#judge' + target).text("正解!")
     },
     error: function(xhr, textStatus, errorThrown){
        console.log(errorThrown)
       alert('Error');
     }
   });
}