public class Cachorro implements interfaceCachorro {
    //atributos
    private String nome;
    private boolean sentado;
    private boolean dormindo;
    private boolean comendo;
    private String status;
    
    //métodos especiais
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public boolean getSentado() 
    {
        return sentado;
    }
    public void setSentado(boolean sentado) 
    {
        this.sentado = sentado;
    }
    public boolean getDormindo() 
    {
        return dormindo;
    }
    public void setDormindo(Boolean dormindo) 
    {
        this.dormindo = dormindo;
    }
    public boolean getComendo() 
    {
        return comendo;
    }
    public void setComendo(Boolean comendo) 
    {
        this.comendo = comendo;
    }
    
    public String getStatus() 
    {
        return status;
    }
    
    public void setStatus(String status) 
    {
        this.status = status;
    }

    //sobrescrevendo métodos da interface
    public Boolean andar()
    {
        return null;
    }

    public Boolean correr() 
    {
        return null;
    }

    public Boolean sentar()
    {
        this.setSentado(false);
        return getSentado();
    }

    public Boolean comer()
    {
        this.setComendo(true);
        return getComendo();
    }

    public Boolean deitar()
    {
        return null;
    }

    public Boolean dormir() 
    {
        this.setDormindo(false);
        return getDormindo();
    }

    public String status()
    {
        System.debug('------STATUS------');
        System.debug('Nome do cachorro: ' + this.getNome());
        System.debug('O cachorro está comendo? ' + this.getComendo());
        System.debug('O cachorro está dormindo? ' + this.getDormindo());
        System.debug('O cachorro está sentado? ' + this.getSentado());
        return getStatus();
    }
}
