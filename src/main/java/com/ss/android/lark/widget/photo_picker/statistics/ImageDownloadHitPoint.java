package com.ss.android.lark.widget.photo_picker.statistics;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/ImageDownloadHitPoint;", "", "()V", "Companion", "Params", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.statistics.a */
public final class ImageDownloadHitPoint {

    /* renamed from: a */
    public static final Companion f145428a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m228125a(Biz biz, Scene scene, String str, boolean z, boolean z2, int i, String str2, boolean z3, long j) {
        f145428a.mo199300a(biz, scene, str, z, z2, i, str2, z3, j);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/statistics/ImageDownloadHitPoint$Companion;", "", "()V", "EVENT_NAME_DOWNLOAD", "", "TAG", "sendImageDownload", "", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "totalCost", "isSuccess", "", "fromNet", "fromType", "", "imageKey", "isOrigin", "size", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.statistics.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo199300a(Biz biz, Scene scene, String str, boolean z, boolean z2, int i, String str2, boolean z3, long j) {
            Intrinsics.checkParameterIsNotNull(str, "totalCost");
            Intrinsics.checkParameterIsNotNull(str2, "imageKey");
            JSONObject jSONObject = new JSONObject();
            if (biz != null) {
                jSONObject.put("biz", biz.getValue());
            }
            if (scene != null) {
                jSONObject.put("scene", scene.getValue());
            }
            jSONObject.put("total_cost", str).put("is_success", z).put("from_net", z2).put("from_type", i).put("image_key", str2).put("media_is_origin_type", z3).put("resource_content_length", j);
            Log.m165379d("ImageDownloadHitPoint", jSONObject.toString());
            Statistics.sendEvent("image_donwload_dev", jSONObject);
        }
    }
}
