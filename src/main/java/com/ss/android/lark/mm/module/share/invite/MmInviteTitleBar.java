package com.ss.android.lark.mm.module.share.invite;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BoldTextView;
import com.ss.android.lark.mm.widget.onboarding.MmNewGuideConfig;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public class MmInviteTitleBar extends RelativeLayout {

    /* renamed from: a */
    private HashMap f118305a;

    /* renamed from: com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar$b */
    public static final class View$OnClickListenerC47004b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC47004b f118309a = new View$OnClickListenerC47004b();

        View$OnClickListenerC47004b() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: a */
    public View mo164997a(int i) {
        if (this.f118305a == null) {
            this.f118305a = new HashMap();
        }
        View view = (View) this.f118305a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118305a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m186073a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_invite_titlebar, this);
    }

    public final View getRightActionView() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo164997a(R.id.entryMore);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "entryMore");
        return appCompatImageView;
    }

    /* renamed from: com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar$a */
    public static final class RunnableC47003a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmInviteTitleBar f118306a;

        /* renamed from: b */
        final /* synthetic */ String f118307b;

        /* renamed from: c */
        final /* synthetic */ String f118308c;

        RunnableC47003a(MmInviteTitleBar mmInviteTitleBar, String str, String str2) {
            this.f118306a = mmInviteTitleBar;
            this.f118307b = str;
            this.f118308c = str2;
        }

        public final void run() {
            MmNewGuideConfig mmNewGuideConfig = new MmNewGuideConfig((AppCompatImageView) this.f118306a.mo164997a(R.id.entryMore), this.f118307b, null, this.f118308c, 80);
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            a.getGuideDependency().mo144593a(mmNewGuideConfig, null);
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar$c */
    public static final class C47005c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function0 $onAction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47005c(Function0 function0) {
            super(1);
            this.$onAction = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            this.$onAction.invoke();
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar$d */
    public static final class C47006d extends Lambda implements Function1<View, Unit> {
        public static final C47006d INSTANCE = new C47006d();

        C47006d() {
            super(1);
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar$e */
    public static final class C47007e extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Function1 $onAction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47007e(Function1 function1) {
            super(1);
            this.$onAction = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            Function1 function1 = this.$onAction;
            if (function1 != null) {
                Unit unit = (Unit) function1.invoke(view);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmInviteTitleBar(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setTitleColor(int i) {
        ((BoldTextView) mo164997a(R.id.tvTitle)).setTextColor(i);
    }

    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        BoldTextView boldTextView = (BoldTextView) mo164997a(R.id.tvTitle);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvTitle");
        boldTextView.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmInviteTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo165000a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "guideKey");
        Intrinsics.checkParameterIsNotNull(str2, "guideContent");
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo164997a(R.id.entryMore);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "entryMore");
        if (appCompatImageView.getVisibility() == 0) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            if (a.getGuideDependency().mo144594a(str)) {
                C45859k.m181686a(new RunnableC47003a(this, str, str2), 200);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MmInviteTitleBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo164998a(int i, int i2, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "onAction");
        if (i == 0) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo164997a(R.id.ivLeft);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivLeft");
            appCompatImageView.setVisibility(4);
            ((AppCompatImageView) mo164997a(R.id.ivLeft)).setOnClickListener(View$OnClickListenerC47004b.f118309a);
            return;
        }
        if (i2 != 0) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((AppCompatImageView) mo164997a(R.id.ivLeft)).setImageDrawable(UDIconUtils.getIconDrawable(context, i, i2));
        } else {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            ((AppCompatImageView) mo164997a(R.id.ivLeft)).setImageDrawable(UDIconUtils.getIconDrawable(context2, i));
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo164997a(R.id.ivLeft);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "ivLeft");
        C47110e.m186573a(appCompatImageView2, new C47005c(function0));
    }

    /* renamed from: a */
    public final void mo164999a(int i, int i2, Function1<? super View, Unit> function1) {
        if (i == 0) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo164997a(R.id.entryMore);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "entryMore");
            appCompatImageView.setVisibility(4);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo164997a(R.id.entryMore);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "entryMore");
            C47110e.m186573a(appCompatImageView2, C47006d.INSTANCE);
            return;
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) mo164997a(R.id.entryMore);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "entryMore");
        appCompatImageView3.setVisibility(0);
        if (i2 == 0) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            ((AppCompatImageView) mo164997a(R.id.entryMore)).setImageDrawable(UDIconUtils.getIconDrawable(context, i));
        } else {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            ((AppCompatImageView) mo164997a(R.id.entryMore)).setImageDrawable(UDIconUtils.getIconDrawable(context2, i, i2));
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) mo164997a(R.id.entryMore);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView4, "entryMore");
        C47110e.m186573a(appCompatImageView4, new C47007e(function1));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmInviteTitleBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m186073a();
    }

    /* renamed from: a */
    public static /* synthetic */ void m186074a(MmInviteTitleBar mmInviteTitleBar, int i, int i2, Function0 function0, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = ContextCompat.getColor(mmInviteTitleBar.getContext(), R.color.icon_n1);
            }
            mmInviteTitleBar.mo164998a(i, i2, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLeftAction");
    }

    /* renamed from: a */
    public static /* synthetic */ void m186075a(MmInviteTitleBar mmInviteTitleBar, int i, int i2, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                Context context = mmInviteTitleBar.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                i2 = UDColorUtils.getColor(context, R.color.icon_n1);
            }
            mmInviteTitleBar.mo164999a(i, i2, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRightAction");
    }
}
