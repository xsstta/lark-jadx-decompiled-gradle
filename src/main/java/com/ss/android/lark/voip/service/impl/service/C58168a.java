package com.ss.android.lark.voip.service.impl.service;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.suite.R;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.pb.videoconference.v1.E2EEVoiceCall;
import com.ss.android.lark.pb.videoconference.v1.UpdateE2EEVoiceCallRequest;
import com.ss.android.lark.pb.videoconference.v1.UpdateE2EEVoiceCallResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.p2912b.C58000a;
import com.ss.android.lark.voip.service.impl.app.AbstractC58046e;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.app.C58133t;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;

/* renamed from: com.ss.android.lark.voip.service.impl.service.a */
public class C58168a implements IAccountInterceptor {

    /* renamed from: a */
    private Context f143085a = C57977a.m224905c().getContext();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.voip.service.impl.service.a$a */
    public static final class C58169a {

        /* renamed from: a */
        public static final C58168a f143086a = new C58168a();
    }

    /* renamed from: e */
    public int mo197126e() {
        return 0;
    }

    /* renamed from: a */
    public static C58168a m225700a() {
        return C58169a.f143086a;
    }

    /* renamed from: d */
    public int mo197125d() {
        m225701f();
        C58103o.m225371a().mo196942b("onAccountChange");
        return 1;
    }

    /* renamed from: b */
    public boolean mo197123b() {
        VoiceCall a;
        AbstractC58046e f = C58103o.m225371a().mo196949f();
        if (f == null || (a = f.mo196802a()) == null || !C58133t.m225481b(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public C58000a mo197124c() {
        Context context = this.f143085a;
        return new C58000a(null, context.getString(R.string.Lark_View_LeaveCallIfSwitchInfo), context.getString(R.string.View_G_LeaveAndLogOut), context.getString(R.string.View_G_CancelButton));
    }

    /* renamed from: f */
    private void m225701f() {
        VoiceCall a;
        VoiceCall.Status status;
        AbstractC58046e f = C58103o.m225371a().mo196949f();
        if (f != null && (a = f.mo196802a()) != null) {
            UpdateE2EEVoiceCallRequest.C51126a aVar = new UpdateE2EEVoiceCallRequest.C51126a();
            if (a.getStatus() == VoiceCall.Status.ON_THE_CALL) {
                status = VoiceCall.Status.TERMINATED;
            } else if (C58133t.m225480a(a)) {
                status = VoiceCall.Status.CANCELLED;
            } else {
                status = VoiceCall.Status.REFUSED;
            }
            aVar.mo176415a(a.getId()).mo176412a(E2EEVoiceCall.Status.fromValue(status.getNumber()));
            Command command = Command.UPDATE_E2EE_VOICE_CALL;
            ProtoAdapter<UpdateE2EEVoiceCallResponse> protoAdapter = UpdateE2EEVoiceCallResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.syncSend(command, aVar, new SdkSender.IParser() {
                /* class com.ss.android.lark.voip.service.impl.service.$$Lambda$nunwaoTXhhLcpOKptmxmoZVynPM */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (UpdateE2EEVoiceCallResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        }
    }
}
