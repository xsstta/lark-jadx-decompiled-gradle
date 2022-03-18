package com.ss.android.lark.filedetail.impl.folder.manage.drawable.property;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"colorInt", "", "context", "Landroid/content/Context;", "px", "", "file-detail_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.drawable.property.b */
public final class C38276b {
    /* renamed from: a */
    public static final float m150589a(int i, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return (float) UIUtils.dp2px(context, (float) i);
    }

    /* renamed from: b */
    public static final int m150590b(int i, Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return UIUtils.getColor(context, i);
    }
}
