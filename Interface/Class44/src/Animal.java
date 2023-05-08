public abstract class Animal {

    private String name;
    
    
       public abstract void emitirsom(); // deixado devido cada animal emitir um som diferente
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
