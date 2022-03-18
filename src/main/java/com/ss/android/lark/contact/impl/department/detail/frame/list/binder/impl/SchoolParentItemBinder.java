package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.SchoolParent;
import com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.AbsItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder.SchoolParentItemHolder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.p1756a.C35858b;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/impl/SchoolParentItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/AbsItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/SchoolParentItemHolder;", "clickHandler", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;", "(Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;)V", "bindViewHolder", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem;", "createViewHolder", "context", "Landroid/content/Context;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.e */
public final class SchoolParentItemBinder extends AbsItemBinder<SchoolParentItemHolder> {

    /* renamed from: a */
    public final AbstractC35856a f92749a;

    public SchoolParentItemBinder() {
        this(null, 1, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.e$a */
    public static final class C35869a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ DepartmentRecyclerViewItem $data;
        final /* synthetic */ SchoolParentItemBinder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35869a(SchoolParentItemBinder eVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
            super(1);
            this.this$0 = eVar;
            this.$data = departmentRecyclerViewItem;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            AbstractC35856a aVar = this.this$0.f92749a;
            if (aVar != null) {
                aVar.mo131891a(this.$data);
            }
        }
    }

    public SchoolParentItemBinder(AbstractC35856a aVar) {
        this.f92749a = aVar;
    }

    /* renamed from: b */
    public SchoolParentItemHolder mo131989a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return SchoolParentItemHolder.f92773a.mo132049a(context);
    }

    /* renamed from: a */
    public void mo131990a(SchoolParentItemHolder eVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        Intrinsics.checkParameterIsNotNull(departmentRecyclerViewItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Department department = departmentRecyclerViewItem.getDepartment();
        if (department != null) {
            SchoolParent schoolParent = (SchoolParent) department;
            String name = schoolParent.getName();
            int activeParentCount = schoolParent.getActiveParentCount() + schoolParent.getInactiveParentsCount();
            eVar.mo132048b().setVisibility(8);
            String name2 = schoolParent.getName();
            if (Intrinsics.areEqual(name2, UIHelper.getString(R.string.Lark_Education_Student))) {
                TextView a = eVar.mo132047a();
                a.setText(name + " (" + schoolParent.getStudentCount() + ')');
            } else if (Intrinsics.areEqual(name2, UIHelper.getString(R.string.Lark_Education_ProfileParent))) {
                TextView a2 = eVar.mo132047a();
                a2.setText(name + " (" + activeParentCount + ')');
            } else if (Intrinsics.areEqual(name2, UIHelper.getString(R.string.Lark_Education_TeacherLabel))) {
                TextView a3 = eVar.mo132047a();
                a3.setText(name + " (" + schoolParent.getTeacherCount() + ')');
            } else {
                eVar.mo132047a().setText(name);
                String string = UIHelper.getString(R.string.Lark_Education_XStudentsYParents);
                int studentCount = schoolParent.getStudentCount();
                HashMap hashMap = new HashMap();
                hashMap.put("CountStudent", String.valueOf(studentCount));
                hashMap.put("CountParent", String.valueOf(activeParentCount));
                eVar.mo132048b().setText(UIHelper.mustacheFormat(string, hashMap));
                eVar.mo132048b().setVisibility(0);
            }
            View view = eVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            C35858b.m140466a(view, new C35869a(this, departmentRecyclerViewItem));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.contact.entity.SchoolParent");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SchoolParentItemBinder(AbstractC35856a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
