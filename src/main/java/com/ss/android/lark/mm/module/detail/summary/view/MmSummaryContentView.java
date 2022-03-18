package com.ss.android.lark.mm.module.detail.summary.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.summary.model.ContentType;
import com.ss.android.lark.mm.module.detail.summary.model.MmSummaryContent;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.MmDateUtil;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BoldTextView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142:\b\u0002\u0010\u0015\u001a4\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00162:\b\u0002\u0010\u001c\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0014¨\u0006!"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/view/MmSummaryContentView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bindData", "", "content", "Lcom/ss/android/lark/mm/module/detail/summary/model/MmSummaryContent;", "contentType", "Lcom/ss/android/lark/mm/module/detail/summary/model/ContentType;", "canCheck", "", "onCheck", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "contentId", "isChecked", "attachContextMenu", "Landroid/widget/TextView;", "textView", "init", "setCheckState", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmSummaryContentView extends LinearLayout {

    /* renamed from: a */
    private HashMap f116612a;

    /* renamed from: a */
    public View mo162708a(int i) {
        if (this.f116612a == null) {
            this.f116612a = new HashMap();
        }
        View view = (View) this.f116612a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f116612a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m183269a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_summary_content, this);
        setOrientation(0);
        setPadding(0, UIUtils.dp2px(getContext(), 16.0f), 0, 0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.view.MmSummaryContentView$c */
    static final class C46285c extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmSummaryContent $content;
        final /* synthetic */ Function2 $onCheck;
        final /* synthetic */ MmSummaryContentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46285c(MmSummaryContentView mmSummaryContentView, Function2 kVar, MmSummaryContent mmSummaryContent) {
            super(0);
            this.this$0 = mmSummaryContentView;
            this.$onCheck = kVar;
            this.$content = mmSummaryContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            UDCheckBox uDCheckBox = (UDCheckBox) this.this$0.mo162708a(R.id.ivCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ivCheck");
            UDCheckBox uDCheckBox2 = (UDCheckBox) this.this$0.mo162708a(R.id.ivCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "ivCheck");
            uDCheckBox.setChecked(!uDCheckBox2.isChecked());
            Function2 kVar = this.$onCheck;
            if (kVar != null) {
                String content_id = this.$content.getContent_id();
                if (content_id == null) {
                    content_id = "";
                }
                UDCheckBox uDCheckBox3 = (UDCheckBox) this.this$0.mo162708a(R.id.ivCheck);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "ivCheck");
                Unit unit = (Unit) kVar.invoke(content_id, Boolean.valueOf(uDCheckBox3.isChecked()));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.view.MmSummaryContentView$a */
    static final class C46283a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function0 $checkAction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46283a(Function0 function0) {
            super(1);
            this.$checkAction = function0;
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
            C45855f.m181664c("MmSummaryContentView", "summary ivCheck clicked");
            this.$checkAction.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.summary.view.MmSummaryContentView$b */
    static final class C46284b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function0 $checkAction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46284b(Function0 function0) {
            super(1);
            this.$checkAction = function0;
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
            C45855f.m181664c("MmSummaryContentView", "click tvContent");
            this.$checkAction.invoke();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmSummaryContentView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setCheckState(boolean z) {
        UDCheckBox uDCheckBox = (UDCheckBox) mo162708a(R.id.ivCheck);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ivCheck");
        uDCheckBox.setChecked(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmSummaryContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmSummaryContentView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmSummaryContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m183269a();
    }

    /* renamed from: a */
    public final void mo162709a(MmSummaryContent mmSummaryContent, ContentType contentType, boolean z, Function2<? super String, ? super Boolean, Unit> kVar, Function2<? super TextView, ? super String, Boolean> kVar2) {
        long j;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(mmSummaryContent, "content");
        Intrinsics.checkParameterIsNotNull(contentType, "contentType");
        Long start_time = mmSummaryContent.getStart_time();
        if (start_time != null) {
            j = start_time.longValue();
        } else {
            j = 0;
        }
        String a = MmDateUtil.m186536a((int) (j / ((long) 1000)));
        TextView textView = (TextView) mo162708a(R.id.tvTimeTop);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvTimeTop");
        String str = a;
        textView.setText(str);
        TextView textView2 = (TextView) mo162708a(R.id.tvTimeBottom);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvTimeBottom");
        textView2.setText(str);
        C46285c cVar = new C46285c(this, kVar, mmSummaryContent);
        if (contentType == ContentType.Checkbox) {
            UDCheckBox uDCheckBox = (UDCheckBox) mo162708a(R.id.ivCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "ivCheck");
            uDCheckBox.setVisibility(0);
            TextView textView3 = (TextView) mo162708a(R.id.tvTimeTop);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "tvTimeTop");
            textView3.setVisibility(8);
            TextView textView4 = (TextView) mo162708a(R.id.tvTimeBottom);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "tvTimeBottom");
            textView4.setVisibility(0);
            UDCheckBox uDCheckBox2 = (UDCheckBox) mo162708a(R.id.ivCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "ivCheck");
            Boolean checked = mmSummaryContent.getChecked();
            if (checked != null) {
                z2 = checked.booleanValue();
            } else {
                z2 = false;
            }
            uDCheckBox2.setChecked(z2);
            if (z) {
                UDCheckBox uDCheckBox3 = (UDCheckBox) mo162708a(R.id.ivCheck);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "ivCheck");
                uDCheckBox3.setEnabled(true);
                C47110e.m186573a(this, new C46283a(cVar));
            } else {
                UDCheckBox uDCheckBox4 = (UDCheckBox) mo162708a(R.id.ivCheck);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox4, "ivCheck");
                uDCheckBox4.setEnabled(false);
                setOnClickListener(null);
            }
        } else {
            UDCheckBox uDCheckBox5 = (UDCheckBox) mo162708a(R.id.ivCheck);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox5, "ivCheck");
            uDCheckBox5.setVisibility(8);
            TextView textView5 = (TextView) mo162708a(R.id.tvTimeTop);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "tvTimeTop");
            textView5.setVisibility(0);
            TextView textView6 = (TextView) mo162708a(R.id.tvTimeBottom);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "tvTimeBottom");
            textView6.setVisibility(8);
            setOnClickListener(null);
        }
        if (kVar2 != null) {
            BoldTextView boldTextView = (BoldTextView) mo162708a(R.id.tvContent);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvContent");
            String content_id = mmSummaryContent.getContent_id();
            if (content_id == null) {
                content_id = "";
            }
            kVar2.invoke(boldTextView, content_id);
        }
        String data = mmSummaryContent.getData();
        if (data != null) {
            if (mmSummaryContent.get_spanDataContent() != null) {
                BoldTextView boldTextView2 = (BoldTextView) mo162708a(R.id.tvContent);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvContent");
                boldTextView2.setText(mmSummaryContent.get_spanDataContent());
            } else {
                BoldTextView boldTextView3 = (BoldTextView) mo162708a(R.id.tvContent);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvContent");
                boldTextView3.setText(data);
            }
        }
        if (contentType == ContentType.Checkbox && z) {
            BoldTextView boldTextView4 = (BoldTextView) mo162708a(R.id.tvContent);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "tvContent");
            C47110e.m186573a(boldTextView4, new C46284b(cVar));
        }
    }
}
