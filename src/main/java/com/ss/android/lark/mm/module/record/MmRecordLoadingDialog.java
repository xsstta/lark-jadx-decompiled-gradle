package com.ss.android.lark.mm.module.record;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0005H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/record/MmRecordLoadingDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "onDismissCallback", "Lkotlin/Function0;", "", "getOnDismissCallback", "()Lkotlin/jvm/functions/Function0;", "setOnDismissCallback", "(Lkotlin/jvm/functions/Function0;)V", "dismissAllowingStateLoss", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.b */
public final class MmRecordLoadingDialog extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: c */
    private Function0<Unit> f118023c;

    /* renamed from: d */
    private HashMap f118024d;

    /* renamed from: a */
    public View mo164642a(int i) {
        if (this.f118024d == null) {
            this.f118024d = new HashMap();
        }
        View view = (View) this.f118024d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118024d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public void mo164644g() {
        HashMap hashMap = this.f118024d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo164644g();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: b */
    public void mo5513b() {
        try {
            super.mo5513b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final Function0<Unit> mo164643f() {
        return this.f118023c;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        WindowManager.LayoutParams layoutParams = null;
        if (v_ != null) {
            window = v_.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.dimAmount = BitmapDescriptorFactory.HUE_RED;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.b$a */
    static final class C46872a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmRecordLoadingDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46872a(MmRecordLoadingDialog bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            Function0<Unit> f = this.this$0.mo164643f();
            if (f != null) {
                f.invoke();
            }
            this.this$0.u_();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Dialog v_ = v_();
        if (v_ != null) {
            v_.requestWindowFeature(1);
        }
        Dialog v_2 = v_();
        if (!(v_2 == null || (window = v_2.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo164642a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "crossIcon");
        C47110e.m186572a(appCompatImageView, UIUtils.dp2px(getContext(), 16.0f));
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo164642a(R.id.crossIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "crossIcon");
        C47110e.m186573a(appCompatImageView2, new C46872a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        mo5512a(false);
        return layoutInflater.inflate(R.layout.mm_record_loading_dialog, viewGroup, false);
    }
}
