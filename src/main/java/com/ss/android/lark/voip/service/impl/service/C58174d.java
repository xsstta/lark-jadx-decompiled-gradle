package com.ss.android.lark.voip.service.impl.service;

import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.pb.videoconference.v1.E2EEVoiceCall;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.voip.service.impl.service.d */
public class C58174d {
    /* renamed from: a */
    public static List<VoiceCall> m225718a(List<E2EEVoiceCall> list) {
        return C26249aa.m94984a(list, new C26249aa.AbstractC26250a<E2EEVoiceCall, VoiceCall>() {
            /* class com.ss.android.lark.voip.service.impl.service.C58174d.C581751 */

            /* renamed from: a */
            public VoiceCall get(E2EEVoiceCall e2EEVoiceCall) {
                return C58174d.m225717a(e2EEVoiceCall);
            }
        });
    }

    /* renamed from: a */
    public static VoiceCall m225717a(E2EEVoiceCall e2EEVoiceCall) {
        String str;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        if (e2EEVoiceCall == null) {
            C58151d.m225579b("ui", "ui", "parse pb info fail", "[ModelParserVoipCall] parseE2EEVoiceCallFromPb: pbE2EEVoiceCall is null");
            return null;
        }
        boolean z2 = false;
        byte[] bArr3 = new byte[0];
        VoiceCall voiceCall = new VoiceCall();
        voiceCall.setCreateTime(e2EEVoiceCall.create_time.longValue());
        voiceCall.setId(e2EEVoiceCall.id);
        voiceCall.setFromUserId(e2EEVoiceCall.from_user_id);
        voiceCall.setToUserId(e2EEVoiceCall.to_user_id);
        String str2 = "";
        if (e2EEVoiceCall.extra == null) {
            str = str2;
        } else {
            str = e2EEVoiceCall.extra.channel_key;
        }
        voiceCall.setChannelKey(str);
        if (e2EEVoiceCall.extra == null || e2EEVoiceCall.extra.public_key == null) {
            bArr = bArr3;
        } else {
            bArr = e2EEVoiceCall.extra.public_key.toByteArray();
        }
        voiceCall.setPublicKey(bArr);
        if (e2EEVoiceCall.extra == null || e2EEVoiceCall.extra.random_1 == null) {
            bArr2 = bArr3;
        } else {
            bArr2 = e2EEVoiceCall.extra.random_1.toByteArray();
        }
        voiceCall.setRandom1(bArr2);
        if (!(e2EEVoiceCall.extra == null || e2EEVoiceCall.extra.random_2 == null)) {
            bArr3 = e2EEVoiceCall.extra.random_2.toByteArray();
        }
        voiceCall.setRandom2(bArr3);
        if (e2EEVoiceCall.extra == null) {
            z = false;
        } else {
            z = e2EEVoiceCall.extra.use_bytedance_channel.booleanValue();
        }
        voiceCall.setUseByteDanceChannel(z);
        if (e2EEVoiceCall.extra != null) {
            str2 = e2EEVoiceCall.extra.bytedance_channel_key;
        }
        voiceCall.setByteDanceChannelKey(str2);
        if (e2EEVoiceCall.extra != null) {
            z2 = e2EEVoiceCall.extra.is_encrypted.booleanValue();
        }
        voiceCall.setIsEncrpted(z2);
        voiceCall.setStatus(VoiceCall.Status.forNumber(e2EEVoiceCall.status.getValue()));
        voiceCall.setActionStartTime(e2EEVoiceCall.action_start_time.longValue());
        return voiceCall;
    }
}
