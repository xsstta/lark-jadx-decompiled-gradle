package com.ss.android.lark.inno.player.live.p1989a.p1992c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.player.layer.AbstractC39018d;

/* renamed from: com.ss.android.lark.inno.player.live.a.c.a */
public class C39033a extends AbstractC39016b<AbstractC39018d> {

    /* renamed from: a */
    private ImageView f100230a;

    /* renamed from: b */
    private Animation f100231b;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        super.mo142587a();
        if (this.f100230a.getVisibility() != 0) {
            this.f100230a.setVisibility(0);
            this.f100230a.startAnimation(this.f100231b);
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        super.mo142588b();
        if (this.f100230a.getVisibility() != 8) {
            this.f100230a.setVisibility(8);
            this.f100230a.clearAnimation();
        }
    }

    /* renamed from: c */
    private void m154042c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_live_layer_loading, (ViewGroup) this, true);
        this.f100230a = (ImageView) findViewById(R.id.player_loading_view);
        this.f100231b = AnimationUtils.loadAnimation(getContext(), R.anim.inno_player_loading);
    }

    public C39033a(Context context) {
        super(context);
        m154042c();
    }
}
