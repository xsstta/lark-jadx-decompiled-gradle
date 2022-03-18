package com.bytedance.ee.bear.templates.preview.single;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.templates.preview.data.Item;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13747j;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/single/CommonPreviewTemplateView;", "", "()V", "commonTemplateViewModel", "Lcom/bytedance/ee/bear/templates/preview/single/CommonTemplateViewModel;", "nextImg", "Landroid/widget/ImageView;", "nextLL", "Landroid/widget/LinearLayout;", "nextTxt", "Landroid/widget/TextView;", "prevImg", "prevLL", "prevTxt", "useCurrTemp", "init", "", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewModel", "initView", "rootView", "Landroid/view/View;", "initViewEvent", "setBtnStyle", "pos", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.single.a */
public final class CommonPreviewTemplateView {

    /* renamed from: a */
    public CommonTemplateViewModel f31195a;

    /* renamed from: b */
    private LinearLayout f31196b;

    /* renamed from: c */
    private LinearLayout f31197c;

    /* renamed from: d */
    private ImageView f31198d;

    /* renamed from: e */
    private ImageView f31199e;

    /* renamed from: f */
    private TextView f31200f;

    /* renamed from: g */
    private TextView f31201g;

    /* renamed from: h */
    private TextView f31202h;

    /* renamed from: a */
    private final void m48141a() {
        TextView textView = this.f31202h;
        if (textView != null) {
            textView.setOnClickListener(new C11583a(this, LocationRequest.PRIORITY_INDOOR));
        }
        LinearLayout linearLayout = this.f31196b;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C11584b(this, LocationRequest.PRIORITY_INDOOR));
        }
        LinearLayout linearLayout2 = this.f31197c;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new C11585c(this, LocationRequest.PRIORITY_INDOOR));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/preview/single/CommonPreviewTemplateView$initViewEvent$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.a$a */
    public static final class C11583a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ CommonPreviewTemplateView f31203a;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            CommonTemplateViewModel cVar = this.f31203a.f31195a;
            if (cVar != null) {
                cVar.loadTemplateDataFromNet();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11583a(CommonPreviewTemplateView aVar, int i) {
            super(i);
            this.f31203a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/preview/single/CommonPreviewTemplateView$initViewEvent$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.a$b */
    public static final class C11584b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ CommonPreviewTemplateView f31204a;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Integer b;
            CommonTemplateViewModel cVar = this.f31204a.f31195a;
            if (cVar != null && (b = cVar.getCurrTemplatePos().mo5927b()) != null) {
                Integer valueOf = Integer.valueOf(b.intValue() - 1);
                valueOf.intValue();
                cVar.showOtherTemplate(valueOf.intValue(), true);
                this.f31204a.mo44506a(valueOf.intValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11584b(CommonPreviewTemplateView aVar, int i) {
            super(i);
            this.f31204a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/preview/single/CommonPreviewTemplateView$initViewEvent$3", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.a$c */
    public static final class C11585c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ CommonPreviewTemplateView f31205a;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Integer b;
            CommonTemplateViewModel cVar = this.f31205a.f31195a;
            if (cVar != null && (b = cVar.getCurrTemplatePos().mo5927b()) != null) {
                Integer valueOf = Integer.valueOf(b.intValue() + 1);
                valueOf.intValue();
                cVar.showOtherTemplate(valueOf.intValue(), false);
                this.f31205a.mo44506a(valueOf.intValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11585c(CommonPreviewTemplateView aVar, int i) {
            super(i);
            this.f31205a = aVar;
        }
    }

    /* renamed from: a */
    private final void m48142a(View view) {
        Integer num;
        C1177w<Integer> currTemplatePos;
        this.f31196b = (LinearLayout) view.findViewById(R.id.ll_prev_temp);
        this.f31197c = (LinearLayout) view.findViewById(R.id.ll_next_temp);
        this.f31198d = (ImageView) view.findViewById(R.id.title_bar_prev);
        this.f31199e = (ImageView) view.findViewById(R.id.title_bar_next);
        this.f31200f = (TextView) view.findViewById(R.id.title_prev);
        this.f31201g = (TextView) view.findViewById(R.id.title_next);
        this.f31202h = (TextView) view.findViewById(R.id.tv_use_curr_temp);
        CommonTemplateViewModel cVar = this.f31195a;
        if (cVar == null || (currTemplatePos = cVar.getCurrTemplatePos()) == null || (num = currTemplatePos.mo5927b()) == null) {
            num = 0;
        }
        mo44506a(num.intValue());
        m48141a();
    }

    /* renamed from: a */
    public final void mo44506a(int i) {
        List<Item> templates;
        CommonTemplateViewModel cVar = this.f31195a;
        if (cVar != null && (templates = cVar.getTemplates()) != null) {
            int size = templates.size();
            if (i >= 0 && i < size) {
                if (i >= size - 1) {
                    C13747j.m55728a(this.f31199e, (int) R.color.icon_disable);
                    TextView textView = this.f31201g;
                    if (textView != null) {
                        textView.setTextColor(textView.getResources().getColor(R.color.text_disable));
                    }
                } else {
                    C13747j.m55728a(this.f31199e, (int) R.color.icon_n1);
                    TextView textView2 = this.f31201g;
                    if (textView2 != null) {
                        textView2.setTextColor(textView2.getResources().getColor(R.color.text_title));
                    }
                }
                if (i <= 0) {
                    C13747j.m55728a(this.f31198d, (int) R.color.icon_disable);
                    TextView textView3 = this.f31200f;
                    if (textView3 != null) {
                        textView3.setTextColor(textView3.getResources().getColor(R.color.text_disable));
                        return;
                    }
                    return;
                }
                C13747j.m55728a(this.f31198d, (int) R.color.icon_n1);
                TextView textView4 = this.f31200f;
                if (textView4 != null) {
                    textView4.setTextColor(textView4.getResources().getColor(R.color.text_title));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo44507a(Context context, ViewGroup viewGroup, CommonTemplateViewModel cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        this.f31195a = cVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.common_template_preview_panel_fragment, viewGroup, true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        m48142a(inflate);
    }
}
