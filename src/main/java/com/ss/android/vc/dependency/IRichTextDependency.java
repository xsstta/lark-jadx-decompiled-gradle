package com.ss.android.vc.dependency;

import com.bytedance.lark.pb.basic.v1.RichText;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/vc/dependency/IRichTextDependency;", "", "parsePbFromRichText", "Lcom/bytedance/lark/pb/basic/v1/RichText;", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "parseRichTextFromPb", "pbRichText", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.dependency.ai */
public interface IRichTextDependency {
    RichText parsePbFromRichText(com.ss.android.lark.widget.richtext.RichText richText);

    com.ss.android.lark.widget.richtext.RichText parseRichTextFromPb(RichText richText);
}
