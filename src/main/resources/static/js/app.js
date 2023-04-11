function answerRequest(){
    if($('#answerInput').val() === null){
        return
    }
   $.ajax({
     url: "/answer",
     type: "GET",
     cache: false,
     dataType: "json",
     data: {
       operand: $('#operand').val(),
       answerInput: $('#answerInput').val()
     },
     success: function(o){
        //form要素はval()だが、pタグなどはtext()
       $('#judge').text("正解!")
     },
     error: function(xhr, textStatus, errorThrown){
        console.log(errorThrown)
       alert('Error');
     }
   });
}