package com.tt.miniapp.feedback.screenrecord;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import java.util.Objects;

/* renamed from: com.tt.miniapp.feedback.screenrecord.g */
public class C66177g {

    /* renamed from: a */
    public final int f167053a;

    /* renamed from: b */
    public final int f167054b;

    /* renamed from: c */
    public final int f167055c;

    /* renamed from: d */
    public final int f167056d;

    /* renamed from: e */
    public final int f167057e;

    /* renamed from: f */
    public final String f167058f;

    /* renamed from: g */
    public final String f167059g;

    /* renamed from: h */
    public final MediaCodecInfo.CodecProfileLevel f167060h;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public MediaFormat mo231504a() {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.f167059g, this.f167053a, this.f167054b);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", this.f167055c);
        createVideoFormat.setInteger("frame-rate", this.f167056d);
        createVideoFormat.setInteger("i-frame-interval", this.f167057e);
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = this.f167060h;
        if (!(codecProfileLevel == null || codecProfileLevel.profile == 0 || this.f167060h.level == 0)) {
            createVideoFormat.setInteger("profile", this.f167060h.profile);
            createVideoFormat.setInteger("level", this.f167060h.level);
        }
        return createVideoFormat;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("VideoEncodeConfig{width=");
        sb.append(this.f167053a);
        sb.append(", height=");
        sb.append(this.f167054b);
        sb.append(", bitrate=");
        sb.append(this.f167055c);
        sb.append(", framerate=");
        sb.append(this.f167056d);
        sb.append(", iframeInterval=");
        sb.append(this.f167057e);
        sb.append(", codecName='");
        sb.append(this.f167058f);
        sb.append('\'');
        sb.append(", mimeType='");
        sb.append(this.f167059g);
        sb.append('\'');
        sb.append(", codecProfileLevel=");
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = this.f167060h;
        if (codecProfileLevel == null) {
            str = "";
        } else {
            str = C66169e.m259095a(codecProfileLevel);
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public C66177g(int i, int i2, int i3, int i4, int i5, String str, String str2, MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        this.f167053a = i;
        this.f167054b = i2;
        this.f167055c = i3;
        this.f167056d = i4;
        this.f167057e = i5;
        this.f167058f = str;
        Objects.requireNonNull(str2);
        this.f167059g = str2;
        this.f167060h = codecProfileLevel;
    }
}
