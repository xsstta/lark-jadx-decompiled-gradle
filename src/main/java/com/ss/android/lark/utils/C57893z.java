package com.ss.android.lark.utils;

import com.huawei.hms.android.HwBuildEx;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.ss.android.lark.utils.z */
public class C57893z implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String simpleName = method.getReturnType().getSimpleName();
        simpleName.hashCode();
        char c = 65535;
        switch (simpleName.hashCode()) {
            case -1808118735:
                if (simpleName.equals("String")) {
                    c = 0;
                    break;
                }
                break;
            case -1325958191:
                if (simpleName.equals("double")) {
                    c = 1;
                    break;
                }
                break;
            case -672261858:
                if (simpleName.equals("Integer")) {
                    c = 2;
                    break;
                }
                break;
            case 77116:
                if (simpleName.equals("Map")) {
                    c = 3;
                    break;
                }
                break;
            case 83010:
                if (simpleName.equals("Set")) {
                    c = 4;
                    break;
                }
                break;
            case 104431:
                if (simpleName.equals("int")) {
                    c = 5;
                    break;
                }
                break;
            case 2368702:
                if (simpleName.equals("List")) {
                    c = 6;
                    break;
                }
                break;
            case 2374300:
                if (simpleName.equals("Long")) {
                    c = 7;
                    break;
                }
                break;
            case 3327612:
                if (simpleName.equals("long")) {
                    c = '\b';
                    break;
                }
                break;
            case 64711720:
                if (simpleName.equals("boolean")) {
                    c = '\t';
                    break;
                }
                break;
            case 67973692:
                if (simpleName.equals("Float")) {
                    c = '\n';
                    break;
                }
                break;
            case 97526364:
                if (simpleName.equals("float")) {
                    c = 11;
                    break;
                }
                break;
            case 252152510:
                if (simpleName.equals("Collection")) {
                    c = '\f';
                    break;
                }
                break;
            case 1729365000:
                if (simpleName.equals("Boolean")) {
                    c = '\r';
                    break;
                }
                break;
            case 2052876273:
                if (simpleName.equals("Double")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "";
            case 1:
            case 2:
            case 5:
            case 7:
            case '\b':
            case '\n':
            case 11:
            case 14:
                return 0;
            case 3:
                return new HashMap();
            case 4:
                return new HashSet();
            case 6:
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return new ArrayList();
            case '\t':
            case '\r':
                return false;
            default:
                return null;
        }
    }
}
