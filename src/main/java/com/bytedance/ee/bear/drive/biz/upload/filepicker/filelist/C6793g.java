package com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist;

import android.content.Context;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.command.C6776b;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.C6799a;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FileSystemObject;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b.C6773b;
import com.bytedance.ee.bear.drive.biz.upload.filepicker.p335b.C6774c;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.g */
public class C6793g extends AbstractC6905a<AbstractC6792f> {

    /* renamed from: a */
    private C6776b f18458a = new C6776b();

    /* renamed from: b */
    private HashMap<String, C6799a> f18459b = new HashMap<>();

    /* renamed from: c */
    private Context f18460c;

    /* renamed from: d */
    private C68289a f18461d = new C68289a();

    public static /* synthetic */ void lambda$QILAxWh9XkMdca_gKFHVGlLY3s8(C6793g gVar, String str, List list) {
        gVar.m26752a(str, list);
    }

    /* renamed from: a */
    public Map<String, C6799a> mo26651a() {
        return this.f18459b;
    }

    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d, com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6905a
    /* renamed from: b */
    public void mo26654b() {
        super.mo26654b();
        this.f18461d.mo237935a();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ List m26754b(String str) {
        return C6774c.m26709a(this.f18458a.mo26611a(str), false, this.f18460c);
    }

    public C6793g(Context context) {
        super(context);
        this.f18460c = context;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m26753a(Throwable th) {
        C13479a.m54761a("PickerPresenter", th);
        if (mo27154m() != null) {
            ((AbstractC6792f) mo27154m()).mo26647a(th);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private List<C6799a> m26751a(List<FileSystemObject> list) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (FileSystemObject fileSystemObject : list) {
            C6799a aVar = new C6799a(fileSystemObject);
            String d = C6773b.m26704d(fileSystemObject);
            if (aVar.mo26768c()) {
                i = C7713a.m30837a(C8275a.f22370c.mo32555b());
            } else {
                i = C7713a.m30841a(d);
            }
            aVar.mo26765a(i);
            if (this.f18459b.get(fileSystemObject.getFullPath()) != null) {
                aVar.mo26766a(true);
            } else {
                aVar.mo26766a(false);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo26653a(String str) {
        this.f18461d.mo237935a();
        this.f18461d.mo237937a(AbstractC68307f.m265083a(str).mo237985a(C11678b.m48477a()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$g$410lN5RsAbwy5qH0EQ6kAprkeN8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6793g.lambda$410lN5RsAbwy5qH0EQ6kAprkeN8(C6793g.this, (String) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$g$NJUoGeDW02qVTmDTRsKvXriRns8 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C6793g.lambda$NJUoGeDW02qVTmDTRsKvXriRns8(C6793g.this, (List) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$g$QILAxWh9XkMdca_gKFHVGlLY3s8 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6793g.lambda$QILAxWh9XkMdca_gKFHVGlLY3s8(C6793g.this, this.f$1, (List) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.filelist.$$Lambda$g$8WU7frljXpHH2RmLvunIt924F0s */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6793g.lambda$8WU7frljXpHH2RmLvunIt924F0s(C6793g.this, (Throwable) obj);
            }
        }));
    }

    /* renamed from: a */
    private /* synthetic */ void m26752a(String str, List list) {
        if (mo27154m() != null) {
            ((AbstractC6792f) mo27154m()).mo26648a(list, str);
        }
    }

    /* renamed from: a */
    public void mo26652a(C6799a aVar, boolean z) {
        if (z) {
            this.f18459b.put(aVar.mo26764a().getFullPath(), aVar);
        } else {
            this.f18459b.remove(aVar.mo26764a().getFullPath());
        }
    }
}
