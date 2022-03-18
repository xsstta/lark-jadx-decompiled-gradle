package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.bitable.card.model.jsmodel.common.ColorBean;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0002'(B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000bJ\u0010\u0010 \u001a\u00020\u00182\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010#J\b\u0010&\u001a\u00020\u0018H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/BaseCellEditPanel;", "context", "Landroid/content/Context;", "commonColorList", "", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;", "randomColorId", "", "(Landroid/content/Context;[Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;I)V", "actionListener", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel$ActionListener;", "analyticDelegate", "Lcom/bytedance/ee/bear/bitable/card/view/cell/select/BitableSelectFieldAnalyticDelegate;", "availableOption", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/OptionField$OptionEntity;", "[Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/common/ColorBean;", "currentColorId", "findColorId", "color", "", "getContentView", "Landroid/view/View;", "initView", "", "notifyKeyboardHeightChanged", "keyboardHeight", "renderAvailableOption", "renderColorSchemeView", "renderOptionETColor", "setActionListener", "listener", "setAnalyticDelegate", "setOptionContent", "content", "", "setTitle", "title", "show", "ActionListener", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.d */
public final class OptionCreationPanel extends AbstractC4565a {

    /* renamed from: j */
    public static final Companion f13723j = new Companion(null);

    /* renamed from: m */
    private static final Integer[] f13724m = {40, 39, 38, 37, 36, 35, 34, 33, 41, 42, 43};

    /* renamed from: n */
    private static final Integer[] f13725n = {0, 18, 29, 40, 51, 2, 17, 28, 39, 50, 4, 16, 27, 38, 49, 7, 15, 26, 37, 48, 9, 14, 25, 36, 47, 3, 13, 24, 35, 46, 1, 12, 23, 34, 45, 5, 11, 22, 33, 44, 8, 19, 30, 41, 52, 6, 20, 31, 42, 53, 10, 21, 32, 43, 54};

    /* renamed from: f */
    public ActionListener f13726f;

    /* renamed from: g */
    public int f13727g;

    /* renamed from: h */
    public C4530e.C4531a f13728h;

    /* renamed from: i */
    public BitableSelectFieldAnalyticDelegate f13729i;

    /* renamed from: k */
    private final ColorBean[] f13730k;

    /* renamed from: l */
    private final int f13731l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel$ActionListener;", "", "onChooseAvailableOption", "", "optionId", "", "onClickDoneBtn", "optionContent", "optionColorId", "", "onFindAvailableOption", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/OptionField$OptionEntity;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.d$a */
    public interface ActionListener {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.d$a$a */
        public static final class C4643a {
            /* renamed from: a */
            public static C4530e.C4531a m19326a(ActionListener aVar, String str) {
                Intrinsics.checkParameterIsNotNull(str, "optionContent");
                return null;
            }

            /* renamed from: b */
            public static void m19327b(ActionListener aVar, String str) {
            }
        }

        /* renamed from: a */
        C4530e.C4531a mo18267a(String str);

        /* renamed from: a */
        void mo18268a(String str, int i);

