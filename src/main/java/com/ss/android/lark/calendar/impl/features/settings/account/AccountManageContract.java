package com.ss.android.lark.calendar.impl.features.settings.account;

import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract;", "", "()V", "IAccountManageModel", "IAccountManageView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.c */
public final class AccountManageContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\nH&JH\u0010\u000b\u001a\u00020\u00032>\u0010\u0006\u001a:\u00126\u00124\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fj\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u0010`\u000f0\u0007H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageModel;", "Lcom/larksuite/framework/mvp/IModel;", "cancelGoogleCalendar", "", "account", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "loadLocalCalendarAccount", "", "loadThirdPartCalendarAccount", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/LinkedHashMap;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.c$a */
    public interface IAccountManageModel extends IModel {
        /* renamed from: a */
        Map<String, Boolean> mo118425a();

        /* renamed from: a */
        void mo118426a(IGetDataCallback<LinkedHashMap<String, ArrayList<Calendar>>> iGetDataCallback);

        @Deprecated(message = "")
        /* renamed from: a */
        void mo118427a(String str, IGetDataCallback<Boolean> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fJ\b\u0010\u0003\u001a\u00020\u0004H&J \u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0006H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView$ViewDelegate;", "getFragmentContainer", "Landroid/view/ViewGroup;", "showAccountList", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "Lkotlin/collections/ArrayList;", "showErrorToast", "resId", "", "showNoAccountNotify", "ViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.c$b */
    public interface IAccountManageView extends IView<ViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H'J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H'¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountManageContract$IAccountManageView$ViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "cancelImport", "", "title", "", "hasLocalCalendar", "", "onBackPressed", "onClickFragmentBack", "onShowImportCalendar", "onShowImportExchangeCalendar", "onShowImportLocalCalendar", "openGoogleAccountManageFragment", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "openOneAccountManageFragment", "setFragmentDelegate", "delegate", "Lcom/ss/android/lark/calendar/impl/features/settings/account/FragmentDelegate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.settings.account.c$b$a */
        public interface ViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo118431a();

            /* renamed from: a */
            void mo118432a(AccountDataListItem aVar);

            /* renamed from: b */
            void mo118433b();

            /* renamed from: c */
            void mo118434c();
        }

        /* renamed from: a */
        void mo118428a();

        /* renamed from: a */
        void mo118429a(ArrayList<AccountDataListItem> arrayList);

        /* renamed from: b */
        ViewGroup mo118430b();
    }
}
