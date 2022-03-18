package com.ss.android.lark.profile.func.add_friend;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.biz.core.api.ContactSource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract;", "", "IModel", "IView", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.add_friend.f */
public interface IAddFriendContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\tH&J\b\u0010\u0010\u001a\u00020\tH&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "addContact", "", "reason", "", "alias", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getContactSource", "Lcom/ss/android/lark/biz/core/api/ContactSource;", "getEncryptUserId", "getInitViewData", "Lcom/ss/android/lark/profile/func/add_friend/AddFriendViewData;", "getIsHasTenantCertification", "getIsTenantCertification", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.f$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        AddFriendViewData mo179055a();

        /* renamed from: a */
        void mo179056a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        ContactSource mo179057b();

        /* renamed from: c */
        String mo179058c();

        /* renamed from: d */
        boolean mo179059d();

        /* renamed from: e */
        boolean mo179060e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fJ\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IView$IDelegate;", "addSuccess", "", "alias", "", "showErrorDialog", "content", "showInitData", "initData", "Lcom/ss/android/lark/profile/func/add_friend/AddFriendViewData;", "IDelegate", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.add_friend.f$b */
    public interface IView extends com.larksuite.framework.mvp.IView<IDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/add_friend/IAddFriendContract$IView$IDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onAddBtnClick", "", "context", "Landroid/content/Context;", "reason", "", "alias", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.profile.func.add_friend.f$b$a */
        public interface IDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo179062a(Context context, String str, String str2);
        }

        /* renamed from: a */
        void mo179065a(AddFriendViewData eVar);

        /* renamed from: a */
        void mo179067a(String str);

        /* renamed from: b */
        void mo179069b(String str);
    }
}
