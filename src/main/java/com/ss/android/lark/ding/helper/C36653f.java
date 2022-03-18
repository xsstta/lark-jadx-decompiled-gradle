package com.ss.android.lark.ding.helper;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.ding.helper.AbstractC36654g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.ding.helper.f */
public class C36653f implements AbstractC36654g {

    /* renamed from: d */
    private static final List<AbstractC36654g.AbstractC36656b> f94263d = new CopyOnWriteArrayList();

    /* renamed from: a */
    Context f94264a;

    /* renamed from: b */
    View f94265b;

    /* renamed from: c */
    AbstractC36654g.AbstractC36655a f94266c;

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135196a(Activity activity) {
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: c */
    public int mo135200c() {
        return 0;
    }

    /* renamed from: d */
    public int mo135231d() {
        return 2;
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: b */
    public int mo135199b() {
        return UIUtils.dp2px(this.f94264a, 36.0f);
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135195a() {
        if (this.f94265b != null) {
            for (AbstractC36654g.AbstractC36656b bVar : f94263d) {
                if (bVar != null) {
                    bVar.mo133391a(this.f94265b, false);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m144655a(AbstractC36654g.AbstractC36656b bVar) {
        f94263d.add(bVar);
    }

    /* renamed from: b */
    public static void m144656b(AbstractC36654g.AbstractC36656b bVar) {
        f94263d.remove(bVar);
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135197a(View view) {
        this.f94265b = view;
    }

    @Override // com.ss.android.lark.ding.helper.AbstractC36654g
    /* renamed from: a */
    public void mo135198a(boolean z) {
        for (AbstractC36654g.AbstractC36656b bVar : f94263d) {
            if (bVar != null) {
                bVar.mo133391a(this.f94265b, true);
            }
        }
    }

    public C36653f(Context context, AbstractC36654g.AbstractC36655a aVar) {
        this.f94264a = context;
        this.f94266c = aVar;
    }
}
