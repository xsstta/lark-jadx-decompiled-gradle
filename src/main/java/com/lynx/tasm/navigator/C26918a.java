package com.lynx.tasm.navigator;

import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.p1222b.C26630b;
import com.lynx.tasm.navigator.C26927e;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.lynx.tasm.navigator.a */
public class C26918a implements C26927e.AbstractC26928a {

    /* renamed from: a */
    public AbstractC26924b f66844a;

    /* renamed from: b */
    public Stack<C26926d> f66845b;

    /* renamed from: c */
    public LynxView f66846c;

    /* renamed from: d */
    public C26927e f66847d;

    /* renamed from: e */
    private HashMap<String, Object> f66848e;

    /* renamed from: a */
    public void mo95750a() {
        if (!this.f66845b.isEmpty()) {
            mo95752a((LynxView) this.f66847d.remove(this.f66845b.pop()));
            return;
        }
        this.f66844a.mo95756a();
    }

    /* renamed from: b */
    private void m97813b() {
        if (!this.f66845b.isEmpty()) {
            C26926d peek = this.f66845b.peek();
            final LynxView lynxView = (LynxView) this.f66847d.get(peek);
            if (lynxView == null) {
                return;
            }
            if (lynxView.getParent() == null) {
                this.f66844a.mo95758a(lynxView, peek.mo95765a());
                lynxView.addLynxViewClient(new AbstractC26911n() {
                    /* class com.lynx.tasm.navigator.C26918a.C269235 */

                    @Override // com.lynx.tasm.AbstractC26911n
                    /* renamed from: a */
                    public void mo11457a() {
                        C26630b.m96516b().mo94593a(lynxView);
                        lynxView.onEnterForeground();
                    }
                });
                return;
            }
            C26630b.m96516b().mo94593a(lynxView);
            lynxView.onEnterForeground();
        } else if (this.f66846c != null) {
            C26630b.m96516b().mo94593a(this.f66846c);
            this.f66846c.onEnterForeground();
        }
    }

    /* renamed from: a */
    public void mo95751a(ReadableMap readableMap) {
        this.f66848e = readableMap.toHashMap();
    }

    /* renamed from: a */
    private String m97811a(String str) {
        HashMap<String, Object> hashMap = this.f66848e;
        if (hashMap != null) {
            Object obj = hashMap.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return str;
    }

    @Override // com.lynx.tasm.navigator.C26927e.AbstractC26928a
    /* renamed from: b */
    public void mo95754b(LynxView lynxView) {
        this.f66844a.mo95757a(lynxView);
        lynxView.destroy();
    }

    /* renamed from: a */
    public void mo95752a(final LynxView lynxView) {
        if (lynxView != null) {
            C26630b.m96516b().mo94595a(lynxView, new C26630b.AbstractC26635c() {
                /* class com.lynx.tasm.navigator.C26918a.C269224 */

                @Override // com.lynx.tasm.behavior.p1222b.C26630b.AbstractC26635c
                /* renamed from: a */
                public void mo94604a() {
                    C26918a.this.f66844a.mo95757a(lynxView);
                    lynxView.destroy();
                }
            });
            m97813b();
        }
    }

    /* renamed from: a */
    private void m97812a(final C26926d dVar, final AbstractC26930g gVar) {
        this.f66844a.mo95759a(dVar, new AbstractC26930g() {
            /* class com.lynx.tasm.navigator.C26918a.C269213 */
        });
    }

    /* renamed from: b */
    public void mo95755b(final String str, Map<String, Object> map) {
        final C26926d dVar = new C26926d(m97811a(str), map);
        m97812a(dVar, new AbstractC26930g() {
            /* class com.lynx.tasm.navigator.C26918a.C269202 */
        });
    }

    /* renamed from: a */
    public void mo95753a(final String str, Map<String, Object> map) {
        final C26926d dVar = new C26926d(m97811a(str), map);
        m97812a(dVar, new AbstractC26930g() {
            /* class com.lynx.tasm.navigator.C26918a.C269191 */
        });
    }
}
