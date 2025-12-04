class Solution {
    public List<Integer> generateRows(int row) {
        List<Integer> rowList = new ArrayList<>();
        long ans = 1;
        rowList.add(1); //becoz first element is always 1
        for (int i = 1; i <= row; i++) { //starting from 1 coz 0th place is 1 always
            ans = ans * (row - i + 1) / i;
            rowList.add((int) ans);
        }

        return rowList;
    }
    public List<Integer> getRow(int rowIndex) {
        //List<Integer> ans = new ArrayList<>();
        return generateRows(rowIndex);
    }
}