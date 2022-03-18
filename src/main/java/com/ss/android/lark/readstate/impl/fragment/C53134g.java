package com.ss.android.lark.readstate.impl.fragment;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import com.ss.android.lark.readstate.impl.fragment.C53127b;
import com.ss.android.lark.readstate.impl.fragment.C53134g;
import java.util.List;

/* renamed from: com.ss.android.lark.readstate.impl.fragment.g */
public class C53134g extends BasePresenter<C53127b.AbstractC53128a, C53127b.AbstractC53129b, C53127b.AbstractC53129b.AbstractC53130a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C53127b.AbstractC53129b.AbstractC53130a createViewDelegate() {
        return new C53135a();
    }

    /* renamed from: com.ss.android.lark.readstate.impl.fragment.g$a */
    public class C53135a implements C53127b.AbstractC53129b.AbstractC53130a {
        @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53129b.AbstractC53130a
        /* renamed from: a */
        public boolean mo181462a() {
            return ((C53127b.AbstractC53128a) C53134g.this.getModel()).mo181460c();
        }

        @Override // com.ss.android.lark.readstate.impl.fragment.C53127b.AbstractC53129b.AbstractC53130a
        /* renamed from: b */
        public void mo181463b() {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(new IGetDataCallback<List<C53123f>>() {
                /* class com.ss.android.lark.readstate.impl.fragment.C53134g.C53135a.C531361 */

                /* renamed from: a */
                public void onSuccess(List<C53123f> list) {
                    ((C53127b.AbstractC53129b) C53134g.this.getView()).mo181452b(list);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((C53127b.AbstractC53129b) C53134g.this.getView()).mo181447a(errorResult);
                }
            }) {
                /* class com.ss.android.lark.readstate.impl.fragment.$$Lambda$g$a$Xxvi6xWZjZovgoUQHzlbJhJOIN0 */
                public final /* synthetic */ IGetDataCallback f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C53134g.C53135a.this.m205683a(this.f$1);
                }
            });
        }

        public C53135a() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m205683a(IGetDataCallback iGetDataCallback) {
            ((C53127b.AbstractC53128a) C53134g.this.getModel()).mo181458a(new UIGetDataCallback(iGetDataCallback));
        }
    }

    /* renamed from: b */
    public void mo181470b() {
        boolean z;
        int a = ((C53127b.AbstractC53128a) getModel()).mo181455a();
        boolean d = ((C53127b.AbstractC53128a) getModel()).mo181461d();
        if (a == Message.Type.FILE.getNumber()) {
            z = true;
        } else {
            z = false;
        }
        ((C53127b.AbstractC53129b) getView()).mo181450a(d, z, ((C53127b.AbstractC53128a) getModel()).mo181459b());
    }

    /* renamed from: a */
    public void mo181468a(List<C53123f> list) {
        List<C53123f> a = ((C53127b.AbstractC53128a) getModel()).mo181456a(list);
        if (CollectionUtils.isEmpty(a)) {
            ((C53127b.AbstractC53129b) getView()).mo181446a();
            return;
        }
        ((C53127b.AbstractC53129b) getView()).mo181451b();
        ((C53127b.AbstractC53129b) getView()).mo181449a(a);
    }

    public C53134g(C53127b.AbstractC53128a aVar, C53127b.AbstractC53129b bVar) {
        super(aVar, bVar);
    }

    /* renamed from: a */
    public void mo181469a(List<C53123f> list, String str) {
        List<C53123f> a = ((C53127b.AbstractC53128a) getModel()).mo181457a(list, str);
        if (CollectionUtils.isEmpty(a)) {
            ((C53127b.AbstractC53129b) getView()).mo181446a();
            return;
        }
        ((C53127b.AbstractC53129b) getView()).mo181451b();
        ((C53127b.AbstractC53129b) getView()).mo181449a(a);
    }
}
