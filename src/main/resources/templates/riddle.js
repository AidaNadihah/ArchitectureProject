var baseurl = "http://localhost:8080/tekateki";
function loadBooks()
{
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.open("GET",baseurl,true);
    xmlhttp.onreadystatechange = function()
    {
        if (xmlhttp.readyState ===4 && xmlhttp.status ===200)
        {
            var tekateki = JSON.parse(xmlhttp.responseText);
            var tbltop = "<table><tr><th>ID</th><th>Title</th><th>Genre</th></tr>";
            var main = "";
            for (i = 0; i < tekateki.length; i++)
            {
                main += "<tr><td>" + tekateki[i].id + "</td><td>" + tekateki[i].question + "</td><td>"+ tekateki[i].answer + "</td></tr>>";
            }
            var tblbottom = "</table>";
            var tbl = tbltop + main + tblbottom;
            document.getElementById("tekatekiinfo").innerHTML = tbl;
        }
    };
    xmlhttp.send();
}
window.onload = function()
{
    loadBooks();
}