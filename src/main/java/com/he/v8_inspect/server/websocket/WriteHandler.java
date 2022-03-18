package com.he.v8_inspect.server.websocket;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* access modifiers changed from: package-private */
public class WriteHandler {
    private final BufferedOutputStream mBufferedOutput;

    public WriteHandler(OutputStream outputStream) {
        this.mBufferedOutput = new BufferedOutputStream(outputStream, 1024);
    }

    public synchronized void write(Frame frame, WriteCallback writeCallback) {
        try {
            frame.writeTo(this.mBufferedOutput);
            this.mBufferedOutput.flush();
            writeCallback.onSuccess();
        } catch (IOException e) {
            writeCallback.onFailure(e);
        }
        return;
    }
}
