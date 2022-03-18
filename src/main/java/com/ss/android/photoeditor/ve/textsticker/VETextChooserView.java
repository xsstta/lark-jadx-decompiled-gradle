package com.ss.android.photoeditor.ve.textsticker;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.text.TextStickerEditText;
import com.ss.android.photoeditor.ve.base.VEBaseChooserView;
import com.ss.android.photoeditor.ve.hitpoint.ImageEditorHitPoint;
import com.ss.android.photoeditor.ve.view.ColorChooseView;
import com.ss.android.ttve.utils.C60275a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB%\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020+H\u0016J\b\u0010/\u001a\u00020+H\u0016J\u0006\u00100\u001a\u00020+J\u0006\u00101\u001a\u00020+J\u0017\u00102\u001a\u00020+2\b\u00103\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020+J\u0010\u00106\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u000108J\u0016\u00109\u001a\u00020+2\u0006\u0010'\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bJ\b\u0010;\u001a\u00020+H\u0016J\u0006\u0010<\u001a\u00020+J\b\u0010=\u001a\u00020+H\u0002J\b\u0010>\u001a\u00020+H\u0002J\u0018\u0010?\u001a\u00020+2\u0006\u0010\"\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u0012\u0010%\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010&R\u0012\u0010'\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010&R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/ss/android/photoeditor/ve/textsticker/VETextChooserView;", "Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView;", "Lcom/ss/android/photoeditor/ve/textsticker/VETextController;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cancelBtn", "Landroid/widget/ImageView;", "colorChooseView", "Lcom/ss/android/photoeditor/ve/view/ColorChooseView;", "colorTypeView", "confirmBtn", "Landroid/widget/TextView;", "editTextView", "Lcom/ss/android/photoeditor/text/TextStickerEditText;", "getEditTextView", "()Lcom/ss/android/photoeditor/text/TextStickerEditText;", "setEditTextView", "(Lcom/ss/android/photoeditor/text/TextStickerEditText;)V", "isSelectBgColor", "", "isSoftKeyBoardShowing", "keyBoardOnGlobalChangeListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutId", "getLayoutId", "()I", "setLayoutId", "(I)V", "value", "screenHeight", "getScreenHeight", "setScreenHeight", "textBgColor", "Ljava/lang/Integer;", "textColor", "textColorView", "Landroid/view/View;", "addKeyBoardListener", "", "activity", "Landroid/app/Activity;", "bindView", "gone", "hideKeyBoard", "hideTextBorder", "onSelectColorChanged", "color", "(Ljava/lang/Integer;)V", "reset", "setText", "text", "", "setTextColor", "backgroundColor", "show", "showKeyBoard", "updateColorChooseView", "updateTextColorType", "updateViewHeight", "", "keyboardHeight", "Companion", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class VETextChooserView extends VEBaseChooserView<VETextController> {

    /* renamed from: e */
    public static final Companion f149334e = new Companion(null);

    /* renamed from: a */
    public boolean f149335a;

    /* renamed from: b */
    public Integer f149336b;

    /* renamed from: c */
    public Integer f149337c;

    /* renamed from: d */
    public boolean f149338d;

    /* renamed from: f */
    private int f149339f;

    /* renamed from: g */
    private ImageView f149340g;

    /* renamed from: h */
    private ImageView f149341h;

    /* renamed from: i */
    private TextView f149342i;

    /* renamed from: j */
    private TextStickerEditText f149343j;

    /* renamed from: k */
    private View f149344k;

    /* renamed from: l */
    private ColorChooseView f149345l;

    /* renamed from: m */
    private ViewTreeObserver.OnGlobalLayoutListener f149346m;

    /* renamed from: n */
    private int f149347n;

    public VETextChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/photoeditor/ve/textsticker/VETextChooserView$Companion;", "", "()V", "EDIT_TEXT_BG_BORDER_RADIUS", "", "LOG_TAG", "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.VETextChooserView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final TextStickerEditText getEditTextView() {
        return this.f149343j;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public int getLayoutId() {
        return this.f149339f;
    }

    public final int getScreenHeight() {
        return this.f149347n;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: e */
    public void mo203652e() {
        super.mo203652e();
        mo204064n();
    }

    /* renamed from: k */
    public final void mo204000k() {
        ColorChooseView colorChooseView = this.f149345l;
        if (colorChooseView != null) {
            mo204059a(colorChooseView.getSelectColor());
        }
    }

    /* renamed from: p */
    public final void mo204066p() {
        VETextController bVar = (VETextController) getVeController();
        if (bVar != null) {
            bVar.mo204115y();
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: c */
    public void mo203650c() {
        super.mo203650c();
        setText("");
        mo204063m();
        ImageEditorHitPoint.f148823a.mo203722d();
    }

    /* renamed from: o */
    public final void mo204065o() {
        TextStickerEditText textStickerEditText = this.f149343j;
        if (textStickerEditText != null) {
            textStickerEditText.mo203564a();
        }
        this.f149338d = false;
        mo204062l();
        ColorChooseView colorChooseView = this.f149345l;
        if (colorChooseView != null) {
            colorChooseView.mo204128a();
        }
    }

    /* renamed from: l */
    public final void mo204062l() {
        if (this.f149338d) {
            ImageView imageView = this.f149341h;
            if (imageView != null) {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                imageView.setBackground(context.getResources().getDrawable(R.drawable.ic_svg_select_text_bg_color));
                return;
            }
            return;
        }
        ImageView imageView2 = this.f149341h;
        if (imageView2 != null) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            imageView2.setBackground(context2.getResources().getDrawable(R.drawable.ic_svg_select_text_color));
        }
    }

    /* renamed from: m */
    public final void mo204063m() {
        TextStickerEditText textStickerEditText = this.f149343j;
        if (textStickerEditText != null) {
            textStickerEditText.setFocusable(true);
            textStickerEditText.setFocusableInTouchMode(true);
            textStickerEditText.requestFocus();
            Object systemService = getContext().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).showSoftInput(textStickerEditText, 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: n */
    public final void mo204064n() {
        IBinder iBinder;
        Object systemService = getContext().getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            TextStickerEditText textStickerEditText = this.f149343j;
            if (textStickerEditText != null) {
                iBinder = textStickerEditText.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.VETextChooserView$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC59925b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ VETextChooserView f149348a;

        /* renamed from: b */
        final /* synthetic */ Activity f149349b;

        ViewTreeObserver$OnGlobalLayoutListenerC59925b(VETextChooserView vETextChooserView, Activity activity) {
            this.f149348a = vETextChooserView;
            this.f149349b = activity;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            Window window = this.f149349b.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            float b = (float) C60275a.m234187b(this.f149348a.getContext());
            float f = b - ((float) rect.bottom);
            boolean z = this.f149348a.f149335a;
            if (Math.abs(f) > b / ((float) 5)) {
                this.f149348a.f149335a = true;
                this.f149348a.mo204057a(b, f);
                return;
            }
            if (z) {
                this.f149348a.mo204057a(b, f);
            }
            this.f149348a.f149335a = false;
        }
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    /* renamed from: a */
    public void mo203648a() {
        TextView textView = (TextView) findViewById(R.id.tv_confirm);
        this.f149342i = textView;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC59926c(this));
        }
        ImageView imageView = (ImageView) findViewById(R.id.iv_cancel);
        this.f149340g = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC59927d(this));
        }
        this.f149343j = (TextStickerEditText) findViewById(R.id.et_input_text);
        this.f149344k = findViewById(R.id.ll_text_color);
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_color_type);
        this.f149341h = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View$OnClickListenerC59928e(this));
        }
        ColorChooseView colorChooseView = (ColorChooseView) findViewById(R.id.color_choice_view);
        this.f149345l = colorChooseView;
        if (colorChooseView != null) {
            colorChooseView.mo204128a();
            Integer selectColor = colorChooseView.getSelectColor();
            if (selectColor != null) {
                int intValue = selectColor.intValue();
                this.f149336b = Integer.valueOf(intValue);
                TextStickerEditText textStickerEditText = this.f149343j;
                if (textStickerEditText != null) {
                    textStickerEditText.setTextColor(intValue);
                }
            }
        }
        ColorChooseView colorChooseView2 = this.f149345l;
        if (colorChooseView2 != null) {
            colorChooseView2.setOnSelectColorChangeListener(new C59929f(this));
        }
        if (getContext() instanceof Activity) {
            Context context = getContext();
            if (context != null) {
                m232573a((Activity) context);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public final void setEditTextView(TextStickerEditText textStickerEditText) {
        this.f149343j = textStickerEditText;
    }

    @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView
    public void setLayoutId(int i) {
        this.f149339f = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/photoeditor/ve/textsticker/VETextChooserView$bindView$5", "Lcom/ss/android/photoeditor/ve/view/ColorChooseView$OnSelectColorChangedListener;", "onSelectColor", "", "color", "", "(Ljava/lang/Integer;)V", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.VETextChooserView$f */
    public static final class C59929f implements ColorChooseView.OnSelectColorChangedListener {

        /* renamed from: a */
        final /* synthetic */ VETextChooserView f149353a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59929f(VETextChooserView vETextChooserView) {
            this.f149353a = vETextChooserView;
        }

        @Override // com.ss.android.photoeditor.ve.view.ColorChooseView.OnSelectColorChangedListener
        /* renamed from: a */
        public void mo204074a(Integer num) {
            this.f149353a.mo204059a(num);
            ImageEditorHitPoint.Companion.m232167d(ImageEditorHitPoint.f148823a, "color", null, 2, null);
        }
    }

    public final void setScreenHeight(int i) {
        this.f149347n = i;
        VETextController bVar = (VETextController) getVeController();
        if (bVar != null) {
            bVar.mo203679a(this.f149347n);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.VETextChooserView$e */
    static final class View$OnClickListenerC59928e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VETextChooserView f149352a;

        View$OnClickListenerC59928e(VETextChooserView vETextChooserView) {
            this.f149352a = vETextChooserView;
        }

        public final void onClick(View view) {
            VETextChooserView vETextChooserView = this.f149352a;
            vETextChooserView.f149338d = !vETextChooserView.f149338d;
            this.f149352a.mo204062l();
            this.f149352a.mo204000k();
            ImageEditorHitPoint.Companion.m232167d(ImageEditorHitPoint.f148823a, "text_box", null, 2, null);
        }
    }

    public final void setText(String str) {
        TextStickerEditText textStickerEditText = this.f149343j;
        if (textStickerEditText != null) {
            textStickerEditText.setText(str);
        }
        if (str != null) {
            int length = str.length();
            TextStickerEditText textStickerEditText2 = this.f149343j;
            if (textStickerEditText2 != null) {
                textStickerEditText2.setSelection(length);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.VETextChooserView$c */
    static final class View$OnClickListenerC59926c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VETextChooserView f149350a;

        View$OnClickListenerC59926c(VETextChooserView vETextChooserView) {
            this.f149350a = vETextChooserView;
        }

        public final void onClick(View view) {
            Editable editable;
            VETextController bVar = (VETextController) this.f149350a.getVeController();
            if (bVar != null) {
                TextStickerEditText editTextView = this.f149350a.getEditTextView();
                if (editTextView != null) {
                    editable = editTextView.getText();
                } else {
                    editable = null;
                }
                bVar.mo204109a(String.valueOf(editable), this.f149350a.f149336b, this.f149350a.f149337c);
            }
            VEBaseChooserView.OnActionButtonClickedListener actionButtonClickedListener = this.f149350a.getActionButtonClickedListener();
            if (actionButtonClickedListener != null) {
                actionButtonClickedListener.mo203630a();
            }
            ImageEditorHitPoint.f148823a.mo203723d("confirm", "public_pic_edit_view");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.textsticker.VETextChooserView$d */
    static final class View$OnClickListenerC59927d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VETextChooserView f149351a;

        View$OnClickListenerC59927d(VETextChooserView vETextChooserView) {
            this.f149351a = vETextChooserView;
        }

        public final void onClick(View view) {
            VETextController bVar = (VETextController) this.f149351a.getVeController();
            if (bVar != null) {
                bVar.mo204109a("", this.f149351a.f149336b, this.f149351a.f149337c);
            }
            VEBaseChooserView.OnActionButtonClickedListener actionButtonClickedListener = this.f149351a.getActionButtonClickedListener();
            if (actionButtonClickedListener != null) {
                actionButtonClickedListener.mo203631b();
            }
        }
    }

    /* renamed from: a */
    private final void m232573a(Activity activity) {
        this.f149346m = new ViewTreeObserver$OnGlobalLayoutListenerC59925b(this, activity);
        Window window = activity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView, "activity.window.decorView");
        decorView.getViewTreeObserver().removeGlobalOnLayoutListener(this.f149346m);
        Window window2 = activity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window2, "activity.window");
        View decorView2 = window2.getDecorView();
        Intrinsics.checkExpressionValueIsNotNull(decorView2, "activity.window.decorView");
        decorView2.getViewTreeObserver().addOnGlobalLayoutListener(this.f149346m);
    }

    /* renamed from: a */
    public final void mo204059a(Integer num) {
        Integer num2;
        if (num != null) {
            int intValue = num.intValue();
            if (this.f149338d) {
                ColorChooseView colorChooseView = this.f149345l;
                if (colorChooseView != null) {
                    if (!colorChooseView.mo204130b()) {
                        num2 = colorChooseView.getWhiteColor();
                    } else {
                        num2 = colorChooseView.getBlackColor();
                    }
                    this.f149336b = num2;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        TextStickerEditText textStickerEditText = this.f149343j;
                        if (textStickerEditText != null) {
                            textStickerEditText.setTextColor(intValue2);
                        }
                    }
                }
                this.f149337c = Integer.valueOf(intValue);
                TextStickerEditText textStickerEditText2 = this.f149343j;
                if (textStickerEditText2 != null) {
                    textStickerEditText2.mo203565a(2, intValue);
                    return;
                }
                return;
            }
            this.f149336b = Integer.valueOf(intValue);
            TextStickerEditText textStickerEditText3 = this.f149343j;
            if (textStickerEditText3 != null) {
                textStickerEditText3.setTextColor(intValue);
            }
            this.f149337c = 0;
            TextStickerEditText textStickerEditText4 = this.f149343j;
            if (textStickerEditText4 != null) {
                textStickerEditText4.mo203565a(1, intValue);
            }
        }
    }

    /* renamed from: a */
    public final void mo204058a(int i, int i2) {
        if (i2 == 0) {
            this.f149338d = false;
            ColorChooseView colorChooseView = this.f149345l;
            if (colorChooseView != null) {
                colorChooseView.setSelectColor(i);
            }
        } else {
            this.f149338d = true;
            ColorChooseView colorChooseView2 = this.f149345l;
            if (colorChooseView2 != null) {
                colorChooseView2.setSelectColor(i2);
            }
        }
        mo204062l();
        mo204000k();
    }

    /* renamed from: a */
    public final void mo204057a(float f, float f2) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = (int) ((f - ((float) iArr[1])) - f2);
        setLayoutParams(layoutParams);
        Log.m165379d("InputTextView", "layoutParams.height = " + layoutParams.height);
    }

    public VETextChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f149339f = R.layout.view_input_text;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VETextChooserView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
