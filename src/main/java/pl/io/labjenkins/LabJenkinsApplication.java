package pl.io.labjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabJenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabJenkinsApplication.class, args);
    }

    public int added(int a, int b) {
        return a + b;
    }
}
