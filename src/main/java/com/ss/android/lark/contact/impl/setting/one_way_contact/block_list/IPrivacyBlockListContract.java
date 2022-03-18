package com.ss.android.lark.contact.impl.setting.one_way_contact.block_list;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.impl.setting.one_way_contact.entity.BlockListInfo;
import com.ss.android.lark.contact.impl.setting.one_way_contact.entity.ExceptionUser;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract;", "", "IModel", "IView", "PageType", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IPrivacyBlockListContract {

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$PageType;", "", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface PageType {
        public static final Companion Companion = Companion.f93105a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$PageType$Companion;", "", "()V", "EMPTY", "", "ERROR", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract$PageType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f93105a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0005H&J\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\tH&J\b\u0010\u000e\u001a\u00020\u0007H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "deleteExceptionUser", "", "userId", "", UpdateKey.STATUS, "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getCurrentCursor", "getExceptionUserList", "cursor", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/entity/BlockListInfo;", "isHasMore", "updateParameter", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        String mo132470a();

        /* renamed from: a */
        void mo132471a(String str, IGetDataCallback<BlockListInfo> iGetDataCallback);

        /* renamed from: a */
        void mo132472a(String str, boolean z);

        /* renamed from: a */
        void mo132473a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        boolean mo132474b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView$Delegate;", "clearAdapter", "", "deleteExceptionUser", "userId", "", "showPage", ShareHitPoint.f121869d, "", "showToast", "success", "", "updateEmptyOrFailed", "updateErrorOrFailed", "updateExceptionUsers", "list", "", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/entity/ExceptionUser;", "Delegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/block_list/IPrivacyBlockListContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "isHasMore", "", "onItemDelete", "", "userId", "", "onReloadData", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.block_list.IPrivacyBlockListContract$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo132481a();

            /* renamed from: a */
            void mo132482a(String str);

            /* renamed from: b */
            boolean mo132483b();
        }

        /* renamed from: a */
        void mo132475a();

        /* renamed from: a */
        void mo132476a(String str);

        /* renamed from: a */
        void mo132477a(List<ExceptionUser> list);

        /* renamed from: a */
        void mo132478a(boolean z);

        /* renamed from: b */
        void mo132479b();

        /* renamed from: c */
        void mo132480c();
    }
}
