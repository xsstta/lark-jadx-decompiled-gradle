package com.bytedance.lark.sdk;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.tool.v1.CancelFetchRequest;
import com.bytedance.lark.pb.tool.v1.ClearNetworkProxyRequest;
import com.bytedance.lark.pb.tool.v1.FetchRequest;
import com.bytedance.lark.pb.tool.v1.HttpHeader;
import com.bytedance.lark.pb.tool.v1.OnFetchResponse;
import com.bytedance.lark.pb.tool.v1.SetNetworkProxyRequest;
import com.bytedance.lark.sdk.LarkResponse;
import com.bytedance.lark.sdk.api.LarkProxyApi;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u001b"}, d2 = {"Lcom/bytedance/lark/sdk/LarkNet;", "Lcom/bytedance/lark/sdk/LarkNetApi;", "Lcom/bytedance/lark/sdk/api/LarkProxyApi;", "()V", "cancelNetRequestAsync", "", "requestId", "", "clearProxy", "convertRequest", "Lcom/bytedance/lark/pb/tool/v1/FetchRequest;", "request", "Lcom/bytedance/lark/sdk/LarkRequest;", "getProxyUrl", "", "ipAdder", "port", "proxyType", "Lcom/bytedance/lark/sdk/api/LarkProxyApi$ProxyType;", "netRequest", "Lcom/bytedance/lark/sdk/LarkResponse;", "netRequestAsync", "listener", "Lcom/bytedance/lark/sdk/LarkNetRequestListener;", "setProxy", "Companion", "TaskInfo", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.lark.sdk.e */
public final class LarkNet implements LarkProxyApi, LarkNetApi {

    /* renamed from: a */
    public static final HashMap<Long, TaskInfo> f48390a = new HashMap<>();

