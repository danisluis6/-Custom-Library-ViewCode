package viewcode.codeview;

public enum CodeViewTheme {

    ANDROIDSTUDIO("androidstudio","#282b2e");

    private String name;
    private String backgroundColor;

    CodeViewTheme(String name, String backgroundColor){
        this.name = name;
        this.backgroundColor=backgroundColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getName() {
        return name;
    }
}