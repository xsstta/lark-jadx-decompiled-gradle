package com.bytedance.ee.bear.rn.handler;

import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;

/* renamed from: com.bytedance.ee.bear.rn.handler.f */
public class C10651f implements RnMessageHandler {
    @Override // com.bytedance.ee.bear.rn.handler.RnMessageHandler
    /* renamed from: a */
    public AbstractC7945d<String> mo40360a() {
        return new SendMessageHandler();
    }

    @Override // com.bytedance.ee.bear.rn.handler.RnMessageHandler
    /* renamed from: a */
    public AbstractC7945d<String> mo40361a(final AbstractC7945d<String> dVar) {
        if (dVar != null) {
            return new HandleMessageHandler() {
                /* class com.bytedance.ee.bear.rn.handler.C10651f.C106521 */

                @Override // com.bytedance.ee.bear.rn.handler.HandleMessageHandler
                /* renamed from: a */
                public void handle(String str, AbstractC7947h hVar) {
                    super.handle(str, hVar);
                    dVar.handle(str, hVar);
                }
            };
        }
        return new HandleMessageHandler();
    }
}
