package com.ss.android.lark.integrator.im.dependency;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.dependency.ap;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.vc.api.IVCApi;

/* renamed from: com.ss.android.lark.integrator.im.dependency.i */
public class C39567i implements ap {

    /* renamed from: a */
    final IVCApi f101042a = ((IVCApi) ApiUtils.getApi(IVCApi.class));

    @Override // com.ss.android.lark.dependency.ap
    /* renamed from: a */
    public void mo134477a() {
        this.f101042a.dismissLoadingDialog();
    }

    @Override // com.ss.android.lark.dependency.ap
    /* renamed from: a */
    public Content mo134475a(com.bytedance.lark.pb.basic.v1.Content content) {
        return this.f101042a.parseVideoChatContent(content);
    }

    @Override // com.ss.android.lark.dependency.ap
    /* renamed from: a */
    public String mo134476a(Message message) {
        return this.f101042a.getVideoChatCardReplyDigest(message);
    }

    @Override // com.ss.android.lark.dependency.ap
    /* renamed from: a */
    public boolean mo134478a(ContentVO aVar) {
        return this.f101042a.isMeetingCard(aVar);
    }
}
