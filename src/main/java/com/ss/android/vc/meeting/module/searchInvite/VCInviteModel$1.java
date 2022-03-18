package com.ss.android.vc.meeting.module.searchInvite;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.vc.dto.VideoChatSearchChatterResponse;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;

class VCInviteModel$1 extends XIGetDataCallback<VideoChatSearchChatterResponse> {

    /* renamed from: a */
    final /* synthetic */ UIGetDataCallback f158461a;

    /* renamed from: b */
    final /* synthetic */ C62924d f158462b;

    @Override // com.larksuite.framework.callback.IGetDataCallback
    @XMethod
    public void onError(ErrorResult errorResult) {
        this.f158461a.onError(errorResult);
    }

    @XMethod
    public void onSuccess(VideoChatSearchChatterResponse videoChatSearchChatterResponse) {
        this.f158461a.onSuccess(videoChatSearchChatterResponse);
    }

    VCInviteModel$1(C62924d dVar, UIGetDataCallback uIGetDataCallback) {
        this.f158462b = dVar;
        this.f158461a = uIGetDataCallback;
    }
}
