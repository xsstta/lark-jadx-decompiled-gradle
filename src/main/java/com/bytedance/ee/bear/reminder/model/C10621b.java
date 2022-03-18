package com.bytedance.ee.bear.reminder.model;

import android.text.TextUtils;
import com.bytedance.ee.bear.reminder.C10615c;
import com.bytedance.ee.bear.reminder.model.AbstractC10620a;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.reminder.model.b */
public class C10621b implements AbstractC10620a {

    /* renamed from: a */
    private boolean f28531a;

    /* renamed from: b */
    private long f28532b;

    /* renamed from: c */
    private boolean f28533c;

    /* renamed from: d */
    private boolean f28534d;

    /* renamed from: e */
    private EAlertTimeEvent f28535e;

    /* renamed from: f */
    private EAlertTimeEvent f28536f;

    /* renamed from: g */
    private List<ReminderUserEntity> f28537g;

    /* renamed from: h */
    private String f28538h;

    /* renamed from: i */
    private List<String> f28539i;

    @Override // com.bytedance.ee.bear.reminder.model.AbstractC10620a
    /* renamed from: a */
    public /* synthetic */ boolean mo40205a() {
        return AbstractC10620a.CC.$default$a(this);
    }

    @Override // com.bytedance.ee.bear.reminder.model.AbstractC10620a
    /* renamed from: b */
    public /* synthetic */ boolean mo40206b() {
        return AbstractC10620a.CC.$default$b(this);
    }

    @Override // com.bytedance.ee.bear.reminder.model.AbstractC10620a
    /* renamed from: c */
    public /* synthetic */ int mo40207c() {
        return AbstractC10620a.CC.$default$c(this);
    }

    @Override // com.bytedance.ee.bear.reminder.model.AbstractC10620a
    /* renamed from: d */
    public /* synthetic */ int mo40208d() {
        return AbstractC10620a.CC.$default$d(this);
    }

    /* renamed from: t */
    public int mo40233t() {
        return R.color.reminder_select_after;
    }

    /* renamed from: u */
    public int mo40234u() {
        return R.color.reminder_select_before;
    }

    /* renamed from: v */
    public int mo40235v() {
        return R.color.reminder_select_current;
    }

    /* renamed from: w */
    public boolean mo40236w() {
        return false;
    }

    /* renamed from: x */
    public boolean mo40237x() {
        return false;
    }

    /* renamed from: e */
    public List<String> mo40218e() {
        return this.f28539i;
    }

    /* renamed from: h */
    public boolean mo40221h() {
        return this.f28531a;
    }

    /* renamed from: i */
    public long mo40222i() {
        return this.f28532b;
    }

    /* renamed from: j */
    public boolean mo40223j() {
        return this.f28533c;
    }

    /* renamed from: k */
    public boolean mo40224k() {
        return this.f28534d;
    }

    /* renamed from: l */
    public String mo40225l() {
        return this.f28538h;
    }

    /* renamed from: m */
    public List<ReminderUserEntity> mo40226m() {
        return this.f28537g;
    }

    /* renamed from: n */
    public EAlertTimeEvent mo40227n() {
        return this.f28535e;
    }

    /* renamed from: o */
    public EAlertTimeEvent mo40228o() {
        return this.f28536f;
    }

    /* renamed from: q */
    public EAlertTimeEvent mo40230q() {
        return EAlertTimeEvent.onDayOfEvent;
    }

    /* renamed from: s */
    public EAlertTimeEvent mo40232s() {
        return EAlertTimeEvent.atTimeOfEvent;
    }

    public C10621b() {
        mo40220f();
    }

    /* renamed from: g */
    public static long m44061g() {
        Calendar b = C10615c.m44027b(System.currentTimeMillis());
        b.add(5, 1);
        b.set(12, (b.get(12) / 5) * 5);
        return b.getTimeInMillis();
    }

