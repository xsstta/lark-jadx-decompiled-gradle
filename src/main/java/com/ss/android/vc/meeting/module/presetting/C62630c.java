package com.ss.android.vc.meeting.module.presetting;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.entity.response.CalendarVCSettingsEntity;
import com.ss.android.vc.meeting.module.presetting.AbstractC62625a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;

/* renamed from: com.ss.android.vc.meeting.module.presetting.c */
public class C62630c extends BaseModel implements AbstractC62625a.AbstractC62626a {
    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: a */
    public void mo216464a(final IGetDataCallback<C60987v> iGetDataCallback) {
        VcBizSender.m249303n((String) null).mo219889a(new AbstractC63598b<C60987v>() {
            /* class com.ss.android.vc.meeting.module.presetting.C62630c.C626322 */

            /* renamed from: a */
            public void onSuccess(C60987v vVar) {
                iGetDataCallback.onSuccess(vVar);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                if (eVar.f160600c) {
                    return;
                }
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo216465a(String str, final IGetDataCallback<CalendarVCSettingsEntity> iGetDataCallback) {
        VcBizSender.m249299l(str).mo219889a(new AbstractC63598b<CalendarVCSettingsEntity>() {
            /* class com.ss.android.vc.meeting.module.presetting.C62630c.C626311 */

            /* renamed from: a */
            public void onSuccess(CalendarVCSettingsEntity calendarVCSettingsEntity) {
                iGetDataCallback.onSuccess(calendarVCSettingsEntity);
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                if (eVar.f160600c) {
                    return;
                }
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo216466a(String str, CalendarVCSettingsEntity calendarVCSettingsEntity, IGetDataCallback<Boolean> iGetDataCallback) {
        VcBizSender.m249172a(str, calendarVCSettingsEntity).mo219893b(new AbstractC63598b<CalendarVCSettingsEntity>() {
            /* class com.ss.android.vc.meeting.module.presetting.C62630c.C626333 */

            /* renamed from: a */
            public void onSuccess(CalendarVCSettingsEntity calendarVCSettingsEntity) {
                C60700b.m235851b("VideoChatSettingModel", "[updateCalendarVcSetting]", "onSuccess");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatSettingModel", "[updateCalendarVcSetting2]", "onError error=" + eVar);
            }
        });
    }
}
