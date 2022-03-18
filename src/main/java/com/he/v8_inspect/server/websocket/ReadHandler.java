package com.he.v8_inspect.server.websocket;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public class ReadHandler {
    private final BufferedInputStream mBufferedInput;
    private final ByteArrayOutputStream mCurrentPayload = new ByteArrayOutputStream();
    private final SimpleEndpoint mEndpoint;

    public void readLoop(ReadCallback readCallback) throws IOException {
        Frame frame = new Frame();
        do {
            frame.readFrom(this.mBufferedInput);
            this.mCurrentPayload.write(frame.payloadData, 0, (int) frame.payloadLen);
            if (frame.fin) {
                byte[] byteArray = this.mCurrentPayload.toByteArray();
                readCallback.onCompleteFrame(frame.opcode, byteArray, byteArray.length);
                this.mCurrentPayload.reset();
            }
        } while (frame.opcode != 8);
    }

    public ReadHandler(InputStream inputStream, SimpleEndpoint simpleEndpoint) {
        this.mBufferedInput = new BufferedInputStream(inputStream, 1024);
        this.mEndpoint = simpleEndpoint;
    }
}