package com.ss.android.lark.contact.impl.p1746a;

import android.os.Bundle;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29541ac;
import com.ss.android.lark.biz.core.api.AbstractC29570n;
import com.ss.android.lark.biz.core.api.IDepartmentDetailFragmentBuilder;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.impl.department.detail.C35819a;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.a.d */
public class C35495d implements AbstractC29570n {

    /* renamed from: a */
    private C35819a f91774a;

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: a */
    public BaseFragment mo105779a() {
        return this.f91774a;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: b */
    public void mo105788b() {
        this.f91774a.mo131796b();
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: d */
    public void mo105794d() {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131796b();
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: e */
    public void mo105795e() {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131788a();
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: f */
    public void mo105796f() {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131802d();
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: c */
    public Department mo105791c() {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            return aVar.mo131799c();
        }
        return null;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: a */
    public void mo105782a(AbstractC29541ac acVar) {
        this.f91774a.mo131790a(acVar);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: c */
    public void mo105792c(List<String> list) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131800c(list);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: a */
    public AbstractC29570n mo105780a(IDepartmentDetailFragmentBuilder oVar) {
        this.f91774a = (C35819a) oVar.mo105797a();
        return this;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: b */
    public void mo105789b(List<String> list) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131797b(list);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: a */
    public void mo105781a(PickType pickType) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131789a(pickType);
            Bundle arguments = this.f91774a.getArguments();
            if (arguments != null) {
                arguments.putSerializable("department_pick_type", pickType);
            }
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: b */
    public void mo105790b(boolean z) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131795a(z);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: c */
    public void mo105793c(boolean z) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131798b(z);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: a */
    public void mo105783a(String str) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131792a(str, null);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: a */
    public void mo105786a(List<String> list) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131794a(list);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: a */
    public void mo105787a(boolean z) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131801c(z);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: a */
    public void mo105784a(String str, String str2) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131792a(str, str2);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29570n
    /* renamed from: a */
    public void mo105785a(String str, String str2, String str3) {
        C35819a aVar = this.f91774a;
        if (aVar != null) {
            aVar.mo131793a(str, str2, str3);
        }
    }
}
