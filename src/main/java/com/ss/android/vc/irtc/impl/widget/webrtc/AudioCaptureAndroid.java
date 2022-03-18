package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.content.Context;
import android.content.Intent;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.content.PermissionChecker;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.vc.irtc.C61064p;
import com.ss.video.rtc.meeting.MeetingRtcEngine;

public class AudioCaptureAndroid extends MediaProjection.Callback {
    static Handler sHandler;
    static final HandlerThread sHandlerThread;
    private int audioMode;
    private AudioRecord audioRecord;
    private Context context;
    private volatile boolean isRecording;
    private MediaProjection mediaProjection;
    private boolean mediaProjectionStop;
    private Thread recordingThread;
    private MeetingRtcEngine rtcEngine;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public void destroy() {
        C61064p.m237485a("AudioCaptureAndroid", "destroy");
        stopAudioCapture();
    }

    static {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("vc-audio-share");
        sHandlerThread = new_android_os_HandlerThread_by_knot;
        new_android_os_HandlerThread_by_knot.start();
        sHandler = new Handler(new_android_os_HandlerThread_by_knot.getLooper());
    }

    public void onStop() {
        super.onStop();
        C61064p.m237487c("AudioCaptureAndroid", "mediaProjection onStop");
        this.mediaProjectionStop = true;
        stopAudioCapture_();
    }

    public void stopAudioCapture() {
        sHandler.removeCallbacksAndMessages(null);
        sHandler.post(new Runnable() {
            /* class com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$AudioCaptureAndroid$RBUAHLUfIfyafoI5EQ6pdK1NTCA */

            public final void run() {
                AudioCaptureAndroid.this.stopAudioCapture_();
            }
        });
    }

