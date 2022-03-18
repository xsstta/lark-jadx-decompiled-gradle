package com.ss.android.lark.profile.func.v3.userprofile.fields.listinfos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.profile.func.v3.userprofile.IBinderDependencyV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.department.DepartmentItemListDataSourceV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.department.DepartmentNameBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.department.DepartmentNameViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.department.IDepartmentItemDependencyV3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0016\b\u0000\u0010\u0001*\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u0002*\b\b\u0001\u0010\u0003*\u00020\u00052\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0006\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u0015B\r\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0007\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/listinfos/InfoListItemBinderV3;", "B", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "D", "Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/listinfos/InfoListDataSourceV3;", "itemBinder", "(Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;)V", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "bindData", "", "view", "Landroid/view/View;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isLast", "", "createViewHolder", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/listinfos/InfoListItemBinderV3$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "ViewHolder", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.h.d */
public final class InfoListItemBinderV3<B extends BaseInfoBinderV3<D, ? extends IBinderDependencyV3>, D extends BaseInfoViewDataV3> extends BaseInfoBinderV3<InfoListDataSourceV3<D>, IBinderDependencyV3> {

    /* renamed from: a */
    public final B f130562a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/listinfos/InfoListItemBinderV3$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.h.d$a */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoListItemBinderV3(B b) {
        super(b.mo180255b());
        Intrinsics.checkParameterIsNotNull(b, "itemBinder");
        this.f130562a = b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0016\b\u0000\u0010\u0002*\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\b\u0001\u0012\u00020\u00050\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00062\u000e\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "B", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoBinderV3;", "D", "Lcom/ss/android/lark/profile/func/v3/userprofile/IBinderDependencyV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.h.d$b */
    public static final class View$OnLongClickListenerC52789b implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ InfoListItemBinderV3 f130563a;

        /* renamed from: b */
        final /* synthetic */ String f130564b;

        View$OnLongClickListenerC52789b(InfoListItemBinderV3 dVar, String str) {
            this.f130563a = dVar;
            this.f130564b = str;
        }

        public final boolean onLongClick(View view) {
            ((IDepartmentItemDependencyV3) ((DepartmentNameBinderV3) this.f130563a.f130562a).mo180255b()).mo180260a(this.f130564b);
            return true;
        }
    }

    /* renamed from: b */
    public ViewHolder mo180235a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.info_list_item_v3_layout, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_info_value);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv");
        recyclerView.setAdapter(new InfoListItemAdapterV3(this.f130562a));
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
        return new ViewHolder(inflate);
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.IProfileBinderV3
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo180237a(View view, Object obj, boolean z) {
        mo180320a(view, (InfoListDataSourceV3) ((InfoListDataSourceV3) obj), z);
    }

    /* renamed from: a */
    public void mo180320a(View view, InfoListDataSourceV3<D> aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View findViewById = view.findViewById(R.id.tv_info_name);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tv_info_name)");
        mo180252a((TextView) findViewById, aVar.mo180254c());
        view.setOnClickListener(null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_info_value);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv");
        InfoListItemAdapterV3 bVar = (InfoListItemAdapterV3) recyclerView.getAdapter();
        if (bVar == null) {
            bVar = new InfoListItemAdapterV3(this.f130562a);
        }
        bVar.mo180317a(aVar.mo180257a());
        View findViewById2 = view.findViewById(R.id.line);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.line");
        mo180251a(findViewById2, z);
        if ((this.f130562a instanceof DepartmentNameBinderV3) && (aVar instanceof DepartmentItemListDataSourceV3)) {
            List<DepartmentNameViewDataV3> a = ((DepartmentItemListDataSourceV3) aVar).mo180257a();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo180259a());
            }
            String joinToString$default = CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null);
            if (!StringsKt.isBlank(joinToString$default)) {
                view.setOnLongClickListener(new View$OnLongClickListenerC52789b(this, joinToString$default));
            }
        }
    }
}
