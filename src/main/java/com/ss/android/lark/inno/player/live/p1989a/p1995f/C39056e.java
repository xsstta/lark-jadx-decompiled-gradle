package com.ss.android.lark.inno.player.live.p1989a.p1995f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.network.model.C38938a;
import com.ss.android.lark.inno.player.layer.AbstractC39018d;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.widget.C39088d;
import com.ss.android.lark.inno.utils.C39093c;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.inno.player.live.a.f.e */
public class C39056e extends AbstractC39047a<AbstractC39048b> {

    /* renamed from: a */
    public C39059a f100282a;

    /* renamed from: b */
    public C39088d f100283b;

    /* renamed from: c */
    private final OnSingleClickListener f100284c = new OnSingleClickListener() {
        /* class com.ss.android.lark.inno.player.live.p1989a.p1995f.C39056e.C390571 */

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            int id = view.getId();
            if (id == R.id.iv_play) {
                C39056e.this.f100283b.mo142960a(true, 3000);
                if (((AbstractC39048b) C39056e.this.getDepend()).mo142825c()) {
                    ((AbstractC39048b) C39056e.this.getDepend()).mo142822a().aI_();
                    C39056e.this.f100282a.f100288a.setImageResource(R.drawable.ud_icon_play_filled);
                    return;
                }
                ((AbstractC39048b) C39056e.this.getDepend()).mo142822a().mo142894b();
                C39056e.this.f100282a.f100288a.setImageResource(R.drawable.ud_icon_pause_livestream_outlined);
            } else if (id == R.id.iv_expend) {
                ((AbstractC39048b) C39056e.this.getDepend()).mo142826d();
            } else if (id == R.id.iv_back) {
                ((AbstractC39048b) C39056e.this.getDepend()).mo142827e();
            } else if (id == R.id.iv_refresh) {
                C39056e.this.f100283b.mo142960a(true, 3000);
                ((AbstractC39048b) C39056e.this.getDepend()).mo142822a().mo142895c();
            } else if (id == R.id.tv_quality) {
                C39056e.this.f100283b.mo142958a();
                ((AbstractC39048b) C39056e.this.getDepend()).mo142824b();
            } else if (id == R.id.tv_line) {
                C39056e.this.f100283b.mo142958a();
                ((AbstractC39048b) C39056e.this.getDepend()).mo142823a(C38943b.f100088m);
            }
        }
    };

    /* renamed from: d */
    private final View.OnTouchListener f100285d = new View.OnTouchListener() {
        /* class com.ss.android.lark.inno.player.live.p1989a.p1995f.C39056e.View$OnTouchListenerC390582 */

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C45855f.m181663b("LiveToolbarLayerView", "onTouch");
            if (motionEvent.getAction() == 0) {
                C39056e.this.f100283b.mo142964c();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                C39056e.this.f100283b.mo142960a(true, 3000);
            }
            return true;
        }
    };

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        this.f100283b.mo142958a();
    }

    /* renamed from: c */
    private void m154135c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_live_layer_toolbar_normal, (ViewGroup) this, true);
        this.f100282a = new C39059a(this);
        findViewById(R.id.ll_top).setOnTouchListener(this.f100285d);
        findViewById(R.id.ll_bottom).setOnTouchListener(this.f100285d);
        this.f100282a.f100288a.setOnClickListener(this.f100284c);
        this.f100282a.f100290c.setOnClickListener(this.f100284c);
        this.f100282a.f100295h.setOnClickListener(this.f100284c);
        this.f100282a.f100293f.setOnClickListener(this.f100284c);
        C39088d dVar = new C39088d(this);
        this.f100283b = dVar;
        dVar.mo142960a(true, 3000);
    }

    /* renamed from: d */
    private void m154136d() {
        int measuredWidth = findViewById(R.id.ll_title).getMeasuredWidth();
        int i = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f100282a.f100292e.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth2 = this.f100282a.f100292e.getMeasuredWidth();
        if (this.f100282a.f100292e.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f100282a.f100292e.getLayoutParams();
            measuredWidth2 += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        if (this.f100282a.f100291d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f100282a.f100291d.getLayoutParams();
            i = 0 + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
        }
        this.f100282a.f100291d.setMaxWidth((measuredWidth - measuredWidth2) - i);
    }

    public void setDepend(AbstractC39048b bVar) {
        super.setDepend((AbstractC39018d) bVar);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: a */
    public void mo142815a(String str) {
        this.f100282a.f100289b.setText(str);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: c */
    public void mo142820c(boolean z) {
        this.f100283b.mo142962b(z);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: d */
    public void mo142821d(boolean z) {
        this.f100283b.mo142960a(z, 3000);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: a */
    public void mo142813a(int i) {
        this.f100282a.f100295h.setText(C39093c.m154344a(i));
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: b */
    public void mo142818b(String str) {
        this.f100282a.f100291d.setText(str);
    }

    public C39056e(Context context) {
        super(context);
        m154135c();
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: a */
    public void mo142814a(C38938a aVar) {
        this.f100282a.f100294g.setText(aVar.mo142536a());
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: b */
    public void mo142817b(int i) {
        TextView textView = this.f100282a.f100296i;
        textView.setText(C45851c.m181647a(R.string.tools_zhengzaiguankan) + i);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: a */
    public void mo142816a(boolean z) {
        int i;
        TextView textView = this.f100282a.f100294g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: b */
    public void mo142819b(boolean z) {
        if (z) {
            this.f100282a.f100288a.setImageResource(R.drawable.ud_icon_pause_livestream_outlined);
        } else {
            this.f100282a.f100288a.setImageResource(R.drawable.ud_icon_play_filled);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.inno.player.live.a.f.e$a */
    public static class C39059a {

        /* renamed from: a */
        public ImageView f100288a;

        /* renamed from: b */
        public TextView f100289b;

        /* renamed from: c */
        public View f100290c;

        /* renamed from: d */
        public TextView f100291d;

        /* renamed from: e */
        public TextView f100292e;

        /* renamed from: f */
        public ImageView f100293f;

        /* renamed from: g */
        public TextView f100294g;

        /* renamed from: h */
        public TextView f100295h;

        /* renamed from: i */
        public TextView f100296i;

        /* renamed from: j */
        private ImageView f100297j;

        public C39059a(View view) {
            this.f100288a = (ImageView) view.findViewById(R.id.iv_play);
            this.f100289b = (TextView) view.findViewById(R.id.tv_playtime);
            this.f100290c = view.findViewById(R.id.iv_expend);
            this.f100291d = (TextView) view.findViewById(R.id.tv_title);
            this.f100292e = (TextView) view.findViewById(R.id.tv_live);
            this.f100293f = (ImageView) view.findViewById(R.id.iv_refresh);
            this.f100294g = (TextView) view.findViewById(R.id.tv_line);
            this.f100295h = (TextView) view.findViewById(R.id.tv_quality);
            this.f100297j = (ImageView) view.findViewById(R.id.iv_danmu);
            this.f100296i = (TextView) view.findViewById(R.id.tv_watch);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m154136d();
        super.onMeasure(i, i2);
    }
}
