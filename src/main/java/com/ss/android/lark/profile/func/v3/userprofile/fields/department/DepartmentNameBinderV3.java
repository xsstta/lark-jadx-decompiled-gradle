package com.ss.android.lark.profile.func.v3.userprofile.fields.department;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.listinfos.InfoListItemBinderV3;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.ui.ExpandTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/DepartmentNameBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/DepartmentNameViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/IDepartmentItemDependencyV3;", "dependency", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/IDepartmentItemDependencyV3;)V", "bindData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isLast", "", "createViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.d.b */
public final class DepartmentNameBinderV3 extends BaseInfoBinderV3<DepartmentNameViewDataV3, IDepartmentItemDependencyV3> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentNameBinderV3(IDepartmentItemDependencyV3 dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "dependency");
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3
    /* renamed from: a */
    public RecyclerView.ViewHolder mo180235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.department_name_item_v3, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
        return new InfoListItemBinderV3.ViewHolder(inflate);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/profile/func/v3/userprofile/fields/department/DepartmentNameBinderV3$bindData$1$1", "Lcom/ss/android/lark/ui/ExpandTextView$OnExpandStateChangeListener;", "onChangeStateStart", "", "willExpand", "", "onExpandStateChanged", "textView", "Landroid/widget/TextView;", "isExpanded", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.d.b$a */
    public static final class C52756a implements ExpandTextView.AbstractC57572b {

        /* renamed from: a */
        final /* synthetic */ DepartmentNameViewDataV3 f130496a;

        /* renamed from: b */
        final /* synthetic */ ExpandTextView f130497b;

        @Override // com.ss.android.lark.ui.ExpandTextView.AbstractC57572b
        /* renamed from: a */
        public void mo179888a(boolean z) {
        }

        C52756a(DepartmentNameViewDataV3 cVar, ExpandTextView expandTextView) {
            this.f130496a = cVar;
            this.f130497b = expandTextView;
        }

        @Override // com.ss.android.lark.ui.ExpandTextView.AbstractC57572b
        /* renamed from: a */
        public void mo179887a(TextView textView, boolean z) {
            int i;
            if (z) {
                String a = this.f130496a.mo180259a();
                if (a != null) {
                    i = a.length();
                } else {
                    i = 0;
                }
                ExpandTextView expandTextView = this.f130497b;
                Intrinsics.checkExpressionValueIsNotNull(expandTextView, "departmentNameTV");
                ProfileHitPoint.m204697a(i, expandTextView.getLineCount());
            }
        }
    }

    /* renamed from: a */
    public void mo180237a(View view, DepartmentNameViewDataV3 cVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(cVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ExpandTextView expandTextView = (ExpandTextView) view.findViewById(R.id.department_name_tv);
        expandTextView.setVisibility(0);
        expandTextView.setOnExpandStateChangeListener(new C52756a(cVar, expandTextView));
        expandTextView.setText(cVar.mo180259a());
    }
}
