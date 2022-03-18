package com.ss.android.lark.calendar.impl.p1437b.p1439b;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendarview.diskcache.DiskCacheManager;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.b.b.b */
public class C30086b implements IBmSetting {

    /* renamed from: a */
    public volatile CalendarSetting f75006a = new CalendarSetting();

    /* renamed from: b */
    public volatile boolean f75007b = true;

    /* renamed from: c */
    public boolean f75008c;

    /* renamed from: d */
    public boolean f75009d;

    /* renamed from: e */
    public volatile boolean f75010e;

    /* renamed from: f */
    public DiskCacheManager f75011f = new DiskCacheManager();

    /* renamed from: g */
    private volatile boolean f75012g;

    /* renamed from: h */
    private AbstractC32595g f75013h = C32583e.m124816a();

    /* renamed from: i */
    private CallbackManager f75014i = new CallbackManager();

    /* renamed from: j */
    private AbstractC32524a f75015j;

    /* renamed from: k */
    private List<AbstractC30090a> f75016k = new ArrayList();

    /* renamed from: com.ss.android.lark.calendar.impl.b.b.b$a */
    public interface AbstractC30090a {
        void onGetSucceed(CalendarSetting calendarSetting);
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: a */
    public void mo108448a() {
        m111328e();
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: c */
    public CalendarSetting mo108456c() {
        return this.f75006a;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m111331g() {
        this.f75016k.clear();
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: b */
    public void mo108453b() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.p1437b.p1439b.$$Lambda$b$s0MkHB4VrkvKT0aPWAda6vgNsrk */

            public final void run() {
                C30086b.this.m111331g();
            }
        });
        this.f75010e = false;
        this.f75007b = true;
    }

    /* renamed from: d */
    public void mo108460d() {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.p1437b.p1439b.$$Lambda$b$q7ivsSxNNT3uvRmxJzpra5Aat0I */

            public final void run() {
                C30086b.this.m111330f();
            }
        });
    }

    /* renamed from: e */
    private void m111328e() {
        this.f75015j = new AbstractC32524a() {
            /* class com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.C300882 */

            @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
            public void onPush(JSONObject jSONObject) {
                if (C30086b.this.f75009d || C30086b.this.f75008c) {
                    Log.m165389i("SettingServiceModel", C32673y.m125374b("pushSetting"));
                    C30086b.this.mo108449a((IGetDataCallback<Boolean>) null);
                    return;
                }
                C30086b.this.f75007b = true;
                Log.m165389i("SettingServiceModel", C32673y.m125374b("dirty_pushSetting"));
            }
        };
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_CALENDAR_SETTINGS_CHANGE_NOTIFICATION, this.f75015j);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m111330f() {
        for (AbstractC30090a aVar : this.f75016k) {
            aVar.onGetSucceed(this.f75006a);
        }
        this.f75016k.clear();
    }

    /* renamed from: e */
    private void m111329e(boolean z) {
        mo108458a(null, z);
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: a */
    public void mo108449a(IGetDataCallback<Boolean> iGetDataCallback) {
        mo108458a(iGetDataCallback, false);
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: b */
    public void mo108454b(CalendarSetting calendarSetting) {
        if (!this.f75012g) {
            this.f75006a = calendarSetting;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: a */
    public void mo108451a(CalendarSetting calendarSetting) {
        this.f75006a = calendarSetting;
        this.f75012g = true;
        this.f75011f.mo111480a(this.f75006a);
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: c */
    public void mo108457c(boolean z) {
        this.f75009d = z;
        if (z && this.f75007b) {
            mo108449a((IGetDataCallback<Boolean>) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m111326b(final AbstractC30090a aVar) {
        if (this.f75010e) {
            this.f75016k.add(aVar);
        } else {
            mo108449a(new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.C300893 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    aVar.onGetSucceed(C30086b.this.f75006a);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    aVar.onGetSucceed(C30086b.this.f75006a);
                }
            });
        }
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: a */
    public void mo108450a(AbstractC30090a aVar) {
        if (aVar != null) {
            if (!this.f75007b) {
                aVar.onGetSucceed(this.f75006a);
            } else {
                UICallbackExecutor.execute(new Runnable(aVar) {
                    /* class com.ss.android.lark.calendar.impl.p1437b.p1439b.$$Lambda$b$Nwe0eAHZ9ZIPYhM4ajxSCCBDhag */
                    public final /* synthetic */ C30086b.AbstractC30090a f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C30086b.this.m111326b((C30086b) this.f$1);
                    }
                });
            }
        }
    }

    /* renamed from: d */
    private void m111327d(boolean z) {
        Log.m165389i("SettingServiceModel", C32673y.m125376b(Long.toString(new Date().getTime()), "syncGetLoadSettingItems", new String[0]));
        this.f75010e = true;
        CalendarSetting c = this.f75013h.mo119043c();
        mo108460d();
        this.f75010e = false;
        if (c != null) {
            mo108459a(c, z, true);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: b */
    public void mo108455b(boolean z) {
        this.f75008c = z;
        if (z && this.f75007b) {
            mo108449a((IGetDataCallback<Boolean>) null);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting
    /* renamed from: a */
    public void mo108452a(boolean z) {
        m111327d(z);
        m111329e(z);
    }

    /* renamed from: a */
    public void mo108458a(final IGetDataCallback<Boolean> iGetDataCallback, final boolean z) {
        final String l = Long.toString(new Date().getTime());
        Log.m165389i("SettingServiceModel", C32673y.m125376b(l, "asyncLoadServerSetting", new String[0]));
        C300871 r0 = new IGetDataCallback<CalendarSetting>("asyncLoadServerSetting") {
            /* class com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.C300871 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SettingServiceModel", C32673y.m125370a(l, "asyncLoadServerSetting", errorResult));
                C30086b.this.mo108460d();
                C30086b.this.f75010e = false;
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(CalendarSetting calendarSetting) {
                String str;
                if (calendarSetting == null) {
                    str = "null";
                } else {
                    str = calendarSetting.toString();
                }
                boolean z = true;
                Log.m165389i("SettingServiceModel", C32673y.m125373a(l, "asyncLoadServerSetting", "settings", str));
                if (calendarSetting != null) {
                    C30086b.this.mo108459a(calendarSetting, z, false);
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    if (calendarSetting == null) {
                        z = false;
                    }
                    iGetDataCallback.onSuccess(Boolean.valueOf(z));
                }
                C30086b.this.mo108460d();
                C30086b.this.f75010e = false;
                C30086b.this.f75011f.mo111480a(C30086b.this.f75006a);
            }
        };
        this.f75010e = true;
        this.f75013h.mo119044c(this.f75014i.wrapAndAddGetDataCallback(r0));
    }

    /* renamed from: a */
    public void mo108459a(CalendarSetting calendarSetting, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this.f75006a.getSkinType() != calendarSetting.getSkinType()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f75006a.isShowPastEventsMask() != calendarSetting.isShowPastEventsMask()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f75006a.getWeekStartDay().getNumber() != calendarSetting.getWeekStartDay().getNumber()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f75006a.getDisplayAlternateCalendar() != calendarSetting.getDisplayAlternateCalendar()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f75006a.getDefaultEventDuration() != calendarSetting.getDefaultEventDuration()) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f75006a = calendarSetting;
        this.f75012g = true;
        this.f75007b = false;
        if (!z) {
            SettingChangedEvent mVar = new SettingChangedEvent(z3, z4, z5, z6, z7, z2);
            if (z5 || z6 || mVar.mo118647a() || z7) {
                EventBus.getDefault().trigger(mVar);
            }
        }
    }
}
