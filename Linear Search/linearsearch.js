function LinearSearch(arr) {
  n = arr.length;
  var x = 9;
  let rep = "Ko tìm thấy số phù hợp";
  let r = "Mảng rỗng";
  if (n == 0) {
    console.log(r);
  } else {
    if (n == 1) {
      for (let i = 0; i < n; i++) {
        if (x == arr[0]) {
          console.log("Số" + x + "ở vị trí :0");
        } else {
          console.log(rep + arr);
        }
      }
    }
    for (let i = 0; i < n; i++) {
      // console.log(arr[i]);
      if (x == arr[i]) {
        console.log("Số " + x + " ở vị trí:" + i);
        // return `Số ${x} ở vị trí :${i}`;
      }
    }
  }
  console.log(rep);
}

const array = [8, 10];

LinearSearch(array);
