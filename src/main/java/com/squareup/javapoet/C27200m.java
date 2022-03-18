package com.squareup.javapoet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.javapoet.m */
public final class C27200m {
    /* renamed from: b */
    static <T> Set<T> m98883b(Collection<T> collection) {
        return Collections.unmodifiableSet(new LinkedHashSet(collection));
    }

    /* renamed from: a */
    static <T> List<T> m98880a(Collection<T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    /* renamed from: a */
    static String m98878a(char c) {
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\"') {
            return "\"";
        }
        if (c == '\'') {
            return "\\'";
        }
        if (c == '\\') {
            return "\\\\";
        }
        switch (c) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            default:
                if (!Character.isISOControl(c)) {
                    return Character.toString(c);
                }
                return String.format("\\u%04x", Integer.valueOf(c));
        }
    }

    /* renamed from: a */
    static <T> Set<T> m98881a(Set<T> set, Set<T> set2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        linkedHashSet.addAll(set2);
        return linkedHashSet;
    }

    /* renamed from: a */
    static String m98879a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                sb.append("'");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else {
                sb.append(m98878a(charAt));
                if (charAt == '\n' && i + 1 < str.length()) {
                    sb.append("\"\n");
                    sb.append(str2);
                    sb.append(str2);
                    sb.append("+ \"");
                }
            }
        }
        sb.append('\"');
        return sb.toString();
    }

    /* renamed from: a */
    static <T> T m98877a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    /* renamed from: b */
    static void m98884b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    static void m98882a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
