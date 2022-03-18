package com.ss.android.lark.setting.service.usersetting.base;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.settings.v1.GetUserSettingRequest;
import com.bytedance.lark.pb.settings.v1.GetUserSettingResponse;
import com.bytedance.lark.pb.settings.v1.SetUserSettingRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.service.impl.C54611c;
import com.ss.android.lark.setting.service.usersetting.base.C54663a;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.setting.service.usersetting.base.c */
public class C54667c {

    /* renamed from: a */
    public C54663a f135068a;

    /* renamed from: b */
    public AtomicBoolean f135069b;

    /* renamed from: c */
    public final byte[] f135070c;

    /* renamed from: d */
    public C54611c.AbstractC54615b f135071d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.service.usersetting.base.c$a */
    public static class C54676a {

        /* renamed from: a */
        public static C54667c f135080a = new C54667c();
    }

    /* renamed from: a */
    public static C54667c m212228a() {
        return C54676a.f135080a;
    }

    /* renamed from: g */
    public UserSetting mo186766g() {
        return this.f135068a.mo186756b();
    }

    private C54667c() {
        this.f135070c = new byte[0];
        this.f135071d = new C54611c.AbstractC54615b() {
            /* class com.ss.android.lark.setting.service.usersetting.base.C54667c.C546681 */

            @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54615b
            /* renamed from: a */
            public void mo186591a(UserSetting userSetting) {
                C54667c.this.f135068a.mo186754a(userSetting);
            }
        };
        this.f135068a = new C54663a();
        this.f135069b = new AtomicBoolean(false);
    }

    /* renamed from: b */
    public void mo186761b() {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.base.C54667c.RunnableC546692 */

            public void run() {
                if (!C54667c.this.f135069b.get()) {
                    Log.m165389i("UserSettingService", "init user setting service");
                    C54611c.m211920a().mo186580a(C54667c.this.f135071d);
                    C54667c.this.mo186765f();
                    C54667c.this.mo186759a((IGetDataCallback<UserSetting>) null);
                    C54667c.this.f135069b.compareAndSet(false, true);
                }
            }
        });
    }

    /* renamed from: c */
    public void mo186762c() {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.base.C54667c.RunnableC546703 */

            public void run() {
                Log.m165389i("UserSettingService", "unInit user setting service");
                C54611c.m211920a().mo186584b(C54667c.this.f135071d);
                C54667c.this.f135068a.mo186753a();
                C54667c.this.f135069b.set(false);
            }
        });
    }

    /* renamed from: d */
    public void mo186763d() {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.usersetting.base.C54667c.RunnableC546714 */

            public void run() {
                synchronized (C54667c.this.f135070c) {
                    Log.m165389i("UserSettingService", "reset user setting service");
                    C54667c.this.f135068a.mo186753a();
                    C54667c.this.mo186765f();
                    C54667c.this.mo186759a((IGetDataCallback<UserSetting>) null);
                }
            }
        });
    }

    /* renamed from: e */
    public UserSetting mo186764e() {
        Log.m165389i("GET_USER_SETTING", "get user setting v2 from net");
        try {
            return (UserSetting) SdkSender.sendRequest(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(true), new SdkSender.IParser<UserSetting>() {
                /* class com.ss.android.lark.setting.service.usersetting.base.C54667c.C546736 */

                /* renamed from: a */
                public UserSetting parse(byte[] bArr) throws IOException {
                    UserSetting a = C54666b.m212226a(GetUserSettingResponse.ADAPTER.decode(bArr));
                    C54667c.this.f135068a.mo186754a(a);
                    return a;
                }
            });
        } catch (Exception e) {
            Log.m165383e("UserSettingService", "sync get user setting error: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: f */
    public UserSetting mo186765f() {
        UserSetting b = this.f135068a.mo186756b();
        if (b != null) {
            return b;
        }
        Log.m165389i("GET_USER_SETTING", "get user setting v2 from local");
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(false), new SdkSender.IParser<UserSetting>() {
            /* class com.ss.android.lark.setting.service.usersetting.base.C54667c.C546747 */

            /* renamed from: a */
            public UserSetting parse(byte[] bArr) throws IOException {
                UserSetting a = C54666b.m212226a(GetUserSettingResponse.ADAPTER.decode(bArr));
                C54667c.this.f135068a.mo186754a(a);
                return a;
            }
        });
        if (syncSendMayError.f131573b == null) {
            return syncSendMayError.f131572a;
        }
        Log.m165383e("UserSettingService", "get user setting occurs error: " + syncSendMayError.f131573b.getMessage());
        return null;
    }

    /* renamed from: a */
    public void mo186759a(IGetDataCallback<UserSetting> iGetDataCallback) {
        Log.m165389i("GET_USER_SETTING", "get user setting v2 from net");
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(true), iGetDataCallback, new SdkSender.IParser<UserSetting>() {
            /* class com.ss.android.lark.setting.service.usersetting.base.C54667c.C546725 */

            /* renamed from: a */
            public UserSetting parse(byte[] bArr) throws IOException {
                UserSetting a = C54666b.m212226a(GetUserSettingResponse.ADAPTER.decode(bArr));
                C54667c.this.f135068a.mo186754a(a);
                return a;
            }
        });
    }

    /* renamed from: a */
    public void mo186760a(C54663a.AbstractC54665a aVar) {
        if (aVar != null) {
            this.f135068a.mo186755a(aVar);
        }
    }

    /* renamed from: a */
    public void mo186758a(SetUserSettingRequest.C19209a aVar, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_SETTING, aVar, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.usersetting.base.C54667c.C546758 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }
}
