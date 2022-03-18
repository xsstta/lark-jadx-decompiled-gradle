package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.lark.p414b.AbstractC8005o;
import com.bytedance.ee.bear.middleground.drive.export.C9361b;
import com.bytedance.ee.bear.middleground.drive.export.C9366e;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DriveFgConfig;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;
import com.bytedance.ee.bear.middleground.drive.export.GetDownloadedRangesCallback;
import com.bytedance.ee.bear.middleground.drive.export.NetworkLevel;
import com.bytedance.ee.bear.middleground.drive.export.UploadCallback;
import com.bytedance.ee.bear.middleground.drive.export.UploadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13629i;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p702e.C13659d;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.space.drive.v1.CancelAllRequest;
import com.bytedance.lark.pb.space.drive.v1.CancelAllResponse;
import com.bytedance.lark.pb.space.drive.v1.CancelAllUploadRequest;
import com.bytedance.lark.pb.space.drive.v1.CancelAllUploadResponse;
import com.bytedance.lark.pb.space.drive.v1.CancelDownloadRequest;
import com.bytedance.lark.pb.space.drive.v1.CancelDownloadResponse;
import com.bytedance.lark.pb.space.drive.v1.CancelSubscribeRecentListRep;
import com.bytedance.lark.pb.space.drive.v1.CancelSubscribeRecentListReq;
import com.bytedance.lark.pb.space.drive.v1.CancelUploadRequest;
import com.bytedance.lark.pb.space.drive.v1.CancelUploadResponse;
import com.bytedance.lark.pb.space.drive.v1.Context;
import com.bytedance.lark.pb.space.drive.v1.CoverDownloadInfo;
import com.bytedance.lark.pb.space.drive.v1.DeleteDownloadRecordRequest;
import com.bytedance.lark.pb.space.drive.v1.DeleteDownloadRecordResponse;
import com.bytedance.lark.pb.space.drive.v1.DeleteUploadResourceRequest;
import com.bytedance.lark.pb.space.drive.v1.DeleteUploadResourceResponse;
import com.bytedance.lark.pb.space.drive.v1.DocInfo;
import com.bytedance.lark.pb.space.drive.v1.DownloadNormalRequest;
import com.bytedance.lark.pb.space.drive.v1.DownloadNormalResponse;
import com.bytedance.lark.pb.space.drive.v1.DownloadRange;
import com.bytedance.lark.pb.space.drive.v1.DownloadRangeRequest;
import com.bytedance.lark.pb.space.drive.v1.DownloadRangeResponse;
import com.bytedance.lark.pb.space.drive.v1.DownloadRequest;
import com.bytedance.lark.pb.space.drive.v1.DownloadResponse;
import com.bytedance.lark.pb.space.drive.v1.DriveDecryptRequest;
import com.bytedance.lark.pb.space.drive.v1.DriveDecryptResponse;
import com.bytedance.lark.pb.space.drive.v1.GetDownloadedRangesRequest;
import com.bytedance.lark.pb.space.drive.v1.MultiDownloadRequest;
import com.bytedance.lark.pb.space.drive.v1.MultiDownloadResponse;
import com.bytedance.lark.pb.space.drive.v1.PushDownloadRangeCallback;
import com.bytedance.lark.pb.space.drive.v1.PushType;
import com.bytedance.lark.pb.space.drive.v1.RecentListSubscItem;
import com.bytedance.lark.pb.space.drive.v1.ResumeAllUploadRequest;
import com.bytedance.lark.pb.space.drive.v1.ResumeAllUploadResponse;
import com.bytedance.lark.pb.space.drive.v1.ResumeUploadRequest;
import com.bytedance.lark.pb.space.drive.v1.ResumeUploadResponse;
import com.bytedance.lark.pb.space.drive.v1.SubscribeRecentListRep;
import com.bytedance.lark.pb.space.drive.v1.SubscribeRecentListReq;
import com.bytedance.lark.pb.space.drive.v1.UploadListRequest;
import com.bytedance.lark.pb.space.drive.v1.UploadListResponse;
import com.bytedance.lark.pb.space.drive.v1.UploadRequest;
import com.bytedance.lark.pb.space.drive.v1.UploadResponse;
import com.bytedance.lark.pb.space.drive.v1.UploadScene;
import com.bytedance.lark.sdk.Sdk;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import okio.ByteString;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.g */
public class C9379g {

    /* renamed from: h */
    private static volatile C9379g f25209h;

    /* renamed from: i */
    private static volatile boolean f25210i;

    /* renamed from: a */
    C9375d f25211a;

    /* renamed from: b */
    C9369a f25212b;

    /* renamed from: c */
    C9411l f25213c;

    /* renamed from: d */
    C9374c f25214d;

    /* renamed from: e */
    C9389h f25215e;

    /* renamed from: f */
    C9392i f25216f;

    /* renamed from: g */
    private final int f25217g = 2019;

    /* renamed from: j */
    private volatile boolean f25218j;

