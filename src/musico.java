public class musico {

    public void tocarInstrumento(instrumento instrumento){
        if (instrumento instanceof violao) {
            violao umViolao = (violao) instrumento;
            umViolao.tocarAcordes();
            
        }else{
            instrumento.tocar();
        }

    }

    public void afinarUmInstrumento(afinador algo){
        System.out.println("Musico Trabalhando: ");
        algo.afinar();
        algo.mudarTom("Novo Tom");
        System.out.println();

        if (algo instanceof violao) {
            //violao umViolao = (violao) instrumento;
            //umViolao.tocarAcordes();
            instrumento ins = (instrumento) algo;
            ins.tocar();
        }
        if (algo instanceof violao) {
            violao umViolao = (violao) algo;
            umViolao.tocarAcordes();
        }
    }

}
