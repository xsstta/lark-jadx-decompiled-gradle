package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: org.apache.commons.text.translate.g */
public class C69992g extends AbstractC69985b {

    /* renamed from: b */
    private final Map<String, String> f174911b;

    /* renamed from: c */
    private final HashSet<Character> f174912c;

    /* renamed from: d */
    private final int f174913d;

    /* renamed from: e */
    private final int f174914e;

    public C69992g(Map<CharSequence, CharSequence> map) {
        if (map != null) {
            this.f174911b = new HashMap();
            this.f174912c = new HashSet<>();
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
                this.f174911b.put(entry.getKey().toString(), entry.getValue().toString());
                this.f174912c.add(Character.valueOf(entry.getKey().charAt(0)));
                int length = entry.getKey().length();
                i = length < i ? length : i;
                if (length > i2) {
                    i2 = length;
                }
            }
            this.f174913d = i;
            this.f174914e = i2;
            return;
        }
        throw new InvalidParameterException("lookupMap cannot be null");
    }

    @Override // org.apache.commons.text.translate.AbstractC69985b
    /* renamed from: a */
    public int mo246237a(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (!this.f174912c.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int i2 = this.f174914e;
        if (i + i2 > charSequence.length()) {
            i2 = charSequence.length() - i;
        }
        while (i2 >= this.f174913d) {
            String str = this.f174911b.get(charSequence.subSequence(i, i + i2).toString());
            if (str != null) {
                writer.write(str);
                return i2;
            }
            i2--;
        }
        return 0;
    }
}
