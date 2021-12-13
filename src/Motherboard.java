public class Motherboard {
    private String board_model;
    private String board_producer;

    public Motherboard(String board_model, String board_producer) {
        this.board_model = board_model;
        this.board_producer = board_producer;
    }

    public String getModel() {
        return board_model;

    }

    public void setModel(String board_model) {
        this.board_model = board_model;
    }

    public String getProducer() {
        return board_producer;
    }

    public void setProducer(String board_producer) {
        this.board_producer = board_producer;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "model='" + board_model + '\'' +
                ", producer='" + board_producer + '\'' +
                '}';
    }
}
