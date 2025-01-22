class Lt002 {
    public int reverse(int x) {
        int ans = 0;
        int pre = 0;
        while (x != 0) {
            pre = ans;
            ans = ans * 10 + x % 10;
            if (ans / 10 != pre)
                return 0;
            x = x / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Lt002 obj = new Lt002();
        int result = obj.reverse(45);
        System.out.println(result);
    }
}