package com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.C27693a;
import com.ss.android.appcenter.business.dto.C27694b;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.C28078a;
import com.ss.android.appcenter.business.tab.fragmentv3.component.header.CommonHeader;
import com.ss.android.appcenter.business.tab.fragmentv3.component.status.TemplateSkeletonLoadingView;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28037d;
import com.ss.android.appcenter.business.tab.fragmentv3.p1283a.C28040e;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.bannerview.BannerViewPager;
import com.ss.android.appcenter.common.bannerview.indicator.IndicatorView;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.engine.model.NodeParams;
import com.ss.android.appcenter.engine.p1299a.C28237a;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.List;

public class FeedSwiper extends FrameLayout {

    /* renamed from: a */
    public TemplateSkeletonLoadingView f70249a;

    /* renamed from: b */
    private CommonHeader f70250b;

    /* renamed from: c */
    private View f70251c;

    /* renamed from: d */
    private View f70252d;

    /* renamed from: e */
    private boolean f70253e;

    /* renamed from: f */
    private int f70254f;

    /* renamed from: g */
    private int f70255g;

    /* renamed from: h */
    private int f70256h;

    /* renamed from: i */
    private StatusController f70257i;

    /* renamed from: j */
    private FeedSwiperContent f70258j;

    /* renamed from: k */
    private View f70259k;

    /* renamed from: l */
    private BannerViewPager<C27693a> f70260l;

    /* renamed from: m */
    private C28073a f70261m;

    /* renamed from: n */
    private IndicatorView f70262n;

    /* renamed from: o */
    private ImageMaskView f70263o;

    /* renamed from: a */
    public void mo99926a() {
        if (this.f70253e) {
            this.f70252d.setBackground(C28209p.m103302b(getContext(), this.f70254f));
            return;
        }
        this.f70252d.setBackground(null);
    }

