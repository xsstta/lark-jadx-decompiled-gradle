package com.bytedance.ee.bear.list.more.itemv2;

import android.content.Context;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.C8674q;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.share.C8754z;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

public class SetHiddenItemV2 extends BaseMoreItem implements IGridMoreItem {
    public Context mContext;
    public Document mDocument;
    public String mModule;
    private C10917c mServiceContext;
    public String mSource;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "set_hiddenV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return this.mDocument.mo32402R();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        if (this.mDocument.ab()) {
            return R.drawable.ud_icon_visible_lock_outlined;
        }
        return R.drawable.ud_icon_visible_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        int i;
        if (this.mDocument.ab()) {
            i = R.string.Doc_List_SetDisplay;
        } else {
            i = R.string.Doc_List_SetHidden;
        }
        return getString(i);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        C13479a.m54772d("SetHiddenItemV2", "onItemClick: moreInfo = " + getMoreInfo());
        new C8754z().mo33784a(this.mDocument.ab(), (NetService) KoinJavaComponent.m268610a(NetService.class), this.mDocument.mo32472o(), new C8630a(this));
        getHost().mo39166c();
    }

    /* renamed from: com.bytedance.ee.bear.list.more.itemv2.SetHiddenItemV2$a */
    private static class C8630a implements AbstractC5204e<NetService.Result> {

        /* renamed from: a */
        private WeakReference<SetHiddenItemV2> f23374a;

        C8630a(SetHiddenItemV2 setHiddenItemV2) {
            this.f23374a = new WeakReference<>(setHiddenItemV2);
        }

        /* renamed from: a */
        public void mo20806a(NetService.Result result) {
            int i;
            C13479a.m54764b("SetHiddenItemV2", "SetHiddenCallback#onSuccess()...");
            if (this.f23374a.get() != null) {
                SetHiddenItemV2 setHiddenItemV2 = this.f23374a.get();
                if (setHiddenItemV2.mDocument.ab()) {
                    i = R.string.Doc_List_DisplaySuccessfully;
                } else {
                    i = R.string.Doc_List_HiddenSuccessfully;
                }
                Toast.showSuccessText(setHiddenItemV2.mContext, setHiddenItemV2.mContext.getString(i), 0);
                ListAnalysis.m32505a(C5234y.m21391b(), setHiddenItemV2.mSource, setHiddenItemV2.mModule, true, setHiddenItemV2.mDocument.ab(), setHiddenItemV2.mDocument.mo32472o());
                C8674q.m36243f().mo33647a(setHiddenItemV2.mDocument.mo32472o(), !setHiddenItemV2.mDocument.ab());
                return;
            }
            C13479a.m54764b("SetHiddenItemV2", "SetHiddenCallback#onSuccess()...itemRef = null");
        }

        @Override // com.bytedance.ee.bear.contract.net.AbstractC5204e
        /* renamed from: a */
        public void mo20807a(Throwable th) {
            C13479a.m54758a("SetHiddenItemV2", "handleHidden() fail..., throwable = " + th);
            if (this.f23374a.get() != null) {
                SetHiddenItemV2 setHiddenItemV2 = this.f23374a.get();
                Toast.showFailureText(setHiddenItemV2.mContext, setHiddenItemV2.mContext.getString(R.string.Doc_Facade_OperateFailed), 0);
                ListAnalysis.m32505a(C5234y.m21391b(), setHiddenItemV2.mSource, setHiddenItemV2.mModule, false, setHiddenItemV2.mDocument.ab(), setHiddenItemV2.mDocument.mo32472o());
                return;
            }
            C13479a.m54764b("SetHiddenItemV2", "SetHiddenCallback#onFailed()...itemRef = null");
        }
    }

    public SetHiddenItemV2(Context context, C10917c cVar, Document document, String str, String str2) {
        this.mContext = context;
        this.mServiceContext = cVar;
        this.mDocument = document;
        this.mSource = str;
        this.mModule = str2;
    }
}
