package com.ss.android.lark.calendar.wrapper.p1578a;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.CalendarGeneralContent;
import com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.content.ShareCalendarEventContent;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.wrapper.a.d */
public interface AbstractC32679d {

    /* renamed from: com.ss.android.lark.calendar.wrapper.a.d$a */
    public interface AbstractC32680a<T> {
        /* renamed from: a */
        void mo120386a(int i);

        /* renamed from: a */
        void mo120387a(View view);

        /* renamed from: a */
        void mo120388a(T t);

        /* renamed from: a */
        boolean mo120389a();

        /* renamed from: b */
        Message mo120390b();

        /* renamed from: c */
        String mo120391c();

        /* renamed from: d */
        String mo120392d();

        /* renamed from: e */
        String mo120393e();

        /* renamed from: f */
        String mo120394f();

        /* renamed from: g */
        boolean mo120395g();

        /* renamed from: h */
        String mo120396h();
    }

    /* renamed from: a */
    <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo120379a(Context context, AbstractC32680a<T> aVar);

    /* renamed from: a */
    String mo120380a(Context context, CalendarContent calendarContent);

    /* renamed from: a */
    String mo120381a(ShareCalendarEventContent shareCalendarEventContent);

    /* renamed from: a */
    List<IOpenMessageCellFactory> mo120382a();

    /* renamed from: a */
    boolean mo120383a(CalendarGeneralContent calendarGeneralContent);

    /* renamed from: b */
    String mo120384b(CalendarGeneralContent calendarGeneralContent);

    /* renamed from: b */
    List<IOpenMessageCellFactory> mo120385b();
}
