package com.ss.android.lark.larkconfig.universal;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.settings.v1.PushUniversalUserSetting;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/larkconfig/universal/UniversalUserSettingPush;", "", "()V", "TAG", "", "pushListenerList", "", "Lcom/ss/android/lark/larkconfig/universal/IUniversalUserSettingUpdateListener;", "addPushListener", "", "listener", "dispatch", "universalUserSettingList", "", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "onPushUniversalUserSettingConfig", "request", "", "removePushListener", "universal_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.b.e */
public final class UniversalUserSettingPush {

    /* renamed from: a */
    public static final UniversalUserSettingPush f104915a = new UniversalUserSettingPush();

    /* renamed from: b */
    private static final List<IUniversalUserSettingUpdateListener> f104916b = new ArrayList();

    private UniversalUserSettingPush() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.b.e$a */
    static final class C41140a implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C41140a f104917a = new C41140a();

        C41140a() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181697a(Command.PUSH_UNIVERSAL_USER_SETTING, C411411.f104918a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "handle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.b.e$c */
    static final class C41143c implements C53246j.AbstractC53247a {

        /* renamed from: a */
        public static final C41143c f104920a = new C41143c();

        C41143c() {
        }

        @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
        public final void handle() {
            C53248k.m205912a().mo181696a(Command.PUSH_UNIVERSAL_USER_SETTING);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.b.e$b */
    public static final class RunnableC41142b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f104919a;

        RunnableC41142b(List list) {
            this.f104919a = list;
        }

        public final void run() {
            UniversalUserSettingPush eVar = UniversalUserSettingPush.f104915a;
            for (IUniversalUserSettingUpdateListener bVar : UniversalUserSettingPush.f104916b) {
                bVar.mo148382a(this.f104919a);
            }
        }
    }

    /* renamed from: a */
    public final void mo148386a(IUniversalUserSettingUpdateListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        C53246j.m205910a(f104916b, bVar, C41140a.f104917a);
    }

    /* renamed from: b */
    public final void mo148388b(IUniversalUserSettingUpdateListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        C53246j.m205911b(f104916b, bVar, C41143c.f104920a);
    }

    /* renamed from: a */
    private final void m163255a(List<UniversalUserSetting> list) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getUIExecutor().execute(new RunnableC41142b(list));
    }

    /* renamed from: a */
    public final void mo148387a(byte[] bArr) {
        try {
            m163255a(CollectionsKt.toList(PushUniversalUserSetting.ADAPTER.decode(bArr).settings.values()));
        } catch (IOException e) {
            Log.m165383e("UniversalUserSettingPush", "failed to push universal user setting, e: " + e);
        }
    }
}
