package p000;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.p1954i.p1955a.AbstractC38780a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(AbstractC38780a.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"LDriveModuleDependency;", "Lcom/ss/android/lark/drive/dependency/IDriveModuleDependency;", "()V", "isPrimaryHost", "", "ccm_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: DriveModuleDependency */
public final class DriveModuleDependency implements AbstractC38780a {
    public boolean isPrimaryHost() {
        Object api = ApiUtils.getApi(IPassportApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IPassportApi::class.java)");
        return ((IPassportApi) api).isPrimaryHost();
    }
}
