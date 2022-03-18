package com.bytedance.ee.bear.more.export;

import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0015\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0006H&J\u0015\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0006H&J\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0006H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0006H&J\b\u0010\u0015\u001a\u00020\u0006H&J\b\u0010\u0016\u001a\u00020\u0013H&J\b\u0010\u0017\u001a\u00020\u0006H&J\b\u0010\u0018\u001a\u00020\u0006H&J\b\u0010\u0019\u001a\u00020\u0006H&J\b\u0010\u001a\u001a\u00020\u0006H&J\b\u0010\u001b\u001a\u00020\u0013H&J\b\u0010\u001c\u001a\u00020\u0006H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H&J\b\u0010!\u001a\u00020\u0003H&J\b\u0010\"\u001a\u00020\u0003H&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\b\u0010'\u001a\u00020\u0003H&J\b\u0010(\u001a\u00020\u0003H&J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H&J\u0010\u0010-\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0003H&J\u0010\u0010.\u001a\u00020*2\u0006\u0010!\u001a\u00020\u0003H&J\u0010\u0010/\u001a\u00020*2\u0006\u0010%\u001a\u00020\u0003H&J\u0010\u00100\u001a\u00020*2\u0006\u0010'\u001a\u00020\u0003H&¨\u00061"}, d2 = {"Lcom/bytedance/ee/bear/more/export/IMoreInfo;", "", "canMangePermissionMeta", "", "canOperateEntity", "getAppId", "", "getBadgeItemsByJSMsg", "", "()[Ljava/lang/String;", "getCreateTime", "getCreatorName", "getCreatorTenantId", "getCreatorUid", "getDisabledItemsByJSMsg", "getIconUrl", "getInvisibleItemsByJSMsg", "getOwnerName", "getOwnerTypeValue", "", "getOwnerUid", "getParentToken", "getRealType", "getSpaceId", "getSubType", "getTitle", "getToken", "getType", "getUrl", "isCanCopy", "isCanEdit", "isCanExport", "isFeedShortcut", "isManualOffline", "isOwner", "isPined", "isShareFolder", "isShortcut", "isStared", "isSubscribe", "isWikiVersionV2", "setDocPermission", "", "docPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DocPermission;", "setFeedShortcut", "setManualOffline", "setShortcut", "setSubscribe", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.export.d */
public interface IMoreInfo {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.export.d$a */
    public static final class C10210a {
        /* renamed from: a */
        public static String[] m42662a(IMoreInfo dVar) {
            return null;
        }

        /* renamed from: b */
        public static String[] m42663b(IMoreInfo dVar) {
            return null;
        }

        /* renamed from: c */
        public static String[] m42664c(IMoreInfo dVar) {
            return null;
        }
    }

    /* renamed from: E */
    boolean mo39009E();

    /* renamed from: F */
    boolean mo39010F();

    /* renamed from: G */
    String[] mo39011G();

    /* renamed from: H */
    String[] mo39012H();

    /* renamed from: I */
    String[] mo39013I();

    /* renamed from: J */
    boolean mo39014J();

    /* renamed from: a */
    void mo39019a(DocPermission docPermission);

    /* renamed from: a */
    void mo39024a(boolean z);

    /* renamed from: a */
    boolean mo39026a();

    /* renamed from: b */
    void mo39028b(boolean z);

    /* renamed from: b */
    boolean mo39030b();

    /* renamed from: c */
    int mo39031c();

    /* renamed from: c */
    void mo39032c(boolean z);

    /* renamed from: d */
    boolean mo39035d();

    /* renamed from: e */
    int mo39036e();

    /* renamed from: f */
    String mo39038f();

    /* renamed from: g */
    String mo39040g();

    /* renamed from: h */
    String mo39041h();

    /* renamed from: i */
    String mo39042i();

    /* renamed from: j */
    String mo39043j();

    /* renamed from: k */
    String mo39044k();

    /* renamed from: l */
    String mo39045l();

    /* renamed from: m */
    String mo39046m();

    /* renamed from: n */
    String mo39047n();

    /* renamed from: o */
    boolean mo39048o();

    /* renamed from: p */
    boolean mo39049p();

    /* renamed from: q */
    boolean mo39050q();

    /* renamed from: r */
    boolean mo39051r();

    /* renamed from: s */
    boolean mo39052s();

    /* renamed from: t */
    boolean mo39053t();

    /* renamed from: u */
    boolean mo39054u();

    /* renamed from: v */
    boolean mo39055v();

    /* renamed from: w */
    String mo39056w();

    /* renamed from: x */
    int mo39057x();

    /* renamed from: z */
    String mo39059z();
}
