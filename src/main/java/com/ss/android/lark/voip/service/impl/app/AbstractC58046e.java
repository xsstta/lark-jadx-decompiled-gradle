package com.ss.android.lark.voip.service.impl.app;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;

/* renamed from: com.ss.android.lark.voip.service.impl.app.e */
public interface AbstractC58046e {
    /* renamed from: a */
    VoiceCall mo196802a();

    /* renamed from: a */
    void mo196803a(VoiceCall voiceCall, VoiceCall.Status status, IGetDataCallback<String> iGetDataCallback, boolean z);

    /* renamed from: a */
    void mo196804a(String str);

    /* renamed from: a */
    void mo196805a(String str, IGetDataCallback iGetDataCallback);

    /* renamed from: a */
    void mo196806a(String str, String str2, String str3, IGetDataCallback<VoiceCall> iGetDataCallback);

    /* renamed from: a */
    void mo196807a(boolean z);

    /* renamed from: b */
    void mo196808b(String str, IGetDataCallback iGetDataCallback);

    /* renamed from: b */
    void mo196809b(boolean z);

    /* renamed from: b */
    boolean mo196810b();

    /* renamed from: c */
    void mo196811c();
}
