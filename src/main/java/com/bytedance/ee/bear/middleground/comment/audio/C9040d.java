package com.bytedance.ee.bear.middleground.comment.audio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.io.IOException;
import pl.droidsonroids.gif.C70149c;

/* renamed from: com.bytedance.ee.bear.middleground.comment.audio.d */
public class C9040d {

    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.d$a */
    public static class C9041a implements Drawable.Callback {

        /* renamed from: a */
        private TextView f24367a;

        public C9041a(TextView textView) {
            this.f24367a = textView;
        }

        public void invalidateDrawable(Drawable drawable) {
            TextView textView = this.f24367a;
            if (textView != null) {
                textView.invalidate();
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            TextView textView = this.f24367a;
            if (textView != null) {
                textView.removeCallbacks(runnable);
            }
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            TextView textView = this.f24367a;
            if (textView != null) {
                textView.postDelayed(runnable, j);
            }
        }
    }

    /* renamed from: a */
    public static SpannableStringBuilder m37597a(Context context, String str, Drawable.Callback callback) {
        return m37596a(context, new SpannableStringBuilder(str), callback);
    }

    /* renamed from: a */
    public static SpannableStringBuilder m37595a(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.lkui_N500)), Math.max(Math.min(i, length), 0), length, 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static SpannableStringBuilder m37596a(Context context, SpannableStringBuilder spannableStringBuilder, Drawable.Callback callback) {
        spannableStringBuilder.append(" ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        int length2 = spannableStringBuilder.length();
        try {
            C70149c cVar = new C70149c(context.getResources(), (int) R.drawable.comment_anim_keyboard_dot_loading);
            cVar.setCallback(callback);
            cVar.setBounds(0, 0, C13749l.m55758d(context, 19), C13749l.m55758d(context, 3));
            spannableStringBuilder.setSpan(new ImageSpan(cVar, 1), length, length2, 33);
        } catch (IOException e) {
            C13479a.m54759a("SpannableStringUtil", "getLoadingString(): ", e);
        }
        return spannableStringBuilder;
    }
}
