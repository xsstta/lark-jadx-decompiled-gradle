package com.bytedance.ies.xelement.input;

import android.content.Context;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.p1216a.C26547c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ies/xelement/input/LynxInputView;", "Lcom/bytedance/ies/xelement/input/LynxTextAreaView;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "createView", "Lcom/bytedance/ies/xelement/input/LynxEditText;", "p0", "Landroid/content/Context;", "customConfig", "", "editText", "Landroid/widget/EditText;", "customInputTypeSetting", ShareHitPoint.f121869d, "", "customTextAlignSetting", "", "align", "x-element-input_newelement"}, mo238835k = 1, mv = {1, 1, 16})
public class LynxInputView extends LynxTextAreaView {
    @Override // com.bytedance.ies.xelement.input.LynxTextAreaView
    /* renamed from: a */
    public int mo53288a(int i) {
        return 16;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxInputView(AbstractC26684l lVar) {
        super(lVar);
        Intrinsics.checkParameterIsNotNull(lVar, "context");
    }

    @Override // com.bytedance.ies.xelement.input.LynxTextAreaView
    /* renamed from: a */
    public void mo53290a(EditText editText) {
        Intrinsics.checkParameterIsNotNull(editText, "editText");
        editText.setLines(1);
        editText.setSingleLine(true);
        editText.setHorizontallyScrolling(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.input.LynxTextAreaView
    /* renamed from: a */
    public LynxEditText mo33942b(Context context) {
        LynxEditText a = super.mo33942b(context);
        a.setOnEditorActionListener(new C14464a(this, a));
        a.setOnTouchListener(null);
        a.setImeOptions(6);
        return a;
    }

    @Override // com.bytedance.ies.xelement.input.LynxTextAreaView
    /* renamed from: a */
    public void mo53291a(EditText editText, String str) {
        Intrinsics.checkParameterIsNotNull(editText, "editText");
        if (str != null) {
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        editText.setInputType(2);
                        break;
                    }
                    break;
                case 114715:
                    if (str.equals("tel")) {
                        editText.setInputType(3);
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        editText.setInputType(1);
                        break;
                    }
                    break;
                case 95582509:
                    if (str.equals("digit")) {
                        editText.setInputType(8194);
                        break;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        editText.setInputType(32);
                        break;
                    }
                    break;
                case 1216985755:
                    if (str.equals("password")) {
                        editText.setInputType(SmActions.ACTION_ONTHECALL_EXIT);
                        break;
                    }
                    break;
            }
        }
        mo53297b(editText.getInputType());
        int selectionStart = editText.getSelectionStart();
        if (!Intrinsics.areEqual(str, "password")) {
            editText.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        editText.setSelection(selectionStart);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.input.LynxInputView$a */
    public static final class C14464a implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ LynxInputView f38167a;

        /* renamed from: b */
        final /* synthetic */ LynxEditText f38168b;

        C14464a(LynxInputView lynxInputView, LynxEditText lynxEditText) {
            this.f38167a = lynxInputView;
            this.f38168b = lynxEditText;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            String str;
            if (i != 6 && i != 2 && i != 3 && i != 4 && i != 5 && i != 0) {
                return false;
            }
            if (this.f38167a.mo53301e()) {
                AbstractC26684l u = this.f38167a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i2 = u.mo94687i();
                C26547c cVar = new C26547c(this.f38167a.mo94576q(), "confirm");
                Editable text = this.f38168b.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                cVar.mo94347a("value", str);
                i2.mo94075a(cVar);
            }
            if (i == 5) {
                return false;
            }
            this.f38167a.mo53308l();
            return true;
        }
    }
}
