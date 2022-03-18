package com.ss.android.lark.mm.module.share.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/share/setting/SettingChoice;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "init", "", "setEnabled", "enabled", "", "setSelected", "selected", "setTitle", "title", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SettingChoice extends LinearLayout {

    /* renamed from: a */
    private HashMap f118354a;

    /* renamed from: a */
    public View mo165226a(int i) {
        if (this.f118354a == null) {
            this.f118354a = new HashMap();
        }
        View view = (View) this.f118354a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118354a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingChoice(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        UDCheckBox uDCheckBox = (UDCheckBox) mo165226a(R.id.ivChoice);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ivChoice");
        uDCheckBox.setEnabled(z);
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        UDCheckBox uDCheckBox = (UDCheckBox) mo165226a(R.id.ivChoice);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ivChoice");
        uDCheckBox.setChecked(z);
    }

    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        BoldTextView boldTextView = (BoldTextView) mo165226a(R.id.tvChoice);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvChoice");
        boldTextView.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingChoice(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SettingChoice(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186145a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_share_setting_choice, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.share_choice_title}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(0);
        BoldTextView boldTextView = (BoldTextView) mo165226a(R.id.tvChoice);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvChoice");
        boldTextView.setText(string);
        UDCheckBox uDCheckBox = (UDCheckBox) mo165226a(R.id.ivChoice);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ivChoice");
        uDCheckBox.setClickable(false);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingChoice(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186145a(attributeSet, i, i2);
    }
}
