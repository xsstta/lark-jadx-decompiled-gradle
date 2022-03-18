package com.ss.android.lark.setting.service.usersetting.p2673a;

import com.bytedance.lark.pb.settings.v1.SetUserSettingRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.AbstractC29562i;
import com.ss.android.lark.biz.core.api.AbstractC29589z;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.service.usersetting.base.C54663a;
import com.ss.android.lark.setting.service.usersetting.base.C54667c;
import com.ss.android.lark.setting.service.usersetting.base.UserSetting;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.setting.service.usersetting.a.a */
public class C54644a {

    /* renamed from: a */
    private static Object f135022a = new Object();

    /* renamed from: b */
    private Map<AbstractC29562i, Object> f135023b;

    /* renamed from: c */
    private Map<AbstractC29589z, Object> f135024c;

    /* renamed from: com.ss.android.lark.setting.service.usersetting.a.a$a */
    private static class C54649a {

        /* renamed from: a */
        public static C54644a f135034a = new C54644a();
    }

    /* renamed from: a */
    public static C54644a m212113a() {
        return C54649a.f135034a;
    }

    private C54644a() {
        this.f135023b = new ConcurrentHashMap();
        this.f135024c = new ConcurrentHashMap();
        C54667c.m212228a().mo186760a(new C54663a.AbstractC54665a() {
            /* class com.ss.android.lark.setting.service.usersetting.p2673a.C54644a.C546451 */

            @Override // com.ss.android.lark.setting.service.usersetting.base.C54663a.AbstractC54665a
            /* renamed from: a */
            public void mo186665a(UserSetting userSetting, UserSetting userSetting2) {
                C54644a.this.mo186658a(userSetting, userSetting2);
            }
        });
    }

    /* renamed from: b */
    public BadgeStyle mo186661b() {
        UserSetting g = C54667c.m212228a().mo186766g();
        if (g == null) {
            return BadgeStyle.STRONG_REMIND;
        }
        return g.getBadgeStyle();
    }

    /* renamed from: c */
    public boolean mo186664c() {
        UserSetting g = C54667c.m212228a().mo186766g();
        if (g == null) {
            return true;
        }
        return g.isShowNavMuteBadge();
    }

    /* renamed from: b */
    public void mo186663b(AbstractC29589z zVar) {
        if (zVar != null) {
            this.f135024c.remove(zVar);
        }
    }

    /* renamed from: a */
    public void mo186656a(AbstractC29562i iVar) {
        if (iVar != null) {
            this.f135023b.put(iVar, f135022a);
        }
    }

    /* renamed from: b */
    public void mo186662b(AbstractC29562i iVar) {
        if (iVar != null) {
            this.f135023b.remove(iVar);
        }
    }

    /* renamed from: a */
    public void mo186657a(AbstractC29589z zVar) {
        if (zVar != null) {
            this.f135024c.put(zVar, f135022a);
        }
    }

    /* renamed from: a */
    public void mo186654a(final BadgeStyle badgeStyle, final IGetDataCallback<Boolean> iGetDataCallback) {
        C54667c.m212228a().mo186758a(new SetUserSettingRequest.C19209a().mo65586a(com.bytedance.lark.pb.settings.v1.BadgeStyle.fromValue(badgeStyle.getNumber())), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2673a.C54644a.C546462 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C54644a aVar = C54644a.this;
                aVar.mo186655a(aVar.mo186661b(), badgeStyle);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo186655a(BadgeStyle badgeStyle, BadgeStyle badgeStyle2) {
        if (Objects.equals(badgeStyle, badgeStyle2)) {
            Log.m165389i("BadgeStyleService", "badge style is not changed");
            return;
        }
        for (AbstractC29562i iVar : this.f135023b.keySet()) {
            iVar.mo105758a(badgeStyle2);
        }
    }

    /* renamed from: a */
    public void mo186658a(final UserSetting userSetting, final UserSetting userSetting2) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2673a.C54644a.RunnableC546484 */

            public void run() {
                BadgeStyle badgeStyle;
                UserSetting userSetting = userSetting2;
                if (userSetting != null) {
                    BadgeStyle badgeStyle2 = userSetting.getBadgeStyle();
                    UserSetting userSetting2 = userSetting;
                    if (userSetting2 == null) {
                        badgeStyle = null;
                    } else {
                        badgeStyle = userSetting2.getBadgeStyle();
                    }
                    C54644a.this.mo186655a(badgeStyle, badgeStyle2);
                    UserSetting userSetting3 = userSetting;
                    if (userSetting3 == null) {
                        C54644a.this.mo186659a((Boolean) null, Boolean.valueOf(userSetting2.isShowNavMuteBadge()));
                    } else {
                        C54644a.this.mo186659a(Boolean.valueOf(userSetting3.isShowNavMuteBadge()), Boolean.valueOf(userSetting2.isShowNavMuteBadge()));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo186659a(Boolean bool, Boolean bool2) {
        if (bool != bool2) {
            for (AbstractC29589z zVar : this.f135024c.keySet()) {
                zVar.onMuteBadgeShowStateChanged(bool2.booleanValue());
            }
        }
    }

    /* renamed from: a */
    public void mo186660a(boolean z, final IGetDataCallback<Boolean> iGetDataCallback) {
        C54667c.m212228a().mo186758a(new SetUserSettingRequest.C19209a().mo65595d(Boolean.valueOf(z)), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2673a.C54644a.C546473 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }
}
