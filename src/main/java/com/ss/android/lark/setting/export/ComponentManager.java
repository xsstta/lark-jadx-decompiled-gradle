package com.ss.android.lark.setting.export;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.lark.setting.AbstractC54113a;
import com.ss.android.lark.setting.DividerItemView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ComponentManager implements AbstractC54126b {

    /* renamed from: a */
    private final Map<String, AbstractC54125a> f134011a = new ConcurrentHashMap();

    /* renamed from: b */
    private List<String> f134012b = new ArrayList();

    /* renamed from: c */
    private int f134013c = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: a */
    public void mo132391a() {
        for (AbstractC54125a aVar : m210132c()) {
            aVar.mo132391a();
        }
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    public void aA_() {
        for (AbstractC54125a aVar : m210132c()) {
            aVar.aA_();
        }
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: d */
    public void mo132396d() {
        for (AbstractC54125a aVar : m210132c()) {
            aVar.mo132396d();
        }
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: e */
    public void mo132397e() {
        for (AbstractC54125a aVar : m210132c()) {
            aVar.mo132397e();
        }
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public void mo132399g() {
        for (AbstractC54125a aVar : m210132c()) {
            aVar.mo132399g();
        }
    }

    /* renamed from: c */
    private List<AbstractC54125a> m210132c() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f134012b) {
            AbstractC54125a aVar = this.f134011a.get(str);
            if (aVar != null && aVar.mo132398f()) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo185299a(List<String> list) {
        this.f134012b = list;
    }

    /* renamed from: b */
    private View m210131b(AbstractC54125a aVar) {
        if (this.f134013c == 1) {
            return aVar.mo132394b();
        }
        return aVar.az_();
    }

    /* renamed from: a */
    public void mo185298a(AbstractC54125a aVar) {
        if (aVar != null) {
            this.f134011a.put(aVar.mo132395c(), aVar);
        }
    }

    public ComponentManager(int i) {
        this.f134013c = i;
    }

    /* renamed from: a */
    public View mo185297a(Context context) {
        List<AbstractC54125a> c = m210132c();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        for (int i = 0; i <= c.size() - 1; i++) {
            View b = m210131b(c.get(i));
            if (i < c.size() - 1) {
                View b2 = m210131b(c.get(i + 1));
                if ((b instanceof AbstractC54113a) && (b2 instanceof AbstractC54113a)) {
                    AbstractC54113a aVar = (AbstractC54113a) b;
                    if (aVar.mo169823b() && ((AbstractC54113a) b2).mo169821a()) {
                        aVar.mo169822b(false);
                    }
                    boolean z = b instanceof DividerItemView;
                    if (z) {
                        AbstractC54113a aVar2 = (AbstractC54113a) b2;
                        if (aVar2.mo169821a()) {
                            aVar2.mo169822b(true);
                        }
                    }
                    boolean z2 = b2 instanceof DividerItemView;
                    if (z2 && aVar.mo169823b()) {
                        aVar.mo169822b(false);
                    }
                    if (z) {
                        ((AbstractC54113a) b2).mo169824c(true);
                    }
                    if (z2) {
                        aVar.mo169825d(true);
                    }
                }
            } else if ((b instanceof AbstractC54113a) && !(b instanceof DividerItemView)) {
                ((AbstractC54113a) b).mo169825d(true);
            }
            linearLayout.addView(b, new LinearLayout.LayoutParams(-1, -2));
        }
        return linearLayout;
    }
}
