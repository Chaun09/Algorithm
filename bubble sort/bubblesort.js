function bubbleSort(arr) {
   let n = arr.length;
   let swapped;

   do {
       swapped = false;
       for (let i = 1; i < n; i++) {
           if (arr[i - 1] > arr[i]) {
               let temp = arr[i - 1];
               arr[i - 1] = arr[i];
               arr[i] = temp;
               swapped = true;
           }
       }
       n--; 
   } 
   while (swapped);
   return arr;
}
function checkrong(arr){
    let n = arr.length;
    let t = "Mảng rỗng";
    let f = "Mảng ko rỗng";
    if(n == 0){
        return t;
    }
    else{
       return f;
    }
}
function validate(arr){
    let n = arr.length;
    let x = 8;
    let rep = "Dãy toàn số nguyên:";
    for(let i = 0; i < n; i++)
    {
        if(typeof(arr[i]) !== typeof(x))
        {
            return rep + false;
        }
    }
    return rep + true;

}

// Ví dụ sử dụng
let array = [8.5 , 8, 1, 2, 3];
console.log("Current pass:" + (array.length - 1));
console.log("Mảng ban đầu: " + array);
console.log("Mảng sau khi sắp xếp: " + bubbleSort(array));
console.log("Mảng có rỗng không?" + checkrong(array));
console.log(validate(array));



