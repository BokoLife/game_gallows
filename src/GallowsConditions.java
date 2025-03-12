public enum GallowsConditions {
    CONDITION_1(
    "   +-------+\n"+
    "   |       |\n"+
    "   |\n"+
    "   |\n"+
    "   |\n"+
    "   |\n"+
    "   |\n"+
    "   |\n"+
    "========="),
    CONDITION_2(
    "   +-------+\n"+
    "   |       |\n"+
    "   |       O\n"+
    "   |\n"+
    "   |\n"+
    "   |\n"+
    "   |\n"+
    "   |\n"+
    "========="),
    CONDITION_3(
    "   +-------+\n"+
    "   |       |\n"+
    "   |       O\n"+
    "   |       |\n"+
    "   |       |\n"+
    "   |       |\n"+
    "   |\n"+
    "   |\n"+
    "========="),
    CONDITION_4(
    "   +-------+\n"+
    "   |       |\n"+
    "   |       O\n"+
    "   |      \\|\n"+
    "   |       |\n"+
    "   |       |\n"+
    "   |       \n"+
    "   |       \n"+
    "========="),
    CONDITION_5(
    "   +-------+\n"+
    "   |       |\n"+
    "   |       O\n"+
    "   |      \\|/\n"+
    "   |       |\n"+
    "   |       |\n"+
    "   |        \n"+
    "   |\n"+
    "========="),
    CONDITION_6(
    "   +-------+\n"+
    "   |       |\n"+
    "   |       O\n"+
    "   |      \\|/\n"+
    "   |       |\n"+
    "   |       |\n"+
    "   |      / \n"+
    "   |\n"+
    "========="),
    CONDITION_7(
    "   +-------+\n"+
    "   |       |\n"+
    "   |       O\n"+
    "   |      \\|/\n"+
    "   |       |\n"+
    "   |       |\n"+
    "   |      / \\\n"+
    "   |\n"+
    "=========");

    private final String gallowsCondition;

    GallowsConditions(String gallowsCondition) {
        this.gallowsCondition = gallowsCondition;
    }

    public String getGallowsCondition() {
        return gallowsCondition;
    }
}
