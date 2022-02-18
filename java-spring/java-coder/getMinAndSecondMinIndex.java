class getMinAndSecondMinIndex {
    public static void main(String[] args) {
        System.out.println(getMinIndex(values));
        System.out.println(getSecondMinIndex(values));
    }

    private static int[] values = {2, 4, 3, 1, 5};

    public static int getMinIndex(int[] values) {
        int minVal = Integer.MAX_VALUE;
        int minIdx = -1;

        for (int i =  0; i < values.length; i++) {
            if (values[i] < minVal) {
                minVal = values[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx = getMinIndex(values);

        for (int i = 0; i < values.length; i++) {
            if (i == minIdx)
                continue;
            if (secondIdx == -1 || values[i] < values[secondIdx])
                secondIdx = i;
        }
        return secondIdx;
    }
}
