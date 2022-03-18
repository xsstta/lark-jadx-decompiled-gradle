package com.ss.android.vc.meeting.utils;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60782u;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.net.service.VCSettingsService;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.utils.g */
public class C63492g {

    /* renamed from: a */
    private static AtomicBoolean f160404a = new AtomicBoolean(false);

    /* renamed from: b */
    private static volatile SoundPool f160405b;

    /* renamed from: c */
    private static final Object f160406c = new Object();

    /* renamed from: d */
    private static volatile int f160407d;

    /* renamed from: e */
    private static volatile int f160408e;

    /* renamed from: f */
    private static volatile int f160409f;

    /* renamed from: g */
    private static volatile int f160410g;

    /* renamed from: h */
    private static volatile File f160411h;

    /* renamed from: i */
    private static volatile File f160412i;

    /* renamed from: j */
    private static volatile boolean f160413j = false;

    /* renamed from: k */
    private static volatile boolean f160414k = false;

    /* renamed from: l */
    private static int f160415l = 1;

    /* renamed from: m */
    private static int f160416m = 2;

    /* renamed from: n */
    private static Handler f160417n;

    /* renamed from: o */
    private static volatile boolean f160418o = true;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.utils.g$a */
    public static class C63494a implements Serializable {
        public List<String> blackModelList;
        public List<String> models;

        private C63494a() {
            this.models = Collections.emptyList();
            this.blackModelList = Collections.emptyList();
        }
    }

    /* renamed from: a */
    public static void m248819a() {
        m248829g();
        C60700b.m235851b("MeetingTipTonePlayer", "[initSDKEffect]", String.valueOf(f160418o));
        if (f160418o) {
            C60735ab.m236018e($$Lambda$g$9QuQrkhFnboQytro1Y4wgArTCY.INSTANCE);
        }
    }

    /* renamed from: d */
    private static synchronized Handler m248826d() {
        Handler handler;
        synchronized (C63492g.class) {
            if (f160417n == null) {
                f160417n = new Handler(C60735ab.m236017e().getLooper());
            }
            handler = f160417n;
        }
        return handler;
    }

    /* renamed from: g */
    private static void m248829g() {
        if (f160404a.compareAndSet(false, true)) {
            f160418o = m248828f();
        }
    }

