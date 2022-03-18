package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmCustomTabView;", "Landroidx/appcompat/widget/AppCompatTextView;", "mContext", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultColor", "getDefaultColor", "()I", "setDefaultColor", "(I)V", "selectedColor", "getSelectedColor", "setSelectedColor", "setSelected", "", "isSelected", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmCustomTabView extends AppCompatTextView {

    /* renamed from: a */
    private int f118719a = ContextCompat.getColor(getContext(), R.color.primary_pri_500);

    /* renamed from: b */
    private int f118720b = ContextCompat.getColor(getContext(), R.color.text_placeholder);

    public final int getDefaultColor() {
        return this.f118720b;
    }

    public final int getSelectedColor() {
        return this.f118719a;
    }

    public final void setDefaultColor(int i) {
        this.f118720b = i;
    }

    public final void setSelectedColor(int i) {
        this.f118719a = i;
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            setTextColor(this.f118719a);
        } else {
            setTextColor(this.f118720b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmCustomTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        setTextSize(1, 15.0f);
        setGravity(17);
    }
}
