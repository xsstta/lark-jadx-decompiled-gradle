package com.ss.android.lark.mm.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C22184b;
import com.google.android.material.bottomsheet.DialogC22179a;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/widget/BaseDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "TAG", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "show", "", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.widget.a */
public class BaseDialog extends C22184b {

    /* renamed from: c */
    private final String f118758c = "BaseBottomSheetDialog";

    /* renamed from: d */
    private HashMap f118759d;

    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f118759d == null) {
            this.f118759d = new HashMap();
        }
        View view = (View) this.f118759d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118759d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f118759d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.appcompat.app.C0261c, com.google.android.material.bottomsheet.C22184b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        Dialog a = super.mo946a(bundle);
        if (a != null) {
            DialogC22179a aVar = (DialogC22179a) a;
            aVar.setOnShowListener(new DialogInterface$OnShowListenerC47137a(aVar));
            return aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.a$a */
    static final class DialogInterface$OnShowListenerC47137a implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ DialogC22179a f118760a;

        DialogInterface$OnShowListenerC47137a(DialogC22179a aVar) {
            this.f118760a = aVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            FrameLayout frameLayout = (FrameLayout) this.f118760a.findViewById(R.id.design_bottom_sheet);
            if (frameLayout != null) {
                frameLayout.setBackground(null);
                BottomSheetBehavior b = BottomSheetBehavior.m79955b(frameLayout);
                Intrinsics.checkExpressionValueIsNotNull(b, "BottomSheetBehavior.from(bottomSheet)");
                b.mo76715c(false);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public void mo5511a(FragmentManager fragmentManager, String str) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "manager");
        if (fragmentManager.isStateSaved()) {
            C45855f.m181664c("BaseDialogFragment", "manager.isStateSaved()");
        } else {
            super.mo5511a(fragmentManager, str);
        }
    }
}
