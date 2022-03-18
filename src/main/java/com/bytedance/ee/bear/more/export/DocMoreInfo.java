package com.bytedance.ee.bear.more.export;

import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.DocObjInfo;
import com.bytedance.ee.bear.TableSimpleInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DefaultDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0002\u0010\u0015J\b\u0010&\u001a\u00020\tH\u0016J\b\u0010'\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\u0015\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\u0015\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010*J\u0006\u00100\u001a\u00020\fJ\u0006\u00101\u001a\u00020\u0010J\b\u00102\u001a\u00020\u0005H\u0016J\u0015\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010*J\b\u00104\u001a\u00020\u0005H\u0016J\u0006\u00105\u001a\u00020\u0012J\b\u00106\u001a\u00020\u0003H\u0016J\b\u00107\u001a\u00020\u0005H\u0016J\b\u00108\u001a\u0004\u0018\u00010\u001fJ\b\u00109\u001a\u00020\u0005H\u0016J\b\u0010:\u001a\u00020\u0003H\u0016J\u0006\u0010;\u001a\u00020!J\b\u0010<\u001a\u00020\u0005H\u0016J\b\u0010=\u001a\u00020\u0005H\u0016J\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%J\b\u0010?\u001a\u00020\u0005H\u0016J\b\u0010@\u001a\u00020\u0005H\u0016J\b\u0010A\u001a\u00020\u0003H\u0016J\b\u0010B\u001a\u00020\u0005H\u0016J\u0006\u0010C\u001a\u00020\tJ\b\u0010D\u001a\u00020\tH\u0016J\b\u0010E\u001a\u00020\tH\u0016J\b\u0010F\u001a\u00020\tH\u0016J\u0006\u0010\u001b\u001a\u00020\tJ\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010G\u001a\u00020\tH\u0016J\b\u0010H\u001a\u00020\tH\u0016J\u0006\u0010\u001c\u001a\u00020\tJ\b\u0010I\u001a\u00020\tH\u0016J\b\u0010J\u001a\u00020\tH\u0016J\b\u0010K\u001a\u00020\tH\u0016J\b\u0010L\u001a\u00020\tH\u0016J\b\u0010M\u001a\u00020\tH\u0016J\u001b\u0010N\u001a\u00020O2\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017¢\u0006\u0002\u0010QJ\u000e\u0010R\u001a\u00020O2\u0006\u0010S\u001a\u00020\tJ\u001b\u0010T\u001a\u00020O2\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017¢\u0006\u0002\u0010QJ\u0010\u0010U\u001a\u00020O2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010V\u001a\u00020O2\u0006\u0010\b\u001a\u00020\tH\u0016J\u001b\u0010W\u001a\u00020O2\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017¢\u0006\u0002\u0010QJ\u0010\u0010X\u001a\u00020O2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010Y\u001a\u00020O2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u000e\u0010Z\u001a\u00020O2\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010[\u001a\u00020O2\u0006\u0010\\\u001a\u00020]J\u0010\u0010^\u001a\u00020O2\u0006\u0010J\u001a\u00020\tH\u0016J\u000e\u0010_\u001a\u00020O2\u0006\u0010`\u001a\u00020!J\u0010\u0010a\u001a\u00020O2\u0006\u0010L\u001a\u00020\tH\u0016J\u001e\u0010b\u001a\u00020O2\u0016\u0010c\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%J\u000e\u0010d\u001a\u00020O2\u0006\u0010e\u001a\u00020!R\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017X\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017X\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017X\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0013\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/bytedance/ee/bear/more/export/DocMoreInfo;", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", ShareHitPoint.f121869d, "", "url", "", "token", "parentToken", "isFeedShortcut", "", "isManualOffline", "docMetaInfo", "Lcom/bytedance/ee/bear/DocMetaInfo;", "docObjInfo", "Lcom/bytedance/ee/bear/DocObjInfo;", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/DocVersion;", "isAtVc", "isWikiV2", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/bytedance/ee/bear/DocMetaInfo;Lcom/bytedance/ee/bear/DocObjInfo;Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;Lcom/bytedance/ee/bear/list/dto/DocVersion;ZZ)V", "badgeItemsByJSMsg", "", "[Ljava/lang/String;", "disabledItemsByJSMsg", "invisibleItemsByJSMsg", "isDeleted", "isPro", "isShortCut", "parentPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "shortcutUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "tableList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/TableSimpleInfo;", "Lkotlin/collections/ArrayList;", "canMangePermissionMeta", "canOperateEntity", "getAppId", "getBadgeItemsByJSMsg", "()[Ljava/lang/String;", "getCreateTime", "getCreatorName", "getCreatorTenantId", "getCreatorUid", "getDisabledItemsByJSMsg", "getDocMetaInfo", "getDocPermission", "getIconUrl", "getInvisibleItemsByJSMsg", "getOwnerName", "getOwnerType", "getOwnerTypeValue", "getOwnerUid", "getParentPermission", "getParentToken", "getRealType", "getShortcutPermission", "getSpaceId", "getSubType", "getTableList", "getTitle", "getToken", "getType", "getUrl", "isAtVC", "isCanCopy", "isCanEdit", "isCanExport", "isOwner", "isPined", "isShareFolder", "isShortcut", "isStared", "isSubscribe", "isWikiVersionV2", "setBadgeItemsByJSMsg", "", "items", "([Ljava/lang/String;)V", "setDeleted", "deleted", "setDisabledItemsByJSMsg", "setDocPermission", "setFeedShortcut", "setInvisibleItemsByJSMsg", "setManualOffline", "setParentPermission", "setPro", "setPublicPermission", "publicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "setShortcut", "setShortcutPermission", "shortcutPermission", "setSubscribe", "setTableList", "tables", "setUserPermission", "userPermission", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.export.a */
public class DocMoreInfo implements IMoreInfo {

