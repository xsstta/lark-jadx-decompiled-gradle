package com.tt.miniapp.video.p3341d.p3344c.p3347c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67024ac;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapp.video.p3340c.C67091c;
import com.tt.miniapphost.util.C67590h;

/* renamed from: com.tt.miniapp.video.d.c.c.c */
public class View$OnClickListenerC67115c extends AbstractC67113a implements View.OnClickListener {

    /* renamed from: d */
    public TextView f169185d;

    /* renamed from: e */
    public AbstractC67117a f169186e;

    /* renamed from: f */
    public int f169187f;

    /* renamed from: g */
    private SeekBar f169188g;

    /* renamed from: h */
    private TextView f169189h;

    /* renamed from: i */
    private ImageView f169190i;

    /* renamed from: j */
    private ImageView f169191j;

    /* renamed from: k */
    private ImageView f169192k;

    /* renamed from: l */
    private View f169193l;

    /* renamed from: m */
    private View f169194m;

    /* renamed from: n */
    private boolean f169195n;

    /* renamed from: o */
    private boolean f169196o;

    /* renamed from: p */
    private boolean f169197p;

    /* renamed from: q */
    private boolean f169198q;

    /* renamed from: r */
    private IAppContext f169199r;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.video.d.c.c.c$a */
    public interface AbstractC67117a {
        /* renamed from: a */
        void mo233368a();

        /* renamed from: a */
        void mo233369a(int i, int i2);

        /* renamed from: a */
        void mo233370a(int i, boolean z);

        /* renamed from: a */
        void mo233371a(boolean z);

        /* renamed from: b */
        void mo233372b();

