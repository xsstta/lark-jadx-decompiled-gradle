package com.ss.android.vc.meeting.module.subtitle;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.MeetingSubtitleData;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.a */
public abstract class AbstractC63121a extends AbstractC61420b implements AbstractC63157e {

    /* renamed from: a */
    public boolean f159071a;

    /* renamed from: b */
    public boolean f159072b;

    /* renamed from: a */
    public abstract void mo218554a(Activity activity);

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: a */
    public abstract void mo218555a(View view);

    /* renamed from: a */
    public abstract void mo218556a(AbstractC63157e eVar);

    /* renamed from: b */
    public abstract void mo218559b(AbstractC63157e eVar);

    /* renamed from: b */
    public abstract void mo218560b(boolean z);

    /* renamed from: b */
    public abstract boolean mo218561b();

    /* renamed from: c */
    public abstract void mo218562c(boolean z);

    /* renamed from: c */
    public abstract boolean mo218563c();

    /* renamed from: d */
    public abstract InMeetingData.SubtitleStatusData.Status mo218564d();

    /* renamed from: d */
    public abstract void mo218565d(boolean z);

    /* renamed from: e */
    public abstract List<MeetingSubtitleData> mo218566e();

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: e */
    public abstract void mo218567e(boolean z);

    @Override // com.ss.android.vc.meeting.module.subtitle.AbstractC63157e
    /* renamed from: f */
    public abstract void mo218568f(boolean z);

    /* renamed from: f */
    public abstract boolean mo218569f();

    /* renamed from: a */
    public boolean mo218558a() {
        return this.f159072b;
    }

    public AbstractC63121a(C61303k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    public void mo218557a(boolean z) {
        this.f159072b = z;
    }
}
