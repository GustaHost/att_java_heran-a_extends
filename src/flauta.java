public class flauta extends instrumentoSopro implements afinador{

    public flauta(String tom, int tamanho, String tipoMaterial) {
        super(tom, tamanho, tipoMaterial);
        
    }

    
    @Override
    public void tocar() {
        System.out.println("tocando flauta: fiu fiu fiu");
        
    }
    

    @Override
    public void afinar() {
        System.out.println("flauta afinada!!");
    }


    @Override
    public void mudarTom(String string) {
        
    }


    
    
    
}
