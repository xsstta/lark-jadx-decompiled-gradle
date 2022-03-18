package com.ss.android.lark.filedetail.impl.open.diver;

import com.larksuite.framework.callback.AbstractC25968b;
import com.ss.android.lark.filedetail.FileDetailModule;
import com.ss.android.lark.filedetail.dto.AbstractC38215b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/open/diver/NetworkTypeListenerWrapper;", "Lcom/larksuite/framework/callback/CancelableCallback;", "Lcom/ss/android/lark/filedetail/dto/NetworkTypeListener;", "callback", "(Lcom/ss/android/lark/filedetail/dto/NetworkTypeListener;)V", "currentNetworkType", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/filedetail/FileDetailModule$NetworkType;", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.open.diver.e */
public final class NetworkTypeListenerWrapper extends AbstractC25968b<AbstractC38215b> implements AbstractC38215b {
    public NetworkTypeListenerWrapper(AbstractC38215b bVar) {
        super(bVar);
    }

    @Override // com.ss.android.lark.filedetail.dto.AbstractC38215b
    /* renamed from: a */
    public void mo139738a(FileDetailModule.NetworkType networkType) {
        AbstractC38215b bVar = (AbstractC38215b) this.callback;
        if (bVar != null) {
            bVar.mo139738a(networkType);
        }
    }
}
