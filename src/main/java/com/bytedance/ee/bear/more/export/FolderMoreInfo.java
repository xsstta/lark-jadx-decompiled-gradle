package com.bytedance.ee.bear.more.export;

import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010¢\u0006\u0002\u0010\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\u0006\u0010&\u001a\u00020\u0014J\b\u0010'\u001a\u00020\u0003H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0003H\u0016J\b\u0010+\u001a\u0004\u0018\u00010\u001aJ\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0003H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u0004\u0018\u00010\u001cJ\b\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020\u0010H\u0016J\b\u00105\u001a\u00020\u0010H\u0016J\u0006\u0010\u0017\u001a\u00020\u0010J\b\u00106\u001a\u00020\u0010H\u0016J\b\u00107\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u00108\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u00020\u0010H\u0016J\b\u0010:\u001a\u00020\u0010H\u0016J\u000e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0010J\u0010\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020<2\u0006\u00106\u001a\u00020\u0010H\u0016J\u0010\u0010B\u001a\u00020<2\u0006\u00107\u001a\u00020\u0010H\u0016J\u0010\u0010C\u001a\u00020<2\u0006\u00108\u001a\u00020\u0010H\u0016J\u000e\u0010D\u001a\u00020<2\u0006\u0010E\u001a\u00020\u001aJ\u0010\u0010F\u001a\u00020<2\u0006\u00109\u001a\u00020\u0010H\u0016J\u0010\u0010G\u001a\u00020<2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/bytedance/ee/bear/more/export/FolderMoreInfo;", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", ShareHitPoint.f121869d, "", "url", "", "token", "title", "ownerUid", "creatorUid", "creatorName", "creatorTenantId", "createTime", "spaceId", "parentToken", "isOwner", "", "isPined", "isStared", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "isShareFolder", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/bytedance/ee/bear/list/dto/FolderVersion;Z)V", "isDeleted", "isShortCut", "shortcutUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "userPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "canMangePermissionMeta", "canOperateEntity", "getAppId", "getCreateTime", "getCreatorName", "getCreatorTenantId", "getCreatorUid", "getIconUrl", "getOwnerName", "getOwnerType", "getOwnerTypeValue", "getOwnerUid", "getParentToken", "getRealType", "getShortcutPermission", "getSpaceId", "getSubType", "getTitle", "getToken", "getType", "getUrl", "getUserPermission", "isCanCopy", "isCanEdit", "isCanExport", "isFeedShortcut", "isManualOffline", "isShortcut", "isSubscribe", "isWikiVersionV2", "setDeleted", "", "deleted", "setDocPermission", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "setFeedShortcut", "setManualOffline", "setShortcut", "setShortcutPermission", "shortcutPermission", "setSubscribe", "setUserPermission", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.export.b */
public final class FolderMoreInfo implements IMoreInfo {

    /* renamed from: a */
    private boolean f27563a;

    /* renamed from: b */
    private boolean f27564b;

    /* renamed from: c */
    private ShareFolderUserPermission f27565c;

    /* renamed from: d */
    private IDocUserPermission f27566d;

    /* renamed from: e */
    private final int f27567e;

    /* renamed from: f */
    private final String f27568f;

    /* renamed from: g */
    private final String f27569g;

    /* renamed from: h */
    private final String f27570h;

    /* renamed from: i */
    private final String f27571i;

    /* renamed from: j */
    private final String f27572j;

    /* renamed from: k */
    private final String f27573k;

    /* renamed from: l */
    private final String f27574l;

    /* renamed from: m */
    private final String f27575m;

    /* renamed from: n */
    private final String f27576n;

    /* renamed from: o */
    private final String f27577o;

    /* renamed from: p */
    private boolean f27578p;

    /* renamed from: q */
    private final boolean f27579q;

    /* renamed from: r */
    private final boolean f27580r;

    /* renamed from: s */
    private final FolderVersion f27581s;

    /* renamed from: t */
    private final boolean f27582t;

