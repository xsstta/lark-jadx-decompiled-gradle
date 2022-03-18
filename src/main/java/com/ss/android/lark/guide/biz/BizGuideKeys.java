package com.ss.android.lark.guide.biz;

import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guide/biz/BizGuideKeys;", "", "()V", "NEW_ONBOARDING_SINGLE_PRODUCT_GUIDE", "", "NEW_ONBOARDING_TOUR_VIDEO", "TAB_PAGE_TIP_CALENDAR_CREATE_BUTTON", "TAB_PAGE_TIP_CONTACT_ADD_FRIENDS", "getGuideKeys", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.a */
public final class BizGuideKeys {

    /* renamed from: a */
    public static final BizGuideKeys f99090a = new BizGuideKeys();

    private BizGuideKeys() {
    }

    /* renamed from: a */
    public final List<String> mo141290a() {
        HashSet hashSet = new HashSet();
        hashSet.add("all_new_onboarding_guide");
        hashSet.add("all_new_onboarding_video");
        hashSet.add("all_calendar_create_button");
        hashSet.add("mobile_contact_add_friends");
        return CollectionsKt.toList(hashSet);
    }
}
