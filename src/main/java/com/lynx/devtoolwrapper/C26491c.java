package com.lynx.devtoolwrapper;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.lynx.tasm.AbstractC26885d;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.C26618f;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.lynx.devtoolwrapper.c */
public class C26491c {

    /* renamed from: b */
    private static final String f65485b = "c";

    /* renamed from: a */
    public AbstractC26490b f65486a;

    /* renamed from: c */
    private AbstractC26489a f65487c;

    /* renamed from: d */
    private C26618f f65488d;

    /* renamed from: e */
    private WeakReference<LynxView> f65489e;

    /* renamed from: f */
    private AbstractC26885d f65490f;

    /* renamed from: e */
    public AbstractC26489a mo93941e() {
        return this.f65487c;
    }

    /* renamed from: b */
    public void mo93937b() {
        AbstractC26489a aVar = this.f65487c;
        if (aVar != null) {
            aVar.mo93908a();
        }
        AbstractC26885d dVar = this.f65490f;
        if (dVar != null) {
            dVar.mo95675b();
        }
    }

    /* renamed from: c */
    public void mo93939c() {
        AbstractC26489a aVar = this.f65487c;
        if (aVar != null) {
            aVar.mo93918b();
        }
        AbstractC26885d dVar = this.f65490f;
        if (dVar != null) {
            dVar.mo95676c();
        }
    }

    /* renamed from: d */
    public void mo93940d() {
        AbstractC26489a aVar = this.f65487c;
        if (aVar != null) {
            aVar.mo93919c();
        }
        AbstractC26885d dVar = this.f65490f;
        if (dVar != null) {
            dVar.mo95674a();
        }
    }

    /* renamed from: a */
    public void mo93928a() {
        AbstractC26885d dVar = this.f65490f;
        if (dVar != null) {
            dVar.mo95677d();
            this.f65490f = null;
        }
        AbstractC26489a aVar = this.f65487c;
        if (aVar != null) {
            aVar.mo93920d();
            this.f65487c = null;
        }
        AbstractC26490b bVar = this.f65486a;
        if (bVar != null) {
            bVar.mo93927b();
            this.f65486a = null;
        }
    }

    /* renamed from: b */
    public void mo93938b(long j) {
        AbstractC26489a aVar = this.f65487c;
        if (aVar != null) {
            aVar.mo93910a(j);
        }
    }

    /* renamed from: a */
    public void mo93930a(long j) {
        AbstractC26490b bVar = this.f65486a;
        if (bVar != null) {
            bVar.mo93924a(j);
        }
    }

    /* renamed from: a */
    public void mo93931a(MotionEvent motionEvent) {
        AbstractC26489a aVar = this.f65487c;
        if (aVar != null) {
            aVar.mo93911a(motionEvent);
        }
    }

    /* renamed from: a */
    public void mo93932a(LynxView lynxView) {
        this.f65489e = new WeakReference<>(lynxView);
        AbstractC26489a aVar = this.f65487c;
        if (aVar != null) {
            aVar.mo93912a(lynxView);
        }
    }

    /* renamed from: a */
    public void mo93933a(TemplateData templateData) {
        C26618f fVar = this.f65488d;
        if (fVar != null) {
            fVar.mo94503a(templateData);
        }
    }

    /* renamed from: a */
    public void mo93934a(String str) {
        AbstractC26490b bVar = this.f65486a;
        if (bVar != null) {
            bVar.mo93926a(str);
        }
    }

    public C26491c(LynxView lynxView, LynxTemplateRender lynxTemplateRender) {
        try {
            String str = f65485b;
            LLog.m96425c(str, "Initialize LynxDevtool, lynxDebugEnabled:" + LynxEnv.m96123e().mo94104k());
            this.f65489e = new WeakReference<>(lynxView);
            if (LynxEnv.m96123e().mo94104k()) {
                LLog.m96425c(str, "devtoolEnabled:" + LynxEnv.m96123e().mo94105l() + ", redBoxEnabled:" + LynxEnv.m96123e().mo94106m());
                Object newInstance = Class.forName("com.lynx.devtool.LynxDevtoolManager").getConstructor(LynxView.class).newInstance(lynxView);
                if (newInstance instanceof AbstractC26885d) {
                    this.f65490f = (AbstractC26885d) newInstance;
                }
                if (LynxEnv.m96123e().mo94105l()) {
                    Object newInstance2 = Class.forName("com.lynx.devtool.LynxInspectorOwner").getConstructor(LynxView.class).newInstance(lynxView);
                    if (newInstance2 instanceof AbstractC26489a) {
                        this.f65487c = (AbstractC26489a) newInstance2;
                    }
                }
                if (LynxEnv.m96123e().mo94106m()) {
                    Object newInstance3 = Class.forName("com.lynx.devtool.redbox.RedBoxManager").getConstructor(Context.class, LynxTemplateRender.class).newInstance(lynxTemplateRender.getLynxContext().getBaseContext(), lynxTemplateRender);
                    if (newInstance3 instanceof AbstractC26490b) {
                        this.f65486a = (AbstractC26490b) newInstance3;
                        AbstractC26489a aVar = this.f65487c;
                        if (aVar != null) {
                            aVar.mo93914a(new Runnable() {
                                /* class com.lynx.devtoolwrapper.C26491c.RunnableC264921 */

                                public void run() {
                                    C26491c.this.f65486a.mo93923a();
                                }
                            });
                        }
                    }
                }
                DisplayMetrics b = lynxTemplateRender.getLynxContext().mo94672b();
                mo93929a(b.widthPixels, b.heightPixels, b.density);
            }
            if (!(this.f65487c == null && this.f65486a == null)) {
                this.f65488d = new C26618f(lynxTemplateRender);
            }
            AbstractC26489a aVar2 = this.f65487c;
            if (aVar2 != null) {
                aVar2.mo93913a(this.f65488d);
            }
            AbstractC26490b bVar = this.f65486a;
            if (bVar != null) {
                bVar.mo93925a(this.f65488d);
            }
        } catch (Exception e) {
            String str2 = f65485b;
            LLog.m96429e(str2, "failed to init LynxDevtool: " + e.toString());
            this.f65487c = null;
            this.f65486a = null;
            this.f65488d = null;
        }
    }

    /* renamed from: a */
    public void mo93929a(int i, int i2, float f) {
        AbstractC26489a aVar = this.f65487c;
        if (aVar != null) {
            aVar.mo93909a(i, i2, f);
        }
    }

    /* renamed from: a */
    public void mo93936a(byte[] bArr, TemplateData templateData, String str) {
        C26618f fVar = this.f65488d;
        if (fVar != null) {
            fVar.mo94506a(bArr, templateData, str);
        }
    }

    /* renamed from: a */
    public void mo93935a(String str, String str2, TemplateData templateData, Map<String, Object> map, String str3) {
        C26618f fVar = this.f65488d;
        if (fVar != null) {
            fVar.mo94505a(str, templateData, map, str3);
        }
        AbstractC26489a aVar = this.f65487c;
        if (aVar != null) {
            aVar.mo93915a(str2);
        }
    }
}
