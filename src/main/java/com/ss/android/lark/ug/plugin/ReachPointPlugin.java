package com.ss.android.lark.ug.plugin;

import com.squareup.wire.Message;
import com.ss.android.lark.pb.ug_reach.MaterialBase;
import com.ss.android.lark.ug.plugin.ReachPoint;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u0000 \u0019*\u001c\b\u0000\u0010\u0001*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u0003*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00020\u0006:\u0001\u0019J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\bH&J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\u0015\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/ug/plugin/ReachPointPlugin;", "DATA", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "RP", "Lcom/ss/android/lark/ug/plugin/ReachPoint;", "", "getAvailableReachPoints", "", "getMaterialBase", "Lcom/ss/android/lark/pb/ug_reach/MaterialBase;", "reachPointId", "", "getReachPointType", "obtainReachPoint", "(Ljava/lang/String;)Lcom/ss/android/lark/ug/plugin/ReachPoint;", "onEnterBackground", "", "onEnterForeground", "onHide", "", "onShow", "bytes", "", "recycleReachPoint", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.plugin.g */
public interface ReachPointPlugin<DATA extends Message<?, ?>, RP extends ReachPoint<DATA>> {

    /* renamed from: a */
    public static final Companion f141768a = Companion.f141769a;

    /* renamed from: a */
    RP mo195225a(String str);

    /* renamed from: a */
    String mo195260a();

    /* renamed from: a */
    boolean mo195227a(String str, byte[] bArr);

    /* renamed from: b */
    List<RP> mo195228b();

    /* renamed from: b */
    void mo195229b(String str);

    /* renamed from: c */
    MaterialBase mo195230c(String str);

    /* renamed from: d */
    boolean mo195231d(String str);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/ug/plugin/ReachPointPlugin$Companion;", "", "()V", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.g$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f141769a = new Companion();

        private Companion() {
        }
    }
}
