package com.ss.android.lark.utils;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/utils/VideoSendConfig;", "", "limitFileSize", "", "limitVideoDuration", "", "limitVideoResolution", "Lcom/ss/android/lark/utils/ResolutionConfig;", "limitVideoFrameRate", "limitVideoBitrate", "(JILcom/ss/android/lark/utils/ResolutionConfig;II)V", "getLimitFileSize", "()J", "setLimitFileSize", "(J)V", "getLimitVideoBitrate", "()I", "setLimitVideoBitrate", "(I)V", "getLimitVideoDuration", "setLimitVideoDuration", "getLimitVideoFrameRate", "setLimitVideoFrameRate", "getLimitVideoResolution", "()Lcom/ss/android/lark/utils/ResolutionConfig;", "setLimitVideoResolution", "(Lcom/ss/android/lark/utils/ResolutionConfig;)V", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoSendConfig {
    @SerializedName("limit_file_size")
    private long limitFileSize;
    @SerializedName("limit_video_bitrate")
    private int limitVideoBitrate;
    @SerializedName("limit_video_duration")
    private int limitVideoDuration;
    @SerializedName("limit_video_frame_rate")
    private int limitVideoFrameRate;
    @SerializedName("limit_video_resolution")
    private ResolutionConfig limitVideoResolution;

    public VideoSendConfig() {
        this(0, 0, null, 0, 0, 31, null);
    }

    public final long getLimitFileSize() {
        return this.limitFileSize;
    }

    public final int getLimitVideoBitrate() {
        return this.limitVideoBitrate;
    }

    public final int getLimitVideoDuration() {
        return this.limitVideoDuration;
    }

    public final int getLimitVideoFrameRate() {
        return this.limitVideoFrameRate;
    }

    public final ResolutionConfig getLimitVideoResolution() {
        return this.limitVideoResolution;
    }

    public final void setLimitFileSize(long j) {
        this.limitFileSize = j;
    }

    public final void setLimitVideoBitrate(int i) {
        this.limitVideoBitrate = i;
    }

    public final void setLimitVideoDuration(int i) {
        this.limitVideoDuration = i;
    }

    public final void setLimitVideoFrameRate(int i) {
        this.limitVideoFrameRate = i;
    }

    public final void setLimitVideoResolution(ResolutionConfig resolutionConfig) {
        Intrinsics.checkParameterIsNotNull(resolutionConfig, "<set-?>");
        this.limitVideoResolution = resolutionConfig;
    }

    public VideoSendConfig(long j, int i, ResolutionConfig resolutionConfig, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(resolutionConfig, "limitVideoResolution");
        this.limitFileSize = j;
        this.limitVideoDuration = i;
        this.limitVideoResolution = resolutionConfig;
        this.limitVideoFrameRate = i2;
        this.limitVideoBitrate = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VideoSendConfig(long r8, int r10, com.ss.android.lark.utils.ResolutionConfig r11, int r12, int r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L_0x0009
            r8 = 5368709120(0x140000000, double:2.6524947387E-314)
        L_0x0009:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto L_0x0013
            r10 = 300(0x12c, float:4.2E-43)
            r3 = 300(0x12c, float:4.2E-43)
            goto L_0x0014
        L_0x0013:
            r3 = r10
        L_0x0014:
            r8 = r14 & 4
            if (r8 == 0) goto L_0x0020
            com.ss.android.lark.utils.ResolutionConfig r11 = new com.ss.android.lark.utils.ResolutionConfig
            r8 = 3
            r9 = 0
            r10 = 0
            r11.<init>(r10, r10, r8, r9)
        L_0x0020:
            r4 = r11
            r8 = r14 & 8
            if (r8 == 0) goto L_0x002a
            r12 = 1200(0x4b0, float:1.682E-42)
            r5 = 1200(0x4b0, float:1.682E-42)
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r8 = r14 & 16
            if (r8 == 0) goto L_0x0034
            r13 = 314572800(0x12c00000, float:1.21169035E-27)
            r6 = 314572800(0x12c00000, float:1.21169035E-27)
            goto L_0x0035
        L_0x0034:
            r6 = r13
        L_0x0035:
            r0 = r7
            r0.<init>(r1, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.utils.VideoSendConfig.<init>(long, int, com.ss.android.lark.utils.ResolutionConfig, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
