package com.ss.android.lark.mm.module.player.core.layer.p2319j;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.j.c */
public class C46667c extends RelativeLayout implements AbstractC46662a.AbstractC46663a {

    /* renamed from: a */
    private AbstractC46662a.AbstractC46664b f117376a;

    /* renamed from: b */
    private C46668d f117377b;

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a.AbstractC46663a
    /* renamed from: a */
    public void mo163877a() {
        setVisibility(0);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a.AbstractC46663a
    /* renamed from: b */
    public void mo163880b() {
        setVisibility(4);
    }

    /* renamed from: c */
    private void m184561c() {
        inflate(getContext(), R.layout.mm_subtitle_panel, this);
        this.f117377b = new C46668d((LinearLayout) findViewById(R.id.subtitle_container), this.f117376a.mo163884d().mo163726b());
        setVisibility(4);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a.AbstractC46663a
    public void setCallback(AbstractC46662a.AbstractC46664b bVar) {
        this.f117376a = bVar;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a.AbstractC46663a
    /* renamed from: b */
    public void mo163881b(boolean z) {
        this.f117377b.mo163891a(z);
        this.f117377b.mo163893c();
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a.AbstractC46663a
    /* renamed from: a */
    public void mo163879a(boolean z) {
        if (this.f117376a.mo163883a()) {
            mo163881b(z);
            mo163877a();
        }
    }

    public C46667c(Context context, AbstractC46662a.AbstractC46664b bVar) {
        super(context);
        this.f117376a = bVar;
        m184561c();
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a.AbstractC46663a
    /* renamed from: a */
    public void mo163878a(long j, long j2) {
        if (getVisibility() == 0) {
            this.f117377b.mo163888a(j, j2);
        }
    }
}
