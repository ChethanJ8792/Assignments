function list()
{
    var array =["Hello","world","in","a","frame"];
    console.log("*******");
    array.forEach(element => {
        //console.log("******");
        //element.charAt(0).concat("*");
        //element.charAt(array.length-1).concat("*");
        //console.log("*")
        console.log("*"+element.concat("*"));
    });
    console.log("*******");
    
}
list();