        /* renamed from: b */
        void mo18269b(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel$Companion;", "", "()V", "SPECIFIC_COLOR_GRID", "", "", "[Ljava/lang/Integer;", "TAG", "", "TOPIC_COLOR_LIST", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.d$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.d$g */
    public static final class RunnableC4648g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f13738a;

        RunnableC4648g(View view) {
            this.f13738a = view;
        }

        public final void run() {
            C10548d.m43703b((EditText) this.f13738a.findViewById(R.id.optionET));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel$initView$1$5", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$SimpleActionListener;", "onClickLeftText", "", "onClickRightText", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.d$f */
    public static final class C4647f extends CommonActionPanelLayout.SimpleActionListener {

        /* renamed from: a */
        final /* synthetic */ View f13736a;

        /* renamed from: b */
        final /* synthetic */ OptionCreationPanel f13737b;

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: a */
        public void mo18276a() {
            BitableSelectFieldAnalyticDelegate bVar = this.f13737b.f13729i;
            if (bVar != null) {
                bVar.mo18249a("ccm_bitable_option_field_edit_click", "cancel");
            }
            this.f13737b.mo17978b();
        }

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: b */
        public void mo18277b() {
            ActionListener aVar = this.f13737b.f13726f;
            if (aVar != null) {
                EditText editText = (EditText) this.f13736a.findViewById(R.id.optionET);
                Intrinsics.checkExpressionValueIsNotNull(editText, "optionET");
                aVar.mo18268a(editText.getText().toString(), this.f13737b.f13727g);
            }
            BitableSelectFieldAnalyticDelegate bVar = this.f13737b.f13729i;
            if (bVar != null) {
                bVar.mo18249a("ccm_bitable_option_field_edit_click", "complete");
            }
            this.f13737b.mo17978b();
        }

        C4647f(View view, OptionCreationPanel dVar) {
            this.f13736a = view;
            this.f13737b = dVar;
        }
    }

    /* renamed from: k */
    private final void m19312k() {
        ColorBean[] colorBeanArr = this.f13730k;
        if (colorBeanArr != null) {
            int length = colorBeanArr.length;
            Integer[] numArr = f13725n;
            if (length >= numArr.length) {
                Integer[] numArr2 = f13724m;
                int length2 = numArr2.length;
                CommonColorSchemeView.ColorScheme[] colorSchemeArr = new CommonColorSchemeView.ColorScheme[length2];
                int length3 = numArr.length / numArr2.length;
                for (int i = 0; i < length2; i++) {
                    String[] strArr = new String[length3];
                    for (int i2 = 0; i2 < length3; i2++) {
                        strArr[i2] = this.f13730k[f13725n[(length3 * i) + i2].intValue()].getColor();
                    }
                    String color = this.f13730k[f13724m[i].intValue()].getColor();
                    colorSchemeArr[i] = new CommonColorSchemeView.ColorScheme(color, color, strArr);
                }
                View view = this.f13458b;
                Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
                ((CommonColorSchemeView) view.findViewById(R.id.colorSchemeView)).mo45320a(colorSchemeArr, this.f13730k[this.f13731l].getColor());
            }
        }
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
        BitableSelectFieldAnalyticDelegate bVar = this.f13729i;
        if (bVar != null) {
            bVar.mo18254d("ccm_bitable_option_field_edit_view");
        }
    }

    /* renamed from: h */
    public final void mo18173h() {
        ColorBean colorBean;
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        EditText editText = (EditText) view.findViewById(R.id.optionET);
        ColorBean[] colorBeanArr = this.f13730k;
        if (colorBeanArr != null && (colorBean = colorBeanArr[this.f13727g]) != null) {
            try {
                if (colorBean.getTextColor() == null) {
                    return;
                }
                if (colorBean.getColor() != null) {
                    String textColor = colorBean.getTextColor();
                    if (textColor == null) {
                        Intrinsics.throwNpe();
                    }
                    editText.setTextColor(ColorUtils.m55697a(textColor));
                    int i = (int) 127.5d;
                    String textColor2 = colorBean.getTextColor();
                    if (textColor2 == null) {
                        Intrinsics.throwNpe();
                    }
                    editText.setHintTextColor(ColorUtils.m55696a(i, ColorUtils.m55697a(textColor2)));
                    String color = colorBean.getColor();
                    if (color == null) {
                        Intrinsics.throwNpe();
                    }
                    editText.setBackgroundTintList(ColorStateList.valueOf(ColorUtils.m55697a(color)));
                }
            } catch (Exception e) {
                C13479a.m54759a("OptionCreationPanel", "parse color failed!", e);
            }
        }
    }

    /* renamed from: i */
    public final void mo18174i() {
        String str;
        String str2;
        View view = this.f13458b;
        if (this.f13728h != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.availableOptionContainer);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "availableOptionContainer");
            linearLayout.setVisibility(0);
            SelectTextView selectTextView = (SelectTextView) view.findViewById(R.id.availableOptionTV);
            Intrinsics.checkExpressionValueIsNotNull(selectTextView, "availableOptionTV");
            C4530e.C4531a aVar = this.f13728h;
            String str3 = null;
            if (aVar != null) {
                str = aVar.mo17734b();
            } else {
                str = null;
            }
            selectTextView.setText(str);
            SelectTextView selectTextView2 = (SelectTextView) view.findViewById(R.id.availableOptionTV);
            C4530e.C4531a aVar2 = this.f13728h;
            if (aVar2 != null) {
                str2 = aVar2.mo17738d();
            } else {
                str2 = null;
            }
            C4530e.C4531a aVar3 = this.f13728h;
            if (aVar3 != null) {
                str3 = aVar3.mo17739e();
            }
            selectTextView2.mo18231a(str2, str3);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.availableOptionContainer);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "availableOptionContainer");
        linearLayout2.setVisibility(8);
    }

