package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import com.bytedance.ee.bear.dto.DocImagesForwardData;
import com.bytedance.ee.bear.dto.DocShareTextData;
import com.bytedance.ee.bear.lark.p414b.AbstractC8001l;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.ShareDataForwardData;
import com.ss.android.lark.biz.core.api.ShareTextForwardData;
import com.ss.android.lark.biz.im.api.C29601ad;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.p1409b.C29609a;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.z */
public class C39344z implements AbstractC8001l {
    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: a */
    public Chatter mo31004a(String str) {
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getChatterById(str);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: b */
    public ChatSetting mo31012b(String str) {
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getLocalChatSetting(str);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: a */
    public String mo31005a(Chatter chatter) {
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getDisplayName(chatter, ChatterNameDisplayRule.NAME);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: b */
    public Map<String, Chatter> mo31013b(List<String> list) {
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).syncGetChattersByIds(list);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: a */
    public Map<String, Chatter> mo31006a(List<String> list) {
        return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getLocalChatters(list);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: a */
    public void mo31007a(Context context, DocImagesForwardData docImagesForwardData) {
        CommonShareData commonShareData = new CommonShareData();
        commonShareData.setTitle(docImagesForwardData.getTitle());
        commonShareData.setContent(docImagesForwardData.getContent());
        commonShareData.setFiles(docImagesForwardData.getFiles());
        commonShareData.setImages(docImagesForwardData.getImages());
        commonShareData.setShareFileScene(3);
        boolean z = true;
        commonShareData.setLocalShare(true);
        commonShareData.setSource(docImagesForwardData.getSource());
        ShareDataForwardData shareDataForwardData = new ShareDataForwardData();
        shareDataForwardData.setImages(commonShareData.getImages());
        if (commonShareData.getShareFileScene() == 2) {
            z = false;
        }
        shareDataForwardData.setSystemShare(z);
        shareDataForwardData.setSourceData(commonShareData);
        shareDataForwardData.setCanAddExtraInfo(docImagesForwardData.isCanAddExtraInfo());
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goShareForwardSelectPage(context, shareDataForwardData);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: a */
    public void mo31008a(Context context, DocShareTextData docShareTextData) {
        ShareTextForwardData shareTextForwardData = new ShareTextForwardData(docShareTextData.getTitle(), docShareTextData.getContent(), docShareTextData.getSourceName(), docShareTextData.isLocalShare());
        shareTextForwardData.setSupportAdditionNote(docShareTextData.isCanAddExtraInfo());
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).goShareForwardSelectPage(context, shareTextForwardData);
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: a */
    public void mo31009a(Context context, String str) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).openChat(context, ChatBundle.m109259a().mo105927a(str).mo105929a());
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: a */
    public void mo31010a(String str, String str2, String str3, RichText richText) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).sendMessage(((C29601ad.C29603a) ((C29601ad.C29603a) ((C29601ad.C29603a) C29601ad.m109464a().mo125332j(str)).mo125330h(str2)).mo125331i(str3)).mo106659a(richText).mo106660a());
    }

    @Override // com.bytedance.ee.bear.lark.p414b.AbstractC8001l
    /* renamed from: a */
    public void mo31011a(String str, boolean z, String str2, RichText richText, IGetDataCallback<String> iGetDataCallback) {
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).sendMessage(((C29609a.C29610a) C29609a.m109497a().mo125332j(str)).mo106695b(z).mo106692a(str2).mo106691a(richText).mo106694a(), iGetDataCallback);
    }
}
