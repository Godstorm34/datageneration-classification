/**
 * Simple data holder that represents a salesman.
 *
 * Instances of this class are immutable: once a Salesman is created,
 * its identification data and name cannot change.
 */
public class Salesman {

    private final String documentType;
    private final long documentNumber;
    private final String firstNames;
    private final String lastNames;

    /**
     * Creates a new salesman.
     *
     * @param documentType   type of identification document (e.g. "CC", "CE", "TI")
     * @param documentNumber identification document number
     * @param firstNames     given name(s) of the salesman
     * @param lastNames      family name(s) of the salesman
     */
    public Salesman(String documentType, long documentNumber, String firstNames, String lastNames) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.firstNames = firstNames;
        this.lastNames = lastNames;
    }

    public String getDocumentType() {
        return documentType;
    }

    public long getDocumentNumber() {
        return documentNumber;
    }

    public String getFirstNames() {
        return firstNames;
    }

    public String getLastNames() {
        return lastNames;
    }

    /**
     * Convenience method that concatenates first and last names,
     * mainly used for log messages and file naming purposes.
     *
     * @return the full name of the salesman
     */
    public String getFullName() {
        return firstNames + " " + lastNames;
    }
}
