package com.ss.android.lark.contact.feat.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/contact/feat/common/ContactErrorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "errorTextView", "Landroid/widget/TextView;", "initViews", "", "setOnRetryClickListener", "clickListener", "Landroid/view/View$OnClickListener;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ContactErrorView extends FrameLayout {

    /* renamed from: a */
    private TextView f91568a;

    /* renamed from: a */
    private final void m138546a() {
        LayoutInflater.from(getContext()).inflate(R.layout.contact_error_view, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.error);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.error)");
        this.f91568a = (TextView) findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactErrorView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m138546a();
    }

    public final void setOnRetryClickListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "clickListener");
        TextView textView = this.f91568a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorTextView");
        }
        textView.setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m138546a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m138546a();
    }
}
