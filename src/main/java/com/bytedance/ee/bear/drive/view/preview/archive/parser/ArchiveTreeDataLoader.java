package com.bytedance.ee.bear.drive.view.preview.archive.parser;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.drive.biz.preview.p331a.C6540a;
import com.bytedance.ee.bear.drive.view.preview.archive.ArchiveTree;
import com.bytedance.ee.bear.drive.view.preview.archive.C7222a;
import com.bytedance.ee.bear.drive.view.preview.archive.view.AbstractC7246b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001d\u001e\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u001a\u001a\u00020\rJ\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/archive/parser/ArchiveTreeDataLoader;", "", "fileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "(Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;)V", "disposes", "Lio/reactivex/disposables/CompositeDisposable;", "encrypted", "", "extraFileDispose", "Lio/reactivex/disposables/Disposable;", "isNativeLoad", "extractFile", "", "entryPath", "", "entrySize", "", "cb", "Lcom/bytedance/ee/bear/drive/view/preview/archive/parser/ArchiveTreeDataLoader$ExtractCallback;", "isEncrypted", "load", "callback", "Lcom/bytedance/ee/bear/drive/view/preview/archive/parser/ArchiveTreeDataLoader$LoadCallback;", "parseDirectoryTree", "Lcom/bytedance/ee/bear/drive/view/preview/archive/ArchiveTree;", "release", "setRootName", "root", "Companion", "ExtractCallback", "LoadCallback", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b */
public final class ArchiveTreeDataLoader {

    /* renamed from: c */
    public static final Companion f19361c = new Companion(null);

    /* renamed from: a */
    public boolean f19362a;

    /* renamed from: b */
    public final C7553d f19363b;

    /* renamed from: d */
    private boolean f19364d;

    /* renamed from: e */
    private final C68289a f19365e = new C68289a();

    /* renamed from: f */
    private Disposable f19366f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/archive/parser/ArchiveTreeDataLoader$ExtractCallback;", "", "onFailed", "", "e", "", "onSuccess", "filePath", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b$b */
    public interface ExtractCallback {
        /* renamed from: a */
        void mo28247a(String str);

        /* renamed from: a */
        void mo28248a(Throwable th);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/archive/parser/ArchiveTreeDataLoader$LoadCallback;", "", "onFailed", "", "e", "", "onSuccess", "provider", "Lcom/bytedance/ee/bear/drive/view/preview/archive/view/IDataProvider;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b$c */
    public interface LoadCallback {
        /* renamed from: a */
        void mo28245a(AbstractC7246b bVar);

        /* renamed from: a */
        void mo28246a(Throwable th);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/archive/parser/ArchiveTreeDataLoader$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo28274a() {
        return this.f19362a;
    }

