package com.ss.android.vc.meeting.module.floatingwindow;

import android.app.Activity;
import com.ss.android.vc.common.lifecycle.C60793b;
import com.ss.android.vc.dependency.AbstractC60908v;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61420b;

/* renamed from: com.ss.android.vc.meeting.module.floatingwindow.a */
public abstract class AbstractC61728a extends AbstractC61420b implements AbstractC60908v.AbstractC60910b, AbstractC61733f {
    /* renamed from: a */
    public abstract void mo213804a();

    /* renamed from: a */
    public abstract void mo213805a(long j, FloatWindowLaunchType floatWindowLaunchType);

    /* renamed from: a */
    public abstract void mo213806a(Activity activity);

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61300h
    /* renamed from: a */
    public void mo212080a(VideoChat.Type type) {
    }

    /* renamed from: a */
    public abstract void mo213807a(AbstractC61735h hVar);

    /* renamed from: a */
    public abstract boolean mo213808a(Activity activity, long j);

    /* renamed from: b */
    public abstract void mo213809b();

    /* renamed from: b */
    public abstract void mo213810b(AbstractC61735h hVar);

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60910b
    public void onAppLifecycleChanged(C60793b bVar, C60793b bVar2) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
    }

    public AbstractC61728a(C61303k kVar) {
        super(kVar);
    }
}
