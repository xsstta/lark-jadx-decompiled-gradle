package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.o */
public final class C23128o {
    /* renamed from: a */
    private static final String m83835a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m83838a(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof ByteString) {
                return obj.equals(ByteString.EMPTY);
            }
            if (obj instanceof AbstractC23125m) {
                if (obj == ((AbstractC23125m) obj).mo80132m()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum) || ((Enum) obj).ordinal() != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: a */
    static String m83834a(AbstractC23125m mVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m83836a(mVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: a */
    private static void m83836a(AbstractC23125m mVar, StringBuilder sb, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = mVar.getClass().getDeclaredMethods();
        for (Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            boolean z = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get("get" + replaceFirst);
                if (method2 != null) {
                    m83837a(sb, i, m83835a(str2), GeneratedMessageLite.m83628a(method2, mVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method3 = (Method) hashMap.get("get" + replaceFirst);
                Method method4 = (Method) hashMap.get("has" + replaceFirst);
                if (method3 != null) {
                    Object a = GeneratedMessageLite.m83628a(method3, mVar, new Object[0]);
                    if (method4 != null) {
                        z = ((Boolean) GeneratedMessageLite.m83628a(method4, mVar, new Object[0])).booleanValue();
                    } else if (m83838a(a)) {
                        z = false;
                    }
                    if (z) {
                        m83837a(sb, i, m83835a(str3), a);
                    }
                }
            }
        }
        if (mVar instanceof GeneratedMessageLite.AbstractC23072d) {
            Iterator<Map.Entry<GeneratedMessageLite.C23074f, Object>> d = ((GeneratedMessageLite.AbstractC23072d) mVar).f56989d.mo80275d();
            while (d.hasNext()) {
                Map.Entry<GeneratedMessageLite.C23074f, Object> next = d.next();
                m83837a(sb, i, "[" + next.getKey().mo80160c() + "]", next.getValue());
            }
        }
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) mVar;
        if (generatedMessageLite.f56980b != null) {
            generatedMessageLite.f56980b.mo80465a(sb, i);
        }
    }

    /* renamed from: a */
    static final void m83837a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m83837a(sb, i, str, obj2);
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C23197u.m83985a((String) obj));
            sb.append('\"');
        } else if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(C23197u.m83983a((ByteString) obj));
            sb.append('\"');
        } else if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            m83836a((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ");
            sb.append(obj.toString());
        }
    }
}
