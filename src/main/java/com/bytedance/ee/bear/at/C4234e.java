package com.bytedance.ee.bear.at;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.at.AbstractC4242i;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.at.e */
public class C4234e implements AbstractC4242i.AbstractC4244b {
    @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4244b
    /* renamed from: a */
    public AbstractC4242i.AbstractC4245c mo16657a() {
        return new AbstractC4242i.AbstractC4245c() {
            /* class com.bytedance.ee.bear.at.C4234e.C42351 */

            @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4245c
            /* renamed from: a */
            public String mo16660a(Context context, int i) {
                C13479a.m54764b("DefaultAtExtraDependency", "getDocumentDefaultName ignore");
                return context.getResources().getString(R.string.Doc_Facade_UntitledDocument);
            }
        };
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4244b
    /* renamed from: b */
    public AbstractC4242i.AbstractC4243a mo16659b() {
        return new AbstractC4242i.AbstractC4243a() {
            /* class com.bytedance.ee.bear.at.C4234e.C42362 */

            @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4243a
            /* renamed from: a */
            public Drawable mo16661a(Context context, String str, String str2, int i) {
                C13479a.m54764b("DefaultAtExtraDependency", "loadDrawable ignore");
                return new ColorDrawable();
            }
        };
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4242i.AbstractC4244b
    /* renamed from: a */
    public void mo16658a(FrameLayout frameLayout) {
        C13479a.m54764b("DefaultAtExtraDependency", "updateWatermarkForDialog ignore");
    }
}
