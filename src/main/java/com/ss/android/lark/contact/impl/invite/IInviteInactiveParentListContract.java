package com.ss.android.lark.contact.impl.invite;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.dto.GetInactiveParentsResponse;
import com.ss.android.lark.contact.entity.InactiveParent;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract;", "", "IModel", "IView", "PageType", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IInviteInactiveParentListContract {

    @Target({ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$PageType;", "", "Companion", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface PageType {
        public static final Companion Companion = Companion.f92924a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$PageType$Companion;", "", "()V", "EMPTY", "", "ERROR", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract$PageType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f92924a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J>\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH&J\b\u0010\u000e\u001a\u00020\u000fH&J,\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH&J4\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH&J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IModel;", "Lcom/larksuite/framework/mvp/IModel;", "getCurrentCursor", "", "getInactiveParentList", "", "departmentId", "", "chatId", "limit", "offset", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/contact/dto/GetInactiveParentsResponse;", "isHasMore", "", "notifyAll", "notifySingle", "id", "updateParameter", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract$a */
    public interface IModel extends com.larksuite.framework.mvp.IModel {
        /* renamed from: a */
        void mo132241a(int i, boolean z);

        /* renamed from: a */
        void mo132242a(String str, String str2, int i, int i2, IGetDataCallback<GetInactiveParentsResponse> iGetDataCallback);

        /* renamed from: a */
        void mo132243a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo132244a(String str, String str2, String str3, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        boolean mo132245a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH&J\u001e\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\nH&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView$Delegate;", "clearAdapter", "", "showPage", ShareHitPoint.f121869d, "", "showToast", "success", "", "updateEmptyOrFailed", "isFirst", "updateErrorOrFailed", "updateInactiveParents", "list", "", "Lcom/ss/android/lark/contact/entity/InactiveParent;", "Delegate", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract$b */
    public interface IView extends com.larksuite.framework.mvp.IView<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/contact/impl/invite/IInviteInactiveParentListContract$IView$Delegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "isHasMore", "", "onLoadMore", "", "onNotifyAll", "departmentId", "", "chatId", "onNotifySingle", "id", "onReloadData", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.contact.impl.invite.IInviteInactiveParentListContract$b$a */
        public interface Delegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo132250a();

            /* renamed from: a */
            void mo132251a(String str);

            /* renamed from: a */
            void mo132252a(String str, String str2);

            /* renamed from: b */
            boolean mo132253b();

            /* renamed from: c */
            void mo132254c();
        }

        /* renamed from: a */
        void mo132246a(List<InactiveParent> list, boolean z);

        /* renamed from: a */
        void mo132247a(boolean z);

        /* renamed from: b */
        void mo132248b(boolean z);

        /* renamed from: c */
        void mo132249c(boolean z);
    }
}
