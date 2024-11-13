package br.com.lowlevel.spring_twilio.controller;

import br.com.lowlevel.spring_twilio.entity.SMSRequest;
import br.com.lowlevel.spring_twilio.service.TwilioService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    private final TwilioService twilioService;

    public SmsController(TwilioService twilioService) {
        this.twilioService = twilioService;
    }

    @PostMapping(value = "/send-sms")
    public ResponseEntity<Void> sendSMS(@RequestBody SMSRequest request) {
        twilioService.sendSMS(request.getTo(), request.getMessage());
        return ResponseEntity.ok().build();
    }
}
