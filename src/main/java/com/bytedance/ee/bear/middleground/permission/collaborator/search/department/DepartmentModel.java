package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import android.content.Context;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.ExistMemberResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.ExistMemberUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.Member;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.SelectedUserChangeListener;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 72\u00020\u0001:\u00017B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140!2\u0006\u0010\"\u001a\u00020\u0014H\u0002J\u0018\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0016J\u0018\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00100\tj\b\u0012\u0004\u0012\u00020\u0010`\u000bH\u0016J\u0018\u0010%\u001a\u0012\u0012\u0004\u0012\u00020&0\tj\b\u0012\u0004\u0012\u00020&`\u000bH\u0016J\u001e\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140*H\u0016J\u0016\u0010+\u001a\u00020\u001b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140*H\u0002J\u0016\u0010,\u001a\u00020\u001b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00140*H\u0016J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u00101\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0010H\u0016J\u0010\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020&H\u0016J\u0010\u00104\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u00105\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u00106\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014`\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentModel;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/IDepartmentContract$IModel;", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "selectedUserModel", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/service/ServiceContext;Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/ISelectedUserModel;Ljava/util/ArrayList;Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;)V", "currentVisDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "depCache", "Ljava/util/HashMap;", "", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "Lkotlin/collections/HashMap;", "disposable", "Lio/reactivex/disposables/Disposable;", "offset", "", "addSelectedUser", "", "userInfo", "cancelRequest", "create", "destroy", "getExistMember", "Lio/reactivex/Flowable;", "department", "getOriginUsers", "getSelectedDeps", "getSelectedTopUsers", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "loadData", "visibleDepartment", "callback", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestCallback;", "loadFromNet", "loadMore", "registerChangeListener", "listener", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/SelectedUserChangeListener;", "removeSelectedUser", "transDepToUserInfo", "transTopUserToUserInfo", "visibleTopUserInDep", "transUserInfoToDep", "transUserInfoToTopUser", "unregisterChangeListener", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.c */
public final class DepartmentModel implements IDepartmentContract.IModel {

    /* renamed from: d */
    public static final Companion f26691d = new Companion(null);

    /* renamed from: a */
    public VisibleDepartment f26692a;

    /* renamed from: b */
    public int f26693b;

    /* renamed from: c */
    public final HashMap<String, Department> f26694c = new HashMap<>();

    /* renamed from: e */
    private Disposable f26695e;

    /* renamed from: f */
    private final Context f26696f;

    /* renamed from: g */
    private final C10917c f26697g;

    /* renamed from: h */
    private final ISelectedUserModel f26698h;

    /* renamed from: i */
    private final ArrayList<UserInfo> f26699i;

    /* renamed from: j */
    private final InviteMemberParams f26700j;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/DepartmentModel$Companion;", "", "()V", "COUNT", "", "DEP_API_PATH", "", "TAG", "VISIBLE_TYPE", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: a */
    public ArrayList<UserInfo> mo37588a() {
        return this.f26699i;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        m40991d();
    }

