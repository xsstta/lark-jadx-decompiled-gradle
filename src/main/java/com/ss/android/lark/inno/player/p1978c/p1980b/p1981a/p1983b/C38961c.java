package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.CommonCode;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.layer.AbstractC39016b;
import com.ss.android.lark.inno.player.widget.C39088d;
import com.ss.android.lark.inno.utils.C39093c;
import com.ss.android.lark.mm.module.player.core.layer.p2321l.C46681a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.C47090a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.b.c */
public class C38961c extends AbstractC39016b<AbstractC38958a> {

    /* renamed from: a */
    private C39088d f100115a;

    /* renamed from: b */
    private C39088d f100116b;

    /* renamed from: c */
    private C38963a f100117c;

    /* renamed from: d */
    private boolean f100118d;

    /* renamed from: e */
    private boolean f100119e;

    /* renamed from: f */
    private void m153719f() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b.$$Lambda$c$ZF9TnEpEwgC4_S1L0iLCKyTfCkY */

            public final void run() {
                C38961c.lambda$ZF9TnEpEwgC4_S1L0iLCKyTfCkY(C38961c.this);
            }
        });
    }

    /* renamed from: e */
    private void m153718e() {
        if (this.f100117c.f100126e.getVisibility() != 0) {
            m153720g();
            m153719f();
            this.f100115a.mo142963b(true, 5000);
        }
    }

    private int getSuggestedClarity() {
        int a = ((AbstractC38958a) getDepend()).mo142594a();
        if (a == 3) {
            return 3;
        }
        return a + 1;
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: a */
    public void mo142587a() {
        if (!this.f100118d) {
            this.f100118d = true;
            m153716a(this.f100119e);
        }
        setVisibility(0);
        m153718e();
    }

    /* renamed from: c */
    public void mo142599c() {
        this.f100115a.mo142961b();
        this.f100117c.f100122a.removeView(this.f100117c.f100123b);
    }

    /* renamed from: d */
    private void m153717d() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_playtip, (ViewGroup) this, true);
        C38963a aVar = new C38963a(this);
        this.f100117c = aVar;
        aVar.f100125d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b.$$Lambda$c$EvmTIYph1C1qyWnpCDaNIG1TeA */

            public final void onClick(View view) {
                C38961c.m270572lambda$EvmTIYph1C1qyWnpCDaNIG1TeA(C38961c.this, view);
            }
        });
        this.f100115a = new C39088d(this.f100117c.f100123b);
        this.f100116b = new C39088d(this.f100117c.f100126e);
    }

    /* renamed from: g */
    private void m153720g() {
        String a = C45851c.m181647a(R.string.tools_wangluokadun_shishiqiehuan);
        final int suggestedClarity = getSuggestedClarity();
        C47090a.m186497a(getContext(), this.f100117c.f100124c, UIHelper.mustacheFormat(a, CommonCode.MapKey.HAS_RESOLUTION, C39093c.m154345b(suggestedClarity)), new C47090a.AbstractC47093a() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b.C38961c.C389621 */

            @Override // com.ss.android.lark.mm.utils.C47090a.AbstractC47093a
            /* renamed from: a */
            public void mo142600a(int i) {
                C38961c.this.mo142599c();
                C38961c.this.mo142598b(suggestedClarity);
                ((AbstractC38958a) C38961c.this.getDepend()).mo142595a(suggestedClarity);
            }
        });
    }

    /* renamed from: h */
    private void m153721h() {
        if (this.f100117c.f100126e.getParent() == null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C57582a.m223600a(8);
            this.f100117c.f100122a.addView(this.f100117c.f100126e, this.f100117c.f100122a.getChildCount(), layoutParams);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ void m153722i() {
        this.f100117c.f100122a.removeAllViews();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C57582a.m223600a(8);
        this.f100117c.f100122a.addView(this.f100117c.f100123b, 0, layoutParams);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m153715a(View view) {
        mo142599c();
    }

    public C38961c(Context context) {
        super(context);
        m153717d();
    }

    private void setIsSwitchingToText(int i) {
        this.f100117c.f100126e.setText(UIHelper.mustacheFormat(C45851c.m181647a(R.string.tools_zhengzaiqiehuan), CommonCode.MapKey.HAS_RESOLUTION, C39093c.m154344a(i)));
    }

    /* renamed from: a */
    public void mo142597a(int i) {
        if (!this.f100118d) {
            this.f100118d = true;
            m153716a(this.f100119e);
        }
        setVisibility(0);
        mo142598b(i);
    }

    /* renamed from: b */
    public void mo142598b(int i) {
        setVisibility(0);
        if (this.f100117c.f100126e.getVisibility() == 0) {
            this.f100116b.mo142961b();
            setIsSwitchingToText(i);
            this.f100116b.mo142963b(true, 2000);
            return;
        }
        setIsSwitchingToText(i);
        m153721h();
        this.f100116b.mo142963b(true, 2000);
    }

    /* renamed from: com.ss.android.lark.inno.player.c.b.a.b.c$a */
    public static class C38963a {

        /* renamed from: a */
        public LinearLayout f100122a;

        /* renamed from: b */
        public ViewGroup f100123b;

        /* renamed from: c */
        public TextView f100124c;

        /* renamed from: d */
        public ImageView f100125d;

        /* renamed from: e */
        public TextView f100126e;

        public C38963a(View view) {
            this.f100122a = (LinearLayout) view.findViewById(R.id.tips_container);
            this.f100124c = (TextView) view.findViewById(R.id.suggest_switch_tip_text);
            this.f100123b = (ViewGroup) view.findViewById(R.id.suggest_switch_tip_layer);
            this.f100125d = (ImageView) view.findViewById(R.id.suggest_close_icon);
            this.f100126e = (TextView) view.findViewById(R.id.is_switching_to_mode);
            C46681a.m184655a(this.f100125d, C57582a.m223600a(14), C57582a.m223600a(14), C57582a.m223600a(4), C57582a.m223600a(8));
        }
    }

    /* renamed from: a */
    private void m153716a(boolean z) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (z) {
            layoutParams.leftMargin = C57582a.m223600a(80);
            layoutParams.bottomMargin = C57582a.m223600a(75);
        } else {
            layoutParams.leftMargin = C57582a.m223600a(16);
            layoutParams.bottomMargin = C57582a.m223600a(52);
        }
        layoutParams.gravity = 8388691;
        this.f100117c.f100122a.setLayoutParams(layoutParams);
        this.f100117c.f100122a.setOrientation(1);
        this.f100117c.f100122a.removeAllViews();
        this.f100117c.f100122a.setVisibility(0);
    }

    public C38961c(Context context, boolean z) {
        super(context);
        this.f100119e = z;
        m153717d();
    }
}
