package com.ss.android.vc.meeting.module.base;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.service.VideoChatUIConfigService;

/* renamed from: com.ss.android.vc.meeting.module.base.d */
public abstract class AbstractC61424d {
    private Handler mH;
    public AbstractC61429i mPresent;

    public void destroy() {
    }

    public void init() {
    }

    public void onOrientation(boolean z, boolean z2) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public Context getAppContext() {
        return ar.m236694a();
    }

    public Context getContext() {
        return this.mPresent.mo212916a();
    }

    public C61303k getMeeting() {
        return this.mPresent.mo212921f();
    }

    public ViewGroup getRootView() {
        return this.mPresent.mo212919d();
    }

    public boolean isFollowPage() {
        return this.mPresent.mo212924i();
    }

    public boolean isFromFloat() {
        return this.mPresent.mo212922g();
    }

    public boolean isSharingPage() {
        return this.mPresent.mo212923h();
    }

    public Activity getActivity() {
        return C60773o.m236124b(getContext());
    }

    /* access modifiers changed from: protected */
    public boolean isCallType() {
        if (getMeeting().mo212058g() == VideoChat.Type.CALL) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
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

    public boolean isHost() {
        return getMeeting().mo212091I().mo212490a().mo212476h();
    }

    /* access modifiers changed from: protected */
    public boolean isMeetHostUnderUIConfig() {
        if (!isMeetType() || !isHost() || !VideoChatUIConfigService.m249504g(getMeeting())) {
            return false;
        }
        return true;
    }

    public Handler mH() {
        if (this.mH == null) {
            this.mH = new Handler(Looper.getMainLooper());
        }
        return this.mH;
    }

    /* access modifiers changed from: protected */
    public void runOnUiThread(Runnable runnable) {
        UICallbackExecutor.execute(runnable);
    }

    public AbstractC61424d(AbstractC61429i iVar) {
        this.mPresent = iVar;
    }

    public <T extends View> T findViewById(int i) {
        return (T) this.mPresent.mo212917a(i);
    }

    public void gotoFloatWindow(long j) {
        getMeeting().ae().mo213808a(getActivity(), j);
    }

    /* access modifiers changed from: protected */
    public boolean isParticipant(ByteviewUser byteviewUser) {
        return ParticipantUtil.m248712a(byteviewUser, getMeeting().mo212091I().mo212494b().mo212601f());
    }
}
