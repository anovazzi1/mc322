package lab03;

public class AquarioLombriga
{
    int tam_aquario, tam_lombriga, posicao_lomb, posicao_cauda, orientacao;
    // posicao da lombriga calculada pela cabeça
    public AquarioLombriga(int tam_aquario, int tam_lombriga, int posicao_lomb)
    {
        this.tam_aquario = tam_aquario;
        if(tam_aquario< tam_lombriga)
        {
            this.tam_aquario = tam_lombriga;
        }
        if(posicao_lomb+tam_lombriga-1 > tam_aquario)
        {
            posicao_lomb= 1;
        }
        this.posicao_lomb = posicao_lomb+ tam_lombriga-1;
        this.tam_lombriga = tam_lombriga;
        this.posicao_cauda = posicao_lomb;
        this.orientacao = 0;
    }
    boolean tem_espaco(int ação)
    {
        if(ação==0)
        {
            if(orientacao ==0)
            {
                if(posicao_cauda>1)
                {
                    return true;
                }
            }
            else if(orientacao ==1)
            {
                if(posicao_cauda<tam_aquario)
                    return true;
            }
        }
        else
        {
            if(orientacao ==0)
            {
                if(posicao_lomb<tam_aquario)
                {
                    return true;
                }
            }
            else if(orientacao ==1)
            {
                if(posicao_lomb>1)
                    return true;
            }
        }
        return false;
    }
    void crescer()
    {
        if(tem_espaco(0))
            tam_lombriga++;
        if(orientacao == 0)
        {
            posicao_cauda--;
        }
        else
        {
            posicao_cauda++;
        }
    }
    void virar()
    {
        int x = posicao_lomb;
        posicao_lomb = posicao_cauda;
        posicao_cauda = x;
        if(orientacao ==0)
        {
            orientacao =1;
        }
        else if(orientacao ==1)
            orientacao = 0;
    }
    void apresentar()
    {
        String lombriga ="";
        if(orientacao == 0)
        {
            for(int i =1;i<posicao_cauda;i++)
            {
                lombriga += '#';
            }
            for(int i =posicao_cauda;i<posicao_lomb;i++)
            {
                lombriga += '@';
            }
            lombriga+='O';
            for(int i=posicao_lomb;i<tam_aquario;i++)
            {
                lombriga += '#';
            }
        }
        else if(orientacao ==1)
        {
            for(int i =1;i<posicao_lomb;i++)
            {
                lombriga += '#';
            }
            lombriga+='O';
            for(int i =posicao_lomb;i<posicao_cauda;i++)
            {
                lombriga += '@';
            }
            for(int i=posicao_cauda;i<tam_aquario;i++)
            {
                lombriga += '#';
            }
        }
        System.out.println(lombriga);
    }
    void mover()
    {
        if(tem_espaco(1))
        {
            if(orientacao ==0)
            {
                posicao_lomb++;
                posicao_cauda++;
            }
            else
            {
                posicao_lomb--;
                posicao_cauda--;
            }
        }
        else
            virar();
    }
}