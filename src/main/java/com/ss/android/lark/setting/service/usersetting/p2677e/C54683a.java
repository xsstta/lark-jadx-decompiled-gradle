package com.ss.android.lark.setting.service.usersetting.p2677e;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.service.usersetting.base.C54663a;
import com.ss.android.lark.setting.service.usersetting.base.C54667c;
import com.ss.android.lark.setting.service.usersetting.base.UserSetting;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.setting.service.usersetting.e.a */
public class C54683a {

    /* renamed from: b */
    private static Object f135089b = new Object();

    /* renamed from: a */
    public ConcurrentHashMap<C54115c.AbstractC54118a, Object> f135090a;

    /* renamed from: com.ss.android.lark.setting.service.usersetting.e.a$a */
    private static class C54686a {

        /* renamed from: a */
        public static C54683a f135094a = new C54683a();
    }

    /* renamed from: a */
    public static C54683a m212257a() {
        return C54686a.f135094a;
    }

    private C54683a() {
        this.f135090a = new ConcurrentHashMap<>();
        C54667c.m212228a().mo186760a(new C54663a.AbstractC54665a() {
            /* class com.ss.android.lark.setting.service.usersetting.p2677e.C54683a.C546841 */

            @Override // com.ss.android.lark.setting.service.usersetting.base.C54663a.AbstractC54665a
            /* renamed from: a */
            public void mo186665a(UserSetting userSetting, UserSetting userSetting2) {
                C54683a.this.mo186787a(userSetting2);
            }
        });
    }

    /* renamed from: a */
    public void mo186786a(C54115c.AbstractC54118a aVar) {
        if (aVar != null) {
            this.f135090a.put(aVar, f135089b);
        }
    }

    /* renamed from: b */
    public void mo186788b(C54115c.AbstractC54118a aVar) {
        if (aVar != null) {
            this.f135090a.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo186787a(final UserSetting userSetting) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2677e.C54683a.RunnableC546852 */

            public void run() {
                for (C54115c.AbstractC54118a aVar : C54683a.this.f135090a.keySet()) {
                    aVar.mo178097a(userSetting.getIsMessageNotificationsOff());
                }
            }
        });
    }
}
