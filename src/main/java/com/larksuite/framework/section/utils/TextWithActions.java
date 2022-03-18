package com.larksuite.framework.section.utils;

import android.view.View;
import com.larksuite.framework.section.IActionDispatcher;
import com.ss.android.lark.ui.IActionTitlebar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¢\u0006\u0002\u0010\tB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¢\u0006\u0002\u0010\u000bB5\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¢\u0006\u0002\u0010\rJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/larksuite/framework/section/utils/TextWithActions;", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "text", "", "dispatcher", "Lcom/larksuite/framework/section/IActionDispatcher;", "actions", "", "", "(Ljava/lang/String;Lcom/larksuite/framework/section/IActionDispatcher;[I)V", "colorRes", "(Ljava/lang/String;ILcom/larksuite/framework/section/IActionDispatcher;[I)V", "textSize", "(Ljava/lang/String;IILcom/larksuite/framework/section/IActionDispatcher;[I)V", "lastActionTime", "", "performAction", "", "view", "Landroid/view/View;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.a.f */
public final class TextWithActions extends IActionTitlebar.TextAction {

    /* renamed from: a */
    private final int[] f64029a;

    /* renamed from: b */
    private final IActionDispatcher f64030b;

    /* renamed from: c */
    private long f64031c;

    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
    public void performAction(View view) {
        if (System.currentTimeMillis() - this.f64031c >= ((long) 1000)) {
            this.f64031c = System.currentTimeMillis();
            for (int i : this.f64029a) {
                this.f64030b.mo92064a(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextWithActions(String str, int i, int i2, IActionDispatcher cVar, int... iArr) {
        super(str, i, i2);
        Intrinsics.checkParameterIsNotNull(str, "text");
        Intrinsics.checkParameterIsNotNull(cVar, "dispatcher");
        Intrinsics.checkParameterIsNotNull(iArr, "actions");
        this.f64029a = iArr;
        this.f64030b = cVar;
    }
}
