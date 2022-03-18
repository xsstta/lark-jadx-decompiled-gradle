package com.ss.android.lark.voip.service.impl.p2913a;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;

/* renamed from: com.ss.android.lark.voip.service.impl.a.a */
public class C58005a extends BaseEvent {

    /* renamed from: a */
    private VoiceCall f142681a;

    /* renamed from: a */
    public VoiceCall mo196640a() {
        return this.f142681a;
    }

    public C58005a(VoiceCall voiceCall) {
        this.f142681a = voiceCall;
    }
}
