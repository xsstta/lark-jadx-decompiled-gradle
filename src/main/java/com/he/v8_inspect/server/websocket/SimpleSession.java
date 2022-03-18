package com.he.v8_inspect.server.websocket;

public interface SimpleSession {
    void close(int i, String str);

    boolean isOpen();

    void sendBinary(byte[] bArr);

    void sendText(String str);
}
