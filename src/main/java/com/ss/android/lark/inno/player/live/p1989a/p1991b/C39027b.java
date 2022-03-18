package com.ss.android.lark.inno.player.live.p1989a.p1991b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;

/* renamed from: com.ss.android.lark.inno.player.live.a.b.b */
public class C39027b extends AbstractC39016b<AbstractC39026a> {

    /* renamed from: a */
    C39028a f100225a;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        super.mo142587a();
        this.f100225a.f100226a.setVisibility(0);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        super.mo142588b();
        this.f100225a.f100226a.setVisibility(8);
    }

    /* renamed from: c */
    private void m154032c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_live_player_error, (ViewGroup) this, true);
        this.f100225a = new C39028a(this);
    }

    public C39027b(Context context) {
        super(context);
        m154032c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.inno.player.live.a.b.b$a */
    public static class C39028a {

        /* renamed from: a */
        public TextView f100226a;

        public C39028a(View view) {
            this.f100226a = (TextView) view.findViewById(R.id.inno_live_error_view);
        }
    }
}
