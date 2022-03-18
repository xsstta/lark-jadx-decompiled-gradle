package com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer;

import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/ITransferChatterPickerViewModel;", "", "isShareCalendarEvent", "", "()Z", "organizerId", "", "getOrganizerId", "()Ljava/lang/String;", "organizerName", "getOrganizerName", "transferResult", "Landroidx/lifecycle/LiveData;", "getTransferResult", "()Landroidx/lifecycle/LiveData;", "onSelectedQuit", "", BottomDialog.f17198f, "isQuit", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.a */
public interface ITransferChatterPickerViewModel {
    String getOrganizerId();

    String getOrganizerName();

    LiveData<Boolean> getTransferResult();

    boolean isShareCalendarEvent();

    void onSelectedQuit(String str, boolean z);
}
