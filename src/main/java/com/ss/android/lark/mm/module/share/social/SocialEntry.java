package com.ss.android.lark.mm.module.share.social;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/share/social/SocialEntry;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "init", "", "setDarkMode", "isDarkMode", "", "setTitle", "title", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SocialEntry extends RelativeLayout {

    /* renamed from: a */
    private HashMap f118362a;

    /* renamed from: a */
    public View mo165240a(int i) {
        if (this.f118362a == null) {
            this.f118362a = new HashMap();
        }
        View view = (View) this.f118362a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118362a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SocialEntry(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setDarkMode(boolean z) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo165240a(R.id.ivEntry);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivEntry");
        appCompatImageView.setSelected(z);
    }

    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        TextView textView = (TextView) mo165240a(R.id.tvEntry);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvEntry");
        textView.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SocialEntry(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SocialEntry(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186157a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_share_social_entry, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.share_entry_icon, R.attr.share_entry_title}, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        String string = obtainStyledAttributes.getString(1);
        TextView textView = (TextView) mo165240a(R.id.tvEntry);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvEntry");
        textView.setText(string);
        ((AppCompatImageView) mo165240a(R.id.ivEntry)).setImageDrawable(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
        setGravity(1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186157a(attributeSet, i, i2);
    }
}
