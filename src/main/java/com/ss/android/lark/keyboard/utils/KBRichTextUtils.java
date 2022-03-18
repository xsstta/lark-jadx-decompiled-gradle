package com.ss.android.lark.keyboard.utils;

import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/keyboard/utils/KBRichTextUtils;", "", "()V", "isPureRichText", "", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.c.c */
public final class KBRichTextUtils {

    /* renamed from: a */
    public static final KBRichTextUtils f103305a = new KBRichTextUtils();

    @JvmStatic
    /* renamed from: a */
    public static final boolean m160782a(RichText richText) {
        return m160784a(richText, null, 2, null);
    }

    private KBRichTextUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m160783a(RichText richText, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(richText, "richText");
        Intrinsics.checkParameterIsNotNull(str, "title");
        if (richText.getRichTextVersion() == 0) {
            return false;
        }
        List<String> imageIds = richText.getImageIds();
        Intrinsics.checkExpressionValueIsNotNull(imageIds, "richText.imageIds");
        boolean z2 = !imageIds.isEmpty();
        List<String> mediaIds = richText.getMediaIds();
        Intrinsics.checkExpressionValueIsNotNull(mediaIds, "richText.mediaIds");
        boolean z3 = !mediaIds.isEmpty();
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z2 || z3 || z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m160784a(RichText richText, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return m160783a(richText, str);
    }
}
