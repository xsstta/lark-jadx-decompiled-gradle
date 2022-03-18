package com.bytedance.kit.nglynx.init;

import com.lynx.tasm.C26908k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0005J+\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/kit/nglynx/init/LynxGroupHolder;", "", "()V", "lynxGroupMap", "", "", "Lcom/lynx/tasm/LynxGroup;", "lynxGroupRefMap", "", "addLynxGroupRef", "", "groupName", "getLynxGroup", "getOrCreateLynxGroup", "preloadJSPaths", "", "enableCanvas", "", "(Ljava/lang/String;[Ljava/lang/String;Z)Lcom/lynx/tasm/LynxGroup;", "removeLynxGroup", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.c.d */
public final class LynxGroupHolder {

    /* renamed from: a */
    public static final LynxGroupHolder f38566a = new LynxGroupHolder();

    /* renamed from: b */
    private static final Map<String, C26908k> f38567b = new ConcurrentHashMap(3);

    /* renamed from: c */
    private static final Map<String, Integer> f38568c = new LinkedHashMap();

    private LynxGroupHolder() {
    }

    /* renamed from: a */
    public final void mo53770a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Map<String, Integer> map = f38568c;
            if (map.get(str) != null) {
                Integer num = map.get(str);
                if (num == null) {
                    Intrinsics.throwNpe();
                }
                int intValue = num.intValue() - 1;
                if (intValue <= 0) {
                    f38567b.remove(str);
                    map.remove(str);
                    return;
                }
                map.put(str, Integer.valueOf(intValue));
            }
        }
    }
}
