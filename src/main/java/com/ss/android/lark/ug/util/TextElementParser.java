package com.ss.android.lark.ug.util;

import com.ss.android.lark.pb.ug_reach.TextElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/util/TextElementParser;", "", "()V", "getText", "", "textElement", "Lcom/ss/android/lark/pb/ug_reach/TextElement;", "isHtmlText", "", "isPlainText", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.j.b */
public final class TextElementParser {

    /* renamed from: a */
    public static final TextElementParser f141734a = new TextElementParser();

    private TextElementParser() {
    }

    /* renamed from: a */
    public final boolean mo195208a(TextElement textElement) {
        Intrinsics.checkParameterIsNotNull(textElement, "textElement");
        if (textElement.mtype == TextElement.TextType.PLAIN) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo195209b(TextElement textElement) {
        Intrinsics.checkParameterIsNotNull(textElement, "textElement");
        if (textElement.mtype == TextElement.TextType.HTML) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final String mo195210c(TextElement textElement) {
        if (textElement != null) {
            if (mo195208a(textElement)) {
                return textElement.mcontent;
            }
            if (mo195209b(textElement)) {
                return textElement.mcontent;
            }
        }
        return null;
    }
}
