package com.bytedance.ee.bear.middleground.comment.audio;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.middleground.comment.p449g.C9226a;
import com.bytedance.ee.bear.middleground.comment.widget.CommentEditText;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u0000 C2\u00020\u0001:\u0002CDB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020-H\u0002J\u000e\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020\nJ\u0006\u00101\u001a\u00020\u0014J\u0010\u00102\u001a\u00020-2\b\b\u0002\u00103\u001a\u00020\u0014J\u0006\u00104\u001a\u00020-J\u0018\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0014H\u0002J\u0010\u00108\u001a\u00020-2\u0006\u00106\u001a\u00020\u0014H\u0002J\u0006\u00109\u001a\u00020-J\b\u0010:\u001a\u00020-H\u0002J\u000e\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020\u001dJ\u0010\u0010=\u001a\u00020-2\u0006\u00107\u001a\u00020\u0014H\u0002J\b\u0010>\u001a\u00020-H\u0002J\b\u0010?\u001a\u00020-H\u0002J\b\u0010@\u001a\u00020-H\u0002J\u0010\u0010A\u001a\u00020-2\u0006\u0010B\u001a\u00020\u0014H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\fX.¢\u0006\u0002\n\u0000R(\u0010%\u001a\u0004\u0018\u00010$2\b\u0010#\u001a\u0004\u0018\u00010$@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/audio/RecordPanelView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "atEditText", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentEditText;", "clear", "Landroid/widget/TextView;", "commentAnalytic", "Lcom/bytedance/ee/bear/middleground/comment/uitls/CommentAnalytic;", "getCommentAnalytic", "()Lcom/bytedance/ee/bear/middleground/comment/uitls/CommentAnalytic;", "setCommentAnalytic", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/CommentAnalytic;)V", "firstStartFlag", "", "getFirstStartFlag", "()Z", "setFirstStartFlag", "(Z)V", "languageTv", "motionPlay", "Lcom/bytedance/ee/bear/middleground/comment/audio/MotionFrameLayout;", "operationCallback", "Lcom/bytedance/ee/bear/middleground/comment/audio/RecordPanelView$RecordPanelOperationCallback;", "pause", "Landroid/widget/ImageView;", "play", "send", "tipOperation", "value", "Lcom/bytedance/ee/bear/middleground/comment/audio/RecordViewModel;", "viewModel", "getViewModel", "()Lcom/bytedance/ee/bear/middleground/comment/audio/RecordViewModel;", "setViewModel", "(Lcom/bytedance/ee/bear/middleground/comment/audio/RecordViewModel;)V", "waveLottie", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "disConnect", "", "initViews", "injectEditText", "editText", "isShowing", "pauseRecord", "shouldReport", "reset", "setControlButtonStatus", "recording", "playAnim", "setControlButtonVisible", "setLanguageView", "setListener", "setRecordPanelOperationCallback", "callback", "setRecordUIStatus", "setTipOperationVisibility", "showLanguageActionSheet", "startRecord", "toggleEditStatus", "shown", "Companion", "RecordPanelOperationCallback", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RecordPanelView extends FrameLayout {

    /* renamed from: g */
    public static final Companion f24337g = new Companion(null);

    /* renamed from: a */
    public TextView f24338a;

    /* renamed from: b */
    public TextView f24339b;

    /* renamed from: c */
    public ImageView f24340c;

    /* renamed from: d */
    public ImageView f24341d;

    /* renamed from: e */
    public CommentEditText f24342e;

    /* renamed from: f */
    public RecordPanelOperationCallback f24343f;

    /* renamed from: h */
    private MotionFrameLayout f24344h;

    /* renamed from: i */
    private TextView f24345i;

    /* renamed from: j */
    private TextView f24346j;

    /* renamed from: k */
    private BearLottieView f24347k;

    /* renamed from: l */
    private boolean f24348l;

    /* renamed from: m */
    private C9226a f24349m;

    /* renamed from: n */
    private RecordViewModel f24350n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/audio/RecordPanelView$RecordPanelOperationCallback;", "", "onRecordStatusChanged", "", "recording", "", "onSend", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$b */
    public interface RecordPanelOperationCallback {
        /* renamed from: a */
        void mo34574a();

        /* renamed from: a */
        void mo34575a(boolean z);
    }

    public RecordPanelView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RecordPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/audio/RecordPanelView$Companion;", "", "()V", "ANIM_DURATION", "", "TAG", "", "TRANSLATION_DISTANCE", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C9226a getCommentAnalytic() {
        return this.f24349m;
    }

    public final boolean getFirstStartFlag() {
        return this.f24348l;
    }

    public final RecordViewModel getViewModel() {
        return this.f24350n;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/audio/RecordPanelView$setListener$4", "Lcom/bytedance/ee/bear/middleground/comment/audio/AbsMotionCallbackListener;", "onClick", "", "onLongPressed", "onPressFinished", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$g */
    public static final class C9032g extends AbstractC9037a {

        /* renamed from: c */
        final /* synthetic */ RecordPanelView f24356c;

        @Override // com.bytedance.ee.bear.middleground.comment.audio.AbstractC9039c
        /* renamed from: c */
        public void mo34582c() {
            this.f24356c.mo34560b();
            this.f24356c.mo34561b(false);
        }

        @Override // com.bytedance.ee.bear.middleground.comment.audio.AbstractC9039c
        /* renamed from: d */
        public void mo34583d() {
            RecordPanelView.m37564a(this.f24356c, false, 1, null);
        }

        @Override // com.bytedance.ee.bear.middleground.comment.audio.AbstractC9039c
        /* renamed from: b */
        public void mo34581b() {
            RecordViewModel viewModel = this.f24356c.getViewModel();
            if (viewModel == null || !viewModel.mo34602b()) {
                this.f24356c.mo34560b();
                this.f24356c.mo34561b(false);
                return;
            }
            RecordPanelView.m37564a(this.f24356c, false, 1, null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9032g(RecordPanelView recordPanelView) {
            this.f24356c = recordPanelView;
        }
    }

    /* renamed from: e */
    public final void mo34564e() {
        m37564a(this, false, 1, null);
        RecordViewModel eVar = this.f24350n;
        if (eVar != null) {
            eVar.mo34606f();
        }
    }

    /* renamed from: f */
    public final boolean mo34565f() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private final void m37571i() {
        String str;
        Editable text;
        CommentEditText commentEditText = this.f24342e;
        if (commentEditText == null || (text = commentEditText.getText()) == null) {
            str = null;
        } else {
            str = text.toString();
        }
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.f24346j;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tipOperation");
            }
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = this.f24346j;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipOperation");
        }
        textView2.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo34560b() {
        if (this.f24348l) {
            C9226a aVar = this.f24349m;
            if (aVar != null) {
                aVar.mo35303a("record_audiocomment", null, null, null, false);
            }
        } else {
            C9226a aVar2 = this.f24349m;
            if (aVar2 != null) {
                aVar2.mo35301a("continue");
            }
        }
        CommentEditText commentEditText = this.f24342e;
        if (commentEditText != null) {
            commentEditText.mo35489c();
        }
        RecordViewModel eVar = this.f24350n;
        if (eVar != null) {
            eVar.mo34599a(new C9035j(this));
        }
        RecordPanelOperationCallback bVar = this.f24343f;
        if (bVar != null) {
            bVar.mo34575a(true);
        }
        this.f24348l = false;
    }

    /* renamed from: h */
    private final void m37570h() {
        TextView textView = this.f24338a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clear");
        }
        textView.setOnClickListener(new View$OnClickListenerC9029d(this));
        TextView textView2 = this.f24339b;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("send");
        }
        textView2.setOnClickListener(new View$OnClickListenerC9030e(this));
        TextView textView3 = this.f24345i;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("languageTv");
        }
        textView3.setOnClickListener(new View$OnClickListenerC9031f(this));
        MotionFrameLayout motionFrameLayout = this.f24344h;
        if (motionFrameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("motionPlay");
        }
        motionFrameLayout.setMotionCallbackListener(new C9032g(this));
    }

    /* renamed from: c */
    public final void mo34562c() {
        C11811a a = C11811a.m48976a(getContext());
        a.mo45215a(R.string.Doc_Comment_Chinese, new View$OnClickListenerC9033h(this));
        a.mo45215a(R.string.Doc_Comment_English, new View$OnClickListenerC9034i(this));
        C11816b.C11818a a2 = C11816b.m49006a();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        a.mo45226b(a2.mo45251a(context.getResources().getColor(R.color.function_danger_500)).mo45257a());
        a.mo45224b().show();
    }

    /* renamed from: d */
    public final void mo34563d() {
        TextView textView = this.f24338a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clear");
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            TextView textView2 = this.f24339b;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("send");
            }
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams2.f2816h = R.id.motion_play;
                layoutParams2.f2825q = R.id.motion_play;
                layoutParams2.f2827s = R.id.motion_play;
                layoutParams4.f2816h = R.id.motion_play;
                layoutParams4.f2825q = R.id.motion_play;
                layoutParams4.f2827s = R.id.motion_play;
                mo34559a(false);
                TextView textView3 = this.f24338a;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("clear");
                }
                textView3.setVisibility(8);
                TextView textView4 = this.f24339b;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("send");
                }
                textView4.setVisibility(8);
                m37571i();
                mo34557a();
                this.f24348l = true;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* renamed from: g */
    private final void m37569g() {
        View findViewById = findViewById(R.id.clear);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.clear)");
        this.f24338a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.send);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.send)");
        this.f24339b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.play);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.play)");
        this.f24340c = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.pause);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.pause)");
        this.f24341d = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.motion_play);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.motion_play)");
        this.f24344h = (MotionFrameLayout) findViewById5;
        View findViewById6 = findViewById(R.id.lottie_wave);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.lottie_wave)");
        this.f24347k = (BearLottieView) findViewById6;
        View findViewById7 = findViewById(R.id.tv_language);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.tv_language)");
        this.f24345i = (TextView) findViewById7;
        View findViewById8 = findViewById(R.id.tv_tip_operation);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.tv_tip_operation)");
        this.f24346j = (TextView) findViewById8;
    }

    /* renamed from: a */
    public final void mo34557a() {
        int i;
        String str;
        C1177w<String> d;
        TextView textView = this.f24345i;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("languageTv");
        }
        RecordViewModel eVar = this.f24350n;
        if (eVar == null || !eVar.mo34602b()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        RecordViewModel eVar2 = this.f24350n;
        if (eVar2 == null || (d = eVar2.mo34604d()) == null) {
            str = null;
        } else {
            str = d.mo5927b();
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 96647668) {
                if (hashCode == 115862294 && str.equals("zh_ch")) {
                    TextView textView2 = this.f24345i;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("languageTv");
                    }
                    textView2.setText(getContext().getString(R.string.Doc_Comment_Chinese));
                }
            } else if (str.equals("en_us")) {
                TextView textView3 = this.f24345i;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("languageTv");
                }
                textView3.setText(getContext().getString(R.string.Doc_Comment_English));
            }
        }
    }

    public final void setCommentAnalytic(C9226a aVar) {
        this.f24349m = aVar;
    }

    public final void setFirstStartFlag(boolean z) {
        this.f24348l = z;
    }

    /* renamed from: a */
    public final void mo34558a(CommentEditText commentEditText) {
        Intrinsics.checkParameterIsNotNull(commentEditText, "editText");
        this.f24342e = commentEditText;
    }

    public final void setRecordPanelOperationCallback(RecordPanelOperationCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        this.f24343f = bVar;
    }

    public final void setViewModel(RecordViewModel eVar) {
        this.f24350n = eVar;
        setRecordUIStatus(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/middleground/comment/audio/RecordPanelView$setControlButtonStatus$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$c */
    public static final class C9028c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecordPanelView f24351a;

        /* renamed from: b */
        final /* synthetic */ boolean f24352b;

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f24351a.setControlButtonVisible(this.f24352b);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            if (this.f24352b) {
                RecordPanelView.m37567c(this.f24351a).setVisibility(0);
            } else {
                RecordPanelView.m37568d(this.f24351a).setVisibility(0);
            }
        }

        C9028c(RecordPanelView recordPanelView, boolean z) {
            this.f24351a = recordPanelView;
            this.f24352b = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$h */
    public static final class View$OnClickListenerC9033h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecordPanelView f24357a;

        View$OnClickListenerC9033h(RecordPanelView recordPanelView) {
            this.f24357a = recordPanelView;
        }

        public final void onClick(View view) {
            RecordViewModel viewModel = this.f24357a.getViewModel();
            if (viewModel != null) {
                viewModel.mo34597a("zh_ch");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$i */
    public static final class View$OnClickListenerC9034i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecordPanelView f24358a;

        View$OnClickListenerC9034i(RecordPanelView recordPanelView) {
            this.f24358a = recordPanelView;
        }

        public final void onClick(View view) {
            RecordViewModel viewModel = this.f24358a.getViewModel();
            if (viewModel != null) {
                viewModel.mo34597a("en_us");
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m37563a(RecordPanelView recordPanelView) {
        TextView textView = recordPanelView.f24338a;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clear");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m37566b(RecordPanelView recordPanelView) {
        TextView textView = recordPanelView.f24339b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("send");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m37567c(RecordPanelView recordPanelView) {
        ImageView imageView = recordPanelView.f24341d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pause");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ ImageView m37568d(RecordPanelView recordPanelView) {
        ImageView imageView = recordPanelView.f24340c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("play");
        }
        return imageView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$e */
    public static final class View$OnClickListenerC9030e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecordPanelView f24354a;

        View$OnClickListenerC9030e(RecordPanelView recordPanelView) {
            this.f24354a = recordPanelView;
        }

        public final void onClick(View view) {
            C9226a commentAnalytic = this.f24354a.getCommentAnalytic();
            if (commentAnalytic != null) {
                commentAnalytic.mo35301a("send");
            }
            RecordPanelOperationCallback bVar = this.f24354a.f24343f;
            if (bVar != null) {
                bVar.mo34574a();
            }
            this.f24354a.mo34561b(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$f */
    public static final class View$OnClickListenerC9031f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecordPanelView f24355a;

        View$OnClickListenerC9031f(RecordPanelView recordPanelView) {
            this.f24355a = recordPanelView;
        }

        public final void onClick(View view) {
            C9226a commentAnalytic = this.f24355a.getCommentAnalytic();
            if (commentAnalytic != null) {
                commentAnalytic.mo35301a("switch_lan");
            }
            this.f24355a.mo34562c();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$d */
    public static final class View$OnClickListenerC9029d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecordPanelView f24353a;

        View$OnClickListenerC9029d(RecordPanelView recordPanelView) {
            this.f24353a = recordPanelView;
        }

        public final void onClick(View view) {
            Editable text;
            C9226a commentAnalytic = this.f24353a.getCommentAnalytic();
            if (commentAnalytic != null) {
                commentAnalytic.mo35301a("text_clear");
            }
            CommentEditText commentEditText = this.f24353a.f24342e;
            if (!(commentEditText == null || (text = commentEditText.getText()) == null)) {
                text.clear();
            }
            this.f24353a.mo34561b(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/middleground/comment/audio/RecordPanelView$toggleEditStatus$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$k */
    public static final class C9036k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecordPanelView f24359a;

        /* renamed from: b */
        final /* synthetic */ boolean f24360b;

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationEnd(animator);
            if (!this.f24360b) {
                RecordPanelView.m37563a(this.f24359a).setVisibility(8);
                RecordPanelView.m37566b(this.f24359a).setVisibility(8);
                return;
            }
            RecordPanelView.m37563a(this.f24359a).setVisibility(0);
            RecordPanelView.m37566b(this.f24359a).setVisibility(0);
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            super.onAnimationStart(animator);
            if (this.f24360b) {
                RecordPanelView.m37563a(this.f24359a).setVisibility(0);
                RecordPanelView.m37566b(this.f24359a).setVisibility(0);
                return;
            }
            RecordPanelView.m37563a(this.f24359a).setVisibility(8);
            RecordPanelView.m37566b(this.f24359a).setVisibility(8);
        }

        C9036k(RecordPanelView recordPanelView, boolean z) {
            this.f24359a = recordPanelView;
            this.f24360b = z;
        }
    }

    /* renamed from: a */
    public final void mo34559a(boolean z) {
        C9226a aVar;
        RecordViewModel eVar = this.f24350n;
        if (eVar != null) {
            eVar.mo34605e();
        }
        CommentEditText commentEditText = this.f24342e;
        if (commentEditText != null) {
            commentEditText.mo35490d();
        }
        mo34561b(true);
        RecordPanelOperationCallback bVar = this.f24343f;
        if (bVar != null) {
            bVar.mo34575a(false);
        }
        if (z && (aVar = this.f24349m) != null) {
            aVar.mo35301a("pause");
        }
    }

    public final void setControlButtonVisible(boolean z) {
        int i;
        ImageView imageView = this.f24340c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("play");
        }
        int i2 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = this.f24341d;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pause");
        }
        if (z) {
            i2 = 0;
        }
        imageView2.setVisibility(i2);
    }

    private final void setRecordUIStatus(boolean z) {
        RecordViewModel eVar = this.f24350n;
        boolean z2 = true;
        if (eVar == null || !eVar.mo34602b()) {
            z2 = false;
        }
        m37565a(z2, z);
        if (z2) {
            TextView textView = this.f24345i;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("languageTv");
            }
            textView.setVisibility(8);
            TextView textView2 = this.f24346j;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tipOperation");
            }
            textView2.setVisibility(8);
            BearLottieView bearLottieView = this.f24347k;
            if (bearLottieView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("waveLottie");
            }
            bearLottieView.setVisibility(0);
            BearLottieView bearLottieView2 = this.f24347k;
            if (bearLottieView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("waveLottie");
            }
            bearLottieView2.playAnimation();
            return;
        }
        TextView textView3 = this.f24345i;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("languageTv");
        }
        textView3.setVisibility(0);
        BearLottieView bearLottieView3 = this.f24347k;
        if (bearLottieView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waveLottie");
        }
        bearLottieView3.setVisibility(8);
        BearLottieView bearLottieView4 = this.f24347k;
        if (bearLottieView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waveLottie");
        }
        bearLottieView4.cancelAnimation();
        m37571i();
    }

    /* renamed from: b */
    public final void mo34561b(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        Editable text;
        boolean z2;
        Integer num;
        Editable text2;
        setRecordUIStatus(true);
        TextView textView = this.f24339b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("send");
        }
        if (textView.getVisibility() != 8 || z) {
            CommentEditText commentEditText = this.f24342e;
            Object obj = null;
            if (!(commentEditText == null || (text = commentEditText.getText()) == null)) {
                if (text.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("editext:");
                    CommentEditText commentEditText2 = this.f24342e;
                    if (commentEditText2 != null) {
                        num = Integer.valueOf(commentEditText2.hashCode());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append("toggleEditStatus:");
                    sb.append(z);
                    sb.append(",text:");
                    CommentEditText commentEditText3 = this.f24342e;
                    if (!(commentEditText3 == null || (text2 = commentEditText3.getText()) == null)) {
                        obj = Integer.valueOf(text2.length());
                    }
                    sb.append(obj);
                    C13479a.m54772d("RecordPanelView", sb.toString());
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toggleEditStatus anim :");
            sb2.append(z);
            sb2.append(",text:");
            CommentEditText commentEditText4 = this.f24342e;
            if (commentEditText4 != null) {
                obj = commentEditText4.getText();
            }
            sb2.append(String.valueOf(obj));
            C13479a.m54772d("RecordPanelView", sb2.toString());
            AnimatorSet animatorSet = new AnimatorSet();
            float f5 = 1.0f;
            float f6 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (!z) {
                f5 = BitmapDescriptorFactory.HUE_RED;
            }
            if (z) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f2 = -((float) C13749l.m55738a((int) SmActions.ACTION_INIT_EXIT));
            }
            if (z) {
                f3 = (float) C13749l.m55738a((int) SmActions.ACTION_INIT_EXIT);
            } else {
                f3 = BitmapDescriptorFactory.HUE_RED;
            }
            if (z) {
                f4 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f4 = (float) C13749l.m55738a((int) SmActions.ACTION_INIT_EXIT);
            }
            if (z) {
                f6 = -((float) C13749l.m55738a((int) SmActions.ACTION_INIT_EXIT));
            }
            TextView textView2 = this.f24339b;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("send");
            }
            if (textView2 != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, "alpha", f, f5);
                TextView textView3 = this.f24338a;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("clear");
                }
                if (textView3 != null) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, "alpha", f, f5);
                    TextView textView4 = this.f24339b;
                    if (textView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("send");
                    }
                    if (textView4 != null) {
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView4, "scaleX", f, f5);
                        TextView textView5 = this.f24339b;
                        if (textView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("send");
                        }
                        if (textView5 != null) {
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView5, "scaleY", f, f5);
                            TextView textView6 = this.f24338a;
                            if (textView6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("clear");
                            }
                            if (textView6 != null) {
                                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView6, "scaleX", f, f5);
                                TextView textView7 = this.f24338a;
                                if (textView7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("clear");
                                }
                                if (textView7 != null) {
                                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView7, "scaleY", f, f5);
                                    TextView textView8 = this.f24339b;
                                    if (textView8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("send");
                                    }
                                    if (textView8 != null) {
                                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView8, "translationX", f2, f3);
                                        TextView textView9 = this.f24338a;
                                        if (textView9 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("clear");
                                        }
                                        if (textView9 != null) {
                                            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView9, "translationX", f4, f6);
                                            animatorSet.setDuration(200L);
                                            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat8, ofFloat7);
                                            animatorSet.setInterpolator(new AccelerateInterpolator());
                                            animatorSet.addListener(new C9036k(this, z));
                                            animatorSet.start();
                                            return;
                                        }
                                        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                                    }
                                    throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* renamed from: a */
    private final void m37565a(boolean z, boolean z2) {
        float f;
        if (z2) {
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            if (z) {
                f2 = 1.0f;
            }
            ImageView imageView = this.f24341d;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pause");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "alpha", f, f2);
            ImageView imageView2 = this.f24340c;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("play");
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, "alpha", f2, f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new C9028c(this, z));
            animatorSet.start();
            return;
        }
        setControlButtonVisible(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "content", "", "finish", "", "diffIndex", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.RecordPanelView$j */
    public static final class C9035j extends Lambda implements Function3<String, Boolean, int[], Unit> {
        final /* synthetic */ RecordPanelView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9035j(RecordPanelView recordPanelView) {
            super(3);
            this.this$0 = recordPanelView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(String str, Boolean bool, int[] iArr) {
            invoke(str, bool.booleanValue(), iArr);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, boolean z, int[] iArr) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(iArr, "diffIndex");
            if (!z) {
                CommentEditText commentEditText = this.this$0.f24342e;
                if (commentEditText != null) {
                    commentEditText.mo35488a(str, z, iArr);
                    return;
                }
                return;
            }
            C13479a.m54764b("RecordPanelView", "startRecord: finish content" + str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f24348l = true;
        LayoutInflater.from(context).inflate(R.layout.comment_record_panel, this);
        m37569g();
        m37570h();
    }

    /* renamed from: a */
    public static /* synthetic */ void m37564a(RecordPanelView recordPanelView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        recordPanelView.mo34559a(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecordPanelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
