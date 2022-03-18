package com.bytedance.geckox.meta;

import com.bytedance.geckox.C14264e;
import com.bytedance.geckox.p774j.C14290b;
import com.bytedance.geckox.statistic.C14343e;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001e\u001a\u00020\u000bJ\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0004J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u001c\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\bJ\u000e\u0010%\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0004J\u0016\u0010&\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010!\u001a\u00020\bJ6\u0010'\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0004J\b\u0010+\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R2\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/bytedance/geckox/meta/MetaDataManager;", "", "()V", "DELAY_TIME", "", "INTERVAL_TIME", "cleanChannels", "", "", "Ljava/util/ArrayList;", "cleanStrategyEnabled", "", "expireAge", "", "handlerTimerTask", "Lcom/bytedance/geckox/task/HandlerTimerTask;", "metaDataMap", "", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/bytedance/geckox/meta/MetaDataItem;", "getMetaDataMap", "()Ljava/util/Map;", "setMetaDataMap", "(Ljava/util/Map;)V", "metaFileMap", "Ljava/io/File;", "metaTagMap", "checkMetaFileExists", "accessKey", "cleanGeckoResource", "needClean", "createChannelUpdateMetaData", "", "channel", "timeStamp", "createMetaFile", "getStoredMetaData", "initMetaData", "removeChannelFromMetaData", "resourceAccessUpdateMetaData", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, ShareHitPoint.f121869d, "hit_local", "writeToMetaData", "geckox_noasanRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.geckox.meta.a */
public final class MetaDataManager {

    /* renamed from: a */
    public static final MetaDataManager f37560a = new MetaDataManager();

    /* renamed from: b */
    private static Map<String, ConcurrentHashMap<String, MetaDataItem>> f37561b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Map<String, File> f37562c = new ConcurrentHashMap();

    /* renamed from: d */
    private static Map<String, Boolean> f37563d = new ConcurrentHashMap();

    /* renamed from: e */
    private static boolean f37564e;

    /* renamed from: f */
    private static int f37565f = 7;

    /* renamed from: g */
    private static C14290b f37566g = new C14290b("meta-timer-task", 3);

    private MetaDataManager() {
    }

    /* renamed from: a */
    public final Map<String, ConcurrentHashMap<String, MetaDataItem>> mo52261a() {
        return f37561b;
    }

    /* renamed from: b */
    public final boolean mo52266b(String str) {
        if (f37562c.get(str) != null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        C14264e a = C14264e.m57551a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GeckoGlobalManager.inst()");
        sb.append(a.mo52225b().get(str));
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append("metaData.json");
        File file = new File(sb.toString());
        if (!file.exists()) {
            return false;
        }
        f37562c.put(str, file);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0086 A[SYNTHETIC, Splitter:B:40:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097 A[SYNTHETIC, Splitter:B:45:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.geckox.meta.MetaDataItem> mo52262a(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.meta.MetaDataManager.mo52262a(java.lang.String):java.util.concurrent.ConcurrentHashMap");
    }

    /* renamed from: a */
    public final void mo52263a(String str, String str2) {
        ConcurrentHashMap<String, MetaDataItem> concurrentHashMap;
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        Intrinsics.checkParameterIsNotNull(str2, "channel");
        if (f37564e && (concurrentHashMap = f37561b.get(str)) != null) {
            concurrentHashMap.remove(str2);
            f37563d.put(str, true);
        }
    }

    /* renamed from: a */
    public final void mo52264a(String str, String str2, long j) {
        ConcurrentHashMap<String, MetaDataItem> concurrentHashMap;
        MetaDataItem metaDataItem;
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        Intrinsics.checkParameterIsNotNull(str2, "channel");
        if (f37564e && (concurrentHashMap = f37561b.get(str)) != null && (metaDataItem = concurrentHashMap.get(str2)) != null) {
            metaDataItem.allowUpdate = true;
            metaDataItem.lastReadTimeStamp = j;
            f37563d.put(str, true);
        }
    }

    /* renamed from: a */
    public final void mo52265a(String str, String str2, long j, String str3, String str4, long j2) {
        ConcurrentHashMap<String, MetaDataItem> concurrentHashMap;
        MetaDataItem metaDataItem;
        Intrinsics.checkParameterIsNotNull(str, "accessKey");
        Intrinsics.checkParameterIsNotNull(str2, "channel");
        Intrinsics.checkParameterIsNotNull(str3, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str4, "hit_local");
        if (f37564e && (concurrentHashMap = f37561b.get(str)) != null && (metaDataItem = concurrentHashMap.get(str2)) != null) {
            C14343e.m57792a(str, str2, String.valueOf(j), str3, str4, String.valueOf(!metaDataItem.allowUpdate));
            if (metaDataItem.allowUpdate) {
                metaDataItem.lastReadTimeStamp = j2;
            } else {
                metaDataItem.allowUpdate = true;
            }
            f37563d.put(str, true);
        }
    }
}
