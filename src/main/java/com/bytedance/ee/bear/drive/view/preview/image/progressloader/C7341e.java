package com.bytedance.ee.bear.drive.view.preview.image.progressloader;

import com.bytedance.ee.bear.drive.view.preview.image.progressloader.C7341e;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.AbstractC7335a;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.AbstractC7336b;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.ImageWrapper;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.C7285c;
import com.bytedance.ee.bear.thread.C11678b;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68313e;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.e */
public class C7341e<D, E> {

    /* renamed from: a */
    public C7285c f19644a;

    /* renamed from: b */
    public AbstractC7336b<D, E> f19645b;

    /* renamed from: c */
    public AbstractC7322c<D, E> f19646c;

    /* renamed from: d */
    public int f19647d;

    /* renamed from: e */
    public int f19648e;

    /* renamed from: f */
    private Disposable f19649f;

    /* renamed from: c */
    public void mo28598c() {
        this.f19646c = null;
    }

    /* renamed from: b */
    public void mo28597b() {
        this.f19644a.mo28467c();
        this.f19649f.dispose();
    }

    /* renamed from: a */
    public void mo28596a() {
        this.f19649f = AbstractC68307f.m265080a(new AbstractC68324h<ImageWrapper<D, E>>() {
            /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.C7341e.C73454 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m29327a() throws Exception {
                C7341e.this.f19644a.mo28466b();
            }

            @Override // io.reactivex.AbstractC68324h
            public void subscribe(final AbstractC68323g<ImageWrapper<D, E>> gVar) throws Exception {
                try {
                    C7341e.this.f19645b.mo28591a(C7341e.this.f19644a.mo28465a(), C7341e.this.f19647d, C7341e.this.f19648e, new AbstractC7335a<D, E>() {
                        /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.C7341e.C73454.C73461 */

                        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.AbstractC7335a
                        /* renamed from: a */
                        public void mo28590a(Exception exc) {
                            if (!gVar.isCancelled()) {
                                gVar.onError(exc);
                            }
                        }

                        @Override // com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.AbstractC7335a
                        /* renamed from: a */
                        public void mo28589a(ImageWrapper<D, E> imageWrapper) {
                            if (!gVar.isCancelled()) {
                                gVar.onNext(imageWrapper);
                                if (imageWrapper.mo28588d() == ImageWrapper.Type.DECODED && imageWrapper.mo28585a()) {
                                    gVar.onComplete();
                                }
                            }
                        }
                    });
                    gVar.setCancellable(new AbstractC68313e() {
                        /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.$$Lambda$e$4$fQ2OWisRjITXohFEyMVwjvlcnZs */

                        @Override // io.reactivex.functions.AbstractC68313e
                        public final void cancel() {
                            C7341e.C73454.this.m29327a();
                        }
                    });
                } catch (Exception e) {
                    if (!gVar.isCancelled()) {
                        gVar.onError(e);
                    }
                }
            }
        }, BackpressureStrategy.BUFFER).mo238004b(C11678b.m48482f()).mo237985a(C11678b.m48481e()).mo237978a(new Consumer<ImageWrapper<D, E>>() {
            /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.C7341e.C73421 */

            /* renamed from: a */
            public void accept(ImageWrapper<D, E> imageWrapper) throws Exception {
                if (C7341e.this.f19646c == null) {
                    return;
                }
                if (imageWrapper.mo28588d() == ImageWrapper.Type.DECODED) {
                    C7341e.this.f19646c.mo28483b(imageWrapper.mo28586b(), imageWrapper.mo28585a());
                } else {
                    C7341e.this.f19646c.mo28481a(imageWrapper.mo28587c(), imageWrapper.mo28585a());
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.C7341e.C73432 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C7341e.this.f19644a.mo28466b();
                if (C7341e.this.f19646c != null) {
                    C7341e.this.f19646c.mo28482a(th);
                }
            }
        }, new AbstractC68309a() {
            /* class com.bytedance.ee.bear.drive.view.preview.image.progressloader.C7341e.C73443 */

            @Override // io.reactivex.functions.AbstractC68309a
            public void run() throws Exception {
                C7341e.this.f19644a.mo28466b();
            }
        });
    }

    public C7341e(C7285c cVar, AbstractC7336b<D, E> bVar, AbstractC7322c<D, E> cVar2, int i, int i2) {
        this.f19644a = cVar;
        this.f19645b = bVar;
        this.f19646c = cVar2;
        this.f19647d = i;
        this.f19648e = i2;
    }
}
