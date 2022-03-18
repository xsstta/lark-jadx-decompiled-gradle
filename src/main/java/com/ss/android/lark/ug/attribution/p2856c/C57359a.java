package com.ss.android.lark.ug.attribution.p2856c;

import com.ss.android.lark.ug.attribution.bean.Attribution;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.ug.attribution.c.a */
public class C57359a implements AbstractC57360b {
    @Override // com.ss.android.lark.ug.attribution.p2856c.AbstractC57360b
    /* renamed from: a */
    public Attribution mo194519a() {
        return (Attribution) C57744a.m224104a().getJSONObject("ug_attribution_key", Attribution.class);
    }

    @Override // com.ss.android.lark.ug.attribution.p2856c.AbstractC57360b
    /* renamed from: b */
    public Attribution mo194521b() {
        return (Attribution) UserSP.getInstance().getJSONObject("ug_attribution_key", Attribution.class);
    }

    @Override // com.ss.android.lark.ug.attribution.p2856c.AbstractC57360b
    /* renamed from: a */
    public void mo194520a(Attribution attribution) {
        C57744a.m224104a().putJSONObject("ug_attribution_key", attribution);
    }

    @Override // com.ss.android.lark.ug.attribution.p2856c.AbstractC57360b
    /* renamed from: b */
    public void mo194522b(Attribution attribution) {
        UserSP.getInstance().putJSONObject("ug_attribution_key", attribution);
    }
}
