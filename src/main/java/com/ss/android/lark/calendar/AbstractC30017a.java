package com.ss.android.lark.calendar;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.api.AbstractC30061a;
import com.ss.android.lark.calendar.api.AbstractC30064b;
import com.ss.android.lark.calendar.api.entity.CalendarNotice;
import com.ss.android.lark.calendar.api.p1433a.AbstractC30062a;
import com.ss.android.lark.calendar.api.p1433a.AbstractC30063b;
import com.ss.android.lark.calendar.api.p1434b.AbstractC30065a;
import com.ss.android.lark.calendar.api.p1434b.AbstractC30066b;
import com.ss.android.lark.calendar.api.search.ICalendarModuleForSearch;
import com.ss.android.lark.calendar.dependency.idependency.IAccountChangeDependency;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.LookActivity;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.ArrangeGroupActivityLauncher;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.ArrangeMeetingLauncher;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.laucher.Scene;
import com.ss.android.lark.calendar.impl.features.calendars.CalendarLauncher;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorActivity;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarActivity;
import com.ss.android.lark.calendar.impl.features.calendars.profile.CalendarProfileEntrance;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSideBarEntrance;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.features.common.widget.guide.GuideConstants;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.features.meeting.C31941a;
import com.ss.android.lark.calendar.impl.features.meeting.C31944b;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.MeetingRoomSignInEntrance;
import com.ss.android.lark.calendar.impl.features.p1440a.AbstractC30093b;
import com.ss.android.lark.calendar.impl.features.p1440a.C30091a;
import com.ss.android.lark.calendar.impl.features.preempt.PreemptActivity;
import com.ss.android.lark.calendar.impl.features.remind.notification.NotificationHelper;
import com.ss.android.lark.calendar.impl.features.search.serviceimpl.CalendarModuleForSearch;
import com.ss.android.lark.calendar.impl.features.settings.CalendarSettingActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32485a;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32491i;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32660m;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.a */
public abstract class AbstractC30017a implements AbstractC30061a {
    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: h */
    public void mo108134h() {
        GeneralHitPoint.m124277v();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: i */
    public void mo108135i() {
        GeneralHitPoint.m124275u();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public boolean mo108122a(String str) {
        return C32660m.m125337a(str);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108113a(Context context, String str, long j) {
        C31238b.m116873a(context, str, j);
        CalendarHitPoint.m124113O();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108116a(Context context, String str, String str2, long j) {
        C31238b.m116874a(context, str, str2, j);
    }

    /* renamed from: a */
    public void mo108118a(Context context, String str, String str2, String str3) {
        EditActivityEntrance.m118932a(context, str, str2, str3);
    }

    /* renamed from: a */
    public void mo108119a(Context context, String str, String str2, String str3, String str4) {
        EditActivityEntrance.m118933a(context, str, str2, str3, str4);
    }

    /* renamed from: a */
    public void mo108120a(Context context, String str, String str2, boolean z) {
        if (!C30022a.f74883b.mo112687A()) {
            AbstractC30023a a = C30022a.f74882a.appRouter().mo108210a(CalendarCreatorActivity.class);
            if (z) {
                a.mo108153a("serializable_from_type", "new_calendar_type").mo108153a("calendar_summary", str);
            } else {
                a.mo108153a("serializable_from_type", "manager_calendar_type").mo108153a("calendar_id", str2).mo108154a("from_applink", true);
            }
            a.mo108156b(context);
        } else if (z) {
            CalendarLauncher.m112281a(context, str);
        } else if (!TextUtils.isEmpty(str2)) {
            CalendarLauncher.m112282b(context, str2);
        }
    }

    /* renamed from: a */
    public void mo108117a(Context context, String str, String str2, long j, long j2, String str3, String str4) {
        if ("share".equals(str4)) {
            C31238b.m116876a(context, str, str2, j, j2, str3);
        } else if ("uniqueFields".equals(str4)) {
            C31238b.m116879b(context, str, str2, j, j2);
        } else if (!TextUtils.isEmpty(str3)) {
            C31238b.m116876a(context, str, str2, j, j2, str3);
        } else {
            C31238b.m116879b(context, str, str2, j, j2);
        }
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108115a(Context context, String str, String str2) {
        MeetingRoomSignInEntrance.m122430a(context, str, str2);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108121a(Context context, String str, List<String> list) {
        EditActivityEntrance.m118929a(context, -1, -1, str, null, list != null ? new ArrayList(list) : null, "");
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: d */
    public AbstractC30064b mo108130d() {
        return new AbstractC30064b() {
            /* class com.ss.android.lark.calendar.AbstractC30017a.C300192 */

            @Override // com.ss.android.lark.calendar.api.AbstractC30064b
            /* renamed from: b */
            public void mo108144b() {
                CalendarHitPoint.m124140i();
            }

            @Override // com.ss.android.lark.calendar.api.AbstractC30064b
            /* renamed from: c */
            public void mo108146c() {
                CalendarHitPoint.m124099A();
            }

            @Override // com.ss.android.lark.calendar.api.AbstractC30064b
            /* renamed from: a */
            public void mo108140a() {
                EventBus.getDefault().trigger(new C32491i());
            }

            @Override // com.ss.android.lark.calendar.api.AbstractC30064b
            /* renamed from: b */
            public void mo108145b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                CalendarSDKService.m124698a(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.calendar.api.AbstractC30064b
            /* renamed from: a */
            public void mo108141a(String str, final IGetDataCallback<String> iGetDataCallback) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                C32583e.m124816a().mo119042b(arrayList, new IGetDataCallback<Map<String, AbstractC30026d>>() {
                    /* class com.ss.android.lark.calendar.AbstractC30017a.C300192.C300212 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                    }

                    /* renamed from: a */
                    public void onSuccess(Map<String, AbstractC30026d> map) {
                        if (map != null && map.size() > 0) {
                            iGetDataCallback.onSuccess(((AbstractC30026d) new ArrayList(map.values()).get(0)).getId());
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.calendar.api.AbstractC30064b
            /* renamed from: a */
            public boolean mo108143a(Uri uri, Context context) {
                if (!"/calendar/gcalbind".equals(uri.getPath())) {
                    return false;
                }
                C30022a.f74882a.appRouter().mo108210a(ImportCalendarActivity.class).mo108154a("binded", uri.getBooleanQueryParameter("binded", false)).mo108154a("fromweb", true).mo108156b(context);
                return true;
            }

            @Override // com.ss.android.lark.calendar.api.AbstractC30064b
            /* renamed from: a */
            public void mo108142a(String str, String str2, long j, String str3, Boolean bool, final IGetDataCallback<Void> iGetDataCallback) {
                C32533b.m124620a().mo118867a(str, str2, j, str3, bool, new IGetDataCallback<List<CalendarEvent>>() {
                    /* class com.ss.android.lark.calendar.AbstractC30017a.C300192.C300201 */

                    /* renamed from: a */
                    public void onSuccess(List<CalendarEvent> list) {
                        iGetDataCallback.onSuccess(null);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }
        };
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: f */
    public boolean mo108132f() {
        return C30022a.f74883b.mo112697e();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: g */
    public boolean mo108133g() {
        return C30022a.f74883b.mo112695c();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: j */
    public ICalendarModuleForSearch mo108136j() {
        return new CalendarModuleForSearch();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: k */
    public List<String> mo108137k() {
        return GuideConstants.m116643a();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: l */
    public boolean mo108138l() {
        return C30022a.f74883b.mo112708p();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: c */
    public AbstractC30093b mo108129c() {
        return C30091a.m111347a();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: e */
    public String mo108131e() {
        return C30022a.f74882a.coreModuleDependency().mo108231a();
    }

    public AbstractC30017a() {
        C30022a.f74882a.accountChangeDependency().mo108149a(new IAccountChangeDependency.IAccountChangeListner() {
            /* class com.ss.android.lark.calendar.$$Lambda$a$eEWIGQ8Xk8yIVXNFuGCWm1sBeQ */

            @Override // com.ss.android.lark.calendar.dependency.idependency.IAccountChangeDependency.IAccountChangeListner
            public final void onAccountChange() {
                AbstractC30017a.m270301lambda$eEWIGQ8Xk8yIVXNFuGCWm1sBeQ(AbstractC30017a.this);
            }
        });
        mo108106a();
    }

    /* renamed from: a */
    public void mo108106a() {
        C30022a.f74884c.mo108448a();
    }

    /* renamed from: b */
    public void mo120369m() {
        Log.m165389i("CalendarModule", C32673y.m125378d("calendarModuleAccountRefresh"));
        C30022a.f74884c.mo108453b();
        C30076a.m111290a().mo108429b();
        C30810k.m114955a().mo111643b();
        C30076a.m111290a().mo108431c();
        C32583e.m124816a().mo119040b();
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.calendar.AbstractC30017a.RunnableC300181 */

            public void run() {
                EventBus.getDefault().trigger(new C32485a());
                C30022a.f74884c.mo108452a(false);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public PendingIntent mo108103a(CalendarNotice calendarNotice) {
        return NotificationHelper.m123030a(calendarNotice);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: c */
    public Intent mo108128c(String str) {
        return NotificationHelper.m123032a(str);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: b */
    public List<String> mo108124b(String str) {
        return C32660m.m125338b(str);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108108a(Activity activity) {
        C30022a.f74882a.appRouter().mo108210a(CalendarSettingActivity.class).mo108154a("calendar_setting_is_launched_by_system_setting", true).mo108156b(activity);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108107a(int i, String str) {
        if (i == 1) {
            GeneralHitPoint.m124274t(str);
        } else if (i == 2) {
            GeneralHitPoint.m124278v(str);
        } else {
            GeneralHitPoint.m124276u(str);
        }
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108109a(Activity activity, String str) {
        CalendarPerfMonitor.m124415a("key_freebusy_view", "cal_perf_common", "scene_type", "freebusy_view", "extra_name", "profile");
        C30022a.f74882a.appRouter().mo108210a(LookActivity.class).mo108153a("chatter_id", str).mo108156b(activity);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108112a(Context context, String str) {
        C30022a.f74882a.appRouter().mo108210a(PreemptActivity.class).mo108153a("preempt_resource_id", str).mo108156b(context);
    }

    /* renamed from: b */
    public void mo108126b(Context context, String str, String str2) {
        CalendarSideBarEntrance.m113512a(context, str, str2);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: b */
    public Intent mo108123b(Context context, String str, long j) {
        return C31238b.m116877b(context, str, j);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public AbstractC30063b mo108104a(Activity activity, String str, AbstractC30062a aVar) {
        return C31941a.m121538a(activity, str, aVar);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108110a(Activity activity, String str, boolean z) {
        CalendarPerfMonitor.m124415a("key_freebusy_view", "cal_perf_common", "scene_type", "freebusy_view", "extra_name", "chat");
        new ArrangeGroupActivityLauncher(activity, str, z).mo108972a();
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public AbstractC30066b mo108105a(Activity activity, String str, String str2, AbstractC30065a aVar) {
        return C31944b.m121548a(activity, str, str2, aVar);
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108114a(Context context, String str, long j, long j2, boolean z) {
        EditActivityEntrance.m118931a(context, str, j, j2, z);
    }

    /* renamed from: b */
    public void mo108127b(Context context, String str, String str2, String str3, String str4) {
        if (C30022a.f74883b.mo112687A()) {
            CalendarLauncher.m112283b(context, str, str3, str2, str4);
        } else {
            CalendarProfileEntrance.m112921a(context, str, str2);
        }
    }

    @Override // com.ss.android.lark.calendar.api.AbstractC30061a
    /* renamed from: a */
    public void mo108111a(Activity activity, String str, boolean z, String str2, ArrayList<String> arrayList, long j, long j2, boolean z2, Scene scene) {
        new ArrangeMeetingLauncher(activity, str, str2, arrayList, j, j2, z2, z, scene).mo108973a();
    }
}
