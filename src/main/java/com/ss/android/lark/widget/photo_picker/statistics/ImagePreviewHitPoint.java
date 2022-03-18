package com.ss.android.lark.widget.photo_picker.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/ImagePreviewHitPoint;", "", "()V", "Companion", "Params", "Value", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.statistics.b */
public final class ImagePreviewHitPoint {

    /* renamed from: a */
    public static final Companion f145429a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m228127a() {
        f145429a.mo199301a();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m228128a(String str, String str2) {
        f145429a.mo199302a(str, str2);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m228129b() {
        f145429a.mo199303b();
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m228130b(String str, String str2) {
        f145429a.mo199304b(str, str2);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m228131c() {
        f145429a.mo199305c();
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m228132c(String str, String str2) {
        f145429a.mo199306c(str, str2);
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m228133d() {
        f145429a.mo199307d();
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m228134d(String str, String str2) {
        f145429a.mo199308d(str, str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\u000f\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/ImagePreviewHitPoint$Companion;", "", "()V", "LOG_TAG", "", "sendPhotographClick", "", "click", "target", "sendPhotographView", "sendPicBrowserClick", "sendPicBrowserMoreClick", "sendPicBrowserMoreView", "sendPicBrowserView", "sendPicPreviewClick", "sendPicPreviewView", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo199301a() {
            Statistics.sendEvent("public_picbrowser_view");
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo199303b() {
            Statistics.sendEvent("public_picbrowser_more_view");
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo199305c() {
            Statistics.sendEvent("public_pic_preview_view");
        }

        @JvmStatic
        /* renamed from: d */
        public final void mo199307d() {
            Statistics.sendEvent("public_photograph_view");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo199302a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            try {
                Statistics.sendEvent("public_picbrowser_click", new JSONObject().put("click", str).put("target", str2));
            } catch (Exception e) {
                Log.m165383e("ImagePreviewHitPoint", "sendPicBrowserClick " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo199304b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            try {
                Statistics.sendEvent("public_picbrowser_more_click", new JSONObject().put("click", str).put("target", str2));
            } catch (Exception e) {
                Log.m165383e("ImagePreviewHitPoint", "sendPicBrowserMoreClick " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo199306c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            try {
                Statistics.sendEvent("public_pic_preview_click", new JSONObject().put("click", str).put("target", str2));
            } catch (Exception e) {
                Log.m165383e("ImagePreviewHitPoint", "sendPicPreviewClick " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: d */
        public final void mo199308d(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            Intrinsics.checkParameterIsNotNull(str2, "target");
            try {
                Statistics.sendEvent("public_photograph_click", new JSONObject().put("click", str).put("target", str2));
            } catch (Exception e) {
                Log.m165383e("ImagePreviewHitPoint", "sendPhotographClick " + e.getMessage());
            }
        }
    }
}