    public FolderMoreInfo() {
        this(0, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, 65535, null);
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: J */
    public boolean mo39014J() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: a */
    public void mo39019a(DocPermission docPermission) {
        Intrinsics.checkParameterIsNotNull(docPermission, "docPermission");
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: a */
    public void mo39024a(boolean z) {
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: b */
    public void mo39028b(boolean z) {
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: c */
    public void mo39032c(boolean z) {
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: d */
    public boolean mo39035d() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: f */
    public String mo39038f() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: p */
    public boolean mo39049p() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: q */
    public boolean mo39050q() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: r */
    public boolean mo39051r() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: u */
    public boolean mo39054u() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: v */
    public boolean mo39055v() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: w */
    public String mo39056w() {
        return "";
    }

    /* renamed from: A */
    public final ShareFolderUserPermission mo39060A() {
        return this.f27565c;
    }

    /* renamed from: B */
    public final boolean mo39061B() {
        return this.f27564b;
    }

    /* renamed from: C */
    public final IDocUserPermission mo39062C() {
        return this.f27566d;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: E */
    public boolean mo39009E() {
        return this.f27582t;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: F */
    public boolean mo39010F() {
        return this.f27563a;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: e */
    public int mo39036e() {
        return this.f27567e;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: g */
    public String mo39040g() {
        return this.f27568f;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: h */
    public String mo39041h() {
        return this.f27569g;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: i */
    public String mo39042i() {
        return this.f27570h;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: j */
    public String mo39043j() {
        return this.f27571i;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: k */
    public String mo39044k() {
        return this.f27573k;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: l */
    public String mo39045l() {
        return this.f27572j;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: m */
    public String mo39046m() {
        return this.f27574l;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: n */
    public String mo39047n() {
        return this.f27577o;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: o */
    public boolean mo39048o() {
        return this.f27578p;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: s */
    public boolean mo39052s() {
        return this.f27579q;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: t */
    public boolean mo39053t() {
        return this.f27580r;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: x */
    public int mo39057x() {
        return this.f27567e;
    }

    /* renamed from: y */
    public final FolderVersion mo39067y() {
        return this.f27581s;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: z */
    public String mo39059z() {
        return this.f27576n;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: G */
    public String[] mo39011G() {
        return IMoreInfo.C10210a.m42662a(this);
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: H */
    public String[] mo39012H() {
        return IMoreInfo.C10210a.m42663b(this);
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: I */
    public String[] mo39013I() {
        return IMoreInfo.C10210a.m42664c(this);
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: c */
    public int mo39031c() {
        return this.f27581s.getOwnerType();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: b */
    public boolean mo39030b() {
        boolean z;
        boolean z2 = this.f27578p;
        if (!z2) {
            ShareFolderUserPermission shareFolderUserPermission = this.f27565c;
            if (shareFolderUserPermission != null) {
                z = shareFolderUserPermission.canManagePermissionMeta(z2);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: a */
    public boolean mo39026a() {
        return this.f27578p;
    }

    /* renamed from: a */
    public final void mo39064a(ShareFolderUserPermission shareFolderUserPermission) {
        this.f27565c = shareFolderUserPermission;
    }

    /* renamed from: d */
    public void mo39065d(boolean z) {
        this.f27563a = z;
    }

    /* renamed from: e */
    public final void mo39066e(boolean z) {
        this.f27564b = z;
    }

    /* renamed from: a */
    public final void mo39063a(IDocUserPermission iDocUserPermission) {
        Intrinsics.checkParameterIsNotNull(iDocUserPermission, "shortcutPermission");
        this.f27566d = iDocUserPermission;
    }

    public FolderMoreInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3, FolderVersion folderVersion, boolean z4) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "title");
        Intrinsics.checkParameterIsNotNull(str4, "ownerUid");
        Intrinsics.checkParameterIsNotNull(str5, "creatorUid");
        Intrinsics.checkParameterIsNotNull(str6, "creatorName");
        Intrinsics.checkParameterIsNotNull(str7, "creatorTenantId");
        Intrinsics.checkParameterIsNotNull(str8, "createTime");
        Intrinsics.checkParameterIsNotNull(str9, "spaceId");
        Intrinsics.checkParameterIsNotNull(str10, "parentToken");
        Intrinsics.checkParameterIsNotNull(folderVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this.f27567e = i;
        this.f27568f = str;
        this.f27569g = str2;
        this.f27570h = str3;
        this.f27571i = str4;
        this.f27572j = str5;
        this.f27573k = str6;
        this.f27574l = str7;
        this.f27575m = str8;
        this.f27576n = str9;
        this.f27577o = str10;
        this.f27578p = z;
        this.f27579q = z2;
        this.f27580r = z3;
        this.f27581s = folderVersion;
        this.f27582t = z4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FolderMoreInfo(int r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, boolean r34, boolean r35, com.bytedance.ee.bear.list.dto.FolderVersion r36, boolean r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.more.export.FolderMoreInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, com.bytedance.ee.bear.list.dto.FolderVersion, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
