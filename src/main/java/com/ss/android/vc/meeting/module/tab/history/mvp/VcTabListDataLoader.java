package com.ss.android.vc.meeting.module.tab.history.mvp;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.tab.VCTabListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab/history/mvp/VcTabListDataLoader;", "", "viewDelegate", "Lcom/ss/android/vc/meeting/module/tab/history/mvp/VCTabHistoryViewDelegate;", "(Lcom/ss/android/vc/meeting/module/tab/history/mvp/VCTabHistoryViewDelegate;)V", "mLoadType", "Lcom/ss/android/vc/meeting/module/tab/history/mvp/VcTabListDataLoader$LoadType;", "mViewDelegate", "destroy", "", "getDatas", "", "Lcom/ss/android/vc/entity/tab/VCTabListItem;", "getLoadType", "hasMore", "", "isEmpty", "isLoadMore", "isRefresh", "loadMoreData", ShareHitPoint.f121869d, "resetLoadType", "Companion", "LoadType", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VcTabListDataLoader {

    /* renamed from: a */
    public static final Companion f159624a = new Companion(null);

    /* renamed from: b */
    private C63291e f159625b;

    /* renamed from: c */
    private LoadType f159626c = LoadType.DEFAULT;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab/history/mvp/VcTabListDataLoader$LoadType;", "", "(Ljava/lang/String;I)V", "DEFAULT", "REFRESH", "LOAD_MORE", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum LoadType {
        DEFAULT,
        REFRESH,
        LOAD_MORE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab/history/mvp/VcTabListDataLoader$Companion;", "", "()V", "DATA_LOADER_TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.VcTabListDataLoader$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public final LoadType mo218995g() {
        return this.f159626c;
    }

    /* renamed from: h */
    public final boolean mo218996h() {
        return this.f159625b.mo219034b();
    }

    /* renamed from: a */
    public final void mo218988a() {
        C60700b.m235851b("VideoChatTab_VcTabListDataLoader", "[resetLoadType]", "set default");
        this.f159626c = LoadType.DEFAULT;
    }

    /* renamed from: b */
    public final void mo218990b() {
        C60700b.m235851b("VideoChatTab_VcTabListDataLoader", "[destroy]", "destroy");
    }

    /* renamed from: c */
    public final List<VCTabListItem> mo218991c() {
        List<VCTabListItem> a = this.f159625b.mo219031a();
        Intrinsics.checkExpressionValueIsNotNull(a, "mViewDelegate.listDatas");
        return a;
    }

    /* renamed from: d */
    public final boolean mo218992d() {
        return CollectionUtils.isEmpty(this.f159625b.mo219031a());
    }

    /* renamed from: e */
    public final boolean mo218993e() {
        if (this.f159626c == LoadType.REFRESH) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo218994f() {
        if (this.f159626c == LoadType.LOAD_MORE) {
            return true;
        }
        return false;
    }

    public VcTabListDataLoader(C63291e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "viewDelegate");
        this.f159625b = eVar;
    }

    /* renamed from: a */
    public final void mo218989a(LoadType loadType) {
        Intrinsics.checkParameterIsNotNull(loadType, ShareHitPoint.f121869d);
        C60700b.m235851b("VideoChatTab_VcTabListDataLoader", "[loadMoreData]", "type= " + loadType);
        this.f159626c = loadType;
        if (loadType == LoadType.LOAD_MORE) {
            if (!mo218996h()) {
                C60700b.m235851b("VideoChatTab_VcTabListDataLoader", "[loadMoreData2]", "No more data.");
                this.f159625b.mo219032a(loadType);
                return;
            }
            this.f159625b.mo219033a(mo218991c().isEmpty(), true);
        } else if (loadType == LoadType.REFRESH) {
            this.f159625b.mo219033a(mo218991c().isEmpty(), false);
        }
    }
}
