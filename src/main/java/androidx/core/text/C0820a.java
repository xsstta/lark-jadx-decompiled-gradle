package androidx.core.text;

import android.text.SpannableStringBuilder;
import com.ss.ugc.effectplatform.cache.disklrucache.StrictLineReader;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
public final class C0820a {

    /* renamed from: a */
    static final AbstractC0827d f3265a;

    /* renamed from: b */
    static final C0820a f3266b;

    /* renamed from: c */
    static final C0820a f3267c;

    /* renamed from: d */
    private static final String f3268d = Character.toString(8206);

    /* renamed from: e */
    private static final String f3269e = Character.toString(8207);

    /* renamed from: f */
    private final boolean f3270f;

    /* renamed from: g */
    private final int f3271g;

    /* renamed from: h */
    private final AbstractC0827d f3272h;

    /* renamed from: androidx.core.text.a$a */
    public static final class C0821a {

        /* renamed from: a */
        private boolean f3273a;

        /* renamed from: b */
        private int f3274b;

        /* renamed from: c */
        private AbstractC0827d f3275c;

        public C0821a() {
            m3944a(C0820a.m3935a(Locale.getDefault()));
        }

        /* renamed from: a */
        public C0820a mo4437a() {
            if (this.f3274b == 2 && this.f3275c == C0820a.f3265a) {
                return m3945b(this.f3273a);
            }
            return new C0820a(this.f3273a, this.f3274b, this.f3275c);
        }

        /* renamed from: b */
        private static C0820a m3945b(boolean z) {
            if (z) {
                return C0820a.f3267c;
            }
            return C0820a.f3266b;
        }

        /* renamed from: a */
        private void m3944a(boolean z) {
            this.f3273a = z;
            this.f3275c = C0820a.f3265a;
            this.f3274b = 2;
        }
    }

