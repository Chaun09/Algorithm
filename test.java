public class test {
    public static boolean main() {
        int a[] = { 1, 2, 3, };
        int n = a.length;
        int x = 3;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == x) {
                return true;

            } else if (a[mid] < x) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }

        }

        return false;

    }
}
