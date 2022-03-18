package com.ss.android.lark.mail.impl.home.threadlist.header.status.storage;

import com.bytedance.lark.pb.email.client.v1.StorageLimitNotify;
import com.larksuite.arch.jack.JackViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageLimitTipsViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageState;", "()V", "defaultState", "updateCapacityStatus", "", "item", "Lcom/bytedance/lark/pb/email/client/v1/StorageLimitNotify;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.b */
public final class StorageLimitTipsViewModel extends JackViewModel<StorageState> {
    public StorageLimitTipsViewModel() {
        initialize(new Function1<StorageState, StorageState>(this) {
            /* class com.ss.android.lark.mail.impl.home.threadlist.header.status.storage.StorageLimitTipsViewModel.C426701 */
            final /* synthetic */ StorageLimitTipsViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final StorageState invoke(StorageState cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "$receiver");
                return this.this$0.defaultState();
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public StorageState defaultState() {
        return new StorageState(new StorageLimitNotify(0, false, false));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/status/storage/StorageState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.b.d.b$a */
    static final class C42671a extends Lambda implements Function1<StorageState, StorageState> {
        final /* synthetic */ StorageLimitNotify $item;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42671a(StorageLimitNotify storageLimitNotify) {
            super(1);
            this.$item = storageLimitNotify;
        }

        public final StorageState invoke(StorageState cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "$receiver");
            return cVar.mo153300a(this.$item);
        }
    }

    public final void updateCapacityStatus(StorageLimitNotify storageLimitNotify) {
        Intrinsics.checkParameterIsNotNull(storageLimitNotify, "item");
        setState(new C42671a(storageLimitNotify));
    }
}
