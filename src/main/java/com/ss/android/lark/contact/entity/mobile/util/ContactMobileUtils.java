package com.ss.android.lark.contact.entity.mobile.util;

import android.app.Activity;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40140u;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.utils.aj;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ContactMobileUtils {

    /* renamed from: a */
    private static PhoneNumberUtil f91487a;

    /* renamed from: b */
    private static final HashMap<Character, Character> f91488b = new HashMap<>();

    /* renamed from: c */
    private static final char[] f91489c;

    /* renamed from: d */
    private static final int[] f91490d;

    /* renamed from: e */
    private static int f91491e = 45217;

    /* renamed from: f */
    private static int f91492f = 63486;

    /* renamed from: g */
    private static char[] f91493g = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'W', 'X', 'Y', 'Z'};

    @Retention(RetentionPolicy.SOURCE)
    public @interface ContactType {
    }

    /* renamed from: a */
    public static boolean m138439a(Activity activity, String str, int i) {
        if (ContextCompat.checkSelfPermission(activity, str) == 0) {
            return true;
        }
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
            ActivityCompat.requestPermissions(activity, new String[]{str}, i);
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{str}, i);
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static List<ContactMobileBean> m138438a(int i, boolean z) {
        int i2;
        String str;
        int i3;
        HashSet hashSet;
        int i4;
        boolean z2;
        String str2;
        Pair<Integer, String> pair;
        ContactMobileBean contactMobileBean;
        String str3 = " ";
        ArrayList arrayList = new ArrayList();
        Cursor query = aj.m224263a().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "display_name", "mimetype"}, null, null, null);
        if (query == null) {
            return arrayList;
        }
        InvApmUtils.m158958a("contact_opt_local_fetch_timing_ms");
        HashSet hashSet2 = new HashSet();
        try {
            int columnIndex = query.getColumnIndex("contact_id");
            int columnIndex2 = query.getColumnIndex("data1");
            int columnIndex3 = query.getColumnIndex("display_name");
            int columnIndex4 = query.getColumnIndex("mimetype");
            String str4 = "";
            String str5 = str4;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            Pair<Integer, String> pair2 = null;
            while (query.moveToNext()) {
                int i9 = query.getInt(columnIndex);
                String string = query.getString(columnIndex4);
                String string2 = query.getString(columnIndex2);
                if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string2.replace(str3, ""))) {
                    str = str3;
                    i3 = columnIndex;
                } else {
                    i3 = columnIndex;
                    String replace = string2.replace(str3, "");
                    if (hashSet2.contains(replace)) {
                        str = str3;
                    } else {
                        str = str3;
                        if ("vnd.android.cursor.item/email_v2".equals(string)) {
                            i5++;
                            if ((i & 1) == 1 && m138441b(replace)) {
                                i6++;
                                hashSet2.add(replace);
                                str2 = replace;
                                replace = str4;
                                pair = pair2;
                                z2 = true;
                            }
                            columnIndex = i3;
                            str3 = str;
                        } else if ("vnd.android.cursor.item/phone_v2".equals(string)) {
                            i7++;
                            if ((i & 2) == 2) {
                                pair2 = m138433a(z ? 1 : 86, string2);
                                if (pair2 != null && m138440a(pair2)) {
                                    i8++;
                                    hashSet2.add(replace);
                                    pair = pair2;
                                    str2 = str5;
                                    z2 = false;
                                }
                            }
                            columnIndex = i3;
                            str3 = str;
                        }
                        String string3 = query.getString(columnIndex3);
                        hashSet = hashSet2;
                        if (!TextUtils.isEmpty(string3)) {
                            string2 = string3;
                        }
                        String a = m138435a(i9);
                        if (z2) {
                            i4 = columnIndex2;
                            contactMobileBean = new ContactMobileBean(string2, a, str2);
                        } else {
                            i4 = columnIndex2;
                            contactMobileBean = new ContactMobileBean(string2, a, replace, pair);
                        }
                        arrayList.add(contactMobileBean);
                        pair2 = pair;
                        str4 = replace;
                        str5 = str2;
                        columnIndex2 = i4;
                        hashSet2 = hashSet;
                        columnIndex = i3;
                        str3 = str;
                    }
                }
                hashSet = hashSet2;
                i4 = columnIndex2;
                columnIndex2 = i4;
                hashSet2 = hashSet;
                columnIndex = i3;
                str3 = str;
            }
            query.close();
            if ((i & 1) == 1) {
                InvApmUtils.m158964a("contact_opt_cp_email_count", (Map<String, ? extends Object>) null, C40108g.m159014a(Pair.create("count", Integer.valueOf(i5))));
                InvApmUtils.m158964a("contact_opt_cp_available_email_count", (Map<String, ? extends Object>) null, C40108g.m159014a(Pair.create("count", Integer.valueOf(i6))));
            }
            if ((i & 2) == 2) {
                i2 = 1;
                InvApmUtils.m158964a("contact_opt_cp_phone_count", (Map<String, ? extends Object>) null, C40108g.m159014a(Pair.create("count", Integer.valueOf(i7))));
                InvApmUtils.m158964a("contact_opt_cp_available_phone_count", (Map<String, ? extends Object>) null, C40108g.m159014a(Pair.create("count", Integer.valueOf(i8))));
            } else {
                i2 = 1;
            }
            if (i == 3) {
                Pair[] pairArr = new Pair[i2];
                pairArr[0] = Pair.create("count", Integer.valueOf(i5 + i7));
                InvApmUtils.m158964a("contact_opt_cp_total_count", (Map<String, ? extends Object>) null, C40108g.m159014a(pairArr));
                Pair[] pairArr2 = new Pair[i2];
                pairArr2[0] = Pair.create("count", Integer.valueOf(i6 + i8));
                InvApmUtils.m158964a("contact_opt_cp_available_total_count", (Map<String, ? extends Object>) null, C40108g.m159014a(pairArr2));
            }
            Collections.sort(arrayList, $$Lambda$XzJlU6E61exNJNWolt1mDvbBk.INSTANCE);
            InvApmUtils.m158967a("contact_opt_local_fetch_timing_ms", true);
            return arrayList;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m138440a(Pair<Integer, String> pair) {
        if (pair == null) {
            return false;
        }
        if (((Integer) pair.first).intValue() == 86) {
            return C40140u.m159142c((CharSequence) pair.second);
        }
        return C40140u.m159140b((CharSequence) pair.second);
    }

    /* renamed from: a */
    public static String m138437a(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return "" + c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(m138429a(str.charAt(i), c));
        }
        return sb.toString();
    }

    static {
        char[] cArr = {21834, 33453, 25830, 25645, 34558, 21457, 22134, 21704, 20987, 21888, 22403, 22920, 25343, 21734, 21866, 26399, 28982, 25746, 22604, 25366, 26132, 21387, 21277};
        f91489c = cArr;
        f91490d = new int[(cArr.length + 1)];
        int i = 0;
        while (true) {
            char[] cArr2 = f91489c;
            if (i < cArr2.length) {
                f91490d[i] = m138430a(cArr2[i]);
                i++;
            } else {
                f91490d[cArr2.length] = f91492f;
                f91488b.put((char) 36911, 'L');
                return;
            }
        }
    }

    /* renamed from: a */
    public static PhoneNumberUtil m138434a() {
        if (f91487a == null) {
            f91487a = PhoneNumberUtil.m264876a(aj.m224263a());
        }
        return f91487a;
    }

    /* renamed from: b */
    public static boolean m138441b(String str) {
        return C40140u.m159138a((CharSequence) str);
    }

    /* renamed from: c */
    public static String m138442c(String str) {
        return m138437a(str, '#');
    }

    /* renamed from: a */
    private static int m138430a(char c) {
        try {
            byte[] bytes = ("" + c).getBytes("GB2312");
            if (bytes.length < 2) {
                return 0;
            }
            return ((bytes[0] << 8) & 65280) + (bytes[1] & 255);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static String m138435a(int i) {
        Uri withAppendedId = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, (long) i);
        if (withAppendedId != null) {
            return Uri.withAppendedPath(withAppendedId, "photo").toString();
        }
        return null;
    }

    /* renamed from: a */
    public static String m138436a(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static int m138431a(int i, int[] iArr) {
        return m138432a(i, iArr, 0, iArr.length - 1);
    }

    /* renamed from: a */
    private static char m138429a(char c, char c2) {
        Character ch = f91488b.get(Character.valueOf(c));
        if (ch != null) {
            return ch.charValue();
        }
        if (c >= 'a' && c <= 'z') {
            return (char) ((c - 'a') + 65);
        }
        if (c >= 'A' && c <= 'Z') {
            return c;
        }
        int a = m138430a(c);
        if (a < f91491e || a > f91492f) {
            return c2;
        }
        return f91493g[m138431a(a, f91490d)];
    }

    /* renamed from: a */
    public static Pair<Integer, String> m138433a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return Pair.create(Integer.valueOf(i), "");
        }
        String a = m138436a(str);
        if (a.isEmpty()) {
            return Pair.create(Integer.valueOf(i), "");
        }
        if (!str.trim().startsWith("+")) {
            return Pair.create(Integer.valueOf(i), a);
        }
        try {
            PhoneNumberUtil a2 = m138434a();
            Phonenumber.PhoneNumber a3 = a2.mo237189a("+" + a, "");
            int countryCode = a3.getCountryCode();
            if (countryCode == 0) {
                return Pair.create(Integer.valueOf(i), a);
            }
            return Pair.create(Integer.valueOf(countryCode), String.valueOf(a3.getNationalNumber()));
        } catch (NumberParseException unused) {
            return Pair.create(Integer.valueOf(i), a);
        }
    }

    /* renamed from: a */
    private static int m138432a(int i, int[] iArr, int i2, int i3) {
        int i4 = (i2 + i3) / 2;
        if (i4 == i2 || iArr[i4] == i) {
            return i4;
        }
        if (iArr[i4] > i) {
            i3 = i4;
        } else {
            i2 = i4;
        }
        return m138432a(i, iArr, i2, i3);
    }
}
