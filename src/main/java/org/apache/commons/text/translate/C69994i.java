package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;

/* renamed from: org.apache.commons.text.translate.i */
public class C69994i extends AbstractC69985b {
    /* renamed from: a */
    private boolean m268457a(char c) {
        return c >= '0' && c <= '7';
    }

    /* renamed from: b */
    private boolean m268458b(char c) {
        return c >= '0' && c <= '3';
    }

    @Override // org.apache.commons.text.translate.AbstractC69985b
    /* renamed from: a */
    public int mo246237a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        if (charSequence.charAt(i) != '\\' || length <= 0) {
            return 0;
        }
        int i2 = i + 1;
        if (!m268457a(charSequence.charAt(i2))) {
            return 0;
        }
        int i3 = i + 2;
        int i4 = i + 3;
        sb.append(charSequence.charAt(i2));
        if (length > 1 && m268457a(charSequence.charAt(i3))) {
            sb.append(charSequence.charAt(i3));
            if (length > 2 && m268458b(charSequence.charAt(i2)) && m268457a(charSequence.charAt(i4))) {
                sb.append(charSequence.charAt(i4));
            }
        }
        writer.write(Integer.parseInt(sb.toString(), 8));
        return sb.length() + 1;
    }
}
