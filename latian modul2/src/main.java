import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception{
        ArrayList<String> Hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println("Before");
        System.out.println(Hewan);
        System.out.println("After");
        DeleteHewan.addAll(Hewan);
        int Hapushewan1 = 1;
        int Hapushewan2 = 2;
        int Hapushewan3 = 3;

        System.out.println("Hewan yang dihapus\t:");

        System.out.println(DeleteHewan.get(Hapushewan1) + "," +DeleteHewan.get(Hapushewan2) + "," + DeleteHewan.get(Hapushewan3) +"");
        DeleteHewan.remove("Kelinci");
        DeleteHewan.remove("Kambing");
        DeleteHewan.remove("Unta");

        System.out.println(DeleteHewan);
    }
}
