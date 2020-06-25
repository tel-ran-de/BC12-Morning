package homework45;

/**
 * BC12-Morning
 * 6/24/20 18: 39
 */
public enum Cover {//нумерованный список
    SOFTCOVER(1),
    HARDCOVER(2),
    EBOOK(3),
    PAPERBACK(4);

    private int cover;

    Cover(int cover) {
        this.cover = cover;
    }

    public int getCover() {
        return cover;
    }


}
