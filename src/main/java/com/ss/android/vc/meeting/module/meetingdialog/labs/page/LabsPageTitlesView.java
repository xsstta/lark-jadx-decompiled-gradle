package com.ss.android.vc.meeting.module.meetingdialog.labs.page;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.MagicWindowUtil;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;

public class LabsPageTitlesView extends HorizontalScrollView {

    /* renamed from: a */
    private C62285f f156445a;

    /* renamed from: b */
    private C62273b[] f156446b;

    /* renamed from: c */
    private int f156447c;

    /* renamed from: d */
    private AbstractC62272a f156448d;

    /* renamed from: e */
    private View f156449e;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsPageTitlesView$a */
    public interface AbstractC62272a {
        void onTabChanged(int i, AbstractC62283d dVar);
    }

    /* renamed from: a */
    private void m243204a() {
        setHorizontalScrollBarEnabled(false);
    }

    /* renamed from: b */
    private boolean m243207b() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        if (getWidth() < childAt.getWidth() + getPaddingLeft() + getPaddingRight()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m243208c() {
        int i;
        View view = this.f156449e;
        if (view != null) {
            if (m243207b()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    private int getScrollRange_() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getWidth() - ((getWidth() - getPaddingLeft()) - getPaddingRight()));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setTabChangeListener(AbstractC62272a aVar) {
        this.f156448d = aVar;
    }

    public LabsPageTitlesView(Context context) {
        super(context);
        m243204a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.page.LabsPageTitlesView$b */
    public static class C62273b {

        /* renamed from: a */
        private View f156450a;

        /* renamed from: b */
        private TextView f156451b;

        /* renamed from: c */
        private TextView f156452c;

        /* renamed from: d */
        private View f156453d;

        /* renamed from: e */
        private View f156454e;

        /* renamed from: a */
        public void mo215374a(String str) {
            this.f156451b.setText(str);
            this.f156452c.setText(str);
        }

        /* renamed from: a */
        public void mo215375a(boolean z) {
            int i;
            View view = this.f156454e;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }

        public C62273b(View view) {
            this.f156450a = view;
            this.f156451b = (TextView) view.findViewById(R.id.title_txt);
            this.f156452c = (TextView) view.findViewById(R.id.title_txt_selected);
            this.f156453d = view.findViewById(R.id.title_indicator);
            this.f156454e = view.findViewById(R.id.beta);
        }

        /* renamed from: b */
        public void mo215376b(boolean z) {
            int i;
            int i2;
            View view = this.f156453d;
            int i3 = 0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            TextView textView = this.f156451b;
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
            TextView textView2 = this.f156452c;
            if (!z) {
                i3 = 8;
            }
            textView2.setVisibility(i3);
        }
    }

    /* renamed from: a */
    public void mo215367a(C62285f fVar) {
        this.f156445a = fVar;
        mo215368a(false);
    }

    /* renamed from: a */
    private void m243205a(int i) {
        int i2 = this.f156447c;
        if (i != i2) {
            this.f156446b[i2].mo215376b(false);
            this.f156447c = i;
            this.f156446b[i].mo215376b(true);
            AbstractC62272a aVar = this.f156448d;
            if (aVar != null) {
                aVar.onTabChanged(i, this.f156445a.mo215413b(i));
            }
        }
    }

    /* renamed from: a */
    public void mo215368a(boolean z) {
        removeAllViews();
        if (this.f156445a != null) {
            int a = C60776r.m236139a();
            int b = C60776r.m236144b();
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(C60773o.m236115a(14.0d), 0, C60773o.m236115a(14.0d), 0);
            linearLayout.setOrientation(0);
            int count = this.f156445a.getCount();
            this.f156446b = new C62273b[count];
            for (int i = 0; i < count; i++) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.labs_tab_title_layout, (ViewGroup) linearLayout, false);
                if (MagicWindowUtil.m224686d(getContext()) || ((double) a) >= ((double) b) * 0.8d) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.rightMargin = C60773o.m236115a(18.0d);
                    layoutParams.leftMargin = C60773o.m236115a(18.0d);
                    inflate.setLayoutParams(layoutParams);
                } else {
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.rightMargin = C60773o.m236115a(10.0d);
                    layoutParams2.leftMargin = C60773o.m236115a(10.0d);
                    inflate.setLayoutParams(layoutParams2);
                }
                C62273b bVar = new C62273b(inflate);
                bVar.mo215374a(this.f156445a.mo215410a(getContext(), i));
                bVar.mo215375a(this.f156445a.mo215412a(i));
                inflate.setOnClickListener(new View.OnClickListener(i) {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.labs.page.$$Lambda$LabsPageTitlesView$AFl4wjPs7kNkItxBS2QFR4A3WY */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void onClick(View view) {
                        LabsPageTitlesView.m271307lambda$AFl4wjPs7kNkItxBS2QFR4A3WY(LabsPageTitlesView.this, this.f$1, view);
                    }
                });
                this.f156446b[i] = bVar;
                if (i == this.f156447c && !z) {
                    bVar.mo215376b(true);
                }
                linearLayout.addView(inflate);
            }
            addView(linearLayout, new ViewGroup.LayoutParams(-2, -1));
            if (MagicWindowUtil.m224686d(getContext()) || ((double) a) >= ((double) b) * 0.8d) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams3.gravity = 17;
                linearLayout.setLayoutParams(layoutParams3);
            } else {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams4.gravity = 8388611;
                linearLayout.setLayoutParams(layoutParams4);
            }
            post(new Runnable() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.page.$$Lambda$LabsPageTitlesView$NGrIEYheOXOga__cbrwC8kmdqUw */

                public final void run() {
                    LabsPageTitlesView.lambda$NGrIEYheOXOga__cbrwC8kmdqUw(LabsPageTitlesView.this);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243206a(int i, View view) {
        m243205a(i);
    }

    public LabsPageTitlesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m243204a();
    }

    public LabsPageTitlesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m243204a();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onScrollChanged(i, i2, i3, i4);
        View view = this.f156449e;
        if (view != null) {
            if (getScrollX() >= getScrollRange_()) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            view.setVisibility(i5);
        }
    }
}
