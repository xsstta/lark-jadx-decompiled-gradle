package com.ss.android.lark.mm.module.player.core.layer.p2320k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.core.layer.common.MmVideoLayerCommonViewHolder;
import com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a;
import com.ss.android.lark.mm.module.player.core.layer.p2320k.View$OnClickListenerC46676d;
import com.ss.android.lark.mm.module.player.core.layer.p2321l.C46681a;
import com.ss.android.lark.mm.module.player.p2308a.C46589b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.FormatUtil;
import com.ss.android.lark.mm.utils.MmTimeUtils;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.k.d */
public class View$OnClickListenerC46676d extends RelativeLayout implements View.OnClickListener, AbstractC46669a.AbstractC46670a {

    /* renamed from: a */
    public boolean f117386a;

    /* renamed from: b */
    C46680b f117387b;

    /* renamed from: c */
    View$OnClickListenerC46678a f117388c;

    /* renamed from: d */
    public AbstractC46669a.AbstractC46671b f117389d;

    /* renamed from: e */
    public int f117390e;

    /* renamed from: f */
    private ImageView f117391f;

    /* renamed from: g */
    private Animator f117392g;

    /* renamed from: h */
    private Animator f117393h;

    /* renamed from: i */
    private int f117394i;

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: a */
    public void mo163898a(int i) {
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: b */
    public void mo163903b() {
    }

    public Context getViewContext() {
        return getContext();
    }

    /* renamed from: i */
    private void m184636i() {
        UIUtils.setViewVisibility(this, 0);
        getShowAnimator().start();
    }

    /* renamed from: j */
    private void m184637j() {
        if (getVisibility() == 0) {
            getDismissAnimator().start();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: d */
    public void mo163907d() {
        this.f117387b.f117412b.mo163805a();
        m184633f();
    }

    /* renamed from: g */
    private void m184634g() {
        UIUtils.setViewVisibility(this.f117391f, 0);
        this.f117387b.f117411a.setVisibility(0);
        this.f117388c.f117396a.setVisibility(4);
    }

    /* renamed from: h */
    private void m184635h() {
        UIUtils.setViewVisibility(this.f117391f, 0);
        this.f117388c.f117396a.setVisibility(0);
        this.f117387b.f117411a.setVisibility(4);
        mo163905c();
        m184633f();
    }

    /* renamed from: f */
    private void m184633f() {
        if (this.f117389d.mo163918j().mo163726b().mo163829e()) {
            this.f117388c.f117402g.setImageResource(R.drawable.mm_player_subtitle_on);
        } else {
            this.f117388c.f117402g.setImageResource(R.drawable.mm_player_subtitle_off);
        }
    }

    private Animator getDismissAnimator() {
        if (this.f117393h == null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(160L);
            this.f117393h = duration;
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.lark.mm.module.player.core.layer.p2320k.View$OnClickListenerC46676d.C466771 */

                public void onAnimationEnd(Animator animator) {
                    UIUtils.setViewVisibility(View$OnClickListenerC46676d.this, 8);
                }
            });
        }
        return this.f117393h;
    }

    private Animator getShowAnimator() {
        if (this.f117392g == null) {
            this.f117392g = ObjectAnimator.ofFloat(this, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(160L);
        }
        return this.f117392g;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: a */
    public void mo163896a() {
        boolean z;
        int i;
        int i2;
        AbstractC46669a.AbstractC46671b bVar = this.f117389d;
        if (bVar != null) {
            z = bVar.mo163915g();
        } else {
            z = false;
        }
        ImageView imageView = this.f117391f;
        if (imageView != null) {
            if (z) {
                i2 = R.drawable.mm_player_half_stop;
            } else {
                i2 = R.drawable.mm_player_half_play;
            }
            imageView.setImageResource(i2);
        }
        if (this.f117389d != null) {
            ImageView imageView2 = this.f117388c.f117403h;
            if (z) {
                i = R.drawable.mm_player_full_pause;
            } else {
                i = R.drawable.mm_player_full_play;
            }
            imageView2.setImageResource(i);
        }
    }

    /* renamed from: e */
    private void m184632e() {
        inflate(getContext(), R.layout.mm_toolbar_layer_layout, this);
        this.f117387b = new C46680b(this);
        View$OnClickListenerC46678a aVar = new View$OnClickListenerC46678a(this);
        this.f117388c = aVar;
        aVar.mo163930a(this);
        this.f117388c.f117401f.setProgress(0);
        ImageView imageView = (ImageView) findViewById(R.id.play_btn);
        this.f117391f = imageView;
        C46681a.m184654a(imageView, (int) UIUtils.dip2Px(getContext(), 15.0f));
        this.f117391f.setOnClickListener(this);
        setVisibility(8);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: c */
    public void mo163905c() {
        int e = this.f117389d.mo163913e();
        if (e == -1) {
            e = 100;
        }
        this.f117388c.f117404i.setTextColor(Color.parseColor("#FFFFFF"));
        if (e == 100) {
            this.f117388c.f117404i.setText(getContext().getText(R.string.MMWeb_G_Speed));
            return;
        }
        TextView textView = this.f117388c.f117404i;
        textView.setText(FormatUtil.f118607a.mo165482a(((float) e) / 100.0f) + "X");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mm.module.player.core.layer.k.d$a */
    public class View$OnClickListenerC46678a implements View.OnClickListener {

        /* renamed from: a */
        public View f117396a;

        /* renamed from: b */
        public View f117397b;

        /* renamed from: c */
        public TextView f117398c;

        /* renamed from: d */
        public View f117399d;

        /* renamed from: e */
        public View f117400e;

        /* renamed from: f */
        public SeekBar f117401f;

        /* renamed from: g */
        public ImageView f117402g;

        /* renamed from: h */
        public ImageView f117403h;

        /* renamed from: i */
        public TextView f117404i;

        /* renamed from: j */
        public TextView f117405j;

        /* renamed from: k */
        public TextView f117406k;

        /* renamed from: m */
        private View.OnClickListener f117408m;

        /* renamed from: a */
        public void mo163930a(View.OnClickListener onClickListener) {
            this.f117408m = onClickListener;
        }

        public void onClick(View view) {
            if (view.equals(this.f117400e) || view.equals(this.f117399d)) {
                if (view.equals(this.f117400e)) {
                    C45855f.m181664c("MmToolbarLayout", "click back");
                    C47083e.m186423a(this.f117400e.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("zoom_out").mo165420c("shrink").mo165421c());
                    C47083e.m186423a(this.f117400e.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("zoom_out").mo165423e("none").mo165424f("shrink").mo165421c());
                } else if (view.equals(this.f117399d)) {
                    C45855f.m181664c("MmToolbarLayout", "click topBack");
                    C47083e.m186423a(this.f117399d.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("zoom_out").mo165420c("back").mo165421c());
                    C47083e.m186423a(this.f117399d.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("zoom_out").mo165423e("none").mo165424f("back").mo165421c());
                }
                if (View$OnClickListenerC46676d.this.f117389d != null) {
                    C45855f.m181664c("MmToolbarLayout", "toggleExitFullScreen");
                    View$OnClickListenerC46676d.this.f117389d.mo163912d();
                }
            } else if (view.equals(this.f117402g)) {
                boolean z = !View$OnClickListenerC46676d.this.f117389d.mo163918j().mo163726b().mo163829e();
                View$OnClickListenerC46676d.this.f117389d.mo163918j().mo163726b().mo163825a(z);
                C45855f.m181664c("MmToolbarLayout", "toggle subtitle");
                C47083e.m186423a(View$OnClickListenerC46676d.this.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165415a(z).mo165409a("show_subtitles").mo165421c());
                C47083e.m186423a(View$OnClickListenerC46676d.this.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("show_subtitles").mo165416b().mo165419b(z).mo165413a("is_full_screen", "true").mo165421c());
                if (z) {
                    this.f117402g.setImageResource(R.drawable.mm_player_subtitle_on);
                } else {
                    this.f117402g.setImageResource(R.drawable.mm_player_subtitle_off);
                }
                if (View$OnClickListenerC46676d.this.f117389d != null) {
                    View$OnClickListenerC46676d.this.f117389d.mo163911c(z);
                }
            } else if (view.equals(this.f117404i)) {
                if (View$OnClickListenerC46676d.this.f117389d != null) {
                    C45855f.m181664c("MmToolbarLayout", "toggle chooseSpeed");
                    View$OnClickListenerC46676d.this.f117389d.mo163914f();
                }
            } else if (view.equals(this.f117403h) && View$OnClickListenerC46676d.this.f117389d != null) {
                if (View$OnClickListenerC46676d.this.f117389d.mo163915g()) {
                    C47083e.m186423a(View$OnClickListenerC46676d.this.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("video_pause").mo165423e("none").mo165424f("player_view").mo165421c());
                } else {
                    C47083e.m186423a(View$OnClickListenerC46676d.this.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("video_play").mo165423e("none").mo165424f("player_view").mo165421c());
                }
                C45855f.m181664c("MmToolbarLayout", "toggle PlayOrPause");
                View$OnClickListenerC46676d.this.f117389d.mo163909a();
            }
            View.OnClickListener onClickListener = this.f117408m;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ boolean m184651a(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !this.f117396a.isShown()) {
                return false;
            }
            View$OnClickListenerC46676d.this.f117389d.mo163916h();
            return false;
        }

        public View$OnClickListenerC46678a(View view) {
            this.f117396a = view.findViewById(R.id.player_full_holder);
            this.f117399d = view.findViewById(R.id.player_full_back_btn);
            this.f117397b = view.findViewById(R.id.player_full_top);
            this.f117398c = (TextView) view.findViewById(R.id.player_full_title);
            this.f117400e = view.findViewById(R.id.player_zoom_out);
            this.f117401f = (SeekBar) view.findViewById(R.id.player_full_seekbar);
            this.f117402g = (ImageView) view.findViewById(R.id.player_full_subtitle);
            this.f117404i = (TextView) view.findViewById(R.id.player_full_speed);
            this.f117405j = (TextView) view.findViewById(R.id.player_full_pos);
            this.f117406k = (TextView) view.findViewById(R.id.player_full_dur);
            this.f117403h = (ImageView) view.findViewById(R.id.player_full_play);
            this.f117400e.setOnClickListener(this);
            this.f117399d.setOnClickListener(this);
            this.f117402g.setOnClickListener(this);
            this.f117404i.setOnClickListener(this);
            this.f117403h.setOnClickListener(this);
            if (View$OnClickListenerC46676d.this.f117389d.mo163918j().mo163726b().mo163821a().mo163833b()) {
                this.f117402g.setVisibility(0);
            } else {
                this.f117402g.setVisibility(8);
            }
            this.f117401f.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(View$OnClickListenerC46676d.this) {
                /* class com.ss.android.lark.mm.module.player.core.layer.p2320k.View$OnClickListenerC46676d.View$OnClickListenerC46678a.C466791 */

                public void onStartTrackingTouch(SeekBar seekBar) {
                    View$OnClickListenerC46676d.this.f117386a = true;
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                    C47083e.m186423a(View$OnClickListenerC46676d.this.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("progress_bar_change").mo165423e("none").mo165424f("player").mo165421c());
                    C47083e.m186423a(View$OnClickListenerC46676d.this.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("progress_bar_change").mo165423e("none").mo165414a("is_full_screen", true).mo165412a("rate_of_video_progress", Float.valueOf((((float) seekBar.getProgress()) * 1.0f) / ((float) seekBar.getMax()))).mo165421c());
                    View$OnClickListenerC46676d.this.f117386a = false;
                    if (View$OnClickListenerC46676d.this.f117389d != null) {
                        View$OnClickListenerC46676d.this.f117389d.mo163910a((long) seekBar.getProgress());
                    }
                }

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    int i2 = i / 1000;
                    if (i2 != View$OnClickListenerC46676d.this.f117390e) {
                        View$OnClickListenerC46678a.this.f117405j.setText(MmTimeUtils.m186494a((long) seekBar.getProgress(), MmTimeUtils.m186496b((long) seekBar.getMax())));
                        View$OnClickListenerC46676d.this.f117390e = i2;
                    }
                }
            });
            this.f117398c.setText(View$OnClickListenerC46676d.this.f117389d.mo163918j().mo163726b().mo163828d());
            if (View$OnClickListenerC46676d.this.f117389d.mo163918j().mo163726b().mo163827c() > 0) {
                int c = (int) View$OnClickListenerC46676d.this.f117389d.mo163918j().mo163726b().mo163827c();
                this.f117401f.setMax(c);
                this.f117406k.setText(MmTimeUtils.m186493a((long) c));
            }
            this.f117397b.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.mm.module.player.core.layer.p2320k.$$Lambda$d$a$3A0p3j__KWmiM3VIa3b5eRrAX0k */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return View$OnClickListenerC46676d.View$OnClickListenerC46678a.this.m184651a(view, motionEvent);
                }
            });
            C46589b.m184219a(this.f117401f);
        }
    }

