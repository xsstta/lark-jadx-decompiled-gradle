package com.ss.android.lark.calendar.impl.features.settings.oneaccount;

import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\fH&J\b\u0010\u0017\u001a\u00020\fH&J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/IOneAccountManageViewModel;", "", "cancelExchangeLiveData", "Landroidx/lifecycle/LiveData;", "", "getCancelExchangeLiveData", "()Landroidx/lifecycle/LiveData;", "cancelGoogleLiveData", "getCancelGoogleLiveData", "switchAccountLiveData", "getSwitchAccountLiveData", "destroy", "", "getAccountTitle", "", "isAccountSwitchOpen", "isExchangeAccount", "isExternalPasswordInvalid", "isGoogleAccount", "onAccountDataChange", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onCancelExchangeCalendar", "onCancelGoogleCalendar", "onToggleAccountSwitch", "isVisible", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.b.a */
public interface IOneAccountManageViewModel {
    String getAccountTitle();

    LiveData<Boolean> getCancelExchangeLiveData();

    LiveData<Boolean> getCancelGoogleLiveData();

    LiveData<Boolean> getSwitchAccountLiveData();

    boolean isAccountSwitchOpen();

    boolean isExchangeAccount();

    boolean isExternalPasswordInvalid();

    boolean isGoogleAccount();

    void onAccountDataChange(AccountDataListItem aVar);

    void onCancelExchangeCalendar();

    void onCancelGoogleCalendar();

    void onToggleAccountSwitch(boolean z);
}
