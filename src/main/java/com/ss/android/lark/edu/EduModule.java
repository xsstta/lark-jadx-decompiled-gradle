package com.ss.android.lark.edu;

import android.content.Context;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.edu.p1822a.AbstractC36920a;
import com.ss.android.lark.edu.service.EduService;
import com.ss.android.lark.edu.share.EduGroupAppLinkHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/edu/EduModule;", "", "dependency", "Lcom/ss/android/lark/edu/dependency/IEduModuleDependency;", "(Lcom/ss/android/lark/edu/dependency/IEduModuleDependency;)V", "getAppLinkHandlers", "", "", "Lcom/ss/android/lark/applink/AppLinkHandler;", "context", "Landroid/content/Context;", "getDepartmentInvitationUrl", "chatId", "inviterId", "Companion", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.b */
public final class EduModule {

    /* renamed from: a */
    public static volatile AbstractC36920a f94920a;

    /* renamed from: b */
    public static final Companion f94921b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/edu/EduModule$Companion;", "", "()V", "sDependency", "Lcom/ss/android/lark/edu/dependency/IEduModuleDependency;", "sDependency$annotations", "getSDependency", "()Lcom/ss/android/lark/edu/dependency/IEduModuleDependency;", "setSDependency", "(Lcom/ss/android/lark/edu/dependency/IEduModuleDependency;)V", "getDependency", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final AbstractC36920a mo136304a() {
            return EduModule.f94920a;
        }

        @JvmStatic
        /* renamed from: b */
        public final AbstractC36920a mo136305b() {
            return mo136304a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EduModule(AbstractC36920a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        f94920a = aVar;
    }

    /* renamed from: a */
    public final Map<String, AbstractC29186b> mo136303a(Context context) {
        return MapsKt.mapOf(new Pair("/client/chat/edu/create", new EduGroupAppLinkHandler()));
    }

    /* renamed from: a */
    public final String mo136302a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "inviterId");
        return EduService.f94922a.mo136306a(str, str2);
    }
}
