package com.samskivert.mustache;

import com.huawei.hms.framework.common.ContainerUtils;
import com.samskivert.mustache.C27059e;
import com.samskivert.mustache.MustacheException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.samskivert.mustache.d */
public class C27035d {

    /* renamed from: a */
    protected static final AbstractC27056q f67158a = new AbstractC27056q() {
        /* class com.samskivert.mustache.C27035d.C270361 */

        @Override // com.samskivert.mustache.C27035d.AbstractC27056q
        /* renamed from: a */
        public Reader mo96171a(String str) {
            throw new UnsupportedOperationException("Template loading not configured");
        }
    };

    /* renamed from: b */
    protected static final AbstractC27047h f67159b = new AbstractC27047h() {
        /* class com.samskivert.mustache.C27035d.C270372 */

        @Override // com.samskivert.mustache.C27035d.AbstractC27047h
        /* renamed from: a */
        public String mo96172a(Object obj) {
            return String.valueOf(obj);
        }
    };

    /* renamed from: com.samskivert.mustache.d$c */
    public interface AbstractC27042c {
        /* renamed from: a */
        AbstractC27057r mo96153a(Object obj, String str);

        /* renamed from: a */
        Iterator<?> mo96154a(Object obj);

        /* renamed from: a */
        <K, V> Map<K, V> mo96166a();
    }

    /* renamed from: com.samskivert.mustache.d$f */
    public interface AbstractC27045f {
        /* renamed from: a */
        String mo96170a(String str);
    }

    /* renamed from: com.samskivert.mustache.d$h */
    public interface AbstractC27047h {
        /* renamed from: a */
        String mo96172a(Object obj);
    }

    /* renamed from: com.samskivert.mustache.d$k */
    public interface AbstractC27050k extends AbstractC27051l {
        /* renamed from: a */
        void mo96195a(C27059e.AbstractC27063b bVar, Writer writer) throws IOException;
    }

    /* renamed from: com.samskivert.mustache.d$l */
    public interface AbstractC27051l {
        /* renamed from: b */
        void mo96196b(C27059e.AbstractC27063b bVar, Writer writer) throws IOException;
    }

    /* renamed from: com.samskivert.mustache.d$q */
    public interface AbstractC27056q {
        /* renamed from: a */
        Reader mo96171a(String str) throws Exception;
    }

    /* renamed from: com.samskivert.mustache.d$r */
    public interface AbstractC27057r {
        /* renamed from: a */
        Object mo96158a(Object obj, String str) throws Exception;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.d$g */
    public static class C27046g extends C27059e.AbstractC27065d {
        @Override // com.samskivert.mustache.C27059e.AbstractC27065d
        /* renamed from: a */
        public void mo96192a(C27059e eVar, C27059e.C27062a aVar, Writer writer) {
        }

        public String toString() {
            return "Faux";
        }

        protected C27046g() {
        }
    }

    private C27035d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.d$a */
    public static class C27038a {

        /* renamed from: a */
        protected final C27043d f67160a;

        /* renamed from: b */
        protected final boolean f67161b;

        /* renamed from: c */
        protected final List<C27059e.AbstractC27065d> f67162c = new ArrayList();

        /* renamed from: a */
        public void mo96175a() {
            this.f67162c.add(new C27046g());
        }

        /* renamed from: b */
        public C27059e.AbstractC27065d[] mo96177b() {
            List<C27059e.AbstractC27065d> list = this.f67162c;
            return (C27059e.AbstractC27065d[]) list.toArray(new C27059e.AbstractC27065d[list.size()]);
        }

        /* renamed from: a */
        public void mo96176a(StringBuilder sb) {
            boolean z;
            if (sb.length() > 0) {
                List<C27059e.AbstractC27065d> list = this.f67162c;
                String sb2 = sb.toString();
                if (!this.f67162c.isEmpty() || !this.f67161b) {
                    z = false;
                } else {
                    z = true;
                }
                list.add(new C27055p(sb2, z));
                sb.setLength(0);
            }
        }

