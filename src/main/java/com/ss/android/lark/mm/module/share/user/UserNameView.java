package com.ss.android.lark.mm.module.share.user;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/share/user/UserNameView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bindData", "", "user", "Lcom/ss/android/lark/mm/module/share/model/User;", "init", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UserNameView extends LinearLayout {

    /* renamed from: a */
    private HashMap f118389a;

    /* renamed from: a */
    public View mo165260a(int i) {
        if (this.f118389a == null) {
            this.f118389a = new HashMap();
        }
        View view = (View) this.f118389a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118389a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m186173a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_user_name, this);
        setOrientation(0);
        setGravity(16);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UserNameView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo165261a(User user) {
        int i;
        Intrinsics.checkParameterIsNotNull(user, "user");
        BoldTextView boldTextView = (BoldTextView) mo165260a(R.id.tvName);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvName");
        boldTextView.setText(user.getUserName());
        BoldTextView boldTextView2 = (BoldTextView) mo165260a(R.id.tvExternal);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvExternal");
        int i2 = 0;
        if (Intrinsics.areEqual((Object) user.isExternal(), (Object) true)) {
            i = 0;
        } else {
            i = 8;
        }
        boldTextView2.setVisibility(i);
        BoldTextView boldTextView3 = (BoldTextView) mo165260a(R.id.tvHost);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvHost");
        if (!user.isHost()) {
            i2 = 8;
        }
        boldTextView3.setVisibility(i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UserNameView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        BoldTextView boldTextView = (BoldTextView) mo165260a(R.id.tvExternal);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvExternal");
        int i4 = 0;
        if (boldTextView.getVisibility() == 0) {
            BoldTextView boldTextView2 = (BoldTextView) mo165260a(R.id.tvExternal);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvExternal");
            TextPaint paint = boldTextView2.getPaint();
            BoldTextView boldTextView3 = (BoldTextView) mo165260a(R.id.tvExternal);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvExternal");
            i3 = ((int) paint.measureText(boldTextView3.getText().toString())) + UIUtils.dp2px(getContext(), 18.0f);
        } else {
            i3 = 0;
        }
        BoldTextView boldTextView4 = (BoldTextView) mo165260a(R.id.tvHost);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvHost");
        if (boldTextView4.getVisibility() == 0) {
            BoldTextView boldTextView5 = (BoldTextView) mo165260a(R.id.tvHost);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView5, "tvHost");
            TextPaint paint2 = boldTextView5.getPaint();
            BoldTextView boldTextView6 = (BoldTextView) mo165260a(R.id.tvHost);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView6, "tvHost");
            i4 = ((int) paint2.measureText(boldTextView6.getText().toString())) + UIUtils.dp2px(getContext(), 18.0f);
        }
        BoldTextView boldTextView7 = (BoldTextView) mo165260a(R.id.tvName);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView7, "tvName");
        boldTextView7.setMaxWidth((View.MeasureSpec.getSize(i) - i3) - i4);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UserNameView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserNameView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186173a();
    }
}
