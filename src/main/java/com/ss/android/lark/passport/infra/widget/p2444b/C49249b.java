package com.ss.android.lark.passport.infra.widget.p2444b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.passport.infra.widget.b.b */
public class C49249b extends ClickableSpan {

    /* renamed from: a */
    private final Context f123621a;

    /* renamed from: b */
    private final AbstractView$OnClickListenerC49250a f123622b;

    /* renamed from: c */
    private long f123623c;

    /* renamed from: com.ss.android.lark.passport.infra.widget.b.b$a */
    public interface AbstractView$OnClickListenerC49250a extends View.OnClickListener {

        /* renamed from: com.ss.android.lark.passport.infra.widget.b.b$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$a(AbstractView$OnClickListenerC49250a aVar, TextPaint textPaint) {
                return false;
            }
        }

        /* renamed from: a */
        boolean mo171692a(TextPaint textPaint);
    }

    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f123623c > 500) {
            this.f123623c = elapsedRealtime;
            AbstractView$OnClickListenerC49250a aVar = this.f123622b;
            if (aVar != null) {
                aVar.onClick(view);
            }
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (!this.f123622b.mo171692a(textPaint)) {
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f123621a.getResources().getColor(R.color.primary_pri_500));
        }
    }

    public C49249b(Context context, AbstractView$OnClickListenerC49250a aVar) {
        this.f123621a = context;
        this.f123622b = aVar;
    }
}
