package com.ss.android.photoeditor.ve.crop.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.ve.base.VEBaseChooserView;
import com.ss.android.photoeditor.ve.crop.VECropController;
import com.ss.android.photoeditor.ve.hitpoint.ImageEditorHitPoint;
import com.ss.android.photoeditor.ve.p3018e.C59901e;
import com.ss.android.ttve.utils.C60275a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00012B%\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0002J\n\u0010*\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010+\u001a\u00020(H\u0016J\b\u0010,\u001a\u00020(H\u0016J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\u001a\u0010/\u001a\u00020(2\b\u00100\u001a\u0004\u0018\u00010\u000e2\u0006\u00101\u001a\u00020\tH\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R$\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u0010\u0010#\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/photoeditor/ve/crop/view/VECropChooserView;", "Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView;", "Lcom/ss/android/photoeditor/ve/crop/VECropController;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cancelView", "Landroid/view/View;", "cropModelRadioGroup", "Landroid/widget/RadioGroup;", "layoutId", "getLayoutId", "()I", "setLayoutId", "(I)V", "rb16to9", "Landroid/widget/RadioButton;", "rb1to1", "rb3to4", "rb4to3", "rb9to16", "rbFreeCrop", "reductionView", "rotateView", "scaleMargin", "", "value", "screenHeight", "getScreenHeight", "setScreenHeight", "sureView", "toolbarContainer", "veCropView", "Lcom/ss/android/photoeditor/ve/crop/view/VECropView;", "bindView", "", "checkModifyMargin", "getToolbarContainerView", "hideAndResetView", "hideWithAnimation", "initListener", "initView", "onCheckedChanged", "group", "checkedId", "Companion", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class VECropChooserView extends VEBaseChooserView<VECropController> implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: b */
    public static final Companion f149073b = new Companion(null);

    /* renamed from: a */
    public RadioGroup f149074a;

    /* renamed from: c */
    private int f149075c;

    /* renamed from: d */
    private VECropView f149076d;

    /* renamed from: e */
    private View f149077e;

    /* renamed from: f */
    private View f149078f;

    /* renamed from: g */
    private View f149079g;

    /* renamed from: h */
    private View f149080h;

    /* renamed from: i */
    private View f149081i;

    /* renamed from: j */
    private RadioButton f149082j;

    /* renamed from: k */
    private RadioButton f149083k;

    /* renamed from: l */
    private RadioButton f149084l;

    /* renamed from: m */
    private RadioButton f149085m;

    /* renamed from: n */
    private RadioButton f149086n;

    /* renamed from: o */
    private RadioButton f149087o;

    /* renamed from: p */
    private float f149088p;

    /* renamed from: q */
    private int f149089q;

    public VECropChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/photoeditor/ve/crop/view/VECropChooserView$Companion;", "", "()V", "ROTATE_DEGREE", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropChooserView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public int getLayoutId() {
        return this.f149075c;
    }

    public final int getScreenHeight() {
        return this.f149089q;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public View getToolbarContainerView() {
        return this.f149077e;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: a */
    public void mo203648a() {
        m232323k();
        m232325m();
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: b */
    public void mo203649b() {
        View findViewById = findViewById(R.id.rb_free_crop);
        if (findViewById != null) {
            findViewById.performClick();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: g */
    public void mo203654g() {
        super.mo203654g();
        VECropView vECropView = this.f149076d;
        if (vECropView != null) {
            vECropView.setVisibility(4);
        }
    }

    /* renamed from: m */
    private final void m232325m() {
        View view = this.f149079g;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC59881b(this));
        }
        View view2 = this.f149078f;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC59882c(this));
        }
        View view3 = this.f149080h;
        if (view3 != null) {
            view3.setOnClickListener(new View$OnClickListenerC59883d(this));
        }
        View view4 = this.f149081i;
        if (view4 != null) {
            view4.setOnClickListener(new View$OnClickListenerC59884e(this));
        }
    }

    /* renamed from: l */
    private final void m232324l() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        float f = (float) 5;
        float f2 = (float) 6;
        boolean z = false;
        if (((((float) C60275a.m234186a(getContext())) - C60275a.m234185a(getContext(), 40.0f)) - (C60275a.m234185a(getContext(), 28.0f) * f)) - (C60275a.m234185a(getContext(), 24.0f) * f2) < ((float) 0)) {
            z = true;
        }
        if (z) {
            this.f149088p = ((((float) C60275a.m234186a(getContext())) - C60275a.m234185a(getContext(), 40.0f)) - (C60275a.m234185a(getContext(), 24.0f) * f2)) / f;
            RadioButton radioButton = this.f149083k;
            ViewGroup.LayoutParams layoutParams5 = null;
            if (radioButton != null) {
                layoutParams = radioButton.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) this.f149088p;
                RadioButton radioButton2 = this.f149084l;
                if (radioButton2 != null) {
                    layoutParams2 = radioButton2.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                if (layoutParams2 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) this.f149088p;
                    RadioButton radioButton3 = this.f149085m;
                    if (radioButton3 != null) {
                        layoutParams3 = radioButton3.getLayoutParams();
                    } else {
                        layoutParams3 = null;
                    }
                    if (layoutParams3 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) this.f149088p;
                        RadioButton radioButton4 = this.f149086n;
                        if (radioButton4 != null) {
                            layoutParams4 = radioButton4.getLayoutParams();
                        } else {
                            layoutParams4 = null;
                        }
                        if (layoutParams4 != null) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) this.f149088p;
                            RadioButton radioButton5 = this.f149087o;
                            if (radioButton5 != null) {
                                layoutParams5 = radioButton5.getLayoutParams();
                            }
                            if (layoutParams5 != null) {
                                ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) this.f149088p;
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: k */
    private final void m232323k() {
        this.f149076d = (VECropView) findViewById(R.id.ve_edit_crop_overlay_view);
        this.f149077e = findViewById(R.id.tool_bar_container);
        this.f149078f = findViewById(R.id.ll_reduction);
        this.f149079g = findViewById(R.id.ll_rotate);
        this.f149080h = findViewById(R.id.tv_cancel);
        this.f149081i = findViewById(R.id.tv_sure);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg_crop_model);
        this.f149074a = radioGroup;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(this);
        }
        RadioButton radioButton = (RadioButton) findViewById(R.id.rb_free_crop);
        this.f149082j = radioButton;
        if (radioButton != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            ColorStateList colorStateList = context2.getResources().getColorStateList(R.color.ve_edit_icon_color);
            Intrinsics.checkExpressionValueIsNotNull(colorStateList, "context.resources.getCol…color.ve_edit_icon_color)");
            radioButton.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C59901e.m232468a(context, R.drawable.ud_icon_customize_size_outlined, colorStateList), (Drawable) null, (Drawable) null);
        }
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.rb_1to1_crop);
        this.f149083k = radioButton2;
        if (radioButton2 != null) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            ColorStateList colorStateList2 = context4.getResources().getColorStateList(R.color.ve_edit_icon_color);
            Intrinsics.checkExpressionValueIsNotNull(colorStateList2, "context.resources.getCol…color.ve_edit_icon_color)");
            radioButton2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C59901e.m232468a(context3, R.drawable.ud_icon_w1_h1_outlined, colorStateList2), (Drawable) null, (Drawable) null);
        }
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.rb_3to4_crop);
        this.f149084l = radioButton3;
        if (radioButton3 != null) {
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            Context context6 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context6, "context");
            ColorStateList colorStateList3 = context6.getResources().getColorStateList(R.color.ve_edit_icon_color);
            Intrinsics.checkExpressionValueIsNotNull(colorStateList3, "context.resources.getCol…color.ve_edit_icon_color)");
            radioButton3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C59901e.m232468a(context5, R.drawable.ud_icon_w3_h4_outlined, colorStateList3), (Drawable) null, (Drawable) null);
        }
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.rb_4to3_crop);
        this.f149085m = radioButton4;
        if (radioButton4 != null) {
            Context context7 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context7, "context");
            Context context8 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context8, "context");
            ColorStateList colorStateList4 = context8.getResources().getColorStateList(R.color.ve_edit_icon_color);
            Intrinsics.checkExpressionValueIsNotNull(colorStateList4, "context.resources.getCol…color.ve_edit_icon_color)");
            radioButton4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C59901e.m232468a(context7, R.drawable.ud_icon_w4_h3_outlined, colorStateList4), (Drawable) null, (Drawable) null);
        }
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.rb_9to16_crop);
        this.f149086n = radioButton5;
        if (radioButton5 != null) {
            Context context9 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context9, "context");
            Context context10 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context10, "context");
            ColorStateList colorStateList5 = context10.getResources().getColorStateList(R.color.ve_edit_icon_color);
            Intrinsics.checkExpressionValueIsNotNull(colorStateList5, "context.resources.getCol…color.ve_edit_icon_color)");
            radioButton5.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C59901e.m232468a(context9, R.drawable.ud_icon_w9_h16_outlined, colorStateList5), (Drawable) null, (Drawable) null);
        }
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.rb_16to9_crop);
        this.f149087o = radioButton6;
        if (radioButton6 != null) {
            Context context11 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context11, "context");
            Context context12 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context12, "context");
            ColorStateList colorStateList6 = context12.getResources().getColorStateList(R.color.ve_edit_icon_color);
            Intrinsics.checkExpressionValueIsNotNull(colorStateList6, "context.resources.getCol…color.ve_edit_icon_color)");
            radioButton6.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C59901e.m232468a(context11, R.drawable.ud_icon_w16_h9_outlined, colorStateList6), (Drawable) null, (Drawable) null);
        }
        m232324l();
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public void setLayoutId(int i) {
        this.f149075c = i;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropChooserView$b */
    public static final class View$OnClickListenerC59881b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VECropChooserView f149090a;

        View$OnClickListenerC59881b(VECropChooserView vECropChooserView) {
            this.f149090a = vECropChooserView;
        }

        public final void onClick(View view) {
            VECropController aVar = (VECropController) this.f149090a.getVeController();
            if (aVar != null) {
                aVar.mo203730b(-90);
            }
            ImageEditorHitPoint.Companion.m232168e(ImageEditorHitPoint.f148823a, "rotation", null, 2, null);
        }
    }

    public final void setScreenHeight(int i) {
        this.f149089q = i;
        VECropController aVar = (VECropController) getVeController();
        if (aVar != null) {
            aVar.mo203679a(this.f149089q);
        }
        VECropController aVar2 = (VECropController) getVeController();
        if (aVar2 != null) {
            aVar2.mo203728a(this.f149076d);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropChooserView$c */
    public static final class View$OnClickListenerC59882c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VECropChooserView f149091a;

        View$OnClickListenerC59882c(VECropChooserView vECropChooserView) {
            this.f149091a = vECropChooserView;
        }

        public final void onClick(View view) {
            VECropController aVar = (VECropController) this.f149091a.getVeController();
            if (aVar != null) {
                aVar.mo203732v();
            }
            RadioGroup radioGroup = this.f149091a.f149074a;
            if (radioGroup != null) {
                radioGroup.setOnCheckedChangeListener(null);
            }
            RadioGroup radioGroup2 = this.f149091a.f149074a;
            if (radioGroup2 != null) {
                radioGroup2.check(R.id.rb_free_crop);
            }
            RadioGroup radioGroup3 = this.f149091a.f149074a;
            if (radioGroup3 != null) {
                radioGroup3.setOnCheckedChangeListener(this.f149091a);
            }
            ImageEditorHitPoint.Companion.m232168e(ImageEditorHitPoint.f148823a, "undo", null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropChooserView$d */
    public static final class View$OnClickListenerC59883d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VECropChooserView f149092a;

        View$OnClickListenerC59883d(VECropChooserView vECropChooserView) {
            this.f149092a = vECropChooserView;
        }

        public final void onClick(View view) {
            VECropController aVar = (VECropController) this.f149092a.getVeController();
            if (aVar != null) {
                aVar.mo203705p();
            }
            VEBaseChooserView.OnActionButtonClickedListener actionButtonClickedListener = this.f149092a.getActionButtonClickedListener();
            if (actionButtonClickedListener != null) {
                actionButtonClickedListener.mo203631b();
            }
            ImageEditorHitPoint.f148823a.mo203725e("cancel", "public_pic_edit_view");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.crop.view.VECropChooserView$e */
    public static final class View$OnClickListenerC59884e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VECropChooserView f149093a;

        View$OnClickListenerC59884e(VECropChooserView vECropChooserView) {
            this.f149093a = vECropChooserView;
        }

        public final void onClick(View view) {
            VECropController aVar = (VECropController) this.f149093a.getVeController();
            if (aVar != null) {
                aVar.mo203704o();
            }
            VEBaseChooserView.OnActionButtonClickedListener actionButtonClickedListener = this.f149093a.getActionButtonClickedListener();
            if (actionButtonClickedListener != null) {
                actionButtonClickedListener.mo203630a();
            }
            ImageEditorHitPoint.f148823a.mo203725e("confirm", "public_pic_edit_view");
        }
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        VECropController aVar;
        VECropController aVar2;
        VECropController aVar3;
        VECropController aVar4;
        VECropController aVar5;
        VECropController aVar6;
        if (mo203661j()) {
            View findViewById = findViewById(i);
            if (findViewById != null) {
                RadioButton radioButton = (RadioButton) findViewById;
                if (radioButton == findViewById(R.id.rb_free_crop) && (aVar6 = (VECropController) getVeController()) != null) {
                    aVar6.mo203729a(false);
                }
                if (radioButton == findViewById(R.id.rb_1to1_crop) && (aVar5 = (VECropController) getVeController()) != null) {
                    aVar5.mo203726a(1, 1);
                }
                if (radioButton == findViewById(R.id.rb_4to3_crop) && (aVar4 = (VECropController) getVeController()) != null) {
                    aVar4.mo203726a(4, 3);
                }
                if (radioButton == findViewById(R.id.rb_3to4_crop) && (aVar3 = (VECropController) getVeController()) != null) {
                    aVar3.mo203726a(3, 4);
                }
                if (radioButton == findViewById(R.id.rb_16to9_crop) && (aVar2 = (VECropController) getVeController()) != null) {
                    aVar2.mo203726a(16, 9);
                }
                if (radioButton == findViewById(R.id.rb_9to16_crop) && (aVar = (VECropController) getVeController()) != null) {
                    aVar.mo203726a(9, 16);
                }
                ImageEditorHitPoint.Companion.m232168e(ImageEditorHitPoint.f148823a, "crop_style", null, 2, null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RadioButton");
        }
    }

    public VECropChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f149075c = R.layout.view_crop_choose_view;
        this.f149088p = C60275a.m234185a(context, 28.0f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VECropChooserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
