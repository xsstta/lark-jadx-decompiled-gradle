package com.ss.android.lark.voip.service.impl.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.bytertc.C61237h;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class VoIPAudioManager {

    /* renamed from: d */
    private static VoIPAudioManager f143107d;

    /* renamed from: a */
    public volatile AudioType f143108a = AudioType.Default;

    /* renamed from: b */
    public volatile String f143109b;

    /* renamed from: c */
    public volatile BluetoothProfile f143110c;

    /* renamed from: e */
    private volatile boolean f143111e;

    /* renamed from: f */
    private AudioManager f143112f = ((AudioManager) C57977a.m224905c().getContext().getSystemService("audio"));

    /* renamed from: g */
    private volatile boolean f143113g = true;

    /* renamed from: h */
    private volatile AudioType f143114h = AudioType.Default;

    /* renamed from: i */
    private volatile boolean f143115i = true;

    /* renamed from: j */
    private List<AbstractC58193a> f143116j = new CopyOnWriteArrayList();

    /* renamed from: k */
    private volatile AudioManager.OnAudioFocusChangeListener f143117k = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$GfxazfX0absxSLDm3jN4P6zWUuY */

        public final void onAudioFocusChange(int i) {
            VoIPAudioManager.this.m225766b((VoIPAudioManager) i);
        }
    };

    /* renamed from: l */
    private volatile AudioFocusRequest f143118l;

    /* renamed from: m */
    private Handler f143119m = new Handler(Looper.getMainLooper());

    public enum AudioType {
        Default,
        Bluetooth,
        HeadPhone
    }

    /* renamed from: com.ss.android.lark.voip.service.impl.util.VoIPAudioManager$a */
    public interface AbstractC58193a {
        /* renamed from: a */
        void mo196667a(AudioType audioType, boolean z, boolean z2);

        /* renamed from: b */
        void mo196671b(AudioType audioType, boolean z, boolean z2);
    }

    /* renamed from: b */
    public String mo197186b() {
        return this.f143109b;
    }

    /* renamed from: f */
    public AudioType mo197191f() {
        return this.f143108a;
    }

    /* renamed from: g */
    public boolean mo197192g() {
        return this.f143111e;
    }

    /* renamed from: c */
    public boolean mo197188c() {
        return this.f143112f.isWiredHeadsetOn();
    }

    /* renamed from: i */
    public int mo197194i() {
        return this.f143112f.getRingerMode();
    }

    /* renamed from: D */
    private String m225749D() {
        return m225761a(this.f143108a, this.f143111e);
    }

    /* renamed from: d */
    public void mo197189d() {
        m225763a(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$WWvvEuN6oreomy3HYDK8znM0lQ */

            public final void run() {
                VoIPAudioManager.this.m225758M();
            }
        });
    }

    /* renamed from: e */
    public void mo197190e() {
        m225763a(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$Py9YhlTdPb8hm6tYU754xl1Rhds */

            public final void run() {
                VoIPAudioManager.this.m225757L();
            }
        });
    }

    /* renamed from: h */
    public boolean mo197193h() {
        if (this.f143108a != AudioType.Default || this.f143111e) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo197196k() {
        m225763a(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$aMkWhg5kJ4QBl1FZy8W7Xkn6oMs */

            public final void run() {
                VoIPAudioManager.this.m225755J();
            }
        });
    }

    /* renamed from: l */
    public void mo197197l() {
        m225763a(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$LOpLxzHbPi_PCxOk1fUswTSat20 */

            public final void run() {
                VoIPAudioManager.this.m225754I();
            }
        });
    }

    /* renamed from: m */
    public void mo197198m() {
        m225763a(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$IKpVM6hxPFNDhZ8zKbTExcAuiAA */

            public final void run() {
                VoIPAudioManager.this.m225753H();
            }
        });
    }

    /* renamed from: n */
    public void mo197199n() {
        m225763a(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$Y8Ig87RyBLSBiG266bTh_qZ8kY */

            public final void run() {
                VoIPAudioManager.this.m225752G();
            }
        });
    }

    /* renamed from: o */
    public void mo197200o() {
        m225763a(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$NkxbMSVANQaLaPb41iXXiN4CaU */

            public final void run() {
                VoIPAudioManager.this.m225751F();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.voip.service.impl.util.VoIPAudioManager$2 */
    public static /* synthetic */ class C581922 {

        /* renamed from: a */
        static final /* synthetic */ int[] f143121a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.voip.service.impl.util.VoIPAudioManager$AudioType[] r0 = com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AudioType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.C581922.f143121a = r0
                com.ss.android.lark.voip.service.impl.util.VoIPAudioManager$AudioType r1 = com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AudioType.Bluetooth     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.C581922.f143121a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.voip.service.impl.util.VoIPAudioManager$AudioType r1 = com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.AudioType.HeadPhone     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.C581922.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m225756K() {
        C58103o.m225371a().mo196950g().mo197048a().mo197039b(this.f143111e);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m225759N() {
        for (AbstractC58193a aVar : this.f143116j) {
            aVar.mo196671b(this.f143114h, this.f143115i, false);
        }
    }

    /* renamed from: a */
    public static VoIPAudioManager m225760a() {
        if (f143107d == null) {
            synchronized (VoIPAudioManager.class) {
                if (f143107d == null) {
                    f143107d = new VoIPAudioManager();
                }
            }
        }
        return f143107d;
    }

    /* renamed from: r */
    private void m225771r() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            defaultAdapter.getProfileProxy(ar.m236694a(), new BluetoothProfile.ServiceListener() {
                /* class com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.C581911 */

                public void onServiceDisconnected(int i) {
                    C58151d.m225577a("VoIPAudioManager", "BluetoothProfile onServiceDisconnected");
                }

                public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                    C58151d.m225577a("VoIPAudioManager", "BluetoothProfile onServiceConnected");
                    VoIPAudioManager.this.f143110c = bluetoothProfile;
                    List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
                    if (connectedDevices != null && connectedDevices.size() > 0) {
                        VoIPAudioManager.this.f143109b = connectedDevices.get(0).getName();
                        C61237h.m238223a().mo211784I();
                        C58151d.m225577a("VoIPAudioManager", "BluetoothProfile deviceName=" + VoIPAudioManager.this.f143109b);
                        if (VoIPAudioManager.this.f143108a != AudioType.Bluetooth) {
                            VoIPAudioManager.this.mo197198m();
                        }
                    }
                }
            }, 1);
        }
    }

    /* renamed from: s */
    private void m225772s() {
        C58151d.m225577a("VoIPAudioManager", "switch to bluetooth");
        this.f143111e = false;
        this.f143108a = AudioType.Bluetooth;
        C58103o.m225371a().mo196950g().mo197048a().mo197039b(false);
    }

    /* renamed from: t */
    private void m225773t() {
        C58151d.m225577a("VoIPAudioManager", "switch to HeadPhone");
        this.f143111e = false;
        this.f143108a = AudioType.HeadPhone;
        C58103o.m225371a().mo196950g().mo197048a().mo197039b(false);
    }

    /* renamed from: u */
    private void m225774u() {
        C58151d.m225577a("VoIPAudioManager", "switch to earpiece");
        this.f143111e = false;
        this.f143108a = AudioType.Default;
        C58103o.m225371a().mo196950g().mo197048a().mo197039b(false);
    }

    /* renamed from: y */
    private void m225778y() {
        C58151d.m225577a("VoIPAudioManager", "switch to out speaker");
        this.f143111e = true;
        C58103o.m225371a().mo196950g().mo197048a().mo197039b(true);
    }

    /* renamed from: z */
    private void m225779z() {
        C58151d.m225577a("VoIPAudioManager", "clickSpeakerOut");
        this.f143114h = this.f143108a;
        this.f143115i = this.f143111e;
        this.f143111e = true;
        m225778y();
        m225764a(this.f143115i, true);
    }

    /* renamed from: j */
    public boolean mo197195j() {
        if (mo197188c() || m225770q()) {
            return true;
        }
        return false;
    }

    private VoIPAudioManager() {
    }

    /* renamed from: A */
    private void m225746A() {
        boolean z;
        C58151d.m225577a("VoIPAudioManager", "clickHeadPhone");
        this.f143114h = this.f143108a;
        this.f143115i = this.f143111e;
        m225773t();
        if (this.f143114h != AudioType.HeadPhone || this.f143115i) {
            z = false;
        } else {
            z = true;
        }
        m225764a(z, true);
    }

    /* renamed from: B */
    private void m225747B() {
        boolean z;
        C58151d.m225577a("VoIPAudioManager", "clickBluetooth");
        this.f143114h = this.f143108a;
        this.f143115i = this.f143111e;
        m225772s();
        if (this.f143114h != AudioType.Bluetooth || this.f143115i) {
            z = false;
        } else {
            z = true;
        }
        m225764a(z, true);
    }

    /* renamed from: C */
    private void m225748C() {
        boolean z;
        C58151d.m225577a("VoIPAudioManager", "clickEarpiece");
        this.f143114h = this.f143108a;
        this.f143115i = this.f143111e;
        m225774u();
        if (this.f143114h != AudioType.Default || this.f143115i) {
            z = false;
        } else {
            z = true;
        }
        m225764a(z, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m225750E() {
        C58151d.m225577a("VoIPAudioManager", String.format("onPhoneStateIdle: force change audio route(isOutSpeaker=%b)", Boolean.valueOf(this.f143111e)));
        C58103o.m225371a().mo196950g().mo197048a().mo197039b(this.f143111e);
    }

    /* renamed from: q */
    private boolean m225770q() {
        boolean z;
        boolean z2;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        if (defaultAdapter.getProfileConnectionState(1) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (defaultAdapter.getProfileConnectionState(2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C58151d.m225577a("VoIPAudioManager", String.format("isBluetoothScoOn=%b,isBluetoothA2dpOn=%b", Boolean.valueOf(z), Boolean.valueOf(z2)));
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private void m225776w() {
        C58151d.m225577a("VoIPAudioManager", "continueMusic");
        if (Build.VERSION.SDK_INT < 26) {
            this.f143112f.abandonAudioFocus(this.f143117k);
        } else if (this.f143118l != null) {
            this.f143112f.abandonAudioFocusRequest(this.f143118l);
        }
        m225762a(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m225751F() {
        String D = m225749D();
        if (this.f143111e) {
            int i = C581922.f143121a[this.f143108a.ordinal()];
            if (i == 1) {
                m225747B();
            } else if (i != 2) {
                m225748C();
            } else {
                m225746A();
            }
        } else {
            m225779z();
        }
        C58151d.m225578a("ui", "audio_manager", "switchAudio", String.format("from %s to %s", D, m225749D()));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m225752G() {
        boolean z;
        boolean z2;
        C58151d.m225577a("VoIPAudioManager", "disconnectBluetooth");
        String D = m225749D();
        this.f143114h = this.f143108a;
        this.f143115i = this.f143111e;
        if (mo197188c()) {
            m225773t();
            if (this.f143114h != AudioType.HeadPhone || this.f143115i) {
                z2 = false;
            } else {
                z2 = true;
            }
            m225764a(z2, true);
        } else {
            this.f143108a = AudioType.Default;
            this.f143111e = true;
            if (this.f143113g) {
                m225774u();
                if (this.f143114h != AudioType.Default || this.f143115i) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                m225778y();
                z = this.f143115i;
            }
            m225764a(z, true);
        }
        C58151d.m225578a("system_broadcast", "audio_manager", "disconnectBluetooth", String.format("from %s to %s", D, m225749D()));
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m225753H() {
        boolean z;
        C58151d.m225577a("VoIPAudioManager", "connectBluetooth");
        String D = m225749D();
        this.f143114h = this.f143108a;
        this.f143115i = this.f143111e;
        m225772s();
        if (this.f143114h != AudioType.Bluetooth || this.f143115i) {
            z = false;
        } else {
            z = true;
        }
        m225764a(z, true);
        C58151d.m225578a("system_broadcast", "audio_manager", "connectBluetooth", String.format("from %s to %s", D, m225749D()));
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m225754I() {
        boolean z;
        C58151d.m225577a("VoIPAudioManager", "plugOutHeadPhone");
        String D = m225749D();
        this.f143114h = this.f143108a;
        this.f143115i = this.f143111e;
        if (this.f143108a == AudioType.HeadPhone) {
            this.f143108a = AudioType.Default;
            this.f143111e = true;
            if (this.f143113g) {
                m225774u();
                if (this.f143114h != AudioType.Default || this.f143115i) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                m225778y();
                z = this.f143115i;
            }
            m225764a(z, true);
        }
        C58151d.m225578a("system_broadcast", "audio_manager", "plugOutHeadPhone", String.format("from %s to %s", D, m225749D()));
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m225755J() {
        boolean z;
        C58151d.m225577a("VoIPAudioManager", "plugInHeadPhone");
        String D = m225749D();
        this.f143114h = this.f143108a;
        this.f143115i = this.f143111e;
        if (this.f143108a != AudioType.Bluetooth) {
            m225773t();
            if (this.f143114h != AudioType.HeadPhone || this.f143115i) {
                z = false;
            } else {
                z = true;
            }
            m225764a(z, true);
        }
        C58151d.m225578a("system_broadcast", "audio_manager", "plugOutHeadPhone", String.format("from %s to %s", D, m225749D()));
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m225757L() {
        C58151d.m225577a("VoIPAudioManager", "onEndCall");
        this.f143113g = true;
        this.f143114h = this.f143108a;
        this.f143115i = this.f143111e;
        this.f143111e = false;
        if (this.f143111e) {
            this.f143108a = AudioType.Default;
        } else if (m225770q()) {
            this.f143108a = AudioType.Bluetooth;
        } else if (mo197188c()) {
            this.f143108a = AudioType.HeadPhone;
        } else {
            this.f143108a = AudioType.Default;
        }
        C58151d.m225577a("VoIPAudioManager", "setSpeakerOn() called with: on =false,type=" + this.f143108a);
        C58103o.m225371a().mo196950g().mo197048a().mo197047e();
        C58151d.m225578a("state_machine", "audio_manager", "closeAudioRoute", "");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (!(defaultAdapter == null || this.f143110c == null)) {
            defaultAdapter.closeProfileProxy(1, this.f143110c);
            this.f143110c = null;
        }
        m225776w();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r4.f143115i == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r4.f143115i == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r4.f143115i == false) goto L_0x002e;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m225758M() {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.voip.service.impl.util.VoIPAudioManager.m225758M():void");
    }

    /* renamed from: v */
    private void m225775v() {
        C58151d.m225577a("VoIPAudioManager", "muteMusic");
        if (Build.VERSION.SDK_INT >= 26) {
            this.f143118l = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(this.f143117k).build();
            this.f143112f.requestAudioFocus(this.f143118l);
        } else {
            this.f143112f.requestAudioFocus(this.f143117k, 0, 2);
        }
        m225762a(3);
    }

    /* renamed from: x */
    private void m225777x() {
        C58151d.m225577a("VoIPAudioManager", String.format("resetInEarMonitoring isOutSpeaker=%b,mAudioManager.isSpeakerphoneOn=%b", Boolean.valueOf(this.f143111e), Boolean.valueOf(this.f143112f.isSpeakerphoneOn())));
        if (this.f143111e != this.f143112f.isSpeakerphoneOn()) {
            C58103o.m225371a().mo196950g().mo197048a().mo197039b(!this.f143111e);
            this.f143119m.removeCallbacksAndMessages(null);
            this.f143119m.postDelayed(new Runnable() {
                /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$HjrsygSNctqaj91rDybIQu7oKk */

                public final void run() {
                    VoIPAudioManager.this.m225756K();
                }
            }, 200);
        }
    }

    /* renamed from: p */
    public void mo197201p() {
        C58151d.m225577a("VoIPAudioManager", String.format("onPhoneStateIdle: isOutSpeaker=%b, type=%s", Boolean.valueOf(this.f143111e), this.f143108a.toString()));
        if (C58103o.m225371a().mo196952i() && this.f143108a == AudioType.Bluetooth) {
            C58103o.m225371a().mo196950g().mo197048a().mo197039b(!this.f143111e);
            this.f143119m.removeCallbacksAndMessages(null);
            this.f143119m.postDelayed(new Runnable() {
                /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$AGjokaQfMdUYFCvcTv_kj2zYQU */

                public final void run() {
                    VoIPAudioManager.this.m225750E();
                }
            }, 50);
        }
    }

    /* renamed from: a */
    private void m225762a(int i) {
        this.f143112f.setMode(i);
    }

    /* renamed from: b */
    public void mo197187b(AbstractC58193a aVar) {
        this.f143116j.remove(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m225767b(boolean z) {
        if (this.f143113g != z) {
            this.f143113g = z;
            if (this.f143108a == AudioType.Default) {
                if (z) {
                    m225774u();
                } else {
                    m225778y();
                }
            }
        }
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$uXo8slRSB7qeOLKvr4Mz66ahI */

            public final void run() {
                VoIPAudioManager.this.m225759N();
            }
        });
    }

    /* renamed from: a */
    private void m225763a(Runnable runnable) {
        if (Looper.myLooper() == CoreThreadPool.getSerialTaskHandler().getLooper()) {
            runnable.run();
        } else {
            CoreThreadPool.getSerialTaskHandler().post(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m225766b(int i) {
        C58151d.m225577a("VoIPAudioManager", "onAudioFocusChange: focusChange = " + i);
        if (i == -2) {
            C58151d.m225577a("VoIPAudioManager", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT");
        } else if (i == -1) {
            C58151d.m225577a("VoIPAudioManager", "onAudioFocusChange: AUDIOFOCUS_LOSS");
        } else if (i == 1 || i == 2) {
            C58151d.m225577a("VoIPAudioManager", "onAudioFocusChange: resetInEarMonitoring");
            m225777x();
        } else {
            C58151d.m225577a("VoIPAudioManager", "onAudioFocusChange: default = " + i);
        }
    }

    /* renamed from: b */
    private boolean m225769b(BluetoothDevice bluetoothDevice) {
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass != null) {
            String str = null;
            int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
            if (majorDeviceClass == 0) {
                str = "MISC";
            } else if (majorDeviceClass == 256) {
                str = "COMPUTER";
            } else if (majorDeviceClass == 512) {
                str = "PHONE";
            } else if (majorDeviceClass == 768) {
                str = "NETWORKING";
            } else if (majorDeviceClass == 1280) {
                str = "PERIPHERAL";
            } else if (majorDeviceClass == 1536) {
                str = "IMAGING";
            } else if (majorDeviceClass == 1792) {
                str = "WEARABLE";
            } else if (majorDeviceClass == 2048) {
                str = "TOY";
            } else if (majorDeviceClass == 2304) {
                str = "HEALTH";
            }
            if (!TextUtils.isEmpty(str)) {
                C58151d.m225577a("VoIPAudioManager", String.format("%s(%s) is not HeadsetDevice", bluetoothDevice.getName(), str));
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo197183a(BluetoothDevice bluetoothDevice) {
        String D = m225749D();
        C58151d.m225577a("VoIPAudioManager", "isBluetoothHeadsetOn=" + m225770q());
        if (bluetoothDevice != null) {
            boolean b = m225769b(bluetoothDevice);
            C58151d.m225577a("VoIPAudioManager", String.format("BluetoothDevice name=%s,isHeadsetDevice=%b", bluetoothDevice.getName(), Boolean.valueOf(b)));
            if (b) {
                this.f143109b = bluetoothDevice.getName();
                mo197198m();
            }
        }
        C58151d.m225578a("system_broadcast", "audio_manager", "checkBluetoothDevice", String.format("from %s to %s", D, m225749D()));
    }

    /* renamed from: a */
    public void mo197184a(AbstractC58193a aVar) {
        this.f143116j.add(aVar);
    }

    /* renamed from: a */
    public void mo197185a(boolean z) {
        m225763a(new Runnable(z) {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$UEoICb9KQPA121IkxaGEntepdHQ */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                VoIPAudioManager.this.m225767b((VoIPAudioManager) this.f$1);
            }
        });
    }

    /* renamed from: a */
    private void m225764a(boolean z, boolean z2) {
        m225765a(z, z2, false);
    }

    /* renamed from: a */
    public static String m225761a(AudioType audioType, boolean z) {
        if (z) {
            return "speaker";
        }
        int i = C581922.f143121a[audioType.ordinal()];
        if (i == 1) {
            return "bluetooth";
        }
        if (i != 2) {
            return "earpiece";
        }
        return "headphone";
    }

    /* renamed from: a */
    private void m225765a(boolean z, boolean z2, boolean z3) {
        C58151d.m225577a("VoIPAudioManager", "updatePage");
        UICallbackExecutor.execute(new Runnable(z, z2, z3) {
            /* class com.ss.android.lark.voip.service.impl.util.$$Lambda$VoIPAudioManager$TxlfPywpaRL4jEJNrKYEn_nMI4 */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                VoIPAudioManager.this.m225768b(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m225768b(boolean z, boolean z2, boolean z3) {
        for (AbstractC58193a aVar : this.f143116j) {
            if (z) {
                aVar.mo196667a(this.f143114h, this.f143115i, z2);
            } else {
                aVar.mo196671b(this.f143114h, this.f143115i, z2);
                if (!z3) {
                    if (this.f143111e) {
                        LKUIToast.show(C57977a.m224905c().getContext(), (int) R.string.View_VM_SpeakerOn);
                    } else {
                        int i = C581922.f143121a[this.f143108a.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                LKUIToast.show(C57977a.m224905c().getContext(), (int) R.string.View_VM_SpeakerOff);
                            } else {
                                LKUIToast.show(C57977a.m224905c().getContext(), (int) R.string.View_G_Headphones);
                            }
                        } else if (TextUtils.isEmpty(this.f143109b)) {
                            LKUIToast.show(C57977a.m224905c().getContext(), (int) R.string.View_G_Bluetooth);
                        } else {
                            LKUIToast.show(C57977a.m224905c().getContext(), m225760a().mo197186b());
                        }
                    }
                }
            }
        }
    }
}
