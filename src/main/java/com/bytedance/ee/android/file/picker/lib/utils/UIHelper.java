package com.bytedance.ee.android.file.picker.lib.utils;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/UIHelper;", "", "()V", "Companion", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.utils.l */
public final class UIHelper {

    /* renamed from: a */
    public static final Companion f12487a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/utils/UIHelper$Companion;", "", "()V", "dp2px", "", "context", "Landroid/content/Context;", "dpValue", "", "getColor", "resId", "getString", "", "px2sp", "pxValue", "sp2px", "sp", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.utils.l$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo16122a(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            String string = context.getString(i);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(resId)");
            return string;
        }

        /* renamed from: b */
        public final int mo16123b(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return context.getResources().getColor(i);
        }

        /* renamed from: a */
        public final int mo16121a(Context context, float f) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Resources resources = context.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
            return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
        }
    }
}
