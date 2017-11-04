package valuation;

public enum option {
    Superviser, Enumerator;

    private option(){

    }
    public String value(){
        return name();

    }

    public static option fromvalue(String v) {
        return valueOf(v);
    }
}
