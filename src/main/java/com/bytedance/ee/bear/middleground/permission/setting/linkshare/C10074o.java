package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.o */
public class C10074o extends ClickableSpan {

    /* renamed from: a */
    private Context f27216a;

    /* renamed from: b */
    private AbstractView$OnClickListenerC10075a f27217b;

    /* renamed from: c */
    private long f27218c;

    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.o$a */
    public interface AbstractView$OnClickListenerC10075a extends View.OnClickListener {

        /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.o$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$a(AbstractView$OnClickListenerC10075a aVar, TextPaint textPaint) {
                return false;
            }
        }

        /* renamed from: a */
        boolean mo36610a(TextPaint textPaint);
    }

    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f27218c > 500) {
            this.f27218c = elapsedRealtime;
            AbstractView$OnClickListenerC10075a aVar = this.f27217b;
            if (aVar != null) {
                aVar.onClick(view);
            }
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (!this.f27217b.mo36610a(textPaint)) {
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f27216a.getResources().getColor(R.color.space_kit_b500));
        }
    }

    public C10074o(Context context, AbstractView$OnClickListenerC10075a aVar) {
        this.f27216a = context;
        this.f27217b = aVar;
    }
}
