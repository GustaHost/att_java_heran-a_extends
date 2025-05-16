public abstract class instrumento {
    String tom;
    int tamanho;


    public instrumento(String tom, int tamanho) {
        this.tom = tom;
        this.tamanho = tamanho;
    }

    public abstract void tocar();

    
}
