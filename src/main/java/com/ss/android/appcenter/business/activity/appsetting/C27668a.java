package com.ss.android.appcenter.business.activity.appsetting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.activity.appsetting.a */
public class C27668a extends AbstractC28109a<LittleAppPermissionData, C28112d> {

    /* renamed from: a */
    private boolean[] f69116a;

    /* renamed from: b */
    private CompoundButton.OnCheckedChangeListener f69117b;

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m101084a(CompoundButton compoundButton, boolean z) {
        this.f69117b.onCheckedChanged(compoundButton, z);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public C28112d mo98307a(ViewGroup viewGroup, int i) {
        return new C28112d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.appcenter_appsetting_apppermission_layout, viewGroup, false));
    }

    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public void mo98309a(C28112d dVar, int i) {
        LittleAppPermissionData littleAppPermissionData = (LittleAppPermissionData) mo100065b(i);
        if (littleAppPermissionData != null) {
            dVar.mo100074a(R.id.app_permission_label, littleAppPermissionData.getName());
            ((UDSwitch) dVar.mo100072a(R.id.app_permission_switch)).setChecked(littleAppPermissionData.isGranted());
            ((UDSwitch) dVar.mo100072a(R.id.app_permission_switch)).setTag(littleAppPermissionData);
            if (i == getItemCount() - 1) {
                dVar.mo100072a(R.id.divider_fill).setVisibility(8);
            } else {
                dVar.mo100072a(R.id.divider_fill).setVisibility(0);
            }
            ((UDSwitch) dVar.mo100072a(R.id.app_permission_switch)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.android.appcenter.business.activity.appsetting.$$Lambda$a$mu9_Aw7s6OuOxaelWFRwe8iXYpg */

                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C27668a.this.m101084a((C27668a) compoundButton, (CompoundButton) z);
                }
            });
        }
    }

    public C27668a(Context context, List<LittleAppPermissionData> list, boolean[] zArr, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super(list);
        this.f69116a = zArr;
        this.f69117b = onCheckedChangeListener;
    }
}
