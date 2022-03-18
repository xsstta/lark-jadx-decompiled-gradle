package com.ss.android.lark.voip.service.impl.app;

import android.text.TextUtils;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;

/* renamed from: com.ss.android.lark.voip.service.impl.app.t */
public class C58133t {
    /* renamed from: a */
    public static boolean m225480a(VoiceCall voiceCall) {
        if (voiceCall != null && TextUtils.equals(C57977a.m224905c().getUserId(), voiceCall.getFromUserId())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m225481b(VoiceCall voiceCall) {
        if (voiceCall == null) {
            return false;
        }
        VoiceCall.Status status = voiceCall.getStatus();
        if (status == VoiceCall.Status.CALLING || status == VoiceCall.Status.RINGING || status == VoiceCall.Status.ON_THE_CALL || status == VoiceCall.Status.ACCEPTED) {
            return true;
        }
        return false;
    }
}
