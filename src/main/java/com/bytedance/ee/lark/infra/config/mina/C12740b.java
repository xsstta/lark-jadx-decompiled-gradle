package com.bytedance.ee.lark.infra.config.mina;

import android.content.Context;
import com.bytedance.ee.lark.infra.config.mina.p615b.AbstractC12742a;

/* renamed from: com.bytedance.ee.lark.infra.config.mina.b */
public class C12740b {

    /* renamed from: a */
    private Context f34106a;

    /* renamed from: b */
    private AbstractC12742a f34107b;

    /* renamed from: com.bytedance.ee.lark.infra.config.mina.b$a */
    public static class C12741a {

        /* renamed from: a */
        private Context f34108a;

        /* renamed from: b */
        private AbstractC12742a f34109b;

        /* renamed from: a */
        public C12740b mo48230a() {
            Context context = this.f34108a;
            if (context != null) {
                AbstractC12742a aVar = this.f34109b;
                if (aVar != null) {
                    return new C12740b(context, aVar);
                }
                throw new IllegalArgumentException("requestService 不能为空");
            }
            throw new IllegalArgumentException("context 不能为空");
        }

        /* renamed from: a */
        public C12741a mo48228a(Context context) {
            this.f34108a = context;
            return this;
        }

        /* renamed from: a */
        public C12741a mo48229a(AbstractC12742a aVar) {
            this.f34109b = aVar;
            return this;
        }
    }

    public C12740b(Context context, AbstractC12742a aVar) {
        this.f34106a = context;
        this.f34107b = aVar;
    }
}
