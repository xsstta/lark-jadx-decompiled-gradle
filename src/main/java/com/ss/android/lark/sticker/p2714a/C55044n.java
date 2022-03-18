package com.ss.android.lark.sticker.p2714a;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.SendShareStickerSetRequest;
import com.bytedance.lark.pb.im.v1.SendShareStickerSetResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.core.api.resource.StickerSetDownloadState;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.sticker.C54996a;
import com.ss.android.lark.sticker.api.C55052a;
import com.ss.android.lark.sticker.api.C55054b;
import com.ss.android.lark.sticker.api.C55057d;
import com.ss.android.lark.sticker.api.C55060f;
import com.ss.android.lark.sticker.api.C55061g;
import com.ss.android.lark.sticker.api.C55063h;
import com.ss.android.lark.sticker.api.GetStickerSetsStoreRequest;
import com.ss.android.lark.sticker.p2715b.AbstractC55069e;
import com.ss.android.lark.sticker.ui.p2717b.C55094b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.a.n */
public class C55044n implements AbstractC55069e {

    /* renamed from: a */
    public List<StickerSet> f136001a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.a.n$a */
    public static class C55048a {

        /* renamed from: a */
        static C55044n f136005a = new C55044n();
    }

    /* renamed from: a */
    public static C55044n m213720a() {
        return C55048a.f136005a;
    }

    /* renamed from: a */
    public void mo187879a(List<String> list, String str) {
        C54996a.m213619a().mo144100d().mo144115a(list, str, new IGetDataCallback<StickerSetDownloadState>() {
            /* class com.ss.android.lark.sticker.p2714a.C55044n.C550473 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("StickerSetService", "failed to getStickerSetArchiveDownloadState. e:" + errorResult);
            }

            /* renamed from: a */
            public void onSuccess(StickerSetDownloadState stickerSetDownloadState) {
                if (stickerSetDownloadState != null) {
                    for (StickerSet stickerSet : C55044n.this.f136001a) {
                        if (!stickerSetDownloadState.isDownloaded(stickerSet.getStickerSetId())) {
                            C55044n.this.mo187872a(stickerSet);
                        }
                    }
                }
            }
        });
    }

    private C55044n() {
        this.f136001a = new ArrayList();
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55069e
    /* renamed from: b */
    public void mo187880b() {
        mo187871a(new IGetDataCallback<List<StickerSet>>() {
            /* class com.ss.android.lark.sticker.p2714a.C55044n.C550462 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("StickerSetService", "failed to preDownload. e:" + errorResult);
            }

            /* renamed from: a */
            public void onSuccess(List<StickerSet> list) {
                if (!CollectionUtils.isEmpty(list)) {
                    C55044n.this.f136001a.clear();
                    C55044n.this.f136001a.addAll(list);
                    ArrayList arrayList = new ArrayList();
                    for (StickerSet stickerSet : list) {
                        arrayList.add(stickerSet.getStickerSetId());
                    }
                    C55044n.this.mo187879a(arrayList, C55049o.m213737b(C54996a.m213619a().mo144097a()));
                }
            }
        });
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55069e
    /* renamed from: a */
    public void mo187871a(IGetDataCallback<List<StickerSet>> iGetDataCallback) {
        new C55057d().mo187899a(iGetDataCallback);
    }

    /* renamed from: a */
    public void mo187872a(StickerSet stickerSet) {
        C54998c.m213641a().mo187822a(stickerSet.getStickerSetId(), C55049o.m213737b(C54996a.m213619a().mo144097a()), stickerSet.getArchiveUrl());
    }

    /* renamed from: a */
    public void mo187873a(GetStickerSetsStoreRequest getStickerSetsStoreRequest, IGetDataCallback<C55060f> iGetDataCallback) {
        getStickerSetsStoreRequest.mo187884a(iGetDataCallback);
    }

    /* renamed from: a */
    public void mo187874a(C55052a aVar, IGetDataCallback<Boolean> iGetDataCallback) {
        aVar.mo187890a(iGetDataCallback);
    }

    /* renamed from: a */
    public void mo187875a(C55054b bVar, IGetDataCallback<C55094b> iGetDataCallback) {
        bVar.mo187894a(iGetDataCallback);
    }

    /* renamed from: a */
    public void mo187876a(C55057d dVar, IGetDataCallback<List<StickerSet>> iGetDataCallback) {
        dVar.mo187899a(iGetDataCallback);
    }

    /* renamed from: a */
    public void mo187877a(C55061g gVar, IGetDataCallback<Boolean> iGetDataCallback) {
        gVar.mo187907a(iGetDataCallback);
    }

    /* renamed from: a */
    public void mo187878a(C55063h hVar, IGetDataCallback<Boolean> iGetDataCallback) {
        hVar.mo187910a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55069e
    /* renamed from: a */
    public void mo187870a(Context context, String str, List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        SendShareStickerSetRequest.C18027a aVar = new SendShareStickerSetRequest.C18027a();
        if (!CollectionUtils.isEmpty(list)) {
            aVar.mo62609a(str).mo62611b(list.get(0));
            SdkSender.asynSendRequestNonWrap(Command.SHARE_STICKER_SET_CARD, aVar, iGetDataCallback, new SdkSender.IParser<Boolean>() {
                /* class com.ss.android.lark.sticker.p2714a.C55044n.C550451 */

                /* renamed from: a */
                public Boolean parse(byte[] bArr) throws IOException {
                    SendShareStickerSetResponse.ADAPTER.decode(bArr);
                    return true;
                }
            });
        }
    }
}
