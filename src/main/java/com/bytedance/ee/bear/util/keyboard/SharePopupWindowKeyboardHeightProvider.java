package com.bytedance.ee.bear.util.keyboard;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/util/keyboard/SharePopupWindowKeyboardHeightProvider;", "Lcom/bytedance/ee/bear/util/keyboard/BaseKeyboardHeightProvider;", "activity", "Landroid/app/Activity;", "sharedPopupWindow", "Landroid/widget/PopupWindow;", "sharedPopupWindowContentView", "Landroid/view/ViewGroup;", "(Landroid/app/Activity;Landroid/widget/PopupWindow;Landroid/view/ViewGroup;)V", "createPopupWindow", "context", "Landroid/content/Context;", "contentView", "Landroid/view/View;", "util_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.q.a.i */
public final class SharePopupWindowKeyboardHeightProvider extends BaseKeyboardHeightProvider {

    /* renamed from: j */
    private final PopupWindow f28329j;

    /* renamed from: k */
    private final ViewGroup f28330k;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.util.keyboard.BaseKeyboardHeightProvider
    /* renamed from: a */
    public PopupWindow mo39922a(Context context, View view) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        this.f28330k.addView(view, -1, -1);
        return this.f28329j;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePopupWindowKeyboardHeightProvider(Activity activity, PopupWindow popupWindow, ViewGroup viewGroup) {
        super(activity);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(popupWindow, "sharedPopupWindow");
        Intrinsics.checkParameterIsNotNull(viewGroup, "sharedPopupWindowContentView");
        this.f28329j = popupWindow;
        this.f28330k = viewGroup;
        super.mo39930d();
    }
}
