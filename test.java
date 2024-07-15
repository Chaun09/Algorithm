public class test {
    public static int gg() {
        int a[] = { 0, 1 };
        int n = a.length;
        int x = -1;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (a[mid] == x) {
                return mid;

            } else if (a[mid] < x) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }

        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(gg());
    }

}
