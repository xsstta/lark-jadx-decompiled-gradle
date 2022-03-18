package com.ss.android.lark.contact.impl.department.detail;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.bytedance.lark.pb.contact.v1.CollaborationTenant;
import com.bytedance.lark.pb.contact.v1.GetCollaborationStructureResponse;
import com.bytedance.lark.pb.contact.v1.GetCollaborationTenantResponse;
import com.bytedance.lark.pb.im.v1.CheckChattersInChatRequest;
import com.bytedance.lark.pb.im.v1.CheckChattersInChatResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.dto.C35394e;
import com.ss.android.lark.contact.dto.DepartmentStructureResponse;
import com.ss.android.lark.contact.dto.SchoolContactStructureResponse;
import com.ss.android.lark.contact.entity.ChatInfo;
import com.ss.android.lark.contact.entity.ChatterTagInfo;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.DepartmentStructure;
import com.ss.android.lark.contact.entity.EduRoleType;
import com.ss.android.lark.contact.entity.SchoolParent;
import com.ss.android.lark.contact.entity.VirtualNodeType;
import com.ss.android.lark.contact.impl.department.detail.C35841e;
import com.ss.android.lark.contact.impl.department.detail.frame.C35850a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.contact.impl.entity.ExternalContact;
import com.ss.android.lark.contact.impl.interfaces.AbstractC35936a;
import com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal;
import com.ss.android.lark.contact.impl.interfaces.ISchoolServiceInternal;
import com.ss.android.lark.contact.impl.p1747b.C35497a;
import com.ss.android.lark.contact.impl.p1760e.C35876b;
import com.ss.android.lark.contact.impl.p1761f.C35906e;
import com.ss.android.lark.contact.impl.p1761f.C35917f;
import com.ss.android.lark.contact.impl.p1761f.C35929i;
import com.ss.android.lark.contact.impl.service.SchoolParentService;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.member_manage.export.p2253a.C44897b;
import com.ss.android.lark.pb.role.GetAdminPermissionInfoResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.UIHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.contact.impl.department.detail.c */
public class C35821c extends BaseModel implements C35841e.AbstractC35842a {

    /* renamed from: A */
    private Bundle f92608A;

    /* renamed from: B */
    private Bundle f92609B;

    /* renamed from: C */
    private DepartmentStructure f92610C = new DepartmentStructure();

    /* renamed from: D */
    private String f92611D = "";

    /* renamed from: E */
    private boolean f92612E;

    /* renamed from: F */
    private String f92613F = "";

    /* renamed from: G */
    private boolean f92614G = false;

    /* renamed from: H */
    private boolean f92615H;

    /* renamed from: I */
    private boolean f92616I = false;

    /* renamed from: J */
    private boolean f92617J = true;

    /* renamed from: K */
    private boolean f92618K;

    /* renamed from: L */
    private final boolean f92619L;

    /* renamed from: M */
    private boolean f92620M = false;

    /* renamed from: N */
    private String f92621N = C35358a.m138143a().mo130163h().mo130231c();

    /* renamed from: O */
    private String f92622O = C35358a.m138143a().mo130163h().mo130232d();

    /* renamed from: P */
    private boolean f92623P;

    /* renamed from: Q */
    private boolean f92624Q;

    /* renamed from: R */
    private boolean f92625R;

    /* renamed from: S */
    private C35394e.AbstractC35395a f92626S;

    /* renamed from: T */
    private C35394e.AbstractC35396b f92627T;

    /* renamed from: a */
    AbstractC35361b.AbstractC35367f f92628a = C35358a.m138143a().mo130165j();

    /* renamed from: b */
    AbstractC35361b.AbstractC35376o f92629b = C35358a.m138143a().mo130163h();

    /* renamed from: c */
    AbstractC35361b.AbstractC35379r f92630c = C35358a.m138143a().mo130167l();

    /* renamed from: d */
    AbstractC35361b.AbstractC35382u f92631d = C35358a.m138143a().mo130156d();

    /* renamed from: e */
    IDepartmentServiceInternal f92632e = C35917f.m140749a();

    /* renamed from: f */
    ISchoolServiceInternal f92633f = SchoolParentService.f92889a.mo132192a();

    /* renamed from: g */
    AbstractC35936a f92634g = C35906e.m140678a();

    /* renamed from: h */
    public C35841e.AbstractC35842a.AbstractC35843a f92635h;

    /* renamed from: i */
    public String f92636i;

    /* renamed from: j */
    public DepartmentStructure f92637j = new DepartmentStructure();

    /* renamed from: k */
    public DepartmentStructure f92638k = new DepartmentStructure();

    /* renamed from: l */
    public DepartmentStructure f92639l = new DepartmentStructure();

    /* renamed from: m */
    public String f92640m = "";

    /* renamed from: n */
    public String f92641n = "";

    /* renamed from: o */
    public boolean f92642o = true;

    /* renamed from: p */
    public int f92643p = 0;

    /* renamed from: q */
    public int f92644q = 1;

    /* renamed from: r */
    public String f92645r = "";

    /* renamed from: s */
    public String f92646s = "";

    /* renamed from: t */
    public boolean f92647t = false;

    /* renamed from: u */
    public final AtomicBoolean f92648u = new AtomicBoolean(false);

    /* renamed from: v */
    public int f92649v = 100;

    /* renamed from: w */
    public final ArrayList<Integer> f92650w;

    /* renamed from: x */
    public final List<Integer> f92651x;

    /* renamed from: y */
    private String f92652y;

