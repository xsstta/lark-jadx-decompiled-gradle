package com.ss.android.lark.invitation.v2.feat.member.common;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.util.C40102d;
import com.ss.android.lark.inv.export.util.C40111j;
import com.ss.android.lark.inv.export.util.C40147z;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000fH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/common/InviteConstantKeyImageDataParser;", "Lcom/ss/android/lark/inv/export/util/InvDyResRustPbUtils$BaseConstantKeyImageDataParser;", "qrIv", "Landroid/widget/ImageView;", "teamCode", "", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "teamCodeQrBitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "getTeamCodeQrBitmap", "width", "", "height", "getTextPlaceholders", "", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.member.common.a */
public final class InviteConstantKeyImageDataParser extends C40111j.C40114a {

    /* renamed from: a */
    private ImageView f102474a;

    /* renamed from: b */
    private Bitmap f102475b;

    /* renamed from: c */
    private String f102476c;

    @Override // com.ss.android.lark.inv.export.util.C40111j.C40114a
    /* renamed from: a */
    public Map<String, String> mo145679a() {
        HashMap hashMap = new HashMap();
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        IInvitationModuleDependency.AbstractC40087c loginDependency = a.getLoginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "InvUtils.getDep().loginDependency");
        String b = loginDependency.mo145586b();
        Intrinsics.checkExpressionValueIsNotNull(b, "InvUtils.getDep().loginDependency.loginUserName");
        hashMap.put("USER_NAME", b);
        IInvitationModuleDependency a2 = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "InvUtils.getDep()");
        IInvitationModuleDependency.AbstractC40087c loginDependency2 = a2.getLoginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency2, "InvUtils.getDep().loginDependency");
        String d = loginDependency2.mo145588d();
        Intrinsics.checkExpressionValueIsNotNull(d, "InvUtils.getDep().loginDependency.loginTenantName");
        hashMap.put("TENANT_NAME", d);
        hashMap.put("TEAM_CODE", this.f102476c);
        return hashMap;
    }

    public InviteConstantKeyImageDataParser(Bitmap bitmap, String str) {
        Intrinsics.checkParameterIsNotNull(bitmap, "teamCodeQrBitmap");
        Intrinsics.checkParameterIsNotNull(str, "teamCode");
        this.f102475b = bitmap;
        this.f102476c = str;
    }

    @Override // com.ss.android.lark.inv.export.util.C40111j.C40114a
    /* renamed from: h */
    public Bitmap mo145687h(int i, int i2) {
        Bitmap bitmap = this.f102475b;
        if (bitmap == null) {
            bitmap = C40102d.m159001a(this.f102474a);
        }
        if (bitmap != null) {
            return Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        return null;
    }

    public InviteConstantKeyImageDataParser(ImageView imageView, String str) {
        Intrinsics.checkParameterIsNotNull(imageView, "qrIv");
        Intrinsics.checkParameterIsNotNull(str, "teamCode");
        this.f102474a = imageView;
        this.f102476c = str;
    }
}
