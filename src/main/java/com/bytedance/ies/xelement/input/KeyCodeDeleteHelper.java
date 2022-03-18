package com.bytedance.ies.xelement.input;

import android.text.Editable;
import android.text.Selection;
import com.bytedance.ies.xelement.text.emoji.LynxEmojiSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/xelement/input/KeyCodeDeleteHelper;", "", "()V", "onDelDown", "", "editableText", "Landroid/text/Editable;", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xelement.input.a */
public final class KeyCodeDeleteHelper {

    /* renamed from: a */
    public static final KeyCodeDeleteHelper f38202a = new KeyCodeDeleteHelper();

    private KeyCodeDeleteHelper() {
    }

    /* renamed from: a */
    public final boolean mo53357a(Editable editable) {
        LynxEmojiSpan dVar;
        boolean z;
        Intrinsics.checkParameterIsNotNull(editable, "editableText");
        Editable editable2 = editable;
        int selectionStart = Selection.getSelectionStart(editable2);
        int selectionEnd = Selection.getSelectionEnd(editable2);
        Object[] spans = editable.getSpans(selectionStart, selectionEnd, LynxEmojiSpan.class);
        Intrinsics.checkExpressionValueIsNotNull(spans, "editableText.getSpans(se…ynxEmojiSpan::class.java)");
        int length = spans.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                dVar = null;
                break;
            }
            dVar = spans[i];
            if (editable.getSpanEnd((LynxEmojiSpan) dVar) == selectionStart) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        LynxEmojiSpan dVar2 = dVar;
        if (dVar2 != null) {
            if (selectionStart == selectionEnd) {
                z2 = true;
            }
            editable.delete(editable.getSpanStart(dVar2), editable.getSpanEnd(dVar2));
        }
        return z2;
    }
}
