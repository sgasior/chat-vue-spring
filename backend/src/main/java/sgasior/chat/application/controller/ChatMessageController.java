package sgasior.chat.application.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import sgasior.chat.application.ChatMessage;

@Controller
public class ChatMessageController {

    @MessageMapping("/chat")
    @SendTo("/topic/global")
    public ChatMessage get(ChatMessage chatMessage) {
        return chatMessage;
    }
}
