package com.ss.android.vc.meeting.module.audio;

import android.app.Activity;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder;
import com.ss.android.vc.meeting.utils.C63495h;
import com.ss.android.vc.route.request.EquipmentChangedEvent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MeetingAudioManager implements AudioReceiverHolder.IAction {

    /* renamed from: a */
    public String f153933a = mo212697d();

    /* renamed from: b */
    public volatile AudioManager f153934b = ((AudioManager) ar.m236694a().getSystemService("audio"));

    /* renamed from: c */
    public volatile String f153935c = "";

    /* renamed from: d */
    public volatile AudioType f153936d = AudioType.Default;

    /* renamed from: e */
    public volatile boolean f153937e = false;

    /* renamed from: f */
    public volatile AudioType f153938f = AudioType.Default;

    /* renamed from: g */
    public volatile boolean f153939g = false;

    /* renamed from: h */
    public volatile BluetoothHeadset f153940h;

    /* renamed from: i */
    public int f153941i;

    /* renamed from: j */
    public BluetoothState f153942j = BluetoothState.HEADSET_UNAVAILABLE;

    /* renamed from: k */
    public volatile boolean f153943k = false;

    /* renamed from: l */
    public volatile boolean f153944l = false;

    /* renamed from: m */
    public Handler f153945m = new Handler(C60735ab.m236017e().getLooper()) {
        /* class com.ss.android.vc.meeting.module.audio.MeetingAudioManager.HandlerC613991 */

        public void handleMessage(Message message) {
            BluetoothDevice a;
            boolean z;
            String str;
            int i = message.what;
            if (i == 1) {
                String str2 = MeetingAudioManager.this.f153933a;
                C60700b.m235851b(str2, "[handleMessage]", "receive MSG_SCO_TIMEOUT and check bluetoothState=" + MeetingAudioManager.this.f153942j);
                if (MeetingAudioManager.this.f153940h != null && MeetingAudioManager.this.f153942j == BluetoothState.SCO_CONNECTING && (a = C61405a.m239519a(MeetingAudioManager.this.f153940h)) != null) {
                    MeetingAudioManager.this.f153935c = a.getName();
                    if (MeetingAudioManager.this.f153940h == null || !MeetingAudioManager.this.f153940h.isAudioConnected(a)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    String str3 = MeetingAudioManager.this.f153933a;
                    Object[] objArr = new Object[4];
                    objArr[0] = MeetingAudioManager.this.f153935c;
                    if (z) {
                        str = "connected";
                    } else {
                        str = "disconnected";
                    }
                    objArr[1] = str;
                    objArr[2] = MeetingAudioManager.this.f153936d;
                    objArr[3] = Boolean.valueOf(MeetingAudioManager.this.f153937e);
                    C60700b.m235851b(str3, "[handleMessage2]", String.format("check btDevice %s sco %s, type=%s, isOutSpeaker=%b", objArr));
                    if (z) {
                        MeetingAudioManager.this.f153945m.removeMessages(1);
                        MeetingAudioManager.this.f153941i = 0;
                        MeetingAudioManager.this.f153942j = BluetoothState.SCO_CONNECTED;
                        MeetingAudioManager.this.mo212688a(false);
                        MeetingAudioManager.this.mo212691a(false, false, false);
                        return;
                    }
                    if (!(MeetingAudioManager.this.f153934b == null || MeetingAudioManager.this.f153934b.getMode() == 3)) {
                        MeetingAudioManager.this.f153934b.setMode(3);
                    }
                    MeetingAudioManager.this.f153942j = BluetoothState.HEADSET_AVAILABLE;
                    MeetingAudioManager.this.mo212699e();
                }
            } else if (i == 2) {
                C60700b.m235851b(MeetingAudioManager.this.f153933a, "[handleMessage3]", "receive MSG_CHANGE_ROUTE and switchAudio(false)");
                MeetingAudioManager.this.mo212696c(false);
            }
        }
    };

    /* renamed from: n */
    private List<AbstractC61403a> f153946n = new CopyOnWriteArrayList();

    /* renamed from: o */
    private volatile boolean f153947o = false;

    /* renamed from: p */
    private volatile boolean f153948p = false;

    /* renamed from: q */
    private Application.ActivityLifecycleCallbacks f153949q = new Application.ActivityLifecycleCallbacks() {
        /* class com.ss.android.vc.meeting.module.audio.MeetingAudioManager.C614002 */

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            C60700b.m235851b(MeetingAudioManager.this.f153933a, "[onActivityResumed]", String.format("%s with mAudioFocusLost = %b, hasPhoneOnTheCall = %b", activity, Boolean.valueOf(MeetingAudioManager.this.f153943k), Boolean.valueOf(MeetingAudioManager.this.f153944l)));
            MeetingAudioManager.this.mo212682a();
        }
    };

    public enum AudioType {
        Default,
        Bluetooth,
        HeadPhone
    }

    public enum BluetoothState {
        HEADSET_UNAVAILABLE,
        HEADSET_AVAILABLE,
        SCO_DISCONNECTING,
        SCO_CONNECTING,
        SCO_CONNECTED
    }

    /* renamed from: com.ss.android.vc.meeting.module.audio.MeetingAudioManager$a */
    public interface AbstractC61403a {
        void onAudioMuted();

        void onAudioStateChanged(AudioType audioType, boolean z, boolean z2);

        void onAudioStateUnchanged(AudioType audioType, boolean z, boolean z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.audio.MeetingAudioManager$b */
    public static class C61404b {

        /* renamed from: a */
        static MeetingAudioManager f153954a = new MeetingAudioManager();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo212697d() {
        return "MeetingAudioManager";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo212704h() {
        return true;
    }

    /* renamed from: k */
    public static MeetingAudioManager m239471k() {
        return C61404b.f153954a;
    }

    /* renamed from: x */
    public String mo212719x() {
        return this.f153935c;
    }

    /* renamed from: y */
    public AudioType mo212720y() {
        return this.f153936d;
    }

    /* renamed from: z */
    public boolean mo212721z() {
        return this.f153937e;
    }

    /* renamed from: a */
    public void mo212691a(boolean z, boolean z2, boolean z3) {
        C60700b.m235851b(this.f153933a, "[updatePage]", String.format("unChanged=%b,needTrack=%b,hideHint=%b,isOutSpeaker=%b,currentType=%s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(this.f153937e), this.f153936d.toString()));
        mo212695c();
        C60735ab.m236001a(new Runnable(z, z2, z3) {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$K0PWCzK64HFTUUa1lspDGjhVIk */
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                MeetingAudioManager.this.m239465b(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: C */
    private boolean m239438C() {
        return this.f153934b.isWiredHeadsetOn();
    }

    /* renamed from: F */
    private void m239441F() {
        m239467g(true);
    }

    /* renamed from: G */
    private void m239442G() {
        m239468h(true);
    }

    /* renamed from: N */
    private void m239449N() {
        mo212692b();
        mo212691a(false, false, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void aa() {
        mo212696c(true);
    }

    /* renamed from: e */
    public void mo212699e() {
        mo212688a(true);
    }

    /* renamed from: f */
    public void mo212701f() {
        m239469i(true);
    }

    /* renamed from: g */
    public void mo212703g() {
        this.f153943k = true;
        this.f153948p = this.f153937e;
    }

    /* renamed from: i */
    public boolean mo212705i() {
        return this.f153934b.isBluetoothScoOn();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m239452Q() {
        C60700b.m235851b(this.f153933a, "[resetWhenBusyRingVoiceOnly]", "resetWhenBusyRingVoiceOnly");
        this.f153947o = true;
        m239449N();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m239453R() {
        C60700b.m235851b(this.f153933a, "[resetWhenBusyRingAccept]", "resetWhenBusyRingAccept");
        this.f153947o = false;
        m239449N();
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m239455T() {
        mo212699e();
        mo212691a(false, false, true);
    }

    /* renamed from: A */
    public boolean mo212681A() {
        if (this.f153936d != AudioType.Default || this.f153937e) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo212706j() {
        mo212686a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$F44BHglPpTai3O04kTh3u8Q1kOw */

            public final void run() {
                MeetingAudioManager.this.ac();
            }
        });
    }

    /* renamed from: l */
    public void mo212707l() {
        mo212687a(C61405a.m239522a(this.f153937e, this.f153936d, this.f153935c));
    }

    /* renamed from: m */
    public void mo212708m() {
        mo212686a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$8FmYV8wr6TpV_lYHBT7z_RYqZ2A */

            public final void run() {
                MeetingAudioManager.this.aa();
            }
        });
    }

    /* renamed from: r */
    public void mo212713r() {
        mo212686a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$P4upzNIXO6JjzsHHW8WmUfztaw */

            public final void run() {
                MeetingAudioManager.this.m239456U();
            }
        });
    }

    /* renamed from: s */
    public void mo212714s() {
        mo212686a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$iHIDg6lAD9M5V3RwCzBWCouSjs */

            public final void run() {
                MeetingAudioManager.this.m239454S();
            }
        });
    }

    /* renamed from: u */
    public void mo212716u() {
        mo212686a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$KStYQSe1orQTyPbFoBX7ACclw0 */

            public final void run() {
                MeetingAudioManager.this.m239453R();
            }
        });
    }

    /* renamed from: v */
    public void mo212717v() {
        mo212686a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$akv_jcvpOMZlgNhAlscqKh29Rk */

            public final void run() {
                MeetingAudioManager.this.m239452Q();
            }
        });
    }

    /* renamed from: w */
    public void mo212718w() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$NM3jb3f8XDOqdTh4FkD8K7YCcew */

            public final void run() {
                MeetingAudioManager.this.m239451P();
            }
        });
    }

    /* renamed from: J */
    private void m239445J() {
        C60700b.m235851b(this.f153933a, "[clickSpeakerOut]", "clickSpeakerOut");
        this.f153938f = this.f153936d;
        this.f153939g = this.f153937e;
        this.f153937e = true;
        mo212701f();
        mo212690a(this.f153939g, true);
    }

    /* renamed from: L */
    private void m239447L() {
        boolean z;
        C60700b.m235851b(this.f153933a, "[clickBluetooth]", "clickBluetooth");
        mo212699e();
        if (this.f153938f != AudioType.Bluetooth || this.f153939g) {
            z = false;
        } else {
            z = true;
        }
        mo212690a(z, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m239450O() {
        for (AbstractC61403a aVar : this.f153946n) {
            if (aVar != null) {
                aVar.onAudioStateChanged(this.f153938f, this.f153939g, false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m239451P() {
        for (AbstractC61403a aVar : this.f153946n) {
            if (aVar != null) {
                aVar.onAudioMuted();
            }
        }
    }

    /* renamed from: a */
    public void mo212682a() {
        if (!this.f153944l && this.f153943k && C63495h.m248839b()) {
            mo212713r();
        }
    }

    /* renamed from: c */
    public void mo212695c() {
        if (mo212704h()) {
            C61237h.m238223a().mo211784I();
            new EquipmentChangedEvent().mo210473a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder.IAction
    /* renamed from: n */
    public void mo212709n() {
        if (this.f153944l) {
            C60700b.m235851b(this.f153933a, "[plugOutHeadPhone]", "hasPhoneOnTheCall");
        } else {
            mo212686a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$SrDX1vAKYyhFtxnaWYG7izf7ADQ */

                public final void run() {
                    MeetingAudioManager.this.m239460Y();
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder.IAction
    /* renamed from: o */
    public void mo212710o() {
        if (this.f153944l) {
            C60700b.m235851b(this.f153933a, "[plugInHeadPhone]", "hasPhoneOnTheCall");
        } else {
            mo212686a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$wRUX9Pff3jNLX04MqkSl3O26ouA */

                public final void run() {
                    MeetingAudioManager.this.m239459X();
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder.IAction
    /* renamed from: p */
    public void mo212711p() {
        if (this.f153944l) {
            C60700b.m235851b(this.f153933a, "[disconnectBluetooth]", "hasPhoneOnTheCall");
        } else {
            m239462a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$App7HU5ueYlYnyiio0qTJM1nOGM */

                public final void run() {
                    MeetingAudioManager.this.m239458W();
                }
            }, 20);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.audio.MeetingAudioManager$4 */
    public static /* synthetic */ class C614024 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153953a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType[] r0 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager.C614024.f153953a = r0
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Bluetooth     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.C614024.f153953a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.HeadPhone     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.C614024.f153953a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.audio.MeetingAudioManager$AudioType r1 = com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AudioType.Default     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.audio.MeetingAudioManager.C614024.<clinit>():void");
        }
    }

    /* renamed from: B */
    private void m239437B() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                defaultAdapter.getProfileProxy(ar.m236694a(), new BluetoothProfile.ServiceListener() {
                    /* class com.ss.android.vc.meeting.module.audio.MeetingAudioManager.C614013 */

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m239517a() {
                        boolean z;
                        BluetoothDevice a = C61405a.m239519a(MeetingAudioManager.this.f153940h);
                        if (a != null) {
                            MeetingAudioManager.this.f153935c = a.getName();
                            MeetingAudioManager.this.mo212695c();
                            if (MeetingAudioManager.this.f153942j == BluetoothState.HEADSET_UNAVAILABLE) {
                                MeetingAudioManager.this.f153942j = BluetoothState.HEADSET_AVAILABLE;
                                if (MeetingAudioManager.this.f153936d != AudioType.Bluetooth) {
                                    MeetingAudioManager.this.f153936d = AudioType.Bluetooth;
                                    if (MeetingAudioManager.this.f153940h.isAudioConnected(a)) {
                                        MeetingAudioManager.this.f153942j = BluetoothState.SCO_CONNECTED;
                                        MeetingAudioManager.this.mo212688a(false);
                                    } else {
                                        MeetingAudioManager.this.mo212701f();
                                    }
                                    MeetingAudioManager meetingAudioManager = MeetingAudioManager.this;
                                    if (meetingAudioManager.f153938f != AudioType.Bluetooth || MeetingAudioManager.this.f153939g) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    meetingAudioManager.mo212690a(z, false);
                                }
                            }
                        } else if (MeetingAudioManager.this.f153942j != BluetoothState.HEADSET_UNAVAILABLE) {
                            MeetingAudioManager.this.f153942j = BluetoothState.HEADSET_UNAVAILABLE;
                            MeetingAudioManager.this.mo212712q();
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m239518a(int i) {
                        if (i != 1) {
                            return;
                        }
                        if (MeetingAudioManager.this.f153942j == BluetoothState.SCO_CONNECTED || MeetingAudioManager.this.f153942j == BluetoothState.SCO_CONNECTING) {
                            MeetingAudioManager.this.mo212706j();
                        }
                    }

                    public void onServiceDisconnected(int i) {
                        C60700b.m235851b(MeetingAudioManager.this.f153933a, "[onServiceDisconnected]", String.format("BluetoothProfile onServiceDisconnected bluetoothState=%s, profile=%d", MeetingAudioManager.this.f153942j, Integer.valueOf(i)));
                        MeetingAudioManager.this.mo212686a(new Runnable(i) {
                            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$3$YJyAFx_5sn7J9zrvE8PvMlInclI */
                            public final /* synthetic */ int f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                MeetingAudioManager.C614013.this.m239518a(this.f$1);
                            }
                        });
                    }

                    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                        C60700b.m235851b(MeetingAudioManager.this.f153933a, "[onServiceConnected]", String.format("BluetoothProfile onServiceConnected bluetoothState=%s, profile=%d", MeetingAudioManager.this.f153942j, Integer.valueOf(i)));
                        if (i == 1) {
                            MeetingAudioManager.this.f153940h = (BluetoothHeadset) bluetoothProfile;
                            MeetingAudioManager.this.mo212686a(new Runnable() {
                                /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$3$K3vLPp7bjLUbzQqPGGh_T624Rx0 */

                                public final void run() {
                                    MeetingAudioManager.C614013.this.m239517a();
                                }
                            });
                        }
                    }
                }, 1);
            }
        } catch (Exception e) {
            String str = this.f153933a;
            C60700b.m235864f(str, "[getBluetoothHeadset]", "error: " + e.getMessage());
        }
    }

    /* renamed from: K */
    private void m239446K() {
        boolean z;
        C60700b.m235851b(this.f153933a, "[clickHeadPhone]", "clickHeadPhone");
        this.f153938f = this.f153936d;
        this.f153939g = this.f153937e;
        m239441F();
        if (this.f153938f != AudioType.HeadPhone || this.f153939g) {
            z = false;
        } else {
            z = true;
        }
        mo212690a(z, true);
    }

    /* renamed from: M */
    private void m239448M() {
        boolean z;
        C60700b.m235851b(this.f153933a, "[clickEarpiece]", "clickEarpiece");
        this.f153938f = this.f153936d;
        this.f153939g = this.f153937e;
        m239442G();
        if (this.f153938f != AudioType.Default || this.f153939g) {
            z = false;
        } else {
            z = true;
        }
        mo212690a(z, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m239459X() {
        C60700b.m235851b(this.f153933a, "[plugInHeadPhone2]", "plugInHeadPhone");
        this.f153938f = this.f153936d;
        this.f153939g = this.f153937e;
        boolean z = false;
        if (this.f153936d != AudioType.Bluetooth) {
            m239441F();
            if (this.f153938f == AudioType.HeadPhone && !this.f153939g) {
                z = true;
            }
            mo212690a(z, true);
            return;
        }
        m239470j(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m239460Y() {
        boolean z;
        C60700b.m235851b(this.f153933a, "[plugOutHeadPhone2]", "plugOutHeadPhone");
        this.f153938f = this.f153936d;
        this.f153939g = this.f153937e;
        if (this.f153936d == AudioType.HeadPhone) {
            this.f153936d = AudioType.Default;
            if (!this.f153937e) {
                m239442G();
                if (this.f153938f != AudioType.Default || this.f153939g) {
                    z = false;
                } else {
                    z = true;
                }
                mo212690a(z, true);
                return;
            }
            mo212701f();
            mo212690a(this.f153939g, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m239461Z() {
        if (this.f153937e) {
            int i = C614024.f153953a[this.f153936d.ordinal()];
            if (i == 1) {
                m239447L();
            } else if (i == 2) {
                m239446K();
            } else if (i == 3) {
                m239448M();
            }
        } else {
            m239445J();
        }
    }

    /* renamed from: D */
    private boolean m239439D() {
        Exception e;
        boolean z = true;
        boolean z2 = false;
        if (this.f153940h != null) {
            BluetoothDevice a = C61405a.m239519a(this.f153940h);
            if (a == null) {
                return false;
            }
            this.f153935c = a.getName();
            return true;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                    z = false;
                }
                try {
                    String str = this.f153933a;
                    C60700b.m235851b(str, "[isBluetoothHeadsetOn]", "[defaultAdapter.getProfileConnectionState]result=" + z);
                    z2 = z;
                } catch (Exception e2) {
                    e = e2;
                    z2 = z;
                    String str2 = this.f153933a;
                    C60700b.m235864f(str2, "[isBluetoothHeadsetOn2]", "BluetoothAdapter error" + e.getMessage());
                    return z2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            String str22 = this.f153933a;
            C60700b.m235864f(str22, "[isBluetoothHeadsetOn2]", "BluetoothAdapter error" + e.getMessage());
            return z2;
        }
        return z2;
    }

    /* renamed from: E */
    private boolean m239440E() {
        C60700b.m235851b(this.f153933a, "[checkBluetoothHeadsetOn]", String.format("bluetoothState=%s", this.f153942j));
        boolean D = m239439D();
        if (!D) {
            this.f153942j = BluetoothState.HEADSET_UNAVAILABLE;
        } else if (this.f153942j == BluetoothState.HEADSET_UNAVAILABLE) {
            this.f153942j = BluetoothState.HEADSET_AVAILABLE;
        }
        C60700b.m235851b(this.f153933a, "[checkBluetoothHeadsetOn2]", String.format("done result=%b, bluetoothState=%s", Boolean.valueOf(D), this.f153942j));
        return D;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m239454S() {
        this.f153945m.removeCallbacksAndMessages(null);
        AudioReceiverHolder.f158409a.mo217328b(this);
        this.f153946n.clear();
        ar.m236697b().unregisterActivityLifecycleCallbacks(this.f153949q);
        mo212715t();
        String str = this.f153933a;
        C60700b.m235851b(str, "[onEndCall]", "called with: isOutSpeaker =" + this.f153937e + ",type=" + this.f153936d);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m239458W() {
        boolean z;
        if (this.f153940h != null) {
            BluetoothDevice a = C61405a.m239519a(this.f153940h);
            if (a == null) {
                C60700b.m235851b(this.f153933a, "[disconnectBluetooth3]", "bluetoothDeviceRemoved");
                this.f153942j = BluetoothState.HEADSET_UNAVAILABLE;
                mo212712q();
            } else if (!this.f153940h.isAudioConnected(a)) {
                C60700b.m235851b(this.f153933a, "[disconnectBluetooth2]", "sco disconnect ->switchToOutSpeaker");
                this.f153936d = AudioType.Bluetooth;
                boolean z2 = this.f153937e;
                mo212701f();
                if (z2 == this.f153937e) {
                    z = true;
                } else {
                    z = false;
                }
                mo212691a(false, true, z);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ab() {
        String str = this.f153933a;
        C60700b.m235851b(str, "[setDefaultToEarpieceWhenNoExternalDevice2]", "onAudioStateChanged isOutSpeaker=" + this.f153937e + ",currentType=" + this.f153936d);
        for (AbstractC61403a aVar : this.f153946n) {
            if (aVar != null) {
                aVar.onAudioStateChanged(this.f153938f, this.f153939g, false);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void ac() {
        if (mo212704h()) {
            C60700b.m235851b(this.f153933a, "[stopScoAudio]", String.format("check BT state=%s, SCO is on: %b", this.f153942j, Boolean.valueOf(mo212705i())));
            this.f153941i = 0;
            this.f153945m.removeMessages(1);
            if (this.f153942j != BluetoothState.SCO_DISCONNECTING) {
                this.f153934b.stopBluetoothSco();
                this.f153934b.setBluetoothScoOn(false);
                this.f153942j = BluetoothState.SCO_DISCONNECTING;
                String str = this.f153933a;
                C60700b.m235851b(str, "[stopScoAudio2]", "done: BT state=" + this.f153942j + ", SCO is on: " + mo212705i());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo212692b() {
        C60700b.m235851b(this.f153933a, "[init]", "init");
        if (m239440E()) {
            mo212699e();
        } else if (m239438C()) {
            m239441F();
        } else {
            this.f153936d = AudioType.Default;
            if (this.f153947o) {
                m239442G();
            } else {
                mo212701f();
            }
        }
        m239437B();
    }

    /* renamed from: q */
    public void mo212712q() {
        String str;
        boolean b = C61405a.m239525b(this.f153940h);
        this.f153938f = this.f153936d;
        this.f153939g = this.f153937e;
        boolean z = true;
        if (m239438C()) {
            C60700b.m235851b(this.f153933a, "[bluetoothDeviceRemoved]", String.format(String.format("realScoStatus=%b ->switchToHeadPhone", Boolean.valueOf(b)), new Object[0]));
            m239441F();
        } else {
            String str2 = this.f153933a;
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(b);
            if (this.f153937e) {
                str = "switchToOutSpeaker";
            } else {
                str = "switchToEarPiece";
            }
            objArr[1] = str;
            C60700b.m235851b(str2, "[bluetoothDeviceRemoved2]", String.format(String.format("realScoStatus=%b -> %s", objArr), new Object[0]));
            this.f153936d = AudioType.Default;
            if (this.f153937e) {
                mo212701f();
            } else {
                m239442G();
            }
        }
        if (!(this.f153939g == this.f153937e && this.f153938f == this.f153936d)) {
            z = false;
        }
        mo212691a(false, false, z);
    }

    /* renamed from: t */
    public void mo212715t() {
        this.f153938f = this.f153936d;
        this.f153939g = this.f153937e;
        this.f153937e = false;
        this.f153947o = false;
        this.f153943k = false;
        this.f153944l = false;
        if (this.f153937e) {
            this.f153936d = AudioType.Default;
        } else if (m239440E()) {
            this.f153936d = AudioType.Bluetooth;
        } else if (m239438C()) {
            this.f153936d = AudioType.HeadPhone;
        } else {
            this.f153936d = AudioType.Default;
        }
        if (mo212704h() && this.f153936d == AudioType.Bluetooth) {
            mo212706j();
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && this.f153940h != null) {
                defaultAdapter.closeProfileProxy(1, this.f153940h);
                this.f153940h = null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: H */
    private void m239443H() {
        if (mo212704h()) {
            C60700b.m235851b(this.f153933a, "[startScoAudio]", "BT state=" + this.f153942j + ", attempts: " + this.f153941i + ", SCO is on: " + mo212705i());
            if (this.f153941i >= 5) {
                C60700b.m235851b(this.f153933a, "[startScoAudio2]", String.format("BT SCO connection fails - no more attempts", new Object[0]));
                this.f153934b.setMode(3);
                mo212711p();
            } else if (this.f153942j != BluetoothState.SCO_CONNECTING) {
                this.f153942j = BluetoothState.SCO_CONNECTING;
                if (this.f153941i >= 2) {
                    C60700b.m235851b(this.f153933a, "[startScoAudio3]", "setMode normal and start sco again");
                    this.f153934b.setMode(0);
                }
                this.f153945m.removeMessages(1);
                this.f153934b.startBluetoothSco();
                this.f153934b.setBluetoothScoOn(true);
                this.f153941i++;
                this.f153945m.sendEmptyMessageDelayed(1, 5000);
                C60700b.m235851b(this.f153933a, "[startScoAudio4]", "timeout task : BT state=" + this.f153942j + ", SCO is on: " + mo212705i());
            }
        }
    }

    /* renamed from: I */
    private void m239444I() {
        String str;
        if (this.f153944l) {
            this.f153944l = false;
            this.f153941i = 0;
            this.f153942j = BluetoothState.HEADSET_UNAVAILABLE;
            BluetoothDevice a = C61405a.m239519a(this.f153940h);
            if (a != null) {
                this.f153942j = BluetoothState.HEADSET_AVAILABLE;
                if (this.f153940h == null || !this.f153940h.isAudioConnected(a)) {
                    C60700b.m235851b(this.f153933a, "[recoveryFromTelephone2]", String.format("switch to Bluetooth", new Object[0]));
                    mo212688a(!this.f153934b.isBluetoothScoOn());
                    mo212691a(false, false, true);
                    return;
                }
                C60700b.m235851b(this.f153933a, "[recoveryFromTelephone]", String.format("disconnect sco and switch to Bluetooth", new Object[0]));
                this.f153936d = AudioType.Bluetooth;
                mo212701f();
                this.f153945m.postDelayed(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$aEce_3lzb8l2gRAPdAw4VjiFB8 */

                    public final void run() {
                        MeetingAudioManager.this.m239455T();
                    }
                }, 150);
            } else if (m239438C()) {
                C60700b.m235851b(this.f153933a, "[recoveryFromTelephone3]", String.format("switch to WiredHeadset", new Object[0]));
                m239441F();
                mo212691a(false, false, true);
            } else {
                String str2 = this.f153933a;
                Object[] objArr = new Object[1];
                if (this.f153937e) {
                    str = "Speaker";
                } else {
                    str = "Earpiece";
                }
                objArr[0] = str;
                C60700b.m235851b(str2, "[recoveryFromTelephone4]", String.format("switch to %s", objArr));
                this.f153936d = AudioType.Default;
                if (this.f153937e) {
                    mo212701f();
                } else {
                    m239442G();
                }
                mo212691a(false, false, true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m239456U() {
        boolean z;
        C60700b.m235851b(this.f153933a, "[onGainAudioFocus]", String.format("currentAudioMode=%d, isOutSpeaker=%b, mAudioManager.isSpeakerphoneOn=%b, mSpeakerOnWhenAudioFocusLost=%b, currentType=%s, hasPhoneOnTheCall=%b", Integer.valueOf(this.f153934b.getMode()), Boolean.valueOf(this.f153937e), Boolean.valueOf(this.f153934b.isSpeakerphoneOn()), Boolean.valueOf(this.f153948p), this.f153936d.toString(), Boolean.valueOf(this.f153944l)));
        this.f153943k = false;
        if (this.f153944l) {
            m239444I();
        } else if (this.f153934b.isSpeakerphoneOn() != this.f153937e) {
            if (this.f153948p == this.f153937e) {
                z = true;
            } else {
                z = false;
            }
            C60700b.m235851b(this.f153933a, "[onGainAudioFocus2]", String.format("needChangeRoute=%b, scoConnectionAttempts=%d", Boolean.valueOf(z), Integer.valueOf(this.f153941i)));
            this.f153941i = 0;
            mo212696c(false);
            if (z) {
                this.f153945m.removeMessages(2);
                this.f153945m.sendEmptyMessageDelayed(2, 150);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m239457V() {
        boolean z;
        C60700b.m235851b(this.f153933a, "[updateAudioDevice2]", String.format("isOutSpeaker=%b, type=%s", Boolean.valueOf(this.f153937e), this.f153936d));
        BluetoothDevice a = C61405a.m239519a(this.f153940h);
        if (a != null) {
            boolean z2 = this.f153937e;
            this.f153935c = a.getName();
            if (this.f153940h == null || !this.f153940h.isAudioConnected(a)) {
                C60700b.m235851b(this.f153933a, "[updateAudioDevice6]", "->has bt device but sco is disconnect");
                this.f153942j = BluetoothState.HEADSET_AVAILABLE;
            } else {
                this.f153945m.removeMessages(1);
                this.f153941i = 0;
                this.f153942j = BluetoothState.SCO_CONNECTED;
                C60700b.m235851b(this.f153933a, "[updateAudioDevice4]", "->sco is connected");
                if (this.f153934b.getMode() != 3) {
                    C60700b.m235851b(this.f153933a, "[updateAudioDevice5]", "change audio mode from normal to communication");
                    this.f153934b.setMode(3);
                }
            }
            mo212688a(!this.f153934b.isBluetoothScoOn());
            if (z2 == this.f153937e) {
                z = true;
            } else {
                z = false;
            }
            mo212691a(false, true, z);
            return;
        }
        C60700b.m235851b(this.f153933a, "[updateAudioDevice7]", "bluetoothDeviceRemoved");
        this.f153942j = BluetoothState.HEADSET_UNAVAILABLE;
        mo212712q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo212687a(String str) {
        C60738ac.m236039c(str);
    }

    /* renamed from: b */
    public void mo212693b(AbstractC61403a aVar) {
        this.f153946n.remove(aVar);
    }

    /* renamed from: a */
    public void mo212685a(AbstractC61403a aVar) {
        if (!this.f153946n.contains(aVar)) {
            this.f153946n.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo212694b(boolean z) {
        mo212686a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$0zU3EUjppWbHTFPtyRexOY4hbs */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MeetingAudioManager.this.m239475n(this.f$1);
            }
        });
    }

    /* renamed from: d */
    public void mo212698d(boolean z) {
        mo212686a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$UdmbIjGA8AMjtkTuaSvppcV9jjk */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MeetingAudioManager.this.m239474m(this.f$1);
            }
        });
    }

    /* renamed from: e */
    public void mo212700e(boolean z) {
        mo212686a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$ngEYmE94lSrd23v3M1nLYeOPaOk */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MeetingAudioManager.this.m239473l(this.f$1);
            }
        });
    }

    /* renamed from: f */
    public void mo212702f(boolean z) {
        mo212686a(new Runnable(z) {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$Hy1HRAfnFl3ctrWy1sxSDixcKSk */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                MeetingAudioManager.this.m239472k(this.f$1);
            }
        });
    }

    /* renamed from: j */
    private void m239470j(boolean z) {
        if (mo212704h() && !this.f153944l) {
            this.f153934b.setSpeakerphoneOn(z);
            if (this.f153936d != AudioType.Bluetooth || z) {
                mo212706j();
            } else {
                m239443H();
            }
        }
    }

    /* renamed from: g */
    private void m239467g(boolean z) {
        String str = this.f153933a;
        C60700b.m235851b(str, "[switchToHeadPhone]", "switch to HeadPhone, changeAudio = " + z);
        this.f153937e = false;
        this.f153936d = AudioType.HeadPhone;
        if (z) {
            m239470j(false);
        }
    }

    /* renamed from: h */
    private void m239468h(boolean z) {
        String str = this.f153933a;
        C60700b.m235851b(str, "[switchToEarPiece]", "switch to earpiece, changeAudio = " + z);
        this.f153937e = false;
        this.f153936d = AudioType.Default;
        if (z) {
            m239470j(false);
        }
    }

    /* renamed from: i */
    private void m239469i(boolean z) {
        String str = this.f153933a;
        C60700b.m235851b(str, "[switchToOutSpeaker]", "switch to out speaker, changeAudio = " + z);
        this.f153937e = true;
        if (z) {
            m239470j(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m239475n(boolean z) {
        C60700b.m235851b(this.f153933a, "[setDefaultToEarpieceWhenNoExternalDevice]", String.format("target=%b,src=%b", Boolean.valueOf(z), Boolean.valueOf(this.f153947o)));
        if (this.f153947o != z) {
            this.f153947o = z;
            if (this.f153936d == AudioType.Default) {
                if (z) {
                    m239442G();
                } else {
                    mo212701f();
                }
            }
        }
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$4TKklhiBTZ910OcwnVpgUUBWug */

            public final void run() {
                MeetingAudioManager.this.ab();
            }
        });
    }

    /* renamed from: c */
    public void mo212696c(boolean z) {
        String str = this.f153933a;
        C60700b.m235851b(str, "[switchAudio]", "userClick = [" + z + "]");
        mo212686a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$b9JZdLM6Mducubav8eYU3KQ0k */

            public final void run() {
                MeetingAudioManager.this.m239461Z();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m239472k(boolean z) {
        String str = this.f153933a;
        C60700b.m235851b(str, "[presetOutSpeaker]", "called with: presetOutSpeaker = [" + z + "]");
        if (this.f153937e != z) {
            if (z) {
                mo212701f();
            } else {
                int i = C614024.f153953a[this.f153936d.ordinal()];
                if (i == 1) {
                    mo212699e();
                } else if (i != 2) {
                    m239442G();
                } else {
                    m239441F();
                }
            }
        }
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$YacoUkJiXYqYqf9hBPhBV41CaE */

            public final void run() {
                MeetingAudioManager.this.m239450O();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m239473l(boolean z) {
        String str = this.f153933a;
        C60700b.m235851b(str, "[onBeginCall]", "called with: defaultToEarpiece = [" + z + "]");
        AudioReceiverHolder.f158409a.mo217325a(this);
        this.f153947o = z;
        this.f153941i = 0;
        this.f153942j = BluetoothState.HEADSET_UNAVAILABLE;
        this.f153943k = false;
        this.f153944l = false;
        this.f153935c = "";
        ar.m236697b().registerActivityLifecycleCallbacks(this.f153949q);
        if (m239440E()) {
            mo212699e();
        } else if (m239438C()) {
            m239441F();
        } else {
            this.f153936d = AudioType.Default;
            if (z) {
                m239442G();
            } else {
                mo212701f();
            }
        }
        mo212691a(false, false, true);
        m239437B();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m239474m(boolean z) {
        if (MeetingManager.m238341a().mo211892a(false)) {
            C60700b.m235851b(this.f153933a, "[onPhoneStateIdle]", String.format("idle=%b, isOutSpeaker=%b, mAudioManager.isSpeakerphoneOn=%b, mSpeakerOnWhenAudioFocusLost=%b, currentType=%s", Boolean.valueOf(z), Boolean.valueOf(this.f153937e), Boolean.valueOf(this.f153934b.isSpeakerphoneOn()), Boolean.valueOf(this.f153948p), this.f153936d.toString()));
            if (z) {
                m239444I();
            } else {
                this.f153944l = true;
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder.IAction
    /* renamed from: a */
    public void mo212683a(long j) {
        if (this.f153944l) {
            C60700b.m235851b(this.f153933a, "[updateAudioDevice]", "hasPhoneOnTheCall");
        } else {
            m239462a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$LsPTPpywTBOHGP_YFRSGrMBGaQ */

                public final void run() {
                    MeetingAudioManager.this.m239457V();
                }
            }, j);
        }
    }

    /* renamed from: a */
    public void mo212686a(Runnable runnable) {
        m239462a(runnable, 0);
    }

    /* renamed from: a */
    public void mo212688a(boolean z) {
        String str = this.f153933a;
        C60700b.m235851b(str, "[switchToBluetooth]", "switch to bluetooth, changeAudio = " + z);
        this.f153938f = this.f153936d;
        this.f153939g = this.f153937e;
        this.f153937e = false;
        this.f153936d = AudioType.Bluetooth;
        if (z) {
            m239470j(false);
        }
    }

    /* renamed from: a */
    private void m239462a(Runnable runnable, long j) {
        if (j > 0) {
            C60735ab.m236017e().postDelayed(runnable, j);
            return;
        }
        if (Looper.myLooper() == C60735ab.m236017e().getLooper()) {
            runnable.run();
        } else {
            C60735ab.m236017e().post(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m239464b(BluetoothDevice bluetoothDevice, boolean z) {
        String str;
        boolean z2;
        String str2 = this.f153933a;
        Object[] objArr = new Object[2];
        if (bluetoothDevice != null) {
            str = bluetoothDevice.getName();
        } else {
            str = "null";
        }
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(z);
        C60700b.m235851b(str2, "[onBluetoothActive3]", String.format("device = %s, active = %b", objArr));
        BluetoothDevice a = C61405a.m239519a(this.f153940h);
        if (a != null) {
            this.f153935c = a.getName();
            boolean z3 = this.f153937e;
            if (this.f153940h == null || !this.f153940h.isAudioConnected(a)) {
                this.f153942j = BluetoothState.HEADSET_AVAILABLE;
                this.f153936d = AudioType.Bluetooth;
                if (!z || !a.equals(bluetoothDevice)) {
                    C60700b.m235851b(this.f153933a, "[onBluetoothActive7]", "->has bt device but sco is disconnect, switchToOutSpeaker");
                    m239469i(!this.f153934b.isSpeakerphoneOn());
                } else {
                    C60700b.m235851b(this.f153933a, "[onBluetoothActive6]", "->has bt device but sco is disconnect, switchToBluetooth");
                    mo212688a(!this.f153934b.isBluetoothScoOn());
                }
            } else {
                this.f153945m.removeMessages(1);
                this.f153941i = 0;
                this.f153942j = BluetoothState.SCO_CONNECTED;
                C60700b.m235851b(this.f153933a, "[onBluetoothActive4]", "->sco is connected");
                if (this.f153934b.getMode() != 3) {
                    C60700b.m235851b(this.f153933a, "[onBluetoothActive5]", "change audio mode from normal to communication");
                    this.f153934b.setMode(3);
                }
                mo212688a(!this.f153934b.isBluetoothScoOn());
            }
            if (z3 == this.f153937e) {
                z2 = true;
            } else {
                z2 = false;
            }
            mo212691a(false, true, z2);
            return;
        }
        C60700b.m235851b(this.f153933a, "[onBluetoothActive8]", "bluetoothDeviceRemoved");
        this.f153942j = BluetoothState.HEADSET_UNAVAILABLE;
        mo212712q();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m239466c(BluetoothDevice bluetoothDevice, boolean z) {
        String str;
        boolean z2;
        if (!C61405a.m239523a(bluetoothDevice)) {
            String str2 = this.f153933a;
            C60700b.m235851b(str2, "[connectBluetooth6]", "active device is not headset device, scoOn = " + z);
        }
        String str3 = this.f153933a;
        Object[] objArr = new Object[2];
        if (bluetoothDevice != null) {
            str = bluetoothDevice.getName();
        } else {
            str = "null";
        }
        objArr[0] = str;
        boolean z3 = true;
        objArr[1] = Boolean.valueOf(z);
        C60700b.m235851b(str3, "connectBluetooth2", String.format("device = %s, scoOn = %b", objArr));
        BluetoothDevice a = C61405a.m239519a(this.f153940h);
        if (a != null) {
            boolean z4 = this.f153937e;
            if (this.f153940h == null || !this.f153940h.isAudioConnected(a)) {
                z2 = false;
            } else {
                z2 = true;
            }
            C60700b.m235851b(this.f153933a, "[connectBluetooth3]", String.format("bluetoothState=%s, realScoStatus=%b, type=%s, isOutSpeaker=%b", this.f153942j, Boolean.valueOf(z2), this.f153936d, Boolean.valueOf(this.f153937e)));
            if (z2) {
                this.f153945m.removeMessages(1);
                this.f153942j = BluetoothState.SCO_CONNECTED;
                this.f153941i = 0;
                if (this.f153934b.getMode() != 3) {
                    C60700b.m235851b(this.f153933a, "[connectBluetooth4]", "change audio mode from normal to communication");
                    this.f153934b.setMode(3);
                }
                this.f153935c = bluetoothDevice.getName();
                mo212695c();
                mo212688a(!this.f153934b.isBluetoothScoOn());
            } else {
                this.f153936d = AudioType.Bluetooth;
                m239469i(!this.f153934b.isSpeakerphoneOn());
            }
            if (z4 != this.f153937e) {
                z3 = false;
            }
            mo212691a(false, false, z3);
            return;
        }
        C60700b.m235851b(this.f153933a, "[connectBluetooth5]", "bluetoothDeviceRemoved");
        this.f153942j = BluetoothState.HEADSET_UNAVAILABLE;
        mo212712q();
    }

    @Override // com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder.IAction
    /* renamed from: a */
    public void mo212684a(BluetoothDevice bluetoothDevice, boolean z) {
        long j;
        if (this.f153944l) {
            C60700b.m235851b(this.f153933a, "[connectBluetooth]", "hasPhoneOnTheCall");
            return;
        }
        $$Lambda$MeetingAudioManager$gSAoBrjvHfcu2Uobh8DGMBlJHMg r0 = new Runnable(bluetoothDevice, z) {
            /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$gSAoBrjvHfcu2Uobh8DGMBlJHMg */
            public final /* synthetic */ BluetoothDevice f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                MeetingAudioManager.this.m239466c(this.f$1, this.f$2);
            }
        };
        if (z) {
            j = 20;
        } else {
            j = 60;
        }
        m239462a(r0, j);
    }

    @Override // com.ss.android.vc.meeting.module.receiver.AudioReceiverHolder.IAction
    /* renamed from: a */
    public void mo212689a(boolean z, BluetoothDevice bluetoothDevice) {
        if (this.f153944l) {
            C60700b.m235851b(this.f153933a, "[onBluetoothActive]", "hasPhoneOnTheCall");
        } else {
            mo212686a(new Runnable(bluetoothDevice, z) {
                /* class com.ss.android.vc.meeting.module.audio.$$Lambda$MeetingAudioManager$CHrFgjDoJKda_Rra1AD8CIfspTw */
                public final /* synthetic */ BluetoothDevice f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    MeetingAudioManager.this.m239464b(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo212690a(boolean z, boolean z2) {
        mo212691a(z, z2, false);
    }

    /* renamed from: a */
    private void m239463a(boolean z, AudioType audioType, String str) {
        mo212687a(C61405a.m239522a(z, audioType, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m239465b(boolean z, boolean z2, boolean z3) {
        for (AbstractC61403a aVar : this.f153946n) {
            if (aVar != null) {
                if (z) {
                    aVar.onAudioStateUnchanged(this.f153938f, this.f153939g, z2);
                } else {
                    aVar.onAudioStateChanged(this.f153938f, this.f153939g, z2);
                    if (!z3 && !this.f153944l) {
                        m239463a(this.f153937e, this.f153936d, this.f153935c);
                    }
                }
            }
        }
    }
}
