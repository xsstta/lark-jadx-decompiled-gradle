package com.ss.android.lark.calendar.impl.features.calendars.detail.viewholder;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.LoadStatus;
import com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapInfo;
import com.ss.android.lark.calendar.impl.features.recyclerview.SimpleHolder;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.an;
import io.supercharge.shimmerlayout.ShimmerLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001eB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0012\u0010\u001c\u001a\u00020\u001a2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0011*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewholder/InstancesLoadStatusViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleHolder;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/LoadStatus;", "Landroid/view/View$OnAttachStateChangeListener;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "bottomEndTips", "", "getBottomEndTips", "()Ljava/lang/CharSequence;", "setBottomEndTips", "(Ljava/lang/CharSequence;)V", "loadingDrawable", "Landroidx/swiperefreshlayout/widget/CircularProgressDrawable;", "loadingImageView", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "shimmerLayout", "Lio/supercharge/shimmerlayout/ShimmerLayout;", "tips", "Landroid/widget/TextView;", "topEndTips", "getTopEndTips", "setTopEndTips", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onViewAttachedToWindow", "onViewDetachedFromWindow", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.a.b */
public final class InstancesLoadStatusViewHolder extends SimpleHolder<LoadStatus> implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public static final Companion f75601a = new Companion(null);

    /* renamed from: b */
    private CharSequence f75602b;

    /* renamed from: c */
    private CharSequence f75603c;

    /* renamed from: d */
    private final CircularProgressDrawable f75604d;

    /* renamed from: e */
    private final ImageView f75605e;

    /* renamed from: f */
    private final ShimmerLayout f75606f;

    /* renamed from: g */
    private final TextView f75607g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewholder/InstancesLoadStatusViewHolder$Companion;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/HolderMapInfo;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/LoadStatus;", "()V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.a.b$a */
    public static final class Companion extends HolderMapInfo<LoadStatus> {
        private Companion() {
            super(LoadStatus.class, R.layout.calendar_holder_instance_list_load_status, InstancesLoadStatusViewHolder.class, null, 0, 24, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void onViewAttachedToWindow(View view) {
        this.f75604d.start();
    }

    public void onViewDetachedFromWindow(View view) {
        this.f75604d.stop();
    }

    /* renamed from: a */
    public void mo109156a(LoadStatus jVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(jVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo109156a((Object) jVar);
        ShimmerLayout shimmerLayout = this.f75606f;
        Intrinsics.checkExpressionValueIsNotNull(shimmerLayout, "shimmerLayout");
        ShimmerLayout shimmerLayout2 = shimmerLayout;
        boolean z2 = false;
        if (jVar.mo109241a() != 1 || !jVar.mo109243c()) {
            z = false;
        } else {
            z = true;
        }
        an.m125213a(shimmerLayout2, z);
        ImageView imageView = this.f75605e;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "loadingImageView");
        ImageView imageView2 = imageView;
        if (jVar.mo109241a() == 1 && !jVar.mo109243c()) {
            z2 = true;
        }
        an.m125213a(imageView2, z2);
        TextView textView = this.f75607g;
        Intrinsics.checkExpressionValueIsNotNull(textView, "tips");
        int a = jVar.mo109241a();
        String str = null;
        if (a != 2) {
            if (a == 3) {
                TextView textView2 = this.f75607g;
                Intrinsics.checkExpressionValueIsNotNull(textView2, "tips");
                str = textView2.getContext().getString(R.string.Calendar_Common_FailedToLoad);
            }
        } else if (jVar.mo109242b()) {
            str = getAdapterPosition() == 0 ? this.f75602b : this.f75603c;
        }
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstancesLoadStatusViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "v");
        String string = view.getContext().getString(R.string.Calendar_Onboarding_PastDisplay);
        Intrinsics.checkExpressionValueIsNotNull(string, "v.context.getString(R.st…r_Onboarding_PastDisplay)");
        this.f75602b = string;
        String string2 = view.getContext().getString(R.string.Calendar_Onboarding_FutureOneYearDisplay);
        Intrinsics.checkExpressionValueIsNotNull(string2, "v.context.getString(R.st…ing_FutureOneYearDisplay)");
        this.f75603c = string2;
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(view.getContext());
        circularProgressDrawable.mo7698a(1);
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "v.context");
        circularProgressDrawable.mo7701a(UDColorUtils.getColor(context, R.color.primary_pri_500));
        circularProgressDrawable.mo7699a(Paint.Cap.ROUND);
        circularProgressDrawable.mo7694a((float) C32659l.m125335a(Double.valueOf(2.5d)));
        circularProgressDrawable.mo7703b((float) C32659l.m125335a(Double.valueOf(7.5d)));
        int a = (int) ((circularProgressDrawable.mo7693a() + circularProgressDrawable.mo7702b()) * ((float) 2));
        circularProgressDrawable.setBounds(0, 0, a, a);
        this.f75604d = circularProgressDrawable;
        ImageView imageView = (ImageView) view.findViewById(R.id.loading_image);
        imageView.setImageDrawable(circularProgressDrawable);
        imageView.addOnAttachStateChangeListener(this);
        this.f75605e = imageView;
        this.f75606f = (ShimmerLayout) view.findViewById(R.id.shimmer_layout);
        this.f75607g = (TextView) view.findViewById(R.id.tips);
    }
}