    public void setCallback(AbstractC46669a.AbstractC46671b bVar) {
        this.f117389d = bVar;
    }

    public View$OnClickListenerC46676d(Context context) {
        super(context);
        m184632e();
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: a */
    public void mo163897a(float f) {
        this.f117387b.f117412b.mo163806a(f);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: c */
    public void mo163906c(boolean z) {
        this.f117387b.f117412b.mo163812b(z);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: d */
    public void mo163908d(boolean z) {
        this.f117387b.f117412b.mo163814c(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mm.module.player.core.layer.k.d$b */
    public class C46680b {

        /* renamed from: a */
        public View f117411a;

        /* renamed from: b */
        public MmVideoLayerCommonViewHolder f117412b;

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m184653a(View view) {
            if (this.f117411a.isShown()) {
                View$OnClickListenerC46676d.this.f117389d.mo163917i();
            }
        }

        public C46680b(View view) {
            View findViewById = view.findViewById(R.id.player_half_holder);
            this.f117411a = findViewById;
            findViewById.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mm.module.player.core.layer.p2320k.$$Lambda$d$b$qBJ5rHpLjYns7QtmCdtT7qqShzg */

                public final void onClick(View view) {
                    View$OnClickListenerC46676d.C46680b.this.m184653a(view);
                }
            });
            this.f117412b = new MmVideoLayerCommonViewHolder(view, View$OnClickListenerC46676d.this.f117389d.mo163919k(), View$OnClickListenerC46676d.this.f117389d.mo163918j());
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: a */
    public void mo163901a(HightlightTimeLine hightlightTimeLine) {
        this.f117387b.f117412b.mo163809a(hightlightTimeLine);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: a */
    public void mo163899a(long j) {
        C45855f.m181663b("MmToolbarLayout", "updateSeekBar  " + j);
        this.f117388c.f117401f.setMax((int) j);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: b */
    public void mo163904b(boolean z) {
        C45855f.m181663b("MmToolbarLayout", "switchScreenState " + z);
        if (z) {
            m184635h();
        } else {
            m184634g();
        }
    }

    public void onClick(View view) {
        AbstractC46669a.AbstractC46671b bVar;
        if (view.getId() == R.id.play_btn && (bVar = this.f117389d) != null) {
            if (bVar.mo163915g()) {
                C47083e.m186423a(getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("video_pause").mo165423e("none").mo165424f("player").mo165421c());
            } else {
                C47083e.m186423a(getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("video_play").mo165423e("none").mo165424f("player").mo165421c());
            }
            C45855f.m181664c("MmToolbarLayout", "togglePlayOrPause, isPlaying: " + this.f117389d.mo163915g());
            this.f117389d.mo163909a();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: a */
    public void mo163902a(boolean z) {
        if (z) {
            mo163896a();
        }
        if (z) {
            m184636i();
        } else {
            m184637j();
        }
    }

    public View$OnClickListenerC46676d(Context context, AbstractC46669a.AbstractC46671b bVar) {
        super(context);
        this.f117389d = bVar;
        m184632e();
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2320k.AbstractC46669a.AbstractC46670a
    /* renamed from: a */
    public void mo163900a(long j, long j2) {
        int i = (int) (j / 1000);
        if (i != this.f117394i) {
            this.f117387b.f117412b.mo163807a(j2);
            if (!this.f117386a) {
                this.f117387b.f117412b.mo163808a(j, j2);
            }
            this.f117388c.f117406k.setText(MmTimeUtils.m186493a(j2));
            if (!this.f117386a) {
                this.f117388c.f117405j.setText(MmTimeUtils.m186494a(j, MmTimeUtils.m186496b(j2)));
                this.f117388c.f117401f.setProgress((int) j);
            }
            if (this.f117389d.mo163918j().mo163726b().mo163821a().mo163833b()) {
                this.f117388c.f117402g.setVisibility(0);
            }
            this.f117394i = i;
        }
    }
}
