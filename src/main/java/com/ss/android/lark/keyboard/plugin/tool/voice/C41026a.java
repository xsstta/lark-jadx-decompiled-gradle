package com.ss.android.lark.keyboard.plugin.tool.voice;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.SystemClock;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.C25707a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.voice.C41026a;
import com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel;
import com.ss.android.lark.keyboard.plugin.tool.voice.statistics.AppreciablePerformance;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.p1821a.AbstractC36900c;
import com.ss.android.lark.p1820e.p1821a.C36899b;
import com.ss.android.lark.p1820e.p1821a.C36903e;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a */
public class C41026a implements LarkRecorderPanel.AbstractC41060a {

    /* renamed from: a */
    public String f104453a;

    /* renamed from: b */
    public int f104454b;

    /* renamed from: c */
    public String f104455c;

    /* renamed from: d */
    public boolean f104456d;

    /* renamed from: e */
    public WeakReference<AbstractC41029a> f104457e;

    /* renamed from: f */
    public WeakReference<LarkRecorderPanel> f104458f;

    /* renamed from: g */
    public WeakReference<Activity> f104459g;

    /* renamed from: h */
    public AbstractC36900c f104460h;

    /* renamed from: i */
    public boolean f104461i;

    /* renamed from: j */
    public boolean f104462j;

    /* renamed from: k */
    public boolean f104463k;

    /* renamed from: l */
    public boolean f104464l = true;

    /* renamed from: m */
    public long f104465m;

    /* renamed from: n */
    private C36903e f104466n;

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a$a */
    public interface AbstractC41029a {
        /* renamed from: a */
        void mo147913a();

        /* renamed from: a */
        void mo147914a(int i, boolean z);

        /* renamed from: a */
        void mo147915a(String str, int i);

        /* renamed from: a */
        void mo147916a(String str, String str2, int i, boolean z);

        /* renamed from: a */
        void mo147917a(String str, String str2, boolean z, boolean z2);

        /* renamed from: a */
        void mo147918a(ByteBuffer byteBuffer, int i, double d, boolean z);

