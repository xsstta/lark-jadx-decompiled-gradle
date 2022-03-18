package com.ss.android.lark.sticker.p2714a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.CreateCustomizedStickersRequest;
import com.bytedance.lark.pb.im.v1.CreateCustomizedStickersResponse;
import com.bytedance.lark.pb.im.v1.DeleteCustomizedStickersRequest;
import com.bytedance.lark.pb.im.v1.DeleteCustomizedStickersResponse;
import com.bytedance.lark.pb.im.v1.GetCustomizedStickersRequest;
import com.bytedance.lark.pb.im.v1.GetCustomizedStickersResponse;
import com.bytedance.lark.pb.im.v1.ImageKeyData;
import com.bytedance.lark.pb.im.v1.UpdateCustomizedStickersRequest;
import com.bytedance.lark.pb.im.v1.UpdateCustomizedStickersResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.sticker.C54996a;
import com.ss.android.lark.sticker.dependency.IStickerModuleDependency;
import com.ss.android.lark.sticker.dto.C55076b;
import com.ss.android.lark.sticker.dto.C55077c;
import com.ss.android.lark.sticker.dto.C55078d;
import com.ss.android.lark.sticker.dto.StickerFileInfo;
import com.ss.android.lark.sticker.dto.UISticker;
import com.ss.android.lark.sticker.p2715b.AbstractC55068d;
import com.ss.android.lark.utils.C57820d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.sticker.a.k */
public class C55027k implements AbstractC55068d {

    /* renamed from: a */
    public String f135982a;

    /* renamed from: b */
    public final IStickerModuleDependency.AbstractC55074e f135983b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sticker.a.k$a */
    public static class C55036a {

        /* renamed from: a */
        static C55027k f135993a = new C55027k();
    }

    /* renamed from: a */
    public static C55027k m213686a() {
        return C55036a.f135993a;
    }

