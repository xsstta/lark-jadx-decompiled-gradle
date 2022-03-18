package com.ss.android.lark.setting.service.usersetting.p2679g;

import android.text.format.DateFormat;
import com.bytedance.lark.pb.settings.v1.SetUserSettingRequest;
import com.bytedance.lark.pb.settings.v1.TimeFormatSetting;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.service.impl.C54611c;
import com.ss.android.lark.setting.service.usersetting.base.C54663a;
import com.ss.android.lark.setting.service.usersetting.base.C54667c;
import com.ss.android.lark.setting.service.usersetting.base.UserSetting;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.setting.service.usersetting.g.a */
public class C54697a {

    /* renamed from: b */
    private static Object f135113b = new Object();

    /* renamed from: a */
    public Map<ao, Object> f135114a;

    /* renamed from: com.ss.android.lark.setting.service.usersetting.g.a$a */
    private static class C54701a {

        /* renamed from: a */
        public static C54697a f135121a = new C54697a();
    }

    /* renamed from: a */
    public static C54697a m212281a() {
        return C54701a.f135121a;
    }

    private C54697a() {
        this.f135114a = new ConcurrentHashMap();
        C54667c.m212228a().mo186760a(new C54663a.AbstractC54665a() {
            /* class com.ss.android.lark.setting.service.usersetting.p2679g.C54697a.C546981 */

            @Override // com.ss.android.lark.setting.service.usersetting.base.C54663a.AbstractC54665a
            /* renamed from: a */
            public void mo186665a(UserSetting userSetting, UserSetting userSetting2) {
                C54697a.this.mo186809a(userSetting, userSetting2);
            }
        });
    }

    /* renamed from: b */
    public void mo186810b() {
        TimeFormatSetting c = mo186812c();
        Log.m165389i("TimeFormatSetting", "Manually invoke push to update the time system");
        C54611c.m211920a().mo186578a(c);
    }

    /* renamed from: c */
    public TimeFormatSetting mo186812c() {
        UserSetting g = C54667c.m212228a().mo186766g();
        if (g == null) {
            return mo186805a((TimeFormatSetting) null);
        }
        return mo186805a(g.getTimeFormatSetting());
    }

    /* renamed from: a */
    public void mo186806a(final IGetDataCallback<TimeFormatSetting> iGetDataCallback) {
        C54667c.m212228a().mo186759a(new IGetDataCallback<UserSetting>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2679g.C54697a.C546992 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(UserSetting userSetting) {
                TimeFormatSetting a = C54697a.this.mo186805a(userSetting.getTimeFormatSetting());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(a);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo186811b(ao aoVar) {
        if (aoVar != null) {
            this.f135114a.remove(aoVar);
        }
    }

    /* renamed from: a */
    public void mo186808a(ao aoVar) {
        if (aoVar != null) {
            this.f135114a.put(aoVar, f135113b);
        }
    }

    /* renamed from: a */
    public TimeFormatSetting mo186805a(TimeFormatSetting timeFormatSetting) {
        if (timeFormatSetting == null) {
            timeFormatSetting = new TimeFormatSetting();
            timeFormatSetting.mo105511a(TimeFormatSetting.TimeFormat.UNKNOWN);
        }
        if (timeFormatSetting.mo105510a() == TimeFormatSetting.TimeFormat.UNKNOWN) {
            if (DateFormat.is24HourFormat(C54115c.m210080a().mo178267C())) {
                timeFormatSetting.mo105511a(TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR);
            } else {
                timeFormatSetting.mo105511a(TimeFormatSetting.TimeFormat.TWELVE_HOUR);
            }
        }
        return timeFormatSetting;
    }

    /* renamed from: a */
    public void mo186807a(TimeFormatSetting timeFormatSetting, IGetDataCallback<Boolean> iGetDataCallback) {
        C54667c.m212228a().mo186758a(new SetUserSettingRequest.C19209a().mo65589a(new com.bytedance.lark.pb.settings.v1.TimeFormatSetting(TimeFormatSetting.TimeFormat.fromValue(timeFormatSetting.mo105510a().getNumber()))), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo186809a(final UserSetting userSetting, final UserSetting userSetting2) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2679g.C54697a.RunnableC547003 */

            public void run() {
                com.ss.android.lark.biz.core.api.TimeFormatSetting timeFormatSetting;
                UserSetting userSetting = userSetting2;
                if (userSetting != null) {
                    com.ss.android.lark.biz.core.api.TimeFormatSetting timeFormatSetting2 = userSetting.getTimeFormatSetting();
                    UserSetting userSetting2 = userSetting;
                    if (userSetting2 == null) {
                        timeFormatSetting = C54697a.this.mo186805a((com.ss.android.lark.biz.core.api.TimeFormatSetting) null);
                    } else {
                        timeFormatSetting = userSetting2.getTimeFormatSetting();
                    }
                    if (Objects.equals(timeFormatSetting, timeFormatSetting2)) {
                        Log.m165389i("TimeFormatSetting", "time format is not changed");
                        return;
                    }
                    for (ao aoVar : C54697a.this.f135114a.keySet()) {
                        aoVar.onTimeFormatChange(timeFormatSetting2);
                    }
                }
            }
        });
    }
}
