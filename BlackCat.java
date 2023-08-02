
/**
* @author minkun
* @version 1.0
*/
public class BlackCat {

    private String name;
    private boolean familiar;

    /**
     * @param name is the name of BlackCat
     * @param familiar is whether the BlackCat is a nornal cat
     */
    public BlackCat(String name, boolean familiar) {
        this.name = name;
        this.familiar = familiar;
    }

    /**
     * It prints true/false based on the familiar status of blackcat.
     */
    public void meow() {
        if (familiar) {
            System.out.printf("%s is a familiar", name);
        } else {
            System.out.printf("%s is not a familiar", name);
        }
    }

    /**
     * @return return a string of the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name is the name we want to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * @return return true/false about whether the BlackCat is a nornal cat
     */
    public boolean getFamiliar() {
        return familiar;
    }
    /**
     * @param familiar is a boolean that we want to set
     */
    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

}