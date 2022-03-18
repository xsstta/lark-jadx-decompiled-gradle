package com.ss.android.lark.widget.span;

import android.text.TextUtils;
import java.util.Objects;

public class MediaInfo extends SpanInfo {
    public C59153c borderProperty;
    public String duration;
    public int height;
    public String key;
    public ImageInfo originImageInfo;
    public String originPath;
    public String url;
    public int width;

    @Override // com.ss.android.lark.widget.span.SpanInfo
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.width), Integer.valueOf(this.height), this.borderProperty, this.duration, this.url, this.originPath, this.originImageInfo);
    }

    @Override // com.ss.android.lark.widget.span.SpanInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        if (this.width != mediaInfo.width || this.height != mediaInfo.height || !Objects.equals(this.borderProperty, mediaInfo.borderProperty) || !TextUtils.equals(this.duration, mediaInfo.duration) || !TextUtils.equals(this.url, mediaInfo.url) || !TextUtils.equals(this.originPath, mediaInfo.originPath) || !Objects.equals(this.originImageInfo, mediaInfo.originImageInfo)) {
            return false;
        }
        return true;
    }
}
