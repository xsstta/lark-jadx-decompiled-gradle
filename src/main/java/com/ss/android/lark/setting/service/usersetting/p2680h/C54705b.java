package com.ss.android.lark.setting.service.usersetting.p2680h;

import com.bytedance.lark.pb.settings.v1.SetUserSettingRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dto.C54124e;
import com.ss.android.lark.setting.service.impl.C54608b;
import com.ss.android.lark.setting.service.usersetting.base.C54663a;
import com.ss.android.lark.setting.service.usersetting.base.C54667c;
import com.ss.android.lark.setting.service.usersetting.base.UserSetting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.setting.service.usersetting.h.b */
public class C54705b {

    /* renamed from: c */
    private static final Object f135126c = new Object();

    /* renamed from: a */
    public Map<ar, Object> f135127a;

    /* renamed from: b */
    public ConcurrentHashMap<C54115c.AbstractC54121d, Object> f135128b;

    /* renamed from: com.ss.android.lark.setting.service.usersetting.h.b$a */
    private static class C54709a {

        /* renamed from: a */
        public static C54705b f135135a = new C54705b();
    }

    /* renamed from: a */
    public static C54705b m212300a() {
        return C54709a.f135135a;
    }

    /* renamed from: b */
    public C54124e mo186828b() {
        return m212301b(C54667c.m212228a().mo186764e());
    }

    /* renamed from: c */
    public C54124e mo186831c() {
        return m212301b(C54667c.m212228a().mo186766g());
    }

    /* renamed from: d */
    public boolean mo186832d() {
        C54124e c = mo186831c();
        if (c == null) {
            return false;
        }
        return c.f134009b;
    }

    /* renamed from: e */
    public boolean mo186833e() {
        C54124e c = mo186831c();
        if (c == null) {
            return false;
        }
        return c.f134008a;
    }

    private C54705b() {
        this.f135127a = new ConcurrentHashMap();
        this.f135128b = new ConcurrentHashMap<>();
        C54667c.m212228a().mo186760a(new C54663a.AbstractC54665a() {
            /* class com.ss.android.lark.setting.service.usersetting.p2680h.C54705b.C547061 */

            @Override // com.ss.android.lark.setting.service.usersetting.base.C54663a.AbstractC54665a
            /* renamed from: a */
            public void mo186665a(UserSetting userSetting, UserSetting userSetting2) {
                C54705b.this.mo186826a(userSetting, userSetting2);
                C54705b.this.mo186825a(userSetting2);
            }
        });
    }

    /* renamed from: b */
    public void mo186830b(C54115c.AbstractC54121d dVar) {
        if (dVar != null) {
            this.f135128b.remove(dVar);
        }
    }

    /* renamed from: a */
    public void mo186823a(ar arVar) {
        if (arVar != null) {
            this.f135127a.put(arVar, f135126c);
        }
    }

    /* renamed from: b */
    private C54124e m212301b(UserSetting userSetting) {
        if (userSetting != null) {
            return new C54124e(userSetting.getDoNotDisturbEndTime());
        }
        Log.m165383e("ZenSettingServiceImpl", "parse zen setting error");
        return null;
    }

    /* renamed from: a */
    public void mo186824a(C54115c.AbstractC54121d dVar) {
        if (dVar != null) {
            this.f135128b.put(dVar, f135126c);
        }
    }

    /* renamed from: b */
    public void mo186829b(ar arVar) {
        if (arVar != null) {
            this.f135127a.remove(arVar);
        }
    }

    /* renamed from: a */
    public void mo186825a(final UserSetting userSetting) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2680h.C54705b.RunnableC547083 */

            public void run() {
                boolean z;
                UserSetting userSetting = userSetting;
                if (userSetting != null) {
                    z = new C54124e(userSetting.getDoNotDisturbEndTime()).f134009b;
                } else {
                    z = false;
                }
                for (ar arVar : C54705b.this.f135127a.keySet()) {
                    arVar.mo105603a(z);
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo186827a(long j) {
        if (j != 0 && j > C54608b.m211917b().mo186513a(30000)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo186822a(long j, IGetDataCallback<Boolean> iGetDataCallback) {
        C54667c.m212228a().mo186758a(new SetUserSettingRequest.C19209a().mo65591a(Long.valueOf(C54608b.m211917b().mo186512a() + j)), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo186826a(final UserSetting userSetting, final UserSetting userSetting2) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2680h.C54705b.RunnableC547072 */

            public void run() {
                UserSetting userSetting = userSetting2;
                if (userSetting != null) {
                    long doNotDisturbEndTime = userSetting.getDoNotDisturbEndTime();
                    UserSetting userSetting2 = userSetting;
                    if (userSetting2 == null || userSetting2.getDoNotDisturbEndTime() != doNotDisturbEndTime) {
                        for (C54115c.AbstractC54121d dVar : C54705b.this.f135128b.keySet()) {
                            dVar.mo178095a(new C54124e(doNotDisturbEndTime));
                        }
                        return;
                    }
                    Log.m165389i("ZenSettingServiceImpl", "time format is not changed");
                }
            }
        });
    }
}
