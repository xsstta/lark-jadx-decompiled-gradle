package com.ss.android.lark.calendar.impl.features.calendarview.widget;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/SerialLoadingDialog;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mStatus", "", "showErrResult", "", "errResId", "showLoading", "loadingResId", "showResult", "isSuccess", "", "sucTextResId", "errTextResId", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.i */
public final class SerialLoadingDialog extends RequestLoadingDialog {

    /* renamed from: d */
    public static final Companion f78584d = new Companion(null);

    /* renamed from: c */
    public int f78585c = 0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/SerialLoadingDialog$Companion;", "", "()V", "DELAY_MILLS_0", "", "DELAY_MILLS_2000", "DELAY_MILLS_500", "INVALID_RES_ID", "", "STATUS_LOADED", "STATUS_LOADING", "STATUS_NOTSHOW", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.i$b */
    public static final class RunnableC31114b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SerialLoadingDialog f78586a;

        RunnableC31114b(SerialLoadingDialog iVar) {
            this.f78586a = iVar;
        }

        public final void run() {
            try {
                if (this.f78586a.f78585c != 1) {
                    this.f78586a.dismiss();
                    this.f78586a.f78585c = 0;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog
    /* renamed from: a */
    public void mo112585a(int i) {
        this.f78585c = 1;
        super.mo112585a(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerialLoadingDialog(Activity activity) {
        super(activity);
        Intrinsics.checkParameterIsNotNull(activity, "activity");
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog
    /* renamed from: c */
    public void mo112592c(int i) {
        this.f78585c = 2;
        m116119a(false, 0, i);
        show();
    }

    /* renamed from: a */
    private final void m116119a(boolean z, int i, int i2) {
        long j;
        LottieAnimationView lottieAnimationView = this.imgBotReplying;
        Intrinsics.checkExpressionValueIsNotNull(lottieAnimationView, "imgBotReplying");
        lottieAnimationView.setVisibility(8);
        ImageView imageView = this.imgBotReply;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "imgBotReply");
        imageView.setVisibility(0);
        if (z && i != 0) {
            j = 500;
            this.replyText.setText(i);
            this.imgBotReply.setImageResource(R.drawable.ud_icon_yes_outlined);
        } else if (z || i2 == 0) {
            j = 0;
            TextView textView = this.replyText;
            Intrinsics.checkExpressionValueIsNotNull(textView, "replyText");
            textView.setText("");
            this.imgBotReply.setImageResource(R.drawable.ud_icon_more_close_outlined);
        } else {
            j = 2000;
            this.replyText.setText(i2);
            this.imgBotReply.setImageResource(R.drawable.ud_icon_more_close_outlined);
        }
        this.f78459b.postDelayed(new RunnableC31114b(this), j);
    }
}