    /* renamed from: d */
    private final void m40991d() {
        Disposable disposable;
        Disposable disposable2 = this.f26695e;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.f26695e) != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: c */
    public ArrayList<VisibleTopUserInDep> mo37595c() {
        ArrayList<VisibleTopUserInDep> arrayList = new ArrayList<>();
        for (T t : this.f26698h.getSelected()) {
            if (t.getOwnerType() == 1 || t.getOwnerType() == 0) {
                arrayList.add(mo37592b((UserInfo) t));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: b */
    public ArrayList<VisibleDepartment> mo37593b() {
        ArrayList<VisibleDepartment> arrayList = new ArrayList<>();
        for (T t : this.f26698h.getSelected()) {
            if (t.getOwnerType() == 18) {
                arrayList.add(mo37584a((UserInfo) t));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "department", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.c$d */
    public static final class C9877d<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ DepartmentModel f26703a;

        C9877d(DepartmentModel cVar) {
            this.f26703a = cVar;
        }

        /* renamed from: a */
        public final AbstractC68307f<Department> apply(Department department) {
            Intrinsics.checkParameterIsNotNull(department, "department");
            return this.f26703a.mo37587a(department);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: a */
    public void mo37591a(SelectedUserChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f26698h.registerChangeListener(cVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: b */
    public void mo37594b(SelectedUserChangeListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f26698h.unregisterChangeListener(cVar);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: c */
    public void mo37596c(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f26698h.addUser(userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: d */
    public void mo37597d(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        this.f26698h.removeUser(userInfo);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.c$c */
    public static final class C9876c<T, R> implements Function<Throwable, Department> {

        /* renamed from: a */
        final /* synthetic */ Department f26702a;

        C9876c(Department department) {
            this.f26702a = department;
        }

        /* renamed from: a */
        public final Department apply(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            C13479a.m54758a("DepartmentModel", "getExistMember error: " + th);
            return this.f26702a;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.c$f */
    public static final class C9879f<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ AbstractC5204e f26706a;

        C9879f(AbstractC5204e eVar) {
            this.f26706a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54758a("DepartmentModel", "loadFromNet()...Failed: " + th);
            this.f26706a.mo20807a(th);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: a */
    public void mo37589a(AbstractC5204e<Department> eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        C13479a.m54764b("DepartmentModel", "loadMore()...");
        this.f26693b += 50;
        m40990b(eVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "existMemberResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/existmember/ExistMemberResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.c$b */
    public static final class C9875b<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ Department f26701a;

        C9875b(Department department) {
            this.f26701a = department;
        }

        /* renamed from: a */
        public final Department apply(ExistMemberResult existMemberResult) {
            Intrinsics.checkParameterIsNotNull(existMemberResult, "existMemberResult");
            C13479a.m54764b("DepartmentModel", "getExistMember(): " + existMemberResult.getExistMembers());
            ArrayList<Member> arrayList = new ArrayList<>();
            arrayList.addAll(existMemberResult.getExistMembers());
            this.f26701a.setExistsMembers(arrayList);
            return this.f26701a;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.c$e */
    public static final class C9878e<T> implements Consumer<Department> {

        /* renamed from: a */
        final /* synthetic */ DepartmentModel f26704a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5204e f26705b;

        C9878e(DepartmentModel cVar, AbstractC5204e eVar) {
            this.f26704a = cVar;
            this.f26705b = eVar;
        }

        /* renamed from: a */
        public final void accept(Department department) {
            C13479a.m54764b("DepartmentModel", "loadFromNet()...Succeed");
            this.f26705b.mo20806a(department);
            if (this.f26704a.f26693b == 0) {
                String b = this.f26704a.f26692a.mo37540b();
                Intrinsics.checkExpressionValueIsNotNull(department, "it");
                this.f26704a.f26694c.put(b, department);
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: a */
    public VisibleDepartment mo37584a(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        String id = userInfo.getId();
        String str = "";
        if (id == null) {
            id = str;
        }
        String name = userInfo.getName();
        if (name == null) {
            name = str;
        }
        String avatarUrl = userInfo.getAvatarUrl();
        if (avatarUrl != null) {
            str = avatarUrl;
        }
        return new VisibleDepartment(id, name, str);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: b */
    public VisibleTopUserInDep mo37592b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        String id = userInfo.getId();
        String str = "";
        if (id == null) {
            id = str;
        }
        String name = userInfo.getName();
        if (name == null) {
            name = str;
        }
        String avatarUrl = userInfo.getAvatarUrl();
        if (avatarUrl != null) {
            str = avatarUrl;
        }
        return new VisibleTopUserInDep(id, name, str);
    }

    /* renamed from: b */
    private final void m40990b(AbstractC5204e<Department> eVar) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/visible_department/");
        fVar.mo20145a("department_id", this.f26692a.mo37540b());
        fVar.mo20145a("visible_type", String.valueOf(3));
        fVar.mo20145a("offset", String.valueOf(this.f26693b));
        fVar.mo20145a("count", String.valueOf(50));
        fVar.mo20145a("need_paging", String.valueOf(true));
        fVar.mo20143a(2);
        this.f26695e = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new DepartmentParser()).mo20141a(fVar).mo238014c(new C9877d(this)).mo238001b(new C9878e(this, eVar), new C9879f(eVar));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: a */
    public UserInfo mo37585a(VisibleDepartment visibleDepartment) {
        Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
        UserInfo userInfo = new UserInfo();
        userInfo.setId(visibleDepartment.mo37540b());
        userInfo.setAvatarUrl(visibleDepartment.mo37542d());
        userInfo.setName(visibleDepartment.mo37541c());
        userInfo.setOwnerType(18);
        userInfo.setCan_modify_perm(true);
        return userInfo;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: a */
    public UserInfo mo37586a(VisibleTopUserInDep visibleTopUserInDep) {
        Intrinsics.checkParameterIsNotNull(visibleTopUserInDep, "visibleTopUserInDep");
        UserInfo userInfo = new UserInfo();
        userInfo.setId(visibleTopUserInDep.mo37552a());
        userInfo.setAvatarUrl(visibleTopUserInDep.mo37554c());
        userInfo.setName(visibleTopUserInDep.mo37553b());
        userInfo.setOwnerType(0);
        userInfo.setCan_modify_perm(true);
        return userInfo;
    }

    /* renamed from: a */
    public final AbstractC68307f<Department> mo37587a(Department department) {
        AbstractC68307f<ExistMemberResult> fVar;
        if (this.f26700j.mo36845i() || this.f26700j.mo36847k() || (department.getVisibleDepartments().size() == 0 && department.getVisibleTopUserInDep().size() == 0)) {
            AbstractC68307f<Department> a = AbstractC68307f.m265083a(department);
            Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.just(department)");
            return a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = department.getVisibleDepartments().iterator();
        while (it.hasNext()) {
            arrayList.add(new Member(18, it.next().mo37540b()));
        }
        Iterator<T> it2 = department.getVisibleTopUserInDep().iterator();
        while (it2.hasNext()) {
            arrayList.add(new Member(0, it2.next().mo37552a()));
        }
        int b = this.f26700j.mo36835b();
        C8275a aVar = C8275a.f22370c;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FOLDER");
        if (b == aVar.mo32555b()) {
            fVar = ExistMemberUtils.m40196a(this.f26700j.mo36834a(), this.f26700j.mo36845i(), arrayList);
        } else {
            fVar = ExistMemberUtils.m40195a(this.f26700j.mo36834a(), this.f26700j.mo36835b(), arrayList);
        }
        AbstractC68307f<Department> f = fVar.mo238020d(new C9875b(department)).mo238029f(new C9876c(department));
        Intrinsics.checkExpressionValueIsNotNull(f, "flowable\n               …artment\n                }");
        return f;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.department.IDepartmentContract.IModel
    /* renamed from: a */
    public void mo37590a(VisibleDepartment visibleDepartment, AbstractC5204e<Department> eVar) {
        Intrinsics.checkParameterIsNotNull(visibleDepartment, "visibleDepartment");
        Intrinsics.checkParameterIsNotNull(eVar, "callback");
        C13479a.m54764b("DepartmentModel", "loadData()...");
        m40991d();
        this.f26692a = visibleDepartment;
        this.f26693b = 0;
        Department department = this.f26694c.get(visibleDepartment.mo37540b());
        if (department != null) {
            C13479a.m54764b("DepartmentModel", "loadFromCache()...");
            eVar.mo20806a(department);
            return;
        }
        m40990b(eVar);
    }

    public DepartmentModel(Context context, C10917c cVar, ISelectedUserModel bVar, ArrayList<UserInfo> arrayList, InviteMemberParams inviteMemberParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(bVar, "selectedUserModel");
        Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
        Intrinsics.checkParameterIsNotNull(inviteMemberParams, "params");
        this.f26696f = context;
        this.f26697g = cVar;
        this.f26698h = bVar;
        this.f26699i = arrayList;
        this.f26700j = inviteMemberParams;
        this.f26692a = VisibleDepartment.f26659a.mo37549b(context);
    }
}
