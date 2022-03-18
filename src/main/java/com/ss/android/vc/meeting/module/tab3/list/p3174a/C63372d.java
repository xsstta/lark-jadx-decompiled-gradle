package com.ss.android.vc.meeting.module.tab3.list.p3174a;

import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.a.d */
public class C63372d implements ITitleInfo {

    /* renamed from: a */
    private boolean f159993a = true;

    /* renamed from: b */
    private String f159994b = "";

    /* renamed from: c */
    private ITitleInfo.IconStyle f159995c = ITitleInfo.IconStyle.Down;

    /* renamed from: d */
    private List<AbstractC44545b> f159996d = new ArrayList();

    /* renamed from: e */
    private ITitleInfo.Status f159997e = ITitleInfo.Status.Normal;

    /* renamed from: f */
    private ITitleInfo.AbstractC44542a f159998f;

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: g */
    public ITitleInfo.C44543b mo33261g() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: b */
    public String mo33256b() {
        return this.f159994b;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: c */
    public ITitleInfo.IconStyle mo33257c() {
        return this.f159995c;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: d */
    public List<AbstractC44545b> mo33258d() {
        return this.f159996d;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: e */
    public ITitleInfo.Status mo33259e() {
        return this.f159997e;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: f */
    public ITitleInfo.AbstractC44542a mo33260f() {
        return this.f159998f;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: a */
    public boolean mo33255a() {
        return this.f159993a;
    }

    /* renamed from: a */
    public void mo219290a(ITitleInfo.IconStyle iconStyle) {
        this.f159995c = iconStyle;
    }

    /* renamed from: a */
    public void mo219291a(String str) {
        this.f159994b = str;
    }

    /* renamed from: a */
    public void mo219292a(boolean z) {
        this.f159993a = z;
    }
}
