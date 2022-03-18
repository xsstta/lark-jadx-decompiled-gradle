package com.ss.android.lark.calendar.impl.features.calendars.editor;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract;", "", "()V", "ICalendarCreatorModel", "ICalendarCreatorView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.h */
public final class ICalendarCreatorContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\fH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH&J$\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H&J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00150\fH&J\u001e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\fH&J\b\u0010\u0019\u001a\u00020\nH&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0005H&J\b\u0010\u001d\u001a\u00020\u0015H&J\b\u0010\u001e\u001a\u00020\u001fH&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0012H&J\b\u0010!\u001a\u00020\u0005H&J\b\u0010\"\u001a\u00020\u0003H&J\b\u0010#\u001a\u00020\u0015H&J \u0010$\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%H&J\u0018\u0010&\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\fH&J\u0016\u0010(\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00150\fH&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u001fH&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0015H&J\u0016\u0010,\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00150\fH&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\nH&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u001bH&J\u0010\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0005H&J\u0010\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0015H&¨\u00065"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorModel;", "Lcom/larksuite/framework/mvp/IModel;", "addCalendarMembersByIds", "", "calendarServerId", "", "userIds", "", "chatIds", "position", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "addRemovedMember", "calendarMember", "adjustMembersOnAddMembersIdFromGroup", "attendeeIds", "", "groupIds", "delegateCalendar", "", "getCalendarAndMembersWithIds", "calendarId", "viewCallBack", "getCalendarColor", "getCalendarDefaultAccessRole", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$AccessRole;", "getCalendarDescription", "getCalendarIsPublic", "getCurrentCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCurrentShowMembers", "getLoginChatterId", "initForNewCalendar", "isEdited", "loadCalendarById", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$IFetchCalendarCallback;", "loadLoginChatter", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "saveCalendarWithMembers", "setCurrentCalendar", "calendar", "setIsEdited", "unSubscribeCalendar", "updateCalendarColor", "chosenColor", "updateCalendarDefaultAccessRole", "accessRole", "updateCalendarDescription", "description", "updateCalendarIsPublic", "isPublic", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.h$a */
    public interface ICalendarCreatorModel extends IModel {
        /* renamed from: a */
        void mo109457a(int i);

        /* renamed from: a */
        void mo109458a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo109459a(Calendar.AccessRole accessRole);

        /* renamed from: a */
        void mo109461a(CalendarMember calendarMember);

        /* renamed from: a */
        void mo109463a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo109464a(String str, CalendarCreatorPresenter.IFetchCalendarCallback<Calendar> dVar);

        /* renamed from: a */
        void mo109465a(String str, List<String> list, List<String> list2, int i, IGetDataCallback<List<CalendarMember>> iGetDataCallback);

        /* renamed from: a */
        void mo109466a(List<String> list, List<String> list2);

        /* renamed from: a */
        void mo109467a(boolean z);

        /* renamed from: b */
        void mo109469b(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo109470b(Calendar calendar);

        /* renamed from: b */
        void mo109471b(String str);

        /* renamed from: b */
        void mo109472b(boolean z);

        /* renamed from: c */
        void mo109473c();

        /* renamed from: c */
        void mo109474c(IGetDataCallback<AbstractC30026d> iGetDataCallback);

        /* renamed from: d */
        String mo109475d();

        /* renamed from: d */
        void mo109476d(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: e */
        Calendar mo109477e();

        /* renamed from: f */
        List<CalendarMember> mo109478f();

        /* renamed from: g */
        boolean mo109479g();

        /* renamed from: h */
        int mo109480h();

        /* renamed from: i */
        boolean mo109481i();

        /* renamed from: j */
        Calendar.AccessRole mo109482j();

        /* renamed from: k */
        String mo109483k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0004H&J\b\u0010\u0012\u001a\u00020\rH&J\b\u0010\u0013\u001a\u00020\rH&J\b\u0010\u0014\u001a\u00020\rH&J\b\u0010\u0015\u001a\u00020\rH&J\b\u0010\u0016\u001a\u00020\rH&J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0004H&J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0007H&J\b\u0010\u001b\u001a\u00020\rH&J\b\u0010\u001c\u001a\u00020\rH&J\b\u0010\u001d\u001a\u00020\rH&J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H&J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H&J\u0016\u0010\"\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H&J\u0010\u0010&\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H&¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView$ViewDelegate;", "checkIfChangeName", "", "frameLayoutIsVisible", "getCalendarSummary", "", "getContext", "Landroid/content/Context;", "getFrameLayoutId", "", "hideKeyBoard", "", "onDeleteFailed", "onDeleteSuccess", "onGetManagerCalendar", "getFromServer", "onSaveFailed", "onSaveNotCompliance", "onSaveSuccess", "onUnSubscribeFailed", "onUnSubscribeSuccess", "setSaveBtClickable", "isClickable", "setSummary", "calendarSummary", "showErrMessage", "showNeedSummaryDialog", "showUnSaveChangeDialog", "updateColorContainer", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "updateDescriptionContainer", "updateMemberRecycleView", "calendarMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "updateVisibilityContainer", "ViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.h$b */
    public interface ICalendarCreatorView extends IView<ViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\bH&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView$ViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "finishActivity", "", "getCurrentCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCurrentMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "getManagerType", "", "onBackPressed", "onClickAddMemberLabel", "onClickColorContainer", "onClickDeleteBt", "onClickDescriptionContainer", "editable", "", "onClickMemberItem", "calendarMember", "onClickSaveButton", "onClickUnsubscribeBt", "onClickVisibilityContainer", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.h$b$a */
        public interface ViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo109510a();

            /* renamed from: a */
            void mo109511a(CalendarMember calendarMember);

            /* renamed from: a */
            void mo109512a(boolean z);

            /* renamed from: b */
            void mo109513b();

            /* renamed from: c */
            void mo109514c();

            /* renamed from: d */
            void mo109515d();

            /* renamed from: e */
            void mo109516e();

            /* renamed from: f */
            void mo109517f();

            /* renamed from: g */
            void mo109518g();

            /* renamed from: h */
            void mo109519h();

            /* renamed from: i */
            Calendar mo109520i();

            /* renamed from: j */
            List<CalendarMember> mo109521j();

            /* renamed from: k */
            String mo109522k();
        }

        /* renamed from: a */
        void mo109535a(Calendar calendar);

        /* renamed from: a */
        void mo109536a(String str);

        /* renamed from: a */
        void mo109537a(List<CalendarMember> list);

        /* renamed from: a */
        void mo109538a(boolean z);

        /* renamed from: b */
        void mo109540b(Calendar calendar);

        /* renamed from: b */
        void mo109541b(boolean z);

        /* renamed from: c */
        void mo109543c(Calendar calendar);

        /* renamed from: e */
        void mo109546e();

        /* renamed from: g */
        void mo109548g();

        /* renamed from: h */
        void mo109549h();

        /* renamed from: i */
        String mo109550i();

        /* renamed from: j */
        int mo109551j();

        /* renamed from: k */
        boolean mo109552k();

        /* renamed from: l */
        void mo109553l();

        /* renamed from: m */
        void mo109554m();

        /* renamed from: n */
        void mo109555n();

        /* renamed from: o */
        void mo109556o();

        /* renamed from: p */
        void mo109557p();

        /* renamed from: q */
        void mo109558q();

        /* renamed from: r */
        void mo109559r();

        /* renamed from: s */
        void mo109560s();

        /* renamed from: u */
        boolean mo109562u();
    }
}
