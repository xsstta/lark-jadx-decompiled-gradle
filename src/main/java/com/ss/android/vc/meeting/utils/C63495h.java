package com.ss.android.vc.meeting.utils;

import android.content.Context;
import android.media.AudioManager;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.trace.C63784a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.utils.h */
public class C63495h {

    /* renamed from: a */
    private static AudioManager f160419a;

    /* renamed from: b */
    private static AtomicBoolean f160420b = new AtomicBoolean(false);

    /* renamed from: c */
    private static IMeetingsSizeChangeListener f160421c = new MusicUtils$1();

    /* renamed from: d */
    private static volatile int f160422d;

    /* renamed from: e */
    private static AudioManager.OnAudioFocusChangeListener f160423e = $$Lambda$h$Z7DgZ9ZMUgwNYRlDAb8ALziiPI8.INSTANCE;

    /* renamed from: c */
    public static void m248840c() {
        m248841d();
        f160419a.setMode(f160422d);
        f160419a.abandonAudioFocus(f160423e);
    }

    /* renamed from: d */
    private static void m248841d() {
        if (f160419a == null) {
            f160419a = (AudioManager) ar.m236694a().getSystemService("audio");
        }
    }

    /* renamed from: b */
    public static boolean m248839b() {
        String str;
        m248841d();
        boolean z = false;
        if (f160419a.requestAudioFocus(f160423e, 0, 2) == 1) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("result=");
        if (z) {
            str = "AUDIOFOCUS_REQUEST_GRANTED";
        } else {
            str = "AUDIOFOCUS_REQUEST_FAILED";
        }
        sb.append(str);
        C60700b.m235851b("MeetingAudioManager", "[requestAudioFocus]", sb.toString());
        return z;
    }

    /* renamed from: a */
    public static void m248836a() {
        String str;
        m248841d();
        f160422d = f160419a.getMode();
        C63784a.m250428a("music_2");
        int requestAudioFocus = f160419a.requestAudioFocus(f160423e, 0, 2);
        C63784a.m250429b("music_2");
        StringBuilder sb = new StringBuilder();
        sb.append("requestAudioFocus result=");
        if (requestAudioFocus == 1) {
            str = "AUDIOFOCUS_REQUEST_GRANTED";
        } else {
            str = "AUDIOFOCUS_REQUEST_FAILED";
        }
        sb.append(str);
        C60700b.m235851b("MeetingAudioManager", "[muteMusic]", sb.toString());
        C63784a.m250428a("music_3");
        f160419a.setMode(3);
        C63784a.m250429b("music_3");
    }

    /* renamed from: a */
    public static void m248838a(Context context) {
        if (f160420b.compareAndSet(false, true)) {
            f160419a = (AudioManager) context.getSystemService("audio");
            MeetingManager.m238341a().addMeetingsSizeChangeListener(f160421c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248837a(int i) {
        if (i == -2) {
            C60700b.m235851b("MeetingAudioManager", "[onAudioFocusChange4]", "AUDIOFOCUS_LOSS_TRANSIENT");
            MeetingAudioManager.m239471k().mo212703g();
        } else if (i == -1) {
            C60700b.m235851b("MeetingAudioManager", "[onAudioFocusChange3]", "AUDIOFOCUS_LOSS");
            MeetingAudioManager.m239471k().mo212703g();
        } else if (i == 1) {
            C60700b.m235851b("MeetingAudioManager", "[onAudioFocusChange]", "AUDIOFOCUS_GAIN");
            MeetingAudioManager.m239471k().mo212713r();
        } else if (i != 2) {
            C60700b.m235851b("MeetingAudioManager", "[onAudioFocusChange5]", "default = " + i);
        } else {
            C60700b.m235851b("MeetingAudioManager", "[onAudioFocusChange2]", "AUDIOFOCUS_GAIN_TRANSIENT");
            MeetingAudioManager.m239471k().mo212713r();
        }
    }
}
