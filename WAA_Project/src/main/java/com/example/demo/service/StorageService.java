package com.example.demo.service;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.stream.Stream;
 
public interface StorageService {
 
    void init();
 
    void store(MultipartFile file);
 
    Stream<Path> loadAll();
 
    Path load(String filename);
 
    Resource loadAsResource(String filename);
 
    void deleteAll();
    public String readFromInputStream(InputStream inputStream) throws IOException ;
 
}