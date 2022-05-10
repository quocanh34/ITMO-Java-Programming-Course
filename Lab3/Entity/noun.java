public enum noun {
    HOPE ("hope"),
    DAY ("day of departure"),
    LIST ("list"),
    SMILE ("smile"),
    FACE ("face"),
    APPETITE("appetite");

    private String value;
    noun(String value){
        this.value = value;
    }
    @Override
    public String toString(){
        return value;
    }
}