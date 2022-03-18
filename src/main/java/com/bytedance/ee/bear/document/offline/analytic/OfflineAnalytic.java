package com.bytedance.ee.bear.document.offline.analytic;

import android.os.SystemClock;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/document/offline/analytic/OfflineAnalytic;", "", "()V", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.offline.a.a */
public final class OfflineAnalytic {

    /* renamed from: a */
    public static final Companion f16488a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m23716a(long j, int i, String str, int i2) {
        f16488a.mo23801a(j, i, str, i2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m23717a(String str, long j, long j2, int i, String str2, int i2) {
        f16488a.mo23802a(str, j, j2, i, str2, i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000fH\u0007J8\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/document/offline/analytic/OfflineAnalytic$Companion;", "", "()V", "ANALYTIC_KEY_CACHE", "", "ANALYTIC_KEY_CODE", "ANALYTIC_KEY_COST_TIME", "ANALYTIC_KEY_IMAGE_TYPE", "ANALYTIC_KEY_MSG", "ANALYTIC_KEY_PIC_FROM", "ANALYTIC_KEY_PIC_SIZE", "CACHE_LOCAL", "CACHE_LRU", "CACHE_NONE", "DOWNLOAD_FAILURE", "", "DOWNLOAD_SUCCESS", "PERFORMANCE_IMAGE_DOWNLOAD_RESULT", "PIC_FROM_CUSTOM_SCHEME_DOCS", "PIC_FROM_CUSTOM_SCHEME_DRIVE", "TAG", "reportPicDownload", "", "params", "Lorg/json/JSONObject;", "reportPicDownloadFailure", "startTime", "", "resultCode", "picFrom", "imageType", "reportPicDownloadSuccess", "cache", "fileSize", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.offline.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo23803a(JSONObject jSONObject) {
            C13479a.m54772d("OfflineAnalytic", jSONObject.toString());
            C5234y.m21391b().mo21085b("docs_dev_performance_native_pic_download_result", jSONObject);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo23801a(long j, int i, String str, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "picFrom");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i).put("msg", "failure").put("cache", "0").put(HiAnalyticsConstant.BI_KEY_COST_TIME, SystemClock.uptimeMillis() - j).put("pic_size", -1).put("pic_from", str).put("image_type", i2);
            mo23803a(jSONObject);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo23802a(String str, long j, long j2, int i, String str2, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "cache");
            Intrinsics.checkParameterIsNotNull(str2, "picFrom");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i).put("msg", "success").put("cache", str).put(HiAnalyticsConstant.BI_KEY_COST_TIME, SystemClock.uptimeMillis() - j).put("pic_size", j2).put("pic_from", str2).put("image_type", i2);
            mo23803a(jSONObject);
        }
    }
}
