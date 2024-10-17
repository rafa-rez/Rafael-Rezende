public class A {
    private int A1;
    private float A2;

    public int MA1(){
        System.out.print("MA1:");
        return A1;
    }

    public float MA2(){
        System.out.print("MA2:");
        return A2;
    }
    
    public void MA3(){
        System.out.print("Alteração a classe A partir do clone");
    }

    public int getSoma(int numA, int numB){
        return  numA+numB;
    }
}
