package com.he.v8_inspect.server.websocket;

import android.util.Base64;
import com.he.v8_inspect.server.SocketLike;
import com.he.v8_inspect.server.http.HttpHandler;
import com.he.v8_inspect.server.http.LightHttpBody;
import com.he.v8_inspect.server.http.LightHttpMessage;
import com.he.v8_inspect.server.http.LightHttpRequest;
import com.he.v8_inspect.server.http.LightHttpResponse;
import com.he.v8_inspect.server.http.LightHttpServer;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;

public class WebSocketHandler implements HttpHandler {
    private final SimpleEndpoint mEndpoint;

    public WebSocketHandler(SimpleEndpoint simpleEndpoint) {
        this.mEndpoint = simpleEndpoint;
    }

    private static String generateServerKey(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(Utf8Charset.encodeUTF8(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"));
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isSupportableUpgradeRequest(LightHttpRequest lightHttpRequest) {
        if (!"websocket".equalsIgnoreCase(getFirstHeaderValue(lightHttpRequest, "Upgrade")) || !"Upgrade".equals(getFirstHeaderValue(lightHttpRequest, "Connection")) || !"13".equals(getFirstHeaderValue(lightHttpRequest, "Sec-WebSocket-Version"))) {
            return false;
        }
        return true;
    }

    @Nullable
    private static String getFirstHeaderValue(LightHttpMessage lightHttpMessage, String str) {
        return lightHttpMessage.getFirstHeaderValue(str);
    }

    @Override // com.he.v8_inspect.server.http.HttpHandler
    public boolean handleRequest(SocketLike socketLike, LightHttpRequest lightHttpRequest, LightHttpResponse lightHttpResponse) throws IOException {
        if (!isSupportableUpgradeRequest(lightHttpRequest)) {
            lightHttpResponse.code = 501;
            lightHttpResponse.reasonPhrase = "Not Implemented";
            lightHttpResponse.body = LightHttpBody.create("Not a supported WebSocket upgrade request\n", "text/plain");
            return true;
        }
        doUpgrade(socketLike, lightHttpRequest, lightHttpResponse);
        return false;
    }

    private void doUpgrade(SocketLike socketLike, LightHttpRequest lightHttpRequest, LightHttpResponse lightHttpResponse) throws IOException {
        lightHttpResponse.code = 101;
        lightHttpResponse.reasonPhrase = "Switching Protocols";
        lightHttpResponse.addHeader("Upgrade", "websocket");
        lightHttpResponse.addHeader("Connection", "Upgrade");
        lightHttpResponse.body = null;
        String firstHeaderValue = getFirstHeaderValue(lightHttpRequest, "Sec-WebSocket-Key");
        if (firstHeaderValue != null) {
            lightHttpResponse.addHeader("Sec-WebSocket-Accept", generateServerKey(firstHeaderValue));
        }
        InputStream input = socketLike.getInput();
        OutputStream output = socketLike.getOutput();
        LightHttpServer.writeResponseMessage(lightHttpResponse, new LightHttpServer.HttpMessageWriter(new BufferedOutputStream(output)));
        new WebSocketSession(input, output, this.mEndpoint).handle();
    }
}
