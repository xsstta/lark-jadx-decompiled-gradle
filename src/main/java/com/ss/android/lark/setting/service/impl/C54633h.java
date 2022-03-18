package com.ss.android.lark.setting.service.impl;

import android.text.format.DateFormat;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.settings.v1.GetUserSettingRequest;
import com.bytedance.lark.pb.settings.v1.GetUserSettingResponse;
import com.bytedance.lark.pb.settings.v1.SetUserSettingRequest;
import com.bytedance.lark.pb.settings.v1.SetUserSettingResponse;
import com.bytedance.lark.pb.settings.v1.TimeFormatSetting;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.AbstractC29562i;
import com.ss.android.lark.biz.core.api.AbstractC29589z;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dto.BadgeSetting;
import com.ss.android.lark.setting.dto.C54123c;
import com.ss.android.lark.setting.dto.C54124e;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.dto.NotificationSettingV2;
import com.ss.android.lark.setting.dto.NotificationSettingWrapper;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.setting.service.impl.C54611c;
import com.ss.android.lark.setting.service.usersetting.p2680h.C54702a;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.setting.service.impl.h */
public class C54633h implements AbstractC54603d {

    /* renamed from: e */
    private static final Object f134972e = new Object();

    /* renamed from: a */
    public volatile BadgeStyle f134973a = BadgeStyle.WEAK_REMIND;

    /* renamed from: b */
    public volatile BadgeSetting f134974b = new BadgeSetting(BadgeStyle.WEAK_REMIND, true);

    /* renamed from: c */
    public C54702a f134975c = new C54702a();

    /* renamed from: d */
    public TimeFormatSetting f134976d;

    /* renamed from: f */
    private ConcurrentHashMap<AbstractC29562i, Object> f134977f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private ConcurrentHashMap<AbstractC29589z, Object> f134978g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private ConcurrentHashMap<C54115c.AbstractC54119b, Object> f134979h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private ConcurrentHashMap<ao, Object> f134980i = new ConcurrentHashMap<>();

    /* renamed from: j */
    private ConcurrentHashMap<C54115c.AbstractC54121d, Object> f134981j = new ConcurrentHashMap<>();

    /* renamed from: k */
    private ConcurrentHashMap<C54115c.AbstractC54118a, Object> f134982k = new ConcurrentHashMap<>();

    /* renamed from: l */
    private Map<ar, C54702a.AbstractC54704a> f134983l = new ConcurrentHashMap();

    /* renamed from: m */
    private C54611c.AbstractC54614a f134984m = new C54611c.AbstractC54614a() {
        /* class com.ss.android.lark.setting.service.impl.C54633h.C546341 */

        @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
        /* renamed from: a */
        public void mo186586a(TimeFormatSetting timeFormatSetting) {
            C54633h.this.mo186622b(timeFormatSetting);
        }

        @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
        /* renamed from: a */
        public void mo186587a(NotificationSettingWrapper notificationSettingWrapper) {
            C54633h.this.mo186619a(notificationSettingWrapper);
        }

        @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
        /* renamed from: a */
        public void mo186588a(BadgeSetting aVar) {
            C54633h.this.mo186620a(aVar);
        }

        @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
        /* renamed from: a */
        public void mo186589a(Long l) {
            C54633h.this.mo186621a(l);
        }

        @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
        /* renamed from: a */
        public void mo186590a(boolean z) {
            C54633h.this.mo186627c(z);
        }
    };

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186552a(boolean z) {
        if (z) {
            m211994k();
        } else {
            m211995l();
        }
    }

    /* renamed from: a */
    public void mo186620a(final BadgeSetting aVar) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass25 */

