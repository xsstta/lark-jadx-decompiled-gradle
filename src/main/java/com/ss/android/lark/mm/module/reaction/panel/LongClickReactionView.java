package com.ss.android.lark.mm.module.reaction.panel;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/module/reaction/panel/LongClickReactionView;", "Landroid/widget/LinearLayout;", "aContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getAContext", "()Landroid/content/Context;", "reactionView", "Lcom/ss/android/lark/mm/module/reaction/panel/ReactionItemLayout;", "destroy", "", "initView", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LongClickReactionView extends LinearLayout {

    /* renamed from: a */
    public static final Companion f117822a = new Companion(null);

    /* renamed from: b */
    private ReactionItemLayout f117823b;

    /* renamed from: c */
    private final Context f117824c;

    public LongClickReactionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LongClickReactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/reaction/panel/LongClickReactionView$Companion;", "", "()V", "LONG_CLICK_TIME", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.LongClickReactionView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Context getAContext() {
        return this.f117824c;
    }

    /* renamed from: a */
    private final void m185492a() {
        long currentTimeMillis = System.currentTimeMillis();
        Trace.beginSection("APM-ReactionView-initView");
        LayoutInflater.from(this.f117824c).inflate(R.layout.mm_view_long_click_reaction, this);
        this.f117823b = (ReactionItemLayout) getRootView().findViewById(R.id.reaction);
        Trace.endSection();
        C45855f.m181663b("ReactionView", "[APM][initView]duration: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LongClickReactionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "aContext");
        this.f117824c = context;
        m185492a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LongClickReactionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
