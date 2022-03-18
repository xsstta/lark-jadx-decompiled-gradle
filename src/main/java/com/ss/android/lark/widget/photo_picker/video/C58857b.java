package com.ss.android.lark.widget.photo_picker.video;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.transition.C1556v;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.player.entity.C52129a;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;
import com.ss.android.lark.player.p2513c.AbstractC52112m;
import com.ss.android.lark.player.p2515d.AbstractC52127b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.statistics.PerfPhotoViewMonitor;
import com.ss.android.lark.widget.photo_picker.statistics.PerfVideoViewMonitor;

/* renamed from: com.ss.android.lark.widget.photo_picker.video.b */
public class C58857b extends AbstractView$OnAttachStateChangeListenerC52070a implements AbstractC52112m, AbstractC52127b {

    /* renamed from: A */
    private Runnable f145596A = new Runnable() {
        /* class com.ss.android.lark.widget.photo_picker.video.C58857b.RunnableC588614 */

        public void run() {
            if (C58857b.this.f145602e >= 0) {
                Bundle a = C52129a.m202238a();
                a.putInt("int_data", C58857b.this.f145602e);
                C58857b.this.mo178427c(a);
            }
        }
    };

    /* renamed from: B */
    private SeekBar.OnSeekBarChangeListener f145597B = new SeekBar.OnSeekBarChangeListener() {
        /* class com.ss.android.lark.widget.photo_picker.video.C58857b.C588625 */

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C58857b.this.mo199456a(seekBar.getProgress());
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C58857b.this.mo199457a(i, seekBar.getMax());
            }
        }
    };

    /* renamed from: a */
    public AbstractC52127b.AbstractC52128a f145598a;

    /* renamed from: b */
    public View f145599b;

    /* renamed from: c */
    public View f145600c;

    /* renamed from: d */
    public SeekBar f145601d;

    /* renamed from: e */
    public int f145602e = -1;

    /* renamed from: f */
    public OnChatAlbumClickListener f145603f;

    /* renamed from: g */
    public View.OnClickListener f145604g;

    /* renamed from: h */
    private final int f145605h = 101;

    /* renamed from: i */
    private final IRequestCreator f145606i;

    /* renamed from: j */
    private final PhotoItem f145607j;

    /* renamed from: k */
    private ViewGroup f145608k;

    /* renamed from: l */
    private View f145609l;

    /* renamed from: m */
    private ImageView f145610m;

    /* renamed from: n */
    private ImageView f145611n;

    /* renamed from: o */
    private ImageView f145612o;

    /* renamed from: p */
    private View f145613p;

    /* renamed from: q */
    private TextView f145614q;

    /* renamed from: r */
    private TextView f145615r;

    /* renamed from: s */
    private ObjectAnimator f145616s;

    /* renamed from: t */
    private ObjectAnimator f145617t;

    /* renamed from: u */
    private int f145618u;

    /* renamed from: v */
    private String f145619v;

    /* renamed from: w */
    private boolean f145620w = true;

    /* renamed from: x */
    private boolean f145621x;

    /* renamed from: y */
    private AbstractC58867a f145622y;

    /* renamed from: z */
    private Handler f145623z = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.lark.widget.photo_picker.video.C58857b.HandlerC588581 */

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 101) {
                C58857b.this.mo199462b(false);
            }
        }
    };

    /* renamed from: com.ss.android.lark.widget.photo_picker.video.b$a */
    public interface AbstractC58867a {
        /* renamed from: a */
        void mo199113a();
    }

    /* renamed from: a */
    public void mo199455a(float f) {
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

    /* renamed from: n */
    public View mo199465n() {
        return this.f145611n;
    }

    /* renamed from: a */
    public void mo199461a(boolean z) {
        View view = this.f145599b;
        UIUtils.display(view, z && !DesktopUtil.m144301a(view.getContext()));
        UIUtils.display(this.f145600c, z);
    }

    /* renamed from: a */
    public void mo199460a(AbstractC58867a aVar) {
        this.f145622y = aVar;
    }

    /* renamed from: s */
    private void m228329s() {
        m228330t();
        this.f145623z.sendEmptyMessageDelayed(101, 5000);
    }

    /* renamed from: t */
    private void m228330t() {
        Handler handler = this.f145623z;
        if (handler != null) {
            handler.removeMessages(101);
        }
    }

    /* renamed from: v */
    private void m228332v() {
        this.f145600c.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58857b.AnonymousClass11 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                float f;
                Rect rect = new Rect();
                C58857b.this.f145601d.getHitRect(rect);
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
                return C58857b.this.f145601d.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState()));
            }
        });
    }

    /* renamed from: z */
    private boolean m228336z() {
        if (this.f145600c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
        mo178429e();
        m228333w();
        m228331u();
        m228328r();
    }

    /* renamed from: p */
    public void mo199467p() {
        if (m228336z()) {
            mo199462b(false);
        } else {
            mo199462b(true);
        }
    }

    /* renamed from: q */
    public void mo199468q() {
        m228330t();
        Handler handler = this.f145623z;
        if (handler != null) {
            handler.removeCallbacks(this.f145596A);
        }
    }

    /* renamed from: x */
    private void m228334x() {
        ObjectAnimator objectAnimator = this.f145617t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f145617t.removeAllListeners();
            this.f145617t.removeAllUpdateListeners();
        }
    }

    /* renamed from: y */
    private void m228335y() {
        ObjectAnimator objectAnimator = this.f145616s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f145616s.removeAllListeners();
            this.f145616s.removeAllUpdateListeners();
        }
    }

    /* renamed from: c */
    public void mo199463c() {
        this.f145619v = PerfVideoViewMonitor.m228162a(false);
    }

    /* renamed from: m */
    public void mo199464m() {
        mo178428d((Bundle) null);
        mo199462b(true);
        mo199457a(0, this.f145601d.getMax());
        m228323c(true);
        UIUtils.display(this.f145609l, true);
        UIUtils.display(this.f145610m, true);
    }

    /* renamed from: r */
    private void m228328r() {
        this.f145606i.load(new C38824b(this.f145607j.getImageKey())).error(R.drawable.__picker_ic_broken_image_black_48dp).listener(new AbstractC38817h() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58857b.C588636 */

            @Override // com.ss.android.lark.image.api.AbstractC38817h
            /* renamed from: a */
            public boolean mo53861a(Exception exc, Object obj, AbstractC38819j jVar, boolean z) {
                PerfPhotoViewMonitor.f145408a.mo199293a(new ErrorResult(3));
                return false;
            }

            @Override // com.ss.android.lark.image.api.AbstractC38817h
            /* renamed from: a */
            public boolean mo53862a(Object obj, Object obj2, AbstractC38819j jVar, DataSource dataSource, boolean z) {
                PerfPhotoViewMonitor.f145408a.mo199295b(2);
                PerfPhotoViewMonitor.f145408a.mo199293a((ErrorResult) null);
                return false;
            }
        }).into(this.f145610m);
    }

    /* renamed from: u */
    private void m228331u() {
        this.f145611n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58857b.View$OnClickListenerC588647 */

            public void onClick(View view) {
                if (C58857b.this.f145598a != null) {
                    C58857b.this.f145598a.mo178549a();
                }
            }
        });
        this.f145609l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58857b.View$OnClickListenerC588658 */

            public void onClick(View view) {
                C58857b.this.mo199466o();
                C58857b.this.mo199467p();
            }
        });
        this.f145613p.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58857b.View$OnClickListenerC588669 */

            public void onClick(View view) {
                if (C58857b.this.f145604g != null) {
                    C58857b.this.f145604g.onClick(view);
                }
            }
        });
        this.f145601d.setOnSeekBarChangeListener(this.f145597B);
        m228332v();
        this.f145612o.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58857b.AnonymousClass10 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C58857b.this.f145603f != null) {
                    C58857b.this.f145603f.onChatAlbumClicked(C58857b.this.mo178442k());
                }
            }
        });
    }

    /* renamed from: o */
    public void mo199466o() {
        boolean isSelected = this.f145609l.isSelected();
        if (isSelected) {
            AbstractC58867a aVar = this.f145622y;
            if (aVar != null) {
                aVar.mo199113a();
                if (this.f145602e > 0) {
                    PerfVideoViewMonitor.m228162a(true);
                }
            }
        } else {
            mo178424a((Bundle) null);
        }
        m228323c(!isSelected);
    }

    /* renamed from: w */
    private void m228333w() {
        int duration;
        this.f145609l = this.f145608k.findViewById(R.id.play_label);
        this.f145610m = (ImageView) this.f145608k.findViewById(R.id.video_cover);
        this.f145599b = this.f145608k.findViewById(R.id.controller_top_layout);
        this.f145613p = this.f145608k.findViewById(R.id.ctrl_close);
        this.f145600c = this.f145608k.findViewById(R.id.controller_bottom_layout);
        this.f145614q = (TextView) this.f145608k.findViewById(R.id.current_play_time);
        this.f145615r = (TextView) this.f145608k.findViewById(R.id.video_duration);
        this.f145601d = (SeekBar) this.f145608k.findViewById(R.id.video_seek);
        ImageView imageView = (ImageView) this.f145608k.findViewById(R.id.video_menu);
        this.f145611n = imageView;
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(mo178442k(), (int) R.drawable.ud_icon_more_bold_outlined, this.f145608k.getContext().getResources().getColor(R.color.lkui_N00)));
        ImageView imageView2 = (ImageView) this.f145608k.findViewById(R.id.iv_view_chat_image);
        this.f145612o = imageView2;
        if (!this.f145621x || this.f145603f == null) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            this.f145612o.setImageDrawable(UDIconUtils.getIconDrawable(mo178442k(), (int) R.drawable.ud_icon_photo_album_filled, this.f145608k.getContext().getResources().getColor(R.color.lkui_N00)));
        }
        m228323c(true);
        PhotoItem photoItem = this.f145607j;
        if (photoItem != null && photoItem.isVideo() && this.f145607j.getMediaExtra() != null && (duration = (int) this.f145607j.getMediaExtra().getDuration()) > 0) {
            m228321b(0, duration);
        }
        mo199461a(false);
        if (DesktopUtil.m144301a(this.f145599b.getContext())) {
            this.f145599b.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m228323c(boolean z) {
        this.f145609l.setSelected(z);
    }

    /* renamed from: e */
    private void m228326e(int i) {
        this.f145601d.setSecondaryProgress(i);
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: a */
    public void mo127015a(MotionEvent motionEvent) {
        mo199466o();
        mo199467p();
    }

    @Override // com.ss.android.lark.player.p2515d.AbstractC52127b
    /* renamed from: b */
    public void mo127022b(MotionEvent motionEvent) {
        AbstractC52127b.AbstractC52128a aVar = this.f145598a;
        if (aVar != null) {
            aVar.mo178549a();
        }
    }

    /* renamed from: c */
    private void m228322c(int i) {
        this.f145614q.setText(C26279i.m95149a(i));
    }

    /* renamed from: d */
    private void m228324d(int i) {
        this.f145615r.setText(C26279i.m95149a(i));
    }

    /* renamed from: b */
    public void mo199462b(boolean z) {
        if (z) {
            m228329s();
        } else {
            m228330t();
        }
        m228325d(z);
        m228327e(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.online_controller_cover_new, (ViewGroup) null);
        this.f145608k = viewGroup;
        return viewGroup;
    }

    /* renamed from: d */
    private void m228325d(final boolean z) {
        float f;
        this.f145599b.clearAnimation();
        m228334x();
        View view = this.f145599b;
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
        this.f145617t = duration;
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58857b.C588592 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!z) {
                    C58857b.this.f145599b.setVisibility(8);
                }
            }

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (z && !DesktopUtil.m144301a(C58857b.this.f145599b.getContext())) {
                    C58857b.this.f145599b.setVisibility(0);
                }
            }
        });
        this.f145617t.start();
    }

    /* renamed from: a */
    public void mo199456a(int i) {
        this.f145620w = false;
        this.f145602e = i;
        this.f145623z.removeCallbacks(this.f145596A);
        this.f145623z.postDelayed(this.f145596A, 300);
    }

    /* renamed from: e */
    private void m228327e(final boolean z) {
        float f;
        this.f145600c.clearAnimation();
        m228335y();
        View view = this.f145600c;
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
        this.f145616s = duration;
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.widget.photo_picker.video.C58857b.C588603 */

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (z) {
                    C58857b.this.f145600c.setVisibility(0);
                }
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!z) {
                    C58857b.this.f145600c.setVisibility(8);
                }
            }
        });
        this.f145616s.start();
        if (z) {
            mo178429e();
        } else {
            mo178430f();
        }
    }

    /* renamed from: a */
    public void mo199458a(View.OnClickListener onClickListener) {
        this.f145604g = onClickListener;
    }

    /* renamed from: a */
    public void mo199459a(AbstractC52127b.AbstractC52128a aVar) {
        this.f145598a = aVar;
    }

    /* renamed from: b */
    private void m228321b(int i, int i2) {
        this.f145601d.setMax(i2);
        this.f145601d.setProgress(i);
        m228326e((int) (((((float) this.f145618u) * 1.0f) / 100.0f) * ((float) i2)));
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: b */
    public void mo127021b(int i, Bundle bundle) {
        switch (i) {
            case -66018:
                mo178425b(0);
                mo199462b(true);
                UIUtils.display(this.f145609l, true);
                return;
            case -66017:
                mo199462b(false);
                UIUtils.display(this.f145609l, false);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: c */
    public void mo127025c(int i, Bundle bundle) {
        Log.m165382e("play video eventCode: " + i);
        if (i != -88019) {
            mo199464m();
            m228328r();
            return;
        }
        String string = bundle.getString("string_data");
        if (TextUtils.isEmpty(string) || !string.contains("HTTP/1.1 410 Gone")) {
            mo199464m();
            m228328r();
        }
    }

    /* renamed from: a */
    public void mo199457a(int i, int i2) {
        m228321b(i, i2);
        m228322c(i);
        m228324d(i2);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        switch (i) {
            case -99031:
                int i2 = bundle.getInt("int_data");
                if (i2 == 4) {
                    m228323c(true);
                    UIUtils.display(this.f145609l, true);
                    return;
                } else if (i2 == 3) {
                    m228323c(false);
                    UIUtils.display(this.f145609l, false);
                    return;
                } else {
                    return;
                }
            case -99016:
                int max = this.f145601d.getMax();
                if (bundle != null && bundle.containsKey("int_arg1")) {
                    max = bundle.getInt("int_arg1", max);
                }
                mo199464m();
                mo199457a(max, max);
                return;
            case -99015:
                C1556v.m7130a(this.f145608k);
                this.f145610m.setVisibility(8);
                C1556v.m7132b(this.f145608k);
                this.f145620w = true;
                PerfVideoViewMonitor.m228165a(this.f145619v);
                return;
            case -99014:
                this.f145620w = true;
                return;
            case -99010:
                UIUtils.display(this.f145609l, false);
                return;
            case -99004:
                m228325d(false);
                m228327e(false);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52112m
    /* renamed from: a */
    public void mo127013a(int i, int i2, int i3) {
        if (this.f145620w) {
            this.f145618u = i3;
            mo199457a(i, i2);
        }
    }

    public C58857b(Context context, IRequestCreator iRequestCreator, PhotoItem photoItem, boolean z, OnChatAlbumClickListener onChatAlbumClickListener) {
        super(context);
        this.f145606i = iRequestCreator;
        this.f145607j = photoItem;
        this.f145621x = z;
        this.f145603f = onChatAlbumClickListener;
    }
}
