package com.bytedance.ee.bear.list.homepage.title;

import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.homepage.title.f */
public class C8508f implements ITitleInfo {

    /* renamed from: a */
    private boolean f23006a = true;

    /* renamed from: b */
    private String f23007b = "";

    /* renamed from: c */
    private ITitleInfo.IconStyle f23008c = ITitleInfo.IconStyle.Down;

    /* renamed from: d */
    private List<AbstractC44545b> f23009d = new ArrayList();

    /* renamed from: e */
    private ITitleInfo.Status f23010e = ITitleInfo.Status.Normal;

    /* renamed from: f */
    private ITitleInfo.AbstractC44542a f23011f;

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: g */
    public ITitleInfo.C44543b mo33261g() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: b */
    public String mo33256b() {
        return this.f23007b;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: c */
    public ITitleInfo.IconStyle mo33257c() {
        return this.f23008c;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: d */
    public List<AbstractC44545b> mo33258d() {
        return this.f23009d;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: e */
    public ITitleInfo.Status mo33259e() {
        return this.f23010e;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: f */
    public ITitleInfo.AbstractC44542a mo33260f() {
        return this.f23011f;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: a */
    public boolean mo33255a() {
        return this.f23006a;
    }

    /* renamed from: a */
    public void mo33251a(ITitleInfo.IconStyle iconStyle) {
        this.f23008c = iconStyle;
    }

    /* renamed from: a */
    public void mo33252a(String str) {
        this.f23007b = str;
    }

    /* renamed from: a */
    public void mo33253a(List<AbstractC44545b> list) {
        this.f23009d.clear();
        this.f23009d.addAll(list);
    }

    /* renamed from: a */
    public void mo33254a(boolean z) {
        this.f23006a = z;
    }
}
