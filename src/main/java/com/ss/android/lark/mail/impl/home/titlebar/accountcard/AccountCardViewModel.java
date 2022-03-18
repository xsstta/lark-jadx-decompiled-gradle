package com.ss.android.lark.mail.impl.home.titlebar.accountcard;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.arch.jack.JackViewModel;
import com.ss.android.lark.mail.impl.badge.C41832a;
import com.ss.android.lark.mail.impl.entity.BadgeCountState;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.entity.C42089c;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43345c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0013\u001a\u00020\u0012H\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardState;", "()V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "mMailTabVisibleListener", "Lcom/ss/android/lark/mail/impl/service/AppLifecycleService$IMailTabVisibleListener;", "getMMailTabVisibleListener", "()Lcom/ss/android/lark/mail/impl/service/AppLifecycleService$IMailTabVisibleListener;", "setMMailTabVisibleListener", "(Lcom/ss/android/lark/mail/impl/service/AppLifecycleService$IMailTabVisibleListener;)V", "defaultState", "init", "", "onCleared", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.d.a.d */
public final class AccountCardViewModel extends JackViewModel<AccountCardState> {
    private LifecycleOwner lifecycleOwner;
    private C43345c.AbstractC43349b mMailTabVisibleListener;

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final C43345c.AbstractC43349b getMMailTabVisibleListener() {
        return this.mMailTabVisibleListener;
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public AccountCardState defaultState() {
        return new AccountCardState(false, "", false, BadgeCountState.RED.getValue());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.larksuite.arch.jack.JackViewModel
    public void onCleared() {
        super.onCleared();
        C43345c.m172076m().mo154995b(this.mMailTabVisibleListener);
        this.lifecycleOwner = null;
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner2) {
        this.lifecycleOwner = lifecycleOwner2;
    }

    public final void setMMailTabVisibleListener(C43345c.AbstractC43349b bVar) {
        this.mMailTabVisibleListener = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardViewModel$init$4", "Lcom/ss/android/lark/mail/impl/service/AppLifecycleService$IMailTabVisibleListener;", "onMailPageActiveChange", "", "active", "", "onMailTabVisibleChange", "visible", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.d$d */
    public static final class C42491d implements C43345c.AbstractC43349b {

        /* renamed from: a */
        final /* synthetic */ AccountCardViewModel f108153a;

        @Override // com.ss.android.lark.mail.impl.service.C43345c.AbstractC43349b
        /* renamed from: b */
        public void mo152846b(boolean z) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42491d(AccountCardViewModel dVar) {
            this.f108153a = dVar;
        }

        @Override // com.ss.android.lark.mail.impl.service.C43345c.AbstractC43349b
        /* renamed from: a */
        public void mo152845a(boolean z) {
            this.f108153a.setState(new C42492a(z));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.d.a.d$d$a */
        static final class C42492a extends Lambda implements Function1<AccountCardState, AccountCardState> {
            final /* synthetic */ boolean $visible;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C42492a(boolean z) {
                super(1);
                this.$visible = z;
            }

            public final AccountCardState invoke(AccountCardState bVar) {
                boolean z;
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                if (!this.$visible || !C43277a.m171921a().mo154952p()) {
                    z = false;
                } else {
                    z = true;
                }
                return AccountCardState.m169590a(bVar, z, null, false, 0, 14, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/titlebar/accountcard/AccountCardState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.d$a */
    public static final class C42484a extends Lambda implements Function1<AccountCardState, AccountCardState> {
        final /* synthetic */ AccountCardViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42484a(AccountCardViewModel dVar) {
            super(1);
            this.this$0 = dVar;
        }

        public final AccountCardState invoke(AccountCardState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            return this.this$0.defaultState();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "badgeCount", "Lcom/ss/android/lark/mail/impl/entity/BadgeCount;", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.d$c */
    public static final class C42489c<T> implements AbstractC1178x<C42089c> {

        /* renamed from: a */
        final /* synthetic */ AccountCardViewModel f108152a;

        C42489c(AccountCardViewModel dVar) {
            this.f108152a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(C42089c cVar) {
            final int i;
            final BadgeCountState badgeCountState;
            if (cVar != null) {
                i = cVar.mo151827a(true);
            } else {
                i = 0;
            }
            if (cVar != null) {
                badgeCountState = cVar.mo151831b(true);
            } else {
                badgeCountState = BadgeCountState.RED;
            }
            this.f108152a.setState(new Function1<AccountCardState, AccountCardState>() {
                /* class com.ss.android.lark.mail.impl.home.titlebar.accountcard.AccountCardViewModel.C42489c.C424901 */

                public final AccountCardState invoke(AccountCardState bVar) {
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                    if (i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    BadgeCountState badgeCountState = badgeCountState;
                    if (badgeCountState == null) {
                        badgeCountState = BadgeCountState.RED;
                    }
                    return AccountCardState.m169590a(bVar, false, null, z, badgeCountState.getValue(), 3, null);
                }
            });
        }
    }

    public final void init(LifecycleOwner lifecycleOwner2) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "lifecycleOwner");
        this.lifecycleOwner = lifecycleOwner2;
        initialize(new C42484a(this));
        C43277a a = C43277a.m171921a();
        Intrinsics.checkExpressionValueIsNotNull(a, "AccountService.getInstance()");
        a.mo154953q().mo5923a(lifecycleOwner2, new C42485b(this));
        C41832a a2 = C41832a.m166157a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "BadgeMgr.getInstance()");
        a2.mo150418d().mo5923a(lifecycleOwner2, new C42489c(this));
        this.mMailTabVisibleListener = new C42491d(this);
        C43345c.m172076m().mo154991a(this.mMailTabVisibleListener);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "newAccountList", "Lcom/ss/android/lark/mail/impl/entity/AccountList;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.d.a.d$b */
    public static final class C42485b<T> implements AbstractC1178x<C42088b> {

        /* renamed from: a */
        final /* synthetic */ AccountCardViewModel f108151a;

        C42485b(AccountCardViewModel dVar) {
            this.f108151a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(C42088b bVar) {
            final long j;
            final BadgeCountState badgeCountState;
            if (bVar == null) {
                this.f108151a.setState(new Function1<AccountCardState, AccountCardState>(this) {
                    /* class com.ss.android.lark.mail.impl.home.titlebar.accountcard.AccountCardViewModel.C42485b.C424861 */
                    final /* synthetic */ C42485b this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final AccountCardState invoke(AccountCardState bVar) {
                        Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                        return this.this$0.f108151a.defaultState();
                    }
                });
            } else if (bVar.mo151820b() == null || bVar.mo151820b().size() <= 1) {
                this.f108151a.setState(C424883.INSTANCE);
            } else {
                C41832a a = C41832a.m166157a();
                Intrinsics.checkExpressionValueIsNotNull(a, "BadgeMgr.getInstance()");
                C1177w<C42089c> d = a.mo150418d();
                Intrinsics.checkExpressionValueIsNotNull(d, "BadgeMgr.getInstance().badgeCount");
                C42089c b = d.mo5927b();
                if (b != null) {
                    j = (long) b.mo151827a(true);
                } else {
                    j = 0;
                }
                if (b != null) {
                    badgeCountState = b.mo151831b(true);
                } else {
                    badgeCountState = BadgeCountState.RED;
                }
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                Iterator<C42087a> it = bVar.mo151820b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C42087a next = it.next();
                    if (TextUtils.equals(bVar.mo151821c(), next.mo151808a())) {
                        T t = (T) next.mo151812d();
                        Intrinsics.checkExpressionValueIsNotNull(t, "account.getMailAddress()");
                        objectRef.element = t;
                        break;
                    }
                }
                this.f108151a.setState(new Function1<AccountCardState, AccountCardState>() {
                    /* class com.ss.android.lark.mail.impl.home.titlebar.accountcard.AccountCardViewModel.C42485b.C424872 */

                    public final AccountCardState invoke(AccountCardState bVar) {
                        boolean z;
                        Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                        C43345c m = C43345c.m172076m();
                        Intrinsics.checkExpressionValueIsNotNull(m, "AppLifecycleService.getInstance()");
                        boolean c = m.mo154997c();
                        T t = objectRef.element;
                        if (j > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        BadgeCountState badgeCountState = badgeCountState;
                        if (badgeCountState == null) {
                            badgeCountState = BadgeCountState.RED;
                        }
                        return bVar.mo152822a(c, t, z, badgeCountState.getValue());
                    }
                });
            }
        }
    }
}