    /* renamed from: b */
    public static final Companion f48391b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0007J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/lark/sdk/LarkNet$Companion;", "", "()V", "TAG", "", "taskMap", "Ljava/util/HashMap;", "", "Lcom/bytedance/lark/sdk/LarkNet$TaskInfo;", "Lkotlin/collections/HashMap;", "OnFetchReadBuf", "", "taskID", "maxChunkLength", "OnFetchResponse", "", "err", "", "response", "extractResponse", "fetchResponse", "Lcom/bytedance/lark/pb/tool/v1/OnFetchResponse;", "taskInfo", "getRequestBody", "maxLen", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final byte[] mo67185a(long j, long j2) {
            byte[] bArr = new byte[0];
            if (LarkNet.f48390a.get(Long.valueOf(j)) != null) {
                return m72336b(j, j2);
            }
            return bArr;
        }

        /* renamed from: b */
        private final byte[] m72336b(long j, long j2) {
            int i;
            LarkRequest c;
            LarkRequestBody i2;
            ByteArrayInputStream a;
            LarkRequest c2;
            LarkRequestBody i3;
            ByteArrayInputStream a2;
            TaskInfo bVar = LarkNet.f48390a.get(Long.valueOf(j));
            if (bVar == null || (c2 = bVar.mo67189c()) == null || (i3 = c2.mo67089i()) == null || (a2 = i3.mo67192a()) == null) {
                i = 0;
            } else {
                i = a2.available();
            }
            int min = Math.min(i, (int) j2);
            byte[] bArr = new byte[min];
            if (!(bVar == null || (c = bVar.mo67189c()) == null || (i2 = c.mo67089i()) == null || (a = i2.mo67192a()) == null)) {
                a.read(bArr, 0, min);
            }
            return bArr;
        }

        /* renamed from: a */
        private final void m72335a(OnFetchResponse onFetchResponse, TaskInfo bVar) {
            String str;
            LarkNetProtocol larkNetProtocol;
            int i;
            int i2;
            Integer num;
            Integer num2;
            Integer num3;
            LarkResponse.SdkErrorCode sdkErrorCode;
            int i3;
            int i4;
            Integer num4;
            Integer num5;
            Integer num6;
            if (bVar.mo67186a() == null) {
                bVar.mo67187a(new LarkResponse.Builder());
            }
            boolean z = true;
            int i5 = 0;
            if (onFetchResponse.cancel_response != null) {
                LarkResponse.Builder a = bVar.mo67186a();
                if (a == null) {
                    Intrinsics.throwNpe();
                }
                a.mo67127a(LarkResponse.ResponseStatus.CANCEL);
            } else if (onFetchResponse.error_response != null) {
                OnFetchResponse.OnErrorResponse.Code code = onFetchResponse.error_response.code;
                if (code != null) {
                    int i6 = C19834f.f48398a[code.ordinal()];
                    if (i6 == 1) {
                        sdkErrorCode = LarkResponse.SdkErrorCode.TIMEOUT;
                    } else if (i6 == 2) {
                        sdkErrorCode = LarkResponse.SdkErrorCode.OTHERS;
                    } else if (i6 == 3) {
                        sdkErrorCode = LarkResponse.SdkErrorCode.SDK;
                    } else if (i6 == 4) {
                        sdkErrorCode = LarkResponse.SdkErrorCode.OFFLINE;
                    } else if (i6 == 5) {
                        sdkErrorCode = LarkResponse.SdkErrorCode.IO;
                    }
                    LarkResponse.Builder a2 = bVar.mo67186a();
                    if (a2 == null) {
                        Intrinsics.throwNpe();
                    }
                    a2.mo67127a(LarkResponse.ResponseStatus.ERROR);
                    LarkResponse.Builder a3 = bVar.mo67186a();
                    if (a3 == null) {
                        Intrinsics.throwNpe();
                    }
                    String str2 = onFetchResponse.error_response.message;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "fetchResponse.error_response.message");
                    a3.mo67131a(new LarkResponse.ResponseError(sdkErrorCode, str2));
                    OnFetchResponse.StageCost stageCost = onFetchResponse.error_response.stage_cost;
                    LarkResponse.Builder a4 = bVar.mo67186a();
                    if (a4 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (stageCost == null || (num6 = stageCost.dns_cost) == null) {
                        i3 = 0;
                    } else {
                        i3 = num6.intValue();
                    }
                    if (stageCost == null || (num5 = stageCost.tcp_connect_cost) == null) {
                        i4 = 0;
                    } else {
                        i4 = num5.intValue();
                    }
                    if (!(stageCost == null || (num4 = stageCost.tls_cost) == null)) {
                        i5 = num4.intValue();
                    }
                    a4.mo67133a(new LarkResponse.StageCost(i3, i4, i5));
                }
                throw new NoWhenBranchMatchedException();
            } else if (onFetchResponse.success_response != null) {
                LarkResponse.Builder a5 = bVar.mo67186a();
                if (a5 == null) {
                    Intrinsics.throwNpe();
                }
                a5.mo67127a(LarkResponse.ResponseStatus.SUCCESS);
                LarkResponse.Builder a6 = bVar.mo67186a();
                if (a6 == null) {
                    Intrinsics.throwNpe();
                }
                String str3 = onFetchResponse.success_response.peer_addr;
                Intrinsics.checkExpressionValueIsNotNull(str3, "fetchResponse.success_response.peer_addr");
                a6.mo67134a(str3);
                OnFetchResponse.StageCost stageCost2 = onFetchResponse.success_response.stage_cost;
                LarkResponse.Builder a7 = bVar.mo67186a();
                if (a7 == null) {
                    Intrinsics.throwNpe();
                }
                if (stageCost2 == null || (num3 = stageCost2.dns_cost) == null) {
                    i = 0;
                } else {
                    i = num3.intValue();
                }
                if (stageCost2 == null || (num2 = stageCost2.tcp_connect_cost) == null) {
                    i2 = 0;
                } else {
                    i2 = num2.intValue();
                }
                if (!(stageCost2 == null || (num = stageCost2.tls_cost) == null)) {
                    i5 = num.intValue();
                }
                a7.mo67133a(new LarkResponse.StageCost(i, i2, i5));
            } else {
                if (onFetchResponse.header_response != null) {
                    ArrayList arrayList = new ArrayList();
                    for (HttpHeader httpHeader : onFetchResponse.header_response.headers) {
                        String str4 = httpHeader.name;
                        Intrinsics.checkExpressionValueIsNotNull(str4, "header.name");
                        String str5 = httpHeader.value;
                        Intrinsics.checkExpressionValueIsNotNull(str5, "header.value");
                        arrayList.add(new HttpHeader(str4, str5));
                    }
                    OnFetchResponse.OnHeaderResponse.Protocol protocol = onFetchResponse.header_response.protocol;
                    if (protocol != null) {
                        int i7 = C19834f.f48399b[protocol.ordinal()];
                        if (i7 == 1) {
                            larkNetProtocol = LarkNetProtocol.UNKNOWN;
                        } else if (i7 == 2) {
                            larkNetProtocol = LarkNetProtocol.HTTP_1_1;
                        } else if (i7 == 3) {
                            larkNetProtocol = LarkNetProtocol.HTTP_2;
                        } else if (i7 == 4) {
                            larkNetProtocol = LarkNetProtocol.QUIC;
                        }
                        LarkResponse.Builder a8 = bVar.mo67186a();
                        if (a8 == null) {
                            Intrinsics.throwNpe();
                        }
                        Integer num7 = onFetchResponse.header_response.status_code;
                        Intrinsics.checkExpressionValueIsNotNull(num7, "fetchResponse.header_response.status_code");
                        a8.mo67132a(new LarkResponse.ResponseHeader(num7.intValue(), larkNetProtocol, arrayList));
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (onFetchResponse.body_response != null) {
                    LarkResponse.Builder a9 = bVar.mo67186a();
                    if (a9 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (a9.mo67139f() == null) {
                        long j = 0;
                        LarkResponse.Builder a10 = bVar.mo67186a();
                        if (a10 == null) {
                            Intrinsics.throwNpe();
                        }
                        LarkResponse.ResponseHeader c = a10.mo67136c();
                        if (c != null) {
                            String a11 = HttpHeader.f48387c.mo67177a("content-length", c.mo67151c());
                            if (!TextUtils.isEmpty(a11)) {
                                Long longOrNull = StringsKt.toLongOrNull(a11);
                                if (longOrNull == null) {
                                    Intrinsics.throwNpe();
                                }
                                j = longOrNull.longValue();
                            }
                            str = HttpHeader.f48387c.mo67177a("content-type", c.mo67151c());
                        } else {
                            str = "";
                        }
                        LarkResponse.Builder a12 = bVar.mo67186a();
                        if (a12 == null) {
                            Intrinsics.throwNpe();
                        }
                        a12.mo67129a(new LarkResponse.ResponseBody(j, str, new ByteArrayOutputStream(onFetchResponse.body_response.body.toByteArray().length)));
                    }
                    LarkResponse.Builder a13 = bVar.mo67186a();
                    if (a13 == null) {
                        Intrinsics.throwNpe();
                    }
                    LarkResponse.ResponseBody f = a13.mo67139f();
                    if (f == null) {
                        Intrinsics.throwNpe();
                    }
                    f.mo67146b().write(onFetchResponse.body_response.body.toByteArray());
                } else if (onFetchResponse.progress_response != null) {
                    OnFetchResponse.OnProgressResponse onProgressResponse = onFetchResponse.progress_response;
                    LarkResponse.Builder a14 = bVar.mo67186a();
                    if (a14 == null) {
                        Intrinsics.throwNpe();
                    }
                    Integer num8 = onProgressResponse.recv_length;
                    Intrinsics.checkExpressionValueIsNotNull(num8, "progressResponse.recv_length");
                    int intValue = num8.intValue();
                    Integer num9 = onProgressResponse.content_length;
                    Intrinsics.checkExpressionValueIsNotNull(num9, "progressResponse.content_length");
                    a14.mo67130a(new LarkResponse.ResponseComplexConnectProgress(intValue, num9.intValue()));
                }
                z = false;
            }
            if (z) {
                LarkNetRequestListener d = bVar.mo67190d();
                LarkResponse.Builder a15 = bVar.mo67186a();
                if (a15 == null) {
                    Intrinsics.throwNpe();
                }
                d.mo67191a(a15.mo67142i());
                LarkNet.f48390a.remove(Long.valueOf(bVar.mo67188b()));
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo67184a(long j, boolean z, byte[] bArr) {
            Intrinsics.checkParameterIsNotNull(bArr, "response");
            TaskInfo bVar = LarkNet.f48390a.get(Long.valueOf(j));
            if (bVar != null) {
                OnFetchResponse decode = OnFetchResponse.ADAPTER.decode(bArr);
                try {
                    Intrinsics.checkExpressionValueIsNotNull(decode, "onFetchResponse");
                    m72335a(decode, bVar);
                } catch (OutOfMemoryError unused) {
                    if (bVar.mo67186a() == null) {
                        bVar.mo67187a(new LarkResponse.Builder());
                    }
                    LarkResponse.Builder a = bVar.mo67186a();
                    if (a == null) {
                        Intrinsics.throwNpe();
                    }
                    a.mo67127a(LarkResponse.ResponseStatus.ERROR);
                    LarkResponse.Builder a2 = bVar.mo67186a();
                    if (a2 == null) {
                        Intrinsics.throwNpe();
                    }
                    a2.mo67128a(new LarkResponse.InnerError(LarkResponse.InnerErrorCode.MEMORY_LIMIT, "OnResponse outOfMemory error"));
                    LarkNetRequestListener d = bVar.mo67190d();
                    LarkResponse.Builder a3 = bVar.mo67186a();
                    if (a3 == null) {
                        Intrinsics.throwNpe();
                    }
                    d.mo67191a(a3.mo67142i());
                    LarkNet.f48390a.remove(Long.valueOf(bVar.mo67188b()));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/bytedance/lark/sdk/LarkNet$TaskInfo;", "", "taskID", "", "request", "Lcom/bytedance/lark/sdk/LarkRequest;", "listener", "Lcom/bytedance/lark/sdk/LarkNetRequestListener;", "(JLcom/bytedance/lark/sdk/LarkRequest;Lcom/bytedance/lark/sdk/LarkNetRequestListener;)V", "larkResponseBuilder", "Lcom/bytedance/lark/sdk/LarkResponse$Builder;", "getLarkResponseBuilder", "()Lcom/bytedance/lark/sdk/LarkResponse$Builder;", "setLarkResponseBuilder", "(Lcom/bytedance/lark/sdk/LarkResponse$Builder;)V", "getListener", "()Lcom/bytedance/lark/sdk/LarkNetRequestListener;", "getRequest", "()Lcom/bytedance/lark/sdk/LarkRequest;", "getTaskID", "()J", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.e$b */
    public static final class TaskInfo {

        /* renamed from: a */
        private LarkResponse.Builder f48392a;

        /* renamed from: b */
        private final long f48393b;

        /* renamed from: c */
        private final LarkRequest f48394c;

        /* renamed from: d */
        private final LarkNetRequestListener f48395d;

        /* renamed from: a */
        public final LarkResponse.Builder mo67186a() {
            return this.f48392a;
        }

        /* renamed from: b */
        public final long mo67188b() {
            return this.f48393b;
        }

        /* renamed from: c */
        public final LarkRequest mo67189c() {
            return this.f48394c;
        }

        /* renamed from: d */
        public final LarkNetRequestListener mo67190d() {
            return this.f48395d;
        }

        /* renamed from: a */
        public final void mo67187a(LarkResponse.Builder aVar) {
            this.f48392a = aVar;
        }

        public TaskInfo(long j, LarkRequest larkRequest, LarkNetRequestListener iVar) {
            Intrinsics.checkParameterIsNotNull(larkRequest, "request");
            Intrinsics.checkParameterIsNotNull(iVar, "listener");
            this.f48393b = j;
            this.f48394c = larkRequest;
            this.f48395d = iVar;
        }
    }

    @Override // com.bytedance.lark.sdk.api.LarkProxyApi
    /* renamed from: a */
    public void mo67173a() {
        ClearNetworkProxyRequest.C19689a aVar = new ClearNetworkProxyRequest.C19689a();
        Sdk instance = Sdk.getInstance();
        byte[] encode = aVar.build().encode();
        Intrinsics.checkExpressionValueIsNotNull(encode, "builder.build().encode()");
        instance.clearNetProxy(new RustTask(encode, 0, 2, null));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/sdk/LarkNet$netRequest$1", "Lcom/bytedance/lark/sdk/LarkNetRequestListener;", "onFetchResponse", "", "response", "Lcom/bytedance/lark/sdk/LarkResponse;", "rust-jvm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.sdk.e$c */
    public static final class C19833c implements LarkNetRequestListener {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f48396a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f48397b;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.lark.sdk.LarkResponse */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.lark.sdk.LarkNetRequestListener
        /* renamed from: a */
        public void mo67191a(LarkResponse larkResponse) {
            Intrinsics.checkParameterIsNotNull(larkResponse, "response");
            this.f48396a.element = larkResponse;
            this.f48397b.countDown();
        }

        C19833c(Ref.ObjectRef objectRef, CountDownLatch countDownLatch) {
            this.f48396a = objectRef;
            this.f48397b = countDownLatch;
        }
    }

    @Override // com.bytedance.lark.sdk.LarkNetApi
    /* renamed from: a */
    public LarkResponse mo67181a(LarkRequest larkRequest) {
        Intrinsics.checkParameterIsNotNull(larkRequest, "request");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        int c = larkRequest.mo67083c() + CalendarSearchResultRv.f82652c;
        if (c <= 0) {
            c = 120000;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        mo67183a(larkRequest, new C19833c(objectRef, countDownLatch));
        countDownLatch.await((long) c, TimeUnit.MILLISECONDS);
        if (objectRef.element == null) {
            LarkResponse.Builder aVar = new LarkResponse.Builder();
            aVar.mo67127a(LarkResponse.ResponseStatus.ERROR);
            aVar.mo67128a(new LarkResponse.InnerError(LarkResponse.InnerErrorCode.WAIT_TIMEOUT, "netRequest countDownLatch wait timeout"));
            objectRef.element = (T) aVar.mo67142i();
        }
        return objectRef.element;
    }

    @Override // com.bytedance.lark.sdk.LarkNetApi
    /* renamed from: a */
    public void mo67182a(long j) {
        CancelFetchRequest.C19685a aVar = new CancelFetchRequest.C19685a();
        aVar.f48131a = Long.valueOf(j);
        Sdk instance = Sdk.getInstance();
        byte[] encode = aVar.build().encode();
        Intrinsics.checkExpressionValueIsNotNull(encode, "cancelRequestBuilder.build().encode()");
        instance.cancelNetRequestAsync(new RustTask(encode, j));
    }

    /* renamed from: b */
    private final FetchRequest m72328b(LarkRequest larkRequest) {
        FetchRequest.Method method;
        FetchRequest.Priority priority;
        DomainSettings.Alias alias;
        FetchRequest.C19695a aVar = new FetchRequest.C19695a();
        aVar.f48152i = Integer.valueOf(larkRequest.mo67091k());
        aVar.f48144a = larkRequest.mo67081a();
        aVar.f48147d = Integer.valueOf(larkRequest.mo67083c() / 1000);
        aVar.f48148e = Boolean.valueOf(larkRequest.mo67084d());
        switch (C19835g.f48400a[larkRequest.mo67082b().ordinal()]) {
            case 1:
                method = FetchRequest.Method.GET;
                break;
            case 2:
                method = FetchRequest.Method.POST;
                break;
            case 3:
                method = FetchRequest.Method.PUT;
                break;
            case 4:
                method = FetchRequest.Method.DELETE;
                break;
            case 5:
                method = FetchRequest.Method.PATCH;
                break;
            case 6:
                method = FetchRequest.Method.HEAD;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        aVar.f48145b = method;
        aVar.f48149f = Long.valueOf(larkRequest.mo67088h());
        int i = C19835g.f48401b[larkRequest.mo67085e().ordinal()];
        if (i == 1) {
            priority = FetchRequest.Priority.HIGH;
        } else if (i == 2) {
            priority = FetchRequest.Priority.MEDIUM;
        } else if (i == 3) {
            priority = FetchRequest.Priority.LOW;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        aVar.f48150g = priority;
        switch (C19835g.f48402c[larkRequest.mo67086f().ordinal()]) {
            case 1:
                alias = DomainSettings.Alias.UNKNOWN;
                break;
            case 2:
                alias = DomainSettings.Alias.API;
                break;
            case 3:
                alias = DomainSettings.Alias.FILE;
                break;
            case 4:
                alias = DomainSettings.Alias.OAPI;
                break;
            case 5:
                alias = DomainSettings.Alias.DRIVE;
                break;
            case 6:
                alias = DomainSettings.Alias.DOCS;
                break;
            case 7:
                alias = DomainSettings.Alias.MINA;
                break;
            case 8:
                alias = DomainSettings.Alias.OPEN;
                break;
            case 9:
                alias = DomainSettings.Alias.DOCS_API;
                break;
            case 10:
                alias = DomainSettings.Alias.PASSPORT;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        aVar.f48153j = alias;
        for (HttpHeader bVar : larkRequest.mo67087g()) {
            HttpHeader.C19711a aVar2 = new HttpHeader.C19711a();
            aVar2.f48170a = bVar.mo67175a();
            aVar2.f48171b = bVar.mo67176b();
            aVar.f48146c.add(aVar2.build());
        }
        aVar.f48151h = Boolean.valueOf(larkRequest.mo67090j());
        FetchRequest a = aVar.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "requestBuilder.build()");
        return a;
    }

    /* renamed from: a */
    public void mo67183a(LarkRequest larkRequest, LarkNetRequestListener iVar) {
        Intrinsics.checkParameterIsNotNull(larkRequest, "request");
        Intrinsics.checkParameterIsNotNull(iVar, "listener");
        f48390a.put(Long.valueOf(larkRequest.mo67088h()), new TaskInfo(larkRequest.mo67088h(), larkRequest, iVar));
        Sdk instance = Sdk.getInstance();
        byte[] encode = m72328b(larkRequest).encode();
        Intrinsics.checkExpressionValueIsNotNull(encode, "convertRequest(request).encode()");
        instance.sendNetRequestAsync(new RustTask(encode, larkRequest.mo67088h()));
    }

    /* renamed from: b */
    private final String m72329b(String str, String str2, LarkProxyApi.ProxyType proxyType) {
        String str3;
        if (proxyType == LarkProxyApi.ProxyType.HTTPS) {
            str3 = "https://";
        } else {
            str3 = "http://";
        }
        return str3 + str + ':' + str2;
    }

    @Override // com.bytedance.lark.sdk.api.LarkProxyApi
    /* renamed from: a */
    public void mo67174a(String str, String str2, LarkProxyApi.ProxyType proxyType) {
        Intrinsics.checkParameterIsNotNull(str, "ipAdder");
        Intrinsics.checkParameterIsNotNull(str2, "port");
        Intrinsics.checkParameterIsNotNull(proxyType, "proxyType");
        SetNetworkProxyRequest.C19759a aVar = new SetNetworkProxyRequest.C19759a();
        aVar.f48225a = m72329b(str, str2, proxyType);
        Sdk instance = Sdk.getInstance();
        byte[] encode = aVar.build().encode();
        Intrinsics.checkExpressionValueIsNotNull(encode, "builder.build().encode()");
        instance.setNetProxy(new RustTask(encode, 0, 2, null));
    }
}
