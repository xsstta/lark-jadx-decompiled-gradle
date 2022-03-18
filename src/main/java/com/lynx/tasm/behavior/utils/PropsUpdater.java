package com.lynx.tasm.behavior.utils;

import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.utils.C26847e;
import java.util.HashMap;
import java.util.Map;

public class PropsUpdater {

    /* renamed from: a */
    private static final Map<Class<?>, LynxUISetter<?>> f66670a = new HashMap();

    /* renamed from: b */
    private static final Map<Class<?>, ShadowNodeSetter<?>> f66671b = new HashMap();

    /* renamed from: c */
    private static final Map<String, Settable> f66672c = new HashMap();

    /* access modifiers changed from: private */
    public static class FallbackLynxUISetter<T extends LynxBaseUI> implements LynxUISetter<T> {

        /* renamed from: a */
        private final Map<String, C26847e.AbstractC26858j> f66673a;

        private FallbackLynxUISetter(Class<? extends LynxBaseUI> cls) {
            this.f66673a = C26847e.m97616a(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.LynxUISetter
        /* renamed from: a */
        public void mo53254a(LynxBaseUI lynxBaseUI, String str, C26697s sVar) {
            C26847e.AbstractC26858j jVar = this.f66673a.get(str);
            if (jVar == null) {
                LLog.m96427d("PropsUpdater", lynxBaseUI.getClass().getName() + "'s prop:" + str + "is undefined!");
                return;
            }
            jVar.mo95612a(lynxBaseUI, sVar);
        }
    }

    /* access modifiers changed from: private */
    public static class FallbackShadowNodeSetter<T extends ShadowNode> implements ShadowNodeSetter<T> {

        /* renamed from: a */
        private final Map<String, C26847e.AbstractC26858j> f66674a;

        private FallbackShadowNodeSetter(Class<? extends ShadowNode> cls) {
            this.f66674a = C26847e.m97619b(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
        /* renamed from: a */
        public void mo53285a(ShadowNode shadowNode, String str, C26697s sVar) {
            C26847e.AbstractC26858j jVar = this.f66674a.get(str);
            if (jVar != null) {
                jVar.mo95611a(shadowNode, sVar);
            }
        }
    }

    /* renamed from: b */
    static <T extends ShadowNode> ShadowNodeSetter<T> m97606b(Class<? extends ShadowNode> cls) {
        Map<Class<?>, ShadowNodeSetter<?>> map = f66671b;
        ShadowNodeSetter<?> shadowNodeSetter = map.get(cls);
        if (shadowNodeSetter == null) {
            shadowNodeSetter = (ShadowNodeSetter) m97607c(cls);
            if (shadowNodeSetter == null) {
                shadowNodeSetter = new FallbackShadowNodeSetter<>(cls);
            }
            map.put(cls, shadowNodeSetter);
        }
        return shadowNodeSetter;
    }

    /* renamed from: a */
    static <T extends LynxBaseUI> LynxUISetter<T> m97603a(Class<? extends LynxBaseUI> cls) {
        Map<Class<?>, LynxUISetter<?>> map = f66670a;
        LynxUISetter<?> lynxUISetter = map.get(cls);
        if (lynxUISetter == null) {
            lynxUISetter = (LynxUISetter) m97607c(cls);
            if (lynxUISetter == null) {
                String str = "PropsSetter not generated for class: " + cls.getName() + ". You should add module lynxProcessor";
                if (!LynxEnv.m96123e().mo94116u() || !LynxEnv.m96123e().mo94104k()) {
                    LLog.m96429e("PropsUpdater", str);
                    lynxUISetter = new FallbackLynxUISetter<>(cls);
                } else {
                    throw new IllegalStateException(str);
                }
            }
            map.put(cls, lynxUISetter);
        }
        return lynxUISetter;
    }

    /* renamed from: c */
    private static <T> T m97607c(Class<?> cls) {
        String str = cls.getName() + "$$PropsSetter";
        T t = (T) f66672c.get(str);
        if (t != null) {
            return t;
        }
        try {
            return (T) Class.forName(str).newInstance();
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("Unable to instantiate methods getter for " + str, e);
        }
    }

    /* renamed from: a */
    public static <T extends ShadowNode> void m97604a(T t, C26697s sVar) {
        ShadowNodeSetter b = m97606b(t.getClass());
        ReadableMapKeySetIterator keySetIterator = sVar.f66083a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            b.mo53285a(t, keySetIterator.nextKey(), sVar);
        }
    }

    /* renamed from: a */
    public static void m97605a(LynxBaseUI lynxBaseUI, C26697s sVar) {
        LynxBaseUI lynxBaseUI2;
        if (lynxBaseUI instanceof UIShadowProxy) {
            lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI).mo53300d();
        } else {
            lynxBaseUI2 = lynxBaseUI;
        }
        LynxUISetter a = m97603a(lynxBaseUI2.getClass());
        ReadableMapKeySetIterator keySetIterator = sVar.f66083a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                a.mo53254a(lynxBaseUI2, nextKey, sVar);
            } catch (Throwable th) {
                AbstractC26684l u = lynxBaseUI.mo95039u();
                u.mo94207a(new RuntimeException("Error while updating property '" + nextKey + "' in ui:" + lynxBaseUI.mo94919B(), th));
            }
        }
    }
}
