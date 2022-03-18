package com.lynx.tasm.behavior;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.core.C26880a;
import com.lynx.tasm.utils.C26959m;

/* renamed from: com.lynx.tasm.behavior.i */
public class C26676i {

    /* renamed from: a */
    public boolean f65994a;

    /* renamed from: b */
    public float f65995b;

    /* renamed from: c */
    public DialogC26683k f65996c;

    /* renamed from: d */
    public int f65997d;

    /* renamed from: e */
    public int f65998e;

    /* renamed from: f */
    public Rect f65999f = new Rect();

    /* renamed from: g */
    private AbstractC26684l f66000g;

    /* renamed from: h */
    private ViewTreeObserver.OnGlobalLayoutListener f66001h;

    /* renamed from: i */
    private boolean f66002i;

    /* renamed from: a */
    public void mo94635a() {
        if (this.f66002i) {
            LLog.m96423b(LynxKitALogDelegate.f38587a, "KeyboardEvent for LynxView " + this.f66000g.hashCode() + "already started");
            return;
        }
        if (!C26959m.m97972a()) {
            C26959m.m97969a(new Runnable() {
                /* class com.lynx.tasm.behavior.C26676i.RunnableC266771 */

                public void run() {
                    C26676i.this.mo94638b();
                }
            });
        } else {
            mo94638b();
        }
        this.f66002i = true;
    }

    /* renamed from: c */
    public void mo94639c() {
        DialogC26683k kVar;
        LLog.m96423b(LynxKitALogDelegate.f38587a, "KeyboardEvent for LynxView " + this.f66000g.hashCode() + "stopping");
        try {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f66001h;
            if (onGlobalLayoutListener != null && (kVar = this.f65996c) != null) {
                kVar.mo94649b(onGlobalLayoutListener);
                this.f65996c.mo94650c();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void mo94638b() {
        LLog.m96423b(LynxKitALogDelegate.f38587a, "KeyboardEvent for LynxView " + this.f66000g.hashCode() + "starting");
        if (this.f65996c == null) {
            this.f65996c = new DialogC26683k(this.f66000g.mo94680e());
        }
        final View decorView = ((Activity) this.f66000g.mo94680e()).getWindow().getDecorView();
        ViewTreeObserver$OnGlobalLayoutListenerC266782 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.lynx.tasm.behavior.C26676i.ViewTreeObserver$OnGlobalLayoutListenerC266782 */

            public void onGlobalLayout() {
                LLog.m96423b(LynxKitALogDelegate.f38587a, "onGlobalLayout invoked.");
                C26880a.m97713a().execute(new Runnable() {
                    /* class com.lynx.tasm.behavior.C26676i.ViewTreeObserver$OnGlobalLayoutListenerC266782.RunnableC266791 */

                    public void run() {
                        boolean z;
                        int i;
                        try {
                            C26676i.this.f65996c.mo94646a().getWindowVisibleDisplayFrame(C26676i.this.f65999f);
                            int i2 = C26676i.this.f65999f.bottom - C26676i.this.f65999f.top;
                            if (C26676i.this.f65997d == 0) {
                                C26676i.this.f65997d = decorView.getHeight();
                            }
                            if (C26676i.this.f65998e == 0) {
                                C26676i.this.f65998e = C26676i.this.f65996c.mo94646a().getHeight();
                            }
                            int i3 = C26676i.this.f65997d;
                            int i4 = C26676i.this.f65998e;
                            int i5 = 0;
                            if (((double) i2) / ((double) i3) < 0.8d) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                i5 = (int) (((float) (i3 - i2)) / C26676i.this.f65995b);
                                i = (int) (((float) (i4 - i2)) / C26676i.this.f65995b);
                            } else {
                                i = 0;
                            }
                            LLog.m96423b(LynxKitALogDelegate.f38587a, "KeyboardEvent visible = " + z + ", height = " + i5 + ", compatHeight = " + i);
                            if (z != C26676i.this.f65994a) {
                                C26676i.this.mo94637a(z, i5, i);
                            }
                            C26676i.this.f65994a = z;
                        } catch (Exception e) {
                            LLog.m96429e(LynxKitALogDelegate.f38587a, e.getMessage());
                        }
                    }
                });
            }
        };
        this.f66001h = r1;
        this.f65996c.mo94647a(r1);
        this.f65996c.mo94648b();
    }

    /* renamed from: a */
    public void mo94636a(boolean z) {
        if (this.f66002i) {
            if (!C26959m.m97972a()) {
                C26959m.m97969a(new Runnable() {
                    /* class com.lynx.tasm.behavior.C26676i.RunnableC266803 */

                    public void run() {
                        C26676i.this.mo94639c();
                    }
                });
            } else {
                mo94639c();
            }
            this.f66002i = false;
        }
    }

    public C26676i(AbstractC26684l lVar) {
        LLog.m96423b(LynxKitALogDelegate.f38587a, "KeyboardEvent initialized.");
        this.f66000g = lVar;
        this.f65995b = lVar.mo94680e().getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public void mo94637a(boolean z, int i, int i2) {
        String str;
        if (this.f66000g.mo94687i() != null) {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            javaOnlyArray.pushString(str);
            javaOnlyArray.pushInt(i);
            javaOnlyArray.pushInt(i2);
            this.f66000g.mo94670a("keyboardstatuschanged", javaOnlyArray);
        }
    }
}
