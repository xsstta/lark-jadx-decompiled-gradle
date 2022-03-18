package com.ss.android.lark.littleapp.view;

import android.content.Context;
import com.ss.android.lark.littleapp.p2131f.C41353c;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.littleapp.view.e */
public class C41471e implements ITitleInfo {

    /* renamed from: a */
    private Context f105433a;

    /* renamed from: b */
    private TabAppInfo f105434b;

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: a */
    public boolean mo33255a() {
        return true;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: d */
    public List<AbstractC44545b> mo33258d() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: f */
    public ITitleInfo.AbstractC44542a mo33260f() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: g */
    public ITitleInfo.C44543b mo33261g() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: c */
    public ITitleInfo.IconStyle mo33257c() {
        return ITitleInfo.IconStyle.Hide;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: e */
    public ITitleInfo.Status mo33259e() {
        return ITitleInfo.Status.Normal;
    }

    @Override // com.ss.android.lark.maincore.ITitleInfo
    /* renamed from: b */
    public String mo33256b() {
        TabAppInfo tabAppInfo = this.f105434b;
        if (tabAppInfo != null) {
            return C41353c.m163937a(tabAppInfo);
        }
        return "";
    }

    public C41471e(Context context, TabAppInfo tabAppInfo) {
        this.f105433a = context;
        this.f105434b = tabAppInfo;
    }
}
