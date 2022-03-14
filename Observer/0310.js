var tickents = [["ICN", "A"], ["A", "B"], ["A", "C"],["C","A"],["B","D"]]

function solution(tickents){
    var answer=[];
 
   
    return array(tickents);
   
}
function array(arr_){
   
    var x=0;
    
   
    var result=["ICN"];
    var start ="ICN"
    var min=start

    var arr =arr_;
    var length = arr.length;
    var arr2=[];
 
    while(length!=0){     
        for(var i=0;i<arr.length;i++){
            if(arr[i][0]==start){
            
                if(arr[i][0]==min) {
                    min=arr[i][1];
                    
                }
          
                if(parseInt(min,36)>=parseInt(arr[i][1],36)){
                min=arr[i][1];             
                x=i;           
            }

            }  
               
        }
        result.push(min) 
    arr.splice(x,1);   
    start = result[result.length-1]
    length=length-1;
    }

  return result;
   
}

console.log(solution(tickents))
