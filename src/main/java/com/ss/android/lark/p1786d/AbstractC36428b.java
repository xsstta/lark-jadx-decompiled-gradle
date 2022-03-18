package com.ss.android.lark.p1786d;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ss.android.lark.d.b */
public abstract class AbstractC36428b implements AbstractC36434e {

    /* renamed from: com.ss.android.lark.d.b$a */
    public interface AbstractC36429a {
        void action(int i, int i2);
    }

    @Override // com.ss.android.lark.p1786d.AbstractC36434e
    /* renamed from: a */
    public View mo134293a(Context context, int i, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.ss.android.lark.p1786d.AbstractC36434e
    /* renamed from: a */
    public View mo134294a(Context context, int i, ViewGroup viewGroup, boolean z) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo134296a(ViewGroup viewGroup, C36430b bVar, long j);

    /* renamed from: com.ss.android.lark.d.b$b */
    public class C36430b {

        /* renamed from: b */
        private SparseIntArray f93981b = new SparseIntArray();

        /* renamed from: c */
        private ViewGroup f93982c;

        /* renamed from: a */
        public void mo134299a() {
            mo134300a(0);
        }

        /* renamed from: a */
        public C36430b mo134298a(ViewGroup viewGroup) {
            this.f93982c = viewGroup;
            return this;
        }

        public C36430b() {
        }

        /* renamed from: a */
        public void mo134300a(long j) {
            AbstractC36428b.this.mo134296a(this.f93982c, this, j);
        }

        /* renamed from: a */
        public void mo134301a(AbstractC36429a aVar) {
            for (int i = 0; i < this.f93981b.size(); i++) {
                aVar.action(this.f93981b.keyAt(i), this.f93981b.valueAt(i));
            }
        }

        /* renamed from: a */
        public C36430b mo134297a(int i, int i2) {
            this.f93981b.put(i, i2);
            return this;
        }
    }

    /* renamed from: a */
    public C36430b mo134295a() {
        return new C36430b();
    }
}
