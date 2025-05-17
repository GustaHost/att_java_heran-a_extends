import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        List<instrumento> instrumentos = new ArrayList<>();
        instrumentos.add(new violao("sla", 5, "fina", 3));
        instrumentos.add(new flauta("f", 3, "madeira"));
        */

        instrumento v = new violao("sla", 5, "fina", 3);
        instrumento g = new guitarra("tudum", 6, "branca");
        trompete t = new trompete("som de trompete ", 5, "preto");
        flauta f = new flauta("fiu fiu", 3, "madeira");

        /*if (v instanceof violao) {
            violao vio = (violao) v;
            vio.tocar();  
        }else if (g instanceof guitarra) {
            guitarra guit = (guitarra) v;
            guit.tocar();  
        }else{
            v.tocar();
        }

        if (g instanceof violao) {
            violao vio = (violao) g;
            vio.tocar();  
        }else if (g instanceof guitarra) {
            guitarra guit = (guitarra) g;
            guit.tocar();  
        }else{
            g.tocar();
        }
*/
        
        v.identificação(v);
 
        t.tocar();
        f.tocar();
        

        
        
        
    }


}
