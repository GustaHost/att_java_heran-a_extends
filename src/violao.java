public class violao extends instrumentoCorda implements afinador{

    int numCordas;
    public violao(String tom, int tamanho, String tipoCorda, int numCordas) {
        super(tom, tamanho, tipoCorda);
        this.numCordas = numCordas;
        
    }

    @Override
    public void afinar() {
        System.out.println("O violão está afinado!!");
    }

    public void tocarAcordes() {
        System.out.println("tocando acordes!!");
    }

    

    @Override
    public void mudarTom(String string) {
        
    }

    
    
    
}
