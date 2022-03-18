package com.ss.android.lark.ug.plugin;

import com.google.firebase.messaging.Constants;
import com.squareup.wire.Message;
import com.ss.android.lark.pb.ug_reach.MaterialBase;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000 \u0018*\u001c\b\u0000\u0010\u0001*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u00032\u00020\u0004:\u0001\u0018J\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0013H&J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0017R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/ug/plugin/ReachPoint;", "DATA", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "", "reachPointId", "", "getReachPointId", "()Ljava/lang/String;", "decode", "bytes", "", "([B)Lcom/squareup/wire/Message;", "getMaterialBase", "Lcom/ss/android/lark/pb/ug_reach/MaterialBase;", "onCreate", "", "onDestroy", "onHide", "", "onShow", "onUpdateData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/squareup/wire/Message;)V", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.plugin.d */
public interface ReachPoint<DATA extends Message<?, ?>> {

    /* renamed from: d */
    public static final Companion f141764d = Companion.f141765a;

    /* renamed from: c */
    void mo194541c();

    /* renamed from: d */
    boolean mo194542d();

    /* renamed from: e */
    boolean mo194543e();

    /* renamed from: f */
    MaterialBase mo194544f();

    /* renamed from: g */
    void mo194545g();

    /* renamed from: h */
    String mo195214h();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/ug/plugin/ReachPoint$Companion;", "", "()V", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.plugin.d$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f141765a = new Companion();

        private Companion() {
        }
    }
}
