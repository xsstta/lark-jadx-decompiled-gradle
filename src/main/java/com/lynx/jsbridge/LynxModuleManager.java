package com.lynx.jsbridge;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.util.List;
import java.util.Map;

public class LynxModuleManager {

    /* renamed from: a */
    Map<String, C26509d> f65524a = new ArrayMap();

    /* renamed from: b */
    Map<String, LynxModuleWrapper> f65525b;

    /* renamed from: c */
    Context f65526c;

    public LynxModuleManager(Context context) {
        this.f65526c = context;
    }

    /* renamed from: a */
    private void m96065a(Exception exc) {
        LLog.m96429e("LynxModuleManager", "get Module failed" + exc);
    }

    private LynxModuleWrapper moduleWrapperForName(String str) {
        LynxModuleWrapper a = mo93958a(str);
        if (a == null) {
            return LynxEnv.m96123e().mo94097d().mo93958a(str);
        }
        return a;
    }

    /* renamed from: a */
    public void mo93960a(List<C26509d> list) {
        if (!(list == null || list.size() == 0)) {
            for (C26509d dVar : list) {
                String a = dVar.mo93990a();
                C26509d dVar2 = this.f65524a.get(a);
                if (dVar2 != null) {
                    LLog.m96429e("LynxModuleManager", "Duplicated LynxModule For Name: " + a + ", " + dVar2 + " will be override");
                }
                this.f65524a.put(a, dVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0190  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.lynx.jsbridge.LynxModuleWrapper mo93958a(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.jsbridge.LynxModuleManager.mo93958a(java.lang.String):com.lynx.jsbridge.LynxModuleWrapper");
    }

    /* renamed from: a */
    public void mo93959a(String str, Class<? extends LynxModule> cls, Object obj) {
        C26509d dVar = new C26509d();
        dVar.mo93993a(str);
        dVar.mo93991a(cls);
        dVar.mo93992a(obj);
        C26509d dVar2 = this.f65524a.get(str);
        if (dVar2 != null) {
            LLog.m96429e("LynxModuleManager", "Duplicated LynxModule For Name: " + str + ", " + dVar2 + " will be override");
        }
        this.f65524a.put(str, dVar);
        LLog.m96419a("LynxModuleManager", "registered module with name: " + str + " class" + cls);
    }
}
