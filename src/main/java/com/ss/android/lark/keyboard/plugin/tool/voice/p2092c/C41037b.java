package com.ss.android.lark.keyboard.plugin.tool.voice.p2092c;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.c.b */
public class C41037b {

    /* renamed from: a */
    private static C41037b f104489a;

    /* renamed from: b */
    private AudioFocusRequest f104490b;

    /* renamed from: c */
    private AudioManager f104491c;

    /* renamed from: d */
    private final AudioManager.OnAudioFocusChangeListener f104492d = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41037b.C410381 */

        public void onAudioFocusChange(int i) {
            if (i == -3) {
                Log.m165389i("AudioFocusHelper", "onAudioFocusChange LOSS_TRANSIENT_CAN_DUCK");
            } else if (i == -2) {
                Log.m165389i("AudioFocusHelper", "onAudioFocusChange LOSS_TRANSIENT");
            } else if (i == -1) {
                Log.m165389i("AudioFocusHelper", "onAudioFocusChange LOSS");
            } else if (i == 1) {
                Log.m165389i("AudioFocusHelper", "onAudioFocusChange GAIN");
            }
        }
    };

    /* renamed from: a */
    public boolean mo147954a() {
        return mo147958b(this.f104492d);
    }

    /* renamed from: b */
    public boolean mo147957b() {
        return mo147956a(this.f104492d);
    }

    /* renamed from: b */
    public boolean mo147958b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        return mo147955a(4, onAudioFocusChangeListener);
    }

    public C41037b(Context context) {
        this.f104491c = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: a */
    public static C41037b m162698a(Context context) {
        if (f104489a == null) {
            synchronized (C41037b.class) {
                if (f104489a == null) {
                    f104489a = new C41037b(context);
                }
            }
        }
        return f104489a;
    }

    /* renamed from: a */
    public boolean mo147956a(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        int i;
        if (Build.VERSION.SDK_INT > 26) {
            AudioFocusRequest audioFocusRequest = this.f104490b;
            if (audioFocusRequest != null) {
                i = this.f104491c.abandonAudioFocusRequest(audioFocusRequest);
            } else {
                i = -1;
            }
        } else {
            AudioManager audioManager = this.f104491c;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = this.f104492d;
            }
            i = audioManager.abandonAudioFocus(onAudioFocusChangeListener);
        }
        if (i == 0) {
            Log.m165389i("AudioFocusHelper", "abandonAudioFocus failed");
        } else if (i != 1) {
            Log.m165389i("AudioFocusHelper", "abandonAudioFocus no need");
        } else {
            Log.m165389i("AudioFocusHelper", "abandonAudioFocus granted");
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo147955a(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        int i2;
        if (Build.VERSION.SDK_INT > 26) {
            AudioFocusRequest.Builder audioAttributes = new AudioFocusRequest.Builder(i).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = this.f104492d;
            }
            AudioFocusRequest build = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener).build();
            this.f104490b = build;
            i2 = this.f104491c.requestAudioFocus(build);
        } else {
            AudioManager audioManager = this.f104491c;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = this.f104492d;
            }
            i2 = audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, i);
        }
        if (i2 == 0) {
            Log.m165389i("AudioFocusHelper", "requestAudioFocus failed");
            LKUIToast.show(UIHelper.getContext(), (int) R.string.Lark_Legacy_ErrorMessage);
        } else if (i2 == 1) {
            Log.m165389i("AudioFocusHelper", "requestAudioFocus granted");
            return true;
        }
        return false;
    }
}
