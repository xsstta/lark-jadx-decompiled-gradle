package com.ss.android.photoeditor.ve.paint.mosaic;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.ve.base.VEBaseChooserView;
import com.ss.android.photoeditor.ve.hitpoint.ImageEditorHitPoint;
import com.ss.android.photoeditor.ve.p3018e.C59901e;
import com.ss.android.photoeditor.ve.paint.PaintController;
import com.ss.android.photoeditor.ve.paint.view.PaintSizeSeekBar;
import com.ss.android.photoeditor.ve.view.AnimationRelativeLayout;
import com.ss.android.photoeditor.ve.view.PaintCircleView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001EB%\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u00106\u001a\u000207H\u0016J\n\u00108\u001a\u0004\u0018\u00010\fH\u0016J\b\u00109\u001a\u000207H\u0016J\b\u0010:\u001a\u000207H\u0016J\b\u0010;\u001a\u000207H\u0002J\b\u0010<\u001a\u000207H\u0002J\u001a\u0010=\u001a\u0002072\b\u0010>\u001a\u0004\u0018\u00010\u001b2\u0006\u0010?\u001a\u00020\tH\u0016J\b\u0010@\u001a\u000207H\u0016J\u0006\u0010A\u001a\u000207J\u0010\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u000207H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R$\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R(\u00101\u001a\u0004\u0018\u00010\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0002@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006F"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/mosaic/VEMosaicChooserView;", "Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView;", "Lcom/ss/android/photoeditor/ve/paint/mosaic/VEMosaicController;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backView", "Landroid/view/View;", "confirmBtn", "Landroid/widget/TextView;", "glassMosaicContainer", "Landroid/widget/LinearLayout;", "glassMosaicView", "Landroid/widget/ImageView;", "layoutId", "getLayoutId", "()I", "setLayoutId", "(I)V", "mosaicStyle", "mosaicType", "mosaicTypeRadioGroup", "Landroid/widget/RadioGroup;", "normalMosaicView", "paintCircleView", "Lcom/ss/android/photoeditor/ve/view/PaintCircleView;", "paintEventListener", "Lcom/ss/android/photoeditor/ve/paint/PaintController$OnPaintEventListener;", "getPaintEventListener", "()Lcom/ss/android/photoeditor/ve/paint/PaintController$OnPaintEventListener;", "paintSizeSeekBar", "Lcom/ss/android/photoeditor/ve/paint/view/PaintSizeSeekBar;", "rbDrawMosaic", "Landroid/widget/RadioButton;", "rbRectMosaic", "value", "screenHeight", "getScreenHeight", "setScreenHeight", "seekBarContainer", "Lcom/ss/android/photoeditor/ve/view/AnimationRelativeLayout;", "toolBarContainer", "topBar", "undoView", "veController", "getVeController", "()Lcom/ss/android/photoeditor/ve/paint/mosaic/VEMosaicController;", "setVeController", "(Lcom/ss/android/photoeditor/ve/paint/mosaic/VEMosaicController;)V", "bindView", "", "getToolbarContainerView", "hideAndResetView", "hideWithAnimation", "initListener", "initView", "onCheckedChanged", "group", "checkedId", "showWithAnimation", "updateToolBarVisibility", "isVisible", "", "updateUndoViewVisibility", "Companion", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class VEMosaicChooserView extends VEBaseChooserView<VEMosaicController> implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: e */
    public static final Companion f149255e = new Companion(null);

    /* renamed from: a */
    public PaintCircleView f149256a;

    /* renamed from: b */
    public ImageView f149257b;

    /* renamed from: c */
    public LinearLayout f149258c;

    /* renamed from: d */
    public int f149259d;

    /* renamed from: f */
    private int f149260f;

    /* renamed from: g */
    private TextView f149261g;

    /* renamed from: h */
    private View f149262h;

    /* renamed from: i */
    private View f149263i;

    /* renamed from: j */
    private View f149264j;

    /* renamed from: k */
    private AnimationRelativeLayout f149265k;

    /* renamed from: l */
    private PaintSizeSeekBar f149266l;

    /* renamed from: m */
    private View f149267m;

    /* renamed from: n */
    private ImageView f149268n;

    /* renamed from: o */
    private int f149269o;

    /* renamed from: p */
    private RadioGroup f149270p;

    /* renamed from: q */
    private RadioButton f149271q;

    /* renamed from: r */
    private RadioButton f149272r;

    /* renamed from: s */
    private VEMosaicController f149273s;

    /* renamed from: t */
    private final PaintController.OnPaintEventListener f149274t;

    /* renamed from: u */
    private int f149275u;

    public VEMosaicChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/mosaic/VEMosaicChooserView$Companion;", "", "()V", "MOSAIC_STYLE_GLASS", "", "MOSAIC_STYLE_NORMAL", "MOSAIC_TYPE_DRAW", "MOSAIC_TYPE_RECT", "SEEK_BAR_INIT_PROGRESS", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicChooserView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public int getLayoutId() {
        return this.f149260f;
    }

    public final PaintController.OnPaintEventListener getPaintEventListener() {
        return this.f149274t;
    }

    public final int getScreenHeight() {
        return this.f149275u;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public View getToolbarContainerView() {
        return this.f149267m;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public VEMosaicController getVeController() {
        return this.f149273s;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/paint/mosaic/VEMosaicChooserView$paintEventListener$1", "Lcom/ss/android/photoeditor/ve/paint/PaintController$OnPaintEventListener;", "onPaintMoveTouchDown", "", "onPaintMoveTouchUp", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicChooserView$h */
    public static final class C59922h implements PaintController.OnPaintEventListener {

        /* renamed from: a */
        final /* synthetic */ VEMosaicChooserView f149282a;

        @Override // com.ss.android.photoeditor.ve.paint.PaintController.OnPaintEventListener
        /* renamed from: a */
        public void mo203994a() {
            this.f149282a.mo204020a(false);
        }

        @Override // com.ss.android.photoeditor.ve.paint.PaintController.OnPaintEventListener
        /* renamed from: b */
        public void mo203995b() {
            this.f149282a.mo204020a(true);
            this.f149282a.mo204000k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59922h(VEMosaicChooserView vEMosaicChooserView) {
            this.f149282a = vEMosaicChooserView;
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: a */
    public void mo203648a() {
        m232538n();
        m232537m();
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: b */
    public void mo203649b() {
        PaintSizeSeekBar paintSizeSeekBar = this.f149266l;
        if (paintSizeSeekBar != null) {
            paintSizeSeekBar.setInitProgress(50);
        }
        View findViewById = findViewById(R.id.rb_mosaic_draw);
        if (findViewById != null) {
            findViewById.performClick();
        }
        ImageView imageView = this.f149257b;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: f */
    public void mo203653f() {
        super.mo203653f();
        View view = this.f149262h;
        if (view != null) {
            view.setVisibility(0);
        }
        AnimationRelativeLayout animationRelativeLayout = this.f149265k;
        if (animationRelativeLayout != null) {
            animationRelativeLayout.mo204122a();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: g */
    public void mo203654g() {
        View view = this.f149262h;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f149264j;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        AnimationRelativeLayout animationRelativeLayout = this.f149265k;
        if (animationRelativeLayout != null) {
            animationRelativeLayout.mo204123b();
        }
        super.mo203654g();
    }

    /* renamed from: l */
    public final void mo204023l() {
        boolean z;
        View view = this.f149262h;
        if (view == null || view.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        mo204020a(!z);
    }

    /* renamed from: k */
    public final void mo204000k() {
        VEMosaicController veController = getVeController();
        if (veController == null) {
            return;
        }
        if (veController.mo204041y() > ((float) 0)) {
            View view = this.f149264j;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.f149264j;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* renamed from: m */
    private final void m232537m() {
        TextView textView = this.f149261g;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC59916b(this));
        }
        View view = this.f149263i;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC59917c(this));
        }
        View view2 = this.f149264j;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC59918d(this));
        }
        PaintSizeSeekBar paintSizeSeekBar = this.f149266l;
        if (paintSizeSeekBar != null) {
            paintSizeSeekBar.setOnSeekBarChangeListener(new C59919e(this));
        }
        ImageView imageView = this.f149257b;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC59920f(this));
        }
        ImageView imageView2 = this.f149268n;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View$OnClickListenerC59921g(this));
        }
        RadioGroup radioGroup = this.f149270p;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(this);
        }
    }

    /* renamed from: n */
    private final void m232538n() {
        this.f149261g = (TextView) findViewById(R.id.tv_confirm);
        this.f149262h = findViewById(R.id.rl_top_bar);
        this.f149263i = findViewById(R.id.iv_back);
        this.f149264j = findViewById(R.id.iv_undo);
        this.f149267m = findViewById(R.id.tool_bar_container);
        PaintSizeSeekBar paintSizeSeekBar = (PaintSizeSeekBar) findViewById(R.id.paint_size_seek_bar);
        this.f149266l = paintSizeSeekBar;
        if (paintSizeSeekBar != null) {
            paintSizeSeekBar.setInitProgress(50);
        }
        this.f149256a = (PaintCircleView) findViewById(R.id.paint_circle_view);
        this.f149265k = (AnimationRelativeLayout) findViewById(R.id.seek_bar_container);
        this.f149257b = (ImageView) findViewById(R.id.iv_mosaic_style_normal);
        this.f149268n = (ImageView) findViewById(R.id.iv_mosaic_style_glass);
        this.f149258c = (LinearLayout) findViewById(R.id.mosaic_style_glass_container);
        this.f149270p = (RadioGroup) findViewById(R.id.rg_mosaic_type);
        RadioButton radioButton = (RadioButton) findViewById(R.id.rb_mosaic_draw);
        this.f149271q = radioButton;
        if (radioButton != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            ColorStateList colorStateList = context2.getResources().getColorStateList(R.color.ve_edit_icon_color);
            Intrinsics.checkExpressionValueIsNotNull(colorStateList, "context.resources.getCol…color.ve_edit_icon_color)");
            radioButton.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C59901e.m232468a(context, R.drawable.ud_icon_mosaic_smear_outlined, colorStateList), (Drawable) null, (Drawable) null);
        }
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.rb_mosaic_rect);
        this.f149272r = radioButton2;
        if (radioButton2 != null) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            ColorStateList colorStateList2 = context4.getResources().getColorStateList(R.color.ve_edit_icon_color);
            Intrinsics.checkExpressionValueIsNotNull(colorStateList2, "context.resources.getCol…color.ve_edit_icon_color)");
            radioButton2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C59901e.m232468a(context3, R.drawable.ud_icon_mosaic_box_outlined, colorStateList2), (Drawable) null, (Drawable) null);
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public void setLayoutId(int i) {
        this.f149260f = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/photoeditor/ve/paint/mosaic/VEMosaicChooserView$initListener$4", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicChooserView$e */
    public static final class C59919e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ VEMosaicChooserView f149279a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59919e(VEMosaicChooserView vEMosaicChooserView) {
            this.f149279a = vEMosaicChooserView;
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            PaintCircleView paintCircleView = this.f149279a.f149256a;
            if (paintCircleView != null) {
                if (seekBar != null) {
                    paintCircleView.setPaintSize((float) seekBar.getProgress());
                }
                paintCircleView.mo204149a();
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            VEMosaicController veController;
            PaintCircleView paintCircleView = this.f149279a.f149256a;
            if (paintCircleView != null) {
                paintCircleView.mo204150b();
            }
            if (seekBar != null && (veController = this.f149279a.getVeController()) != null) {
                veController.mo203992c(((float) seekBar.getProgress()) / 100.0f);
            }
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            PaintCircleView paintCircleView;
            if (z && (paintCircleView = this.f149279a.f149256a) != null) {
                paintCircleView.setPaintSize((float) i);
            }
        }
    }

    public final void setScreenHeight(int i) {
        this.f149275u = i;
        VEMosaicController veController = getVeController();
        if (veController != null) {
            veController.mo203679a(this.f149275u);
        }
    }

    public void setVeController(VEMosaicController aVar) {
        this.f149273s = aVar;
        VEMosaicController veController = getVeController();
        if (veController != null) {
            veController.mo204038a(this.f149274t);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicChooserView$b */
    public static final class View$OnClickListenerC59916b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEMosaicChooserView f149276a;

        View$OnClickListenerC59916b(VEMosaicChooserView vEMosaicChooserView) {
            this.f149276a = vEMosaicChooserView;
        }

        public final void onClick(View view) {
            VEMosaicController veController = this.f149276a.getVeController();
            if (veController != null) {
                veController.mo203704o();
            }
            VEBaseChooserView.OnActionButtonClickedListener actionButtonClickedListener = this.f149276a.getActionButtonClickedListener();
            if (actionButtonClickedListener != null) {
                actionButtonClickedListener.mo203630a();
            }
            ImageEditorHitPoint.f148823a.mo203719b("confirm", "public_pic_edit_view");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicChooserView$c */
    public static final class View$OnClickListenerC59917c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEMosaicChooserView f149277a;

        View$OnClickListenerC59917c(VEMosaicChooserView vEMosaicChooserView) {
            this.f149277a = vEMosaicChooserView;
        }

        public final void onClick(View view) {
            VEMosaicController veController = this.f149277a.getVeController();
            if (veController != null) {
                veController.mo203705p();
            }
            VEBaseChooserView.OnActionButtonClickedListener actionButtonClickedListener = this.f149277a.getActionButtonClickedListener();
            if (actionButtonClickedListener != null) {
                actionButtonClickedListener.mo203631b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicChooserView$d */
    public static final class View$OnClickListenerC59918d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEMosaicChooserView f149278a;

        View$OnClickListenerC59918d(VEMosaicChooserView vEMosaicChooserView) {
            this.f149278a = vEMosaicChooserView;
        }

        public final void onClick(View view) {
            VEMosaicController veController = this.f149278a.getVeController();
            if (veController != null) {
                veController.mo204042z();
            }
            this.f149278a.mo204000k();
            ImageEditorHitPoint.Companion.m232165b(ImageEditorHitPoint.f148823a, "undo", null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicChooserView$f */
    public static final class View$OnClickListenerC59920f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEMosaicChooserView f149280a;

        View$OnClickListenerC59920f(VEMosaicChooserView vEMosaicChooserView) {
            this.f149280a = vEMosaicChooserView;
        }

        public final void onClick(View view) {
            if (this.f149280a.f149259d != 0) {
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                view.setBackground(this.f149280a.getResources().getDrawable(R.drawable.bg_color_selected));
                LinearLayout linearLayout = this.f149280a.f149258c;
                if (linearLayout != null) {
                    linearLayout.setBackground(null);
                }
                this.f149280a.f149259d = 0;
                VEMosaicController veController = this.f149280a.getVeController();
                if (veController != null) {
                    veController.mo204036B();
                }
                ImageEditorHitPoint.Companion.m232165b(ImageEditorHitPoint.f148823a, "mosaic_style", null, 2, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicChooserView$g */
    public static final class View$OnClickListenerC59921g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEMosaicChooserView f149281a;

        View$OnClickListenerC59921g(VEMosaicChooserView vEMosaicChooserView) {
            this.f149281a = vEMosaicChooserView;
        }

        public final void onClick(View view) {
            if (this.f149281a.f149259d != 1) {
                LinearLayout linearLayout = this.f149281a.f149258c;
                if (linearLayout != null) {
                    linearLayout.setBackground(this.f149281a.getResources().getDrawable(R.drawable.bg_color_selected));
                }
                ImageView imageView = this.f149281a.f149257b;
                if (imageView != null) {
                    imageView.setBackground(null);
                }
                this.f149281a.f149259d = 1;
                VEMosaicController veController = this.f149281a.getVeController();
                if (veController != null) {
                    veController.mo204037C();
                }
                ImageEditorHitPoint.Companion.m232165b(ImageEditorHitPoint.f148823a, "frosted_glass_style", null, 2, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo204020a(boolean z) {
        AnimationRelativeLayout animationRelativeLayout;
        AnimationRelativeLayout animationRelativeLayout2;
        View view;
        View view2;
        if (!z || (view2 = this.f149262h) == null || view2.getVisibility() != 0) {
            int i = 8;
            if (z || (view = this.f149262h) == null || view.getVisibility() != 8) {
                View view3 = this.f149262h;
                if (view3 != null) {
                    if (z) {
                        i = 0;
                    }
                    view3.setVisibility(i);
                }
                if (z) {
                    mo203659h();
                    if (this.f149269o == 0 && (animationRelativeLayout2 = this.f149265k) != null) {
                        animationRelativeLayout2.mo204122a();
                        return;
                    }
                    return;
                }
                mo203660i();
                if (this.f149269o == 0 && (animationRelativeLayout = this.f149265k) != null) {
                    animationRelativeLayout.mo204123b();
                }
            }
        }
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            RadioButton radioButton = (RadioButton) findViewById;
            if (radioButton == findViewById(R.id.rb_mosaic_draw)) {
                this.f149269o = 0;
                VEMosaicController veController = getVeController();
                if (veController != null) {
                    veController.mo204040b(0);
                }
                AnimationRelativeLayout animationRelativeLayout = this.f149265k;
                if (animationRelativeLayout != null) {
                    animationRelativeLayout.setVisibility(0);
                }
                ImageEditorHitPoint.Companion.m232165b(ImageEditorHitPoint.f148823a, "brush_mosaic", null, 2, null);
            }
            if (radioButton == findViewById(R.id.rb_mosaic_rect)) {
                this.f149269o = 1;
                VEMosaicController veController2 = getVeController();
                if (veController2 != null) {
                    veController2.mo204040b(1);
                }
                AnimationRelativeLayout animationRelativeLayout2 = this.f149265k;
                if (animationRelativeLayout2 != null) {
                    animationRelativeLayout2.setVisibility(8);
                }
                ImageEditorHitPoint.Companion.m232165b(ImageEditorHitPoint.f148823a, "frame_mosaic", null, 2, null);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RadioButton");
    }

    public VEMosaicChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f149260f = R.layout.view_mosaic_choose_view;
        this.f149274t = new C59922h(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VEMosaicChooserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
