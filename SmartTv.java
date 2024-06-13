//smartv:
//ligada (boolean), canal (int), volume (int)
//Poderá ligar e desligar e assim mudar o estado ligada
//Aumentará e diminuirá o volume sempre em +1 ou -1
//Poderá mudar de canal de 1 em 1 ou definindo o numero correspondente


public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void ligar(){
        ligada = true;
    }

    public void deligar(){
        ligada = false;
    }
}