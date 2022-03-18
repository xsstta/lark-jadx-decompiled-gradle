package com.ss.android.vc.meeting.module.preview;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.service.XIGetDataCallback;
import com.ss.android.vcxp.annotation.XMethod;

class MeetingPreviewBaseModel$1 extends XIGetDataCallback<OpenChatter> {

    /* renamed from: a */
    final /* synthetic */ AbstractC62710d f157714a;

    MeetingPreviewBaseModel$1(AbstractC62710d dVar) {
        this.f157714a = dVar;
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    @XMethod
    public void onError(ErrorResult errorResult) {
        C60700b.m235851b("MeetingPreviewBaseModel", "[getLoginChatter2]", "onError: " + errorResult.toString());
    }

    @XMethod
    public void onSuccess(OpenChatter openChatter) {
        C60700b.m235851b("MeetingPreviewBaseModel", "[getLoginChatter]", "success uuid: " + C57859q.m224565a(openChatter.getId()));
        if (!TextUtils.isEmpty(openChatter.getAvatarKey())) {
            this.f157714a.f157788a.mo216513a(openChatter);
        }
    }
}
