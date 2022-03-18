package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.ClickButtonEvent;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJA\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\u0006\u0010\u001c\u001a\u00020\t2#\u0010\u000f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010J\"\u0010\u001d\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\tJ\u0018\u0010 \u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\tH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmBubbleTagLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isExpanded", "", "onClickTag", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "text", "", "selectedIndex", "tags", "", "Lcom/ss/android/lark/mm/widget/MmBubbleTagLayout$TagData;", "bindData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "maxWidth", "init", "selectTag", "index", "showTags", "Companion", "TagData", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmBubbleTagLayout extends LinearLayout {

    /* renamed from: c */
    public static final Companion f118693c = new Companion(null);

    /* renamed from: f */
    private static final int f118694f;

    /* renamed from: g */
    private static final int f118695g;

    /* renamed from: h */
    private static final int f118696h;

    /* renamed from: a */
    public Function1<? super String, Unit> f118697a;

    /* renamed from: b */
    public boolean f118698b;

    /* renamed from: d */
    private List<TagData> f118699d;

    /* renamed from: e */
    private int f118700e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmBubbleTagLayout$Companion;", "", "()V", "paddingBottom", "", "paddingLeft", "paddingTop", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmBubbleTagLayout$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmBubbleTagLayout$TagData;", "", "index", "", "text", "", "(ILjava/lang/String;)V", "getIndex", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmBubbleTagLayout$b */
    public static final class TagData {

        /* renamed from: a */
        private final int f118701a;

        /* renamed from: b */
        private final String f118702b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TagData)) {
                return false;
            }
            TagData bVar = (TagData) obj;
            return this.f118701a == bVar.f118701a && Intrinsics.areEqual(this.f118702b, bVar.f118702b);
        }

        public int hashCode() {
            int i = this.f118701a * 31;
            String str = this.f118702b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "TagData(index=" + this.f118701a + ", text=" + this.f118702b + ")";
        }

        /* renamed from: a */
        public final int mo165562a() {
            return this.f118701a;
        }

        /* renamed from: b */
        public final String mo165563b() {
            return this.f118702b;
        }

        public TagData(int i, String str) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            this.f118701a = i;
            this.f118702b = str;
        }
    }

    static {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
        f118694f = UIUtils.dp2px(contextDepend.mo144557a(), 15.0f);
        IMmDepend a2 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend2 = a2.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend2, "MmDepend.impl().contextDepend");
        f118695g = UIUtils.dp2px(contextDepend2.mo144557a(), 14.0f);
        IMmDepend a3 = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "MmDepend.impl()");
        IMmDepend.AbstractC45871b contextDepend3 = a3.getContextDepend();
        Intrinsics.checkExpressionValueIsNotNull(contextDepend3, "MmDepend.impl().contextDepend");
        f118696h = UIUtils.dp2px(contextDepend3.mo144557a(), 6.0f);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmBubbleTagLayout$c */
    public static final class C47126c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function1 $onClickTag;
        final /* synthetic */ MmBubbleTagLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47126c(MmBubbleTagLayout mmBubbleTagLayout, Function1 function1) {
            super(1);
            this.this$0 = mmBubbleTagLayout;
            this.$onClickTag = function1;
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
            this.this$0.mo165559a(-1);
            this.$onClickTag.invoke(null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tagData", "Lcom/ss/android/lark/mm/widget/MmBubbleTagLayout$TagData;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmBubbleTagLayout$d */
    public static final class C47127d extends Lambda implements Function1<TagData, Unit> {
        final /* synthetic */ MmBubbleTagLayout this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47127d(MmBubbleTagLayout mmBubbleTagLayout) {
            super(1);
            this.this$0 = mmBubbleTagLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TagData bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(TagData bVar) {
            if (bVar == null) {
                this.this$0.mo165559a(-1);
                MmBubbleTagLayout.m186617a(this.this$0).invoke(null);
                return;
            }
            this.this$0.mo165559a(bVar.mo165562a());
            MmBubbleTagLayout.m186617a(this.this$0).invoke(bVar.mo165563b());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTagLayout(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ Function1 m186617a(MmBubbleTagLayout mmBubbleTagLayout) {
        Function1<? super String, Unit> function1 = mmBubbleTagLayout.f118697a;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClickTag");
        }
        return function1;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmBubbleTagLayout$e */
    public static final class View$OnClickListenerC47128e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmBubbleTagLayout f118703a;

        /* renamed from: b */
        final /* synthetic */ boolean f118704b;

        /* renamed from: c */
        final /* synthetic */ int f118705c;

        View$OnClickListenerC47128e(MmBubbleTagLayout mmBubbleTagLayout, boolean z, int i) {
            this.f118703a = mmBubbleTagLayout;
            this.f118704b = z;
            this.f118705c = i;
        }

        public final void onClick(View view) {
            if (!this.f118704b) {
                ClickButtonEvent aVar = new ClickButtonEvent("key_words_more", null, null, null, null, null, null, SmActions.ACTION_RINGING_EXIT, null);
                Context context = this.f118703a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                aVar.mo165434a(context).mo165437a();
                C47083e.m186423a(this.f118703a.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("key_words_more").mo165423e("none").mo165421c());
            }
            this.f118703a.f118698b = !this.f118704b;
            this.f118703a.mo165561a(!this.f118704b, this.f118705c);
        }
    }

    /* renamed from: a */
    public final void mo165559a(int i) {
        boolean z;
        this.f118700e = i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt instanceof MmBubbleTagLine)) {
                childAt = null;
            }
            MmBubbleTagLine mmBubbleTagLine = (MmBubbleTagLine) childAt;
            if (mmBubbleTagLine != null) {
                int childCount2 = mmBubbleTagLine.getChildCount();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt2 = mmBubbleTagLine.getChildAt(i3);
                    if (!(childAt2 instanceof MmBubbleTag)) {
                        childAt2 = null;
                    }
                    MmBubbleTag mmBubbleTag = (MmBubbleTag) childAt2;
                    if (mmBubbleTag != null) {
                        Object tag = mmBubbleTag.getTag();
                        if (tag != null) {
                            if (((TagData) tag).mo165562a() == this.f118700e) {
                                z = true;
                            } else {
                                z = false;
                            }
                            mmBubbleTag.setSelected(z);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.widget.MmBubbleTagLayout.TagData");
                        }
                    }
                }
                continue;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b0 A[LOOP:0: B:1:0x0027->B:22:0x00b0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo165561a(boolean r21, int r22) {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.widget.MmBubbleTagLayout.mo165561a(boolean, int):void");
    }

    /* renamed from: a */
    private final void m186618a(AttributeSet attributeSet, int i, int i2) {
        setOrientation(1);
        int i3 = f118694f;
        setPadding(i3, f118695g, i3, f118696h);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTagLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo165560a(List<String> list, int i, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(function1, "onClickTag");
        this.f118697a = function1;
        if (list.isEmpty()) {
            removeAllViews();
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            MmBubbleTagSearch mmBubbleTagSearch = new MmBubbleTagSearch(context);
            mmBubbleTagSearch.setId(View.generateViewId());
            mmBubbleTagSearch.setLayoutParams(new RelativeLayout.LayoutParams(-2, UIUtils.dp2px(getContext(), 26.0f)));
            MmBubbleTagSearch mmBubbleTagSearch2 = mmBubbleTagSearch;
            addView(mmBubbleTagSearch2);
            C47110e.m186573a(mmBubbleTagSearch2, new C47126c(this, function1));
        } else if (!Intrinsics.areEqual(this.f118699d, list)) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i2 = 0;
            for (T t : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new TagData(i2, t));
                i2 = i3;
            }
            this.f118699d = arrayList;
            mo165561a(this.f118698b, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmBubbleTagLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118699d = CollectionsKt.emptyList();
        this.f118700e = -1;
        m186618a(attributeSet, i, i2);
    }
}
