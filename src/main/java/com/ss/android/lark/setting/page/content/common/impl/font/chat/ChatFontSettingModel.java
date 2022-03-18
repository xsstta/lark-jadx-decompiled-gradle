package com.ss.android.lark.setting.page.content.common.impl.font.chat;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.content.common.impl.font.chat.IChatFontSettingContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/ChatFontSettingModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IModel;", "()V", "getLoginChatter", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.b */
public final class ChatFontSettingModel extends BaseModel implements IChatFontSettingContract.IModel {
    @Override // com.ss.android.lark.setting.page.content.common.impl.font.chat.IChatFontSettingContract.IModel
    /* renamed from: a */
    public void mo185446a(IGetDataCallback<Chatter> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C54115c.m210080a().mo178293f().mo178323a(iGetDataCallback);
    }
}
