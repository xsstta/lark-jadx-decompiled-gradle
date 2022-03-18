package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.utils.MmOnBoardingUtils;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u0010\u001e\u001a\u00020\u0016J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0016J\"\u0010\"\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0006\u0010#\u001a\u00020\u0016J\u000e\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020 J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000eJ\u0016\u0010'\u001a\u00020\u00162\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\u0010\u0010)\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010 J\u0010\u0010+\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010-R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006."}, d2 = {"Lcom/ss/android/lark/mm/widget/MmDetailTitleBar;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isAddedMiniAudioIcon", "", "<set-?>", "isEditMode", "()Z", "miniAudioView", "Landroid/widget/ImageView;", "onBackListener", "Lkotlin/Function0;", "", "getOnBackListener", "()Lkotlin/jvm/functions/Function0;", "setOnBackListener", "(Lkotlin/jvm/functions/Function0;)V", "onExitEditModeListener", "getOnExitEditModeListener", "setOnExitEditModeListener", "addMiniAudio", "getTitle", "", "hideMiniAudio", "init", "reset", "setEditStatusText", "statusText", "setIsEditMode", "setOnMoreListener", "onMoreListener", "setTitle", "title", "showMoreOnboarding", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmDetailTitleBar extends RelativeLayout {

    /* renamed from: a */
    private boolean f118721a;

    /* renamed from: b */
    private Function0<Unit> f118722b;

    /* renamed from: c */
    private Function0<Unit> f118723c;

    /* renamed from: d */
    private boolean f118724d;

    /* renamed from: e */
    private ImageView f118725e;

    /* renamed from: f */
    private HashMap f118726f;

    /* renamed from: a */
    public View mo165588a(int i) {
        if (this.f118726f == null) {
            this.f118726f = new HashMap();
        }
        View view = (View) this.f118726f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118726f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final boolean mo165590a() {
        return this.f118721a;
    }

    public final Function0<Unit> getOnBackListener() {
        return this.f118722b;
    }

    public final Function0<Unit> getOnExitEditModeListener() {
        return this.f118723c;
    }

    /* renamed from: c */
    public final void mo165592c() {
        this.f118724d = false;
        ((LinearLayout) mo165588a(R.id.containerMini)).removeView(this.f118725e);
    }

    public final String getTitle() {
        BoldTextView boldTextView = (BoldTextView) mo165588a(R.id.tvTitle);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTitle");
        return boldTextView.getText().toString();
    }

    /* renamed from: d */
    public final void mo165593d() {
        setVisibility(0);
        setTitle("");
        LinearLayout linearLayout = (LinearLayout) mo165588a(R.id.containerMini);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerMini");
        linearLayout.setVisibility(8);
        setOnMoreListener(null);
    }

    /* renamed from: b */
    public final void mo165591b() {
        if (!this.f118724d) {
            this.f118724d = true;
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(0)");
                childAt.setVisibility(0);
            }
            BoldTextView boldTextView = (BoldTextView) mo165588a(R.id.tvTitle);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTitle");
            boldTextView.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) mo165588a(R.id.containerMini);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerMini");
            ImageView imageView = new ImageView(linearLayout.getContext());
            this.f118725e = imageView;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.mm_ic_audio);
            }
            LinearLayout linearLayout2 = (LinearLayout) mo165588a(R.id.containerMini);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "containerMini");
            int dp2px = UIUtils.dp2px(linearLayout2.getContext(), 24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dp2px, dp2px);
            layoutParams.setMarginEnd(C57582a.m223600a(8));
            ((LinearLayout) mo165588a(R.id.containerMini)).addView(this.f118725e, 0, layoutParams);
        }
    }

    public final void setOnBackListener(Function0<Unit> function0) {
        this.f118722b = function0;
    }

    public final void setOnExitEditModeListener(Function0<Unit> function0) {
        this.f118723c = function0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmDetailTitleBar$b */
    public static final class C47132b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmDetailTitleBar this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47132b(MmDetailTitleBar mmDetailTitleBar) {
            super(1);
            this.this$0 = mmDetailTitleBar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            this.this$0.setIsEditMode(false);
            Function0<Unit> onExitEditModeListener = this.this$0.getOnExitEditModeListener();
            if (onExitEditModeListener != null) {
                onExitEditModeListener.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmDetailTitleBar$c */
    public static final class View$OnClickListenerC47133c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f118728a;

        View$OnClickListenerC47133c(Function0 function0) {
            this.f118728a = function0;
        }

        public final void onClick(View view) {
            this.f118728a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmDetailTitleBar$a */
    public static final class View$OnClickListenerC47131a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmDetailTitleBar f118727a;

        View$OnClickListenerC47131a(MmDetailTitleBar mmDetailTitleBar) {
            this.f118727a = mmDetailTitleBar;
        }

        public final void onClick(View view) {
            Function0<Unit> onBackListener = this.f118727a.getOnBackListener();
            if (onBackListener != null) {
                onBackListener.invoke();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmDetailTitleBar(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setEditStatusText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "statusText");
        TextView textView = (TextView) mo165588a(R.id.editStatusTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "editStatusTv");
        textView.setText(str);
    }

    public final void setOnMoreListener(Function0<Unit> function0) {
        if (!this.f118721a) {
            if (function0 == null) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) mo165588a(R.id.entryMore);
                Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "entryMore");
                appCompatImageView.setVisibility(8);
                return;
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo165588a(R.id.entryMore);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "entryMore");
            appCompatImageView2.setVisibility(0);
            ((AppCompatImageView) mo165588a(R.id.entryMore)).setOnClickListener(new View$OnClickListenerC47133c(function0));
        }
    }

    public final void setTitle(String str) {
        boolean z;
        int i;
        String str2 = str;
        int i2 = 0;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        BoldTextView boldTextView = (BoldTextView) mo165588a(R.id.tvTitle);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTitle");
        if (z || !this.f118724d) {
            i = 8;
        } else {
            i = 0;
        }
        boldTextView.setVisibility(i);
        BoldTextView boldTextView2 = (BoldTextView) mo165588a(R.id.tvTitle);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvTitle");
        boldTextView2.setText(str2);
        LinearLayout linearLayout = (LinearLayout) mo165588a(R.id.containerMini);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "containerMini");
        if (z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* renamed from: a */
    public final void mo165589a(MmBaseInfo mmBaseInfo) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo165588a(R.id.entryMore);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "entryMore");
        if (appCompatImageView.getVisibility() == 0 && mmBaseInfo != null && mmBaseInfo.isCanModify()) {
            MmOnBoardingUtils jVar = MmOnBoardingUtils.f118633a;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo165588a(R.id.entryMore);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "entryMore");
            jVar.mo165492a(appCompatImageView2);
        }
    }

    public final void setIsEditMode(boolean z) {
        this.f118721a = z;
        if (z) {
            TextView textView = (TextView) mo165588a(R.id.editStatusTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "editStatusTv");
            textView.setVisibility(0);
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo165588a(R.id.ivLeft);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivLeft");
            appCompatImageView.setVisibility(8);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo165588a(R.id.entryMore);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "entryMore");
            appCompatImageView2.setVisibility(8);
            ((LinearLayout) mo165588a(R.id.containerMini)).setPadding(C57582a.m223600a(16), 0, 0, 0);
            TextView textView2 = (TextView) mo165588a(R.id.actionDone);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "actionDone");
            textView2.setVisibility(0);
            TextView textView3 = (TextView) mo165588a(R.id.actionDone);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "actionDone");
            C47110e.m186573a(textView3, new C47132b(this));
            return;
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) mo165588a(R.id.ivLeft);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "ivLeft");
        appCompatImageView3.setVisibility(0);
        TextView textView4 = (TextView) mo165588a(R.id.editStatusTv);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "editStatusTv");
        textView4.setVisibility(8);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) mo165588a(R.id.entryMore);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView4, "entryMore");
        appCompatImageView4.setVisibility(0);
        ((LinearLayout) mo165588a(R.id.containerMini)).setPadding(0, 0, 0, 0);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((AppCompatImageView) mo165588a(R.id.ivLeft)).setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_left_outlined, ContextCompat.getColor(getContext(), R.color.icon_n1)));
        TextView textView5 = (TextView) mo165588a(R.id.actionDone);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "actionDone");
        textView5.setVisibility(8);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmDetailTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmDetailTitleBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186637a(AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_title_bar, this);
        ((AppCompatImageView) mo165588a(R.id.ivLeft)).setOnClickListener(new View$OnClickListenerC47131a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailTitleBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186637a(attributeSet, i, i2);
    }
}
