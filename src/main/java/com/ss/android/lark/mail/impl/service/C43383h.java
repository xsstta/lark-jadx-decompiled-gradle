package com.ss.android.lark.mail.impl.service;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.mulprocess.C43213b;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.undo.AbstractC43977b;
import com.ss.android.lark.mail.impl.view.undo.DeleteUndoProcess;
import com.ss.android.lark.mail.impl.view.undo.IUndoMulProcess;
import com.ss.android.lark.mail.impl.view.undo.ScheduleSendCancelProcess;
import com.ss.android.lark.mail.impl.view.undo.SendUndoProcess;
import ee.android.framework.manis.C68183b;
import java.util.Objects;
import java.util.Stack;

/* renamed from: com.ss.android.lark.mail.impl.service.h */
public class C43383h {

    /* renamed from: a */
    public Stack<C43387c> f110267a;

    /* renamed from: com.ss.android.lark.mail.impl.service.h$a */
    private static class C43385a {

        /* renamed from: a */
        public static C43383h f110270a = new C43388d();
    }

    /* renamed from: com.ss.android.lark.mail.impl.service.h$b */
    public interface AbstractC43386b {
        /* renamed from: a */
        void mo152948a(AbstractC43977b bVar);
    }

    /* renamed from: com.ss.android.lark.mail.impl.service.h$c */
    class C43387c {

        /* renamed from: b */
        private final String f110272b;

        /* renamed from: c */
        private final AbstractC43386b f110273c;

        /* renamed from: a */
        public AbstractC43386b mo155147a() {
            return this.f110273c;
        }

        public int hashCode() {
            return Objects.hash(this.f110272b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.f110272b, ((C43387c) obj).f110272b);
        }

        public C43387c(C43383h hVar, String str) {
            this(str, null);
        }

        public C43387c(String str, AbstractC43386b bVar) {
            this.f110272b = str;
            this.f110273c = bVar;
        }
    }

    /* renamed from: a */
    public static C43383h m172311a() {
        return C43385a.f110270a;
    }

    /* renamed from: com.ss.android.lark.mail.impl.service.h$d */
    public static class C43388d extends C43383h {
        public C43388d() {
            super();
        }

        @Override // com.ss.android.lark.mail.impl.service.C43383h
        /* renamed from: a */
        public void mo155143a(AbstractC43977b bVar) {
            if (C41816b.m166115a().mo150120a() == C43213b.f109974a) {
                C43383h.super.mo155143a(bVar);
                return;
            }
            IUndoMulProcess iUndoMulProcess = (IUndoMulProcess) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IUndoMulProcess.class);
            if (iUndoMulProcess == null) {
                return;
            }
            if (bVar instanceof SendUndoProcess) {
                iUndoMulProcess.showSendUndo((SendUndoProcess) bVar);
            } else if (bVar instanceof DeleteUndoProcess) {
                iUndoMulProcess.showDeleteUndo((DeleteUndoProcess) bVar);
            } else if (bVar instanceof ScheduleSendCancelProcess) {
                iUndoMulProcess.showScheduleCancel((ScheduleSendCancelProcess) bVar);
            }
        }
    }

    private C43383h() {
        this.f110267a = new Stack<>();
    }

    /* renamed from: a */
    public void mo155144a(String str) {
        this.f110267a.remove(new C43387c(this, str));
    }

    /* renamed from: a */
    public void mo155143a(final AbstractC43977b bVar) {
        Log.m165389i("UndoService", "onUndoAction show:" + bVar + ", process:" + C41816b.m166115a().mo150120a());
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.C43383h.RunnableC433841 */

            public void run() {
                C43387c peek;
                if (!C43383h.this.f110267a.isEmpty() && (peek = C43383h.this.f110267a.peek()) != null && peek.mo155147a() != null) {
                    peek.mo155147a().mo152948a(bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo155145a(String str, AbstractC43386b bVar) {
        C43387c cVar = new C43387c(str, bVar);
        if (!this.f110267a.contains(cVar)) {
            this.f110267a.push(cVar);
        }
    }
}
