package com.ss.android.lark.chat.service.impl;

import android.os.SystemClock;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.VeHWUtils;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.compress.C57818b;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J3\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\f\u0010\u001c\u001a\u00020\u001d*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R.\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/service/impl/MediaMessageMonitor;", "", "()V", "REPORT_KEY_MEDIA_MESSAGE", "", "Tag", "sendingMsgReportMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/chat/service/impl/MediaMessageReport;", "Lkotlin/collections/HashMap;", "onCompressMediaEnd", "", "mgsId", "result", "Lcom/ss/android/lark/utils/compress/VideoCompressResult;", "onCompressMediaStart", "onScreenEnd", "compressPath", "onScreenStart", "onSendMsgFailed", "errorType", "errorCode", "", "errorMsg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "onSendMsgSuccess", "netCost", "", "convertToJson", "Lorg/json/JSONObject;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.service.impl.n */
public final class MediaMessageMonitor {

    /* renamed from: a */
    public static final MediaMessageMonitor f88539a = new MediaMessageMonitor();

    /* renamed from: b */
    private static final HashMap<String, MediaMessageReport> f88540b = new HashMap<>();

    private MediaMessageMonitor() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final synchronized void m132850b(String str) {
        synchronized (MediaMessageMonitor.class) {
            Intrinsics.checkParameterIsNotNull(str, "mgsId");
            MediaMessageReport mediaMessageReport = f88540b.get(str);
            if (mediaMessageReport != null) {
                mediaMessageReport.setCompressStart(SystemClock.elapsedRealtime());
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m132845a(String str) {
        int i;
        synchronized (MediaMessageMonitor.class) {
            Intrinsics.checkParameterIsNotNull(str, "compressPath");
            boolean g = ao.m224318g(str);
            MediaMessageReport mediaMessageReport = new MediaMessageReport(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, BitmapDescriptorFactory.HUE_RED, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, null, 0, 0, 536870911, null);
            mediaMessageReport.setPickStart(SystemClock.elapsedRealtime());
            if (g) {
                i = 1;
            } else {
                i = 0;
            }
            mediaMessageReport.setOriginal(i);
            f88540b.put(str, mediaMessageReport);
        }
    }

    /* renamed from: a */
    private final JSONObject m132844a(MediaMessageReport mediaMessageReport) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("origin_fps", Float.valueOf(mediaMessageReport.getOriginFPS()));
        jSONObject.put("origin_file_size", Float.valueOf(mediaMessageReport.getOriginFileSize()));
        jSONObject.put("origin_bitrate", Float.valueOf(mediaMessageReport.getOriginBitrate()));
        jSONObject.put("origin_video_size", mediaMessageReport.getOriginVideoSize());
        jSONObject.put("origin_video_format", mediaMessageReport.getOriginVideoFormat());
        jSONObject.put("origin_encode_format", mediaMessageReport.getOriginEncodeFormat());
        jSONObject.put("video_duration", Float.valueOf(mediaMessageReport.getVideoDuration()));
        jSONObject.put("video_source", mediaMessageReport.getVideoSource());
        jSONObject.put("result_fps", Float.valueOf(mediaMessageReport.getResultFPS()));
        jSONObject.put("result_file_size", Float.valueOf(mediaMessageReport.getResultFileSize()));
        jSONObject.put("result_bitrate", Float.valueOf(mediaMessageReport.getResultBitrate()));
        jSONObject.put("result_video_size", mediaMessageReport.getResultVideoSize());
        jSONObject.put("result_encode_format", mediaMessageReport.getResultEncodeFormat());
        jSONObject.put("total_duration", mediaMessageReport.getTotalDuration());
        jSONObject.put("pick_duration", mediaMessageReport.getPickDuration());
        jSONObject.put("compress_duration", mediaMessageReport.getCompressDuration());
        jSONObject.put("upload_duration", mediaMessageReport.getUploadDuration());
        jSONObject.put("send_duration", mediaMessageReport.getSendDuration());
        jSONObject.put("compress_is_remux", mediaMessageReport.isRemux());
        jSONObject.put("compress_is_HDR", mediaMessageReport.isHDR());
        if (mediaMessageReport.getCompressDuration() != 0) {
            jSONObject.put("compress_speed", Float.valueOf(C57818b.m224416a((mediaMessageReport.getOriginFileSize() / ((float) mediaMessageReport.getCompressDuration())) * ((float) 1000))));
        }
        if (mediaMessageReport.getUploadDuration() != 0) {
            jSONObject.put("upload_speed", Float.valueOf(C57818b.m224416a((mediaMessageReport.getOriginFileSize() / ((float) mediaMessageReport.getUploadDuration())) * ((float) 1000))));
        }
        if (mediaMessageReport.getResultFileSize() != BitmapDescriptorFactory.HUE_RED) {
            jSONObject.put("compress_ratio_file_size", Float.valueOf(C57818b.m224416a(mediaMessageReport.getOriginFileSize() / mediaMessageReport.getResultFileSize())));
        }
        if (mediaMessageReport.getResultBitrate() != BitmapDescriptorFactory.HUE_RED) {
            jSONObject.put("compress_ratio_bitrate", Float.valueOf(C57818b.m224416a(mediaMessageReport.getOriginBitrate() / mediaMessageReport.getResultBitrate())));
        }
        jSONObject.put("decode_is_use_hw_264", VeHWUtils.m224273d() ? 1 : 0);
        jSONObject.put("decode_is_use_hw_265", VeHWUtils.m224274e() ? 1 : 0);
        jSONObject.put("encode_is_use_hw_264", VeHWUtils.m224275f() ? 1 : 0);
        jSONObject.put("result", mediaMessageReport.getResult());
        jSONObject.put("errorType", mediaMessageReport.getErrorType());
        jSONObject.put("errorCode", mediaMessageReport.getErrorCode());
        jSONObject.put("errorMsg", mediaMessageReport.getErrorMsg());
        jSONObject.put("is_original", mediaMessageReport.isOriginal());
        jSONObject.put("is_use_cache", mediaMessageReport.isUseCache());
        return jSONObject;
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m132848a(String str, String str2) {
        synchronized (MediaMessageMonitor.class) {
            Intrinsics.checkParameterIsNotNull(str, "mgsId");
            Intrinsics.checkParameterIsNotNull(str2, "compressPath");
            HashMap<String, MediaMessageReport> hashMap = f88540b;
            hashMap.put(str, hashMap.get(str2));
            hashMap.remove(str2);
            MediaMessageReport mediaMessageReport = hashMap.get(str);
            if (mediaMessageReport != null) {
                mediaMessageReport.setPickDuration(SystemClock.elapsedRealtime() - mediaMessageReport.getPickStart());
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m132846a(String str, long j) {
        synchronized (MediaMessageMonitor.class) {
            Intrinsics.checkParameterIsNotNull(str, "mgsId");
            MediaMessageReport mediaMessageReport = f88540b.get(str);
            if (mediaMessageReport != null) {
                mediaMessageReport.setResult("success");
                mediaMessageReport.setUploadDuration((SystemClock.elapsedRealtime() - mediaMessageReport.getSendStart()) - j);
                mediaMessageReport.setSendDuration(j);
                mediaMessageReport.setTotalDuration(mediaMessageReport.getPickDuration() + mediaMessageReport.getCompressDuration() + mediaMessageReport.getUploadDuration() + mediaMessageReport.getSendDuration());
                MediaMessageMonitor nVar = f88539a;
                Intrinsics.checkExpressionValueIsNotNull(mediaMessageReport, "it");
                JSONObject a = nVar.m132844a(mediaMessageReport);
                Log.m165389i("MediaMessageMonitor", "report media success msg: " + a);
                Statistics.sendEvent("send_video_info_dev", a);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m132847a(String str, VideoCompressResult videoCompressResult) {
        int i;
        synchronized (MediaMessageMonitor.class) {
            Intrinsics.checkParameterIsNotNull(str, "mgsId");
            Intrinsics.checkParameterIsNotNull(videoCompressResult, "result");
            MediaMessageReport mediaMessageReport = f88540b.get(str);
            if (mediaMessageReport != null) {
                mediaMessageReport.setCompressDuration(SystemClock.elapsedRealtime() - mediaMessageReport.getCompressStart());
                if (videoCompressResult.mo196120a() == VideoCompressResult.ResultType.REUSE) {
                    i = 1;
                } else {
                    i = 0;
                }
                mediaMessageReport.setUseCache(i);
                VideoCompressResult.C57816a b = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b, "result.metric");
                mediaMessageReport.setVideoDuration(b.mo196161o());
                VideoCompressResult.C57816a b2 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "result.metric");
                String s = b2.mo196165s();
                if (s == null) {
                    s = "album";
                }
                mediaMessageReport.setVideoSource(s);
                VideoCompressResult.C57816a b3 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "result.metric");
                mediaMessageReport.setOriginFPS((float) b3.mo196141e());
                VideoCompressResult.C57816a b4 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b4, "result.metric");
                mediaMessageReport.setOriginBitrate((float) b4.mo196145f());
                VideoCompressResult.C57816a b5 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b5, "result.metric");
                String g = b5.mo196148g();
                if (g == null) {
                    g = "0";
                }
                mediaMessageReport.setOriginVideoSize(g);
                VideoCompressResult.C57816a b6 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b6, "result.metric");
                mediaMessageReport.setOriginFileSize(b6.mo196151h());
                VideoCompressResult.C57816a b7 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b7, "result.metric");
                String q = b7.mo196163q();
                if (q == null) {
                    q = "";
                }
                mediaMessageReport.setOriginVideoFormat(q);
                VideoCompressResult.C57816a b8 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b8, "result.metric");
                String r = b8.mo196164r();
                if (r == null) {
                    r = "";
                }
                mediaMessageReport.setOriginEncodeFormat(r);
                VideoCompressResult.C57816a b9 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b9, "result.metric");
                mediaMessageReport.setResultFPS((float) b9.mo196154i());
                VideoCompressResult.C57816a b10 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b10, "result.metric");
                mediaMessageReport.setResultBitrate(b10.mo196156j());
                VideoCompressResult.C57816a b11 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b11, "result.metric");
                String k = b11.mo196157k();
                if (k == null) {
                    k = "0";
                }
                mediaMessageReport.setResultVideoSize(k);
                VideoCompressResult.C57816a b12 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b12, "result.metric");
                mediaMessageReport.setResultFileSize(b12.mo196158l());
                VideoCompressResult.C57816a b13 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b13, "result.metric");
                String t = b13.mo196166t();
                if (t == null) {
                    t = "";
                }
                mediaMessageReport.setResultEncodeFormat(t);
                VideoCompressResult.C57816a b14 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b14, "result.metric");
                mediaMessageReport.setRemux(b14.mo196159m());
                VideoCompressResult.C57816a b15 = videoCompressResult.mo196122b();
                Intrinsics.checkExpressionValueIsNotNull(b15, "result.metric");
                mediaMessageReport.setHDR(b15.mo196160n());
                mediaMessageReport.setSendStart(SystemClock.elapsedRealtime());
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m132849a(String str, String str2, Integer num, String str3) {
        int i;
        synchronized (MediaMessageMonitor.class) {
            Intrinsics.checkParameterIsNotNull(str, "mgsId");
            MediaMessageReport mediaMessageReport = f88540b.get(str);
            if (mediaMessageReport != null) {
                mediaMessageReport.setResult("failed");
                if (str2 == null) {
                    str2 = "";
                }
                mediaMessageReport.setErrorType(str2);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                mediaMessageReport.setErrorCode(i);
                if (str3 == null) {
                    str3 = "";
                }
                mediaMessageReport.setErrorMsg(str3);
                MediaMessageMonitor nVar = f88539a;
                Intrinsics.checkExpressionValueIsNotNull(mediaMessageReport, "it");
                JSONObject a = nVar.m132844a(mediaMessageReport);
                Log.m165389i("MediaMessageMonitor", "report media failed msg: " + a);
                Statistics.sendEvent("send_video_info_dev", a);
            }
        }
    }
}
