package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview;

import android.graphics.Point;
import android.view.View;

public enum DSVOrientation {
    HORIZONTAL {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation
        public AbstractC48063a createHelper() {
            return new C48064b();
        }
    },
    VERTICAL {
        /* access modifiers changed from: package-private */
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation
        public AbstractC48063a createHelper() {
            return new C48065c();
        }
    };

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation$a */
    interface AbstractC48063a {
        /* renamed from: a */
        float mo168300a(Point point, float f, float f2);

        /* renamed from: a */
        int mo168301a(int i);

        /* renamed from: a */
        int mo168302a(int i, int i2);

        /* renamed from: a */
        void mo168303a(int i, C48083d dVar);

        /* renamed from: a */
        void mo168304a(Point point, int i, Point point2);

        /* renamed from: a */
        void mo168305a(EnumC48077a aVar, int i, Point point);

        /* renamed from: a */
        boolean mo168306a();

        /* renamed from: a */
        boolean mo168307a(Point point, int i, int i2, int i3, int i4);

        /* renamed from: a */
        boolean mo168308a(DiscreteScrollLayoutManager discreteScrollLayoutManager);

        /* renamed from: b */
        int mo168309b(int i);

        /* renamed from: b */
        int mo168310b(int i, int i2);

        /* renamed from: b */
        boolean mo168311b();

        /* renamed from: c */
        int mo168312c(int i, int i2);
    }

    /* access modifiers changed from: package-private */
    public abstract AbstractC48063a createHelper();

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation$b */
    protected static class C48064b implements AbstractC48063a {
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public int mo168301a(int i) {
            return i;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public int mo168302a(int i, int i2) {
            return i;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public boolean mo168306a() {
            return false;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: b */
        public int mo168309b(int i) {
            return 0;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: b */
        public int mo168310b(int i, int i2) {
            return i;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: b */
        public boolean mo168311b() {
            return true;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: c */
        public int mo168312c(int i, int i2) {
            return i;
        }

        protected C48064b() {
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public boolean mo168308a(DiscreteScrollLayoutManager discreteScrollLayoutManager) {
            boolean z;
            boolean z2;
            View f = discreteScrollLayoutManager.mo168336f();
            View g = discreteScrollLayoutManager.mo168337g();
            int i = -discreteScrollLayoutManager.mo168338h();
            int width = discreteScrollLayoutManager.getWidth() + discreteScrollLayoutManager.mo168338h();
            if (discreteScrollLayoutManager.getDecoratedLeft(f) <= i || discreteScrollLayoutManager.getPosition(f) <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (discreteScrollLayoutManager.getDecoratedRight(g) >= width || discreteScrollLayoutManager.getPosition(g) >= discreteScrollLayoutManager.getItemCount() - 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public void mo168303a(int i, C48083d dVar) {
            dVar.mo168382b(i);
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public float mo168300a(Point point, float f, float f2) {
            return f - ((float) point.x);
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public void mo168304a(Point point, int i, Point point2) {
            point2.set(point.x - i, point.y);
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public void mo168305a(EnumC48077a aVar, int i, Point point) {
            point.set(point.x + aVar.applyTo(i), point.y);
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public boolean mo168307a(Point point, int i, int i2, int i3, int i4) {
            int i5 = point.x - i;
            int i6 = point.x + i;
            if (i5 >= i3 + i4 || i6 <= (-i4)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation$c */
    protected static class C48065c implements AbstractC48063a {
        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public int mo168301a(int i) {
            return 0;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public int mo168302a(int i, int i2) {
            return i2;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public boolean mo168306a() {
            return true;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: b */
        public int mo168309b(int i) {
            return i;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: b */
        public int mo168310b(int i, int i2) {
            return i2;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: b */
        public boolean mo168311b() {
            return false;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: c */
        public int mo168312c(int i, int i2) {
            return i2;
        }

        protected C48065c() {
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public boolean mo168308a(DiscreteScrollLayoutManager discreteScrollLayoutManager) {
            boolean z;
            boolean z2;
            View f = discreteScrollLayoutManager.mo168336f();
            View g = discreteScrollLayoutManager.mo168337g();
            int i = -discreteScrollLayoutManager.mo168338h();
            int height = discreteScrollLayoutManager.getHeight() + discreteScrollLayoutManager.mo168338h();
            if (discreteScrollLayoutManager.getDecoratedTop(f) <= i || discreteScrollLayoutManager.getPosition(f) <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (discreteScrollLayoutManager.getDecoratedBottom(g) >= height || discreteScrollLayoutManager.getPosition(g) >= discreteScrollLayoutManager.getItemCount() - 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public void mo168303a(int i, C48083d dVar) {
            dVar.mo168388c(i);
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public float mo168300a(Point point, float f, float f2) {
            return f2 - ((float) point.y);
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public void mo168304a(Point point, int i, Point point2) {
            point2.set(point.x, point.y - i);
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public void mo168305a(EnumC48077a aVar, int i, Point point) {
            point.set(point.x, point.y + aVar.applyTo(i));
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation.AbstractC48063a
        /* renamed from: a */
        public boolean mo168307a(Point point, int i, int i2, int i3, int i4) {
            int i5 = point.y - i2;
            int i6 = point.y + i2;
            if (i5 >= i3 + i4 || i6 <= (-i4)) {
                return false;
            }
            return true;
        }
    }
}
