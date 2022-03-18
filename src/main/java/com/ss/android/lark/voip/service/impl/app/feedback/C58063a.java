package com.ss.android.lark.voip.service.impl.app.feedback;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceFeedbacksRequest;
import com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceFeedbacksResponse;
import com.ss.android.lark.pb.videoconference.v1.E2EEVoiceFeedback;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.p2915c.C58145b;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import com.ss.android.lark.voip.service.impl.service.VoiceCallFeedback;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.statistics.p3182c.C63724a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.voip.service.impl.app.feedback.a */
public class C58063a {

    /* renamed from: a */
    public static boolean f142821a;

    /* renamed from: b */
    private static C58063a f142822b;

    /* renamed from: a */
    public static C58063a m225219a() {
        C58063a aVar;
        synchronized ("VoipFeedbackDialog") {
            if (f142822b == null) {
                f142822b = new C58063a();
            }
            aVar = f142822b;
        }
        return aVar;
    }

    /* renamed from: a */
    private E2EEVoiceFeedback.NetworkType m225218a(Context context) {
        String a = C63724a.m249903a(context);
        a.hashCode();
        char c = 65535;
        switch (a.hashCode()) {
            case -1006804125:
                if (a.equals("others")) {
                    c = 0;
                    break;
                }
                break;
            case 1684:
                if (a.equals("3g")) {
                    c = 1;
                    break;
                }
                break;
            case 1715:
                if (a.equals("4g")) {
                    c = 2;
                    break;
                }
                break;
            case 3649301:
                if (a.equals("wifi")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return E2EEVoiceFeedback.NetworkType.OTHERTYPE;
            case 1:
                return E2EEVoiceFeedback.NetworkType.G3;
            case 2:
                return E2EEVoiceFeedback.NetworkType.G4;
            case 3:
                return E2EEVoiceFeedback.NetworkType.WIFI;
            default:
                return E2EEVoiceFeedback.NetworkType.OTHERTYPE;
        }
    }

    /* renamed from: a */
    public void mo196839a(Context context, VoiceCall voiceCall) {
        C60700b.m235851b("VoipFeedbackDialog", "[show]", "VoipFeedbackDialog show");
        Intent intent = new Intent(context, VoIpFeedbackActivity.class);
        intent.putExtra("voipCallInfo", voiceCall);
        if (context != null) {
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    private void m225220a(Context context, Map<String, VoiceCallFeedback> map) {
        String str;
        C58151d.m225578a("ui", "rust", "send feedback", "[VoIpCallService] putE2EEVoiceFeedback");
        CreateE2EEVoiceFeedbacksRequest.C50517a aVar = new CreateE2EEVoiceFeedbacksRequest.C50517a();
        HashMap hashMap = new HashMap();
        C58145b b = C58103o.m225371a().mo196950g().mo197052b();
        if (b != null) {
            str = b.mo197042b();
            Log.m165379d("VoipFeedbackDialog", "[putE2EEVoiceFeedback] sdk version = " + str);
        } else {
            str = "";
        }
        for (Map.Entry<String, VoiceCallFeedback> entry : map.entrySet()) {
            VoiceCallFeedback value = entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (VoiceCallFeedback.Tag tag : value.getTags()) {
                arrayList.add(E2EEVoiceFeedback.Tag.fromValue(tag.getNumber()));
            }
            E2EEVoiceFeedback.C50535a aVar2 = new E2EEVoiceFeedback.C50535a();
            aVar2.mo175008a(value.getComment()).mo175006a(E2EEVoiceFeedback.Evaluation.fromValue(value.getEvaluation().getNumber())).mo175009a(arrayList).mo175012c(C26246a.m94977a(context)).mo175011b(str).mo175013d(Build.MANUFACTURER).mo175014e(Build.MODEL).mo175015f(C26284k.m95187c(context)).mo175007a(m225218a(context)).mo175016g("byteRTC");
            hashMap.put(entry.getKey(), aVar2.build());
        }
        aVar.mo174957a(hashMap);
        SdkSender.asynSendRequestNonWrap(Command.CREATE_E2EE_VOICE_FEEDBACKS, aVar, new IGetDataCallback<CreateE2EEVoiceFeedbacksResponse>() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.C58063a.C580641 */

            /* renamed from: a */
            public void onSuccess(CreateE2EEVoiceFeedbacksResponse createE2EEVoiceFeedbacksResponse) {
                Log.m165389i("VoipFeedbackDialog", "[submitVoipFeedback] success " + createE2EEVoiceFeedbacksResponse.toString());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("VoipFeedbackDialog", "[submitVoipFeedback] error " + errorResult.toString());
            }
        }, new SdkSender.IParser() {
            /* class com.ss.android.lark.voip.service.impl.app.feedback.C58063a.C580652 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                int i;
                StringBuilder sb = new StringBuilder();
                sb.append("[VoIpCallService] putE2EEVoiceFeedback: parse data size = ");
                if (bArr != null) {
                    i = bArr.length;
                } else {
                    i = 0;
                }
                sb.append(i);
                C58151d.m225578a("rust", "ui", "send feedback success", sb.toString());
                return CreateE2EEVoiceFeedbacksResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo196840a(Context context, VoiceCall voiceCall, VoiceCallFeedback voiceCallFeedback) {
        C58151d.m225578a("ui", "ui", "send feedback", "[VoIpCallModel] sendVoiceCallFeedback: feedback = " + voiceCallFeedback + ", callInfo = " + voiceCall);
        if (voiceCall != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(voiceCall.getId(), voiceCallFeedback);
            m225220a(context, hashMap);
        }
    }
}
