public class Alt  extends Banda{
    private String subgenero;

    public Alt(String nome, String origem, String subgenero){
        super(nome, origem);
        this.subgenero = subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    public String getSubgenero() {
        return subgenero;
    }
    

    @Override

        public String toString(){
            return super.toString()+
                    "\nSubgenero: " + subgenero;
        }

}
