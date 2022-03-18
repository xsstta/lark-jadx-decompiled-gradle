package com.ss.android.vc.meeting.module.reaction.view.reaction;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.vc.meeting.module.reaction.util.ReactionUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/view/reaction/LongClickReactionView;", "Landroid/widget/LinearLayout;", "aContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getAContext", "()Landroid/content/Context;", "countNum", "mPresent", "Lcom/ss/android/vc/meeting/module/base/IMeetingCallPresent;", "mReactionControl", "Lcom/ss/android/vc/meeting/module/reaction/AbsReactionControl;", "mReactionLoadManager", "Lcom/ss/android/lark/reaction/loader/ReactionLoaderManager;", "kotlin.jvm.PlatformType", "reactionView", "Lcom/ss/android/vc/meeting/module/reaction/view/reaction/ReactionItemLayout;", "addReactionCountNum", "", "displayPeriod", "destroy", "generateReactionView", "reactionKey", "", "initView", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class LongClickReactionView extends LinearLayout {

    /* renamed from: a */
    public static final Companion f158251a = new Companion(null);

    /* renamed from: b */
    private final C52977a f158252b;

    /* renamed from: c */
    private ReactionItemLayout f158253c;

    /* renamed from: d */
    private int f158254d;

    /* renamed from: e */
    private final Context f158255e;

    public LongClickReactionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LongClickReactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/view/reaction/LongClickReactionView$Companion;", "", "()V", "LONG_CLICK_TIME", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.view.reaction.LongClickReactionView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Context getAContext() {
        return this.f158255e;
    }

    /* renamed from: a */
    public final void mo217181a() {
        ReactionItemLayout reactionItemLayout = this.f158253c;
        if (reactionItemLayout != null) {
            reactionItemLayout.setVisibility(8);
        }
        this.f158253c = null;
    }

    /* renamed from: b */
    private final void m246042b() {
        System.currentTimeMillis();
        Trace.beginSection("APM-ReactionView-initView");
        LayoutInflater.from(this.f158255e).inflate(R.layout.vc_view_long_click_reaction, this);
        this.f158253c = (ReactionItemLayout) getRootView().findViewById(R.id.reaction);
        Trace.endSection();
    }

    /* renamed from: a */
    public final void mo217182a(int i) {
        TextView textView;
        ReactionItemLayout reactionItemLayout = this.f158253c;
        if (reactionItemLayout != null) {
            int i2 = this.f158254d;
            this.f158254d = i2 + 1;
            reactionItemLayout.setReactionNum(i2);
        }
        ReactionUtil cVar = ReactionUtil.f157998a;
        ReactionItemLayout reactionItemLayout2 = this.f158253c;
        TextView textView2 = null;
        if (reactionItemLayout2 != null) {
            textView = reactionItemLayout2.getReactionNum();
        } else {
            textView = null;
        }
        ReactionItemLayout reactionItemLayout3 = this.f158253c;
        if (reactionItemLayout3 != null) {
            textView2 = reactionItemLayout3.getMultiplication();
        }
        cVar.mo216893a(textView, textView2);
    }

    /* renamed from: a */
    public final void mo217183a(String str) {
        ImageView imageView;
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        C52977a aVar = this.f158252b;
        ReactionItemLayout reactionItemLayout = this.f158253c;
        if (reactionItemLayout != null) {
            imageView = reactionItemLayout.getReactionIcon();
        } else {
            imageView = null;
        }
        aVar.mo180995a(imageView, str);
        ReactionItemLayout reactionItemLayout2 = this.f158253c;
        if (reactionItemLayout2 != null) {
            reactionItemLayout2.mo217185a(true);
        }
        ReactionItemLayout reactionItemLayout3 = this.f158253c;
        if (reactionItemLayout3 != null) {
            reactionItemLayout3.setReactionNum(2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LongClickReactionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "aContext");
        this.f158255e = context;
        this.f158252b = C52977a.m205190a();
        this.f158254d = 3;
        m246042b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LongClickReactionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
