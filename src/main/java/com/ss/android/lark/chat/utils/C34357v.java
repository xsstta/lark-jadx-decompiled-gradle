package com.ss.android.lark.chat.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chatwindow.AbstractC35250i;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.C58512f;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.C70149c;
import pl.droidsonroids.gif.C70164i;

/* renamed from: com.ss.android.lark.chat.utils.v */
public class C34357v {

    /* renamed from: a */
    private static C70149c f88704a;

    /* renamed from: b */
    private static C70149c f88705b;

    /* renamed from: c */
    private static final C70164i f88706c = new C70164i(true);

    /* renamed from: d */
    private static final C70164i f88707d = new C70164i(true);

    /* renamed from: com.ss.android.lark.chat.utils.v$c */
    public interface AbstractC34364c {
        /* renamed from: a */
        void mo122812a();

        /* renamed from: a */
        void mo122813a(String str);
    }

    /* renamed from: a */
    private static void m133271a(SpannableStringBuilder spannableStringBuilder, final String str, String str2, C58512f fVar, final AbstractC34364c cVar) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.ss.android.lark.chat.utils.C34357v.C343592 */

            public void onClick(View view) {
                AbstractC34364c cVar = cVar;
                if (cVar != null) {
                    cVar.mo122813a(str);
                }
            }
        }, length, length2, 33);
        spannableStringBuilder.setSpan(fVar, length, length2, 33);
    }

    /* renamed from: a */
    private static void m133270a(Context context, SpannableStringBuilder spannableStringBuilder, int i, final AbstractC34364c cVar) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m133269a(i));
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new AbstractC35250i(context) {
            /* class com.ss.android.lark.chat.utils.C34357v.C343603 */

            public void onClick(View view) {
                AbstractC34364c cVar = cVar;
                if (cVar != null) {
                    cVar.mo122812a();
                }
            }
        }, length, length2, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(UIUtils.getColor(context, R.color.text_placeholder)), length, length2, 33);
    }

    /* renamed from: a */
    private static String m133269a(int i) {
        return "…" + UIHelper.mustacheFormat((int) R.string.Lark_Chat_BuzzHasMorePerson, "number", Integer.toString(i));
    }

    /* renamed from: a */
    public static String m133268a() {
        return UIUtils.getString(C29990c.m110930b().mo134528a(), R.string.Lark_Legacy_SystemMessageSeparatorComma);
    }

    /* renamed from: com.ss.android.lark.chat.utils.v$a */
    public static class C34361a implements Drawable.Callback {

        /* renamed from: a */
        private final WeakReference<TextView> f88714a;

        public C34361a(TextView textView) {
            this.f88714a = new WeakReference<>(textView);
        }

        public void invalidateDrawable(Drawable drawable) {
            if (this.f88714a.get() != null) {
                this.f88714a.get().invalidate();
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (this.f88714a.get() != null) {
                this.f88714a.get().removeCallbacks(runnable);
            }
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            if (this.f88714a.get() != null) {
                this.f88714a.get().postDelayed(runnable, j);
            }
        }
    }

    /* renamed from: com.ss.android.lark.chat.utils.v$b */
    public static class C34362b extends ClickableSpan {

        /* renamed from: a */
        private long f88715a;

        /* renamed from: b */
        private final AbstractC34363a f88716b;

        /* renamed from: c */
        private final SystemMessageType f88717c;

        /* renamed from: d */
        private final Context f88718d;

        /* renamed from: com.ss.android.lark.chat.utils.v$b$a */
        public interface AbstractC34363a {
            void onRedPacketSystemMessageClicked(SystemMessageType systemMessageType);
        }

        public void onClick(View view) {
            AbstractC34363a aVar;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f88715a = uptimeMillis;
            if (uptimeMillis - this.f88715a >= 500 && (aVar = this.f88716b) != null) {
                aVar.onRedPacketSystemMessageClicked(this.f88717c);
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(UIUtils.getColor(this.f88718d, R.color.function_danger_500));
            textPaint.setUnderlineText(false);
        }

        public C34362b(Context context, SystemMessageType systemMessageType, AbstractC34363a aVar) {
            this.f88718d = context;
            this.f88716b = aVar;
            this.f88717c = systemMessageType;
        }
    }

    /* renamed from: a */
    public static SpannableStringBuilder m133266a(Context context, String str, Drawable.Callback callback) {
        return m133261a(context, new SpannableStringBuilder(str), callback);
    }

    /* renamed from: a */
    public static SpannableStringBuilder m133261a(Context context, SpannableStringBuilder spannableStringBuilder, Drawable.Callback callback) {
        C70164i iVar;
        spannableStringBuilder.append(" ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        int length2 = spannableStringBuilder.length();
        if (f88705b == null) {
            f88705b = C70149c.m268930a(UIHelper.getResources(), (int) R.drawable.anim_keyboard_dot_loading);
        }
        C70149c cVar = f88705b;
        if (!(cVar == null || (iVar = f88707d) == null)) {
            iVar.mo247313a(callback);
            cVar.setCallback(iVar);
            cVar.setBounds(0, UIUtils.dp2px(context, 8.0f), UIUtils.dp2px(context, 19.0f), UIUtils.dp2px(context, 11.0f));
            spannableStringBuilder.setSpan(new ImageSpan(cVar, 1), length, length2, 33);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static SpannableStringBuilder m133265a(Context context, String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.text_placeholder)), Math.max(Math.min(i, length), 0), length, 33);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static SpannableStringBuilder m133262a(Context context, SpannableStringBuilder spannableStringBuilder, Drawable.Callback callback, int i) {
        C70164i iVar;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(" ");
        int length2 = spannableStringBuilder.length();
        if (f88704a == null) {
            f88704a = C70149c.m268930a(UIHelper.getResources(), (int) R.drawable.anim_keyboard_loading);
        }
        C70149c cVar = f88704a;
        if (!(cVar == null || (iVar = f88706c) == null)) {
            iVar.mo247313a(callback);
            cVar.setCallback(iVar);
            int i2 = i / 2;
            cVar.setBounds(0, i2, i, i2 + i);
            spannableStringBuilder.setSpan(new ImageSpan(cVar, 1), length, length2, 33);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static SpannableStringBuilder m133264a(Context context, SystemMessageType systemMessageType, String str, String str2, C34362b.AbstractC34363a aVar) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new C34362b(context, systemMessageType, aVar), indexOf, str2.length() + indexOf, 17);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static SpannableStringBuilder m133267a(final Context context, String str, String str2, String str3, final String str4, final String str5) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(str == null || str2 == null || str3 == null)) {
            int indexOf = str.indexOf(str2);
            int length = str2.length() + indexOf;
            if (indexOf >= 0) {
                spannableStringBuilder.append((CharSequence) str.substring(0, indexOf));
                spannableStringBuilder.append((CharSequence) str3);
                C343581 r2 = new AbstractC35250i(context) {
                    /* class com.ss.android.lark.chat.utils.C34357v.C343581 */

                    public void onClick(View view) {
                        C29990c.m110930b().mo134523V().mo134436a(context, new ProfileSource.C36868a().mo136066c(str4).mo136065b(str5).mo136060a(2).mo136063a());
                    }
                };
                if (!TextUtils.isEmpty(str4)) {
                    spannableStringBuilder.setSpan(r2, indexOf, str3.length() + indexOf, 33);
                }
                spannableStringBuilder.append((CharSequence) str.substring(length));
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x015a, code lost:
        if (r15 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fd A[LOOP:0: B:1:0x004a->B:30:0x00fd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0124 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder m133263a(android.content.Context r22, android.text.SpannableStringBuilder r23, android.text.TextPaint r24, float r25, java.util.Map<java.lang.String, java.lang.String> r26, java.util.List<java.lang.String> r27, com.ss.android.lark.chat.utils.C34357v.AbstractC34364c r28) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.utils.C34357v.m133263a(android.content.Context, android.text.SpannableStringBuilder, android.text.TextPaint, float, java.util.Map, java.util.List, com.ss.android.lark.chat.utils.v$c):android.text.SpannableStringBuilder");
    }
}
