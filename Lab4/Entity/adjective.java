public enum adjective {
    HEART ("heartbroken"),
    BORE ("boring"),
    DEPRESS ("depressed");
    private String value;
    adjective(String value){
        this.value = value;
    }
    @Override
    public String toString(){
        return value;
    }
}
