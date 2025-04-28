package br.com.solondiego.qrcode_generator.ports;

public interface StoragePort {
    String updateFile(byte[] fileData, String fileName, String contentType);
}
