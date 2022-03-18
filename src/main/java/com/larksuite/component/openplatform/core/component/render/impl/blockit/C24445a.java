package com.larksuite.component.openplatform.core.component.render.impl.blockit;

import com.lynx.tasm.base.AbstractC26613a;
import com.lynx.tasm.base.AbstractC26615c;
import com.lynx.tasm.base.LogSource;
import com.tt.refer.p3400a.p3410g.AbstractC67729a;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.component.openplatform.core.component.render.impl.blockit.a */
public class C24445a extends AbstractC26613a implements AbstractC26615c {

    /* renamed from: a */
    private final AbstractC67729a f60319a;

    /* renamed from: b */
    private final long f60320b;

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: b */
    public int mo53794b() {
        return 2;
    }

    @Override // com.lynx.tasm.base.AbstractC26615c
    /* renamed from: c */
    public boolean mo87238c() {
        return false;
    }

    public C24445a(AbstractC67729a aVar, long j) {
        this.f60319a = aVar;
        this.f60320b = j;
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: a */
    public void mo53792a(String str, String str2) {
        this.f60319a.mo99669a(2, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: b */
    public void mo53795b(String str, String str2) {
        this.f60319a.mo99669a(3, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: c */
    public void mo53796c(String str, String str2) {
        this.f60319a.mo99669a(4, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: d */
    public void mo53797d(String str, String str2) {
        this.f60319a.mo99669a(5, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: e */
    public void mo53798e(String str, String str2) {
        this.f60319a.mo99669a(6, str2);
    }

    @Override // com.lynx.tasm.base.AbstractC26615c
    /* renamed from: a */
    public boolean mo87237a(int i, LogSource logSource, Long l) {
        if (l == null || l.longValue() != this.f60320b) {
            return false;
        }
        return true;
    }
}
