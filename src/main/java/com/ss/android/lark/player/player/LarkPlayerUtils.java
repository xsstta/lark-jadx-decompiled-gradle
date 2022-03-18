package com.ss.android.lark.player.player;

import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.ttvideoengine.IPreLoaderItemCallBackListener;
import com.ss.ttvideoengine.PreloaderURLItem;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/player/player/LarkPlayerUtils;", "", "()V", "TAG", "", "needUsePreloadForBadAV", "", "needWriteLog", "preloadRemoteVideo", "", "url", "size", "", "extra", "Ljava/util/HashMap;", "callback", "Lcom/ss/ttvideoengine/IPreLoaderItemCallBackListener;", "videoview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.player.c.e */
public final class LarkPlayerUtils {

    /* renamed from: a */
    public static final LarkPlayerUtils f129282a = new LarkPlayerUtils();

    private LarkPlayerUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m202131a() {
        return C37239a.m146648b().mo136951a("im.videoplayer.log.write");
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m202132b() {
        return C37239a.m146648b().mo136951a("bad_av_use_preload");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m202130a(String str, long j, HashMap<String, String> hashMap, IPreLoaderItemCallBackListener iPreLoaderItemCallBackListener) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(iPreLoaderItemCallBackListener, "callback");
        StringBuilder sb = new StringBuilder();
        sb.append("start to preload remote video, url: ");
        sb.append(str);
        sb.append(", size: ");
        sb.append(j);
        sb.append(", extra size: ");
        sb.append(hashMap != null ? Integer.valueOf(hashMap.size()) : null);
        Log.m165389i("LarkPlayerUtils", sb.toString());
        if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null) && j > 0) {
            PreloaderURLItem preloaderURLItem = new PreloaderURLItem(String.valueOf(str.hashCode()), (String) null, j, new String[]{str});
            preloaderURLItem.setPriorityLevel(0);
            preloaderURLItem.setCallBackListener(iPreLoaderItemCallBackListener);
            if (hashMap != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    preloaderURLItem.setCustomHeader(entry.getKey(), entry.getValue());
                }
            }
            TTVideoEngine.addTask(preloaderURLItem);
        }
    }
}
