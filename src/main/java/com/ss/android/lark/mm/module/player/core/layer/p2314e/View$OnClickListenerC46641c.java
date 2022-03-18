package com.ss.android.lark.mm.module.player.core.layer.p2314e;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.core.layer.common.MmVideoLayerCommonViewHolder;
import com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.e.c */
public class View$OnClickListenerC46641c extends RelativeLayout implements View.OnClickListener, AbstractC46636a.AbstractC46637a {

    /* renamed from: a */
    private AbstractC46636a.AbstractC46638b f117354a;

    /* renamed from: b */
    private MmVideoLayerCommonViewHolder f117355b;

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a.AbstractC46637a
    /* renamed from: a */
    public void mo163841a() {
        setVisibility(0);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a.AbstractC46637a
    /* renamed from: b */
    public void mo163844b() {
        setVisibility(8);
    }

    /* renamed from: c */
    private void m184495c() {
        inflate(getContext(), R.layout.mm_play_error_layer_layout, this);
        setGravity(17);
        setVisibility(8);
        setOnClickListener(this);
    }

    public View$OnClickListenerC46641c(Context context) {
        super(context);
        m184495c();
    }

    public void onClick(View view) {
        AbstractC46636a.AbstractC46638b bVar = this.f117354a;
        if (bVar != null) {
            bVar.mo163846a();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a.AbstractC46637a
    /* renamed from: a */
    public void mo163842a(float f) {
        MmVideoLayerCommonViewHolder aVar = this.f117355b;
        if (aVar != null) {
            aVar.mo163806a(f);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a.AbstractC46637a
    /* renamed from: a */
    public void mo163843a(boolean z) {
        MmVideoLayerCommonViewHolder aVar = this.f117355b;
        if (aVar != null) {
            aVar.mo163812b(z);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a.AbstractC46637a
    public void setCallback(AbstractC46636a.AbstractC46638b bVar) {
        this.f117354a = bVar;
        if (this.f117355b == null) {
            this.f117355b = new MmVideoLayerCommonViewHolder(this, bVar.mo163847d(), bVar.mo163848e());
        }
    }
}
