package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.devsupport.p961a.AbstractC21120a;
import com.facebook.react.devsupport.p961a.AbstractC21121b;
import java.util.Map;

/* renamed from: com.facebook.react.devsupport.a */
public class C21119a {
    /* renamed from: a */
    public static AbstractC21121b m76756a(Context context, AbstractC21126d dVar, String str, boolean z, RedBoxHandler redBoxHandler, AbstractC21120a aVar, int i, Map<String, Object> map) {
        if (!z) {
            return new C21123b();
        }
        try {
            return (AbstractC21121b) Class.forName("com.facebook.react.devsupport" + "." + "DevSupportManagerImpl").getConstructor(Context.class, AbstractC21126d.class, String.class, Boolean.TYPE, RedBoxHandler.class, AbstractC21120a.class, Integer.TYPE, Map.class).newInstance(context, dVar, str, true, redBoxHandler, aVar, Integer.valueOf(i), map);
        } catch (Exception e) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e);
        }
    }
}
