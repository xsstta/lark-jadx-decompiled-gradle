package com.bytedance.ies.xelement.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.ies.xelement.input.LynxInputConnectionWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ies/xelement/input/LynxEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "inputConnection", "Lcom/bytedance/ies/xelement/input/LynxInputConnectionWrapper;", "init", "", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "setBackSpaceListener", "backSpaceListener", "Lcom/bytedance/ies/xelement/input/LynxInputConnectionWrapper$BackspaceListener;", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
public final class LynxEditText extends AppCompatEditText {

    /* renamed from: a */
    private LynxInputConnectionWrapper f38166a;

    /* renamed from: a */
    public final LynxInputConnectionWrapper mo53286a() {
        return this.f38166a;
    }

    /* renamed from: b */
    private final void m58553b() {
        this.f38166a = new LynxInputConnectionWrapper(null, true);
    }

    public final void setBackSpaceListener(LynxInputConnectionWrapper.BackspaceListener aVar) {
        LynxInputConnectionWrapper bVar = this.f38166a;
        if (bVar != null) {
            bVar.mo53358a(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxEditText(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m58553b();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            try {
                LynxInputConnectionWrapper bVar = this.f38166a;
                if (bVar != null) {
                    bVar.setTarget(onCreateInputConnection);
                }
                return this.f38166a;
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        m58553b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        m58553b();
    }
}
