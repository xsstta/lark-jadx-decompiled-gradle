package com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.AbsItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IDepartmentDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.viewholder.DepartItemViewHolder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.p1756a.C35858b;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010&\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000bH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006)"}, d2 = {"Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/impl/DepartmentItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/AbsItemBinder;", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/viewholder/DepartItemViewHolder;", "selectDependency", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency;", "departmentDependency", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/IDepartmentDependency;", "clickHandler", "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;", "(Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/ISelectDependency;Lcom/ss/android/lark/contact/impl/department/detail/frame/list/binder/contact/IDepartmentDependency;Lcom/ss/android/lark/contact/impl/department/detail/frame/list/IItemOperationHandler;)V", "selectDepartmentEnable", "", "showCheckBox", "getShowCheckBox", "()Z", "showCheckBox$delegate", "Lkotlin/Lazy;", "bindAvatar", "", "avatarItemView", "Lcom/ss/android/lark/searchcommon/view/avataritem/AvatarItemView;", "bindCheckBox", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/contact/impl/department/detail/frame/list/DepartmentRecyclerViewItem;", "bindClick", "holder", "bindNormal", "bindTitle", "department", "Lcom/ss/android/lark/contact/entity/Department;", "bindViewHolder", "createViewHolder", "context", "Landroid/content/Context;", "enablePickDepartment", "getMemberCountResult", "", "interceptClick", "showConfirmDialog", "item", "select", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.c */
public final class DepartmentItemBinder extends AbsItemBinder<DepartItemViewHolder> {

    /* renamed from: a */
    public final boolean f92734a;

    /* renamed from: b */
    public final ISelectDependency f92735b;

    /* renamed from: c */
    public final AbstractC35856a f92736c;

    /* renamed from: d */
    private final Lazy f92737d = LazyKt.lazy(new C35865d(this));

    /* renamed from: e */
    private final IDepartmentDependency f92738e;

