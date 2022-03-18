package com.ss.android.lark.setting.service;

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

/* renamed from: com.ss.android.lark.setting.service.d */
public interface AbstractC54603d {
    /* renamed from: a */
    void mo186538a();

    /* renamed from: a */
    void mo186539a(long j, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo186540a(IGetDataCallback<NotificationSetting> iGetDataCallback);

    /* renamed from: a */
    void mo186541a(BadgeStyle badgeStyle, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo186542a(TimeFormatSetting timeFormatSetting);

    /* renamed from: a */
    void mo186543a(TimeFormatSetting timeFormatSetting, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo186544a(ao aoVar);

    /* renamed from: a */
    void mo186545a(ar arVar);

    /* renamed from: a */
    void mo186546a(AbstractC29562i iVar);

    /* renamed from: a */
    void mo186547a(AbstractC29589z zVar);

    /* renamed from: a */
    void mo186548a(C54115c.AbstractC54118a aVar);

    /* renamed from: a */
    void mo186549a(C54115c.AbstractC54119b bVar);

    /* renamed from: a */
    void mo186550a(C54115c.AbstractC54121d dVar);

    /* renamed from: a */
    void mo186551a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo186552a(boolean z);

    /* renamed from: a */
    void mo186553a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    boolean mo186554a(long j);

    /* renamed from: b */
    void mo186555b();

    /* renamed from: b */
    void mo186556b(IGetDataCallback<NotificationSettingV2> iGetDataCallback);

    /* renamed from: b */
    void mo186557b(ao aoVar);

    /* renamed from: b */
    void mo186558b(ar arVar);

    /* renamed from: b */
    void mo186559b(AbstractC29562i iVar);

    /* renamed from: b */
    void mo186560b(AbstractC29589z zVar);

    /* renamed from: b */
    void mo186561b(C54115c.AbstractC54118a aVar);

    /* renamed from: b */
    void mo186562b(C54115c.AbstractC54119b bVar);

    /* renamed from: b */
    void mo186563b(C54115c.AbstractC54121d dVar);

    /* renamed from: b */
    void mo186564b(boolean z);

    /* renamed from: b */
    void mo186565b(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: c */
    BadgeStyle mo186566c();

    /* renamed from: c */
    void mo186567c(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: c */
    void mo186568c(boolean z, IGetDataCallback<C54123c> iGetDataCallback);

    /* renamed from: d */
    void mo186569d(IGetDataCallback<TimeFormatSetting> iGetDataCallback);

    /* renamed from: d */
    void mo186570d(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: d */
    boolean mo186571d();

    /* renamed from: e */
    TimeFormatSetting mo186572e();

    /* renamed from: f */
    C54124e mo186573f();

    /* renamed from: g */
    boolean mo186574g();

    /* renamed from: h */
    boolean mo186575h();

    /* renamed from: i */
    void mo186576i();
}