    private C55027k() {
        this.f135983b = C54996a.m213619a().mo144098b();
        this.f135982a = C55049o.m213735a(C54996a.m213619a().mo144097a());
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55068d
    /* renamed from: b */
    public List<Sticker> mo187853b() {
        return (List) SdkSender.syncSend(Command.GET_CUSTOMIZED_STICKERS, new GetCustomizedStickersRequest.C17562a(), new SdkSender.IParser<List<Sticker>>() {
            /* class com.ss.android.lark.sticker.p2714a.C55027k.C550281 */

            /* renamed from: a */
            public List<Sticker> parse(byte[] bArr) throws IOException {
                return C55037l.m213714b(GetCustomizedStickersResponse.ADAPTER.decode(bArr).stickers);
            }
        });
    }

    /* renamed from: a */
    private IGetDataCallback<List<Sticker>> m213685a(final IGetDataCallback<List<Sticker>> iGetDataCallback) {
        return new IGetDataCallback<List<Sticker>>() {
            /* class com.ss.android.lark.sticker.p2714a.C55027k.C550292 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(List<Sticker> list) {
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Sticker sticker : list) {
                        arrayList.add(sticker.getOriginImageKey());
                    }
                    C55007g.m213664a(arrayList, C55027k.this.f135983b);
                }
                iGetDataCallback.onSuccess(list);
            }
        };
    }

    /* renamed from: c */
    public Map<String, StickerFileInfo> mo187856c(List<String> list) {
        return mo187848a(list, "");
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55068d
    /* renamed from: b */
    public StickerFileInfo mo187852b(String str) {
        return mo187856c(Collections.singletonList(str)).get(str);
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55068d
    /* renamed from: a */
    public Sticker mo187845a(String str) {
        for (Sticker sticker : mo187853b()) {
            if (TextUtils.equals(sticker.getOriginImageKey(), str)) {
                return sticker;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Map<String, String> mo187847a(List<String> list) {
        Map<String, StickerFileInfo> c = mo187856c(list);
        HashMap hashMap = new HashMap();
        for (StickerFileInfo stickerFileInfo : c.values()) {
            hashMap.put(stickerFileInfo.getKey(), stickerFileInfo.getFilePath());
        }
        return hashMap;
    }

    /* renamed from: b */
    public List<UISticker> mo187854b(List<Sticker> list) {
        Collections.sort(list);
        ArrayList arrayList = new ArrayList();
        for (Sticker sticker : list) {
            arrayList.add(sticker.getOriginImageKey());
        }
        Map<String, String> a = mo187847a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Sticker sticker2 : list) {
            UISticker uISticker = new UISticker();
            uISticker.setSticker(sticker2);
            if (a.containsKey(sticker2.getOriginImageKey())) {
                uISticker.setFilePath(a.get(sticker2.getOriginImageKey()));
            }
            arrayList2.add(uISticker);
        }
        return arrayList2;
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55068d
    /* renamed from: a */
    public C55076b mo187846a(int i, int i2) {
        return (C55076b) SdkSender.sendRequest(Command.GET_CUSTOMIZED_STICKERS, new GetCustomizedStickersRequest.C17562a(), new SdkSender.IParser<C55076b>() {
            /* class com.ss.android.lark.sticker.p2714a.C55027k.C550303 */

            /* renamed from: a */
            public C55076b parse(byte[] bArr) throws IOException {
                return new C55076b(C55037l.m213714b(GetCustomizedStickersResponse.ADAPTER.decode(bArr).stickers), true);
            }
        });
    }

    /* renamed from: c */
    public void mo187857c(List<Sticker> list, IGetDataCallback<List<Sticker>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_CUSTOMIZED_STICKERS, new UpdateCustomizedStickersRequest.C18149a().mo62953a(C55012h.m213672a(list)), m213685a(iGetDataCallback), new SdkSender.IParser<List<Sticker>>() {
            /* class com.ss.android.lark.sticker.p2714a.C55027k.C550347 */

            /* renamed from: a */
            public List<Sticker> parse(byte[] bArr) throws IOException {
                UpdateCustomizedStickersResponse.ADAPTER.decode(bArr);
                return new ArrayList();
            }
        });
    }

    /* renamed from: b */
    public void mo187855b(List<Sticker> list, IGetDataCallback<List<Sticker>> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.DELETE_CUSTOMIZED_STICKERS, new DeleteCustomizedStickersRequest.C17404a().mo61076a(C55012h.m213672a(list)), m213685a(iGetDataCallback), new SdkSender.IParser<List<Sticker>>() {
            /* class com.ss.android.lark.sticker.p2714a.C55027k.C550336 */

            /* renamed from: a */
            public List<Sticker> parse(byte[] bArr) throws IOException {
                DeleteCustomizedStickersResponse.ADAPTER.decode(bArr);
                return new ArrayList();
            }
        });
    }

    /* renamed from: a */
    public Map<String, StickerFileInfo> mo187848a(List<String> list, String str) {
        HashMap hashMap = new HashMap();
        String str2 = this.f135982a;
        if (!TextUtils.isEmpty(str)) {
            str2 = C55049o.m213736a(C54996a.m213619a().mo144097a(), str);
        }
        Map<String, C55077c> b = this.f135983b.mo144107b(str2, list);
        if (b == null) {
            return hashMap;
        }
        for (C55077c cVar : b.values()) {
            if (cVar != null) {
                StickerFileInfo stickerFileInfo = new StickerFileInfo();
                String a = cVar.mo187955a();
                stickerFileInfo.setKey(a);
                stickerFileInfo.setFilePath(cVar.mo187956b());
                stickerFileInfo.setUrl(cVar.mo187956b());
                hashMap.put(a, stickerFileInfo);
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55068d
    /* renamed from: a */
    public void mo187850a(List<Sticker> list, IGetDataCallback<Boolean> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CREATE_CUSTOMIZED_STICKERS, new CreateCustomizedStickersRequest.C17344a().mo60898a(CreateCustomizedStickersRequest.Type.KEY).mo60899a(C55012h.m213672a(list)), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.sticker.p2714a.C55027k.C550314 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return Boolean.valueOf(CollectionUtils.isEmpty(CreateCustomizedStickersResponse.ADAPTER.decode(bArr).failed_paths));
            }
        });
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55068d
    /* renamed from: a */
    public void mo187849a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ImageKeyData(str, str2));
        SdkSender.asynSendRequestNonWrap(Command.CREATE_CUSTOMIZED_STICKERS, new CreateCustomizedStickersRequest.C17344a().mo60898a(CreateCustomizedStickersRequest.Type.IMAGE_KEY_V1).mo60902c(arrayList), iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.sticker.p2714a.C55027k.C550325 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                return Boolean.valueOf(CollectionUtils.isEmpty(CreateCustomizedStickersResponse.ADAPTER.decode(bArr).failed_paths));
            }
        });
    }

    @Override // com.ss.android.lark.sticker.p2715b.AbstractC55068d
    /* renamed from: a */
    public void mo187851a(List<String> list, boolean z, IGetDataCallback<C55078d> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            C57820d.C57821a a = C57820d.m224434a(str);
            File file = new File(str);
            if (C54996a.m213619a().mo144103g().mo144120a(C26311p.m95281c(file), ((long) a.f142420a) * ((long) a.f142421b), a.f142422c)) {
                iGetDataCallback.onError(new ErrorResult(1, file.getName()));
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            iGetDataCallback.onError(new ErrorResult(2, "no result"));
            return;
        }
        SdkSender.asynSendRequestNonWrap(Command.CREATE_CUSTOMIZED_STICKERS, new CreateCustomizedStickersRequest.C17344a().mo60898a(CreateCustomizedStickersRequest.Type.IMAGE_PATH).mo60901b(arrayList), iGetDataCallback, new SdkSender.IParser<C55078d>() {
            /* class com.ss.android.lark.sticker.p2714a.C55027k.C550358 */

            /* renamed from: a */
            public C55078d parse(byte[] bArr) throws IOException {
                return new C55078d(new ArrayList(), CreateCustomizedStickersResponse.ADAPTER.decode(bArr).failed_paths);
            }
        });
    }
}
