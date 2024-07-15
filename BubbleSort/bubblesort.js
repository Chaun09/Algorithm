function bubbleSort(arr) {
  let n = arr.length;
  let swapped;
  let t = "Mảng rỗng";
  let rep = "Mảng chứa kí tự";
  if (n == 0) {
    return t;
  } else {
    // for (let i = 0; i < n; i++) {
    //   if (n == 1) {
    //     return arr;
    //   }
    //   if (!Number.isInteger(arr[i]));
    //   {
    //     return rep;
    //   }
    // }
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
    } while (swapped);
  }
  return arr;
}
// function checkrong(arr){
//     let n = arr.length;
//     let t = "Mảng rỗng";
//     let f = "Mảng ko rỗng";
//     if(n == 0){
//         return t;
//     }
//     else{
//        return f;
//     }

// }
// function validate(arr){
//     let n = arr.length;
//     let x = 8;
//     let rep = "Dãy toàn số nguyên:";
//     for(let i = 0; i < n; i++)
//     {
//         if(typeof(arr[i]) !== typeof(x))
//         {
//             return rep + false;
//         }
//     }
//     return rep + true;

// }

// Ví dụ sử dụng
let array = [8, 5, 9, 1];

console.log(bubbleSort(array));
