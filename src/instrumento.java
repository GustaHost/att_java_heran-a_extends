public abstract class instrumento {
    String tom;
    int tamanho;


    public instrumento(String tom, int tamanho) {
        this.tom = tom;
        this.tamanho = tamanho;
    }

    public abstract void tocar();

    public void identificação(instrumento musico){
        if (musico instanceof violao) {
            violao vio = (violao) musico;
            vio.tocar();  
        }else if (musico instanceof guitarra) {
            guitarra guit = (guitarra) musico;
            guit.tocar();  
        }else{
            musico.tocar();
        }
    }

    
    
    
}