    /* renamed from: j */
    private final void m19311j() {
        View view = this.f13458b;
        ((EditText) view.findViewById(R.id.optionET)).requestFocus();
        mo18173h();
        ((EditText) view.findViewById(R.id.optionET)).addTextChangedListener(new C4644c(view, this));
        ((LinearLayout) view.findViewById(R.id.availableOptionContainer)).setOnClickListener(new View$OnClickListenerC4645d(this));
        CommonColorSchemeView commonColorSchemeView = (CommonColorSchemeView) view.findViewById(R.id.colorSchemeView);
        commonColorSchemeView.setTopicColorViewType(1);
        commonColorSchemeView.mo45319a(commonColorSchemeView.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16), 0, commonColorSchemeView.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16), 0);
        commonColorSchemeView.setSpecificColorPickerHeight(commonColorSchemeView.getResources().getDimensionPixelSize(R.dimen.space_kit_len_40));
        ((CommonColorSchemeView) view.findViewById(R.id.colorSchemeView)).setTopicColorViewType(1);
        ((CommonColorSchemeView) view.findViewById(R.id.colorSchemeView)).mo45319a(view.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16), 0, view.getResources().getDimensionPixelSize(R.dimen.space_kit_len_16), 0);
        ((CommonColorSchemeView) view.findViewById(R.id.colorSchemeView)).setDelegate(new C4646e(this));
        m19312k();
        ((CellEditDragView) view.findViewById(R.id.panel)).setOnActionListener(new C4647f(view, this));
        ((CellEditDragView) view.findViewById(R.id.panel)).setRightTextEnabled(false);
        view.post(new RunnableC4648g(view));
    }

    /* renamed from: a */
    public final void mo18263a(BitableSelectFieldAnalyticDelegate bVar) {
        this.f13729i = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel$initView$1$4", "Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorSchemeView$ColorSelectDelegate;", "onSpecificColorSelected", "", "color", "", "onTopicColorSelected", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.d$e */
    public static final class C4646e implements CommonColorSchemeView.AbstractC11827a {

        /* renamed from: a */
        final /* synthetic */ OptionCreationPanel f13735a;

        C4646e(OptionCreationPanel dVar) {
            this.f13735a = dVar;
        }

        @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.AbstractC11827a
        /* renamed from: a */
        public void mo18274a(String str) {
            OptionCreationPanel dVar = this.f13735a;
            dVar.f13727g = dVar.mo18262a(str);
            this.f13735a.mo18173h();
            BitableSelectFieldAnalyticDelegate bVar = this.f13735a.f13729i;
            if (bVar != null) {
                bVar.mo18249a("ccm_bitable_option_field_edit_click", "change_color");
            }
        }

        @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorSchemeView.AbstractC11827a
        /* renamed from: b */
        public void mo18275b(String str) {
            OptionCreationPanel dVar = this.f13735a;
            dVar.f13727g = dVar.mo18262a(str);
            this.f13735a.mo18173h();
            BitableSelectFieldAnalyticDelegate bVar = this.f13735a.f13729i;
            if (bVar != null) {
                bVar.mo18249a("ccm_bitable_option_field_edit_click", "change_saturation");
            }
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
    public final void mo18264a(ActionListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f13726f = aVar;
    }

    /* renamed from: a */
    public final void mo18265a(CharSequence charSequence) {
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        ((CellEditDragView) view.findViewById(R.id.panel)).setTitle(charSequence);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel$initView$1$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.d$c */
    public static final class C4644c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ View f13732a;

        /* renamed from: b */
        final /* synthetic */ OptionCreationPanel f13733b;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            ActionListener aVar;
            boolean z;
            boolean z2 = false;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            ((CellEditDragView) this.f13732a.findViewById(R.id.panel)).setRightTextEnabled(z2);
            OptionCreationPanel dVar = this.f13733b;
            C4530e.C4531a aVar2 = null;
            if (z2 && (aVar = dVar.f13726f) != null) {
                aVar2 = aVar.mo18267a(String.valueOf(editable));
            }
            dVar.f13728h = aVar2;
            this.f13733b.mo18174i();
        }

        C4644c(View view, OptionCreationPanel dVar) {
            this.f13732a = view;
            this.f13733b = dVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/cell/select/OptionCreationPanel$initView$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.d$d */
    public static final class View$OnClickListenerC4645d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OptionCreationPanel f13734a;

        View$OnClickListenerC4645d(OptionCreationPanel dVar) {
            this.f13734a = dVar;
        }

        public final void onClick(View view) {
            String str;
            ActionListener aVar = this.f13734a.f13726f;
            if (aVar != null) {
                C4530e.C4531a aVar2 = this.f13734a.f13728h;
                if (aVar2 != null) {
                    str = aVar2.mo17731a();
                } else {
                    str = null;
                }
                aVar.mo18269b(str);
            }
            BitableSelectFieldAnalyticDelegate bVar = this.f13734a.f13729i;
            if (bVar != null) {
                bVar.mo18249a("ccm_bitable_option_field_edit_click", "similar_option");
            }
            this.f13734a.mo17978b();
        }
    }

    /* renamed from: a */
    public final int mo18262a(String str) {
        ColorBean[] colorBeanArr = this.f13730k;
        if (colorBeanArr != null) {
            int length = colorBeanArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                if (TextUtils.equals(str, colorBeanArr[i].getColor())) {
                    return i2;
                }
                i++;
                i2 = i3;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo18266b(CharSequence charSequence) {
        int i;
        View view = this.f13458b;
        ((EditText) view.findViewById(R.id.optionET)).setText(charSequence);
        EditText editText = (EditText) view.findViewById(R.id.optionET);
        if (charSequence != null) {
            i = charSequence.length();
        } else {
            i = 0;
        }
        editText.setSelection(i);
        ((CellEditDragView) view.findViewById(R.id.panel)).setRightTextEnabled(!TextUtils.isEmpty(charSequence));
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a
    /* renamed from: a */
    public void mo17974a(int i) {
        super.mo17974a(i);
        View view = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view, "contentView");
        View findViewById = view.findViewById(R.id.keyboardPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.keyboardPlaceholder");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = i;
        View view2 = this.f13458b;
        Intrinsics.checkExpressionValueIsNotNull(view2, "contentView");
        View findViewById2 = view2.findViewById(R.id.keyboardPlaceholder);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentView.keyboardPlaceholder");
        findViewById2.setLayoutParams(layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionCreationPanel(Context context, ColorBean[] colorBeanArr, int i) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f13730k = colorBeanArr;
        this.f13731l = i;
        this.f13727g = i;
        this.f13458b = LayoutInflater.from(context).inflate(R.layout.bitable_card_option_creation_panel, (ViewGroup) null);
        m19311j();
    }
}
