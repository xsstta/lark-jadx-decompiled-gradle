package com.bytedance.ies.xelement.input;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ies/xelement/input/LynxInputConnectionWrapper;", "Landroid/view/inputmethod/InputConnectionWrapper;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "(Landroid/view/inputmethod/InputConnection;Z)V", "mBackspaceListener", "Lcom/bytedance/ies/xelement/input/LynxInputConnectionWrapper$BackspaceListener;", "deleteSurroundingText", "beforeLength", "", "afterLength", "sendKeyEvent", "event", "Landroid/view/KeyEvent;", "setBackspaceListener", "", "backspaceListener", "BackspaceListener", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.xelement.input.b */
public final class LynxInputConnectionWrapper extends InputConnectionWrapper {

    /* renamed from: a */
    private BackspaceListener f38203a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ies/xelement/input/LynxInputConnectionWrapper$BackspaceListener;", "", "onBackspace", "", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.b$a */
    public interface BackspaceListener {
        /* renamed from: a */
        boolean mo53355a();
    }

    /* renamed from: a */
    public final void mo53358a(BackspaceListener aVar) {
        this.f38203a = aVar;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        BackspaceListener aVar;
        Intrinsics.checkParameterIsNotNull(keyEvent, "event");
        if (keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0 && (aVar = this.f38203a) != null) {
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            if (aVar.mo53355a()) {
                return true;
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    public LynxInputConnectionWrapper(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    public boolean deleteSurroundingText(int i, int i2) {
        BackspaceListener aVar;
        if (i == 1 && i2 == 0 && (aVar = this.f38203a) != null) {
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            if (aVar.mo53355a()) {
                return true;
            }
        }
        return super.deleteSurroundingText(i, i2);
    }
}
