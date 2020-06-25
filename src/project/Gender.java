package project;

public enum Gender {
    MALE(1),
    FEMALE(2),
    DIVERSE(3),
    FOR(4);

    public int gender;

    Gender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }
}
