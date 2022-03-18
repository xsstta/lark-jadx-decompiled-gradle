package com.ss.android.lark.mm.module.share.invite;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0011J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/share/invite/BaseAction;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "init", "", "setAction", "action", "", "setActionEnabled", "isEnabled", "", "setDesc", "desc", "setOnClickListener", "l", "Landroid/view/View$OnClickListener;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public class BaseAction extends RelativeLayout {

    /* renamed from: a */
    private HashMap f118303a;

    /* renamed from: a */
    public View mo163516a(int i) {
        if (this.f118303a == null) {
            this.f118303a = new HashMap();
        }
        View view = (View) this.f118303a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118303a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m186069a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_invite_action, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, UIUtils.dp2px(getContext(), 48.0f)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseAction(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        ((UDButton) mo163516a(R.id.tvAction)).setOnClickListener(onClickListener);
    }

    public final void setAction(String str) {
        Intrinsics.checkParameterIsNotNull(str, "action");
        UDButton uDButton = (UDButton) mo163516a(R.id.tvAction);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "tvAction");
        uDButton.setText(str);
    }

    public final void setActionEnabled(boolean z) {
        UDButton uDButton = (UDButton) mo163516a(R.id.tvAction);
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "tvAction");
        uDButton.setEnabled(z);
    }

    public final void setDesc(String str) {
        Intrinsics.checkParameterIsNotNull(str, "desc");
        TextView textView = (TextView) mo163516a(R.id.tvDesc);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvDesc");
        textView.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseAction(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseAction(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAction(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186069a();
    }
}
