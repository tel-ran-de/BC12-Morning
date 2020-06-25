package hw.Hw45_BooksArray;

/**
 * FirstNewVersion 24.06.2020
 */
public enum Cover {
    HARD(1),
    SOFT(2),
    POCKET(3),
    EBOOK(4);
    public int cover;

    Cover(int cover) {
        this.cover = cover;
    }

    public int getCover() {
        return cover;
    }
}
