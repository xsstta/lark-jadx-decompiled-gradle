package com.lynx.tasm;

import com.bytedance.kit.nglynx.log.LynxKitALogDelegate;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.p1216a.C26546b;
import com.lynx.tasm.p1216a.C26548d;
import com.lynx.tasm.p1216a.C26550f;
import com.lynx.tasm.p1216a.C26553i;
import java.util.ArrayList;
import java.util.Iterator;

public class EventEmitter {

    /* renamed from: a */
    private TemplateAssembler f65571a;

    /* renamed from: b */
    private ArrayList<AbstractC26525b> f65572b = new ArrayList<>();

    /* renamed from: c */
    private AbstractC26524a f65573c;

    public enum LynxEventType {
        kLynxEventTypeTouchEvent,
        kLynxEventTypeCustomEvent,
        kLynxEventTypeLayoutEvent
    }

    /* renamed from: com.lynx.tasm.EventEmitter$a */
    public interface AbstractC26524a {
        /* renamed from: a */
        void mo94079a();
    }

    /* renamed from: com.lynx.tasm.EventEmitter$b */
    public interface AbstractC26525b {
        /* renamed from: a */
        void mo94080a(LynxEventType lynxEventType, C26548d dVar);
    }

    /* renamed from: a */
    public void mo94073a() {
        m96113a(LynxEventType.kLynxEventTypeLayoutEvent, null);
    }

    public EventEmitter(TemplateAssembler templateAssembler) {
        this.f65571a = templateAssembler;
    }

    /* renamed from: a */
    public void mo94074a(AbstractC26525b bVar) {
        if (!this.f65572b.contains(bVar)) {
            this.f65572b.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo94075a(C26546b bVar) {
        TemplateAssembler templateAssembler = this.f65571a;
        if (templateAssembler != null) {
            templateAssembler.mo94298a(bVar);
        }
        m96113a(LynxEventType.kLynxEventTypeCustomEvent, bVar);
    }

    /* renamed from: b */
    public boolean mo94078b(C26553i iVar) {
        if (this.f65571a == null) {
            LLog.m96425c(LynxKitALogDelegate.f38587a, "sendTouchEvent: mTemplateAssembler null");
            return false;
        }
        if (this.f65573c != null && "tap".equals(iVar.mo94349d())) {
            this.f65573c.mo94079a();
        }
        return this.f65571a.mo94313b(iVar);
    }

    /* renamed from: a */
    public void mo94076a(C26550f fVar) {
        TemplateAssembler templateAssembler = this.f65571a;
        if (templateAssembler != null) {
            templateAssembler.mo94299a(fVar);
        }
    }

    /* renamed from: a */
    public void mo94077a(C26553i iVar) {
        if (this.f65571a != null) {
            if (this.f65573c != null && "tap".equals(iVar.mo94349d())) {
                this.f65573c.mo94079a();
            }
            this.f65571a.mo94300a(iVar);
        }
    }

    /* renamed from: a */
    private void m96113a(LynxEventType lynxEventType, C26548d dVar) {
        Iterator<AbstractC26525b> it = this.f65572b.iterator();
        while (it.hasNext()) {
            it.next().mo94080a(lynxEventType, dVar);
        }
    }
}
