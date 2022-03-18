package com.ss.android.lark.setting.service.usersetting.p2678f;

import com.bytedance.lark.pb.settings.v1.SetUserSettingRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.dto.NotificationSettingV2;
import com.ss.android.lark.setting.dto.NotificationSettingWrapper;
import com.ss.android.lark.setting.service.impl.C54607a;
import com.ss.android.lark.setting.service.usersetting.base.C54663a;
import com.ss.android.lark.setting.service.usersetting.base.C54667c;
import com.ss.android.lark.setting.service.usersetting.base.UserSetting;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.setting.service.usersetting.f.a */
public class C54687a {

    /* renamed from: b */
    private static Object f135095b = new Object();

    /* renamed from: a */
    public ConcurrentHashMap<C54115c.AbstractC54119b, Object> f135096a;

    /* renamed from: com.ss.android.lark.setting.service.usersetting.f.a$a */
    private static class C54696a {

        /* renamed from: a */
        public static C54687a f135112a = new C54687a();
    }

    /* renamed from: a */
    public static C54687a m212262a() {
        return C54696a.f135112a;
    }

    private C54687a() {
        this.f135096a = new ConcurrentHashMap<>();
        C54667c.m212228a().mo186760a(new C54663a.AbstractC54665a() {
            /* class com.ss.android.lark.setting.service.usersetting.p2678f.C54687a.C546881 */

            @Override // com.ss.android.lark.setting.service.usersetting.base.C54663a.AbstractC54665a
            /* renamed from: a */
            public void mo186665a(UserSetting userSetting, UserSetting userSetting2) {
                C54687a.this.mo186792a(userSetting, userSetting2);
            }
        });
    }

    /* renamed from: a */
    private void m212263a(final IGetDataCallback<NotificationSetting> iGetDataCallback) {
        C54667c.m212228a().mo186759a(new IGetDataCallback<UserSetting>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2678f.C54687a.C546892 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(UserSetting userSetting) {
                NotificationSetting notificationSetting = userSetting.getNotificationSetting();
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(notificationSetting);
                }
            }
        });
    }

    /* renamed from: c */
    private void m212265c(final IGetDataCallback<NotificationSettingV2> iGetDataCallback) {
        C54667c.m212228a().mo186759a(new IGetDataCallback<UserSetting>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2678f.C54687a.C546914 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(UserSetting userSetting) {
                NotificationSettingV2 notificationSettingV2 = userSetting.getNotificationSettingV2();
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(notificationSettingV2);
                }
            }
        });
    }

    /* renamed from: b */
    public void mo186794b(C54115c.AbstractC54119b bVar) {
        if (bVar != null) {
            this.f135096a.remove(bVar);
        }
    }

    /* renamed from: b */
    private void m212264b(final IGetDataCallback<NotificationSetting> iGetDataCallback) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2678f.C54687a.RunnableC546903 */

            public void run() {
                UserSetting f = C54667c.m212228a().mo186765f();
                if (f == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("User setting is null"));
                    }
                } else if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(f.getNotificationSetting());
                }
            }
        });
    }

    /* renamed from: d */
    private void m212266d(final IGetDataCallback<NotificationSettingV2> iGetDataCallback) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2678f.C54687a.RunnableC546925 */

            public void run() {
                UserSetting f = C54667c.m212228a().mo186765f();
                if (f == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("User setting is null"));
                    }
                } else if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(f.getNotificationSettingV2());
                }
            }
        });
    }

    /* renamed from: e */
    private void m212267e(final IGetDataCallback<Boolean> iGetDataCallback) {
        Log.m165389i("GET_USER_SETTING", "get message notifications off calls from net");
        C54667c.m212228a().mo186759a(new IGetDataCallback<UserSetting>() {
            /* class com.ss.android.lark.setting.service.usersetting.p2678f.C54687a.C546936 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(UserSetting userSetting) {
                Boolean valueOf = Boolean.valueOf(userSetting.getIsMessageNotificationsOff());
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(valueOf);
                }
            }
        });
    }

    /* renamed from: f */
    private void m212268f(final IGetDataCallback<Boolean> iGetDataCallback) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2678f.C54687a.RunnableC546947 */

            public void run() {
                UserSetting f = C54667c.m212228a().mo186765f();
                if (f == null) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("User setting is null"));
                    }
                } else if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(Boolean.valueOf(f.getIsMessageNotificationsOff()));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo186790a(C54115c.AbstractC54119b bVar) {
        if (bVar != null) {
            this.f135096a.put(bVar, f135095b);
        }
    }

    /* renamed from: c */
    public void mo186796c(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        if (z) {
            m212267e(iGetDataCallback);
        } else {
            m212268f(iGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo186791a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback) {
        C54667c.m212228a().mo186758a(new SetUserSettingRequest.C19209a().mo65587a(C54607a.m211913a(notificationSettingV2)), iGetDataCallback);
    }

    /* renamed from: b */
    public void mo186795b(boolean z, IGetDataCallback<NotificationSettingV2> iGetDataCallback) {
        if (z) {
            m212265c(iGetDataCallback);
        } else {
            m212266d(iGetDataCallback);
        }
    }

    /* renamed from: d */
    public void mo186797d(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        C54667c.m212228a().mo186758a(new SetUserSettingRequest.C19209a().mo65594c(Boolean.valueOf(z)), iGetDataCallback);
    }

    /* renamed from: a */
    public void mo186792a(UserSetting userSetting, final UserSetting userSetting2) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.p2678f.C54687a.RunnableC546958 */

            public void run() {
                UserSetting userSetting = userSetting2;
                if (userSetting != null) {
                    NotificationSettingWrapper notificationSettingWrapper = new NotificationSettingWrapper(userSetting.getNotificationSetting(), userSetting2.getNotificationSettingV2());
                    for (C54115c.AbstractC54119b bVar : C54687a.this.f135096a.keySet()) {
                        bVar.mo178094a(notificationSettingWrapper);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo186793a(boolean z, IGetDataCallback<NotificationSetting> iGetDataCallback) {
        if (z) {
            m212263a(iGetDataCallback);
        } else {
            m212264b(iGetDataCallback);
        }
    }
}
