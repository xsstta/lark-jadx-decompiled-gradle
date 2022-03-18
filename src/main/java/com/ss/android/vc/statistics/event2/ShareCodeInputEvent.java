package com.ss.android.vc.statistics.event2;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.module.sharebox.LocalShareCodeInputView2;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/statistics/event2/ShareCodeInputEvent;", "", "()V", "sendConfirmClickEvent", "", "inMeeting", "", "codeType", "Lcom/ss/android/vc/meeting/module/sharebox/LocalShareCodeInputView2$InputType;", "shareCode", "", "envId", "sendInputViewDisPlayEvent", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.ad */
public final class ShareCodeInputEvent {

    /* renamed from: a */
    public static final Lazy f160809a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C63702b.INSTANCE);

    /* renamed from: b */
    public static final Companion f160810b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/statistics/event2/ShareCodeInputEvent$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/statistics/event2/ShareCodeInputEvent;", "instance$annotations", "getInstance", "()Lcom/ss/android/vc/statistics/event2/ShareCodeInputEvent;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.ad$a */
    public static final class Companion {
        /* renamed from: a */
        public final ShareCodeInputEvent mo220238a() {
            Lazy lazy = ShareCodeInputEvent.f160809a;
            Companion aVar = ShareCodeInputEvent.f160810b;
            return (ShareCodeInputEvent) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/statistics/event2/ShareCodeInputEvent;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.ad$b */
    static final class C63702b extends Lambda implements Function0<ShareCodeInputEvent> {
        public static final C63702b INSTANCE = new C63702b();

        C63702b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ShareCodeInputEvent invoke() {
            return new ShareCodeInputEvent();
        }
    }

    /* renamed from: a */
    public final void mo220237a(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("during_meeting", String.valueOf(z));
            jSONObject.put("env_id", str);
            C63728b.m249928a("vc_share_code_input_view", jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235851b("ShareCodeInputEvent", "[sendInputViewDisPlayEvent]", "exception = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo220236a(boolean z, LocalShareCodeInputView2.InputType inputType, String str, String str2) {
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", "confirm");
            jSONObject.put("during_meeting", String.valueOf(z));
            if (inputType != null) {
                int i = C63703ae.f160811a[inputType.ordinal()];
                if (i == 1) {
                    str3 = "share_key";
                } else if (i == 2) {
                    str3 = "conf_id";
                }
                jSONObject.put("code_type", str3);
                jSONObject.put("share_code", str);
                jSONObject.put("target", "none");
                jSONObject.put("env_id", str2);
                C63728b.m249928a("vc_share_code_input_click", jSONObject, null);
            }
            str3 = "none";
            jSONObject.put("code_type", str3);
            jSONObject.put("share_code", str);
            jSONObject.put("target", "none");
            jSONObject.put("env_id", str2);
            C63728b.m249928a("vc_share_code_input_click", jSONObject, null);
        } catch (JSONException e) {
            C60700b.m235851b("ShareCodeInputEvent", "[sendConfirmClickEvent]", "exception = " + e.getMessage());
        }
    }
}
