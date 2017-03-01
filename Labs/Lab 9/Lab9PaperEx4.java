public class Lab9PaperEx4 {
  public static void main(String[] args) {
    
    int[] list = {2, 7, -11};
    System.out.println(xMethod(list, list.length-1));
  
  }

  public static int xMethod(int[] list, int high) {
    if (high == 0) {
      return list[0];
    }
    else {
      int tmp=xMethod(list, high - 1);
      if (tmp>list[high])
        return tmp;
      else
        return list[high];
    }
  }
}

