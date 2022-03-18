package com.ss.android.lark.calendar.impl.features.calendarview.month;

import androidx.lifecycle.C1177w;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.month.MonthDiagramModel;
import com.ss.android.lark.calendar.impl.features.calendarview.month.view.MonthContainViewPager;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract;", "", "()V", "IMonthDiagramModelApi", "IMonthDiagramViewAction", "IMonthDiagramViewApi", "IMonthDiagramViewData", "OperationType", "PagePosition", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class IMonthDiagramContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u0010\u001a\u00020\u0004H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\u0004H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramModelApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewData;", "calculateSelectCurrentState", "", "getSelectCurrentDiff", "", "getSelectDateAfterModifyToCurrent", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "loadPageData", "position", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$PagePosition;", "operationType", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$OperationType;", "preloadDiskData", "preloadInstance", "resetDataCache", "setDateLogicData", "dateLogicData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "updateCacheAnchorDay", "updateSettingItems", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract$a */
    public interface IMonthDiagramModelApi extends IModelCalendar<IMonthDiagramViewData> {
        /* renamed from: a */
        void mo112006a();

        /* renamed from: a */
        void mo112007a(IDateLogicData hVar);

        /* renamed from: a */
        void mo112008a(PagePosition pagePosition, OperationType operationType);

        /* renamed from: b */
        void mo112009b();

        /* renamed from: c */
        void mo112010c();

        /* renamed from: d */
        void mo112011d();

        /* renamed from: e */
        void mo112012e();

        /* renamed from: g */
        void mo112013g();

        /* renamed from: h */
        CalendarDate mo112014h();

        /* renamed from: i */
        float mo112015i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onClickAppendButton", "", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "onClickEventDetail", "viewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "onFinishInflatePages", "onFinishScrollNonAdjacentPage", "onLeftScrollFinished", "onMoveTodayScrolling", "tabDuration", "", "onRightScrollFinished", "onSelectDateChanged", "selectDate", "isRefreshTitle", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract$b */
    public interface IMonthDiagramViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo112016a();

        /* renamed from: a */
        void mo112017a(int i);

        /* renamed from: a */
        void mo112018a(CalendarDate calendarDate);

        /* renamed from: a */
        void mo112019a(CalendarDate calendarDate, boolean z);

        /* renamed from: a */
        void mo112020a(EventChipViewData eventChipViewData);

        /* renamed from: b */
        void mo112021b();

        /* renamed from: c */
        void mo112022c();

        /* renamed from: d */
        void mo112023d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewAction;", "asyncCheckDrawMask", "", "getMonthContainViewPager", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/view/MonthContainViewPager;", "moveToMonthPage", "pagePosition", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$PagePosition;", "setViewPagerVisibility", "visibility", "", "showCurrentDateAfterModify", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract$c */
    public interface IMonthDiagramViewApi extends IViewCalender<IMonthDiagramViewData, IMonthDiagramViewAction> {
        /* renamed from: a */
        MonthContainViewPager mo112024a();

        /* renamed from: a */
        void mo112025a(int i);

        /* renamed from: b */
        void mo112026b();

        /* renamed from: c */
        void mo112027c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$IMonthDiagramViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getCurrentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getMonthPageLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$MonthChipLiveData;", "getSelectCurrentStateLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SelectCurrentState;", "getSelectDate", "getSettingItemsData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/month/MonthDiagramModel$SettingItemsData;", "getSettingItemsLiveData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.month.IMonthDiagramContract$d */
    public interface IMonthDiagramViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        C1177w<MonthDiagramModel.MonthChipLiveData> mo112028a();

        /* renamed from: b */
        C1177w<MonthDiagramModel.SelectCurrentState> mo112029b();

        /* renamed from: c */
        C1177w<MonthDiagramModel.SettingItemsData> mo112030c();

        /* renamed from: d */
        CalendarDate mo112031d();

        /* renamed from: e */
        CalendarDate mo112032e();

        /* renamed from: f */
        MonthDiagramModel.SettingItemsData mo112033f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$OperationType;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "INIT", "SCROLL", "MOVE_TODAY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum OperationType {
        INIT(0),
        SCROLL(1),
        MOVE_TODAY(2);
        
        private final int number;

        public final int getNumber() {
            return this.number;
        }

        private OperationType(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/month/IMonthDiagramContract$PagePosition;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "LEFT", "CENTER", "RIGHT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum PagePosition {
        LEFT(0),
        CENTER(1),
        RIGHT(2);
        
        private final int number;

        public final int getNumber() {
            return this.number;
        }

        private PagePosition(int i) {
            this.number = i;
        }
    }
}
