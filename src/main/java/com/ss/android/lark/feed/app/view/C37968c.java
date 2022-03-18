package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23303b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPointNew;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.image.entity.C38823a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.feed.app.view.c */
public class C37968c extends AbstractC23303b {

    /* renamed from: a */
    public FeedItemView f97476a;

    /* renamed from: b */
    public View f97477b;

    /* renamed from: c */
    public LarkAvatarView f97478c;

    /* renamed from: d */
    public RelativeLayout f97479d;

    /* renamed from: e */
    public RelativeLayout f97480e;

    /* renamed from: f */
    public View f97481f;

    /* renamed from: g */
    public View f97482g;

    /* renamed from: h */
    public AbstractC37305b f97483h;

    /* renamed from: i */
    private final Drawable f97484i;

    /* renamed from: j */
    private float f97485j;

    /* renamed from: k */
    private float f97486k;

    /* renamed from: l */
    private boolean f97487l = true;

    /* renamed from: m */
    private boolean f97488m;

    /* renamed from: n */
    private boolean f97489n;

    /* renamed from: o */
    private boolean f97490o;

    /* renamed from: p */
    private boolean f97491p = true;

    /* renamed from: q */
    private String f97492q;

    /* renamed from: r */
    private AbstractC37969a f97493r;

    /* renamed from: com.ss.android.lark.feed.app.view.c$a */
    public interface AbstractC37969a {
        /* renamed from: b */
        void mo137278b();

        /* renamed from: c */
        void mo137279c();
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23298h
    /* renamed from: k */
    public View mo80851k() {
        return this.f97477b;
    }

    /* renamed from: l */
    public boolean mo139037l() {
        return this.f97487l;
    }

