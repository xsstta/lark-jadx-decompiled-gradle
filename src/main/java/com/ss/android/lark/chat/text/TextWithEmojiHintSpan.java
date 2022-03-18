package com.ss.android.lark.chat.text;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.core.graphics.C0768a;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/text/TextWithEmojiHintSpan;", "Landroid/text/style/CharacterStyle;", "()V", "mColor", "", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.d.b */
public final class TextWithEmojiHintSpan extends CharacterStyle {

    /* renamed from: a */
    public static final Companion f87592a = new Companion(null);

    /* renamed from: b */
    private final int f87593b = C0768a.m3716c(UIHelper.getColor(R.color.text_title), SmActions.ACTION_ONTHECALL_EXIT);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/text/TextWithEmojiHintSpan$Companion;", "", "()V", "EMOJI_HINT_ALPHA", "", "toHintSpannable", "Landroid/text/Spannable;", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.d.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Spannable mo124139a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "$this$toHintSpannable");
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new TextWithEmojiHintSpan(), 0, str.length(), 17);
            return spannableString;
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(this.f87593b);
        }
    }
}
