package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32670u;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RequestLoadingView extends RelativeLayout {

    /* renamed from: a */
    private HashMap f78462a;

    public RequestLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RequestLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo112596a(int i) {
        if (this.f78462a == null) {
            this.f78462a = new HashMap();
        }
        View view = (View) this.f78462a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78462a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        C32670u.m125362a(context).inflate(R.layout.calendar_view_bot_reply, (ViewGroup) this, true);
        ImageView imageView = (ImageView) mo112596a(R.id.img_bot_reply);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "img_bot_reply");
        imageView.setVisibility(8);
        TextView textView = (TextView) mo112596a(R.id.text_bot_reply);
        Intrinsics.checkExpressionValueIsNotNull(textView, "text_bot_reply");
        textView.setText(C32634ae.m125182b(R.string.Calendar_Common_LoadingCommon));
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo112596a(R.id.img_bot_replying);
        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "img_bot_replying");
        lottieAnimationView.setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RequestLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
