package com.larksuite.component.ui.toast;

import android.content.Context;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;

/* renamed from: com.larksuite.component.ui.toast.a */
public class C25707a {

    /* renamed from: e */
    private static Handler f63010e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    private UDToastImpl f63011a;

    /* renamed from: b */
    private UDToast.Builder f63012b;

    /* renamed from: c */
    private final Context f63013c;

    /* renamed from: d */
    private String f63014d;

    /* renamed from: a */
    public void mo90182a(float f) {
    }

    /* renamed from: a */
    public void mo90185a(int i, int i2, int i3, int i4) {
    }

    /* renamed from: b */
    public void mo90189b() {
        mo90181a();
    }

    /* renamed from: d */
    private void m92355d() {
        Log.e("LKUIGlobalToast", "mUDToastBuilder is null, you should rebuild UDToast.Builder");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m92356e() {
        this.f63011a.cancel();
    }

    /* renamed from: a */
    public void mo90181a() {
        UDToastImpl dVar = this.f63011a;
        if (dVar != null) {
            dVar.cancel();
        }
        this.f63011a = null;
        this.f63012b = null;
    }

    /* renamed from: c */
    public void mo90191c() {
        if (this.f63011a == null) {
            UDToast.Builder aVar = this.f63012b;
            if (aVar == null) {
                m92355d();
                return;
            }
            this.f63011a = aVar.mo91655j();
        }
        this.f63011a.show();
    }

    /* renamed from: a */
    public void mo90183a(int i) {
        if (i != -1) {
            UDToastImpl dVar = this.f63011a;
            if (dVar == null) {
                UDToast.Builder aVar = this.f63012b;
                if (aVar != null) {
                    aVar.mo91647b(i);
                } else {
                    m92355d();
                }
            } else {
                dVar.mo91660a(i);
            }
        }
    }

    /* renamed from: b */
    public void mo90190b(int i) {
        if (this.f63011a == null) {
            UDToast.Builder aVar = this.f63012b;
            if (aVar != null) {
                aVar.mo91640a((long) i);
            } else {
                m92355d();
            }
        } else {
            f63010e.postDelayed(new Runnable() {
                /* class com.larksuite.component.ui.toast.$$Lambda$a$eNVYyBToRVoVkbuWmyY2XDHwCo */

                public final void run() {
                    C25707a.this.m92356e();
                }
            }, (long) i);
        }
    }

    /* renamed from: a */
    public void mo90187a(long j) {
        if (j > -2) {
            if (j < 2000) {
                j = -1;
            } else {
                j = -2;
            }
        }
        this.f63012b.mo91640a(j);
        mo90191c();
    }

    /* renamed from: a */
    public void mo90188a(String str) {
        this.f63014d = str;
        CharSequence nullIsEmpty = LKUIToast.nullIsEmpty(str);
        UDToastImpl dVar = this.f63011a;
        if (dVar == null) {
            UDToast.Builder aVar = this.f63012b;
            if (aVar != null) {
                aVar.mo91643a(nullIsEmpty);
            } else {
                m92355d();
            }
        } else {
            dVar.setText(nullIsEmpty);
        }
    }

    /* renamed from: a */
    public void mo90186a(int i, Animation animation) {
        if (i != -1) {
            if (!(animation instanceof RotateAnimation)) {
                mo90183a(i);
                return;
            }
            CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(this.f63013c);
            circularProgressDrawable.mo7698a(1);
            circularProgressDrawable.mo7701a(UDColorUtils.getColor(this.f63013c, R.color.ud_N00));
            circularProgressDrawable.mo7699a(Paint.Cap.ROUND);
            UDToastImpl dVar = this.f63011a;
            if (dVar == null) {
                UDToast.Builder aVar = this.f63012b;
                if (aVar != null) {
                    aVar.mo91641a(circularProgressDrawable);
                } else {
                    m92355d();
                }
            } else {
                dVar.mo91663a(circularProgressDrawable);
            }
        }
    }

    C25707a(Context context, UDToast.Builder aVar, String str) {
        this.f63013c = context;
        this.f63012b = aVar;
        this.f63014d = str;
    }

    /* renamed from: a */
    public void mo90184a(int i, int i2, int i3) {
        if (this.f63011a == null) {
            UDToast.Builder aVar = this.f63012b;
            if (aVar != null) {
                aVar.mo91638a(i, i2, i3);
            } else {
                m92355d();
            }
        }
    }
}
