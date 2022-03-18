package com.ss.android.lark.contact.impl.contacts_selector.subordinate;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.resource.bitmap.C2452w;
import com.bumptech.glide.request.AbstractC2510a;
import com.bumptech.glide.request.C2537g;
import com.bytedance.lark.pb.passport.v1.GetUserSidebarResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35774b;
import com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35777d;
import com.ss.android.lark.contact.impl.interfaces.IDepartmentServiceInternal;
import com.ss.android.lark.contact.impl.p1761f.C35883b;
import com.ss.android.lark.contact.impl.p1761f.C35929i;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.lark.contact.impl.contacts_selector.subordinate.d */
public class C35777d implements AbstractC35773a {

    /* renamed from: a */
    public final Context f92500a;

    /* renamed from: b */
    public SubordinateView f92501b;

    /* renamed from: c */
    public final AbstractC35776c f92502c = new C35784e();

    /* renamed from: d */
    public List<Department> f92503d;

    /* renamed from: e */
    private final ViewGroup f92504e;

    /* renamed from: f */
    private boolean f92505f;

    /* renamed from: g */
    private final AbstractC35361b.AbstractC35376o f92506g = C35358a.m138143a().mo130163h();

    /* renamed from: h */
    private AbstractC35361b.AbstractC35382u f92507h = C35358a.m138143a().mo130156d();

    /* renamed from: i */
    private int f92508i;

    /* renamed from: j */
    private AbstractC35774b.AbstractC35775a f92509j;

    /* renamed from: k */
    private final IGetDataCallback<IDepartmentServiceInternal.SubordinateDepartmentStructure> f92510k = new IGetDataCallback<IDepartmentServiceInternal.SubordinateDepartmentStructure>() {
        /* class com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35777d.C357781 */

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
        }

