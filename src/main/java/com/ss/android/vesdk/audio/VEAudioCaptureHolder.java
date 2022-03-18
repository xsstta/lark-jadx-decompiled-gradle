package com.ss.android.vesdk.audio;

import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.C64027k;
import com.ss.android.vesdk.C64083x;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.audio.C63948g;

public enum VEAudioCaptureHolder implements AbstractC63946e {
    INSTANCE;
    
    private boolean mFeedPcm = true;
    MediaRecordPresenter mPresenter;
    VEAudioEncodeSettings mVEAudioEncodeSettings;

    public void startFeedPCM() {
        this.mFeedPcm = true;
    }

    public void stopFeedPCM() {
        this.mFeedPcm = false;
    }

    public void setAudioBufferConsumer(MediaRecordPresenter mediaRecordPresenter) {
        this.mPresenter = mediaRecordPresenter;
    }

    public void setAudioEncodeSettings(VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.mVEAudioEncodeSettings = vEAudioEncodeSettings;
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63946e
    public void onReceive(C63948g gVar) {
        MediaRecordPresenter mediaRecordPresenter = this.mPresenter;
        if (mediaRecordPresenter == null) {
            C63929ab.m250980d("AudioCaptureHolder", "onReceiver error: please set buffer consumer, before init AudioCapture");
        } else if (!this.mFeedPcm) {
            C63929ab.m250974a("AudioCaptureHolder", "pcm feed stop");
        } else {
            mediaRecordPresenter.mo202581b(((C63948g.C63949a) gVar.mo221301a()).mo221303a(), gVar.mo221302b());
        }
    }

    private VEAudioCaptureHolder() {
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63946e
    public void onError(int i, int i2, String str) {
        C63929ab.m250974a("AudioCaptureHolder", "errType" + i + "ret:" + i2 + "msg:" + str);
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63946e
    public void onInfo(int i, int i2, double d, Object obj) {
        if (i == C64083x.f161812G) {
            if (i2 == 0) {
                C64027k kVar = (C64027k) obj;
                if (this.mVEAudioEncodeSettings == null) {
                    C63929ab.m250980d("AudioCaptureHolder", "please set VEAudioEncodeSettings, before init AudioCapture");
                    return;
                }
                MediaRecordPresenter mediaRecordPresenter = this.mPresenter;
                if (mediaRecordPresenter == null) {
                    C63929ab.m250980d("AudioCaptureHolder", "please set buffer consumer, before init AudioCapture");
                    return;
                }
                mediaRecordPresenter.mo202523a(kVar.mo221692b(), kVar.mo221691a(), this.mVEAudioEncodeSettings.mo220488a(), this.mVEAudioEncodeSettings.mo220490c(), this.mVEAudioEncodeSettings.mo220489b());
                C63929ab.m250974a("AudioCaptureHolder", "mVEAudioCapture inited: channelCount:" + kVar.mo221691a() + " sampleHz:" + kVar.mo221692b() + " encode sample rate:" + this.mVEAudioEncodeSettings.mo220488a() + " encode channel count:" + this.mVEAudioEncodeSettings.mo220490c());
            } else {
                C63929ab.m250974a("AudioCaptureHolder", "initAudio error:" + i2);
            }
            if (i == C64083x.f161813H) {
                this.mFeedPcm = true;
            }
        }
    }
}
