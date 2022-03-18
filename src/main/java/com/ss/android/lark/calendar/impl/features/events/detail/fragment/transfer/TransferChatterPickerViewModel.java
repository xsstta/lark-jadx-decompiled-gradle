package com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorModel;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32491i;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/ITransferChatterPickerViewModel;", "transferEventData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferEventData;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferEventData;)V", "isShareCalendarEvent", "", "()Z", "organizerId", "", "getOrganizerId", "()Ljava/lang/String;", "organizerName", "getOrganizerName", "transferResult", "Landroidx/lifecycle/MutableLiveData;", "getTransferResult", "()Landroidx/lifecycle/MutableLiveData;", "onSelectedQuit", "", BottomDialog.f17198f, "isQuit", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.d */
public final class TransferChatterPickerViewModel extends AbstractC1142af implements ITransferChatterPickerViewModel {
    public static final Companion Companion = new Companion(null);
    private final TransferEventData transferEventData;
    private final C1177w<Boolean> transferResult = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerViewModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.ITransferChatterPickerViewModel
    public C1177w<Boolean> getTransferResult() {
        return this.transferResult;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.ITransferChatterPickerViewModel
    public String getOrganizerId() {
        return this.transferEventData.getOrganizerId();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.ITransferChatterPickerViewModel
    public String getOrganizerName() {
        return this.transferEventData.getOrganizerName();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.ITransferChatterPickerViewModel
    public boolean isShareCalendarEvent() {
        return this.transferEventData.isShareCalendarEvent();
    }

    public TransferChatterPickerViewModel(TransferEventData transferEventData2) {
        Intrinsics.checkParameterIsNotNull(transferEventData2, "transferEventData");
        this.transferEventData = transferEventData2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/transfer/TransferChatterPickerViewModel$onSelectedQuit$callBack$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarEvents", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.d$b */
    public static final class C31332b implements IGetDataCallback<List<? extends CalendarEvent>> {

        /* renamed from: a */
        final /* synthetic */ TransferChatterPickerViewModel f79310a;

        /* renamed from: b */
        final /* synthetic */ String f79311b;

        /* renamed from: c */
        final /* synthetic */ String f79312c;

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarEvent> list) {
            Intrinsics.checkParameterIsNotNull(list, "calendarEvents");
            this.f79310a.getTransferResult().mo5926a((Boolean) true);
            EventBus.getDefault().trigger(new C32491i());
            Log.m165389i("TransferChatterPickerViewModel", C32673y.m125373a(this.f79311b, this.f79312c, new String[0]));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f79310a.getTransferResult().mo5926a((Boolean) false);
            Log.m165383e(CalendarCreatorModel.f75888b.mo109484a(), C32673y.m125370a(this.f79311b, this.f79312c, errorResult));
        }

        C31332b(TransferChatterPickerViewModel dVar, String str, String str2) {
            this.f79310a = dVar;
            this.f79311b = str;
            this.f79312c = str2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.transfer.ITransferChatterPickerViewModel
    public void onSelectedQuit(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("TransferChatterPickerViewModel", C32673y.m125376b(valueOf, "eventTransferRequest", "calendar_id", this.transferEventData.getCalendarId(), "key", this.transferEventData.getKey(), "original_time", String.valueOf(this.transferEventData.getOriginalTime()), BottomDialog.f17198f, str));
        C32533b.m124620a().mo118867a(this.transferEventData.getCalendarId(), this.transferEventData.getKey(), this.transferEventData.getOriginalTime(), str, Boolean.valueOf(z), new C31332b(this, valueOf, "eventTransferRequest"));
    }
}
