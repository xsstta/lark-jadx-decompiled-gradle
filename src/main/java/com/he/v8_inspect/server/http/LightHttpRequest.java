package com.he.v8_inspect.server.http;

import android.net.Uri;

public class LightHttpRequest extends LightHttpMessage {
    public String method;
    public String protocol;
    public Uri uri;

    @Override // com.he.v8_inspect.server.http.LightHttpMessage
    public void reset() {
        super.reset();
        this.method = null;
        this.uri = null;
        this.protocol = null;
    }
}
