package com.ss.android.lark.mail.impl.validator.base;

import java.util.Arrays;

/* renamed from: com.ss.android.lark.mail.impl.validator.base.c */
public abstract class AbstractC43868c {
    /* renamed from: c */
    public abstract boolean mo156259c(char c);

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$e */
    static abstract class AbstractC43873e extends AbstractC43868c {
        AbstractC43873e() {
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: f */
        public AbstractC43868c mo156263f() {
            return new C43880l(this);
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$i */
    private static final class C43877i extends AbstractC43868c {

        /* renamed from: a */
        static final C43877i f111330a = new C43877i();

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }

        private C43877i() {
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            return Character.isLetterOrDigit(c);
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$j */
    static abstract class AbstractC43878j extends AbstractC43873e {

        /* renamed from: a */
        private final String f111331a;

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        public final String toString() {
            return this.f111331a;
        }

        AbstractC43878j(String str) {
            this.f111331a = (String) C43886f.m173939a(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$k */
    public static class C43879k extends AbstractC43868c {

        /* renamed from: a */
        final AbstractC43868c f111332a;

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: f */
        public AbstractC43868c mo156263f() {
            return this.f111332a;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        public String toString() {
            return this.f111332a + ".negate()";
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: b */
        public boolean mo156258b(CharSequence charSequence) {
            return this.f111332a.mo156260c(charSequence);
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156260c(CharSequence charSequence) {
            return this.f111332a.mo156258b(charSequence);
        }

        C43879k(AbstractC43868c cVar) {
            this.f111332a = (AbstractC43868c) C43886f.m173939a(cVar);
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            return !this.f111332a.mo156259c(c);
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$o */
    private static class C43883o extends AbstractC43868c {

        /* renamed from: a */
        private final String f111336a;

        /* renamed from: b */
        private final char[] f111337b;

        /* renamed from: c */
        private final char[] f111338c;

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        public String toString() {
            return this.f111336a;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            int binarySearch = Arrays.binarySearch(this.f111337b, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            if (i < 0 || c > this.f111338c[i]) {
                return false;
            }
            return true;
        }

        C43883o(String str, char[] cArr, char[] cArr2) {
            boolean z;
            boolean z2;
            boolean z3;
            this.f111336a = str;
            this.f111337b = cArr;
            this.f111338c = cArr2;
            if (cArr.length == cArr2.length) {
                z = true;
            } else {
                z = false;
            }
            C43886f.m173941a(z);
            int i = 0;
            while (i < cArr.length) {
                if (cArr[i] <= cArr2[i]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C43886f.m173941a(z2);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    if (cArr2[i] < cArr[i2]) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    C43886f.m173941a(z3);
                }
                i = i2;
            }
        }
    }

    protected AbstractC43868c() {
    }

    /* renamed from: a */
    public static AbstractC43868c m173876a() {
        return C43869a.f111322a;
    }

    /* renamed from: b */
    public static AbstractC43868c m173879b() {
        return C43881m.f111333a;
    }

    /* renamed from: c */
    public static AbstractC43868c m173881c() {
        return C43871c.f111324a;
    }

    /* renamed from: d */
    public static AbstractC43868c m173882d() {
        return C43872d.f111325a;
    }

    /* renamed from: e */
    public static AbstractC43868c m173884e() {
        return C43877i.f111330a;
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$a */
    private static final class C43869a extends AbstractC43878j {

        /* renamed from: a */
        static final C43869a f111322a = new C43869a();

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            return true;
        }

        private C43869a() {
            super("CharMatcher.any()");
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c, com.ss.android.lark.mail.impl.validator.base.AbstractC43868c.AbstractC43873e
        /* renamed from: f */
        public AbstractC43868c mo156263f() {
            return m173879b();
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: a */
        public AbstractC43868c mo156257a(AbstractC43868c cVar) {
            C43886f.m173939a(cVar);
            return this;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: b */
        public boolean mo156258b(CharSequence charSequence) {
            C43886f.m173939a(charSequence);
            return true;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: e */
        public String mo156262e(CharSequence charSequence) {
            C43886f.m173939a(charSequence);
            return "";
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156260c(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: d */
        public int mo156261d(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return -1;
            }
            return 0;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: a */
        public int mo156256a(CharSequence charSequence, int i) {
            int length = charSequence.length();
            C43886f.m173937a(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$c */
    private static final class C43871c extends AbstractC43878j {

        /* renamed from: a */
        static final C43871c f111324a = new C43871c();

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            return c <= 127;
        }

        C43871c() {
            super("CharMatcher.ascii()");
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$d */
    private static final class C43872d extends C43883o {

        /* renamed from: a */
        static final C43872d f111325a = new C43872d();

        /* renamed from: g */
        private static char[] m173904g() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }

        private C43872d() {
            super("CharMatcher.digit()", m173904g(), m173905h());
        }

        /* renamed from: h */
        private static char[] m173905h() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + '\t');
            }
            return cArr;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$f */
    public static final class C43874f extends AbstractC43873e {

        /* renamed from: a */
        private final char f111326a;

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c, com.ss.android.lark.mail.impl.validator.base.AbstractC43868c.AbstractC43873e
        /* renamed from: f */
        public AbstractC43868c mo156263f() {
            return m173880b(this.f111326a);
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        public String toString() {
            return "CharMatcher.is('" + AbstractC43868c.m173883d(this.f111326a) + "')";
        }

        C43874f(char c) {
            this.f111326a = c;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            if (c == this.f111326a) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: a */
        public AbstractC43868c mo156257a(AbstractC43868c cVar) {
            if (cVar.mo156259c(this.f111326a)) {
                return cVar;
            }
            return super.mo156257a(cVar);
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$h */
    private static final class C43876h extends AbstractC43873e {

        /* renamed from: a */
        private final char f111329a;

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c, com.ss.android.lark.mail.impl.validator.base.AbstractC43868c.AbstractC43873e
        /* renamed from: f */
        public AbstractC43868c mo156263f() {
            return m173877a(this.f111329a);
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        public String toString() {
            return "CharMatcher.isNot('" + AbstractC43868c.m173883d(this.f111329a) + "')";
        }

        C43876h(char c) {
            this.f111329a = c;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            if (c != this.f111329a) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: a */
        public AbstractC43868c mo156257a(AbstractC43868c cVar) {
            if (cVar.mo156259c(this.f111329a)) {
                return m173876a();
            }
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$m */
    public static final class C43881m extends AbstractC43878j {

        /* renamed from: a */
        static final C43881m f111333a = new C43881m();

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            return false;
        }

        private C43881m() {
            super("CharMatcher.none()");
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c, com.ss.android.lark.mail.impl.validator.base.AbstractC43868c.AbstractC43873e
        /* renamed from: f */
        public AbstractC43868c mo156263f() {
            return m173876a();
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: a */
        public AbstractC43868c mo156257a(AbstractC43868c cVar) {
            return (AbstractC43868c) C43886f.m173939a(cVar);
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156260c(CharSequence charSequence) {
            C43886f.m173939a(charSequence);
            return true;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: d */
        public int mo156261d(CharSequence charSequence) {
            C43886f.m173939a(charSequence);
            return -1;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: e */
        public String mo156262e(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: b */
        public boolean mo156258b(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: a */
        public int mo156256a(CharSequence charSequence, int i) {
            C43886f.m173937a(i, charSequence.length());
            return -1;
        }
    }

    /* renamed from: f */
    public AbstractC43868c mo156263f() {
        return new C43879k(this);
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$b */
    private static final class C43870b extends AbstractC43868c {

        /* renamed from: a */
        private final char[] f111323a;

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.f111323a) {
                sb.append(AbstractC43868c.m173883d(c));
            }
            sb.append("\")");
            return sb.toString();
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            if (Arrays.binarySearch(this.f111323a, c) >= 0) {
                return true;
            }
            return false;
        }

        public C43870b(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f111323a = charArray;
            Arrays.sort(charArray);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$g */
    public static final class C43875g extends AbstractC43873e {

        /* renamed from: a */
        private final char f111327a;

        /* renamed from: b */
        private final char f111328b;

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        public String toString() {
            return "CharMatcher.anyOf(\"" + AbstractC43868c.m173883d(this.f111327a) + AbstractC43868c.m173883d(this.f111328b) + "\")";
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            if (c == this.f111327a || c == this.f111328b) {
                return true;
            }
            return false;
        }

        C43875g(char c, char c2) {
            this.f111327a = c;
            this.f111328b = c2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$n */
    public static final class C43882n extends AbstractC43868c {

        /* renamed from: a */
        final AbstractC43868c f111334a;

        /* renamed from: b */
        final AbstractC43868c f111335b;

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        public String toString() {
            return "CharMatcher.or(" + this.f111334a + ", " + this.f111335b + ")";
        }

        @Override // com.ss.android.lark.mail.impl.validator.base.AbstractC43868c
        /* renamed from: c */
        public boolean mo156259c(char c) {
            if (this.f111334a.mo156259c(c) || this.f111335b.mo156259c(c)) {
                return true;
            }
            return false;
        }

        C43882n(AbstractC43868c cVar, AbstractC43868c cVar2) {
            this.f111334a = (AbstractC43868c) C43886f.m173939a(cVar);
            this.f111335b = (AbstractC43868c) C43886f.m173939a(cVar2);
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.validator.base.c$l */
    static class C43880l extends C43879k {
        C43880l(AbstractC43868c cVar) {
            super(cVar);
        }
    }

    /* renamed from: b */
    public static AbstractC43868c m173880b(char c) {
        return new C43876h(c);
    }

    /* renamed from: d */
    public int mo156261d(CharSequence charSequence) {
        return mo156256a(charSequence, 0);
    }

    /* renamed from: a */
    public static AbstractC43868c m173877a(char c) {
        return new C43874f(c);
    }

    /* renamed from: c */
    public boolean mo156260c(CharSequence charSequence) {
        if (mo156261d(charSequence) == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo156264f(CharSequence charSequence) {
        return mo156263f().mo156262e(charSequence);
    }

    /* renamed from: b */
    public boolean mo156258b(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo156259c(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static AbstractC43868c m173878a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return m173879b();
        }
        if (length == 1) {
            return m173877a(charSequence.charAt(0));
        }
        if (length != 2) {
            return new C43870b(charSequence);
        }
        return m173875a(charSequence.charAt(0), charSequence.charAt(1));
    }

    /* renamed from: d */
    public static String m173883d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: e */
    public String mo156262e(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int d = mo156261d(charSequence2);
        if (d == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            d++;
            while (d != charArray.length) {
                if (mo156259c(charArray[d])) {
                    i++;
                } else {
                    charArray[d - i] = charArray[d];
                    d++;
                }
            }
            return new String(charArray, 0, d - i);
        }
    }

    /* renamed from: a */
    public AbstractC43868c mo156257a(AbstractC43868c cVar) {
        return new C43882n(this, cVar);
    }

    /* renamed from: a */
    private static C43875g m173875a(char c, char c2) {
        return new C43875g(c, c2);
    }

    /* renamed from: a */
    public int mo156256a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C43886f.m173937a(i, length);
        while (i < length) {
            if (mo156259c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
