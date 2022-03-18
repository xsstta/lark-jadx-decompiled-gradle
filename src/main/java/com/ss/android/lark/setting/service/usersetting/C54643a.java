package com.ss.android.lark.setting.service.usersetting;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29562i;
import com.ss.android.lark.biz.core.api.AbstractC29589z;
import com.ss.android.lark.biz.core.api.BadgeStyle;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.biz.core.api.ar;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dto.C54123c;
import com.ss.android.lark.setting.dto.C54124e;
import com.ss.android.lark.setting.dto.NotificationSetting;
import com.ss.android.lark.setting.dto.NotificationSettingV2;
import com.ss.android.lark.setting.service.AbstractC54603d;
import com.ss.android.lark.setting.service.impl.C54611c;
import com.ss.android.lark.setting.service.usersetting.base.C54667c;
import com.ss.android.lark.setting.service.usersetting.p2673a.C54644a;
import com.ss.android.lark.setting.service.usersetting.p2675c.C54677a;
import com.ss.android.lark.setting.service.usersetting.p2677e.C54683a;
import com.ss.android.lark.setting.service.usersetting.p2678f.C54687a;
import com.ss.android.lark.setting.service.usersetting.p2679g.C54697a;
import com.ss.android.lark.setting.service.usersetting.p2680h.C54705b;

/* renamed from: com.ss.android.lark.setting.service.usersetting.a */
public class C54643a implements AbstractC54603d {
    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186552a(boolean z) {
        if (z) {
            C54667c.m212228a().mo186761b();
        } else {
            C54667c.m212228a().mo186762c();
        }
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186553a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        C54644a.m212113a().mo186660a(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186564b(boolean z) {
        C54677a.m212243a().mo186777b(z, null);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186551a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback) {
        C54687a.m212262a().mo186791a(notificationSettingV2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186565b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        C54687a.m212262a().mo186797d(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public boolean mo186554a(long j) {
        return C54705b.m212300a().mo186827a(j);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186547a(AbstractC29589z zVar) {
        C54644a.m212113a().mo186657a(zVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186549a(C54115c.AbstractC54119b bVar) {
        C54687a.m212262a().mo186790a(bVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186550a(C54115c.AbstractC54121d dVar) {
        C54705b.m212300a().mo186824a(dVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186548a(C54115c.AbstractC54118a aVar) {
        C54683a.m212257a().mo186786a(aVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186538a() {
        C54611c.m211920a().mo186583b();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186555b() {
        C54667c.m212228a().mo186761b();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: i */
    public void mo186576i() {
        C54667c.m212228a().mo186763d();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: c */
    public BadgeStyle mo186566c() {
        return C54644a.m212113a().mo186661b();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: e */
    public TimeFormatSetting mo186572e() {
        return C54697a.m212281a().mo186812c();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: f */
    public C54124e mo186573f() {
        return C54705b.m212300a().mo186828b();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: g */
    public boolean mo186574g() {
        return C54705b.m212300a().mo186832d();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: h */
    public boolean mo186575h() {
        return C54705b.m212300a().mo186833e();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: d */
    public boolean mo186571d() {
        return C54644a.m212113a().mo186664c();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: d */
    public void mo186569d(IGetDataCallback<TimeFormatSetting> iGetDataCallback) {
        C54697a.m212281a().mo186806a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186556b(IGetDataCallback<NotificationSettingV2> iGetDataCallback) {
        C54687a.m212262a().mo186795b(false, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186540a(IGetDataCallback<NotificationSetting> iGetDataCallback) {
        C54687a.m212262a().mo186793a(false, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186557b(ao aoVar) {
        C54697a.m212281a().mo186811b(aoVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: c */
    public void mo186567c(IGetDataCallback<Boolean> iGetDataCallback) {
        C54687a.m212262a().mo186796c(false, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186558b(ar arVar) {
        C54705b.m212300a().mo186829b(arVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186542a(TimeFormatSetting timeFormatSetting) {
        C54697a.m212281a().mo186810b();
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186559b(AbstractC29562i iVar) {
        C54644a.m212113a().mo186662b(iVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186560b(AbstractC29589z zVar) {
        C54644a.m212113a().mo186663b(zVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186544a(ao aoVar) {
        C54697a.m212281a().mo186808a(aoVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186561b(C54115c.AbstractC54118a aVar) {
        C54683a.m212257a().mo186788b(aVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186545a(ar arVar) {
        C54705b.m212300a().mo186823a(arVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186562b(C54115c.AbstractC54119b bVar) {
        C54687a.m212262a().mo186794b(bVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186546a(AbstractC29562i iVar) {
        C54644a.m212113a().mo186656a(iVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: b */
    public void mo186563b(C54115c.AbstractC54121d dVar) {
        C54705b.m212300a().mo186830b(dVar);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: c */
    public void mo186568c(boolean z, IGetDataCallback<C54123c> iGetDataCallback) {
        C54677a.m212243a().mo186778c(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186539a(long j, IGetDataCallback<Boolean> iGetDataCallback) {
        C54705b.m212300a().mo186822a(j, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: d */
    public void mo186570d(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        C54677a.m212243a().mo186776a(z, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186541a(BadgeStyle badgeStyle, IGetDataCallback<Boolean> iGetDataCallback) {
        C54644a.m212113a().mo186654a(badgeStyle, iGetDataCallback);
    }

    @Override // com.ss.android.lark.setting.service.AbstractC54603d
    /* renamed from: a */
    public void mo186543a(TimeFormatSetting timeFormatSetting, IGetDataCallback<Boolean> iGetDataCallback) {
        C54697a.m212281a().mo186807a(timeFormatSetting, iGetDataCallback);
    }
}
