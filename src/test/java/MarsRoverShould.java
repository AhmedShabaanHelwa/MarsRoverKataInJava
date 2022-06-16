import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverShould {
    @ParameterizedTest
    @CsvSource({"0:0:N, 0:0:N"})
    void printInitialState(String initialState, String finalState) {
        // Arrange
        MarsRover marsRover = new MarsRover();
        // Act
        String result = marsRover.execute("");
        // Assert
        assertEquals(finalState,result);
    }
}