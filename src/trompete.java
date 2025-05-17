public class trompete extends instrumentoSopro implements afinador{

    public trompete(String tom, int tamanho, String tipoMaterial) {
        super(tom, tamanho, tipoMaterial);
        
    }
    
    @Override
    public void tocar() {
        System.out.println("tocando trompete: sem de trompete tromp tromp");
        
    }

    @Override
    public void afinar() {
        System.out.println("Trompete afinada!!");
    }

    @Override
    public void mudarTom(String string) {
        
    }

    

    
}
