package com.tt.miniapp.p3335u.p3336a;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3335u.AbstractC66990a;
import com.tt.miniapp.p3335u.C66997b;
import com.tt.miniapp.p3335u.C66998c;
import com.tt.miniapphost.data.C67485a;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.tt.miniapp.u.a.c */
public class C66996c implements AbstractC66990a {

    /* renamed from: a */
    private final C66995b f168938a;

    /* renamed from: b */
    private final C66991a f168939b;

    /* renamed from: c */
    private final List<C66997b> f168940c = new LinkedList();

    /* renamed from: d */
    private C66997b f168941d;

    /* renamed from: e */
    private final IAppContext f168942e;

    @Override // com.tt.miniapp.p3335u.AbstractC66990a
    /* renamed from: a */
    public boolean mo233024a() {
        return true;
    }

    /* renamed from: c */
    public C66997b mo233037c() {
        return this.f168941d;
    }

    /* renamed from: b */
    public List<C66997b> mo233036b() {
        return this.f168940c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo233039e() {
        m261115a(m261117g(), 2);
    }

    /* renamed from: f */
    public void mo233040f() {
        C66998c.m261128a(this.f168942e).mo233046b(-1, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo233038d() {
        if (this.f168940c.size() != 1) {
            return true;
        }
        return !Objects.equals(this.f168941d, this.f168940c.get(0));
    }

    /* renamed from: g */
    private C66997b m261117g() {
        int indexOf;
        int size = this.f168940c.size() - 1;
        if (size < 0) {
            return null;
        }
        C66997b bVar = this.f168941d;
        if (bVar == null || (indexOf = this.f168940c.indexOf(bVar)) < 0) {
            return this.f168940c.get(size);
        }
        return this.f168940c.get((indexOf + 1) % (size + 1));
    }

    /* renamed from: b */
    public static void m261116b(IAppContext iAppContext) {
        m261114a(iAppContext);
    }

    /* renamed from: a */
    public void mo233034a(ImageView imageView) {
        this.f168939b.mo233027a(imageView);
    }

    /* renamed from: a */
    public static C66996c m261114a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234299t();
    }

    public C66996c(IAppContext iAppContext) {
        this.f168942e = iAppContext;
        this.f168939b = new C66991a(this, iAppContext);
        this.f168938a = new C66995b(this);
        C66998c.m261128a(iAppContext).mo233043a(-1, this);
    }

    @Override // com.tt.miniapp.p3335u.AbstractC66990a
    /* renamed from: b */
    public void mo233025b(int i) {
        boolean remove = this.f168940c.remove(new C66997b(i));
        AppBrandLogger.m52828d("SecrecyUIHelper", "onStop, res=" + remove);
    }

    @Override // com.tt.miniapp.p3335u.AbstractC66990a
    /* renamed from: a */
    public void mo233023a(int i) {
        C66997b bVar = new C66997b(i);
        if (!this.f168940c.contains(bVar)) {
            this.f168940c.add(bVar);
        }
        if (Objects.equals(this.f168941d, bVar)) {
            AppBrandLogger.m52828d("SecrecyUIHelper", "onStart, failed, showing");
            return;
        }
        m261115a(bVar, 1);
        AppBrandLogger.m52828d("SecrecyUIHelper", "onStart, type=" + i);
    }

    /* renamed from: a */
    private void m261115a(C66997b bVar, int i) {
        this.f168941d = bVar;
        this.f168939b.mo233026a(i);
        if (2 == i) {
            this.f168938a.mo233032a(i);
        }
    }

    /* renamed from: a */
    public void mo233035a(RelativeLayout relativeLayout, int i, int i2) {
        this.f168938a.mo233033a(relativeLayout, i, i2);
    }
}
