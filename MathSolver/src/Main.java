interface MathSolver{
    int sum(int... nums);
    int subtract(int a, int b);
    int multiply(int a, int b);

    }
class MathSolverImp implements MathSolver{
    @Override
    public int sum(int... nums) {
        int relsult = 0;
        for(int num: nums){
            relsult += num;
        }
        return relsult;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
public class Main {
    public static void main(String[] args) {
        MathSolver ms = new MathSolverImp();
            int sumRS = ms.sum(1, 3, 9);
            System.out.println("Sum is: "+sumRS);
            int subRS = ms.subtract(3,2);
            System.out.println("Subtract is : "+subRS);
            int mulRS = ms.multiply(2,3);
            System.out.println("Multiply is : "+mulRS);
    }
}