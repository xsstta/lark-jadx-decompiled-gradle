package com.ss.android.lark.integrator.im.dependency;

import android.content.Context;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.p1664d.AbstractC33987b;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33992b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.dependency.m */
public interface AbstractC39571m {
    /* renamed from: a */
    int mo143287a(int i);

    /* renamed from: a */
    int mo143288a(int i, String str);

    /* renamed from: a */
    IPlusItem mo143289a(Context context, Chat chat);

    /* renamed from: a */
    Map<String, String> mo143290a();

    /* renamed from: a */
    Map<String, String> mo143291a(String str);

    /* renamed from: a */
    void mo143292a(long j);

    /* renamed from: a */
    void mo143293a(Context context, C36516a aVar, int i, String str, int i2, String str2);

    /* renamed from: a */
    void mo143294a(AbstractC33987b bVar);

    /* renamed from: a */
    void mo143295a(AbstractC33992b bVar);

    /* renamed from: a */
    void mo143296a(List<String> list);

    /* renamed from: b */
    int mo143297b(int i);

    /* renamed from: b */
    int mo143298b(int i, String str);

    /* renamed from: b */
    Map<String, String> mo143299b();

    /* renamed from: b */
    void mo143300b(AbstractC33987b bVar);

    /* renamed from: b */
    void mo143301b(AbstractC33992b bVar);

    /* renamed from: c */
    int mo143302c(int i);

    /* renamed from: c */
    Map<String, String> mo143303c();

    /* renamed from: d */
    AbstractC36498n mo143304d();

    /* renamed from: e */
    AbstractC38037a.AbstractC38051k mo143305e();

    /* renamed from: f */
    AbstractC36474h.AbstractC36479e mo143306f();

    /* renamed from: g */
    Map<Integer, Integer> mo143307g();
}
