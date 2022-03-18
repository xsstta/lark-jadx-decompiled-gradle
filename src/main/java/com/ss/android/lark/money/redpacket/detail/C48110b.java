package com.ss.android.lark.money.redpacket.detail;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.message.content.RedPacketContent;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.redpacket.detail.C48106a;
import com.ss.android.lark.money.redpacket.dto.RedPacketDataWrapper;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetail;
import com.ss.android.lark.money.redpacket.dto.RedPacketDetailItem;
import com.ss.android.lark.money.redpacket.dto.RedPacketGrabResponse;
import com.ss.android.lark.money.redpacket.dto.RedPacketInfo;
import com.ss.android.lark.money.redpacket.p2369b.AbstractC48037a;
import com.ss.android.lark.money.redpacket.p2369b.C48040d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.money.redpacket.detail.b */
public class C48110b extends BaseModel implements C48106a.AbstractC48107a {

    /* renamed from: a */
    public RedPacketInfo f121093a;

    /* renamed from: b */
    public List<RedPacketDetailItem> f121094b = new ArrayList();

    /* renamed from: c */
    public String f121095c;

    /* renamed from: d */
    public boolean f121096d = true;

    /* renamed from: e */
    public volatile boolean f121097e = false;

    /* renamed from: f */
    public String f121098f;

    /* renamed from: g */
    public String f121099g;

