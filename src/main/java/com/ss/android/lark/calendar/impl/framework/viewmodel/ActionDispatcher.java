package com.ss.android.lark.calendar.impl.framework.viewmodel;

/* renamed from: com.ss.android.lark.calendar.impl.framework.viewmodel.a */
public interface ActionDispatcher {
    boolean doAction(String str, Object obj);

    /* renamed from: com.ss.android.lark.calendar.impl.framework.viewmodel.a$a */
    public static final class C32507a {
        /* renamed from: a */
        public static /* synthetic */ boolean m124446a(ActionDispatcher aVar, String str, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 2) != 0) {
                    obj = null;
                }
                return aVar.doAction(str, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doAction");
        }
    }
}
