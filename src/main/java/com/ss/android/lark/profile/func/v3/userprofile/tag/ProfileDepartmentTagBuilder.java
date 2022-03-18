package com.ss.android.lark.profile.func.v3.userprofile.tag;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.drawable.TenantCertificationDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/tag/ProfileDepartmentTagBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hasCertification", "", "isCertification", "build", "Lcom/ss/android/lark/widget/drawable/TenantCertificationDrawable;", "setTenantCertification", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.c.a */
public final class ProfileDepartmentTagBuilder {

    /* renamed from: a */
    private boolean f130448a;

    /* renamed from: b */
    private boolean f130449b;

    /* renamed from: c */
    private final Context f130450c;

    /* renamed from: a */
    public final TenantCertificationDrawable mo180193a() {
        if (!this.f130448a) {
            return null;
        }
        if (this.f130449b) {
            Context context = this.f130450c;
            Drawable c = C57582a.m223614c(context, R.drawable.profile_tenant_certification_icon);
            String a = C57582a.m223604a(this.f130450c, (int) R.string.Lark_FeishuCertif_Verif);
            Intrinsics.checkExpressionValueIsNotNull(a, "UiUtils.getString(contex….Lark_FeishuCertif_Verif)");
            return new TenantCertificationDrawable(context, c, a, C57582a.m223616d(this.f130450c, R.color.admintoken_tag_bg_verified), C57582a.m223616d(this.f130450c, R.color.static_white));
        }
        Context context2 = this.f130450c;
        String a2 = C57582a.m223604a(context2, (int) R.string.Lark_FeishuCertif_Unverif);
        Intrinsics.checkExpressionValueIsNotNull(a2, "UiUtils.getString(contex…ark_FeishuCertif_Unverif)");
        return new TenantCertificationDrawable(context2, null, a2, C57582a.m223616d(this.f130450c, R.color.udtoken_tag_neutral_bg_normal), C57582a.m223616d(this.f130450c, R.color.udtoken_tag_neutral_text_normal));
    }

    public ProfileDepartmentTagBuilder(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f130450c = context;
    }

    /* renamed from: a */
    public final ProfileDepartmentTagBuilder mo180192a(boolean z, boolean z2) {
        ProfileDepartmentTagBuilder aVar = this;
        aVar.f130448a = z;
        aVar.f130449b = z2;
        return aVar;
    }
}
