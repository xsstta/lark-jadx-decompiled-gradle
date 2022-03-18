package com.ss.android.lark.profile.func.user_profile.infos.department;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.ui.ExpandTextView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u001d\u001eB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/department/DepartmentNameAdapter;", "Lcom/ss/android/lark/base/adapter/LarkRecyclerViewBaseAdapter;", "Lcom/ss/android/lark/profile/func/user_profile/infos/department/DepartmentNameViewHolder;", "Lcom/ss/android/lark/profile/func/user_profile/infos/department/DepartmentNameViewData;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mIsSpread", "", "mMaxLine", "", "bindNormalData", "", "holder", "position", "bindSpreadBtn", "getItemCount", "getItemId", "", "getItemViewType", "onBindViewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMaxLine", "maxLine", "setSpread", "spread", "Companion", "ViewType", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DepartmentNameAdapter extends LarkRecyclerViewBaseAdapter<DepartmentNameViewHolder, DepartmentNameViewData> {

    /* renamed from: b */
    public static final Companion f130288b = new Companion(null);

    /* renamed from: a */
    public boolean f130289a;

    /* renamed from: c */
    private int f130290c;

    /* renamed from: d */
    private final Context f130291d;

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/department/DepartmentNameAdapter$ViewType;", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface ViewType {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/department/DepartmentNameAdapter$Companion;", "", "()V", "NORMAL", "", "SPREAD_BTN", "USER_STATUS_MAX_TEXT_WIDTH", "USER_STATUS_TEXT_SIZE", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.department.DepartmentNameAdapter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public int getItemCount() {
        int size = this.items.size();
        int i = this.f130290c;
        if (size <= i || this.f130289a) {
            return size;
        }
        return i + 1;
    }

    /* renamed from: a */
    public final void mo179886a(boolean z) {
        this.f130289a = z;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.department.DepartmentNameAdapter$c */
    public static final class View$OnClickListenerC52637c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DepartmentNameAdapter f130294a;

        View$OnClickListenerC52637c(DepartmentNameAdapter departmentNameAdapter) {
            this.f130294a = departmentNameAdapter;
        }

        public final void onClick(View view) {
            ProfileHitPoint.m204717d();
            DepartmentNameAdapter departmentNameAdapter = this.f130294a;
            departmentNameAdapter.mo179886a(!departmentNameAdapter.f130289a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < this.f130290c || this.f130289a) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    private final void m203976a(DepartmentNameViewHolder eVar) {
        eVar.mo179894a().setVisibility(8);
        eVar.mo179895b().setVisibility(0);
        eVar.mo179896c().setText(R.string.Lark_Legacy_ProfileDetailDepartmentsMore);
        eVar.itemView.setOnClickListener(new View$OnClickListenerC52637c(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        String str;
        int i2;
        if (getItemViewType(i) != 0) {
            return (long) R.string.Lark_Legacy_ProfileDetailDepartmentsMore;
        }
        DepartmentNameViewData dVar = (DepartmentNameViewData) getItem(i);
        if (dVar != null) {
            str = dVar.mo179892a();
        } else {
            str = null;
        }
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return (long) i2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/profile/func/user_profile/infos/department/DepartmentNameAdapter$bindNormalData$1", "Lcom/ss/android/lark/ui/ExpandTextView$OnExpandStateChangeListener;", "onChangeStateStart", "", "willExpand", "", "onExpandStateChanged", "textView", "Landroid/widget/TextView;", "isExpanded", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.infos.department.DepartmentNameAdapter$b */
    public static final class C52636b implements ExpandTextView.AbstractC57572b {

        /* renamed from: a */
        final /* synthetic */ DepartmentNameAdapter f130292a;

        /* renamed from: b */
        final /* synthetic */ int f130293b;

        @Override // com.ss.android.lark.ui.ExpandTextView.AbstractC57572b
        /* renamed from: a */
        public void mo179888a(boolean z) {
        }

        C52636b(DepartmentNameAdapter departmentNameAdapter, int i) {
            this.f130292a = departmentNameAdapter;
            this.f130293b = i;
        }

        @Override // com.ss.android.lark.ui.ExpandTextView.AbstractC57572b
        /* renamed from: a */
        public void mo179887a(TextView textView, boolean z) {
            Intrinsics.checkParameterIsNotNull(textView, "textView");
            if (z) {
                Object item = this.f130292a.getItem(this.f130293b);
                if (item == null) {
                    Intrinsics.throwNpe();
                }
                String b = ((DepartmentNameViewData) item).mo179893b();
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                ProfileHitPoint.m204697a(b.length(), textView.getLineCount());
            }
        }
    }

    /* renamed from: a */
    public DepartmentNameViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f130291d).inflate(R.layout.department_name_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…name_item, parent, false)");
        return new DepartmentNameViewHolder(inflate);
    }

    /* renamed from: b */
    private final void m203977b(DepartmentNameViewHolder eVar, int i) {
        eVar.mo179894a().setVisibility(0);
        eVar.mo179894a().setOnExpandStateChangeListener(new C52636b(this, i));
        eVar.mo179895b().setVisibility(8);
        ExpandTextView a = eVar.mo179894a();
        Object item = getItem(i);
        if (item == null) {
            Intrinsics.throwNpe();
        }
        a.setText(((DepartmentNameViewData) item).mo179893b());
    }

    /* renamed from: a */
    public void onBindViewHolder(DepartmentNameViewHolder eVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        if (getItemViewType(i) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m203977b(eVar, i);
        } else {
            m203976a(eVar);
        }
    }
}
