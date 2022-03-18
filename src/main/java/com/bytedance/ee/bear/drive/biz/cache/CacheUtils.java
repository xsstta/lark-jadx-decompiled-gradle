package com.bytedance.ee.bear.drive.biz.cache;

import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6932i;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.model.C7090c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/cache/CacheUtils;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.cache.a */
public final class CacheUtils {

    /* renamed from: a */
    public static final Companion f17530a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0017J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/cache/CacheUtils$Companion;", "", "()V", "TAG", "", "removeCache", "Lio/reactivex/disposables/Disposable;", "viewModel", "Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "cmd", "Ljava/lang/Runnable;", "saveWpsPreviewCache", "", "fileModel", "Lcom/bytedance/ee/bear/drive/core/model/AbsFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.cache.a$a */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.cache.a$a$c */
        static final class C6329c<T> implements Consumer<Boolean> {

            /* renamed from: a */
            public static final C6329c f17533a = new C6329c();

            C6329c() {
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
            }
        }

        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.cache.a$a$a */
        public static final class C6327a<T> implements Consumer<Boolean> {

            /* renamed from: a */
            final /* synthetic */ Runnable f17531a;

            C6327a(Runnable runnable) {
                this.f17531a = runnable;
            }

            /* renamed from: a */
            public final void accept(Boolean bool) {
                Runnable runnable = this.f17531a;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.cache.a$a$d */
        static final class C6330d<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C6330d f17534a = new C6330d();

            C6330d() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54761a("DriveComponent", th);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.cache.a$a$b */
        public static final class C6328b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ Runnable f17532a;

            C6328b(Runnable runnable) {
                this.f17532a = runnable;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                Runnable runnable = this.f17532a;
                if (runnable != null) {
                    runnable.run();
                }
                C13479a.m54759a("CacheUtils", "handleFileNotFound() error", th);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public void mo25429a(AbstractC6946a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "fileModel");
            C13479a.m54764b("DriveComponent", "start save wps fileInfo cache");
            AbstractC6949c a = C7090c.m28237a(aVar);
            C6880a a2 = C6880a.m27065a();
            String a3 = C6880a.m27075a(a);
            String j = aVar.mo27343j();
            String str = aVar.mo27322a().f18785a;
            AbstractC6947b a4 = aVar.mo27322a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "fileModel.meta");
            String g = a4.mo27364g();
            String d = aVar.mo27333d();
            Intrinsics.checkExpressionValueIsNotNull(a, "iFileModel");
            String e = a.mo27375e();
            AbstractC6947b a5 = aVar.mo27322a();
            Intrinsics.checkExpressionValueIsNotNull(a5, "fileModel.meta");
            a2.mo27079a(0, 0, a3, j, str, g, d, "1", e, a5.mo27358a(), a.mo27382l(), "", "", aVar.mo27351r(), false, aVar.mo27322a().f18791g).mo238004b(C11678b.m48479c()).mo238001b(C6329c.f17533a, C6330d.f17534a);
        }

        @JvmStatic
        /* renamed from: a */
        public Disposable mo25428a(C6937b bVar, Runnable runnable) {
            String str;
            Intrinsics.checkParameterIsNotNull(bVar, "viewModel");
            AbstractC6927d a = C6932i.m27446a(bVar);
            Intrinsics.checkExpressionValueIsNotNull(a, "PreviewFileStrategyUtils…ategyByDriveVM(viewModel)");
            BaseOpenEntity openEntity = bVar.getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "viewModel.openEntity");
            String fileId = openEntity.getFileId();
            Intrinsics.checkExpressionValueIsNotNull(fileId, "viewModel.openEntity.fileId");
            AbstractC6949c iFileModel = bVar.getIFileModel();
            if (iFileModel != null) {
                str = iFileModel.mo27375e();
            } else {
                str = null;
            }
            String a2 = a.mo27240a(bVar.getFileModel());
            Intrinsics.checkExpressionValueIsNotNull(a2, "strategy.getCacheKey(viewModel.getFileModel())");
            C6920b f = C6920b.m27342f();
            Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
            Disposable b = f.mo27170e().mo27089b(a2, fileId, str).mo238001b(new C6327a(runnable), new C6328b(runnable));
            Intrinsics.checkExpressionValueIsNotNull(b, "DriveConfigServiceImpl.g…t)\n                    })");
            return b;
        }

        /* renamed from: a */
        public static /* synthetic */ Disposable m25412a(Companion aVar, C6937b bVar, Runnable runnable, int i, Object obj) {
            if ((i & 2) != 0) {
                runnable = null;
            }
            return aVar.mo25428a(bVar, runnable);
        }
    }
}
