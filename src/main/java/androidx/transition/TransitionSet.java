package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.C0767f;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class TransitionSet extends Transition {

    /* renamed from: a */
    int f5308a;

    /* renamed from: i */
    boolean f5309i = false;

    /* renamed from: j */
    private ArrayList<Transition> f5310j = new ArrayList<>();

    /* renamed from: k */
    private boolean f5311k = true;

    /* renamed from: l */
    private int f5312l = 0;

    /* renamed from: a */
    public TransitionSet mo7933a(Transition transition) {
        m6887b(transition);
        if (this.f5276b >= 0) {
            transition.mo7878a(this.f5276b);
        }
        if ((this.f5312l & 1) != 0) {
            transition.mo7879a(mo7908d());
        }
        if ((this.f5312l & 2) != 0) {
            transition.mo7892a(mo7923p());
        }
        if ((this.f5312l & 4) != 0) {
            transition.mo7890a(mo7920m());
        }
        if ((this.f5312l & 8) != 0) {
            transition.mo7891a(mo7921n());
        }
        return this;
    }

    /* renamed from: a */
    public TransitionSet mo7905c(View view) {
        for (int i = 0; i < this.f5310j.size(); i++) {
            this.f5310j.get(i).mo7905c(view);
        }
        return (TransitionSet) super.mo7905c(view);
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7890a(PathMotion pathMotion) {
        super.mo7890a(pathMotion);
        this.f5312l |= 4;
        if (this.f5310j != null) {
            for (int i = 0; i < this.f5310j.size(); i++) {
                this.f5310j.get(i).mo7890a(pathMotion);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7888a(ViewGroup viewGroup, C1563z zVar, C1563z zVar2, ArrayList<C1562y> arrayList, ArrayList<C1562y> arrayList2) {
        long c = mo7904c();
        int size = this.f5310j.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f5310j.get(i);
            if (c > 0 && (this.f5311k || i == 0)) {
                long c2 = transition.mo7904c();
                if (c2 > 0) {
                    transition.mo7897b(c2 + c);
                } else {
                    transition.mo7897b(c);
                }
            }
            transition.mo7888a(viewGroup, zVar, zVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7807a(C1562y yVar) {
        if (mo7903b(yVar.f5459b)) {
            Iterator<Transition> it = this.f5310j.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo7903b(yVar.f5459b)) {
                    next.mo7807a(yVar);
                    yVar.f5460c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7892a(AbstractC1559w wVar) {
        super.mo7892a(wVar);
        this.f5312l |= 2;
        int size = this.f5310j.size();
        for (int i = 0; i < size; i++) {
            this.f5310j.get(i).mo7892a(wVar);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public void mo7891a(Transition.AbstractC1504c cVar) {
        super.mo7891a(cVar);
        this.f5312l |= 8;
        int size = this.f5310j.size();
        for (int i = 0; i < size; i++) {
            this.f5310j.get(i).mo7891a(cVar);
        }
    }

    /* renamed from: s */
    public int mo7944s() {
        return this.f5310j.size();
    }

    public TransitionSet() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo7919l() {
        super.mo7919l();
        int size = this.f5310j.size();
        for (int i = 0; i < size; i++) {
            this.f5310j.get(i).mo7919l();
        }
    }

    /* renamed from: t */
    private void m6888t() {
        C1507a aVar = new C1507a(this);
        Iterator<Transition> it = this.f5310j.iterator();
        while (it.hasNext()) {
            it.next().mo7880a(aVar);
        }
        this.f5308a = this.f5310j.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: q */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f5310j = new ArrayList<>();
        int size = this.f5310j.size();
        for (int i = 0; i < size; i++) {
            transitionSet.m6887b(this.f5310j.get(i).clone());
        }
        return transitionSet;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo7910e() {
        if (this.f5310j.isEmpty()) {
            mo7917j();
            mo7918k();
            return;
        }
        m6888t();
        if (!this.f5311k) {
            for (int i = 1; i < this.f5310j.size(); i++) {
                final Transition transition = this.f5310j.get(i);
                this.f5310j.get(i - 1).mo7880a(new C1555u() {
                    /* class androidx.transition.TransitionSet.C15061 */

                    @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                    /* renamed from: b */
                    public void mo7816b(Transition transition) {
                        transition.mo7910e();
                        transition.mo7898b(this);
                    }
                });
            }
            Transition transition2 = this.f5310j.get(0);
            if (transition2 != null) {
                transition2.mo7910e();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.f5310j.iterator();
        while (it.hasNext()) {
            it.next().mo7910e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.transition.TransitionSet$a */
    public static class C1507a extends C1555u {

        /* renamed from: a */
        TransitionSet f5315a;

        C1507a(TransitionSet transitionSet) {
            this.f5315a = transitionSet;
        }

        @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
        /* renamed from: b */
        public void mo7816b(Transition transition) {
            TransitionSet transitionSet = this.f5315a;
            transitionSet.f5308a--;
            if (this.f5315a.f5308a == 0) {
                this.f5315a.f5309i = false;
                this.f5315a.mo7918k();
            }
            transition.mo7898b(this);
        }

        @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
        /* renamed from: e */
        public void mo7931e(Transition transition) {
            if (!this.f5315a.f5309i) {
                this.f5315a.mo7917j();
                this.f5315a.f5309i = true;
            }
        }
    }

    /* renamed from: b */
    private void m6887b(Transition transition) {
        this.f5310j.add(transition);
        transition.f5279e = this;
    }

    /* renamed from: c */
    public TransitionSet mo7880a(Transition.AbstractC1505d dVar) {
        return (TransitionSet) super.mo7880a(dVar);
    }

    /* renamed from: d */
    public TransitionSet mo7897b(long j) {
        return (TransitionSet) super.mo7897b(j);
    }

    /* renamed from: c */
    public Transition mo7936c(int i) {
        if (i < 0 || i >= this.f5310j.size()) {
            return null;
        }
        return this.f5310j.get(i);
    }

    /* renamed from: d */
    public TransitionSet mo7896b(int i) {
        for (int i2 = 0; i2 < this.f5310j.size(); i2++) {
            this.f5310j.get(i2).mo7896b(i);
        }
        return (TransitionSet) super.mo7896b(i);
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo7911e(View view) {
        super.mo7911e(view);
        int size = this.f5310j.size();
        for (int i = 0; i < size; i++) {
            this.f5310j.get(i).mo7911e(view);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: f */
    public void mo7913f(View view) {
        super.mo7913f(view);
        int size = this.f5310j.size();
        for (int i = 0; i < size; i++) {
            this.f5310j.get(i).mo7913f(view);
        }
    }

    /* renamed from: g */
    public TransitionSet mo7909d(View view) {
        for (int i = 0; i < this.f5310j.size(); i++) {
            this.f5310j.get(i).mo7909d(view);
        }
        return (TransitionSet) super.mo7909d(view);
    }

    /* renamed from: c */
    public TransitionSet mo7878a(long j) {
        ArrayList<Transition> arrayList;
        super.mo7878a(j);
        if (this.f5276b >= 0 && (arrayList = this.f5310j) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5310j.get(i).mo7878a(j);
            }
        }
        return this;
    }

    /* renamed from: d */
    public TransitionSet mo7898b(Transition.AbstractC1505d dVar) {
        return (TransitionSet) super.mo7898b(dVar);
    }

    /* renamed from: b */
    public TransitionSet mo7879a(TimeInterpolator timeInterpolator) {
        this.f5312l |= 1;
        ArrayList<Transition> arrayList = this.f5310j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5310j.get(i).mo7879a(timeInterpolator);
            }
        }
        return (TransitionSet) super.mo7879a(timeInterpolator);
    }

    /* renamed from: c */
    public TransitionSet mo7883a(String str) {
        for (int i = 0; i < this.f5310j.size(); i++) {
            this.f5310j.get(i).mo7883a(str);
        }
        return (TransitionSet) super.mo7883a(str);
    }

    /* renamed from: b */
    public TransitionSet mo7881a(Class<?> cls) {
        for (int i = 0; i < this.f5310j.size(); i++) {
            this.f5310j.get(i).mo7881a(cls);
        }
        return (TransitionSet) super.mo7881a(cls);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    /* renamed from: c */
    public void mo7906c(C1562y yVar) {
        super.mo7906c(yVar);
        int size = this.f5310j.size();
        for (int i = 0; i < size; i++) {
            this.f5310j.get(i).mo7906c(yVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    /* renamed from: b */
    public String mo7900b(String str) {
        String b = super.mo7900b(str);
        for (int i = 0; i < this.f5310j.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append("\n");
            sb.append(this.f5310j.get(i).mo7900b(str + "  "));
            b = sb.toString();
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7901b(ViewGroup viewGroup) {
        super.mo7901b(viewGroup);
        int size = this.f5310j.size();
        for (int i = 0; i < size; i++) {
            this.f5310j.get(i).mo7901b(viewGroup);
        }
    }

    /* renamed from: a */
    public TransitionSet mo7874a(int i) {
        if (i == 0) {
            this.f5311k = true;
        } else if (i == 1) {
            this.f5311k = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: b */
    public void mo7810b(C1562y yVar) {
        if (mo7903b(yVar.f5459b)) {
            Iterator<Transition> it = this.f5310j.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.mo7903b(yVar.f5459b)) {
                    next.mo7810b(yVar);
                    yVar.f5460c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Transition mo7877a(int i, boolean z) {
        for (int i2 = 0; i2 < this.f5310j.size(); i2++) {
            this.f5310j.get(i2).mo7877a(i, z);
        }
        return super.mo7877a(i, z);
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1553s.f5439i);
        mo7874a(C0767f.m3693a(obtainStyledAttributes, (XmlPullParser) ((XmlResourceParser) attributeSet), "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Transition mo7882a(Class<?> cls, boolean z) {
        for (int i = 0; i < this.f5310j.size(); i++) {
            this.f5310j.get(i).mo7882a(cls, z);
        }
        return super.mo7882a(cls, z);
    }

    @Override // androidx.transition.Transition
    /* renamed from: a */
    public Transition mo7884a(String str, boolean z) {
        for (int i = 0; i < this.f5310j.size(); i++) {
            this.f5310j.get(i).mo7884a(str, z);
        }
        return super.mo7884a(str, z);
    }
}
