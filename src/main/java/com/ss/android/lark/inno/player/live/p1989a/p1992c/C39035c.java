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

/* renamed from: com.ss.android.lark.inno.player.live.a.c.c */
public class C39035c extends AbstractC39016b<AbstractC39018d> {

    /* renamed from: a */
    private ImageView f100232a;

    /* renamed from: b */
    private Animation f100233b;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        super.mo142587a();
        if (this.f100232a.getVisibility() != 0) {
            this.f100232a.setVisibility(0);
            this.f100232a.startAnimation(this.f100233b);
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        super.mo142588b();
        if (this.f100232a.getVisibility() != 8) {
            this.f100232a.setVisibility(8);
            this.f100232a.clearAnimation();
        }
    }

    /* renamed from: c */
    private void m154049c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_live_layer_loading, (ViewGroup) this, true);
        this.f100232a = (ImageView) findViewById(R.id.player_loading_view);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.inno_player_loading);
        this.f100233b = loadAnimation;
        this.f100232a.startAnimation(loadAnimation);
    }

    public C39035c(Context context) {
        super(context);
        m154049c();
    }
}
