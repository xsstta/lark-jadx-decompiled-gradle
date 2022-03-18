package com.ss.android.lark.image.impl;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0002\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/image/impl/ImageCompressHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "Param", "base_lark-image_lark-image_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.image.impl.b */
public final class ImageCompressHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f99817a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m153345a(Biz biz, Scene scene, String str, boolean z, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        f99817a.mo142341a(biz, scene, str, z, str2, j, j2, j3, j4, j5, j6, j7, j8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jt\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/image/impl/ImageCompressHitPoint$Companion;", "", "()V", "EVENT_NAME_COMPRESS", "", "TAG", "sendImageCompress", "", "biz", "Lcom/ss/android/lark/appreciablelib/Biz;", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "totalCost", "isSuccess", "", "imageType", "resourceContentLength", "", "resourceWidth", "resourceHeight", "uploadContentLength", "uploadWidth", "uploadHeight", "resourceFrames", "errorCode", "base_lark-image_lark-image_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.image.impl.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo142341a(Biz biz, Scene scene, String str, boolean z, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            Intrinsics.checkParameterIsNotNull(str, "totalCost");
            Intrinsics.checkParameterIsNotNull(str2, "imageType");
            JSONObject jSONObject = new JSONObject();
            if (biz != null) {
                jSONObject.put("biz", biz.getValue());
            }
            if (scene != null) {
                jSONObject.put("scene", scene.getValue());
            }
            jSONObject.put("total_cost", str).put("is_success", z).put("error_code", j8).put("image_type", str2).put("resource_content_length", j).put("resource_width", j2).put("resource_height", j3).put("resource_frames", j7).put("upload_content_length", j4).put("upload_width", j5).put("upload_height", j6);
            Log.m165379d("ImageCompressHitPoint", jSONObject.toString());
            Statistics.sendEvent("image_compress_dev", jSONObject);
        }
    }
}
