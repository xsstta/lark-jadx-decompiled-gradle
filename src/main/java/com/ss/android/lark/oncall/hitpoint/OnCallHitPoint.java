package com.ss.android.lark.oncall.hitpoint;

import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0012\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u0007J\u0010\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005J\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\u0010\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/oncall/hitpoint/OnCallHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "ERROR_CODE", "", "KEY_CONTACT_ONCALL_ENTER", "", "appreciableKey", "end", "", "memberCount", "error", "getKey", "sendContactOnCallEnter", "id", "setKey", "key", "im_oncall_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.oncall.b.a */
public final class OnCallHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final OnCallHitPoint f122437a = new OnCallHitPoint();

    /* renamed from: b */
    private static String f122438b;

    private OnCallHitPoint() {
    }

    /* renamed from: b */
    public final void mo169927b(String str) {
        if (str != null) {
            f122438b = str;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m191931a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        try {
            Statistics.sendEvent("contact_oncall_enter", new JSONObject().put("oncallid", str));
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo169926b(int i) {
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(Biz.Messenger, Scene.Contact, Event.show_oncall_contacts, ErrorType.SDK, ErrorLevel.Exception, ParticipantRepo.f117150c, null, null, null, true, null, MapsKt.mapOf(TuplesKt.to("member_count", Integer.valueOf(i))), null, 5568, null));
    }

    /* renamed from: a */
    public final void mo169925a(int i) {
        if (f122438b != null) {
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            String str = f122438b;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appreciableKey");
            }
            AppreciableKit.m107396c(a, str, MapsKt.mapOf(TuplesKt.to("sdk_cost", 0), TuplesKt.to("init_view_cost", 0), TuplesKt.to("first_render", 0)), null, MapsKt.mapOf(TuplesKt.to("member_count", Integer.valueOf(i))), null, 20, null);
        }
    }
}
