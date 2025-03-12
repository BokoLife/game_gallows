public enum Words {
    ОРЕШНИК,
    КНИГА,
    ДОМИК,
    ДЕРЕВО,
    МАШИНА,
    МЕДВЕДЬ,
    ТЕЛЕВИЗОР,
    ЖУПЕЛ,
    ТЕЛЕФОН,
    КОШКА;

    public static Words getRandomWord() {
        return Words.values()[(int) (Math.random() * Words.values().length)];
    }
}
