package lab03;

public class Animacao 
{
    char comandos[];
    AquarioLombriga lombriga;
    int tamanho_aquario, tamanho_lombriga, posicao_lombriga, x;
    String tamanho_aquario_s ="", tamanho_lombriga_s="", posicao_lombriga_s=""; 
    public Animacao(String comandos)
    {
        this.comandos =comandos.toCharArray();
        tamanho_aquario_s += (Character.toString(this.comandos[0]) + Character.toString(this.comandos[1]));
        tamanho_lombriga_s += (Character.toString(this.comandos[2]) + Character.toString(this.comandos[3]));
        posicao_lombriga_s += (Character.toString(this.comandos[4]) + Character.toString(this.comandos[5]));
        tamanho_aquario = Integer.parseInt(tamanho_aquario_s);
        tamanho_lombriga = Integer.parseInt(tamanho_lombriga_s);
        posicao_lombriga = Integer.parseInt(posicao_lombriga_s);
        lombriga = new AquarioLombriga(tamanho_aquario, tamanho_lombriga,posicao_lombriga);
        x = 6;
    }
    void apresenta()
    {
        lombriga.apresentar();
    }
    void passo()
    {
        
        switch(comandos[x])
        {
            case 'C':
                lombriga.crescer();
                break;
            case 'M':
                lombriga.mover();
                break;
            case 'V':
                lombriga.virar();
                break;
            default:
                break;
        }
        x++;        
    }
}
