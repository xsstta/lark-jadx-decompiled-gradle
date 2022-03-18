package com.ss.android.lark.contact.impl.statistics;

import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57859q;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b=\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0013\u001a\u00020\u0011H\u0007J\b\u0010\u0014\u001a\u00020\u0011H\u0007J$\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\bH\u0007J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\bH\u0007J\b\u0010\u001c\u001a\u00020\u0011H\u0007J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u000eH\u0007J(\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0007J\b\u0010$\u001a\u00020\u0011H\u0007J\b\u0010%\u001a\u00020\u0011H\u0007J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\b\u0010'\u001a\u00020\u0011H\u0007J\b\u0010(\u001a\u00020\u0011H\u0007J\b\u0010)\u001a\u00020\u0011H\u0007J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\bH\u0007J\b\u0010+\u001a\u00020\u0011H\u0007J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\bH\u0007J\u0010\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\bH\u0007J\b\u00100\u001a\u00020\u0011H\u0007J\u0010\u00101\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\bH\u0007J\b\u00102\u001a\u00020\u0011H\u0007J\b\u00103\u001a\u00020\u0011H\u0007J\u0010\u00104\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\bH\u0007J\u0010\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000eH\u0007J\u0010\u00107\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\bH\u0007J\b\u00108\u001a\u00020\u0011H\u0007J\b\u00109\u001a\u00020\u0011H\u0007J\u0010\u0010:\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u000eH\u0007J\b\u0010<\u001a\u00020\u0011H\u0007J\b\u0010=\u001a\u00020\u0011H\u0007J\b\u0010>\u001a\u00020\u0011H\u0007J\u0018\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u0004H\u0007J\b\u0010B\u001a\u00020\u0011H\u0007J\u0010\u0010C\u001a\u00020\u00112\u0006\u0010D\u001a\u00020\u0004H\u0007J\u0018\u0010E\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\b2\u0006\u0010G\u001a\u00020\u0004H\u0007J\u000e\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u0004J\u000e\u0010J\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u0004J\u0010\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\bH\u0007J\b\u0010M\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/lark/contact/impl/statistics/ContactHitPoint;", "", "()V", "INDEX_JOINED_GROUP", "", "INDEX_MY_CREATED_GROUP", "contactMainClickTargetMap", "", "", "getContactMainClickTargetMap", "()Ljava/util/Map;", "contactMainClickTargetMap$delegate", "Lkotlin/Lazy;", "isAdminUser", "", "getUserType", "invite_member_entry_contact_view", "", "invite_people_entry_contacts_click", "sendClickDepartmentBreadcrumbs", "sendClickDepartmentMore", "sendClickDepartmentOrPerson", "level", "depId", "userId", "sendClickGroupOfJoined", "groupId", "sendClickGroupOfMyCreated", "sendClickHomeDepartment", "sendClickManageInDepartment", "isRootDepartment", "sendClickPickerItem", ShareHitPoint.f121868c, "itemType", "breadcrumbDepth", "order", "sendClickPrivacySetting", "sendClickTrustParty", "sendContactArchitectureClick", "sendContactArchitectureView", "sendContactBotsView", "sendContactCardAdd", "sendContactCardOk", "sendContactCardView", "sendContactEnter", "typeValue", "sendContactExternalClick", "key", "sendContactExternalView", "sendContactGroupClick", "sendContactGroupView", "sendContactGroupsView", "sendContactMainClick", "sendContactMainView", "isAdmin", "sendContactNewClick", "sendContactNewView", "sendContactOrganizationView", "sendCreateGroupSelectContactEvent", "fromExternal", "sendEnterJoinedGroup", "sendEnterMyCreatedGroup", "sendEnterPrivacySetting", "sendInviteAllClick", "parentCount", "bName", "sendSchoolParentContactsClick", "sendSchoolParentNodeClick", "nodeDeep", "sendSchoolParentProfileClick", "toUserId", "userType", "sendSpecialAttentionClick", "focusedChatterNum", "sendSpecialAttentionView", "sendStartInvitation", "from", "sendStartPrivacySetting", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.g.b */
public final class ContactHitPoint {

    /* renamed from: a */
    public static final ContactHitPoint f92900a = new ContactHitPoint();

    /* renamed from: b */
    private static boolean f92901b;

    /* renamed from: c */
    private static final Lazy f92902c = LazyKt.lazy(C35931a.INSTANCE);

    /* renamed from: u */
    private final Map<String, String> m140820u() {
        return (Map) f92902c.getValue();
    }

    private ContactHitPoint() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.g.b$b */
    static final class RunnableC35932b implements Runnable {

        /* renamed from: a */
        public static final RunnableC35932b f92903a = new RunnableC35932b();

        RunnableC35932b() {
        }

        public final void run() {
            Statistics.sendEvent("contact_organization_breadcrumbs_click");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.g.b$c */
    static final class RunnableC35933c implements Runnable {

        /* renamed from: a */
        public static final RunnableC35933c f92904a = new RunnableC35933c();

        RunnableC35933c() {
        }

        public final void run() {
            Statistics.sendEvent("contact_organization_more_click");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.g.b$e */
    static final class RunnableC35935e implements Runnable {

        /* renamed from: a */
        public static final RunnableC35935e f92908a = new RunnableC35935e();

        RunnableC35935e() {
        }

        public final void run() {
            Statistics.sendEvent("contact_organization_home_click");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m140783a() {
        Statistics.sendEvent("contact_organization_view");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m140790b() {
        Statistics.sendEvent("contact_groups_view");
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m140794c() {
        Statistics.sendEvent("contact_contactcards");
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m140797d() {
        Statistics.sendEvent("contact_contactcards_add");
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m140799e() {
        Statistics.sendEvent("contact_bots_view");
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m140801f() {
        Statistics.sendEvent("invite_member_entry_contact_view");
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m140803g() {
        Statistics.sendEvent("invite_people_entry_contacts_click");
    }

    @JvmStatic
    /* renamed from: j */
    public static final void m140809j() {
        Statistics.sendEvent("setting_privacytab_click");
    }

    @JvmStatic
    /* renamed from: p */
    public static final void m140815p() {
        Statistics.sendEvent("contact_trust_party_click");
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m140805h() {
        try {
            Statistics.sendEvent("setting_privacy_title");
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m140807i() {
        Statistics.sendEvent("Visited_Privacy_Setting", new JSONObject().put("origination", "directly_from_system_settings"));
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m140810k() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().submit(RunnableC35932b.f92903a);
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m140811l() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().submit(RunnableC35933c.f92904a);
    }

    @JvmStatic
    /* renamed from: m */
    public static final void m140812m() {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().submit(RunnableC35935e.f92908a);
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m140813n() {
        Statistics.sendEvent("contact_groups_category_click", new JSONObject().put("location", "created"));
    }

    @JvmStatic
    /* renamed from: o */
    public static final void m140814o() {
        Statistics.sendEvent("contact_groups_category_click", new JSONObject().put("location", "joined"));
    }

    @JvmStatic
    /* renamed from: q */
    public static final void m140816q() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("member_type", f92900a.m140821v());
        Statistics.sendEvent("contact_architecture_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: r */
    public static final void m140817r() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("member_type", f92900a.m140821v());
        Statistics.sendEvent("contact_external_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: s */
    public static final void m140818s() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("member_type", f92900a.m140821v());
        Statistics.sendEvent("contact_new_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: t */
    public static final void m140819t() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("member_type", f92900a.m140821v());
        Statistics.sendEvent("contact_group_view", jSONObject);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.g.b$d */
    static final class RunnableC35934d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f92905a;

        /* renamed from: b */
        final /* synthetic */ String f92906b;

        /* renamed from: c */
        final /* synthetic */ String f92907c;

        RunnableC35934d(int i, String str, String str2) {
            this.f92905a = i;
            this.f92906b = str;
            this.f92907c = str2;
        }

        public final void run() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("level", this.f92905a);
            jSONObject.put("department_id", C57859q.m224565a(this.f92906b));
            jSONObject.put("user_id", C57859q.m224565a(this.f92907c));
            Statistics.sendEvent("contact_organization_click", jSONObject);
        }
    }

    /* renamed from: v */
    private final String m140821v() {
        AbstractC35361b a = C35358a.m138143a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ContactModule.getDependency()");
        AbstractC35361b.AbstractC35376o h = a.mo130163h();
        Intrinsics.checkExpressionValueIsNotNull(h, "ContactModule.getDependency().loginDependency");
        if (h.mo130235g()) {
            AbstractC35361b a2 = C35358a.m138143a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "ContactModule.getDependency()");
            AbstractC35361b.AbstractC35376o h2 = a2.mo130163h();
            Intrinsics.checkExpressionValueIsNotNull(h2, "ContactModule.getDependency().loginDependency");
            if (h2.mo130230b()) {
                return "simple_user";
            }
            return "c_user";
        } else if (f92901b) {
            return "admin";
        } else {
            return "member";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.g.b$a */
    static final class C35931a extends Lambda implements Function0<HashMap<String, String>> {
        public static final C35931a INSTANCE = new C35931a();

        C35931a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HashMap<String, String> invoke() {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("architecture", "contact_architecture_view");
            hashMap.put("external", "contact_external_view");
            hashMap.put("new", "contact_new_view");
            hashMap.put("group", "contact_group_view");
            hashMap.put("email", "contact_email_view");
            hashMap.put("add_external", "contact_add_external_view");
            hashMap.put("member_avatar", "profile_main_view");
            hashMap.put("joined_group", "contact_joined_group_view");
            hashMap.put("created_group", "contact_created_group_view");
            hashMap.put("group_avatar", "im_chat_main_view");
            hashMap.put("special_attention", "contact_special_attention_view");
            return hashMap;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m140784a(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("node_deep", i);
        Statistics.sendEvent("core_contacts_click_school_parent_contacts_node", jSONObject);
    }

    /* renamed from: c */
    public final void mo132200c(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("special_attention_num", i);
        Statistics.sendEvent("contact_special_attention_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m140792b(String str) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121868c, str);
        Statistics.sendEvent("contact_contactcards_add_ok", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m140795c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "from");
        Statistics.sendEvent("Invite_External_Contacts_Attempt", new JSONObject().put("origination", str));
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m140798d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "groupId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("location", "created");
        jSONObject.put("group_id", str);
        Statistics.sendEvent("contact_groups_group_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m140800e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "groupId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("location", "joined");
        jSONObject.put("group_id", str);
        Statistics.sendEvent("contact_groups_group_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m140791b(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "architecture_layer");
        jSONObject.put("target", "contact_architecture_member_view");
        jSONObject.put("layer_count", String.valueOf(i));
        Statistics.sendEvent("contact_architecture_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m140796c(boolean z) {
        f92901b = z;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("member_type", f92900a.m140821v());
        Statistics.sendEvent("contact_main_view", jSONObject);
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m140802f(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", f92900a.m140820u().get(str));
        Statistics.sendEvent("contact_main_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m140804g(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", f92900a.m140820u().get(str));
        Statistics.sendEvent("contact_external_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m140806h(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", f92900a.m140820u().get(str));
        Statistics.sendEvent("contact_new_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: i */
    public static final void m140808i(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", str);
        jSONObject.put("target", f92900a.m140820u().get(str));
        Statistics.sendEvent("contact_group_click", jSONObject);
    }

    /* renamed from: d */
    public final void mo132201d(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click", "icon");
        jSONObject.put("target", "profile_main_view");
        jSONObject.put("special_attention_num", i);
        Statistics.sendEvent("contact_special_attention_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m140787a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "typeValue");
        Statistics.sendEvent("contact_enter", new JSONObject().put("enter_type", str));
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m140793b(boolean z) {
        String str;
        JSONObject put = new JSONObject().put("click", "manage");
        if (z) {
            str = "madmin_department_and_user_manage_view";
        } else {
            str = "madmin_sub_department_single_view";
        }
        Statistics.sendEvent("im_contact_architecture_click", put.put("target", str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m140789a(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "externalContactList";
        } else {
            str = "orgStructure";
        }
        Statistics.sendEvent("create_group_select_members", jSONObject.put(ShareHitPoint.f121868c, str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m140785a(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("parent_count", i);
        jSONObject.put("b_name", i2);
        Statistics.sendEvent("core_contact_home_school_contact_invite_parents_remind_all_click", jSONObject);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m140786a(int i, String str, String str2) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().submit(new RunnableC35934d(i, str, str2));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m140788a(String str, String str2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(str2, "itemType");
        Statistics.sendEvent("larkw_picker_item_click", new JSONObject().put(ShareHitPoint.f121868c, str).put("item_type", str2).put("order", i2).put("breadcrumb_depth", i));
    }
}
