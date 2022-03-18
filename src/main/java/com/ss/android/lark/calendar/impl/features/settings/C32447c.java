package com.ss.android.lark.calendar.impl.features.settings;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d;
import com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment;
import com.ss.android.lark.calendar.impl.features.settings.SettingDetailFragment;
import com.ss.android.lark.calendar.impl.features.settings.SkinSettingFragment;
import com.ss.android.lark.calendar.impl.features.settings.WorkHourSettingFragment;
import com.ss.android.lark.calendar.impl.features.settings.alternateCalendar.AlternateCalendarFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.calendar.impl.features.settings.c */
public class C32447c extends BasePresenter<AbstractC32460d.AbstractC32461a, AbstractC32460d.AbstractC32463b, AbstractC32460d.AbstractC32463b.AbstractC32464a> {

    /* renamed from: a */
    public SettingDetailFragment f83192a;

    /* renamed from: b */
    public WorkHourSettingFragment f83193b;

    /* renamed from: c */
    public SkinSettingFragment f83194c;

    /* renamed from: d */
    public LocalCalAccountFragment f83195d;

    /* renamed from: e */
    public View$OnClickListenerC31538b f83196e;

    /* renamed from: f */
    public AlternateCalendarFragment f83197f;

    /* renamed from: g */
    public AbstractC32456a f83198g;

