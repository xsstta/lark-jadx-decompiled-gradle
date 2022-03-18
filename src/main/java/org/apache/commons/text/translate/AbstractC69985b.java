package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.apache.commons.lang3.C69882g;

/* renamed from: org.apache.commons.text.translate.b */
public abstract class AbstractC69985b {

    /* renamed from: a */
    static final char[] f174897a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public abstract int mo246237a(CharSequence charSequence, int i, Writer writer) throws IOException;

    /* renamed from: a */
    public static String m268441a(int i) {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: a */
    public final String mo246269a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            mo246270a(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo246270a(CharSequence charSequence, Writer writer) throws IOException {
        boolean z;
        if (writer != null) {
            z = true;
        } else {
            z = false;
        }
        C69882g.m268179a(z, "The Writer must not be null", new Object[0]);
        if (charSequence != null) {
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int a = mo246237a(charSequence, i, writer);
                if (a == 0) {
                    char charAt = charSequence.charAt(i);
                    writer.write(charAt);
                    i++;
                    if (Character.isHighSurrogate(charAt) && i < length) {
                        char charAt2 = charSequence.charAt(i);
                        if (Character.isLowSurrogate(charAt2)) {
                            writer.write(charAt2);
                            i++;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < a; i2++) {
                        i += Character.charCount(Character.codePointAt(charSequence, i));
                    }
                }
            }
        }
    }
}
