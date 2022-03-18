package com.larksuite.rucket.impl.serverimpl;

import com.larksuite.rucket.impl.base.push.BasePushRucketJob;
import com.squareup.wire.Message;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.C53248k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\u0002`\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/larksuite/rucket/impl/serverimpl/ServerPushRucketJob;", "T", "Lcom/squareup/wire/Message;", "Lcom/larksuite/rucket/impl/base/request/PBMessage;", "Lcom/larksuite/rucket/impl/base/push/BasePushRucketJob;", "command", "Lcom/ss/android/lark/pb/improto/Command;", "responseClazz", "Ljava/lang/Class;", "(Lcom/ss/android/lark/pb/improto/Command;Ljava/lang/Class;)V", "registerSelf", "", "unregisterSelf", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.serverimpl.a */
public final class ServerPushRucketJob<T extends Message<?, ?>> extends BasePushRucketJob<T> {

    /* renamed from: h */
    private final Command f64998h;

    @Override // com.larksuite.rucket.impl.base.push.BasePushRucketJob
    /* renamed from: b */
    public void mo93466b() {
        C53248k.m205912a().mo181699a(this.f64998h);
    }

    @Override // com.larksuite.rucket.impl.base.push.BasePushRucketJob
    /* renamed from: c */
    public void mo93467c() {
        C53248k.m205912a().mo181700a(this.f64998h, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerPushRucketJob(Command command, Class<T> cls) {
        super(cls);
        Intrinsics.checkParameterIsNotNull(command, "command");
        Intrinsics.checkParameterIsNotNull(cls, "responseClazz");
        this.f64998h = command;
    }
}
