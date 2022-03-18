package com.ss.android.lark.widget.span;

import java.util.Objects;

public class ImageInfo extends SpanInfo {
    public C59153c borderProperty;
    public int height;
    public String key;
    public String token;
    public String url;
    public int width;

    @Override // com.ss.android.lark.widget.span.SpanInfo
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.key, this.url, this.token, Integer.valueOf(this.width), Integer.valueOf(this.height), this.borderProperty);
    }

    @Override // com.ss.android.lark.widget.span.SpanInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageInfo) || !super.equals(obj)) {
            return false;
        }
        ImageInfo imageInfo = (ImageInfo) obj;
        if (this.width != imageInfo.width || this.height != imageInfo.height || !Objects.equals(this.borderProperty, imageInfo.borderProperty) || !Objects.equals(this.key, imageInfo.key) || !Objects.equals(this.url, imageInfo.url) || !Objects.equals(this.token, imageInfo.token)) {
            return false;
        }
        return true;
    }
}
