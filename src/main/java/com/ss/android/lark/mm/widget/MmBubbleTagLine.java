package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.MmBubbleTagLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010JK\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002JQ\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001f2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0013¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000e0\u0019J\"\u0010\"\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmBubbleTagLine;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "addSwitch", "", "tagSwitch", "Lcom/ss/android/lark/mm/widget/MmBubbleTagSwitch;", "addTag", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/widget/MmBubbleTagLayout$TagData;", "marginLeft", "maxWidth", "", "nextId", "onClickTag", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "addTags", "currentLine", "tags", "", "parentWidth", "marginRight", "init", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmBubbleTagLine extends RelativeLayout {

    /* renamed from: a */
    public static final Companion f118706a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/widget/MmBubbleTagLine$Companion;", "", "()V", "measureTags", "", "context", "Landroid/content/Context;", "tags", "", "Lcom/ss/android/lark/mm/widget/MmBubbleTagLayout$TagData;", "parentWidth", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmBubbleTagLine$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo165572a(Context context, List<MmBubbleTagLayout.TagData> list, float f) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(list, "tags");
            if (list.size() == 1) {
                return true;
            }
            int dp2px = UIUtils.dp2px(context, 10.0f);
            float f2 = BitmapDescriptorFactory.HUE_RED;
            Iterator<T> it = list.iterator();
            int i = 1;
            while (true) {
                int i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (i != 0) {
                    i2 = dp2px;
                }
                f2 += MmBubbleTag.f118692e.mo165557a(next.mo165563b()) + ((float) i2);
                if (f2 <= f) {
                    i++;
                }
            }
            if (i > list.size()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmBubbleTagLine$b */
    public static final class C47129b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmBubbleTagLayout.TagData $data;
        final /* synthetic */ Function1 $onClickTag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47129b(MmBubbleTagLayout.TagData bVar, Function1 function1) {
            super(1);
            this.$data = bVar;
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
            C45855f.m181664c("MmBubbleTagLine", "click data:" + this.$data);
            this.$onClickTag.invoke(this.$data);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.MmBubbleTagLine$c */
    public static final class C47130c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function1 $onClickTag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47130c(Function1 function1) {
            super(1);
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
            this.$onClickTag.invoke(null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTagLine(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo165571a(MmBubbleTagSwitch mmBubbleTagSwitch) {
        Intrinsics.checkParameterIsNotNull(mmBubbleTagSwitch, "tagSwitch");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(15);
        mmBubbleTagSwitch.setLayoutParams(layoutParams);
        addView(mmBubbleTagSwitch);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTagLine(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m186625a(AttributeSet attributeSet, int i, int i2) {
        int dp2px = UIUtils.dp2px(getContext(), 6.0f);
        setPadding(0, dp2px, 0, dp2px);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmBubbleTagLine(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmBubbleTagLine(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186625a(attributeSet, i, i2);
    }

    /* renamed from: a */
    private final int m186624a(MmBubbleTagLayout.TagData bVar, int i, float f, int i2, Function1<? super MmBubbleTagLayout.TagData, Unit> function1) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        MmBubbleTag mmBubbleTag = new MmBubbleTag(context);
        mmBubbleTag.setId(View.generateViewId());
        mmBubbleTag.setText(bVar.mo165563b());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, UIUtils.dp2px(getContext(), 26.0f));
        layoutParams.setMarginStart(i);
        mmBubbleTag.setMaxWidth((int) f);
        layoutParams.addRule(1, i2);
        mmBubbleTag.setLayoutParams(layoutParams);
        MmBubbleTag mmBubbleTag2 = mmBubbleTag;
        C47110e.m186573a(mmBubbleTag2, new C47129b(bVar, function1));
        mmBubbleTag.setTag(bVar);
        addView(mmBubbleTag2);
        return mmBubbleTag.getId();
    }

    /* renamed from: a */
    public final int mo165570a(int i, List<MmBubbleTagLayout.TagData> list, float f, float f2, Function1<? super MmBubbleTagLayout.TagData, Unit> function1) {
        int i2;
        int i3;
        Intrinsics.checkParameterIsNotNull(list, "tags");
        Intrinsics.checkParameterIsNotNull(function1, "onClickTag");
        float f3 = f - f2;
        int dp2px = UIUtils.dp2px(getContext(), 10.0f);
        if (i == 0) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            MmBubbleTagSearch mmBubbleTagSearch = new MmBubbleTagSearch(context);
            mmBubbleTagSearch.setId(View.generateViewId());
            mmBubbleTagSearch.measure(0, 0);
            mmBubbleTagSearch.setLayoutParams(new RelativeLayout.LayoutParams(-2, UIUtils.dp2px(getContext(), 26.0f)));
            MmBubbleTagSearch mmBubbleTagSearch2 = mmBubbleTagSearch;
            addView(mmBubbleTagSearch2);
            i2 = mmBubbleTagSearch.getId();
            C47110e.m186573a(mmBubbleTagSearch2, new C47130c(function1));
            f3 -= (float) mmBubbleTagSearch.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        int i4 = i2;
        int i5 = 0;
        for (T t : list) {
            if (i5 != 0 || i == 0) {
                i3 = dp2px;
            } else {
                i3 = 0;
            }
            float a = MmBubbleTag.f118692e.mo165557a(t.mo165563b()) + ((float) i3);
            if (a > f3 && i5 > 0) {
                return i5;
            }
            i4 = m186624a(t, i3, f3, i4, function1);
            f3 -= a;
            i5++;
        }
        return i5;
    }
}
