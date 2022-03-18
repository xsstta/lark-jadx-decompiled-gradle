package org.apache.commons.text;

import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import org.apache.commons.text.translate.AbstractC69985b;
import org.apache.commons.text.translate.C69984a;
import org.apache.commons.text.translate.C69987d;
import org.apache.commons.text.translate.C69990e;
import org.apache.commons.text.translate.C69991f;
import org.apache.commons.text.translate.C69992g;
import org.apache.commons.text.translate.C69993h;
import org.apache.commons.text.translate.C69994i;
import org.apache.commons.text.translate.C69997l;
import org.apache.commons.text.translate.C69998m;
import org.apache.commons.text.translate.NumericEntityUnescaper;

/* renamed from: org.apache.commons.text.e */
public class C69981e {

    /* renamed from: a */
    public static final AbstractC69985b f174867a;

    /* renamed from: b */
    public static final AbstractC69985b f174868b;

    /* renamed from: c */
    public static final AbstractC69985b f174869c;

    /* renamed from: d */
    public static final AbstractC69985b f174870d;

    /* renamed from: e */
    public static final AbstractC69985b f174871e;

    /* renamed from: f */
    public static final AbstractC69985b f174872f = new C69984a(new C69992g(C69990e.f174905e), new C69992g(C69990e.f174901a));

    /* renamed from: g */
    public static final AbstractC69985b f174873g = new C69984a(new C69992g(C69990e.f174905e), new C69992g(C69990e.f174901a), new C69992g(C69990e.f174903c));

    /* renamed from: h */
    public static final AbstractC69985b f174874h = new C69987d.C69988a();

    /* renamed from: i */
    public static final AbstractC69985b f174875i;

    /* renamed from: j */
    public static final AbstractC69985b f174876j;

    /* renamed from: k */
    public static final AbstractC69985b f174877k;

    /* renamed from: l */
    public static final AbstractC69985b f174878l;