    /* renamed from: a */
    public List<String> mo35793a(List<DownloadRequestInfo> list) {
        int size = list != null ? list.size() : 0;
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveMultiDownload requestInfos size  = " + size);
        m38753h();
        ArrayList arrayList = new ArrayList();
        if (size == 0) {
            C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveMultiDownload return because request info size = 0");
            return arrayList;
        } else if (this.f25218j) {
            C11678b.m48478b().scheduleDirect(new Runnable(list) {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$g$709UIW5EBZjRgfz5dUkYd2_f_c */
                public final /* synthetic */ List f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C9379g.m38748c(this.f$0);
                }
            }, 20, TimeUnit.MILLISECONDS);
            return arrayList;
        } else {
            try {
                MultiDownloadRequest.C19371a aVar = new MultiDownloadRequest.C19371a();
                ArrayList arrayList2 = new ArrayList();
                for (DownloadRequestInfo downloadRequestInfo : list) {
                    DownloadRequest.C19351a c = m38747c(downloadRequestInfo);
                    c.mo65929a(new DocInfo(downloadRequestInfo.f25119k, Integer.valueOf(downloadRequestInfo.f25120l)));
                    arrayList2.add(c.build());
                }
                aVar.mo65997a(arrayList2);
                Map map = (Map) SdkSender.syncSend(Command.SUITE_DRIVE_MULTI_DOWNLOAD, aVar, $$Lambda$g$c3A4IoEP7C4tjO7WIVT_nyDbMcU.INSTANCE);
                for (DownloadRequestInfo downloadRequestInfo2 : list) {
                    DownloadCallback downloadCallback = downloadRequestInfo2.f25121m;
                    String str = (String) map.get(downloadRequestInfo2.f25110b);
                    if (downloadCallback != null) {
                        if (!TextUtils.isEmpty(str)) {
                            String valueOf = String.valueOf(downloadRequestInfo2.f25121m.hashCode());
                            C9369a aVar2 = this.f25212b;
                            if (aVar2 != null) {
                                aVar2.mo35766a(str, valueOf, downloadRequestInfo2.f25121m);
                            }
                            arrayList.add(C9415n.m38908a(str, valueOf));
                        }
                    }
                }
                return arrayList;
            } catch (Exception e) {
                C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "driveMultiDownload: ", e);
                return arrayList;
            }
        }
    }

    /* renamed from: a */
    public String mo35790a(UploadRequestInfo uploadRequestInfo) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveUpload: uploadRequestInfo = " + uploadRequestInfo);
        m38753h();
        if (this.f25218j) {
            C11678b.m48478b().scheduleDirect(new Runnable() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$g$OZYb0jPJlISGOSVC9z2kdIJww3c */

                public final void run() {
                    C9379g.m38744b(UploadRequestInfo.this);
                }
            }, 20, TimeUnit.MILLISECONDS);
            return "";
        }
        try {
            UploadRequest.C19405a aVar = new UploadRequest.C19405a();
            aVar.mo66077a(uploadRequestInfo.f25152a).mo66084e(uploadRequestInfo.f25153b).mo66080b(uploadRequestInfo.f25154c).mo66076a(Integer.valueOf(uploadRequestInfo.f25157f)).mo66082c(uploadRequestInfo.f25155d).mo66083d(uploadRequestInfo.f25156e).mo66074a(uploadRequestInfo.f25158g == UploadRequestInfo.UploadType.IMG ? UploadRequest.ApiType.IMG : UploadRequest.ApiType.DRIVE);
            aVar.mo66075a(TextUtils.equals(uploadRequestInfo.f25156e, "wiki") ? UploadScene.WIKI : UploadScene.UNKNOWN);
            if (!C13657b.m55422a(uploadRequestInfo.f25159h)) {
                aVar.mo66078a(uploadRequestInfo.f25159h);
            }
            if (!C13657b.m55422a(uploadRequestInfo.f25160i)) {
                aVar.mo66081b(uploadRequestInfo.f25160i);
            }
            return m38739a(aVar, uploadRequestInfo.f25161j);
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveUpload: ", e);
            return "";
        }
    }

    /* renamed from: a */
    public byte[] mo35797a(byte[] bArr, String str, String str2) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveDecrypt start");
        m38753h();
        try {
            DriveDecryptRequest.C19355a aVar = new DriveDecryptRequest.C19355a();
            aVar.mo65948a(DriveDecryptRequest.DecryptType.Sm4Gcm);
            aVar.mo65950a(ByteString.of(bArr));
            aVar.mo65949a(str);
            aVar.mo65952b(str2);
            return (byte[]) SdkSender.syncSend(Command.SUITE_DRIVE_DECRYPT_REQUEST, aVar, $$Lambda$g$h8R6pU_7xbs3xZl4lVeDPY_k6cs.INSTANCE);
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveDecrypt error: ", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo35794a(UploadCallback uploadCallback) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper setGlobalUploadStateListener: ");
        C9411l lVar = this.f25213c;
        if (lVar != null) {
            lVar.mo35868a(uploadCallback);
        }
    }

    /* renamed from: a */
    public void mo35795a(final C9366e eVar) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper ListSync registerRecentPush: requestInfo=" + eVar);
        m38753h();
        try {
            ArrayList arrayList = new ArrayList();
            for (C9366e.C9368b bVar : eVar.f25185c) {
                arrayList.add(new RecentListSubscItem(bVar.f25193a, Long.valueOf(bVar.f25194b)));
            }
            SubscribeRecentListReq.C19395a a = new SubscribeRecentListReq.C19395a().mo66048a(new Context(new HashMap(), eVar.f25184b, Long.valueOf(System.currentTimeMillis()))).mo66050a(arrayList).mo66049a(eVar.f25183a);
            Command command = Command.SUITE_DRIVE_SUBSCRIBE_RECENT_LIST;
            C93845 r3 = new IGetDataCallback<SubscribeRecentListRep>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.C93845 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C13479a.m54758a("Middleground_Drive_DriveRustPBWrapper", "ListSync registerRecentPush onError() " + errorResult);
                    eVar.f25186d.mo33405a(errorResult);
                }

                /* renamed from: a */
                public void onSuccess(SubscribeRecentListRep subscribeRecentListRep) {
                    C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "ListSync registerRecentPush onSuccess() " + subscribeRecentListRep);
                    if (subscribeRecentListRep.result == null || !subscribeRecentListRep.result.booleanValue()) {
                        eVar.f25186d.mo33405a(new Exception(subscribeRecentListRep.toString()));
                        return;
                    }
                    eVar.f25186d.mo33404a(subscribeRecentListRep.subsc_sign);
                    if (C9379g.this.f25215e != null) {
                        C9379g.this.f25215e.mo35830a(subscribeRecentListRep.subsc_sign, eVar.f25186d, PushType.RECENT_LIST.getValue());
                    }
                }
            };
            ProtoAdapter<SubscribeRecentListRep> protoAdapter = SubscribeRecentListRep.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, a, r3, new SdkSender.IParser() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$jZ7A24CLIuVYqoEs2he_HKbwen8 */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (SubscribeRecentListRep) ProtoAdapter.this.decode(bArr);
                }
            });
        } catch (Throwable th) {
            C13479a.m54761a("Middleground_Drive_DriveRustPBWrapper", th);
            eVar.f25186d.mo33405a(th);
        }
    }

    /* renamed from: a */
    public String mo35791a(final C9361b bVar) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveRangeDownload requestInfo: " + bVar);
        m38753h();
        if (this.f25218j) {
            C11678b.m48478b().scheduleDirect(new Runnable() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$g$MzMuwYc_0j2mXqS5UkoZu9eQ0 */

                public final void run() {
                    C9379g.m38745b(C9361b.this);
                }
            }, 20, TimeUnit.MILLISECONDS);
            return "";
        }
        try {
            DownloadRangeRequest.C19347a aVar = new DownloadRangeRequest.C19347a();
            aVar.f47560l = bVar.f25172a;
            aVar.f47552d = bVar.f25179h;
            ArrayList arrayList = new ArrayList();
            C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveRangeDownload() ranges=" + bVar.f25175d);
            for (C9361b.C9362a aVar2 : bVar.f25175d) {
                arrayList.add(new DownloadRange(Long.valueOf(aVar2.f25181a), Long.valueOf(aVar2.f25182b)));
            }
            aVar.f47559k = arrayList;
            aVar.f47558j = bVar.f25177f;
            aVar.f47555g = String.valueOf(bVar.f25176e);
            aVar.f47549a = bVar.f25174c;
            aVar.f47550b = bVar.f25173b;
            aVar.f47551c = Integer.valueOf(bVar.f25178g);
            aVar.f47554f = true;
            new SdkSender.IParser<String>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.C93867 */

                /* renamed from: a */
                public String parse(byte[] bArr) throws IOException {
                    return DownloadRangeResponse.ADAPTER.decode(bArr).key;
                }
            };
            Command command = Command.SUITE_DRIVE_DOWNLOAD_RANGE;
            C93878 r4 = new IGetDataCallback<DownloadRangeResponse>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.C93878 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (bVar.f25180i != null) {
                        bVar.f25180i.onFailed("-1", errorResult.getErrorCode());
                    }
                }

                /* renamed from: a */
                public void onSuccess(DownloadRangeResponse downloadRangeResponse) {
                    if (C9379g.this.f25216f != null) {
                        C9379g.this.f25216f.mo35833a(downloadRangeResponse.key, bVar.f25180i);
                    }
                    if (bVar.f25180i != null) {
                        bVar.f25180i.onSubmit(downloadRangeResponse.key);
                    }
                }
            };
            ProtoAdapter<DownloadRangeResponse> protoAdapter = DownloadRangeResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, aVar, r4, new SdkSender.IParser() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$nUyAWtw_b5Dg8k2todCYCs64CQQ */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (DownloadRangeResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "driveDownload: ", e);
        }
        return "";
    }

    /* renamed from: a */
    public void mo35796a(String str, String str2, String str3, final GetDownloadedRangesCallback getDownloadedRangesCallback) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper getDownloadedRanges. ");
        m38753h();
        GetDownloadedRangesRequest.C19363a aVar = new GetDownloadedRangesRequest.C19363a();
        aVar.f47615a = str;
        aVar.f47617c = str2;
        aVar.f47616b = str3;
        try {
            Command command = Command.SUITE_DRIVE_GET_DOWNLOADED_RANGES;
            C93889 r4 = new IGetDataCallback<PushDownloadRangeCallback>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.C93889 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    GetDownloadedRangesCallback getDownloadedRangesCallback = getDownloadedRangesCallback;
                    if (getDownloadedRangesCallback != null) {
                        getDownloadedRangesCallback.onError(errorResult.getErrorCode());
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ C9361b.C9362a m38795a(DownloadRange downloadRange) {
                    return new C9361b.C9362a(downloadRange.start.longValue(), downloadRange.end.longValue());
                }

                /* renamed from: a */
                public void onSuccess(PushDownloadRangeCallback pushDownloadRangeCallback) {
                    if (getDownloadedRangesCallback != null && pushDownloadRangeCallback.downloaded_ranges != null) {
                        getDownloadedRangesCallback.onSuccess(CollectionsKt.map(pushDownloadRangeCallback.downloaded_ranges, $$Lambda$g$9$Jq7cEq2nWX_HR6Ut1dRIO94F6q8.INSTANCE));
                    }
                }
            };
            ProtoAdapter<PushDownloadRangeCallback> protoAdapter = PushDownloadRangeCallback.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, aVar, r4, new SdkSender.IParser() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$9B3SzTzr2C05diGR8BvWwaR4hk */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (PushDownloadRangeCallback) ProtoAdapter.this.decode(bArr);
                }
            });
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "driveDownload: ", e);
        }
    }

    private C9379g() {
        m38752g();
    }

    /* renamed from: f */
    public NetworkLevel mo35810f() {
        NetworkLevel networkLevel;
        C9374c cVar = this.f25214d;
        if (cVar != null) {
            networkLevel = cVar.mo35783a();
        } else {
            networkLevel = null;
        }
        if (networkLevel != null) {
            return networkLevel;
        }
        return NetworkLevel.UNKNOWN;
    }

    /* renamed from: a */
    public static C9379g m38738a() {
        if (f25209h == null) {
            synchronized (C9379g.class) {
                if (f25209h == null) {
                    f25209h = new C9379g();
                }
            }
        }
        return f25209h;
    }

    /* renamed from: h */
    private void m38753h() {
        if (C13629i.m55308c()) {
            ((AbstractC9349a) KoinJavaComponent.m268610a(AbstractC9349a.class)).mo35638d();
        } else {
            C13479a.m54758a("Middleground_Drive_DriveRustPBWrapper", "checkRustInited MGDriveModule is null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.middleground.drive.rustsdk.g$12  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass12 {

        /* renamed from: a */
        static final /* synthetic */ int[] f25222a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo$DownloadType[] r0 = com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo.DownloadType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass12.f25222a = r0
                com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo$DownloadType r1 = com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo.DownloadType.COVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass12.f25222a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo$DownloadType r1 = com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo.DownloadType.PREVIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass12.f25222a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo$DownloadType r1 = com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo.DownloadType.IMG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass12.f25222a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo$DownloadType r1 = com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo.DownloadType.DRIVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass12.f25222a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo$DownloadType r1 = com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo.DownloadType.RANGE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass12.<clinit>():void");
        }
    }

    /* renamed from: e */
    public static DriveFgConfig m38751e() {
        try {
            return new DriveFgConfig(C4211a.m17514a().mo16536a("spacekit.mobile.doc.image.cover", false), ((Integer) C4211a.m17514a().mo16533a("drive_rust_cover_size", (Object) 1280)).intValue());
        } catch (Exception unused) {
            return new DriveFgConfig(false, 1280);
        }
    }

    /* renamed from: c */
    public int mo35805c() {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper cancelAllUpload: ");
        m38753h();
        try {
            return ((Integer) SdkSender.syncSend(Command.SUITE_DRIVE_CANCEL_ALL_UPLOAD, new CancelAllUploadRequest.C19309a(), new SdkSender.IParser<Integer>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass17 */

                /* renamed from: a */
                public Integer parse(byte[] bArr) throws IOException {
                    return CancelAllUploadResponse.ADAPTER.decode(bArr).result;
                }
            })).intValue();
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper cancelAll: ", e);
            return 2019;
        }
    }

    /* renamed from: d */
    public int mo35809d() {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper cancelAll: ");
        try {
            return ((Integer) SdkSender.syncSend(Command.SUITE_DRIVE_CANCEL_ALL, new CancelAllRequest.C19305a(), new SdkSender.IParser<Integer>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.C93812 */

                /* renamed from: a */
                public Integer parse(byte[] bArr) throws IOException {
                    return CancelAllResponse.ADAPTER.decode(bArr).result;
                }
            })).intValue();
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper cancelAll: ", e);
            return 2019;
        }
    }

    /* renamed from: g */
    private void m38752g() {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper init: ");
        this.f25211a = new C9375d();
        C53248k.m205912a().mo181697a(Command.SUITE_DRIVE_PUSH_MONITOR_EVENT, this.f25211a);
        this.f25212b = new C9369a();
        C53248k.m205912a().mo181697a(Command.SUITE_DRIVE_PUSH_DOWNLOAD_PROCESS, this.f25212b);
        this.f25213c = new C9411l();
        C53248k.m205912a().mo181697a(Command.SUITE_DRIVE_PUSH_UPLOAD_PROGRESS, this.f25213c);
        if (C13629i.m55308c()) {
            this.f25214d = new C9374c();
            if (C13629i.m55304b() || !f25210i) {
                C53248k.m205912a().mo181697a(Command.PUSH_DYNAMIC_NET_STATUS, this.f25214d);
            } else {
                ((AbstractC8005o) KoinJavaComponent.m268610a(AbstractC8005o.class)).mo31016a(this.f25214d);
            }
        }
        HandlerThreadC9414m mVar = new HandlerThreadC9414m();
        this.f25215e = new C9389h(mVar);
        C53248k.m205912a().mo181697a(Command.SUITE_DRIVE_SUBSCRIBE_PUSH, this.f25215e);
        C53248k.m205912a().mo181697a(Command.SUITE_DRIVE_SUBSCRIBE_ERR_PUSH, new C9377f(mVar));
        C53248k a = C53248k.m205912a();
        Command command = Command.SUITE_DRIVE_PUSH_DOWNLOAD_RANGE_PROGRESS;
        C9392i iVar = new C9392i(mVar);
        this.f25216f = iVar;
        a.mo181697a(command, iVar);
        if (C13629i.m55304b() || !f25210i) {
            C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper init addPushObserver");
            Sdk.addPushObserver(C53248k.m205912a());
        }
    }

    /* renamed from: b */
    public void mo35802b() {
        C9375d dVar = this.f25211a;
        if (dVar != null) {
            dVar.mo35784a();
        }
        C9369a aVar = this.f25212b;
        if (aVar != null) {
            aVar.mo35763a();
        }
        C9411l lVar = this.f25213c;
        if (lVar != null) {
            lVar.mo35867a();
        }
    }

    /* renamed from: a */
    public static void m38741a(boolean z) {
        f25210i = z;
    }

    /* renamed from: b */
    public void mo35804b(boolean z) {
        this.f25218j = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ boolean m38746b(String str) {
        return this.f25213c.mo35872a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m38749c(String str) {
        return this.f25212b.mo35767a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ Map m38743b(byte[] bArr) throws IOException {
        return MultiDownloadResponse.ADAPTER.decode(bArr).keys_map;
    }

    /* renamed from: c */
    public int mo35807c(String[] strArr) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveCancelDownload: key=" + Arrays.toString(strArr));
        m38753h();
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m38744b(UploadRequestInfo uploadRequestInfo) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveUpload return because NOT_LOGIN");
        if (uploadRequestInfo.f25161j != null) {
            uploadRequestInfo.f25161j.updateProgress("-1", DriveFile.Status.FAILED, 0, 1, "", "", "", "", "", "");
            uploadRequestInfo.f25161j.onFailed("-1", 1024, "", 1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m38748c(List list) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveMultiDownload return because NOT_LOGIN");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DownloadCallback downloadCallback = ((DownloadRequestInfo) it.next()).f25121m;
            if (downloadCallback != null) {
                downloadCallback.updateProgress("-1", DriveFile.Status.FAILED, 0, 1, "");
                downloadCallback.onFailed("-1", 1024);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m38750d(DownloadRequestInfo downloadRequestInfo) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveDownload return because NOT_LOGIN");
        if (downloadRequestInfo.f25121m != null) {
            downloadRequestInfo.f25121m.updateProgress("-1", DriveFile.Status.FAILED, 0, 1, "");
            downloadRequestInfo.f25121m.onFailed("-1", 1024);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m38745b(C9361b bVar) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveRangeDownload return because NOT_LOGIN");
        if (bVar.f25180i != null) {
            bVar.f25180i.updateProgress("-1", DriveFile.Status.FAILED, new ArrayList());
            bVar.f25180i.onFailed("-1", 1024);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ byte[] m38742a(byte[] bArr) throws IOException {
        DriveDecryptResponse decode = DriveDecryptResponse.ADAPTER.decode(bArr);
        if (decode.success.booleanValue()) {
            return decode.body.toByteArray();
        }
        C13479a.m54758a("Middleground_Drive_DriveRustPBWrapper", "driveDecrypt error: " + decode.error_message);
        return null;
    }

    /* renamed from: c */
    private DownloadRequest.C19351a m38747c(DownloadRequestInfo downloadRequestInfo) {
        DownloadRequest.C19351a aVar = new DownloadRequest.C19351a();
        aVar.mo65933a(downloadRequestInfo.f25109a).mo65936b(downloadRequestInfo.f25110b).mo65937c(downloadRequestInfo.f25111c).mo65938d(downloadRequestInfo.f25112d).mo65932a(Integer.valueOf(downloadRequestInfo.f25113e)).mo65929a(new DocInfo(downloadRequestInfo.f25119k, Integer.valueOf(downloadRequestInfo.f25120l))).mo65931a(Boolean.valueOf(downloadRequestInfo.f25123o)).mo65939e(downloadRequestInfo.f25114f).mo65940f(downloadRequestInfo.f25124p);
        int i = AnonymousClass12.f25222a[downloadRequestInfo.f25115g.ordinal()];
        if (i == 1) {
            aVar.mo65930a(DownloadRequest.ApiType.COVER);
            if (downloadRequestInfo.f25122n != null) {
                aVar.mo65928a(new CoverDownloadInfo(Integer.valueOf(downloadRequestInfo.f25122n.f25142a), Integer.valueOf(downloadRequestInfo.f25122n.f25143b), downloadRequestInfo.f25122n.f25144c));
                aVar.mo65935b(Boolean.valueOf(!downloadRequestInfo.f25122n.f25145d));
            } else {
                DriveFgConfig e = m38751e();
                aVar.mo65928a(new CoverDownloadInfo(Integer.valueOf(e.mCoverWidth), Integer.valueOf(e.mCoverWidth), "near"));
            }
        } else if (i == 2) {
            aVar.mo65930a(DownloadRequest.ApiType.PREVIEW);
        } else if (i == 3) {
            aVar.mo65930a(DownloadRequest.ApiType.IMG);
        }
        return aVar;
    }

    /* renamed from: b */
    public int mo35798b(String[] strArr) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveCancelUpload: keys" + Arrays.toString(strArr));
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (this.f25213c != null) {
            List<String> b = C13659d.m55433b(arrayList, new C13659d.AbstractC13660a() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$g$__Jj_C1G4C2yTMKoUOOXQ58VFc */

                @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13660a
                public final boolean accept(Object obj) {
                    return C9379g.this.m38746b((String) obj);
                }
            });
            if (!C13657b.m55421a(b)) {
                C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveCancelUpload, unRegisterUpoadCallback: " + b);
                for (String str : b) {
                    this.f25213c.mo35871a(C9415n.m38907a(str), C9415n.m38909b(str));
                }
            }
        }
        if (C13657b.m55421a(arrayList)) {
            C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveCancelUpload, return for empty");
            return 2019;
        }
        List<String> a = C13659d.m55431a(arrayList, $$Lambda$1N2MJY6cAMf6Ua0ot5qUXDzeXcg.INSTANCE);
        m38753h();
        try {
            CancelUploadRequest.C19321a aVar = new CancelUploadRequest.C19321a();
            aVar.mo65856a(a);
            return ((Integer) SdkSender.syncSend(Command.SUITE_DRIVE_CANCEL_UPLOAD, aVar, new SdkSender.IParser<Integer>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass15 */

                /* renamed from: a */
                public Integer parse(byte[] bArr) throws IOException {
                    return CancelUploadResponse.ADAPTER.decode(bArr).result;
                }
            })).intValue();
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveCancelUpload: ", e);
            return 2019;
        }
    }

    /* renamed from: a */
    public int mo35786a(String str) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper deleteUploadResource: key=" + str);
        m38753h();
        try {
            DeleteUploadResourceRequest.C19333a aVar = new DeleteUploadResourceRequest.C19333a();
            aVar.mo65884a(str);
            return ((Integer) SdkSender.syncSend(Command.SUITE_DRIVE_DELETE_UPLOAD, aVar, new SdkSender.IParser<Integer>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.C93834 */

                /* renamed from: a */
                public Integer parse(byte[] bArr) throws IOException {
                    return DeleteUploadResourceResponse.ADAPTER.decode(bArr).result;
                }
            })).intValue();
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper deleteUploadResource: ", e);
            return 2019;
        }
    }

    /* renamed from: b */
    public String mo35799b(DownloadRequestInfo downloadRequestInfo) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveDownloadNormal requestInfo: " + downloadRequestInfo);
        m38753h();
        if (this.f25218j) {
            C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveDownloadNormal return because NOT_LOGIN");
            if (downloadRequestInfo.f25121m != null) {
                downloadRequestInfo.f25121m.updateProgress("-1", DriveFile.Status.FAILED, 0, 1, "");
                downloadRequestInfo.f25121m.onFailed("-1", 1024);
            }
            return "";
        }
        try {
            DownloadNormalRequest.C19341a aVar = new DownloadNormalRequest.C19341a();
            aVar.mo65903a(downloadRequestInfo.f25109a).mo65905b(downloadRequestInfo.f25116h).mo65902a(Integer.valueOf(downloadRequestInfo.f25113e)).mo65901a(Boolean.valueOf(downloadRequestInfo.f25118j)).mo65907d(String.valueOf(downloadRequestInfo.f25117i)).mo65906c(downloadRequestInfo.f25114f).mo65908e(downloadRequestInfo.f25124p);
            String str = (String) SdkSender.syncSend(Command.SUITE_DRIVE_DOWNLOAD_NORMAL, aVar, new SdkSender.IParser<String>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass10 */

                /* renamed from: a */
                public String parse(byte[] bArr) throws IOException {
                    return DownloadNormalResponse.ADAPTER.decode(bArr).key;
                }
            });
            String valueOf = String.valueOf(downloadRequestInfo.f25121m.hashCode());
            C9369a aVar2 = this.f25212b;
            if (aVar2 != null) {
                aVar2.mo35766a(str, valueOf, downloadRequestInfo.f25121m);
            }
            return C9415n.m38908a(str, valueOf);
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveDownload: ", e);
            return "";
        }
    }

    /* renamed from: c */
    public int mo35806c(boolean z) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper resumeAllUpload: withFailed = " + z);
        m38753h();
        try {
            ResumeAllUploadRequest.C19383a aVar = new ResumeAllUploadRequest.C19383a();
            aVar.mo66022a(Boolean.valueOf(z));
            return ((Integer) SdkSender.syncSend(Command.SUITE_DRIVE_RESUME_ALL_UPLOAD, aVar, new SdkSender.IParser<Integer>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass18 */

                /* renamed from: a */
                public Integer parse(byte[] bArr) throws IOException {
                    return ResumeAllUploadResponse.ADAPTER.decode(bArr).result;
                }
            })).intValue();
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper resumeAllUpload: ", e);
            return 2019;
        }
    }

    /* renamed from: b */
    public List<DriveFile> mo35801b(List<com.bytedance.lark.pb.space.drive.v1.DriveFile> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.lark.pb.space.drive.v1.DriveFile driveFile : list) {
            DriveFile driveFile2 = new DriveFile();
            driveFile2.setBytesTotal(Long.parseLong(driveFile.bytes_total));
            driveFile2.setBytesTransferred(Long.parseLong(driveFile.bytes_transferred));
            driveFile2.setFileName(driveFile.file_name);
            driveFile2.setKey(driveFile.key);
            driveFile2.setMountNodePoint(driveFile.mount_node_point);
            driveFile2.setPath(driveFile.path);
            driveFile2.setStatus(DriveFile.Status.from(driveFile.status.intValue()));
            driveFile2.setErrorCode(driveFile.error_code);
            arrayList.add(driveFile2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public int mo35788a(String[] strArr) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveCancelDownload: key=" + Arrays.toString(strArr));
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        List<String> b = C13659d.m55433b(arrayList, new C13659d.AbstractC13660a() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$g$m75GVF92TCB_fkG5hjjewEgN8uY */

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13660a
            public final boolean accept(Object obj) {
                return C9379g.this.m38749c((String) obj);
            }
        });
        if (!C13657b.m55421a(b)) {
            C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveCancelDownload, unRegisterDownloadCallback: " + b);
            for (String str : b) {
                this.f25212b.mo35765a(C9415n.m38907a(str), C9415n.m38909b(str));
            }
        }
        if (C13657b.m55421a(arrayList)) {
            return 0;
        }
        List<String> a = C13659d.m55431a(arrayList, $$Lambda$1N2MJY6cAMf6Ua0ot5qUXDzeXcg.INSTANCE);
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "driveCancelDownload, keyNonOtherRegister: " + a);
        m38753h();
        try {
            CancelDownloadRequest.C19313a aVar = new CancelDownloadRequest.C19313a();
            aVar.mo65836a(a);
            return ((Integer) SdkSender.syncSend(Command.SUITE_DRIVE_CANCEL_DOWNLOAD, aVar, new SdkSender.IParser<Integer>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass13 */

                /* renamed from: a */
                public Integer parse(byte[] bArr) throws IOException {
                    return CancelDownloadResponse.ADAPTER.decode(bArr).result;
                }
            })).intValue();
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveCancelDownload: ", e);
            return 0;
        }
    }

    /* renamed from: a */
    public String mo35789a(DownloadRequestInfo downloadRequestInfo) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveDownload requestInfo: " + downloadRequestInfo);
        m38753h();
        if (this.f25218j) {
            C11678b.m48478b().scheduleDirect(new Runnable() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$g$yUtiLEfopEaZ7spkanJm_OjwM3w */

                public final void run() {
                    C9379g.m38750d(DownloadRequestInfo.this);
                }
            }, 20, TimeUnit.MILLISECONDS);
            return "";
        }
        try {
            String str = (String) SdkSender.syncSend(Command.SUITE_DRIVE_DOWNLOAD, m38747c(downloadRequestInfo), new SdkSender.IParser<String>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.C93801 */

                /* renamed from: a */
                public String parse(byte[] bArr) throws IOException {
                    return DownloadResponse.ADAPTER.decode(bArr).key;
                }
            });
            String valueOf = String.valueOf(downloadRequestInfo.f25121m.hashCode());
            C9369a aVar = this.f25212b;
            if (aVar != null) {
                aVar.mo35766a(str, valueOf, downloadRequestInfo.f25121m);
            }
            return C9415n.m38908a(str, valueOf);
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "driveDownload: ", e);
            return "";
        }
    }

    /* renamed from: b */
    public void mo35803b(final C9366e eVar) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper ListSync unRegisterRecentPush: subscribeSign=" + eVar);
        m38753h();
        CancelSubscribeRecentListReq.C19319a a = new CancelSubscribeRecentListReq.C19319a().mo65849a(new Context(new HashMap(), eVar.f25184b, Long.valueOf(System.currentTimeMillis()))).mo65852b(eVar.f25187e).mo65850a(eVar.f25183a);
        Command command = Command.SUITE_DRIVE_CANCEL_SUBSCRIBE_RECENT_LIST;
        C93856 r2 = new IGetDataCallback<CancelSubscribeRecentListRep>() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.C93856 */

            /* renamed from: a */
            public void onSuccess(CancelSubscribeRecentListRep cancelSubscribeRecentListRep) {
                C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "ListSync unRegisterRecentPush onSuccess() " + cancelSubscribeRecentListRep);
                if (cancelSubscribeRecentListRep.result == null || !cancelSubscribeRecentListRep.result.booleanValue()) {
                    eVar.f25186d.mo33407b(new Exception(cancelSubscribeRecentListRep.toString()));
                } else {
                    eVar.f25186d.mo33406b(eVar.f25187e);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C13479a.m54758a("Middleground_Drive_DriveRustPBWrapper", "ListSync unRegisterRecentPush onError() " + errorResult);
                eVar.f25186d.mo33407b(new Exception(errorResult));
            }
        };
        ProtoAdapter<CancelSubscribeRecentListRep> protoAdapter = CancelSubscribeRecentListRep.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, r2, new SdkSender.IParser() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$CTXapnWohgG5zfof2MXBBEb0NBA */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (CancelSubscribeRecentListRep) ProtoAdapter.this.decode(bArr);
            }
        });
        C9389h hVar = this.f25215e;
        if (hVar != null) {
            hVar.mo35829a(eVar.f25187e);
        }
    }

    /* renamed from: a */
    public List<DriveFile> mo35792a(String str, String str2) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper getAllUploadFileList. ");
        return m38740a(str, str2, false);
    }

    /* renamed from: b */
    public List<DriveFile> mo35800b(String str, String str2) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper getAllUploadFileProgressList. ");
        return m38740a(str, str2, true);
    }

    /* renamed from: a */
    private String m38739a(UploadRequest.C19405a aVar, UploadCallback uploadCallback) throws Exception {
        m38753h();
        String str = (String) SdkSender.syncSend(Command.SUITE_DRIVE_UPLOAD, aVar, new SdkSender.IParser<String>() {
            /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass14 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return UploadResponse.ADAPTER.decode(bArr).key;
            }
        });
        C9411l lVar = this.f25213c;
        if (lVar != null) {
            lVar.mo35870a(str, uploadCallback);
        }
        if (uploadCallback != null) {
            return C9415n.m38908a(str, String.valueOf(uploadCallback.hashCode()));
        }
        return str;
    }

    /* renamed from: a */
    public int mo35787a(String str, UploadCallback uploadCallback) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper resumeUpload: key=" + str);
        m38753h();
        String a = C9415n.m38907a(str);
        int i = 2019;
        try {
            ResumeUploadRequest.C19387a aVar = new ResumeUploadRequest.C19387a();
            aVar.mo66031a(a);
            i = ((Integer) SdkSender.syncSend(Command.SUITE_DRIVE_RESUME_UPLOAD, aVar, new SdkSender.IParser<Integer>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass16 */

                /* renamed from: a */
                public Integer parse(byte[] bArr) throws IOException {
                    return ResumeUploadResponse.ADAPTER.decode(bArr).result;
                }
            })).intValue();
            C9411l lVar = this.f25213c;
            if (lVar != null) {
                lVar.mo35870a(a, uploadCallback);
            }
        } catch (Exception e) {
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper resumeUpload: ", e);
        }
        return i;
    }

    /* renamed from: c */
    public void mo35808c(String str, String str2) {
        C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveDeleteRangeRecord. fileToken=" + C13598b.m55200g(str) + " dataVersion=" + str2);
        m38753h();
        DeleteDownloadRecordRequest.C19329a a = new DeleteDownloadRecordRequest.C19329a().mo65873a(DownloadRequest.ApiType.RANGE).mo65876b(str2).mo65874a(str);
        try {
            Command command = Command.SUITE_DRIVE_DELETE_DOWNLOADED_RECORD;
            AnonymousClass11 r0 = new IGetDataCallback<DeleteDownloadRecordResponse>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.AnonymousClass11 */

                /* renamed from: a */
                public void onSuccess(DeleteDownloadRecordResponse deleteDownloadRecordResponse) {
                    C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveDeleteRangeRecord. success");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper driveDeleteRangeRecord. error=" + errorResult);
                }
            };
            ProtoAdapter<DeleteDownloadRecordResponse> protoAdapter = DeleteDownloadRecordResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, a, r0, new SdkSender.IParser() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.$$Lambda$zg3BtZobFNnzW0edKeN1o4hR4M */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (DeleteDownloadRecordResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        } catch (Exception e) {
            C13479a.m54761a("Middleground_Drive_DriveRustPBWrapper", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r7v8. Raw type applied. Possible types: java.util.List, java.util.List<com.bytedance.ee.bear.middleground.drive.export.DriveFile> */
    /* renamed from: a */
    private List<DriveFile> m38740a(String str, String str2, boolean z) {
        Exception e;
        UploadScene uploadScene;
        m38753h();
        List arrayList = new ArrayList();
        try {
            UploadListRequest.C19401a aVar = new UploadListRequest.C19401a();
            aVar.mo66065a(str);
            aVar.mo66064a(Boolean.valueOf(z));
            if (TextUtils.equals(str2, "wiki")) {
                uploadScene = UploadScene.WIKI;
            } else {
                uploadScene = UploadScene.UNKNOWN;
            }
            aVar.mo66063a(uploadScene);
            List list = (List) SdkSender.syncSend(Command.SUITE_DRIVE_UPLOAD_LIST, aVar, new SdkSender.IParser<List<DriveFile>>() {
                /* class com.bytedance.ee.bear.middleground.drive.rustsdk.C9379g.C93823 */

                /* renamed from: a */
                public List<DriveFile> parse(byte[] bArr) throws IOException {
                    UploadListResponse decode = UploadListResponse.ADAPTER.decode(bArr);
                    if (decode.list != null) {
                        return C9379g.this.mo35801b(decode.list);
                    }
                    C13479a.m54758a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper getAllUploadFileList parse: list is null");
                    return null;
                }
            });
            try {
                C13479a.m54764b("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper getAllUploadFileList, mountNodeToken: " + C13598b.m55197d(str) + ", mountPoint: " + str2 + ", result: " + list.size());
                return list;
            } catch (Exception e2) {
                e = e2;
                arrayList = list;
            }
        } catch (Exception e3) {
            e = e3;
            C13479a.m54759a("Middleground_Drive_DriveRustPBWrapper", "DriveRustPBWrapper getAllUploadFileList: ", e);
            return arrayList;
        }
    }
}
