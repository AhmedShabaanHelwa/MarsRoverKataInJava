import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverShouldTests {
    @ParameterizedTest
    @CsvSource(value = {
            "0:0:N,'',0:0:N",
            "4:3:W,'  ',4:3:W",
            "0:0:N, M, 0:1:N",  // Towards North, from the center.
            "3:6:N, M, 3:7:N",  // Towards North, from a random point
            "3:6:W, M, 2:6:W",  // Towards West
            "3:6:E, M, 4:6:E",  // Towards East
            "3:6:S, M, 3:5:S"   // Towards South
    })
    void executeCommands(String initialState, String commands, String finalState) {
        // Arrange
        MarsRover marsRover = new MarsRover(initialState);
        // Act
        String result = marsRover.execute(commands);
        // Assert
        assertEquals(finalState, result);
    }
}