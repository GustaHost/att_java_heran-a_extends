public abstract class instrumentoCorda extends instrumento{

    String tipoCorda;
    public instrumentoCorda(String tom, int tamanho, String tipoCorda) {
        super(tom, tamanho);
        this.tipoCorda = tipoCorda;
        
    }
    
    @Override
    public void tocar() {
        System.out.println("tocando um instrumento ====> rsrs rudum rsrsr");
        
    }

    
    
}
