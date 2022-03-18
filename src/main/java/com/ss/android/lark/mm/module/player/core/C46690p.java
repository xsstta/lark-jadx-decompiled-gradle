package com.ss.android.lark.mm.module.player.core;

import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.ttm.player.PlaybackParams;

/* renamed from: com.ss.android.lark.mm.module.player.core.p */
public class C46690p implements AbstractC46598e {

    /* renamed from: a */
    private MmPlayerStatus f117445a = MmPlayerStatus.IDLE;

    /* renamed from: b */
    private AbstractC64108o f117446b;

    /* renamed from: c */
    private AbstractC46595b f117447c;

    /* renamed from: d */
    private boolean f117448d;

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: i */
    public void mo163720i() {
        this.f117448d = true;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: j */
    public boolean mo163721j() {
        return this.f117448d;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: l */
    public MmPlayerStatus mo163723l() {
        return this.f117445a;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: a */
    public int mo163710a() {
        AbstractC64108o oVar = this.f117446b;
        if (oVar != null) {
            return oVar.mo221909a();
        }
        return 0;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: b */
    public int mo163713b() {
        AbstractC64108o oVar = this.f117446b;
        if (oVar != null) {
            return oVar.mo221910b();
        }
        return 0;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: c */
    public boolean mo163714c() {
        AbstractC64108o oVar = this.f117446b;
        if (oVar != null) {
            return oVar.mo221911c();
        }
        return false;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: d */
    public boolean mo163715d() {
        AbstractC64108o oVar = this.f117446b;
        if (oVar != null) {
            return oVar.mo221912d();
        }
        return false;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: e */
    public boolean mo163716e() {
        AbstractC64108o oVar = this.f117446b;
        if (oVar != null) {
            return oVar.mo221914f();
        }
        return true;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: f */
    public boolean mo163717f() {
        AbstractC64108o oVar = this.f117446b;
        if (oVar != null) {
            return oVar.mo221915g();
        }
        return true;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: g */
    public boolean mo163718g() {
        AbstractC64108o oVar = this.f117446b;
        if (oVar != null) {
            return oVar.mo221917i();
        }
        return false;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: h */
    public PlaybackParams mo163719h() {
        AbstractC64108o oVar = this.f117446b;
        if (oVar != null) {
            return oVar.mo221919k();
        }
        return null;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: m */
    public boolean mo163724m() {
        if (this.f117445a == MmPlayerStatus.PREPARING) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: k */
    public float mo163722k() {
        AbstractC64108o oVar = this.f117446b;
        if (oVar == null) {
            return 1.0f;
        }
        PlaybackParams k = oVar.mo221919k();
        if (k != null) {
            return k.getSpeed();
        }
        return this.f117447c.mo163691g();
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: a */
    public void mo163711a(MmPlayerStatus mmPlayerStatus) {
        this.f117445a = mmPlayerStatus;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46598e
    /* renamed from: a */
    public void mo163712a(AbstractC64108o oVar) {
        this.f117446b = oVar;
    }

    public C46690p(AbstractC46595b bVar, AbstractC64108o oVar) {
        this.f117447c = bVar;
        this.f117446b = oVar;
    }
}
