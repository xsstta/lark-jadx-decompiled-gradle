package com.squareup.javapoet;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.lang.model.element.Element;
import javax.lang.model.type.TypeMirror;

/* renamed from: com.squareup.javapoet.d */
public final class C27183d {

    /* renamed from: a */
    public static final Pattern f67615a = Pattern.compile("\\$(?<argumentName>[\\w_]+):(?<typeChar>[\\w]).*");

    /* renamed from: b */
    public static final Pattern f67616b = Pattern.compile("[a-z]+[\\w_]*");

    /* renamed from: c */
    final List<String> f67617c;

    /* renamed from: d */
    final List<Object> f67618d;

    /* renamed from: com.squareup.javapoet.d$a */
    public static final class C27185a {

        /* renamed from: a */
        final List<String> f67619a;

        /* renamed from: b */
        final List<Object> f67620b;

        /* renamed from: a */
        private boolean m98812a(char c) {
            return c == '$' || c == '>' || c == '<' || c == '[' || c == ']' || c == 'W' || c == 'Z';
        }

        /* renamed from: b */
        private Object m98813b(Object obj) {
            return obj;
        }

        /* renamed from: a */
        public C27183d mo96810a() {
            return new C27183d(this);
        }

        private C27185a() {
            this.f67619a = new ArrayList();
            this.f67620b = new ArrayList();
        }

        /* renamed from: c */
        private String m98814c(Object obj) {
            if (obj != null) {
                return String.valueOf(obj);
            }
            return null;
        }

        /* renamed from: a */
        private String m98810a(Object obj) {
            if (obj instanceof CharSequence) {
                return obj.toString();
            }
            if (obj instanceof C27195i) {
                return ((C27195i) obj).f67668a;
            }
            if (obj instanceof C27189f) {
                return ((C27189f) obj).f67640b;
            }
            if (obj instanceof C27194h) {
                return ((C27194h) obj).f67657a;
            }
            if (obj instanceof TypeSpec) {
                return ((TypeSpec) obj).f67589b;
            }
            throw new IllegalArgumentException("expected name but was " + obj);
        }

        /* renamed from: d */
        private C27197k m98815d(Object obj) {
            if (obj instanceof C27197k) {
                return (C27197k) obj;
            }
            if (obj instanceof TypeMirror) {
                return C27197k.m98866a((TypeMirror) obj);
            }
            if (obj instanceof Element) {
                return C27197k.m98866a(((Element) obj).asType());
            }
            if (obj instanceof Type) {
                return C27197k.m98864a((Type) obj);
            }
            throw new IllegalArgumentException("expected type but was " + obj);
        }

        /* renamed from: a */
        public C27185a mo96809a(String str, Object... objArr) {
            String str2;
            boolean z;
            int i;
            boolean z2;
            int i2;
            char charAt;
            boolean z3;
            int i3;
            boolean z4;
            boolean z5;
            int[] iArr = new int[objArr.length];
            int i4 = 0;
            boolean z6 = false;
            int i5 = 0;
            boolean z7 = false;
            while (true) {
                boolean z8 = true;
                if (i4 >= str.length()) {
                    break;
                } else if (str.charAt(i4) != '$') {
                    int indexOf = str.indexOf(36, i4 + 1);
                    if (indexOf == -1) {
                        indexOf = str.length();
                    }
                    this.f67619a.add(str.substring(i4, indexOf));
                    i4 = indexOf;
                } else {
                    int i6 = i4 + 1;
                    int i7 = i6;
                    while (true) {
                        if (i7 < str.length()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C27200m.m98882a(z2, "dangling format characters in '%s'", str);
                        i2 = i7 + 1;
                        charAt = str.charAt(i7);
                        if (charAt < '0' || charAt > '9') {
                            int i8 = i2 - 1;
                        } else {
                            i7 = i2;
                        }
                    }
                    int i82 = i2 - 1;
                    if (m98812a(charAt)) {
                        if (i6 != i82) {
                            z8 = false;
                        }
                        C27200m.m98882a(z8, "$$, $>, $<, $[, $], $W, and $Z may not have an index", new Object[0]);
                        this.f67619a.add("$" + charAt);
                        i4 = i2;
                    } else {
                        if (i6 < i82) {
                            int parseInt = Integer.parseInt(str.substring(i6, i82)) - 1;
                            if (objArr.length > 0) {
                                int length = parseInt % objArr.length;
                                iArr[length] = iArr[length] + 1;
                            }
                            z3 = true;
                            i3 = i5;
                            i5 = parseInt;
                        } else {
                            z3 = z7;
                            i3 = i5 + 1;
                            z6 = true;
                        }
                        if (i5 < 0 || i5 >= objArr.length) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        C27200m.m98882a(z4, "index %d for '%s' not in range (received %s arguments)", Integer.valueOf(i5 + 1), str.substring(i6 - 1, i82 + 1), Integer.valueOf(objArr.length));
                        if (!z3 || !z6) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        C27200m.m98882a(z5, "cannot mix indexed and positional parameters", new Object[0]);
                        m98811a(str, charAt, objArr[i5]);
                        this.f67619a.add("$" + charAt);
                        i5 = i3;
                        i4 = i2;
                        z7 = z3;
                    }
                }
            }
            if (z6) {
                if (i5 >= objArr.length) {
                    i = 2;
                    z = true;
                } else {
                    i = 2;
                    z = false;
                }
                Object[] objArr2 = new Object[i];
                objArr2[0] = Integer.valueOf(i5);
                objArr2[1] = Integer.valueOf(objArr.length);
                C27200m.m98882a(z, "unused arguments: expected %s, received %s", objArr2);
            }
            if (z7) {
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < objArr.length; i9++) {
                    if (iArr[i9] == 0) {
                        arrayList.add("$" + (i9 + 1));
                    }
                }
                if (arrayList.size() == 1) {
                    str2 = "";
                } else {
                    str2 = "s";
                }
                C27200m.m98882a(arrayList.isEmpty(), "unused argument%s: %s", str2, C$r8$backportedMethods$utility$String$2$joinIterable.join(", ", arrayList));
            }
            return this;
        }

        /* renamed from: a */
        private void m98811a(String str, char c, Object obj) {
            if (c == 'L') {
                this.f67620b.add(m98813b(obj));
            } else if (c == 'N') {
                this.f67620b.add(m98810a(obj));
            } else if (c == 'S') {
                this.f67620b.add(m98814c(obj));
            } else if (c == 'T') {
                this.f67620b.add(m98815d(obj));
            } else {
                throw new IllegalArgumentException(String.format("invalid format string: '%s'", str));
            }
        }
    }

    /* renamed from: a */
    public boolean mo96804a() {
        return this.f67617c.isEmpty();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    /* renamed from: b */
    public C27185a mo96805b() {
        C27185a aVar = new C27185a();
        aVar.f67619a.addAll(this.f67617c);
        aVar.f67620b.addAll(this.f67618d);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            new C27186e(sb).mo96825b(this);
            return sb.toString();
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }

    private C27183d(C27185a aVar) {
        this.f67617c = C27200m.m98880a(aVar.f67619a);
        this.f67618d = C27200m.m98880a(aVar.f67620b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    /* renamed from: a */
    public static C27183d m98807a(String str, Object... objArr) {
        return new C27185a().mo96809a(str, objArr).mo96810a();
    }
}
