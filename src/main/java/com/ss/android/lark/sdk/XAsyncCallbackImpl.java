package com.ss.android.lark.sdk;

import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;

@XClass(autoRelease = true, runOnProcess = XProcess.Original)
public class XAsyncCallbackImpl<T> extends SdkSender.C53230a<T> {
    @Override // com.ss.android.lark.sdk.SdkSender.C53230a, com.bytedance.lark.sdk.AbstractC19831c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo67179a() {
        return super.mo67179a();
    }

    @Override // com.ss.android.lark.sdk.SdkSender.C53230a, com.bytedance.lark.sdk.AbstractC19831c
    @XMethod
    public void AsyncCallback(boolean z, byte[] bArr) {
        super.AsyncCallback(z, bArr);
    }

    public XAsyncCallbackImpl(Object obj, SdkSender.IParser iParser, IGetDataCallback<T> iGetDataCallback, String str, boolean z) {
        super((Command) obj, iParser, iGetDataCallback, str, z);
    }
}
