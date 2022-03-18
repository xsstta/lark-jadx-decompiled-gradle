package com.bytedance.ee.bear.widget;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p712o.C13710a;

/* renamed from: com.bytedance.ee.bear.widget.a */
public class C11766a {

    /* renamed from: a */
    private AbstractC11767a f31641a;

    /* renamed from: b */
    private boolean f31642b;

    /* renamed from: c */
    private int f31643c = -1;

    /* renamed from: d */
    private int f31644d = -1;

    /* renamed from: e */
    private CharSequence f31645e;

    /* renamed from: f */
    private boolean f31646f;

    /* renamed from: g */
    private C13710a<String> f31647g;

    /* renamed from: com.bytedance.ee.bear.widget.a$a */
    public interface AbstractC11767a {
        /* renamed from: a */
        void mo45011a();

        /* renamed from: a */
        void mo45012a(String str);

        /* renamed from: a */
        void mo45013a(boolean z);

        /* renamed from: b */
        void mo45014b();
    }

    /* renamed from: d */
    public void mo45036d() {
        this.f31646f = true;
    }

    /* renamed from: a */
    public int mo45031a() {
        return this.f31643c;
    }

    /* renamed from: b */
    public int mo45034b() {
        return this.f31644d;
    }

    /* renamed from: f */
    private void m48786f() {
        AbstractC11767a aVar = this.f31641a;
        if (aVar != null) {
            aVar.mo45014b();
        }
    }

    /* renamed from: g */
    private void m48787g() {
        AbstractC11767a aVar = this.f31641a;
        if (aVar != null) {
            aVar.mo45011a();
        }
    }

    /* renamed from: e */
    private void m48785e() {
        if (this.f31647g == null) {
            this.f31647g = new C13710a<>(300, new C13710a.AbstractC13714a() {
                /* class com.bytedance.ee.bear.widget.$$Lambda$a$R2XCpOnimilmUsDkiGXiUi4cQ */

                @Override // com.bytedance.ee.util.p712o.C13710a.AbstractC13714a
                public final void onSubscribe(Object obj) {
                    C11766a.this.m48784b((String) obj);
                }
            });
        }
    }

    /* renamed from: c */
    public void mo45035c() {
        this.f31642b = false;
        this.f31643c = -1;
        this.f31644d = -1;
        this.f31645e = null;
        C13710a<String> aVar = this.f31647g;
        if (aVar != null) {
            aVar.mo50678a();
            this.f31647g = null;
        }
    }

    /* renamed from: a */
    private void m48783a(boolean z) {
        AbstractC11767a aVar = this.f31641a;
        if (aVar != null) {
            aVar.mo45013a(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m48784b(String str) {
        AbstractC11767a aVar = this.f31641a;
        if (aVar != null) {
            aVar.mo45012a(str);
        }
    }

    /* renamed from: a */
    private void m48782a(String str) {
        m48785e();
        C13710a<String> aVar = this.f31647g;
        if (aVar != null) {
            aVar.mo50679a(str);
        }
    }

    /* renamed from: a */
    public void mo45032a(AbstractC11767a aVar) {
        this.f31641a = aVar;
    }

    /* renamed from: a */
    public void mo45033a(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        int i4;
        C13479a.m54772d("AtDetector", "s:" + ((Object) charSequence) + " ,start:" + i + " ,before:" + i2 + " , count:" + i3);
        if (i2 < 0 || i3 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (i2 <= 0 || i3 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            if (TextUtils.equals("@", charSequence.subSequence(i, i + i3))) {
                if (this.f31642b) {
                    C13479a.m54764b("AtDetector", "detectOnTextChange: We are already in @ mode. Cancel last one.");
                    mo45035c();
                    m48787g();
                } else {
                    m48783a(this.f31646f);
                }
                C13479a.m54764b("AtDetector", "detectOnTextChange: Begin @ mode.");
                this.f31642b = true;
                this.f31643c = i;
                this.f31644d = i + 1;
                this.f31646f = false;
                m48782a("");
            } else if (this.f31642b) {
                C13479a.m54764b("AtDetector", "detectOnTextChange: Add text that is not @");
                int i5 = this.f31644d + (i3 - i2);
                this.f31644d = i5;
                int i6 = this.f31643c;
                if (i < i6 + 1) {
                    C13479a.m54775e("AtDetector", "detectOnTextChange: input before at character");
                    mo45035c();
                    m48786f();
                } else if (i6 < 0 || i6 + 1 > i5 || i5 > charSequence.length()) {
                    C13479a.m54775e("AtDetector", "detectOnTextChange: Cancel input because of wrong state.");
                    mo45035c();
                    m48786f();
                } else {
                    C13479a.m54764b("AtDetector", "detectOnTextChange: Change keyword.");
                    CharSequence subSequence = charSequence.subSequence(this.f31643c + 1, this.f31644d);
                    this.f31645e = subSequence;
                    m48782a(subSequence.toString());
                }
            }
        } else if (z2) {
            if (this.f31642b) {
                C13479a.m54764b("AtDetector", "detectOnTextChange: Delete text");
                if (i >= this.f31643c + 1) {
                    this.f31644d -= i2;
                    C13479a.m54764b("AtDetector", "detectOnTextChange: start = " + (this.f31643c + 1) + ", end = " + this.f31644d + ", s = " + ((Object) charSequence));
                    int i7 = this.f31643c;
                    if (i7 < 0 || i7 + 1 > (i4 = this.f31644d) || i4 > charSequence.length()) {
                        C13479a.m54775e("AtDetector", "detectOnTextChange: Cancel input because of wrong state.");
                        mo45035c();
                        m48786f();
                        return;
                    }
                    CharSequence subSequence2 = charSequence.subSequence(this.f31643c + 1, this.f31644d);
                    this.f31645e = subSequence2;
                    m48782a(subSequence2.toString());
                    return;
                }
                C13479a.m54772d("AtDetector", "detectOnTextChange: delete at character");
                mo45035c();
                m48786f();
            }
        } else if (this.f31642b) {
            C13479a.m54764b("AtDetector", "detectOnTextChange: Modify text, cancel @ mode.");
            mo45035c();
            m48786f();
        }
    }
}
