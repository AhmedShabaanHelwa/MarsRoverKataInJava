import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverShould {
    @ParameterizedTest
    @CsvSource(value = {
            "0:0:N,'',0:0:N",
            "4:3:W,'  ',4:3:W",
            "0:0:N, M,0:1:N",
            "3:6:N, M,3:7:N"
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