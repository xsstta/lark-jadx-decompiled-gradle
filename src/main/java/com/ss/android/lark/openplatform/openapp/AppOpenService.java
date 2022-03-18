package com.ss.android.lark.openplatform.openapp;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform.p2399a.AbstractC48793a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/openplatform/openapp/AppOpenService;", "", "dependency", "Lcom/ss/android/lark/openplatform/dependency/OpenPlatformModuleDependency;", "(Lcom/ss/android/lark/openplatform/dependency/OpenPlatformModuleDependency;)V", "getDependency", "()Lcom/ss/android/lark/openplatform/dependency/OpenPlatformModuleDependency;", "openBotChat", "", "openData", "Lcom/ss/android/lark/openplatform/openapp/BotOpenData;", "Companion", "open-platform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.openplatform.openapp.a */
public final class AppOpenService {

    /* renamed from: a */
    public static final Companion f122672a = new Companion(null);

    /* renamed from: b */
    private final AbstractC48793a f122673b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/openplatform/openapp/AppOpenService$Companion;", "", "()V", "TAG", "", "open-platform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.openplatform.openapp.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppOpenService(AbstractC48793a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f122673b = aVar;
    }

    /* renamed from: a */
    public final void mo170591a(BotOpenData bVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(bVar, "openData");
        if (bVar.mo170597d().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || bVar.mo170598e() == ID_TYPE.UNKNOWN) {
            Log.m165389i("AppOpenService", "id is empty");
            return;
        }
        Log.m165389i("AppOpenService", "no network , or fg not open, open not peek feed");
        this.f122673b.startChatWindowByOpenData(bVar);
    }
}
