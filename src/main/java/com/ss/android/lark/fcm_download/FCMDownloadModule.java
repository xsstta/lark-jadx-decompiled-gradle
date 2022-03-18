package com.ss.android.lark.fcm_download;

import android.app.Activity;
import com.ss.android.lark.biz.core.api.CheckDownloadDialogCallback;
import com.ss.android.lark.fcm_download.manage.FCMDownloadManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/fcm_download/FCMDownloadModule;", "", "dependency", "Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency;", "(Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency;)V", "checkDownloadWithDialog", "", "activity", "Landroid/app/Activity;", "callback", "Lcom/ss/android/lark/biz/core/api/CheckDownloadDialogCallback;", "Companion", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.fcm_download.a */
public final class FCMDownloadModule {

    /* renamed from: a */
    public static IFCMDownModuleDependency f95611a;

    /* renamed from: b */
    public static final Companion f95612b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/fcm_download/FCMDownloadModule$Companion;", "", "()V", "sDependency", "Lcom/ss/android/lark/fcm_download/IFCMDownModuleDependency;", "getDependency", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final IFCMDownModuleDependency mo136916a() {
            return FCMDownloadModule.f95611a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FCMDownloadModule(IFCMDownModuleDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        f95611a = bVar;
    }

    /* renamed from: a */
    public final void mo136915a(Activity activity, CheckDownloadDialogCallback cVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        FCMDownloadManager.f95622b.mo136931a().mo136928a(activity, cVar);
    }
}
