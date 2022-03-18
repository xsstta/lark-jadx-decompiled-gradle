package com.bytedance.ee.bear.document.toolbar.media;

import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6238c;
import com.bytedance.ee.bear.document.toolbar.media.impl.SelectedMediaItem;
import io.reactivex.disposables.Disposable;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.toolbar.media.c */
public class C6233c {

    /* renamed from: a */
    public AbstractC6232b f17317a;

    /* renamed from: b */
    private final AbstractC6231a f17318b = m25092b();

    /* renamed from: a */
    public AbstractC6231a mo25176a() {
        return this.f17318b;
    }

    /* renamed from: b */
    private AbstractC6231a m25092b() {
        return new AbstractC6231a() {
            /* class com.bytedance.ee.bear.document.toolbar.media.C6233c.C62341 */

            /* renamed from: a */
            public Disposable f17319a;

            /* renamed from: c */
            private C6238c f17321c;

            @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6231a
            /* renamed from: a */
            public void mo25174a() {
                C6238c cVar = (C6238c) aj.m5366a(C6233c.this.f17317a.mo25168a()).mo6005a(C6238c.class);
                this.f17321c = cVar;
                cVar.setDelegate(new C6238c.AbstractC6240a() {
                    /* class com.bytedance.ee.bear.document.toolbar.media.C6233c.C62341.C62351 */

                    @Override // com.bytedance.ee.bear.document.toolbar.media.impl.C6238c.AbstractC6240a
                    /* renamed from: b */
                    public boolean mo25179b() {
                        return C6233c.this.f17317a.mo25171b();
                    }

                    @Override // com.bytedance.ee.bear.document.toolbar.media.impl.C6238c.AbstractC6240a
                    /* renamed from: a */
                    public void mo25177a() {
                        C6233c.this.f17317a.mo25170a("window.lark.biz.util.cancelFromImageSelector", new JSONObject());
                    }

                    @Override // com.bytedance.ee.bear.document.toolbar.media.impl.C6238c.AbstractC6240a
                    /* renamed from: a */
                    public void mo25178a(List<SelectedMediaItem> list) {
                        C62341 r0 = C62341.this;
                        r0.f17319a = C6233c.this.f17317a.mo25169a(list);
                    }
                });
            }

            @Override // com.bytedance.ee.bear.document.toolbar.media.AbstractC6231a
            /* renamed from: b */
            public void mo25175b() {
                Disposable disposable = this.f17319a;
                if (disposable != null && !disposable.isDisposed()) {
                    this.f17319a.dispose();
                }
                C6238c cVar = this.f17321c;
                if (cVar != null) {
                    cVar.setDelegate(null);
                }
            }
        };
    }

    public C6233c(AbstractC6232b bVar) {
        this.f17317a = bVar;
    }
}
