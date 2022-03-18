package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"spaceTabs", "", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/SpaceTab;", "getSpaceTabs", "()Ljava/util/List;", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.c */
public final class C12318c {
    /* renamed from: a */
    public static final List<SpaceTab> m51335a() {
        return CollectionsKt.arrayListOf(new SpaceTab(TabEnum.ALL.getSpaceType(), R.string.CreationMobile_Wiki_All, WikiSpaceListFragment.f33088e.mo46991a(TabEnum.ALL.getSpaceType())), new SpaceTab(TabEnum.TEAM.getSpaceType(), R.string.CreationMobile_Wiki_Team, WikiSpaceListFragment.f33088e.mo46991a(TabEnum.TEAM.getSpaceType())), new SpaceTab(TabEnum.PERSONAL.getSpaceType(), R.string.CreationMobile_Wiki_Personal, WikiSpaceListFragment.f33088e.mo46991a(TabEnum.PERSONAL.getSpaceType())));
    }
}