        /* renamed from: b */
        void mo147919b(String str, String str2, boolean z, boolean z2);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.AbstractC41060a
    /* renamed from: d */
    public int mo147911d() {
        return this.f104454b;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.AbstractC41060a
    /* renamed from: b */
    public void mo147909b() {
        Log.m165379d("MarcusTest", "stopRecord: ");
        this.f104465m = SystemClock.elapsedRealtime();
        this.f104466n.mo136256c();
    }

    /* renamed from: a */
    public void mo147906a() {
        C25707a newGlobal = LKUIToast.newGlobal(this.f104459g.get(), this.f104459g.get().getString(R.string.Lark_Legacy_RecordShortTimeWarning));
        newGlobal.mo90184a(17, 0, 0);
        newGlobal.mo90191c();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.AbstractC41060a
    /* renamed from: c */
    public void mo147910c() {
        Log.m165379d("MarcusTest", "cancelRecord: ");
        this.f104456d = false;
        this.f104463k = true;
        this.f104466n.mo136256c();
        WeakReference<AbstractC41029a> weakReference = this.f104457e;
        if (weakReference != null && weakReference.get() != null) {
            this.f104457e.get().mo147915a(this.f104453a, -1);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.AbstractC41060a
    /* renamed from: e */
    public void mo147912e() {
        Activity activity = this.f104459g.get();
        if (activity != null && !activity.isFinishing()) {
            String string = activity.getString(R.string.Lark_Legacy_MicPermissionDisableTipTitle);
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_MicPermissionDisableTipContent);
            new C25639g(activity).mo89237b(string).mo89242c(mustacheFormat).mo89225a(R.id.lkui_dialog_btn_right, activity.getString(R.string.Lark_Legacy_Fine), (DialogInterface.OnClickListener) null).mo89239c();
        }
    }

    /* renamed from: a */
    public void mo147907a(boolean z) {
        this.f104464l = z;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel.AbstractC41060a
    /* renamed from: a */
    public void mo147908a(boolean z, boolean z2) {
        if (this.f104465m <= 0 || SystemClock.elapsedRealtime() - this.f104465m >= 3000) {
            this.f104465m = 0;
            AppreciablePerformance.f104480a.mo147936a();
            if (z) {
                AppreciablePerformance.f104480a.mo147945c();
            }
            this.f104454b = 0;
            this.f104456d = true;
            this.f104463k = false;
            this.f104464l = true;
            this.f104461i = z;
            this.f104462j = z2;
            this.f104453a = UUID.randomUUID().toString();
            this.f104455c = C57881t.m224602A(this.f104459g.get()) + this.f104453a;
            this.f104457e.get().mo147917a(this.f104455c, this.f104453a, this.f104461i, this.f104462j);
            this.f104466n.mo136250a(this.f104455c, new C36903e.AbstractC36905a() {
                /* class com.ss.android.lark.keyboard.plugin.tool.voice.C41026a.C410282 */

                /* access modifiers changed from: private */
                /* renamed from: d */
                public /* synthetic */ void m162625d() {
                    C41026a.this.mo147906a();
                }

                /* access modifiers changed from: private */
                /* renamed from: e */
                public /* synthetic */ void m162626e() {
                    C41026a.this.mo147906a();
                }

                @Override // com.ss.android.lark.p1820e.p1821a.C36903e.AbstractC36905a
                /* renamed from: a */
                public void mo136259a() {
                    AppreciablePerformance.f104480a.mo147942b();
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.keyboard.plugin.tool.voice.$$Lambda$a$2$QYo5zFqguLOagDavXYWm0VD1QU0 */

                        public final void run() {
                            C41026a.C410282.lambda$QYo5zFqguLOagDavXYWm0VD1QU0(C41026a.C410282.this);
                        }
                    });
                }

                @Override // com.ss.android.lark.p1820e.p1821a.C36903e.AbstractC36905a
                /* renamed from: b */
                public void mo136261b() {
                    C41026a.this.f104465m = 0;
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.keyboard.plugin.tool.voice.$$Lambda$a$2$HjlU3SQx1oDovHp1IPzMi1LzCVo */

                        public final void run() {
                            C41026a.C410282.lambda$HjlU3SQx1oDovHp1IPzMi1LzCVo(C41026a.C410282.this);
                        }
                    }, 50);
                }

                /* access modifiers changed from: private */
                /* renamed from: f */
                public /* synthetic */ void m162627f() {
                    if (C41026a.this.f104457e != null && C41026a.this.f104457e.get() != null && C41026a.this.f104456d) {
                        C41026a.this.f104456d = false;
                        C41026a.this.f104457e.get().mo147919b(C41026a.this.f104455c, C41026a.this.f104453a, C41026a.this.f104461i, C41026a.this.f104462j);
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: c */
                public /* synthetic */ void m162624c() {
                    if (C41026a.this.f104457e.get() != null) {
                        if (!C41026a.this.f104464l) {
                            if (C41026a.this.f104454b >= 1000) {
                                C41026a.this.f104457e.get().mo147916a(C41026a.this.f104455c, C41026a.this.f104453a, C41026a.this.f104454b, true);
                            } else {
                                C41026a.this.f104457e.get().mo147915a(C41026a.this.f104453a, C41026a.this.f104454b);
                                C41026a.this.f104459g.get().runOnUiThread(new Runnable() {
                                    /* class com.ss.android.lark.keyboard.plugin.tool.voice.$$Lambda$a$2$dMFeSMfUXzEDFK_DGseiNwJ1ZTc */

                                    public final void run() {
                                        C41026a.C410282.lambda$dMFeSMfUXzEDFK_DGseiNwJ1ZTc(C41026a.C410282.this);
                                    }
                                });
                            }
                        } else if (C41026a.this.f104461i) {
                            C41026a.this.f104457e.get().mo147913a();
                        } else if (C41026a.this.f104463k) {
                            C41026a.this.f104457e.get().mo147915a(C41026a.this.f104453a, -1);
                        } else if (C41026a.this.f104454b >= 1000) {
                            C41026a.this.f104457e.get().mo147916a(C41026a.this.f104455c, C41026a.this.f104453a, C41026a.this.f104454b, C41026a.this.f104461i);
                        } else {
                            C41026a.this.f104457e.get().mo147915a(C41026a.this.f104453a, -1);
                            C41026a.this.f104459g.get().runOnUiThread(new Runnable() {
                                /* class com.ss.android.lark.keyboard.plugin.tool.voice.$$Lambda$a$2$slkBb30OXf0qR2LsH5GH8tTA8g */

                                public final void run() {
                                    C41026a.C410282.m270676lambda$slkBb30OXf0qR2LsH5GH8tTA8g(C41026a.C410282.this);
                                }
                            });
                        }
                    }
                    C41026a.this.f104454b = 0;
                }

                @Override // com.ss.android.lark.p1820e.p1821a.C36903e.AbstractC36905a
                /* renamed from: a */
                public void mo136260a(int i, double d, ByteBuffer byteBuffer) {
                    UICallbackExecutor.execute(new Runnable(i, d, byteBuffer) {
                        /* class com.ss.android.lark.keyboard.plugin.tool.voice.$$Lambda$a$2$yMKBzmj18kVFrqAK2J0iKSflQI */
                        public final /* synthetic */ int f$1;
                        public final /* synthetic */ double f$2;
                        public final /* synthetic */ ByteBuffer f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r5;
                        }

                        public final void run() {
                            C41026a.C410282.m270677lambda$yMKBzmj18kVFrqAK2J0iKSflQI(C41026a.C410282.this, this.f$1, this.f$2, this.f$3);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public /* synthetic */ void m162623b(int i, double d, ByteBuffer byteBuffer) {
                    C41026a.this.f104454b = i;
                    if (C41026a.this.f104458f.get() != null) {
                        C41026a.this.f104458f.get().setTitleText(C36899b.m145651a((long) i));
                        C41026a.this.f104458f.get().setRecorderVolume(d);
                    }
                    if (!(C41026a.this.f104457e == null || C41026a.this.f104457e.get() == null)) {
                        C41026a.this.f104457e.get().mo147918a(byteBuffer, C41026a.this.f104454b, d, C41026a.this.f104461i);
                        int min = Math.min(((300000 - C41026a.this.f104454b) / 1000) + 1, 10);
                        if (C41026a.this.f104454b >= 300000) {
                            C41026a.this.f104457e.get().mo147914a(min, true);
                            if (C41026a.this.f104464l && !C41026a.this.f104461i) {
                                C41026a.this.mo147909b();
                            }
                        } else if (C41026a.this.f104454b >= 290000) {
                            C41026a.this.f104457e.get().mo147914a(min, false);
                        }
                    }
                    if (C41026a.this.f104454b >= 300000) {
                        C41026a.this.f104460h.mo34061a(1);
                    }
                }
            });
            return;
        }
        Log.m165397w("AudioRecorderListener", "startRecord but last record task is stopping, interval = " + (SystemClock.elapsedRealtime() - this.f104465m));
    }

    public C41026a(Activity activity, LarkRecorderPanel larkRecorderPanel, AbstractC41029a aVar) {
        this.f104458f = new WeakReference<>(larkRecorderPanel);
        this.f104457e = new WeakReference<>(aVar);
        this.f104459g = new WeakReference<>(activity);
        this.f104460h = new AbstractC36900c() {
            /* class com.ss.android.lark.keyboard.plugin.tool.voice.C41026a.C410271 */

            @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36900c
            /* renamed from: a */
            public void mo34061a(int i) {
                AppreciablePerformance.f104480a.mo147938a(i, "");
                LarkRecorderPanel larkRecorderPanel = C41026a.this.f104458f.get();
                if (larkRecorderPanel != null) {
                    larkRecorderPanel.mo148001a(i);
                }
            }
        };
        C36903e a = C36903e.m145675a();
        this.f104466n = a;
        a.mo136251a(new WeakReference<>(this.f104460h));
    }
}
