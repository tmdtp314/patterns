var tickents = [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]];
   
function solution(tickents){
    var answer=[];
 
    answer=tickents;

    array[tickents]

    
   
}
function array(arr_){
   
    var x=0;
    
    var arr2=[];
    var result=[];
    var arr =arr_;
  
    for(var i=0;i<arr.length;i++){
       if(arr[i][0]=="ICN"){
           for(var j=0;j<arr[i].length;j++){
           //console.log(parseInt('AAA',36))
           if(parseInt(arr[i][x],36)>parseInt(arr[i][j],36)) {
               arr2.length=0; // 초기화
               x=i;
               arr2.push(arr[i])
            
            }
           }
       }
       
    }
   tickents.splice(x,1)
   result.push(arr2)
  // console.log(arr2)
  return arr2;
   
}
solution(tickents);
console.log(tickents)
