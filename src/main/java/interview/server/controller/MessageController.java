package interview.server.controller;

import interview.server.model.MessageModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class MessageController {

    private static final Logger log = LoggerFactory.getLogger(MessageController.class);


    @GetMapping("/send")
    private MessageModel getThreadMessage(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "message") String message
    ){
        MessageModel messageModel = new MessageModel();
        messageModel.setId(id);
        messageModel.setMessage(message);
        messageModel.setStatus(1);
        return messageModel;
    }
    
}
