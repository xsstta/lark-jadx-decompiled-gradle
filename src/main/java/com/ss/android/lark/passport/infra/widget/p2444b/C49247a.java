package com.ss.android.lark.passport.infra.widget.p2444b;

import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.log.PassportLog;

/* renamed from: com.ss.android.lark.passport.infra.widget.b.a */
public class C49247a extends ClickableSpan {

    /* renamed from: a */
    private final Context f123617a;

    /* renamed from: b */
    private final View.OnClickListener f123618b;

    /* renamed from: c */
    private long f123619c;

    /* renamed from: d */
    private boolean f123620d;

    /* renamed from: com.ss.android.lark.passport.infra.widget.b.a$a */
    public interface AbstractView$OnClickListenerC49248a extends View.OnClickListener {
    }

    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f123619c > 500) {
            this.f123619c = elapsedRealtime;
            View.OnClickListener onClickListener = this.f123618b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f123617a != null) {
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f123617a.getResources().getColor(R.color.primary_pri_500));
            if (this.f123620d) {
                try {
                    textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                } catch (Exception e) {
                    PassportLog.f123351c.mo171474a().mo171471d("error", e.getMessage());
                }
            }
        }
    }

    public C49247a(Context context, View.OnClickListener onClickListener) {
        this(context, onClickListener, false);
    }

    public C49247a(Context context, View.OnClickListener onClickListener, boolean z) {
        this.f123617a = context;
        this.f123618b = onClickListener;
        this.f123620d = z;
    }
}
