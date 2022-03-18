package com.ss.android.lark.setting.page.content.common.impl.font.chat;

import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract;", "", "IModel", "IView", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.e */
public interface IChatFontSettingContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getLoginChatter", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.e$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo185446a(IGetDataCallback<Chatter> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView$Delegate;", "initChatterAvatar", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "initDefaultAvatar", "updateView", "zoomLevel", "Lcom/larksuite/component/ui/display/manager/ZoomLevel;", "Delegate", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.e$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/impl/font/chat/IChatFontSettingContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.font.a.e$b$a */
        public interface Delegate extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo185449a();

        /* renamed from: a */
        void mo185450a(ZoomLevel zoomLevel);

        /* renamed from: a */
        void mo185451a(Chatter chatter);
    }
}
