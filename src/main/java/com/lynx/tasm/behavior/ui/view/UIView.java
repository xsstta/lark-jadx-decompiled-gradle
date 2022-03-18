package com.lynx.tasm.behavior.ui.view;

import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.p1216a.C26549e;
import java.util.HashMap;

public class UIView extends UISimpleView<C26840a> {
    public UIView(AbstractC26684l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C26840a mo95589a(Context context) {
        return new C26840a(context);
    }

    @LynxProp(name = "impression_id")
    public void setImpressionId(String str) {
        ((C26840a) this.f66253Z).setImpressionId(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C26840a mo33942b(Context context) {
        C26840a a = mo95589a(context);
        a.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.lynx.tasm.behavior.ui.view.UIView.View$OnAttachStateChangeListenerC268391 */

            public void onViewAttachedToWindow(View view) {
                if (view == UIView.this.av() && UIView.this.f66244y != null && UIView.this.f66244y.containsKey("attach")) {
                    C26549e a = C26549e.m96248a(UIView.this.mo94576q());
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("impression_id", ((C26840a) UIView.this.av()).getImpressionId());
                    a.mo94350a("params", hashMap);
                    UIView.this.mo95039u().mo94687i().mo94075a(a);
                }
            }

            public void onViewDetachedFromWindow(View view) {
                if (view == UIView.this.av() && UIView.this.f66244y != null && UIView.this.f66244y.containsKey("detach")) {
                    C26549e b = C26549e.m96249b(UIView.this.mo94576q());
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("impression_id", ((C26840a) UIView.this.av()).getImpressionId());
                    b.mo94350a("params", hashMap);
                    UIView.this.mo95039u().mo94687i().mo94075a(b);
                }
            }
        });
        return a;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53259a(C26697s sVar) {
        ReadableMap readableMap = sVar.f66083a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.equals("impression_id")) {
                ((C26840a) this.f66253Z).setImpressionId(readableMap.getString(nextKey));
                return;
            }
        }
        super.mo53259a(sVar);
    }
}
