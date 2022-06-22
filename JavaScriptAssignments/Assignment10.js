function fibonacci() {
    let a=1;
    let b=1;
    let c;
    for(let i=0;i<=99;i++)
    {
        console.log(a);
        //a is the one which is printing the sum of previous 2 numbers
        c=a+b;
        a=b;
        b=c;    
    }  
}
//calling the function
fibonacci();

