
/**
 * @author minkun
 * @version 1.0
 */
public class Witch extends TrickOrTreater {

    private String signatureSpell;
    private BlackCat companion;

    /**
     * @param name the name of the witch
     * @param signatureSpell the signatureSpell of the witch
     * @param companion the blackcat of the witch
     * @param neighborhood the neighborhood of the witch
     * @param numCandy the number of candy the witch has
     */
    public Witch(String name, String neighborhood, int numCandy, String signatureSpell, BlackCat companion) {
        super(name, neighborhood, numCandy);
        this.signatureSpell = signatureSpell;
        this.companion = companion;
    }
    /**
     * @param name the name of the witch
     * @param signatureSpell the signatureSpell of the witch
     * @param companion the blackcat of the witch
     */
    public Witch(String name, String signatureSpell, BlackCat companion) {
        this(name, "Godric's Hollow", 13, signatureSpell, companion);
    }
    /**
     * @param other is the input witch object
     * the constructor used chaining through "this"
     */
    public Witch(Witch other) {
        this(new String(other.name), new String(other.neighborhood), other.numCandy,
            new String(other.signatureSpell), new BlackCat(other.companion.getName(),
            other.companion.getFamiliar()));
    }
    /**
     * method that cast a spell and double the candy.
     */
    public void castSpell() {
        System.out.printf("%scasts%s!", name, signatureSpell);
        setNumCandy(numCandy * 2);
    }



    /**
     * @return a String, which is the witch's signature-spell
     */
    public String getSignatureSpell() {
        return signatureSpell;
    }

    /**
     * @param signatureSpell is the signature-spell we want to set
     */
    public void setSignatureSpell(String signatureSpell) {
        this.signatureSpell = signatureSpell;
    }



    /**
     * @return the BlackCat object
     */
    public BlackCat getCompanion() {
        return companion;
    }

    /**
     * @param companion is the BlackCat object we want to set
     */
    public void setCompanion(BlackCat companion) {
        this.companion = companion;
    }

}