    /* renamed from: a */
    public static C0820a m3933a() {
        return new C0821a().mo4437a();
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.text.a$b */
    public static class C0822b {

        /* renamed from: a */
        private static final byte[] f3276a = new byte[1792];

        /* renamed from: b */
        private final CharSequence f3277b;

        /* renamed from: c */
        private final boolean f3278c;

        /* renamed from: d */
        private final int f3279d;

        /* renamed from: e */
        private int f3280e;

        /* renamed from: f */
        private char f3281f;

        static {
            for (int i = 0; i < 1792; i++) {
                f3276a[i] = Character.getDirectionality(i);
            }
        }

        /* renamed from: g */
        private byte m3950g() {
            char charAt;
            do {
                int i = this.f3280e;
                if (i >= this.f3279d) {
                    return 12;
                }
                CharSequence charSequence = this.f3277b;
                this.f3280e = i + 1;
                charAt = charSequence.charAt(i);
                this.f3281f = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: f */
        private byte m3949f() {
            char charAt;
            int i = this.f3280e;
            while (true) {
                int i2 = this.f3280e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3277b;
                int i3 = i2 - 1;
                this.f3280e = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f3281f = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f3280e;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f3277b;
                        int i5 = i4 - 1;
                        this.f3280e = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f3281f = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f3280e = i;
            this.f3281f = '>';
            return StrictLineReader.f164804b;
        }

        /* renamed from: h */
        private byte m3951h() {
            char charAt;
            int i = this.f3280e;
            do {
                int i2 = this.f3280e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3277b;
                int i3 = i2 - 1;
                this.f3280e = i3;
                charAt = charSequence.charAt(i3);
                this.f3281f = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f3280e = i;
            this.f3281f = ';';
            return StrictLineReader.f164804b;
        }

        /* renamed from: e */
        private byte m3948e() {
            char charAt;
            int i = this.f3280e;
            while (true) {
                int i2 = this.f3280e;
                if (i2 < this.f3279d) {
                    CharSequence charSequence = this.f3277b;
                    this.f3280e = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f3281f = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f3280e;
                            if (i3 >= this.f3279d) {
                                break;
                            }
                            CharSequence charSequence2 = this.f3277b;
                            this.f3280e = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f3281f = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f3280e = i;
                    this.f3281f = '<';
                    return StrictLineReader.f164804b;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo4438a() {
            this.f3280e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f3280e < this.f3279d && i == 0) {
                byte c = mo4440c();
                if (c != 0) {
                    if (c == 1 || c == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (c != 9) {
                        switch (c) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f3280e > 0) {
                switch (mo4441d()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4439b() {
            this.f3280e = this.f3279d;
            int i = 0;
            int i2 = 0;
            while (this.f3280e > 0) {
                byte d = mo4441d();
                if (d != 0) {
                    if (d == 1 || d == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 != 0) {
                        }
                    } else if (d != 9) {
                        switch (d) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 != 0) {
                    }
                }
                i2 = i;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public byte mo4440c() {
            char charAt = this.f3277b.charAt(this.f3280e);
            this.f3281f = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f3277b, this.f3280e);
                this.f3280e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3280e++;
            byte a = m3947a(this.f3281f);
            if (!this.f3278c) {
                return a;
            }
            char c = this.f3281f;
            if (c == '<') {
                return m3948e();
            }
            if (c == '&') {
                return m3950g();
            }
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public byte mo4441d() {
            char charAt = this.f3277b.charAt(this.f3280e - 1);
            this.f3281f = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3277b, this.f3280e);
                this.f3280e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3280e--;
            byte a = m3947a(this.f3281f);
            if (!this.f3278c) {
                return a;
            }
            char c = this.f3281f;
            if (c == '>') {
                return m3949f();
            }
            if (c == ';') {
                return m3951h();
            }
            return a;
        }

        /* renamed from: a */
        private static byte m3947a(char c) {
            if (c < 1792) {
                return f3276a[c];
            }
            return Character.getDirectionality(c);
        }

        C0822b(CharSequence charSequence, boolean z) {
            this.f3277b = charSequence;
            this.f3278c = z;
            this.f3279d = charSequence.length();
        }
    }

    /* renamed from: b */
    public boolean mo4436b() {
        if ((this.f3271g & 2) != 0) {
            return true;
        }
        return false;
    }

    static {
        AbstractC0827d dVar = C0828e.f3300c;
        f3265a = dVar;
        f3266b = new C0820a(false, 2, dVar);
        f3267c = new C0820a(true, 2, dVar);
    }

    /* renamed from: a */
    public CharSequence mo4432a(CharSequence charSequence) {
        return mo4433a(charSequence, this.f3272h, true);
    }

    /* renamed from: b */
    private static int m3936b(CharSequence charSequence) {
        return new C0822b(charSequence, false).mo4439b();
    }

    /* renamed from: c */
    private static int m3938c(CharSequence charSequence) {
        return new C0822b(charSequence, false).mo4438a();
    }

    /* renamed from: a */
    static boolean m3935a(Locale locale) {
        if (C0835f.m3981a(locale) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String mo4434a(String str) {
        return mo4435a(str, this.f3272h, true);
    }

    /* renamed from: a */
    private String m3934a(CharSequence charSequence, AbstractC0827d dVar) {
        boolean a = dVar.mo4467a(charSequence, 0, charSequence.length());
        if (!this.f3270f && (a || m3936b(charSequence) == 1)) {
            return f3268d;
        }
        if (!this.f3270f) {
            return "";
        }
        if (!a || m3936b(charSequence) == -1) {
            return f3269e;
        }
        return "";
    }

    /* renamed from: b */
    private String m3937b(CharSequence charSequence, AbstractC0827d dVar) {
        boolean a = dVar.mo4467a(charSequence, 0, charSequence.length());
        if (!this.f3270f && (a || m3938c(charSequence) == 1)) {
            return f3268d;
        }
        if (!this.f3270f) {
            return "";
        }
        if (!a || m3938c(charSequence) == -1) {
            return f3269e;
        }
        return "";
    }

    C0820a(boolean z, int i, AbstractC0827d dVar) {
        this.f3270f = z;
        this.f3271g = i;
        this.f3272h = dVar;
    }

    /* renamed from: a */
    public CharSequence mo4433a(CharSequence charSequence, AbstractC0827d dVar, boolean z) {
        AbstractC0827d dVar2;
        char c;
        AbstractC0827d dVar3;
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo4467a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo4436b() && z) {
            if (a) {
                dVar3 = C0828e.f3299b;
            } else {
                dVar3 = C0828e.f3298a;
            }
            spannableStringBuilder.append((CharSequence) m3937b(charSequence, dVar3));
        }
        if (a != this.f3270f) {
            if (a) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (a) {
                dVar2 = C0828e.f3299b;
            } else {
                dVar2 = C0828e.f3298a;
            }
            spannableStringBuilder.append((CharSequence) m3934a(charSequence, dVar2));
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public String mo4435a(String str, AbstractC0827d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo4433a((CharSequence) str, dVar, z).toString();
    }
}
