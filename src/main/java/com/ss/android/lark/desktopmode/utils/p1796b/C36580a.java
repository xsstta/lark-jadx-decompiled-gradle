package com.ss.android.lark.desktopmode.utils.p1796b;

import android.view.KeyEvent;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.ss.android.lark.desktopmode.utils.b.a */
public class C36580a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.desktopmode.utils.b.a$a */
    public static class C36582a {

        /* renamed from: a */
        public static final C36580a f94144a = new C36580a();
    }

    /* renamed from: com.ss.android.lark.desktopmode.utils.b.a$b */
    public interface AbstractC36583b {

        /* renamed from: com.ss.android.lark.desktopmode.utils.b.a$b$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$a(AbstractC36583b bVar) {
                return false;
            }

            public static boolean $default$a(AbstractC36583b bVar, int i) {
                return false;
            }

            public static boolean $default$b(AbstractC36583b bVar) {
                return false;
            }

            public static boolean $default$b(AbstractC36583b bVar, int i) {
                return false;
            }

            public static boolean $default$c(AbstractC36583b bVar) {
                return false;
            }

            public static boolean $default$c(AbstractC36583b bVar, int i) {
                return false;
            }

            public static boolean $default$d(AbstractC36583b bVar) {
                return false;
            }

            public static boolean $default$d(AbstractC36583b bVar, int i) {
                return false;
            }

            public static boolean $default$e(AbstractC36583b bVar, int i) {
                return false;
            }

            public static boolean $default$f(AbstractC36583b bVar, int i) {
                return false;
            }
        }

        /* renamed from: a */
        boolean mo102791a();

        /* renamed from: a */
        boolean mo102792a(int i);

        /* renamed from: b */
        boolean mo102793b();

        /* renamed from: b */
        boolean mo102794b(int i);

        /* renamed from: c */
        boolean mo102795c();

        /* renamed from: c */
        boolean mo102796c(int i);

        /* renamed from: d */
        boolean mo102797d();

        /* renamed from: d */
        boolean mo102798d(int i);

        /* renamed from: e */
        boolean mo102799e(int i);

        /* renamed from: f */
        boolean mo102800f(int i);
    }

    private C36580a() {
    }

    /* renamed from: a */
    public static C36580a m144317a() {
        return C36582a.f94144a;
    }

    /* renamed from: a */
    public boolean mo134972a(KeyEvent keyEvent, AbstractC36583b bVar) {
        if (!(keyEvent.getAction() != 1 || (keyEvent.getFlags() & SmActions.ACTION_ONTHECALL_EXIT) == 128 || bVar == null)) {
            if (keyEvent.getKeyCode() == 111 || keyEvent.getKeyCode() == 4) {
                return bVar.mo102791a();
            }
            if (keyEvent.isAltPressed()) {
                return bVar.mo102792a(keyEvent.getKeyCode());
            }
            if (keyEvent.isCtrlPressed()) {
                return bVar.mo102798d(keyEvent.getKeyCode());
            }
            if (keyEvent.isShiftPressed()) {
                return bVar.mo102794b(keyEvent.getKeyCode());
            }
            if (keyEvent.isSymPressed()) {
                return bVar.mo102796c(keyEvent.getKeyCode());
            }
            if (keyEvent.isMetaPressed()) {
                return bVar.mo102799e(keyEvent.getKeyCode());
            }
            if (keyEvent.isFunctionPressed()) {
                return bVar.mo102800f(keyEvent.getKeyCode());
            }
            if (keyEvent.isCapsLockOn()) {
                return bVar.mo102793b();
            }
            if (keyEvent.isNumLockOn()) {
                return bVar.mo102795c();
            }
            if (keyEvent.isScrollLockOn()) {
                return bVar.mo102797d();
            }
        }
        return false;
    }
}
