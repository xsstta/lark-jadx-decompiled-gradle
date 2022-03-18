package com.ss.android.lark.mail.impl.home.threadlist.header.status;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.mail.impl.home.threadlist.header.HeaderComponentViewGetter;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.autoreply.AutoReplyTipsComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.migration.MigrationTipsComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.network.NetworkTipsComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.storage.StorageLimitTipsComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u000f\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/StatusHeaderComponent;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/HeaderComponentViewGetter;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "autoReplyTipsComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyTipsComponent;", "getAutoReplyTipsComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/autoreply/AutoReplyTipsComponent;", "getFragment", "()Landroidx/fragment/app/Fragment;", "mHeaderList", "", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeader;", "mRefresher", "com/ss/android/lark/mail/impl/home/threadlist/header/status/StatusHeaderComponent$mRefresher$1", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/StatusHeaderComponent$mRefresher$1;", "migrationTipsComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationTipsComponent;", "getMigrationTipsComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/migration/MigrationTipsComponent;", "networkTipsComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/network/NetworkTipsComponent;", "getNetworkTipsComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/network/NetworkTipsComponent;", "storageLimitTipsComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageLimitTipsComponent;", "getStorageLimitTipsComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageLimitTipsComponent;", "viewContainer", "Landroid/widget/FrameLayout;", "getInitView", "Landroid/view/View;", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.c */
public final class StatusHeaderComponent implements HeaderComponentViewGetter {

    /* renamed from: b */
    public static final Companion f108558b = new Companion(null);

    /* renamed from: a */
    public final List<IStatusHeader> f108559a;

    /* renamed from: c */
    private final FrameLayout f108560c;

    /* renamed from: d */
    private final C42659b f108561d;

    /* renamed from: e */
    private final StorageLimitTipsComponent f108562e;

    /* renamed from: f */
    private final NetworkTipsComponent f108563f;

    /* renamed from: g */
    private final MigrationTipsComponent f108564g;

    /* renamed from: h */
    private final AutoReplyTipsComponent f108565h;

    /* renamed from: i */
    private final Fragment f108566i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/StatusHeaderComponent$Companion;", "", "()V", "REFRESH_MSG", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final NetworkTipsComponent mo153273a() {
        return this.f108563f;
    }

    /* renamed from: b */
    public final MigrationTipsComponent mo153274b() {
        return this.f108564g;
    }

    /* renamed from: d */
    public final AutoReplyTipsComponent mo153275d() {
        return this.f108565h;
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.header.HeaderComponentViewGetter
    /* renamed from: c */
    public View mo153210c() {
        return this.f108560c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mail/impl/home/threadlist/header/status/StatusHeaderComponent$mRefresher$1", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeaderRefresher;", "requestHeaderVisibility", "", "statusHeader", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/IStatusHeader;", "visibility", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.c$b */
    public static final class C42659b implements IStatusHeaderRefresher {

        /* renamed from: a */
        final /* synthetic */ StatusHeaderComponent f108567a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42659b(StatusHeaderComponent cVar) {
            this.f108567a = cVar;
        }

        @Override // com.ss.android.lark.mail.impl.home.threadlist.header.status.IStatusHeaderRefresher
        /* renamed from: a */
        public void mo153260a(IStatusHeader aVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(aVar, "statusHeader");
            aVar.mo153241a(z);
            boolean z2 = false;
            for (IStatusHeader aVar2 : this.f108567a.f108559a) {
                if (!z2) {
                    z2 = aVar2.mo153243e();
                    aVar2.mo153242b(z2);
                } else {
                    aVar2.mo153242b(false);
                }
            }
        }
    }

    public StatusHeaderComponent(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f108566i = fragment;
        this.f108560c = new FrameLayout(fragment.requireContext());
        ArrayList<IStatusHeader> arrayList = new ArrayList();
        this.f108559a = arrayList;
        C42659b bVar = new C42659b(this);
        this.f108561d = bVar;
        StorageLimitTipsComponent aVar = new StorageLimitTipsComponent(fragment, bVar, false, 4, null);
        this.f108562e = aVar;
        NetworkTipsComponent bVar2 = new NetworkTipsComponent(fragment, bVar, false, 4, null);
        this.f108563f = bVar2;
        MigrationTipsComponent bVar3 = new MigrationTipsComponent(fragment, bVar, false, 4, null);
        this.f108564g = bVar3;
        AutoReplyTipsComponent bVar4 = new AutoReplyTipsComponent(fragment, bVar, false, 4, null);
        this.f108565h = bVar4;
        arrayList.add(aVar);
        arrayList.add(bVar2);
        arrayList.add(bVar3);
        arrayList.add(bVar4);
        for (IStatusHeader aVar2 : arrayList) {
            this.f108560c.addView(aVar2.mo153210c());
        }
    }
}
