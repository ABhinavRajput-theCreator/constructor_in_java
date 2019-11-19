public class typeofconstrctr {

    typeofconstrctr()
    {       //non- parameterized constructor
        System.out.println("Non paramerterized");
    }
    typeofconstrctr(int a )
    {       // parameterized constructor
        System.out.println("paramerterized");
    }

    public static void main(String[] args) {
        typeofconstrctr obj1 = new typeofconstrctr();
        typeofconstrctr obj2 = new typeofconstrctr(15);
    }

}
