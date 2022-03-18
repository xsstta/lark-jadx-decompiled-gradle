package com.ss.android.lark.mm.widget.texthighlightbg;

import android.text.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/widget/texthighlightbg/MmAnnotationSpan;", "Landroid/text/Annotation;", "mKey", "", "mValue", "(Ljava/lang/String;Ljava/lang/String;)V", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmAnnotationSpan extends Annotation {

    /* renamed from: a */
    private final String f118972a;

    /* renamed from: b */
    private final String f118973b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmAnnotationSpan(String str, String str2) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "mKey");
        Intrinsics.checkParameterIsNotNull(str2, "mValue");
        this.f118972a = str;
        this.f118973b = str2;
    }
}
