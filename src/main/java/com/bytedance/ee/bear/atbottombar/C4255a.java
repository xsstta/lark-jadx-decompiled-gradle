package com.bytedance.ee.bear.atbottombar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.atfinder.View$OnKeyListenerC4262a;
import com.bytedance.ee.bear.bean.C4519b;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.widget.AbstractC11774d;
import com.bytedance.ee.bear.widget.AtFinderView;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.atbottombar.a */
public class C4255a {

    /* renamed from: a */
    private View f12804a;

    /* renamed from: b */
    private AtFinderView f12805b;

    /* renamed from: c */
    private List<String> f12806c;

    /* renamed from: d */
    private AbstractC4256a f12807d;

    /* renamed from: com.bytedance.ee.bear.atbottombar.a$a */
    public interface AbstractC4256a {
        void onHeightChange(int i);
    }

    /* renamed from: a */
    public View mo16712a() {
        return this.f12804a;
    }

    /* renamed from: b */
    public AtFinderView mo16715b() {
        return this.f12805b;
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m17690c() {
        this.f12805b.postDelayed(new Runnable() {
            /* class com.bytedance.ee.bear.atbottombar.$$Lambda$a$feCrZoiCcgnIjjjENWsrK7heTnc */

            public final void run() {
                C4255a.lambda$feCrZoiCcgnIjjjENWsrK7heTnc(C4255a.this);
            }
        }, 20);
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m17691d() {
        int height = this.f12805b.getHeight();
        AbstractC4256a aVar = this.f12807d;
        if (aVar != null) {
            aVar.onHeightChange(height);
        }
    }

    /* renamed from: a */
    public void mo16714a(AbstractC4256a aVar) {
        this.f12807d = aVar;
    }

    /* renamed from: a */
    public View$OnKeyListenerC4262a mo16713a(Fragment fragment, C4520c cVar) {
        return this.f12805b.mo45015a(fragment, this.f12806c, cVar);
    }

    public C4255a(Context context, C4260d dVar, C4519b bVar, AbstractC11774d dVar2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.at_bar_viewpager_item, (ViewGroup) null);
        this.f12804a = inflate;
        AtFinderView atFinderView = (AtFinderView) inflate.findViewById(R.id.at_finder_view);
        this.f12805b = atFinderView;
        atFinderView.setAtFinderViewDelegate(dVar2);
        this.f12805b.setTitle(dVar.f12817b);
        this.f12805b.setAtCommonConfig(bVar);
        this.f12806c = dVar.f12818c;
        this.f12805b.setContentHeightChangeCallback(new AtFinderView.AbstractC11761b() {
            /* class com.bytedance.ee.bear.atbottombar.$$Lambda$a$RQJ8zDZCSGc4KCYHUJFz4JXY7_I */

            @Override // com.bytedance.ee.bear.widget.AtFinderView.AbstractC11761b
            public final void onHeightChange() {
                C4255a.lambda$RQJ8zDZCSGc4KCYHUJFz4JXY7_I(C4255a.this);
            }
        });
    }
}
