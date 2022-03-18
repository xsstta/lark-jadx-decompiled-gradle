package com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget;

import androidx.lifecycle.LiveData;
import com.ss.android.lark.pb.calendars.BindingExchangeAccountResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH&J\b\u0010\u0010\u001a\u00020\u000bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/IExchangeLoginViewModel;", "", "loginResultLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/ss/android/lark/pb/calendars/BindingExchangeAccountResponse$State;", "getLoginResultLiveData", "()Landroidx/lifecycle/LiveData;", "serverHelperLinkLiveData", "", "getServerHelperLinkLiveData", "destroy", "", "onExecuteLogin", "account", "password", "url", "onLoadServerHelperLink", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.d */
public interface IExchangeLoginViewModel {
    void destroy();

    LiveData<BindingExchangeAccountResponse.State> getLoginResultLiveData();

    LiveData<String> getServerHelperLinkLiveData();

    void onExecuteLogin(String str, String str2, String str3);

    void onLoadServerHelperLink();
}
