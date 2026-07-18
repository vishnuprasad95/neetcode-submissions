class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //Row validation
        for(int x=0;x<board.length;x++)
        {
            Set<Character> mySet = new HashSet<>();
            for(int y=0;y<board[x].length;y++)
            {
                if (!checkValid(board[x][y],mySet))
                    return false;
            }
        }

        //Column validation
        for(int col=0;col<board.length;col++)
        {
            Set<Character> mySet = new HashSet<>();
            for(int row=0;row<board[col].length;row++)
            {
                if (!checkValid(board[row][col],mySet))
                    return false;
            }
        }

        //Grid validation
        for(int row=0;row<board.length;row+=3)
            for(int col=0;col<board[row].length;col+=3)
            {
                Set<Character> mySet = new HashSet<>();
                for(int r=row;r<row+3;r++)
                    for(int c=col;c<col+3;c++)
                    {
                    if (!checkValid(board[r][c],mySet))
                    return false;
                    }

            }

        return true;
        
    }
    public boolean checkValid(char a,Set<Character>inputSet)
    {
        if(a =='.')
        return true;
        else return inputSet.add(a);
    }

}
