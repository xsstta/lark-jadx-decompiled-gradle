package com.ss.android.vesdk.audio;

import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.bytedance.bpea.basics.PrivacyCert;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ss.android.ttve.audio.C60178a;
import com.ss.android.ttve.model.VEAudioDeviceType;
import com.ss.android.ttve.monitor.C60229h;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.C63967d;
import com.ss.android.vesdk.C64027k;
import com.ss.android.vesdk.C64083x;
import com.ss.android.vesdk.VESensService;
import java.nio.ByteBuffer;

public class TEAudioRecord implements AbstractC63941b {
    private static final int[] SUGGEST_CHANNEL_ARRAY = {2, 1, 0};
    private static final int[] SUGGEST_SAMPLERATE_ARRAY = {44100, JosStatusCodes.RTN_CODE_COMMON_ERROR, 11025, 16000, 22050};
    private static final String TAG = "TEAudioRecord";
    private int hasInited = -1;
    public AbstractC63942c mAudioCallback;
    public C64027k mAudioCaptureSettings;
    private AudioRecord mAudioRecord;
    private long mAudioRecordStartTime;
    private long mAudioRecordStopTime;
    private int mAudioSource = 1;
    private int mBitsPerSample = 16;
    public int mBufferSizeInBytes;
    public ByteBuffer mByteBuffer;
    private int mChannels = 2;
    public Handler mHandler;
    private int mSampleRate = 44100;

    private int getSysAudioFormat(int i) {
        if (i != 8) {
            return i != 16 ? 1 : 2;
        }
        return 3;
    }

