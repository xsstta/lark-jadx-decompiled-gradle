package com.ss.android.lark.moments.impl.common.widget.keyboard.identity;

import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/identity/IMomentsIdentityDependency;", "", "onIdentityChanged", "", "isAnonymous", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "name", "", "avatarKey", "entityId", "onIdentityClicked", "", "show", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.a */
public interface IMomentsIdentityDependency {
    /* renamed from: a */
    void mo166296a(boolean z);

    /* renamed from: a */
    boolean mo166297a(MomentsPublishViewModel.IdentityType identityType, String str, String str2, String str3);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.b.a$a */
    public static final class C47314a {
        /* renamed from: a */
        public static /* synthetic */ boolean m187387a(IMomentsIdentityDependency aVar, MomentsPublishViewModel.IdentityType identityType, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return aVar.mo166297a(identityType, str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onIdentityChanged");
        }
    }
}
