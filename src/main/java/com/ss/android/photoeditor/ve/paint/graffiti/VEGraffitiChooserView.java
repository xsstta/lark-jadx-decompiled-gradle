package com.ss.android.photoeditor.ve.paint.graffiti;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.ve.base.VEBaseChooserView;
import com.ss.android.photoeditor.ve.hitpoint.ImageEditorHitPoint;
import com.ss.android.photoeditor.ve.paint.PaintController;
import com.ss.android.photoeditor.ve.paint.view.PaintSizeSeekBar;
import com.ss.android.photoeditor.ve.view.AnimationRelativeLayout;
import com.ss.android.photoeditor.ve.view.ColorListAdapter;
import com.ss.android.photoeditor.ve.view.OnColorSelectedListener;
import com.ss.android.photoeditor.ve.view.PaintCircleView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B%\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010/\u001a\u000200H\u0016J\n\u00101\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u000200H\u0016J\b\u00104\u001a\u000200H\u0002J\b\u00105\u001a\u000200H\u0002J\u0010\u00106\u001a\u0002002\u0006\u00107\u001a\u00020\bH\u0002J\b\u00108\u001a\u000200H\u0016J\u0006\u00109\u001a\u000200J\u0010\u00109\u001a\u0002002\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u000200H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R$\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R(\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0002@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006>"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiChooserView;", "Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView;", "Lcom/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiController;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backView", "Landroid/view/View;", "colorArray", "", "colorListAdapter", "Lcom/ss/android/photoeditor/ve/view/ColorListAdapter;", "confirmBtn", "Landroid/widget/TextView;", "layoutId", "getLayoutId", "()I", "setLayoutId", "(I)V", "paintCircleView", "Lcom/ss/android/photoeditor/ve/view/PaintCircleView;", "paintEventListener", "Lcom/ss/android/photoeditor/ve/paint/PaintController$OnPaintEventListener;", "getPaintEventListener", "()Lcom/ss/android/photoeditor/ve/paint/PaintController$OnPaintEventListener;", "paintSizeSeekBar", "Lcom/ss/android/photoeditor/ve/paint/view/PaintSizeSeekBar;", "rv_color_list", "Landroidx/recyclerview/widget/RecyclerView;", "value", "screenHeight", "getScreenHeight", "setScreenHeight", "seekBarContainer", "Lcom/ss/android/photoeditor/ve/view/AnimationRelativeLayout;", "toolBarContainer", "topBar", "undoView", "veController", "getVeController", "()Lcom/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiController;", "setVeController", "(Lcom/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiController;)V", "bindView", "", "getToolbarContainerView", "hideAndResetView", "hideWithAnimation", "initListener", "initView", "onPaintSelected", "index", "showWithAnimation", "updateToolBarVisibility", "isVisible", "", "updateUndoViewVisibility", "Companion", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class VEGraffitiChooserView extends VEBaseChooserView<VEGraffitiController> {

    /* renamed from: b */
    public static final Companion f149218b = new Companion(null);

    /* renamed from: a */
    public PaintCircleView f149219a;

    /* renamed from: c */
    private int f149220c;

    /* renamed from: d */
    private RecyclerView f149221d;

    /* renamed from: e */
    private View f149222e;

    /* renamed from: f */
    private View f149223f;

    /* renamed from: g */
    private View f149224g;

    /* renamed from: h */
    private AnimationRelativeLayout f149225h;

    /* renamed from: i */
    private PaintSizeSeekBar f149226i;

    /* renamed from: j */
    private TextView f149227j;

    /* renamed from: k */
    private View f149228k;

    /* renamed from: l */
    private ColorListAdapter f149229l;

    /* renamed from: m */
    private final int[] f149230m;

    /* renamed from: n */
    private VEGraffitiController f149231n;

    /* renamed from: o */
    private final PaintController.OnPaintEventListener f149232o;

    /* renamed from: p */
    private int f149233p;

    public VEGraffitiChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiChooserView$Companion;", "", "()V", "COLOR_SELECT_DEFAULT_INDEX", "", "SEEK_BAR_INIT_PROGRESS", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiChooserView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public int getLayoutId() {
        return this.f149220c;
    }

    public final PaintController.OnPaintEventListener getPaintEventListener() {
        return this.f149232o;
    }

    public final int getScreenHeight() {
        return this.f149233p;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public View getToolbarContainerView() {
        return this.f149228k;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public VEGraffitiController getVeController() {
        return this.f149231n;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiChooserView$paintEventListener$1", "Lcom/ss/android/photoeditor/ve/paint/PaintController$OnPaintEventListener;", "onPaintMoveTouchDown", "", "onPaintMoveTouchUp", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiChooserView$g */
    public static final class C59915g implements PaintController.OnPaintEventListener {

        /* renamed from: a */
        final /* synthetic */ VEGraffitiChooserView f149239a;

        @Override // com.ss.android.photoeditor.ve.paint.PaintController.OnPaintEventListener
        /* renamed from: a */
        public void mo203994a() {
            this.f149239a.mo203997a(false);
        }

        @Override // com.ss.android.photoeditor.ve.paint.PaintController.OnPaintEventListener
        /* renamed from: b */
        public void mo203995b() {
            this.f149239a.mo203997a(true);
            this.f149239a.mo204000k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59915g(VEGraffitiChooserView vEGraffitiChooserView) {
            this.f149239a = vEGraffitiChooserView;
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: a */
    public void mo203648a() {
        m232512m();
        m232513n();
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: b */
    public void mo203649b() {
        PaintSizeSeekBar paintSizeSeekBar = this.f149226i;
        if (paintSizeSeekBar != null) {
            paintSizeSeekBar.setInitProgress(50);
        }
        RecyclerView recyclerView = this.f149221d;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        ColorListAdapter aVar = this.f149229l;
        if (aVar != null) {
            aVar.mo204166a(0);
        }
        mo203996a(0);
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: f */
    public void mo203653f() {
        super.mo203653f();
        AnimationRelativeLayout animationRelativeLayout = this.f149225h;
        if (animationRelativeLayout != null) {
            animationRelativeLayout.mo204122a();
        }
        View view = this.f149222e;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: g */
    public void mo203654g() {
        View view = this.f149222e;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f149224g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        AnimationRelativeLayout animationRelativeLayout = this.f149225h;
        if (animationRelativeLayout != null) {
            animationRelativeLayout.mo204123b();
        }
        super.mo203654g();
    }

    /* renamed from: l */
    public final void mo204001l() {
        boolean z;
        View view = this.f149222e;
        if (view == null || view.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        mo203997a(!z);
    }

    /* renamed from: n */
    private final void m232513n() {
        TextView textView = this.f149227j;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC59910b(this));
        }
        View view = this.f149223f;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC59911c(this));
        }
        View view2 = this.f149224g;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC59912d(this));
        }
        PaintSizeSeekBar paintSizeSeekBar = this.f149226i;
        if (paintSizeSeekBar != null) {
            paintSizeSeekBar.setOnSeekBarChangeListener(new C59913e(this));
        }
    }

    /* renamed from: k */
    public final void mo204000k() {
        VEGraffitiController veController = getVeController();
        if (veController == null) {
            return;
        }
        if (veController.mo204014x() > ((float) 0)) {
            View view = this.f149224g;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.f149224g;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* renamed from: m */
    private final void m232512m() {
        RecyclerView.ItemAnimator itemAnimator;
        this.f149227j = (TextView) findViewById(R.id.tv_confirm);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_color_list);
        this.f149221d = recyclerView;
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.f149221d;
        SimpleItemAnimator simpleItemAnimator = null;
        if (recyclerView2 != null) {
            itemAnimator = recyclerView2.getItemAnimator();
        } else {
            itemAnimator = null;
        }
        if (itemAnimator instanceof SimpleItemAnimator) {
            simpleItemAnimator = itemAnimator;
        }
        SimpleItemAnimator simpleItemAnimator2 = simpleItemAnimator;
        if (simpleItemAnimator2 != null) {
            simpleItemAnimator2.setSupportsChangeAnimations(false);
        }
        ColorListAdapter aVar = new ColorListAdapter(getContext(), this.f149230m);
        aVar.mo204166a(0);
        ColorListAdapter aVar2 = this.f149229l;
        if (aVar2 != null) {
            aVar2.notifyDataSetChanged();
        }
        aVar.mo204168a(new C59914f(this));
        this.f149229l = aVar;
        RecyclerView recyclerView3 = this.f149221d;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(aVar);
        }
        this.f149222e = findViewById(R.id.rl_top_bar);
        this.f149223f = findViewById(R.id.iv_back);
        this.f149224g = findViewById(R.id.iv_undo);
        PaintSizeSeekBar paintSizeSeekBar = (PaintSizeSeekBar) findViewById(R.id.paint_size_seek_bar);
        this.f149226i = paintSizeSeekBar;
        if (paintSizeSeekBar != null) {
            paintSizeSeekBar.setInitProgress(50);
        }
        this.f149228k = findViewById(R.id.tool_bar_container);
        this.f149219a = (PaintCircleView) findViewById(R.id.paint_circle_view);
        this.f149225h = (AnimationRelativeLayout) findViewById(R.id.seek_bar_container);
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public void setLayoutId(int i) {
        this.f149220c = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiChooserView$initListener$4", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiChooserView$e */
    public static final class C59913e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ VEGraffitiChooserView f149237a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59913e(VEGraffitiChooserView vEGraffitiChooserView) {
            this.f149237a = vEGraffitiChooserView;
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            PaintCircleView paintCircleView = this.f149237a.f149219a;
            if (paintCircleView != null) {
                if (seekBar != null) {
                    paintCircleView.setPaintSize((float) seekBar.getProgress());
                }
                paintCircleView.mo204149a();
            }
            ImageEditorHitPoint.Companion.m232166c(ImageEditorHitPoint.f148823a, "thickness", null, 2, null);
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            VEGraffitiController veController;
            PaintCircleView paintCircleView = this.f149237a.f149219a;
            if (paintCircleView != null) {
                paintCircleView.mo204150b();
            }
            if (seekBar != null && (veController = this.f149237a.getVeController()) != null) {
                veController.mo203992c(((float) seekBar.getProgress()) / 100.0f);
            }
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            PaintCircleView paintCircleView;
            if (z && (paintCircleView = this.f149237a.f149219a) != null) {
                paintCircleView.setPaintSize((float) i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiChooserView$initView$2$1", "Lcom/ss/android/photoeditor/ve/view/OnColorSelectedListener;", "onColorSelected", "", "position", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiChooserView$f */
    public static final class C59914f implements OnColorSelectedListener {

        /* renamed from: a */
        final /* synthetic */ VEGraffitiChooserView f149238a;

        C59914f(VEGraffitiChooserView vEGraffitiChooserView) {
            this.f149238a = vEGraffitiChooserView;
        }

        @Override // com.ss.android.photoeditor.ve.view.OnColorSelectedListener
        /* renamed from: a */
        public void mo204010a(int i) {
            this.f149238a.mo203996a(i);
            ImageEditorHitPoint.Companion.m232166c(ImageEditorHitPoint.f148823a, "color", null, 2, null);
        }
    }

    public final void setScreenHeight(int i) {
        this.f149233p = i;
        VEGraffitiController veController = getVeController();
        if (veController != null) {
            veController.mo203679a(this.f149233p);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiChooserView$b */
    public static final class View$OnClickListenerC59910b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEGraffitiChooserView f149234a;

        View$OnClickListenerC59910b(VEGraffitiChooserView vEGraffitiChooserView) {
            this.f149234a = vEGraffitiChooserView;
        }

        public final void onClick(View view) {
            VEGraffitiController veController = this.f149234a.getVeController();
            if (veController != null) {
                veController.mo203704o();
            }
            VEBaseChooserView.OnActionButtonClickedListener actionButtonClickedListener = this.f149234a.getActionButtonClickedListener();
            if (actionButtonClickedListener != null) {
                actionButtonClickedListener.mo203630a();
            }
            ImageEditorHitPoint.f148823a.mo203721c("confirm", "public_pic_edit_view");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiChooserView$c */
    public static final class View$OnClickListenerC59911c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEGraffitiChooserView f149235a;

        View$OnClickListenerC59911c(VEGraffitiChooserView vEGraffitiChooserView) {
            this.f149235a = vEGraffitiChooserView;
        }

        public final void onClick(View view) {
            VEGraffitiController veController = this.f149235a.getVeController();
            if (veController != null) {
                veController.mo203705p();
            }
            VEBaseChooserView.OnActionButtonClickedListener actionButtonClickedListener = this.f149235a.getActionButtonClickedListener();
            if (actionButtonClickedListener != null) {
                actionButtonClickedListener.mo203631b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiChooserView$d */
    public static final class View$OnClickListenerC59912d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEGraffitiChooserView f149236a;

        View$OnClickListenerC59912d(VEGraffitiChooserView vEGraffitiChooserView) {
            this.f149236a = vEGraffitiChooserView;
        }

        public final void onClick(View view) {
            VEGraffitiController veController = this.f149236a.getVeController();
            if (veController != null) {
                veController.mo204015y();
            }
            this.f149236a.mo204000k();
            ImageEditorHitPoint.Companion.m232166c(ImageEditorHitPoint.f148823a, "undo", null, 2, null);
        }
    }

    /* renamed from: a */
    public final void mo203996a(int i) {
        VEGraffitiController veController = getVeController();
        if (veController != null) {
            veController.mo204012a(Integer.valueOf(this.f149230m[i]));
        }
    }

    public void setVeController(VEGraffitiController aVar) {
        this.f149231n = aVar;
        VEGraffitiController veController = getVeController();
        if (veController != null) {
            veController.mo204013b(this.f149230m[0]);
        }
        VEGraffitiController veController2 = getVeController();
        if (veController2 != null) {
            veController2.mo204011a(this.f149232o);
        }
    }

    /* renamed from: a */
    public final void mo203997a(boolean z) {
        View view;
        View view2;
        if (!z || (view2 = this.f149222e) == null || view2.getVisibility() != 0) {
            int i = 8;
            if (z || (view = this.f149222e) == null || view.getVisibility() != 8) {
                View view3 = this.f149222e;
                if (view3 != null) {
                    if (z) {
                        i = 0;
                    }
                    view3.setVisibility(i);
                }
                if (z) {
                    mo203659h();
                    AnimationRelativeLayout animationRelativeLayout = this.f149225h;
                    if (animationRelativeLayout != null) {
                        animationRelativeLayout.mo204122a();
                        return;
                    }
                    return;
                }
                mo203660i();
                AnimationRelativeLayout animationRelativeLayout2 = this.f149225h;
                if (animationRelativeLayout2 != null) {
                    animationRelativeLayout2.mo204123b();
                }
            }
        }
    }

    public VEGraffitiChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f149220c = R.layout.view_graffiti_choose_view;
        this.f149230m = new int[]{getResources().getColor(R.color.lkui_R500), getResources().getColor(R.color.lkui_N00), getResources().getColor(R.color.lkui_N1000), getResources().getColor(R.color.lkui_G500), getResources().getColor(R.color.lkui_Y500), getResources().getColor(R.color.lkui_B400), getResources().getColor(R.color.lkui_C500)};
        this.f149232o = new C59915g(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VEGraffitiChooserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
