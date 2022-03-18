package com.ss.android.lark.ding;

import android.content.Context;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.p1803a.AbstractC36620b;
import com.ss.android.lark.ding.p1803a.AbstractC36621c;
import com.ss.android.lark.ding.service.AbstractC36674b;
import com.ss.android.lark.ding.service.AbstractC36675c;
import com.ss.android.lark.ding.service.AbstractC36677d;
import com.ss.android.lark.ding.service.C36673a;
import com.ss.android.lark.ding.service.impl.C36678a;
import com.ss.android.lark.ding.service.impl.C36685b;
import com.ss.android.lark.ding.service.impl.C36690c;
import com.ss.android.lark.ding.service.impl.controller.C36706a;
import com.ss.android.lark.ding.service.impl.notification.p1805a.C36760a;
import com.ss.android.lark.ding.service.impl.notification.p1805a.C36763b;
import com.ss.android.lark.ding.service.impl.notification.p1806b.C36768a;
import com.ss.android.lark.notification.export.AbstractNotification;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.ding.a */
public class C36618a {

    /* renamed from: a */
    private static volatile IDingModuleDependency f94234a;

    /* renamed from: a */
    public static IDingModuleDependency m144492a() {
        return f94234a;
    }

    /* renamed from: b */
    public AbstractC36677d mo135086b() {
        return C36690c.m144778a();
    }

    /* renamed from: c */
    public AbstractC36675c mo135089c() {
        return C36706a.m144854g();
    }

    /* renamed from: d */
    public AbstractC36674b mo135090d() {
        return C36678a.m144755b();
    }

    /* renamed from: f */
    public void mo135092f() {
        C36760a.m145011a().mo135453b();
    }

    /* renamed from: e */
    public List<AbstractNotification> mo135091e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C36763b());
        arrayList.add(new C36768a());
        return arrayList;
    }

    public C36618a(IDingModuleDependency iDingModuleDependency) {
        f94234a = iDingModuleDependency;
    }

    /* renamed from: a */
    public void mo135083a(AbstractC36620b bVar) {
        if (bVar != null) {
            C36685b.m144766a().mo135292a(bVar);
        }
    }

    /* renamed from: b */
    public void mo135087b(AbstractC36620b bVar) {
        if (bVar != null) {
            C36685b.m144766a().mo135295b(bVar);
        }
    }

    /* renamed from: a */
    public void mo135084a(AbstractC36621c cVar) {
        if (cVar != null) {
            C36685b.m144766a().mo135293a(cVar);
        }
    }

    /* renamed from: b */
    public void mo135088b(AbstractC36621c cVar) {
        if (cVar != null) {
            C36685b.m144766a().mo135296b(cVar);
        }
    }

    /* renamed from: a */
    public void mo135085a(List<String> list) {
        C36706a.m144854g().mo135360a(list);
    }

    /* renamed from: a */
    public void mo135082a(Context context, C36516a aVar, Message message, List<String> list, boolean z, int i) {
        C36673a.m144736a(context, aVar, message, list, z, i);
    }
}
