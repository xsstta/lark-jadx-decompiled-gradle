package com.bytedance.ee.bear.list.more.itemv2;

import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.C7718l;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.AbstractC10209c;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.more.itemv2.d */
public class C8634d {

    /* renamed from: a */
    private final C7718l f23392a;

    /* renamed from: b */
    private final C10917c f23393b;

    /* renamed from: c */
    private final Document f23394c;

    /* renamed from: d */
    private final ShareFolderUserPermission f23395d;

    /* renamed from: e */
    private final AbstractC8635a f23396e;

    /* renamed from: f */
    private final AbstractC8636b f23397f;

    /* renamed from: g */
    private final AbstractC8636b f23398g;

    /* renamed from: com.bytedance.ee.bear.list.more.itemv2.d$a */
    public interface AbstractC8635a {
        /* renamed from: a */
        Bundle mo32808a();
    }

    /* renamed from: com.bytedance.ee.bear.list.more.itemv2.d$b */
    public interface AbstractC8636b {
        /* renamed from: a */
        MoreItemGroup mo32726a();
    }

    /* renamed from: a */
    public void mo33583a() {
        ArrayList<MoreItemGroup> arrayList = new ArrayList<>();
        arrayList.add(this.f23397f.mo32726a());
        arrayList.add(this.f23398g.mo32726a());
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38962a(this.f23392a.getActivity(), arrayList, new C8637e(this.f23393b, this.f23394c, this.f23396e.mo32808a(), this.f23395d).mo33584a(), C8292f.m34188e(this.f23394c), (AbstractC10209c) null, this.f23396e.mo32808a());
    }

    public C8634d(C7718l lVar, C10917c cVar, Document document, AbstractC8635a aVar, AbstractC8636b bVar, AbstractC8636b bVar2) {
        this(lVar, cVar, document, aVar, bVar, bVar2, null);
    }

    public C8634d(C7718l lVar, C10917c cVar, Document document, AbstractC8635a aVar, AbstractC8636b bVar, AbstractC8636b bVar2, ShareFolderUserPermission shareFolderUserPermission) {
        this.f23392a = lVar;
        this.f23393b = cVar;
        this.f23394c = document;
        this.f23396e = aVar;
        this.f23397f = bVar;
        this.f23398g = bVar2;
        this.f23395d = shareFolderUserPermission;
    }
}
