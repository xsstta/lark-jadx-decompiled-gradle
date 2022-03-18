package com.ss.android.lark.contact.impl.setting.one_way_contact.permission;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract;", "", "IModel", "IView", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.e */
public interface IChatPermissionContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getCoordinationAuth", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "setCoordinationAuth", ShareHitPoint.f121869d, "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.e$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo132538a(int i, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo132539a(IGetDataCallback<Integer> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bJ\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView$Delegate;", "showSetToast", "", "updateCoordinationAuth", "coordinationType", "", "Delegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.e$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onCoordinationSelect", "", "coordinationType", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.e$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo132541a(int i);
        }

        /* renamed from: a */
        void mo132545a(int i);

        /* renamed from: b */
        void mo132547b();
    }
}
