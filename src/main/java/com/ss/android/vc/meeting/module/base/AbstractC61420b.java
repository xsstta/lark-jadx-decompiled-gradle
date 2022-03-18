package com.ss.android.vc.meeting.module.base;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61297e;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61302j;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.utils.ParticipantUtil;

/* renamed from: com.ss.android.vc.meeting.module.base.b */
public abstract class AbstractC61420b implements AbstractC61297e, AbstractC61302j {
    private Handler mH;
    public C61303k mMeeting;

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e
    public void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j
    public void onTransform(int i, int i2, int i3) {
    }

    public C61303k getMeeting() {
        return this.mMeeting;
    }

    public Context getAppContext() {
        return ar.m236694a();
    }

    public DisplayMode getMeetingDisplayMode() {
        return this.mMeeting.mo212067p();
    }

    public boolean isCallType() {
        if (getMeeting().mo212058g() == VideoChat.Type.CALL) {
            return true;
        }
        return false;
    }

    public boolean isMeetHost() {
        if (!isMeetType() || !isHost()) {
            return false;
        }
        return true;
    }

    public boolean isMeetParticipant() {
        if (!isMeetType() || isHost()) {
            return false;
        }
        return true;
    }

    public boolean isMeetType() {
        if (getMeeting().mo212058g() == VideoChat.Type.MEET) {
            return true;
        }
        return false;
    }

    public boolean isCoHost() {
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        if (j != null) {
            return j.isCoHost();
        }
        return false;
    }

    public boolean isHost() {
        return getMeeting().mo212091I().mo212490a().mo212476h();
    }

    public boolean isHostOrCoHost() {
        if (isHost() || isCoHost()) {
            return true;
        }
        return false;
    }

    public Handler mH() {
        if (this.mH == null) {
            this.mH = new Handler(Looper.getMainLooper());
        }
        return this.mH;
    }

    public boolean isNormalMode() {
        Participant j = getMeeting().mo212091I().mo212494b().mo212605j();
        if (j == null || j.getParticipantSettings() == null || j.getParticipantSettings().getRtcMode() != ParticipantSettings.RtcMode.NORMAL_MODE) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void runOnUiThread(Runnable runnable) {
        UICallbackExecutor.execute(runnable);
    }

    public AbstractC61420b(C61303k kVar) {
        this.mMeeting = kVar;
    }

    public boolean isParticipant(ByteviewUser byteviewUser) {
        return ParticipantUtil.m248712a(byteviewUser, getMeeting().mo212091I().mo212494b().mo212601f());
    }
}
