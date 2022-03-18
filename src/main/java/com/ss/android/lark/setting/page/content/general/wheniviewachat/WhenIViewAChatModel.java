package com.ss.android.lark.setting.page.content.general.wheniviewachat;

import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.page.content.general.wheniviewachat.IWhenIViewAChatContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IModel;", "()V", "appConfigDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$IAppConfigDependency;", "getMessagePosition", "Lcom/ss/android/lark/chat/entity/chat/Chat$MessagePosition;", "setMessagePosition", "", "messagePosition", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.b */
public final class WhenIViewAChatModel extends BaseModel implements IWhenIViewAChatContract.IModel {

    /* renamed from: a */
    private final ISettingDependency.IAppConfigDependency f134816a = C54115c.m210080a().mo178305q();

    @Override // com.ss.android.lark.setting.page.content.general.wheniviewachat.IWhenIViewAChatContract.IModel
    /* renamed from: a */
    public Chat.MessagePosition mo186355a() {
        Long l = this.f134816a.mo178316a("GLOBALLY_ENTER_CHAT_POSITION").int_value;
        if (l == null) {
            return Chat.MessagePosition.RECENT_LEFT;
        }
        Chat.MessagePosition forNumber = Chat.MessagePosition.forNumber((int) l.longValue());
        Intrinsics.checkExpressionValueIsNotNull(forNumber, "Chat.MessagePosition.forNumber(position.toInt())");
        return forNumber;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/wheniviewachat/WhenIViewAChatModel$setMessagePosition$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "universalUserSetting", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.b$a */
    public static final class C54530a implements IGetDataCallback<UniversalUserSetting> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f134817a;

        C54530a(IGetDataCallback iGetDataCallback) {
            this.f134817a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f134817a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(UniversalUserSetting universalUserSetting) {
            Chat.MessagePosition messagePosition;
            Intrinsics.checkParameterIsNotNull(universalUserSetting, "universalUserSetting");
            Long l = universalUserSetting.int_value;
            IGetDataCallback iGetDataCallback = this.f134817a;
            if (l != null) {
                messagePosition = Chat.MessagePosition.forNumber((int) l.longValue());
            } else {
                messagePosition = Chat.MessagePosition.RECENT_LEFT;
            }
            iGetDataCallback.onSuccess(messagePosition);
        }
    }

    @Override // com.ss.android.lark.setting.page.content.general.wheniviewachat.IWhenIViewAChatContract.IModel
    /* renamed from: a */
    public void mo186356a(Chat.MessagePosition messagePosition, IGetDataCallback<Chat.MessagePosition> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(messagePosition, "messagePosition");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f134816a.mo178317a("GLOBALLY_ENTER_CHAT_POSITION", (long) messagePosition.getNumber(), getCallbackManager().wrapAndAddGetDataCallback(new C54530a(iGetDataCallback)));
    }
}
