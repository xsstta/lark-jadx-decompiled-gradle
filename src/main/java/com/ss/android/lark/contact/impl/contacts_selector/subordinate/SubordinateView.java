package com.ss.android.lark.contact.impl.contacts_selector.subordinate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;

public class SubordinateView extends LinearLayout {

    /* renamed from: a */
    private AbstractC35774b f92498a;
    @BindView(7122)
    RelativeLayout mHeader;
    @BindView(7071)
    TextView mManageEntry;
    @BindView(8157)
    LinearLayout mSubordinateContainer;
    @BindView(7069)
    ImageView mTenantAvatar;
    @BindView(7070)
    View mTenantInfo;
    @BindView(7072)
    TextView mTenantName;

    public ViewGroup getHeaderViewGroup() {
        return this.mHeader;
    }

    public AbstractC35774b getOnItemClickListener() {
        return this.f92498a;
    }

    public ViewGroup getSubordinateContainer() {
        return this.mSubordinateContainer;
    }

    /* renamed from: a */
    public void mo131672a() {
        this.mSubordinateContainer.removeAllViews();
    }

    /* renamed from: b */
    private void m140022b() {
        LayoutInflater.from(getContext()).inflate(R.layout.subordinate_view_container, (ViewGroup) this, true);
        ButterKnife.bind(this);
    }

    public void setOnItemClickListener(AbstractC35774b bVar) {
        this.f92498a = bVar;
    }

    public SubordinateView(Context context) {
        this(context, null);
    }

    public SubordinateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SubordinateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m140022b();
    }
}
