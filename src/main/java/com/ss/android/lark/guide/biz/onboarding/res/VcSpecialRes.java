package com.ss.android.lark.guide.biz.onboarding.res;

import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/VcSpecialRes;", "Lcom/ss/android/lark/guide/biz/onboarding/res/SpecialRes;", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "initResIdMappingMap", "", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.x */
public final class VcSpecialRes extends SpecialRes {
    @Override // com.ss.android.lark.guide.biz.onboarding.res.IRes
    /* renamed from: b */
    public String mo141361b() {
        return "ResGetter_vc_special_res";
    }

    @Override // com.ss.android.lark.guide.biz.onboarding.res.SpecialRes
    /* renamed from: a */
    public Map<Integer, Integer> mo141362a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf((int) R.string.Lark_Guide_SpotlightInvitePeopleTeamTitle), Integer.valueOf((int) R.string.Lark_Guide_SpotlightInvitePeopleTeamTitleVC));
        hashMap.put(Integer.valueOf((int) R.string.Lark_Guide_SpotlightInvitePeopleTeamContent), Integer.valueOf((int) R.string.Lark_Guide_SpotlightInvitePeopleTeamContentVC));
        hashMap.put(Integer.valueOf((int) R.string.Lark_Guide_SpotlightInvitePeoplePersonalContent), Integer.valueOf((int) R.string.Lark_Guide_SpotlightInvitePeoplePersonalContentVC));
        hashMap.put(Integer.valueOf((int) R.string.Lark_Guide_VideoSubTitleMobile), Integer.valueOf((int) R.string.Lark_Guide_VideoSubTitleMobileVC));
        return hashMap;
    }
}
