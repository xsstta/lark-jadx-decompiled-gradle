package com.larksuite.component.dynamicresources;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.view.C0905g;
import com.larksuite.framework.utils.C26254af;
import com.ss.android.lark.log.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.component.dynamicresources.e */
public class LayoutInflater$Factory2C24292e implements LayoutInflater.Factory2 {

    /* renamed from: e */
    private static final String[] f59957e = {"android.widget.", "android.view.", "android.webkit.", "android.app."};

    /* renamed from: a */
    public final AbstractC24311j f59958a;

    /* renamed from: b */
    private LayoutInflater.Factory f59959b;

    /* renamed from: c */
    private Context f59960c;

    /* renamed from: d */
    private List<AbstractC24299a> f59961d = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.dynamicresources.e$a */
    public interface AbstractC24299a {
        /* renamed from: a */
        void mo86987a(View view, AttributeSet attributeSet, Map<String, Pair<String, Integer>> map);

        /* renamed from: a */
        boolean mo86988a(AttributeSet attributeSet);
    }

    /* renamed from: a */
    public LayoutInflater.Factory mo86983a() {
        return this.f59959b;
    }

    /* renamed from: b */
    private void m88689b() {
        this.f59961d.add(new AbstractC24299a() {
            /* class com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.C242931 */

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public boolean mo86988a(AttributeSet attributeSet) {
                C24305h.m88729a("hasResourcesKey", "");
                int i = -1;
                int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", -1);
                if (attributeResourceValue == -1) {
                    C24305h.m88730b("hasResourcesKey", "no attr");
                    return false;
                }
                if (attributeResourceValue > 0) {
                    i = LayoutInflater$Factory2C24292e.this.f59958a.mo86914a(attributeResourceValue);
                }
                C24305h.m88730b("hasResourcesKey", "has attr");
                if (i > 0) {
                    return true;
                }
                return false;
            }

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public void mo86987a(View view, AttributeSet attributeSet, Map<String, Pair<String, Integer>> map) {
                int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", -1);
                if (attributeResourceValue > 0) {
                    map.put("text", new Pair<>("text", Integer.valueOf(attributeResourceValue)));
                }
            }
        });
        this.f59961d.add(new AbstractC24299a() {
            /* class com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.C242942 */

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public boolean mo86988a(AttributeSet attributeSet) {
                C24305h.m88729a("hasResourcesKey", "");
                int i = -1;
                int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", -1);
                if (attributeResourceValue == -1) {
                    C24305h.m88730b("hasResourcesKey", "no attr");
                    return false;
                }
                if (attributeResourceValue > 0) {
                    i = LayoutInflater$Factory2C24292e.this.f59958a.mo86914a(attributeResourceValue);
                }
                C24305h.m88730b("hasResourcesKey", "has attr");
                if (i > 0) {
                    return true;
                }
                return false;
            }

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public void mo86987a(View view, AttributeSet attributeSet, Map<String, Pair<String, Integer>> map) {
                int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", -1);
                if (attributeResourceValue > 0) {
                    map.put("src", new Pair<>("drawable", Integer.valueOf(attributeResourceValue)));
                }
            }
        });
        this.f59961d.add(new AbstractC24299a() {
            /* class com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.C242953 */

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public boolean mo86988a(AttributeSet attributeSet) {
                return !TextUtils.isEmpty(attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "_dynamicResourcesColorSelectorAttr"));
            }

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public void mo86987a(View view, AttributeSet attributeSet, Map<String, Pair<String, Integer>> map) {
                String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "_dynamicResourcesColorSelectorAttr");
                if (!TextUtils.isEmpty(attributeValue)) {
                    HashSet<String> hashSet = new HashSet();
                    if (!TextUtils.isEmpty(attributeValue)) {
                        for (String str : attributeValue.split("\\|")) {
                            hashSet.add(str.split(":")[1]);
                        }
                    }
                    for (String str2 : hashSet) {
                        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", str2, 0);
                        if (attributeResourceValue == 0) {
                            Log.m165383e("DynamicResourcesFactory", "getAttributeResourceValue color selector null : " + str2 + ", " + view);
                        } else {
                            map.put(str2, new Pair<>("color_selector", Integer.valueOf(attributeResourceValue)));
                        }
                    }
                }
            }
        });
        this.f59961d.add(new AbstractC24299a() {
            /* class com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.C242964 */

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public boolean mo86988a(AttributeSet attributeSet) {
                return !TextUtils.isEmpty(attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "_dynamicResourcesColorSimpleAttr"));
            }

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public void mo86987a(View view, AttributeSet attributeSet, Map<String, Pair<String, Integer>> map) {
                String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "_dynamicResourcesColorSimpleAttr");
                if (!TextUtils.isEmpty(attributeValue)) {
                    HashSet<String> hashSet = new HashSet();
                    if (!TextUtils.isEmpty(attributeValue)) {
                        for (String str : attributeValue.split("\\|")) {
                            hashSet.add(str.split(":")[1]);
                        }
                    }
                    for (String str2 : hashSet) {
                        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", str2, 0);
                        if (attributeResourceValue == 0) {
                            Log.m165383e("DynamicResourcesFactory", "getAttributeResourceValue color null : " + str2 + ", " + view);
                        } else {
                            map.put(str2, new Pair<>("color", Integer.valueOf(attributeResourceValue)));
                        }
                    }
                }
            }
        });
        this.f59961d.add(new AbstractC24299a() {
            /* class com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.C242975 */

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public boolean mo86988a(AttributeSet attributeSet) {
                return !TextUtils.isEmpty(attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "_dynamicResourcesDrawableAttr"));
            }

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public void mo86987a(View view, AttributeSet attributeSet, Map<String, Pair<String, Integer>> map) {
                String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "_dynamicResourcesDrawableAttr");
                if (!TextUtils.isEmpty(attributeValue)) {
                    HashSet<String> hashSet = new HashSet();
                    if (!TextUtils.isEmpty(attributeValue)) {
                        for (String str : attributeValue.split("\\|")) {
                            hashSet.add(str.split(":")[1]);
                        }
                    }
                    for (String str2 : hashSet) {
                        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", str2, 0);
                        if (attributeResourceValue == 0) {
                            Log.m165383e("DynamicResourcesFactory", "getAttributeResourceValue drawable null : " + str2 + ", " + view);
                        } else {
                            map.put(str2, new Pair<>("drawable", Integer.valueOf(attributeResourceValue)));
                        }
                    }
                }
            }
        });
        this.f59961d.add(new AbstractC24299a() {
            /* class com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.C242986 */

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public boolean mo86988a(AttributeSet attributeSet) {
                return !TextUtils.isEmpty(attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "_dynamicResourcesTextAttr"));
            }

            @Override // com.larksuite.component.dynamicresources.LayoutInflater$Factory2C24292e.AbstractC24299a
            /* renamed from: a */
            public void mo86987a(View view, AttributeSet attributeSet, Map<String, Pair<String, Integer>> map) {
                String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "_dynamicResourcesTextAttr");
                if (!TextUtils.isEmpty(attributeValue)) {
                    HashSet<String> hashSet = new HashSet();
                    if (!TextUtils.isEmpty(attributeValue)) {
                        for (String str : attributeValue.split("\\|")) {
                            hashSet.add(str.split(":")[1]);
                        }
                    }
                    for (String str2 : hashSet) {
                        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", str2, 0);
                        if (attributeResourceValue == 0) {
                            Log.m165383e("DynamicResourcesFactory", "getAttributeResourceValue text null : " + str2 + ", " + view);
                        } else {
                            map.put(str2, new Pair<>("text", Integer.valueOf(attributeResourceValue)));
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo86984a(LayoutInflater.Factory factory) {
        this.f59959b = factory;
    }

    /* renamed from: a */
    static LayoutInflater$Factory2C24292e m88684a(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        LayoutInflater.Factory factory = from.getFactory();
        if (factory instanceof LayoutInflater$Factory2C24292e) {
            return (LayoutInflater$Factory2C24292e) factory;
        }
        if (factory != null) {
            try {
                Field a = C26254af.m95001a((Class<?>) LayoutInflater.class, "mFactorySet");
                if (a == null) {
                    Log.m165397w("DynamicResourcesFactory", "reflection set mFactorySet failed, field = null");
                } else {
                    a.setAccessible(true);
                    a.set(from, false);
                }
            } catch (Exception e) {
                Log.m165398w("DynamicResourcesFactory", "reflection set mFactorySet failed", e);
            }
        }
        LayoutInflater$Factory2C24292e eVar = new LayoutInflater$Factory2C24292e(context, factory);
        C0905g.m4353a(from, eVar);
        return eVar;
    }

    /* renamed from: a */
    private boolean m88688a(AttributeSet attributeSet) {
        for (AbstractC24299a aVar : this.f59961d) {
            if (aVar.mo86988a(attributeSet)) {
                return true;
            }
        }
        return false;
    }

    private LayoutInflater$Factory2C24292e(Context context, LayoutInflater.Factory factory) {
        this.f59960c = context;
        this.f59959b = factory;
        this.f59958a = C24301g.m88706a().mo86992a(this.f59960c);
        m88689b();
    }

    /* renamed from: a */
    private void m88686a(View view, AttributeSet attributeSet) {
        HashMap hashMap = new HashMap();
        for (AbstractC24299a aVar : this.f59961d) {
            aVar.mo86987a(view, attributeSet, hashMap);
        }
        m88687a(view, hashMap);
    }

    /* renamed from: a */
    private void m88685a(Context context, LayoutInflater layoutInflater) {
        if (Build.VERSION.SDK_INT <= 27) {
            try {
                Field a = C26254af.m95001a((Class<?>) LayoutInflater.class, "mConstructorArgs");
                a.setAccessible(true);
                Object[] objArr = (Object[]) a.get(layoutInflater);
                if (((Context) objArr[0]) == null) {
                    objArr[0] = context;
                }
                Log.m165389i("DynamicResourcesFactory", "fix LayoutInflaterContextNpe");
            } catch (Throwable th) {
                Log.m165383e("DynamicResourcesFactory", th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m88687a(View view, Map<String, Pair<String, Integer>> map) {
        Log.m165389i("DynamicResourcesFactory", "view = " + view + " ， nameToValMap = " + map);
        Context context = view.getContext();
        AbstractC24313l<View> a = C24308i.m88735a(view, map);
        if (a != null) {
            C24301g.m88706a().mo86994a(context, view, a);
        }
        for (AbstractC24313l lVar : C24301g.m88706a().mo87000e()) {
            C24301g.m88706a().mo86994a(context, view, lVar);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: a */
    private View m88682a(Context context, String str, AttributeSet attributeSet) {
        if (str.contains(".")) {
            return m88683a(context, null, str, attributeSet);
        }
        for (String str2 : f59957e) {
            View a = m88683a(context, str2, str, attributeSet);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View view2;
        LayoutInflater.Factory factory = this.f59959b;
        if (factory == null) {
            view2 = null;
        } else if (factory instanceof LayoutInflater.Factory2) {
            view2 = ((LayoutInflater.Factory2) factory).onCreateView(view, str, context, attributeSet);
        } else {
            view2 = factory.onCreateView(str, context, attributeSet);
        }
        if (!m88688a(attributeSet)) {
            return view2;
        }
        if (view2 == null) {
            C24305h.m88729a("DynamicResourcesFactory_createViewFromTag", "");
            View a = m88682a(context, str, attributeSet);
            C24305h.m88730b("DynamicResourcesFactory_createViewFromTag", "");
            view2 = a;
        }
        C24305h.m88729a("DynamicResourcesFactory_handleDynamicResources", "");
        m88686a(view2, attributeSet);
        C24305h.m88730b("DynamicResourcesFactory_handleDynamicResources", "");
        return view2;
    }

    /* renamed from: a */
    private View m88683a(Context context, String str, String str2, AttributeSet attributeSet) {
        LayoutInflater from = LayoutInflater.from(context);
        try {
            return from.createView(str2, str, attributeSet);
        } catch (NullPointerException e) {
            Log.m165385e("DynamicResourcesFactory", "DynamicResourcesFactory create view failed ", e, true);
            m88685a(context, from);
            try {
                return from.createView(str2, str, attributeSet);
            } catch (ClassNotFoundException | NullPointerException e2) {
                Log.m165383e("DynamicResourcesFactory", e2.getMessage());
                return null;
            }
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