    /* renamed from: h */
    private AbstractC48037a f121100h = C48040d.m189602a();

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48107a
    /* renamed from: a */
    public boolean mo168442a() {
        return this.f121096d;
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48107a
    /* renamed from: b */
    public boolean mo168444b() {
        return this.f121097e;
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48107a
    /* renamed from: c */
    public RedPacketInfo mo168445c() {
        return this.f121093a;
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48107a
    /* renamed from: d */
    public List<RedPacketDetailItem> mo168447d() {
        return this.f121094b;
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48107a
    /* renamed from: e */
    public String mo168448e() {
        return this.f121098f;
    }

    /* renamed from: f */
    private boolean m189953f() {
        if (this.f121093a.type == RedPacketContent.Type.COMMERCIAL) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48107a
    /* renamed from: b */
    public void mo168443b(final IGetDataCallback<RedPacketDataWrapper> iGetDataCallback) {
        this.f121100h.mo168224c(this.f121093a.redPacketId, m189953f(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<RedPacketDataWrapper>() {
            /* class com.ss.android.lark.money.redpacket.detail.C48110b.C481144 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165397w("redpacket", "getRedPacketInfoAndRecord onError id:" + C48110b.this.f121093a.redPacketId);
                if (C48110b.this.f121093a.grabAmount != 0) {
                    RedPacketDataWrapper redPacketDataWrapper = new RedPacketDataWrapper();
                    redPacketDataWrapper.info = C48110b.this.f121093a;
                    redPacketDataWrapper.detail = new RedPacketDetail();
                    iGetDataCallback.onSuccess(redPacketDataWrapper);
                    return;
                }
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(RedPacketDataWrapper redPacketDataWrapper) {
                if (!(C48110b.this.f121093a.grabAmount == 0 || C48110b.this.f121093a.grabAmount == redPacketDataWrapper.info.grabAmount)) {
                    Log.m165383e("redpacket", "getRedPacketInfoAndDetail id:" + C48110b.this.f121093a.redPacketId);
                    redPacketDataWrapper.info.grabAmount = C48110b.this.f121093a.grabAmount;
                }
                C48110b.this.f121093a = redPacketDataWrapper.info;
                int i = 0;
                List<RedPacketDetailItem> list = redPacketDataWrapper.detail.detailList;
                if (CollectionUtils.isNotEmpty(list)) {
                    C48110b.this.f121094b = list;
                    i = list.size();
                }
                C48110b.this.f121095c = redPacketDataWrapper.detail.nextCursor;
                C48110b.this.f121096d = redPacketDataWrapper.detail.hasMore;
                Log.m165389i("redpacket", "mysterious code1:" + C48110b.this.f121093a.redPacketId + ", mysterious code1:" + C48110b.this.f121093a.grabNum + ", mysterious code1:" + C48110b.this.f121093a.totalGrabAmount + ", mysterious code1:" + i);
                iGetDataCallback.onSuccess(redPacketDataWrapper);
            }
        }));
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48107a
    /* renamed from: c */
    public void mo168446c(final IGetDataCallback<RedPacketDataWrapper> iGetDataCallback) {
        this.f121100h.mo168220a(this.f121093a.redPacketId, m189953f(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<RedPacketGrabResponse>() {
            /* class com.ss.android.lark.money.redpacket.detail.C48110b.C481122 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165384e("redpacket", "grabRedPacket onError id: " + C48110b.this.f121093a.redPacketId, errorResult);
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(RedPacketGrabResponse redPacketGrabResponse) {
                Log.m165389i("redpacket", "isRealNameAuthed:" + redPacketGrabResponse.isRealNameAuthed());
                if (!redPacketGrabResponse.isRealNameAuthed()) {
                    C48110b.this.mo168453a(redPacketGrabResponse, iGetDataCallback);
                    return;
                }
                C48110b.this.f121093a.grabAmount = redPacketGrabResponse.getGrabAmount();
                Log.m165389i("redpacket", "mysterious code2：" + C48110b.this.f121093a.redPacketId + ", mysterious code2:" + C48110b.this.f121093a.grabAmount);
                C48110b.this.mo168443b(iGetDataCallback);
            }
        }));
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48107a
    /* renamed from: a */
    public void mo168440a(final IGetDataCallback<List<RedPacketDetailItem>> iGetDataCallback) {
        this.f121097e = true;
        this.f121100h.mo168219a(this.f121093a.redPacketId, this.f121095c, m189953f(), (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<RedPacketDetail>() {
            /* class com.ss.android.lark.money.redpacket.detail.C48110b.C481111 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
                C48110b.this.f121097e = false;
            }

            /* renamed from: a */
            public void onSuccess(RedPacketDetail redPacketDetail) {
                C48110b.this.f121095c = redPacketDetail.nextCursor;
                C48110b.this.f121096d = redPacketDetail.hasMore;
                iGetDataCallback.onSuccess(redPacketDetail.detailList);
                C48110b.this.f121097e = false;
            }
        }));
    }

    /* renamed from: a */
    public void mo168453a(RedPacketGrabResponse redPacketGrabResponse, final IGetDataCallback<RedPacketDataWrapper> iGetDataCallback) {
        final RedPacketDataWrapper redPacketDataWrapper = new RedPacketDataWrapper();
        redPacketDataWrapper.isRealNameAuthed = redPacketGrabResponse.isRealNameAuthed();
        redPacketDataWrapper.authUrl = redPacketGrabResponse.getAuthUrl();
        if (TextUtils.isEmpty(this.f121099g)) {
            this.f121100h.mo168218a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.money.redpacket.detail.C48110b.C481155 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    C48110b.this.f121099g = str;
                    if (iGetDataCallback != null) {
                        redPacketDataWrapper.payToken = C48110b.this.f121099g;
                        iGetDataCallback.onSuccess(redPacketDataWrapper);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165397w("redpacket", "getPayToken: onError: " + errorResult);
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            }));
        } else if (iGetDataCallback != null) {
            redPacketDataWrapper.payToken = this.f121099g;
            iGetDataCallback.onSuccess(redPacketDataWrapper);
        }
    }

    @Override // com.ss.android.lark.money.redpacket.detail.C48106a.AbstractC48107a
    /* renamed from: a */
    public void mo168441a(boolean z, boolean z2) {
        if (TextUtils.isEmpty(this.f121098f)) {
            Log.m165383e("redpacket", "updateRedPacketClickStatus messageId Empty, id:" + this.f121093a.redPacketId);
            return;
        }
        this.f121100h.mo168221a(this.f121098f, m189953f(), z, z2, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.money.redpacket.detail.C48110b.C481133 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165398w("redpacket", "updateRedPacket", errorResult);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Log.m165389i("redpacket", "updateRedPacket id:" + C48110b.this.f121098f);
            }
        }));
    }

    public C48110b(RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail, String str) {
        m189952a(redPacketInfo, redPacketDetail, str);
    }

    /* renamed from: a */
    private void m189952a(RedPacketInfo redPacketInfo, RedPacketDetail redPacketDetail, String str) {
        this.f121093a = redPacketInfo;
        this.f121098f = str;
        if (redPacketDetail != null) {
            this.f121096d = redPacketDetail.hasMore;
            this.f121095c = redPacketDetail.nextCursor;
            if (CollectionUtils.isNotEmpty(redPacketDetail.detailList)) {
                this.f121094b = redPacketDetail.detailList;
            }
        }
    }
}
