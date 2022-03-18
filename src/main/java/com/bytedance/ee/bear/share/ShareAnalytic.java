package com.bytedance.ee.bear.share;

import android.os.RemoteException;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13607e;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0004H\u0007J0\u0010+\u001a\u00020(2\b\u0010/\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u00042\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000101H\u0007J$\u00102\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u00020\u0004H\u0007J.\u00102\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u00103\u001a\u0004\u0018\u00010\u00042\u0006\u00104\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040 X\u0004¢\u0006\u0004\n\u0002\u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b$\u0010%¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/share/ShareAnalytic;", "", "()V", "ANYONE_WITH_LINK_CAN_EDIT", "", "ANYONE_WITH_LINK_CAN_VIEW", "COLLEAGUES_WITH_LINK_CAN_EDIT", "COLLEAGUES_WITH_LINK_CAN_VIEW", "MODULE_DOCS", "MODULE_FOLDER", "PERMISSION_TYPE", "RELEGATED_FLAG", "RELEGATED_FLAG_BOTH_BANNED", "RELEGATED_FLAG_NORMAL", "RELEGATED_FLAG_ONLY_SHARE_CHANNEL_BANNED", "SHARE_SOURCE_DOCS_PAGE", "SHARE_SOURCE_LEFT_SLIDE", "TAG", "TO_PLATFORM", "TURN_OFF_LINK_SHARING", "accountService", "Lcom/bytedance/ee/bear/contract/LocalAccountService;", "getAccountService", "()Lcom/bytedance/ee/bear/contract/LocalAccountService;", "accountService$delegate", "Lkotlin/Lazy;", "analyticService", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "getAnalyticService", "()Lcom/bytedance/ee/bear/contract/AnalyticService;", "analyticService$delegate", "eventArray", "", "[Ljava/lang/String;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "reportClickShareBtn", "", "fileType", "fileId", "reportDocInfoEvent", "docInfo", "Lcom/bytedance/ee/bear/share/IShareInfo;", "eventName", "shareInfo", "extEntry", "", "reportShareAction", ShareHitPoint.f121868c, "toPlatform", "relegatedFlag", "share-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.share.c */
public final class ShareAnalytic {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f29612a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ShareAnalytic.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ShareAnalytic.class), "analyticService", "getAnalyticService()Lcom/bytedance/ee/bear/contract/AnalyticService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ShareAnalytic.class), "accountService", "getAccountService()Lcom/bytedance/ee/bear/contract/LocalAccountService;"))};

    /* renamed from: b */
    public static final ShareAnalytic f29613b = new ShareAnalytic();

    /* renamed from: c */
    private static final String[] f29614c = {"share", "click_add_collaborate", "click_invite_search_bar", "click_collaborate_inviter_next_step", "click_select_perm_inviter", "click_alter_collaborate_perm", "click_send_invite_btn"};

    /* renamed from: d */
    private static final Lazy f29615d = LazyKt.lazy(C10998c.INSTANCE);

    /* renamed from: e */
    private static final Lazy f29616e = LazyKt.lazy(C10997b.INSTANCE);

    /* renamed from: f */
    private static final Lazy f29617f = LazyKt.lazy(C10996a.INSTANCE);

    /* renamed from: a */
    private final AbstractC5233x m45767a() {
        Lazy lazy = f29616e;
        KProperty kProperty = f29612a[1];
        return (AbstractC5233x) lazy.getValue();
    }

    /* renamed from: b */
    private final an m45773b() {
        Lazy lazy = f29617f;
        KProperty kProperty = f29612a[2];
        return (an) lazy.getValue();
    }

    private ShareAnalytic() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/AnalyticService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.c$b */
    static final class C10997b extends Lambda implements Function0<AbstractC5233x> {
        public static final C10997b INSTANCE = new C10997b();

        C10997b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC5233x invoke() {
            return C5234y.m21391b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/LocalAccountService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.c$a */
    static final class C10996a extends Lambda implements Function0<an> {
        public static final C10996a INSTANCE = new C10996a();

        C10996a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final an invoke() {
            return (an) KoinJavaComponent.m268613a(an.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.share.c$c */
    static final class C10998c extends Lambda implements Function0<C10917c> {
        public static final C10998c INSTANCE = new C10998c();

        C10998c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m45768a(IShareInfo bVar, String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m45771a(bVar, str, (Map<String, String>) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m45772a(String str, String str2) {
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, "innerpage");
        if (str != null) {
            str3 = str;
        } else {
            str3 = "";
        }
        hashMap.put("module", str3);
        hashMap.put("action", "share");
        if (str == null) {
            str = "";
        }
        hashMap.put("file_type", str);
        String d = C13598b.m55197d(str2);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(fileId)");
        hashMap.put("file_id", d);
        f29613b.m45767a().mo21079a("client_content_management", hashMap);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m45769a(IShareInfo bVar, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "toPlatform");
        m45770a(bVar, str, str2, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m45771a(IShareInfo bVar, String str, Map<String, String> map) {
        boolean z;
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (bVar != null) {
            boolean z2 = false;
            if (bVar.mo41654a().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = "0";
            } else {
                str2 = bVar.mo41654a();
            }
            HashMap hashMap2 = hashMap;
            hashMap2.put("is_owner", String.valueOf(bVar.mo41656c()));
            String d = C13598b.m55197d(bVar.mo41655b());
            Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncri…hareInfo.getCreatorUid())");
            hashMap2.put("create_uid", d);
            hashMap2.put("create_time", str2);
            String b = C13607e.m55248b(Long.parseLong(str2));
            Intrinsics.checkExpressionValueIsNotNull(b, "ReportDateUtils.dateFromTime(createTime.toLong())");
            hashMap2.put("create_date", b);
            String a = C13607e.m55247a(Long.parseLong(str2));
            Intrinsics.checkExpressionValueIsNotNull(a, "ReportDateUtils.dayFromTime(createTime.toLong())");
            hashMap2.put("from_create_date", a);
            String a2 = C8275a.m34050a(bVar.mo41657d());
            Intrinsics.checkExpressionValueIsNotNull(a2, "DocumentType.getDocument…g(shareInfo.getDocType())");
            hashMap2.put("file_type", a2);
            String d2 = C13598b.m55197d(bVar.mo41659e());
            Intrinsics.checkExpressionValueIsNotNull(d2, "EncriptUtils.handleEncri…(shareInfo.getObjToken())");
            hashMap2.put("file_id", d2);
            if (C69043h.m265767b(f29614c, str)) {
                if (bVar.mo41661f().length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    str3 = "";
                } else {
                    str3 = C13598b.m55197d(bVar.mo41661f());
                }
                Intrinsics.checkExpressionValueIsNotNull(str3, "if (shareInfo.getCreator…nfo.getCreatorTenantId())");
                hashMap2.put("file_tenant_id", str3);
                AccountService.Account f = f29613b.m45773b().mo16408f();
                if (f != null) {
                    hashMap2.put("file_is_cross_tenant", String.valueOf(!Intrinsics.areEqual(f.f14592i, bVar.mo41661f())));
                }
            }
        }
        try {
            f29613b.m45767a().mo21079a(str, hashMap);
        } catch (RemoteException unused) {
            C13479a.m54758a("ShareAnalytic", str + " report error");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m45770a(IShareInfo bVar, String str, String str2, String str3) {
        String str4;
        String str5;
        Intrinsics.checkParameterIsNotNull(str2, "toPlatform");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        String str6 = "left_slide";
        if (!Intrinsics.areEqual(str6, str)) {
            str6 = "docs_pages";
        }
        hashMap2.put(ShareHitPoint.f121868c, str6);
        if (bVar != null) {
            str4 = "docs";
        } else {
            str4 = "folder";
        }
        hashMap2.put("module", str4);
        hashMap2.put("to_platform", str2);
        if (str3 != null) {
            hashMap2.put("relegated_flag", str3);
        }
        if (bVar != null) {
            if (bVar.mo41673q()) {
                str5 = "anyone_with_link_can_edit";
            } else if (bVar.mo41672p()) {
                str5 = "anyone_with_link_can_view";
            } else if (bVar.mo41671o()) {
                str5 = "colleagues_with_link_can_edit";
            } else if (bVar.mo41670n()) {
                str5 = "colleagues_with_link_can_view";
            } else {
                str5 = "turn_off_link_sharing";
            }
            hashMap2.put("permission_type", str5);
        }
        C13479a.m54764b("ShareAnalytic", "report share action, " + hashMap);
        m45771a(bVar, "share", hashMap2);
    }
}
