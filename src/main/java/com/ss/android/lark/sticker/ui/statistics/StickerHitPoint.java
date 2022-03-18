package com.ss.android.lark.sticker.ui.statistics;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/sticker/ui/statistics/StickerHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "Companion", "im_sticker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.sticker.ui.statistics.a */
public final class StickerHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final Companion f136296a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u001e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/sticker/ui/statistics/StickerHitPoint$Companion;", "", "()V", "NUM_OF_STICKERPACK", "", "NUM_OF_STICKERS", "STICKER_FORWARD_LOCAITON", "STICKER_SET_ADD_LOCATION", "STICKER_SET_ID", "STICKER_SET_MANAGER_ENTRY", "sendStickerAdd", "", "sendStickerDelete", "sendStickerSetAdd", "stickerSetAddLocation", "stickerSetId", "numSticker", "", "sendStickerSetDelete", "numStickerPack", "sendStickerSetManagerEntry", "location", "sendStickerSetReorder", "sendStickerSetReorderSave", "sendStickerSetSetShare", "sendStickerSetUse", "sendStickerShare", "im_sticker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.sticker.ui.statistics.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final void mo188229a() {
            Statistics.sendEvent("sticker_add");
        }

        /* renamed from: b */
        public final void mo188233b() {
            Statistics.sendEvent("sticker_delete");
        }

        /* renamed from: c */
        public final void mo188235c() {
            Statistics.sendEvent("stickerpack_forward");
        }

        /* renamed from: d */
        public final void mo188236d() {
            Statistics.sendEvent("stickerpack_use");
        }

        /* renamed from: e */
        public final void mo188237e() {
            Statistics.sendEvent("stickerpack_reorder");
        }

        /* renamed from: f */
        public final void mo188238f() {
            Statistics.sendEvent("stickerpack_reorder_save");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo188230a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            try {
                Statistics.sendEvent("stickerpack_manage", new JSONObject().put("stickerpack_manage_location", str));
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }

        /* renamed from: b */
        public final void mo188234b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "location");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stickerpack_stickerforward_location", str);
                Statistics.sendEvent("stickerpack_stickerforward", jSONObject);
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo188231a(String str, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "stickerSetId");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("stickerpack_id", str);
                jSONObject.put("num_of_stickerpack", i);
                jSONObject.put("num_of_stickers", i2);
                Statistics.sendEvent("stickerpack_delete", jSONObject);
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }

        /* renamed from: a */
        public final void mo188232a(String str, String str2, int i) {
            Intrinsics.checkParameterIsNotNull(str, "stickerSetAddLocation");
            Intrinsics.checkParameterIsNotNull(str2, "stickerSetId");
            try {
                Statistics.sendEvent("stickerpack_add", new JSONObject().put("stickerpack_add_location", str).put("stickerpack_id", str2).put("num_of_stickers", i));
            } catch (Throwable th) {
                Log.m165382e(th.getMessage());
            }
        }
    }
}
