package com.ss.android.lark.calendar.impl.features.events.edit.mail;

import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract;", "", "()V", "IAddMailAttendeeModelApi", "IAddMailAttendeeViewAction", "IAddMailAttendeeViewApi", "IAddMailAttendeeViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.b */
public final class AddMailAttendeeContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H&J\u0018\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H&J \u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0004j\b\u0012\u0004\u0012\u00020\u000b`\u0006H&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeModelApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewData;", "getAddAccountList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDeleteAccountList", "setAttendeeAccounts", "", "attendeeAccountList", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "updateAddEmail", "addItem", "updateDeleteEmail", "deleteItem", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.b$a */
    public interface IAddMailAttendeeModelApi extends IModelCalendar<IAddMailAttendeeViewData> {
        /* renamed from: a */
        ArrayList<String> mo116159a();

        /* renamed from: a */
        void mo116160a(String str);

        /* renamed from: b */
        ArrayList<String> mo116161b();

        /* renamed from: b */
        void mo116162b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onAddEmail", "", "addItem", "", "onDeleteEmail", "deleteItem", "onPerformAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.b$b */
    public interface IAddMailAttendeeViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo116163a();

        /* renamed from: a */
        void mo116164a(String str);

        /* renamed from: b */
        void mo116165b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewAction;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.b$c */
    public interface IAddMailAttendeeViewApi extends IViewCalender<IAddMailAttendeeViewData, IAddMailAttendeeViewAction> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeContract$IAddMailAttendeeViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getAttendeeEmails", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/mail/AddMailAttendeeData;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.mail.b$d */
    public interface IAddMailAttendeeViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        ArrayList<AddMailAttendeeData> mo116166a();
    }
}
