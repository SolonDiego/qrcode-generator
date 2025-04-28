package br.com.solondiego.qrcode_generator.infrastructure;

import br.com.solondiego.qrcode_generator.ports.StoragePort;
import org.springframework.beans.factory.annotation.Value;
import software.amazon.awssdk.services.s3.S3Client;

public class S3StorageAdapter implements StoragePort {

    private final S3Client s3Client;

    private final String bucketName;

    private final String region;

    public S3StorageAdapter(@Value("${aws.region}") String region, @Value("${aws.s3.bucket-name}") String bucketName, S3Client s3Client) {
        this.s3Client = s3Client;
        this.bucketName = bucketName
    }


    @Override
    public String updateFile(byte[] fileData, String fileName, String contentType) {
        return "";
    }
}
