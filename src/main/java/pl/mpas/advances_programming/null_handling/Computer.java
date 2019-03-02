package pl.mpas.advances_programming.null_handling;

public class Computer {
    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    private GraphicsCard graphicsCard;
}
