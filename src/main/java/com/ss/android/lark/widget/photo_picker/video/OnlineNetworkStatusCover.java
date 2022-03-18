package com.ss.android.lark.widget.photo_picker.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.larksuite.suite.R;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;

public class OnlineNetworkStatusCover extends AbstractView$OnAttachStateChangeListenerC52070a {

    /* renamed from: a */
    private ViewGroup f145581a;

    /* renamed from: b */
    private AbstractC58852a f145582b;

    /* renamed from: c */
    private AbstractC58853b f145583c;
    @BindView(6655)
    View mStatusCancel;
    @BindView(6656)
    View mStatusContinue;
    @BindView(6657)
    TextView mStatusTip;

    /* renamed from: com.ss.android.lark.widget.photo_picker.video.OnlineNetworkStatusCover$a */
    public interface AbstractC58852a {
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.video.OnlineNetworkStatusCover$b */
    public interface AbstractC58853b {
        /* renamed from: a */
        void mo199107a();

        /* renamed from: b */
        void mo199108b();
    }

    /* renamed from: c */
    private void m228298c() {
        mo178425b(8);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
        ButterKnife.bind(this, this.f145581a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: b */
    public void mo127043b() {
        super.mo127043b();
        m228298c();
    }

    public OnlineNetworkStatusCover(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo199449a(AbstractC58852a aVar) {
        this.f145582b = aVar;
    }

    @OnClick({6655})
    public void onCancelClick(View view) {
        AbstractC58853b bVar = this.f145583c;
        if (bVar != null) {
            bVar.mo199107a();
        }
    }

    @OnClick({6656})
    public void onContinueClick(View view) {
        AbstractC58853b bVar = this.f145583c;
        if (bVar != null) {
            bVar.mo199108b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.online_network_status_cover, (ViewGroup) null);
        this.f145581a = viewGroup;
        return viewGroup;
    }

    /* renamed from: a */
    public void mo199450a(AbstractC58853b bVar) {
        this.f145583c = bVar;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        if (i == -99053) {
            mo178425b(8);
        }
    }
}
