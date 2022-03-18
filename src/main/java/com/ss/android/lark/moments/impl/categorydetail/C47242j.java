package com.ss.android.lark.moments.impl.categorydetail;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C1555u;
import androidx.transition.C1556v;
import androidx.transition.Transition;
import com.ss.android.lark.moments.impl.categorydetail.DescriptionSuffixHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001as\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012M\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0002\u001aã\u0001\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132%\b\u0002\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182M\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u001a6\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u001a(\u0010\u001b\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007\u001aÉ\u0001\u0010\u001d\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u00152#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182M\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¨\u0006\u001e"}, d2 = {"binarySearch", "", "Landroid/widget/TextView;", "mainContent", "", "suffix", "targetLineCount", "textWrapper", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "text", "suffixIndex", "collapse", "", "transition", "Landroidx/transition/Transition;", "sceneRoot", "Landroid/view/ViewGroup;", "onSuccess", "Lkotlin/Function1;", "onFailed", "urlSpanList", "", "Lcom/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelper$UrlSpan;", "expand", "setTextWithAnimator", "content", "setTextWithSuffix", "im_moments-wrapper_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.j */
public final class C47242j {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelperKt$setTextWithSuffix$listener$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "v", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.j$g */
    public static final class View$OnLayoutChangeListenerC47251g implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextView f119178a;

        /* renamed from: b */
        final /* synthetic */ Function1 f119179b;

        /* renamed from: c */
        final /* synthetic */ C47249f f119180c;

        /* renamed from: d */
        final /* synthetic */ CharSequence f119181d;

        /* renamed from: e */
        final /* synthetic */ CharSequence f119182e;

        /* renamed from: f */
        final /* synthetic */ int f119183f;

        /* renamed from: g */
        final /* synthetic */ Function3 f119184g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.categorydetail.j$g$a */
        static final class RunnableC47252a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View$OnLayoutChangeListenerC47251g f119185a;

            RunnableC47252a(View$OnLayoutChangeListenerC47251g gVar) {
                this.f119185a = gVar;
            }

            public final void run() {
                this.f119185a.f119180c.invoke(C47242j.m187138a(this.f119185a.f119178a, this.f119185a.f119181d, this.f119185a.f119182e, this.f119185a.f119183f, this.f119185a.f119184g));
            }
        }

        View$OnLayoutChangeListenerC47251g(TextView textView, Function1 function1, C47249f fVar, CharSequence charSequence, CharSequence charSequence2, int i, Function3 oVar) {
            this.f119178a = textView;
            this.f119179b = function1;
            this.f119180c = fVar;
            this.f119181d = charSequence;
            this.f119182e = charSequence2;
            this.f119183f = i;
            this.f119184g = oVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f119178a.removeOnLayoutChangeListener(this);
            if (this.f119178a.getLayout() == null) {
                Function1 function1 = this.f119179b;
                CharSequence text = this.f119178a.getText();
                Intrinsics.checkExpressionValueIsNotNull(text, "text");
                function1.invoke(text);
                return;
            }
            this.f119178a.post(new RunnableC47252a(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"autoSet", "", "index", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.j$f */
    public static final class C47249f extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ CharSequence $mainContent;
        final /* synthetic */ Function1 $onFailed;
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ CharSequence $originText;
        final /* synthetic */ CharSequence $suffix;
        final /* synthetic */ Function3 $textWrapper;
        final /* synthetic */ TextView $this_setTextWithSuffix;
        final /* synthetic */ List $urlSpanList;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47249f(TextView textView, Function1 function1, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, Function3 oVar, Function1 function12) {
            super(1);
            this.$this_setTextWithSuffix = textView;
            this.$onFailed = function1;
            this.$originText = charSequence;
            this.$mainContent = charSequence2;
            this.$urlSpanList = list;
            this.$suffix = charSequence3;
            this.$textWrapper = oVar;
            this.$onSuccess = function12;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelperKt$setTextWithSuffix$3$1$1$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.moments.impl.categorydetail.j$f$a */
        public static final class C47250a extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f119177a;

            C47250a(View.OnClickListener onClickListener) {
                this.f119177a = onClickListener;
            }

            public void onClick(View view) {
                Intrinsics.checkParameterIsNotNull(view, "widget");
                this.f119177a.onClick(view);
            }

            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkParameterIsNotNull(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(true);
            }
        }

        public final void invoke(int i) {
            String str;
            if (i < 0) {
                Function1 function1 = this.$onFailed;
                CharSequence charSequence = this.$originText;
                Intrinsics.checkExpressionValueIsNotNull(charSequence, "originText");
                function1.invoke(charSequence);
                return;
            }
            TextView textView = this.$this_setTextWithSuffix;
            if (i >= this.$mainContent.length()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.$mainContent);
                for (DescriptionSuffixHelper.UrlSpan cVar : this.$urlSpanList) {
                    int a = cVar.mo166061a();
                    int b = cVar.mo166062b();
                    View.OnClickListener d = cVar.mo166064d();
                    if (d != null) {
                        spannableStringBuilder.setSpan(new C47250a(d), a, b, 33);
                    }
                    Integer c = cVar.mo166063c();
                    if (c != null) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(c.intValue()), a, b, 33);
                    }
                }
                str = spannableStringBuilder;
            } else {
                String str2 = this.$mainContent.subSequence(0, i).toString() + this.$suffix;
                Function3 oVar = this.$textWrapper;
                if (oVar == null || (str = (CharSequence) oVar.invoke(str2, this.$suffix, Integer.valueOf(i))) == null) {
                    str = str2;
                }
            }
            textView.setText(str);
            Function1 function12 = this.$onSuccess;
            CharSequence text = this.$this_setTextWithSuffix.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "text");
            function12.invoke(text);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelperKt$expand$ssb$1$1$1$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.j$d */
    public static final class C47247d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ View.OnClickListener f119174a;

        C47247d(View.OnClickListener onClickListener) {
            this.f119174a = onClickListener;
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            this.f119174a.onClick(view);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/moments/impl/categorydetail/DescriptionSuffixHelperKt$setTextWithAnimator$1", "Landroidx/transition/TransitionListenerAdapter;", "onTransitionCancel", "", "transition", "Landroidx/transition/Transition;", "onTransitionEnd", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.j$e */
    public static final class C47248e extends C1555u {

        /* renamed from: a */
        final /* synthetic */ TextView f119175a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f119176b;

        @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
        /* renamed from: a */
        public void mo7815a(Transition transition) {
            Intrinsics.checkParameterIsNotNull(transition, "transition");
            transition.mo7898b(this);
        }

        @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
        /* renamed from: b */
        public void mo7816b(Transition transition) {
            Intrinsics.checkParameterIsNotNull(transition, "transition");
            transition.mo7898b(this);
            this.f119175a.getLayoutParams().height = -2;
            TextView textView = this.f119175a;
            textView.setLayoutParams(textView.getLayoutParams());
            this.f119175a.setText(this.f119176b);
        }

        C47248e(TextView textView, CharSequence charSequence) {
            this.f119175a = textView;
            this.f119176b = charSequence;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.j$c */
    public static final class C47246c extends Lambda implements Function1<CharSequence, Unit> {
        final /* synthetic */ CharSequence $mainContent;
        final /* synthetic */ Function1 $onFailed;
        final /* synthetic */ int $targetLineCount;
        final /* synthetic */ TextView $this_collapse;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47246c(TextView textView, CharSequence charSequence, int i, Function1 function1) {
            super(1);
            this.$this_collapse = textView;
            this.$mainContent = charSequence;
            this.$targetLineCount = i;
            this.$onFailed = function1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke(charSequence);
            return Unit.INSTANCE;
        }

        public final void invoke(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "it");
            this.$this_collapse.setText(this.$mainContent);
            this.$this_collapse.setMaxLines(this.$targetLineCount);
            Function1 function1 = this.$onFailed;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(this.$mainContent);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.j$b */
    public static final class C47244b extends Lambda implements Function1<CharSequence, Unit> {
        final /* synthetic */ Function1 $onSuccess;
        final /* synthetic */ CharSequence $originText;
        final /* synthetic */ ViewGroup $sceneRoot;
        final /* synthetic */ TextView $this_collapse;
        final /* synthetic */ Transition $transition;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47244b(TextView textView, Transition transition, Function1 function1, CharSequence charSequence, ViewGroup viewGroup) {
            super(1);
            this.$this_collapse = textView;
            this.$transition = transition;
            this.$onSuccess = function1;
            this.$originText = charSequence;
            this.$sceneRoot = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke(charSequence);
            return Unit.INSTANCE;
        }

        public final void invoke(final CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "result");
            if (this.$transition == null) {
                Function1 function1 = this.$onSuccess;
                if (function1 != null) {
                    Unit unit = (Unit) function1.invoke(charSequence);
                    return;
                }
                return;
            }
            final CharSequence text = this.$this_collapse.getText();
            Layout layout = this.$this_collapse.getLayout();
            Intrinsics.checkExpressionValueIsNotNull(layout, "layout");
            int height = layout.getHeight() + this.$this_collapse.getPaddingTop() + this.$this_collapse.getPaddingBottom();
            this.$this_collapse.setText(this.$originText);
            this.$this_collapse.getLayoutParams().height = height;
            TextView textView = this.$this_collapse;
            textView.setLayoutParams(textView.getLayoutParams());
            this.$transition.mo7880a(new C1555u(this) {
                /* class com.ss.android.lark.moments.impl.categorydetail.C47242j.C47244b.C472451 */

                /* renamed from: a */
                final /* synthetic */ C47244b f119171a;

                @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                /* renamed from: a */
                public void mo7815a(Transition transition) {
                    Intrinsics.checkParameterIsNotNull(transition, "transition");
                    transition.mo7898b(this);
                }

                @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                /* renamed from: b */
                public void mo7816b(Transition transition) {
                    Intrinsics.checkParameterIsNotNull(transition, "transition");
                    transition.mo7898b(this);
                    this.f119171a.$this_collapse.getLayoutParams().height = -2;
                    this.f119171a.$this_collapse.setLayoutParams(this.f119171a.$this_collapse.getLayoutParams());
                    this.f119171a.$this_collapse.setText(text);
                    Function1 function1 = this.f119171a.$onSuccess;
                    if (function1 != null) {
                        Unit unit = (Unit) function1.invoke(charSequence);
                    }
                }

                {
                    this.f119171a = r1;
                }
            });
            C1556v.m7131a(this.$sceneRoot, this.$transition);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"verify", "", "start", "end", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.j$a */
    public static final class C47243a extends Lambda implements Function2<Integer, Integer, Integer> {
        final /* synthetic */ CharSequence $mainContent;
        final /* synthetic */ CharSequence $suffix;
        final /* synthetic */ Function3 $textWrapper;
        final /* synthetic */ TextView $this_binarySearch;
        final /* synthetic */ Map $verifyCache;
        final /* synthetic */ Ref.IntRef $verifyCount;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47243a(TextView textView, Map map, Ref.IntRef intRef, CharSequence charSequence, CharSequence charSequence2, Function3 oVar) {
            super(2);
            this.$this_binarySearch = textView;
            this.$verifyCache = map;
            this.$verifyCount = intRef;
            this.$mainContent = charSequence;
            this.$suffix = charSequence2;
            this.$textWrapper = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(invoke(num.intValue(), num2.intValue()));
        }

        public final int invoke(int i, int i2) {
            String str;
            int i3 = (i << 16) | i2;
            Integer num = (Integer) this.$verifyCache.get(Integer.valueOf(i3));
            if (num != null) {
                return num.intValue();
            }
            this.$verifyCount.element++;
            String str2 = this.$mainContent.subSequence(i, i2).toString() + this.$suffix;
            TextView textView = this.$this_binarySearch;
            Function3 oVar = this.$textWrapper;
            if (oVar == null || (str = (CharSequence) oVar.invoke(str2, this.$suffix, Integer.valueOf(i2))) == null) {
                str = str2;
            }
            textView.setText(str);
            int lineCount = this.$this_binarySearch.getLineCount();
            this.$verifyCache.put(Integer.valueOf(i3), Integer.valueOf(lineCount));
            return lineCount;
        }
    }

    /* renamed from: a */
    public static final void m187139a(TextView textView, CharSequence charSequence, Transition transition, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setTextWithAnimator");
        Intrinsics.checkParameterIsNotNull(charSequence, "content");
        Intrinsics.checkParameterIsNotNull(transition, "transition");
        Intrinsics.checkParameterIsNotNull(viewGroup, "sceneRoot");
        CharSequence text = textView.getText();
        textView.setText(charSequence);
        Layout layout = textView.getLayout();
        if (layout != null) {
            textView.setText(text);
            textView.getLayoutParams().height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
            textView.setLayoutParams(textView.getLayoutParams());
            transition.mo7880a(new C47248e(textView, charSequence));
        }
        C1556v.m7131a(viewGroup, transition);
    }

    /* renamed from: a */
    public static final int m187138a(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> oVar) {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        C47243a aVar = new C47243a(textView, new LinkedHashMap(), intRef, charSequence, charSequence2, oVar);
        if (textView.getLayout() == null) {
            return -1;
        }
        if (aVar.invoke(0, charSequence.length()) <= i) {
            textView.setText(charSequence);
            return charSequence.length();
        }
        int length = charSequence.length();
        int i2 = 0;
        while (true) {
            if (i2 > length) {
                break;
            }
            int i3 = (i2 + length) / 2;
            int invoke = aVar.invoke(0, i3);
            if (invoke < i) {
                i2 = i3 + 1;
            } else if (invoke == i) {
                i2 = i3 + 1;
                int invoke2 = aVar.invoke(0, i2);
                int i4 = i + 1;
                if (invoke2 >= i4) {
                    if (invoke2 == i4) {
                        return i3;
                    }
                }
            } else {
                length = i3 - 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final void m187140a(TextView textView, CharSequence charSequence, Transition transition, ViewGroup viewGroup, List<DescriptionSuffixHelper.UrlSpan> list) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$expand");
        Intrinsics.checkParameterIsNotNull(charSequence, "mainContent");
        Intrinsics.checkParameterIsNotNull(viewGroup, "sceneRoot");
        Intrinsics.checkParameterIsNotNull(list, "urlSpanList");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (T t : list) {
            int a = t.mo166061a();
            int b = t.mo166062b();
            View.OnClickListener d = t.mo166064d();
            if (d != null) {
                spannableStringBuilder.setSpan(new C47247d(d), a, b, 33);
            }
            Integer c = t.mo166063c();
            if (c != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(c.intValue()), a, b, 33);
            }
        }
        if (transition != null) {
            C1556v.m7131a(viewGroup, transition);
        }
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: a */
    public static final void m187142a(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, Function1<? super CharSequence, Unit> function1, Function1<? super CharSequence, Unit> function12, List<DescriptionSuffixHelper.UrlSpan> list, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> oVar) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$setTextWithSuffix");
        Intrinsics.checkParameterIsNotNull(charSequence, "mainContent");
        Intrinsics.checkParameterIsNotNull(charSequence2, "suffix");
        Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
        Intrinsics.checkParameterIsNotNull(function12, "onFailed");
        Intrinsics.checkParameterIsNotNull(list, "urlSpanList");
        C47249f fVar = new C47249f(textView, function12, textView.getText(), charSequence, list, charSequence2, oVar, function1);
        if (textView.getLayout() == null) {
            textView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC47251g(textView, function12, fVar, charSequence, charSequence2, i, oVar));
            textView.requestLayout();
            return;
        }
        fVar.invoke(m187138a(textView, charSequence, charSequence2, i, oVar));
    }

    /* renamed from: a */
    public static final void m187141a(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, Transition transition, ViewGroup viewGroup, Function1<? super CharSequence, Unit> function1, Function1<? super CharSequence, Unit> function12, List<DescriptionSuffixHelper.UrlSpan> list, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> oVar) {
        Intrinsics.checkParameterIsNotNull(textView, "$this$collapse");
        Intrinsics.checkParameterIsNotNull(charSequence, "mainContent");
        Intrinsics.checkParameterIsNotNull(charSequence2, "suffix");
        Intrinsics.checkParameterIsNotNull(viewGroup, "sceneRoot");
        Intrinsics.checkParameterIsNotNull(list, "urlSpanList");
        m187142a(textView, charSequence, charSequence2, i, new C47244b(textView, transition, function1, textView.getText(), viewGroup), new C47246c(textView, charSequence, i, function12), list, oVar);
    }
}
