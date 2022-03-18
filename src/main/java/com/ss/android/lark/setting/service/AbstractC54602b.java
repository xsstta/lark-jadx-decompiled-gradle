package com.ss.android.lark.setting.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ISettingsUpdateListener;
import com.ss.android.lark.setting.dto.NotificationDetail;
import java.util.List;

/* renamed from: com.ss.android.lark.setting.service.b */
public interface AbstractC54602b {
    /* renamed from: a */
    NotificationDetail mo186514a(String str);

    /* renamed from: a */
    void mo186515a(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo186516a(ISettingsUpdateListener amVar);

    /* renamed from: a */
    void mo186517a(String str, NotificationDetail notificationDetail);

    /* renamed from: a */
    void mo186518a(boolean z);

    /* renamed from: a */
    void mo186519a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    boolean mo186520a();

    /* renamed from: b */
    void mo186521b(IGetDataCallback<List<String>> iGetDataCallback);

    /* renamed from: b */
    void mo186522b(ISettingsUpdateListener amVar);

    /* renamed from: b */
    boolean mo186523b();

    /* renamed from: b */
    boolean mo186524b(boolean z);

    /* renamed from: c */
    boolean mo186525c();

    /* renamed from: d */
    boolean mo186526d();

    /* renamed from: e */
    boolean mo186527e();

    /* renamed from: f */
    Boolean mo186528f();

    /* renamed from: g */
    boolean mo186529g();

    /* renamed from: h */
    boolean mo186530h();

    /* renamed from: i */
    boolean mo186531i();

    /* renamed from: j */
    boolean mo186532j();

    /* renamed from: k */
    boolean mo186533k();
}
