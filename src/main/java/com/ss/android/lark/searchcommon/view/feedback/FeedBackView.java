package com.ss.android.lark.searchcommon.view.feedback;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.searchcommon.view.feedback.DialogC54011a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0002#$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\tJ\u0010\u0010!\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/feedback/FeedBackView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoDismissWhenClick", "", "entrance", "", "feedbackArgs", "Lcom/ss/android/lark/searchcommon/view/feedback/SearchFeedbackDialog$IFeedbackArgs;", "feedbackTxt", "Landroid/widget/TextView;", "guideTxt", "onInteraction", "Lcom/ss/android/lark/searchcommon/view/feedback/FeedBackView$IOnInteraction;", "getOnInteraction", "()Lcom/ss/android/lark/searchcommon/view/feedback/FeedBackView$IOnInteraction;", "setOnInteraction", "(Lcom/ss/android/lark/searchcommon/view/feedback/FeedBackView$IOnInteraction;)V", "shadow", "Landroid/view/View;", "showShadow", "dismiss", "", "initFeedback", "initListeners", "initViews", "popup", "autoHide", "setEntrance", "setFeedbackArgs", "Companion", "IOnInteraction", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FeedBackView extends FrameLayout {

    /* renamed from: d */
    public static final Companion f133717d = new Companion(null);

    /* renamed from: a */
    public boolean f133718a;

    /* renamed from: b */
    public DialogC54011a.AbstractC54024b f133719b;

    /* renamed from: c */
    public String f133720c;

    /* renamed from: e */
    private View f133721e;

    /* renamed from: f */
    private TextView f133722f;

    /* renamed from: g */
    private TextView f133723g;

    /* renamed from: h */
    private boolean f133724h;

    /* renamed from: i */
    private IOnInteraction f133725i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/feedback/FeedBackView$IOnInteraction;", "", "onDismiss", "", "onPopUp", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.feedback.FeedBackView$b */
    public interface IOnInteraction {
        /* renamed from: a */
        void mo183182a();

        /* renamed from: b */
        void mo183183b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/feedback/FeedBackView$Companion;", "", "()V", "AUTO_HIDE_DURATION", "", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.feedback.FeedBackView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final IOnInteraction getOnInteraction() {
        return this.f133725i;
    }

    /* renamed from: b */
    private final void m209639b() {
        m209640c();
        m209641d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.feedback.FeedBackView$f */
    public static final class RunnableC54010f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedBackView f133729a;

        RunnableC54010f(FeedBackView feedBackView) {
            this.f133729a = feedBackView;
        }

        public final void run() {
            if (this.f133729a.getVisibility() == 0) {
                this.f133729a.mo184901a();
            }
        }
    }

    /* renamed from: d */
    private final void m209641d() {
        setOnClickListener(new View$OnClickListenerC54008d(this));
    }

    /* renamed from: a */
    public final void mo184901a() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.dismiss);
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC54007c(this));
        startAnimation(loadAnimation);
    }

    /* renamed from: c */
    private final void m209640c() {
        View findViewById = findViewById(R.id.shadow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.shadow)");
        this.f133721e = findViewById;
        View findViewById2 = findViewById(R.id.txt_guide);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.txt_guide)");
        this.f133722f = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.txt_feedback);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.txt_feedback)");
        this.f133723g = (TextView) findViewById3;
    }

    public final void setEntrance(String str) {
        this.f133720c = str;
    }

    public final void setOnInteraction(IOnInteraction bVar) {
        this.f133725i = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/searchcommon/view/feedback/FeedBackView$dismiss$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.feedback.FeedBackView$c  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC54007c implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ FeedBackView f133726a;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        animationAnimation$AnimationListenerC54007c(FeedBackView feedBackView) {
            this.f133726a = feedBackView;
        }

        public void onAnimationEnd(Animation animation) {
            this.f133726a.setVisibility(8);
            IOnInteraction onInteraction = this.f133726a.getOnInteraction();
            if (onInteraction != null) {
                onInteraction.mo183183b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/searchcommon/view/feedback/FeedBackView$popup$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.feedback.FeedBackView$e  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC54009e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ FeedBackView f133728a;

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        animationAnimation$AnimationListenerC54009e(FeedBackView feedBackView) {
            this.f133728a = feedBackView;
        }

        public void onAnimationStart(Animation animation) {
            this.f133728a.setVisibility(0);
            IOnInteraction onInteraction = this.f133728a.getOnInteraction();
            if (onInteraction != null) {
                onInteraction.mo183182a();
            }
        }
    }

    public final void setFeedbackArgs(DialogC54011a.AbstractC54024b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "feedbackArgs");
        this.f133719b = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FeedBackView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.feedback.FeedBackView$d */
    public static final class View$OnClickListenerC54008d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedBackView f133727a;

        View$OnClickListenerC54008d(FeedBackView feedBackView) {
            this.f133727a = feedBackView;
        }

        public final void onClick(View view) {
            String str;
            IntegrationSearchRequest a;
            IntegrationSearchRequest a2;
            if (this.f133727a.f133718a) {
                this.f133727a.mo184901a();
            }
            DialogC54011a aVar = new DialogC54011a(this.f133727a.getContext());
            aVar.mo184916a(this.f133727a.f133719b);
            aVar.mo184917a(this.f133727a.f133720c);
            String str2 = this.f133727a.f133720c;
            DialogC54011a.AbstractC54024b bVar = this.f133727a.f133719b;
            String str3 = null;
            if (bVar == null || (a2 = bVar.mo183184a()) == null) {
                str = null;
            } else {
                str = a2.query;
            }
            DialogC54011a.AbstractC54024b bVar2 = this.f133727a.f133719b;
            if (!(bVar2 == null || (a = bVar2.mo183184a()) == null)) {
                str3 = a.impr_id;
            }
            SearchClickReporter.m208836a(str2, "view", str, str3);
        }
    }

    /* renamed from: a */
    public final void mo184902a(boolean z) {
        if (this.f133724h) {
            View view = this.f133721e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shadow");
            }
            view.setVisibility(0);
        } else {
            View view2 = this.f133721e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shadow");
            }
            view2.setVisibility(8);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.pop_up);
        loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC54009e(this));
        startAnimation(loadAnimation);
        if (z) {
            postDelayed(new RunnableC54010f(this), 5000);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedBackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f133720c = "";
        Log.m165379d("LarkSearch.Common.FeedBackView", "constructor, FeedBackView.");
        LayoutInflater.from(context).inflate(R.layout.view_feedback, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.auto_dismiss_when_click, R.attr.show_shadow}, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(obtainStyledAttributes, "options");
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f133718a = obtainStyledAttributes.getBoolean(index, false);
            } else if (index == 1) {
                this.f133724h = obtainStyledAttributes.getBoolean(index, false);
            }
        }
        obtainStyledAttributes.recycle();
        m209639b();
    }
}
