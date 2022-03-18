package com.ss.android.vc.statistics.event2;

import android.util.Log;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.statistics.p3183d.C63728b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/vc/statistics/event2/MediaDeviceWarningEvent;", "", "()V", "TAG", "", "sendHowlingDialogActionEvent", "", "ignore", "", "sendHowlingDialogShowEvent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.d */
public final class MediaDeviceWarningEvent {

    /* renamed from: a */
    public static final MediaDeviceWarningEvent f160825a = new MediaDeviceWarningEvent();

    private MediaDeviceWarningEvent() {
    }

    /* renamed from: a */
    public final void mo220260a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", "recommend_mute");
            C63728b.m249928a("vc_meeting_popup_view", jSONObject, null);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception = ");
            String stackTraceString = Log.getStackTraceString(e);
            Intrinsics.checkExpressionValueIsNotNull(stackTraceString, "Log.getStackTraceString(this)");
            sb.append(stackTraceString);
            C60700b.m235851b("MediaDeviceWarningEvent", "[sendHowlingDialogShowEvent]", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo220261a(boolean z) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", "recommend_mute");
            if (z) {
                str = "ignore";
            } else if (!z) {
                str = "mute";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            jSONObject.put("click", str);
            C63728b.m249928a("vc_meeting_popup_click", jSONObject, null);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception = ");
            String stackTraceString = Log.getStackTraceString(e);
            Intrinsics.checkExpressionValueIsNotNull(stackTraceString, "Log.getStackTraceString(this)");
            sb.append(stackTraceString);
            C60700b.m235851b("MediaDeviceWarningEvent", "[sendHowlingDialogShowEvent2]", sb.toString());
        }
    }
}
