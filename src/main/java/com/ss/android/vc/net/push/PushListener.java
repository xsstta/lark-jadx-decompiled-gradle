package com.ss.android.vc.net.push;

import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0002\u0010\u0013J*\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0014\u0010\u0019\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\fR\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/vc/net/push/PushListener;", "T", "", "command", "Lcom/bytedance/lark/pb/basic/v1/Command;", "(Lcom/bytedance/lark/pb/basic/v1/Command;)V", "TAG", "", "getCommand", "()Lcom/bytedance/lark/pb/basic/v1/Command;", "onDataListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/vc/net/push/PushListener$DataHandler;", "addHandler", "", "handler", "decode", "request", "", "([B)Ljava/lang/Object;", "onPush", "sid", "fromServerPipe", "", "offlinePush", "removeHandler", "DataHandler", "lib_vc_network_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.net.push.a */
public abstract class PushListener<T> {

    /* renamed from: a */
    private final String f160580a = "PushListener@";

    /* renamed from: b */
    private final CopyOnWriteArrayList<DataHandler<T>> f160581b;

    /* renamed from: c */
    private final Command f160582c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/vc/net/push/PushListener$DataHandler;", "T", "", "onData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "lib_vc_network_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.net.push.a$a */
    public interface DataHandler<T> {
        /* renamed from: a */
        void mo219350a(T t);
    }

    /* renamed from: b */
    public abstract T mo219340b(byte[] bArr);

    /* renamed from: a */
    public final Command mo219799a() {
        return this.f160582c;
    }

    /* renamed from: a */
    public final synchronized void mo219800a(DataHandler<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        this.f160581b.add(aVar);
    }

    /* renamed from: b */
    public final synchronized void mo219802b(DataHandler<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        this.f160581b.remove(aVar);
    }

    public PushListener(Command command) {
        Intrinsics.checkParameterIsNotNull(command, "command");
        this.f160582c = command;
        VideoChatPush.m249004a().mo219752b(this);
        this.f160581b = new CopyOnWriteArrayList<>();
    }

    /* renamed from: a */
    public final void mo219801a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            T b = mo219340b(bArr);
            if (b != null) {
                Iterator<DataHandler<T>> it = this.f160581b.iterator();
                while (it.hasNext()) {
                    it.next().mo219350a(b);
                }
            }
        } catch (Exception e) {
            C60871a.m236612c(this.f160580a + getClass().getName(), e.getMessage());
        }
    }
}