    /* renamed from: m */
    public static final AbstractC69985b f174879m = new C69984a(new C69992g(C69990e.f174906f), new C69992g(C69990e.f174902b), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0]));

    /* renamed from: n */
    public static final AbstractC69985b f174880n = new C69984a(new C69992g(C69990e.f174906f), new C69992g(C69990e.f174902b), new C69992g(C69990e.f174904d), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0]));

    /* renamed from: o */
    public static final AbstractC69985b f174881o = new C69984a(new C69992g(C69990e.f174906f), new C69992g(C69990e.f174908h), new NumericEntityUnescaper(new NumericEntityUnescaper.OPTION[0]));

    /* renamed from: p */
    public static final AbstractC69985b f174882p = new C69987d.C69989b();

    /* renamed from: q */
    public static final AbstractC69985b f174883q = new C69982a();

    /* renamed from: org.apache.commons.text.e$a */
    static class C69982a extends AbstractC69985b {
        C69982a() {
        }

        @Override // org.apache.commons.text.translate.AbstractC69985b
        /* renamed from: a */
        public int mo246237a(CharSequence charSequence, int i, Writer writer) throws IOException {
            if (i == 0) {
                String charSequence2 = charSequence.toString();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int indexOf = charSequence2.indexOf(92, i2);
                    if (indexOf == -1) {
                        break;
                    }
                    if (indexOf > i3) {
                        writer.write(charSequence2.substring(i3, indexOf));
                    }
                    i3 = indexOf + 1;
                    i2 = indexOf + 2;
                }
                if (i3 < charSequence2.length()) {
                    writer.write(charSequence2.substring(i3));
                }
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            throw new IllegalStateException("XsiUnescaper should never reach the [1] index");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("\"", "\\\"");
        hashMap.put("\\", "\\\\");
        f174867a = new C69984a(new C69992g(Collections.unmodifiableMap(hashMap)), new C69992g(C69990e.f174909i), C69991f.m268452a(32, (int) SmActions.ACTION_ONTHECALL_ENTRY));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("'", "\\'");
        hashMap2.put("\"", "\\\"");
        hashMap2.put("\\", "\\\\");
        hashMap2.put("/", "\\/");
        f174868b = new C69984a(new C69992g(Collections.unmodifiableMap(hashMap2)), new C69992g(C69990e.f174909i), C69991f.m268452a(32, (int) SmActions.ACTION_ONTHECALL_ENTRY));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("\"", "\\\"");
        hashMap3.put("\\", "\\\\");
        hashMap3.put("/", "\\/");
        f174869c = new C69984a(new C69992g(Collections.unmodifiableMap(hashMap3)), new C69992g(C69990e.f174909i), C69991f.m268452a(32, (int) SmActions.ACTION_ONTHECALL_ENTRY));
        HashMap hashMap4 = new HashMap();
        hashMap4.put("\u0000", "");
        hashMap4.put("\u0001", "");
        hashMap4.put("\u0002", "");
        hashMap4.put("\u0003", "");
        hashMap4.put("\u0004", "");
        hashMap4.put("\u0005", "");
        hashMap4.put("\u0006", "");
        hashMap4.put("\u0007", "");
        hashMap4.put("\b", "");
        hashMap4.put("\u000b", "");
        hashMap4.put("\f", "");
        hashMap4.put("\u000e", "");
        hashMap4.put("\u000f", "");
        hashMap4.put("\u0010", "");
        hashMap4.put("\u0011", "");
        hashMap4.put("\u0012", "");
        hashMap4.put("\u0013", "");
        hashMap4.put("\u0014", "");
        hashMap4.put("\u0015", "");
        hashMap4.put("\u0016", "");
        hashMap4.put("\u0017", "");
        hashMap4.put("\u0018", "");
        hashMap4.put("\u0019", "");
        hashMap4.put("\u001a", "");
        hashMap4.put("\u001b", "");
        hashMap4.put("\u001c", "");
        hashMap4.put("\u001d", "");
        hashMap4.put("\u001e", "");
        hashMap4.put("\u001f", "");
        hashMap4.put("￾", "");
        hashMap4.put("￿", "");
        f174870d = new C69984a(new C69992g(C69990e.f174905e), new C69992g(C69990e.f174907g), new C69992g(Collections.unmodifiableMap(hashMap4)), C69993h.m268455a((int) SmActions.ACTION_ONTHECALL_ENTRY, 132), C69993h.m268455a(134, 159), new C69998m());
        HashMap hashMap5 = new HashMap();
        hashMap5.put("\u0000", "");
        hashMap5.put("\u000b", "&#11;");
        hashMap5.put("\f", "&#12;");
        hashMap5.put("￾", "");
        hashMap5.put("￿", "");
        f174871e = new C69984a(new C69992g(C69990e.f174905e), new C69992g(C69990e.f174907g), new C69992g(Collections.unmodifiableMap(hashMap5)), C69993h.m268455a(1, 8), C69993h.m268455a(14, 31), C69993h.m268455a((int) SmActions.ACTION_ONTHECALL_ENTRY, 132), C69993h.m268455a(134, 159), new C69998m());
        HashMap hashMap6 = new HashMap();
        hashMap6.put("|", "\\|");
        hashMap6.put(ContainerUtils.FIELD_DELIMITER, "\\&");
        hashMap6.put(";", "\\;");
        hashMap6.put("<", "\\<");
        hashMap6.put(">", "\\>");
        hashMap6.put("(", "\\(");
        hashMap6.put(")", "\\)");
        hashMap6.put("$", "\\$");
        hashMap6.put("`", "\\`");
        hashMap6.put("\\", "\\\\");
        hashMap6.put("\"", "\\\"");
        hashMap6.put("'", "\\'");
        hashMap6.put(" ", "\\ ");
        hashMap6.put("\t", "\\\t");
        hashMap6.put("\r\n", "");
        hashMap6.put("\n", "");
        hashMap6.put("*", "\\*");
        hashMap6.put("?", "\\?");
        hashMap6.put("[", "\\[");
        hashMap6.put("#", "\\#");
        hashMap6.put("~", "\\~");
        hashMap6.put(ContainerUtils.KEY_VALUE_DELIMITER, "\\=");
        hashMap6.put("%", "\\%");
        f174875i = new C69992g(Collections.unmodifiableMap(hashMap6));
        HashMap hashMap7 = new HashMap();
        hashMap7.put("\\\\", "\\");
        hashMap7.put("\\\"", "\"");
        hashMap7.put("\\'", "'");
        hashMap7.put("\\", "");
        C69984a aVar = new C69984a(new C69994i(), new C69997l(), new C69992g(C69990e.f174910j), new C69992g(Collections.unmodifiableMap(hashMap7)));
        f174876j = aVar;
        f174877k = aVar;
        f174878l = aVar;
    }

    /* renamed from: a */
    public static final String m268408a(String str) {
        return f174868b.mo246269a(str);
    }

    /* renamed from: b */
    public static final String m268409b(String str) {
        return f174876j.mo246269a(str);
    }

    /* renamed from: c */
    public static final String m268410c(String str) {
        return f174873g.mo246269a(str);
    }

    /* renamed from: d */
    public static final String m268411d(String str) {
        return f174881o.mo246269a(str);
    }
}
