public class CounterTask extends SimpleTask implements Task {
    private int currentValue = 0;
    private int maxValue;

    public CounterTask(String title, String description, int maxValue) {
        super(title, description);

        assert maxValue > 0;
        this.maxValue = maxValue;
    }

    public CounterTask(String title, String description) {
        super(title, description);

        this.maxValue = 1;
    }

    public String title() {
        StringBuilder builder = new StringBuilder(super.title());
        builder.append(" | Count: ");
        builder.append(this.currentValue);
        return builder.toString();
    }

    public void update() {
        this.currentValue += 1;
    }
}
