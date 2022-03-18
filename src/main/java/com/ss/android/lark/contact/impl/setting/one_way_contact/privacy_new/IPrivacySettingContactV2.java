package com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new;

import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2;", "", "IModel", "IView", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.a */
public interface IPrivacySettingContactV2 {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005H&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getBlockNumber", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getUserPhoneCheckSetting", "", "updateUserPhoneCheckSetting", "isChecked", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo132555a(IGetDataCallback<Integer> iGetDataCallback);

        /* renamed from: a */
        void mo132556a(boolean z, IGetDataCallback<UniversalUserSetting> iGetDataCallback);

        /* renamed from: a */
        boolean mo132557a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IView$Delegate;", "hideBlockView", "", "showErrorToast", "showNotificationStatus", "isChecked", "", "updateBlockView", "number", "", "Delegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/privacy_new/IPrivacySettingContactV2$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "updateUserPhoneCheckSetting", "", "isChecked", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.privacy_new.a$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo132562a(boolean z);
        }

        /* renamed from: a */
        void mo132558a();

        /* renamed from: a */
        void mo132559a(int i);

        /* renamed from: a */
        void mo132560a(boolean z);

        /* renamed from: b */
        void mo132561b();
    }
}