        /* renamed from: a */
        public void onSuccess(IDepartmentServiceInternal.SubordinateDepartmentStructure subordinateDepartmentStructure) {
            if (!UIUtils.isActivityRunning((Activity) C35777d.this.f92500a)) {
                C35777d.this.f92502c.mo131680a();
            } else {
                C35777d.this.mo131686a(subordinateDepartmentStructure.getDepartmentList(), subordinateDepartmentStructure.getMemberCount());
            }
        }
    };

    /* renamed from: com.ss.android.lark.contact.impl.contacts_selector.subordinate.d$a */
    public static class View$OnClickListenerC35783a implements View.OnClickListener {

        /* renamed from: a */
        private final String f92516a;

        public void onClick(View view) {
        }

        /* renamed from: a */
        public String mo131692a() {
            return this.f92516a;
        }

        public View$OnClickListenerC35783a(String str) {
            this.f92516a = str;
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35773a
    /* renamed from: b */
    public int mo131679b() {
        return this.f92508i;
    }

    /* renamed from: e */
    private boolean m140035e() {
        if (!this.f92505f) {
            return false;
        }
        return C35358a.m138143a().mo130150b().mo130208a("lark.client.contact.organization.moredepartments");
    }

    /* renamed from: g */
    private void m140037g() {
        SubordinateView subordinateView = this.f92501b;
        if (subordinateView != null) {
            subordinateView.getHeaderViewGroup().setOnClickListener(new View$OnClickListenerC35783a("0") {
                /* class com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35777d.C357825 */

                @Override // com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35777d.View$OnClickListenerC35783a
                public void onClick(View view) {
                    C35777d.this.mo131684a(view, mo131692a());
                }
            });
        }
    }

    /* renamed from: d */
    private void m140034d() {
        if (!this.f92506g.mo130230b()) {
            SubordinateView subordinateView = new SubordinateView(this.f92500a);
            this.f92501b = subordinateView;
            DesktopUtil.m144299a((TextView) subordinateView.getHeaderViewGroup().findViewById(R.id.tv_department_header));
            this.f92504e.addView(this.f92501b, new ViewGroup.LayoutParams(-1, -2));
            m140037g();
        }
    }

    /* renamed from: c */
    public C35777d mo131677a() {
        if (this.f92501b == null) {
            Log.m165389i("SubordinateController", "fetch targetView is null");
            return this;
        } else if (this.f92506g.mo130230b()) {
            Log.m165389i("SubordinateController", "fetch is smallB account");
            return this;
        } else {
            this.f92502c.mo131681a(this.f92510k);
            m140036f();
            return this;
        }
    }

    /* renamed from: f */
    private void m140036f() {
        if (!this.f92505f) {
            this.f92501b.mTenantInfo.setVisibility(8);
            return;
        }
        this.f92501b.mTenantInfo.setVisibility(0);
        String b = this.f92507h.mo130258b();
        String c = this.f92507h.mo130259c();
        this.f92501b.mTenantName.setText(b);
        ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f92500a).mo10415a(c).mo11123a((int) R.drawable.contact_tenant_icon_placeholder)).mo10391a((AbstractC2510a<?>) C2537g.m10789b((AbstractC2393i<Bitmap>) new C2452w(UIUtils.dp2px(this.f92500a, 16.0f)))).mo10399a(this.f92501b.mTenantAvatar);
        this.f92502c.mo131682b(new UIGetDataCallback(new IGetDataCallback<List<GetUserSidebarResponse.SidebarInfo>>() {
            /* class com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35777d.C357792 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SubordinateController", "getAdminData err: " + errorResult.toString());
                C35777d.this.f92501b.mManageEntry.setVisibility(8);
            }

            /* renamed from: a */
            public void onSuccess(List<GetUserSidebarResponse.SidebarInfo> list) {
                if (list != null && !list.isEmpty()) {
                    String str = null;
                    Iterator<GetUserSidebarResponse.SidebarInfo> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            GetUserSidebarResponse.SidebarInfo next = it.next();
                            if (next != null && next.sidebar_type == GetUserSidebarResponse.SidebarType.ADMIN && next.sidebar_isshow.booleanValue() && !TextUtils.isEmpty(next.sidebar_link)) {
                                str = next.sidebar_link;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C35777d.this.f92501b.mManageEntry.setVisibility(0);
                        C35777d.this.f92501b.mManageEntry.setOnClickListener(new View.OnClickListener(Uri.parse(str).buildUpon().appendQueryParameter("from", "contact").build().toString()) {
                            /* class com.ss.android.lark.contact.impl.contacts_selector.subordinate.$$Lambda$d$2$OCceQPPLn3b3xHE6_Ih8P_BVrFU */
                            public final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void onClick(View view) {
                                C35777d.C357792.lambda$OCceQPPLn3b3xHE6_Ih8P_BVrFU(C35777d.C357792.this, this.f$1, view);
                            }
                        });
                        return;
                    }
                    C35777d.this.f92501b.mManageEntry.setVisibility(8);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m140047a(String str, View view) {
                C35358a.m138143a().mo130160f().mo130192a(C35777d.this.f92500a, str);
            }
        }));
    }

    /* renamed from: a */
    public AbstractC35773a mo131683a(AbstractC35774b.AbstractC35775a aVar) {
        this.f92509j = aVar;
        return this;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_selector.subordinate.AbstractC35773a
    /* renamed from: a */
    public AbstractC35773a mo131678a(AbstractC35774b bVar) {
        SubordinateView subordinateView = this.f92501b;
        if (subordinateView != null) {
            subordinateView.setOnItemClickListener(bVar);
        }
        return this;
    }

    /* renamed from: a */
    public void mo131684a(View view, String str) {
        SubordinateView subordinateView = this.f92501b;
        if (!(subordinateView == null || subordinateView.getOnItemClickListener() == null)) {
            this.f92501b.getOnItemClickListener().mo131547a(view, str);
        }
        ContactHitPoint.m140812m();
        ContactHitPoint.m140802f("architecture");
    }

    /* renamed from: a */
    public void mo131685a(TextView textView, int i) {
        String str;
        if (i > 0) {
            str = "（" + i + "）";
        } else {
            str = "";
        }
        textView.setText(UIHelper.getString(R.string.Lark_Legacy_StructureDepartments) + str);
    }

    /* renamed from: a */
    private void m140032a(int i, LayoutInflater layoutInflater) {
        SubordinateView subordinateView = this.f92501b;
        if (subordinateView != null) {
            View inflate = layoutInflater.inflate(R.layout.subordinate_dep_more_item, subordinateView.getSubordinateContainer(), false);
            TextView textView = (TextView) inflate.findViewById(R.id.more_info);
            DesktopUtil.m144299a(textView);
            textView.setText(String.format(Locale.getDefault(), "%s（%d）", this.f92500a.getResources().getText(R.string.Lark_Contacts_MoreDepartments), Integer.valueOf(i)));
            this.f92501b.getSubordinateContainer().addView(inflate);
            inflate.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35777d.View$OnClickListenerC357814 */

                public void onClick(View view) {
                    C35929i.m140778a().mo130294a(C35777d.this.f92503d);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("read_departments_from_shared_memory", true);
                    bundle.putString("department_page_title", C35777d.this.f92500a.getResources().getString(R.string.Lark_Contacts_MoreDepartments));
                    C35883b.m140625a().mo132105a(C35777d.this.f92500a, "0", bundle);
                    ContactHitPoint.m140811l();
                }
            });
        }
    }

    /* renamed from: a */
    private void m140033a(Department department, LayoutInflater layoutInflater) {
        if (this.f92501b != null) {
            View inflate = layoutInflater.inflate(R.layout.subordinate_depitem, (ViewGroup) null, false);
            DesktopUtil.m144299a((TextView) inflate.findViewById(R.id.department_info));
            this.f92501b.getSubordinateContainer().addView(inflate);
            inflate.setOnClickListener(new View$OnClickListenerC35783a(department.getId()) {
                /* class com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35777d.C357803 */

                @Override // com.ss.android.lark.contact.impl.contacts_selector.subordinate.C35777d.View$OnClickListenerC35783a
                public void onClick(View view) {
                    C35777d.this.mo131684a(view, mo131692a());
                }
            });
            TextView textView = (TextView) inflate.findViewById(R.id.department_info);
            if (textView != null) {
                textView.setText(department.getName());
            }
        }
    }

    /* renamed from: a */
    public void mo131686a(List<Department> list, int i) {
        SubordinateView subordinateView = this.f92501b;
        if (subordinateView != null) {
            subordinateView.mo131672a();
        }
        this.f92503d = list;
        LayoutInflater from = LayoutInflater.from(this.f92500a);
        int size = list.size();
        boolean e = m140035e();
        if (e) {
            size = Math.min(list.size(), 3);
        }
        for (int i2 = 0; i2 < size; i2++) {
            m140033a(list.get(i2), from);
        }
        if (e && list.size() > 3) {
            m140032a(list.size() - 3, from);
        }
        SubordinateView subordinateView2 = this.f92501b;
        if (subordinateView2 != null) {
            mo131685a((TextView) subordinateView2.getHeaderViewGroup().findViewById(R.id.tv_department_header), i);
            this.f92508i = list.size();
        }
        AbstractC35774b.AbstractC35775a aVar = this.f92509j;
        if (aVar != null) {
            aVar.mo131546a();
        }
    }

    public C35777d(Context context, ViewGroup viewGroup, boolean z) {
        this.f92500a = context;
        this.f92504e = viewGroup;
        this.f92505f = z;
        m140034d();
    }
}
