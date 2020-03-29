public class ClassTwo extends ClassOne{
    int num=0;
    public void plus(){
        num=num+50;
    }

    public int getNum(){
        return super.num;
    }

    public static void main(String[] args) {
        ClassOne one=new ClassOne();
        ClassTwo two=new ClassTwo();
        System.out.println(two.num);
        System.out.println(two.getNum());
        two.computer();
        System.out.println(two.num);
        System.out.println(two.getNum());
        System.out.println();
    }


}
