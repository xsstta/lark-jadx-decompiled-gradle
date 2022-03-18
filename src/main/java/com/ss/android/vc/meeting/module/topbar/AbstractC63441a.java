package com.ss.android.vc.meeting.module.topbar;

import android.app.Activity;
import android.view.View;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61298f;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.data.MeetingTimeData;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;
import com.ss.android.vc.meeting.module.topbar.data.PromptData;
import com.ss.android.vc.meeting.module.topbar.data.TopBarInterpretationData;
import com.ss.android.vc.meeting.module.topbar.data.TopBarLiveIconData;
import com.ss.android.vc.meeting.module.topbar.viewstub.TopBarPromptStub;

/* renamed from: com.ss.android.vc.meeting.module.topbar.a */
public abstract class AbstractC63441a extends AbstractC61420b implements AbstractC61298f {

    /* renamed from: com.ss.android.vc.meeting.module.topbar.a$a */
    public interface AbstractC63442a {
        /* renamed from: a */
        void mo219489a();

        /* renamed from: a */
        void mo219490a(MeetingTimeData aVar);

        /* renamed from: a */
        void mo219491a(PromptData aVar);

        /* renamed from: a */
        void mo219492a(TopBarInterpretationData bVar);

        /* renamed from: a */
        void mo219493a(TopBarLiveIconData cVar);

        /* renamed from: a */
        void mo219494a(String str);

        /* renamed from: a */
        void mo219495a(boolean z);

        /* renamed from: b */
        void mo219496b(boolean z);

        /* renamed from: c */
        void mo219497c();

        /* renamed from: c */
        void mo219498c(boolean z);

        /* renamed from: d */
        void mo219499d(boolean z);

        /* renamed from: e */
        void mo219500e(boolean z);

        /* renamed from: f */
        void mo219501f(boolean z);

        /* renamed from: g */
        void mo219502g(boolean z);

        /* renamed from: h */
        void mo219503h(boolean z);
    }

    /* renamed from: a */
    public abstract void mo219473a(int i);

    /* renamed from: a */
    public abstract void mo219474a(Activity activity);

    /* renamed from: a */
    public abstract void mo219475a(Activity activity, View view);

    /* renamed from: a */
    public abstract void mo219476a(MeetingTimeData aVar);

    /* renamed from: a */
    public abstract void mo219477a(AbstractC63442a aVar);

    /* renamed from: a */
    public abstract void mo219478a(TopBarInterpretationData bVar);

    /* renamed from: a */
    public abstract void mo219479a(TopBarPromptStub.Mode mode);

    /* renamed from: a */
    public abstract void mo219480a(boolean z);

    /* renamed from: a */
    public abstract boolean mo219481a();

    /* renamed from: b */
    public abstract void mo219482b();

    /* renamed from: b */
    public abstract void mo219483b(Activity activity);

    /* renamed from: b */
    public abstract void mo219484b(AbstractC63442a aVar);

    /* renamed from: b */
    public abstract void mo219485b(boolean z);

    /* renamed from: c */
    public abstract void mo219486c();

    /* renamed from: c */
    public abstract void mo219487c(boolean z);

    /* renamed from: d */
    public abstract void mo219488d(boolean z);

    public AbstractC63441a(C61303k kVar) {
        super(kVar);
    }
}
