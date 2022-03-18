package com.ss.android.lark.simple.ui.popup;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/simple/ui/popup/SimplePopupWindow;", "Landroid/widget/PopupWindow;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "closeView", "Landroid/widget/ImageView;", "getContext", "()Landroid/app/Activity;", "countDownTimer", "com/ss/android/lark/simple/ui/popup/SimplePopupWindow$countDownTimer$1", "Lcom/ss/android/lark/simple/ui/popup/SimplePopupWindow$countDownTimer$1;", "popView", "Landroid/view/View;", "textView", "Landroid/widget/TextView;", "setMovementMethod", "", "setText", "text", "Landroid/text/SpannableString;", "Companion", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.simple.ui.a.a */
public final class SimplePopupWindow extends PopupWindow {

    /* renamed from: a */
    public static final Companion f135487a = new Companion(null);

    /* renamed from: b */
    private View f135488b;

    /* renamed from: c */
    private TextView f135489c;

    /* renamed from: d */
    private ImageView f135490d;

    /* renamed from: e */
    private final CountDownTimerC54889b f135491e;

    /* renamed from: f */
    private final Activity f135492f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/simple/ui/popup/SimplePopupWindow$Companion;", "", "()V", "COUNT_DOWN_INTERVAL", "", "KEEP_ALIVE", "PADDING_POP_WINDOW", "", "TIP_TOTAL_LENGTH", "", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/simple/ui/popup/SimplePopupWindow$countDownTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.simple.ui.a.a$b */
    public static final class CountDownTimerC54889b extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ SimplePopupWindow f135495a;

        public void onTick(long j) {
        }

        public void onFinish() {
            this.f135495a.dismiss();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC54889b(SimplePopupWindow aVar, long j, long j2) {
            super(j, j2);
            this.f135495a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo187161a() {
        TextView textView = this.f135489c;
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: a */
    public final void mo187162a(SpannableString spannableString) {
        Intrinsics.checkParameterIsNotNull(spannableString, "text");
        TextView textView = this.f135489c;
        if (textView != null) {
            textView.setText(spannableString);
        }
    }

    public SimplePopupWindow(Activity activity) {
        super(activity);
        TextView textView;
        this.f135492f = activity;
        CountDownTimerC54889b bVar = new CountDownTimerC54889b(this, 7000, 7000);
        this.f135491e = bVar;
        ImageView imageView = null;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.layout_simple_mode_tip, (ViewGroup) null);
        this.f135488b = inflate;
        if (inflate != null) {
            textView = (TextView) inflate.findViewById(R.id.tv_simple);
        } else {
            textView = null;
        }
        this.f135489c = textView;
        View view = this.f135488b;
        this.f135490d = view != null ? (ImageView) view.findViewById(R.id.iv_close) : imageView;
        setContentView(this.f135488b);
        setWidth(UIHelper.dp2px(328.0f));
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(UIUtils.getColor(activity, R.color.color_transparent)));
        setFocusable(true);
        setOutsideTouchable(true);
        setTouchable(true);
        setTouchInterceptor(new View.OnTouchListener(this) {
            /* class com.ss.android.lark.simple.ui.popup.SimplePopupWindow.View$OnTouchListenerC548871 */

            /* renamed from: a */
            final /* synthetic */ SimplePopupWindow f135493a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f135493a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intrinsics.checkParameterIsNotNull(view, "v");
                Intrinsics.checkParameterIsNotNull(motionEvent, "motionEvent");
                float f = (float) 0;
                if (motionEvent.getX() >= f) {
                    float x = motionEvent.getX();
                    View contentView = this.f135493a.getContentView();
                    Intrinsics.checkExpressionValueIsNotNull(contentView, "contentView");
                    if (x <= ((float) contentView.getWidth()) && motionEvent.getY() >= f) {
                        float y = motionEvent.getY();
                        View contentView2 = this.f135493a.getContentView();
                        Intrinsics.checkExpressionValueIsNotNull(contentView2, "contentView");
                        if (y > ((float) contentView2.getHeight())) {
                            return true;
                        }
                        return false;
                    }
                }
                return true;
            }
        });
        ImageView imageView2 = this.f135490d;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.simple.ui.popup.SimplePopupWindow.View$OnClickListenerC548882 */

                /* renamed from: a */
                final /* synthetic */ SimplePopupWindow f135494a;

                {
                    this.f135494a = r1;
                }

                public final void onClick(View view) {
                    this.f135494a.dismiss();
                }
            });
        }
        bVar.start();
    }
}
