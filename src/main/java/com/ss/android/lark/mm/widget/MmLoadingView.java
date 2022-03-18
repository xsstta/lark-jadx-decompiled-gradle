package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.component.ui.loading.MmLKUILoadingView;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000e¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmLoadingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "showLoading", "", "text", "", "unInit", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmLoadingView extends FrameLayout {

    /* renamed from: a */
    private HashMap f118751a;

    public MmLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MmLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo165612a(int i) {
        if (this.f118751a == null) {
            this.f118751a = new HashMap();
        }
        View view = (View) this.f118751a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118751a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        return true;
    }

    /* renamed from: a */
    public final void mo165613a() {
        if (((MmLKUILoadingView) mo165612a(R.id.mmLoadingView)) != null) {
            MmLKUILoadingView mmLKUILoadingView = (MmLKUILoadingView) mo165612a(R.id.mmLoadingView);
            Intrinsics.checkExpressionValueIsNotNull(mmLKUILoadingView, "mmLoadingView");
            mmLKUILoadingView.setVisibility(8);
            ((MmLKUILoadingView) mo165612a(R.id.mmLoadingView)).cancelAnimation();
        }
        setVisibility(8);
    }

    /* renamed from: a */
    public final void mo165614a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        TextView textView = (TextView) mo165612a(R.id.mmStatusTv);
        if (textView != null) {
            textView.setText(str);
        }
        MmLKUILoadingView mmLKUILoadingView = (MmLKUILoadingView) mo165612a(R.id.mmLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(mmLKUILoadingView, "mmLoadingView");
        mmLKUILoadingView.setVisibility(0);
        ((MmLKUILoadingView) mo165612a(R.id.mmLoadingView)).playAnimation();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.mm_loading_view, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
