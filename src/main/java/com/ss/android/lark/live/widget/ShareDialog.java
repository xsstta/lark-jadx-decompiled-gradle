package com.ss.android.lark.live.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C22184b;
import com.google.android.material.bottomsheet.DialogC22179a;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.live.p2140c.C41509a;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.lang.reflect.Field;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002&'B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0000¢\u0006\u0002\b%R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/live/widget/ShareDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "mBuilder", "Lcom/ss/android/lark/live/widget/ShareDialog$Builder;", "addCopyLinkIcon", "", "builder", "itemLayoutId", "", "addRefreshIcon", "addShareLinkIcon", "configViewByOrientation", "portrait", "", "getTheme", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setBuilder", "setBuilder$mm_release", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "show$mm_release", "Builder", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.live.d.a */
public final class ShareDialog extends C22184b {

    /* renamed from: c */
    public static final Companion f105530c = new Companion(null);

    /* renamed from: d */
    private Builder f105531d;

    /* renamed from: e */
    private HashMap f105532e;

    /* renamed from: a */
    public View mo149379a(int i) {
        if (this.f105532e == null) {
            this.f105532e = new HashMap();
        }
        View view = (View) this.f105532e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f105532e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: e */
    public int mo5515e() {
        return R.style.LiveShareDialogStyle;
    }

    /* renamed from: f */
    public void mo149382f() {
        HashMap hashMap = this.f105532e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo149382f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/live/widget/ShareDialog$Builder;", "", "()V", "copyLinkListener", "Landroid/view/View$OnClickListener;", "getCopyLinkListener", "()Landroid/view/View$OnClickListener;", "setCopyLinkListener", "(Landroid/view/View$OnClickListener;)V", "reloadListener", "getReloadListener", "setReloadListener", "shareLinkListener", "getShareLinkListener", "setShareLinkListener", "build", "Lcom/ss/android/lark/live/widget/ShareDialog;", "build$mm_release", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.d.a$a */
    public static final class Builder {

        /* renamed from: a */
        private View.OnClickListener f105533a;

        /* renamed from: b */
        private View.OnClickListener f105534b;

        /* renamed from: c */
        private View.OnClickListener f105535c;

        /* renamed from: a */
        public final View.OnClickListener mo149383a() {
            return this.f105533a;
        }

        /* renamed from: b */
        public final View.OnClickListener mo149385b() {
            return this.f105534b;
        }

        /* renamed from: c */
        public final View.OnClickListener mo149387c() {
            return this.f105535c;
        }

        /* renamed from: d */
        public final ShareDialog mo149389d() {
            ShareDialog aVar = new ShareDialog();
            aVar.mo149381a(this);
            return aVar;
        }

        /* renamed from: a */
        public final void mo149384a(View.OnClickListener onClickListener) {
            this.f105533a = onClickListener;
        }

        /* renamed from: b */
        public final void mo149386b(View.OnClickListener onClickListener) {
            this.f105534b = onClickListener;
        }

        /* renamed from: c */
        public final void mo149388c(View.OnClickListener onClickListener) {
            this.f105535c = onClickListener;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/live/widget/ShareDialog$Companion;", "", "()V", "TAG", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.d.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/ss/android/lark/live/widget/ShareDialog$onCreateDialog$bottomSheetDialog$1", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "onStart", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.d.a$g */
    public static final class DialogC41516g extends DialogC22179a {

        /* renamed from: c */
        final /* synthetic */ ShareDialog f105543c;

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.bottomsheet.DialogC22179a
        public void onStart() {
            super.onStart();
            BottomSheetBehavior<?> a = mo76733a();
            if (a != null) {
                a.mo76718d(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.DialogC22179a
        /* renamed from: a */
        public final BottomSheetBehavior<?> mo76733a() {
            Field[] declaredFields = DialogC22179a.class.getDeclaredFields();
            Intrinsics.checkExpressionValueIsNotNull(declaredFields, "BottomSheetDialog::class.java.declaredFields");
            for (Field field : declaredFields) {
                Intrinsics.checkExpressionValueIsNotNull(field, "it");
                if (BottomSheetBehavior.class.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    Object obj = field.get(this);
                    if (obj != null) {
                        return (BottomSheetBehavior) obj;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
                }
            }
            return null;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        DialogC41516g(ShareDialog aVar, Context context, int i) {
            super(context, i);
            this.f105543c = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/live/widget/ShareDialog$onViewCreated$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.d.a$h */
    static final class View$OnClickListenerC41517h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareDialog f105544a;

        View$OnClickListenerC41517h(ShareDialog aVar) {
            this.f105544a = aVar;
        }

        public final void onClick(View view) {
            this.f105544a.mo5513b();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f105531d == null) {
            mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/live/widget/ShareDialog$addCopyLinkIcon$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.d.a$c */
    public static final class C41512c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareDialog f105536a;

        /* renamed from: b */
        final /* synthetic */ Builder f105537b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            View.OnClickListener b = this.f105537b.mo149385b();
            if (b != null) {
                b.onClick(view);
            }
            this.f105536a.mo5513b();
        }

        C41512c(ShareDialog aVar, Builder aVar2) {
            this.f105536a = aVar;
            this.f105537b = aVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/live/widget/ShareDialog$addRefreshIcon$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.d.a$d */
    public static final class C41513d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareDialog f105538a;

        /* renamed from: b */
        final /* synthetic */ Builder f105539b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            View.OnClickListener c = this.f105539b.mo149387c();
            if (c != null) {
                c.onClick(view);
            }
            this.f105538a.mo5513b();
        }

        C41513d(ShareDialog aVar, Builder aVar2) {
            this.f105538a = aVar;
            this.f105539b = aVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/live/widget/ShareDialog$addShareLinkIcon$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.d.a$e */
    public static final class C41514e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareDialog f105540a;

        /* renamed from: b */
        final /* synthetic */ Builder f105541b;

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            View.OnClickListener a = this.f105541b.mo149383a();
            if (a != null) {
                a.onClick(view);
            }
            this.f105540a.mo5513b();
        }

        C41514e(ShareDialog aVar, Builder aVar2) {
            this.f105540a = aVar;
            this.f105541b = aVar2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow", "com/ss/android/lark/live/widget/ShareDialog$onCreateDialog$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.d.a$f */
    static final class DialogInterface$OnShowListenerC41515f implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ DialogC41516g f105542a;

        DialogInterface$OnShowListenerC41515f(DialogC41516g gVar) {
            this.f105542a = gVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            FrameLayout frameLayout = (FrameLayout) this.f105542a.findViewById(R.id.design_bottom_sheet);
            if (frameLayout != null) {
                frameLayout.setBackground(null);
            }
        }
    }

    /* renamed from: a */
    public final void mo149380a(FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "manager");
        fragmentManager.beginTransaction().remove(this).commit();
        super.mo5511a(fragmentManager, "ShareDialog");
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        boolean z = true;
        if (configuration.orientation != 1) {
            z = false;
        }
        m164746c(z);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.appcompat.app.C0261c, com.google.android.material.bottomsheet.C22184b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        DialogC41516g gVar = new DialogC41516g(this, requireContext(), mo5515e());
        gVar.setOnShowListener(new DialogInterface$OnShowListenerC41515f(gVar));
        Window window = gVar.getWindow();
        if (window != null) {
            window.setDimAmount(((float) Color.alpha(UIUtils.getColor(C45851c.m181646a(), R.color.bg_mask))) / 255.0f);
        }
        return gVar;
    }

    /* renamed from: c */
    private final void m164746c(boolean z) {
        if (z) {
            Context requireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            int a = (int) UDDimenUtils.m93308a(requireContext, 12);
            LinearLayout linearLayout = (LinearLayout) mo149379a(R.id.ll_root);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_root");
            int paddingTop = linearLayout.getPaddingTop();
            LinearLayout linearLayout2 = (LinearLayout) mo149379a(R.id.ll_root);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_root");
            ((LinearLayout) mo149379a(R.id.ll_root)).setPadding(a, paddingTop, a, linearLayout2.getPaddingBottom());
            LinearLayout linearLayout3 = (LinearLayout) mo149379a(R.id.ll_root);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "ll_root");
            linearLayout3.setDividerDrawable(UIUtils.getDrawable(C45851c.m181646a(), R.drawable.vc_divider_share_dialog_item));
            return;
        }
        Context requireContext2 = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext2, "requireContext()");
        int a2 = (int) UDDimenUtils.m93308a(requireContext2, 56);
        LinearLayout linearLayout4 = (LinearLayout) mo149379a(R.id.ll_root);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "ll_root");
        int paddingTop2 = linearLayout4.getPaddingTop();
        LinearLayout linearLayout5 = (LinearLayout) mo149379a(R.id.ll_root);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "ll_root");
        ((LinearLayout) mo149379a(R.id.ll_root)).setPadding(a2, paddingTop2, a2, linearLayout5.getPaddingBottom());
        LinearLayout linearLayout6 = (LinearLayout) mo149379a(R.id.ll_root);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "ll_root");
        linearLayout6.setDividerDrawable(UIUtils.getDrawable(C45851c.m181646a(), R.drawable.vc_divider_wide_share_dialog_item));
    }

    /* renamed from: a */
    public final void mo149381a(Builder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        Builder aVar2 = new Builder();
        aVar2.mo149384a(aVar.mo149383a());
        aVar2.mo149386b(aVar.mo149385b());
        aVar2.mo149388c(aVar.mo149387c());
        this.f105531d = aVar2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Builder aVar = this.f105531d;
        if (aVar != null) {
            m164745c(aVar, R.layout.vc_dialog_share_item);
            m164743a(aVar, R.layout.vc_dialog_share_item);
            m164744b(aVar, R.layout.vc_dialog_share_item);
            ((TextView) mo149379a(R.id.tv_cancel)).setOnClickListener(new View$OnClickListenerC41517h(this));
        }
        m164746c(!C41509a.m164737a(requireActivity()));
    }

    /* renamed from: a */
    private final void m164743a(Builder aVar, int i) {
        View inflate = getLayoutInflater().inflate(i, (ViewGroup) ((LinearLayout) mo149379a(R.id.ll_root)), false);
        int color = UIUtils.getColor(C45851c.m181646a(), R.color.icon_n1);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(requireContext, (int) R.drawable.ud_icon_link_copy_outlined, color);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "item");
        ((SquircleImageView) inflate.findViewById(R.id.iv_icon)).setImageDrawable(iconDrawable);
        TextView textView = (TextView) inflate.findViewById(R.id.text_icon_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "item.text_icon_name");
        textView.setText(getString(R.string.Common_G_FromView_CopyLink));
        inflate.setOnClickListener(new C41512c(this, aVar));
        ((LinearLayout) mo149379a(R.id.ll_root)).addView(inflate);
    }

    /* renamed from: b */
    private final void m164744b(Builder aVar, int i) {
        View inflate = getLayoutInflater().inflate(i, (ViewGroup) ((LinearLayout) mo149379a(R.id.ll_root)), false);
        int color = UIUtils.getColor(C45851c.m181646a(), R.color.icon_n1);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(requireContext, (int) R.drawable.ud_icon_refresh_outlined, color);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "item");
        ((SquircleImageView) inflate.findViewById(R.id.iv_icon)).setImageDrawable(iconDrawable);
        TextView textView = (TextView) inflate.findViewById(R.id.text_icon_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "item.text_icon_name");
        textView.setText(getString(R.string.Common_G_FromView_Refresh));
        inflate.setOnClickListener(new C41513d(this, aVar));
        ((LinearLayout) mo149379a(R.id.ll_root)).addView(inflate);
    }

    /* renamed from: c */
    private final void m164745c(Builder aVar, int i) {
        View inflate = getLayoutInflater().inflate(i, (ViewGroup) ((LinearLayout) mo149379a(R.id.ll_root)), false);
        int color = UIUtils.getColor(C45851c.m181646a(), R.color.icon_n1);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(requireContext, (int) R.drawable.ud_icon_forward_outlined, color);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "item");
        ((SquircleImageView) inflate.findViewById(R.id.iv_icon)).setImageDrawable(iconDrawable);
        TextView textView = (TextView) inflate.findViewById(R.id.text_icon_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "item.text_icon_name");
        textView.setText(getString(R.string.Common_G_FromView_ShareToChat));
        inflate.setOnClickListener(new C41514e(this, aVar));
        ((LinearLayout) mo149379a(R.id.ll_root)).addView(inflate);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.vc_dialog_share, viewGroup, false);
    }
}
