package com.ss.android.lark.voip.service.impl.app;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;

/* renamed from: com.ss.android.lark.voip.service.impl.app.b */
public class C58039b extends BaseEvent {

    /* renamed from: a */
    private VoiceCall f142775a;

    /* renamed from: a */
    public VoiceCall mo196784a() {
        return this.f142775a;
    }

    public C58039b(VoiceCall voiceCall) {
        this.f142775a = voiceCall;
    }
}
