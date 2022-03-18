package io.michaelrocks.libphonenumber.android;

import android.content.Context;
import io.michaelrocks.libphonenumber.android.C68250i;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.Phonemetadata;
import io.michaelrocks.libphonenumber.android.Phonenumber;
import io.michaelrocks.libphonenumber.android.p3451a.AbstractC68238a;
import io.michaelrocks.libphonenumber.android.p3451a.C68239b;
import io.michaelrocks.libphonenumber.android.p3451a.C68240c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberUtil {

    /* renamed from: a */
    static final Pattern f171456a = Pattern.compile("[+＋]+");

    /* renamed from: b */
    static final Pattern f171457b = Pattern.compile("[\\\\/] *x");

    /* renamed from: c */
    static final Pattern f171458c = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");

    /* renamed from: d */
    static final String f171459d = m264899c("xｘ#＃~～");

    /* renamed from: e */
    static final Pattern f171460e = Pattern.compile("(\\D+)");

    /* renamed from: f */
    private static final Logger f171461f = Logger.getLogger(PhoneNumberUtil.class.getName());

    /* renamed from: g */
    private static final Map<Integer, String> f171462g;

    /* renamed from: h */
    private static final Set<Integer> f171463h;

    /* renamed from: i */
    private static final Set<Integer> f171464i;

    /* renamed from: j */
    private static final Map<Character, Character> f171465j;

    /* renamed from: k */
    private static final Map<Character, Character> f171466k;

    /* renamed from: l */
    private static final Map<Character, Character> f171467l;

    /* renamed from: m */
    private static final Map<Character, Character> f171468m;

    /* renamed from: n */
    private static final Pattern f171469n = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");

    /* renamed from: o */
    private static final String f171470o;

    /* renamed from: p */
    private static final Pattern f171471p = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");

    /* renamed from: q */
    private static final Pattern f171472q = Pattern.compile("(\\p{Nd})");

    /* renamed from: r */
    private static final Pattern f171473r = Pattern.compile("[+＋\\p{Nd}]");

    /* renamed from: s */
    private static final Pattern f171474s = Pattern.compile("(?:.*?[A-Za-z]){3}.*");

    /* renamed from: t */
    private static final String f171475t;

    /* renamed from: u */
    private static final String f171476u;

    /* renamed from: v */
    private static final Pattern f171477v;

    /* renamed from: w */
    private static final Pattern f171478w;

    /* renamed from: x */
    private static final Pattern f171479x = Pattern.compile("(\\$\\d)");

    /* renamed from: y */
    private static final Pattern f171480y = Pattern.compile("\\(?\\$1\\)?");

    /* renamed from: A */
    private final Map<Integer, List<String>> f171481A;

    /* renamed from: B */
    private final AbstractC68238a f171482B = C68239b.m264938a();

    /* renamed from: C */
    private final Set<String> f171483C = new HashSet(35);

    /* renamed from: D */
    private final C68240c f171484D = new C68240c(100);

    /* renamed from: E */
    private final Set<String> f171485E = new HashSet(320);

    /* renamed from: F */
    private final Set<Integer> f171486F = new HashSet();

    /* renamed from: z */
    private final AbstractC68247f f171487z;

    public enum MatchType {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH
    }

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC68247f mo237190a() {
        return this.f171487z;
    }

    /* renamed from: a */
    static StringBuilder m264887a(StringBuilder sb) {
        if (f171474s.matcher(sb).matches()) {
            sb.replace(0, sb.length(), m264882a((CharSequence) sb, f171467l, true));
        } else {
            sb.replace(0, sb.length(), m264898c(sb));
        }
        return sb;
    }

    /* renamed from: a */
    static StringBuilder m264886a(CharSequence charSequence, boolean z) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (z) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    /* renamed from: a */
    private static String m264882a(CharSequence charSequence, Map<Character, Character> map, boolean z) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Character ch = map.get(Character.valueOf(Character.toUpperCase(charAt)));
            if (ch != null) {
                sb.append(ch);
            } else if (!z) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m264893a(Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        return (phoneNumberDesc.getPossibleLengthCount() == 1 && phoneNumberDesc.getPossibleLength(0) == -1) ? false : true;
    }

    /* renamed from: a */
    static boolean m264894a(String str) {
        return str.length() == 0 || f171480y.matcher(str).matches();
    }

    /* renamed from: a */
    public String mo237192a(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat) {
        if (phoneNumber.getNationalNumber() == 0 && phoneNumber.hasRawInput()) {
            String rawInput = phoneNumber.getRawInput();
            if (rawInput.length() > 0) {
                return rawInput;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        mo237195a(phoneNumber, phoneNumberFormat, sb);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo237195a(Phonenumber.PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        sb.setLength(0);
        int countryCode = phoneNumber.getCountryCode();
        String a = mo237191a(phoneNumber);
        if (phoneNumberFormat == PhoneNumberFormat.E164) {
            sb.append(a);
            m264888a(countryCode, PhoneNumberFormat.E164, sb);
        } else if (!m264900c(countryCode)) {
            sb.append(a);
        } else {
            Phonemetadata.PhoneMetadata a2 = m264879a(countryCode, mo237202b(countryCode));
            sb.append(m264884a(a, a2, phoneNumberFormat));
            m264889a(phoneNumber, a2, phoneNumberFormat, sb);
            m264888a(countryCode, phoneNumberFormat, sb);
        }
    }

    /* renamed from: a */
    public String mo237191a(Phonenumber.PhoneNumber phoneNumber) {
        StringBuilder sb = new StringBuilder();
        if (phoneNumber.isItalianLeadingZero() && phoneNumber.getNumberOfLeadingZeros() > 0) {
            char[] cArr = new char[phoneNumber.getNumberOfLeadingZeros()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phoneNumber.getNationalNumber());
        return sb.toString();
    }

    /* renamed from: a */
    private void m264888a(int i, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        int i2 = C682302.f171494b[phoneNumberFormat.ordinal()];
        if (i2 == 1) {
            sb.insert(0, i).insert(0, '+');
        } else if (i2 == 2) {
            sb.insert(0, " ").insert(0, i).insert(0, '+');
        } else if (i2 == 3) {
            sb.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
        }
    }

    /* renamed from: a */
    private String m264885a(String str, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        List<Phonemetadata.NumberFormat> list;
        if (phoneMetadata.intlNumberFormats().size() == 0 || phoneNumberFormat == PhoneNumberFormat.NATIONAL) {
            list = phoneMetadata.numberFormats();
        } else {
            list = phoneMetadata.intlNumberFormats();
        }
        Phonemetadata.NumberFormat a = mo237185a(list, str);
        return a == null ? str : m264883a(str, a, phoneNumberFormat, charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Phonemetadata.NumberFormat mo237185a(List<Phonemetadata.NumberFormat> list, String str) {
        for (Phonemetadata.NumberFormat numberFormat : list) {
            int leadingDigitsPatternSize = numberFormat.leadingDigitsPatternSize();
            if ((leadingDigitsPatternSize == 0 || this.f171484D.mo237416a(numberFormat.getLeadingDigitsPattern(leadingDigitsPatternSize - 1)).matcher(str).lookingAt()) && this.f171484D.mo237416a(numberFormat.getPattern()).matcher(str).matches()) {
                return numberFormat;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo237193a(String str, Phonemetadata.NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat) {
        return m264883a(str, numberFormat, phoneNumberFormat, (CharSequence) null);
    }

    /* renamed from: a */
    private String m264883a(String str, Phonemetadata.NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        String str2;
        String format = numberFormat.getFormat();
        Matcher matcher = this.f171484D.mo237416a(numberFormat.getPattern()).matcher(str);
        if (phoneNumberFormat != PhoneNumberFormat.NATIONAL || charSequence == null || charSequence.length() <= 0 || numberFormat.getDomesticCarrierCodeFormattingRule().length() <= 0) {
            String nationalPrefixFormattingRule = numberFormat.getNationalPrefixFormattingRule();
            if (phoneNumberFormat != PhoneNumberFormat.NATIONAL || nationalPrefixFormattingRule == null || nationalPrefixFormattingRule.length() <= 0) {
                str2 = matcher.replaceAll(format);
            } else {
                str2 = matcher.replaceAll(f171479x.matcher(format).replaceFirst(nationalPrefixFormattingRule));
            }
        } else {
            str2 = matcher.replaceAll(f171479x.matcher(format).replaceFirst(numberFormat.getDomesticCarrierCodeFormattingRule().replace("$CC", charSequence)));
        }
        if (phoneNumberFormat != PhoneNumberFormat.RFC3966) {
            return str2;
        }
        Matcher matcher2 = f171471p.matcher(str2);
        if (matcher2.lookingAt()) {
            str2 = matcher2.replaceFirst("");
        }
        return matcher2.reset(str2).replaceAll("-");
    }

    /* renamed from: a */
    private void m264889a(Phonenumber.PhoneNumber phoneNumber, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, StringBuilder sb) {
        if (phoneNumber.hasExtension() && phoneNumber.getExtension().length() > 0) {
            if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
                sb.append(";ext=");
                sb.append(phoneNumber.getExtension());
            } else if (phoneMetadata.hasPreferredExtnPrefix()) {
                sb.append(phoneMetadata.getPreferredExtnPrefix());
                sb.append(phoneNumber.getExtension());
            } else {
                sb.append(" ext. ");
                sb.append(phoneNumber.getExtension());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Phonemetadata.PhoneNumberDesc mo237187a(Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        switch (C682302.f171495c[phoneNumberType.ordinal()]) {
            case 1:
                return phoneMetadata.getPremiumRate();
            case 2:
                return phoneMetadata.getTollFree();
            case 3:
                return phoneMetadata.getMobile();
            case 4:
            case 5:
                return phoneMetadata.getFixedLine();
            case 6:
                return phoneMetadata.getSharedCost();
            case 7:
                return phoneMetadata.getVoip();
            case 8:
                return phoneMetadata.getPersonalNumber();
            case 9:
                return phoneMetadata.getPager();
            case 10:
                return phoneMetadata.getUan();
            case 11:
                return phoneMetadata.getVoicemail();
            default:
                return phoneMetadata.getGeneralDesc();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Phonemetadata.PhoneMetadata mo237186a(int i) {
        if (!this.f171481A.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return this.f171487z.mo237423a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo237198a(String str, Phonemetadata.PhoneNumberDesc phoneNumberDesc) {
        int length = str.length();
        List<Integer> possibleLengthList = phoneNumberDesc.getPossibleLengthList();
        if (possibleLengthList.size() <= 0 || possibleLengthList.contains(Integer.valueOf(length))) {
            return this.f171482B.mo237415a(str, phoneNumberDesc, false);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo237197a(Phonenumber.PhoneNumber phoneNumber, String str) {
        int countryCode = phoneNumber.getCountryCode();
        Phonemetadata.PhoneMetadata a = m264879a(countryCode, str);
        if (a == null) {
            return false;
        }
        if (("001".equals(str) || countryCode == m264903e(str)) && m264873a(mo237191a(phoneNumber), a) != PhoneNumberType.UNKNOWN) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private String m264881a(Phonenumber.PhoneNumber phoneNumber, List<String> list) {
        String a = mo237191a(phoneNumber);
        for (String str : list) {
            Phonemetadata.PhoneMetadata b = mo237200b(str);
            if (b.hasLeadingDigits()) {
                if (this.f171484D.mo237416a(b.getLeadingDigits()).matcher(a).lookingAt()) {
                    return str;
                }
            } else if (m264873a(a, b) != PhoneNumberType.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo237194a(String str, boolean z) {
        Phonemetadata.PhoneMetadata b = mo237200b(str);
        if (b == null) {
            Logger logger = f171461f;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(") provided.");
            logger.log(level, sb.toString());
            return null;
        }
        String nationalPrefix = b.getNationalPrefix();
        if (nationalPrefix.length() == 0) {
            return null;
        }
        return z ? nationalPrefix.replace("~", "") : nationalPrefix;
    }

    /* renamed from: a */
    public ValidationResult mo237184a(Phonenumber.PhoneNumber phoneNumber, PhoneNumberType phoneNumberType) {
        String a = mo237191a(phoneNumber);
        int countryCode = phoneNumber.getCountryCode();
        if (!m264900c(countryCode)) {
            return ValidationResult.INVALID_COUNTRY_CODE;
        }
        return m264875a(a, m264879a(countryCode, mo237202b(countryCode)), phoneNumberType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo237181a(StringBuilder sb, StringBuilder sb2) {
        if (!(sb.length() == 0 || sb.charAt(0) == '0')) {
            int length = sb.length();
            int i = 1;
            while (i <= 3 && i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (this.f171481A.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
                i++;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo237180a(CharSequence charSequence, Phonemetadata.PhoneMetadata phoneMetadata, StringBuilder sb, boolean z, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        Phonenumber.PhoneNumber.CountryCodeSource a = mo237188a(sb2, phoneMetadata != null ? phoneMetadata.getInternationalPrefix() : "NonMatch");
        if (z) {
            phoneNumber.setCountryCodeSource(a);
        }
        if (a == Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (phoneMetadata != null) {
                int countryCode = phoneMetadata.getCountryCode();
                String valueOf = String.valueOf(countryCode);
                String sb3 = sb2.toString();
                if (sb3.startsWith(valueOf)) {
                    StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                    Phonemetadata.PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
                    mo237199a(sb4, phoneMetadata, (StringBuilder) null);
                    if ((!this.f171482B.mo237415a(sb2, generalDesc, false) && this.f171482B.mo237415a(sb4, generalDesc, false)) || m264874a(sb2, phoneMetadata) == ValidationResult.TOO_LONG) {
                        sb.append((CharSequence) sb4);
                        if (z) {
                            phoneNumber.setCountryCodeSource(Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                        phoneNumber.setCountryCode(countryCode);
                        return countryCode;
                    }
                }
            }
            phoneNumber.setCountryCode(0);
            return 0;
        } else if (sb2.length() > 2) {
            int a2 = mo237181a(sb2, sb);
            if (a2 != 0) {
                phoneNumber.setCountryCode(a2);
                return a2;
            }
            throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        } else {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
    }

    /* renamed from: a */
    private boolean m264895a(Pattern pattern, StringBuilder sb) {
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        Matcher matcher2 = f171472q.matcher(sb.substring(end));
        if (matcher2.find() && m264898c((CharSequence) matcher2.group(1)).equals("0")) {
            return false;
        }
        sb.delete(0, end);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Phonenumber.PhoneNumber.CountryCodeSource mo237188a(StringBuilder sb, String str) {
        if (sb.length() == 0) {
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = f171456a.matcher(sb);
        if (matcher.lookingAt()) {
            sb.delete(0, matcher.end());
            m264887a(sb);
            return Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern a = this.f171484D.mo237416a(str);
        m264887a(sb);
        return m264895a(a, sb) ? Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD : Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo237199a(StringBuilder sb, Phonemetadata.PhoneMetadata phoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String nationalPrefixForParsing = phoneMetadata.getNationalPrefixForParsing();
        if (!(length == 0 || nationalPrefixForParsing.length() == 0)) {
            Matcher matcher = this.f171484D.mo237416a(nationalPrefixForParsing).matcher(sb);
            if (matcher.lookingAt()) {
                Phonemetadata.PhoneNumberDesc generalDesc = phoneMetadata.getGeneralDesc();
                boolean a = this.f171482B.mo237415a(sb, generalDesc, false);
                int groupCount = matcher.groupCount();
                String nationalPrefixTransformRule = phoneMetadata.getNationalPrefixTransformRule();
                if (nationalPrefixTransformRule != null && nationalPrefixTransformRule.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(nationalPrefixTransformRule));
                    if (a && !this.f171482B.mo237415a(sb3.toString(), generalDesc, false)) {
                        return false;
                    }
                    if (sb2 != null && groupCount > 1) {
                        sb2.append(matcher.group(1));
                    }
                    sb.replace(0, sb.length(), sb3.toString());
                    return true;
                } else if (a && !this.f171482B.mo237415a(sb.substring(matcher.end()), generalDesc, false)) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public Phonenumber.PhoneNumber mo237189a(CharSequence charSequence, String str) throws NumberParseException {
        Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
        mo237196a(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    /* renamed from: a */
    public void mo237196a(CharSequence charSequence, String str, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        m264891a(charSequence, str, false, true, phoneNumber);
    }

    /* renamed from: a */
    static void m264890a(CharSequence charSequence, Phonenumber.PhoneNumber phoneNumber) {
        if (charSequence.length() > 1 && charSequence.charAt(0) == '0') {
            phoneNumber.setItalianLeadingZero(true);
            int i = 1;
            while (i < charSequence.length() - 1 && charSequence.charAt(i) == '0') {
                i++;
            }
            if (i != 1) {
                phoneNumber.setNumberOfLeadingZeros(i);
            }
        }
    }

    /* renamed from: a */
    private void m264891a(CharSequence charSequence, String str, boolean z, boolean z2, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        int i;
        if (charSequence == null) {
            throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (charSequence.length() <= 250) {
            StringBuilder sb = new StringBuilder();
            String charSequence2 = charSequence.toString();
            m264892a(charSequence2, sb);
            if (!m264897b((CharSequence) sb)) {
                throw new NumberParseException(NumberParseException.ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            } else if (!z2 || m264901c(sb, str)) {
                if (z) {
                    phoneNumber.setRawInput(charSequence2);
                }
                String b = mo237203b(sb);
                if (b.length() > 0) {
                    phoneNumber.setExtension(b);
                }
                Phonemetadata.PhoneMetadata b2 = mo237200b(str);
                StringBuilder sb2 = new StringBuilder();
                try {
                    i = mo237180a(sb, b2, sb2, z, phoneNumber);
                } catch (NumberParseException e) {
                    Matcher matcher = f171456a.matcher(sb);
                    if (e.getErrorType() != NumberParseException.ErrorType.INVALID_COUNTRY_CODE || !matcher.lookingAt()) {
                        throw new NumberParseException(e.getErrorType(), e.getMessage());
                    }
                    i = mo237180a(sb.substring(matcher.end()), b2, sb2, z, phoneNumber);
                    if (i == 0) {
                        throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                    }
                }
                if (i != 0) {
                    String b3 = mo237202b(i);
                    if (!b3.equals(str)) {
                        b2 = m264879a(i, b3);
                    }
                } else {
                    sb2.append(m264887a(sb));
                    if (str != null) {
                        phoneNumber.setCountryCode(b2.getCountryCode());
                    } else if (z) {
                        phoneNumber.clearCountryCodeSource();
                    }
                }
                if (sb2.length() >= 2) {
                    if (b2 != null) {
                        StringBuilder sb3 = new StringBuilder();
                        StringBuilder sb4 = new StringBuilder(sb2);
                        mo237199a(sb4, b2, sb3);
                        ValidationResult a = m264874a(sb4, b2);
                        if (!(a == ValidationResult.TOO_SHORT || a == ValidationResult.IS_POSSIBLE_LOCAL_ONLY || a == ValidationResult.INVALID_LENGTH)) {
                            if (z && sb3.length() > 0) {
                                phoneNumber.setPreferredDomesticCarrierCode(sb3.toString());
                            }
                            sb2 = sb4;
                        }
                    }
                    int length = sb2.length();
                    if (length < 2) {
                        throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                    } else if (length <= 17) {
                        m264890a(sb2, phoneNumber);
                        phoneNumber.setNationalNumber(Long.parseLong(sb2.toString()));
                    } else {
                        throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
                    }
                } else {
                    throw new NumberParseException(NumberParseException.ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                }
            } else {
                throw new NumberParseException(NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
            }
        } else {
            throw new NumberParseException(NumberParseException.ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
    }

    /* renamed from: a */
    private void m264892a(String str, StringBuilder sb) {
        int indexOf = str.indexOf(";phone-context=");
        if (indexOf >= 0) {
            int i = indexOf + 15;
            if (i < str.length() - 1 && str.charAt(i) == '+') {
                int indexOf2 = str.indexOf(59, i);
                if (indexOf2 > 0) {
                    sb.append(str.substring(i, indexOf2));
                } else {
                    sb.append(str.substring(i));
                }
            }
            int indexOf3 = str.indexOf("tel:");
            sb.append(str.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
        } else {
            sb.append(m264880a((CharSequence) str));
        }
        int indexOf4 = sb.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb.delete(indexOf4, sb.length());
        }
    }

    /* renamed from: a */
    public MatchType mo237182a(Phonenumber.PhoneNumber phoneNumber, Phonenumber.PhoneNumber phoneNumber2) {
        Phonenumber.PhoneNumber f = m264904f(phoneNumber);
        Phonenumber.PhoneNumber f2 = m264904f(phoneNumber2);
        if (f.hasExtension() && f2.hasExtension() && !f.getExtension().equals(f2.getExtension())) {
            return MatchType.NO_MATCH;
        }
        int countryCode = f.getCountryCode();
        int countryCode2 = f2.getCountryCode();
        if (countryCode == 0 || countryCode2 == 0) {
            f.setCountryCode(countryCode2);
            if (f.exactlySameAs(f2)) {
                return MatchType.NSN_MATCH;
            }
            if (m264896b(f, f2)) {
                return MatchType.SHORT_NSN_MATCH;
            }
            return MatchType.NO_MATCH;
        } else if (f.exactlySameAs(f2)) {
            return MatchType.EXACT_MATCH;
        } else {
            if (countryCode != countryCode2 || !m264896b(f, f2)) {
                return MatchType.NO_MATCH;
            }
            return MatchType.SHORT_NSN_MATCH;
        }
    }

    /* renamed from: a */
    public MatchType mo237183a(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence) {
        try {
            return mo237182a(phoneNumber, mo237189a(charSequence, "ZZ"));
        } catch (NumberParseException e) {
            if (e.getErrorType() == NumberParseException.ErrorType.INVALID_COUNTRY_CODE) {
                String b = mo237202b(phoneNumber.getCountryCode());
                try {
                    if (!b.equals("ZZ")) {
                        MatchType a = mo237182a(phoneNumber, mo237189a(charSequence, b));
                        return a == MatchType.EXACT_MATCH ? MatchType.NSN_MATCH : a;
                    }
                    Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
                    m264891a(charSequence, (String) null, false, false, phoneNumber2);
                    return mo237182a(phoneNumber, phoneNumber2);
                } catch (NumberParseException unused) {
                    return MatchType.NOT_A_NUMBER;
                }
            }
            return MatchType.NOT_A_NUMBER;
        }
    }

    /* renamed from: io.michaelrocks.libphonenumber.android.PhoneNumberUtil$1 */
    class C682291 implements Iterable<C68249h> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f171488a;

        /* renamed from: b */
        final /* synthetic */ String f171489b;

        /* renamed from: c */
        final /* synthetic */ Leniency f171490c;

        /* renamed from: d */
        final /* synthetic */ long f171491d;

        /* renamed from: e */
        final /* synthetic */ PhoneNumberUtil f171492e;

        @Override // java.lang.Iterable
        public Iterator<C68249h> iterator() {
            return new C68250i(this.f171492e, this.f171488a, this.f171489b, this.f171490c, this.f171491d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: io.michaelrocks.libphonenumber.android.PhoneNumberUtil$2 */
    public static /* synthetic */ class C682302 {

        /* renamed from: a */
        static final /* synthetic */ int[] f171493a;

        /* renamed from: b */
        static final /* synthetic */ int[] f171494b;

        /* renamed from: c */
        static final /* synthetic */ int[] f171495c;

        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(3:47|48|50)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|(3:47|48|50)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d8 */
        static {
            /*
            // Method dump skipped, instructions count: 227
            */
            throw new UnsupportedOperationException("Method not decompiled: io.michaelrocks.libphonenumber.android.PhoneNumberUtil.C682302.<clinit>():void");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(52, "1");
        hashMap.put(54, "9");
        f171462g = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        f171463h = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        f171464i = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        f171466k = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        f171467l = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        f171465j = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            char charValue = ch.charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue)), Character.valueOf(charValue));
            hashMap6.put(Character.valueOf(charValue), Character.valueOf(charValue));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        f171468m = Collections.unmodifiableMap(hashMap6);
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = f171466k;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        f171470o = sb2;
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*" + sb2 + "\\p{Nd}" + "]*";
        f171475t = str;
        String c = m264899c(",;" + "xｘ#＃~～");
        f171476u = c;
        f171477v = Pattern.compile("(?:" + c + ")$", 66);
        f171478w = Pattern.compile(str + "(?:" + c + ")?", 66);
    }

    /* renamed from: e */
    public ValidationResult mo237208e(Phonenumber.PhoneNumber phoneNumber) {
        return mo237184a(phoneNumber, PhoneNumberType.UNKNOWN);
    }

    /* renamed from: c */
    public static String m264898c(CharSequence charSequence) {
        return m264886a(charSequence, false).toString();
    }

    /* renamed from: d */
    private boolean m264902d(String str) {
        if (str == null || !this.f171485E.contains(str)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Phonemetadata.PhoneMetadata mo237200b(String str) {
        if (!m264902d(str)) {
            return null;
        }
        return this.f171487z.mo237424a(str);
    }

    /* renamed from: a */
    public static PhoneNumberUtil m264876a(Context context) {
        if (context != null) {
            return m264877a(new C68243b(context.getAssets()));
        }
        throw new IllegalArgumentException("context could not be null.");
    }

    /* renamed from: b */
    static boolean m264897b(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return f171478w.matcher(charSequence).matches();
    }

    /* renamed from: c */
    private boolean m264900c(int i) {
        return this.f171481A.containsKey(Integer.valueOf(i));
    }

    /* renamed from: d */
    public boolean mo237207d(Phonenumber.PhoneNumber phoneNumber) {
        ValidationResult e = mo237208e(phoneNumber);
        if (e == ValidationResult.IS_POSSIBLE || e == ValidationResult.IS_POSSIBLE_LOCAL_ONLY) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static PhoneNumberUtil m264877a(AbstractC68245d dVar) {
        if (dVar != null) {
            return m264878a(new C68248g(dVar));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    /* renamed from: c */
    private static String m264899c(String str) {
        return ";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[" + str + "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*" + "(\\p{Nd}{1,7})" + "#?|[- ]+(" + "\\p{Nd}" + "{1,5})#";
    }

    /* renamed from: e */
    private int m264903e(String str) {
        Phonemetadata.PhoneMetadata b = mo237200b(str);
        if (b != null) {
            return b.getCountryCode();
        }
        throw new IllegalArgumentException("Invalid region code: " + str);
    }

    /* renamed from: f */
    private static Phonenumber.PhoneNumber m264904f(Phonenumber.PhoneNumber phoneNumber) {
        Phonenumber.PhoneNumber phoneNumber2 = new Phonenumber.PhoneNumber();
        phoneNumber2.setCountryCode(phoneNumber.getCountryCode());
        phoneNumber2.setNationalNumber(phoneNumber.getNationalNumber());
        if (phoneNumber.getExtension().length() > 0) {
            phoneNumber2.setExtension(phoneNumber.getExtension());
        }
        if (phoneNumber.isItalianLeadingZero()) {
            phoneNumber2.setItalianLeadingZero(true);
            phoneNumber2.setNumberOfLeadingZeros(phoneNumber.getNumberOfLeadingZeros());
        }
        return phoneNumber2;
    }

    /* renamed from: a */
    public static PhoneNumberUtil m264878a(AbstractC68247f fVar) {
        if (fVar != null) {
            return new PhoneNumberUtil(fVar, C68244c.m264945a());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    /* renamed from: b */
    public String mo237202b(int i) {
        List<String> list = this.f171481A.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return list.get(0);
    }

    /* renamed from: c */
    public String mo237206c(Phonenumber.PhoneNumber phoneNumber) {
        int countryCode = phoneNumber.getCountryCode();
        List<String> list = this.f171481A.get(Integer.valueOf(countryCode));
        if (list == null) {
            Logger logger = f171461f;
            Level level = Level.INFO;
            logger.log(level, "Missing/invalid country_code (" + countryCode + ")");
            return null;
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return m264881a(phoneNumber, list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo237203b(StringBuilder sb) {
        Matcher matcher = f171477v.matcher(sb);
        if (!matcher.find() || !m264897b((CharSequence) sb.substring(0, matcher.start()))) {
            return "";
        }
        int groupCount = matcher.groupCount();
        for (int i = 1; i <= groupCount; i++) {
            if (matcher.group(i) != null) {
                String group = matcher.group(i);
                sb.delete(matcher.start(), sb.length());
                return group;
            }
        }
        return "";
    }

    /* renamed from: a */
    static CharSequence m264880a(CharSequence charSequence) {
        Matcher matcher = f171473r.matcher(charSequence);
        if (!matcher.find()) {
            return "";
        }
        CharSequence subSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        Matcher matcher2 = f171458c.matcher(subSequence);
        if (matcher2.find()) {
            subSequence = subSequence.subSequence(0, matcher2.start());
        }
        Matcher matcher3 = f171457b.matcher(subSequence);
        if (matcher3.find()) {
            return subSequence.subSequence(0, matcher3.start());
        }
        return subSequence;
    }

    /* renamed from: b */
    public boolean mo237205b(Phonenumber.PhoneNumber phoneNumber) {
        return mo237197a(phoneNumber, mo237206c(phoneNumber));
    }

    /* renamed from: a */
    private ValidationResult m264874a(CharSequence charSequence, Phonemetadata.PhoneMetadata phoneMetadata) {
        return m264875a(charSequence, phoneMetadata, PhoneNumberType.UNKNOWN);
    }

    /* renamed from: b */
    private boolean m264896b(Phonenumber.PhoneNumber phoneNumber, Phonenumber.PhoneNumber phoneNumber2) {
        String valueOf = String.valueOf(phoneNumber.getNationalNumber());
        String valueOf2 = String.valueOf(phoneNumber2.getNationalNumber());
        if (valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m264901c(CharSequence charSequence, String str) {
        if (m264902d(str)) {
            return true;
        }
        if (charSequence == null || charSequence.length() == 0 || !f171456a.matcher(charSequence).lookingAt()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Phonenumber.PhoneNumber mo237201b(CharSequence charSequence, String str) throws NumberParseException {
        Phonenumber.PhoneNumber phoneNumber = new Phonenumber.PhoneNumber();
        mo237204b(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    PhoneNumberUtil(AbstractC68247f fVar, Map<Integer, List<String>> map) {
        this.f171487z = fVar;
        this.f171481A = map;
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            if (value.size() != 1 || !"001".equals(value.get(0))) {
                this.f171485E.addAll(value);
            } else {
                this.f171486F.add(entry.getKey());
            }
        }
        if (this.f171485E.remove("001")) {
            f171461f.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f171483C.addAll(map.get(1));
    }

    /* renamed from: a */
    private PhoneNumberType m264873a(String str, Phonemetadata.PhoneMetadata phoneMetadata) {
        if (!mo237198a(str, phoneMetadata.getGeneralDesc())) {
            return PhoneNumberType.UNKNOWN;
        }
        if (mo237198a(str, phoneMetadata.getPremiumRate())) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (mo237198a(str, phoneMetadata.getTollFree())) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (mo237198a(str, phoneMetadata.getSharedCost())) {
            return PhoneNumberType.SHARED_COST;
        }
        if (mo237198a(str, phoneMetadata.getVoip())) {
            return PhoneNumberType.VOIP;
        }
        if (mo237198a(str, phoneMetadata.getPersonalNumber())) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (mo237198a(str, phoneMetadata.getPager())) {
            return PhoneNumberType.PAGER;
        }
        if (mo237198a(str, phoneMetadata.getUan())) {
            return PhoneNumberType.UAN;
        }
        if (mo237198a(str, phoneMetadata.getVoicemail())) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (mo237198a(str, phoneMetadata.getFixedLine())) {
            if (phoneMetadata.getSameMobileAndFixedLinePattern()) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (mo237198a(str, phoneMetadata.getMobile())) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            return PhoneNumberType.FIXED_LINE;
        } else if (phoneMetadata.getSameMobileAndFixedLinePattern() || !mo237198a(str, phoneMetadata.getMobile())) {
            return PhoneNumberType.UNKNOWN;
        } else {
            return PhoneNumberType.MOBILE;
        }
    }

    /* renamed from: a */
    private Phonemetadata.PhoneMetadata m264879a(int i, String str) {
        if ("001".equals(str)) {
            return mo237186a(i);
        }
        return mo237200b(str);
    }

    public enum Leniency {
        POSSIBLE {
            /* access modifiers changed from: package-private */
            @Override // io.michaelrocks.libphonenumber.android.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, C68250i iVar) {
                return phoneNumberUtil.mo237207d(phoneNumber);
            }
        },
        VALID {
            /* access modifiers changed from: package-private */
            @Override // io.michaelrocks.libphonenumber.android.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, C68250i iVar) {
                if (!phoneNumberUtil.mo237205b(phoneNumber) || !C68250i.m264968a(phoneNumber, charSequence.toString(), phoneNumberUtil)) {
                    return false;
                }
                return C68250i.m264966a(phoneNumber, phoneNumberUtil);
            }
        },
        STRICT_GROUPING {
            /* access modifiers changed from: package-private */
            @Override // io.michaelrocks.libphonenumber.android.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, C68250i iVar) {
                String charSequence2 = charSequence.toString();
                if (!phoneNumberUtil.mo237205b(phoneNumber) || !C68250i.m264968a(phoneNumber, charSequence2, phoneNumberUtil) || C68250i.m264967a(phoneNumber, charSequence2) || !C68250i.m264966a(phoneNumber, phoneNumberUtil)) {
                    return false;
                }
                return iVar.mo237432a(phoneNumber, charSequence, phoneNumberUtil, new C68250i.AbstractC68251a() {
                    /* class io.michaelrocks.libphonenumber.android.PhoneNumberUtil.Leniency.C682333.C682341 */

                    @Override // io.michaelrocks.libphonenumber.android.C68250i.AbstractC68251a
                    /* renamed from: a */
                    public boolean mo237211a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
                        return C68250i.m264965a(phoneNumberUtil, phoneNumber, sb, strArr);
                    }
                });
            }
        },
        EXACT_GROUPING {
            /* access modifiers changed from: package-private */
            @Override // io.michaelrocks.libphonenumber.android.PhoneNumberUtil.Leniency
            public boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, C68250i iVar) {
                String charSequence2 = charSequence.toString();
                if (!phoneNumberUtil.mo237205b(phoneNumber) || !C68250i.m264968a(phoneNumber, charSequence2, phoneNumberUtil) || C68250i.m264967a(phoneNumber, charSequence2) || !C68250i.m264966a(phoneNumber, phoneNumberUtil)) {
                    return false;
                }
                return iVar.mo237432a(phoneNumber, charSequence, phoneNumberUtil, new C68250i.AbstractC68251a() {
                    /* class io.michaelrocks.libphonenumber.android.PhoneNumberUtil.Leniency.C682354.C682361 */

                    @Override // io.michaelrocks.libphonenumber.android.C68250i.AbstractC68251a
                    /* renamed from: a */
                    public boolean mo237211a(PhoneNumberUtil phoneNumberUtil, Phonenumber.PhoneNumber phoneNumber, StringBuilder sb, String[] strArr) {
                        return C68250i.m264973b(phoneNumberUtil, phoneNumber, sb, strArr);
                    }
                });
            }
        };

        /* access modifiers changed from: package-private */
        public abstract boolean verify(Phonenumber.PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil, C68250i iVar);

        /* synthetic */ Leniency(C682291 r3) {
            this();
        }
    }

    /* renamed from: a */
    private String m264884a(String str, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat) {
        return m264885a(str, phoneMetadata, phoneNumberFormat, (CharSequence) null);
    }

    /* renamed from: a */
    private ValidationResult m264875a(CharSequence charSequence, Phonemetadata.PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        ArrayList arrayList;
        List<Integer> list;
        Phonemetadata.PhoneNumberDesc a = mo237187a(phoneMetadata, phoneNumberType);
        if (a.getPossibleLengthList().isEmpty()) {
            arrayList = phoneMetadata.getGeneralDesc().getPossibleLengthList();
        } else {
            arrayList = a.getPossibleLengthList();
        }
        List<Integer> possibleLengthLocalOnlyList = a.getPossibleLengthLocalOnlyList();
        if (phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            if (!m264893a(mo237187a(phoneMetadata, PhoneNumberType.FIXED_LINE))) {
                return m264875a(charSequence, phoneMetadata, PhoneNumberType.MOBILE);
            }
            Phonemetadata.PhoneNumberDesc a2 = mo237187a(phoneMetadata, PhoneNumberType.MOBILE);
            if (m264893a(a2)) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (a2.getPossibleLengthList().size() == 0) {
                    list = phoneMetadata.getGeneralDesc().getPossibleLengthList();
                } else {
                    list = a2.getPossibleLengthList();
                }
                arrayList2.addAll(list);
                Collections.sort(arrayList2);
                if (possibleLengthLocalOnlyList.isEmpty()) {
                    possibleLengthLocalOnlyList = a2.getPossibleLengthLocalOnlyList();
                } else {
                    ArrayList arrayList3 = new ArrayList(possibleLengthLocalOnlyList);
                    arrayList3.addAll(a2.getPossibleLengthLocalOnlyList());
                    Collections.sort(arrayList3);
                    possibleLengthLocalOnlyList = arrayList3;
                }
                arrayList = arrayList2;
            }
        }
        if (arrayList.get(0).intValue() == -1) {
            return ValidationResult.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (possibleLengthLocalOnlyList.contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = arrayList.get(0).intValue();
        if (intValue == length) {
            return ValidationResult.IS_POSSIBLE;
        }
        if (intValue > length) {
            return ValidationResult.TOO_SHORT;
        }
        if (arrayList.get(arrayList.size() - 1).intValue() < length) {
            return ValidationResult.TOO_LONG;
        }
        if (arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length))) {
            return ValidationResult.IS_POSSIBLE;
        }
        return ValidationResult.INVALID_LENGTH;
    }

    /* renamed from: b */
    public void mo237204b(CharSequence charSequence, String str, Phonenumber.PhoneNumber phoneNumber) throws NumberParseException {
        m264891a(charSequence, str, true, true, phoneNumber);
    }
}
