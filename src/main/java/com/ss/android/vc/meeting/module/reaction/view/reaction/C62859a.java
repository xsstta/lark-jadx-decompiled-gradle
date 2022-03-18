package com.ss.android.vc.meeting.module.reaction.view.reaction;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;

/* renamed from: com.ss.android.vc.meeting.module.reaction.view.reaction.a */
public class C62859a extends AbstractC63524a<C62859a> {

    /* renamed from: a */
    public final String f158278a;

    /* renamed from: b */
    public final C61303k f158279b;

    /* renamed from: c */
    public LongClickReactionView f158280c;

    /* renamed from: d */
    public Handler f158281d = new Handler(Looper.getMainLooper());

    /* renamed from: p */
    private Context f158282p;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219686a(R.layout.popup_window_long_click_reaciton);
        mo219688a(true);
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: c */
    public void mo211398c() {
        this.f158281d.removeCallbacksAndMessages(null);
        this.f158280c.mo217181a();
        super.mo211398c();
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    public void onDismiss() {
        super.onDismiss();
        this.f158281d.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    private void m246062b() {
        this.f158279b.ar().mo216849a(this.f158278a);
        this.f158281d.postDelayed(new Runnable() {
            /* class com.ss.android.vc.meeting.module.reaction.view.reaction.C62859a.RunnableC628601 */

            public void run() {
                try {
                    C62859a.this.f158279b.ar().mo216849a(C62859a.this.f158278a);
                    C62859a.this.f158280c.mo217182a(1000);
                } catch (Exception e) {
                    C60700b.m235846a("LongClickReactionPopWin", "[sendReactionByLongClick]", e);
                }
                C62859a.this.f158281d.postDelayed(this, 300);
            }
        }, 300);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, C62859a aVar) {
        LongClickReactionView longClickReactionView = (LongClickReactionView) mo219693b(R.id.long_click_reaction);
        this.f158280c = longClickReactionView;
        longClickReactionView.mo217183a(this.f158278a);
    }

    /* renamed from: a */
    public void mo217216a(View view, boolean z) {
        int i;
        int a = C60773o.m236115a(48.0d) + view.getHeight();
        if (z) {
            i = 0;
        } else {
            i = C60773o.m236115a(10.0d);
        }
        mo219691a(view, -C60773o.m236115a(20.0d), -(a + i), 3);
        m246062b();
    }

    /* renamed from: a */
    public static C62859a m246061a(Context context, C61303k kVar, String str) {
        return new C62859a(context, kVar, str);
    }

    private C62859a(Context context, C61303k kVar, String str) {
        mo219694b(context);
        this.f158282p = context;
        this.f158279b = kVar;
        this.f158278a = str;
    }
}
