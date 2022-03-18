package com.ss.android.lark.integrator.im.p2031j;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.invite_new_tenant.C40531a;
import com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a;
import com.ss.android.lark.invite_new_tenant.p2064b.C40534a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.im.j.a */
public class C39700a {

    /* renamed from: com.ss.android.lark.integrator.im.j.a$a */
    public static class C39703a {

        /* renamed from: a */
        public static final AbstractC40532a f101249a = C39700a.m157583a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C40531a m157584a() {
        return new C40531a(C39703a.f101249a);
    }

    /* renamed from: a */
    public static AbstractC40532a m157583a(final Application application) {
        return new AbstractC40532a() {
            /* class com.ss.android.lark.integrator.im.p2031j.C39700a.C397011 */

            @Override // com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a
            /* renamed from: a */
            public Context mo143857a() {
                return application;
            }

            @Override // com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a
            /* renamed from: e */
            public AbstractC40532a.AbstractC40533a mo143862e() {
                return new AbstractC40532a.AbstractC40533a() {
                    /* class com.ss.android.lark.integrator.im.p2031j.C39700a.C397011.C397021 */

                    @Override // com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a.AbstractC40533a
                    /* renamed from: a */
                    public Bitmap mo143863a(String str, int i, int i2, int i3) {
                        return C39603g.m157159a().getCoreDependency().mo143402a(str, i, i2, i3);
                    }

                    @Override // com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a.AbstractC40533a
                    /* renamed from: a */
                    public void mo143864a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                        ImageLoader.with(context).load(AvatarImage.Builder.obtain(str, str2, i, i2).build()).override(i, i2).into(imageView);
                    }
                };
            }

            @Override // com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a
            /* renamed from: b */
            public boolean mo143859b() {
                return C39603g.m157159a().getPassportDependency().mo143675f();
            }

            @Override // com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a
            /* renamed from: c */
            public boolean mo143860c() {
                return C39603g.m157159a().getCoreDependency().mo143614t().mo105661b();
            }

            @Override // com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a
            /* renamed from: d */
            public C40534a mo143861d() {
                Chatter a = AbstractC39484a.m156004a().mo104256g().mo121186a();
                return new C40534a(a.getId(), a.getAvatarKey(), a.getLocalizedName());
            }

            @Override // com.ss.android.lark.invite_new_tenant.p2063a.AbstractC40532a
            /* renamed from: a */
            public boolean mo143858a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }
        };
    }
}