    /* renamed from: a */
    private boolean f27542a;

    /* renamed from: b */
    private boolean f27543b;

    /* renamed from: c */
    private IDocUserPermission f27544c;

    /* renamed from: d */
    private ShareFolderUserPermission f27545d;

    /* renamed from: e */
    private String[] f27546e;

    /* renamed from: f */
    private String[] f27547f;

    /* renamed from: g */
    private String[] f27548g;

    /* renamed from: h */
    private boolean f27549h;

    /* renamed from: i */
    private ArrayList<TableSimpleInfo> f27550i;

    /* renamed from: j */
    private final int f27551j;

    /* renamed from: k */
    private final String f27552k;

    /* renamed from: l */
    private final String f27553l;

    /* renamed from: m */
    private final String f27554m;

    /* renamed from: n */
    private boolean f27555n;

    /* renamed from: o */
    private boolean f27556o;

    /* renamed from: p */
    private final DocMetaInfo f27557p;

    /* renamed from: q */
    private final DocObjInfo f27558q;

    /* renamed from: r */
    private DocPermission f27559r;

    /* renamed from: s */
    private final DocVersion f27560s;

    /* renamed from: t */
    private final boolean f27561t;

    /* renamed from: u */
    private final boolean f27562u;

    public DocMoreInfo() {
        this(0, null, null, null, false, false, null, null, null, null, false, false, 4095, null);
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: E */
    public boolean mo39009E() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: z */
    public String mo39059z() {
        return "";
    }

    /* renamed from: A */
    public final DocPermission mo39005A() {
        return this.f27559r;
    }

    /* renamed from: B */
    public final boolean mo39006B() {
        return this.f27543b;
    }

    /* renamed from: C */
    public final DocMetaInfo mo39007C() {
        return this.f27557p;
    }

    /* renamed from: D */
    public final boolean mo39008D() {
        return this.f27561t;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: F */
    public boolean mo39010F() {
        return this.f27542a;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: G */
    public String[] mo39011G() {
        return this.f27546e;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: H */
    public String[] mo39012H() {
        return this.f27547f;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: I */
    public String[] mo39013I() {
        return this.f27548g;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: J */
    public boolean mo39014J() {
        return this.f27562u;
    }

    /* renamed from: K */
    public final ShareFolderUserPermission mo39015K() {
        return this.f27545d;
    }

    /* renamed from: L */
    public final boolean mo39016L() {
        return this.f27549h;
    }

    /* renamed from: M */
    public final ArrayList<TableSimpleInfo> mo39017M() {
        return this.f27550i;
    }

    /* renamed from: N */
    public final IDocUserPermission mo39018N() {
        return this.f27544c;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: e */
    public int mo39036e() {
        return this.f27551j;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: g */
    public String mo39040g() {
        return this.f27552k;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: h */
    public String mo39041h() {
        return this.f27553l;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: n */
    public String mo39047n() {
        return this.f27554m;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: u */
    public boolean mo39054u() {
        return this.f27556o;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: v */
    public boolean mo39055v() {
        return this.f27555n;
    }

    /* renamed from: y */
    public final DocVersion mo39058y() {
        return this.f27560s;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: c */
    public int mo39031c() {
        return this.f27560s.getOwnerType();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: d */
    public boolean mo39035d() {
        return this.f27558q.isSubscribed();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: f */
    public String mo39038f() {
        return this.f27557p.getSubType();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: i */
    public String mo39042i() {
        return this.f27557p.getTitle();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: j */
    public String mo39043j() {
        return this.f27557p.getOwnerUid();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: k */
    public String mo39044k() {
        return this.f27557p.getOwnerName();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: l */
    public String mo39045l() {
        return this.f27557p.getCreatorUid();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: m */
    public String mo39046m() {
        return this.f27557p.getCreatorTenantId();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: s */
    public boolean mo39052s() {
        return this.f27557p.isPined();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: t */
    public boolean mo39053t() {
        return this.f27557p.isStared();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: w */
    public String mo39056w() {
        return this.f27557p.getAppId();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: o */
    public boolean mo39048o() {
        return this.f27559r.mo38594b().isOwner();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: p */
    public boolean mo39049p() {
        return this.f27559r.mo38591a().canEdit();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: q */
    public boolean mo39050q() {
        return this.f27559r.mo38591a().canCopy();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: r */
    public boolean mo39051r() {
        return this.f27559r.mo38591a().canExport();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: b */
    public boolean mo39030b() {
        return this.f27559r.mo38591a().canManagePermissionMeta();
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: x */
    public int mo39057x() {
        int i = this.f27551j;
        C8275a aVar = C8275a.f22377j;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.WIKI");
        if (i == aVar.mo32555b()) {
            return this.f27557p.getRealType();
        }
        return this.f27551j;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: a */
    public boolean mo39026a() {
        return this.f27559r.mo38591a().canOperateEntity();
    }

    /* renamed from: a */
    public final void mo39022a(ShareFolderUserPermission shareFolderUserPermission) {
        this.f27545d = shareFolderUserPermission;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: b */
    public void mo39028b(boolean z) {
        this.f27555n = z;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: c */
    public void mo39032c(boolean z) {
        this.f27556o = z;
    }

    /* renamed from: d */
    public final void mo39034d(boolean z) {
        this.f27543b = z;
    }

    /* renamed from: f */
    public final void mo39039f(boolean z) {
        this.f27549h = z;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: a */
    public void mo39019a(DocPermission docPermission) {
        Intrinsics.checkParameterIsNotNull(docPermission, "docPermission");
        this.f27559r = docPermission;
    }

    /* renamed from: b */
    public final void mo39027b(IDocUserPermission iDocUserPermission) {
        Intrinsics.checkParameterIsNotNull(iDocUserPermission, "shortcutPermission");
        this.f27544c = iDocUserPermission;
    }

    /* renamed from: e */
    public void mo39037e(boolean z) {
        this.f27542a = z;
    }

    /* renamed from: a */
    public final void mo39020a(IDocPublicPermission iDocPublicPermission) {
        Intrinsics.checkParameterIsNotNull(iDocPublicPermission, "publicPermission");
        this.f27559r.mo38592a(iDocPublicPermission);
    }

    /* renamed from: b */
    public final void mo39029b(String[] strArr) {
        this.f27547f = strArr;
    }

    /* renamed from: c */
    public final void mo39033c(String[] strArr) {
        this.f27548g = strArr;
    }

    /* renamed from: a */
    public final void mo39021a(IDocUserPermission iDocUserPermission) {
        Intrinsics.checkParameterIsNotNull(iDocUserPermission, "userPermission");
        this.f27559r.mo38593a(iDocUserPermission);
    }

    /* renamed from: a */
    public final void mo39023a(ArrayList<TableSimpleInfo> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "tables");
        this.f27550i = arrayList;
    }

    @Override // com.bytedance.ee.bear.more.export.IMoreInfo
    /* renamed from: a */
    public void mo39024a(boolean z) {
        this.f27558q.setSubscribed(z);
    }

    /* renamed from: a */
    public final void mo39025a(String[] strArr) {
        this.f27546e = strArr;
    }

    public DocMoreInfo(int i, String str, String str2, String str3, boolean z, boolean z2, DocMetaInfo docMetaInfo, DocObjInfo docObjInfo, DocPermission docPermission, DocVersion docVersion, boolean z3, boolean z4) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "parentToken");
        Intrinsics.checkParameterIsNotNull(docMetaInfo, "docMetaInfo");
        Intrinsics.checkParameterIsNotNull(docObjInfo, "docObjInfo");
        Intrinsics.checkParameterIsNotNull(docPermission, "docPermission");
        Intrinsics.checkParameterIsNotNull(docVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this.f27551j = i;
        this.f27552k = str;
        this.f27553l = str2;
        this.f27554m = str3;
        this.f27555n = z;
        this.f27556o = z2;
        this.f27557p = docMetaInfo;
        this.f27558q = docObjInfo;
        this.f27559r = docPermission;
        this.f27560s = docVersion;
        this.f27561t = z3;
        this.f27562u = z4;
        this.f27544c = new DefaultDocUserPermission();
        this.f27550i = new ArrayList<>();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DocMoreInfo(int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32, boolean r33, com.bytedance.ee.bear.DocMetaInfo r34, com.bytedance.ee.bear.DocObjInfo r35, com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission r36, com.bytedance.ee.bear.list.dto.DocVersion r37, boolean r38, boolean r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.more.export.DocMoreInfo.<init>(int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, com.bytedance.ee.bear.DocMetaInfo, com.bytedance.ee.bear.DocObjInfo, com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission, com.bytedance.ee.bear.list.dto.DocVersion, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
