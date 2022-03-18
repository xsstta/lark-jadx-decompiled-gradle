package com.ss.android.lark.calendar.impl.features.preempt;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnLoadMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnPreemptMeetingRoom;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnSaveNeedPopUpWindow;
import com.ss.android.lark.calendar.impl.features.preempt.model.SheetItemData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract;", "", "()V", "IPreemptModel", "IPreemptView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.preempt.a */
public final class PreemptContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\"J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&J\u0018\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\nH&J\b\u0010\u0017\u001a\u00020\nH&J\b\u0010\u0018\u001a\u00020\nH&J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u001bH&J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u001eH&J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H&¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptModel;", "Lcom/larksuite/framework/mvp/IModel;", "getAllDayTimeStr", "", "getMeetingRoomData", "", "callback", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnLoadMeetingRoomData;", "getMeetingRoomName", "getNeedShowPopup", "", "getOriginalAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "getProgressSpareTime", "", "getSeizeTime", "getSheetItems", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/preempt/model/SheetItemData;", "Lkotlin/collections/ArrayList;", "getSpareEndTimeStr", "getSpareTime", "isAllDayEventInstance", "isMeetingRoomAvailable", "isProgressSpareStatusChanged", "preemptMeetingRoom", "endTime", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnPreemptMeetingRoom;", "saveSeizeResourceWethereNeedPopUp", "needPopUp", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnSaveNeedPopUpWindow;", "setModelDelegate", "delegate", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptModel$ModelDelegate;", "ModelDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.a$a */
    public interface IPreemptModel extends IModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptModel$ModelDelegate;", "", "onSpareTimeChanged", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.a$a$a */
        public interface ModelDelegate {
            /* renamed from: a */
            void mo117815a();
        }

        /* renamed from: a */
        void mo117799a(long j, OnPreemptMeetingRoom cVar);

        /* renamed from: a */
        void mo117800a(ModelDelegate aVar);

        /* renamed from: a */
        void mo117801a(OnLoadMeetingRoomData bVar);

        /* renamed from: a */
        void mo117802a(boolean z, OnSaveNeedPopUpWindow dVar);

        /* renamed from: a */
        boolean mo117803a();

        /* renamed from: b */
        boolean mo117804b();

        /* renamed from: c */
        String mo117805c();

        /* renamed from: d */
        String mo117806d();

        /* renamed from: e */
        String mo117807e();

        /* renamed from: f */
        boolean mo117808f();

        /* renamed from: g */
        CalendarEventCreator mo117809g();

        /* renamed from: h */
        String mo117810h();

        /* renamed from: i */
        ArrayList<SheetItemData> mo117811i();

        /* renamed from: j */
        long mo117812j();

        /* renamed from: k */
        long mo117813k();

        /* renamed from: l */
        boolean mo117814l();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\u0004H&J\b\u0010\u0013\u001a\u00020\u0004H&J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u0004H&J\b\u0010\u0017\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\u0004H&J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\u0004H&J\b\u0010!\u001a\u00020\u0004H&J\b\u0010\"\u001a\u00020\u0004H&J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001bH&J \u0010%\u001a\u00020\u00042\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)H&J \u0010*\u001a\u00020\u00042\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)H&¨\u0006,"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptView$ViewDelegate;", "bindMeetingRoomInfo", "", "meetingRoomStr", "", "bindSpareTimeInfo", "spareTime", "isShowTimeIcon", "", "dismissDialog", "dismissSheet", "hideLoadingView", "revertSheetAction", "showBusinessUnpaidErr", "showConfirmDialog", "showCrossTeneantErr", "showHasPremmptToast", "showHasReservedError", "showLoadingView", "showNoDurationErr", "showOperationErrorToast", "showPreemptLoadErrorToast", "showPreemptSaveErrorToast", "showPreemptTimeChangeToast", "progressSpareTime", "", "isProgressStatusChanged", "showReservePerson", "eventCreator", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "showResourceDisabledErr", "showResourceSeizeClosedErr", "showScanQRCodeError", "showSpareTimeProgressBar", "seizeTime", "showTimeSheet", "itemList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/preempt/model/SheetItemData;", "Lkotlin/collections/ArrayList;", "updateTimeSheet", "ViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.a$b */
    public interface IPreemptView extends IView<ViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptView$ViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onDialogConfirmClicked", "", "isCheck", "", "onProgressBarTimeFinish", "onProgressBarTimeUnFinish", "onProgressPreemptBtnClicked", "onRefreshSheetItems", "onSheetConfirmClicked", "endTime", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.a$b$a */
        public interface ViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo117840a();

            /* renamed from: a */
            void mo117841a(long j);

            /* renamed from: a */
            void mo117842a(boolean z);

            /* renamed from: b */
            void mo117843b();

            /* renamed from: c */
            void mo117844c();

            /* renamed from: d */
            void mo117845d();
        }

        /* renamed from: a */
        void mo117816a();

        /* renamed from: a */
        void mo117817a(long j, long j2);

        /* renamed from: a */
        void mo117818a(long j, boolean z);

        /* renamed from: a */
        void mo117819a(CalendarEventCreator calendarEventCreator);

        /* renamed from: a */
        void mo117820a(String str);

        /* renamed from: a */
        void mo117821a(String str, boolean z);

        /* renamed from: a */
        void mo117822a(ArrayList<SheetItemData> arrayList);

        /* renamed from: b */
        void mo117823b();

        /* renamed from: b */
        void mo117824b(ArrayList<SheetItemData> arrayList);

        /* renamed from: c */
        void mo117825c();

        /* renamed from: d */
        void mo117826d();

        /* renamed from: e */
        void mo117827e();

        /* renamed from: f */
        void mo117828f();

        /* renamed from: g */
        void mo117829g();

        /* renamed from: h */
        void mo117830h();

        /* renamed from: i */
        void mo117831i();

        /* renamed from: j */
        void mo117832j();

        /* renamed from: k */
        void mo117833k();

        /* renamed from: l */
        void mo117834l();

        /* renamed from: m */
        void mo117835m();

        /* renamed from: n */
        void mo117836n();

        /* renamed from: o */
        void mo117837o();

        /* renamed from: p */
        void mo117838p();

        /* renamed from: q */
        void mo117839q();
    }
}
