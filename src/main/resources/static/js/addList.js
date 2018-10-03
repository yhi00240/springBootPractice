var submitUrl = "http://localhost:8080/api/hello";
function addList(){
    var a = 5;
    console.log(a);

    $.ajax({
            url: submitUrl,
            data: "jihyunJjang",
            dataType: "text",
            method: "post",
            success: function(response){
                alert("success");
            },
            error: function(request, status, error){
                alert("fail");
            }
     });


}