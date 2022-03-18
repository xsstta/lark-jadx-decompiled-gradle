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
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.widget.C39088d;
import com.ss.android.lark.inno.utils.C39093c;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.inno.player.live.a.f.c */
public class C39049c extends AbstractC39047a<AbstractC39048b> {

    /* renamed from: a */
    public C39052a f100262a;

    /* renamed from: b */
    public C39088d f100263b;

    /* renamed from: c */
    private final OnSingleClickListener f100264c = new OnSingleClickListener() {
        /* class com.ss.android.lark.inno.player.live.p1989a.p1995f.C39049c.C390501 */

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            int id = view.getId();
            if (id == R.id.iv_play) {
                if (((AbstractC39048b) C39049c.this.getDepend()).mo142825c()) {
                    ((AbstractC39048b) C39049c.this.getDepend()).mo142822a().aI_();
                    C39049c.this.f100262a.f100268a.setImageResource(R.drawable.ud_icon_play_filled);
                    return;
                }
                ((AbstractC39048b) C39049c.this.getDepend()).mo142822a().mo142894b();
                C39049c.this.f100262a.f100268a.setImageResource(R.drawable.ud_icon_pause_livestream_outlined);
            } else if (id == R.id.iv_back) {
                ((AbstractC39048b) C39049c.this.getDepend()).mo142827e();
            } else if (id == R.id.iv_refresh) {
                C39049c.this.f100263b.mo142960a(true, 3000);
                ((AbstractC39048b) C39049c.this.getDepend()).mo142822a().mo142895c();
            } else if (id == R.id.tv_quality) {
                C39049c.this.f100263b.mo142958a();
                ((AbstractC39048b) C39049c.this.getDepend()).mo142823a(C38943b.f100086k);
            } else if (id == R.id.tv_line) {
                C39049c.this.f100263b.mo142958a();
                ((AbstractC39048b) C39049c.this.getDepend()).mo142823a(C38943b.f100088m);
            }
        }
    };

    /* renamed from: d */
    private final View.OnTouchListener f100265d = new View.OnTouchListener() {
        /* class com.ss.android.lark.inno.player.live.p1989a.p1995f.C39049c.View$OnTouchListenerC390512 */

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C45855f.m181663b("LiveToolbarFullLayerView", "onTouch");
            if (motionEvent.getAction() == 0) {
                C39049c.this.f100263b.mo142964c();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                C39049c.this.f100263b.mo142960a(true, 3000);
            }
            return true;
        }
    };

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: a */
    public void mo142814a(C38938a aVar) {
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39016b
    /* renamed from: b */
    public void mo142588b() {
        this.f100263b.mo142958a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.inno.player.live.a.f.c$a */
    public static class C39052a {

        /* renamed from: a */
        public ImageView f100268a;

        /* renamed from: b */
        public TextView f100269b;

        /* renamed from: c */
        public TextView f100270c;

        /* renamed from: d */
        public TextView f100271d;

        /* renamed from: e */
        public ImageView f100272e;

        /* renamed from: f */
        public TextView f100273f;

        /* renamed from: g */
        public ImageView f100274g;

        /* renamed from: h */
        public TextView f100275h;

        /* renamed from: i */
        public TextView f100276i;

        /* renamed from: j */
        private ImageView f100277j;

        /* renamed from: k */
        private ImageView f100278k;

        /* renamed from: a */
        private void m154118a() {
            this.f100269b.setText("01:24:22");
            this.f100270c.setText(R.string.mm_tools_test_text1);
            this.f100271d.setText(R.string.tools_zhibozhong);
            this.f100273f.setText(R.string.tools_gaoqing);
        }

        public C39052a(View view) {
            this.f100268a = (ImageView) view.findViewById(R.id.iv_play);
            this.f100269b = (TextView) view.findViewById(R.id.tv_playtime);
            view.findViewById(R.id.iv_expend).setVisibility(8);
            this.f100270c = (TextView) view.findViewById(R.id.tv_title);
            this.f100271d = (TextView) view.findViewById(R.id.tv_live);
            this.f100272e = (ImageView) view.findViewById(R.id.iv_refresh);
            this.f100276i = (TextView) view.findViewById(R.id.tv_line);
            this.f100273f = (TextView) view.findViewById(R.id.tv_quality);
            this.f100277j = (ImageView) view.findViewById(R.id.iv_danmu);
            this.f100274g = (ImageView) view.findViewById(R.id.iv_back);
            this.f100278k = (ImageView) view.findViewById(R.id.iv_share);
            this.f100275h = (TextView) view.findViewById(R.id.tv_watch);
            m154118a();
        }
    }

    /* renamed from: c */
    private void m154106c() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_live_layer_toolbar_fullscreen, (ViewGroup) this, true);
        this.f100262a = new C39052a(this);
        findViewById(R.id.ll_top).setOnTouchListener(this.f100265d);
        findViewById(R.id.ll_bottom).setOnTouchListener(this.f100265d);
        this.f100262a.f100268a.setOnClickListener(this.f100264c);
        this.f100262a.f100274g.setOnClickListener(this.f100264c);
        this.f100262a.f100272e.setOnClickListener(this.f100264c);
        this.f100262a.f100273f.setOnClickListener(this.f100264c);
        this.f100262a.f100276i.setOnClickListener(this.f100264c);
        C39088d dVar = new C39088d(this);
        this.f100263b = dVar;
        dVar.mo142960a(true, 3000);
    }

    /* renamed from: d */
    private void m154107d() {
        int measuredWidth = findViewById(R.id.ll_title).getMeasuredWidth();
        int i = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f100262a.f100271d.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth2 = this.f100262a.f100271d.getMeasuredWidth();
        if (this.f100262a.f100271d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f100262a.f100271d.getLayoutParams();
            measuredWidth2 += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        if (this.f100262a.f100270c.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f100262a.f100270c.getLayoutParams();
            i = 0 + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
        }
        this.f100262a.f100270c.setMaxWidth((measuredWidth - measuredWidth2) - i);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: a */
    public void mo142815a(String str) {
        this.f100262a.f100269b.setText(str);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: c */
    public void mo142820c(boolean z) {
        this.f100263b.mo142962b(z);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: d */
    public void mo142821d(boolean z) {
        this.f100263b.mo142960a(z, 3000);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: a */
    public void mo142813a(int i) {
        this.f100262a.f100273f.setText(C39093c.m154344a(i));
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: b */
    public void mo142818b(String str) {
        this.f100262a.f100270c.setText(str);
    }

    public C39049c(Context context) {
        super(context);
        m154106c();
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: a */
    public void mo142816a(boolean z) {
        int i;
        TextView textView = this.f100262a.f100276i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: b */
    public void mo142817b(int i) {
        TextView textView = this.f100262a.f100275h;
        textView.setText(C45851c.m181647a(R.string.tools_zhengzaiguankan) + i);
    }

    @Override // com.ss.android.lark.inno.player.live.p1989a.p1995f.AbstractC39047a
    /* renamed from: b */
    public void mo142819b(boolean z) {
        if (z) {
            this.f100262a.f100268a.setImageResource(R.drawable.ud_icon_pause_livestream_outlined);
        } else {
            this.f100262a.f100268a.setImageResource(R.drawable.ud_icon_play_filled);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m154107d();
        super.onMeasure(i, i2);
    }
}