    /* renamed from: z */
    private String f92653z;

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a
    /* renamed from: b */
    public boolean mo131818b() {
        return this.f92642o;
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a
    /* renamed from: d */
    public DepartmentStructure mo131820d() {
        return this.f92638k;
    }

    /* renamed from: a */
    public void mo131814a(String str, String str2) {
        this.f92652y = str;
        this.f92653z = str;
        this.f92636i = str2;
        if (!this.f92618K) {
            mo131807a();
        } else if ("0".equals(str)) {
            m140277b(this.f92653z);
        } else {
            m140271a(this.f92653z);
        }
    }

    /* renamed from: a */
    public void mo131816a(String str, String str2, String str3) {
        this.f92653z = str;
        this.f92636i = str2;
        this.f92618K = true;
        this.f92646s = str3;
        if ("0".equals(str)) {
            m140277b(this.f92653z);
        } else {
            m140271a(this.f92653z);
        }
    }

    /* renamed from: a */
    public void mo131807a() {
        if (this.f92619L) {
            this.f92652y = "-2";
        }
        if (!TextUtils.isEmpty(this.f92652y)) {
            m140273a(this.f92652y, this.f92636i, (String) null, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<DepartmentStructure>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass14 */

                /* renamed from: a */
                public void onSuccess(DepartmentStructure departmentStructure) {
                    C35821c.this.f92635h.mo131841a(C35821c.this.mo131806a(departmentStructure));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("DepartmentDetailModel", errorResult.toString());
                }
            }));
        }
    }

    /* renamed from: a */
    public C35850a mo131806a(DepartmentStructure departmentStructure) {
        C35850a aVar = new C35850a();
        aVar.mo131896a(departmentStructure.getDepartment());
        aVar.mo131897a(m140281c(m140275b(departmentStructure)));
        aVar.mo131899a(departmentStructure.getInChatChatterIds());
        aVar.mo131902b(departmentStructure.getDenyInviteChatterIds());
        aVar.mo131898a(departmentStructure.getDeniedReasons());
        aVar.mo131901b(departmentStructure.getEnterpriseEmails());
        return aVar;
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a
    /* renamed from: a */
    public void mo131811a(final Department department, final IGetDataCallback<C35850a> iGetDataCallback) {
        m140273a(department.getId(), this.f92636i, department.getParentId(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<DepartmentStructure>() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass19 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(DepartmentStructure departmentStructure) {
                if (departmentStructure.getDepartment() == null) {
                    departmentStructure.setDepartment(department);
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(C35821c.this.mo131806a(departmentStructure));
                }
            }
        }));
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a
    /* renamed from: a */
    public void mo131815a(String str, String str2, int i, boolean z, final IGetDataCallback<C35850a> iGetDataCallback) {
        this.f92644q = i;
        this.f92613F = str2;
        this.f92614G = z;
        this.f92612E = z;
        if (TextUtils.isEmpty(str) && z && (this.f92638k.getDepartment() instanceof SchoolParent)) {
            this.f92641n = str;
            List<SchoolParent> childNodes = ((SchoolParent) this.f92638k.getDepartment()).getChildNodes();
            if (childNodes != null && childNodes.size() > 0) {
                m140274a(childNodes, str2, iGetDataCallback);
            }
        } else if (TextUtils.isEmpty(str) || "0".equals(str)) {
            if (!TextUtils.equals(this.f92641n, str)) {
                this.f92641n = str;
                this.f92643p = 0;
            }
            m140286e(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<DepartmentStructure>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35821c.C358232 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(DepartmentStructure departmentStructure) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(C35821c.this.mo131806a(departmentStructure));
                    }
                }
            }));
        } else {
            m140278b(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<DepartmentStructure>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35821c.C358243 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(DepartmentStructure departmentStructure) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(C35821c.this.mo131806a(departmentStructure));
                    }
                }
            }));
        }
    }

    /* renamed from: a */
    private void m140274a(List<SchoolParent> list, String str, final IGetDataCallback<C35850a> iGetDataCallback) {
        DepartmentStructure departmentStructure = new DepartmentStructure();
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).getName())) {
                departmentStructure.setDepartment(list.get(i));
                List<Chatter> users = list.get(i).getUsers();
                if (TextUtils.isEmpty(this.f92636i) || users == null || users.size() == 0) {
                    iGetDataCallback.onSuccess(mo131806a(departmentStructure));
                } else {
                    mo131808a(2, departmentStructure, users, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<DepartmentStructure>() {
                        /* class com.ss.android.lark.contact.impl.department.detail.C35821c.C358254 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            IGetDataCallback iGetDataCallback = iGetDataCallback;
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onError(errorResult);
                            }
                        }

                        /* renamed from: a */
                        public void onSuccess(DepartmentStructure departmentStructure) {
                            IGetDataCallback iGetDataCallback = iGetDataCallback;
                            if (iGetDataCallback != null) {
                                iGetDataCallback.onSuccess(C35821c.this.mo131806a(departmentStructure));
                            }
                        }
                    }));
                }
            }
        }
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a
    /* renamed from: a */
    public void mo131813a(String str, IGetDataCallback<Chat> iGetDataCallback) {
        this.f92628a.mo130204b(str, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a
    /* renamed from: a */
    public void mo131810a(Context context, String str, AbstractC44896a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f92621N);
        C35358a.m138143a().mo130171p().mo130209a(context, str, arrayList, (AbstractC44896a) getCallbackManager().wrapAndAddCallback(new C44897b(aVar)));
    }

    /* renamed from: a */
    private void m140273a(String str, String str2, String str3, IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        if (!TextUtils.equals(this.f92640m, str)) {
            this.f92640m = str;
            this.f92641n = str;
            this.f92643p = 0;
            this.f92649v = 100;
        }
        this.f92642o = false;
        if ("-1".equals(str)) {
            m140282c(str2, iGetDataCallback);
        } else if (this.f92619L) {
            if ("-2".equals(str)) {
                m140276b(iGetDataCallback);
            } else {
                m140279b(str3, str, iGetDataCallback);
            }
        } else if (!"0".equals(str) || !this.f92624Q) {
            m140272a(str, str2, iGetDataCallback);
        } else {
            m140269a(iGetDataCallback);
        }
    }

    /* renamed from: a */
    public void mo131808a(final int i, final DepartmentStructure departmentStructure, List<Chatter> list, final IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        final ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(list.get(i2).getId());
        }
        m140280b(arrayList, this.f92636i, new IGetDataCallback<Map<String, Boolean>>() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.C358309 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(Map<String, Boolean> map) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (map != null && map.containsKey(arrayList.get(i)) && map.get(arrayList.get(i)).booleanValue()) {
                        arrayList.add(arrayList.get(i));
                    }
                }
                C35821c.this.f92638k.reset(departmentStructure, arrayList, null, null, null);
                C35821c.this.f92632e.mo132178a(C35821c.this.f92638k, UIHelper.getString(R.string.Lark_Education_SchoolParentContacts));
                if (i == 2 && departmentStructure.getDepartment() != null && !TextUtils.isEmpty(C35821c.this.f92646s) && C35821c.this.f92644q == 1) {
                    String name = departmentStructure.getDepartment().getName();
                    Department department = departmentStructure.getDepartment();
                    department.setName(C35821c.this.f92646s + "-" + name);
                }
                iGetDataCallback.onSuccess(C35821c.this.f92638k);
            }
        });
    }

    /* renamed from: a */
    public void mo131809a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Log.m165383e("DepartmentDetailModel", "onManageClicked failed, url = " + str);
            return;
        }
        String str2 = str + this.f92640m;
        Log.m165389i("DepartmentDetailModel", "onManageClicked, url = " + str2);
        C35358a.m138143a().mo130160f().mo130192a(context, str2);
        ContactHitPoint.m140793b(TextUtils.equals("0", this.f92640m));
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a
    /* renamed from: e */
    public void mo131821e() {
        this.f92643p = 0;
        this.f92649v = 100;
        mo131819c();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f92635h = null;
        this.f92630c.mo130248b(this.f92626S);
        this.f92630c.mo130249b(this.f92627T);
    }

    /* renamed from: f */
    public String mo131822f() {
        String b = this.f92631d.mo130258b();
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        return UIHelper.getString(R.string.Lark_Legacy_StructureDepartments);
    }

    /* renamed from: g */
    private void m140287g() {
        Bundle bundle = this.f92609B;
        if (bundle != null) {
            this.f92652y = bundle.getString("department_id");
            this.f92636i = this.f92609B.getString("chat_id");
        }
        if (TextUtils.isEmpty(this.f92652y)) {
            this.f92652y = this.f92608A.getString("department_id");
            this.f92636i = this.f92608A.getString("chat_id");
        }
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a
    /* renamed from: c */
    public void mo131819c() {
        if (this.f92618K) {
            mo131815a(this.f92641n, this.f92613F, this.f92644q, this.f92612E, new IGetDataCallback<C35850a>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass17 */

                /* renamed from: a */
                public void onSuccess(C35850a aVar) {
                    C35821c.this.f92635h.mo131842b(aVar);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C35841e.AbstractC35842a.AbstractC35843a aVar = C35821c.this.f92635h;
                    C35821c cVar = C35821c.this;
                    aVar.mo131842b(cVar.mo131806a(cVar.f92638k));
                }
            });
        } else {
            m140273a(this.f92640m, this.f92636i, (String) null, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<DepartmentStructure>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass18 */

                /* renamed from: a */
                public void onSuccess(DepartmentStructure departmentStructure) {
                    C35821c.this.f92635h.mo131842b(C35821c.this.mo131806a(departmentStructure));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C35841e.AbstractC35842a.AbstractC35843a aVar = C35821c.this.f92635h;
                    C35821c cVar = C35821c.this;
                    aVar.mo131842b(cVar.mo131806a(cVar.f92638k));
                }
            }));
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m140287g();
        if (this.f92618K) {
            if ("0".equals(this.f92653z)) {
                m140277b(this.f92653z);
            } else {
                m140271a(this.f92653z);
            }
        } else if (this.f92616I) {
            C35917f.m140749a().mo132182b(new UIGetDataCallback(new IGetDataCallback<GetAdminPermissionInfoResponse>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass13 */

                /* renamed from: a */
                public void onSuccess(GetAdminPermissionInfoResponse getAdminPermissionInfoResponse) {
                    boolean z;
                    AtomicBoolean atomicBoolean = C35821c.this.f92648u;
                    if (getAdminPermissionInfoResponse == null || !getAdminPermissionInfoResponse.misSuperAdministrator.booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    atomicBoolean.set(z);
                    C35821c.this.mo131807a();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C35821c.this.mo131807a();
                    Log.m165383e("DepartmentDetailModel", "getAdminPermissionInfo failed: " + errorResult.toString());
                }
            }));
        } else {
            mo131807a();
        }
        this.f92630c.mo130246a(this.f92626S);
        this.f92630c.mo130247a(this.f92627T);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35842a
    /* renamed from: a */
    public void mo131812a(C35841e.AbstractC35842a.AbstractC35843a aVar) {
        this.f92635h = aVar;
    }

    /* renamed from: a */
    public void mo131817a(boolean z) {
        this.f92625R = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Map m140267a(byte[] bArr) throws IOException {
        return CheckChattersInChatResponse.ADAPTER.decode(bArr).chatters;
    }

    /* renamed from: a */
    private DepartmentRecyclerViewItem m140265a(DepartmentRecyclerViewItem.Type type) {
        DepartmentRecyclerViewItem departmentRecyclerViewItem = new DepartmentRecyclerViewItem(type);
        departmentRecyclerViewItem.setCollaboration(this.f92619L);
        departmentRecyclerViewItem.setCheckSelectPermission(this.f92623P);
        departmentRecyclerViewItem.setSuperAdmin(this.f92648u.get());
        return departmentRecyclerViewItem;
    }

    /* renamed from: b */
    private void m140276b(final IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        this.f92649v = 100;
        this.f92642o = false;
        this.f92632e.mo132176a(this.f92643p, 100, new UIGetDataCallback(new IGetDataCallback<GetCollaborationTenantResponse>() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass10 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (TextUtils.equals(C35821c.this.f92640m, "-2")) {
                    C35821c.this.f92642o = true;
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetCollaborationTenantResponse getCollaborationTenantResponse) {
                boolean z;
                if (getCollaborationTenantResponse != null) {
                    DepartmentStructure departmentStructure = new DepartmentStructure();
                    Department department = new Department();
                    department.setId("-2");
                    department.setName(UIHelper.getString(R.string.Lark_B2B_TrustedParties));
                    departmentStructure.setDepartment(department);
                    if (getCollaborationTenantResponse.tenants != null) {
                        ArrayList arrayList = new ArrayList();
                        for (CollaborationTenant collaborationTenant : getCollaborationTenantResponse.tenants) {
                            Department department2 = new Department();
                            department2.setId(collaborationTenant.tenant_id);
                            department2.setName(collaborationTenant.tenant_name);
                            department2.setMemberCount(collaborationTenant.tenant_user_count.intValue());
                            department2.setParentId("-2");
                            arrayList.add(department2);
                        }
                        departmentStructure.setSubDepartments(arrayList);
                    }
                    departmentStructure.setHasMore(getCollaborationTenantResponse.has_more.booleanValue());
                    if (C35821c.this.f92643p == 0) {
                        C35821c.this.f92637j.reset(departmentStructure, null, null, null, null);
                        C35821c.this.f92632e.mo132178a(C35821c.this.f92637j, UIHelper.getString(R.string.Lark_B2B_TrustedParties));
                    } else {
                        C35821c.this.f92637j.append(departmentStructure.getSubDepartments(), departmentStructure.getUsers(), null, null, null, departmentStructure.getSectionMap(), departmentStructure.getDutyMap(), null);
                        C35821c.this.f92637j.setChatInfo(departmentStructure.getChatInfo());
                    }
                    iGetDataCallback.onSuccess(C35821c.this.f92637j);
                    C35821c cVar = C35821c.this;
                    if (departmentStructure.isHasMoreDepartment() || departmentStructure.isHasMore()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f92642o = z;
                    if (!departmentStructure.isHasMoreDepartment()) {
                        C35821c.this.f92649v = 100;
                    }
                    C35821c cVar2 = C35821c.this;
                    cVar2.f92643p = cVar2.f92637j.getSubDepartments().size() + C35821c.this.f92637j.getUsers().size();
                    return;
                }
                onError(new ErrorResult(-1, "GetCollaborationTenantResponse is null"));
            }
        }));
    }

    /* renamed from: c */
    private boolean m140283c(String str) {
        Chat b = C35358a.m138143a().mo130165j().mo130203b(str);
        if (b != null) {
            return b.isCrossTenant();
        }
        return false;
    }

    /* renamed from: a */
    private List<Chatter> m140266a(List<Chatter> list) {
        if (!CollectionUtils.isEmpty(list) && this.f92615H) {
            Chatter chatter = null;
            Iterator<Chatter> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Chatter next = it.next();
                if (TextUtils.equals(this.f92621N, next.getId())) {
                    chatter = next;
                    break;
                }
            }
            if (chatter != null) {
                list.remove(chatter);
            }
        }
        return list;
    }

    /* renamed from: b */
    private DepartmentStructure m140275b(DepartmentStructure departmentStructure) {
        if (departmentStructure != null && this.f92615H) {
            if (departmentStructure.getLeader() != null && this.f92621N.equals(departmentStructure.getLeader().getId())) {
                departmentStructure.setLeader(null);
            }
            departmentStructure.setUsers(m140266a(departmentStructure.getUsers()));
        }
        return departmentStructure;
    }

    /* renamed from: d */
    private boolean m140285d(DepartmentStructure departmentStructure) {
        if (!this.f92616I && this.f92617J) {
            if (departmentStructure == null || departmentStructure.getDepartment() == null || departmentStructure.getChatInfo() == null) {
                Log.m165383e("DepartmentDetailModel", "departmentStructure or department or chatinfo is null");
            } else {
                ChatInfo chatInfo = departmentStructure.getChatInfo();
                ChatInfo.UserPermission userPermission = chatInfo.getUserPermission();
                if (userPermission == ChatInfo.UserPermission.INVISIBLE || userPermission == ChatInfo.UserPermission.UNKNOWN || chatInfo.getChat() != null || userPermission != ChatInfo.UserPermission.VISIBLE_AND_CREATE) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m140269a(IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        DepartmentStructure departmentStructure = new DepartmentStructure();
        this.f92643p = 0;
        this.f92642o = false;
        departmentStructure.setSubDepartments(C35929i.m140778a().mo130295b());
        this.f92638k.reset(departmentStructure, null, null, null, null);
        this.f92632e.mo132178a(this.f92638k, mo131822f());
        iGetDataCallback.onSuccess(this.f92638k);
    }

    /* renamed from: b */
    private void m140277b(String str) {
        if (!TextUtils.isEmpty(this.f92653z) || "0".equals(this.f92653z)) {
            if (!TextUtils.equals(this.f92641n, str)) {
                this.f92641n = str;
                this.f92643p = 0;
            }
            m140286e(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<DepartmentStructure>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass16 */

                /* renamed from: a */
                public void onSuccess(DepartmentStructure departmentStructure) {
                    C35821c.this.f92635h.mo131841a(C35821c.this.mo131806a(departmentStructure));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("DepartmentDetailModel", errorResult.toString());
                }
            }));
        }
    }

    /* renamed from: a */
    private void m140271a(String str) {
        if (!TextUtils.isEmpty(str)) {
            m140278b(str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<DepartmentStructure>() {
                /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass15 */

                /* renamed from: a */
                public void onSuccess(DepartmentStructure departmentStructure) {
                    C35821c.this.f92635h.mo131841a(C35821c.this.mo131806a(departmentStructure));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("DepartmentDetailModel", errorResult.toString());
                }
            }));
        }
    }

    /* renamed from: c */
    private ArrayList<DepartmentRecyclerViewItem> m140281c(DepartmentStructure departmentStructure) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList<DepartmentRecyclerViewItem> arrayList3 = new ArrayList<>();
        if (departmentStructure.getDepartment() instanceof SchoolParent) {
            SchoolParent schoolParent = (SchoolParent) departmentStructure.getDepartment();
            ArrayList arrayList4 = null;
            if (schoolParent.getUsers() != null) {
                arrayList = new ArrayList();
                for (int i = 0; i < schoolParent.getUsers().size(); i++) {
                    Chatter chatter = schoolParent.getUsers().get(i);
                    if (!this.f92620M && schoolParent.getVirtualNodeType() == VirtualNodeType.VNODE_STUDENT) {
                        break;
                    }
                    DepartmentRecyclerViewItem departmentRecyclerViewItem = new DepartmentRecyclerViewItem(DepartmentRecyclerViewItem.Type.EDUER);
                    DepartmentRecyclerViewItem.Person person = new DepartmentRecyclerViewItem.Person();
                    person.setChatter(chatter);
                    if (schoolParent.getUserTags() != null) {
                        person.setChatterTagInfo(schoolParent.getUserTags().get(chatter.getId()));
                    }
                    if (schoolParent.getVirtualNodeType() == VirtualNodeType.VNODE_STUDENT) {
                        person.setStudent(true);
                    } else if (schoolParent.getVirtualNodeType() == VirtualNodeType.VNODE_TEACHER) {
                        person.setTeacher(true);
                    } else if (schoolParent.getVirtualNodeType() == VirtualNodeType.VNODE_PARENT) {
                        person.setParent(true);
                    }
                    m140270a(departmentStructure, chatter.getId(), person);
                    departmentRecyclerViewItem.setPerson(person);
                    arrayList.add(departmentRecyclerViewItem);
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && schoolParent.getVirtualNodeType() == VirtualNodeType.VNODE_TEACHER) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                Map<String, ChatterTagInfo> userTags = schoolParent.getUserTags();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ChatterTagInfo aVar = (userTags == null || ((DepartmentRecyclerViewItem) arrayList.get(i2)).getPerson() == null || ((DepartmentRecyclerViewItem) arrayList.get(i2)).getPerson().getChatter() == null) ? null : userTags.get(((DepartmentRecyclerViewItem) arrayList.get(i2)).getPerson().getChatter().getId());
                    if (aVar == null || !aVar.mo130573a().contains(EduRoleType.CLASS_HEAD)) {
                        arrayList6.add(arrayList.get(i2));
                    } else {
                        arrayList5.add(arrayList.get(i2));
                    }
                }
                arrayList = new ArrayList();
                arrayList.addAll(arrayList5);
                arrayList.addAll(arrayList6);
            }
            if (!schoolParent.isVirtualNode() || !UIHelper.getString(R.string.Lark_Education_ProfileParent).equals(schoolParent.getName()) || schoolParent.getInactiveParents() == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < schoolParent.getInactiveParents().size(); i3++) {
                    DepartmentRecyclerViewItem departmentRecyclerViewItem2 = new DepartmentRecyclerViewItem(DepartmentRecyclerViewItem.Type.EDUER);
                    DepartmentRecyclerViewItem.Person person2 = new DepartmentRecyclerViewItem.Person();
                    person2.setInactiveParent(schoolParent.getInactiveParents().get(i3));
                    person2.setParent(true);
                    departmentRecyclerViewItem2.setPerson(person2);
                    arrayList2.add(departmentRecyclerViewItem2);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList3.addAll(arrayList);
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList3.addAll(arrayList2);
            }
            if (schoolParent.getChildNodes() != null) {
                arrayList4 = new ArrayList();
                for (int i4 = 0; i4 < schoolParent.getChildNodes().size(); i4++) {
                    SchoolParent schoolParent2 = schoolParent.getChildNodes().get(i4);
                    if (this.f92620M || schoolParent2.getVirtualNodeType() != VirtualNodeType.VNODE_STUDENT) {
                        DepartmentRecyclerViewItem departmentRecyclerViewItem3 = new DepartmentRecyclerViewItem(DepartmentRecyclerViewItem.Type.EDUER_GROUP);
                        departmentRecyclerViewItem3.setDepartment(schoolParent2);
                        arrayList4.add(departmentRecyclerViewItem3);
                    }
                }
            }
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(arrayList4);
            }
        } else {
            Department department = departmentStructure.getDepartment();
            if (m140285d(departmentStructure)) {
                DepartmentRecyclerViewItem a = m140265a(DepartmentRecyclerViewItem.Type.GROUP_CHAT);
                a.setDepartment(department);
                if (department != null) {
                    a.setDepartmentName(department.getName());
                }
                ChatInfo chatInfo = departmentStructure.getChatInfo();
                Chat chat = chatInfo.getChat();
                if (chat != null) {
                    a.setChatName(chat.getName());
                    a.setChatAvatarKey(chat.getAvatarKey());
                    a.setChatId(chat.getId());
                }
                a.setMember(chatInfo.isMember());
                a.setUserPermission(chatInfo.getUserPermission());
                arrayList3.add(a);
            }
            synchronized (this.f92651x) {
                for (Integer num : this.f92651x) {
                    m140268a(num.intValue(), departmentStructure, arrayList3);
                }
            }
        }
        return arrayList3;
    }

    /* renamed from: d */
    private void m140284d(final String str, final IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        this.f92633f.mo132188a(str, this.f92643p, this.f92649v, this.f92620M, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<DepartmentStructureResponse>() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.C358287 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (TextUtils.equals(C35821c.this.f92641n, str)) {
                    iGetDataCallback.onError(errorResult);
                    C35821c.this.f92642o = true;
                }
            }

            /* renamed from: a */
            public void onSuccess(DepartmentStructureResponse bVar) {
                if (TextUtils.equals(C35821c.this.f92641n, str)) {
                    DepartmentStructure a = bVar.mo130370a();
                    List<Chatter> list = null;
                    if (a.getDepartment() != null && (a.getDepartment() instanceof SchoolParent)) {
                        list = ((SchoolParent) a.getDepartment()).getUsers();
                    }
                    if (TextUtils.isEmpty(C35821c.this.f92636i) || list == null || list.size() == 0) {
                        C35821c.this.f92638k.reset(a, bVar.mo130371b(), bVar.mo130372c(), bVar.mo130373d(), null);
                        if (a.getDepartment() != null && !TextUtils.isEmpty(C35821c.this.f92646s) && C35821c.this.f92644q == 1) {
                            String name = a.getDepartment().getName();
                            Department department = a.getDepartment();
                            department.setName(C35821c.this.f92646s + "-" + name);
                        }
                        iGetDataCallback.onSuccess(C35821c.this.f92638k);
                        return;
                    }
                    C35821c.this.mo131808a(2, a, list, iGetDataCallback);
                }
            }
        }));
    }

    /* renamed from: e */
    private void m140286e(final String str, final IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        this.f92634g.mo132149a(this.f92620M, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<SchoolContactStructureResponse>() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.C358298 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (TextUtils.equals(C35821c.this.f92641n, str)) {
                    iGetDataCallback.onError(errorResult);
                    C35821c.this.f92642o = true;
                }
            }

            /* renamed from: a */
            public void onSuccess(SchoolContactStructureResponse fVar) {
                SchoolParent schoolParent;
                if (fVar == null) {
                    return;
                }
                if (!(fVar.mo130395b() == null && fVar.mo130392a() == null)) {
                    DepartmentStructure departmentStructure = new DepartmentStructure();
                    if (fVar.mo130395b() != null) {
                        schoolParent = new SchoolParent();
                        ArrayList arrayList = new ArrayList();
                        SchoolParent b = fVar.mo130395b();
                        arrayList.add(b);
                        schoolParent.setChildNodes(arrayList);
                        schoolParent.setParentId("");
                        schoolParent.setStudentCount(b.getStudentCount());
                        schoolParent.setInactiveParentsCount(b.getInactiveParentsCount());
                        schoolParent.setActiveParentCount(b.getActiveParentCount());
                        schoolParent.setId("0");
                        schoolParent.setName(UIHelper.getString(R.string.Lark_Education_SchoolParentContacts));
                        departmentStructure.setDepartment(schoolParent);
                        List<Chatter> users = schoolParent.getUsers();
                        if (TextUtils.isEmpty(C35821c.this.f92636i) || users == null || users.size() == 0) {
                            C35821c.this.f92638k.reset(departmentStructure, null, null, null, null);
                            C35821c.this.f92632e.mo132178a(C35821c.this.f92638k, UIHelper.getString(R.string.Lark_Education_SchoolParentContacts));
                            iGetDataCallback.onSuccess(C35821c.this.f92638k);
                        } else {
                            C35821c.this.mo131808a(1, departmentStructure, users, iGetDataCallback);
                        }
                    } else {
                        schoolParent = new SchoolParent();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < fVar.mo130392a().size(); i++) {
                            SchoolParent a = fVar.mo130392a().get(i).mo130592a();
                            a.setName(a.getName());
                            arrayList2.add(a);
                        }
                        schoolParent.setParentId("");
                        schoolParent.setId("");
                        schoolParent.setName(UIHelper.getString(R.string.Lark_Education_SchoolParentContacts));
                        schoolParent.setChildNodes(arrayList2);
                    }
                    departmentStructure.setDepartment(schoolParent);
                    List<Chatter> users2 = schoolParent.getUsers();
                    if (TextUtils.isEmpty(C35821c.this.f92636i) || users2 == null || users2.size() == 0) {
                        C35821c.this.f92638k.reset(departmentStructure, null, null, null, null);
                        C35821c.this.f92632e.mo132178a(C35821c.this.f92638k, UIHelper.getString(R.string.Lark_Education_SchoolParentContacts));
                        iGetDataCallback.onSuccess(C35821c.this.f92638k);
                        return;
                    }
                    C35821c.this.mo131808a(1, departmentStructure, users2, iGetDataCallback);
                }
            }
        }));
    }

    /* renamed from: c */
    private void m140282c(final String str, final IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        C35497a.m138871a(str, this.f92645r, String.valueOf(this.f92643p), 20, ActionType.INVITE_SAME_CHAT.getValue(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<AbstractC35936a.C35939c>() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.C358265 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (TextUtils.equals(C35821c.this.f92640m, "-1")) {
                    iGetDataCallback.onError(errorResult);
                    C35821c.this.f92642o = true;
                }
            }

            /* renamed from: a */
            public void onSuccess(AbstractC35936a.C35939c cVar) {
                if (TextUtils.equals(C35821c.this.f92640m, "-1")) {
                    DepartmentStructure departmentStructure = new DepartmentStructure();
                    departmentStructure.setHasMore(cVar.mo132234e());
                    int i = 0;
                    departmentStructure.setHasMoreDepartment(false);
                    departmentStructure.setInChatChatterIds(cVar.mo132235f());
                    Department department = new Department();
                    department.setId("-1");
                    department.setChatId(str);
                    department.setName(UIHelper.getString(R.string.Lark_Legacy_StructureExternal));
                    department.setHasSubDepartments(false);
                    departmentStructure.setDepartment(department);
                    ArrayList arrayList = new ArrayList();
                    Map<String, Chatter> c = cVar.mo132230c();
                    for (ExternalContact externalContact : cVar.mo132223a()) {
                        Chatter chatter = c.get(externalContact.getChatterId());
                        if (chatter != null) {
                            arrayList.add(chatter);
                        }
                        C35821c.this.f92645r = externalContact.getId();
                    }
                    departmentStructure.setUsers(arrayList);
                    departmentStructure.addTenantId2NameMap(cVar.mo132232d());
                    if (C35821c.this.f92647t) {
                        departmentStructure.setDeniedReasons(cVar.mo132236g());
                    }
                    Log.m165389i("DepartmentDetailModel", "net data mExternalDepartmentStructure offset: " + C35821c.this.f92643p);
                    ArrayList arrayList2 = new ArrayList(departmentStructure.getInChatChatterIds());
                    if (C35821c.this.f92643p == 0) {
                        C35821c.this.f92639l.reset(departmentStructure, arrayList2, null, cVar.mo132236g(), null);
                    } else {
                        C35821c.this.f92639l.append(null, departmentStructure.getUsers(), arrayList2, null, cVar.mo132236g(), departmentStructure.getSectionMap(), departmentStructure.getDutyMap(), null);
                        C35821c.this.f92639l.setChatInfo(departmentStructure.getChatInfo());
                        C35821c.this.f92639l.addTenantId2NameMap(departmentStructure.getTenantId2NameMap());
                    }
                    iGetDataCallback.onSuccess(C35821c.this.f92639l);
                    C35821c.this.f92642o = departmentStructure.isHasMore();
                    C35821c cVar2 = C35821c.this;
                    int i2 = cVar2.f92643p;
                    if (departmentStructure.getUsers() != null) {
                        i = departmentStructure.getUsers().size();
                    }
                    cVar2.f92643p = i2 + i;
                }
            }
        }));
    }

    /* renamed from: b */
    private void m140278b(String str, IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        if (!TextUtils.equals(this.f92641n, str)) {
            this.f92641n = str;
            this.f92643p = 0;
            this.f92649v = 100;
        }
        this.f92642o = false;
        m140284d(str, iGetDataCallback);
    }

    public C35821c(Bundle bundle, Bundle bundle2) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
        this.f92650w = arrayList;
        this.f92651x = Collections.synchronizedList(arrayList);
        this.f92626S = new C35394e.AbstractC35395a() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.C358221 */

            @Override // com.ss.android.lark.contact.dto.C35394e.AbstractC35395a
            /* renamed from: a */
            public void mo130390a(Chatter chatter) {
                if (C35821c.this.f92638k.getDepartment() != null && chatter != null) {
                    Chatter leader = C35821c.this.f92638k.getLeader();
                    List<Chatter> users = C35821c.this.f92638k.getUsers();
                    if (leader != null && leader.getId().equals(chatter.getId())) {
                        leader.setAlias(chatter.getAlias());
                        C35841e.AbstractC35842a.AbstractC35843a aVar = C35821c.this.f92635h;
                        C35821c cVar = C35821c.this;
                        aVar.mo131841a(cVar.mo131806a(cVar.f92638k));
                    } else if (CollectionUtils.isNotEmpty(users)) {
                        for (Chatter chatter2 : users) {
                            if (chatter2.getId().equals(chatter.getId())) {
                                chatter2.setAlias(chatter.getAlias());
                                C35841e.AbstractC35842a.AbstractC35843a aVar2 = C35821c.this.f92635h;
                                C35821c cVar2 = C35821c.this;
                                aVar2.mo131841a(cVar2.mo131806a(cVar2.f92638k));
                                return;
                            }
                        }
                    }
                }
            }
        };
        this.f92627T = new C35394e.AbstractC35396b() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass12 */

            @Override // com.ss.android.lark.contact.dto.C35394e.AbstractC35396b
            /* renamed from: a */
            public void mo130391a(Chatter chatter) {
                if (!(C35821c.this.f92638k.getDepartment() == null || chatter == null || !chatter.getId().equals(C35821c.this.f92629b.mo130231c()))) {
                    List<Chatter> users = C35821c.this.f92638k.getUsers();
                    if (CollectionUtils.isNotEmpty(users)) {
                        for (Chatter chatter2 : users) {
                            if (chatter2.getId().equals(chatter.getId())) {
                                chatter2.setAvatarKey(chatter.getAvatarKey());
                                C35841e.AbstractC35842a.AbstractC35843a aVar = C35821c.this.f92635h;
                                C35821c cVar = C35821c.this;
                                aVar.mo131841a(cVar.mo131806a(cVar.f92638k));
                                return;
                            }
                        }
                    }
                }
            }
        };
        this.f92609B = bundle;
        this.f92608A = bundle2;
        this.f92615H = bundle2.getBoolean("ignore_login_user", false);
        this.f92618K = this.f92608A.getBoolean("is_edu_mode", false);
        this.f92625R = this.f92608A.getBoolean("need_enterprise_email", false);
        this.f92620M = this.f92608A.getBoolean("get_inactive_parent", false);
        this.f92646s = this.f92608A.getString("prefix_name");
        this.f92616I = this.f92608A.getBoolean("department_select_mode", false);
        this.f92623P = this.f92608A.getBoolean("KEY_IS_CHECK_PERMISSION", false);
        this.f92617J = this.f92608A.getBoolean("need_show_group_entrance", true);
        this.f92647t = this.f92608A.getBoolean("is_check_one_way_contact", false);
        this.f92619L = this.f92608A.getBoolean("b2b_connect", false);
        this.f92624Q = this.f92608A.getBoolean("read_departments_from_shared_memory", false);
    }

    /* renamed from: a */
    private void m140270a(DepartmentStructure departmentStructure, String str, DepartmentRecyclerViewItem.Person person) {
        Map<String, String> enterpriseEmails;
        if (this.f92625R && (enterpriseEmails = departmentStructure.getEnterpriseEmails()) != null) {
            person.setEnterpriseEmail(enterpriseEmails.get(str));
        }
    }

    /* renamed from: a */
    private void m140268a(int i, DepartmentStructure departmentStructure, ArrayList<DepartmentRecyclerViewItem> arrayList) {
        DepartmentRecyclerViewItem.Type type;
        Set<Department> subDepartments = departmentStructure.getSubDepartments();
        List<Chatter> users = departmentStructure.getUsers();
        Map<String, String> tenantId2NameMap = departmentStructure.getTenantId2NameMap();
        Department department = departmentStructure.getDepartment();
        Set<String> administrators = departmentStructure.getAdministrators();
        Set<String> superAdministrators = departmentStructure.getSuperAdministrators();
        Map<String, String> sectionMap = departmentStructure.getSectionMap();
        Map<String, String> dutyMap = departmentStructure.getDutyMap();
        boolean z = true;
        if (i == 1) {
            Chatter leader = departmentStructure.getLeader();
            if (!(leader == null || TextUtils.isEmpty(leader.getId()))) {
                DepartmentRecyclerViewItem a = m140265a(DepartmentRecyclerViewItem.Type.PERSON);
                DepartmentRecyclerViewItem.Person person = new DepartmentRecyclerViewItem.Person();
                person.setChatter(leader);
                person.setLeader(true);
                person.setAdministrator(administrators.contains(leader.getId()));
                person.setSuperAdministrator(superAdministrators.contains(leader.getId()));
                person.setSection(sectionMap.get(leader.getId()));
                person.setDuty(dutyMap.get(leader.getId()));
                m140270a(departmentStructure, leader.getId(), person);
                a.setPerson(person);
                arrayList.add(a);
            }
        } else if (i != 2) {
            if (i == 3 && users != null && users.size() > 0) {
                Map<String, DeniedReason> deniedReasons = departmentStructure.getDeniedReasons();
                if (deniedReasons == null) {
                    deniedReasons = new HashMap<>();
                }
                for (Chatter chatter : users) {
                    DepartmentRecyclerViewItem a2 = m140265a(DepartmentRecyclerViewItem.Type.PERSON);
                    DepartmentRecyclerViewItem.Person person2 = new DepartmentRecyclerViewItem.Person();
                    a2.setCrossTenant(!TextUtils.equals(this.f92622O, chatter.getTenantId()));
                    chatter.setCrossTenant(a2.isCrossTenant());
                    chatter.setCollaboration(a2.isCollaboration());
                    if (a2.isCrossTenant() && tenantId2NameMap != null) {
                        a2.setDepartmentName(tenantId2NameMap.get(chatter.getTenantId()));
                    }
                    person2.setChatter(chatter);
                    person2.setAdministrator(administrators.contains(chatter.getId()));
                    person2.setSuperAdministrator(superAdministrators.contains(chatter.getId()));
                    DeniedReason deniedReason = deniedReasons.get(chatter.getId());
                    if (deniedReason == null) {
                        deniedReason = DeniedReason.UNKNOWN_REASON;
                    }
                    person2.setDeniedReason(deniedReason.getValue());
                    person2.setSection(sectionMap.get(chatter.getId()));
                    person2.setDuty(dutyMap.get(chatter.getId()));
                    m140270a(departmentStructure, chatter.getId(), person2);
                    a2.setPerson(person2);
                    arrayList.add(a2);
                }
            }
        } else if (subDepartments != null && subDepartments.size() > 0) {
            if (department == null || !"-2".equals(department.getId())) {
                z = false;
            }
            for (Department department2 : subDepartments) {
                if (z) {
                    type = DepartmentRecyclerViewItem.Type.COLLABORATION_TENANT;
                } else {
                    type = DepartmentRecyclerViewItem.Type.DEPARTMENT;
                }
                DepartmentRecyclerViewItem a3 = m140265a(type);
                a3.setDepartment(department2);
                arrayList.add(a3);
            }
        }
    }

    /* renamed from: b */
    private void m140279b(String str, final String str2, final IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        String str3;
        if ("-2".equals(str)) {
            this.f92611D = str2;
            str3 = "0";
        } else {
            str3 = str2;
        }
        IDepartmentServiceInternal iDepartmentServiceInternal = this.f92632e;
        String str4 = this.f92611D;
        String str5 = this.f92636i;
        iDepartmentServiceInternal.mo132180a(str4, str3, str5, this.f92623P, m140283c(str5), 0, 100, new UIGetDataCallback(new IGetDataCallback<GetCollaborationStructureResponse>() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.AnonymousClass11 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("DepartmentDetailModel", "loadCollaborationTenantDetail err: " + errorResult.toString());
                if (TextUtils.equals(C35821c.this.f92640m, str2)) {
                    C35821c.this.f92642o = true;
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }

            /* renamed from: a */
            public void onSuccess(GetCollaborationStructureResponse getCollaborationStructureResponse) {
                Map<String, DeniedReason> map;
                List<String> list;
                List<String> list2;
                boolean z;
                if (getCollaborationStructureResponse == null) {
                    Log.m165383e("DepartmentDetailModel", "loadCollaborationTenantDetail onSuccess but response is null");
                    onError(new ErrorResult(-1, "loadCollaborationTenantDetail onSuccess but response is null"));
                } else if (iGetDataCallback != null) {
                    DepartmentStructure a = C35876b.m140589a(str2, getCollaborationStructureResponse);
                    if (getCollaborationStructureResponse.extend_fields != null) {
                        List<String> list3 = getCollaborationStructureResponse.extend_fields.chatters_in_chat_id;
                        List<String> list4 = getCollaborationStructureResponse.extend_fields.chatters_deny_invite_same_chat;
                        if (getCollaborationStructureResponse.extend_fields.auth_result != null) {
                            map = getCollaborationStructureResponse.extend_fields.auth_result.denied_reasons;
                            list2 = list3;
                        } else {
                            list2 = list3;
                            map = null;
                        }
                        list = list4;
                    } else {
                        list2 = null;
                        list = null;
                        map = null;
                    }
                    if (C35821c.this.f92643p == 0) {
                        C35821c.this.f92637j.reset(a, list2, list, map, null);
                    } else {
                        C35821c.this.f92637j.append(a.getSubDepartments(), a.getUsers(), list2, list, map, a.getSectionMap(), a.getDutyMap(), null);
                        C35821c.this.f92637j.setChatInfo(a.getChatInfo());
                    }
                    iGetDataCallback.onSuccess(C35821c.this.f92637j);
                    C35821c cVar = C35821c.this;
                    if (a.isHasMoreDepartment() || a.isHasMore()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f92642o = z;
                    if (!a.isHasMoreDepartment()) {
                        C35821c.this.f92649v = 100;
                    }
                    C35821c cVar2 = C35821c.this;
                    cVar2.f92643p = cVar2.f92637j.getSubDepartments().size() + C35821c.this.f92637j.getUsers().size();
                    iGetDataCallback.onSuccess(C35821c.this.f92637j);
                }
            }
        }));
    }

    /* renamed from: b */
    private void m140280b(List<String> list, String str, IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CHECK_CHATTERS_IN_CHAT, new CheckChattersInChatRequest.C17322a().mo60828a(str).mo60829a(list), iGetDataCallback, $$Lambda$c$LiTnvhdnpoBvu5uPqcKday6nQc.INSTANCE);
    }

    /* renamed from: a */
    private void m140272a(final String str, String str2, final IGetDataCallback<DepartmentStructure> iGetDataCallback) {
        this.f92632e.mo132179a(str, str2, this.f92643p, this.f92649v, this.f92623P, m140283c(str2), this.f92625R, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new UIGetDataCallback(new IGetDataCallback<DepartmentStructureResponse>() {
            /* class com.ss.android.lark.contact.impl.department.detail.C35821c.C358276 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (TextUtils.equals(C35821c.this.f92640m, str)) {
                    iGetDataCallback.onError(errorResult);
                    C35821c.this.f92642o = true;
                }
            }

            /* renamed from: a */
            public void onSuccess(DepartmentStructureResponse bVar) {
                boolean z;
                if (TextUtils.equals(C35821c.this.f92640m, str)) {
                    DepartmentStructure a = bVar.mo130370a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("net data mCurrentDepartmentStructure chat info is null:");
                    boolean z2 = true;
                    if (a.getChatInfo() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    sb.append(" offset: ");
                    sb.append(C35821c.this.f92643p);
                    sb.append(" mLoadCount: ");
                    sb.append(C35821c.this.f92649v);
                    Log.m165389i("DepartmentDetailModel", sb.toString());
                    List<String> b = bVar.mo130371b();
                    synchronized (C35821c.this.f92651x) {
                        if (bVar.mo130374e() != null && bVar.mo130374e().size() > 0) {
                            C35821c.this.f92651x.clear();
                            C35821c.this.f92651x.addAll(bVar.mo130374e());
                        }
                        if (C35821c.this.f92651x.isEmpty()) {
                            C35821c.this.f92651x.addAll(C35821c.this.f92650w);
                        }
                    }
                    if (C35821c.this.f92643p == 0) {
                        C35821c.this.f92638k.reset(a, b, bVar.mo130372c(), bVar.mo130373d(), bVar.mo130376f());
                        C35821c.this.f92632e.mo132178a(C35821c.this.f92638k, C35821c.this.mo131822f());
                    } else {
                        C35821c.this.f92638k.append(a.getSubDepartments(), a.getUsers(), b, bVar.mo130372c(), bVar.mo130373d(), a.getSectionMap(), a.getDutyMap(), bVar.mo130376f());
                        C35821c.this.f92638k.setChatInfo(a.getChatInfo());
                    }
                    iGetDataCallback.onSuccess(C35821c.this.f92638k);
                    C35821c cVar = C35821c.this;
                    if (!a.isHasMoreDepartment() && !a.isHasMore()) {
                        z2 = false;
                    }
                    cVar.f92642o = z2;
                    if (!a.isHasMoreDepartment()) {
                        C35821c.this.f92649v = 20;
                    }
                    C35821c cVar2 = C35821c.this;
                    cVar2.f92643p = cVar2.f92638k.getSubDepartments().size() + C35821c.this.f92638k.getUsers().size();
                }
            }
        })));
    }
}
