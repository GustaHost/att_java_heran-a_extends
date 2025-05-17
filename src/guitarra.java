public class guitarra extends instrumentoCorda implements afinador{

    public guitarra(String tom, int tamanho, String tipoCorda) {
        super(tom, tamanho, tipoCorda);
        
    }

    @Override
    public void afinar() {
        System.out.println("A guitarra está afinada!!");
        
    }


    @Override
    public void tocar() {
        System.out.println("tocando Guitarra: rum bat dum");
        
    }

    @Override
    public void mudarTom(String string) {
        
    }

   

    
    
}
