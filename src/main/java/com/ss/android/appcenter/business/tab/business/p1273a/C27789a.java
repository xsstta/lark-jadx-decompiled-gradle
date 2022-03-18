package com.ss.android.appcenter.business.tab.business.p1273a;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.business.a.a */
public class C27789a implements ITitleInfo {

    /* renamed from: a */
    private Context f69425a;

    /* renamed from: b */
    private List<AbstractC44545b> f69426b;

    /* renamed from: c */
    private boolean f69427c = true;

    /* renamed from: d */
    private boolean f69428d = true;

    /* renamed from: e */
    private List<Integer> f69429e = new ArrayList();

    /* renamed from: f */
    private SparseArray<AbstractC27796g> f69430f = new SparseArray<>();

    /* renamed from: g */
    private ITitleInfo.IconStyle f69431g = ITitleInfo.IconStyle.Hide;

    /* renamed from: h */
    private ITitleInfo.AbstractC44542a f69432h;

    /* renamed from: i */
    private String f69433i;

    /* renamed from: j */
    private boolean f69434j;

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: g */
    public ITitleInfo.C44543b mo33261g() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: c */
    public ITitleInfo.IconStyle mo33257c() {
        return this.f69431g;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: d */
    public List<AbstractC44545b> mo33258d() {
        return this.f69426b;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: f */
    public ITitleInfo.AbstractC44542a mo33260f() {
        return this.f69432h;
    }

    /* renamed from: h */
    public void mo99178h() {
        this.f69426b = new ArrayList();
    }

    /* renamed from: j */
    public void mo99180j() {
        this.f69430f.clear();
    }

    /* renamed from: k */
    public void mo99181k() {
        this.f69426b = new ArrayList();
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: e */
    public ITitleInfo.Status mo33259e() {
        if (this.f69434j) {
            return ITitleInfo.Status.Loading;
        }
        return ITitleInfo.Status.Normal;
    }

    /* renamed from: i */
    public void mo99179i() {
        if (TextUtils.isEmpty(this.f69433i)) {
            this.f69434j = true;
        }
    }

    public C27789a() {
        m101557l();
    }

    /* renamed from: l */
    private void m101557l() {
        this.f69429e.add(1);
        this.f69429e.add(2);
        this.f69429e.add(3);
        this.f69429e.add(4);
    }

    /* renamed from: m */
    private void m101558m() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f69429e.size(); i++) {
            AbstractC27796g gVar = this.f69430f.get(this.f69429e.get(i).intValue());
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        this.f69426b = arrayList;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: b */
    public String mo33256b() {
        if (!this.f69428d) {
            return "";
        }
        if (!TextUtils.isEmpty(this.f69433i)) {
            return this.f69433i;
        }
        Context context = this.f69425a;
        if (context != null) {
            return context.getString(R.string.OpenPlatform_AppCenter_Title);
        }
        C28184h.m103248b("AppCenter_Common", "getName>>> context is null.");
        return "Workplace";
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: a */
    public boolean mo33255a() {
        return this.f69427c;
    }

    /* renamed from: a */
    public void mo99171a(ITitleInfo.IconStyle iconStyle) {
        this.f69431g = iconStyle;
    }

    /* renamed from: b */
    public void mo99177b(boolean z) {
        this.f69428d = z;
    }

    /* renamed from: a */
    public void mo99172a(ITitleInfo.AbstractC44542a aVar) {
        this.f69432h = aVar;
    }

    /* renamed from: a */
    public void mo99169a(int i) {
        this.f69430f.remove(i);
        m101558m();
    }

    /* renamed from: a */
    public void mo99170a(AbstractC27796g gVar) {
        this.f69430f.put(gVar.mo99182a(), gVar);
        m101558m();
    }

    /* renamed from: b */
    public View mo99176b(int i) {
        AbstractC27796g gVar = this.f69430f.get(i);
        if (gVar != null) {
            return gVar.mo99183b();
        }
        return null;
    }

    public C27789a(Context context) {
        this.f69425a = context;
        this.f69426b = new ArrayList();
        m101557l();
    }

    /* renamed from: a */
    public void mo99173a(String str) {
        this.f69434j = false;
        this.f69433i = str;
    }

    /* renamed from: a */
    public void mo99174a(List<AbstractC44545b> list) {
        this.f69426b = list;
    }

    /* renamed from: a */
    public void mo99175a(boolean z) {
        this.f69427c = z;
    }
}
