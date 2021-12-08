package demo3;

public enum Gender {
    male(true), female(false);
    private boolean pipka;

//    Gender() {
//    }

    Gender(boolean pipka) {
        this.pipka = pipka;
    }
}
