public class MagoBuilder implements Builder {
    private String nome;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;
    @Override
    public void setNome(String nome) {

    }

    @Override
    public void setInteligencia(int inteligencia) {

    }

    @Override
    public void setForca(int forca) {

    }

    @Override
    public void setVigor(int vigor) {

    }

    @Override
    public void setResistencia(int resistencia) {

    }

    @Override
    public void setDestreza(int destreza) {

    }
    public Mago build(){
        return new Mago(nome, inteligencia, forca, vigor, resistencia, destreza);
    }
}
