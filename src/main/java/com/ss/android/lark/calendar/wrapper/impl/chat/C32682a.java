package com.ss.android.lark.calendar.wrapper.impl.chat;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalGeneralContent;
import com.ss.android.lark.calendar.impl.features.messagecard.p1553a.C32185f;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarGeneralContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.ShareCalendarEventContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1580a.C32685a;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1581b.C32688b;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d.C32691a;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1584e.C32701a;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1584e.C32703d;
import com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.a */
public class C32682a implements AbstractC32679d {

    /* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.a$a */
    private static class C32684a {

        /* renamed from: a */
        public static final C32682a f83841a = new C32682a();
    }

    private C32682a() {
    }

    /* renamed from: c */
    public static C32682a m125458c() {
        return C32684a.f83841a;
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d
    /* renamed from: b */
    public List<IOpenMessageCellFactory> mo120385b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C32703d());
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d
    /* renamed from: a */
    public List<IOpenMessageCellFactory> mo120382a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C32685a());
        arrayList.add(new C32701a());
        arrayList.add(new C32688b());
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d
    /* renamed from: a */
    public String mo120381a(ShareCalendarEventContent shareCalendarEventContent) {
        return C32185f.m122678a(shareCalendarEventContent.getCalendarInternalShareEventContent());
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d
    /* renamed from: b */
    public String mo120384b(CalendarGeneralContent calendarGeneralContent) {
        if (TextUtils.isEmpty(calendarGeneralContent.getCalendarInternalGeneralContent().getCalendarCardContent().getSummary())) {
            return C32634ae.m125182b(R.string.Calendar_Push_EventNoName);
        }
        return UIHelper.mustacheFormat((int) R.string.Calendar_Push_EventName, "title", calendarGeneralContent.getCalendarInternalGeneralContent().getCalendarCardContent().getSummary());
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d
    /* renamed from: a */
    public boolean mo120383a(CalendarGeneralContent calendarGeneralContent) {
        if (calendarGeneralContent.getCalendarInternalGeneralContent().getMessageType() == CalendarInternalGeneralContent.CalendarMessageType.RSVP_COMMENT) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d
    /* renamed from: a */
    public <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo120379a(Context context, AbstractC32679d.AbstractC32680a<T> aVar) {
        return new C32691a(context, aVar);
    }

    @Override // com.ss.android.lark.calendar.wrapper.p1578a.AbstractC32679d
    /* renamed from: a */
    public String mo120380a(Context context, CalendarContent calendarContent) {
        return C32185f.m122676a(context, calendarContent.getCalendarInternalContent());
    }
}
