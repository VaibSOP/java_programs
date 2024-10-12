public class number{
    public static int length;

    public static void binTOdec(int n){
        int power=0;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,power));
            power++;
            n=n/2;

        }
        System.out.println("binary form of"+ int n+"="+bin num)
    }

    public static Object length(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }
    }


   