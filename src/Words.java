public enum Words {
    АРФА,
    КНИГА,
    ДОМ,
    ДРЕВО,
    ШЛЯПА,
    КЛЮЧ,
    ФЛАГ,
    ЖУПЕЛ,
    ТРУБА,
    КОШКА;

    public static Words getRandomWord() {
        return Words.values()[(int) (Math.random() * Words.values().length)];
    }
}
