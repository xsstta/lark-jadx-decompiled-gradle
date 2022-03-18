package com.he.v8_inspect.server.http;

public class LightHttpResponse extends LightHttpMessage {
    public LightHttpBody body;
    public int code;
    public String reasonPhrase;

    @Override // com.he.v8_inspect.server.http.LightHttpMessage
    public void reset() {
        super.reset();
        this.code = -1;
        this.reasonPhrase = null;
        this.body = null;
    }

    public void prepare() {
        LightHttpBody lightHttpBody = this.body;
        if (lightHttpBody != null) {
            addHeader("Content-Type", lightHttpBody.contentType());
            addHeader("Content-Length", String.valueOf(this.body.contentLength()));
        }
    }
}
