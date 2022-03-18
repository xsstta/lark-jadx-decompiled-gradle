package com.ss.android.lark.mm.module.player.speed;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0014¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/module/player/speed/PodCastSpeedPickerDialog;", "Lcom/ss/android/lark/mm/module/player/speed/SpeedPickerDialog;", "isSilenceEnabled", "", "host", "", "objectToken", "mSpeed", "", "toolbarListener", "Lcom/ss/android/lark/mm/module/player/speed/SpeedPickerDialog$ISpeedPickerDepend;", "(ZLjava/lang/String;Ljava/lang/String;FLcom/ss/android/lark/mm/module/player/speed/SpeedPickerDialog$ISpeedPickerDepend;)V", "getLayoutRes", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.speed.a */
public final class PodCastSpeedPickerDialog extends SpeedPickerDialog {

    /* renamed from: e */
    private HashMap f117522e;

    @Override // com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog, com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f117522e == null) {
            this.f117522e = new HashMap();
        }
        View view = (View) this.f117522e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f117522e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog, com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f117522e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog
    /* renamed from: g */
    public int mo164088g() {
        return R.layout.mm_dialog_pod_cast_speed;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PodCastSpeedPickerDialog(boolean z, String str, String str2, float f, SpeedPickerDialog.ISpeedPickerDepend aVar) {
        super(z, str2, f, aVar);
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "objectToken");
        Intrinsics.checkParameterIsNotNull(aVar, "toolbarListener");
    }
}
