package com.ss.android.lark.mail.impl.home.threadlist.header.filter;

import androidx.lifecycle.LifecycleObserver;
import com.bytedance.lark.pb.email.client.v1.FilterType;
import com.larksuite.arch.jack.JackViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterHeaderViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterState;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "defaultState", "setFilterType", "", "filterType", "Lcom/bytedance/lark/pb/email/client/v1/FilterType;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FilterHeaderViewModel extends JackViewModel<FilterState> implements LifecycleObserver {
    public FilterHeaderViewModel() {
        initialize(new Function1<FilterState, FilterState>(this) {
            /* class com.ss.android.lark.mail.impl.home.threadlist.header.filter.FilterHeaderViewModel.C426721 */
            final /* synthetic */ FilterHeaderViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final FilterState invoke(FilterState bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                return this.this$0.defaultState();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public FilterState defaultState() {
        return new FilterState(false);
    }

    public final void setFilterType(FilterType filterType) {
        Intrinsics.checkParameterIsNotNull(filterType, "filterType");
        setState(new C42673a(filterType));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/filter/FilterState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.filter.FilterHeaderViewModel$a */
    public static final class C42673a extends Lambda implements Function1<FilterState, FilterState> {
        final /* synthetic */ FilterType $filterType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42673a(FilterType filterType) {
            super(1);
            this.$filterType = filterType;
        }

        public final FilterState invoke(FilterState bVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            if (this.$filterType == FilterType.UNREAD) {
                z = true;
            } else {
                z = false;
            }
            return new FilterState(z);
        }
    }
}
