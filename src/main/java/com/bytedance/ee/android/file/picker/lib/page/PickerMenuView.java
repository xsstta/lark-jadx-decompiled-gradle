package com.bytedance.ee.android.file.picker.lib.page;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\nH\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/page/PickerMenuView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "larkFileBtn", "Landroid/widget/TextView;", "getLarkFileBtn", "()Landroid/widget/TextView;", "mFilterRoot", "Landroid/view/View;", "mGrayBackground", "mMenuViewListener", "Lcom/bytedance/ee/android/file/picker/lib/page/PickerMenuView$MenuViewListener;", "storageBtn", "getStorageBtn", "createGrayBackground", "dismiss", "", "grayBackAlphaAnimate", "isShow", "", "menuPopAnimate", "setMenuViewListener", "listener", "setStorageBtnListener", "onClickListener", "Landroid/view/View$OnClickListener;", "show", "Companion", "MenuViewListener", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.page.g */
public final class PickerMenuView extends FrameLayout {

    /* renamed from: b */
    public static final Companion f12458b = new Companion(null);

    /* renamed from: a */
    public MenuViewListener f12459a;

    /* renamed from: c */
    private final TextView f12460c;

    /* renamed from: d */
    private final TextView f12461d;

    /* renamed from: e */
    private final View f12462e;

    /* renamed from: f */
    private final View f12463f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/page/PickerMenuView$MenuViewListener;", "", "onDismiss", "", "onShow", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.page.g$b */
    public interface MenuViewListener {
        /* renamed from: a */
        void mo16059a();

        /* renamed from: b */
        void mo16060b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/page/PickerMenuView$Companion;", "", "()V", "MENU_ANIMATE_DURATION", "", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.page.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final TextView getLarkFileBtn() {
        return this.f12461d;
    }

    public final TextView getStorageBtn() {
        return this.f12460c;
    }

    /* renamed from: b */
    public final void mo16063b() {
        m17113a(false);
        m17114b(false);
    }

    /* renamed from: a */
    public final void mo16062a() {
        setVisibility(0);
        m17113a(true);
        m17114b(true);
    }

    /* renamed from: c */
    private final View m17115c() {
        View view = new View(getContext());
        view.setId(R.id.file_picker_gray_layer);
        view.setBackgroundColor(C25653b.m91894a(view.getContext(), R.color.static_black, 0.3f));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setOnClickListener(new View$OnClickListenerC4116c(this));
        return view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/android/file/picker/lib/page/PickerMenuView$createGrayBackground$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.page.g$c */
    public static final class View$OnClickListenerC4116c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PickerMenuView f12464a;

        View$OnClickListenerC4116c(PickerMenuView gVar) {
            this.f12464a = gVar;
        }

        public final void onClick(View view) {
            this.f12464a.mo16063b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/android/file/picker/lib/page/PickerMenuView$menuPopAnimate$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.page.g$d */
    public static final class C4117d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ PickerMenuView f12465a;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4117d(PickerMenuView gVar) {
            this.f12465a = gVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f12465a.setVisibility(8);
            MenuViewListener bVar = this.f12465a.f12459a;
            if (bVar != null) {
                bVar.mo16060b();
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f12465a.setVisibility(8);
            MenuViewListener bVar = this.f12465a.f12459a;
            if (bVar != null) {
                bVar.mo16060b();
            }
        }
    }

    public final void setMenuViewListener(MenuViewListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f12459a = bVar;
    }

    public final void setStorageBtnListener(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "onClickListener");
        this.f12460c.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    private final void m17113a(boolean z) {
        float f;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 1.0f;
        }
        if (z) {
            f2 = 1.0f;
        }
        ObjectAnimator.ofFloat(this.f12462e, "alpha", f, f2).setDuration(200L).start();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickerMenuView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setVisibility(8);
        View c = m17115c();
        this.f12462e = c;
        addView(c);
        LayoutInflater.from(context).inflate(R.layout.file_picker_filter_picker, this);
        View findViewById = findViewById(R.id.file_picker_filter_root);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.file_picker_filter_root)");
        this.f12463f = findViewById;
        View findViewById2 = findViewById(R.id.file_picker_phone_storage_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.file_picker_phone_storage_btn)");
        this.f12460c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.file_picker_lark_file_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.file_picker_lark_file_btn)");
        this.f12461d = (TextView) findViewById3;
    }

    /* renamed from: b */
    private final void m17114b(boolean z) {
        float f;
        int dp2px = UIUtils.dp2px(getContext(), 104.0f);
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            f = (float) (-dp2px);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (!z) {
            f2 = (float) (-dp2px);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f12463f, "translationY", f, f2).setDuration(200L);
        Intrinsics.checkExpressionValueIsNotNull(duration, "ObjectAnimator.ofFloat(m…on(MENU_ANIMATE_DURATION)");
        if (!z) {
            duration.addListener(new C4117d(this));
        } else {
            MenuViewListener bVar = this.f12459a;
            if (bVar != null) {
                bVar.mo16059a();
            }
        }
        duration.start();
    }
}
