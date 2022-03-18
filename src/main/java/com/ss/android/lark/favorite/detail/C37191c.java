package com.ss.android.lark.favorite.detail;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.AbstractC32901c;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.favorite.detail.C37198e;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.favorite.detail.c */
public class C37191c extends BaseModel implements C37198e.AbstractC37199a {

    /* renamed from: a */
    AbstractC36474h f95560a = C29990c.m110930b();

    /* renamed from: b */
    AbstractC32901c f95561b = C32835d.m126323c();

    /* renamed from: c */
    private C37198e.AbstractC37199a.AbstractC37200a f95562c;

    /* renamed from: d */
    private FavoriteMessageInfo f95563d;

    /* renamed from: e */
    private AbstractC36450aa f95564e = this.f95560a.mo134515N();

    @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37199a
    /* renamed from: b */
    public FavoriteMessageInfo mo136857b() {
        return this.f95563d;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m146499a(true);
    }

    @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37199a
    /* renamed from: a */
    public List<FavoriteMessageInfo> mo136854a() {
        return C29990c.m110930b().mo134522U().mo134617a(this.f95563d);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f95562c = null;
        m146499a(false);
        super.destroy();
    }

    /* renamed from: a */
    public void mo136856a(C37198e.AbstractC37199a.AbstractC37200a aVar) {
        this.f95562c = aVar;
    }

    public C37191c(FavoriteMessageInfo favoriteMessageInfo) {
        this.f95563d = favoriteMessageInfo;
    }

    @Override // com.ss.android.lark.favorite.detail.C37198e.AbstractC37199a
    /* renamed from: a */
    public void mo136855a(final IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback) {
        C29990c.m110930b().mo134522U().mo134619a(Collections.singletonList(this.f95563d.getId()), new IGetDataCallback<List<FavoriteMessageInfo>>() {
            /* class com.ss.android.lark.favorite.detail.C37191c.C371921 */

            /* renamed from: a */
            public void onSuccess(List<FavoriteMessageInfo> list) {
                iGetDataCallback.onSuccess(list);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }
        });
    }

    /* renamed from: a */
    private void m146499a(boolean z) {
        FavoriteMessageInfo favoriteMessageInfo;
        if (z || !((favoriteMessageInfo = this.f95563d) == null || favoriteMessageInfo.getSourceMessage() == null || this.f95563d.getSourceMessage().getType() != Message.Type.AUDIO)) {
            C36894a.m145605a().mo136207d();
        }
    }
}
