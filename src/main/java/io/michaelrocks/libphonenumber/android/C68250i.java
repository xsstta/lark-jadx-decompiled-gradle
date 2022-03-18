package io.michaelrocks.libphonenumber.android;

import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonemetadata;
import io.michaelrocks.libphonenumber.android.Phonenumber;
import io.michaelrocks.libphonenumber.android.p3451a.C68240c;
import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: io.michaelrocks.libphonenumber.android.i */
final class C68250i implements Iterator<C68249h> {

    /* renamed from: a */
    private static final Pattern f171520a;

    /* renamed from: b */
    private static final Pattern f171521b = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");

    /* renamed from: c */
    private static final Pattern f171522c = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");

    /* renamed from: d */
    private static final Pattern f171523d = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");

    /* renamed from: e */
    private static final Pattern f171524e = Pattern.compile(":[0-5]\\d");

    /* renamed from: f */
    private static final Pattern f171525f;

    /* renamed from: g */
    private static final Pattern[] f171526g = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};

    /* renamed from: h */
    private static final Pattern f171527h;

    /* renamed from: i */
    private final PhoneNumberUtil f171528i;

    /* renamed from: j */
    private final CharSequence f171529j;

    /* renamed from: k */
    private final String f171530k;

    /* renamed from: l */
    private final PhoneNumberUtil.Leniency f171531l;

    /* renamed from: m */
    private long f171532m;

    /* renamed from: n */
    private EnumC68252b f171533n = EnumC68252b.NOT_READY;

    /* renamed from: o */
    private C68249h f171534o;

    /* renamed from: p */
    private int f171535p;

    /* renamed from: q */
    private final C68240c f171536q = new C68240c(32);

    /* access modifiers changed from: package-private */
    /* renamed from: io.michaelrocks.libphonenumber.android.i$a */
    public interface AbstractC68251a {
        /* renamed from: a */
        boolean mo237211a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: io.michaelrocks.libphonenumber.android.i$b */
    public enum EnumC68252b {
        NOT_READY,
        READY,
        DONE
    }

    /* renamed from: a */
    private static String[] m264969a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber) {
        String a = phoneNumberUtil.mo237192a(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.RFC3966);
        int indexOf = a.indexOf(59);
        if (indexOf < 0) {
            indexOf = a.length();
        }
        return a.substring(a.indexOf(45) + 1, indexOf).split("-");
    }

    /* renamed from: a */
    private static String[] m264970a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, Phonemetadata.NumberFormat numberFormat) {
        return phoneNumberUtil.mo237193a(phoneNumberUtil.mo237191a(phoneNumber), numberFormat, PhoneNumberUtil.PhoneNumberFormat.RFC3966).split("-");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo237432a(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, AbstractC68251a aVar) {
        StringBuilder a = PhoneNumberUtil.m264886a(charSequence, true);
        if (aVar.mo237211a(phoneNumberUtil, phoneNumber, a, m264969a(phoneNumberUtil, phoneNumber))) {
            return true;
        }
        Phonemetadata.PhoneMetadata b = phoneNumberUtil.mo237190a().mo237425b(phoneNumber.getCountryCode());
        String a2 = phoneNumberUtil.mo237191a(phoneNumber);
        if (b != null) {
            for (Phonemetadata.NumberFormat numberFormat : b.numberFormats()) {
                if ((numberFormat.leadingDigitsPatternSize() <= 0 || this.f171536q.mo237416a(numberFormat.getLeadingDigitsPattern(0)).matcher(a2).lookingAt()) && aVar.mo237211a(phoneNumberUtil, phoneNumber, a, m264970a(phoneNumberUtil, phoneNumber, numberFormat))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m264967a(Phonenumber.PhoneNumber phoneNumber, String str) {
        int indexOf;
        int indexOf2 = str.indexOf(47);
        if (indexOf2 < 0 || (indexOf = str.indexOf(47, indexOf2 + 1)) < 0) {
            return false;
        }
        if (!(phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN || phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN) || !PhoneNumberUtil.m264898c((CharSequence) str.substring(0, indexOf2)).equals(Integer.toString(phoneNumber.getCountryCode()))) {
            return true;
        }
        return str.substring(indexOf + 1).contains("/");
    }

    /* renamed from: a */
    static boolean m264968a(Phonenumber.PhoneNumber phoneNumber, String str, PhoneNumberUtil phoneNumberUtil) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'x' || charAt2 == 'X') {
                    if (phoneNumberUtil.mo237183a(phoneNumber, (CharSequence) str.substring(i2)) != PhoneNumberUtil.MatchType.NSN_MATCH) {
                        return false;
                    }
                    i = i2;
                } else if (!PhoneNumberUtil.m264898c((CharSequence) str.substring(i)).equals(phoneNumber.getExtension())) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }

    /* renamed from: a */
    public C68249h next() {
        if (hasNext()) {
            C68249h hVar = this.f171534o;
            this.f171534o = null;
            this.f171533n = EnumC68252b.NOT_READY;
            return hVar;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        if (this.f171533n == EnumC68252b.NOT_READY) {
            C68249h a = m264960a(this.f171535p);
            this.f171534o = a;
            if (a == null) {
                this.f171533n = EnumC68252b.DONE;
            } else {
                this.f171535p = a.mo237427b();
                this.f171533n = EnumC68252b.READY;
            }
        }
        if (this.f171533n == EnumC68252b.READY) {
            return true;
        }
        return false;
    }

    static {
        String a = m264963a(0, 3);
        f171525f = Pattern.compile("(?:[" + "(\\[（［" + "])?(?:" + "[^(\\[（［)\\]）］]" + "+[" + ")\\]）］" + "])?" + "[^(\\[（［)\\]）］]" + "+(?:[" + "(\\[（［" + "]" + "[^(\\[（［)\\]）］]" + "+[" + ")\\]）］" + "])" + a + "[^(\\[（［)\\]）］]" + "*");
        String a2 = m264963a(0, 2);
        String a3 = m264963a(0, 4);
        String a4 = m264963a(0, 20);
        StringBuilder sb = new StringBuilder();
        sb.append("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]");
        sb.append(a3);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\\p{Nd}");
        sb3.append(m264963a(1, 20));
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[");
        sb5.append("(\\[（［+＋");
        sb5.append("]");
        String sb6 = sb5.toString();
        f171527h = Pattern.compile(sb6);
        f171520a = Pattern.compile("(?:" + sb6 + sb2 + ")" + a2 + sb4 + "(?:" + sb2 + sb4 + ")" + a4 + "(?:" + PhoneNumberUtil.f171459d + ")?", 66);
    }

    /* renamed from: b */
    private static boolean m264972b(char c) {
        if (c == '%' || Character.getType(c) == 26) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private C68249h m264960a(int i) {
        Matcher matcher = f171520a.matcher(this.f171529j);
        while (this.f171532m > 0 && matcher.find(i)) {
            int start = matcher.start();
            CharSequence a = m264962a(PhoneNumberUtil.f171457b, this.f171529j.subSequence(start, matcher.end()));
            C68249h a2 = m264961a(a, start);
            if (a2 != null) {
                return a2;
            }
            i = start + a.length();
            this.f171532m--;
        }
        return null;
    }

    /* renamed from: a */
    static boolean m264964a(char c) {
        if (!Character.isLetter(c) && Character.getType(c) != 6) {
            return false;
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static CharSequence m264962a(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        if (matcher.find()) {
            return charSequence.subSequence(0, matcher.start());
        }
        return charSequence;
    }

    /* renamed from: a */
    private C68249h m264961a(CharSequence charSequence, int i) {
        if (f171522c.matcher(charSequence).find()) {
            return null;
        }
        if (f171523d.matcher(charSequence).find()) {
            if (f171524e.matcher(this.f171529j.toString().substring(charSequence.length() + i)).lookingAt()) {
                return null;
            }
        }
        C68249h c = m264974c(charSequence, i);
        if (c != null) {
            return c;
        }
        return m264971b(charSequence, i);
    }

    /* renamed from: b */
    private C68249h m264971b(CharSequence charSequence, int i) {
        for (Pattern pattern : f171526g) {
            Matcher matcher = pattern.matcher(charSequence);
            boolean z = true;
            while (matcher.find() && this.f171532m > 0) {
                if (z) {
                    C68249h c = m264974c(m264962a(PhoneNumberUtil.f171458c, charSequence.subSequence(0, matcher.start())), i);
                    if (c != null) {
                        return c;
                    }
                    this.f171532m--;
                    z = false;
                }
                C68249h c2 = m264974c(m264962a(PhoneNumberUtil.f171458c, matcher.group(1)), matcher.start(1) + i);
                if (c2 != null) {
                    return c2;
                }
                this.f171532m--;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m264963a(int i, int i2) {
        if (i < 0 || i2 <= 0 || i2 < i) {
            throw new IllegalArgumentException();
        }
        return "{" + i + "," + i2 + "}";
    }

    /* renamed from: c */
    private C68249h m264974c(CharSequence charSequence, int i) {
        try {
            if (f171525f.matcher(charSequence).matches()) {
                if (!f171521b.matcher(charSequence).find()) {
                    if (this.f171531l.compareTo((Enum) PhoneNumberUtil.Leniency.VALID) >= 0) {
                        if (i > 0 && !f171527h.matcher(charSequence).lookingAt()) {
                            char charAt = this.f171529j.charAt(i - 1);
                            if (m264972b(charAt) || m264964a(charAt)) {
                                return null;
                            }
                        }
                        int length = charSequence.length() + i;
                        if (length < this.f171529j.length()) {
                            char charAt2 = this.f171529j.charAt(length);
                            if (m264972b(charAt2) || m264964a(charAt2)) {
                                return null;
                            }
                        }
                    }
                    Phonenumber.PhoneNumber b = this.f171528i.mo237201b(charSequence, this.f171530k);
                    if (this.f171531l.verify(b, charSequence, this.f171528i, this)) {
                        b.clearCountryCodeSource();
                        b.clearRawInput();
                        b.clearPreferredDomesticCarrierCode();
                        return new C68249h(i, charSequence.toString(), b);
                    }
                }
            }
        } catch (NumberParseException unused) {
        }
        return null;
    }

    /* renamed from: a */
    static boolean m264966a(Phonenumber.PhoneNumber phoneNumber, PhoneNumberUtil phoneNumberUtil) {
        Phonemetadata.PhoneMetadata b;
        Phonemetadata.NumberFormat a;
        if (phoneNumber.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY && (b = phoneNumberUtil.mo237200b(phoneNumberUtil.mo237202b(phoneNumber.getCountryCode()))) != null && (a = phoneNumberUtil.mo237185a(b.numberFormats(), phoneNumberUtil.mo237191a(phoneNumber))) != null && a.getNationalPrefixFormattingRule().length() > 0 && !a.getNationalPrefixOptionalWhenFormatting() && !PhoneNumberUtil.m264894a(a.getNationalPrefixFormattingRule())) {
            return phoneNumberUtil.mo237199a(new StringBuilder(PhoneNumberUtil.m264898c((CharSequence) phoneNumber.getRawInput())), b, (StringBuilder) null);
        }
        return true;
    }

    /* renamed from: b */
    static boolean m264973b(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        int i;
        String[] split = PhoneNumberUtil.f171460e.split(sb.toString());
        if (phoneNumber.hasExtension()) {
            i = split.length - 2;
        } else {
            i = split.length - 1;
        }
        if (split.length == 1 || split[i].contains(phoneNumberUtil.mo237191a(phoneNumber))) {
            return true;
        }
        int length = strArr.length - 1;
        while (length > 0 && i >= 0) {
            if (!split[i].equals(strArr[length])) {
                return false;
            }
            length--;
            i--;
        }
        if (i < 0 || !split[i].endsWith(strArr[0])) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m264965a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
        int i;
        if (phoneNumber.getCountryCodeSource() != Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            String num = Integer.toString(phoneNumber.getCountryCode());
            i = sb.indexOf(num) + num.length();
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            int indexOf = sb.indexOf(strArr[i2], i);
            if (indexOf < 0) {
                return false;
            }
            i = indexOf + strArr[i2].length();
            if (i2 == 0 && i < sb.length() && phoneNumberUtil.mo237194a(phoneNumberUtil.mo237202b(phoneNumber.getCountryCode()), true) != null && Character.isDigit(sb.charAt(i))) {
                return sb.substring(i - strArr[i2].length()).startsWith(phoneNumberUtil.mo237191a(phoneNumber));
            }
        }
        return sb.substring(i).contains(phoneNumber.getExtension());
    }

    C68250i(PhoneNumberUtil phoneNumberUtil, CharSequence charSequence, String str, PhoneNumberUtil.Leniency leniency, long j) {
        if (phoneNumberUtil == null || leniency == null) {
            throw null;
        } else if (j >= 0) {
            this.f171528i = phoneNumberUtil;
            this.f171529j = charSequence == null ? "" : charSequence;
            this.f171530k = str;
            this.f171531l = leniency;
            this.f171532m = j;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
