package com.ss.android.vc.meeting.module.searchInvite;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.vc.dto.VideoChatSearchChatterResponse;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;

class VCInviteModel$2 extends XIGetDataCallback<VideoChatSearchChatterResponse> {

    /* renamed from: a */
    final /* synthetic */ UIGetDataCallback f158463a;

    /* renamed from: b */
    final /* synthetic */ C62924d f158464b;

    @Override // com.larksuite.framework.callback.IGetDataCallback
    @XMethod
    public void onError(ErrorResult errorResult) {
        this.f158463a.onError(errorResult);
    }

    @XMethod
    public void onSuccess(VideoChatSearchChatterResponse videoChatSearchChatterResponse) {
        this.f158463a.onSuccess(videoChatSearchChatterResponse);
    }

    VCInviteModel$2(C62924d dVar, UIGetDataCallback uIGetDataCallback) {
        this.f158464b = dVar;
        this.f158463a = uIGetDataCallback;
    }
}
