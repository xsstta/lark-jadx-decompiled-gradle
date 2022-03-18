package com.ss.android.lark.integrator.moments.dependency;

import android.content.Context;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.moments.dependency.idependency.IForwardDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsForwardModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IForwardDependency;", "()V", "goMomentsPostForwardSelectPage", "", "context", "Landroid/content/Context;", "contentText", "", "postId", "totalShareCount", "", "Companion", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.i */
public final class MomentsForwardModule implements IForwardDependency {

    /* renamed from: a */
    public static final Companion f101581a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsForwardModule$Companion;", "", "()V", "MOMENTS_POST_SHARE_REQUEST_CODE", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.a.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IForwardDependency
    /* renamed from: a */
    public void mo144712a(Context context, String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "contentText");
        Intrinsics.checkParameterIsNotNull(str2, "postId");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goMomentsPostShareSelectPage(context, str, str2, i, 1352);
    }
}
