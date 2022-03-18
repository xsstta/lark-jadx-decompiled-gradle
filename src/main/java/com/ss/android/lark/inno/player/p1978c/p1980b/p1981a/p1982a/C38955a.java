package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1982a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.a.a */
public class C38955a extends AbstractC39016b {

    /* renamed from: a */
    private ImageView f100110a;

    /* renamed from: b */
    private Animation f100111b;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        setVisibility(8);
        this.f100110a.setVisibility(8);
        this.f100110a.clearAnimation();
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        setVisibility(0);
        this.f100110a.setVisibility(0);
        this.f100110a.startAnimation(this.f100111b);
    }

    /* renamed from: c */
    private void m153697c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_loading, (ViewGroup) this, true);
        this.f100110a = (ImageView) findViewById(R.id.player_loading_view);
        this.f100111b = AnimationUtils.loadAnimation(getContext(), R.anim.inno_player_loading);
        setVisibility(8);
    }

    public C38955a(Context context) {
        super(context);
        m153697c();
    }
}
