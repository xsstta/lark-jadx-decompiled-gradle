package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;

/* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge.a */
public class C69631a extends FrameLayout implements AbstractC69622b {

    /* renamed from: a */
    private AbstractC69624d f174072a;

    /* renamed from: b */
    private View f174073b;

    /* renamed from: c */
    private boolean f174074c = true;

    /* renamed from: d */
    private C69632b f174075d;

    /* renamed from: e */
    private C69632b f174076e;

    public View getBadgeView() {
        return this.f174073b;
    }

    public AbstractC69624d getInnerPagerTitleView() {
        return this.f174072a;
    }

    public C69632b getXBadgeRule() {
        return this.f174075d;
    }

    public C69632b getYBadgeRule() {
        return this.f174076e;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentBottom() {
        AbstractC69624d dVar = this.f174072a;
        if (dVar instanceof AbstractC69622b) {
            return ((AbstractC69622b) dVar).getContentBottom();
        }
        return getBottom();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentLeft() {
        if (this.f174072a instanceof AbstractC69622b) {
            return getLeft() + ((AbstractC69622b) this.f174072a).getContentLeft();
        }
        return getLeft();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentRight() {
        if (this.f174072a instanceof AbstractC69622b) {
            return getLeft() + ((AbstractC69622b) this.f174072a).getContentRight();
        }
        return getRight();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b
    public int getContentTop() {
        AbstractC69624d dVar = this.f174072a;
        if (dVar instanceof AbstractC69622b) {
            return ((AbstractC69622b) dVar).getContentTop();
        }
        return getTop();
    }

    public void setAutoCancelBadge(boolean z) {
        this.f174074c = z;
    }

    public C69631a(Context context) {
        super(context);
    }

    public void setBadgeView(View view) {
        if (this.f174073b != view) {
            this.f174073b = view;
            removeAllViews();
            if (this.f174072a instanceof View) {
                addView((View) this.f174072a, new FrameLayout.LayoutParams(-1, -1));
            }
            if (this.f174073b != null) {
                addView(this.f174073b, new FrameLayout.LayoutParams(-2, -2));
            }
        }
    }

    public void setInnerPagerTitleView(AbstractC69624d dVar) {
        if (this.f174072a != dVar) {
            this.f174072a = dVar;
            removeAllViews();
            if (this.f174072a instanceof View) {
                addView((View) this.f174072a, new FrameLayout.LayoutParams(-1, -1));
            }
            if (this.f174073b != null) {
                addView(this.f174073b, new FrameLayout.LayoutParams(-2, -2));
            }
        }
    }

    public void setXBadgeRule(C69632b bVar) {
        BadgeAnchor a;
        if (bVar == null || (a = bVar.mo243266a()) == BadgeAnchor.LEFT || a == BadgeAnchor.RIGHT || a == BadgeAnchor.CONTENT_LEFT || a == BadgeAnchor.CONTENT_RIGHT || a == BadgeAnchor.CENTER_X || a == BadgeAnchor.LEFT_EDGE_CENTER_X || a == BadgeAnchor.RIGHT_EDGE_CENTER_X) {
            this.f174075d = bVar;
            return;
        }
        throw new IllegalArgumentException("x badge rule is wrong.");
    }

    public void setYBadgeRule(C69632b bVar) {
        BadgeAnchor a;
        if (bVar == null || (a = bVar.mo243266a()) == BadgeAnchor.TOP || a == BadgeAnchor.BOTTOM || a == BadgeAnchor.CONTENT_TOP || a == BadgeAnchor.CONTENT_BOTTOM || a == BadgeAnchor.CENTER_Y || a == BadgeAnchor.TOP_EDGE_CENTER_Y || a == BadgeAnchor.BOTTOM_EDGE_CENTER_Y) {
            this.f174076e = bVar;
            return;
        }
        throw new IllegalArgumentException("y badge rule is wrong.");
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: b */
    public void mo31043b(int i, int i2) {
        AbstractC69624d dVar = this.f174072a;
        if (dVar != null) {
            dVar.mo31043b(i, i2);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: a */
    public void mo31041a(int i, int i2) {
        AbstractC69624d dVar = this.f174072a;
        if (dVar != null) {
            dVar.mo31041a(i, i2);
        }
        if (this.f174074c) {
            setBadgeView(null);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: a */
    public void mo31042a(int i, int i2, float f, boolean z) {
        AbstractC69624d dVar = this.f174072a;
        if (dVar != null) {
            dVar.mo31042a(i, i2, f, z);
        }
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d
    /* renamed from: b */
    public void mo31044b(int i, int i2, float f, boolean z) {
        AbstractC69624d dVar = this.f174072a;
        if (dVar != null) {
            dVar.mo31044b(i, i2, f, z);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AbstractC69624d dVar = this.f174072a;
        if ((dVar instanceof View) && this.f174073b != null) {
            int[] iArr = new int[14];
            View view = (View) dVar;
            iArr[0] = view.getLeft();
            iArr[1] = view.getTop();
            iArr[2] = view.getRight();
            iArr[3] = view.getBottom();
            AbstractC69624d dVar2 = this.f174072a;
            if (dVar2 instanceof AbstractC69622b) {
                AbstractC69622b bVar = (AbstractC69622b) dVar2;
                iArr[4] = bVar.getContentLeft();
                iArr[5] = bVar.getContentTop();
                iArr[6] = bVar.getContentRight();
                iArr[7] = bVar.getContentBottom();
            } else {
                for (int i5 = 4; i5 < 8; i5++) {
                    iArr[i5] = iArr[i5 - 4];
                }
            }
            iArr[8] = view.getWidth() / 2;
            iArr[9] = view.getHeight() / 2;
            iArr[10] = iArr[4] / 2;
            iArr[11] = iArr[5] / 2;
            iArr[12] = iArr[6] + ((iArr[2] - iArr[6]) / 2);
            iArr[13] = iArr[7] + ((iArr[3] - iArr[7]) / 2);
            C69632b bVar2 = this.f174075d;
            if (bVar2 != null) {
                int b = iArr[bVar2.mo243266a().ordinal()] + this.f174075d.mo243267b();
                View view2 = this.f174073b;
                view2.offsetLeftAndRight(b - view2.getLeft());
            }
            C69632b bVar3 = this.f174076e;
            if (bVar3 != null) {
                int b2 = iArr[bVar3.mo243266a().ordinal()] + this.f174076e.mo243267b();
                View view3 = this.f174073b;
                view3.offsetTopAndBottom(b2 - view3.getTop());
            }
        }
    }
}
