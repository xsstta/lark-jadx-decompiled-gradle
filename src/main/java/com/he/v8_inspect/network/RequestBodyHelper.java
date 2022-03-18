package com.he.v8_inspect.network;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;
import javax.annotation.Nullable;

public class RequestBodyHelper {
    private ByteArrayOutputStream mDeflatedOutput;
    private CountingOutputStream mDeflatingOutput;
    private final NetworkEventReporter mEventReporter;
    private final String mRequestId;

    public boolean hasBody() {
        if (this.mDeflatedOutput != null) {
            return true;
        }
        return false;
    }

    private void throwIfNoBody() {
        if (!hasBody()) {
            throw new IllegalStateException("No body found; has createBodySink been called?");
        }
    }

    public byte[] getDisplayBody() {
        throwIfNoBody();
        return this.mDeflatedOutput.toByteArray();
    }

    public void reportDataSent() {
        throwIfNoBody();
        this.mEventReporter.dataSent(this.mRequestId, this.mDeflatedOutput.size(), (int) this.mDeflatingOutput.getCount());
    }

    public OutputStream createBodySink(@Nullable String str) throws IOException {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if ("gzip".equals(str)) {
            outputStream = GunzippingOutputStream.create(byteArrayOutputStream);
        } else if ("deflate".equals(str)) {
            outputStream = new InflaterOutputStream(byteArrayOutputStream);
        } else {
            outputStream = byteArrayOutputStream;
        }
        CountingOutputStream countingOutputStream = new CountingOutputStream(outputStream);
        this.mDeflatingOutput = countingOutputStream;
        this.mDeflatedOutput = byteArrayOutputStream;
        return countingOutputStream;
    }

    public RequestBodyHelper(NetworkEventReporter networkEventReporter, String str) {
        this.mEventReporter = networkEventReporter;
        this.mRequestId = str;
    }
}
