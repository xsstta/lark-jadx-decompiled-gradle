package com.ss.android.lark.notification;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.biz.core.api.AbstractC29539aa;
import com.ss.android.lark.biz.core.api.INotificationHitPoint;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.notification.common.C48434a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.offline.C48547d;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.notification.p2382e.AbstractC48449b;
import com.ss.android.lark.notification.p2382e.AbstractC48450c;
import com.ss.android.lark.notification.p2382e.C48452e;
import com.ss.android.lark.notification.p2382e.C48464i;
import com.ss.android.lark.notification.p2382e.C48467j;
import com.ss.android.lark.notification.p2382e.C48468k;
import com.ss.android.lark.notification.p2385g.AbstractC48511a;
import com.ss.android.lark.notification.p2385g.C48522f;
import com.ss.android.lark.notification.p2386h.C48534a;
import com.ss.android.lark.notification.setting.impl.p2391a.C48575b;
import com.ss.android.lark.notification.setting.impl.setting.C48601b;
import com.ss.android.lark.notification.statistics.NoticeHitPoint;
import com.ss.android.lark.setting.export.AbstractC54125a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.notification.a */
public class C48398a {

    /* renamed from: a */
    private static volatile AbstractC48407a f121871a;

    /* renamed from: a */
    public static AbstractC48407a m190922a() {
        return f121871a;
    }

    /* renamed from: b */
    public AbstractC48449b mo169320b() {
        return C48452e.m191122b();
    }

    /* renamed from: c */
    public AbstractC48511a mo169322c() {
        return C48522f.m191320b();
    }

    /* renamed from: d */
    public AbstractC48450c mo169323d() {
        return C48464i.m191147a();
    }

    /* renamed from: e */
    public AbstractC29539aa mo169324e() {
        return C48468k.m191156a();
    }

    /* renamed from: f */
    public INotificationHitPoint mo169325f() {
        return NoticeHitPoint.f122125b.mo169607a();
    }

    /* renamed from: g */
    public AbstractNotification.AbstractC48496c<Notice> mo169326g() {
        return new C48534a();
    }

    /* renamed from: i */
    public List<String> mo169328i() {
        return C48434a.m191077a();
    }

    /* renamed from: h */
    public List<AbstractNotification> mo169327h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C48547d());
        return arrayList;
    }

    /* renamed from: j */
    public boolean mo169329j() {
        if (C36512a.m144041a().mo134770b(ContainerType.Right) instanceof C48601b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo169321b(Context context) {
        C48405b.m190971c(context);
    }

    public C48398a(AbstractC48407a aVar) {
        f121871a = aVar;
    }

    /* renamed from: a */
    public void mo169318a(Context context) {
        C48467j.m191153a(context);
    }

    /* renamed from: a */
    public List<AbstractC54125a> mo169317a(Activity activity) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C48575b(activity));
        return arrayList;
    }

    /* renamed from: a */
    public void mo169319a(Context context, boolean z) {
        C48405b.m190969a(context, z);
    }
}
