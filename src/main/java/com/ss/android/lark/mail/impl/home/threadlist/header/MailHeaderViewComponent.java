package com.ss.android.lark.mail.impl.home.threadlist.header;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.lark.mail.impl.home.threadlist.header.filter.FilterHeaderComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.outbox.OutboxHeaderComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxComponent;
import com.ss.android.lark.mail.impl.home.threadlist.header.status.StatusHeaderComponent;
import com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/MailHeaderViewComponent;", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "filterComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterHeaderComponent;", "getFilterComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterHeaderComponent;", "getFragment", "()Landroidx/fragment/app/Fragment;", "headerComponents", "", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/HeaderComponentViewGetter;", "mHeaderViewLayout", "Landroid/widget/LinearLayout;", "outboxComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderComponent;", "getOutboxComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/outbox/OutboxHeaderComponent;", "smartInboxComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxComponent;", "getSmartInboxComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxComponent;", "statusComponent", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/StatusHeaderComponent;", "getStatusComponent", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/StatusHeaderComponent;", "init", "", "recyclerView", "Lcom/ss/android/lark/mail/impl/widget/HeaderFooterRecyclerView;", "onDestroy", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b */
public final class MailHeaderViewComponent {

    /* renamed from: a */
    private final FilterHeaderComponent f108531a;

    /* renamed from: b */
    private final StatusHeaderComponent f108532b;

    /* renamed from: c */
    private final OutboxHeaderComponent f108533c;

    /* renamed from: d */
    private final SmartInboxComponent f108534d;

    /* renamed from: e */
    private final List<HeaderComponentViewGetter> f108535e;

    /* renamed from: f */
    private final LinearLayout f108536f;

    /* renamed from: g */
    private final Fragment f108537g;

    /* renamed from: e */
    public final void mo153240e() {
    }

    /* renamed from: a */
    public final FilterHeaderComponent mo153235a() {
        return this.f108531a;
    }

    /* renamed from: b */
    public final StatusHeaderComponent mo153237b() {
        return this.f108532b;
    }

    /* renamed from: c */
    public final OutboxHeaderComponent mo153238c() {
        return this.f108533c;
    }

    /* renamed from: d */
    public final SmartInboxComponent mo153239d() {
        return this.f108534d;
    }

    /* renamed from: a */
    public final void mo153236a(HeaderFooterRecyclerView headerFooterRecyclerView) {
        Intrinsics.checkParameterIsNotNull(headerFooterRecyclerView, "recyclerView");
        headerFooterRecyclerView.mo156539a(this.f108536f);
        for (HeaderComponentViewGetter aVar : this.f108535e) {
            this.f108536f.addView(aVar.mo153210c());
        }
    }

    public MailHeaderViewComponent(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f108537g = fragment;
        ArrayList arrayList = new ArrayList();
        FilterHeaderComponent aVar = new FilterHeaderComponent(fragment);
        this.f108531a = aVar;
        StatusHeaderComponent cVar = new StatusHeaderComponent(fragment);
        this.f108532b = cVar;
        OutboxHeaderComponent bVar = new OutboxHeaderComponent(fragment);
        this.f108533c = bVar;
        SmartInboxComponent smartInboxComponent = new SmartInboxComponent(fragment);
        this.f108534d = smartInboxComponent;
        arrayList.add(aVar);
        arrayList.add(cVar);
        arrayList.add(bVar);
        arrayList.add(smartInboxComponent);
        this.f108535e = arrayList;
        LinearLayout linearLayout = new LinearLayout(fragment.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f108536f = linearLayout;
    }
}
