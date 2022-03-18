package com.ss.android.lark.passport.infra.util.collection;

import java.util.List;

/* renamed from: com.ss.android.lark.passport.infra.util.collection.c */
public interface AbstractC49181c<T> extends List<T> {

    /* renamed from: com.ss.android.lark.passport.infra.util.collection.c$a */
    public static abstract class AbstractC49182a<T extends AbstractC49181c> {
        /* renamed from: a */
        public abstract void mo171683a(T t);

        /* renamed from: a */
        public abstract void mo171684a(T t, int i, int i2);

        /* renamed from: a */
        public abstract void mo171685a(T t, int i, int i2, int i3);

        /* renamed from: b */
        public abstract void mo171686b(T t, int i, int i2);

        /* renamed from: c */
        public abstract void mo171687c(T t, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.passport.infra.util.collection.c$b */
    public static abstract class AbstractC49183b<T extends AbstractC49181c> extends AbstractC49182a<T> {
        @Override // com.ss.android.lark.passport.infra.util.collection.AbstractC49181c.AbstractC49182a
        /* renamed from: a */
        public void mo171684a(T t, int i, int i2) {
            mo171683a(t);
        }

        @Override // com.ss.android.lark.passport.infra.util.collection.AbstractC49181c.AbstractC49182a
        /* renamed from: b */
        public void mo171686b(T t, int i, int i2) {
            mo171683a(t);
        }

        @Override // com.ss.android.lark.passport.infra.util.collection.AbstractC49181c.AbstractC49182a
        /* renamed from: c */
        public void mo171687c(T t, int i, int i2) {
            mo171683a(t);
        }

        @Override // com.ss.android.lark.passport.infra.util.collection.AbstractC49181c.AbstractC49182a
        /* renamed from: a */
        public void mo171685a(T t, int i, int i2, int i3) {
            mo171683a(t);
        }
    }
}
