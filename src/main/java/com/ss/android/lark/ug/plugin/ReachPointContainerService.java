package com.ss.android.lark.ug.plugin;

import com.google.firebase.messaging.Constants;
import com.squareup.wire.Message;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bf\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ\u001a\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003H&JC\u0010\u0006\u001a\u00020\u0007\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\n0\t\"\u001c\b\u0001\u0010\n*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\f2\u0006\u0010\r\u001a\u0002H\bH&¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H&J3\u0010\u0011\u001a\u0004\u0018\u0001H\b\"\f\b\u0000\u0010\b*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\b0\u0013H&¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0007H&JC\u0010\u0016\u001a\u00020\u0007\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\n0\t\"\u001c\b\u0001\u0010\n*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\f2\u0006\u0010\r\u001a\u0002H\bH&¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H&J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H&J \u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/ug/plugin/ReachPointContainerService;", "", "getReachPointsInfo", "", "", "", "hideReachPoint", "", "RP", "Lcom/ss/android/lark/ug/plugin/ReachPoint;", "DATA", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "reachPoint", "(Lcom/ss/android/lark/ug/plugin/ReachPoint;)V", "reachPointId", "reachPointType", "obtainReachPoint", "reachPointClazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/ss/android/lark/ug/plugin/ReachPoint;", "recycleAllReachPoints", "recycleReachPoint", "setDependency", "dataService", "Lcom/ss/android/lark/ug/plugin/ContainerServiceDependency;", "showReachPoint", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.plugin.e */
public interface ReachPointContainerService {

    /* renamed from: a */
    public static final Companion f141766a = Companion.f141767a;

    /* renamed from: a */
    <RP extends ReachPoint<?>> RP mo195253a(String str, Class<RP> cls);

    /* renamed from: a */
    void mo195254a();

    /* renamed from: a */
    void mo195255a(ContainerServiceDependency aVar);

    /* renamed from: a */
    <RP extends ReachPoint<DATA>, DATA extends Message<?, ?>> void mo195256a(RP rp);

    /* renamed from: a */
    void mo195236a(String str, String str2);

    /* renamed from: a */
    void mo195257a(String str, String str2, byte[] bArr);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/ug/plugin/ReachPointContainerService$Companion;", "", "()V", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.e$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f141767a = new Companion();

        private Companion() {
        }
    }
}
