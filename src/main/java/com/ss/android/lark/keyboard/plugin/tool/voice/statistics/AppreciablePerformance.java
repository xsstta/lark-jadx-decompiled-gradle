package com.ss.android.lark.keyboard.plugin.tool.voice.statistics;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0004J\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010 \u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bJ@\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\"j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001`#2\u0006\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u000bJ\"\u0010+\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010,\u001a\u00020\u0018J\u0006\u0010-\u001a\u00020\u0018J\u0010\u0010.\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/statistics/AppreciablePerformance;", "", "()V", "ERROR_PLAY_DOWNLOAD_ERROR", "", "ERROR_PLAY_ERROR", "ERROR_RECOGNITION_EMPTY", "ERROR_RECOGNITION_SDK", "ERROR_RECOGNITION_TIME_OUT", "ERROR_RECOGNITION_UNKNOWN", "LOG_TAG", "", "VOICE_THROTTLE", "mAudioLength", "mHasVoice", "", "mMessageId", "mPlayKey", "mRecognitionKey", "mRecordKey", "mResourceKey", "mStartRecogTime", "", "clearPlay", "", "endPlay", "endRecognition", "endRecord", "errorPlay", "errorCode", "errorRecognition", "errorMsg", "errorRecord", "getPlayExtra", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "audioLength", "messageId", "resourceKey", "judgeHasVoice", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "startDownload", "startPlay", "startRecognition", "startRecord", "stopDownload", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.b.a */
public final class AppreciablePerformance {

    /* renamed from: a */
    public static final AppreciablePerformance f104480a = new AppreciablePerformance();

    /* renamed from: b */
    private static String f104481b;

    /* renamed from: c */
    private static String f104482c;

    /* renamed from: d */
    private static String f104483d;

    /* renamed from: e */
    private static boolean f104484e;

    /* renamed from: f */
    private static long f104485f;

    /* renamed from: g */
    private static int f104486g;

    /* renamed from: h */
    private static String f104487h = "";

    /* renamed from: i */
    private static String f104488i = "";

    private AppreciablePerformance() {
    }

