package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.Member;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.util.p703f.C13664a;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004:;<=B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0017J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u000bJ\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0016J\u0012\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\"H\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"H\u0016J\u000e\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u0015J\u000e\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u0017J\u000e\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u0011J\u000e\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u000bJN\u00106\u001a\u00020\u001b2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f2\u0016\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00150\rj\b\u0012\u0004\u0012\u00020\u0015`\u000f2\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u00170\rj\b\u0012\u0004\u0012\u00020\u0017`\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\rj\b\u0012\u0004\u0012\u00020\u0015`\u000fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\rj\b\u0012\u0004\u0012\u00020\u0017`\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006>"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "userId", "", "canReAdd", "", "(Ljava/lang/String;Z)V", "getCanReAdd", "()Z", "department", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "existsUserList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/existmember/Member;", "Lkotlin/collections/ArrayList;", "itemClickListener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter$DepItemClickListener;", "originUserList", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "selectedDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "selectedDepTopUser", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "getUserId", "()Ljava/lang/String;", "addSelectedDep", "", "dep", "addSelectedTopUser", "topUser", "appendDepartment", "appendDep", "getItemCount", "", "getItemViewType", "position", "isCollaborator", "id", "isSelf", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeSelectedDep", "visibleDepartment", "removeSelectedTopUser", "visibleTopUserInDep", "setDepItemClickListener", "listener", "setDepartment", "newDepartment", "setOriginUsers", "originUsers", "selectedDeps", "selectedTopUsers", "Companion", "DepItemClickListener", "DepTopUserViewHolder", "DepViewHolder", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.a */
public final class DepartmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: d */
    public static final Companion f26666d = new Companion(null);

    /* renamed from: a */
    public final ArrayList<VisibleDepartment> f26667a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<VisibleTopUserInDep> f26668b = new ArrayList<>();

    /* renamed from: c */
    public DepItemClickListener f26669c;

    /* renamed from: e */
    private Department f26670e = new Department(null, null, false, null, 15, null);

    /* renamed from: f */
    private final ArrayList<UserInfo> f26671f = new ArrayList<>();

    /* renamed from: g */
    private final ArrayList<Member> f26672g = new ArrayList<>();

    /* renamed from: h */
    private final String f26673h;

    /* renamed from: i */
    private final boolean f26674i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter$DepItemClickListener;", "", "onDepItemClick", "", "department", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "isSelected", "", "onDepNextClick", "visibleDepartment", "onDepTopUserItemClick", "topUserInDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.a$b */
    public interface DepItemClickListener {
        /* renamed from: a */
        void mo37572a(VisibleDepartment visibleDepartment, boolean z);

        /* renamed from: a */
        void mo37573a(VisibleTopUserInDep visibleTopUserInDep, boolean z);

        /* renamed from: b */
        void mo37574b(VisibleDepartment visibleDepartment, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter$Companion;", "", "()V", "ALPHA_DISABLE", "", "ALPHA_ENABLE", "TAG", "", "TYPE_DEPARTMENT", "", "TYPE_TOP_USER_IN_DEP", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f26670e.getVisibleDepartments().size() + this.f26670e.getVisibleTopUserInDep().size();
    }

    /* renamed from: a */
    public final void mo37565a(DepItemClickListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f26669c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < this.f26670e.getVisibleDepartments().size()) {
            return 0;
        }
        return 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter$DepViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter;Landroid/view/View;)V", "bindViewHolder", "", "dep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "setEnable", "isCollaborator", "", "setNextEnable", "isSelected", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.a$d */
    public final class DepViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ DepartmentAdapter f26678a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.a$d$b */
        public static final class View$OnClickListenerC9874b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ DepViewHolder f26682a;

            /* renamed from: b */
            final /* synthetic */ boolean f26683b;

            /* renamed from: c */
            final /* synthetic */ VisibleDepartment f26684c;

            /* renamed from: d */
            final /* synthetic */ boolean f26685d;

            View$OnClickListenerC9874b(DepViewHolder dVar, boolean z, VisibleDepartment visibleDepartment, boolean z2) {
                this.f26682a = dVar;
                this.f26683b = z;
                this.f26684c = visibleDepartment;
                this.f26685d = z2;
            }

            public final void onClick(View view) {
                DepItemClickListener bVar;
                if (!this.f26683b && (bVar = this.f26682a.f26678a.f26669c) != null) {
                    bVar.mo37574b(this.f26684c, this.f26685d);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.a$d$a */
        public static final class View$OnClickListenerC9873a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ DepViewHolder f26679a;

            /* renamed from: b */
            final /* synthetic */ VisibleDepartment f26680b;

            /* renamed from: c */
            final /* synthetic */ boolean f26681c;

            View$OnClickListenerC9873a(DepViewHolder dVar, VisibleDepartment visibleDepartment, boolean z) {
                this.f26679a = dVar;
                this.f26680b = visibleDepartment;
                this.f26681c = z;
            }

            public final void onClick(View view) {
                View view2 = this.f26679a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                UDCheckBox uDCheckBox = (UDCheckBox) view2.findViewById(R.id.permDepCheckbox);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "itemView.permDepCheckbox");
                View view3 = this.f26679a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                UDCheckBox uDCheckBox2 = (UDCheckBox) view3.findViewById(R.id.permDepCheckbox);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox2, "itemView.permDepCheckbox");
                uDCheckBox.setChecked(!uDCheckBox2.isChecked());
                View view4 = this.f26679a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                UDCheckBox uDCheckBox3 = (UDCheckBox) view4.findViewById(R.id.permDepCheckbox);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox3, "itemView.permDepCheckbox");
                boolean isChecked = uDCheckBox3.isChecked();
                if (isChecked) {
                    this.f26679a.f26678a.f26667a.add(this.f26680b);
                } else {
                    this.f26679a.f26678a.f26667a.remove(this.f26680b);
                }
                this.f26679a.mo37578a(isChecked, this.f26681c, this.f26680b);
                DepItemClickListener bVar = this.f26679a.f26678a.f26669c;
                if (bVar != null) {
                    bVar.mo37572a(this.f26680b, isChecked);
                }
            }
        }

        /* renamed from: a */
        private final void m40984a(boolean z) {
            float f;
            boolean z2 = !z;
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.setEnabled(z2);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            UDCheckBox uDCheckBox = (UDCheckBox) view2.findViewById(R.id.permDepCheckbox);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "itemView.permDepCheckbox");
            uDCheckBox.setAlpha(f);
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            TextView textView = (TextView) view3.findViewById(R.id.permDepName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.permDepName");
            textView.setAlpha(f);
        }

        /* renamed from: a */
        public final void mo37577a(VisibleDepartment visibleDepartment) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(visibleDepartment, "dep");
            boolean a = this.f26678a.mo37567a(visibleDepartment.mo37540b());
            boolean contains = this.f26678a.f26667a.contains(visibleDepartment);
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.permDepName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.permDepName");
            textView.setText(visibleDepartment.mo37541c());
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            UDCheckBox uDCheckBox = (UDCheckBox) view2.findViewById(R.id.permDepCheckbox);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "itemView.permDepCheckbox");
            if (contains || a) {
                z = true;
            } else {
                z = false;
            }
            uDCheckBox.setChecked(z);
            mo37578a(contains, a, visibleDepartment);
            m40984a(a);
            this.itemView.setOnClickListener(new View$OnClickListenerC9873a(this, visibleDepartment, a));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DepViewHolder(DepartmentAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f26678a = aVar;
        }

        /* renamed from: a */
        public final void mo37578a(boolean z, boolean z2, VisibleDepartment visibleDepartment) {
            float f;
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            TextView textView = (TextView) view.findViewById(R.id.permDepNext);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.permDepNext");
            if (z || z2) {
                f = 0.3f;
            } else {
                f = 1.0f;
            }
            textView.setAlpha(f);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((TextView) view2.findViewById(R.id.permDepNext)).setOnClickListener(new View$OnClickListenerC9874b(this, z2, visibleDepartment, z));
        }
    }

    /* renamed from: a */
    public final void mo37562a(Department department) {
        Intrinsics.checkParameterIsNotNull(department, "newDepartment");
        this.f26670e.getVisibleDepartments().clear();
        this.f26670e.getVisibleTopUserInDep().clear();
        this.f26672g.clear();
        mo37568b(department);
    }

    /* renamed from: b */
    public final void mo37569b(VisibleDepartment visibleDepartment) {
        Intrinsics.checkParameterIsNotNull(visibleDepartment, "dep");
        if (!this.f26667a.contains(visibleDepartment)) {
            this.f26667a.add(visibleDepartment);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo37563a(VisibleDepartment visibleDepartment) {
        Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
        if (this.f26667a.contains(visibleDepartment)) {
            this.f26667a.remove(visibleDepartment);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo37570b(VisibleTopUserInDep visibleTopUserInDep) {
        Intrinsics.checkParameterIsNotNull(visibleTopUserInDep, "topUser");
        if (!this.f26668b.contains(visibleTopUserInDep)) {
            this.f26668b.add(visibleTopUserInDep);
            notifyDataSetChanged();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter$DepTopUserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentAdapter;Landroid/view/View;)V", "bindViewHolder", "", "topUserInDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "setEnable", "isCollaborator", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.a$c */
    public final class DepTopUserViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ DepartmentAdapter f26675a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.a$c$a */
        public static final class View$OnClickListenerC9872a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ DepTopUserViewHolder f26676a;

            /* renamed from: b */
            final /* synthetic */ VisibleTopUserInDep f26677b;

            View$OnClickListenerC9872a(DepTopUserViewHolder cVar, VisibleTopUserInDep visibleTopUserInDep) {
                this.f26676a = cVar;
                this.f26677b = visibleTopUserInDep;
            }

            public final void onClick(View view) {
                boolean z = !this.f26676a.f26675a.f26668b.contains(this.f26677b);
                View view2 = this.f26676a.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                UDCheckBox uDCheckBox = (UDCheckBox) view2.findViewById(R.id.permDepTopUserCheckbox);
                Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "itemView.permDepTopUserCheckbox");
                uDCheckBox.setChecked(z);
                if (z) {
                    this.f26676a.f26675a.f26668b.add(this.f26677b);
                } else {
                    this.f26676a.f26675a.f26668b.remove(this.f26677b);
                }
                DepItemClickListener bVar = this.f26676a.f26675a.f26669c;
                if (bVar != null) {
                    bVar.mo37573a(this.f26677b, z);
                }
            }
        }

        /* renamed from: a */
        private final void m40982a(boolean z) {
            float f;
            boolean z2 = !z;
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.setEnabled(z2);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            UDCheckBox uDCheckBox = (UDCheckBox) view2.findViewById(R.id.permDepTopUserCheckbox);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "itemView.permDepTopUserCheckbox");
            uDCheckBox.setAlpha(f);
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            UDAvatar uDAvatar = (UDAvatar) view3.findViewById(R.id.permDepTopUserAvatar);
            Intrinsics.checkExpressionValueIsNotNull(uDAvatar, "itemView.permDepTopUserAvatar");
            uDAvatar.setAlpha(f);
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            TextView textView = (TextView) view4.findViewById(R.id.permDepTopUserName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.permDepTopUserName");
            textView.setAlpha(f);
        }

        /* renamed from: a */
        public final void mo37575a(VisibleTopUserInDep visibleTopUserInDep) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(visibleTopUserInDep, "topUserInDep");
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            ((C2124f) ComponentCallbacks2C2115c.m9141a(this.itemView).mo10414a(new C13664a(visibleTopUserInDep.mo37554c())).mo11123a((int) R.drawable.facade_common_avatar_place_holder)).mo10399a((ImageView) ((UDAvatar) view.findViewById(R.id.permDepTopUserAvatar)));
            boolean z2 = false;
            if (this.f26675a.mo37571b(visibleTopUserInDep.mo37552a()) || this.f26675a.mo37567a(visibleTopUserInDep.mo37552a())) {
                z = true;
            } else {
                z = false;
            }
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(R.id.permDepTopUserName);
            Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.permDepTopUserName");
            textView.setText(visibleTopUserInDep.mo37553b());
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            UDCheckBox uDCheckBox = (UDCheckBox) view3.findViewById(R.id.permDepTopUserCheckbox);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "itemView.permDepTopUserCheckbox");
            if (this.f26675a.f26668b.contains(visibleTopUserInDep) || z) {
                z2 = true;
            }
            uDCheckBox.setChecked(z2);
            this.itemView.setOnClickListener(new View$OnClickListenerC9872a(this, visibleTopUserInDep));
            m40982a(z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DepTopUserViewHolder(DepartmentAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f26675a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo37564a(VisibleTopUserInDep visibleTopUserInDep) {
        Intrinsics.checkParameterIsNotNull(visibleTopUserInDep, "visibleTopUserInDep");
        if (this.f26668b.contains(visibleTopUserInDep)) {
            this.f26668b.remove(visibleTopUserInDep);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo37568b(Department department) {
        Intrinsics.checkParameterIsNotNull(department, "appendDep");
        if (department.getVisibleDepartments().size() > 0) {
            this.f26670e.getVisibleDepartments().addAll(department.getVisibleDepartments());
        }
        if (department.getVisibleTopUserInDep().size() > 0) {
            this.f26670e.getVisibleTopUserInDep().addAll(department.getVisibleTopUserInDep());
        }
        if (department.getExistsMembers().size() > 0) {
            this.f26672g.addAll(department.getExistsMembers());
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final boolean mo37571b(String str) {
        if (TextUtils.isEmpty(this.f26673h) || !TextUtils.equals(str, this.f26673h)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo37567a(String str) {
        if (this.f26674i) {
            return false;
        }
        if (!TextUtils.isEmpty(this.f26673h) && TextUtils.equals(str, this.f26673h)) {
            return true;
        }
        Iterator<T> it = this.f26671f.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next().getId())) {
                return true;
            }
        }
        Iterator<T> it2 = this.f26672g.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(str, it2.next().getMemberId())) {
                return true;
            }
        }
        return false;
    }

    public DepartmentAdapter(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        this.f26673h = str;
        this.f26674i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View inflate = from.inflate(R.layout.permission_dep_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new DepViewHolder(this, inflate);
        }
        View inflate2 = from.inflate(R.layout.permission_dep_top_user_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate2, "view");
        return new DepTopUserViewHolder(this, inflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof DepViewHolder) {
            VisibleDepartment visibleDepartment = this.f26670e.getVisibleDepartments().get(i);
            Intrinsics.checkExpressionValueIsNotNull(visibleDepartment, "department.visibleDepartments[position]");
            ((DepViewHolder) viewHolder).mo37577a(visibleDepartment);
        } else if (viewHolder instanceof DepTopUserViewHolder) {
            VisibleTopUserInDep visibleTopUserInDep = this.f26670e.getVisibleTopUserInDep().get(i - this.f26670e.getVisibleDepartments().size());
            Intrinsics.checkExpressionValueIsNotNull(visibleTopUserInDep, "department.visibleTopUserInDep[pos]");
            ((DepTopUserViewHolder) viewHolder).mo37575a(visibleTopUserInDep);
        }
    }

    /* renamed from: a */
    public final void mo37566a(ArrayList<UserInfo> arrayList, ArrayList<VisibleDepartment> arrayList2, ArrayList<VisibleTopUserInDep> arrayList3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
        Intrinsics.checkParameterIsNotNull(arrayList2, "selectedDeps");
        Intrinsics.checkParameterIsNotNull(arrayList3, "selectedTopUsers");
        this.f26671f.clear();
        ArrayList<UserInfo> arrayList4 = arrayList;
        if (!arrayList4.isEmpty()) {
            this.f26671f.addAll(arrayList4);
        }
        this.f26667a.clear();
        ArrayList<VisibleDepartment> arrayList5 = arrayList2;
        if (!arrayList5.isEmpty()) {
            this.f26667a.addAll(arrayList5);
        }
        this.f26668b.clear();
        ArrayList<VisibleTopUserInDep> arrayList6 = arrayList3;
        if (!arrayList6.isEmpty()) {
            this.f26668b.addAll(arrayList6);
        }
    }
}
