package com.ss.android.photoeditor.ve.hitpoint;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/photoeditor/ve/hitpoint/ImageEditorHitPoint;", "", "()V", "Companion", "Params", "Value", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.c.a */
public final class ImageEditorHitPoint {

    /* renamed from: a */
    public static final Companion f148823a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J\u001c\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007J\u001c\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0007J\u001c\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\b\u0010\u0013\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/photoeditor/ve/hitpoint/ImageEditorHitPoint$Companion;", "", "()V", "LOG_TAG", "", "sendPicEditClick", "", "click", "target", "sendPicEditCropClick", "sendPicEditCropView", "sendPicEditDrawClick", "sendPicEditDrawView", "sendPicEditGraphClick", "sendPicEditGraphView", "sendPicEditMosaicClick", "sendPicEditMosaicView", "sendPicEditTextClick", "sendPicEditTextView", "sendPicEditView", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo203716a() {
            Statistics.sendEvent("public_pic_edit_view");
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo203718b() {
            Statistics.sendEvent("public_pic_edit_mosaic_view");
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo203720c() {
            Statistics.sendEvent("public_pic_edit_draw_view");
        }

        @JvmStatic
        /* renamed from: d */
        public final void mo203722d() {
            Statistics.sendEvent("public_pic_edit_text_view");
        }

        @JvmStatic
        /* renamed from: e */
        public final void mo203724e() {
            Statistics.sendEvent("public_pic_edit_crop_view");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo203717a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            try {
                JSONObject put = new JSONObject().put("click", str);
                if (str2 != null) {
                    put.put("target", str2);
                }
                Statistics.sendEvent("public_pic_edit_click", put);
            } catch (Exception e) {
                Log.m165383e("ImageEditorHitPoint", "sendPicEditClick " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo203719b(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            try {
                JSONObject put = new JSONObject().put("click", str);
                if (str2 != null) {
                    put.put("target", str2);
                }
                Statistics.sendEvent("public_pic_edit_mosaic_click", put);
            } catch (Exception e) {
                Log.m165383e("ImageEditorHitPoint", "sendPicEditMosaicClick " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo203721c(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            try {
                JSONObject put = new JSONObject().put("click", str);
                if (str2 != null) {
                    put.put("target", str2);
                }
                Statistics.sendEvent("public_pic_edit_draw_click", put);
            } catch (Exception e) {
                Log.m165383e("ImageEditorHitPoint", "sendPicEditDrawClick " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: d */
        public final void mo203723d(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            try {
                JSONObject put = new JSONObject().put("click", str);
                if (str2 != null) {
                    put.put("target", str2);
                }
                Statistics.sendEvent("public_pic_edit_text_click", put);
            } catch (Exception e) {
                Log.m165383e("ImageEditorHitPoint", "sendPicEditTextClick " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: e */
        public final void mo203725e(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "click");
            try {
                JSONObject put = new JSONObject().put("click", str);
                if (str2 != null) {
                    put.put("target", str2);
                }
                Statistics.sendEvent("public_pic_edit_crop_click", put);
            } catch (Exception e) {
                Log.m165383e("ImageEditorHitPoint", "sendPicEditCropClick " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: a */
        public static /* synthetic */ void m232164a(Companion aVar, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            aVar.mo203717a(str, str2);
        }

        @JvmStatic
        /* renamed from: b */
        public static /* synthetic */ void m232165b(Companion aVar, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            aVar.mo203719b(str, str2);
        }

        @JvmStatic
        /* renamed from: c */
        public static /* synthetic */ void m232166c(Companion aVar, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            aVar.mo203721c(str, str2);
        }

        @JvmStatic
        /* renamed from: d */
        public static /* synthetic */ void m232167d(Companion aVar, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            aVar.mo203723d(str, str2);
        }

        @JvmStatic
        /* renamed from: e */
        public static /* synthetic */ void m232168e(Companion aVar, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            aVar.mo203725e(str, str2);
        }
    }
}