            public void run() {
                Log.m165389i("UserSettingService", "onPushBadgeStyle:" + aVar);
                C54633h.this.mo186624b(aVar);
            }
        });
    }

    /* renamed from: a */
    public void mo186619a(final NotificationSettingWrapper notificationSettingWrapper) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass26 */

            public void run() {
                C54633h.this.mo186623b(notificationSettingWrapper);
            }
        });
    }

    /* renamed from: a */
    public void mo186621a(final Long l) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.RunnableC546352 */

            public void run() {
                C54633h.this.mo186625b(l);
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186553a(final boolean z, final IGetDataCallback<Boolean> iGetDataCallback) {
        m211992a(null, Boolean.valueOf(z), new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.C546385 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C54633h hVar = C54633h.this;
                hVar.mo186624b(new BadgeSetting(hVar.f134973a, z));
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186564b(boolean z) {
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_SETTING, new SetUserSettingRequest.C19209a().mo65590a(Boolean.valueOf(z)), null, new SdkSender.IParser() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.C546396 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186551a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_SETTING, new SetUserSettingRequest.C19209a().mo65587a(C54607a.m211913a(notificationSettingV2)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.C546429 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186565b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_SETTING, new SetUserSettingRequest.C19209a().mo65594c(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass11 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public boolean mo186554a(long j) {
        return new C54124e(j).f134009b;
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186545a(final ar arVar) {
        if (arVar != null) {
            AnonymousClass17 r0 = new C54702a.AbstractC54704a() {
                /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass17 */

                @Override // com.ss.android.lark.setting.service.usersetting.p2680h.C54702a.AbstractC54704a
                /* renamed from: a */
                public void mo186636a(boolean z) {
                    ar arVar = arVar;
                    if (arVar != null) {
                        arVar.mo105603a(z);
                    }
                }
            };
            this.f134983l.put(arVar, r0);
            this.f134975c.mo186817a(r0);
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186546a(AbstractC29562i iVar) {
        this.f134977f.put(iVar, f134972e);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186547a(AbstractC29589z zVar) {
        this.f134978g.put(zVar, f134972e);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186549a(C54115c.AbstractC54119b bVar) {
        this.f134979h.put(bVar, f134972e);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186550a(C54115c.AbstractC54121d dVar) {
        if (dVar != null) {
            this.f134981j.put(dVar, f134972e);
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186563b(C54115c.AbstractC54121d dVar) {
        if (dVar != null) {
            this.f134981j.remove(dVar);
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186548a(C54115c.AbstractC54118a aVar) {
        if (aVar != null) {
            this.f134982k.put(aVar, f134972e);
        }
    }

    /* renamed from: b */
    public void mo186624b(BadgeSetting aVar) {
        boolean z;
        boolean z2;
        synchronized (this) {
            boolean z3 = true;
            z = false;
            if (aVar.mo185280a() != this.f134973a) {
                this.f134973a = aVar.mo185280a();
                z2 = true;
            } else {
                z2 = false;
            }
            if (aVar != this.f134974b) {
                if (aVar.mo185281b() == this.f134974b.mo185281b()) {
                    z3 = false;
                }
                this.f134974b = aVar;
                z = z3;
            }
        }
        if (z2) {
            for (AbstractC29562i iVar : this.f134977f.keySet()) {
                iVar.mo105758a(this.f134974b.mo185280a());
            }
        }
        if (z) {
            for (AbstractC29589z zVar : this.f134978g.keySet()) {
                zVar.onMuteBadgeShowStateChanged(this.f134974b.mo185281b());
            }
        }
    }

    /* renamed from: b */
    public void mo186623b(NotificationSettingWrapper notificationSettingWrapper) {
        for (C54115c.AbstractC54119b bVar : this.f134979h.keySet()) {
            bVar.mo178094a(notificationSettingWrapper);
        }
    }

    /* renamed from: b */
    public void mo186625b(Long l) {
        C54124e eVar = new C54124e(l.longValue());
        for (C54115c.AbstractC54121d dVar : this.f134981j.keySet()) {
            dVar.mo178095a(eVar);
        }
    }

    /* renamed from: l */
    private void m211995l() {
        this.f134975c.mo186815a();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: c */
    public BadgeStyle mo186566c() {
        BadgeStyle badgeStyle;
        synchronized (this) {
            badgeStyle = this.f134973a;
        }
        return badgeStyle;
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: d */
    public boolean mo186571d() {
        return this.f134974b.mo185281b();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: g */
    public boolean mo186574g() {
        return this.f134975c.mo186819b();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: h */
    public boolean mo186575h() {
        return this.f134975c.mo186820c();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: i */
    public void mo186576i() {
        m211995l();
        m211994k();
    }

    /* renamed from: k */
    private void m211994k() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass20 */

            public void run() {
                C54633h.this.mo186573f();
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186555b() {
        m211993e(false, new IGetDataCallback<BadgeSetting>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass22 */

            /* renamed from: a */
            public void onSuccess(BadgeSetting aVar) {
                Log.m165389i("UserSettingService", "preloadUserSetting from local:" + aVar);
                C54633h.this.mo186624b(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("UserSettingService", "preloadUserSetting from local failed:" + errorResult.getDebugMsg());
            }
        });
        m211993e(true, new IGetDataCallback<BadgeSetting>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass23 */

            /* renamed from: a */
            public void onSuccess(BadgeSetting aVar) {
                Log.m165389i("UserSettingService", "preloadUserSetting from server:" + aVar);
                C54633h.this.mo186624b(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("UserSettingService", "preloadUserSetting from server failed:" + errorResult.getDebugMsg());
            }
        });
        mo186569d(new IGetDataCallback<TimeFormatSetting>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass24 */

            /* renamed from: a */
            public void onSuccess(TimeFormatSetting timeFormatSetting) {
                Log.m165389i("UserSettingService", "time format preloadUserSetting from server:" + timeFormatSetting);
                C54633h.this.mo186626c(timeFormatSetting);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("UserSettingService", "preloadUserSetting from server failed:" + errorResult.getDebugMsg());
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: e */
    public TimeFormatSetting mo186572e() {
        Log.m165389i("GET_USER_SETTING", "get time format setting; is local = true");
        if (this.f134976d == null) {
            mo186630j();
        }
        return this.f134976d;
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: f */
    public C54124e mo186573f() {
        Log.m165389i("GET_USER_SETTING", "get zen setting ; is local = false");
        try {
            C54124e eVar = new C54124e(((Long) SdkSender.sendRequest(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(true), new SdkSender.IParser<Long>() {
                /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass15 */

                /* renamed from: a */
                public Long parse(byte[] bArr) throws IOException {
                    return GetUserSettingResponse.ADAPTER.decode(bArr).do_not_disturb_end_time;
                }
            })).longValue());
            this.f134975c.mo186816a(eVar);
            return eVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    public void mo186630j() {
        if (this.f134976d == null) {
            TimeFormatSetting timeFormatSetting = new TimeFormatSetting();
            this.f134976d = timeFormatSetting;
            timeFormatSetting.mo105511a(TimeFormatSetting.TimeFormat.UNKNOWN);
        }
        if (this.f134976d.mo105510a() != TimeFormatSetting.TimeFormat.UNKNOWN) {
            return;
        }
        if (DateFormat.is24HourFormat(C54115c.m210080a().mo178267C())) {
            this.f134976d.mo105511a(TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR);
        } else {
            this.f134976d.mo105511a(TimeFormatSetting.TimeFormat.TWELVE_HOUR);
        }
    }

    public C54633h() {
        C54611c.m211920a().mo186579a(this.f134984m);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186538a() {
        C54611c.m211920a().mo186583b();
        C54611c.m211920a().mo186579a(new C54611c.AbstractC54614a() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass10 */

            @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
            /* renamed from: a */
            public void mo186587a(NotificationSettingWrapper notificationSettingWrapper) {
            }

            @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
            /* renamed from: a */
            public void mo186588a(BadgeSetting aVar) {
            }

            @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
            /* renamed from: a */
            public void mo186590a(boolean z) {
            }

            @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
            /* renamed from: a */
            public void mo186586a(TimeFormatSetting timeFormatSetting) {
                C54633h.this.f134976d = timeFormatSetting;
                C54633h.this.mo186630j();
            }

            @Override // com.ss.android.lark.setting.service.impl.C54611c.AbstractC54614a
            /* renamed from: a */
            public void mo186589a(Long l) {
                C54633h.this.f134975c.mo186816a(new C54124e(l.longValue()));
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186544a(ao aoVar) {
        this.f134980i.put(aoVar, f134972e);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186557b(ao aoVar) {
        this.f134980i.remove(aoVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186559b(AbstractC29562i iVar) {
        this.f134977f.remove(iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ C54123c m211991a(byte[] bArr) throws IOException {
        GetUserSettingResponse decode = GetUserSettingResponse.ADAPTER.decode(bArr);
        return new C54123c(decode.auto_audio_to_text.booleanValue(), decode.auto_update_work_status.booleanValue());
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: c */
    public void mo186567c(IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(true), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass12 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return GetUserSettingResponse.ADAPTER.decode(bArr).message_notifications_off_during_calls;
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: d */
    public void mo186569d(IGetDataCallback<TimeFormatSetting> iGetDataCallback) {
        Log.m165389i("GET_USER_SETTING", "get time format setting; is local = false");
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(true), iGetDataCallback, new SdkSender.IParser<TimeFormatSetting>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass13 */

            /* renamed from: a */
            public TimeFormatSetting parse(byte[] bArr) throws IOException {
                TimeFormatSetting timeFormatSetting = new TimeFormatSetting();
                timeFormatSetting.mo105511a(TimeFormatSetting.TimeFormat.forNumber(GetUserSettingResponse.ADAPTER.decode(bArr).time_format.time_format.getValue()));
                C54633h.this.f134976d = timeFormatSetting;
                C54633h.this.mo186630j();
                return timeFormatSetting;
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186556b(IGetDataCallback<NotificationSettingV2> iGetDataCallback) {
        Log.m165389i("GET_USER_SETTING", "get notification setting v2; is local = false");
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(true), iGetDataCallback, new SdkSender.IParser<NotificationSettingV2>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.C546418 */

            /* renamed from: a */
            public NotificationSettingV2 parse(byte[] bArr) throws IOException {
                return C54607a.m211915a(GetUserSettingResponse.ADAPTER.decode(bArr).notification_setting_v2);
            }
        });
    }

    /* renamed from: c */
    public void mo186626c(TimeFormatSetting timeFormatSetting) {
        boolean z;
        synchronized (this) {
            if (timeFormatSetting != mo186572e()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            mo186628d(timeFormatSetting);
        }
    }

    /* renamed from: d */
    public void mo186628d(TimeFormatSetting timeFormatSetting) {
        for (ao aoVar : this.f134980i.keySet()) {
            aoVar.onTimeFormatChange(timeFormatSetting);
        }
    }

    /* renamed from: b */
    public void mo186622b(final TimeFormatSetting timeFormatSetting) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass27 */

            public void run() {
                C54633h.this.mo186628d(timeFormatSetting);
            }
        });
    }

    /* renamed from: c */
    public void mo186627c(final boolean z) {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.RunnableC546363 */

            public void run() {
                C54633h.this.mo186629d(z);
            }
        });
    }

    /* renamed from: d */
    public void mo186629d(boolean z) {
        for (C54115c.AbstractC54118a aVar : this.f134982k.keySet()) {
            aVar.mo178097a(z);
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186558b(ar arVar) {
        if (arVar != null) {
            this.f134975c.mo186818b(this.f134983l.get(arVar));
            this.f134983l.remove(arVar);
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186540a(IGetDataCallback<NotificationSetting> iGetDataCallback) {
        GetUserSettingRequest.C19167a a = new GetUserSettingRequest.C19167a().mo65486a(true);
        Log.m165389i("GET_USER_SETTING", "get notification setting; is local = false");
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SETTING, a, iGetDataCallback, new SdkSender.IParser<NotificationSetting>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.C546407 */

            /* renamed from: a */
            public NotificationSetting parse(byte[] bArr) throws IOException {
                return C54607a.m211914a(GetUserSettingResponse.ADAPTER.decode(bArr).notification_setting);
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186560b(AbstractC29589z zVar) {
        this.f134978g.remove(zVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186542a(TimeFormatSetting timeFormatSetting) {
        if (timeFormatSetting != null) {
            this.f134976d = timeFormatSetting;
            Log.m165389i("UserSettingService", "Manually invoke push to update the time system");
            C54611c.m211920a().mo186578a(timeFormatSetting);
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186561b(C54115c.AbstractC54118a aVar) {
        if (aVar != null) {
            this.f134982k.remove(aVar);
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186562b(C54115c.AbstractC54119b bVar) {
        this.f134979h.remove(bVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186541a(final BadgeStyle badgeStyle, final IGetDataCallback<Boolean> iGetDataCallback) {
        m211992a(badgeStyle, null, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.C546374 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C54633h hVar = C54633h.this;
                hVar.mo186624b(new BadgeSetting(badgeStyle, hVar.f134974b.mo185281b()));
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(bool);
                }
            }
        });
    }

    /* renamed from: e */
    private void m211993e(boolean z, IGetDataCallback<BadgeSetting> iGetDataCallback) {
        StringBuilder sb = new StringBuilder();
        sb.append("get badge setting; is local = ");
        sb.append(!z);
        Log.m165389i("GET_USER_SETTING", sb.toString());
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<BadgeSetting>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass21 */

            /* renamed from: a */
            public BadgeSetting parse(byte[] bArr) throws IOException {
                GetUserSettingResponse decode = GetUserSettingResponse.ADAPTER.decode(bArr);
                return new BadgeSetting(BadgeStyle.forNumber(decode.badge_style.getValue()), decode.navigation_show_mute_badge.booleanValue());
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186539a(long j, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_SETTING, new SetUserSettingRequest.C19209a().mo65591a(Long.valueOf(C54608b.m211917b().mo186512a() + j)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass16 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: c */
    public void mo186568c(boolean z, IGetDataCallback<C54123c> iGetDataCallback) {
        StringBuilder sb = new StringBuilder();
        sb.append("get general setting ; is local = ");
        sb.append(!z);
        Log.m165389i("GET_USER_SETTING", sb.toString());
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_SETTING, new GetUserSettingRequest.C19167a().mo65486a(Boolean.valueOf(z)), iGetDataCallback, $$Lambda$h$_O6X7J3JlQyJwi5Vz_K_XIpZM.INSTANCE);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: d */
    public void mo186570d(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_SETTING, new SetUserSettingRequest.C19209a().mo65593b(Boolean.valueOf(z)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass18 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                boolean z;
                if (SetUserSettingResponse.ADAPTER.decode(bArr) != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186543a(TimeFormatSetting timeFormatSetting, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_SETTING, new SetUserSettingRequest.C19209a().mo65589a(new com.bytedance.lark.pb.settings.v1.TimeFormatSetting(TimeFormatSetting.TimeFormat.fromValue(timeFormatSetting.mo105510a().getNumber()))), iGetDataCallback, new SdkSender.IParser() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass14 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public Object parse(byte[] bArr) throws IOException {
                return true;
            }
        });
    }

    /* renamed from: a */
    private void m211992a(BadgeStyle badgeStyle, Boolean bool, IGetDataCallback<Boolean> iGetDataCallback) {
        SetUserSettingRequest.C19209a aVar = new SetUserSettingRequest.C19209a();
        if (badgeStyle != null) {
            aVar.mo65586a(com.bytedance.lark.pb.settings.v1.BadgeStyle.fromValue(badgeStyle.getNumber()));
        }
        if (bool != null) {
            aVar.mo65595d(bool);
        }
        SdkSender.asynSendRequestNonWrap(Command.SET_USER_SETTING, aVar, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.setting.service.impl.C54633h.AnonymousClass19 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                SetUserSettingResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }
}