    /* renamed from: d */
    public final void mo147946d() {
        String str = f104482c;
        if (str != null) {
            Log.m165379d("AppreciablePerformance", "endRecognition");
            AppreciableKit.f73094h.mo103524a().mo103518a(str, (String) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        }
        f104482c = null;
    }

    /* renamed from: a */
    public final void mo147936a() {
        Log.m165379d("AppreciablePerformance", "startRecord");
        f104481b = AppreciableKit.f73094h.mo103524a().mo103510a(Biz.Messenger, Scene.Chat, Event.audio_record, (String) null, false, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, MapsKt.mapOf(TuplesKt.to("is_other_audio_play", false)));
    }

    /* renamed from: b */
    public final void mo147942b() {
        String str = f104481b;
        if (str != null) {
            Log.m165379d("AppreciablePerformance", "endRecord");
            AppreciableKit.f73094h.mo103524a().mo103518a(str, (String) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        }
        f104481b = null;
    }

    /* renamed from: c */
    public final void mo147945c() {
        Log.m165379d("AppreciablePerformance", "startRecognition");
        f104482c = AppreciableKit.f73094h.mo103524a().mo103510a(Biz.Messenger, Scene.Chat, Event.audio_recognition, (String) null, true, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        f104485f = System.currentTimeMillis();
        f104484e = false;
    }

    /* renamed from: e */
    public final void mo147947e() {
        String str = f104483d;
        if (str != null) {
            Log.m165379d("AppreciablePerformance", "endPlay");
            AppreciableKit.f73094h.mo103524a().mo103518a(str, (String) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        }
        f104483d = null;
        f104486g = 0;
        f104487h = "";
        f104488i = "";
    }

    /* renamed from: f */
    public final void mo147948f() {
        if (!TextUtils.isEmpty(f104483d)) {
            Log.m165389i("AppreciablePerformance", "clearPlay, playKey:" + f104483d + ", messageId:" + f104487h);
            f104483d = null;
            f104486g = 0;
            f104487h = "";
            f104488i = "";
        }
    }

    /* renamed from: b */
    public final void mo147944b(String str) {
        String str2;
        if (!(!Intrinsics.areEqual(str, f104487h)) && (str2 = f104483d) != null) {
            Log.m165389i("AppreciablePerformance", "stopDownload, messageId:" + str);
            AppreciableKit.f73094h.mo103524a().mo103521b(str2, "download_cost");
        }
    }

    /* renamed from: a */
    public final void mo147937a(int i) {
        if (f104483d != null) {
            Log.m165383e("AppreciablePerformance", "errorPlay, errorCode:" + i + ", audioLength:" + f104486g + ", messageId:" + f104487h + ", resourceKey:" + f104488i);
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.audio_play, ErrorType.Other, ErrorLevel.Fatal, i, null, null, null, false, null, f104480a.m162673b(f104486g, f104487h, f104488i), null));
        }
        f104483d = null;
        f104486g = 0;
        f104487h = "";
        f104488i = "";
    }

    /* renamed from: a */
    public final void mo147940a(String str) {
        String str2;
        if (!(!Intrinsics.areEqual(str, f104487h)) && (str2 = f104483d) != null) {
            Log.m165389i("AppreciablePerformance", "startDownload, messageId:" + str);
            AppreciableKit.f73094h.mo103524a().mo103517a(str2, "download_cost");
        }
    }

    /* renamed from: a */
    public final void mo147941a(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i4 = i2 + 1;
            if (i2 % 2 == 0) {
                i3 = (b >> 8) & 255;
            } else {
                int i5 = (b & 255) | i3;
                Log.m165379d("AppreciablePerformance", "db is:" + i5);
                if (i5 > 40) {
                    f104484e = true;
                }
            }
            i++;
            i2 = i4;
        }
    }

    /* renamed from: a */
    public final void mo147938a(int i, String str) {
        if (f104481b != null) {
            Log.m165379d("AppreciablePerformance", "errorRecord, errorCode:" + i + ", errorMsg:" + str);
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.audio_record, ErrorType.Other, ErrorLevel.Fatal, i, null, null, str, false, null, null, MapsKt.mapOf(TuplesKt.to("is_other_audio_play", false))));
        }
        f104481b = null;
    }

    /* renamed from: b */
    public final void mo147943b(int i, String str) {
        if (f104482c != null) {
            long currentTimeMillis = System.currentTimeMillis() - f104485f;
            Log.m165379d("AppreciablePerformance", "errorRecognition, errorCode:" + i + ", errorMsg:" + str + ", hasVoice:" + f104484e + ", audioLength:" + currentTimeMillis);
            AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Chat, Event.audio_recognition, ErrorType.SDK, ErrorLevel.Fatal, i, null, null, str, true, null, MapsKt.mapOf(TuplesKt.to("audio_length", Long.valueOf(currentTimeMillis))), MapsKt.mapOf(TuplesKt.to("has_voice", Boolean.valueOf(f104484e)))));
        }
        f104482c = null;
    }

    /* renamed from: b */
    private final HashMap<String, Object> m162673b(int i, String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> hashMap2 = hashMap;
        hashMap2.put("audio_length", Integer.valueOf(i));
        if (str != null) {
            hashMap2.put("message_id", str);
        }
        if (str2 != null) {
            hashMap2.put("resource_key", str2);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo147939a(int i, String str, String str2) {
        Log.m165379d("AppreciablePerformance", "startPlay, audioLength:" + i + ", messageId:" + str + ", resourceKey:" + str2);
        if (f104483d == null || !Intrinsics.areEqual(f104487h, str)) {
            f104486g = i;
            f104487h = str;
            f104488i = str2;
            f104483d = AppreciableKit.f73094h.mo103524a().mo103510a(Biz.Messenger, Scene.Chat, Event.audio_play, (String) null, true, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) m162673b(i, str, str2), (Map<String, ? extends Object>) null);
            return;
        }
        Log.m165379d("AppreciablePerformance", "skip repeat start");
    }
}
