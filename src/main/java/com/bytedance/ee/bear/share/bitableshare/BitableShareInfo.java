package com.bytedance.ee.bear.share.bitableshare;

import com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission;
import com.bytedance.ee.bear.share.IShareInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/share/bitableshare/BitableShareInfo;", "Lcom/bytedance/ee/bear/share/IShareInfo;", "token", "", ShareHitPoint.f121869d, "", "bitableSharePermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;", "(Ljava/lang/String;ILcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;)V", "getBitableSharePermission", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/form/BitableSharePermission;", "getToken", "()Ljava/lang/String;", "getType", "()I", "adminCanCross", "", "canExport", "canShare", "enablePermSet", "externalAccess", "getCreateTimeStr", "getCreatorTenantId", "getCreatorUid", "getDocType", "getObjToken", "getRequestToken", "getUserPerm", "isLinkShareAnyoneEdit", "isLinkShareAnyoneRead", "isLinkShareClose", "isLinkShareInternalEdit", "isLinkShareInternalRead", "isOwner", "isSingleContainer", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.bitableshare.c */
public final class BitableShareInfo implements IShareInfo {

    /* renamed from: a */
    private final String f29608a;

    /* renamed from: b */
    private final int f29609b;

    /* renamed from: c */
    private final BitableSharePermission f29610c;

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: a */
    public String mo41654a() {
        return "";
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: b */
    public String mo41655b() {
        return "";
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: c */
    public boolean mo41656c() {
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: f */
    public String mo41661f() {
        return "";
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: g */
    public boolean mo41662g() {
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: h */
    public boolean mo41663h() {
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: k */
    public boolean mo41667k() {
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: l */
    public boolean mo41668l() {
        return true;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: n */
    public boolean mo41670n() {
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: p */
    public boolean mo41672p() {
        return false;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: d */
    public int mo41657d() {
        return this.f29609b;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: e */
    public String mo41659e() {
        return this.f29608a;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: i */
    public String mo41665i() {
        return this.f29608a;
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: j */
    public boolean mo41666j() {
        return mo41656c();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: r */
    public boolean mo41674r() {
        return IShareInfo.C10990a.m45697a(this);
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: m */
    public boolean mo41669m() {
        return this.f29610c.mo38769a().canShare();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: o */
    public boolean mo41671o() {
        return this.f29610c.mo38771b().isLinkShareInternalEdit();
    }

    @Override // com.bytedance.ee.bear.share.IShareInfo
    /* renamed from: q */
    public boolean mo41673q() {
        return this.f29610c.mo38771b().isLinkShareAnyoneEdit();
    }

    public BitableShareInfo(String str, int i, BitableSharePermission bitableSharePermission) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(bitableSharePermission, "bitableSharePermission");
        this.f29608a = str;
        this.f29609b = i;
        this.f29610c = bitableSharePermission;
    }
}
