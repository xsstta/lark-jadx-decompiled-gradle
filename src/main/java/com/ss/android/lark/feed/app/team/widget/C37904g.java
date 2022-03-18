package com.ss.android.lark.feed.app.team.widget;

import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;

/* renamed from: com.ss.android.lark.feed.app.team.widget.g */
public class C37904g extends BaseTeamChatViewHolder {

    /* renamed from: a */
    public TeamShownChatView f97230a;

    /* renamed from: b */
    public View f97231b;

    /* renamed from: c */
    private float f97232c;

    @Override // com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23298h
    /* renamed from: k */
    public View mo80851k() {
        return this.f97230a.f97191a;
    }

    /* renamed from: l */
    public void mo138840l() {
        this.f97230a.f97196f.setVisibility(8);
    }

    /* renamed from: m */
    private void m149142m() {
        float f = -(((float) this.f97230a.f97199i.getMeasuredWidth()) / ((float) DeviceUtils.getScreenWidth(this.itemView.getContext())));
        this.f97232c = f;
        mo80866c(f);
    }

    /* renamed from: a */
    public void mo138837a(View.OnClickListener onClickListener) {
        this.f97230a.f97198h.setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    public void mo138838b(View.OnClickListener onClickListener) {
        this.f97230a.f97197g.setOnClickListener(onClickListener);
    }

    public C37904g(TeamShownChatView teamShownChatView) {
        super(teamShownChatView);
        this.f97230a = teamShownChatView;
        this.f97231b = teamShownChatView.f97191a;
    }

    /* renamed from: e */
    private void m149141e(float f) {
        this.f97230a.mo138821a(f / this.f97232c);
    }

    /* renamed from: b */
    public void mo138839b(boolean z) {
        this.f97230a.f97196f.setVisibility(0);
        if (z) {
            TeamShownChatView teamShownChatView = this.f97230a;
            teamShownChatView.f97199i = teamShownChatView.f97198h;
            this.f97230a.f97198h.setVisibility(0);
            this.f97230a.f97197g.setVisibility(8);
        } else {
            TeamShownChatView teamShownChatView2 = this.f97230a;
            teamShownChatView2.f97199i = teamShownChatView2.f97197g;
            this.f97230a.f97198h.setVisibility(8);
            this.f97230a.f97197g.setVisibility(0);
        }
        m149142m();
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23303b, com.h6ah4i.android.widget.advrecyclerview.swipeable.AbstractC23298h
    /* renamed from: a */
    public void mo80836a(float f, float f2, boolean z) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            m149141e(f);
        }
    }
}