        /* renamed from: b */
        void mo233373b(boolean z);
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: a */
    public int mo233344a() {
        return R.layout.microapp_m_plugin_bottom_toolbar;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: b */
    public int mo233347b() {
        return R.id.microapp_m_video_bottom_layout;
    }

    /* renamed from: d */
    public int mo233359d() {
        return this.f169187f;
    }

    /* renamed from: e */
    private int m261641e() {
        if (this.f169195n) {
            return R.drawable.microapp_m_material_bottom_pause;
        }
        if (this.f169197p) {
            return R.drawable.microapp_m_material_bottom_replay;
        }
        return R.drawable.microapp_m_material_bottom_play;
    }

    /* renamed from: f */
    private void m261642f() {
        int i;
        ImageView imageView = this.f169190i;
        if (imageView != null) {
            if (this.f169198q) {
                i = R.drawable.microapp_m_material_fullscreen_exit;
            } else {
                i = R.drawable.microapp_m_material_fullscreen;
            }
            imageView.setImageResource(i);
        }
    }

    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: c */
    public void mo233349c() {
        SeekBar seekBar = this.f169188g;
        if (seekBar != null) {
            seekBar.setProgress(0);
            this.f169188g.setSecondaryProgress(0);
        }
        TextView textView = this.f169185d;
        if (textView != null) {
            textView.setText(C67024ac.m261233a(0));
        }
        mo233355a(false, false);
        mo233362f(false);
    }

    public View$OnClickListenerC67115c(IAppContext iAppContext) {
        this.f169199r = iAppContext;
    }

    /* renamed from: a */
    public void mo233354a(AbstractC67117a aVar) {
        this.f169186e = aVar;
    }

    /* renamed from: b */
    public void mo233356b(int i) {
        SeekBar seekBar = this.f169188g;
        if (seekBar != null) {
            seekBar.setSecondaryProgress(i);
        }
    }

    /* renamed from: g */
    public void mo233363g(boolean z) {
        this.f169198q = z;
        m261642f();
    }

    /* renamed from: a */
    public void mo233352a(int i) {
        this.f169187f = i;
        TextView textView = this.f169189h;
        if (textView != null) {
            textView.setText(C67024ac.m261233a(i));
        }
    }

    /* renamed from: c */
    public boolean mo233358c(int i) {
        SeekBar seekBar = this.f169188g;
        if (seekBar == null || i <= seekBar.getSecondaryProgress()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void mo233360d(boolean z) {
        int i;
        ImageView imageView = this.f169192k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C67590h.m263079a(imageView, i);
    }

    /* renamed from: c */
    public void mo233357c(boolean z) {
        int i;
        ImageView imageView = this.f169191j;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C67590h.m263079a(imageView, i);
        View view = this.f169194m;
        if (z) {
            i2 = 8;
        }
        C67590h.m263079a(view, i2);
    }

    /* renamed from: e */
    public void mo233361e(boolean z) {
        int i;
        ImageView imageView = this.f169190i;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C67590h.m263079a(imageView, i);
        View view = this.f169193l;
        if (z) {
            i2 = 8;
        }
        C67590h.m263079a(view, i2);
    }

    /* renamed from: f */
    public void mo233362f(boolean z) {
        this.f169196o = z;
        ImageView imageView = this.f169192k;
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageResource(R.drawable.microapp_m_material_muted);
        } else {
            imageView.setImageResource(R.drawable.microapp_m_material_unmuted);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.microapp_m_video_full_screen) {
            C67047m.m261304a(this.f169199r.getCurrentActivity());
            AbstractC67117a aVar = this.f169186e;
            if (aVar != null) {
                aVar.mo233368a();
            }
        } else if (view.getId() == R.id.microapp_m_video_bottom_play) {
            AbstractC67117a aVar2 = this.f169186e;
            if (aVar2 != null) {
                aVar2.mo233371a(!this.f169195n);
            }
        } else if (view.getId() == R.id.microapp_m_video_mute && this.f169186e != null) {
            mo233362f(!this.f169196o);
            this.f169186e.mo233373b(this.f169196o);
        }
    }

    /* renamed from: a */
    public void mo233355a(boolean z, boolean z2) {
        this.f169197p = z2;
        this.f169195n = z;
        ImageView imageView = this.f169191j;
        if (imageView != null) {
            imageView.setImageResource(m261641e());
        }
    }

    /* renamed from: a */
    public void mo233353a(int i, int i2) {
        TextView textView = this.f169189h;
        if (textView != null) {
            textView.setText(C67024ac.m261233a(i2));
        }
        TextView textView2 = this.f169185d;
        if (textView2 != null) {
            textView2.setText(C67024ac.m261233a(i));
        }
        SeekBar seekBar = this.f169188g;
        if (seekBar != null) {
            seekBar.setProgress(C67024ac.m261230a(i, i2));
        }
    }

    @Override // com.tt.miniapp.video.p3341d.p3344c.p3347c.AbstractC67113a
    /* renamed from: a */
    public void mo233345a(Context context, ViewGroup viewGroup) {
        super.mo233345a(context, viewGroup);
        if (this.f169181a != null) {
            this.f169191j = (ImageView) this.f169181a.findViewById(R.id.microapp_m_video_bottom_play);
            this.f169194m = this.f169181a.findViewById(R.id.microapp_m_video_bottom_play_stub);
            this.f169185d = (TextView) this.f169181a.findViewById(R.id.microapp_m_video_time_play);
            this.f169188g = (SeekBar) this.f169181a.findViewById(R.id.microapp_m_video_seekbar);
            this.f169189h = (TextView) this.f169181a.findViewById(R.id.microapp_m_video_time_left_time);
            this.f169192k = (ImageView) this.f169181a.findViewById(R.id.microapp_m_video_mute);
            this.f169190i = (ImageView) this.f169181a.findViewById(R.id.microapp_m_video_full_screen);
            this.f169193l = this.f169181a.findViewById(R.id.microapp_m_video_full_screen_stub);
            this.f169190i.setOnClickListener(this);
            this.f169191j.setOnClickListener(this);
            this.f169192k.setOnClickListener(this);
            this.f169188g.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                /* class com.tt.miniapp.video.p3341d.p3344c.p3347c.View$OnClickListenerC67115c.C671161 */

                /* renamed from: b */
                private int f169201b;

                public void onStartTrackingTouch(SeekBar seekBar) {
                    this.f169201b = seekBar.getProgress();
                    if (View$OnClickListenerC67115c.this.f169186e != null) {
                        View$OnClickListenerC67115c.this.f169186e.mo233372b();
                    }
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                    int progress = seekBar.getProgress();
                    boolean c = View$OnClickListenerC67115c.this.mo233358c(progress);
                    if (View$OnClickListenerC67115c.this.f169186e != null) {
                        View$OnClickListenerC67115c.this.f169186e.mo233369a(this.f169201b, progress);
                    }
                    if (View$OnClickListenerC67115c.this.f169186e != null) {
                        View$OnClickListenerC67115c.this.f169186e.mo233370a(progress, c);
                    }
                }

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    if (z) {
                        View$OnClickListenerC67115c.this.f169185d.setText(C67024ac.m261235b(i, View$OnClickListenerC67115c.this.f169187f));
                    }
                    C67091c.m261543a("seekprogress" + i, false);
                }
            });
            m261642f();
        }
    }
}