    /* renamed from: h */
    public AbstractC32457b f83199h = new AbstractC32457b() {
        /* class com.ss.android.lark.calendar.impl.features.settings.C32447c.C324481 */

        @Override // com.ss.android.lark.calendar.impl.features.settings.C32447c.AbstractC32457b
        /* renamed from: a */
        public void mo118554a(CalendarSettingViewData calendarSettingViewData) {
            ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118268a(UIHelper.getString(R.string.Calendar_Edit_SaveFailedTip));
            ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118266a(calendarSettingViewData);
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.C32447c.AbstractC32457b
        /* renamed from: b */
        public void mo118555b(CalendarSettingViewData calendarSettingViewData) {
            if (NetworkUtils.m153070c(C30022a.f74882a.settingDependency().mo108177a())) {
                C32447c.this.mo118545a();
            } else {
                ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118268a(UIHelper.getString(R.string.Calendar_Toast_Disconnected));
            }
            ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118266a(calendarSettingViewData);
        }
    };

    /* renamed from: i */
    public SettingDetailFragment.AbstractC32389a f83200i = new SettingDetailFragment.AbstractC32389a() {
        /* class com.ss.android.lark.calendar.impl.features.settings.C32447c.C324492 */

        @Override // com.ss.android.lark.calendar.impl.features.settings.SettingDetailFragment.AbstractC32389a
        /* renamed from: a */
        public void mo118354a() {
            C32447c.this.f83198g.mo118372b(C32447c.this.f83192a, true);
            C32447c.this.f83196e = null;
        }

        /* renamed from: b */
        private void m123863b() {
            if (((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f().isChooseReminder()) {
                CalendarSettingHitPoint.m124371b("not_all_day_event_notification");
            } else if (((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f().isChooseAllDayReminder()) {
                CalendarSettingHitPoint.m124371b("all_day_event_notification");
            } else if (((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f().isChooseDefaultDuration()) {
                CalendarSettingHitPoint.m124371b("event_default_length");
            } else if (((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f().isChooseFirstDay()) {
                CalendarSettingHitPoint.m124371b("first_day_of_week");
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.SettingDetailFragment.AbstractC32389a
        /* renamed from: a */
        public void mo118355a(CalendarSettingViewData calendarSettingViewData) {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118489a(calendarSettingViewData);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118490a(C32447c.this.f83199h);
            ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118266a(((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
            C32447c.this.f83198g.mo118372b(C32447c.this.f83192a, true);
            C32447c.this.f83196e = null;
            m123863b();
        }
    };

    /* renamed from: j */
    public WorkHourSettingFragment.Delegate f83201j = new WorkHourSettingFragment.Delegate() {
        /* class com.ss.android.lark.calendar.impl.features.settings.C32447c.C324503 */

        @Override // com.ss.android.lark.calendar.impl.features.settings.WorkHourSettingFragment.Delegate
        /* renamed from: a */
        public void mo118556a() {
            C32447c.this.f83198g.mo118372b(C32447c.this.f83193b, false);
            C32447c.this.f83196e = null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.WorkHourSettingFragment.Delegate
        /* renamed from: a */
        public void mo118557a(CalendarWorkHourSetting calendarWorkHourSetting) {
            CalendarSettingViewData f = ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f();
            f.setWorkHourData(calendarWorkHourSetting);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118489a(f);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118497c(calendarWorkHourSetting.isEnable());
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118490a(C32447c.this.f83199h);
            ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118266a(((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
        }
    };

    /* renamed from: k */
    public SkinSettingFragment.AbstractC32394a f83202k = new SkinSettingFragment.AbstractC32394a() {
        /* class com.ss.android.lark.calendar.impl.features.settings.C32447c.C324514 */

        @Override // com.ss.android.lark.calendar.impl.features.settings.SkinSettingFragment.AbstractC32394a
        /* renamed from: a */
        public void mo118364a() {
            C32447c.this.f83198g.mo118372b(C32447c.this.f83194c, false);
            C32447c.this.f83196e = null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.SkinSettingFragment.AbstractC32394a
        /* renamed from: a */
        public void mo118365a(CalendarSettingViewData calendarSettingViewData) {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118489a(calendarSettingViewData);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118490a(C32447c.this.f83199h);
            ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118266a(((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
            C32447c.this.f83198g.mo118372b(C32447c.this.f83194c, false);
            C32447c.this.f83196e = null;
        }
    };

    /* renamed from: l */
    public AlternateCalendarFragment.Delegate f83203l = new AlternateCalendarFragment.Delegate() {
        /* class com.ss.android.lark.calendar.impl.features.settings.C32447c.C324525 */

        @Override // com.ss.android.lark.calendar.impl.features.settings.alternateCalendar.AlternateCalendarFragment.Delegate
        /* renamed from: a */
        public void mo118386a() {
            C32447c.this.f83198g.mo118372b(C32447c.this.f83197f, true);
            C32447c.this.f83196e = null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.alternateCalendar.AlternateCalendarFragment.Delegate
        /* renamed from: a */
        public void mo118387a(CalendarSetting.AlternateCalendar alternateCalendar) {
            boolean z;
            if (alternateCalendar == CalendarSetting.AlternateCalendar.CHINESE_LUNAR_CALENDAR) {
                z = true;
            } else {
                z = false;
            }
            GeneralHitPoint.m124220a(z);
            CalendarSettingViewData f = ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f();
            f.setDisplayAlternateCalendar(alternateCalendar);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118489a(f);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118490a(C32447c.this.f83199h);
            ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118266a(((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
            C32447c.this.f83198g.mo118372b(C32447c.this.f83197f, true);
            C32447c.this.f83196e = null;
        }
    };

    /* renamed from: m */
    public LocalCalAccountFragment.AbstractC32383a f83204m = new LocalCalAccountFragment.AbstractC32383a() {
        /* class com.ss.android.lark.calendar.impl.features.settings.C32447c.C324536 */

        @Override // com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment.AbstractC32383a
        /* renamed from: a */
        public void mo109659a() {
            C32447c.this.f83198g.mo118372b(C32447c.this.f83195d, false);
            C32447c.this.f83196e = null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment.AbstractC32383a
        /* renamed from: a */
        public void mo109660a(String str, boolean z) {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118492a(str, z);
        }
    };

    /* renamed from: n */
    private AbstractC32460d.AbstractC32461a.AbstractC32462a f83205n;

    /* renamed from: o */
    private AbstractC32460d.AbstractC32463b.AbstractC32464a f83206o;

    /* renamed from: p */
    private AbstractC32524a f83207p;

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.c$a */
    public interface AbstractC32456a {
        /* renamed from: a */
        void mo118368a();

        /* renamed from: a */
        void mo118369a(Intent intent);

        /* renamed from: a */
        void mo118370a(Fragment fragment, int i, boolean z);

        /* renamed from: a */
        void mo118371a(Fragment fragment, boolean z);

        /* renamed from: b */
        void mo118372b(Fragment fragment, boolean z);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.c$b */
    public interface AbstractC32457b {
        /* renamed from: a */
        void mo118554a(CalendarSettingViewData calendarSettingViewData);

        /* renamed from: b */
        void mo118555b(CalendarSettingViewData calendarSettingViewData);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.c$d */
    public class C32459d implements AbstractC32460d.AbstractC32463b.AbstractC32464a {
        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: h */
        public void mo118571h() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: j */
        public void mo118573j() {
            C32447c.this.f83198g.mo118368a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: i */
        public void mo118572i() {
            C32447c.this.f83198g.mo118369a(new Intent("android.settings.DATE_SETTINGS"));
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: e */
        public void mo118568e() {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118505i();
            C32447c cVar = C32447c.this;
            cVar.mo118549a(cVar.f83201j, ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: f */
        public void mo118569f() {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118506j();
            C32447c cVar = C32447c.this;
            cVar.mo118547a(cVar.f83202k, ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: g */
        public void mo118570g() {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118507k();
            C32447c cVar = C32447c.this;
            cVar.mo118548a(cVar.f83203l, ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: a */
        public void mo118560a() {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118487a();
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118494b();
            C32447c cVar = C32447c.this;
            cVar.mo118546a(cVar.f83200i, ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: b */
        public void mo118562b() {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118496c();
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118494b();
            C32447c cVar = C32447c.this;
            cVar.mo118546a(cVar.f83200i, ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: c */
        public void mo118564c() {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118498d();
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118494b();
            C32447c cVar = C32447c.this;
            cVar.mo118546a(cVar.f83200i, ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: d */
        public void mo118566d() {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118500e();
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118494b();
            C32447c cVar = C32447c.this;
            cVar.mo118546a(cVar.f83200i, ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118502f());
        }

        C32459d() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: a */
        public void mo118561a(boolean z) {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118508l();
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118493a(z);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118490a(C32447c.this.f83199h);
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: b */
        public void mo118563b(boolean z) {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118509m();
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118495b(z);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118490a(C32447c.this.f83199h);
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: c */
        public void mo118565c(boolean z) {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118511o();
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118499d(z);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118490a(C32447c.this.f83199h);
        }

        @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32463b.AbstractC32464a
        /* renamed from: d */
        public void mo118567d(boolean z) {
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118512p();
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118501e(z);
            ((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118490a(C32447c.this.f83199h);
        }
    }

    /* renamed from: e */
    private AbstractC32460d.AbstractC32461a.AbstractC32462a m123849e() {
        C32458c cVar = new C32458c();
        this.f83205n = cVar;
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC32460d.AbstractC32463b.AbstractC32464a createViewDelegate() {
        C32459d dVar = new C32459d();
        this.f83206o = dVar;
        return dVar;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m123851g();
    }

    /* renamed from: g */
    private void m123851g() {
        if (this.f83207p != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_CALENDAR_SETTINGS_CHANGE_NOTIFICATION, this.f83207p);
        }
    }

    /* renamed from: f */
    private void m123850f() {
        this.f83207p = new AbstractC32524a() {
            /* class com.ss.android.lark.calendar.impl.features.settings.$$Lambda$c$0b9pL0ZCq2DwmmIwJnW46UZ9DQ */

            @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
            public final void onPush(JSONObject jSONObject) {
                C32447c.this.m123848a((C32447c) jSONObject);
            }
        };
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_SETTINGS_CHANGE_NOTIFICATION, this.f83207p);
    }

    /* renamed from: a */
    public void mo118545a() {
        ((AbstractC32460d.AbstractC32461a) getModel()).mo118488a(new UIGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.calendar.impl.features.settings.C32447c.C324547 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118266a(((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118510n());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118268a(UIHelper.getString(R.string.Calendar_Common_FailedtoLoad2));
            }
        }));
    }

    /* renamed from: c */
    public void mo118552c() {
        View$OnClickListenerC31538b bVar = this.f83196e;
        if (bVar != null) {
            bVar.mo113714e();
        } else {
            ((AbstractC32460d.AbstractC32463b) getView()).mo118265a();
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((AbstractC32460d.AbstractC32463b) getView()).mo118266a(((AbstractC32460d.AbstractC32461a) getModel()).mo118510n());
        mo118545a();
        m123850f();
    }

    /* renamed from: d */
    public void mo118553d() {
        ((AbstractC32460d.AbstractC32461a) getModel()).mo118504h();
        if (((AbstractC32460d.AbstractC32461a) getModel()).mo118513q()) {
            ((AbstractC32460d.AbstractC32463b) getView()).mo118266a(((AbstractC32460d.AbstractC32461a) getModel()).mo118502f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.c$c */
    public class C32458c implements AbstractC32460d.AbstractC32461a.AbstractC32462a {
        C32458c() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m123848a(JSONObject jSONObject) {
        C30022a.f74884c.mo108449a(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.calendar.impl.features.settings.C32447c.C324558 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    ((AbstractC32460d.AbstractC32463b) C32447c.this.getView()).mo118266a(((AbstractC32460d.AbstractC32461a) C32447c.this.getModel()).mo118510n());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo118550a(boolean z) {
        ((AbstractC32460d.AbstractC32461a) getModel()).mo118502f().setBindGoogleCalendar(z);
    }

    /* renamed from: a */
    public void mo118546a(SettingDetailFragment.AbstractC32389a aVar, CalendarSettingViewData calendarSettingViewData) {
        SettingDetailFragment settingDetailFragment = this.f83192a;
        if (settingDetailFragment == null) {
            SettingDetailFragment settingDetailFragment2 = new SettingDetailFragment(aVar, calendarSettingViewData);
            this.f83192a = settingDetailFragment2;
            this.f83198g.mo118370a(settingDetailFragment2, ((AbstractC32460d.AbstractC32463b) getView()).mo118269b(), true);
        } else {
            settingDetailFragment.mo118351a(calendarSettingViewData);
            this.f83198g.mo118371a(this.f83192a, true);
        }
        this.f83196e = this.f83192a;
    }

    /* renamed from: a */
    public void mo118547a(SkinSettingFragment.AbstractC32394a aVar, CalendarSettingViewData calendarSettingViewData) {
        SkinSettingFragment skinSettingFragment = this.f83194c;
        if (skinSettingFragment == null) {
            SkinSettingFragment skinSettingFragment2 = new SkinSettingFragment(aVar, calendarSettingViewData);
            this.f83194c = skinSettingFragment2;
            this.f83198g.mo118370a(skinSettingFragment2, ((AbstractC32460d.AbstractC32463b) getView()).mo118269b(), false);
        } else {
            skinSettingFragment.mo118360a(calendarSettingViewData);
            this.f83198g.mo118371a(this.f83194c, false);
        }
        this.f83196e = this.f83194c;
    }

    /* renamed from: a */
    public void mo118548a(AlternateCalendarFragment.Delegate aVar, CalendarSettingViewData calendarSettingViewData) {
        AlternateCalendarFragment cVar = this.f83197f;
        if (cVar == null) {
            AlternateCalendarFragment cVar2 = new AlternateCalendarFragment(aVar, calendarSettingViewData.getDisplayAlternateCalendar());
            this.f83197f = cVar2;
            this.f83198g.mo118370a(cVar2, ((AbstractC32460d.AbstractC32463b) getView()).mo118269b(), true);
        } else {
            cVar.mo118385a(calendarSettingViewData.getDisplayAlternateCalendar());
            this.f83198g.mo118371a(this.f83197f, true);
        }
        this.f83196e = this.f83197f;
    }

    /* renamed from: a */
    public void mo118549a(WorkHourSettingFragment.Delegate aVar, CalendarSettingViewData calendarSettingViewData) {
        WorkHourSettingFragment eVar = this.f83193b;
        if (eVar == null) {
            WorkHourSettingFragment eVar2 = new WorkHourSettingFragment(aVar, calendarSettingViewData.getWorkHourData(), calendarSettingViewData.getFirstDayOfWeek());
            this.f83193b = eVar2;
            this.f83198g.mo118370a(eVar2, ((AbstractC32460d.AbstractC32463b) getView()).mo118269b(), false);
        } else {
            eVar.mo118575a(true);
            this.f83193b.mo118574a(calendarSettingViewData.getWorkHourData(), calendarSettingViewData.getFirstDayOfWeek());
            this.f83198g.mo118371a(this.f83193b, false);
        }
        this.f83196e = this.f83193b;
    }

    public C32447c(AbstractC32460d.AbstractC32461a aVar, AbstractC32460d.AbstractC32463b bVar, AbstractC32456a aVar2) {
        super(aVar, bVar);
        aVar.mo118491a(m123849e());
        this.f83198g = aVar2;
    }
}
