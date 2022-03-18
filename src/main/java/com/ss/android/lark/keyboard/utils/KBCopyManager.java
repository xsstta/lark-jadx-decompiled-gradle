package com.ss.android.lark.keyboard.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.linked_emojicon.C58514h;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.span.C59152b;
import com.ss.android.lark.widget.span.C59156f;
import com.ss.android.lark.widget.span.C59179o;
import com.ss.android.lark.widget.span.C59181q;
import com.ss.android.lark.widget.span.TextStyleInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0017H\u0002J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0006\u0010)\u001a\u00020\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/ss/android/lark/keyboard/utils/KBCopyManager;", "", "()V", "copyRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getCopyRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "setCopyRichText", "(Lcom/ss/android/lark/widget/richtext/RichText;)V", "copyText", "", "getCopyText", "()Ljava/lang/String;", "setCopyText", "(Ljava/lang/String;)V", "partialCopyText", "", "getPartialCopyText", "()Z", "setPartialCopyText", "(Z)V", "spanInfoList", "", "Lcom/ss/android/lark/widget/span/TextStyleInfo;", "getSpanInfoList", "()Ljava/util/List;", "setSpanInfoList", "(Ljava/util/List;)V", "doCopy", "", "content", "", "richText", "doParse", "context", "Landroid/content/Context;", "editable", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "isValid", "textStyleInfo", "parseStyleInfo", "reset", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.c.a */
public final class KBCopyManager {

    /* renamed from: a */
    public static final KBCopyManager f103297a = new KBCopyManager();

    /* renamed from: b */
    private static List<TextStyleInfo> f103298b = new ArrayList();

    /* renamed from: c */
    private static String f103299c = "";

    /* renamed from: d */
    private static RichText f103300d;

    /* renamed from: e */
    private static boolean f103301e;

    private KBCopyManager() {
    }

    /* renamed from: a */
    private final boolean m160775a(CharSequence charSequence, TextStyleInfo textStyleInfo) {
        if (!TextUtils.isEmpty(charSequence) && textStyleInfo.start >= 0 && textStyleInfo.end <= charSequence.length()) {
            return TextUtils.equals(charSequence.subSequence(textStyleInfo.start, textStyleInfo.end).toString(), textStyleInfo.text);
        }
        return false;
    }

    /* renamed from: a */
    private final void m160774a(boolean z, CharSequence charSequence) {
        if (z && (charSequence instanceof Spanned)) {
            Spanned spanned = (Spanned) charSequence;
            C58514h[] hVarArr = (C58514h[]) spanned.getSpans(0, charSequence.length(), C58514h.class);
            Intrinsics.checkExpressionValueIsNotNull(hVarArr, "textStyleSpanList");
            for (C58514h hVar : hVarArr) {
                TextStyleInfo textStyleInfo = new TextStyleInfo();
                textStyleInfo.start = spanned.getSpanStart(hVar);
                textStyleInfo.end = spanned.getSpanEnd(hVar);
                textStyleInfo.text = charSequence.subSequence(textStyleInfo.start, textStyleInfo.end).toString();
                Intrinsics.checkExpressionValueIsNotNull(hVar, "span");
                textStyleInfo.isBold = hVar.mo198353a().isBold;
                textStyleInfo.isItalic = hVar.mo198353a().isItalic;
                textStyleInfo.isUnderlineText = hVar.mo198353a().isUnderlineText;
                textStyleInfo.isStrikeThruText = hVar.mo198353a().isStrikeThruText;
                f103298b.add(textStyleInfo);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo146861a(Context context, RichTextEmojiconEditText richTextEmojiconEditText) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(richTextEmojiconEditText, "editable");
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            if (!TextUtils.equals(f103299c, ((ClipboardManager) systemService).getText().toString())) {
                return false;
            }
            if (f103301e || C59035h.m229210a(f103300d)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f103299c);
                if (richTextEmojiconEditText.mo146921a()) {
                    for (T t : f103298b) {
                        if (f103297a.m160775a(f103299c, t)) {
                            int i = ((TextStyleInfo) t).start;
                            int i2 = ((TextStyleInfo) t).end;
                            if (t.isBold) {
                                spannableStringBuilder.setSpan(new C59152b(), i, i2, 34);
                            }
                            if (t.isItalic) {
                                spannableStringBuilder.setSpan(new C59156f(), i, i2, 34);
                            }
                            if (t.isUnderlineText) {
                                spannableStringBuilder.setSpan(new C59181q(), i, i2, 34);
                            }
                            if (t.isStrikeThruText) {
                                spannableStringBuilder.setSpan(new C59179o(), i, i2, 34);
                            }
                        }
                    }
                }
                int selectionStart = richTextEmojiconEditText.getSelectionStart();
                richTextEmojiconEditText.getEditableText().replace(selectionStart, richTextEmojiconEditText.getSelectionEnd(), spannableStringBuilder);
                richTextEmojiconEditText.setSelection(selectionStart + spannableStringBuilder.length());
            } else {
                richTextEmojiconEditText.setIgnoreAtTagOnInsert(true);
                C59033g.m229196a(f103300d, richTextEmojiconEditText.getRichTextRender());
                richTextEmojiconEditText.setIgnoreAtTagOnInsert(false);
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    /* renamed from: a */
    public final void mo146860a(CharSequence charSequence, RichText richText, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "content");
        f103299c = C57814c.m224346a(charSequence).toString();
        f103300d = richText;
        f103301e = z;
        m160774a(z, charSequence);
    }
}
