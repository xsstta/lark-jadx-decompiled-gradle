package com.ss.android.lark.mm.module.player.core.layer.p2315f;

import android.content.Context;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.core.layer.common.MmVideoLayerCommonViewHolder;
import com.ss.android.lark.mm.module.player.core.layer.p2315f.AbstractC46642a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.widget.MmLoadingLottieView;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.f.c */
public class C46646c extends RelativeLayout {

    /* renamed from: a */
    private AbstractC46642a.AbstractC46643a f117359a;

    /* renamed from: b */
    private MmVideoLayerCommonViewHolder f117360b;

    /* renamed from: a */
    public void mo163855a() {
        C45855f.m181663b("MmLoadingView", "show");
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo163858b() {
        C45855f.m181663b("MmLoadingView", "dismiss");
        setVisibility(4);
    }

    /* renamed from: c */
    private void m184507c() {
        inflate(getContext(), R.layout.mm_player_layer_loading, this);
        ((MmLoadingLottieView) findViewById(R.id.layerLoadingView)).setVisibility(0);
    }

    public void setCallback(AbstractC46642a.AbstractC46643a aVar) {
        this.f117359a = aVar;
    }

    public C46646c(Context context) {
        super(context);
        m184507c();
    }

    /* renamed from: a */
    public void mo163856a(float f) {
        MmVideoLayerCommonViewHolder aVar = this.f117360b;
        if (aVar != null) {
            aVar.mo163806a(f);
        }
    }

    /* renamed from: a */
    public void mo163857a(boolean z) {
        MmVideoLayerCommonViewHolder aVar = this.f117360b;
        if (aVar != null) {
            aVar.mo163812b(z);
        }
    }
}
