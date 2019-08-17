package com.tlq.eurekaconsumerfeign;

import com.tlq.eurekaconsumerfeign.controller.ServiceInterface;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import sun.nio.ch.IOUtil;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaConsumerFeignApplicationTests {
    @Autowired
    private ServiceInterface serviceInterface;

    @Test
    public void contextLoads() {
        File file = new File("upload.txt");
        DiskFileItem fileItem = (DiskFileItem) new DiskFileItemFactory().createItem("file",
                MediaType.TEXT_PLAIN_VALUE, true, file.getName());
        try {
            InputStream inputStream = new FileInputStream(file);
            OutputStream outputStream = fileItem.getOutputStream();
            IOUtils.copy(inputStream, outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MultipartFile multipartFile = new CommonsMultipartFile(fileItem);
        serviceInterface.fileTest(multipartFile);
    }

}
