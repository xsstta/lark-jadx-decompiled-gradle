package com.ss.android.videoshop.controller;

import android.content.Context;
import android.util.SparseArray;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.List;

public enum EngineInspector {
    ENUM;
    
    private SparseArray<List<C64143c>> contextEngines = new SparseArray<>();
    private SparseArray<C64143c> engineInfos = new SparseArray<>();

    public String getStateDesc() {
        StringBuilder sb = new StringBuilder();
        sb.append("[TotalEngineCount:");
        sb.append(this.engineInfos.size());
        sb.append("]\n");
        for (int i = 0; i < this.contextEngines.size(); i++) {
            List<C64143c> valueAt = this.contextEngines.valueAt(i);
            if (valueAt != null) {
                for (int i2 = 0; i2 < valueAt.size(); i2++) {
                    C64143c cVar = valueAt.get(i2);
                    if (cVar != null) {
                        if (i2 == 0) {
                            sb.append("[ContextName:");
                            sb.append(cVar.mo222141d());
                            sb.append("]");
                            sb.append("[ContextHash:");
                            sb.append(Integer.toHexString(cVar.mo222140c()));
                            sb.append("]");
                            sb.append("[ContextDestroyed:");
                            sb.append(cVar.mo222142e());
                            sb.append("]");
                            sb.append("[EngineCount:");
                            sb.append(valueAt.size());
                            sb.append("]");
                        }
                        sb.append("[EngineHash:");
                        sb.append(Integer.toHexString(cVar.mo222137b()));
                        sb.append("]");
                        sb.append("[EngineReason:");
                        sb.append(cVar.mo222133a());
                        sb.append("]");
                    }
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public void onContextDestroy(Context context) {
        List<C64143c> list;
        if (!(context == null || (list = this.contextEngines.get(context.hashCode())) == null)) {
            for (C64143c cVar : list) {
                if (cVar != null) {
                    cVar.mo222136a(true);
                }
            }
        }
    }

    private EngineInspector() {
    }

    public void onReleaseEngine(TTVideoEngine tTVideoEngine, Context context) {
        int i;
        List<C64143c> list;
        if (tTVideoEngine != null) {
            int hashCode = tTVideoEngine.hashCode();
            if (context == null) {
                i = -1;
            } else {
                i = context.hashCode();
            }
            C64143c cVar = this.engineInfos.get(hashCode);
            this.engineInfos.remove(hashCode);
            if (context != null && (list = this.contextEngines.get(i)) != null) {
                list.remove(cVar);
            }
        }
    }

    public void onCreateEngine(TTVideoEngine tTVideoEngine, Context context, String str) {
        int i;
        String str2;
        if (tTVideoEngine != null) {
            int hashCode = tTVideoEngine.hashCode();
            if (context == null) {
                i = -1;
            } else {
                i = context.hashCode();
            }
            if (context == null) {
                str2 = "context null";
            } else {
                str2 = context.getClass().getName();
            }
            C64143c a = C64143c.m251862a(str, hashCode, i, str2);
            this.engineInfos.put(hashCode, a);
            if (context != null) {
                List<C64143c> list = this.contextEngines.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(a);
                this.contextEngines.put(i, list);
            }
        }
    }
}
