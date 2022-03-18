package com.ss.android.lark.todo.impl.features.detail.common;

import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/common/TodoKeyboardUtil;", "", "()V", "updateRichTextEditText", "Lcom/ss/android/lark/widget/richtext/RichText;", "forceUpdate", "", "richEditText", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "modelRichText", "selectionEnd", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.common.c */
public final class TodoKeyboardUtil {

    /* renamed from: a */
    public static final TodoKeyboardUtil f139925a = new TodoKeyboardUtil();

    private TodoKeyboardUtil() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.common.c$a */
    static final class RunnableC56569a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RichTextEmojiconEditText f139926a;

        RunnableC56569a(RichTextEmojiconEditText richTextEmojiconEditText) {
            this.f139926a = richTextEmojiconEditText;
        }

        public final void run() {
            RichTextEmojiconEditText richTextEmojiconEditText = this.f139926a;
            richTextEmojiconEditText.setSelection(richTextEmojiconEditText.length());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.common.c$b */
    static final class RunnableC56570b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f139927a;

        /* renamed from: b */
        final /* synthetic */ RichTextEmojiconEditText f139928b;

        RunnableC56570b(int i, RichTextEmojiconEditText richTextEmojiconEditText) {
            this.f139927a = i;
            this.f139928b = richTextEmojiconEditText;
        }

        public final void run() {
            int i = this.f139927a;
            if (i >= 0 && i <= this.f139928b.length()) {
                this.f139928b.setSelection(this.f139927a);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final RichText m220375a(boolean z, RichTextEmojiconEditText richTextEmojiconEditText, RichText richText, boolean z2) {
        boolean z3;
        Intrinsics.checkParameterIsNotNull(richTextEmojiconEditText, "richEditText");
        if (!z && !(!Intrinsics.areEqual(richTextEmojiconEditText.getDraftRichText(), richText))) {
            return null;
        }
        int selectionEnd = richTextEmojiconEditText.getSelectionEnd();
        richTextEmojiconEditText.setText("");
        C59033g.m229196a(richText, richTextEmojiconEditText.getRichTextRender());
        String obj = richTextEmojiconEditText.getText().toString();
        if (obj.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && obj.charAt(obj.length() - 1) == '\n') {
            richTextEmojiconEditText.getText().delete(obj.length() - 1, obj.length());
        }
        if (z2) {
            richTextEmojiconEditText.post(new RunnableC56569a(richTextEmojiconEditText));
        } else {
            richTextEmojiconEditText.post(new RunnableC56570b(selectionEnd, richTextEmojiconEditText));
        }
        return richTextEmojiconEditText.getDraftRichText();
    }
}
