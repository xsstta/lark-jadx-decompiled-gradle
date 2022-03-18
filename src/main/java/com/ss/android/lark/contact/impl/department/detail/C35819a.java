package com.ss.android.lark.contact.impl.department.detail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29541ac;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.impl.department.detail.DepartmentDetailView;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.department.detail.a */
public class C35819a extends BaseFragment {

    /* renamed from: a */
    C35831d f92597a;

    /* renamed from: b */
    Bundle f92598b;

    /* renamed from: c */
    Bundle f92599c;

    /* renamed from: d */
    public View f92600d;

    /* renamed from: e */
    public AbstractC29541ac f92601e;

    /* renamed from: f */
    DepartmentDetailView.AbstractC35818a f92602f = new DepartmentDetailView.AbstractC35818a() {
        /* class com.ss.android.lark.contact.impl.department.detail.C35819a.C358201 */

        @Override // com.ss.android.lark.contact.impl.department.detail.DepartmentDetailView.AbstractC35818a
        /* renamed from: b */
        public void mo131786b() {
            mo102977a();
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: a */
        public void mo102977a() {
            if (C35819a.this.f92601e != null) {
                C35819a.this.f92601e.mo102977a();
            }
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.DepartmentDetailView.AbstractC35818a
        /* renamed from: a */
        public void mo131785a(DepartmentDetailView departmentDetailView) {
            ButterKnife.bind(departmentDetailView, C35819a.this.f92600d);
        }

        @Override // com.ss.android.lark.contact.impl.department.detail.DepartmentDetailView.AbstractC35818a
        /* renamed from: b */
        public void mo131787b(String str) {
            C35358a.m138143a().mo130165j().mo130205b(str, "");
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: c */
        public void mo102986c(boolean z) {
            if (C35819a.this.f92601e != null) {
                C35819a.this.f92601e.mo102986c(z);
            }
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: b */
        public void mo102985b(boolean z) {
            if (C35819a.this.f92601e != null) {
                C35819a.this.f92601e.mo102985b(z);
            }
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: a */
        public void mo102979a(Chatter chatter) {
            if (C35819a.this.f92601e != null) {
                C35819a.this.f92601e.mo102979a(chatter);
            }
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: a */
        public void mo102981a(String str) {
            if (C35819a.this.f92601e != null) {
                C35819a.this.f92601e.mo102981a(str);
            }
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: a */
        public void mo102982a(boolean z) {
            if (C35819a.this.f92601e != null) {
                C35819a.this.f92601e.mo102982a(z);
            }
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: a */
        public boolean mo102984a(Department department, boolean z) {
            if (C35819a.this.f92601e != null) {
                return C35819a.this.f92601e.mo102984a(department, z);
            }
            return false;
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: a */
        public void mo102980a(Chatter chatter, int i, int i2) {
            if (C35819a.this.f92601e != null) {
                C35819a.this.f92601e.mo102980a(chatter, i, i2);
            }
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: a */
        public void mo102978a(Context context, String str, String str2, int i) {
            if (C35819a.this.f92601e != null) {
                C35819a.this.f92601e.mo102978a(context, str, str2, i);
            }
        }

        @Override // com.ss.android.lark.biz.core.api.AbstractC29541ac
        /* renamed from: a */
        public boolean mo102983a(Chatter chatter, boolean z, int i, String str, int i2) {
            if (C35819a.this.f92601e != null) {
                return C35819a.this.f92601e.mo102983a(chatter, z, i, str, i2);
            }
            return false;
        }
    };

    /* renamed from: g */
    private DepartmentDetailView f92603g;

    /* renamed from: h */
    private C35821c f92604h;

    /* renamed from: d */
    public void mo131802d() {
        C35821c cVar = this.f92604h;
        if (cVar != null) {
            cVar.mo131821e();
        }
    }

    /* renamed from: a */
    public void mo131788a() {
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView != null) {
            departmentDetailView.mo131747a();
        }
    }

    /* renamed from: b */
    public void mo131796b() {
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView != null) {
            departmentDetailView.mo131776d();
        }
    }

    /* renamed from: c */
    public Department mo131799c() {
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView == null) {
            return null;
        }
        return departmentDetailView.mo131763b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C35831d dVar = this.f92597a;
        if (dVar != null) {
            dVar.destroy();
        }
        super.onDestroyView();
    }

    /* renamed from: e */
    private void m140216e() {
        this.f92603g = new DepartmentDetailView(getActivity(), this.f92602f, this.f92599c);
        C35821c cVar = new C35821c(this.f92598b, this.f92599c);
        this.f92604h = cVar;
        C35831d dVar = new C35831d(cVar, this.f92603g, this.f92599c);
        this.f92597a = dVar;
        dVar.create();
    }

    /* renamed from: a */
    public void mo131790a(AbstractC29541ac acVar) {
        this.f92601e = acVar;
    }

    /* renamed from: a */
    public void mo131789a(PickType pickType) {
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView != null) {
            departmentDetailView.mo131749a(pickType);
        }
    }

    /* renamed from: b */
    public void mo131797b(List<String> list) {
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView != null) {
            departmentDetailView.mo131768b(list);
        }
    }

    /* renamed from: c */
    public void mo131800c(List<String> list) {
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView != null) {
            departmentDetailView.mo131774c(list);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f92598b = bundle;
        this.mContext = getContext();
    }

    /* renamed from: a */
    public void mo131791a(String str) {
        C35821c cVar = this.f92604h;
        if (cVar != null) {
            cVar.mo131809a(getContext(), str);
        }
    }

    /* renamed from: b */
    public void mo131798b(boolean z) {
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView != null) {
            departmentDetailView.mo131775c(z);
        }
    }

    /* renamed from: c */
    public void mo131801c(boolean z) {
        C35821c cVar = this.f92604h;
        if (cVar != null) {
            cVar.mo131817a(z);
        }
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView != null) {
            departmentDetailView.mo131778d(z);
        }
    }

    /* renamed from: a */
    public void mo131794a(List<String> list) {
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView != null) {
            departmentDetailView.mo131759a(list);
        }
    }

    /* renamed from: a */
    public void mo131795a(boolean z) {
        DepartmentDetailView departmentDetailView = this.f92603g;
        if (departmentDetailView != null) {
            departmentDetailView.mo131769b(z);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("department_select_mode", z);
        }
    }

    /* renamed from: a */
    public void mo131792a(String str, String str2) {
        C35821c cVar = this.f92604h;
        if (cVar != null) {
            cVar.mo131814a(str, str2);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f92600d = layoutInflater.inflate(R.layout.fragment_organization_layout, viewGroup, false);
        this.f92599c = getArguments();
        m140216e();
        return this.f92600d;
    }

    /* renamed from: a */
    public void mo131793a(String str, String str2, String str3) {
        C35821c cVar = this.f92604h;
        if (cVar != null) {
            cVar.mo131816a(str, str2, str3);
        }
    }
}
