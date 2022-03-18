package com.ss.android.lark.mm.module.player.core.layer.p2318i;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.core.layer.p2318i.AbstractC46656a;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.i.c */
public class View$OnClickListenerC46661c extends LinearLayout implements View.OnClickListener, AbstractC46656a.AbstractC46657a {

    /* renamed from: a */
    private AbstractC46656a.AbstractC46658b f117371a;

    /* renamed from: b */
    private View f117372b;

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2318i.AbstractC46656a.AbstractC46657a
    /* renamed from: a */
    public void mo163869a() {
        C45855f.m181664c("ReplayLayerView", "show");
        setVisibility(0);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2318i.AbstractC46656a.AbstractC46657a
    /* renamed from: b */
    public void mo163870b() {
        C45855f.m181664c("ReplayLayerView", "dismiss");
        setVisibility(8);
    }

    /* renamed from: c */
    private void m184541c() {
        inflate(getContext(), R.layout.mm_player_reply_layout, this);
        View findViewById = findViewById(R.id.player_replay_content);
        this.f117372b = findViewById;
        findViewById.setOnClickListener(this);
        setGravity(17);
        setVisibility(8);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2318i.AbstractC46656a.AbstractC46657a
    public void setCallback(AbstractC46656a.AbstractC46658b bVar) {
        this.f117371a = bVar;
    }

    public View$OnClickListenerC46661c(Context context) {
        super(context);
        m184541c();
    }

    public void onClick(View view) {
        if (view == this.f117372b) {
            C45855f.m181664c("ReplayLayerView", "mReplyView");
            AbstractC46656a.AbstractC46658b bVar = this.f117371a;
            if (bVar != null) {
                bVar.mo163872a();
            }
        }
    }
}
