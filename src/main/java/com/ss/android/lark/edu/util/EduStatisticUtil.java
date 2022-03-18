package com.ss.android.lark.edu.util;

import com.ss.android.lark.edu.EduModule;
import com.ss.android.lark.edu.p1822a.AbstractC36920a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.statistics.Statistics;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0018\u001a\u00020\u0013H\u0007J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u0004\u0018\u00010\u00048FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/edu/util/EduStatisticUtil;", "", "()V", "CATEGORY", "", "CONTENT", "COUNT", "GROUP_ID", "MODE", "MODE_PUBLIC", "RESULT", "TYPE", "TYPE_GROUP_CHAT", "tenantId", "getTenantId", "()Ljava/lang/String;", "tenantId$delegate", "Lkotlin/Lazy;", "sendCreateEduGroupEvent", "", "chatId", "err", "", "sendEnterGroupEvent", "sendGoCreateEduGroupEvent", "sendSaveGroupNameEvent", "groupName", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.d.b */
public final class EduStatisticUtil {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f95001a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EduStatisticUtil.class), "tenantId", "getTenantId()Ljava/lang/String;"))};

    /* renamed from: b */
    public static final EduStatisticUtil f95002b = new EduStatisticUtil();

    /* renamed from: c */
    private static final Lazy f95003c = LazyKt.lazy(C36957a.INSTANCE);

    private EduStatisticUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m145870a() {
        Statistics.sendEvent("im_chat_goto_create_click");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.d.b$a */
    static final class C36957a extends Lambda implements Function0<String> {
        public static final C36957a INSTANCE = new C36957a();

        C36957a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            AbstractC36920a.AbstractC36921a a;
            AbstractC36920a b = EduModule.f94921b.mo136305b();
            if (b == null || (a = b.mo136299a()) == null) {
                return null;
            }
            return a.mo136301a();
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m145873b(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("group_id", str);
        Statistics.sendEvent("im_chat_enter_group_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m145871a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "groupName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", str);
        jSONObject.put("count", str.length());
        Statistics.sendEvent("im_chat_edit_group_name_save", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m145872a(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", String.valueOf(i));
        jSONObject.put(ShareHitPoint.f121869d, "group_chat");
        jSONObject.put("group_id", str);
        jSONObject.put("mode", "public");
        jSONObject.put("category", "school_parent");
        Statistics.sendEvent("im_chat_create_now_click", jSONObject);
    }
}
