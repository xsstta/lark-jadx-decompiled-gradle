package com.bytedance.ee.bear.list.makecopy;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.BinderIMakeCopyCallback;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0003\u0019\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002JH\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/list/makecopy/MakeCopyExecutor;", "", "mNetService", "Lcom/bytedance/ee/bear/contract/NetService;", "(Lcom/bytedance/ee/bear/contract/NetService;)V", "mDisposable", "Lio/reactivex/disposables/Disposable;", "getMNetService", "()Lcom/bytedance/ee/bear/contract/NetService;", "setMNetService", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "objToken", "", ShareHitPoint.f121869d, "", "parentToken", "title", "ownerType", "makeCopy", "", "subType", "suffix", "makeCopyCallback", "Lcom/bytedance/ee/bear/contract/BinderIMakeCopyCallback;", "Companion", "MakeCopyParser", "MakeCopyParserV2", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.makecopy.a */
public final class MakeCopyExecutor {

    /* renamed from: a */
    public static final Companion f23333a = new Companion(null);

    /* renamed from: b */
    private Disposable f23334b;

    /* renamed from: c */
    private NetService f23335c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/list/makecopy/MakeCopyExecutor$Companion;", "", "()V", "TAG", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.makecopy.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/list/makecopy/MakeCopyExecutor$MakeCopyParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/list/makecopy/MakeCopyResult;", "(Lcom/bytedance/ee/bear/list/makecopy/MakeCopyExecutor;)V", "parse", "json", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.makecopy.a$b */
    public final class MakeCopyParser implements NetService.AbstractC5074c<NetService.Result<MakeCopyResult>> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public MakeCopyParser() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<MakeCopyResult> parse(String str) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                String string = optJSONObject.getString("obj_token");
                String string2 = optJSONObject.getString("token");
                String string3 = optJSONObject.getString("url");
                Intrinsics.checkExpressionValueIsNotNull(string, "objToken");
                Intrinsics.checkExpressionValueIsNotNull(string2, "token");
                Intrinsics.checkExpressionValueIsNotNull(string3, "url");
                MakeCopyResult makeCopyResult = new MakeCopyResult(string, string2, string3);
                NetService.Result<MakeCopyResult> result = new NetService.Result<>();
                result.data = makeCopyResult;
                return result;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/list/makecopy/MakeCopyExecutor$MakeCopyParserV2;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/list/makecopy/MakeCopyResult;", "(Lcom/bytedance/ee/bear/list/makecopy/MakeCopyExecutor;)V", "parse", "json", "", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.makecopy.a$c */
    public final class MakeCopyParserV2 implements NetService.AbstractC5074c<NetService.Result<MakeCopyResult>> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public MakeCopyParserV2() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<MakeCopyResult> parse(String str) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("entities").optJSONObject("nodes").optJSONObject(optJSONObject.optJSONArray("node_list").optString(0));
                String optString = optJSONObject2.optString("obj_token");
                String optString2 = optJSONObject2.optString("token");
                String optString3 = optJSONObject2.optString("url");
                Intrinsics.checkExpressionValueIsNotNull(optString, "objToken");
                Intrinsics.checkExpressionValueIsNotNull(optString2, "token");
                Intrinsics.checkExpressionValueIsNotNull(optString3, "url");
                MakeCopyResult makeCopyResult = new MakeCopyResult(optString, optString2, optString3);
                NetService.Result<MakeCopyResult> result = new NetService.Result<>();
                result.data = makeCopyResult;
                return result;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public MakeCopyExecutor(NetService netService) {
        Intrinsics.checkParameterIsNotNull(netService, "mNetService");
        this.f23335c = netService;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.makecopy.a$e */
    public static final class C8598e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BinderIMakeCopyCallback f23340a;

        C8598e(BinderIMakeCopyCallback binderIMakeCopyCallback) {
            this.f23340a = binderIMakeCopyCallback;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            String str;
            int i;
            if (th == null || (str = th.getMessage()) == null) {
                str = "";
            }
            if (th instanceof NetService.ServerErrorException) {
                i = ((NetService.ServerErrorException) th).getCode();
            } else {
                i = -1;
            }
            this.f23340a.onFailed(str, i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/list/makecopy/MakeCopyResult;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.makecopy.a$d */
    public static final class C8597d<T> implements Consumer<NetService.Result<MakeCopyResult>> {

        /* renamed from: a */
        final /* synthetic */ BinderIMakeCopyCallback f23338a;

        /* renamed from: b */
        final /* synthetic */ String f23339b;

        C8597d(BinderIMakeCopyCallback binderIMakeCopyCallback, String str) {
            this.f23338a = binderIMakeCopyCallback;
            this.f23339b = str;
        }

        /* renamed from: a */
        public final void accept(NetService.Result<MakeCopyResult> result) {
            MakeCopyResult makeCopyResult;
            int i;
            if (result != null) {
                makeCopyResult = (MakeCopyResult) result.data;
            } else {
                makeCopyResult = null;
            }
            if (makeCopyResult != null) {
                this.f23338a.onSucceed(((MakeCopyResult) result.data).getObj_token(), ((MakeCopyResult) result.data).getUrl(), this.f23339b);
                return;
            }
            BinderIMakeCopyCallback binderIMakeCopyCallback = this.f23338a;
            if (result != null) {
                i = result.code;
            } else {
                i = -1;
            }
            binderIMakeCopyCallback.onFailed("make a copy result is null", i);
        }
    }

    /* renamed from: a */
    private final NetService.C5076e m35870a(String str, int i, String str2, String str3, int i2) {
        String str4;
        if (FolderVersion.Companion.mo32529b(i2)) {
            str4 = "/space/api/explorer/v2/clone/";
        } else {
            str4 = "/space/api/explorer/clone/";
        }
        NetService.C5077f fVar = new NetService.C5077f(str4);
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", str);
        hashMap.put("obj_type", String.valueOf(i));
        hashMap.put("parent_token", str2);
        hashMap.put("title", str3);
        C8275a aVar = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.SHEET");
        if (i == aVar.mo32555b() && C4211a.m17514a().mo16536a("ccm.sheet.async_make_copy", false)) {
            Boolean bool = Boolean.TRUE;
            hashMap.put("async", String.valueOf(true));
        }
        fVar.mo20147a(hashMap);
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33531a(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, com.bytedance.ee.bear.contract.BinderIMakeCopyCallback r14) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.makecopy.MakeCopyExecutor.mo33531a(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.bytedance.ee.bear.contract.BinderIMakeCopyCallback):void");
    }
}
