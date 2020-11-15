class dog{
    String food="骨头";
    void eat(){
        System.out.println("苟吃"+food);
    }
        }
public class object {
    public static void main(String[] args) {
        dog a=new dog();
        a.eat();
    }
}
