package com.ss.android.lark.mail.impl.home.threadlist.header.status.network;

import com.larksuite.arch.jack.JackViewModel;
import com.ss.android.lark.mail.impl.utils.C43791r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/network/NetworkTipsViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/network/NetworkState;", "()V", "mIsNetworkEnable", "", "defaultState", "isShowNetworkError", "resetStatus", "", "updateNetworkStatus", "isNetworkEnable", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.c.c */
public final class NetworkTipsViewModel extends JackViewModel<NetworkState> {
    public boolean mIsNetworkEnable = true;

    public final boolean isShowNetworkError() {
        return !this.mIsNetworkEnable;
    }

    public final void resetStatus() {
        setState(C42662a.INSTANCE);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public NetworkState defaultState() {
        return new NetworkState(true);
    }

    public NetworkTipsViewModel() {
        initialize(new Function1<NetworkState, NetworkState>(this) {
            /* class com.ss.android.lark.mail.impl.home.threadlist.header.status.network.NetworkTipsViewModel.C426611 */
            final /* synthetic */ NetworkTipsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final NetworkState invoke(NetworkState aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                return this.this$0.defaultState();
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/network/NetworkState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.c.c$a */
    public static final class C42662a extends Lambda implements Function1<NetworkState, NetworkState> {
        public static final C42662a INSTANCE = new C42662a();

        C42662a() {
            super(1);
        }

        public final NetworkState invoke(NetworkState aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            return new NetworkState(C43791r.m173558a());
        }
    }

    public final void updateNetworkStatus(boolean z) {
        setState(new C42663b(this, z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/network/NetworkState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.c.c$b */
    public static final class C42663b extends Lambda implements Function1<NetworkState, NetworkState> {
        final /* synthetic */ boolean $isNetworkEnable;
        final /* synthetic */ NetworkTipsViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42663b(NetworkTipsViewModel cVar, boolean z) {
            super(1);
            this.this$0 = cVar;
            this.$isNetworkEnable = z;
        }

        public final NetworkState invoke(NetworkState aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            this.this$0.mIsNetworkEnable = this.$isNetworkEnable;
            return aVar.mo153276a(this.$isNetworkEnable);
        }
    }
}
