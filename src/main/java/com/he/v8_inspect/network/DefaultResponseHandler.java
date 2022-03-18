package com.he.v8_inspect.network;

import java.io.IOException;

public class DefaultResponseHandler implements ResponseHandler {
    private int mBytesRead;
    private int mDecodedBytesRead = -1;
    private final NetworkEventReporter mEventReporter;
    private final String mRequestId;

    private void reportDataReceived() {
        NetworkEventReporter networkEventReporter = this.mEventReporter;
        String str = this.mRequestId;
        int i = this.mBytesRead;
        int i2 = this.mDecodedBytesRead;
        if (i2 < 0) {
            i2 = i;
        }
        networkEventReporter.dataReceived(str, i, i2);
    }

    @Override // com.he.v8_inspect.network.ResponseHandler
    public void onEOF() {
        reportDataReceived();
        this.mEventReporter.responseReadFinished(this.mRequestId);
    }

    @Override // com.he.v8_inspect.network.ResponseHandler
    public void onRead(int i) {
        this.mBytesRead += i;
    }

    @Override // com.he.v8_inspect.network.ResponseHandler
    public void onError(IOException iOException) {
        reportDataReceived();
        this.mEventReporter.responseReadFailed(this.mRequestId, iOException.toString());
    }

    @Override // com.he.v8_inspect.network.ResponseHandler
    public void onReadDecoded(int i) {
        if (this.mDecodedBytesRead == -1) {
            this.mDecodedBytesRead = 0;
        }
        this.mDecodedBytesRead += i;
    }

    public DefaultResponseHandler(NetworkEventReporter networkEventReporter, String str) {
        this.mEventReporter = networkEventReporter;
        this.mRequestId = str;
    }
}
