public class HashObject<T> {
    
    /*  Variables    */
    private T hashObject; // generic object
    private int probeCount; // probe count
    private int duplicateCount; // duplicate count 

    /*  Initialize our Hash Object */
    public HashObject(T object){
        hashObject = object;
        probeCount = 0;
        duplicateCount = 0;
    }

    /*  Methods    */


    /*
     * Returns our hash objects unique hash codes / keys
     */
    public int getKey(){
        return hashObject.hashCode(); 
    }

    /*
     *  Returns the count of duplicate hash codes
     */
    public int getDuplicateCount(){
        return duplicateCount;
    }

    /*
     *  Increments the number of probes
     */
    public void incrementProbes(){
        probeCount++;
    }

    /*
     *  Increments the number of duplicate probes
     */
    public void incrementDuplicates(){
        duplicateCount++;
    }

    /*
     * Compares our hashObjects to another
     */
    public boolean equals(Object object){
        return object.equals(hashObject);
    }

    /*
     *  Output to string
     */
    public String toString(){
        return String.format("%s %d %d", hashObject.toString(), duplicateCount, probeCount);
    }
}
