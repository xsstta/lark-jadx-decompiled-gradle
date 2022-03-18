package com.ss.android.lark.mm.module.reaction;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.widget.MmViewFlipper;

public class ReactionTipsLayout extends FrameLayout {

    /* renamed from: a */
    private Handler f117818a;

    /* renamed from: b */
    private MmViewFlipper f117819b;

    /* renamed from: c */
    private Runnable f117820c;

    /* renamed from: b */
    private void m185489b() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_layout_reaction_tips, (ViewGroup) this, true);
        this.f117819b = (MmViewFlipper) findViewById(R.id.id_mm_reaction_flip);
    }

    /* renamed from: c */
    private void m185490c() {
        if (getParent() != null && (getParent() instanceof ViewGroup)) {
            ((ViewGroup) getParent()).removeView(this);
            this.f117818a.removeCallbacks(this.f117820c);
        }
    }

    /* renamed from: a */
    public void mo164451a() {
        C45855f.m181663b("ReactionTipsLayout", "dismiss");
        this.f117819b.mo165621a();
        this.f117818a.removeCallbacks(this.f117820c);
        m185490c();
    }

    public ReactionTipsLayout(Context context) {
        this(context, null);
    }

    public ReactionTipsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117818a = new Handler(Looper.getMainLooper());
        this.f117820c = new Runnable() {
            /* class com.ss.android.lark.mm.module.reaction.ReactionTipsLayout.RunnableC468101 */

            public void run() {
                ReactionTipsLayout.this.mo164451a();
            }
        };
        m185489b();
    }
}
