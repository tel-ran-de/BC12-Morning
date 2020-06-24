package HomeWork45;

/**
 * TelRanJavaBasicModulOne
 * 24/06/2020  22:26
 */
public enum Cover {
    HARD(1),
    SOFT(2),
    EBOOK(3),
    POCKET(4);

    public int cover;

    Cover(int cover){
        this.cover=cover;
    }
    public int getCover(){
        return cover;
    }
}
