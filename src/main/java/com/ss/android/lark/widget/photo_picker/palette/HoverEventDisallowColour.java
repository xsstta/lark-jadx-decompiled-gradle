package com.ss.android.lark.widget.photo_picker.palette;

import android.view.MotionEvent;
import com.larksuite.framework.palette.colour.BaseColour;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/palette/HoverEventDisallowColour;", "Lcom/larksuite/framework/palette/colour/BaseColour;", "()V", "onInterceptHoverEvent", "", "event", "Landroid/view/MotionEvent;", "superMethod", "Lkotlin/Function1;", "(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.d.a */
public final class HoverEventDisallowColour extends BaseColour {
    @Override // com.larksuite.framework.palette.colour.BaseColour
    /* renamed from: b */
    public Boolean mo92582b(MotionEvent motionEvent, Function1<? super MotionEvent, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "superMethod");
        return true;
    }
}
