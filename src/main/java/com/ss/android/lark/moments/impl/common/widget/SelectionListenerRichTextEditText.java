package com.ss.android.lark.moments.impl.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0014J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/SelectionListenerRichTextEditText;", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "selectionChangedListener", "Lcom/ss/android/lark/moments/impl/common/widget/OnSelectionChangedListener;", "onSelectionChanged", "", "selStart", "selEnd", "setSelectionChangedListener", "listener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SelectionListenerRichTextEditText extends RichTextEmojiconEditText {

    /* renamed from: k */
    private OnSelectionChangedListener f119277k;

    public final void setSelectionChangedListener(OnSelectionChangedListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f119277k = eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionListenerRichTextEditText(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public SelectionListenerRichTextEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        OnSelectionChangedListener eVar = this.f119277k;
        if (eVar != null) {
            eVar.mo166266a(i, i2);
        }
    }

    public SelectionListenerRichTextEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