    /* renamed from: e */
    private static C63494a m248827e() {
        String settings = VCSettingsService.getSettings("vc_tone_play_config");
        C60700b.m235851b("MeetingTipTonePlayer", "[initConfig]", "config: " + settings);
        if (!TextUtils.isEmpty(settings)) {
            try {
                return (C63494a) JSON.parseObject(settings, C63494a.class);
            } catch (JSONException e) {
                C60700b.m235864f("MeetingTipTonePlayer", "[initConfig2]", e.getMessage());
            }
        }
        return new C63494a();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m248832j() {
        int a = C61237h.m238223a().mo210487a(f160416m, f160412i.getAbsolutePath(), true, 0, 100);
        C60700b.m235851b("MeetingTipTonePlayer", "[playOutMeetingTip3]", "play out meeting tip via sdk mix audio : " + a);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m248834l() {
        int a = C61237h.m238223a().mo210487a(f160415l, f160411h.getAbsolutePath(), true, 0, 100);
        C60700b.m235851b("MeetingTipTonePlayer", "[playInMeetingTip3]", "play in meeting tip via sdk mix audio : " + a);
    }

    /* renamed from: b */
    public static void m248823b() {
        m248829g();
        C60700b.m235851b("MeetingTipTonePlayer", "[unloadSDKEffect]", "start, mIsTonePlayEnable = " + f160418o);
        if (f160418o) {
            f160413j = false;
            f160414k = false;
            C61237h.m238223a().mo210485a(f160415l);
            C61237h.m238223a().mo210485a(f160416m);
            C60700b.m235851b("MeetingTipTonePlayer", "[unloadSDKEffect2]", "end");
        }
    }

    /* renamed from: c */
    public static void m248825c() {
        m248826d().removeCallbacksAndMessages(null);
        synchronized (f160406c) {
            if (f160405b != null) {
                try {
                    if (f160410g != 0) {
                        f160405b.stop(f160410g);
                    }
                    if (f160409f != 0) {
                        f160405b.stop(f160409f);
                    }
                    f160405b.release();
                    f160405b = null;
                    C60700b.m235851b("MeetingTipTonePlayer", "[stopTipTonePlayer]", String.format(Locale.getDefault(), "stop soundpool, sInMeetingToneStreamId = %d, sOutMeetingToneStreamId = %d", Integer.valueOf(f160409f), Integer.valueOf(f160410g)));
                } catch (Exception e) {
                    C60700b.m235846a("MeetingTipTonePlayer", "stopTipTonePlayer2", e);
                }
            }
        }
    }

    /* renamed from: f */
    private static boolean m248828f() {
        C63494a e = m248827e();
        String model = DeviceUtils.getModel();
        C60700b.m235851b("MeetingTipTonePlayer", "[updateConfig]", "[isTonePlayEnable] " + model);
        String lowerCase = model.toLowerCase(Locale.getDefault());
        if (!e.models.contains("all") && !e.models.contains(lowerCase)) {
            return false;
        }
        C60700b.m235851b("MeetingTipTonePlayer", "[updateConfig2]", "[isTonePlayEnable] model list ok");
        if (CollectionUtils.isEmpty(e.blackModelList) || !e.blackModelList.contains(lowerCase)) {
            return true;
        }
        C60700b.m235851b("MeetingTipTonePlayer", "[updateConfig3]", "[isTonePlayEnable] model in black list");
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m248831i() {
        synchronized (f160406c) {
            if (f160405b != null) {
                if (f160408e == 0) {
                    C60700b.m235861e("MeetingTipTonePlayer", "[playOutMeetingTip]", "error: in meeting ring not loaded.");
                } else {
                    f160410g = f160405b.play(f160408e, 1.0f, 1.0f, Integer.MAX_VALUE, 0, 1.0f);
                    C60700b.m235851b("MeetingTipTonePlayer", "[playOutMeetingTip4]", "play out meeting tip via soundpool, sOutMeetingToneStreamId = " + f160410g);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m248833k() {
        synchronized (f160406c) {
            if (f160405b != null) {
                if (f160407d == 0) {
                    C60700b.m235861e("MeetingTipTonePlayer", "[playInMeetingTip]", "error: in meeting ring not loaded.");
                } else {
                    f160409f = f160405b.play(f160407d, 1.0f, 1.0f, Integer.MAX_VALUE, 0, 1.0f);
                    C60700b.m235851b("MeetingTipTonePlayer", "[playInMeetingTip4]", "play in meeting tip via soundpool, sInMeetingToneStreamId = " + f160409f);
                }
            }
        }
    }

    /* renamed from: h */
    private static void m248830h() {
        synchronized (f160406c) {
            if (f160405b == null) {
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        SoundPool.Builder builder = new SoundPool.Builder();
                        builder.setMaxStreams(2);
                        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                        builder2.setLegacyStreamType(3);
                        builder.setAudioAttributes(builder2.build());
                        f160405b = builder.build();
                    } else {
                        f160405b = new SoundPool(2, 3, 0);
                    }
                    f160405b.setOnLoadCompleteListener($$Lambda$g$Y9ct4s_6qzefElKycfMCixCTmuc.INSTANCE);
                    f160407d = f160405b.load(ar.m236694a(), R.raw.ring_in_meeting, 1);
                    f160408e = f160405b.load(ar.m236694a(), R.raw.ring_out_meeting, 1);
                    C60700b.m235851b("MeetingTipTonePlayer", "lazyInitSoundPool", String.format(Locale.getDefault(), "sInMeetingSoundId = %d, sOutMeetingSoundId = %d", Integer.valueOf(f160407d), Integer.valueOf(f160408e)));
                } catch (Error e) {
                    C60700b.m235864f("MeetingTipTonePlayer", "[lazyInitSoundPool3]", e.getMessage());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ void m248835m() {
        boolean z;
        File file = new File(ar.m236694a().getFilesDir().getAbsolutePath(), "meetingtone");
        if (!file.exists()) {
            file.mkdirs();
        }
        f160411h = new File(file, "ring_in_meeting_2.mp3");
        if (!f160411h.exists()) {
            C60782u.m236222a(ar.m236694a(), R.raw.ring_in_meeting, "ring_in_meeting_2.mp3", file.getAbsolutePath());
        }
        f160412i = new File(file, "ring_out_meeting_2.mp3");
        if (!f160412i.exists()) {
            C60782u.m236222a(ar.m236694a(), R.raw.ring_out_meeting, "ring_out_meeting_2.mp3", file.getAbsolutePath());
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = true;
        if (C61237h.m238223a().mo210486a(f160415l, f160411h.getAbsolutePath()) == 0) {
            z = true;
        } else {
            z = false;
        }
        f160413j = z;
        if (C61237h.m238223a().mo210486a(f160416m, f160412i.getAbsolutePath()) != 0) {
            z2 = false;
        }
        f160414k = z2;
        C60700b.m235851b("MeetingTipTonePlayer", "[initSDKEffect2]", "sdkLoadInMeetingToneSuccess = " + f160413j + ", [initSDKEffect]sdkLoadOutMeetingToneSuccess = " + f160414k + ", Tone load duration: " + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    public static void m248821a(boolean z, Boolean bool) {
        m248822a(z, bool, 0);
    }

    /* renamed from: b */
    public static void m248824b(boolean z, Boolean bool) {
        m248829g();
        if (f160418o && bool.booleanValue()) {
            C60700b.m235843a("MeetingTipTonePlayer", "[playOutMeetingTip2]", "play out meeting ring, sdkLoadOutMeetingToneSuccess = " + f160414k);
            if (!z || !f160414k || f160412i == null) {
                m248830h();
                m248826d().postDelayed($$Lambda$g$3LBKWOWgdWUYg83mjpALY53uBfU.INSTANCE, 300);
                return;
            }
            m248826d().post($$Lambda$g$ig3bP9XPlC2PTjt4dJFE1mR6RA.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248820a(SoundPool soundPool, int i, int i2) {
        String str;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[1];
        if (i2 == 0) {
            str = "success";
        } else {
            str = "fail";
        }
        objArr[0] = str;
        C60700b.m235851b("MeetingTipTonePlayer", "lazyInitSoundPool2", String.format(locale, "ring file load: %s", objArr));
    }

    /* renamed from: a */
    public static void m248822a(boolean z, Boolean bool, long j) {
        m248829g();
        if (f160418o && bool.booleanValue()) {
            C60700b.m235843a("MeetingTipTonePlayer", "[playInMeetingTip2]", "play in meeting ring, sdkLoadInMeetingToneSuccess = " + f160413j);
            if (!z || !f160413j || f160411h == null) {
                m248830h();
                m248826d().postDelayed($$Lambda$g$K2jUf6CnE6VF1SV3EBhBUg0uRM.INSTANCE, j);
                return;
            }
            m248826d().post($$Lambda$g$RF4p3_2jxSMVvVFqTyupnvlnU.INSTANCE);
        }
    }
}