        public C27038a(C27043d dVar, boolean z) {
            this.f67160a = dVar;
            this.f67161b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C27038a mo96173a(String str, int i) {
            throw new MustacheParseException("Section close tag with no open tag '" + str + "'", i);
        }

        /* renamed from: b */
        protected static void m98277b(String str, int i) {
            if (str.indexOf(10) != -1 || str.indexOf(13) != -1) {
                throw new MustacheParseException("Invalid tag name: contains newline '" + str + "'", i);
            }
        }

        /* renamed from: a */
        public C27038a mo96174a(StringBuilder sb, final int i) {
            String trim = sb.toString().trim();
            final String trim2 = trim.substring(1).trim();
            sb.setLength(0);
            char charAt = trim.charAt(0);
            if (charAt == '!') {
                this.f67162c.add(new C27046g());
                return this;
            } else if (charAt == '#') {
                m98277b(trim, i);
                return new C27038a(this.f67160a, false) {
                    /* class com.samskivert.mustache.C27035d.C27038a.C270391 */

                    @Override // com.samskivert.mustache.C27035d.C27038a
                    /* renamed from: b */
                    public C27059e.AbstractC27065d[] mo96177b() {
                        throw new MustacheParseException("Section missing close tag '" + trim2 + "'", i);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.samskivert.mustache.C27035d.C27038a
                    /* renamed from: a */
                    public C27038a mo96173a(String str, int i) {
                        m98276a(trim2, str, i);
                        this.f67162c.add(new C27054o(this.f67160a, str, super.mo96177b(), i));
                        return this;
                    }
                };
            } else if (charAt == '&') {
                m98277b(trim, i);
                this.f67162c.add(new C27058s(trim2, i, this.f67160a.f67178g, C27032c.f67156b));
                return this;
            } else if (charAt == '/') {
                m98277b(trim, i);
                return mo96173a(trim2, i);
            } else if (charAt == '>') {
                this.f67162c.add(new C27048i(this.f67160a, trim2));
                return this;
            } else if (charAt != '^') {
                m98277b(trim, i);
                this.f67162c.add(new C27058s(trim, i, this.f67160a.f67178g, this.f67160a.f67179h));
                return this;
            } else {
                m98277b(trim, i);
                return new C27038a(this.f67160a, false) {
                    /* class com.samskivert.mustache.C27035d.C27038a.C270402 */

                    @Override // com.samskivert.mustache.C27035d.C27038a
                    /* renamed from: b */
                    public C27059e.AbstractC27065d[] mo96177b() {
                        throw new MustacheParseException("Inverted section missing close tag '" + trim2 + "'", i);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.samskivert.mustache.C27035d.C27038a
                    /* renamed from: a */
                    public C27038a mo96173a(String str, int i) {
                        m98276a(trim2, str, i);
                        this.f67162c.add(new C27049j(this.f67160a, str, super.mo96177b(), i));
                        return this;
                    }
                };
            }
        }

        /* renamed from: a */
        protected static void m98276a(String str, String str2, int i) {
            if (!str.equals(str2)) {
                throw new MustacheParseException("Section close tag with mismatched open tag '" + str2 + "' != '" + str + "'", i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.d$b */
    public static abstract class AbstractC27041b extends AbstractC27052m {

        /* renamed from: a */
        protected final C27059e.AbstractC27065d[] f67171a;

        /* renamed from: b */
        public void mo96180b() {
            C27059e.AbstractC27065d[] dVarArr = this.f67171a;
            dVarArr[0] = ((C27055p) dVarArr[0]).mo96203c();
        }

        /* renamed from: d */
        public void mo96182d() {
            C27059e.AbstractC27065d[] dVarArr = this.f67171a;
            int length = dVarArr.length - 1;
            dVarArr[length] = ((C27055p) dVarArr[length]).mo96204d();
        }

        /* renamed from: a */
        public boolean mo96178a() {
            C27059e.AbstractC27065d[] dVarArr = this.f67171a;
            if (dVarArr.length == 0 || !(dVarArr[0] instanceof C27055p)) {
                return false;
            }
            return ((C27055p) dVarArr[0]).mo96201a();
        }

        /* renamed from: c */
        public boolean mo96181c() {
            C27059e.AbstractC27065d[] dVarArr = this.f67171a;
            int length = dVarArr.length - 1;
            if (dVarArr.length == 0 || !(dVarArr[length] instanceof C27055p)) {
                return false;
            }
            return ((C27055p) dVarArr[length]).mo96202b();
        }

        protected AbstractC27041b(String str, C27059e.AbstractC27065d[] dVarArr, int i) {
            super(str, i);
            this.f67171a = C27035d.m98273a(dVarArr, false);
        }

        /* access modifiers changed from: protected */
        public void a_(C27059e eVar, C27059e.C27062a aVar, Writer writer) {
            for (C27059e.AbstractC27065d dVar : this.f67171a) {
                dVar.mo96192a(eVar, aVar, writer);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.d$e */
    public static class C27044e {

        /* renamed from: a */
        public char f67183a = '{';

        /* renamed from: b */
        public char f67184b = '}';

        /* renamed from: c */
        public char f67185c = '{';

        /* renamed from: d */
        public char f67186d = '}';

        protected C27044e() {
        }

        /* renamed from: a */
        public boolean mo96190a() {
            if (this.f67183a == '{' && this.f67185c == '{' && this.f67184b == '}' && this.f67186d == '}') {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C27044e mo96191b() {
            C27044e eVar = new C27044e();
            eVar.f67183a = this.f67183a;
            eVar.f67185c = this.f67185c;
            eVar.f67184b = this.f67184b;
            eVar.f67186d = this.f67186d;
            return eVar;
        }

        /* renamed from: b */
        private static String m98300b(String str) {
            return "Invalid delimiter configuration '" + str + "'. Must be of the form {{=1 2=}} or {{=12 34=}} where 1, 2, 3 and 4 are delimiter chars.";
        }

        /* renamed from: a */
        public C27044e mo96189a(String str) {
            String[] split = str.split(" ");
            if (split.length == 2) {
                int length = split[0].length();
                if (length == 1) {
                    this.f67183a = split[0].charAt(0);
                    this.f67185c = 0;
                } else if (length == 2) {
                    this.f67183a = split[0].charAt(0);
                    this.f67185c = split[0].charAt(1);
                } else {
                    throw new MustacheException(m98300b(str));
                }
                int length2 = split[1].length();
                if (length2 == 1) {
                    this.f67184b = split[1].charAt(0);
                    this.f67186d = 0;
                } else if (length2 == 2) {
                    this.f67184b = split[1].charAt(0);
                    this.f67186d = split[1].charAt(1);
                } else {
                    throw new MustacheException(m98300b(str));
                }
                return this;
            }
            throw new MustacheException(m98300b(str));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.d$n */
    public static class C27053n {

        /* renamed from: a */
        final C27044e f67193a;

        /* renamed from: b */
        final StringBuilder f67194b = new StringBuilder();

        /* renamed from: c */
        Reader f67195c;

        /* renamed from: d */
        C27038a f67196d;

        /* renamed from: e */
        int f67197e = 0;

        /* renamed from: f */
        int f67198f = 1;

        /* renamed from: g */
        int f67199g = 0;

        /* renamed from: h */
        int f67200h = -1;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo96197a() {
            try {
                return this.f67195c.read();
            } catch (IOException e) {
                throw new MustacheException(e);
            }
        }

        public C27053n(C27043d dVar) {
            this.f67196d = new C27038a(dVar, true);
            this.f67193a = dVar.f67182k.mo96191b();
        }

        /* renamed from: a */
        public C27038a mo96198a(Reader reader) {
            this.f67195c = reader;
            while (true) {
                int a = mo96197a();
                if (a == -1) {
                    break;
                }
                char c = (char) a;
                this.f67199g++;
                mo96199a(c);
                if (c == '\n') {
                    this.f67199g = 0;
                    this.f67198f++;
                }
            }
            int i = this.f67197e;
            if (i == 1) {
                this.f67194b.append(this.f67193a.f67183a);
            } else if (i == 2) {
                C27035d.m98272a(this.f67194b, this.f67193a);
                this.f67194b.append(this.f67193a.f67184b);
            } else if (i == 3) {
                C27035d.m98272a(this.f67194b, this.f67193a);
            }
            this.f67196d.mo96176a(this.f67194b);
            return this.f67196d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo96199a(char c) {
            String str;
            int i = this.f67197e;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (c == this.f67193a.f67184b) {
                                this.f67197e = 2;
                                if (this.f67193a.f67186d == 0) {
                                    mo96199a((char) 0);
                                }
                            } else if (c != this.f67193a.f67183a || this.f67194b.length() <= 0 || this.f67194b.charAt(0) == '!') {
                                this.f67194b.append(c);
                            } else {
                                C27035d.m98272a(this.f67194b, this.f67193a);
                                this.f67196d.mo96176a(this.f67194b);
                                this.f67200h = this.f67199g;
                                if (this.f67193a.f67185c == 0) {
                                    this.f67196d.mo96176a(this.f67194b);
                                    this.f67197e = 3;
                                    return;
                                }
                                this.f67197e = 1;
                            }
                        }
                    } else if (c == this.f67193a.f67186d) {
                        if (this.f67194b.charAt(0) == '=') {
                            C27044e eVar = this.f67193a;
                            StringBuilder sb = this.f67194b;
                            eVar.mo96189a(sb.substring(1, sb.length() - 1));
                            this.f67194b.setLength(0);
                            this.f67196d.mo96175a();
                        } else {
                            if (this.f67193a.mo96190a() && this.f67194b.charAt(0) == this.f67193a.f67183a) {
                                int a = mo96197a();
                                if (a != 125) {
                                    if (a == -1) {
                                        str = "";
                                    } else {
                                        str = String.valueOf((char) a);
                                    }
                                    throw new MustacheParseException("Invalid triple-mustache tag: {{" + ((Object) this.f67194b) + "}}" + str, this.f67198f);
                                }
                                this.f67194b.replace(0, 1, ContainerUtils.FIELD_DELIMITER);
                            }
                            this.f67196d = this.f67196d.mo96174a(this.f67194b, this.f67198f);
                        }
                        this.f67197e = 0;
                    } else {
                        this.f67194b.append(this.f67193a.f67184b);
                        this.f67197e = 3;
                        mo96199a(c);
                    }
                } else if (c == this.f67193a.f67185c) {
                    this.f67196d.mo96176a(this.f67194b);
                    this.f67197e = 3;
                } else {
                    this.f67194b.append(this.f67193a.f67183a);
                    this.f67197e = 0;
                    mo96199a(c);
                }
            } else if (c == this.f67193a.f67183a) {
                this.f67197e = 1;
                this.f67200h = this.f67199g;
                if (this.f67193a.f67185c == 0) {
                    mo96199a((char) 0);
                }
            } else {
                this.f67194b.append(c);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.d$p */
    public static class C27055p extends C27059e.AbstractC27065d {

        /* renamed from: d */
        static final /* synthetic */ boolean f67202d = true;

        /* renamed from: a */
        protected final String f67203a;

        /* renamed from: b */
        protected final int f67204b;

        /* renamed from: c */
        protected final int f67205c;

        /* renamed from: a */
        public boolean mo96201a() {
            if (this.f67204b != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo96202b() {
            if (this.f67205c != -1) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public C27055p mo96203c() {
            int i;
            int i2 = this.f67204b;
            if (i2 == -1) {
                return this;
            }
            int i3 = i2 + 1;
            int i4 = this.f67205c;
            if (i4 == -1) {
                i = -1;
            } else {
                i = i4 - i3;
            }
            return new C27055p(this.f67203a.substring(i3), -1, i);
        }

        /* renamed from: d */
        public C27055p mo96204d() {
            if (this.f67205c == -1) {
                return this;
            }
            return new C27055p(this.f67203a.substring(0, this.f67205c), this.f67204b, -1);
        }

        public String toString() {
            return "Text(" + this.f67203a.replace("\r", "\\r").replace("\n", "\\n") + ")" + this.f67204b + "/" + this.f67205c;
        }

        public C27055p(String str, boolean z) {
            this(str, m98315a(str, true, z), m98315a(str, false, z));
        }

        @Override // com.samskivert.mustache.C27059e.AbstractC27065d
        /* renamed from: a */
        public void mo96192a(C27059e eVar, C27059e.C27062a aVar, Writer writer) {
            m98337a(writer, this.f67203a);
        }

        public C27055p(String str, int i, int i2) {
            boolean z = f67202d;
            if (!z && i < -1) {
                throw new AssertionError();
            } else if (z || i2 >= -1) {
                this.f67203a = str;
                this.f67204b = i;
                this.f67205c = i2;
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        private static int m98315a(String str, boolean z, boolean z2) {
            int i;
            int i2;
            int length = str.length();
            if (z) {
                i = 0;
            } else {
                i = length - 1;
            }
            if (!z) {
                length = -1;
            }
            if (z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            while (i != length) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    if (z) {
                        return i;
                    }
                    return i + 1;
                } else if (!Character.isWhitespace(charAt)) {
                    return -1;
                } else {
                    i += i2;
                }
            }
            if (z || !z2) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public static C27043d m98270a() {
        return new C27043d(false, false, null, false, false, false, f67159b, C27032c.f67155a, f67158a, new C27028b(), new C27044e());
    }

    /* renamed from: com.samskivert.mustache.d$j */
    protected static class C27049j extends AbstractC27041b {

        /* renamed from: b */
        protected final C27043d f67190b;

        public String toString() {
            return "Inverted(" + this.f67191c + ":" + this.f67192d + "): " + Arrays.toString(this.f67171a);
        }

        @Override // com.samskivert.mustache.C27059e.AbstractC27065d
        /* renamed from: a */
        public void mo96192a(C27059e eVar, C27059e.C27062a aVar, Writer writer) {
            Object a = eVar.mo96208a(aVar, this.f67191c, this.f67192d);
            Iterator<?> a2 = this.f67190b.f67181j.mo96154a(a);
            if (a2 != null) {
                if (!a2.hasNext()) {
                    a_(eVar, aVar, writer);
                }
            } else if (a instanceof Boolean) {
                if (!((Boolean) a).booleanValue()) {
                    a_(eVar, aVar, writer);
                }
            } else if (a instanceof AbstractC27050k) {
                try {
                    ((AbstractC27050k) a).mo96195a(eVar.mo96207a(this.f67171a, aVar), writer);
                } catch (IOException e) {
                    throw new MustacheException(e);
                }
            } else if (this.f67190b.mo96187a(a)) {
                a_(eVar, aVar, writer);
            }
        }

        public C27049j(C27043d dVar, String str, C27059e.AbstractC27065d[] dVarArr, int i) {
            super(str, dVarArr, i);
            this.f67190b = dVar;
        }
    }

    /* renamed from: com.samskivert.mustache.d$o */
    protected static class C27054o extends AbstractC27041b {

        /* renamed from: b */
        protected final C27043d f67201b;

        public String toString() {
            return "Section(" + this.f67191c + ":" + this.f67192d + "): " + Arrays.toString(this.f67171a);
        }

        @Override // com.samskivert.mustache.C27059e.AbstractC27065d
        /* renamed from: a */
        public void mo96192a(C27059e eVar, C27059e.C27062a aVar, Writer writer) {
            boolean z;
            Object a = eVar.mo96208a(aVar, this.f67191c, this.f67192d);
            Iterator<?> a2 = this.f67201b.f67181j.mo96154a(a);
            if (a2 != null) {
                int i = 0;
                while (a2.hasNext()) {
                    Object next = a2.next();
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i++;
                    a_(eVar, aVar.mo96218a(next, i, z, true ^ a2.hasNext()), writer);
                }
            } else if (a instanceof Boolean) {
                if (((Boolean) a).booleanValue()) {
                    a_(eVar, aVar, writer);
                }
            } else if (a instanceof AbstractC27051l) {
                try {
                    ((AbstractC27051l) a).mo96196b(eVar.mo96207a(this.f67171a, aVar), writer);
                } catch (IOException e) {
                    throw new MustacheException(e);
                }
            } else if (!this.f67201b.mo96187a(a)) {
                a_(eVar, aVar.mo96217a(a), writer);
            }
        }

        public C27054o(C27043d dVar, String str, C27059e.AbstractC27065d[] dVarArr, int i) {
            super(str, dVarArr, i);
            this.f67201b = dVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.d$s */
    public static class C27058s extends AbstractC27052m {

        /* renamed from: a */
        protected final AbstractC27047h f67206a;

        /* renamed from: b */
        protected final AbstractC27045f f67207b;

        public String toString() {
            return "Var(" + this.f67191c + ":" + this.f67192d + ")";
        }

        @Override // com.samskivert.mustache.C27059e.AbstractC27065d
        /* renamed from: a */
        public void mo96192a(C27059e eVar, C27059e.C27062a aVar, Writer writer) {
            Object b = eVar.mo96215b(aVar, this.f67191c, this.f67192d);
            if (b != null) {
                m98337a(writer, this.f67207b.mo96170a(this.f67206a.mo96172a(b)));
                return;
            }
            throw new MustacheException.Context("No key, method or field with name '" + this.f67191c + "' on line " + this.f67192d, this.f67191c, this.f67192d);
        }

        public C27058s(String str, int i, AbstractC27047h hVar, AbstractC27045f fVar) {
            super(str, i);
            this.f67206a = hVar;
            this.f67207b = fVar;
        }
    }

    /* renamed from: com.samskivert.mustache.d$d */
    public static class C27043d {

        /* renamed from: a */
        public final boolean f67172a;

        /* renamed from: b */
        public final boolean f67173b;

        /* renamed from: c */
        public final String f67174c;

        /* renamed from: d */
        public final boolean f67175d;

        /* renamed from: e */
        public final boolean f67176e;

        /* renamed from: f */
        public final boolean f67177f;

        /* renamed from: g */
        public final AbstractC27047h f67178g;

        /* renamed from: h */
        public final AbstractC27045f f67179h;

        /* renamed from: i */
        public final AbstractC27056q f67180i;

        /* renamed from: j */
        public final AbstractC27042c f67181j;

        /* renamed from: k */
        public final C27044e f67182k;

        /* renamed from: a */
        public C27059e mo96185a(Reader reader) {
            return C27035d.m98271a(reader, this);
        }

        /* renamed from: a */
        public C27043d mo96184a(boolean z) {
            AbstractC27045f fVar;
            if (z) {
                fVar = C27032c.f67155a;
            } else {
                fVar = C27032c.f67156b;
            }
            return mo96183a(fVar);
        }

        /* renamed from: b */
        public String mo96188b(String str) {
            String str2 = this.f67174c;
            if (str2 == null) {
                return null;
            }
            return str2.replace("{{name}}", str);
        }

        /* renamed from: a */
        public C27043d mo96183a(AbstractC27045f fVar) {
            return new C27043d(this.f67172a, this.f67173b, this.f67174c, this.f67175d, this.f67176e, this.f67177f, this.f67178g, fVar, this.f67180i, this.f67181j, this.f67182k);
        }

        /* renamed from: a */
        public C27059e mo96186a(String str) {
            return mo96185a((Reader) new StringReader(str));
        }

        /* renamed from: a */
        public boolean mo96187a(Object obj) {
            if ((!this.f67176e || !"".equals(obj)) && (!this.f67177f || !(obj instanceof Number) || ((Number) obj).longValue() != 0)) {
                return false;
            }
            return true;
        }

        protected C27043d(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, AbstractC27047h hVar, AbstractC27045f fVar, AbstractC27056q qVar, AbstractC27042c cVar, C27044e eVar) {
            this.f67172a = z;
            this.f67173b = z2;
            this.f67174c = str;
            this.f67175d = z3;
            this.f67176e = z4;
            this.f67177f = z5;
            this.f67178g = hVar;
            this.f67179h = fVar;
            this.f67180i = qVar;
            this.f67181j = cVar;
            this.f67182k = eVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.samskivert.mustache.d$i */
    public static class C27048i extends C27059e.AbstractC27065d {

        /* renamed from: a */
        protected final C27043d f67187a;

        /* renamed from: b */
        protected final String f67188b;

        /* renamed from: c */
        protected C27059e f67189c;

        public C27048i(C27043d dVar, String str) {
            this.f67187a = dVar;
            this.f67188b = str;
        }

        @Override // com.samskivert.mustache.C27059e.AbstractC27065d
        /* renamed from: a */
        public void mo96192a(C27059e eVar, C27059e.C27062a aVar, Writer writer) {
            if (this.f67189c == null) {
                Reader reader = null;
                try {
                    reader = this.f67187a.f67180i.mo96171a(this.f67188b);
                    this.f67189c = this.f67187a.mo96185a(reader);
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } catch (Exception e2) {
                    if (e2 instanceof RuntimeException) {
                        throw ((RuntimeException) e2);
                    }
                    throw new MustacheException("Unable to load template: " + this.f67188b, e2);
                } catch (Throwable th) {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                    throw th;
                }
            }
            this.f67189c.mo96213a(aVar, writer);
        }
    }

    /* renamed from: com.samskivert.mustache.d$m */
    protected static abstract class AbstractC27052m extends C27059e.AbstractC27065d {

        /* renamed from: c */
        protected final String f67191c;

        /* renamed from: d */
        protected final int f67192d;

        protected AbstractC27052m(String str, int i) {
            this.f67191c = str.intern();
            this.f67192d = i;
        }
    }

    /* renamed from: a */
    protected static C27059e m98271a(Reader reader, C27043d dVar) {
        return new C27059e(m98273a(new C27053n(dVar).mo96198a(reader).mo96177b(), true), dVar);
    }

    /* renamed from: a */
    protected static void m98272a(StringBuilder sb, C27044e eVar) {
        sb.insert(0, eVar.f67183a);
        if (eVar.f67185c != 0) {
            sb.insert(1, eVar.f67185c);
        }
    }

    /* renamed from: a */
    protected static C27059e.AbstractC27065d[] m98273a(C27059e.AbstractC27065d[] dVarArr, boolean z) {
        boolean z2;
        int length = dVarArr.length;
        for (int i = 0; i < length; i++) {
            C27059e.AbstractC27065d dVar = dVarArr[i];
            C27055p pVar = null;
            C27055p pVar2 = i > 0 ? dVarArr[i - 1] : null;
            C27055p pVar3 = i < length - 1 ? dVarArr[i + 1] : null;
            C27055p pVar4 = pVar2 instanceof C27055p ? pVar2 : null;
            if (pVar3 instanceof C27055p) {
                pVar = pVar3;
            }
            boolean z3 = true;
            if ((pVar2 != null || !z) && (pVar4 == null || !pVar4.mo96202b())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((pVar3 != null || !z) && (pVar == null || !pVar.mo96201a())) {
                z3 = false;
            }
            if (dVar instanceof AbstractC27041b) {
                AbstractC27041b bVar = (AbstractC27041b) dVar;
                if (z2 && bVar.mo96178a()) {
                    if (pVar2 != null) {
                        dVarArr[i - 1] = pVar4.mo96204d();
                    }
                    bVar.mo96180b();
                }
                if (z3 && bVar.mo96181c()) {
                    bVar.mo96182d();
                    if (pVar3 != null) {
                        dVarArr[i + 1] = pVar.mo96203c();
                    }
                }
            } else if ((dVar instanceof C27046g) && z2 && z3) {
                if (pVar2 != null) {
                    dVarArr[i - 1] = pVar4.mo96204d();
                }
                if (pVar3 != null) {
                    dVarArr[i + 1] = pVar.mo96203c();
                }
            }
        }
        return dVarArr;
    }
}
