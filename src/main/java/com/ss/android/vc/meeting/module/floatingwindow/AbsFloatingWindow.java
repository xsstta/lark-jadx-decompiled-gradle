package com.ss.android.vc.meeting.module.floatingwindow;

import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.C61317r;
import com.ss.android.vcxp.annotation.XClass;

@XClass
public abstract class AbsFloatingWindow extends C61317r implements AbstractC61735h {
    /* renamed from: a */
    public abstract void mo213660a(long j, FloatWindowLaunchType floatWindowLaunchType);

    public abstract void dismiss();

    /* renamed from: j */
    public abstract void mo213661j();

    public AbsFloatingWindow(C61303k kVar) {
        super(kVar);
    }
}
