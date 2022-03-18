package com.ss.android.lark.mm.module.record.detail.menu;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.record.model.Language;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.InterceptableRelativeLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00020\u00112\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u001cJ\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0012\u0010 \u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010#\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010%\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J3\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00132#\u0010(\u001a\u001f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0011\u0018\u00010)R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/menu/LanguagePopup;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isIntercepted", "", "offsetY", "addLanguage", "", "lan", "Lcom/ss/android/lark/mm/module/record/model/Language;", "adjustOffsetY", "rootView", "Landroid/view/View;", "bindData", "recordingLanguageList", "", "init", "interceptRootView", "Lcom/ss/android/lark/mm/widget/InterceptableRelativeLayout;", "isOutside", "x", "y", "onInterceptEvent", "event", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "ev", "onTouchEvent", "select", "recordingLan", "onLanguage", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LanguagePopup extends LinearLayout {

    /* renamed from: a */
    public boolean f118087a;

    /* renamed from: b */
    private int f118088b;

    /* renamed from: a */
    private final void m185781a() {
        setBackgroundResource(R.drawable.mm_bg_language_popup);
        setOrientation(1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.LanguagePopup$b */
    static final class C46904b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function1 $onLanguage;
        final /* synthetic */ TextView $tv;
        final /* synthetic */ LanguagePopup this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46904b(LanguagePopup languagePopup, TextView textView, Function1 function1) {
            super(1);
            this.this$0 = languagePopup;
            this.$tv = textView;
            this.$onLanguage = function1;
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
            Object tag = this.$tv.getTag();
            if (tag != null) {
                Language language = (Language) tag;
                C45855f.m181664c("LanguagePopup", "select language: " + language);
                Function1 function1 = this.$onLanguage;
                if (function1 != null) {
                    Unit unit = (Unit) function1.invoke(language);
                }
                this.this$0.setVisibility(8);
                this.this$0.f118087a = false;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.module.record.model.Language");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/record/detail/menu/LanguagePopup$interceptRootView$1", "Lcom/ss/android/lark/mm/widget/InterceptableRelativeLayout$OnInterceptTouchEventListener;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.menu.LanguagePopup$a */
    public static final class C46903a implements InterceptableRelativeLayout.OnInterceptTouchEventListener {

        /* renamed from: a */
        final /* synthetic */ LanguagePopup f118089a;

        /* renamed from: b */
        final /* synthetic */ InterceptableRelativeLayout f118090b;

        @Override // com.ss.android.lark.mm.widget.InterceptableRelativeLayout.OnInterceptTouchEventListener
        /* renamed from: a */
        public boolean mo164710a(MotionEvent motionEvent) {
            this.f118089a.mo164703a((View) this.f118090b);
            return this.f118089a.mo164707a(motionEvent);
        }

        C46903a(LanguagePopup languagePopup, InterceptableRelativeLayout interceptableRelativeLayout) {
            this.f118089a = languagePopup;
            this.f118090b = interceptableRelativeLayout;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LanguagePopup(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f118087a) {
            return mo164707a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f118087a) {
            return mo164707a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo164703a(View view) {
        if (this.f118088b == 0) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            this.f118088b = rect.top;
        }
    }

    /* renamed from: a */
    private final void m185782a(Language language) {
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, UIUtils.dp2px(getContext(), 50.0f));
        textView.setGravity(16);
        textView.setPadding(UIUtils.dp2px(getContext(), 16.0f), 0, UIUtils.dp2px(getContext(), 37.0f), 0);
        textView.setTextColor(UIUtils.getColor(getContext(), R.color.text_title));
        textView.setTextSize(0, (float) UIUtils.dp2px(getContext(), 14.0f));
        textView.setText(language.getLanguageName());
        textView.setTag(language);
        addView(textView, layoutParams);
    }

    /* renamed from: a */
    public final void mo164705a(InterceptableRelativeLayout interceptableRelativeLayout) {
        Intrinsics.checkParameterIsNotNull(interceptableRelativeLayout, "rootView");
        interceptableRelativeLayout.setTouchEventDelegater(new C46903a(this, interceptableRelativeLayout));
    }

    /* renamed from: a */
    public final void mo164706a(List<? extends Language> list) {
        if (list != null) {
            removeAllViews();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                m185782a((Language) it.next());
            }
        }
    }

    /* renamed from: a */
    public final boolean mo164707a(MotionEvent motionEvent) {
        if (getVisibility() != 0 && !this.f118087a) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && m185783a((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.f118087a = true;
            return true;
        } else if (!this.f118087a) {
            return false;
        } else {
            if ((motionEvent != null && motionEvent.getAction() == 3) || (motionEvent != null && motionEvent.getAction() == 1)) {
                setVisibility(8);
                this.f118087a = false;
            }
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LanguagePopup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final boolean m185783a(int i, int i2) {
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        rect.top -= this.f118088b;
        rect.bottom -= this.f118088b;
        return !rect.contains(i, i2);
    }

    /* renamed from: a */
    public final void mo164704a(Language language, Function1<? super Language, Unit> function1) {
        int i;
        Intrinsics.checkParameterIsNotNull(language, "recordingLan");
        if (getChildCount() != 0) {
            this.f118087a = false;
            if (getVisibility() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            setVisibility(i);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null) {
                    TextView textView = (TextView) childAt;
                    Object tag = textView.getTag();
                    if (tag != null) {
                        if (Intrinsics.areEqual(((Language) tag).getLanguage(), language.getLanguage())) {
                            Context context = getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context, "context");
                            textView.setTextColor(UDColorUtils.getColor(context, R.color.primary_pri_500));
                        } else {
                            Context context2 = getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                            textView.setTextColor(UDColorUtils.getColor(context2, R.color.text_title));
                        }
                        C47110e.m186573a(textView, new C46904b(this, textView, function1));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.module.record.model.Language");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LanguagePopup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguagePopup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m185781a();
    }
}
