package com.ss.android.lark.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\nH\u0007J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\b\u0010\u0013\u001a\u00020\bH\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/utils/VideoSettingUtils;", "", "()V", "TAG", "", "compressConfig", "Lcom/ss/android/lark/utils/VideoCompressConfig;", "sendConfig", "Lcom/ss/android/lark/utils/VideoSendConfig;", "veConfig", "Lcom/ss/android/lark/utils/VeConfig;", "veRemoteSetting", "Lorg/json/JSONObject;", "getVeRemoteSetting", "()Lorg/json/JSONObject;", "veRemoteSetting$delegate", "Lkotlin/Lazy;", "getVeConfig", "getVideoCompressConfig", "getVideoSendConfig", "isNeedForceEncode", "", "mediaPath", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.utils.an */
public final class VideoSettingUtils {

    /* renamed from: a */
    public static final VideoSettingUtils f142333a = new VideoSettingUtils();

    /* renamed from: b */
    private static final Lazy f142334b = LazyKt.lazy(C57799a.INSTANCE);

    /* renamed from: c */
    private static VideoSendConfig f142335c;

    /* renamed from: d */
    private static VideoCompressConfig f142336d;

    /* renamed from: e */
    private static VeConfig f142337e;

    /* renamed from: d */
    private final JSONObject m224297d() {
        return (JSONObject) f142334b.getValue();
    }

    private VideoSettingUtils() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.an$a */
    static final class C57799a extends Lambda implements Function0<JSONObject> {
        public static final C57799a INSTANCE = new C57799a();

        C57799a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final JSONObject invoke() {
            String string = SettingManager.getInstance().getString(VideoRemoteSetting.class);
            Log.m165389i("VideoSettingUtils", "getRemoteSetting: " + string);
            if (!TextUtils.isEmpty(string)) {
                return new JSONObject(string);
            }
            return new JSONObject();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final VideoSendConfig m224293a() {
        VideoSendConfig videoSendConfig = f142335c;
        if (videoSendConfig == null) {
            String optString = f142333a.m224297d().optString("send", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    f142335c = (VideoSendConfig) new Gson().fromJson(optString, VideoSendConfig.class);
                } catch (Exception e) {
                    Log.m165383e("VideoSettingUtils", "getVideoSendConfig: " + e.getMessage());
                }
            }
            VideoSendConfig videoSendConfig2 = f142335c;
            if (videoSendConfig2 != null) {
                return videoSendConfig2;
            }
            return new VideoSendConfig(0, 0, null, 0, 0, 31, null);
        } else if (videoSendConfig != null) {
            return videoSendConfig;
        } else {
            return new VideoSendConfig(0, 0, null, 0, 0, 31, null);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final VideoCompressConfig m224295b() {
        VideoCompressConfig videoCompressConfig = f142336d;
        if (videoCompressConfig == null) {
            String optString = f142333a.m224297d().optString("compress", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    f142336d = (VideoCompressConfig) new Gson().fromJson(optString, VideoCompressConfig.class);
                } catch (Exception e) {
                    Log.m165383e("VideoSettingUtils", "getVideoCompressConfig: " + e.getMessage());
                }
            }
            VideoCompressConfig videoCompressConfig2 = f142336d;
            if (videoCompressConfig2 != null) {
                return videoCompressConfig2;
            }
            return new VideoCompressConfig(0, 0, 0, 0, 0, 0, 63, null);
        } else if (videoCompressConfig != null) {
            return videoCompressConfig;
        } else {
            return new VideoCompressConfig(0, 0, 0, 0, 0, 0, 63, null);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final VeConfig m224296c() {
        VeConfig veConfig = f142337e;
        if (veConfig == null) {
            String optString = f142333a.m224297d().optString("ve", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    f142337e = (VeConfig) new Gson().fromJson(optString, VeConfig.class);
                } catch (Exception e) {
                    Log.m165383e("VideoSettingUtils", "getVeConfig: " + e.getMessage());
                }
            }
            VeConfig veConfig2 = f142337e;
            if (veConfig2 != null) {
                return veConfig2;
            }
            return new VeConfig(0, null, null, null, null, 31, null);
        } else if (veConfig != null) {
            return veConfig;
        } else {
            return new VeConfig(0, null, null, null, null, 31, null);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m224294a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "mediaPath");
        if (new File(str).length() > ((long) m224296c().getRemuxFileSize())) {
            z = true;
        } else {
            z = false;
        }
        Log.m165389i("VideoSettingUtils", "isNeedForceEncode: " + z);
        return z;
    }
}
