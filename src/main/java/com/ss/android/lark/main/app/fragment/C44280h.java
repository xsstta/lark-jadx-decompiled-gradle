package com.ss.android.lark.main.app.fragment;

import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.p1400a.AbstractC29524c;
import com.ss.android.lark.base.p1400a.C29520a;
import com.ss.android.lark.base.p1400a.C29521b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.main.app.fragment.desktop.C44270a;
import com.ss.android.lark.main.app.fragment.phone.C44300b;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.main.app.fragment.h */
public class C44280h implements AbstractC29524c {
    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: a */
    public int mo104613a() {
        return 4097;
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: c */
    public int mo104617c() {
        return R.anim.slide_right_in;
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: d */
    public int mo104618d() {
        return R.anim.slide_right_out;
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: b */
    public String mo104616b() {
        return C44300b.class.getName();
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: a */
    public void mo104615a(Intent intent, IGetDataCallback<Bundle> iGetDataCallback) {
        iGetDataCallback.onSuccess(intent.getExtras());
    }

    @Override // com.ss.android.lark.base.p1400a.AbstractC29524c
    /* renamed from: a */
    public C29520a mo104614a(Bundle bundle, C29521b bVar) {
        C29520a aVar;
        if (DesktopUtil.m144301a(UIHelper.getContext())) {
            aVar = C44270a.m175600f();
        } else {
            aVar = C44300b.m175786f();
        }
        aVar.setArguments(bundle);
        return aVar;
    }
}
