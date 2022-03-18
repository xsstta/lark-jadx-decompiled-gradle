package com.ss.android.lark.search.widget.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/search/widget/calendar/AddEmailView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mAddMailContainer", "Landroid/widget/RelativeLayout;", "getMAddMailContainer", "()Landroid/widget/RelativeLayout;", "setMAddMailContainer", "(Landroid/widget/RelativeLayout;)V", "mAddMailImg", "Landroid/widget/ImageView;", "getMAddMailImg", "()Landroid/widget/ImageView;", "setMAddMailImg", "(Landroid/widget/ImageView;)V", "mContext", "mMailNameTv", "Landroid/widget/TextView;", "getMMailNameTv", "()Landroid/widget/TextView;", "setMMailNameTv", "(Landroid/widget/TextView;)V", "initViews", "", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AddEmailView extends FrameLayout {

    /* renamed from: a */
    public RelativeLayout f133091a;

    /* renamed from: b */
    public ImageView f133092b;

    /* renamed from: c */
    public TextView f133093c;

    /* renamed from: d */
    private Context f133094d;

    public final RelativeLayout getMAddMailContainer() {
        RelativeLayout relativeLayout = this.f133091a;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddMailContainer");
        }
        return relativeLayout;
    }

    public final ImageView getMAddMailImg() {
        ImageView imageView = this.f133092b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddMailImg");
        }
        return imageView;
    }

    public final TextView getMMailNameTv() {
        TextView textView = this.f133093c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailNameTv");
        }
        return textView;
    }

    /* renamed from: a */
    private final void m208700a() {
        View findViewById = findViewById(R.id.add_mail_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.add_mail_container)");
        this.f133091a = (RelativeLayout) findViewById;
        View findViewById2 = findViewById(R.id.add_mail_img);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.add_mail_img)");
        this.f133092b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.mail_name_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.mail_name_tv)");
        this.f133093c = (TextView) findViewById3;
    }

    public final void setMAddMailContainer(RelativeLayout relativeLayout) {
        Intrinsics.checkParameterIsNotNull(relativeLayout, "<set-?>");
        this.f133091a = relativeLayout;
    }

    public final void setMAddMailImg(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "<set-?>");
        this.f133092b = imageView;
    }

    public final void setMMailNameTv(TextView textView) {
        Intrinsics.checkParameterIsNotNull(textView, "<set-?>");
        this.f133093c = textView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddEmailView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEmailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f133094d = context;
        LayoutInflater.from(context).inflate(R.layout.calendar_add_mail, (ViewGroup) this, true);
        m208700a();
    }
}
