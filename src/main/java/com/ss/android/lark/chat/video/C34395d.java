package com.ss.android.lark.chat.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.transition.C1556v;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.player.entity.C52129a;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;
import com.ss.android.lark.player.p2513c.AbstractC52112m;
import com.ss.android.lark.player.p2515d.AbstractC52127b;

/* renamed from: com.ss.android.lark.chat.video.d */
public class C34395d extends AbstractView$OnAttachStateChangeListenerC52070a implements AbstractC52112m, AbstractC52127b {

    /* renamed from: a */
    public AbstractC52127b.AbstractC52128a f88806a;

    /* renamed from: b */
    public View f88807b;

    /* renamed from: c */
    public View f88808c;

    /* renamed from: d */
    public SeekBar f88809d;

    /* renamed from: e */
    public int f88810e = -1;

    /* renamed from: f */
    public View.OnClickListener f88811f;

    /* renamed from: g */
    private final Image f88812g;

    /* renamed from: h */
    private ViewGroup f88813h;

    /* renamed from: i */
    private View f88814i;

    /* renamed from: j */
    private ImageView f88815j;

    /* renamed from: k */
    private View f88816k;

    /* renamed from: l */
    private View f88817l;

    /* renamed from: m */
    private ImageView f88818m;

    /* renamed from: n */
    private TextView f88819n;

    /* renamed from: o */
    private TextView f88820o;

    /* renamed from: p */
    private ObjectAnimator f88821p;

    /* renamed from: q */
    private ObjectAnimator f88822q;

    /* renamed from: r */
    private int f88823r;

    /* renamed from: s */
    private boolean f88824s = true;

    /* renamed from: t */
    private AbstractC34405a f88825t;

