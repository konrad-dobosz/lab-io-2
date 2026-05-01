package pl.io.labjenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabJenkinsApplicationTest {

    @Test
    void added() {
        LabJenkinsApplication app = new LabJenkinsApplication();
        assertEquals(10, app.added(5, 5));
    }
}