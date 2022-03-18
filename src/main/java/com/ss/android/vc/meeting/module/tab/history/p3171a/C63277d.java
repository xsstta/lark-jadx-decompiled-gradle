package com.ss.android.vc.meeting.module.tab.history.p3171a;

import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.a.d */
public class C63277d implements ITitleInfo {

    /* renamed from: a */
    private boolean f159618a = true;

    /* renamed from: b */
    private String f159619b = "";

    /* renamed from: c */
    private ITitleInfo.IconStyle f159620c = ITitleInfo.IconStyle.Down;

    /* renamed from: d */
    private List<AbstractC44545b> f159621d = new ArrayList();

    /* renamed from: e */
    private ITitleInfo.Status f159622e = ITitleInfo.Status.Normal;

    /* renamed from: f */
    private ITitleInfo.AbstractC44542a f159623f;

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: g */
    public ITitleInfo.C44543b mo33261g() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: b */
    public String mo33256b() {
        return this.f159619b;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: c */
    public ITitleInfo.IconStyle mo33257c() {
        return this.f159620c;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: d */
    public List<AbstractC44545b> mo33258d() {
        return this.f159621d;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: e */
    public ITitleInfo.Status mo33259e() {
        return this.f159622e;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: f */
    public ITitleInfo.AbstractC44542a mo33260f() {
        return this.f159623f;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: a */
    public boolean mo33255a() {
        return this.f159618a;
    }

    /* renamed from: a */
    public void mo218973a(ITitleInfo.IconStyle iconStyle) {
        this.f159620c = iconStyle;
    }

    /* renamed from: a */
    public void mo218974a(String str) {
        this.f159619b = str;
    }

    /* renamed from: a */
    public void mo218975a(boolean z) {
        this.f159618a = z;
    }
}
