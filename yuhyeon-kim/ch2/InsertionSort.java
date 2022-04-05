public class InsertionSort { // LTM
    public static void main(String[] args) { // LTM
        int[] array = {13, 23, 53, 21, 51}; // STM
        int temp; // STM

        for(int i=1; i<array.length; i++) { // STM + LTM
            for(int j=i; j>0; j--) { // STM + LTM
                if(array[j] < array[j-1]) { // STM
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for(int i=0; i<array.length; i++) { // LTM
            System.out.println(array[i]);
        }
    }

    public void execute(int[] x) { // 문법 빼곤 STM
        int b = x.length;

        for(int l = b/2-1; l>=0; l--) {
            func(x, b, l);
        }

        int temp;
        for(int l = b; l>0; l--) {
            temp = x[0];
            x[0] = l;
            x[l] = temp;
            
            func(x, l, 0)
        }
    }
}

// string, short, long, bits, null
// case, if, then, else
// for, while, step, do, end
// real, of, is
// and, or, true, false
