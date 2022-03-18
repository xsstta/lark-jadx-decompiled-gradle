package com.larksuite.component.ui.tag.v2;

import com.larksuite.component.ui.tag.IconTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;

/* renamed from: com.larksuite.component.ui.tag.a.a */
public interface ITagEditor<T extends ITagEditor<T>> {
    /* renamed from: b */
    T mo89984b(IconTag cVar, boolean z);

    /* renamed from: b */
    T mo89985b(TextTag hVar, boolean z);

    /* renamed from: com.larksuite.component.ui.tag.a.a$a */
    public static final class C25691a {
        /* renamed from: a */
        public static /* synthetic */ ITagEditor m92165a(ITagEditor aVar, IconTag cVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return aVar.mo89984b(cVar, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addIconTag");
        }

        /* renamed from: a */
        public static /* synthetic */ ITagEditor m92166a(ITagEditor aVar, TextTag hVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return aVar.mo89985b(hVar, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTextTag");
        }
    }
}