    /* access modifiers changed from: private */
    public void stopAudioCapture_() {
        if (Build.VERSION.SDK_INT >= 29) {
            C61064p.m237485a("AudioCaptureAndroid", "stopAudioCapture, isRecording: " + this.isRecording);
            if (this.isRecording) {
                MeetingRtcEngine meetingRtcEngine = this.rtcEngine;
                if (meetingRtcEngine != null) {
                    meetingRtcEngine.unpublishScreenAudio();
                }
                this.isRecording = false;
                AudioRecord audioRecord2 = this.audioRecord;
                if (audioRecord2 != null) {
                    audioRecord2.stop();
                    this.audioRecord.release();
                    this.audioRecord = null;
                }
                MediaProjection mediaProjection2 = this.mediaProjection;
                if (mediaProjection2 != null) {
                    mediaProjection2.unregisterCallback(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void doRun() {
        short[] sArr = new short[1024];
        Thread thread = this.recordingThread;
        C61064p.m237485a("AudioCaptureAndroid", "capture thread run: " + thread);
        while (true) {
            if (!this.isRecording) {
                break;
            }
            AudioRecord audioRecord2 = this.audioRecord;
            if (audioRecord2 == null) {
                C61064p.m237487c("AudioCaptureAndroid", "doRun, audioRecord is null");
                break;
            }
            boolean z = false;
            int read = audioRecord2.read(sArr, 0, 1024);
            if (read < 0) {
                C61064p.m237487c("AudioCaptureAndroid", "audioRecord.read: " + read);
            } else {
                int i = 0;
                while (true) {
                    if (i >= 1024) {
                        break;
                    } else if (sArr[i] != 0) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    C61064p.m237486b("AudioCaptureAndroid", "invalid data 000");
                }
                byte[] short2byte = short2byte(sArr);
                MeetingRtcEngine meetingRtcEngine = this.rtcEngine;
                if (meetingRtcEngine == null) {
                    C61064p.m237487c("AudioCaptureAndroid", "doRun, rtcEngine is null");
                    break;
                }
                meetingRtcEngine.pushScreenAudioFrame(short2byte, 1024, 2, 1, 48000);
            }
        }
        C61064p.m237485a("AudioCaptureAndroid", "capture thread exit: " + thread);
    }

    public AudioCaptureAndroid setRtcEngine(MeetingRtcEngine meetingRtcEngine) {
        this.rtcEngine = meetingRtcEngine;
        return this;
    }

    AudioCaptureAndroid(Context context2) {
        this.context = context2.getApplicationContext();
    }

    private void setMusicMode(boolean z) {
        AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
        if (z) {
            try {
                this.audioMode = audioManager.getMode();
                audioManager.setMode(0);
            } catch (Exception e) {
                C61064p.m237487c("AudioCaptureAndroid", z + ", " + e.getMessage());
            }
        } else {
            audioManager.setMode(this.audioMode);
        }
    }

    private byte[] short2byte(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[(length * 2)];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i2] = (byte) (sArr[i] & 255);
            bArr[i2 + 1] = (byte) (sArr[i] >> 8);
            sArr[i] = 0;
        }
        return bArr;
    }

    public static AudioCaptureAndroid create(Context context2, MeetingRtcEngine meetingRtcEngine) {
        return new AudioCaptureAndroid(context2).setRtcEngine(meetingRtcEngine);
    }

    public void startAudioCapture(Intent intent, IMediaProjectionProvider iMediaProjectionProvider) {
        sHandler.post(new Runnable(intent, iMediaProjectionProvider) {
            /* class com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$AudioCaptureAndroid$7iemKYWAT7_vwuCdhYpxI_p3I5E */
            public final /* synthetic */ Intent f$1;
            public final /* synthetic */ IMediaProjectionProvider f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                AudioCaptureAndroid.this.lambda$startAudioCapture$0$AudioCaptureAndroid(this.f$1, this.f$2);
            }
        });
    }

    private static boolean hasPermissions(Context context2, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        for (String str : strArr) {
            if (!selfPermissionGranted(context2, str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean selfPermissionGranted(Context context2, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context2.getApplicationInfo().targetSdkVersion >= 23) {
            if (context2.checkSelfPermission(str) == 0) {
                return true;
            }
        } else if (PermissionChecker.checkSelfPermission(context2, str) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: startAudioCapture_ */
    public void lambda$startAudioCapture$0$AudioCaptureAndroid(Intent intent, IMediaProjectionProvider iMediaProjectionProvider) {
        if (Build.VERSION.SDK_INT >= 29) {
            C61064p.m237485a("AudioCaptureAndroid", "startAudioCapture, isRecording: " + this.isRecording + ", mediaProjectionStop: " + this.mediaProjectionStop);
            if (!this.isRecording) {
                if (iMediaProjectionProvider == null || iMediaProjectionProvider.getMediaProjection() == null) {
                    C61064p.m237487c("AudioCaptureAndroid", "projectionProvider or getMediaProjection is null, " + iMediaProjectionProvider);
                } else if (!iMediaProjectionProvider.isValid()) {
                    C61064p.m237487c("AudioCaptureAndroid", "share screen is stop");
                } else {
                    MediaProjection mediaProjection2 = iMediaProjectionProvider.getMediaProjection();
                    if (this.mediaProjection != mediaProjection2 || !this.mediaProjectionStop) {
                        try {
                            AudioRecord build = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(48000).setChannelMask(16).build()).setBufferSizeInBytes(2048).setAudioPlaybackCaptureConfig(new AudioPlaybackCaptureConfiguration.Builder(mediaProjection2).addMatchingUsage(1).addMatchingUsage(14).addMatchingUsage(0).build()).build();
                            this.audioRecord = build;
                            if (build.getState() == 0) {
                                boolean hasPermissions = hasPermissions(this.context, "android.permission.RECORD_AUDIO");
                                C61064p.m237487c("AudioCaptureAndroid", "audioRecord init fail, permission: " + hasPermissions);
                                this.audioRecord = null;
                                return;
                            }
                            this.mediaProjectionStop = false;
                            this.mediaProjection = mediaProjection2;
                            mediaProjection2.registerCallback(this, sHandler);
                            setMusicMode(true);
                            this.isRecording = true;
                            this.audioRecord.startRecording();
                            this.rtcEngine.publishScreenAudio();
                            Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread(new Runnable() {
                                /* class com.ss.android.vc.irtc.impl.widget.webrtc.$$Lambda$AudioCaptureAndroid$BIpGWxd1k_Xum411F8Dv9uGQpVc */

                                public final void run() {
                                    AudioCaptureAndroid.this.doRun();
                                }
                            }));
                            this.recordingThread = new_insert_after_java_lang_Thread_by_knot;
                            new_insert_after_java_lang_Thread_by_knot.start();
                            setMusicMode(false);
                        } catch (UnsupportedOperationException e) {
                            C61064p.m237487c("AudioCaptureAndroid", e.getMessage());
                        }
                    } else {
                        C61064p.m237487c("AudioCaptureAndroid", "mediaProjection is stop, cannot use");
                    }
                }
            }
        }
    }
}
