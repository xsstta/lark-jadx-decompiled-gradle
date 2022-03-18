package com.ss.android.lark.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1133ab;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.app.C28859d;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.chatthread.ChatThreadActivity;
import com.ss.android.lark.chatwindow.ChatWindowActivity;
import com.ss.android.lark.core.p1775l.C36214a;
import com.ss.android.lark.core.p1775l.C36234c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.favorite.C37081c;
import com.ss.android.lark.integrator.im.chat.C39486b;
import com.ss.android.lark.integrator.im.chat.dependency.C39508d;
import com.ss.android.lark.integrator.im.chat.dependency.C39524e;
import com.ss.android.lark.integrator.im.chat.dependency.C39525f;
import com.ss.android.lark.integrator.im.p2028h.C39635a;
import com.ss.android.lark.integrator.im.p2028h.C39638c;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.v3.userprofile.ProfileTabAdapter;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileActivityV3;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileFragmentV3;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileModelV3;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileViewModel;
import com.ss.android.lark.profile.func.v3.userprofile.action.ActionBtnBinderV3;
import com.ss.android.lark.profile.func.v3.userprofile.action.ActionBtnClickDependencyImpl;
import com.ss.android.lark.profile.func.v3.userprofile.action.ActionBtnDependencyImpl;
import com.ss.android.lark.profile.func.v3.userprofile.action.C52673d;
import com.ss.android.lark.profile.func.v3.userprofile.action.C52674e;
import com.ss.android.lark.profile.func.v3.userprofile.av;
import com.ss.android.lark.profile.func.v3.userprofile.ax;
import com.ss.android.lark.profile.func.v3.userprofile.ay;
import com.ss.android.lark.profile.func.v3.userprofile.bd;
import com.ss.android.lark.profile.func.v3.userprofile.be;
import com.ss.android.lark.profile.func.v3.userprofile.di.C52744b;
import com.ss.android.lark.profile.func.v3.userprofile.di.C52745d;
import com.ss.android.lark.profile.func.v3.userprofile.di.ProfileFragmentModule;
import com.ss.android.lark.profile.func.v3.userprofile.di.ProfileServiceModule;
import com.ss.android.lark.profile.func.v3.userprofile.di.ViewModelFactory;
import com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.C52782e;
import com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.PersonalInfoFragment;
import dagger.hilt.android.AbstractC68111a;
import dagger.hilt.android.internal.lifecycle.C68133a;
import dagger.hilt.android.internal.lifecycle.C68138c;
import dagger.hilt.android.internal.managers.C68154d;
import dagger.hilt.android.internal.p3448a.AbstractC68121a;
import dagger.hilt.android.internal.p3448a.AbstractC68122b;
import dagger.hilt.android.internal.p3448a.AbstractC68123c;
import dagger.hilt.android.internal.p3448a.AbstractC68124d;
import dagger.hilt.android.internal.p3448a.AbstractC68126f;
import dagger.hilt.android.internal.p3449b.C68129b;
import dagger.hilt.android.internal.p3449b.C68130c;
import dagger.hilt.android.internal.p3449b.C68131d;
import dagger.internal.C68173a;
import dagger.internal.C68177e;
import dagger.internal.C68178f;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.ss.android.lark.app.a */
public final class C28829a extends C28859d.AbstractC28867e {

    /* renamed from: a */
    public final C68130c f72397a;

    /* renamed from: b */
    public final ProfileServiceModule f72398b;

    /* renamed from: c */
    public Provider<IProfileModuleDependency> f72399c;

    /* renamed from: d */
    public Provider<AbstractC29542ad> f72400d;

    /* renamed from: e */
    private final C28829a f72401e;

    /* renamed from: f */
    private Provider<C37081c> f72402f;

    /* renamed from: g */
    private Provider<C39508d> f72403g;

    /* renamed from: h */
    private Provider<AbstractC36474h> f72404h;

    /* renamed from: i */
    private Provider<C36214a> f72405i;

    @Override // com.ss.android.lark.app.AbstractC28857c
    /* renamed from: a */
    public void mo102451a(LarkApplication larkApplication) {
    }

