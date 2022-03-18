package com.ss.android.lark.calendar.wrapper.p1578a;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.calendar.api.AbstractC30061a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.wrapper.a.a */
public interface AbstractC32677a extends AbstractC30061a {
    /* renamed from: a */
    AbstractC44552i mo120364a(Context context, ITitleController iTitleController);

    /* renamed from: a */
    Map<String, AbstractC29186b> mo120365a(Context context);

    /* renamed from: a */
    boolean mo120366a(Chat chat, ChatChatter chatChatter);

    /* renamed from: b */
    void mo120367b(Activity activity);

    /* renamed from: b */
    void mo120368b(Context context);

    /* renamed from: m */
    AbstractC32679d mo120369m();

    /* renamed from: n */
    AbstractC32678b mo120370n();

    /* renamed from: o */
    AbstractC32681e mo120371o();

    /* renamed from: p */
    ICalendarServiceForForwardModule mo120372p();
}
