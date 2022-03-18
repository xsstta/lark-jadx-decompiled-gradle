package com.ss.android.lark.widget.ptr;

import com.ss.android.lark.widget.ptr.p2961a.C58935a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.widget.ptr.b */
public class C58936b implements AbstractC58934a {

    /* renamed from: a */
    private AbstractC58934a f145944a;

    /* renamed from: b */
    private C58936b f145945b;

    private C58936b() {
    }

    /* renamed from: c */
    private AbstractC58934a m228771c() {
        return this.f145944a;
    }

    /* renamed from: b */
    public static C58936b m228769b() {
        return new C58936b();
    }

    /* renamed from: a */
    public boolean mo199935a() {
        if (this.f145944a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m228768a(AbstractC58934a aVar) {
        AbstractC58934a aVar2 = this.f145944a;
        if (aVar2 == null || aVar2 != aVar) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: c */
    public void mo166241c(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        C58936b bVar = this;
        do {
            AbstractC58934a c = bVar.m228771c();
            if (c != null) {
                c.mo166241c(lKUIPtrFrameLayout);
            }
            bVar = bVar.f145945b;
        } while (bVar != null);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166237a(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        C58936b bVar = this;
        do {
            AbstractC58934a c = bVar.m228771c();
            if (c != null) {
                c.mo166237a(lKUIPtrFrameLayout);
            }
            bVar = bVar.f145945b;
        } while (bVar != null);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: b */
    public void mo166240b(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
        if (mo199935a()) {
            C58936b bVar = this;
            do {
                AbstractC58934a c = bVar.m228771c();
                if (c != null) {
                    c.mo166240b(lKUIPtrFrameLayout);
                }
                bVar = bVar.f145945b;
            } while (bVar != null);
        }
    }

    /* renamed from: a */
    public static void m228767a(C58936b bVar, AbstractC58934a aVar) {
        if (aVar != null && bVar != null) {
            if (bVar.f145944a == null) {
                bVar.f145944a = aVar;
                return;
            }
            while (!bVar.m228768a(aVar)) {
                C58936b bVar2 = bVar.f145945b;
                if (bVar2 == null) {
                    C58936b bVar3 = new C58936b();
                    bVar3.f145944a = aVar;
                    bVar.f145945b = bVar3;
                    return;
                }
                bVar = bVar2;
            }
        }
    }

    /* renamed from: b */
    public static C58936b m228770b(C58936b bVar, AbstractC58934a aVar) {
        if (bVar == null || aVar == null || bVar.f145944a == null) {
            return bVar;
        }
        C58936b bVar2 = bVar;
        C58936b bVar3 = null;
        do {
            if (!bVar.m228768a(aVar)) {
                bVar3 = bVar;
                bVar = bVar.f145945b;
                continue;
            } else if (bVar3 == null) {
                bVar2 = bVar.f145945b;
                bVar.f145945b = null;
                bVar = bVar2;
                continue;
            } else {
                bVar3.f145945b = bVar.f145945b;
                bVar.f145945b = null;
                bVar = bVar3.f145945b;
                continue;
            }
        } while (bVar != null);
        if (bVar2 == null) {
            return new C58936b();
        }
        return bVar2;
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166238a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z) {
        C58936b bVar = this;
        do {
            AbstractC58934a c = bVar.m228771c();
            if (c != null) {
                c.mo166238a(lKUIPtrFrameLayout, z);
            }
            bVar = bVar.f145945b;
        } while (bVar != null);
    }

    @Override // com.ss.android.lark.widget.ptr.AbstractC58934a
    /* renamed from: a */
    public void mo166239a(LKUIPtrFrameLayout lKUIPtrFrameLayout, boolean z, byte b, C58935a aVar) {
        C58936b bVar = this;
        do {
            AbstractC58934a c = bVar.m228771c();
            if (c != null) {
                c.mo166239a(lKUIPtrFrameLayout, z, b, aVar);
            }
            bVar = bVar.f145945b;
        } while (bVar != null);
    }
}
