package com.ss.android.lark.inv.export.util;

import android.os.SystemClock;
import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002#$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J`\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002J \u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002J0\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0007J0\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00042\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J:\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00042\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0007JX\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00042\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0007J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r`\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/inv/export/util/InvApmUtils;", "", "()V", "P_COST", "", "P_ERROR_CODE", "P_ERROR_MSG", "P_SUCCEED", "millisMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "transMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/inv/export/util/InvApmUtils$AppreciableBean;", "Lkotlin/collections/HashMap;", "appendCostIfNeeded", "", "", "serviceName", "category", "metric", "extraLog", "getJsonFromMap", "Lorg/json/JSONObject;", "map", "monitor", "", "succeed", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "monitorStart", "AppreciableBean", "GetDataCallback", "core_invitation_export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inv.export.util.b */
public final class InvApmUtils {

    /* renamed from: a */
    public static final InvApmUtils f101925a = new InvApmUtils();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Long> f101926b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final HashMap<String, AppreciableBean> f101927c;

    @JvmStatic
    /* renamed from: a */
    public static final void m158959a(String str, ErrorResult errorResult) {
        m158963a(str, (Map) null, errorResult, 2, (Object) null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m158960a(String str, Map<String, ? extends Object> map) {
        m158966a(str, map, null, null, 12, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m158964a(String str, Map<String, ? extends Object> map, Map<String, ? extends Number> map2) {
        m158966a(str, map, map2, null, 8, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m158967a(String str, boolean z) {
        m158969a(str, z, (Map) null, 4, (Object) null);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m158971b(String str) {
        m158966a(str, null, null, null, 14, null);
    }

    private InvApmUtils() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m158969a(String str, boolean z, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        m158968a(str, z, map);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m158968a(String str, boolean z, Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "serviceName");
        Map mapOf = MapsKt.mapOf(TuplesKt.to("succeed", Boolean.valueOf(z)));
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        m158965a(str, MapsKt.plus(mapOf, map), (Map<String, ? extends Number>) null, (Map<String, ? extends Object>) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001JP\u0010\u0012\u001a\u00020\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0007J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0016J\t\u0010!\u001a\u00020\u001fHÖ\u0001J\u0006\u0010\"\u001a\u00020\u0013J\t\u0010#\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\r¨\u0006$"}, d2 = {"Lcom/ss/android/lark/inv/export/util/InvApmUtils$AppreciableBean;", "", "appreciable", "Lcom/ss/android/lark/inv/export/util/InvAppreciableUtils$BaseAppreciable;", "event", "Lcom/ss/android/lark/appreciablelib/Event;", "isNeedNet", "", "(Lcom/ss/android/lark/inv/export/util/InvAppreciableUtils$BaseAppreciable;Lcom/ss/android/lark/appreciablelib/Event;Z)V", "getAppreciable", "()Lcom/ss/android/lark/inv/export/util/InvAppreciableUtils$BaseAppreciable;", "getEvent", "()Lcom/ss/android/lark/appreciablelib/Event;", "()Z", "component1", "component2", "component3", "copy", "end", "", "extra", "", "", "extraMetric", "extraCategory", "equals", "other", "error", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "hashCode", "start", "toString", "core_invitation_export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inv.export.util.b$a */
    public static final class AppreciableBean {

        /* renamed from: a */
        private final InvAppreciableUtils.BaseAppreciable f101928a;

        /* renamed from: b */
        private final Event f101929b;

        /* renamed from: c */
        private final boolean f101930c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppreciableBean)) {
                return false;
            }
            AppreciableBean aVar = (AppreciableBean) obj;
            return Intrinsics.areEqual(this.f101928a, aVar.f101928a) && Intrinsics.areEqual(this.f101929b, aVar.f101929b) && this.f101930c == aVar.f101930c;
        }

        public int hashCode() {
            InvAppreciableUtils.BaseAppreciable aVar = this.f101928a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            Event event = this.f101929b;
            if (event != null) {
                i = event.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f101930c;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            return i2 + i3;
        }

        public String toString() {
            return "AppreciableBean(appreciable=" + this.f101928a + ", event=" + this.f101929b + ", isNeedNet=" + this.f101930c + ")";
        }

        /* renamed from: a */
        public final void mo145647a() {
            this.f101928a.mo145668a(this.f101929b, this.f101930c);
        }

        /* renamed from: a */
        public final void mo145648a(int i, String str) {
            this.f101928a.mo145664a(this.f101929b, i, str, this.f101930c);
        }

        /* renamed from: a */
        public final void mo145649a(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
            this.f101928a.mo145667a(this.f101929b, map, map2, map3);
        }

        public AppreciableBean(InvAppreciableUtils.BaseAppreciable aVar, Event event, boolean z) {
            Intrinsics.checkParameterIsNotNull(aVar, "appreciable");
            Intrinsics.checkParameterIsNotNull(event, "event");
            this.f101928a = aVar;
            this.f101929b = event;
            this.f101930c = z;
        }
    }

    static {
        HashMap<String, AppreciableBean> hashMap = new HashMap<>();
        f101927c = hashMap;
        hashMap.put("ug_fetch_dy_resource", new AppreciableBean(InvAppreciableUtils.m158979c(), Event.ug_fetch_dy_resource, true));
        hashMap.put("ug_dy_resource_generate_img", new AppreciableBean(InvAppreciableUtils.m158979c(), Event.ug_dy_resource_generate_img, false));
        hashMap.put("contact_opt_local_fetch_timing_ms", new AppreciableBean(InvAppreciableUtils.m158977b(), Event.contact_opt_local_fetch, false));
        hashMap.put("contact_opt_contact_list_timing_ms", new AppreciableBean(InvAppreciableUtils.m158977b(), Event.contact_opt_contact_list_fetch, true));
        hashMap.put("contact_opt_contact_list_fetch_fail", new AppreciableBean(InvAppreciableUtils.m158977b(), Event.contact_opt_contact_list_fetch, true));
        hashMap.put("contact_opt_contact_applications_fetch_timing_ms", new AppreciableBean(InvAppreciableUtils.m158977b(), Event.contact_opt_contact_applications_fetch, true));
        hashMap.put("contact_opt_contact_applications_fetch_fail", new AppreciableBean(InvAppreciableUtils.m158977b(), Event.contact_opt_contact_applications_fetch, true));
        hashMap.put("ug_invite_member_orientation_invite", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.member_orientation_invite, true));
        hashMap.put("ug_invite_member_nondirectional_get_invite_info", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.member_nondirection_get_invite_info, true));
        hashMap.put("ug_invite_member_nondirectional_load_qrcode", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.member_nondirection_load_qrcode, false));
        hashMap.put("ug_invite_member_nondirectional_get_save_or_share_qrcode", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.member_nondirection_get_save_or_share_qr, true));
        hashMap.put("ug_invite_external_nondirectional_get_invite_info", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.external_nondirection_get_invite_info, true));
        hashMap.put("ug_invite_external_nondirectional_load_qrcode", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.external_nondirection_load_qrcode, false));
        hashMap.put("ug_invite_external_nondirectional_get_save_or_share_qrcode", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.external_nondirection_get_save_or_share_qr, true));
        hashMap.put("ug_invite_external_orientation_search", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.external_orientation_search, true));
        hashMap.put("ug_invite_external_orientation_invite", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.external_orientation_invite, true));
        hashMap.put("ug_invite_parent_nondirectional_get_inactive_info", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.parent_nondirection_get_inactive_info, true));
        hashMap.put("ug_invite_parent_nondirectional_get_invite_info", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.parent_nondirection_get_invite_info, true));
        hashMap.put("ug_invite_parent_nondirectional_load_qrcode", new AppreciableBean(InvAppreciableUtils.m158975a(), Event.parent_nondirection_load_qrcode, false));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B7\b\u0007\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/inv/export/util/InvApmUtils$GetDataCallback;", "T", "Lcom/larksuite/framework/callback/IGetDataCallback;", "delegate", "name", "", "category", "", "", "(Lcom/larksuite/framework/callback/IGetDataCallback;Ljava/lang/String;Ljava/util/Map;)V", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "t", "(Ljava/lang/Object;)V", "core_invitation_export_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.inv.export.util.b$b */
    public static final class GetDataCallback<T> implements IGetDataCallback<T> {

        /* renamed from: a */
        private final IGetDataCallback<T> f101931a;

        /* renamed from: b */
        private final String f101932b;

        /* renamed from: c */
        private final Map<String, Object> f101933c;

        public GetDataCallback(IGetDataCallback<T> iGetDataCallback, String str) {
            this(iGetDataCallback, str, null, 4, null);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            IGetDataCallback<T> iGetDataCallback = this.f101931a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(t);
            }
            InvApmUtils.m158968a(this.f101932b, true, (Map<String, ? extends Object>) this.f101933c);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback<T> iGetDataCallback = this.f101931a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            InvApmUtils.m158962a(this.f101932b, this.f101933c, errorResult);
        }

        public GetDataCallback(IGetDataCallback<T> iGetDataCallback, String str, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            this.f101931a = iGetDataCallback;
            this.f101932b = str;
            this.f101933c = map;
            InvApmUtils.m158958a(str);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetDataCallback(IGetDataCallback iGetDataCallback, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(iGetDataCallback, str, (i & 4) != 0 ? null : map);
        }
    }

    /* renamed from: a */
    private final JSONObject m158957a(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m158958a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "serviceName");
        f101926b.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        AppreciableBean aVar = f101927c.get(str);
        if (aVar != null) {
            aVar.mo145647a();
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m158962a(String str, Map<String, ? extends Object> map, ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(str, "serviceName");
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        m158961a(str, map, errorResult.getErrorCode(), errorResult.getDebugMsg());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<java.lang.String, ? extends java.lang.Number> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final Map<String, Number> m158970b(String str, Map<String, ? extends Object> map, Map<String, ? extends Number> map2, Map<String, ? extends Object> map3) {
        Object obj;
        Object obj2;
        Map<String, Number> map4;
        ConcurrentHashMap<String, Long> concurrentHashMap = f101926b;
        Long l = concurrentHashMap.get(str);
        Object obj3 = null;
        if (map != null) {
            obj = map.get("error_code");
        } else {
            obj = null;
        }
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            AppreciableBean aVar = f101927c.get(str);
            if (aVar == null) {
                return map2;
            }
            int intValue = num.intValue();
            if (map3 != null) {
                obj2 = map3.get("error_msg");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                obj3 = obj2;
            }
            aVar.mo145648a(intValue, (String) obj3);
            return map2;
        } else if (l == null) {
            return map2;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            if (map2 == 0) {
                map4 = MapsKt.mapOf(TuplesKt.to("cost", Long.valueOf(elapsedRealtime)));
            } else {
                MapsKt.plus(map2, new Pair("cost", Long.valueOf(elapsedRealtime)));
                map4 = map2;
            }
            concurrentHashMap.remove(str);
            AppreciableBean aVar2 = f101927c.get(str);
            if (aVar2 != null) {
                aVar2.mo145649a(map3, map2, map);
            }
            return map4;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m158961a(String str, Map<String, ? extends Object> map, int i, String str2) {
        Map map2;
        Intrinsics.checkParameterIsNotNull(str, "serviceName");
        Map mapOf = MapsKt.mapOf(TuplesKt.to("succeed", false), TuplesKt.to("error_code", Integer.valueOf(i)));
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Map plus = MapsKt.plus(mapOf, map);
        if (str2 == null) {
            map2 = null;
        } else {
            map2 = MapsKt.mapOf(TuplesKt.to("error_msg", str2));
        }
        m158965a(str, plus, (Map<String, ? extends Number>) null, map2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m158965a(String str, Map<String, ? extends Object> map, Map<String, ? extends Number> map2, Map<String, ? extends Object> map3) {
        Intrinsics.checkParameterIsNotNull(str, "serviceName");
        InvApmUtils bVar = f101925a;
        ApmAgent.monitorEvent(str, bVar.m158957a(map), bVar.m158957a(bVar.m158970b(str, map, map2, map3)), bVar.m158957a(map3));
    }

    /* renamed from: a */
    public static /* synthetic */ void m158963a(String str, Map map, ErrorResult errorResult, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        m158962a(str, map, errorResult);
    }

    /* renamed from: a */
    public static /* synthetic */ void m158966a(String str, Map map, Map map2, Map map3, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        if ((i & 8) != 0) {
            map3 = null;
        }
        m158965a(str, map, map2, map3);
    }
}
