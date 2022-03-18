package com.ss.android.lark.oncall.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.oncall.entity.OnCallTag;
import com.ss.android.lark.oncall.service.dto.PullOnCallsResponse;
import java.util.List;

/* renamed from: com.ss.android.lark.oncall.service.a */
public interface AbstractC48711a {
    /* renamed from: a */
    List<OnCall> mo169952a(int i, int i2);

    /* renamed from: a */
    void mo169953a(int i, int i2, IGetDataCallback<PullOnCallsResponse> iGetDataCallback);

    /* renamed from: a */
    void mo169954a(IGetDataCallback<List<OnCallTag>> iGetDataCallback);

    /* renamed from: a */
    void mo169955a(String str, int i, int i2, IGetDataCallback<PullOnCallsResponse> iGetDataCallback);

    /* renamed from: a */
    void mo169956a(String str, String str2, IGetDataCallback<String> iGetDataCallback);
}
