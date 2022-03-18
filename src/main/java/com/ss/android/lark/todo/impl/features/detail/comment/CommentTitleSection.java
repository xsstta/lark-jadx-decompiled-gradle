package com.ss.android.lark.todo.impl.features.detail.comment;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.p1173a.p1174a.C25877a;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.TimePreciseness;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentTitleSection;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "view", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "isCreatorInfoShow", "", "mIsSkeletonLoading", "mSkeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "mSkeletonRunnable", "Ljava/lang/Runnable;", "commentEmpty", "", "isEmpty", "commentLoadingFailed", "failed", "commentLoadingMore", "isLoading", "hideSkeleton", "initCreatorInfo", "creatorInfo", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CreatorInfo;", "initViewAction", "initViewObserver", "showSkeleton", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.v */
public final class CommentTitleSection extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: d */
    public static final Companion f139893d = new Companion(null);

    /* renamed from: a */
    public boolean f139894a;

    /* renamed from: b */
    public C2057g f139895b;

    /* renamed from: c */
    public final View f139896c;

    /* renamed from: e */
    private Runnable f139897e;

    /* renamed from: f */
    private final boolean f139898f = TodoDependencyHolder.f139242a.mo191731b().mo191940m();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/comment/CommentTitleSection$Companion;", "", "()V", "TAG", "", "rotate", "", "Landroid/widget/ImageView;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.v$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo192484a(ImageView imageView) {
            RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(400);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setRepeatMode(1);
            imageView.startAnimation(rotateAnimation);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.v$h */
    public static final class RunnableC56557h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommentTitleSection f139899a;

        RunnableC56557h(CommentTitleSection vVar) {
            this.f139899a = vVar;
        }

        public final void run() {
            CommentTitleSection vVar = this.f139899a;
            vVar.f139895b = C2052c.m8961a((FrameLayout) vVar.f139896c.findViewById(R.id.commentSkeletonFl)).mo10151a(R.layout.todo_detail_comment_skeleton).mo10152a(true).mo10156d(20).mo10155c(1000).mo10153a();
            this.f139899a.f139894a = true;
        }
    }

    /* renamed from: k */
    public final void mo192483k() {
        Log.m165389i("CommentSection", "hide skeleton");
        FrameLayout frameLayout = (FrameLayout) this.f139896c.findViewById(R.id.commentSkeletonFl);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.commentSkeletonFl");
        frameLayout.setVisibility(8);
        Runnable runnable = this.f139897e;
        if (runnable != null) {
            UICallbackExecutor.removeCallbacks(runnable);
            this.f139897e = null;
        }
        C2057g gVar = this.f139895b;
        if (gVar != null) {
            if (gVar != null) {
                gVar.mo10130b();
            }
            this.f139894a = false;
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        ITodoDetailViewDataStore qVar = (ITodoDetailViewDataStore) mo92096a();
        mo92103a(qVar.getCommentIsEmpty(), new C56551b(this));
        mo92103a(qVar.getCommentIsLoading(), new C56552c(this));
        mo92103a(qVar.getCommentHasMore(), new C56553d(this));
        mo92103a(qVar.getCommentLoadingMore(), new C56554e(this));
        mo92103a(qVar.getCommentLoadingFailed(), new C56555f(this));
        mo92103a(qVar.getCreatorInfo(), new C56556g(this));
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
        TextView textView = (TextView) this.f139896c.findViewById(R.id.commentShowMoreTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.commentShowMoreTv");
        C25877a.m93657a(textView, mo92107d(), 130);
        ImageView imageView = (ImageView) this.f139896c.findViewById(R.id.comment_load_status_iv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "view.comment_load_status_iv");
        C25877a.m93657a(imageView, mo92107d(), 146);
        TextView textView2 = (TextView) this.f139896c.findViewById(R.id.comment_load_status_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.comment_load_status_tv");
        C25877a.m93657a(textView2, mo92107d(), 146);
    }

    /* renamed from: j */
    public final void mo192482j() {
        Log.m165389i("CommentSection", "show skeleton");
        if (!this.f139894a) {
            LinearLayout linearLayout = (LinearLayout) this.f139896c.findViewById(R.id.commentTitleLl);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.commentTitleLl");
            linearLayout.setVisibility(0);
            FrameLayout frameLayout = (FrameLayout) this.f139896c.findViewById(R.id.commentSkeletonFl);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.commentSkeletonFl");
            frameLayout.setVisibility(0);
            RunnableC56557h hVar = new RunnableC56557h(this);
            this.f139897e = hVar;
            UICallbackExecutor.executeDelayed(hVar, 100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentTitleSection$initViewObserver$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.v$b */
    static final class C56551b extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ CommentTitleSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56551b(CommentTitleSection vVar) {
            super(1);
            this.this$0 = vVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192479a(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentTitleSection$initViewObserver$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.v$e */
    static final class C56554e extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ CommentTitleSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56554e(CommentTitleSection vVar) {
            super(1);
            this.this$0 = vVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192480b(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentTitleSection$initViewObserver$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.v$f */
    static final class C56555f extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ CommentTitleSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56555f(CommentTitleSection vVar) {
            super(1);
            this.this$0 = vVar;
        }

        public final void invoke(boolean z) {
            this.this$0.mo192481c(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/comment/CreatorInfo;", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentTitleSection$initViewObserver$1$6"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.v$g */
    static final class C56556g extends Lambda implements Function1<CreatorInfo, Unit> {
        final /* synthetic */ CommentTitleSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56556g(CommentTitleSection vVar) {
            super(1);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreatorInfo yVar) {
            invoke(yVar);
            return Unit.INSTANCE;
        }

        public final void invoke(CreatorInfo yVar) {
            Intrinsics.checkParameterIsNotNull(yVar, "it");
            this.this$0.mo192478a(yVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentTitleSection$initViewObserver$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.v$c */
    static final class C56552c extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ CommentTitleSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56552c(CommentTitleSection vVar) {
            super(1);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                this.this$0.mo192482j();
            } else {
                this.this$0.mo192483k();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "com/ss/android/lark/todo/impl/features/detail/comment/CommentTitleSection$initViewObserver$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.comment.v$d */
    static final class C56553d extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ CommentTitleSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56553d(CommentTitleSection vVar) {
            super(1);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            LinearLayout linearLayout = (LinearLayout) this.this$0.f139896c.findViewById(R.id.commentShowMoreLl);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.commentShowMoreLl");
            C25877a.m93659a(linearLayout, z);
        }
    }

    /* renamed from: c */
    public final void mo192481c(boolean z) {
        FrameLayout frameLayout = (FrameLayout) this.f139896c.findViewById(R.id.comment_load_fail);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.comment_load_fail");
        C25877a.m93659a(frameLayout, z);
    }

    /* renamed from: a */
    public final void mo192479a(boolean z) {
        LinearLayout linearLayout = (LinearLayout) this.f139896c.findViewById(R.id.commentTitleLl);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.commentTitleLl");
        C25877a.m93659a(linearLayout, !z);
        FrameLayout frameLayout = (FrameLayout) this.f139896c.findViewById(R.id.commentSkeletonFl);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "view.commentSkeletonFl");
        C25877a.m93659a(frameLayout, !z);
    }

    /* renamed from: a */
    public final void mo192478a(CreatorInfo yVar) {
        RelativeLayout relativeLayout = (RelativeLayout) this.f139896c.findViewById(R.id.creator_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "view.creator_container");
        C25877a.m93659a(relativeLayout, this.f139898f);
        if (this.f139898f) {
            LinearLayout linearLayout = (LinearLayout) this.f139896c.findViewById(R.id.commentTitleLl);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.commentTitleLl");
            C25877a.m93659a(linearLayout, true);
        }
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Todo_Task_ChangeLogUserCreatedTask, "user_name", yVar.mo192498a());
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191592a(DisplayPattern.RELATIVE);
        aVar.mo191599b(true ^ TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b());
        aVar.mo191594a(TimePreciseness.MINUTE);
        String g = TimeFormatUtils.m219292g(mo92106c(), new Date(yVar.mo192499b()), aVar);
        SpannableString spannableString = new SpannableString(mustacheFormat + "  " + g);
        spannableString.setSpan(new ForegroundColorSpan(UIHelper.getColor(R.color.text_title)), 0, mustacheFormat.length(), 33);
        TextView textView = (TextView) this.f139896c.findViewById(R.id.creator_tv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.creator_tv");
        textView.setText(spannableString);
    }

    /* renamed from: b */
    public final void mo192480b(boolean z) {
        ImageView imageView = (ImageView) this.f139896c.findViewById(R.id.commentShowMoreIv);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "view.commentShowMoreIv");
        C25877a.m93659a(imageView, z);
        if (z) {
            Companion aVar = f139893d;
            ImageView imageView2 = (ImageView) this.f139896c.findViewById(R.id.commentShowMoreIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "view.commentShowMoreIv");
            aVar.mo192484a(imageView2);
            TextView textView = (TextView) this.f139896c.findViewById(R.id.commentShowMoreTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.commentShowMoreTv");
            textView.setText(UIHelper.getString(R.string.Lark_Legacy_LoadingNow));
            ((TextView) this.f139896c.findViewById(R.id.commentShowMoreTv)).setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            return;
        }
        ((ImageView) this.f139896c.findViewById(R.id.commentShowMoreIv)).clearAnimation();
        TextView textView2 = (TextView) this.f139896c.findViewById(R.id.commentShowMoreTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.commentShowMoreTv");
        textView2.setText(UIHelper.getString(R.string.Todo_Task_ShowEarlierComment));
        ((TextView) this.f139896c.findViewById(R.id.commentShowMoreTv)).setTextColor(UIHelper.getColor(R.color.primary_pri_500));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentTitleSection(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f139896c = view;
    }
}
