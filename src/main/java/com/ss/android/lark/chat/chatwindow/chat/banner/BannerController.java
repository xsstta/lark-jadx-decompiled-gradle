package com.ss.android.lark.chat.chatwindow.chat.banner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class BannerController {

    /* renamed from: a */
    private final Map<Integer, AbstractC33187f> f85292a = new LinkedHashMap();

    /* renamed from: b */
    private final ViewGroup f85293b;

    /* renamed from: c */
    private int f85294c;

    /* renamed from: d */
    private boolean f85295d;

    /* renamed from: e */
    private final Runnable f85296e = new Runnable() {
        /* class com.ss.android.lark.chat.chatwindow.chat.banner.$$Lambda$BannerController$LlpPXrUTFHO5ZWHmpm2JIw1Rw6Y */

        public final void run() {
            BannerController.lambda$LlpPXrUTFHO5ZWHmpm2JIw1Rw6Y(BannerController.this);
        }
    };

    /* renamed from: f */
    private final AbstractC33151a f85297f;

    public @interface BannerType {
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.banner.BannerController$a */
    public interface AbstractC33151a {
        /* renamed from: a */
        void mo122342a();

        /* renamed from: b */
        void mo122343b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m128120a() {
        Log.m165389i("BannerController", "traverseBannerVisibility");
        ArrayList<AbstractC33187f> arrayList = new ArrayList(this.f85292a.values());
        Collections.sort(arrayList, new Comparator<AbstractC33187f>() {
            /* class com.ss.android.lark.chat.chatwindow.chat.banner.BannerController.C331502 */

            /* renamed from: a */
            public int compare(AbstractC33187f fVar, AbstractC33187f fVar2) {
                return fVar.mo122344a() - fVar2.mo122344a();
            }
        });
        boolean z = false;
        this.f85294c = 0;
        this.f85293b.removeAllViews();
        int i = 0;
        for (AbstractC33187f fVar : arrayList) {
            if (!fVar.mo122353g() || !fVar.mo122349c()) {
                this.f85293b.removeView(fVar.mo122351e());
                this.f85294c &= ~fVar.mo122363i();
                Log.m165379d("BannerController", "traverse not visible:" + fVar.mo122363i() + "/" + this.f85294c);
            } else if ((fVar.mo122348b() & i) == 0) {
                View e = fVar.mo122351e();
                m128121a(e);
                this.f85293b.addView(e);
                this.f85294c |= fVar.mo122363i();
                int b = fVar.mo122348b() | fVar.mo122363i() | i;
                Log.m165379d("BannerController", "traverse visible:" + fVar.mo122363i() + "/" + this.f85294c);
                i = b;
                z = true;
            }
        }
        if (this.f85295d != z) {
            if (z) {
                this.f85297f.mo122342a();
            } else {
                this.f85297f.mo122343b();
            }
            this.f85295d = z;
        }
    }

    /* renamed from: a */
    public void mo122334a(int i) {
        this.f85292a.remove(Integer.valueOf(i));
    }

    /* renamed from: b */
    public AbstractC33187f mo122337b(int i) {
        return this.f85292a.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    private void m128121a(View view) {
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* renamed from: a */
    public void mo122336a(final AbstractC33187f<?> fVar) {
        fVar.mo122346a((AbstractC33185d) new AbstractC33185d() {
            /* class com.ss.android.lark.chat.chatwindow.chat.banner.BannerController.C331491 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.banner.AbstractC33185d
            /* renamed from: a */
            public void mo122339a() {
                BannerController.this.mo122338c(fVar.mo122363i());
            }
        });
        this.f85292a.put(Integer.valueOf(fVar.mo122363i()), fVar);
    }

    /* renamed from: c */
    public void mo122338c(int i) {
        Log.m165379d("BannerController", "hideBanner:" + i);
        AbstractC33187f fVar = this.f85292a.get(Integer.valueOf(i));
        if (fVar != null) {
            fVar.mo122347a(false);
            fVar.mo122350d().mo122181b();
        }
        UICallbackExecutor.executeDelayed(this.f85296e, 0);
    }

    public BannerController(ViewGroup viewGroup, AbstractC33151a aVar) {
        this.f85293b = viewGroup;
        this.f85297f = aVar;
    }

    /* renamed from: a */
    public void mo122335a(int i, AbstractC33155c cVar) {
        Log.m165379d("BannerController", "showBanner:" + i);
        AbstractC33187f fVar = this.f85292a.get(Integer.valueOf(i));
        if (fVar != null) {
            if (fVar.mo122351e() == null) {
                fVar.mo122345a(LayoutInflater.from(this.f85293b.getContext()).inflate(fVar.mo122352f(), this.f85293b, false), cVar);
            } else {
                fVar.mo122361a(cVar);
            }
            fVar.mo122347a(true);
            fVar.mo122350d().mo122180a();
            UICallbackExecutor.executeDelayed(this.f85296e, 0);
        }
    }
}
