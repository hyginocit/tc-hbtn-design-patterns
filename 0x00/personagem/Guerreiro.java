public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.GUERREIRO, inteligencia, forca, vigor, resistencia, destreza);

        if ((this.getForca() < this.getInteligencia()) || (this.getForca() < this.getDestreza())){
            throw new RuntimeException("Atributos invalidos para GUERREIRO");
        }
    }
    @Override
    public double getDanoAtaque() {
        return (this.getForca() * 0.8) + (this.getVigor() * 0.05) + (getDestreza() * 0.1) + (getInteligencia() * 0.05);
    }
}
