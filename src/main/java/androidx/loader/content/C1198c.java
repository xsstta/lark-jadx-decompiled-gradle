package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.core.util.C0840a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.content.c */
public class C1198c<D> {

    /* renamed from: n */
    int f4349n;

    /* renamed from: o */
    AbstractC1201c<D> f4350o;

    /* renamed from: p */
    AbstractC1200b<D> f4351p;

    /* renamed from: q */
    Context f4352q;

    /* renamed from: r */
    boolean f4353r;

    /* renamed from: s */
    boolean f4354s;

    /* renamed from: t */
    boolean f4355t = true;

    /* renamed from: u */
    boolean f4356u;

    /* renamed from: v */
    boolean f4357v;

    /* renamed from: androidx.loader.content.c$b */
    public interface AbstractC1200b<D> {
        /* renamed from: a */
        void mo6141a(C1198c<D> cVar);
    }

    /* renamed from: androidx.loader.content.c$c */
    public interface AbstractC1201c<D> {
        /* renamed from: a */
        void mo6059a(C1198c<D> cVar, D d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6094a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo6099b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6116i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo6117j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo6118k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo6134v() {
    }

    /* renamed from: y */
    public void mo6137y() {
        this.f4357v = false;
    }

    /* renamed from: m */
    public Context mo6124m() {
        return this.f4352q;
    }

    /* renamed from: n */
    public boolean mo6125n() {
        return this.f4353r;
    }

    /* renamed from: o */
    public boolean mo6126o() {
        return this.f4354s;
    }

    /* renamed from: p */
    public boolean mo6127p() {
        return this.f4355t;
    }

    /* renamed from: s */
    public void mo6130s() {
        mo6094a();
    }

    /* renamed from: l */
    public void mo6123l() {
        AbstractC1200b<D> bVar = this.f4351p;
        if (bVar != null) {
            bVar.mo6141a(this);
        }
    }

    /* renamed from: r */
    public boolean mo6129r() {
        return mo6099b();
    }

    /* renamed from: t */
    public void mo6131t() {
        this.f4353r = false;
        mo6117j();
    }

    /* renamed from: u */
    public void mo6133u() {
        this.f4354s = true;
        mo6134v();
    }

    /* renamed from: z */
    public void mo6138z() {
        if (this.f4357v) {
            mo6119A();
        }
    }

    /* renamed from: A */
    public void mo6119A() {
        if (this.f4353r) {
            mo6130s();
        } else {
            this.f4356u = true;
        }
    }

    /* renamed from: q */
    public final void mo6128q() {
        this.f4353r = true;
        this.f4355t = false;
        this.f4354s = false;
        mo6116i();
    }

    /* renamed from: w */
    public void mo6135w() {
        mo6118k();
        this.f4355t = true;
        this.f4353r = false;
        this.f4354s = false;
        this.f4356u = false;
        this.f4357v = false;
    }

    /* renamed from: x */
    public boolean mo6136x() {
        boolean z = this.f4356u;
        this.f4356u = false;
        this.f4357v |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0840a.m3984a(this, sb);
        sb.append(" id=");
        sb.append(this.f4349n);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: androidx.loader.content.c$a */
    public final class C1199a extends ContentObserver {
        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C1198c.this.mo6119A();
        }

        public C1199a() {
            super(new Handler());
        }
    }

    /* renamed from: b */
    public void mo6112b(D d) {
        AbstractC1201c<D> cVar = this.f4350o;
        if (cVar != null) {
            cVar.mo6059a(this, d);
        }
    }

    public C1198c(Context context) {
        this.f4352q = context.getApplicationContext();
    }

    /* renamed from: c */
    public String mo6122c(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0840a.m3984a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo6121a(AbstractC1201c<D> cVar) {
        AbstractC1201c<D> cVar2 = this.f4350o;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (cVar2 == cVar) {
            this.f4350o = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public void mo6120a(int i, AbstractC1201c<D> cVar) {
        if (this.f4350o == null) {
            this.f4350o = cVar;
            this.f4349n = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: a */
    public void mo6097a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f4349n);
        printWriter.print(" mListener=");
        printWriter.println(this.f4350o);
        if (this.f4353r || this.f4356u || this.f4357v) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f4353r);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f4356u);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f4357v);
        }
        if (this.f4354s || this.f4355t) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f4354s);
            printWriter.print(" mReset=");
            printWriter.println(this.f4355t);
        }
    }
}
