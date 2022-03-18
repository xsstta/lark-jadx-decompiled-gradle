package com.ss.android.lark.chatwindow.view.selectline;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002R$\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX.¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/selectline/FollowingSelectLine;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "currentSelectCount", "getCurrentSelectCount", "()I", "setCurrentSelectCount", "(I)V", "<set-?>", "Landroid/view/View;", "lineView", "getLineView", "()Landroid/view/View;", "mTipTextView", "Landroid/widget/TextView;", "selectLimit", "getSelectLimit", "setSelectLimit", "selectTipClickListener", "Landroid/view/View$OnClickListener;", "getSelectTipClickListener", "()Landroid/view/View$OnClickListener;", "setSelectTipClickListener", "(Landroid/view/View$OnClickListener;)V", "initViews", "", "setupTextTip", "showSelectCountLimitExceededDialog", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class FollowingSelectLine extends FrameLayout {

    /* renamed from: a */
    public static final Companion f91182a = new Companion(null);

    /* renamed from: b */
    private TextView f91183b;

    /* renamed from: c */
    private View f91184c;

    /* renamed from: d */
    private int f91185d;

    /* renamed from: e */
    private int f91186e;

    /* renamed from: f */
    private View.OnClickListener f91187f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chatwindow/view/selectline/FollowingSelectLine$Companion;", "", "()V", "LINE_HEIGHT_DP", "", "PADDING_HORIZONTAL_DP", "TEXT_MARGIN_START_DP", "TEXT_PADDING_HORIZONTAL_DP", "TEXT_PADDING_VERTICAL_DP", "TIP_TEXT_SIZE_SP", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.selectline.FollowingSelectLine$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getCurrentSelectCount() {
        return this.f91186e;
    }

    public final int getSelectLimit() {
        return this.f91185d;
    }

    public final View.OnClickListener getSelectTipClickListener() {
        return this.f91187f;
    }

    public final View getLineView() {
        View view = this.f91184c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineView");
        }
        return view;
    }

    /* renamed from: b */
    private final void m137817b() {
        String string = UIHelper.getString(R.string.Lark_Chat_SelectFollowingMessages);
        TextView textView = this.f91183b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipTextView");
        }
        textView.setText(string);
    }

    /* renamed from: c */
    private final void m137818c() {
        new C25639g(getContext()).mo89254m(R.string.Lark_Chat_SelectMaximumMessagesToast).mo89251j(3).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_IKnow, DialogInterface$OnClickListenerC35295c.f91189a).mo89246d(true).mo89239c();
    }

    /* renamed from: a */
    private final void m137816a() {
        int dp2px = UIHelper.dp2px(16.0f);
        setPaddingRelative(dp2px, 0, dp2px, 0);
        View view = new View(getContext());
        int dp2px2 = UIHelper.dp2px(1.0f);
        view.setBackgroundColor(C52990a.m205239c(view.getContext(), R.color.line_border_component));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dp2px2);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        this.f91184c = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineView");
        }
        addView(view);
        TextView textView = new TextView(getContext());
        textView.setTextSize(14.0f);
        textView.setTextColor(C52990a.m205239c(textView.getContext(), R.color.text_title));
        textView.setBackgroundResource(R.drawable.bg_multi_select_line);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        layoutParams2.setMarginStart(UIHelper.dp2px(36.0f));
        textView.setLayoutParams(layoutParams2);
        int dp2px3 = UIHelper.dp2px(8.0f);
        int dp2px4 = UIHelper.dp2px(5.0f);
        textView.setPaddingRelative(dp2px3, dp2px4, dp2px3, dp2px4);
        textView.setOnClickListener(new View$OnClickListenerC35294b(this));
        this.f91183b = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTipTextView");
        }
        addView(textView);
        m137817b();
    }

    public final void setSelectLimit(int i) {
        this.f91185d = i;
    }

    public final void setSelectTipClickListener(View.OnClickListener onClickListener) {
        this.f91187f = onClickListener;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/chatwindow/view/selectline/FollowingSelectLine$initViews$2$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.selectline.FollowingSelectLine$b */
    public static final class View$OnClickListenerC35294b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FollowingSelectLine f91188a;

        View$OnClickListenerC35294b(FollowingSelectLine followingSelectLine) {
            this.f91188a = followingSelectLine;
        }

        public final void onClick(View view) {
            View.OnClickListener selectTipClickListener = this.f91188a.getSelectTipClickListener();
            if (selectTipClickListener != null) {
                selectTipClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowingSelectLine(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m137816a();
    }

    public final void setCurrentSelectCount(int i) {
        if (this.f91186e != i) {
            if (i >= this.f91185d) {
                m137818c();
            }
            this.f91186e = i;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog1", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatwindow.view.selectline.FollowingSelectLine$c */
    public static final class DialogInterface$OnClickListenerC35295c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC35295c f91189a = new DialogInterface$OnClickListenerC35295c();

        DialogInterface$OnClickListenerC35295c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C352961 r1 = C352961.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowingSelectLine(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        m137816a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowingSelectLine(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m137816a();
    }
}
