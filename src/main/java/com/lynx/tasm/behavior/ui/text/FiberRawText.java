package com.lynx.tasm.behavior.ui.text;

import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26697s;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

public class FiberRawText extends LynxBaseUI {

    /* renamed from: a */
    private String f66568a;

    /* renamed from: b */
    private boolean f66569b;

    /* renamed from: d */
    public String mo53300d() {
        return this.f66568a;
    }

    /* renamed from: e */
    public boolean mo53301e() {
        return this.f66569b;
    }

    public String toString() {
        return mo94919B() + " [text: " + this.f66568a + "]";
    }

    public FiberRawText(AbstractC26684l lVar) {
        super(lVar);
    }

    @LynxProp(name = "pseudo")
    public void setPsuedo(boolean z) {
        this.f66569b = z;
    }

    @LynxProp(name = "text")
    public void setText(String str) {
        this.f66568a = str;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53259a(C26697s sVar) {
        ReadableMap readableMap = sVar.f66083a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            char c = 65535;
            try {
                if (nextKey.hashCode() == 3556653) {
                    if (nextKey.equals("text")) {
                        c = 0;
                    }
                }
                if (c == 0) {
                    setText(readableMap.getString(nextKey));
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
        super.mo53259a(sVar);
    }
}
