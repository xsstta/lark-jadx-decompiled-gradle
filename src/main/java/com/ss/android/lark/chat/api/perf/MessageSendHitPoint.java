package com.ss.android.lark.chat.api.perf;

import android.os.SystemClock;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rXD¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/api/perf/MessageSendHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "EVENT_PERF_SEND_MSG", "", "KEY_MSG_LENGTH", "KEY_MSG_TYPE", "KEY_SEND_DIFF_TIME", "KEY_SEND_END_TIME", "KEY_SEND_START_TIME", "KEY_SEND_STATE", "VALUE_SEND_STATE_FAIL", "", "VALUE_SEND_STATE_SUCCESS", "computeEndTime", "", "innerSend", "sendMessageFail", "sendMessageSuccess", "startSendMessage", "messageType", "messageLength", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.c.a */
public final class MessageSendHitPoint extends BaseHitPoint {

    /* renamed from: a */
    private final String f84236a = "perf_send_msg";

    /* renamed from: b */
    private final String f84237b = "send_start_time";

    /* renamed from: c */
    private final String f84238c = "send_end_time";

    /* renamed from: d */
    private final String f84239d = "send_diff_time";

    /* renamed from: e */
    private final String f84240e = "send_state";

    /* renamed from: f */
    private final String f84241f = "msg_type";

    /* renamed from: g */
    private final String f84242g = "msg_length";

    /* renamed from: h */
    private final int f84243h = 1;

    /* renamed from: i */
    private final int f84244i = 2;

    /* renamed from: a */
    public final void mo120981a() {
        if (mo187340B().get(this.f84237b) != null) {
            mo187340B().put(this.f84240e, Integer.valueOf(this.f84243h));
            m125942c();
        }
    }

    /* renamed from: b */
    public final void mo120983b() {
        if (mo187340B().get(this.f84237b) != null) {
            mo187340B().put(this.f84240e, Integer.valueOf(this.f84244i));
            m125942c();
        }
    }

    /* renamed from: c */
    private final void m125942c() {
        if (mo187340B().get(this.f84237b) != null) {
            Object obj = mo187340B().get(this.f84237b);
            if (obj != null) {
                long longValue = ((Long) obj).longValue();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                mo187340B().put(this.f84238c, Long.valueOf(elapsedRealtime));
                mo187340B().put(this.f84239d, Long.valueOf(elapsedRealtime - longValue));
                m125943d();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
        }
    }

    /* renamed from: d */
    private final void m125943d() {
        Statistics.sendEvent("perf_send_msg", new JSONObject().put(this.f84237b, mo187340B().get(this.f84237b)).put(this.f84238c, mo187340B().get(this.f84238c)).put(this.f84239d, mo187340B().get(this.f84239d)).put(this.f84240e, mo187340B().get(this.f84240e)).put(this.f84241f, mo187340B().get(this.f84241f)).put(this.f84242g, mo187340B().get(this.f84242g)));
    }

    /* renamed from: a */
    public final void mo120982a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "messageType");
        mo187340B().put(this.f84237b, Long.valueOf(SystemClock.elapsedRealtime()));
        mo187340B().put(this.f84241f, str);
        mo187340B().put(this.f84242g, Long.valueOf(j));
    }
}
