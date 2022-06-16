import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverShould {
    @ParameterizedTest
    @CsvSource({
            "0:0:N, 0:0:N",
            "4:3:W, 4:3:W"
    })
    void printInitialState(String initialState, String finalState) {
        // Arrange
        MarsRover marsRover = new MarsRover(initialState);
        // Act
        String result = marsRover.execute("");
        // Assert
        assertEquals(finalState,result);
    }
}