    /* renamed from: m */
    public boolean mo139038m() {
        return this.f97489n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo139039n() {
        mo139026a((AbstractC37969a) null);
        LarkAvatarView larkAvatarView = this.f97478c;
        if (larkAvatarView != null) {
            larkAvatarView.setImageDrawable(this.f97484i);
        }
    }

    /* renamed from: o */
    private void m149355o() {
        this.f97476a.initSwipeView();
        if (this.f97485j == BitmapDescriptorFactory.HUE_RED) {
            m149354g(this.f97491p);
        }
        if (this.f97479d == null) {
            this.f97479d = this.f97476a.mBehindMarkLatterView;
        }
        if (this.f97480e == null) {
            this.f97480e = this.f97476a.mToppingContainer;
        }
        if (this.f97482g == null) {
            this.f97482g = this.f97476a.mBehindViews;
        }
        AbstractC37969a aVar = this.f97493r;
        if (aVar != null) {
            aVar.mo137278b();
        }
    }

    /* renamed from: a */
    public void mo139026a(AbstractC37969a aVar) {
        this.f97493r = aVar;
    }

    /* renamed from: b */
    public void mo139029b(boolean z) {
        this.f97487l = z;
    }

    /* renamed from: c */
    public void mo139030c(boolean z) {
        this.f97488m = z;
    }

    /* renamed from: d */
    public void mo139032d(boolean z) {
        this.f97489n = z;
    }

    /* renamed from: b */
    public void mo139028b(String str) {
        this.f97476a.setClickRegionMarkLatterText(str);
    }

    /* renamed from: d */
    public void mo139031d(int i) {
        this.f97476a.setLatterMarkFlagVisibility(i);
    }

    /* renamed from: e */
    public void mo139033e(int i) {
        this.f97476a.setToppingFlag(i);
    }

    /* renamed from: f */
    public void mo139035f(int i) {
        this.f97476a.setClickRegionMarkLatterFlag(i);
    }

    /* renamed from: a */
    public void mo139027a(String str) {
        this.f97476a.setToppingText(str);
        m149354g(this.f97491p);
        mo80866c(this.f97485j);
    }

    /* renamed from: f */
    public void mo139036f(boolean z) {
        if (this.f97491p != z) {
            this.f97491p = z;
            m149354g(z);
        }
    }

    /* renamed from: a */
    private int m149350a(Context context) {
        if (DesktopUtil.m144301a(context)) {
            return UIHelper.getWindowWidth(context, ContainerType.Left);
        }
        return this.f97476a.getMeasuredWidth();
    }

    /* renamed from: b */
    private Drawable m149351b(Context context) {
        C38823a aVar = new C38823a();
        aVar.setShape(1);
        aVar.setColor(UIUtils.getColor(context, R.color.bg_body_overlay));
        return aVar;
    }

    /* renamed from: e */
    public void mo139034e(boolean z) {
        boolean z2;
        this.f97490o = z;
        View view = this.f97481f;
        if (view != null) {
            if (!view.isEnabled() || z) {
                z2 = false;
            } else {
                z2 = true;
            }
            view.setEnabled(z2);
        }
    }

    /* renamed from: e */
    private void m149353e(float f) {
        m149355o();
        AbstractC37969a aVar = this.f97493r;
        if (aVar != null) {
            aVar.mo137279c();
        }
        mo80866c(this.f97485j);
        int color = this.f97476a.getResources().getColor(R.color.ud_Y500);
        if (this.f97490o) {
            color = this.f97476a.getResources().getColor(R.color.lkui_N400);
        }
        this.f97476a.setBehindViewsForSwipeLeft(0, color, this.f97491p, f / this.f97485j);
    }

    /* renamed from: g */
    private void m149354g(boolean z) {
        RelativeLayout relativeLayout;
        if (this.f97480e != null && (relativeLayout = this.f97479d) != null) {
            if (z) {
                this.f97485j = -(((float) (relativeLayout.getLayoutParams().width + this.f97480e.getLayoutParams().width)) / ((float) m149350a(this.itemView.getContext())));
            } else {
                this.f97485j = -(((float) relativeLayout.getLayoutParams().width) / ((float) m149350a(this.itemView.getContext())));
            }
        }
    }

    public C37968c(FeedItemView feedItemView, AbstractC37305b bVar) {
        super(feedItemView);
        this.f97476a = feedItemView;
        this.f97477b = feedItemView.mContainer;
        this.f97478c = feedItemView.mAvatarIV;
        this.f97479d = feedItemView.mBehindMarkLatterView;
        this.f97480e = feedItemView.mToppingContainer;
        this.f97481f = feedItemView.mCheckMarkIV;
        this.f97483h = bVar;
        this.f97484i = m149351b(feedItemView.getContext());
        String language = C37268c.m146766b().mo139170a().getResources().getConfiguration().locale.getLanguage();
        if (!TextUtils.equals(this.f97492q, language)) {
            this.f97492q = language;
            this.f97485j = BitmapDescriptorFactory.HUE_RED;
        }
        if (this.f97485j == BitmapDescriptorFactory.HUE_RED) {
            m149354g(this.f97491p);
        }
    }

    /* renamed from: b */
    private void m149352b(float f, float f2, boolean z) {
        m149355o();
        this.f97476a.doSwipeRightBehindViewsAnim(f * ((float) this.itemView.getWidth()), this.f97476a.getResources().getColor(R.color.ud_T500));
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23303b, com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23298h
    /* renamed from: a */
    public void mo80836a(float f, float f2, boolean z) {
        super.mo80836a(f, f2, z);
        if (this.f97488m) {
            mo80867d(BitmapDescriptorFactory.HUE_RED);
        } else if (this.f97489n) {
            mo80867d(2.3148148f);
        } else {
            if (Float.compare(BitmapDescriptorFactory.HUE_RED, this.f97486k) == 0) {
                this.f97486k = (((float) UIUtils.dp2px(this.itemView.getContext(), 80.0f)) * 1.0f) / ((float) this.f97476a.getMeasuredWidth());
            }
            mo80867d(this.f97486k);
        }
        if (f < BitmapDescriptorFactory.HUE_RED) {
            m149353e(f);
            FeedHitPointNew.m148858b(FeedHitPointNew.FeedMainClickParam.FEED_LEFTSLIDE);
        } else if (f > BitmapDescriptorFactory.HUE_RED && !this.f97488m) {
            m149352b(f, f2, z);
        }
    }
}
