public class cnstr {

    cnstr(){
        System.out.println("Welcome");
    }
    void Btech(){
        System.out.println("Btech prgrm...");
    }
    void BCA(){
        System.out.println("BCA prgrm...");
    }
    void MCA(){
        System.out.println("MCA prgrm...");
    }

    public static void main(String[] args) {
        cnstr obj = new cnstr();
        obj.BCA();
        obj.Btech();
        obj.MCA();
        obj.BCA();
        obj.Btech();
        obj.MCA();
    // welcome will appear only one tym...
    }


}
