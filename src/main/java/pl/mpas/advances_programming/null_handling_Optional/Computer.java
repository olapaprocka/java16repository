package pl.mpas.advances_programming.null_handling_Optional;

import java.util.Optional;

public class Computer {
    public Optional<GraphicsCard> getGraphicsCard() {
          return Optional.ofNullable(graphicsCard);
    }

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    private GraphicsCard graphicsCard;
}
