package com.ss.android.lark.moments.impl.common.widget.keyboard.identity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsKeyboardManagerDependency;", "", "getIdentityType", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "getQuota", "", "noQuotaLimitation", "", "hasAt", "setIdentityType", ShareHitPoint.f121869d, "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.b */
public interface IMomentsKeyboardManagerDependency {
    /* renamed from: a */
    MomentsPublishViewModel.IdentityType mo166298a();

    /* renamed from: a */
    void mo166299a(MomentsPublishViewModel.IdentityType identityType);

    /* renamed from: a */
    void mo166300a(boolean z);

    /* renamed from: b */
    boolean mo166301b();
}
