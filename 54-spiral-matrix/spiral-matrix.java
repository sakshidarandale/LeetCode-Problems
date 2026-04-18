class Solution {
    public List<Integer> spiralOrder(int[][] matrix)
    {

       int topRow = 0;
       int bottomRow = matrix.length - 1;
       int leftCol = 0;
       int rightCol = matrix[0].length - 1;
        
        List<Integer> list = new ArrayList<>();

        while(topRow <= bottomRow && leftCol <= rightCol)
        {
            // topRow = leftCol to rightCol
            for(int j = leftCol; j <= rightCol; j++)
            {
                list.add(matrix[topRow][j]);
            }
            topRow++;

            //rightCol = topRow to bottomRow
            for(int i = topRow; i <= bottomRow; i++)
            {
                list.add(matrix[i][rightCol]);
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol

            if(topRow <= bottomRow)
            {
                for(int j = rightCol; j >= leftCol; j--)
                {
                    list.add(matrix[bottomRow][j]);
                }
                bottomRow--;
            }

            //leftCol -> bottomRow to topRow

            if(leftCol <= rightCol)
            {
                for(int i = bottomRow; i >= topRow; i--)
                {
                    list.add(matrix[i][leftCol]);
                }
                leftCol++;
            }
            
        }

        return list;
    
    }
}