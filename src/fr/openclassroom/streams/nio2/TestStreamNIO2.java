package fr.openclassroom.streams.nio2;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;

public class TestStreamNIO2 {

    public static void main(String[] args) {
        String fileName = "C:\\dev\\test\\IPTABLES.sh";

        try(Stream<String> sf = Files.lines(Paths.get(fileName))) {
            sf.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
