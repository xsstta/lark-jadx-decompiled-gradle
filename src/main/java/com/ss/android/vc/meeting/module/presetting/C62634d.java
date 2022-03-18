package com.ss.android.vc.meeting.module.presetting;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.entity.response.CalendarVCSettingsEntity;
import com.ss.android.vc.meeting.module.presetting.AbstractC62625a;

/* renamed from: com.ss.android.vc.meeting.module.presetting.d */
public class C62634d extends BasePresenter<C62630c, C62643e, AbstractC62625a.AbstractC62627b.AbstractC62628a> {

    /* renamed from: a */
    public CalendarVCSettingsEntity f157678a;

    /* renamed from: b */
    public String f157679b;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC62625a.AbstractC62627b.AbstractC62628a createViewDelegate() {
        return new AbstractC62625a.AbstractC62627b.AbstractC62628a() {
            /* class com.ss.android.vc.meeting.module.presetting.C62634d.C626351 */

            @Override // com.ss.android.vc.meeting.module.presetting.AbstractC62625a.AbstractC62627b.AbstractC62628a
            /* renamed from: a */
            public void mo216458a(CalendarVCSettingsEntity.VCSecuritySetting vCSecuritySetting) {
                if (C62634d.this.f157678a != null) {
                    C62634d.this.f157678a.f152571a = vCSecuritySetting;
                    ((C62630c) C62634d.this.getModel()).mo216466a(C62634d.this.f157679b, C62634d.this.f157678a, new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.vc.meeting.module.presetting.C62634d.C626351.C626394 */

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }
                    });
                }
            }

            @Override // com.ss.android.vc.meeting.module.presetting.AbstractC62625a.AbstractC62627b.AbstractC62628a
            /* renamed from: b */
            public void mo216460b(boolean z) {
                if (C62634d.this.f157678a != null) {
                    C62634d.this.f157678a.f152572b = z;
                    ((C62630c) C62634d.this.getModel()).mo216466a(C62634d.this.f157679b, C62634d.this.f157678a, new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.vc.meeting.module.presetting.C62634d.C626351.C626372 */

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }
                    });
                }
            }

            @Override // com.ss.android.vc.meeting.module.presetting.AbstractC62625a.AbstractC62627b.AbstractC62628a
            /* renamed from: c */
            public void mo216461c(boolean z) {
                if (C62634d.this.f157678a != null) {
                    C62634d.this.f157678a.f152573c = z;
                    ((C62630c) C62634d.this.getModel()).mo216466a(C62634d.this.f157679b, C62634d.this.f157678a, new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.vc.meeting.module.presetting.C62634d.C626351.C626383 */

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }
                    });
                }
            }

            @Override // com.ss.android.vc.meeting.module.presetting.AbstractC62625a.AbstractC62627b.AbstractC62628a
            /* renamed from: d */
            public void mo216462d(boolean z) {
                if (C62634d.this.f157678a != null) {
                    C62634d.this.f157678a.f152575e = z;
                    ((C62630c) C62634d.this.getModel()).mo216466a(C62634d.this.f157679b, C62634d.this.f157678a, new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.vc.meeting.module.presetting.C62634d.C626351.C626405 */

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }
                    });
                }
            }

            @Override // com.ss.android.vc.meeting.module.presetting.AbstractC62625a.AbstractC62627b.AbstractC62628a
            /* renamed from: a */
            public void mo216459a(boolean z) {
                if (C62634d.this.f157678a != null && C62634d.this.f157678a != null) {
                    C62634d.this.f157678a.f152574d = z;
                    ((C62630c) C62634d.this.getModel()).mo216466a(C62634d.this.f157679b, C62634d.this.f157678a, new IGetDataCallback<Boolean>() {
                        /* class com.ss.android.vc.meeting.module.presetting.C62634d.C626351.C626361 */

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                        }
                    });
                }
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C62630c) getModel()).mo216465a(this.f157679b, new IGetDataCallback<CalendarVCSettingsEntity>() {
            /* class com.ss.android.vc.meeting.module.presetting.C62634d.C626412 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("MeetingPreSettingPresenter", "loadCalendarVcSetting error!");
            }

            /* renamed from: a */
            public void onSuccess(CalendarVCSettingsEntity calendarVCSettingsEntity) {
                if (calendarVCSettingsEntity != null) {
                    C62634d.this.f157678a = calendarVCSettingsEntity;
                } else {
                    C62634d.this.f157678a = new CalendarVCSettingsEntity();
                }
                ((C62643e) C62634d.this.getView()).mo216481a(C62634d.this.f157678a);
            }
        });
        ((C62630c) getModel()).mo216464a(new IGetDataCallback<C60987v>() {
            /* class com.ss.android.vc.meeting.module.presetting.C62634d.C626423 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(C60987v vVar) {
                ((C62643e) C62634d.this.getView()).mo216482a(vVar);
            }
        });
    }

    /* renamed from: a */
    public void mo216471a(String str) {
        this.f157679b = str;
    }

    public C62634d(C62630c cVar, C62643e eVar) {
        super(cVar, eVar);
    }
}
