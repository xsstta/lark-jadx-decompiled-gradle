package com.ss.android.lark.calendar.impl.features.meetingroom.append.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.ui.CommonTitleBar;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\fR+\u0010\t\u001a\u0013\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendResourceTitleBar;", "Lcom/ss/android/lark/ui/CommonTitleBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionListener", "Lkotlin/Function1;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendResourceTitleBar$TitleBarAction;", "", "getActionListener", "()Lkotlin/jvm/functions/Function1;", "setActionListener", "(Lkotlin/jvm/functions/Function1;)V", "showBuildingMultiSelectTitleBar", "selectResourceCount", "showMultiLevelTitleBar", "showNormalCancelTitleBar", "isShowMultiBt", "", "showSearchTitleBar", "TitleBarAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AppendResourceTitleBar extends CommonTitleBar {

    /* renamed from: a */
    private Function1<? super Integer, Unit> f81898a;

    @Target({ElementType.TYPE})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendResourceTitleBar$TitleBarAction;", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface TitleBarAction {
        public static final Companion Companion = Companion.f81899a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendResourceTitleBar$TitleBarAction$Companion;", "", "()V", "BACK", "", "CANCEL_MULTI_SELECT", "CHANGE_MULTI", "CONFIRM_SELECT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar$TitleBarAction$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f81899a = new Companion();

            private Companion() {
            }
        }
    }

    public AppendResourceTitleBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public AppendResourceTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<Integer, Unit> getActionListener() {
        return this.f81898a;
    }

    /* renamed from: a */
    public final void mo116963a() {
        m121889a(this, false, 1, null);
    }

    public final void setActionListener(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "<set-?>");
        this.f81898a = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendResourceTitleBar$TitleBarAction;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar$a */
    static final class C32021a extends Lambda implements Function1<Integer, Unit> {
        public static final C32021a INSTANCE = new C32021a();

        C32021a() {
            super(1);
        }

        public final void invoke(int i) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar$b */
    static final class View$OnClickListenerC32022b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppendResourceTitleBar f81900a;

        View$OnClickListenerC32022b(AppendResourceTitleBar appendResourceTitleBar) {
            this.f81900a = appendResourceTitleBar;
        }

        public final void onClick(View view) {
            this.f81900a.getActionListener().invoke(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar$d */
    static final class View$OnClickListenerC32024d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppendResourceTitleBar f81904a;

        View$OnClickListenerC32024d(AppendResourceTitleBar appendResourceTitleBar) {
            this.f81904a = appendResourceTitleBar;
        }

        public final void onClick(View view) {
            this.f81904a.getActionListener().invoke(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendResourceTitleBar$showMultiLevelTitleBar$titleConfirmView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar$e */
    public static final class C32025e extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ AppendResourceTitleBar f81905a;

        /* renamed from: b */
        final /* synthetic */ String f81906b;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            this.f81905a.getActionListener().invoke(3);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32025e(AppendResourceTitleBar appendResourceTitleBar, String str, String str2, int i) {
            super(str2, i);
            this.f81905a = appendResourceTitleBar;
            this.f81906b = str;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar$f */
    public static final class View$OnClickListenerC32026f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppendResourceTitleBar f81907a;

        View$OnClickListenerC32026f(AppendResourceTitleBar appendResourceTitleBar) {
            this.f81907a = appendResourceTitleBar;
        }

        public final void onClick(View view) {
            this.f81907a.getActionListener().invoke(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendResourceTitleBar$showNormalCancelTitleBar$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar$g */
    public static final class C32027g extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ AppendResourceTitleBar f81908a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            this.f81908a.getActionListener().invoke(1);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32027g(AppendResourceTitleBar appendResourceTitleBar, String str) {
            super(str);
            this.f81908a = appendResourceTitleBar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendResourceTitleBar$showBuildingMultiSelectTitleBar$confirmView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar$c */
    public static final class C32023c extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ AppendResourceTitleBar f81901a;

        /* renamed from: b */
        final /* synthetic */ int f81902b;

        /* renamed from: c */
        final /* synthetic */ String f81903c;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            if (this.f81902b > 0) {
                this.f81901a.getActionListener().invoke(3);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32023c(AppendResourceTitleBar appendResourceTitleBar, int i, String str, String str2, int i2) {
            super(str2, i2);
            this.f81901a = appendResourceTitleBar;
            this.f81902b = i;
            this.f81903c = str;
        }
    }

    /* renamed from: a */
    public final void mo116965a(boolean z) {
        setLeftText("");
        setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        setLeftClickListener(new View$OnClickListenerC32026f(this));
        removeAllActions();
        if (z) {
            addAction(new C32027g(this, C32634ae.m125182b(R.string.Calendar_Common_Multi)));
        }
    }

    /* renamed from: a */
    public final void mo116964a(int i) {
        float f;
        setLeftText("");
        setLeftClickListener(new View$OnClickListenerC32024d(this));
        setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        removeAllActions();
        String b = C32634ae.m125182b(R.string.Calendar_Common_Confirm);
        if (i > 0) {
            b = b + '(' + i + ')';
        }
        View addAction = addAction(new C32025e(this, b, b, R.color.lkui_B500));
        if (!(addAction instanceof TextView)) {
            addAction = null;
        }
        TextView textView = (TextView) addAction;
        if (textView != null) {
            if (i > 0) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            textView.setAlpha(f);
        }
    }

    /* renamed from: b */
    public final void mo116966b(int i) {
        float f;
        String b = C32634ae.m125182b(R.string.Calendar_Common_Confirm);
        if (i > 0) {
            b = b + '(' + i + ')';
        }
        removeAllActions();
        View addAction = addAction(new C32023c(this, i, b, b, R.color.lkui_B500));
        if (!(addAction instanceof TextView)) {
            addAction = null;
        }
        TextView textView = (TextView) addAction;
        if (textView != null) {
            if (i > 0) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            textView.setAlpha(f);
        }
        setLeftImageDrawable(null);
        setLeftText(C32634ae.m125182b(R.string.Calendar_Common_Cancel));
        setLeftClickListener(new View$OnClickListenerC32022b(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppendResourceTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f81898a = C32021a.INSTANCE;
    }

    /* renamed from: a */
    public static /* synthetic */ void m121889a(AppendResourceTitleBar appendResourceTitleBar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        appendResourceTitleBar.mo116965a(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppendResourceTitleBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
