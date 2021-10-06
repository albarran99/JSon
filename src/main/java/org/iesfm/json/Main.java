package org.iesfm.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;

public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws URISyntaxException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Company company = mapper.readValue(
                    new File(Objects.requireNonNull(Company.class.getResource("/company.json")).toURI()), Company.class);

            log.info(company.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