    /* renamed from: com.ss.android.lark.app.a$e */
    public static final class C28836e {

        /* renamed from: a */
        private C68130c f72420a;

        /* renamed from: b */
        private ProfileServiceModule f72421b;

        private C28836e() {
        }

        /* renamed from: a */
        public C28859d.AbstractC28867e mo102471a() {
            C68177e.m264825a(this.f72420a, C68130c.class);
            if (this.f72421b == null) {
                this.f72421b = new ProfileServiceModule();
            }
            return new C28829a(this.f72420a, this.f72421b);
        }

        /* renamed from: a */
        public C28836e mo102470a(C68130c cVar) {
            this.f72420a = (C68130c) C68177e.m264823a(cVar);
            return this;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.a$g */
    public static final class C28838g extends C28859d.AbstractC28864c {

        /* renamed from: a */
        private final C28829a f72426a;

        /* renamed from: b */
        private final C28834d f72427b;

        /* renamed from: c */
        private final C28832b f72428c;

        /* renamed from: d */
        private final C28838g f72429d;

        /* renamed from: e */
        private Provider<FragmentActivity> f72430e;

        /* renamed from: f */
        private Provider<UserProfileViewModel> f72431f;

        /* renamed from: g */
        private Provider<ActionBtnBinderV3> f72432g;

        @Override // dagger.hilt.android.internal.lifecycle.C68133a.AbstractC68135b
        /* renamed from: d */
        public C68133a.C68136c mo102481d() {
            return this.f72428c.mo102460a();
        }

        /* renamed from: f */
        private BaseFragment m105647f() {
            return C52744b.m204276a(this.f72430e.mo47880b());
        }

        /* renamed from: g */
        private Bundle m105648g() {
            return ProfileFragmentModule.f130462a.mo180205a(m105647f());
        }

        /* renamed from: h */
        private UserProfileModelV3 m105649h() {
            return m105642a(ax.m204138c());
        }

        /* renamed from: i */
        private Map<Class<? extends AbstractC1142af>, Provider<AbstractC1142af>> m105650i() {
            return Collections.singletonMap(UserProfileViewModel.class, this.f72431f);
        }

        /* renamed from: j */
        private ViewModelFactory m105651j() {
            return new ViewModelFactory(m105650i());
        }

        /* renamed from: k */
        private ProfileTabAdapter m105652k() {
            return new ProfileTabAdapter(m105647f());
        }

        /* renamed from: b */
        public UserProfileViewModel mo102479b() {
            return m105643a(bd.m204242a(m105648g()));
        }

        /* renamed from: c */
        public ActionBtnBinderV3 mo102480c() {
            return new ActionBtnBinderV3(m105654m());
        }

        @Override // dagger.hilt.android.internal.managers.C68162k.AbstractC68165c
        /* renamed from: e */
        public AbstractC68126f mo102482e() {
            return new C28845m(this.f72427b, this.f72428c, this.f72429d);
        }

        /* renamed from: l */
        private ActionBtnClickDependencyImpl m105653l() {
            return new ActionBtnClickDependencyImpl(this.f72430e.mo47880b(), m105647f(), this.f72426a.f72400d.mo47880b());
        }

        /* renamed from: m */
        private ActionBtnDependencyImpl m105654m() {
            return m105641a(C52673d.m204111a(this.f72430e.mo47880b(), m105647f(), m105653l()));
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.app.a$g$a */
        public static final class C28839a<T> implements Provider<T> {

            /* renamed from: a */
            private final C28829a f72433a;

            /* renamed from: b */
            private final C28834d f72434b;

            /* renamed from: c */
            private final C28832b f72435c;

            /* renamed from: d */
            private final C28838g f72436d;

            /* renamed from: e */
            private final int f72437e;

            @Override // javax.inject.Provider
            /* renamed from: b */
            public T mo47880b() {
                int i = this.f72437e;
                if (i == 0) {
                    return (T) this.f72436d.mo102479b();
                }
                if (i == 1) {
                    return (T) this.f72436d.mo102476a();
                }
                if (i == 2) {
                    return (T) this.f72436d.mo102480c();
                }
                throw new AssertionError(this.f72437e);
            }

            C28839a(C28829a aVar, C28834d dVar, C28832b bVar, C28838g gVar, int i) {
                this.f72433a = aVar;
                this.f72434b = dVar;
                this.f72435c = bVar;
                this.f72436d = gVar;
                this.f72437e = i;
            }
        }

        /* renamed from: a */
        public FragmentActivity mo102476a() {
            return C68129b.m264769a(this.f72428c.f72409a);
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.fragment.AbstractC52781d
        /* renamed from: a */
        public void mo102477a(PersonalInfoFragment bVar) {
            m105645b(bVar);
        }

        /* renamed from: a */
        private UserProfileViewModel m105643a(UserProfileViewModel baVar) {
            be.m204245a(baVar, m105649h());
            return baVar;
        }

        /* renamed from: a */
        private ActionBtnDependencyImpl m105641a(ActionBtnDependencyImpl cVar) {
            C52674e.m204114a(cVar, this.f72426a.f72399c.mo47880b());
            return cVar;
        }

        /* renamed from: a */
        private UserProfileModelV3 m105642a(UserProfileModelV3 awVar) {
            ay.m204141a(awVar, this.f72426a.f72399c.mo47880b());
            return awVar;
        }

        /* renamed from: b */
        private PersonalInfoFragment m105645b(PersonalInfoFragment bVar) {
            C52782e.m204405a(bVar, this.f72426a.f72400d.mo47880b());
            C52782e.m204406a(bVar, this.f72426a.f72399c.mo47880b());
            return bVar;
        }

        /* renamed from: a */
        private void m105644a(Fragment fragment) {
            this.f72430e = C68178f.m264827a(new C28839a(this.f72426a, this.f72427b, this.f72428c, this.f72429d, 1));
            this.f72431f = new C28839a(this.f72426a, this.f72427b, this.f72428c, this.f72429d, 0);
            this.f72432g = new C28839a(this.f72426a, this.f72427b, this.f72428c, this.f72429d, 2);
        }

        /* renamed from: b */
        private UserProfileFragmentV3 m105646b(UserProfileFragmentV3 gVar) {
            av.m204120a(gVar, m105651j());
            av.m204119a(gVar, m105652k());
            av.m204118a(gVar, this.f72426a.f72399c.mo47880b());
            av.m204121a(gVar, C68173a.m264819b(this.f72432g));
            return gVar;
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.au
        /* renamed from: a */
        public void mo102478a(UserProfileFragmentV3 gVar) {
            m105646b(gVar);
        }

        private C28838g(C28829a aVar, C28834d dVar, C28832b bVar, Fragment fragment) {
            this.f72429d = this;
            this.f72426a = aVar;
            this.f72427b = dVar;
            this.f72428c = bVar;
            m105644a(fragment);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.a$l */
    public static final class C28844l extends C28859d.AbstractC28871h {

        /* renamed from: a */
        private final C28829a f72451a;

        /* renamed from: b */
        private final C28834d f72452b;

        /* renamed from: c */
        private final C28844l f72453c;

        @Override // dagger.hilt.android.internal.lifecycle.C68139d.AbstractC68141a
        /* renamed from: a */
        public Map<String, Provider<AbstractC1142af>> mo102491a() {
            return Collections.emptyMap();
        }

        private C28844l(C28829a aVar, C28834d dVar, C1133ab abVar) {
            this.f72453c = this;
            this.f72451a = aVar;
            this.f72452b = dVar;
        }
    }

    /* renamed from: b */
    public static C28836e m105612b() {
        return new C28836e();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.a$b */
    public static final class C28832b extends C28859d.AbstractC28860a {

        /* renamed from: a */
        public final Activity f72409a;

        /* renamed from: b */
        private final C28829a f72410b;

        /* renamed from: c */
        private final C28834d f72411c;

        /* renamed from: d */
        private final C28832b f72412d;

        @Override // com.ss.android.lark.chatthread.AbstractC35078a
        /* renamed from: a */
        public void mo102461a(ChatThreadActivity chatThreadActivity) {
        }

        @Override // com.ss.android.lark.chatwindow.AbstractC35239c
        /* renamed from: a */
        public void mo102462a(ChatWindowActivity chatWindowActivity) {
        }

        @Override // com.ss.android.lark.profile.func.v3.userprofile.AbstractC52747f
        /* renamed from: a */
        public void mo102463a(UserProfileActivityV3 userProfileActivityV3) {
        }

        @Override // dagger.hilt.android.internal.managers.C68157g.AbstractC68158a
        /* renamed from: b */
        public AbstractC68123c mo102464b() {
            return new C28837f(this.f72411c, this.f72412d);
        }

        @Override // dagger.hilt.android.internal.managers.C68162k.AbstractC68164b
        /* renamed from: c */
        public AbstractC68124d mo102465c() {
            return new C28841i(this.f72411c, this.f72412d);
        }

        @Override // dagger.hilt.android.internal.lifecycle.C68133a.AbstractC68134a
        /* renamed from: a */
        public C68133a.C68136c mo102460a() {
            return C68138c.m264783a(C68131d.m264773a(this.f72410b.f72397a), Collections.emptySet(), new C28843k(this.f72411c));
        }

        private C28832b(C28829a aVar, C28834d dVar, Activity activity) {
            this.f72412d = this;
            this.f72410b = aVar;
            this.f72411c = dVar;
            this.f72409a = activity;
        }
    }

    /* renamed from: com.ss.android.lark.app.a$c */
    private static final class C28833c implements C28859d.AbstractC28862b.AbstractC28863a {

        /* renamed from: a */
        private final C28829a f72413a;

        /* renamed from: a */
        public C28859d.AbstractC28862b mo102467b() {
            return new C28834d();
        }

        private C28833c(C28829a aVar) {
            this.f72413a = aVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.a$d */
    public static final class C28834d extends C28859d.AbstractC28862b {

        /* renamed from: a */
        private final C28829a f72414a;

        /* renamed from: b */
        private final C28834d f72415b;

        /* renamed from: c */
        private Provider f72416c;

        @Override // dagger.hilt.android.internal.managers.C68145a.AbstractC68146a
        /* renamed from: a */
        public AbstractC68121a mo102468a() {
            return new C28831a(this.f72415b);
        }

        @Override // dagger.hilt.android.internal.managers.C68147b.AbstractC68151c
        /* renamed from: b */
        public AbstractC68111a mo102469b() {
            return (AbstractC68111a) this.f72416c.mo47880b();
        }

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.lark.app.a$d$a */
        public static final class C28835a<T> implements Provider<T> {

            /* renamed from: a */
            private final C28829a f72417a;

            /* renamed from: b */
            private final C28834d f72418b;

            /* renamed from: c */
            private final int f72419c;

            @Override // javax.inject.Provider
            /* renamed from: b */
            public T mo47880b() {
                if (this.f72419c == 0) {
                    return (T) C68154d.m264796c();
                }
                throw new AssertionError(this.f72419c);
            }

            C28835a(C28829a aVar, C28834d dVar, int i) {
                this.f72417a = aVar;
                this.f72418b = dVar;
                this.f72419c = i;
            }
        }

        /* renamed from: c */
        private void m105631c() {
            this.f72416c = C68173a.m264818a(new C28835a(this.f72414a, this.f72415b, 0));
        }

        private C28834d(C28829a aVar) {
            this.f72415b = this;
            this.f72414a = aVar;
            m105631c();
        }
    }

    /* renamed from: c */
    public C39508d mo102452c() {
        return m105610a(C39524e.m156255c());
    }

    @Override // com.ss.android.lark.profile.C52242b.AbstractC52243a, com.ss.android.lark.core.p1775l.AbstractC36232b.AbstractC36233a
    /* renamed from: d */
    public C52239a mo102453d() {
        return C36234c.m142706a(this.f72399c.mo47880b());
    }

    @Override // com.ss.android.lark.favorite.C37180d.AbstractC37181a, com.ss.android.lark.integrator.im.p2028h.AbstractC39636b.AbstractC39637a
    /* renamed from: e */
    public C37081c mo102454e() {
        return C39638c.m157293a(new C39635a());
    }

    @Override // dagger.hilt.android.internal.managers.C68147b.AbstractC68149a
    /* renamed from: f */
    public AbstractC68122b mo102455f() {
        return new C28833c();
    }

    /* renamed from: com.ss.android.lark.app.a$a */
    private static final class C28831a implements C28859d.AbstractC28860a.AbstractC28861a {

        /* renamed from: a */
        private final C28829a f72406a;

        /* renamed from: b */
        private final C28834d f72407b;

        /* renamed from: c */
        private Activity f72408c;

        /* renamed from: a */
        public C28859d.AbstractC28860a mo102458b() {
            C68177e.m264825a(this.f72408c, Activity.class);
            return new C28832b(this.f72407b, this.f72408c);
        }

        /* renamed from: a */
        public C28831a mo102459b(Activity activity) {
            this.f72408c = (Activity) C68177e.m264823a(activity);
            return this;
        }

        private C28831a(C28829a aVar, C28834d dVar) {
            this.f72406a = aVar;
            this.f72407b = dVar;
        }
    }

    /* renamed from: com.ss.android.lark.app.a$f */
    private static final class C28837f implements C28859d.AbstractC28864c.AbstractC28865a {

        /* renamed from: a */
        private final C28829a f72422a;

        /* renamed from: b */
        private final C28834d f72423b;

        /* renamed from: c */
        private final C28832b f72424c;

        /* renamed from: d */
        private Fragment f72425d;

        /* renamed from: a */
        public C28859d.AbstractC28864c mo102474b() {
            C68177e.m264825a(this.f72425d, Fragment.class);
            return new C28838g(this.f72423b, this.f72424c, this.f72425d);
        }

        /* renamed from: a */
        public C28837f mo102475b(Fragment fragment) {
            this.f72425d = (Fragment) C68177e.m264823a(fragment);
            return this;
        }

        private C28837f(C28829a aVar, C28834d dVar, C28832b bVar) {
            this.f72422a = aVar;
            this.f72423b = dVar;
            this.f72424c = bVar;
        }
    }

    /* renamed from: com.ss.android.lark.app.a$i */
    private static final class C28841i implements C28859d.AbstractC28868f.AbstractC28869a {

        /* renamed from: a */
        private final C28829a f72440a;

        /* renamed from: b */
        private final C28834d f72441b;

        /* renamed from: c */
        private final C28832b f72442c;

        /* renamed from: d */
        private View f72443d;

        /* renamed from: a */
        public C28859d.AbstractC28868f mo102485b() {
            C68177e.m264825a(this.f72443d, View.class);
            return new C28842j(this.f72441b, this.f72442c, this.f72443d);
        }

        /* renamed from: a */
        public C28841i mo102486b(View view) {
            this.f72443d = (View) C68177e.m264823a(view);
            return this;
        }

        private C28841i(C28829a aVar, C28834d dVar, C28832b bVar) {
            this.f72440a = aVar;
            this.f72441b = dVar;
            this.f72442c = bVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.a$k */
    public static final class C28843k implements C28859d.AbstractC28871h.AbstractC28872a {

        /* renamed from: a */
        private final C28829a f72448a;

        /* renamed from: b */
        private final C28834d f72449b;

        /* renamed from: c */
        private C1133ab f72450c;

        /* renamed from: a */
        public C28859d.AbstractC28871h mo102489b() {
            C68177e.m264825a(this.f72450c, C1133ab.class);
            return new C28844l(this.f72449b, this.f72450c);
        }

        /* renamed from: a */
        public C28843k mo102490b(C1133ab abVar) {
            this.f72450c = (C1133ab) C68177e.m264823a(abVar);
            return this;
        }

        private C28843k(C28829a aVar, C28834d dVar) {
            this.f72448a = aVar;
            this.f72449b = dVar;
        }
    }

    /* renamed from: com.ss.android.lark.app.a$m */
    private static final class C28845m implements C28859d.AbstractC28874j.AbstractC28875a {

        /* renamed from: a */
        private final C28829a f72454a;

        /* renamed from: b */
        private final C28834d f72455b;

        /* renamed from: c */
        private final C28832b f72456c;

        /* renamed from: d */
        private final C28838g f72457d;

        /* renamed from: e */
        private View f72458e;

        /* renamed from: a */
        public C28859d.AbstractC28874j mo102494b() {
            C68177e.m264825a(this.f72458e, View.class);
            return new C28846n(this.f72455b, this.f72456c, this.f72457d, this.f72458e);
        }

        /* renamed from: a */
        public C28845m mo102495b(View view) {
            this.f72458e = (View) C68177e.m264823a(view);
            return this;
        }

        private C28845m(C28829a aVar, C28834d dVar, C28832b bVar, C28838g gVar) {
            this.f72454a = aVar;
            this.f72455b = dVar;
            this.f72456c = bVar;
            this.f72457d = gVar;
        }
    }

    @Override // com.ss.android.lark.integrator.im.chat.AbstractC39484a.AbstractC39485a, com.ss.android.lark.C29990c.AbstractC29991a
    /* renamed from: a */
    public C29407b mo102450a() {
        return C39486b.m156007a(this.f72404h.mo47880b());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.a$h */
    public static final class C28840h<T> implements Provider<T> {

        /* renamed from: a */
        private final C28829a f72438a;

        /* renamed from: b */
        private final int f72439b;

        @Override // javax.inject.Provider
        /* renamed from: b */
        public T mo47880b() {
            int i = this.f72439b;
            if (i == 0) {
                return (T) this.f72438a.mo102452c();
            }
            if (i == 1) {
                return (T) this.f72438a.mo102454e();
            }
            if (i == 2) {
                return (T) new C36214a();
            }
            if (i == 3) {
                return (T) C52745d.m204280a(this.f72438a.f72398b);
            }
            throw new AssertionError(this.f72439b);
        }

        C28840h(C28829a aVar, int i) {
            this.f72438a = aVar;
            this.f72439b = i;
        }
    }

    /* renamed from: a */
    private C39508d m105610a(C39508d dVar) {
        C39525f.m156258a(dVar, C68173a.m264819b(this.f72402f));
        return dVar;
    }

    private C28829a(C68130c cVar, ProfileServiceModule cVar2) {
        this.f72401e = this;
        this.f72397a = cVar;
        this.f72398b = cVar2;
        m105611a(cVar, cVar2);
    }

    /* renamed from: a */
    private void m105611a(C68130c cVar, ProfileServiceModule cVar2) {
        this.f72402f = new C28840h(this.f72401e, 1);
        C28840h hVar = new C28840h(this.f72401e, 0);
        this.f72403g = hVar;
        this.f72404h = C68173a.m264818a(hVar);
        C28840h hVar2 = new C28840h(this.f72401e, 2);
        this.f72405i = hVar2;
        this.f72399c = C68173a.m264818a(hVar2);
        this.f72400d = C68173a.m264818a(new C28840h(this.f72401e, 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.a$j */
    public static final class C28842j extends C28859d.AbstractC28868f {

        /* renamed from: a */
        private final C28829a f72444a;

        /* renamed from: b */
        private final C28834d f72445b;

        /* renamed from: c */
        private final C28832b f72446c;

        /* renamed from: d */
        private final C28842j f72447d;

        private C28842j(C28829a aVar, C28834d dVar, C28832b bVar, View view) {
            this.f72447d = this;
            this.f72444a = aVar;
            this.f72445b = dVar;
            this.f72446c = bVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.app.a$n */
    public static final class C28846n extends C28859d.AbstractC28874j {

        /* renamed from: a */
        private final C28829a f72459a;

        /* renamed from: b */
        private final C28834d f72460b;

        /* renamed from: c */
        private final C28832b f72461c;

        /* renamed from: d */
        private final C28838g f72462d;

        /* renamed from: e */
        private final C28846n f72463e;

        private C28846n(C28829a aVar, C28834d dVar, C28832b bVar, C28838g gVar, View view) {
            this.f72463e = this;
            this.f72459a = aVar;
            this.f72460b = dVar;
            this.f72461c = bVar;
            this.f72462d = gVar;
        }
    }
}