    /* renamed from: a */
    public final boolean mo132010a() {
        return ((Boolean) this.f92737d.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo132011a(Context context, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        int i = departmentRecyclerViewItem.isCollaboration() ? R.string.Lark_B2B_NoPermSelectDept : R.string.Lark_Groups_NoPermissionSelectDept;
        if (!m140480a(departmentRecyclerViewItem)) {
            LKUIToast.show(context, i);
            return true;
        } else if (this.f92735b.mo132001h()) {
            return false;
        } else {
            LKUIToast.show(context, i);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.c$d */
    static final class C35865d extends Lambda implements Function0<Boolean> {
        final /* synthetic */ DepartmentItemBinder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35865d(DepartmentItemBinder cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (!this.this$0.f92734a || !this.this$0.f92735b.mo131998e() || !this.this$0.f92735b.mo132001h()) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.c$a */
    public static final class C35862a extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ DepartmentRecyclerViewItem $data;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ DepartmentItemBinder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35862a(DepartmentItemBinder cVar, DepartmentRecyclerViewItem departmentRecyclerViewItem, Context context, boolean z) {
            super(1);
            this.this$0 = cVar;
            this.$data = departmentRecyclerViewItem;
            this.$context = context;
            this.$selected = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            boolean z;
            if (!this.this$0.mo132010a()) {
                AbstractC35856a aVar = this.this$0.f92736c;
                if (aVar != null) {
                    aVar.mo131891a(this.$data);
                    return;
                }
                return;
            }
            DepartmentItemBinder cVar = this.this$0;
            Context context = this.$context;
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            if (!cVar.mo132011a(context, this.$data)) {
                if (!this.$data.getDepartment().hasSubDepartments() || (z = this.$selected)) {
                    AbstractC35856a aVar2 = this.this$0.f92736c;
                    if (aVar2 != null) {
                        aVar2.mo131893a(this.$data, !this.$selected);
                        return;
                    }
                    return;
                }
                this.this$0.mo132008a(this.$context, this.$data, !z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.c$b */
    public static final class C35863b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ DepartmentRecyclerViewItem $data;
        final /* synthetic */ DepartmentItemBinder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35863b(DepartmentItemBinder cVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
            super(1);
            this.this$0 = cVar;
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
            AbstractC35856a aVar = this.this$0.f92736c;
            if (aVar != null) {
                aVar.mo131891a(this.$data);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.c$c */
    public static final class C35864c extends Lambda implements Function1<View, Unit> {
        public static final C35864c INSTANCE = new C35864c();

        C35864c() {
            super(1);
        }

        public final void invoke(View view) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public DepartItemViewHolder mo131989a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return DepartItemViewHolder.f92761d.mo132038a(context);
    }

    /* renamed from: a */
    private final void m140477a(AvatarItemView avatarItemView) {
        avatarItemView.mo184662a(((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88957a(R.drawable.icon_department_department_avatar)).mo88976k());
    }

    /* renamed from: a */
    private final String m140476a(Department department) {
        if (!department.isShowMemberCount()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((char) 65288);
        sb.append(department.getMemberCount());
        sb.append((char) 65289);
        return sb.toString();
    }

    /* renamed from: a */
    private final boolean m140480a(DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        if (departmentRecyclerViewItem.isCollaboration()) {
            return false;
        }
        if (departmentRecyclerViewItem.isCheckSelectPermission() && !departmentRecyclerViewItem.isSuperAdmin()) {
            Department department = departmentRecyclerViewItem.getDepartment();
            Intrinsics.checkExpressionValueIsNotNull(department, "data.department");
            if (department.isHasLeaderPermission()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.c$e */
    public static final class DialogInterface$OnClickListenerC35866e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC35866e f92739a = new DialogInterface$OnClickListenerC35866e();

        DialogInterface$OnClickListenerC35866e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.a.b.c$f */
    public static final class DialogInterface$OnClickListenerC35867f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DepartmentItemBinder f92740a;

        /* renamed from: b */
        final /* synthetic */ DepartmentRecyclerViewItem f92741b;

        /* renamed from: c */
        final /* synthetic */ boolean f92742c;

        DialogInterface$OnClickListenerC35867f(DepartmentItemBinder cVar, DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z) {
            this.f92740a = cVar;
            this.f92741b = departmentRecyclerViewItem;
            this.f92742c = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC35856a aVar = this.f92740a.f92736c;
            if (aVar != null) {
                aVar.mo131893a(this.f92741b, this.f92742c);
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: b */
    private final void m140481b(DepartItemViewHolder bVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        AvatarItemView a = bVar.mo132034a();
        Department department = departmentRecyclerViewItem.getDepartment();
        Intrinsics.checkExpressionValueIsNotNull(department, "data.department");
        a.mo184680b(false);
        m140477a(a);
        m140478a(a, department);
        m140482c(bVar, departmentRecyclerViewItem);
        m140479a(a, departmentRecyclerViewItem);
    }

    /* renamed from: a */
    private final void m140478a(AvatarItemView avatarItemView, Department department) {
        boolean z;
        String a = m140476a(department);
        String str = department.getName() + a;
        ArrayList arrayList = new ArrayList();
        if (a.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(a);
        }
        avatarItemView.mo184670a(new TitleModel(str, true, arrayList, R.color.text_placeholder));
    }

    /* renamed from: c */
    private final void m140482c(DepartItemViewHolder bVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        Department department = departmentRecyclerViewItem.getDepartment();
        ISelectDependency cVar = this.f92735b;
        Intrinsics.checkExpressionValueIsNotNull(department, "department");
        String id = department.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "department.id");
        boolean a = cVar.mo131997a(id, 1);
        AvatarItemView a2 = bVar.mo132034a();
        TextView b = bVar.mo132035b();
        Context context = a2.getContext();
        UDCheckBox uDCheckBox = (UDCheckBox) a2.findViewById(R.id.avatar_item_checkbox);
        C35858b.m140466a(a2, new C35862a(this, departmentRecyclerViewItem, context, a));
        uDCheckBox.setOnClickListener(null);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "checkBox");
        uDCheckBox.setClickable(false);
        if (!a) {
            C35858b.m140466a(b, new C35863b(this, departmentRecyclerViewItem));
            b.setTextColor(ContextCompat.getColor(context, R.color.lkui_B500));
            return;
        }
        C35858b.m140466a(b, C35864c.INSTANCE);
        b.setTextColor(ContextCompat.getColor(context, R.color.lkui_N400));
    }

    /* renamed from: a */
    private final void m140479a(AvatarItemView avatarItemView, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        if (!mo132010a()) {
            avatarItemView.mo184665a(new CheckBoxModel(false, false, false));
            return;
        }
        CheckBoxModel bVar = new CheckBoxModel();
        bVar.mo184707c(true);
        if (!m140480a(departmentRecyclerViewItem)) {
            bVar.mo184703a(false);
            bVar.mo184705b(false);
        } else {
            ISelectDependency cVar = this.f92735b;
            Department department = departmentRecyclerViewItem.getDepartment();
            Intrinsics.checkExpressionValueIsNotNull(department, "data.department");
            String id = department.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.department.id");
            bVar.mo184703a(cVar.mo131997a(id, 1));
        }
        avatarItemView.mo184665a(bVar);
    }

    /* renamed from: a */
    public void mo131990a(DepartItemViewHolder bVar, DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(departmentRecyclerViewItem, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (mo132010a()) {
            bVar.mo132037d();
        } else {
            bVar.mo132036c();
        }
        m140481b(bVar, departmentRecyclerViewItem);
    }

    public DepartmentItemBinder(ISelectDependency cVar, IDepartmentDependency aVar, AbstractC35856a aVar2) {
        Intrinsics.checkParameterIsNotNull(cVar, "selectDependency");
        Intrinsics.checkParameterIsNotNull(aVar, "departmentDependency");
        this.f92735b = cVar;
        this.f92738e = aVar;
        this.f92736c = aVar2;
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        this.f92734a = a.mo130150b().mo130208a("im_chat_create_group_by_groups_or_orgs");
    }

    /* renamed from: a */
    public final void mo132008a(Context context, DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z) {
        new C25639g(context).mo89254m(R.string.Lark_Group_SelectedMultipleDeptDialogTitle).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, DialogInterface$OnClickListenerC35866e.f92739a).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface$OnClickListenerC35867f(this, departmentRecyclerViewItem, z)).mo89233b().show();
    }
}
