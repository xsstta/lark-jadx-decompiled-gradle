package com.ss.android.lark.main.app.tab;

import com.ss.android.lark.main.app.tab.NavigationTabEditorView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
public final class NavigationTabEditorView$CallbackHolder$debounce$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0 $func;
    final /* synthetic */ NavigationTabEditorView.CallbackHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationTabEditorView$CallbackHolder$debounce$1(NavigationTabEditorView.CallbackHolder dVar, Function0 function0) {
        super(0);
        this.this$0 = dVar;
        this.$func = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.this$0.mo157527a() > ((long) 3000)) {
            this.this$0.mo157528a(currentTimeMillis);
            this.$func.invoke();
        }
    }
}
