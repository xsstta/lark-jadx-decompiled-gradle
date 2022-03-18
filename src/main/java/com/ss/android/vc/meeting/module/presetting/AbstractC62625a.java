package com.ss.android.vc.meeting.module.presetting;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.entity.response.CalendarVCSettingsEntity;

/* renamed from: com.ss.android.vc.meeting.module.presetting.a */
public interface AbstractC62625a {

    /* renamed from: com.ss.android.vc.meeting.module.presetting.a$a */
    public interface AbstractC62626a extends IModel {
    }

    /* renamed from: com.ss.android.vc.meeting.module.presetting.a$b */
    public interface AbstractC62627b extends IView<AbstractC62628a> {

        /* renamed from: com.ss.android.vc.meeting.module.presetting.a$b$a */
        public interface AbstractC62628a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo216458a(CalendarVCSettingsEntity.VCSecuritySetting vCSecuritySetting);

            /* renamed from: a */
            void mo216459a(boolean z);

            /* renamed from: b */
            void mo216460b(boolean z);

            /* renamed from: c */
            void mo216461c(boolean z);

            /* renamed from: d */
            void mo216462d(boolean z);
        }
    }
}
