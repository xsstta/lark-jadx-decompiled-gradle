package com.bytedance.ee.bear.list.more.itemv2;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.list.more.itemv2.C8634d;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.more.itemv2.a */
public class C8631a implements C8634d.AbstractC8636b {

    /* renamed from: a */
    protected final FragmentActivity f23375a;

    /* renamed from: b */
    protected final C10917c f23376b;

    /* renamed from: c */
    protected final Document f23377c;

    /* renamed from: d */
    protected final AccountService.Account f23378d;

    /* renamed from: e */
    protected final String f23379e;

    /* renamed from: f */
    protected final String f23380f;

    /* renamed from: g */
    protected final boolean f23381g;

    /* renamed from: h */
    protected final AbstractC8544i.AbstractC8545a f23382h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo32795a(Document document, boolean z) {
        if (z) {
            return R.string.Doc_List_Remove;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.bytedance.ee.bear.list.more.itemv2.C8634d.AbstractC8636b
    /* renamed from: a */
    public MoreItemGroup mo32726a() {
        MoreItemGroup cVar = new MoreItemGroup();
        cVar.mo39169a(1);
        cVar.mo39170a(new ShareItemV2(this.f23375a, this.f23376b, this.f23377c, this.f23378d, this.f23381g, this.f23379e, this.f23380f));
        cVar.mo39170a(mo33579a(this.f23375a, CommonMoreItemId.ADD));
        cVar.mo39170a(mo33579a(this.f23375a, CommonMoreItemId.ADD_SHORT_CUT));
        MoreItemGroup a = cVar.mo39170a(mo33579a(this.f23375a, CommonMoreItemId.STAR)).mo39170a(mo33579a(this.f23375a, CommonMoreItemId.PIN)).mo39170a(mo33579a(this.f23375a, CommonMoreItemId.MANUAL_CACHE));
        Document document = this.f23377c;
        a.mo39170a(new DeleteItemV2(document, mo32795a(document, this.f23381g), this.f23382h));
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IBaseMoreItem mo33579a(FragmentActivity fragmentActivity, CommonMoreItemId commonMoreItemId) {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38964a(fragmentActivity, commonMoreItemId);
    }

    public C8631a(FragmentActivity fragmentActivity, C10917c cVar, Document document, AccountService.Account account, String str, String str2, boolean z, AbstractC8544i.AbstractC8545a aVar) {
        String str3;
        this.f23375a = fragmentActivity;
        this.f23376b = cVar;
        this.f23377c = document;
        this.f23378d = account;
        this.f23381g = z;
        this.f23382h = aVar;
        if (TextUtils.isEmpty(str)) {
            str3 = str2;
        } else {
            str3 = str;
        }
        str2 = TextUtils.isEmpty(str) ? "" : str2;
        this.f23379e = str3;
        this.f23380f = str2;
    }
}
