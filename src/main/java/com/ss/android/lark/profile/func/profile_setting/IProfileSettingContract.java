package com.ss.android.lark.profile.func.profile_setting;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract;", "", "IModel", "IView", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.profile_setting.a */
public interface IProfileSettingContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0006H&J\u001e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "deleteUser", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getCurrentUserId", "", "getReportUrl", "getSettingInitViewData", "Lcom/ss/android/lark/profile/func/profile_setting/InitViewData;", "isBlocked", "isDeleted", "setBlockStatus", "setDeleted", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.a$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        String mo179422a();

        /* renamed from: a */
        void mo179423a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo179424a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        boolean mo179425b();

        /* renamed from: c */
        boolean mo179426c();

        /* renamed from: d */
        void mo179427d();

        /* renamed from: e */
        String mo179428e();

        /* renamed from: f */
        InitViewData mo179429f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IView$IDelegate;", "deleteUserSuccess", "", "openPhoneQueryAmountEditPage", "userId", "", "openUrl", "url", "resetBlock", "isBlocked", "", "showInitData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/profile/func/profile_setting/InitViewData;", "showToast", "msg", "IDelegate", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.profile_setting.a$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/profile_setting/IProfileSettingContract$IView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onBlockItemClick", "", "isBlocked", "", "onDeleteContactClick", "onPhoneCallTimeSettingItemClick", "onReportItemClick", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.profile_setting.a$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo179436a();

            /* renamed from: a */
            void mo179437a(boolean z);

            /* renamed from: b */
            void mo179438b();

            /* renamed from: c */
            void mo179439c();
        }

        /* renamed from: a */
        void mo179430a();

        /* renamed from: a */
        void mo179431a(InitViewData bVar);

        /* renamed from: a */
        void mo179432a(String str);

        /* renamed from: a */
        void mo179433a(boolean z);

        /* renamed from: b */
        void mo179434b(String str);

        /* renamed from: c */
        void mo179435c(String str);
    }
}
