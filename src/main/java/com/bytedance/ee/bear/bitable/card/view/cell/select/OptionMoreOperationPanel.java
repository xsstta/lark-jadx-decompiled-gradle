package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView;
import com.bytedance.ee.bear.facade.common.widget.RoundFrameLayout;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fJ\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionMoreOperationPanel;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/BaseCellEditPanel;", "context", "Landroid/content/Context;", "titleContent", "", "titleColor", "titleBackgroundColor", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "analyticDelegate", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/BitableSelectFieldAnalyticDelegate;", "operationListener", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionMoreOperationPanel$OperationListener;", "getContentView", "Landroid/view/View;", "initView", "", "setAnalyticDelegate", "setOperationListener", "listener", "show", "OperationListener", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.e */
public final class OptionMoreOperationPanel extends AbstractC4565a {

    /* renamed from: f */
    public OperationListener f13739f;

    /* renamed from: g */
    public BitableSelectFieldAnalyticDelegate f13740g;

    /* renamed from: h */
    private final String f13741h;

    /* renamed from: i */
    private final String f13742i;

    /* renamed from: j */
    private final String f13743j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionMoreOperationPanel$OperationListener;", "", "onClickDeleteItem", "", "onClickModifyItem", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.e$a */
    public interface OperationListener {
        /* renamed from: a */
        void mo18281a();

        /* renamed from: b */
        void mo18282b();
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public void mo17973a() {
        super.mo17973a();
        Dialog dialog = this.f13457a;
        Intrinsics.checkExpressionValueIsNotNull(dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.bg_mask);
            window.setWindowAnimations(0);
        }
        BitableSelectFieldAnalyticDelegate bVar = this.f13740g;
        if (bVar != null) {
            bVar.mo18254d("ccm_bitable_option_field_more_view");
        }
    }

    /* renamed from: h */
    private final void m19332h() {
        View view = this.f13458b;
        ((CellEditDragView) view.findViewById(R.id.panel)).getTopBar().setVisibility(8);
        ((ImageView) view.findViewById(R.id.closeIcon)).setOnClickListener(new View$OnClickListenerC4649b(this));
        SelectTextView selectTextView = (SelectTextView) view.findViewById(R.id.titleView);
        Intrinsics.checkExpressionValueIsNotNull(selectTextView, "titleView");
        selectTextView.setText(this.f13741h);
        ((SelectTextView) view.findViewById(R.id.titleView)).mo18231a(this.f13743j, this.f13742i);
        ((RoundFrameLayout) view.findViewById(R.id.modifyItem)).setOnClickListener(new View$OnClickListenerC4650c(this));
        ((RoundFrameLayout) view.findViewById(R.id.deleteItem)).setOnClickListener(new View$OnClickListenerC4651d(this));
    }

    /* renamed from: a */
    public final void mo18279a(BitableSelectFieldAnalyticDelegate bVar) {
        this.f13740g = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/cell/select/OptionMoreOperationPanel$initView$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.e$b */
    public static final class View$OnClickListenerC4649b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OptionMoreOperationPanel f13744a;

        View$OnClickListenerC4649b(OptionMoreOperationPanel eVar) {
            this.f13744a = eVar;
        }

        public final void onClick(View view) {
            this.f13744a.mo17978b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public View mo17972a(Context context) {
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        return view;
    }

    /* renamed from: a */
    public final void mo18280a(OperationListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f13739f = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/cell/select/OptionMoreOperationPanel$initView$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.e$c */
    public static final class View$OnClickListenerC4650c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OptionMoreOperationPanel f13745a;

        View$OnClickListenerC4650c(OptionMoreOperationPanel eVar) {
            this.f13745a = eVar;
        }

        public final void onClick(View view) {
            OperationListener aVar = this.f13745a.f13739f;
            if (aVar != null) {
                aVar.mo18281a();
            }
            BitableSelectFieldAnalyticDelegate bVar = this.f13745a.f13740g;
            if (bVar != null) {
                bVar.mo18249a("ccm_bitable_option_field_more_click", "edit");
            }
            this.f13745a.mo17978b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/cell/select/OptionMoreOperationPanel$initView$1$3"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.e$d */
    public static final class View$OnClickListenerC4651d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OptionMoreOperationPanel f13746a;

        View$OnClickListenerC4651d(OptionMoreOperationPanel eVar) {
            this.f13746a = eVar;
        }

        public final void onClick(View view) {
            OperationListener aVar = this.f13746a.f13739f;
            if (aVar != null) {
                aVar.mo18282b();
            }
            BitableSelectFieldAnalyticDelegate bVar = this.f13746a.f13740g;
            if (bVar != null) {
                bVar.mo18249a("ccm_bitable_option_field_more_click", "delete");
            }
            this.f13746a.mo17978b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionMoreOperationPanel(Context context, String str, String str2, String str3) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "titleContent");
        Intrinsics.checkParameterIsNotNull(str2, "titleColor");
        Intrinsics.checkParameterIsNotNull(str3, "titleBackgroundColor");
        this.f13741h = str;
        this.f13742i = str2;
        this.f13743j = str3;
        this.f13458b = LayoutInflater.from(context).inflate(R.layout.bitable_card_option_more_operation_panel, (ViewGroup) null);
        m19332h();
    }
}
