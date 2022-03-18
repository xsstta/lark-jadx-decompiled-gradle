package com.ss.android.lark.inno.player.live.p1989a.p1991b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;

/* renamed from: com.ss.android.lark.inno.player.live.a.b.d */
public class C39031d extends AbstractC39016b<AbstractC39026a> {

    /* renamed from: a */
    C39032a f100228a;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        super.mo142587a();
        this.f100228a.f100229a.setVisibility(0);
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        super.mo142588b();
        this.f100228a.f100229a.setVisibility(8);
    }

    /* renamed from: c */
    private void m154039c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_live_player_error, (ViewGroup) this, true);
        this.f100228a = new C39032a(this);
    }

    public C39031d(Context context) {
        super(context);
        m154039c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.inno.player.live.a.b.d$a */
    public static class C39032a {

        /* renamed from: a */
        public TextView f100229a;

        public C39032a(View view) {
            this.f100229a = (TextView) view.findViewById(R.id.inno_live_error_view);
        }
    }
}
