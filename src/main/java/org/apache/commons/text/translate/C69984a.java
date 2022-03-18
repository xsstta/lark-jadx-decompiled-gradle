package org.apache.commons.text.translate;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: org.apache.commons.text.translate.a */
public class C69984a extends AbstractC69985b {

    /* renamed from: b */
    private final List<AbstractC69985b> f174896b = new ArrayList();

    public C69984a(AbstractC69985b... bVarArr) {
        if (bVarArr != null) {
            for (AbstractC69985b bVar : bVarArr) {
                if (bVar != null) {
                    this.f174896b.add(bVar);
                }
            }
        }
    }

    @Override // org.apache.commons.text.translate.AbstractC69985b
    /* renamed from: a */
    public int mo246237a(CharSequence charSequence, int i, Writer writer) throws IOException {
        for (AbstractC69985b bVar : this.f174896b) {
            int a = bVar.mo246237a(charSequence, i, writer);
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }
}
