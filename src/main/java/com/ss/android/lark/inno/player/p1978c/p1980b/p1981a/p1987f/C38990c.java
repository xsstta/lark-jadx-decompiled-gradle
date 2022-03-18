package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1987f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.f.c */
public class C38990c extends AbstractC39016b<AbstractC38987a> {

    /* renamed from: a */
    TextView f100169a;

    /* renamed from: b */
    boolean f100170b;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        if (getVisibility() == 0) {
            setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m153862c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_unmute, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.video_click_to_unmute);
        this.f100169a = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1987f.$$Lambda$c$yX_g1qOilRu0NFpGzSb6_Cyczc */

            public final void onClick(View view) {
                C38990c.m270581lambda$yX_g1qOilRu0NFpGzSb6_Cyczc(C38990c.this, view);
            }
        });
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        if (!this.f100170b) {
            if (!((AbstractC38987a) getDepend()).mo142668a()) {
                mo142588b();
            } else if (getVisibility() != 0) {
                setVisibility(0);
            }
        }
    }

    public C38990c(Context context) {
        super(context);
        m153862c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153861a(View view) {
        this.f100170b = true;
        ((AbstractC38987a) getDepend()).mo142667a(false);
        mo142588b();
    }
}
