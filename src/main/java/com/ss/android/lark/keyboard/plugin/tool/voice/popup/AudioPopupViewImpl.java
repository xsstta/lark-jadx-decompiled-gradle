package com.ss.android.lark.keyboard.plugin.tool.voice.popup;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.framework.ui.BasePopupWindow;
import com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J*\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016R(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00038V@VX\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/AudioPopupViewImpl;", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/IAudioPopup;", "contentView", "Landroid/view/View;", "(Landroid/view/View;)V", "value", "getContentView", "()Landroid/view/View;", "setContentView", "isShowing", "", "()Z", "mContentView", "mDecorView", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/AudioPopupViewImpl$PopupDecorView;", "dismiss", "", "onBackPressed", "showAtLocation", "parent", "gravity", "", "x", "y", "PopupDecorView", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.a */
public final class AudioPopupViewImpl implements IAudioPopup {

    /* renamed from: b */
    private final PopupDecorView f104469b;

    /* renamed from: c */
    private View f104470c;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0014J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0014J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/AudioPopupViewImpl$PopupDecorView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mLocation", "", "generateDefaultLayoutParams", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/AudioPopupViewImpl$PopupDecorView$LayoutConfig;", "onLayout", "", "changed", "", "left", "", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "LayoutConfig", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.a$b */
    public static final class PopupDecorView extends ViewGroup {

        /* renamed from: a */
        private final int[] f104472a = new int[2];

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/AudioPopupViewImpl$PopupDecorView$LayoutConfig;", "Landroid/view/ViewGroup$LayoutParams;", "w", "", C14002h.f36692e, "gravity", "y", "(IIII)V", "getGravity", "()I", "setGravity", "(I)V", "getY", "setY", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.a$b$a */
        public static final class LayoutConfig extends ViewGroup.LayoutParams {

            /* renamed from: a */
            private int f104473a;

            /* renamed from: b */
            private int f104474b;

            /* renamed from: a */
            public final int mo147931a() {
                return this.f104473a;
            }

            /* renamed from: b */
            public final int mo147932b() {
                return this.f104474b;
            }

            public LayoutConfig(int i, int i2, int i3, int i4) {
                super(i, i2);
                this.f104473a = i3;
                this.f104474b = i4;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public LayoutConfig generateDefaultLayoutParams() {
            return new LayoutConfig(-1, -2, 0, 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PopupDecorView(Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            measureChildren(i, i2);
            super.onMeasure(i, i2);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!(childAt == null || 8 == childAt.getVisibility())) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams != null) {
                        LayoutConfig aVar = (LayoutConfig) layoutParams;
                        if ((aVar.mo147931a() & SmEvents.EVENT_NE_RR) != 80) {
                            i5 = aVar.mo147932b();
                        } else if (aVar.mo147932b() == 0) {
                            i5 = (i4 - i2) - childAt.getMeasuredHeight();
                        } else {
                            getLocationInWindow(this.f104472a);
                            Context context = getContext();
                            if (context != null) {
                                Window window = ((Activity) context).getWindow();
                                Intrinsics.checkExpressionValueIsNotNull(window, "(context as Activity).window");
                                View decorView = window.getDecorView();
                                Intrinsics.checkExpressionValueIsNotNull(decorView, "(context as Activity).window.decorView");
                                i5 = ((decorView.getHeight() - childAt.getMeasuredHeight()) - aVar.mo147932b()) - this.f104472a[1];
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                            }
                        }
                        childAt.layout(0, i5, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i5);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.plugin.tool.voice.popup.AudioPopupViewImpl.PopupDecorView.LayoutConfig");
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.a$d */
    static final class View$OnClickListenerC41032d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC41032d f104476a = new View$OnClickListenerC41032d();

        View$OnClickListenerC41032d() {
        }

        public final void onClick(View view) {
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.a$c */
    public static final class RunnableC41031c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AudioPopupViewImpl f104475a;

        RunnableC41031c(AudioPopupViewImpl aVar) {
            this.f104475a = aVar;
        }

        public final void run() {
            this.f104475a.mo147923b();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: d */
    public BasePopupWindow mo147925d() {
        return IAudioPopup.C41033a.m162659a(this);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: c */
    public boolean mo147924c() {
        boolean a = mo147922a();
        if (a) {
            mo147923b();
        }
        return a;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: a */
    public boolean mo147922a() {
        if (this.f104469b.getParent() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: b */
    public void mo147923b() {
        if (this.f104469b.isInLayout()) {
            this.f104469b.post(new RunnableC41031c(this));
            return;
        }
        ViewParent parent = this.f104469b.getParent();
        ViewGroup viewGroup = null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f104469b);
        }
        View view = this.f104470c;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof ViewGroup) {
                viewGroup = parent2;
            }
            ViewGroup viewGroup3 = viewGroup;
            if (viewGroup3 != null) {
                viewGroup3.removeView(view);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/keyboard/plugin/tool/voice/popup/AudioPopupViewImpl$mDecorView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.a$a */
    static final class View$OnClickListenerC41030a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AudioPopupViewImpl f104471a;

        View$OnClickListenerC41030a(AudioPopupViewImpl aVar) {
            this.f104471a = aVar;
        }

        public final void onClick(View view) {
            this.f104471a.mo147923b();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: a */
    public void mo147920a(View view) {
        if (!mo147922a()) {
            this.f104470c = view;
        }
    }

    public AudioPopupViewImpl(View view) {
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "contentView.context");
        PopupDecorView bVar = new PopupDecorView(context);
        bVar.setOnClickListener(new View$OnClickListenerC41030a(this));
        this.f104469b = bVar;
        this.f104470c = view;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: a */
    public void mo147921a(View view, int i, int i2, int i3) {
        View view2 = this.f104470c;
        if (!mo147922a() && view2 != null) {
            ViewParent parent = view2.getParent();
            ViewGroup viewGroup = null;
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 != null) {
                viewGroup2.removeView(view2);
            }
            this.f104469b.removeAllViews();
            PopupDecorView bVar = this.f104469b;
            FrameLayout frameLayout = new FrameLayout(this.f104469b.getContext());
            frameLayout.addView(view2, new FrameLayout.LayoutParams(-1, -2));
            frameLayout.setOnClickListener(View$OnClickListenerC41032d.f104476a);
            bVar.addView(frameLayout, new PopupDecorView.LayoutConfig(-1, -2, i, i3));
            ViewParent parent2 = this.f104469b.getParent();
            if (parent2 instanceof ViewGroup) {
                viewGroup = parent2;
            }
            ViewGroup viewGroup3 = viewGroup;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this.f104469b);
            }
            Context context = this.f104469b.getContext();
            if (context != null) {
                ((ViewGroup) ((Activity) context).findViewById(16908290)).addView(this.f104469b, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }
}
