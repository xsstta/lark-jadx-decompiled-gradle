package com.ss.android.lark.mediapicker.album.base;

import com.ss.android.lark.mediapicker.entity.C44681b;
import com.ss.android.lark.mediapicker.entity.EditInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.mediapicker.album.base.j */
public class C44660j {

    /* renamed from: a */
    private List<WeakReference<AbstractC44659i>> f113174a = new ArrayList();

    /* renamed from: com.ss.android.lark.mediapicker.album.base.j$a */
    private static final class C44661a {

        /* renamed from: a */
        public static final C44660j f113175a = new C44660j();
    }

    /* renamed from: a */
    public static C44660j m177158a() {
        return C44661a.f113175a;
    }

    /* renamed from: a */
    public void mo158242a(AbstractC44659i iVar) {
        this.f113174a.add(new WeakReference<>(iVar));
    }

    /* renamed from: a */
    public void mo158243a(EditInfo editInfo) {
        Iterator<WeakReference<AbstractC44659i>> it = this.f113174a.iterator();
        while (it.hasNext()) {
            AbstractC44659i iVar = it.next().get();
            if (iVar == null) {
                it.remove();
            } else {
                iVar.mo158146a(editInfo);
            }
        }
    }

    /* renamed from: b */
    public void mo158245b(AbstractC44659i iVar) {
        Iterator<WeakReference<AbstractC44659i>> it = this.f113174a.iterator();
        while (it.hasNext()) {
            AbstractC44659i iVar2 = it.next().get();
            if (iVar2 == null || iVar2 == iVar) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void mo158244a(C44681b bVar) {
        Iterator<WeakReference<AbstractC44659i>> it = this.f113174a.iterator();
        while (it.hasNext()) {
            AbstractC44659i iVar = it.next().get();
            if (iVar == null) {
                it.remove();
            } else {
                iVar.mo158147a(bVar.f113233b, bVar.f113232a);
            }
        }
    }
}
