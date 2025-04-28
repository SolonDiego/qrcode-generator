package br.com.solondiego.qrcode_generator.controller;

import br.com.solondiego.qrcode_generator.dto.QrCodeGenerateRequest;
import br.com.solondiego.qrcode_generator.dto.QrCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request) {
        return null;
    }

}
