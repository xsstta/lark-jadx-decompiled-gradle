package com.bytedance.kit.nglynx;

import com.bytedance.kit.nglynx.init.LynxKitBase;
import com.bytedance.kit.nglynx.model.LynxInitData;
import com.bytedance.kit.nglynx.model.LynxModuleWrapper;
import com.bytedance.kit.nglynx.util.DevicesUtil;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.C26908k;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.C26622a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BS\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000eJ\u000e\u0010/\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u001dJ\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003JW\u00106\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007J\u001c\u0010<\u001a\u0002002\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010>J3\u0010\"\u001a\u0002002\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u0002082\u0006\u0010A\u001a\u0002082\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010C¢\u0006\u0002\u0010DJ\t\u0010E\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(¨\u0006F"}, d2 = {"Lcom/bytedance/kit/nglynx/LynxKitInitParams;", "", "lynxModules", "", "", "Lcom/bytedance/kit/nglynx/model/LynxModuleWrapper;", "lynxBehaviors", "", "Lcom/lynx/tasm/behavior/Behavior;", "initData", "Lcom/bytedance/kit/nglynx/model/LynxInitData;", "asyncLayoutParam", "Lcom/bytedance/kit/nglynx/LynxAsyncLayoutParam;", "preloadFonts", "(Ljava/util/Map;Ljava/util/List;Lcom/bytedance/kit/nglynx/model/LynxInitData;Lcom/bytedance/kit/nglynx/LynxAsyncLayoutParam;Ljava/lang/String;)V", "getAsyncLayoutParam", "()Lcom/bytedance/kit/nglynx/LynxAsyncLayoutParam;", "setAsyncLayoutParam", "(Lcom/bytedance/kit/nglynx/LynxAsyncLayoutParam;)V", "globalProps", "getInitData", "()Lcom/bytedance/kit/nglynx/model/LynxInitData;", "setInitData", "(Lcom/bytedance/kit/nglynx/model/LynxInitData;)V", "getLynxBehaviors", "()Ljava/util/List;", "setLynxBehaviors", "(Ljava/util/List;)V", "lynxClientDelegate", "Lcom/lynx/tasm/LynxViewClient;", "lynxGroup", "Lcom/lynx/tasm/LynxGroup;", "getLynxGroup", "()Lcom/lynx/tasm/LynxGroup;", "setLynxGroup", "(Lcom/lynx/tasm/LynxGroup;)V", "lynxGroupName", "getLynxGroupName", "()Ljava/lang/String;", "setLynxGroupName", "(Ljava/lang/String;)V", "getLynxModules", "()Ljava/util/Map;", "setLynxModules", "(Ljava/util/Map;)V", "getPreloadFonts", "setPreloadFonts", "addLynxClientDelegate", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "setGlobalProps", "_globalProps", "", "groupName", "shareGroup", "enableCanvas", "preloadJSPaths", "", "(Ljava/lang/String;ZZ[Ljava/lang/String;)V", "toString", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.c */
public final class LynxKitInitParams {

    /* renamed from: a */
    private C26908k f38546a;

    /* renamed from: b */
    private String f38547b;

    /* renamed from: c */
    private Map<String, Object> f38548c;

    /* renamed from: d */
    private List<AbstractC26911n> f38549d;

    /* renamed from: e */
    private Map<String, LynxModuleWrapper> f38550e;

    /* renamed from: f */
    private List<C26622a> f38551f;

    /* renamed from: g */
    private LynxInitData f38552g;

    /* renamed from: h */
    private LynxAsyncLayoutParam f38553h;

    /* renamed from: i */
    private String f38554i;

    public LynxKitInitParams() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LynxKitInitParams)) {
            return false;
        }
        LynxKitInitParams cVar = (LynxKitInitParams) obj;
        return Intrinsics.areEqual(this.f38550e, cVar.f38550e) && Intrinsics.areEqual(this.f38551f, cVar.f38551f) && Intrinsics.areEqual(this.f38552g, cVar.f38552g) && Intrinsics.areEqual(this.f38553h, cVar.f38553h) && Intrinsics.areEqual(this.f38554i, cVar.f38554i);
    }

    public int hashCode() {
        Map<String, LynxModuleWrapper> map = this.f38550e;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        List<C26622a> list = this.f38551f;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        LynxInitData aVar = this.f38552g;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        LynxAsyncLayoutParam bVar = this.f38553h;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f38554i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "LynxKitInitParams(lynxModules=" + this.f38550e + ", lynxBehaviors=" + this.f38551f + ", initData=" + this.f38552g + ", asyncLayoutParam=" + this.f38553h + ", preloadFonts=" + this.f38554i + ")";
    }

    /* renamed from: a */
    public final C26908k mo53723a() {
        return this.f38546a;
    }

    /* renamed from: b */
    public final String mo53728b() {
        return this.f38547b;
    }

    /* renamed from: c */
    public final Map<String, Object> mo53730c() {
        return this.f38548c;
    }

    /* renamed from: d */
    public final List<AbstractC26911n> mo53731d() {
        return this.f38549d;
    }

    /* renamed from: e */
    public final Map<String, LynxModuleWrapper> mo53732e() {
        return this.f38550e;
    }

    /* renamed from: f */
    public final List<C26622a> mo53734f() {
        return this.f38551f;
    }

    /* renamed from: g */
    public final LynxInitData mo53735g() {
        return this.f38552g;
    }

    /* renamed from: h */
    public final LynxAsyncLayoutParam mo53736h() {
        return this.f38553h;
    }

    /* renamed from: i */
    public final String mo53738i() {
        return this.f38554i;
    }

    /* renamed from: a */
    public final void mo53724a(LynxInitData aVar) {
        this.f38552g = aVar;
    }

    /* renamed from: b */
    public final void mo53729b(Map<String, LynxModuleWrapper> map) {
        this.f38550e = map;
    }

    /* renamed from: a */
    public final void mo53725a(AbstractC26911n nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "lynxClientDelegate");
        this.f38549d.add(nVar);
    }

    /* renamed from: a */
    public final void mo53726a(List<C26622a> list) {
        this.f38551f = list;
    }

    /* renamed from: a */
    public final void mo53727a(Map<String, ? extends Object> map) {
        if (map != null) {
            this.f38548c.putAll(map);
        }
    }

    public LynxKitInitParams(Map<String, LynxModuleWrapper> map, List<C26622a> list, LynxInitData aVar, LynxAsyncLayoutParam bVar, String str) {
        this.f38550e = map;
        this.f38551f = list;
        this.f38552g = aVar;
        this.f38553h = bVar;
        this.f38554i = str;
        LynxEnv e = LynxEnv.m96123e();
        Intrinsics.checkExpressionValueIsNotNull(e, "LynxEnv.inst()");
        this.f38548c = MapsKt.mutableMapOf(TuplesKt.to("lynxSdkVersion", e.mo94114s()), TuplesKt.to("screenWidth", Integer.valueOf(DevicesUtil.f38615a.mo53819a((double) DevicesUtil.f38615a.mo53822b(LynxKitBase.f38578b.mo53777a()), LynxKitBase.f38578b.mo53777a()))), TuplesKt.to("screenHeight", Integer.valueOf(DevicesUtil.f38615a.mo53819a((double) DevicesUtil.f38615a.mo53820a(LynxKitBase.f38578b.mo53777a()), LynxKitBase.f38578b.mo53777a()))), TuplesKt.to("statusBarHeight", Integer.valueOf(DevicesUtil.f38615a.mo53819a((double) DevicesUtil.f38615a.mo53824c(LynxKitBase.f38578b.mo53777a()), LynxKitBase.f38578b.mo53777a()))), TuplesKt.to("deviceModel", DevicesUtil.f38615a.mo53821a()), TuplesKt.to("os", DevicesUtil.f38615a.mo53825c()), TuplesKt.to("osVersion", DevicesUtil.f38615a.mo53823b()), TuplesKt.to("language", DevicesUtil.f38615a.mo53826d()));
        this.f38549d = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LynxKitInitParams(Map map, List list, LynxInitData aVar, LynxAsyncLayoutParam bVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : bVar, (i & 16) != 0 ? null : str);
    }
}
