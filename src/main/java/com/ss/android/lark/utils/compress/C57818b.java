package com.ss.android.lark.utils.compress;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.VeHWUtils;
import com.ss.android.lark.utils.VideoCompressConfig;
import com.ss.android.lark.utils.VideoSettingUtils;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.compress.VideoCompressResult;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: com.ss.android.lark.utils.compress.b */
public class C57818b {
    /* renamed from: a */
    public static float m224416a(float f) {
        return ((float) Math.round(f * 100.0f)) / 100.0f;
    }

    /* renamed from: a */
    public static VideoCompressResult m224419a(boolean z) {
        VideoCompressResult.ResultType resultType;
        if (z) {
            resultType = VideoCompressResult.ResultType.ENCODE;
        } else {
            resultType = VideoCompressResult.ResultType.MUXER;
        }
        return new VideoCompressResult(resultType);
    }

    /* renamed from: a */
    private static String m224420a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains(StoragePathUtils.f94669a.mo135726X(LarkContext.getApplication()) + "/video")) {
            return "camera";
        }
        return "album";
    }

    /* renamed from: a */
    private static int[] m224422a(VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        int i;
        int i2;
        if (vEVideoFileInfo.rotation == 90 || vEVideoFileInfo.rotation == 270) {
            i2 = vEVideoFileInfo.height;
            i = vEVideoFileInfo.width;
        } else {
            i2 = vEVideoFileInfo.width;
            i = vEVideoFileInfo.height;
        }
        return new int[]{i2, i};
    }

    /* renamed from: a */
    public static VideoCompressResult.C57816a m224418a(String str, String str2) {
        return m224417a(ao.m224311b(str), new int[10], str, str2, 0);
    }

    /* renamed from: b */
    public static boolean m224424b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && C26311p.m95290j(str) && !TextUtils.isEmpty(str2) && !C26311p.m95290j(str2)) {
            try {
                File file = new File(str2);
                File parentFile = file.getParentFile();
                while (parentFile != null && !parentFile.exists()) {
                    if (!parentFile.mkdir()) {
                        return false;
                    }
                    parentFile = parentFile.getParentFile();
                }
                if (!file.exists() && !file.createNewFile()) {
                    return false;
                }
                C26311p.m95274a(str, str2);
                long c = C26311p.m95281c(new File(str));
                long c2 = C26311p.m95281c(new File(str2));
                if (c == c2) {
                    return true;
                }
                C26311p.m95291k(str2);
                Log.m165383e("VideoCompressTools", "origin video size: " + c + ", target video size: " + c2);
                return false;
            } catch (IOException e) {
                e.printStackTrace();
                Log.m165383e("VideoCompressTools", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: a */
    private static int[] m224423a(VEUtils.VEVideoFileInfo vEVideoFileInfo, boolean z) {
        float f;
        float f2;
        int[] iArr = new int[3];
        VideoCompressConfig b = VideoSettingUtils.m224295b();
        int[] a = m224422a(vEVideoFileInfo);
        float max = (float) Math.max(vEVideoFileInfo.width, vEVideoFileInfo.height);
        float min = (float) Math.min(vEVideoFileInfo.width, vEVideoFileInfo.height);
        if (z) {
            f2 = (float) b.getOriginBigSideMax();
            f = (float) b.getOriginSmallSideMax();
            iArr[2] = Math.min(b.getOriginMaxFPS(), vEVideoFileInfo.fps);
        } else {
            f2 = (float) b.getCommonBigSideMax();
            f = (float) b.getCommonSmallSideMax();
            iArr[2] = Math.min(b.getCommonMaxFPS(), vEVideoFileInfo.fps);
        }
        if (max * min >= f2 * f && f2 > BitmapDescriptorFactory.HUE_RED && f > BitmapDescriptorFactory.HUE_RED) {
            float max2 = Math.max(Math.min(max / f2, min / f), 1.0f);
            max /= max2;
            min /= max2;
        }
        if (a[0] > a[1]) {
            iArr[0] = (int) max;
            iArr[1] = (int) min;
        } else {
            iArr[0] = (int) min;
            iArr[1] = (int) max;
        }
        Log.m165389i("VideoCompressTools", "is origin mode: " + z + ", compress param: width: " + iArr[0] + ", height: " + iArr[1] + ", fps: " + iArr[2]);
        return iArr;
    }

    /* renamed from: a */
    public static void m224421a(Context context, String str, final String str2, final String str3, final AbstractC57817a<VideoCompressResult> aVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        final VEUtils.VEVideoFileInfo b = ao.m224311b(str2);
        final boolean a = VideoSettingUtils.m224294a(str2);
        final int[] a2 = m224423a(b, ao.m224318g(str3));
        ao.m224302a(context, str, str2, str3, a2[0], a2[1], a2[2], !a, VeHWUtils.m224275f(), new IGetDataCallback<String>() {
            /* class com.ss.android.lark.utils.compress.C57818b.C578191 */

            /* renamed from: a */
            public void onSuccess(String str) {
                VideoCompressResult a = C57818b.m224419a(a);
                VideoCompressResult.C57816a a2 = C57818b.m224417a(b, a2, str2, str3, System.currentTimeMillis() - currentTimeMillis);
                a2.mo196149g(!a ? 1 : 0);
                a.mo196121a(a2);
                aVar.onSuccess(a);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult instanceof VideoCompressErrorResult) {
                    VideoCompressResult a = C57818b.m224419a(a);
                    VideoCompressResult.C57816a a2 = C57818b.m224417a(b, a2, str2, str3, System.currentTimeMillis() - currentTimeMillis);
                    a2.mo196155i(errorResult.getErrorCode());
                    a2.mo196149g(!a ? 1 : 0);
                    a.mo196121a(a2);
                    ((VideoCompressErrorResult) errorResult).setVideoCompressResult(a);
                }
                aVar.onError(errorResult);
            }
        }, aVar);
    }

    /* renamed from: a */
    public static VideoCompressResult.C57816a m224417a(VEUtils.VEVideoFileInfo vEVideoFileInfo, int[] iArr, String str, String str2, long j) {
        VideoCompressResult.C57816a aVar = new VideoCompressResult.C57816a();
        aVar.mo196127a(ao.m224318g(str2));
        aVar.mo196126a(vEVideoFileInfo.formatName);
        aVar.mo196135c(vEVideoFileInfo.fps);
        aVar.mo196139d(vEVideoFileInfo.bitrate);
        aVar.mo196125a(vEVideoFileInfo.width);
        aVar.mo196131b(vEVideoFileInfo.height);
        aVar.mo196132b(vEVideoFileInfo.width + "x" + vEVideoFileInfo.height);
        aVar.mo196124a(m224416a((((float) C26311p.m95281c(new File(str))) / 1024.0f) / 1024.0f));
        aVar.mo196144e(vEVideoFileInfo.formatName);
        aVar.mo196147f(vEVideoFileInfo.codec + "");
        aVar.mo196143e(iArr[2]);
        aVar.mo196136c(iArr[0] + "x" + iArr[1]);
        VEUtils.VEVideoFileInfo b = ao.m224311b(str2);
        aVar.mo196146f(b.fps);
        aVar.mo196130b((float) b.bitrate);
        aVar.mo196140d(b.width + "x" + b.height);
        aVar.mo196134c(m224416a((((float) C26311p.m95281c(new File(str2))) / 1024.0f) / 1024.0f));
        aVar.mo196153h(b.codec + "");
        aVar.mo196152h(b.bHDR ? 1 : 0);
        aVar.mo196138d(m224416a(((float) vEVideoFileInfo.duration) / 1000.0f));
        aVar.mo196150g(m224420a(str));
        aVar.mo196142e(m224416a(((float) j) / 1000.0f));
        return aVar;
    }
}
