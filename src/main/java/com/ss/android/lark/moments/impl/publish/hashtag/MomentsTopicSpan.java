package com.ss.android.lark.moments.impl.publish.hashtag;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/hashtag/MomentsTopicSpan;", "Landroid/text/style/ForegroundColorSpan;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsTopicSpan extends ForegroundColorSpan {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsTopicSpan(Context context) {
        super(UIUtils.getColor(context, R.color.text_link_normal));
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
