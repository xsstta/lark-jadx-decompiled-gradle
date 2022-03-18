package com.ss.android.lark.chat.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.chat.video.e */
public class C34406e extends AbstractView$OnAttachStateChangeListenerC52070a {

    /* renamed from: a */
    public View.OnClickListener f88840a;

    /* renamed from: b */
    private ViewGroup f88841b;

    /* renamed from: c */
    private View.OnClickListener f88842c;

    /* renamed from: d */
    private TextView f88843d;

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h
    /* renamed from: a */
    public void mo127010a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: b */
    public void mo127043b() {
        super.mo127043b();
        mo178425b(8);
        this.f88841b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.chat.video.C34406e.C344071 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C34406e.this.f88840a != null) {
                    C34406e.this.f88840a.onClick(view);
                }
            }
        });
        this.f88841b.findViewById(R.id.error_close).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.chat.video.$$Lambda$e$I73Yk58Oz8RTIIL9Msh17gEAWrU */

            public final void onClick(View view) {
                C34406e.lambda$I73Yk58Oz8RTIIL9Msh17gEAWrU(C34406e.this, view);
            }
        });
    }

    public C34406e(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void mo127044b(View.OnClickListener onClickListener) {
        this.f88840a = onClickListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m133406a(View view) {
        View.OnClickListener onClickListener = this.f88842c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.player.p2511a.AbstractView$OnAttachStateChangeListenerC52070a
    /* renamed from: a */
    public View mo127009a(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.online_error_cover, (ViewGroup) null);
        this.f88841b = viewGroup;
        this.f88843d = (TextView) viewGroup.findViewById(R.id.video_error_tv);
        return this.f88841b;
    }

    /* renamed from: a */
    public void mo127042a(View.OnClickListener onClickListener) {
        this.f88842c = onClickListener;
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: a */
    public void mo127014a(int i, Bundle bundle) {
        mo178425b(8);
    }

    @Override // com.ss.android.lark.player.p2511a.AbstractC52086h, com.ss.android.lark.player.p2511a.AbstractC52071b
    /* renamed from: c */
    public void mo127025c(int i, Bundle bundle) {
        this.f88843d.setText(R.string.Lark_Legacy_RecallMessage);
        mo178425b(0);
    }
}
