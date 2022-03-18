package com.ss.android.lark.integrator.im.dependency;

import android.app.Activity;
import android.content.Context;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.page.IDocPageLoader;
import com.ss.android.lark.dependency.AbstractC36498n;
import com.ss.android.lark.doc.entity.AbstractC36839d;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.utils.ApiUtils;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.dependency.c */
public class C39560c implements AbstractC36498n {
    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: a */
    public int mo134667a(DocType docType) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocInlineBlueIcon(docType);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: b */
    public int mo134675b(DocType docType) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocInlineGrayIcon(docType);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: b */
    public String[] mo134676b(String str) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).parseDocUrl(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: a */
    public IDocPageLoader mo134669a(String str) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocPageLoader(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: a */
    public AbstractC36839d mo134671a(Context context) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocCardViewBinder(context);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: a */
    public void mo134674a(List<String> list) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).preloadDoc(list);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: a */
    public IPlusItem mo134668a(Context context, Chat chat) {
        return C39603g.m157159a().getCCMDependency().mo143289a(context, chat);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: a */
    public DocResult mo134670a(String str, C14928Entity entity) {
        return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).parseDocResultFromPb(str, entity);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: a */
    public void mo134673a(String str, final IGetDataCallback<AbstractC36498n.C36499a> iGetDataCallback) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).convertDocToken(str, new IGetDataCallback<ICCMApi.C32801a>() {
            /* class com.ss.android.lark.integrator.im.dependency.C39560c.C395611 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(ICCMApi.C32801a aVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    if (aVar == null) {
                        iGetDataCallback.onSuccess(null);
                        return;
                    }
                    AbstractC36498n.C36499a aVar2 = new AbstractC36498n.C36499a();
                    aVar2.f94030b = aVar.f84175b;
                    aVar2.f94029a = aVar.f84174a;
                    iGetDataCallback.onSuccess(aVar2);
                }
            }
        });
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: a */
    public int mo134666a(int i, String str, boolean z) {
        if (z) {
            return C39603g.m157159a().getCCMDependency().mo143298b(i, str);
        }
        return C39603g.m157159a().getCCMDependency().mo143288a(i, str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36498n
    /* renamed from: a */
    public void mo134672a(Activity activity, Map<String, Map<String, DocResult>> map, final AbstractC36498n.AbstractC36500b bVar) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).doDocPermAuthBeforeChatP2pToGroup(activity, map, new ICCMApi.AbstractC32802b() {
            /* class com.ss.android.lark.integrator.im.dependency.C39560c.C395622 */

            @Override // com.ss.android.lark.ccm_api.ICCMApi.AbstractC32802b
            /* renamed from: a */
            public void mo120920a() {
                AbstractC36498n.AbstractC36500b bVar = bVar;
                if (bVar != null) {
                    bVar.mo123794a();
                }
            }

            @Override // com.ss.android.lark.ccm_api.ICCMApi.AbstractC32802b
            /* renamed from: b */
            public void mo120922b() {
                AbstractC36498n.AbstractC36500b bVar = bVar;
                if (bVar != null) {
                    bVar.mo123796b();
                }
            }

            @Override // com.ss.android.lark.ccm_api.ICCMApi.AbstractC32802b
            /* renamed from: a */
            public void mo120921a(Map<String, Map<String, DocPermPair.PermType>> map) {
                AbstractC36498n.AbstractC36500b bVar = bVar;
                if (bVar != null) {
                    bVar.mo123795a(map);
                }
            }
        });
    }
}
