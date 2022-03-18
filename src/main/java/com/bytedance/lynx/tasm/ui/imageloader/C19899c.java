package com.bytedance.lynx.tasm.ui.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.lynx.tasm.behavior.AbstractC26624b;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26622a;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lynx.tasm.ui.imageloader.c */
public class C19899c {

    /* renamed from: a */
    static AbstractC19905b f48629a;

    /* renamed from: com.bytedance.lynx.tasm.ui.imageloader.c$a */
    public interface AbstractC19904a {
        /* renamed from: a */
        void mo67403a(Drawable drawable, Throwable th);
    }

    /* renamed from: com.bytedance.lynx.tasm.ui.imageloader.c$b */
    public interface AbstractC19905b {
        /* renamed from: a */
        void mo53858a(Context context, String str, String str2, float f, float f2, AbstractC19906c cVar, AbstractC19904a aVar);
    }

    /* renamed from: com.bytedance.lynx.tasm.ui.imageloader.c$c */
    public interface AbstractC19906c {
        /* renamed from: a */
        Bitmap mo67408a(Bitmap bitmap);
    }

    /* renamed from: a */
    public static AbstractC26624b m72621a() {
        return new AbstractC26624b() {
            /* class com.bytedance.lynx.tasm.ui.imageloader.C19899c.C199001 */

            @Override // com.lynx.tasm.behavior.AbstractC26624b
            /* renamed from: a */
            public List<C26622a> mo53784a() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C26622a("image") {
                    /* class com.bytedance.lynx.tasm.ui.imageloader.C19899c.C199001.C199011 */

                    @Override // com.lynx.tasm.behavior.C26622a
                    /* renamed from: a */
                    public LynxUI mo33935a(AbstractC26684l lVar) {
                        return new UIImage(lVar);
                    }
                });
                arrayList.add(new C26622a("filter-image") {
                    /* class com.bytedance.lynx.tasm.ui.imageloader.C19899c.C199001.C199022 */

                    @Override // com.lynx.tasm.behavior.C26622a
                    /* renamed from: a */
                    public LynxUI mo33935a(AbstractC26684l lVar) {
                        return new UIFilterImage(lVar);
                    }
                });
                arrayList.add(new C26622a("inline-image") {
                    /* class com.bytedance.lynx.tasm.ui.imageloader.C19899c.C199001.C199033 */

                    @Override // com.lynx.tasm.behavior.C26622a
                    /* renamed from: a */
                    public ShadowNode mo67433a() {
                        return new InlineImageShadowNode();
                    }
                });
                return arrayList;
            }
        };
    }

    /* renamed from: a */
    public static void m72622a(AbstractC19905b bVar) {
        f48629a = bVar;
    }
}