    /* renamed from: f */
    public void mo40220f() {
        this.f28531a = true;
        this.f28532b = m44061g();
        this.f28533c = true;
        this.f28534d = true;
        this.f28535e = mo40230q();
        this.f28536f = mo40232s();
        this.f28537g = null;
        this.f28538h = null;
    }

    /* renamed from: p */
    public List<EAlertTimeEvent> mo40229p() {
        return Arrays.asList(EAlertTimeEvent.noAlert, EAlertTimeEvent.onDayOfEvent, EAlertTimeEvent.oneDayBefore, EAlertTimeEvent.twoDaysBefore, EAlertTimeEvent.oneWeekBefore);
    }

    /* renamed from: r */
    public List<EAlertTimeEvent> mo40231r() {
        return Arrays.asList(EAlertTimeEvent.noAlert, EAlertTimeEvent.atTimeOfEvent, EAlertTimeEvent.before5Mins, EAlertTimeEvent.before15Mins, EAlertTimeEvent.before30Mins, EAlertTimeEvent.before1Hour, EAlertTimeEvent.before2Hours, EAlertTimeEvent.before1Day, EAlertTimeEvent.before2Days, EAlertTimeEvent.before1Week);
    }

    /* renamed from: a */
    public void mo40209a(long j) {
        this.f28532b = j;
    }

    /* renamed from: b */
    public void mo40214b(EAlertTimeEvent eAlertTimeEvent) {
        this.f28536f = eAlertTimeEvent;
    }

    /* renamed from: c */
    public void mo40217c(boolean z) {
        this.f28534d = z;
    }

    /* renamed from: a */
    public void mo40210a(EAlertTimeEvent eAlertTimeEvent) {
        this.f28535e = eAlertTimeEvent;
    }

    /* renamed from: b */
    public void mo40215b(List<ReminderUserEntity> list) {
        this.f28537g = list;
    }

    /* renamed from: a */
    public void mo40211a(String str) {
        this.f28538h = str;
    }

    /* renamed from: b */
    public void mo40216b(boolean z) {
        this.f28533c = z;
    }

    /* renamed from: a */
    public void mo40212a(List<String> list) {
        this.f28539i = list;
    }

    public C10621b(C10621b bVar) {
        if (bVar == null) {
            mo40220f();
            return;
        }
        this.f28531a = bVar.f28531a;
        this.f28532b = bVar.f28532b;
        this.f28533c = bVar.f28533c;
        this.f28534d = bVar.f28534d;
        this.f28535e = bVar.f28535e;
        this.f28536f = bVar.f28536f;
        this.f28537g = bVar.f28537g;
        this.f28538h = bVar.f28538h;
        this.f28539i = bVar.mo40218e();
    }

    /* renamed from: a */
    public void mo40213a(boolean z) {
        this.f28531a = z;
    }

    public boolean equals(Object obj) {
        String str;
        List<ReminderUserEntity> list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10621b)) {
            return false;
        }
        C10621b bVar = (C10621b) obj;
        if (mo40221h() != bVar.mo40221h() || mo40222i() / 1000 != bVar.mo40222i() / 1000 || mo40223j() != bVar.mo40223j() || mo40224k() != bVar.mo40224k()) {
            return false;
        }
        String str2 = "";
        if (TextUtils.isEmpty(this.f28538h)) {
            str = str2;
        } else {
            str = this.f28538h;
        }
        if (!TextUtils.isEmpty(bVar.f28538h)) {
            str2 = bVar.f28538h;
        }
        if (!TextUtils.equals(str, str2)) {
            return false;
        }
        List<ReminderUserEntity> list2 = this.f28537g;
        if (list2 == null || (list = bVar.f28537g) == null) {
            if (!(list2 == null && bVar.f28537g == null)) {
                return false;
            }
        } else if (!list2.containsAll(list) || !bVar.f28537g.containsAll(this.f28537g)) {
            return false;
        }
        if (mo40221h()) {
            if (mo40228o() == bVar.mo40228o()) {
                return true;
            }
            return false;
        } else if (mo40227n() == bVar.mo40227n()) {
            return true;
        } else {
            return false;
        }
    }
}
