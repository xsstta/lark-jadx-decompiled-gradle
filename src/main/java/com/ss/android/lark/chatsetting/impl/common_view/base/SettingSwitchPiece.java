package com.ss.android.lark.chatsetting.impl.common_view.base;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\tH\u0014J\n\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0014J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0011J\b\u0010!\u001a\u00020\"H\u0014J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011J\b\u0010$\u001a\u00020\"H\u0014J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0004J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\tH\u0014J\b\u0010(\u001a\u00020\u000bH\u0002J\u0012\u0010)\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0004RB\u0010\u0003\u001a6\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004j\u0002`\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000RB\u0010\u000f\u001a6\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004j\u0002`\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingSwitchPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece;", "()V", "emptyAction", "Lkotlin/Function2;", "Landroid/widget/CompoundButton;", "Lkotlin/ParameterName;", "name", "buttonView", "", "isChecked", "", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/OnCheckedChangeAction;", "onCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "realAction", "subtitleStr", "", "subtitleView", "Landroid/widget/TextView;", "switchBtn", "Lcom/larksuite/component/universe_design/udswitch/UDSwitch;", "titleStr", "titleView", "getDefaultCheckedState", "getOnCheckedChangeListener", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "subtitle", "subtitleRes", "", "title", "titleRes", "updateCheckedState", "updateContentViewEnable", "isEnableState", "updateTitleView", "updateViewProperty", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SettingSwitchPiece extends SettingBasePiece<SettingSwitchPiece> {

    /* renamed from: a */
    public CompoundButton.OnCheckedChangeListener f89171a = mo127652m();

    /* renamed from: b */
    private TextView f89172b;

    /* renamed from: g */
    private TextView f89173g;

    /* renamed from: h */
    private UDSwitch f89174h;

    /* renamed from: i */
    private String f89175i;

    /* renamed from: j */
    private String f89176j;

    /* renamed from: k */
    private final Function2<CompoundButton, Boolean, Unit> f89177k = C34530a.INSTANCE;

    /* renamed from: l */
    private final Function2<CompoundButton, Boolean, Unit> f89178l = new C34531b(this);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo127642j() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo127650k() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo127651l() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public CompoundButton.OnCheckedChangeListener mo127652m() {
        return null;
    }

    /* renamed from: n */
    private final void mo127678n() {
        boolean z;
        int i;
        int a = C51468a.m199486a(16);
        TextView textView = this.f89173g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subtitleView");
        }
        String str = this.f89176j;
        boolean z2 = true;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        TextView textView2 = this.f89173g;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subtitleView");
        }
        textView2.setText(this.f89176j);
        TextView textView3 = this.f89172b;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            layoutParams = null;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (layoutParams2 == null) {
            layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
        }
        layoutParams2.topMargin = a;
        layoutParams2.setMarginEnd(C51468a.m199486a(8));
        layoutParams2.setMarginStart(a);
        layoutParams2.f2825q = 0;
        layoutParams2.f2816h = 0;
        layoutParams2.f2826r = R.id.item_switch_btn;
        String str2 = this.f89176j;
        if (!(str2 == null || str2.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            layoutParams2.f2819k = 0;
            layoutParams2.bottomMargin = C51468a.m199486a(16);
        } else {
            layoutParams2.f2819k = -1;
            layoutParams2.bottomMargin = 0;
        }
        TextView textView4 = this.f89172b;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView4.setLayoutParams(layoutParams2);
    }

    /* renamed from: a */
    public final void mo127648a(String str) {
        if (!Intrinsics.areEqual(str, this.f89176j)) {
            this.f89176j = str;
            if (mo177206t()) {
                mo127678n();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.android.lark.chatsetting.impl.common_view.base.c] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.ss.android.lark.chatsetting.impl.common_view.base.c] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo127649c(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.mo177206t()
            if (r0 == 0) goto L_0x003e
            com.larksuite.component.universe_design.udswitch.UDSwitch r0 = r4.f89174h
            java.lang.String r1 = "switchBtn"
            if (r0 != 0) goto L_0x000f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x000f:
            kotlin.jvm.functions.k<android.widget.CompoundButton, java.lang.Boolean, kotlin.Unit> r2 = r4.f89177k
            if (r2 == 0) goto L_0x0019
            com.ss.android.lark.chatsetting.impl.common_view.base.c r3 = new com.ss.android.lark.chatsetting.impl.common_view.base.c
            r3.<init>(r2)
            r2 = r3
        L_0x0019:
            android.widget.CompoundButton$OnCheckedChangeListener r2 = (android.widget.CompoundButton.OnCheckedChangeListener) r2
            r0.setOnCheckedChangeListener(r2)
            com.larksuite.component.universe_design.udswitch.UDSwitch r0 = r4.f89174h
            if (r0 != 0) goto L_0x0025
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0025:
            r0.setChecked(r5)
            com.larksuite.component.universe_design.udswitch.UDSwitch r5 = r4.f89174h
            if (r5 != 0) goto L_0x002f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x002f:
            kotlin.jvm.functions.k<android.widget.CompoundButton, java.lang.Boolean, kotlin.Unit> r0 = r4.f89178l
            if (r0 == 0) goto L_0x0039
            com.ss.android.lark.chatsetting.impl.common_view.base.c r1 = new com.ss.android.lark.chatsetting.impl.common_view.base.c
            r1.<init>(r0)
            r0 = r1
        L_0x0039:
            android.widget.CompoundButton$OnCheckedChangeListener r0 = (android.widget.CompoundButton.OnCheckedChangeListener) r0
            r5.setOnCheckedChangeListener(r0)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.common_view.base.SettingSwitchPiece.mo127649c(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.lark.chatsetting.impl.common_view.base.c] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.ss.android.lark.chatsetting.impl.common_view.base.c] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo127627a(boolean r4) {
        /*
            r3 = this;
            super.mo127627a(r4)
            boolean r0 = r3.mo177206t()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r0 = "switchBtn"
            if (r4 == 0) goto L_0x0025
            com.larksuite.component.universe_design.udswitch.UDSwitch r4 = r3.f89174h
            if (r4 != 0) goto L_0x0015
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0015:
            kotlin.jvm.functions.k<android.widget.CompoundButton, java.lang.Boolean, kotlin.Unit> r0 = r3.f89178l
            if (r0 == 0) goto L_0x001f
            com.ss.android.lark.chatsetting.impl.common_view.base.c r1 = new com.ss.android.lark.chatsetting.impl.common_view.base.c
            r1.<init>(r0)
            r0 = r1
        L_0x001f:
            android.widget.CompoundButton$OnCheckedChangeListener r0 = (android.widget.CompoundButton.OnCheckedChangeListener) r0
            r4.setOnCheckedChangeListener(r0)
            goto L_0x0046
        L_0x0025:
            com.larksuite.component.universe_design.udswitch.UDSwitch r4 = r3.f89174h
            if (r4 != 0) goto L_0x002c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x002c:
            kotlin.jvm.functions.k<android.widget.CompoundButton, java.lang.Boolean, kotlin.Unit> r1 = r3.f89177k
            if (r1 == 0) goto L_0x0036
            com.ss.android.lark.chatsetting.impl.common_view.base.c r2 = new com.ss.android.lark.chatsetting.impl.common_view.base.c
            r2.<init>(r1)
            r1 = r2
        L_0x0036:
            android.widget.CompoundButton$OnCheckedChangeListener r1 = (android.widget.CompoundButton.OnCheckedChangeListener) r1
            r4.setOnCheckedChangeListener(r1)
            com.larksuite.component.universe_design.udswitch.UDSwitch r4 = r3.f89174h
            if (r4 != 0) goto L_0x0042
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x0042:
            r0 = 0
            r4.setChecked(r0)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.common_view.base.SettingSwitchPiece.mo127627a(boolean):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.base.SettingSwitchPiece$a */
    static final class C34530a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {
        public static final C34530a INSTANCE = new C34530a();

        C34530a() {
            super(2);
        }

        public final void invoke(CompoundButton compoundButton, boolean z) {
            Intrinsics.checkParameterIsNotNull(compoundButton, "<anonymous parameter 0>");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
            invoke(compoundButton, bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.common_view.base.SettingSwitchPiece$b */
    static final class C34531b extends Lambda implements Function2<CompoundButton, Boolean, Unit> {
        final /* synthetic */ SettingSwitchPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34531b(SettingSwitchPiece settingSwitchPiece) {
            super(2);
            this.this$0 = settingSwitchPiece;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
            invoke(compoundButton, bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(CompoundButton compoundButton, boolean z) {
            Intrinsics.checkParameterIsNotNull(compoundButton, "buttonView");
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.this$0.f89171a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.ss.android.lark.chatsetting.impl.common_view.base.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo127619a(android.content.Context r10, android.view.ViewGroup.MarginLayoutParams r11) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.common_view.base.SettingSwitchPiece.mo127619a(android.content.Context, android.view.ViewGroup$MarginLayoutParams):android.view.View");
    }
}