    private int getSysAudioSource(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 5;
            if (i != 5) {
                i2 = 6;
                if (i != 6) {
                    return 0;
                }
            }
        }
        return i2;
    }

    private int getSysChannelConfig(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 12;
        }
        return 16;
    }

    public void setAudioDevice(C63947f fVar) {
    }

    public int getBufferSize() {
        return this.mBufferSizeInBytes;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public ByteBuffer getPcmBuffer() {
        return this.mByteBuffer;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getRecordingState() {
        return this.mAudioRecord.getRecordingState();
    }

    public int getState() {
        return this.mAudioRecord.getState();
    }

    public void release() {
        release(null);
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    public int init() {
        return init(this.mAudioSource, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    /* access modifiers changed from: protected */
    public void openPrivacy() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_USING);
    }

    /* access modifiers changed from: protected */
    public void releasePrivacy() {
        VESensService.getInstance().setSensCheckObjStatus(VESensService.getInstance().getIDWithName(VESensService.SENS_SERVICE_TYPE_MIC), VESensService.PRIVACY_STATUS.PRIVACY_STATUS_RELEASE);
    }

    public int read() {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int read = this.mAudioRecord.read(this.mByteBuffer, this.mBufferSizeInBytes);
            if (read > 0 && this.mAudioRecordStartTime != 0) {
                C60229h.m234090a(0, "te_record_audio_first_frame", System.currentTimeMillis() - this.mAudioRecordStartTime);
                this.mAudioRecordStartTime = 0;
            }
            return read;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63941b
    public void setAudioCallback(AbstractC63942c cVar) {
        this.mAudioCallback = cVar;
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63941b
    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public int init(int i) {
        this.mAudioSource = i;
        return init(i, this.mSampleRate, this.mChannels, this.mBitsPerSample);
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public void release(PrivacyCert privacyCert) {
        if (this.mAudioRecord != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C63967d.m251092c(privacyCert, this.mAudioRecord);
            this.hasInited = -1;
            C60229h.m234090a(0, "te_record_audio_release_record_time", System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public int read(byte[] bArr) {
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getRecordingState() != 3) {
            return -105;
        }
        try {
            int read = this.mAudioRecord.read(bArr, 0, this.mBufferSizeInBytes);
            if (read > 0 && this.mAudioRecordStartTime != 0) {
                C60229h.m234090a(0, "te_record_audio_first_frame", System.currentTimeMillis() - this.mAudioRecordStartTime);
                this.mAudioRecordStartTime = 0;
            }
            return read;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int start(PrivacyCert privacyCert) {
        this.mAudioRecordStartTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        if (this.mAudioRecord.getRecordingState() == 3) {
            return -2;
        }
        try {
            C63967d.m251089a(privacyCert, this.mAudioRecord);
            String str = TAG;
            C63929ab.m250974a(str, "start hashCode:" + this.mAudioRecord.hashCode());
            openPrivacy();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.android.vesdk.audio.TEAudioRecord.RunnableC639391 */

                    public void run() {
                        int i;
                        C63948g gVar = null;
                        if (TEAudioRecord.this.mAudioCaptureSettings.mo221695e() == 0) {
                            byte[] bArr = new byte[TEAudioRecord.this.mBufferSizeInBytes];
                            i = TEAudioRecord.this.read(bArr);
                            if (i > 0) {
                                gVar = C63948g.m251048a(bArr, TEAudioRecord.this.mBufferSizeInBytes);
                            }
                        } else {
                            i = TEAudioRecord.this.read();
                            if (i > 0) {
                                gVar = C63948g.m251047a(TEAudioRecord.this.mByteBuffer, TEAudioRecord.this.mBufferSizeInBytes);
                            }
                        }
                        if (i >= 0) {
                            if (!(TEAudioRecord.this.mAudioCallback == null || gVar == null)) {
                                TEAudioRecord.this.mAudioCallback.mo221294a(gVar);
                            }
                            TEAudioRecord.this.mHandler.post(this);
                        }
                    }
                });
            }
            C60229h.m234090a(0, "te_record_audio_start_record_time", System.currentTimeMillis() - this.mAudioRecordStartTime);
            return 0;
        } catch (Exception e) {
            C63929ab.m250980d(TAG, Log.getStackTraceString(e));
            release(null);
            return -603;
        }
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int stop(PrivacyCert privacyCert) {
        this.mAudioRecordStartTime = 0;
        this.mAudioRecordStopTime = System.currentTimeMillis();
        AudioRecord audioRecord = this.mAudioRecord;
        if (audioRecord == null) {
            return -108;
        }
        if (audioRecord.getState() != 1) {
            return -105;
        }
        try {
            C63967d.m251091b(privacyCert, this.mAudioRecord);
            String str = TAG;
            C63929ab.m250974a(str, "stop hashCode:" + this.mAudioRecord.hashCode());
            releasePrivacy();
        } catch (Exception e) {
            C63929ab.m250980d(TAG, Log.getStackTraceString(e));
        }
        C60229h.m234090a(0, "te_record_audio_stop_record_time", System.currentTimeMillis() - this.mAudioRecordStopTime);
        return 0;
    }

    @Override // com.ss.android.vesdk.audio.AbstractC63940a
    public int init(C64027k kVar) {
        C64027k kVar2;
        this.mAudioCaptureSettings = kVar;
        int init = init(kVar.mo221694d(), kVar.mo221692b(), kVar.mo221691a(), kVar.mo221693c());
        if (!(this.mAudioCallback == null || (kVar2 = this.mAudioCaptureSettings) == null)) {
            new C64027k.C64029a(kVar2).mo221702b(this.mSampleRate).mo221700a(this.mChannels).mo221703c(this.mBitsPerSample);
            this.mAudioCallback.mo221292a(C64083x.f161812G, 0, 0.0d, this.mAudioCaptureSettings);
        }
        C60229h.m234090a(0, "te_record_audio_mic_type", 1L);
        C60229h.m234090a(0, "te_record_audio_mic_sample_rate", (long) this.mSampleRate);
        int i = this.mBufferSizeInBytes;
        int i2 = this.mChannels;
        if (i2 == 0) {
            i2 = 1;
        }
        C60229h.m234090a(0, "te_record_audio_mic_frame_per_buffer", (long) ((i / i2) / 2));
        return init;
    }

    public int init(int i, int i2, int i3) {
        return init(this.mAudioSource, i, i2, i3);
    }

    public int init(int i, int i2, int i3, int i4) {
        String str = TAG;
        C63929ab.m250976b(str, "audioSource:" + i + ",sampleRate: " + i2 + ",channels:" + i3 + ",bitsPerSample:" + i4);
        if (this.hasInited == 0) {
            C63929ab.m250974a(str, "has inited");
            return 0;
        }
        int initAudioRecord = initAudioRecord(i, i2, i3, i4);
        if (initAudioRecord == 0) {
            this.hasInited = 0;
            return 0;
        }
        release(null);
        int[] iArr = SUGGEST_SAMPLERATE_ARRAY;
        for (int i5 : iArr) {
            for (int i6 : SUGGEST_CHANNEL_ARRAY) {
                initAudioRecord = initAudioRecord(i, i5, i6, i4);
                if (initAudioRecord == 0) {
                    return 0;
                }
                release(null);
            }
        }
        this.hasInited = initAudioRecord;
        return initAudioRecord;
    }

    private int initAudioRecord(int i, int i2, int i3, int i4) {
        int sysAudioSource = getSysAudioSource(i);
        int sysChannelConfig = getSysChannelConfig(i3);
        int sysAudioFormat = getSysAudioFormat(i4);
        int minBufferSize = AudioRecord.getMinBufferSize(i2, sysChannelConfig, sysAudioFormat);
        try {
            AudioRecord audioRecord = new AudioRecord(sysAudioSource, i2, sysChannelConfig, sysAudioFormat, minBufferSize);
            this.mAudioRecord = audioRecord;
            if (audioRecord.getState() == 1) {
                C64027k kVar = this.mAudioCaptureSettings;
                if (kVar != null && kVar.mo221699i() && Build.VERSION.SDK_INT >= 23) {
                    C60178a aVar = new C60178a();
                    if (aVar.mo205503a() == VEAudioDeviceType.BLUETOOTH) {
                        this.mAudioRecord.setPreferredDevice(aVar.mo205504b());
                    }
                }
                this.mSampleRate = i2;
                this.mChannels = i3;
                this.mBitsPerSample = i4;
                String str = TAG;
                C63929ab.m250974a(str, "Init audio recorder succeed, apply audio record sample rate " + this.mSampleRate + " channels " + this.mChannels + " buffer " + this.mBufferSizeInBytes + " state " + this.mAudioRecord.getState());
                this.mBufferSizeInBytes = minBufferSize;
                this.mByteBuffer = ByteBuffer.allocateDirect(minBufferSize);
                return 0;
            }
            throw new Exception("Audio record is not initialized![" + this.mSampleRate + "," + this.mChannels + "," + i4);
        } catch (Exception e) {
            C63929ab.m250980d(TAG, Log.getStackTraceString(e));
            release(null);
            this.mSampleRate = 44100;
            this.mChannels = 2;
            this.mBitsPerSample = 16;
            return -100;
        }
    }
}