    /* renamed from: c */
    private void m102604c() {
        this.f70258j = (FeedSwiperContent) findViewById(R.id.content);
        this.f70259k = findViewById(R.id.error);
        this.f70249a = (TemplateSkeletonLoadingView) findViewById(R.id.loading);
        this.f70257i = new StatusController(this.f70258j, this.f70259k, new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper.FeedSwiper.C280721 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                FeedSwiper.this.f70249a.mo99960b();
                FeedSwiper.this.f70249a.setVisibility(0);
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                FeedSwiper.this.f70249a.setVisibility(8);
                FeedSwiper.this.f70249a.mo99961c();
            }
        });
    }

    /* renamed from: b */
    private void m102603b() {
        LayoutInflater.from(getContext()).inflate(R.layout.workplace_template_component_feed_swiper_layout, (ViewGroup) this, true);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setClipChildren(false);
        this.f70251c = findViewById(R.id.root);
        this.f70250b = (CommonHeader) findViewById(R.id.header);
        this.f70252d = findViewById(R.id.feed_background);
        this.f70260l = (BannerViewPager) findViewById(R.id.viewpager);
        this.f70262n = (IndicatorView) findViewById(R.id.indicator);
        this.f70263o = (ImageMaskView) findViewById(R.id.image_mask);
        m102604c();
        m102605d();
    }

    /* renamed from: d */
    private void m102605d() {
        C28073a aVar = new C28073a();
        this.f70261m = aVar;
        this.f70260l.mo100113a(aVar);
        this.f70260l.mo100134h(2);
        this.f70260l.mo100135i(4);
        this.f70260l.mo100111a(ContextCompat.getColor(getContext(), R.color.fill_disable), ContextCompat.getColor(getContext(), R.color.primary_pri_500));
        this.f70260l.mo100125d(ParticipantRepo.f117150c);
        this.f70260l.mo100128e(C28209p.m103293a(getContext(), 10.0f));
        this.f70260l.mo100129f(C28209p.m103293a(getContext(), 2.0f));
        this.f70260l.mo100130g(C28209p.m103293a(getContext(), 6.0f));
        this.f70260l.mo100114a(this.f70262n);
        this.f70260l.mo100126d();
    }

    public FeedSwiper(Context context) {
        this(context, null);
    }

    public void setErrorClickListener(View.OnClickListener onClickListener) {
        this.f70259k.setOnClickListener(new View.OnClickListener(onClickListener) {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.feedswiper.$$Lambda$FeedSwiper$wAiaYNK5Vn_RQeMdOksKSUPZBU */
            public final /* synthetic */ View.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                FeedSwiper.m270224lambda$wAiaYNK5Vn_RQeMdOksKSUPZBU(FeedSwiper.this, this.f$1, view);
            }
        });
    }

    public void setFeedList(List<C27693a> list) {
        this.f70260l.mo100122b(list);
        if (list.size() > 1) {
            this.f70262n.setVisibility(0);
        } else {
            this.f70262n.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo99929a(C28237a<C27694b> aVar) {
        if (aVar.mo100614a()) {
            this.f70257i.mo100033a(StatusController.Status.LOADING);
        } else if (aVar.mo100615b()) {
            setFeedList(aVar.mo100619f().f69186a);
            this.f70257i.mo100033a(StatusController.Status.CONTENT);
        } else if (aVar.mo100616c()) {
            this.f70257i.mo100033a(StatusController.Status.ERROR);
        }
    }

    public void setHeader(CommonHeader.C28077b bVar) {
        bVar.f70291f = new CommonHeader.C28076a(C28209p.m103291a(16.0f), C28209p.m103291a(16.0f));
        if (bVar.f70287b) {
            this.f70250b.setVisibility(0);
            C28078a.m102635a(this.f70250b, bVar);
            return;
        }
        this.f70250b.setVisibility(8);
    }

    public FeedSwiper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102602a(View.OnClickListener onClickListener, View view) {
        this.f70257i.mo100033a(StatusController.Status.LOADING);
        onClickListener.onClick(view);
    }

    /* renamed from: a */
    public void mo99930a(NodeParams nodeParams, Lifecycle lifecycle) {
        mo99928a(C28040e.m102495b(nodeParams), C28040e.m102494a(nodeParams), C28037d.m102491t(nodeParams), C28037d.m102476e(nodeParams));
        mo99927a(C28040e.m102502i(nodeParams), C28040e.m102503j(nodeParams), C28040e.m102504k(nodeParams), C28040e.m102505l(nodeParams));
        this.f70256h = C28040e.m102498e(nodeParams);
        this.f70254f = C28040e.m102497d(nodeParams);
        this.f70253e = C28037d.m102479h(nodeParams);
        int c = C28040e.m102496c(nodeParams);
        this.f70255g = c;
        this.f70258j.mo99934a(this.f70254f, c);
        setHeader(new CommonHeader.C28077b(C28037d.m102472a(nodeParams), C28037d.m102473b(nodeParams), C28037d.m102474c(nodeParams), false, C28037d.m102476e(nodeParams), "feed"));
        mo99926a();
        this.f70260l.mo100112a(lifecycle);
        this.f70260l.mo100123c(C28037d.m102489r(nodeParams));
        this.f70261m.mo99938a(this.f70256h, this.f70253e);
    }

    public FeedSwiper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m102603b();
    }

    /* renamed from: a */
    public void mo99927a(int i, int i2, int i3, int i4) {
        C28209p.m103301a(this, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo99928a(int i, int i2, int i3, boolean z) {
        boolean z2;
        C28184h.m103250d("FeedSwiper", "setSize>>> width:" + i + " height:" + i2 + " imageHeight:" + i3);
        int i4 = 0;
        if (i2 == -2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                i4 = CommonHeader.m102627a(false);
            }
            int a = C28209p.m103293a(getContext(), 80.0f);
            int i5 = i3 + i4 + a;
            C28184h.m103250d("FeedSwiper", "setSize>>> final height:" + i5 + " headerHeight:" + i4 + " footerHeight:" + a + " imageHeight:" + i3);
            C28209p.m103300a(this.f70251c, i, i5);
            this.f70249a.setStatusHeight(i5);
            return;
        }
        C28209p.m103300a(this.f70251c, i, i2);
        this.f70249a.setStatusHeight(i2);
    }
}
