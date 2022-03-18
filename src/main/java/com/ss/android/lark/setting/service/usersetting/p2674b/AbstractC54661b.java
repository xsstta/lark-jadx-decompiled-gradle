package com.ss.android.lark.setting.service.usersetting.p2674b;

import androidx.lifecycle.AbstractC1178x;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.pb.ai.CorrectionSetting;
import com.ss.android.lark.pb.ai.FeatureType;
import com.ss.android.lark.pb.ai.PushUserASSetting;
import com.ss.android.lark.pb.ai.UserASSetting;

/* renamed from: com.ss.android.lark.setting.service.usersetting.b.b */
public interface AbstractC54661b {
    /* renamed from: a */
    void mo186705a(AbstractC1178x<CorrectionSetting> xVar);

    /* renamed from: a */
    void mo186706a(CorrectionSetting correctionSetting, IGetDataCallback<CorrectionSetting> iGetDataCallback);

    /* renamed from: a */
    void mo186707a(FeatureType featureType, UserASSetting userASSetting, IGetDataCallback<Void> iGetDataCallback);

    /* renamed from: a */
    void mo186710a(boolean z, IGetDataCallback<CorrectionSetting> iGetDataCallback);

    /* renamed from: b */
    void mo186711b();

    /* renamed from: b */
    void mo186712b(AbstractC1178x<CorrectionSetting> xVar);

    /* renamed from: b */
    void mo186713b(boolean z, IGetDataCallback<UserASSetting> iGetDataCallback);

    /* renamed from: c */
    void mo186714c(AbstractC1178x<PushUserASSetting> xVar);

    /* renamed from: d */
    void mo186716d(AbstractC1178x<PushUserASSetting> xVar);

    /* renamed from: d */
    boolean mo186717d();
}
