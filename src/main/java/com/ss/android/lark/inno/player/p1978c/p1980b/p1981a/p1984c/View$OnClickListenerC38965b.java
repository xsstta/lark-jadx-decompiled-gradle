package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.player.p1978c.p1988c.C38992a;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.c.b */
public class View$OnClickListenerC38965b extends AbstractC39016b<AbstractC38964a> implements View.OnClickListener {

    /* renamed from: a */
    private TextView f100127a;

    /* renamed from: b */
    private TextView f100128b;

    /* renamed from: c */
    private TextView f100129c;

    /* renamed from: d */
    private C38992a f100130d;

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        setVisibility(0);
        C38992a a = ((AbstractC38964a) getDepend()).mo142604a();
        this.f100130d = a;
        if (a != null) {
            setResolution(a.mo142681a().f100177b);
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        if (getVisibility() == 0) {
            setVisibility(8);
            ((AbstractC38964a) getDepend()).mo142606b();
        }
    }

    /* renamed from: c */
    private void m153734c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_choose_resolution, (ViewGroup) this, true);
        this.f100127a = (TextView) findViewById(R.id.resolutionItem1);
        this.f100128b = (TextView) findViewById(R.id.resolutionItem2);
        this.f100129c = (TextView) findViewById(R.id.resolutionItem3);
        this.f100130d = new C38992a();
        this.f100127a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c.$$Lambda$b$nROBC8v5VB_SY9VrkV_gL_Swgw */

            public final void onClick(View view) {
                View$OnClickListenerC38965b.m270573lambda$nROBC8v5VB_SY9VrkV_gL_Swgw(View$OnClickListenerC38965b.this, view);
            }
        });
        this.f100128b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c.$$Lambda$b$wTssPknyVitFohbto4d7BPg66w */

            public final void onClick(View view) {
                View$OnClickListenerC38965b.m270574lambda$wTssPknyVitFohbto4d7BPg66w(View$OnClickListenerC38965b.this, view);
            }
        });
        this.f100129c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c.$$Lambda$b$4JAx604mCufjET6AvrCLB2y6R6Q */

            public final void onClick(View view) {
                View$OnClickListenerC38965b.lambda$4JAx604mCufjET6AvrCLB2y6R6Q(View$OnClickListenerC38965b.this, view);
            }
        });
        setVisibility(8);
        setOnClickListener(this);
    }

    public View$OnClickListenerC38965b(Context context) {
        super(context);
        m153734c();
    }

    public void onClick(View view) {
        if (view == this) {
            mo142588b();
        }
    }

    /* renamed from: a */
    private C38992a.C38994a m153731a(int i) {
        return new C38992a.C38994a(this.f100130d.mo142683b(i).f100176a, i);
    }

    private void setSelected(TextView textView) {
        textView.setTextColor(C57582a.m223616d(getContext(), R.color.primary_pri_500));
    }

    private void setUnselected(TextView textView) {
        textView.setTextColor(C57582a.m223616d(getContext(), R.color.static_white));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153732a(View view) {
        setResolution(3);
        ((AbstractC38964a) getDepend()).mo142605a(m153731a(3));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m153733b(View view) {
        setResolution(2);
        ((AbstractC38964a) getDepend()).mo142605a(m153731a(2));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m153735c(View view) {
        setResolution(1);
        ((AbstractC38964a) getDepend()).mo142605a(m153731a(1));
    }

    private void setResolution(int i) {
        if (i == 1) {
            setSelected(this.f100127a);
            setUnselected(this.f100128b);
            setUnselected(this.f100129c);
        } else if (i == 2) {
            setSelected(this.f100128b);
            setUnselected(this.f100127a);
            setUnselected(this.f100129c);
        } else if (i == 3) {
            setSelected(this.f100129c);
            setUnselected(this.f100128b);
            setUnselected(this.f100127a);
        }
    }
}
