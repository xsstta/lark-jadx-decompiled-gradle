package com.ss.android.lark.setting.page.content.general.wheniviewachat;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract;", "", "()V", "IModel", "IView", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.a */
public final class IWhenIViewAChatContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getMessagePosition", "Lcom/ss/android/lark/chat/entity/chat/Chat$MessagePosition;", "setMessagePosition", "", "messagePosition", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        Chat.MessagePosition mo186355a();

        /* renamed from: a */
        void mo186356a(Chat.MessagePosition messagePosition, IGetDataCallback<Chat.MessagePosition> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IView$Delegate;", "initListeners", "", "showToast", "msg", "", "updateMessagePosition", "messagePosition", "Lcom/ss/android/lark/chat/entity/chat/Chat$MessagePosition;", "Delegate", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/wheniviewachat/IWhenIViewAChatContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onToggleMessagePosition", "", "messagePosition", "Lcom/ss/android/lark/chat/entity/chat/Chat$MessagePosition;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.general.wheniviewachat.a$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo186357a(Chat.MessagePosition messagePosition);
        }

        /* renamed from: a */
        void mo186347a();

        /* renamed from: a */
        void mo186348a(Chat.MessagePosition messagePosition);

        /* renamed from: a */
        void mo186350a(String str);
    }
}
