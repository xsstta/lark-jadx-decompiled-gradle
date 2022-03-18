package com.ss.android.lark.search.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.lark.search.widget.params.ChatterPickerParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/search/widget/ChatterPicker;", "Lcom/ss/android/lark/search/widget/AbsChatterPicker;", "Lcom/ss/android/lark/search/widget/params/ChatterPickerParams;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatterPicker extends AbsChatterPicker<ChatterPickerParams, ChatterPicker> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatterPicker(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatterPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
