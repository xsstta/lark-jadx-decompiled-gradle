package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.loading.LKUILoadingView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;

public class CalendarLoadingView extends LinearLayout {
    @BindView(9392)
    LinearLayout mErrorTipPanel;
    @BindView(11472)
    ImageView mImageView;
    @BindView(10117)
    LinearLayout mLoadingPanel;
    @BindView(11513)
    TextView mLoadingText;
    @BindView(10120)
    LKUILoadingView mLoadingView;
    @BindView(11297)
    CommonTitleBar mTitleBar;
    @BindView(11301)
    View mTitleBarDivider;
    @BindView(11473)
    TextView mTvErrorTip;

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView$a */
    public interface AbstractC31882a {
        /* renamed from: a */
        void mo110519a();

        /* renamed from: b */
        void mo110520b();
    }

    /* renamed from: a */
    public void mo116402a() {
        this.mLoadingPanel.setVisibility(0);
        UIUtils.show(this.mLoadingView);
        this.mLoadingView.playAnimation();
        this.mErrorTipPanel.setVisibility(8);
    }

    /* renamed from: b */
    public void mo116404b() {
        this.mLoadingPanel.setVisibility(8);
        this.mLoadingView.cancelAnimation();
        UIUtils.hide(this.mLoadingView);
        this.mErrorTipPanel.setVisibility(8);
    }

    /* renamed from: c */
    public void mo116405c() {
        this.mLoadingPanel.setVisibility(8);
        this.mLoadingView.cancelAnimation();
        UIUtils.hide(this.mLoadingView);
        this.mErrorTipPanel.setVisibility(0);
    }

    public CalendarLoadingView(Context context) {
        this(context, null);
    }

    public void setErrorText(String str) {
        this.mTvErrorTip.setText(str);
    }

    public void setErrorTipPanel(Drawable drawable) {
        this.mImageView.setImageDrawable(drawable);
    }

    public void setLoadingText(String str) {
        this.mLoadingText.setText(str);
    }

    public void setTitleBarDividerVisibility(int i) {
        this.mTitleBarDivider.setVisibility(i);
    }

    public void setTitleBarText(String str) {
        this.mTitleBar.setTitle(str);
    }

    public void setTitleBarVisibility(int i) {
        this.mTitleBar.setVisibility(i);
    }

    public void setTitleLeftImageResource(int i) {
        this.mTitleBar.setLeftImageResource(i);
    }

    public void setOnLoadingViewClickedListener(final AbstractC31882a aVar) {
        this.mErrorTipPanel.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.View$OnClickListenerC318801 */

            public void onClick(View view) {
                aVar.mo110519a();
            }
        });
        this.mTitleBar.setLeftClickListener(new AbstractView$OnClickListenerC32626b() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.C318812 */

            @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
            /* renamed from: a */
            public void mo108751a(View view) {
                aVar.mo110520b();
            }
        });
    }

    public CalendarLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        ButterKnife.bind(LayoutInflater.from(context).inflate(R.layout.view_calendar_loading, (ViewGroup) this, true), this);
        setBackgroundColor(getResources().getColor(R.color.bg_body));
        this.mTitleBar.setDividerVisible(false);
    }

    /* renamed from: a */
    public void mo116403a(int i, int i2, int i3, int i4) {
        ((LinearLayout.LayoutParams) this.mErrorTipPanel.getLayoutParams()).setMargins(i, i2, i3, i4);
    }
}
