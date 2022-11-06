import java.util.scanner;
public class intcase {
    public static void main(string []arg){
        string hari;
        
        system.out.print(s: "masukan kode :");
        scanner input = new scanner (system.in);
        hari = input.nextline();
        switch(hari)
        {
 
            case sen:
                system.out.print(s: "senin");
            case sel:
                system.out.print(s: "selasa");
            case rab:
                system.out.print(s: "rabu");  
            case kam:
                system.out.print(s: "kamis");
            case jum:
                system.out.print(s: "jum'at");
            case sab:
                system.out.print(s: "sabtu");
            default:
                system.out.print(s: "kode salah");
        }
    }
}