package com.tt.miniapp.p3301m;

import android.text.TextUtils;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.option.p3398s.AbstractC67675b;

/* renamed from: com.tt.miniapp.m.a */
public class C66329a implements AbstractC67675b {
    @Override // com.tt.option.p3398s.AbstractC67675b
    public void checkSession(String str, AbstractC67675b.AbstractC67676a aVar) {
        String a = C66612a.m260219a(str);
        aVar.mo88522a(!TextUtils.isEmpty(a), a);
    }
}
