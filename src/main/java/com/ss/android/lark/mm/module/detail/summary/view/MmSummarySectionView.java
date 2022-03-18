package com.ss.android.lark.mm.module.detail.summary.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.summary.model.ContentType;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummaryContent;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummarySection;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ¨\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2:\b\u0002\u0010\u001e\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001f2:\b\u0002\u0010$\u001a4\u0012\u0013\u0012\u00110%¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001fJ\b\u0010'\u001a\u00020\u0014H\u0002J\u0016\u0010(\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006)"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/view/MmSummarySectionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mentionSummaryContentView", "Lcom/ss/android/lark/mm/module/detail/summary/view/MmSummaryContentView;", "getMentionSummaryContentView", "()Lcom/ss/android/lark/mm/module/detail/summary/view/MmSummaryContentView;", "setMentionSummaryContentView", "(Lcom/ss/android/lark/mm/module/detail/summary/view/MmSummaryContentView;)V", "bindData", "", "section", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummarySection;", "contents", "", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummaryContent;", "canCheck", "", "mentionContentId", "", "onCheck", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "contentId", "isChecked", "attachContextMenu", "Landroid/widget/TextView;", "textView", "init", "setCheckState", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmSummarySectionView extends LinearLayout {

    /* renamed from: a */
    private MmSummaryContentView f116613a;

    /* renamed from: b */
    private HashMap f116614b;

    /* renamed from: a */
    public View mo162713a(int i) {
        if (this.f116614b == null) {
            this.f116614b = new HashMap();
        }
        View view = (View) this.f116614b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f116614b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final MmSummaryContentView getMentionSummaryContentView() {
        return this.f116613a;
    }

    /* renamed from: a */
    private final void m183272a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_summary_section, this);
        setOrientation(1);
        int dp2px = UIUtils.dp2px(getContext(), 20.0f);
        setPadding(dp2px, UIUtils.dp2px(getContext(), 24.0f), dp2px, UIUtils.dp2px(getContext(), 8.0f));
    }

    public final void setMentionSummaryContentView(MmSummaryContentView mmSummaryContentView) {
        this.f116613a = mmSummaryContentView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmSummarySectionView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "contentId", "", "isChecked", "", "invoke", "com/ss/android/lark/mm/module/detail/summary/view/MmSummarySectionView$bindData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.view.MmSummarySectionView$a */
    static final class C46286a extends Lambda implements Function2<String, Boolean, Unit> {
        final /* synthetic */ Function2 $attachContextMenu$inlined;
        final /* synthetic */ boolean $canCheck$inlined;
        final /* synthetic */ String $mentionContentId$inlined;
        final /* synthetic */ Function2 $onCheck$inlined;
        final /* synthetic */ MmSummarySection $section$inlined;
        final /* synthetic */ MmSummarySectionView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46286a(MmSummarySectionView mmSummarySectionView, MmSummarySection mmSummarySection, boolean z, Function2 kVar, Function2 kVar2, String str) {
            super(2);
            this.this$0 = mmSummarySectionView;
            this.$section$inlined = mmSummarySection;
            this.$canCheck$inlined = z;
            this.$onCheck$inlined = kVar;
            this.$attachContextMenu$inlined = kVar2;
            this.$mentionContentId$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(String str, Boolean bool) {
            invoke(str, bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "contentId");
            Function2 kVar = this.$onCheck$inlined;
            if (kVar != null) {
                Unit unit = (Unit) kVar.invoke(str, Boolean.valueOf(z));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmSummarySectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo162715a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "contentId");
        LinearLayout linearLayout = (LinearLayout) mo162713a(R.id.contentsContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "contentsContainer");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((LinearLayout) mo162713a(R.id.contentsContainer)).getChildAt(i);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "contentView");
            if (Intrinsics.areEqual(childAt.getTag(), str)) {
                ((MmSummaryContentView) childAt).setCheckState(z);
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmSummarySectionView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmSummarySectionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m183272a();
    }

    /* renamed from: a */
    public final void mo162714a(MmSummarySection mmSummarySection, List<MmSummaryContent> list, boolean z, String str, Function2<? super String, ? super Boolean, Unit> kVar, Function2<? super TextView, ? super String, Boolean> kVar2) {
        Intrinsics.checkParameterIsNotNull(mmSummarySection, "section");
        Intrinsics.checkParameterIsNotNull(list, "contents");
        BoldTextView boldTextView = (BoldTextView) mo162713a(R.id.tvSectionTitle);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvSectionTitle");
        boldTextView.setText(mmSummarySection.getTitle());
        ((LinearLayout) mo162713a(R.id.contentsContainer)).removeAllViews();
        for (T t : list) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            MmSummaryContentView mmSummaryContentView = new MmSummaryContentView(context);
            mmSummaryContentView.mo162709a(t, ContentType.Companion.mo162668a(mmSummarySection.getContent_type()), z, new C46286a(this, mmSummarySection, z, kVar, kVar2, str), kVar2);
            mmSummaryContentView.setTag(R.id.mm_summary_content_tag, t.getContent_id());
            if (Intrinsics.areEqual(t.getContent_id(), str)) {
                this.f116613a = mmSummaryContentView;
            }
            ((LinearLayout) mo162713a(R.id.contentsContainer)).addView(mmSummaryContentView);
        }
    }
}
