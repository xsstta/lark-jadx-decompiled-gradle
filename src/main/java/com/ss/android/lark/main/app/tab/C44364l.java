package com.ss.android.lark.main.app.tab;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.tab.l */
public class C44364l extends BottomSheetBehavior.AbstractC22177a {

    /* renamed from: a */
    List<AbstractC44366b> f112563a = new ArrayList();

    /* renamed from: com.ss.android.lark.main.app.tab.l$a */
    public static abstract class AbstractC44365a implements AbstractC44366b {
        @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
        /* renamed from: a */
        public void mo157358a(View view) {
        }

        @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
        /* renamed from: a */
        public void mo157359a(View view, float f) {
        }

        @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
        /* renamed from: b */
        public void mo157360b(View view) {
        }

        @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
        /* renamed from: c */
        public void mo157361c(View view) {
        }

        @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
        /* renamed from: d */
        public void mo157362d(View view) {
        }

        @Override // com.ss.android.lark.main.app.tab.C44364l.AbstractC44366b
        /* renamed from: e */
        public void mo157363e(View view) {
        }
    }

    /* renamed from: com.ss.android.lark.main.app.tab.l$b */
    public interface AbstractC44366b {
        /* renamed from: a */
        void mo157358a(View view);

        /* renamed from: a */
        void mo157359a(View view, float f);

        /* renamed from: b */
        void mo157360b(View view);

        /* renamed from: c */
        void mo157361c(View view);

        /* renamed from: d */
        void mo157362d(View view);

        /* renamed from: e */
        void mo157363e(View view);
    }

    public C44364l(AbstractC44366b... bVarArr) {
        if (bVarArr != null) {
            for (AbstractC44366b bVar : bVarArr) {
                this.f112563a.add(bVar);
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
    /* renamed from: a */
    public void mo24937a(View view, float f) {
        for (AbstractC44366b bVar : this.f112563a) {
            bVar.mo157359a(view, f);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
    /* renamed from: a */
    public void mo24938a(View view, int i) {
        for (AbstractC44366b bVar : this.f112563a) {
            if (i == 5) {
                bVar.mo157361c(view);
            } else if (i == 1) {
                bVar.mo157360b(view);
            } else if (i == 3) {
                bVar.mo157358a(view);
            } else if (i == 4) {
                bVar.mo157362d(view);
            } else if (i == 2) {
                bVar.mo157363e(view);
            }
        }
    }
}
