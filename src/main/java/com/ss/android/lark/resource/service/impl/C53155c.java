package com.ss.android.lark.resource.service.impl;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.bytedance.lark.pb.basic.v1.SerCrypto;
import com.bytedance.lark.pb.basic.v1.TriggerDataCleanRequest;
import com.bytedance.lark.pb.basic.v1.TriggerDataCleanResponse;
import com.bytedance.lark.pb.media.v1.AvatarFsUnitParams;
import com.bytedance.lark.pb.media.v1.CancelResourceRequest;
import com.bytedance.lark.pb.media.v1.CancelResourceResponse;
import com.bytedance.lark.pb.media.v1.ClearResourcesRequest;
import com.bytedance.lark.pb.media.v1.DownloadFileScene;
import com.bytedance.lark.pb.media.v1.DownloadResourceRequest;
import com.bytedance.lark.pb.media.v1.DownloadResourceResponse;
import com.bytedance.lark.pb.media.v1.DownloadStickerSetArchiveRequest;
import com.bytedance.lark.pb.media.v1.DownloadStickerSetArchiveResponse;
import com.bytedance.lark.pb.media.v1.GetAvatarPathRequest;
import com.bytedance.lark.pb.media.v1.GetAvatarPathResponse;
import com.bytedance.lark.pb.media.v1.GetResourceUrlsRequest;
import com.bytedance.lark.pb.media.v1.GetResourceUrlsResponse;
import com.bytedance.lark.pb.media.v1.GetResourcesSizeRequest;
import com.bytedance.lark.pb.media.v1.GetResourcesSizeResponse;
import com.bytedance.lark.pb.media.v1.GetStickerSetArchiveDownloadStateRequest;
import com.bytedance.lark.pb.media.v1.GetStickerSetArchiveDownloadStateResponse;
import com.bytedance.lark.pb.media.v1.MGetResourcesRequest;
import com.bytedance.lark.pb.media.v1.MGetResourcesResponse;
import com.bytedance.lark.sdk.Sdk;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.core.api.resource.AbstractC29582d;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.biz.core.api.resource.ResourceRequestBaseSet;
import com.ss.android.lark.biz.core.api.resource.StickerSetDownloadState;
import com.ss.android.lark.resource.service.IResourceManisService;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.C53253l;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.LarkContext;
import ee.android.framework.manis.C68183b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.resource.service.impl.c */
public class C53155c implements AbstractC29582d {
    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public Map<String, Resource> mo105869a(List<ResourceRequestBaseSet> list) {
        ArrayList arrayList = new ArrayList();
        for (ResourceRequestBaseSet resourceRequestBaseSet : list) {
            arrayList.add(m205717a(resourceRequestBaseSet));
        }
        Map<String, Resource> map = (Map) SdkSender.syncSend(Command.MGET_RESOURCES, new MGetResourcesRequest.C18272a().mo63298a(arrayList), new SdkSender.IParser<Map<String, Resource>>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.C531561 */

            /* renamed from: a */
            public Map<String, Resource> parse(byte[] bArr) throws IOException {
                return C53151a.m205712a(MGetResourcesResponse.ADAPTER.decode(bArr).resources);
            }
        });
        return map == null ? new HashMap() : map;
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public void mo105875a(List<ResourceRequestBaseSet> list, int i, IGetDataCallback<Map<String, Resource>> iGetDataCallback) {
        ArrayList arrayList = new ArrayList();
        for (ResourceRequestBaseSet resourceRequestBaseSet : list) {
            arrayList.add(m205717a(resourceRequestBaseSet));
        }
        MGetResourcesRequest.C18272a a = new MGetResourcesRequest.C18272a().mo63298a(arrayList);
        if (i != -99) {
            a.mo63296a(DownloadFileScene.fromValue(i));
        }
        SdkSender.asynSendRequestNonWrap(Command.MGET_RESOURCES, a, iGetDataCallback, new SdkSender.IParser<Map<String, Resource>>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.AnonymousClass10 */

            /* renamed from: a */
            public Map<String, Resource> parse(byte[] bArr) throws IOException {
                return C53151a.m205712a(MGetResourcesResponse.ADAPTER.decode(bArr).resources);
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public void mo105870a(IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.CLEAR_RESOURCES, new ClearResourcesRequest.C18202a(), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.AnonymousClass11 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "";
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public void mo105874a(String str, String str2, String str3) {
        SdkSender.asynSendRequestNonWrap(Command.DOWNLOAD_RESOURCE, new DownloadResourceRequest.C18212a().mo63134a(str).mo63136b(str2).mo63137c(str3), null, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.AnonymousClass13 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                DownloadResourceResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public void mo105872a(String str) {
        SdkSender.asynSendRequestNonWrap(Command.CANCEL_RESOURCE, new CancelResourceRequest.C18198a().mo63095a(str), null, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.AnonymousClass14 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                CancelResourceResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public String mo105867a(String str, String str2, int i, int i2) {
        GetResourceUrlsRequest.C18254a aVar = new GetResourceUrlsRequest.C18254a();
        aVar.mo63248a(str);
        aVar.mo63250b(str2);
        aVar.mo63247a(m205716a(i, i2));
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_RESOURCE_URLS, aVar, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.AnonymousClass15 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                List<String> list = GetResourceUrlsResponse.ADAPTER.decode(bArr).urls;
                if (CollectionUtils.isEmpty(list)) {
                    return "";
                }
                return list.get(0);
            }
        });
        if (syncSendMayError.f131573b != null) {
            C53241h.m205894a("ResourceService", "get resource url failed: " + syncSendMayError.f131573b.toString());
            return "";
        } else if (!TextUtils.isEmpty(syncSendMayError.f131572a)) {
            return syncSendMayError.f131572a;
        } else {
            C53241h.m205894a("ResourceService", "get resource url failed: resource url is empty");
            return "";
        }
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public String mo105868a(String str, String str2, String str3, SerCrypto serCrypto) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ImageSetPassThrough.C15013a().mo54865a(str2).mo54867b(str3).mo54864a(serCrypto).build());
        return m205720a(new MGetResourcesRequest.C18272a().mo63301b(arrayList));
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public byte[] mo105877a(long j, String str, int i, float f, String str2) {
        return Sdk._getAvatar(j, str, i, f, str2);
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public String mo105866a(String str, String str2, int i, float f) {
        if (C26252ad.m94993b(LarkContext.getApplication())) {
            return mo181544b(str, str2, i, f);
        }
        IResourceManisService iResourceManisService = (IResourceManisService) C68183b.m264839a().mo237086a(LarkContext.getApplication(), IResourceManisService.class);
        C53241h.m205898b("ResourceService", "getAvatarPath in subProcess:" + C26252ad.m94992a(LarkContext.getApplication()));
        if (iResourceManisService != null) {
            return iResourceManisService.getAvatarPath(str, str2, i, f);
        }
        return null;
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public void mo105873a(String str, String str2, int i, float f, IGetDataCallback<String> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_AVATAR_PATH, new GetAvatarPathRequest.C18220a().mo63158a(str).mo63160b(str2).mo63157a(Integer.valueOf(i)).mo63156a(Float.valueOf(f)), iGetDataCallback, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.C531583 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return GetAvatarPathResponse.ADAPTER.decode(bArr).path;
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public void mo105871a(Integer num, Integer num2, TriggerDataCleanRequest.CleanType cleanType, IGetDataCallback<TriggerDataCleanResponse> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.TRIGGER_DATA_CLEAN, new TriggerDataCleanRequest.C15358a().mo55780a(num).mo55782b(num2).mo55779a(cleanType), iGetDataCallback, new SdkSender.IParser<TriggerDataCleanResponse>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.C531594 */

            /* renamed from: a */
            public TriggerDataCleanResponse parse(byte[] bArr) throws IOException {
                return TriggerDataCleanResponse.ADAPTER.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public void mo105876a(List<String> list, String str, IGetDataCallback<StickerSetDownloadState> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_STICKER_SET_ARCHIVE_DOWNLOAD_STATE, new GetStickerSetArchiveDownloadStateRequest.C18262a().mo63267a(list).mo63266a(str), iGetDataCallback, new SdkSender.IParser<StickerSetDownloadState>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.C531638 */

            /* renamed from: a */
            public StickerSetDownloadState parse(byte[] bArr) throws IOException {
                StickerSetDownloadState stickerSetDownloadState = new StickerSetDownloadState();
                try {
                    stickerSetDownloadState.parse(GetStickerSetArchiveDownloadStateResponse.ADAPTER.decode(bArr).states);
                } catch (IOException e) {
                    C53241h.m205894a("ResourceService", "failed to getStickerSetArchiveDownloadState, e:" + e);
                }
                return stickerSetDownloadState;
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: b */
    public void mo105880b(IGetDataCallback<Float> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_RESOURCES_SIZE, new GetResourcesSizeRequest.C18258a(), iGetDataCallback, new SdkSender.IParser<Float>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.AnonymousClass12 */

            /* renamed from: a */
            public Float parse(byte[] bArr) throws IOException {
                return GetResourcesSizeResponse.ADAPTER.decode(bArr).size_m;
            }
        });
    }

    /* renamed from: a */
    private MGetResourcesRequest.Set m205717a(ResourceRequestBaseSet resourceRequestBaseSet) {
        MGetResourcesRequest.Set.C18270a b = new MGetResourcesRequest.Set.C18270a().mo63290a(resourceRequestBaseSet.mo105854a()).mo63292b(resourceRequestBaseSet.mo105855b());
        if (resourceRequestBaseSet.mo105856c() == ResourceRequestBaseSet.Type.AVATAR) {
            C53154b bVar = (C53154b) resourceRequestBaseSet;
            b.mo63289a(C53151a.m205710a(bVar.mo181541e()));
            b.mo63288a(C53151a.m205709a(bVar.mo181540d()));
        }
        return b.build();
    }

    /* renamed from: a */
    private String m205720a(MGetResourcesRequest.C18272a aVar) {
        Resource a = m205718a(aVar, (C53253l) null, C53234a.m205877a());
        if (a == null) {
            return null;
        }
        return a.mo105845b();
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: b */
    public Map<String, Resource> mo105879b(List<ResourceRequestBaseSet> list) {
        ArrayList arrayList = new ArrayList();
        for (ResourceRequestBaseSet resourceRequestBaseSet : list) {
            arrayList.add(m205717a(resourceRequestBaseSet));
        }
        Map<String, Resource> map = (Map) SdkSender.sendRequest(Command.MGET_RESOURCES, new MGetResourcesRequest.C18272a().mo63298a(arrayList), 30000, new SdkSender.IParser<Map<String, Resource>>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.C531649 */

            /* renamed from: a */
            public Map<String, Resource> parse(byte[] bArr) throws IOException {
                return C53151a.m205712a(MGetResourcesResponse.ADAPTER.decode(bArr).resources);
            }
        });
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    /* renamed from: a */
    public Resource mo181542a(Map<String, Resource> map) {
        if (map != null && !map.isEmpty()) {
            Iterator<Map.Entry<String, Resource>> it = map.entrySet().iterator();
            if (it.hasNext()) {
                return it.next().getValue();
            }
        }
        return null;
    }

    /* renamed from: a */
    private C53253l m205719a(String str, boolean z) {
        C53253l lVar = new C53253l();
        lVar.f131606b = z;
        return lVar;
    }

    /* renamed from: a */
    private AvatarFsUnitParams m205716a(int i, int i2) {
        return new AvatarFsUnitParams.C18184a().mo63050a(AvatarFsUnitParams.CutType.fromValue(AvatarFsUnitParams.CutType.FACE.getValue())).mo63052a(m205721b(i, i2)).build();
    }

    /* renamed from: b */
    private AvatarFsUnitParams.ImageSizeType m205721b(int i, int i2) {
        if (i <= 72 && i2 <= 72) {
            return AvatarFsUnitParams.ImageSizeType.SMALL;
        }
        if (i > 240 || i2 > 240) {
            return AvatarFsUnitParams.ImageSizeType.ORIGIN;
        }
        return AvatarFsUnitParams.ImageSizeType.MIDDLE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo181545c(String str, String str2) {
        ResourceRequestBaseSet resourceRequestBaseSet = new ResourceRequestBaseSet(str2, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m205717a(resourceRequestBaseSet));
        return m205720a(new MGetResourcesRequest.C18272a().mo63298a(arrayList));
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: b */
    public String mo105878b(String str, String str2) {
        ResourceRequestBaseSet resourceRequestBaseSet = new ResourceRequestBaseSet(str2, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m205717a(resourceRequestBaseSet));
        MGetResourcesRequest.C18272a a = new MGetResourcesRequest.C18272a().mo63298a(arrayList);
        a.mo63300b((Boolean) true).mo63297a((Boolean) false);
        return m205720a(a);
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public String mo105865a(String str, String str2) {
        ResourceRequestBaseSet resourceRequestBaseSet = new ResourceRequestBaseSet(str2, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m205717a(resourceRequestBaseSet));
        MGetResourcesRequest.C18272a a = new MGetResourcesRequest.C18272a().mo63298a(arrayList);
        a.mo63297a((Boolean) true);
        return m205720a(a);
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public String mo105864a(String str, int i, int i2) {
        return mo105867a(str, (String) null, i, i2);
    }

    /* renamed from: a */
    private Resource m205718a(MGetResourcesRequest.C18272a aVar, C53253l lVar, String str) {
        if (str == null) {
            str = C53234a.m205877a();
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final SdkSender.C53233d dVar = new SdkSender.C53233d();
        SdkSender.asynSendRequestNonWrap(Command.MGET_RESOURCES, aVar, str, new IGetDataCallback<Resource>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.C531605 */

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.biz.core.api.resource.Resource */
            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public void onSuccess(Resource resource) {
                dVar.f131572a = resource;
                countDownLatch.countDown();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                dVar.f131573b = errorResult;
                countDownLatch.countDown();
            }
        }, new SdkSender.IParser<Resource>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.C531616 */

            /* renamed from: a */
            public Resource parse(byte[] bArr) throws IOException {
                MGetResourcesResponse decode = MGetResourcesResponse.ADAPTER.decode(bArr);
                Resource a = C53155c.this.mo181542a(C53151a.m205712a(decode.resources));
                if (a != null) {
                    a.mo105843a(decode.trace);
                }
                return a;
            }
        }, lVar);
        try {
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        T t = dVar.f131572a;
        if (t != null) {
            return t;
        }
        Resource resource = new Resource();
        resource.mo105844a(dVar.f131573b);
        return resource;
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: b */
    public void mo105881b(String str, String str2, String str3) {
        SdkSender.asynSendRequestNonWrap(Command.DOWNLOAD_STICKER_SET_ARCHIVE, new DownloadStickerSetArchiveRequest.C18216a().mo63145a(str).mo63147b(str2).mo63148c(str3), null, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.C531627 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                try {
                    DownloadStickerSetArchiveResponse.ADAPTER.decode(bArr);
                } catch (IOException e) {
                    C53241h.m205894a("ResourceService", "failed to downloadStickerSetArchive, e:" + e);
                }
                return true;
            }
        });
    }

    /* renamed from: b */
    public Resource mo181543b(String str, String str2, String str3, boolean z) {
        ResourceRequestBaseSet resourceRequestBaseSet = new ResourceRequestBaseSet(str2, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m205717a(resourceRequestBaseSet));
        return m205718a(new MGetResourcesRequest.C18272a().mo63298a(arrayList), m205719a(str3, z), str3);
    }

    /* renamed from: b */
    public String mo181544b(String str, String str2, int i, float f) {
        return (String) SdkSender.sendRequest(Command.GET_AVATAR_PATH, new GetAvatarPathRequest.C18220a().mo63158a(str).mo63160b(str2).mo63157a(Integer.valueOf(i)).mo63156a(Float.valueOf(f)), 30000, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.resource.service.impl.C53155c.C531572 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return GetAvatarPathResponse.ADAPTER.decode(bArr).path;
            }
        });
    }

    @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29582d
    /* renamed from: a */
    public Resource mo105863a(String str, String str2, String str3, boolean z) {
        if (C26252ad.m94993b(LarkContext.getApplication())) {
            return mo181543b(str, str2, str3, z);
        }
        IResourceManisService iResourceManisService = (IResourceManisService) C68183b.m264839a().mo237086a(LarkContext.getApplication(), IResourceManisService.class);
        if (iResourceManisService != null) {
            return iResourceManisService.getEncryptImage(str, str2, str3, z);
        }
        return null;
    }
}
