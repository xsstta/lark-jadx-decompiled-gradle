package com.ss.android.lark.chat.service.impl;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bG\b\u0003\u0018\u00002\u00020\u0001B§\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001b\u0012\b\b\u0002\u0010 \u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u001b\u0012\b\b\u0002\u0010\"\u001a\u00020\u001b¢\u0006\u0002\u0010#R\u001a\u0010\u0017\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0014\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001a\u0010\u001f\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010 \u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u001e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001a\u0010\u001c\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010+\"\u0004\b4\u0010-R\u001a\u0010!\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010+\"\u0004\b5\u0010-R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010+\"\u0004\b6\u0010-R\u001a\u0010\"\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010+\"\u0004\b7\u0010-R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00109\"\u0004\bA\u0010;R\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010/\"\u0004\bC\u00101R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010/\"\u0004\bE\u00101R\u001a\u0010\u0016\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010%\"\u0004\bG\u0010'R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010%\"\u0004\bI\u0010'R\u001a\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010/\"\u0004\bK\u00101R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00109\"\u0004\bM\u0010;R\u001a\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010/\"\u0004\bO\u00101R\u001a\u0010\f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00109\"\u0004\bQ\u0010;R\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00109\"\u0004\bS\u0010;R\u001a\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010/\"\u0004\bU\u00101R\u001a\u0010\u0019\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010%\"\u0004\bW\u0010'R\u001a\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010%\"\u0004\bY\u0010'R\u001a\u0010\u0015\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010%\"\u0004\b[\u0010'R\u001a\u0010\u0018\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010%\"\u0004\b]\u0010'R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u00109\"\u0004\b_\u0010;R\u001a\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010/\"\u0004\ba\u00101¨\u0006b"}, d2 = {"Lcom/ss/android/lark/chat/service/impl/MediaMessageReport;", "", "originFPS", "", "originFileSize", "originBitrate", "originVideoSize", "", "originVideoFormat", "originEncodeFormat", "videoDuration", "videoSource", "resultFPS", "resultFileSize", "resultBitrate", "resultVideoSize", "resultEncodeFormat", "pickStart", "", "sendStart", "compressStart", "totalDuration", "pickDuration", "compressDuration", "uploadDuration", "sendDuration", "isRemux", "", "isHDR", "result", "errorType", "errorCode", "errorMsg", "isOriginal", "isUseCache", "(FFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;FFFLjava/lang/String;Ljava/lang/String;JJJJJJJJIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "getCompressDuration", "()J", "setCompressDuration", "(J)V", "getCompressStart", "setCompressStart", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "getErrorType", "setErrorType", "setHDR", "setOriginal", "setRemux", "setUseCache", "getOriginBitrate", "()F", "setOriginBitrate", "(F)V", "getOriginEncodeFormat", "setOriginEncodeFormat", "getOriginFPS", "setOriginFPS", "getOriginFileSize", "setOriginFileSize", "getOriginVideoFormat", "setOriginVideoFormat", "getOriginVideoSize", "setOriginVideoSize", "getPickDuration", "setPickDuration", "getPickStart", "setPickStart", "getResult", "setResult", "getResultBitrate", "setResultBitrate", "getResultEncodeFormat", "setResultEncodeFormat", "getResultFPS", "setResultFPS", "getResultFileSize", "setResultFileSize", "getResultVideoSize", "setResultVideoSize", "getSendDuration", "setSendDuration", "getSendStart", "setSendStart", "getTotalDuration", "setTotalDuration", "getUploadDuration", "setUploadDuration", "getVideoDuration", "setVideoDuration", "getVideoSource", "setVideoSource", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MediaMessageReport {
    private long compressDuration;
    private long compressStart;
    private int errorCode;
    private String errorMsg;
    private String errorType;
    private int isHDR;
    private int isOriginal;
    private int isRemux;
    private int isUseCache;
    private float originBitrate;
    private String originEncodeFormat;
    private float originFPS;
    private float originFileSize;
    private String originVideoFormat;
    private String originVideoSize;
    private long pickDuration;
    private long pickStart;
    private String result;
    private float resultBitrate;
    private String resultEncodeFormat;
    private float resultFPS;
    private float resultFileSize;
    private String resultVideoSize;
    private long sendDuration;
    private long sendStart;
    private long totalDuration;
    private long uploadDuration;
    private float videoDuration;
    private String videoSource;

    public MediaMessageReport() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, BitmapDescriptorFactory.HUE_RED, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, null, 0, 0, 536870911, null);
    }

    public final long getCompressDuration() {
        return this.compressDuration;
    }

    public final long getCompressStart() {
        return this.compressStart;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final float getOriginBitrate() {
        return this.originBitrate;
    }

    public final String getOriginEncodeFormat() {
        return this.originEncodeFormat;
    }

    public final float getOriginFPS() {
        return this.originFPS;
    }

    public final float getOriginFileSize() {
        return this.originFileSize;
    }

    public final String getOriginVideoFormat() {
        return this.originVideoFormat;
    }

    public final String getOriginVideoSize() {
        return this.originVideoSize;
    }

    public final long getPickDuration() {
        return this.pickDuration;
    }

    public final long getPickStart() {
        return this.pickStart;
    }

    public final String getResult() {
        return this.result;
    }

    public final float getResultBitrate() {
        return this.resultBitrate;
    }

    public final String getResultEncodeFormat() {
        return this.resultEncodeFormat;
    }

    public final float getResultFPS() {
        return this.resultFPS;
    }

    public final float getResultFileSize() {
        return this.resultFileSize;
    }

    public final String getResultVideoSize() {
        return this.resultVideoSize;
    }

    public final long getSendDuration() {
        return this.sendDuration;
    }

    public final long getSendStart() {
        return this.sendStart;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public final long getUploadDuration() {
        return this.uploadDuration;
    }

    public final float getVideoDuration() {
        return this.videoDuration;
    }

    public final String getVideoSource() {
        return this.videoSource;
    }

    public final int isHDR() {
        return this.isHDR;
    }

    public final int isOriginal() {
        return this.isOriginal;
    }

    public final int isRemux() {
        return this.isRemux;
    }

    public final int isUseCache() {
        return this.isUseCache;
    }

    public final void setCompressDuration(long j) {
        this.compressDuration = j;
    }

    public final void setCompressStart(long j) {
        this.compressStart = j;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setHDR(int i) {
        this.isHDR = i;
    }

    public final void setOriginBitrate(float f) {
        this.originBitrate = f;
    }

    public final void setOriginFPS(float f) {
        this.originFPS = f;
    }

    public final void setOriginFileSize(float f) {
        this.originFileSize = f;
    }

    public final void setOriginal(int i) {
        this.isOriginal = i;
    }

    public final void setPickDuration(long j) {
        this.pickDuration = j;
    }

    public final void setPickStart(long j) {
        this.pickStart = j;
    }

    public final void setRemux(int i) {
        this.isRemux = i;
    }

    public final void setResultBitrate(float f) {
        this.resultBitrate = f;
    }

    public final void setResultFPS(float f) {
        this.resultFPS = f;
    }

    public final void setResultFileSize(float f) {
        this.resultFileSize = f;
    }

    public final void setSendDuration(long j) {
        this.sendDuration = j;
    }

    public final void setSendStart(long j) {
        this.sendStart = j;
    }

    public final void setTotalDuration(long j) {
        this.totalDuration = j;
    }

    public final void setUploadDuration(long j) {
        this.uploadDuration = j;
    }

    public final void setUseCache(int i) {
        this.isUseCache = i;
    }

    public final void setVideoDuration(float f) {
        this.videoDuration = f;
    }

    public final void setErrorMsg(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.errorMsg = str;
    }

    public final void setErrorType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.errorType = str;
    }

    public final void setOriginEncodeFormat(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.originEncodeFormat = str;
    }

    public final void setOriginVideoFormat(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.originVideoFormat = str;
    }

    public final void setOriginVideoSize(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.originVideoSize = str;
    }

    public final void setResult(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.result = str;
    }

    public final void setResultEncodeFormat(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.resultEncodeFormat = str;
    }

    public final void setResultVideoSize(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.resultVideoSize = str;
    }

    public final void setVideoSource(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.videoSource = str;
    }

    public MediaMessageReport(float f, float f2, float f3, String str, String str2, String str3, float f4, String str4, float f5, float f6, float f7, String str5, String str6, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, int i2, String str7, String str8, int i3, String str9, int i4, int i5) {
        Intrinsics.checkParameterIsNotNull(str, "originVideoSize");
        Intrinsics.checkParameterIsNotNull(str2, "originVideoFormat");
        Intrinsics.checkParameterIsNotNull(str3, "originEncodeFormat");
        Intrinsics.checkParameterIsNotNull(str4, "videoSource");
        Intrinsics.checkParameterIsNotNull(str5, "resultVideoSize");
        Intrinsics.checkParameterIsNotNull(str6, "resultEncodeFormat");
        Intrinsics.checkParameterIsNotNull(str7, "result");
        Intrinsics.checkParameterIsNotNull(str8, "errorType");
        Intrinsics.checkParameterIsNotNull(str9, "errorMsg");
        this.originFPS = f;
        this.originFileSize = f2;
        this.originBitrate = f3;
        this.originVideoSize = str;
        this.originVideoFormat = str2;
        this.originEncodeFormat = str3;
        this.videoDuration = f4;
        this.videoSource = str4;
        this.resultFPS = f5;
        this.resultFileSize = f6;
        this.resultBitrate = f7;
        this.resultVideoSize = str5;
        this.resultEncodeFormat = str6;
        this.pickStart = j;
        this.sendStart = j2;
        this.compressStart = j3;
        this.totalDuration = j4;
        this.pickDuration = j5;
        this.compressDuration = j6;
        this.uploadDuration = j7;
        this.sendDuration = j8;
        this.isRemux = i;
        this.isHDR = i2;
        this.result = str7;
        this.errorType = str8;
        this.errorCode = i3;
        this.errorMsg = str9;
        this.isOriginal = i4;
        this.isUseCache = i5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MediaMessageReport(float r40, float r41, float r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, float r46, java.lang.String r47, float r48, float r49, float r50, java.lang.String r51, java.lang.String r52, long r53, long r55, long r57, long r59, long r61, long r63, long r65, long r67, int r69, int r70, java.lang.String r71, java.lang.String r72, int r73, java.lang.String r74, int r75, int r76, int r77, kotlin.jvm.internal.DefaultConstructorMarker r78) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.service.impl.MediaMessageReport.<init>(float, float, float, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, float, float, float, java.lang.String, java.lang.String, long, long, long, long, long, long, long, long, int, int, java.lang.String, java.lang.String, int, java.lang.String, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
