function LinearSearch(arr) {
  n = arr.length;
  var x = 9;
  let rep = "Mảng chứa kí tự đặc biệt";
  let r = "Mảng rỗng";

  if (n == 0) {
    console.log(r);
  } else {
    if (!Number.isInteger(arr)) {
      console.log(rep);
    } else {
      for (let i = 0; i < n; i++) {
        // console.log(arr[i]);
        if (x == arr[i]) {
          console.log("Số " + x + " ở vị trí:" + i);
          // return `Số ${x} ở vị trí :${i}`;
        }
      }
    }
  }
}

const array = [9, "string"];

LinearSearch(array);
