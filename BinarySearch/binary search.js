function BinarySearch(arr) {
  let n = arr.length;
  let left = 0;
  let right = n - 1;
  let mid = (left + right) / 2;
  let x = 4;
  do {
    if (arr[mid] == x) {
      return mid;
    } else if (arr[mid] < x) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  } while (left <= right);
}

const array = [1, 2, 3, 4, 5];
console.log(BinarySearch(array));
