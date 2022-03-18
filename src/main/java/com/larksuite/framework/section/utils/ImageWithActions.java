package com.larksuite.framework.section.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.larksuite.framework.section.IActionDispatcher;
import com.ss.android.lark.ui.IActionTitlebar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/larksuite/framework/section/utils/ImageWithActions;", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "image", "Landroid/graphics/drawable/Drawable;", "dispatcher", "Lcom/larksuite/framework/section/IActionDispatcher;", "actions", "", "", "(Landroid/graphics/drawable/Drawable;Lcom/larksuite/framework/section/IActionDispatcher;[I)V", "getActions", "()[I", "lastActionTime", "", "performAction", "", "view", "Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.a.d */
public final class ImageWithActions extends IActionTitlebar.C57573a {

    /* renamed from: a */
    private long f64020a;

    /* renamed from: b */
    private final IActionDispatcher f64021b;

    /* renamed from: c */
    private final int[] f64022c;

    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
    public void performAction(View view) {
        if (System.currentTimeMillis() - this.f64020a >= ((long) 1000)) {
            this.f64020a = System.currentTimeMillis();
            for (int i : this.f64022c) {
                this.f64021b.mo92064a(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageWithActions(Drawable drawable, IActionDispatcher cVar, int... iArr) {
        super(drawable);
        Intrinsics.checkParameterIsNotNull(drawable, "image");
        Intrinsics.checkParameterIsNotNull(cVar, "dispatcher");
        Intrinsics.checkParameterIsNotNull(iArr, "actions");
        this.f64021b = cVar;
        this.f64022c = iArr;
    }
}
