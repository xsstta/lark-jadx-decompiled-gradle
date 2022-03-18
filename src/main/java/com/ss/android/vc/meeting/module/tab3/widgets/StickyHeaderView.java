package com.ss.android.vc.meeting.module.tab3.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

public class StickyHeaderView extends RelativeLayout {

    /* renamed from: a */
    private StickyRecyclerView f160191a;

    /* renamed from: b */
    private TextView f160192b;

    /* renamed from: c */
    private LinearLayout f160193c;

    /* renamed from: d */
    private boolean f160194d;

    /* renamed from: a */
    public void mo219458a() {
        this.f160192b.setText(C60773o.m236119a((int) R.string.View_MV_HistoryRecords));
        this.f160192b.setTextColor(C60773o.m236126d(R.color.text_title));
        this.f160193c.setVisibility(8);
    }

    public void setParent(StickyRecyclerView stickyRecyclerView) {
        this.f160191a = stickyRecyclerView;
    }

    public StickyHeaderView(Context context) {
        this(context, null);
    }

    public void setOnMoreListener(View.OnClickListener onClickListener) {
        this.f160193c.setOnClickListener(new View.OnClickListener(onClickListener) {
            /* class com.ss.android.vc.meeting.module.tab3.widgets.$$Lambda$StickyHeaderView$qmLf763qkGH3hWDx9eBMHe8vsdY */
            public final /* synthetic */ View.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                StickyHeaderView.this.m248518a((StickyHeaderView) this.f$1, (View.OnClickListener) view);
            }
        });
    }

    /* renamed from: a */
    private void m248517a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.vc_view_tab_sticky_header, this);
        this.f160192b = (TextView) findViewById(R.id.tv_title);
        this.f160193c = (LinearLayout) findViewById(R.id.ll_more);
    }

    /* renamed from: a */
    public void mo219459a(int i) {
        this.f160192b.setText(C60773o.m236119a((int) R.string.View_MV_OngoingNow));
        this.f160192b.setTextColor(C60773o.m236126d(R.color.function_success_600));
        this.f160193c.setVisibility(8);
    }

    /* renamed from: a */
    public void mo219460a(MotionEvent motionEvent) {
        boolean a = m248519a(this.f160193c, motionEvent);
        if (a || this.f160193c.getBackground() != null) {
            if (motionEvent.getAction() == 0) {
                this.f160194d = true;
                this.f160193c.setBackgroundResource(R.drawable.vc_tab_more_bg_pressed);
            } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f160193c.setBackground(null);
                if (a && this.f160194d && motionEvent.getAction() == 1) {
                    this.f160194d = false;
                    this.f160193c.performClick();
                }
            }
            this.f160191a.invalidate();
        }
    }

    /* renamed from: a */
    public void mo219461a(boolean z) {
        int i;
        this.f160192b.setText(C60773o.m236119a((int) R.string.View_MV_AboutToStart));
        this.f160192b.setTextColor(C60773o.m236126d(R.color.text_title));
        LinearLayout linearLayout = this.f160193c;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m248518a(View.OnClickListener onClickListener, View view) {
        this.f160194d = false;
        onClickListener.onClick(view);
    }

    public StickyHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m248519a(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (view.getVisibility() != 0 || rect.left >= rect.right || rect.top >= rect.bottom || x < rect.left || x >= rect.right || y < rect.top) {
            return false;
        }
        return true;
    }

    public StickyHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public StickyHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m248517a(context);
    }
}
