package com.larksuite.component.blockit.props;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.blockit.props.d */
public class C24134d {

    /* renamed from: a */
    private Map<String, WeakReference<PropsView>> f59685a = new ConcurrentHashMap();

    /* renamed from: b */
    private Map<String, List<AbstractC24131a>> f59686b = new ConcurrentHashMap();

    /* renamed from: b */
    public List<AbstractC24131a> mo86645b(String str) {
        return this.f59686b.get(str);
    }

    /* renamed from: a */
    public PropsView mo86642a(String str) {
        WeakReference<PropsView> weakReference = this.f59685a.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void mo86644a(String str, AbstractC24131a aVar) {
        List<AbstractC24131a> b;
        PropsView propsView;
        ViewParent parent;
        WeakReference<PropsView> remove = this.f59685a.remove(str);
        if (!(remove == null || (propsView = remove.get()) == null || (parent = propsView.getParent()) == null || !(parent instanceof ViewGroup))) {
            ((ViewGroup) parent).removeView(propsView);
        }
        if (aVar != null && (b = mo86645b(str)) != null) {
            b.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo86643a(String str, PropsView propsView, AbstractC24131a aVar) {
        if (propsView != null) {
            this.f59685a.put(str, new WeakReference<>(propsView));
        }
        if (aVar != null) {
            List<AbstractC24131a> list = this.f59686b.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(aVar);
            this.f59686b.put(str, list);
        }
    }
}
