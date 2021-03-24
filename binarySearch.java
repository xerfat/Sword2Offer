/**
 *   剑指Offer第1题 二分法查找数组元素
 */

public class binarySearch {
    /** sol03 二分法
      * @author xerfat (2021.03.024)
      */
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length; i += 1){
            int left = 0;
            int right = array[0].length - 1; 
            while (right >= left) {
                int mid = left + (right - left) / 2;
                if (target == array[i][mid]) {
                    return true;
                } else if (target < array[i][mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return false;
    }
}
    /** sol02 线性查找：双指针法
      * @author xerfat (2021.03.024)
      */
//     public boolean Find(int target, int [][] array) {
//         if (array == null || array.length == 0) {
//             return false;
//         }
//         int row = 0;
//         int col = array[0].length - 1;
//         while (col >= 0 && row < array.length) {
//             if (target == array[row][col]) {
//                 return true;
//             } if (target < array[row][col]) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         return false;
//     }
//  }
    
    /** sol01 暴力解法
      * @author xerfat (2021.03.024)
      */
//     public boolean Find(int target, int [][] array) {
//         int row = array.length;
//         for (int i = 0; i < row; i += 1) {
//             for (int item : array[i]) {
//                 if (target < item) {
//                     break; 
//                 }
//                 if (target == item){
//                     return true;
//                 }
//             }            
//         }
//         return false;
//     }
//}