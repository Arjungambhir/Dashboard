package org.dashboard.config;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class AnalyticsWebSocketHandler extends TextWebSocketHandler {

    @Override
    protected void handleTextMessage(org.springframework.web.socket.WebSocketSession session, TextMessage message) throws Exception {
        // Broadcast analytics data to all clients
        session.sendMessage(new TextMessage("Real-time data: " + message.getPayload()));
    }
}