    /* renamed from: b */
    public final boolean mo28275b() {
        return this.f19364d;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b$d */
    public static final class C7224d<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ ExtractCallback f19367a;

        C7224d(ExtractCallback bVar) {
            this.f19367a = bVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            C13479a.m54764b("ArchiveTreeDataLoader", "extractFile() success");
            ExtractCallback bVar = this.f19367a;
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            bVar.mo28247a(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b$e */
    public static final class C7225e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ ExtractCallback f19368a;

        C7225e(ExtractCallback bVar) {
            this.f19368a = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("ArchiveTreeDataLoader", "extractFile() local file parse failed", th);
            ExtractCallback bVar = this.f19368a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            bVar.mo28248a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/drive/view/preview/archive/ArchiveTree;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Flowable;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b$g */
    public static final class C7229g<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ ArchiveTreeDataLoader f19372a;

        C7229g(ArchiveTreeDataLoader bVar) {
            this.f19372a = bVar;
        }

        /* renamed from: a */
        public final AbstractC68307f<ArchiveTree> apply(Boolean bool) {
            Intrinsics.checkParameterIsNotNull(bool, "it");
            return C6540a.m26267b(this.f19372a.f19363b.mo29485e()).mo238020d(C72301.f19373a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/view/preview/archive/ArchiveTree;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b$h */
    public static final class C7231h<T> implements Consumer<ArchiveTree> {

        /* renamed from: a */
        final /* synthetic */ ArchiveTreeDataLoader f19374a;

        /* renamed from: b */
        final /* synthetic */ LoadCallback f19375b;

        C7231h(ArchiveTreeDataLoader bVar, LoadCallback cVar) {
            this.f19374a = bVar;
            this.f19375b = cVar;
        }

        /* renamed from: a */
        public final void accept(ArchiveTree archiveTree) {
            ArchiveTreeDataLoader bVar = this.f19374a;
            bVar.mo28271a(archiveTree, bVar.f19363b);
            this.f19375b.mo28245a(new C7222a(archiveTree));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b$i */
    public static final class C7232i<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ LoadCallback f19376a;

        C7232i(LoadCallback cVar) {
            this.f19376a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54759a("ArchiveTreeDataLoader", "load() local file parse failed", th);
            LoadCallback cVar = this.f19376a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            cVar.mo28246a(th);
        }
    }

    public ArchiveTreeDataLoader(C7553d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "fileModel");
        this.f19363b = dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Flowable;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.archive.a.b$f */
    public static final class C7226f<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ ArchiveTreeDataLoader f19369a;

        C7226f(ArchiveTreeDataLoader bVar) {
            this.f19369a = bVar;
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(Boolean bool) {
            Intrinsics.checkParameterIsNotNull(bool, "it");
            return C6540a.m26259a(this.f19369a.f19363b.mo29485e()).mo238020d(new Function<T, R>(this) {
                /* class com.bytedance.ee.bear.drive.view.preview.archive.parser.ArchiveTreeDataLoader.C7226f.C72271 */

                /* renamed from: a */
                final /* synthetic */ C7226f f19370a;

                {
                    this.f19370a = r1;
                }

                @Override // io.reactivex.functions.Function
                public /* synthetic */ Object apply(Object obj) {
                    return Boolean.valueOf(mo28279a((Boolean) obj));
                }

                /* renamed from: a */
                public final boolean mo28279a(Boolean bool) {
                    Intrinsics.checkParameterIsNotNull(bool, "it");
                    C13479a.m54764b("ArchiveTreeDataLoader", "encrypted = " + bool);
                    this.f19370a.f19369a.f19362a = bool.booleanValue();
                    return true;
                }
            }).mo237988a(C72282.f19371a);
        }
    }

    /* renamed from: a */
    private final ArchiveTree m28941a(C7553d dVar) {
        String h = dVar.mo29489h();
        if (TextUtils.isEmpty(h)) {
            C13479a.m54775e("ArchiveTreeDataLoader", "parseDirectoryTree() extra is empty");
            return new ArchiveTree();
        }
        ArchiveTree archiveTree = (ArchiveTree) JSON.parseObject(h, ArchiveTree.class);
        mo28271a(archiveTree, dVar);
        return archiveTree;
    }

    /* renamed from: a */
    public final void mo28272a(LoadCallback cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        if (TextUtils.isEmpty(this.f19363b.mo29489h())) {
            C13479a.m54764b("ArchiveTreeDataLoader", "load() local file parse");
            this.f19364d = true;
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48479c()).mo238014c(new C7226f(this)).mo238014c(new C7229g(this)).mo237985a(C11678b.m48481e()).mo238001b(new C7231h(this, cVar), new C7232i(cVar));
            return;
        }
        C13479a.m54764b("ArchiveTreeDataLoader", "load() online file parse");
        this.f19364d = false;
        try {
            cVar.mo28245a(new C7222a(m28941a(this.f19363b)));
        } catch (Throwable th) {
            cVar.mo28246a(th);
            C13479a.m54759a("ArchiveTreeDataLoader", "load() online file parse failed", th);
        }
    }

    /* renamed from: a */
    public final void mo28271a(ArchiveTree archiveTree, C7553d dVar) {
        if (archiveTree != null) {
            archiveTree.setName(C13672c.m55480a(dVar.mo29480c()));
        }
    }

    /* renamed from: a */
    public final void mo28273a(String str, long j, ExtractCallback bVar) {
        Disposable disposable;
        Intrinsics.checkParameterIsNotNull(str, "entryPath");
        Intrinsics.checkParameterIsNotNull(bVar, "cb");
        Disposable disposable2 = this.f19366f;
        if (!(disposable2 == null || disposable2.isDisposed() || (disposable = this.f19366f) == null)) {
            disposable.dispose();
        }
        Disposable b = C6540a.m26258a(C13615c.f35773a, this.f19363b.mo29485e(), str, j, (String) null).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new C7224d(bVar), new C7225e(bVar));
        this.f19366f = b;
        C68289a aVar = this.f19365e;
        if (b == null) {
            Intrinsics.throwNpe();
        }
        aVar.mo237937a(b);
    }
}
