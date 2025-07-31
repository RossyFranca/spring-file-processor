package com.franca.spring_file_processor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

@RestController
@RequestMapping(value = "/files")
public class FileController {
    @Autowired
    private AmazonS3 s3Client;

    @Value("${aws.s3.bucket-name}")
    private String bucketName;

    @GetMapping(value = "/{fileName}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> getFileFromS3(@PathVariable String fileName) {

        System.out.println("Recebido o nome do arquivo: " + fileName);
        // try {
        // S3Object s3Object = s3Client.getObject(bucketName, fileName);
        // S3ObjectInputStream inputStream = s3Object.getObjectContent();

        // byte[] fileBytes = inputStream.readAllBytes();

        // HttpHeaders headers = new HttpHeaders();
        // headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" +
        // fileName + "\"");
        // } catch (Exception e) {
        // // TODO: handle exception
        // }
        // System.out.println(fileName);
        return null;

    }

}
