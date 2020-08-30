package org.springmvc.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


@Controller
public class HomeController {

    @GetMapping(value = "/imageController/{imageName}/{imageType}")
    @ResponseBody
    public byte[] helloWorld(@PathVariable String imageName, @PathVariable String imageType) {
        byte[] fileBytes = new byte[0];
        try {
            Resource resource = new ClassPathResource("/files/" + imageName + "." + imageType);
            File file = resource.getFile();
            ByteArrayOutputStream bos;
            try (FileInputStream fis = new FileInputStream(file)) {
                bos = new ByteArrayOutputStream();
                int b;
                byte[] buffer = new byte[1024];
                while ((b = fis.read(buffer)) != -1) {
                    bos.write(buffer, 0, b);
                }
                fileBytes = bos.toByteArray();
            }
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileBytes;
    }
}
