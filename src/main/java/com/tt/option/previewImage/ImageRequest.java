package com.tt.option.previewImage;

import java.io.Serializable;
import java.util.Map;

public class ImageRequest implements Serializable {
    public String body;
    public Map<String, String> header;
    public String method;
    public String url;

    public ImageRequest() {
    }

    public ImageRequest(String str, Map<String, String> map, String str2, String str3) {
        this.url = str;
        this.header = map;
        this.method = str2;
        this.body = str3;
    }
}
