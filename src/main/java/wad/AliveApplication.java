package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/sainikumara/wad-alive.git";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/sainikumara/wad-alive";
    }

    public static String herokuUrl() {
        return "https://wad-alive.herokuapp.com/";
    }
}
