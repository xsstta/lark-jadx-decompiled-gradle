package com.ss.android.lark.sticker.ui;

import android.content.Intent;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.sticker.dto.UISticker;
import com.ss.android.lark.sticker.ui.C55079a;
import com.ss.android.lark.sticker.ui.p2717b.AbstractC55093a;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.ui.d */
public class C55108d extends BasePresenter<C55079a.AbstractC55080a, C55079a.AbstractC55082b, C55079a.AbstractC55082b.AbstractC55083a> {

    /* renamed from: a */
    private AbstractC55111c f136107a;

    /* renamed from: b */
    private C55116g f136108b;

    /* renamed from: c */
    private C55112d f136109c;

    /* renamed from: com.ss.android.lark.sticker.ui.d$c */
    public interface AbstractC55111c {
        /* renamed from: a */
        void mo188007a(Intent intent);
    }

    /* renamed from: com.ss.android.lark.sticker.ui.d$g */
    public class C55116g implements C55079a.AbstractC55082b.AbstractC55083a {
        @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b.AbstractC55083a
        /* renamed from: c */
        public void mo187988c() {
            C55108d.this.mo188032c();
        }

        @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b.AbstractC55083a
        /* renamed from: a */
        public void mo187984a() {
            C55079a.AbstractC55080a aVar = (C55079a.AbstractC55080a) C55108d.this.getModel();
            if (aVar != null) {
                aVar.mo187971b(new C55114e());
            }
        }

        @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b.AbstractC55083a
        /* renamed from: b */
        public void mo187987b() {
            C55079a.AbstractC55080a aVar = (C55079a.AbstractC55080a) C55108d.this.getModel();
            if (aVar != null) {
                aVar.mo187973c(new C55110b());
            }
        }

        public C55116g() {
        }

        @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b.AbstractC55083a
        /* renamed from: a */
        public void mo187986a(List<String> list, boolean z) {
            C55108d.this.mo188030a(list, z);
        }

        @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55082b.AbstractC55083a
        /* renamed from: a */
        public void mo187985a(List<Sticker> list, List<UISticker> list2) {
            C55079a.AbstractC55080a aVar = (C55079a.AbstractC55080a) C55108d.this.getModel();
            if (aVar != null) {
                aVar.mo187969a(list);
                aVar.mo187972b(list2);
                if (C55108d.this.getView() != null) {
                    ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187977a(list.size());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C55079a.AbstractC55080a.AbstractC55081a mo188029a() {
        C55112d dVar = new C55112d();
        this.f136109c = dVar;
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C55079a.AbstractC55082b.AbstractC55083a createViewDelegate() {
        C55116g gVar = new C55116g();
        this.f136108b = gVar;
        return gVar;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo188033d();
    }

    /* renamed from: com.ss.android.lark.sticker.ui.d$b */
    class C55110b extends C55109a {
        @Override // com.ss.android.lark.sticker.ui.C55108d.C55109a, com.ss.android.lark.sticker.ui.p2717b.AbstractC55093a
        /* renamed from: a */
        public void mo188008a() {
            super.mo188008a();
            if (C55108d.this.getView() != null) {
                ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187977a(0);
            }
        }

        C55110b() {
            super();
        }
    }

    /* renamed from: c */
    public void mo188032c() {
        Intent intent = new Intent();
        intent.putExtra("key_stickers", (Serializable) ((C55079a.AbstractC55080a) getModel()).mo187966a());
        this.f136107a.mo188007a(intent);
    }

    /* renamed from: d */
    public void mo188033d() {
        C55079a.AbstractC55080a aVar = (C55079a.AbstractC55080a) getModel();
        if (aVar != null) {
            aVar.mo187968a(new C55109a());
        }
    }

    /* renamed from: com.ss.android.lark.sticker.ui.d$e */
    class C55114e extends C55109a {
        @Override // com.ss.android.lark.sticker.ui.C55108d.C55109a, com.ss.android.lark.sticker.ui.p2717b.AbstractC55093a
        /* renamed from: a */
        public void mo188008a() {
            super.mo188008a();
            if (C55108d.this.getView() != null) {
                ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187977a(0);
                ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187976a();
            }
        }

        C55114e() {
            super();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.d$f */
    public class C55115f extends C55109a {
        @Override // com.ss.android.lark.sticker.ui.C55108d.C55109a, com.ss.android.lark.sticker.ui.p2717b.AbstractC55093a
        /* renamed from: a */
        public void mo188008a() {
            super.mo188008a();
            if (C55108d.this.getView() != null) {
                ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187981b();
                ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187977a(0);
                ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187983d();
            }
        }

        C55115f() {
            super();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sticker.ui.d$a */
    public class C55109a implements AbstractC55093a<List<UISticker>> {
        @Override // com.ss.android.lark.sticker.ui.p2717b.AbstractC55093a
        /* renamed from: a */
        public void mo188008a() {
        }

        C55109a() {
        }

        @Override // com.ss.android.lark.sticker.ui.p2717b.AbstractC55093a
        /* renamed from: a */
        public void mo188009a(ErrorResult errorResult) {
            if (C55108d.this.getView() != null) {
                ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187978a(errorResult);
            }
        }

        /* renamed from: a */
        public void mo188010a(List<UISticker> list) {
            if (C55108d.this.getView() != null) {
                ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187979a(list);
            }
        }
    }

    /* renamed from: com.ss.android.lark.sticker.ui.d$d */
    public class C55112d implements C55079a.AbstractC55080a.AbstractC55081a {
        public C55112d() {
        }

        @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a.AbstractC55081a
        /* renamed from: a */
        public void mo187974a(List<UISticker> list) {
            C55108d.this.mo188033d();
        }

        @Override // com.ss.android.lark.sticker.ui.C55079a.AbstractC55080a.AbstractC55081a
        /* renamed from: a */
        public void mo187975a(final List<String> list, final int i, final boolean z) {
            if (!CollectionUtils.isEmpty(list)) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.sticker.ui.C55108d.C55112d.RunnableC551131 */

                    public void run() {
                        ((C55079a.AbstractC55082b) C55108d.this.getView()).mo187980a(list, i, z);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo188030a(List<String> list, boolean z) {
        C55079a.AbstractC55080a aVar = (C55079a.AbstractC55080a) getModel();
        if (aVar != null) {
            if (getView() != null) {
                ((C55079a.AbstractC55082b) getView()).mo187982c();
            }
            aVar.mo187970a(list, z, new C55115f());
        }
    }

    public C55108d(C55079a.AbstractC55080a aVar, C55079a.AbstractC55082b bVar, AbstractC55111c cVar) {
        super(aVar, bVar);
        this.f136107a = cVar;
        aVar.mo187967a(mo188029a());
    }
}
