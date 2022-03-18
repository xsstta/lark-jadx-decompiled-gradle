package com.ss.android.lark.guide.ui.common.popup.view;

import android.view.View;
import com.larksuite.framework.ui.BasePopupWindow;
import com.ss.android.lark.guide.ui.common.popup.OnBackPressedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/guide/ui/common/popup/view/TipsPopupWindow;", "Lcom/larksuite/framework/ui/BasePopupWindow;", "contentView", "Landroid/view/View;", "width", "", "height", "(Landroid/view/View;II)V", "backPressedListener", "Lcom/ss/android/lark/guide/ui/common/popup/OnBackPressedListener;", "dismiss", "", "setOnBackPressedListener", "listener", "guide-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guide.ui.common.popup.view.a */
public final class TipsPopupWindow extends BasePopupWindow {

    /* renamed from: a */
    private OnBackPressedListener f99501a;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r4, false, 2, (java.lang.Object) null) != false) goto L_0x007a;
     */
    @Override // com.larksuite.framework.ui.BasePopupWindow
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dismiss() {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.guide.ui.common.popup.view.TipsPopupWindow.dismiss():void");
    }

    /* renamed from: a */
    public final void mo141745a(OnBackPressedListener hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "listener");
        this.f99501a = hVar;
    }

    public TipsPopupWindow(View view, int i, int i2) {
        super(view, i, i2);
    }
}
