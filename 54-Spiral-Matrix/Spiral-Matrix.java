class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;      // rows
        int m = matrix[0].length;  //  columns 
        int left = 0;     // left row
        int right = m-1; //  Right row
        int top = 0;      //   upper column
        int bottom = n-1;  //    Lower column

        ArrayList<Integer> list = new ArrayList<>();   
        while(top<=bottom && left<=right){

            if(list.size() == m*n) break;    
            for(int i=left;i<=right;i++)  list.add(matrix[top][i]);
            top++;
            
            if(list.size() == m*n) break; 
            for(int i=top;i<=bottom;i++)  list.add(matrix[i][right]);
            right--;

            if(list.size() == m*n) break; 
            if(top<=right){
                for(int i=right;i>=left;i--) list.add(matrix[bottom][i]);
                bottom--;
            }

            if(list.size() == m*n) break; 
            if(left<=right){
                for(int i=bottom;i>=top;i--)  list.add(matrix[i][left]);
                left++;
            }
        }
    return list;
    }
}
