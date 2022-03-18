package com.ss.android.lark.voip.service.impl.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.voip.service.impl.service.VoiceCall;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.voip.service.impl.service.c */
public interface AbstractC58173c {
    /* renamed from: a */
    void mo197130a(IGetDataCallback<List<VoiceCall>> iGetDataCallback);

    /* renamed from: a */
    void mo197131a(String str, IGetDataCallback iGetDataCallback);

    /* renamed from: a */
    void mo197132a(String str, String str2, Map<String, String> map);

    /* renamed from: a */
    void mo197133a(String str, String str2, byte[] bArr, IGetDataCallback<VoiceCall> iGetDataCallback);

    /* renamed from: a */
    void mo197134a(String str, byte[] bArr, VoiceCall.Status status, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: b */
    void mo197135b(String str, IGetDataCallback<Boolean> iGetDataCallback);
}
