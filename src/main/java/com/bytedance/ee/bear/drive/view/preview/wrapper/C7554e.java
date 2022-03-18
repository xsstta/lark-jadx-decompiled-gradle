package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6738g;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.bear.drive.mimetype.C7096d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import java.lang.reflect.Constructor;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.e */
public class C7554e {

    /* renamed from: a */
    private AbstractC7095c f20445a;

    public C7554e(AbstractC7095c cVar) {
        this.f20445a = cVar;
    }

    /* renamed from: a */
    private int m30286a(C7553d dVar) {
        int i;
        if (dVar.mo29497p() == 2) {
            i = 9;
        } else {
            i = this.f20445a.mo27711a(dVar.mo29483d(), dVar.mo29500s()).mo27728c();
        }
        C13479a.m54764b("PreviewViewManager", "getPreviewType previewType = " + i);
        return i;
    }

    /* renamed from: a */
    public AbstractC7549a mo29501a(Context context, ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, C7553d dVar, C6738g gVar, int i) {
        if (dVar == null || lifecycleOwner == null || !C13726a.m55674a(context) || viewModelStoreOwner == null) {
            C13479a.m54758a("PreviewViewManager", "getPreviewView return Null, filemodel=" + dVar + ", owner=" + lifecycleOwner);
            return null;
        }
        C13479a.m54764b("PreviewViewManager", "LifecycleOwner=" + lifecycleOwner);
        Class a = C7096d.m28342a(m30286a(dVar));
        ViewOwner viewOwner = new ViewOwner(viewModelStoreOwner, lifecycleOwner);
        if (a != null) {
            try {
                Constructor declaredConstructor = a.getDeclaredConstructor(ViewOwner.class, Context.class, C7553d.class, C6738g.class);
                declaredConstructor.setAccessible(true);
                AbstractC7549a aVar = (AbstractC7549a) declaredConstructor.newInstance(viewOwner, context, dVar, gVar);
                if (aVar instanceof AbsPreviewView) {
                    ((AbsPreviewView) aVar).setSourceType(i);
                }
                C13479a.m54764b("PreviewViewManager", "DRIVE_PREVIEW_FLOW getPreviewView()...clazz = " + a);
                return aVar;
            } catch (Exception e) {
                C13479a.m54761a("PreviewViewManager", e);
            }
        }
        return null;
    }
}
