package com.ss.android.lark.setting.service.impl;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29562i;
import com.ss.android.lark.biz.core.api.AbstractC29589z;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dto.C54123c;
import com.ss.android.lark.setting.dto.C54124e;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.dto.NotificationSettingV2;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.setting.service.usersetting.C54643a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class UserSettingFacade implements AbstractC54603d {

    /* renamed from: a */
    private int f134927a;

    /* renamed from: b */
    private AbstractC54603d f134928b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface USER_SETTING_IMPL {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.setting.service.impl.UserSettingFacade$a */
    public static class C54606a {

        /* renamed from: a */
        public static final UserSettingFacade f134929a = new UserSettingFacade();
    }

    /* renamed from: j */
    public static UserSettingFacade m211870j() {
        return C54606a.f134929a;
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186553a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186553a(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186564b(boolean z) {
        m211871l();
        this.f134928b.mo186564b(z);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186551a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186551a(notificationSettingV2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186565b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186565b(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public boolean mo186554a(long j) {
        m211871l();
        return this.f134928b.mo186554a(j);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186546a(AbstractC29562i iVar) {
        m211871l();
        this.f134928b.mo186546a(iVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186547a(AbstractC29589z zVar) {
        m211871l();
        this.f134928b.mo186547a(zVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186549a(C54115c.AbstractC54119b bVar) {
        m211871l();
        this.f134928b.mo186549a(bVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186550a(C54115c.AbstractC54121d dVar) {
        m211871l();
        this.f134928b.mo186550a(dVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186563b(C54115c.AbstractC54121d dVar) {
        m211871l();
        this.f134928b.mo186563b(dVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186548a(C54115c.AbstractC54118a aVar) {
        m211871l();
        this.f134928b.mo186548a(aVar);
    }

    private UserSettingFacade() {
        this.f134927a = -1;
    }

    /* renamed from: l */
    private void m211871l() {
        if (this.f134928b == null) {
            mo186577k();
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: i */
    public void mo186576i() {
        this.f134928b.mo186576i();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186538a() {
        m211871l();
        this.f134928b.mo186538a();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186555b() {
        m211871l();
        this.f134928b.mo186555b();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: c */
    public BadgeStyle mo186566c() {
        m211871l();
        return this.f134928b.mo186566c();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: e */
    public TimeFormatSetting mo186572e() {
        m211871l();
        return this.f134928b.mo186572e();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: f */
    public C54124e mo186573f() {
        m211871l();
        return this.f134928b.mo186573f();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: g */
    public boolean mo186574g() {
        m211871l();
        return this.f134928b.mo186574g();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: h */
    public boolean mo186575h() {
        m211871l();
        return this.f134928b.mo186575h();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: d */
    public boolean mo186571d() {
        m211871l();
        return this.f134928b.mo186571d();
    }

    /* renamed from: k */
    public void mo186577k() {
        if (this.f134928b != null) {
            return;
        }
        if (C54115c.m210080a().mo178288c("lark.android.user_setting_v2")) {
            Log.m165389i("UserSettingFacade", "user setting impl V2");
            this.f134927a = 1;
            this.f134928b = new C54643a();
            return;
        }
        Log.m165389i("UserSettingFacade", "user setting impl V1");
        this.f134927a = 0;
        this.f134928b = new C54633h();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186552a(boolean z) {
        this.f134928b.mo186552a(z);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: d */
    public void mo186569d(IGetDataCallback<TimeFormatSetting> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186569d(iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186556b(IGetDataCallback<NotificationSettingV2> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186556b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: c */
    public void mo186567c(IGetDataCallback<Boolean> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186567c(iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186540a(IGetDataCallback<NotificationSetting> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186540a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186557b(ao aoVar) {
        m211871l();
        this.f134928b.mo186557b(aoVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186558b(ar arVar) {
        m211871l();
        this.f134928b.mo186558b(arVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186542a(TimeFormatSetting timeFormatSetting) {
        m211871l();
        this.f134928b.mo186542a(timeFormatSetting);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186559b(AbstractC29562i iVar) {
        m211871l();
        this.f134928b.mo186559b(iVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186560b(AbstractC29589z zVar) {
        m211871l();
        this.f134928b.mo186560b(zVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186544a(ao aoVar) {
        m211871l();
        this.f134928b.mo186544a(aoVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186561b(C54115c.AbstractC54118a aVar) {
        m211871l();
        this.f134928b.mo186561b(aVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186545a(ar arVar) {
        m211871l();
        this.f134928b.mo186545a(arVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186562b(C54115c.AbstractC54119b bVar) {
        m211871l();
        this.f134928b.mo186562b(bVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186539a(long j, IGetDataCallback<Boolean> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186539a(j, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: d */
    public void mo186570d(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186570d(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: c */
    public void mo186568c(boolean z, IGetDataCallback<C54123c> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186568c(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186541a(BadgeStyle badgeStyle, IGetDataCallback<Boolean> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186541a(badgeStyle, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186543a(TimeFormatSetting timeFormatSetting, IGetDataCallback<Boolean> iGetDataCallback) {
        m211871l();
        this.f134928b.mo186543a(timeFormatSetting, iGetDataCallback);
    }
}
