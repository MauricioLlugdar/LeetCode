class Solution {
    public boolean isValidSudoku(char[][] board) {
        int [] rowChecker = new int[9]; // init w zeros
        int [][] colChecker = new int[9][9];
        int [][] boxChecker = new int[9][9];
        int actVal, boxRow, boxCol, boxId;
        for(int i=0; i<=8; i++){
            for (int j = 0; j <= 8; j++) {
                char boardActVal = board[i][j];
                if(boardActVal != '.'){ // is a number
                    actVal = Character.getNumericValue(boardActVal) - 1; // represent with numb 0-8 instead of 1-9
                    boxRow = i / 3;
                    boxCol = j / 3;
                    boxId = boxRow*3+boxCol;
                    if(rowChecker[actVal] == 0 && colChecker[actVal][j] == 0 && boxChecker[boxId][actVal] == 0) {
                        rowChecker[actVal] = 1; // mark the act num
                        colChecker[actVal][j] = 1;
                        boxChecker[boxId][actVal] = 1;
                    }else{
                        return false;
                    }
                }
            }

            // fill w zeroes the rowChecker
            for (int k = 0; k <= 8; k++) {
                rowChecker[k] = 0;
            }
        }

        return true;
    }
}