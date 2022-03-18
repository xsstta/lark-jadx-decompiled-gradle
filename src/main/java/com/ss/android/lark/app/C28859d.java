package com.ss.android.lark.app;

import com.ss.android.lark.C29990c;
import com.ss.android.lark.chatthread.AbstractC35078a;
import com.ss.android.lark.chatwindow.AbstractC35239c;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.favorite.C37180d;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2028h.AbstractC39636b;
import com.ss.android.lark.profile.C52242b;
import com.ss.android.lark.profile.func.v3.userprofile.AbstractC52747f;
import com.ss.android.lark.profile.func.v3.userprofile.au;
import com.ss.android.lark.profile.func.v3.userprofile.di.ProfileFragmentModule;
import com.ss.android.lark.profile.func.v3.userprofile.di.ProfileServiceModule;
import com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.AbstractC52781d;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.internal.lifecycle.C68133a;
import dagger.hilt.android.internal.lifecycle.C68139d;
import dagger.hilt.android.internal.lifecycle.C68143f;
import dagger.hilt.android.internal.lifecycle.C68144g;
import dagger.hilt.android.internal.managers.AbstractC68159h;
import dagger.hilt.android.internal.managers.AbstractC68160i;
import dagger.hilt.android.internal.managers.C68145a;
import dagger.hilt.android.internal.managers.C68157g;
import dagger.hilt.android.internal.managers.C68161j;
import dagger.hilt.android.internal.managers.C68162k;
import dagger.hilt.android.internal.p3448a.AbstractC68121a;
import dagger.hilt.android.internal.p3448a.AbstractC68122b;
import dagger.hilt.android.internal.p3448a.AbstractC68123c;
import dagger.hilt.android.internal.p3448a.AbstractC68124d;
import dagger.hilt.android.internal.p3448a.AbstractC68125e;
import dagger.hilt.android.internal.p3448a.AbstractC68126f;
import dagger.hilt.android.internal.p3449b.C68130c;
import dagger.hilt.android.internal.p3449b.C68132e;
import dagger.hilt.android.p3447a.AbstractC68113a;
import dagger.hilt.android.p3447a.AbstractC68114b;
import dagger.hilt.android.p3447a.AbstractC68115c;
import dagger.hilt.android.p3447a.AbstractC68116d;
import dagger.hilt.android.p3447a.AbstractC68117e;
import dagger.hilt.android.p3447a.AbstractC68118f;
import dagger.hilt.internal.AbstractC68166a;
import javax.inject.Singleton;

/* renamed from: com.ss.android.lark.app.d */
public final class C28859d {

    @Subcomponent(modules = {C68132e.class, C68143f.class, AbstractC28866d.class, AbstractC28870g.class})
    /* renamed from: com.ss.android.lark.app.d$a */
    public static abstract class AbstractC28860a implements AbstractC35078a, AbstractC35239c, AbstractC52747f, AbstractC68113a, C68133a.AbstractC68134a, C68157g.AbstractC68158a, C68162k.AbstractC68164b, AbstractC68166a {

        @Subcomponent.Builder
        /* renamed from: com.ss.android.lark.app.d$a$a */
        interface AbstractC28861a extends AbstractC68121a {
        }
    }

    @Subcomponent(modules = {C68161j.class, AbstractC28895e.class, AbstractC28873i.class})
    /* renamed from: com.ss.android.lark.app.d$b */
    public static abstract class AbstractC28862b implements AbstractC68114b, C68145a.AbstractC68146a, AbstractC68160i, AbstractC68166a {

        @Subcomponent.Builder
        /* renamed from: com.ss.android.lark.app.d$b$a */
        interface AbstractC28863a extends AbstractC68122b {
        }
    }

    @Subcomponent(modules = {AbstractC28876k.class, ProfileFragmentModule.class})
    /* renamed from: com.ss.android.lark.app.d$c */
    public static abstract class AbstractC28864c implements au, AbstractC52781d, AbstractC68115c, C68133a.AbstractC68135b, C68162k.AbstractC68165c, AbstractC68166a {

        @Subcomponent.Builder
        /* renamed from: com.ss.android.lark.app.d$c$a */
        interface AbstractC28865a extends AbstractC68123c {
        }
    }

    @Module(subcomponents = {AbstractC28864c.class})
    /* renamed from: com.ss.android.lark.app.d$d */
    interface AbstractC28866d {
    }

    @Component(modules = {C68130c.class, AbstractC39484a.class, AbstractC39636b.class, AbstractC28896f.class, AbstractC28897g.class, AbstractC36232b.class, ProfileServiceModule.class})
    @Singleton
    /* renamed from: com.ss.android.lark.app.d$e */
    public static abstract class AbstractC28867e implements AbstractC28857c, C29990c.AbstractC29991a, AbstractC36232b.AbstractC36233a, C37180d.AbstractC37181a, AbstractC39484a.AbstractC39485a, AbstractC39636b.AbstractC39637a, C52242b.AbstractC52243a, AbstractC68159h, AbstractC68166a {
    }

    @Subcomponent
    /* renamed from: com.ss.android.lark.app.d$f */
    public static abstract class AbstractC28868f implements AbstractC68116d, AbstractC68166a {

        @Subcomponent.Builder
        /* renamed from: com.ss.android.lark.app.d$f$a */
        interface AbstractC28869a extends AbstractC68124d {
        }
    }

    @Module(subcomponents = {AbstractC28868f.class})
    /* renamed from: com.ss.android.lark.app.d$g */
    interface AbstractC28870g {
    }

    @Subcomponent(modules = {C68144g.class})
    /* renamed from: com.ss.android.lark.app.d$h */
    public static abstract class AbstractC28871h implements AbstractC68117e, C68139d.AbstractC68141a, AbstractC68166a {

        @Subcomponent.Builder
        /* renamed from: com.ss.android.lark.app.d$h$a */
        interface AbstractC28872a extends AbstractC68125e {
        }
    }

    @Module(subcomponents = {AbstractC28871h.class})
    /* renamed from: com.ss.android.lark.app.d$i */
    interface AbstractC28873i {
    }

    @Subcomponent
    /* renamed from: com.ss.android.lark.app.d$j */
    public static abstract class AbstractC28874j implements AbstractC68118f, AbstractC68166a {

        @Subcomponent.Builder
        /* renamed from: com.ss.android.lark.app.d$j$a */
        interface AbstractC28875a extends AbstractC68126f {
        }
    }

    @Module(subcomponents = {AbstractC28874j.class})
    /* renamed from: com.ss.android.lark.app.d$k */
    interface AbstractC28876k {
    }
}
