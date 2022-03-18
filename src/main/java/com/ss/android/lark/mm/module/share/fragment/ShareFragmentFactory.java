package com.ss.android.lark.mm.module.share.fragment;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/module/share/fragment/ShareFragmentFactory;", "", "()V", "create", "Lcom/ss/android/lark/mm/module/share/fragment/ShareBaseFragment;", "repoId", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;", "allowExternalShare", "", "canTransfer", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "fromSource", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.fragment.e */
public final class ShareFragmentFactory {

    /* renamed from: a */
    public static final ShareFragmentFactory f118301a = new ShareFragmentFactory();

    private ShareFragmentFactory() {
    }

    /* renamed from: a */
    public final ShareBaseFragment mo164992a(String str, FragmentType fragmentType, boolean z, boolean z2, SharePermission sharePermission, IFragmentManager bVar, int i) {
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(fragmentType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
        int i2 = C47002f.f118302a[fragmentType.ordinal()];
        if (i2 == 1) {
            return new PermissionFragment(str, fragmentType, z, z2, sharePermission, bVar, i);
        }
        if (i2 != 2) {
            return new InviteFragment(str, fragmentType, z, z2, sharePermission, bVar, i);
        }
        return new SearchFragment(str, fragmentType, z, z2, sharePermission, bVar, i);
    }
}
