package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.player.widget.C39088d;
import com.ss.android.lark.inno.player.widget.VcSeekBar;
import com.ss.android.lark.inno.player.widget.VcTitleBar;
import com.ss.android.lark.inno.utils.C39093c;
import com.ss.android.lark.inno.utils.VcTimeUtils;
import com.ss.android.lark.mm.module.player.core.layer.p2321l.C46681a;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.e.c */
public class C38975c extends AbstractC38973a<AbstractC38974b> {

    /* renamed from: a */
    private C38979a f100135a;

    /* renamed from: b */
    private C39088d f100136b;

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: c */
    public void mo142632c() {
        mo142587a();
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        this.f100136b.mo142958a();
    }

    /* renamed from: d */
    public void mo142649d() {
        ((AbstractC38974b) getDepend()).mo142647k();
        this.f100135a.f100146g.setVisibility(4);
    }

    /* renamed from: e */
    private void m153789e() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_full_layer_toolbar, (ViewGroup) this, true);
        C38979a aVar = new C38979a(this);
        this.f100135a = aVar;
        C46681a.m184654a(aVar.f100140a, C57582a.m223600a(10));
        this.f100135a.f100140a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$c$DrH06TZWsJ_4o7PmOo4ENjyAQzc */

            public final void onClick(View view) {
                C38975c.lambda$DrH06TZWsJ_4o7PmOo4ENjyAQzc(C38975c.this, view);
            }
        });
        this.f100135a.f100143d.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_expand_outlined, ContextCompat.getColor(getContext(), R.color.static_white)));
        this.f100135a.f100143d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$c$OxRUIkqhztUkzVa0TX26kI1FU */

            public final void onClick(View view) {
                C38975c.m270575lambda$OxRUIkqhztUkzVa0TX26kI1FU(C38975c.this, view);
            }
        });
        this.f100135a.f100144e.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.C38975c.C389761 */

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                ((AbstractC38974b) C38975c.this.getDepend()).mo142636a(seekBar.getProgress());
                C38975c.this.mo142649d();
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C38975c.this.mo142628a(i, seekBar.getMax(), true);
                C38975c.this.mo142648a(i, seekBar.getMax());
            }
        });
        this.f100135a.f100145f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$c$tD2nHWgcuGTOAy5UJhmzmMZqVs */

            public final void onClick(View view) {
                C38975c.m270577lambda$tD2nHWgcuGTOAy5UJhmzmMZqVs(C38975c.this, view);
            }
        });
        this.f100135a.f100148i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.$$Lambda$c$jBQwcd_kvi9P7De4_N6PiXghs */

            public final void onClick(View view) {
                C38975c.m270576lambda$jBQwcd_kvi9P7De4_N6PiXghs(C38975c.this, view);
            }
        });
        this.f100135a.f100147h.setTitleText(ResString.f118656a.mo165504a(R.string.mm_tools_long_text2));
        this.f100135a.f100147h.setOnLeftListener(new VcTitleBar.AbstractC39082a() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.C38975c.C389772 */

            @Override // com.ss.android.lark.inno.player.widget.VcTitleBar.AbstractC39082a
            /* renamed from: a */
            public void mo142654a() {
                ((AbstractC38974b) C38975c.this.getDepend()).mo142643g();
            }
        });
        this.f100135a.f100147h.setOnShareListener(new VcTitleBar.AbstractC39083b() {
            /* class com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.C38975c.C389783 */

            @Override // com.ss.android.lark.inno.player.widget.VcTitleBar.AbstractC39083b
            /* renamed from: a */
            public void mo142655a() {
            }
        });
        this.f100136b = new C39088d(this);
    }

    public C38975c(Context context) {
        super(context);
        m153789e();
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: c */
    public void mo142633c(boolean z) {
        this.f100136b.mo142959a(z);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m153784a(View view) {
        ((AbstractC38974b) getDepend()).mo142645i();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m153786b(View view) {
        ((AbstractC38974b) getDepend()).mo142644h();
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m153787c(View view) {
        ((AbstractC38974b) getDepend()).mo142643g();
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142627a(int i) {
        this.f100135a.f100148i.setText(C39093c.m154344a(i));
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: b */
    public void mo142630b(int i) {
        this.f100135a.f100144e.setSecondaryProgress(i);
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142626a(float f) {
        if (((double) f) == 1.0d) {
            this.f100135a.f100145f.setText(R.string.tools_beisu);
            return;
        }
        TextView textView = this.f100135a.f100145f;
        textView.setText(f + "X");
    }

    /* renamed from: com.ss.android.lark.inno.player.c.b.a.e.c$a */
    public static class C38979a {

        /* renamed from: a */
        public ImageView f100140a;

        /* renamed from: b */
        public TextView f100141b;

        /* renamed from: c */
        public TextView f100142c;

        /* renamed from: d */
        public ImageView f100143d;

        /* renamed from: e */
        public VcSeekBar f100144e;

        /* renamed from: f */
        public TextView f100145f;

        /* renamed from: g */
        public TextView f100146g;

        /* renamed from: h */
        public VcTitleBar f100147h;

        /* renamed from: i */
        public TextView f100148i;

        public C38979a(View view) {
            this.f100140a = (ImageView) view.findViewById(R.id.video_play);
            this.f100141b = (TextView) view.findViewById(R.id.video_position);
            this.f100142c = (TextView) view.findViewById(R.id.video_duration);
            this.f100143d = (ImageView) view.findViewById(R.id.video_expand);
            this.f100144e = (VcSeekBar) view.findViewById(R.id.video_seekbar);
            this.f100145f = (TextView) view.findViewById(R.id.video_speed);
            this.f100146g = (TextView) view.findViewById(R.id.video_progress_tip);
            this.f100147h = (VcTitleBar) view.findViewById(R.id.video_title_bar);
            this.f100148i = (TextView) view.findViewById(R.id.video_resolution);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m153788d(View view) {
        if (((AbstractC38974b) getDepend()).mo142639c()) {
            ((AbstractC38974b) getDepend()).mo142638b();
            this.f100135a.f100140a.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_play_filled, ContextCompat.getColor(getContext(), R.color.static_white)));
            return;
        }
        ((AbstractC38974b) getDepend()).mo142634a();
        this.f100135a.f100140a.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_pause_livestream_outlined, ContextCompat.getColor(getContext(), R.color.static_white)));
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: b */
    public void mo142631b(boolean z) {
        this.f100136b.mo142962b(z);
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142629a(boolean z) {
        if (z) {
            this.f100135a.f100140a.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_pause_livestream_outlined, ContextCompat.getColor(getContext(), R.color.static_white)));
        } else {
            this.f100135a.f100140a.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_play_filled, ContextCompat.getColor(getContext(), R.color.static_white)));
        }
    }

    /* renamed from: b */
    private String m153785b(int i, int i2) {
        return VcTimeUtils.m154338a(VcTimeUtils.Scene.Video, (long) i) + "/" + VcTimeUtils.m154338a(VcTimeUtils.Scene.Video, (long) i2);
    }

    /* renamed from: a */
    public void mo142648a(int i, int i2) {
        if (this.f100135a.f100144e.f100329a) {
            ((AbstractC38974b) getDepend()).mo142646j();
            this.f100135a.f100146g.setVisibility(0);
            this.f100135a.f100146g.setText(m153785b(i, i2));
        }
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142628a(int i, int i2, boolean z) {
        if (!this.f100135a.f100144e.f100329a || z) {
            this.f100135a.f100144e.setProgress(i);
            this.f100135a.f100144e.setMax(i2);
            this.f100135a.f100141b.setText(VcTimeUtils.m154338a(VcTimeUtils.Scene.Live, (long) i));
            TextView textView = this.f100135a.f100142c;
            textView.setText("/" + VcTimeUtils.m154338a(VcTimeUtils.Scene.Live, (long) i2));
        }
    }
}
