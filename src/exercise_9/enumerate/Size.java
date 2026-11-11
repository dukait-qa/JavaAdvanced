package exercise_9.enumerate;

public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL"), UNSPECIFIED("");

    private String code;

    public String getCode() {
    return code;

    }
    Size(String code) {
        this.code = code;
    }
}