    /* renamed from: u */
    private Handler f88826u = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.lark.chat.video.C34395d.HandlerC343961 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 101) {
                C34395d.this.mo127023b(false);
            }
        }
    };

    /* renamed from: v */
    private Runnable f88827v = new Runnable() {
        /* class com.ss.android.lark.chat.video.C34395d.RunnableC343972 */

        public void run() {
            if (C34395d.this.f88810e >= 0) {
                Bundle a = C52129a.m202238a();
                a.putInt("int_data", C34395d.this.f88810e);
                C34395d.this.mo178427c(a);
            }
        }
    };

    /* renamed from: w */
    private SeekBar.OnSeekBarChangeListener f88828w = new SeekBar.OnSeekBarChangeListener() {
        /* class com.ss.android.lark.chat.video.C34395d.C343983 */

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C34395d.this.mo127011a(seekBar.getProgress());
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C34395d.this.mo127012a(i, seekBar.getMax());
            }
        }
    };

    /* renamed from: com.ss.android.lark.chat.video.d$a */
    public interface AbstractC34405a {
        /* renamed from: a */
        void mo127006a();
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: a */
    public void mo127016a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: c */
    public void mo127026c(MotionEvent motionEvent) {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: d */
    public void mo127027d() {
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: d */
    public void mo127028d(MotionEvent motionEvent) {
    }

    /* renamed from: a */
    public void mo127019a(boolean z) {
        UIUtils.display(this.f88807b, z);
        UIUtils.display(this.f88808c, z);
    }

    /* renamed from: o */
    private void m133378o() {
        this.f88826u.removeMessages(101);
    }

    /* renamed from: n */
    private void m133377n() {
        m133378o();
        this.f88826u.sendEmptyMessageDelayed(101, 5000);
    }

    /* renamed from: q */
    private void m133380q() {
        this.f88808c.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.chat.video.C34395d.View$OnTouchListenerC344027 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                float f;
                Rect rect = new Rect();
                C34395d.this.f88809d.getHitRect(rect);
                if (motionEvent.getY() < ((float) (rect.top - 500)) || motionEvent.getY() > ((float) (rect.bottom + ParticipantRepo.f117150c))) {
                    return false;
                }
                float height = (float) (rect.top + (rect.height() / 2));
                float x = motionEvent.getX() - ((float) rect.left);
                if (x < BitmapDescriptorFactory.HUE_RED) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else if (x > ((float) rect.width())) {
                    f = (float) rect.width();
                } else {
                    f = x;
                }
                return C34395d.this.f88809d.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState()));
            }
        });
    }

    /* renamed from: u */
    private void m133384u() {
        if (m133385v()) {
            mo127023b(false);
        } else {
            mo127023b(true);
        }
    }

    /* renamed from: v */
    private boolean m133385v() {
        if (this.f88808c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
        mo178429e();
        m133381r();
        m133379p();
        m133376m();
    }

    /* renamed from: s */
    private void m133382s() {
        ObjectAnimator objectAnimator = this.f88822q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f88822q.removeAllListeners();
            this.f88822q.removeAllUpdateListeners();
        }
    }

    /* renamed from: t */
    private void m133383t() {
        ObjectAnimator objectAnimator = this.f88821p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f88821p.removeAllListeners();
            this.f88821p.removeAllUpdateListeners();
        }
    }

    public void aw_() {
        mo178428d((Bundle) null);
        mo127023b(true);
        mo127012a(0, this.f88809d.getMax());
        m133371c(true);
        UIUtils.display(this.f88814i, true);
        UIUtils.display(this.f88815j, true);
    }

    /* renamed from: c */
    public void mo127024c() {
        boolean isSelected = this.f88818m.isSelected();
        if (isSelected) {
            AbstractC34405a aVar = this.f88825t;
            if (aVar != null) {
                aVar.mo127006a();
            }
        } else {
            mo178424a((Bundle) null);
        }
        m133371c(!isSelected);
    }

    /* renamed from: m */
    private void m133376m() {
        if (this.f88812g != null) {
            ImageLoader.with(mo178442k()).load(new C38824b(this.f88812g.getKey())).error(R.drawable.__picker_ic_broken_image_black_48dp).into(this.f88815j);
        }
    }

    /* renamed from: p */
    private void m133379p() {
        this.f88816k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chat.video.C34395d.View$OnClickListenerC343994 */

            public void onClick(View view) {
                if (C34395d.this.f88806a != null) {
                    C34395d.this.f88806a.mo178549a();
                }
            }
        });
        View$OnClickListenerC344005 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.chat.video.C34395d.View$OnClickListenerC344005 */

            public void onClick(View view) {
                C34395d.this.mo127024c();
            }
        };
        this.f88818m.setOnClickListener(r0);
        this.f88814i.setOnClickListener(r0);
        this.f88817l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chat.video.C34395d.View$OnClickListenerC344016 */

            public void onClick(View view) {
                if (C34395d.this.f88811f != null) {
                    C34395d.this.f88811f.onClick(view);
                }
            }
        });
        this.f88809d.setOnSeekBarChangeListener(this.f88828w);
        m133380q();
    }

    /* renamed from: r */
    private void m133381r() {
        this.f88814i = this.f88813h.findViewById(R.id.play_label);
        this.f88815j = (ImageView) this.f88813h.findViewById(R.id.video_cover);
        this.f88807b = this.f88813h.findViewById(R.id.controller_top_layout);
        this.f88817l = this.f88813h.findViewById(R.id.ctrl_close);
        this.f88808c = this.f88813h.findViewById(R.id.controller_bottom_layout);
        this.f88818m = (ImageView) this.f88813h.findViewById(R.id.video_operator);
        this.f88819n = (TextView) this.f88813h.findViewById(R.id.current_play_time);
        this.f88820o = (TextView) this.f88813h.findViewById(R.id.video_duration);
        this.f88809d = (SeekBar) this.f88813h.findViewById(R.id.video_seek);
        View findViewById = this.f88813h.findViewById(R.id.video_menu);
        this.f88816k = findViewById;
        findViewById.setVisibility(8);
        m133371c(true);
        this.f88819n.setText(C26279i.m95149a(0));
        this.f88820o.setText(C26279i.m95149a(0));
        mo127019a(false);
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: a */
    public void mo127015a(MotionEvent motionEvent) {
        m133384u();
    }

    /* renamed from: c */
    private void m133371c(boolean z) {
        this.f88818m.setSelected(z);
    }

    /* renamed from: e */
    private void m133374e(int i) {
        this.f88809d.setSecondaryProgress(i);
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: b */
    public void mo127022b(MotionEvent motionEvent) {
        AbstractC52127b.AbstractC52128a aVar = this.f88806a;
        if (aVar != null) {
            aVar.mo178549a();
        }
    }

    /* renamed from: c */
    private void m133370c(int i) {
        this.f88819n.setText(C26279i.m95149a(i));
    }

    /* renamed from: d */
    private void m133372d(int i) {
        this.f88820o.setText(C26279i.m95149a(i));
    }

    /* renamed from: b */
    public void mo127023b(boolean z) {
        if (z) {
            m133377n();
        } else {
            m133378o();
        }
        m133373d(z);
        m133375e(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.online_controller_cover, (ViewGroup) null);
        this.f88813h = viewGroup;
        return viewGroup;
    }

    /* renamed from: d */
    private void m133373d(final boolean z) {
        float f;
        this.f88807b.clearAnimation();
        m133382s();
        View view = this.f88807b;
        float[] fArr = new float[2];
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", fArr).setDuration(300L);
        this.f88822q = duration;
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.chat.video.C34395d.C344038 */

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (z) {
                    C34395d.this.f88807b.setVisibility(0);
                }
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!z) {
                    C34395d.this.f88807b.setVisibility(8);
                }
            }
        });
        this.f88822q.start();
    }

    /* renamed from: a */
    public void mo127011a(int i) {
        this.f88824s = false;
        this.f88810e = i;
        this.f88826u.removeCallbacks(this.f88827v);
        this.f88826u.postDelayed(this.f88827v, 300);
    }

    /* renamed from: e */
    private void m133375e(final boolean z) {
        float f;
        this.f88808c.clearAnimation();
        m133383t();
        View view = this.f88808c;
        float[] fArr = new float[2];
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", fArr).setDuration(300L);
        this.f88821p = duration;
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.chat.video.C34395d.C344049 */

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (z) {
                    C34395d.this.f88808c.setVisibility(0);
                }
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!z) {
                    C34395d.this.f88808c.setVisibility(8);
                }
            }
        });
        this.f88821p.start();
        if (z) {
            mo178429e();
        } else {
            mo178430f();
        }
    }

    /* renamed from: a */
    public void mo127017a(View.OnClickListener onClickListener) {
        this.f88811f = onClickListener;
    }

    /* renamed from: a */
    public void mo127018a(AbstractC34405a aVar) {
        this.f88825t = aVar;
    }

    /* renamed from: b */
    private void m133369b(int i, int i2) {
        this.f88809d.setMax(i2);
        this.f88809d.setProgress(i);
        m133374e((int) (((((float) this.f88823r) * 1.0f) / 100.0f) * ((float) i2)));
    }

    public C34395d(Context context, Image image) {
        super(context);
        this.f88812g = image;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: b */
    public void mo127021b(int i, Bundle bundle) {
        switch (i) {
            case -66018:
                mo178425b(0);
                mo127023b(true);
                return;
            case -66017:
                mo127023b(false);
                UIUtils.display(this.f88814i, false);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: c */
    public void mo127025c(int i, Bundle bundle) {
        Log.m165382e("play video eventCode: " + i);
        mo127019a(false);
    }

    /* renamed from: a */
    public void mo127012a(int i, int i2) {
        m133369b(i, i2);
        m133370c(i);
        m133372d(i2);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        switch (i) {
            case -99031:
                int i2 = bundle.getInt("int_data");
                if (i2 == 4) {
                    m133371c(true);
                    return;
                } else if (i2 == 3) {
                    m133371c(false);
                    UIUtils.display(this.f88814i, false);
                    return;
                } else {
                    return;
                }
            case -99016:
                int max = this.f88809d.getMax();
                aw_();
                mo127012a(max, max);
                return;
            case -99015:
                C1556v.m7130a(this.f88813h);
                this.f88815j.setVisibility(8);
                C1556v.m7132b(this.f88813h);
                this.f88824s = true;
                return;
            case -99014:
                this.f88824s = true;
                return;
            case -99010:
                UIUtils.display(this.f88814i, false);
                return;
            case -99004:
                m133373d(false);
                m133375e(false);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52112m
    /* renamed from: a */
    public void mo127013a(int i, int i2, int i3) {
        if (this.f88824s) {
            this.f88823r = i3;
            mo127012a(i, i2);
        }
    }
}
