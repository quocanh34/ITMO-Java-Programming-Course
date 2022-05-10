public enum object {
    MOON ("moon"),
    DONUT ("donut");
    private String value;
    object(String value){
        this.value = value;
    }
    @Override
    public String toString(){
        return value;
    }
}