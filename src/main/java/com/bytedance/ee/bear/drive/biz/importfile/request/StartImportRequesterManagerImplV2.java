package com.bytedance.ee.bear.drive.biz.importfile.request;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.biz.importfile.exception.DriveStartImportException;
import com.bytedance.ee.bear.drive.biz.importfile.p328b.C6476a;
import com.bytedance.ee.bear.drive.biz.importfile.request.error.C6502a;
import com.bytedance.ee.bear.drive.biz.importfile.request.error.ImportFailedType;
import com.bytedance.ee.bear.drive.importfile.ImportFileEntity;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonObject;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;
import org.p3511d.AbstractC70022d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0005\u000f\u0010\u0011\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2;", "Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManager;", "()V", "mNetService", "Lcom/bytedance/ee/bear/contract/NetService;", "checkImportResult", "", "ticket", "", "jobTimeout", "", "startImport", "objToken", "name", "importType", "CheckImportResult", "CheckImportResultParser", "Companion", "StartImportResult", "StartImportResultParser", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class StartImportRequesterManagerImplV2 extends AbstractC6498c {

    /* renamed from: f */
    public static final Companion f17901f = new Companion(null);

    /* renamed from: g */
    private final NetService f17902g = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$CheckImportResult;", "Ljava/io/Serializable;", "job_status", "", "job_error_msg", "", "url", "token", ShareHitPoint.f121869d, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getJob_error_msg", "()Ljava/lang/String;", "setJob_error_msg", "(Ljava/lang/String;)V", "getJob_status", "()I", "setJob_status", "(I)V", "getToken", "setToken", "getType", "setType", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class CheckImportResult implements Serializable {
        private String job_error_msg;
        private int job_status;
        private String token;
        private String type;
        private String url;

        public static /* synthetic */ CheckImportResult copy$default(CheckImportResult checkImportResult, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = checkImportResult.job_status;
            }
            if ((i2 & 2) != 0) {
                str = checkImportResult.job_error_msg;
            }
            if ((i2 & 4) != 0) {
                str2 = checkImportResult.url;
            }
            if ((i2 & 8) != 0) {
                str3 = checkImportResult.token;
            }
            if ((i2 & 16) != 0) {
                str4 = checkImportResult.type;
            }
            return checkImportResult.copy(i, str, str2, str3, str4);
        }

        public final int component1() {
            return this.job_status;
        }

        public final String component2() {
            return this.job_error_msg;
        }

        public final String component3() {
            return this.url;
        }

        public final String component4() {
            return this.token;
        }

        public final String component5() {
            return this.type;
        }

        public final CheckImportResult copy(int i, String str, String str2, String str3, String str4) {
            return new CheckImportResult(i, str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CheckImportResult) {
                    CheckImportResult checkImportResult = (CheckImportResult) obj;
                    if (!(this.job_status == checkImportResult.job_status) || !Intrinsics.areEqual(this.job_error_msg, checkImportResult.job_error_msg) || !Intrinsics.areEqual(this.url, checkImportResult.url) || !Intrinsics.areEqual(this.token, checkImportResult.token) || !Intrinsics.areEqual(this.type, checkImportResult.type)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.job_status * 31;
            String str = this.job_error_msg;
            int i2 = 0;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.url;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.token;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.type;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public String toString() {
            return "CheckImportResult(job_status=" + this.job_status + ", job_error_msg=" + this.job_error_msg + ", url=" + this.url + ", token=" + this.token + ", type=" + this.type + ")";
        }

        public final String getJob_error_msg() {
            return this.job_error_msg;
        }

        public final int getJob_status() {
            return this.job_status;
        }

        public final String getToken() {
            return this.token;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final void setJob_error_msg(String str) {
            this.job_error_msg = str;
        }

        public final void setJob_status(int i) {
            this.job_status = i;
        }

        public final void setToken(String str) {
            this.token = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public final void setUrl(String str) {
            this.url = str;
        }

        public CheckImportResult(int i, String str, String str2, String str3, String str4) {
            this.job_status = i;
            this.job_error_msg = str;
            this.url = str2;
            this.token = str3;
            this.type = str4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$StartImportResult;", "Ljava/io/Serializable;", "ticket", "", "job_timeout", "", "(Ljava/lang/String;I)V", "getJob_timeout", "()I", "setJob_timeout", "(I)V", "getTicket", "()Ljava/lang/String;", "setTicket", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class StartImportResult implements Serializable {
        private int job_timeout;
        private String ticket;

        public static /* synthetic */ StartImportResult copy$default(StartImportResult startImportResult, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = startImportResult.ticket;
            }
            if ((i2 & 2) != 0) {
                i = startImportResult.job_timeout;
            }
            return startImportResult.copy(str, i);
        }

        public final String component1() {
            return this.ticket;
        }

        public final int component2() {
            return this.job_timeout;
        }

        public final StartImportResult copy(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "ticket");
            return new StartImportResult(str, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof StartImportResult) {
                    StartImportResult startImportResult = (StartImportResult) obj;
                    if (Intrinsics.areEqual(this.ticket, startImportResult.ticket)) {
                        if (this.job_timeout == startImportResult.job_timeout) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.ticket;
            return ((str != null ? str.hashCode() : 0) * 31) + this.job_timeout;
        }

        public String toString() {
            return "StartImportResult(ticket=" + this.ticket + ", job_timeout=" + this.job_timeout + ")";
        }

        public final int getJob_timeout() {
            return this.job_timeout;
        }

        public final String getTicket() {
            return this.ticket;
        }

        public final void setJob_timeout(int i) {
            this.job_timeout = i;
        }

        public final void setTicket(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.ticket = str;
        }

        public StartImportResult(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "ticket");
            this.ticket = str;
            this.job_timeout = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$Companion;", "", "()V", "CHECK_RESULT_URL", "", "FIRST_POLL_INTERVAL", "", "IMPORT_URL", "MOBILE_EVENT_SOURCE", "MOUNT_TYPE", "", "POLL_INTERVAL", "TAG", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "objectFlowable", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$d */
    public static final class C6487d<T, R> implements Function<AbstractC68307f<Object>, AbstractC70020b<?>> {

        /* renamed from: a */
        public static final C6487d f17903a = new C6487d();

        C6487d() {
        }

        /* renamed from: a */
        public final AbstractC68307f<Object> apply(AbstractC68307f<Object> fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "objectFlowable");
            return fVar.mo238019d(3, TimeUnit.SECONDS);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$checkImportResult$d$2", "Lio/reactivex/functions/Predicate;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$CheckImportResult;", "time", "", "getTime", "()I", "setTime", "(I)V", "test", "", "result", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$e */
    public static final class C6488e implements AbstractC68322n<NetService.Result<CheckImportResult>> {

        /* renamed from: a */
        final /* synthetic */ int f17904a;

        /* renamed from: b */
        private int f17905b = 1;

        C6488e(int i) {
            this.f17904a = i;
        }

        /* renamed from: a */
        public boolean test(NetService.Result<CheckImportResult> result) {
            Intrinsics.checkParameterIsNotNull(result, "result");
            C13479a.m54772d("StartImportRequesterManagerImplV2", "takeUtil，status = " + ((CheckImportResult) result.data).getJob_status());
            if (((CheckImportResult) result.data).getJob_status() == 0) {
                return true;
            }
            if (((CheckImportResult) result.data).getJob_status() <= 2) {
                int i = this.f17905b;
                if (i < this.f17904a) {
                    this.f17905b = i + 3;
                    return false;
                }
                throw new IOException("polling time out");
            }
            throw new NetService.ServerErrorException(((CheckImportResult) result.data).getJob_status(), ((CheckImportResult) result.data).getJob_error_msg(), ((CheckImportResult) result.data).toString(), result.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$i */
    static final class C6492i<T> implements Consumer<AbstractC70022d> {

        /* renamed from: a */
        final /* synthetic */ StartImportRequesterManagerImplV2 f17909a;

        C6492i(StartImportRequesterManagerImplV2 startImportRequesterManagerImplV2) {
            this.f17909a = startImportRequesterManagerImplV2;
        }

        /* renamed from: a */
        public final void accept(AbstractC70022d dVar) {
            this.f17909a.f17918b.mo27885a(this.f17909a.f17919c.mo27485a(), "start_import_file");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$StartImportResult;", "kotlin.jvm.PlatformType", "requestRelsut", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$j */
    static final class C6493j<T, R> implements Function<NetService.Result<StartImportResult>, StartImportResult> {

        /* renamed from: a */
        public static final C6493j f17910a = new C6493j();

        C6493j() {
        }

        /* renamed from: a */
        public final StartImportResult apply(NetService.Result<StartImportResult> result) {
            if (result != null && result.code == 0 && result.getData() != null) {
                return result.getData();
            }
            throw new DriveStartImportException();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$CheckImportResultParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$CheckImportResult;", "()V", "parse", "json", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$a */
    public static final class CheckImportResultParser implements NetService.AbstractC5074c<NetService.Result<CheckImportResult>> {
        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<CheckImportResult> parse(String str) {
            Intrinsics.checkParameterIsNotNull(str, "json");
            NetService.Result<CheckImportResult> result = new NetService.Result<>();
            JSONObject jSONObject = new JSONObject(str);
            result.code = jSONObject.optInt("code");
            result.msg = jSONObject.optString("msg");
            result.data = (DATA) ((Serializable) JSON.parseObject(new JSONObject(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).optString("result"), CheckImportResult.class));
            return result;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$StartImportResultParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$StartImportResult;", "()V", "parse", "json", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$c */
    private static final class StartImportResultParser implements NetService.AbstractC5074c<NetService.Result<StartImportResult>> {
        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<StartImportResult> parse(String str) {
            Intrinsics.checkParameterIsNotNull(str, "json");
            NetService.Result<StartImportResult> result = new NetService.Result<>();
            JSONObject jSONObject = new JSONObject(str);
            result.msg = jSONObject.optString("msg");
            result.code = jSONObject.optInt("code");
            result.setData((StartImportResult) JSON.parseObject(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), StartImportResult.class));
            return result;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "checkResult", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$CheckImportResult;", "test"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$f */
    public static final class C6489f<T> implements AbstractC68322n<NetService.Result<CheckImportResult>> {

        /* renamed from: a */
        public static final C6489f f17906a = new C6489f();

        C6489f() {
        }

        /* renamed from: a */
        public final boolean test(NetService.Result<CheckImportResult> result) {
            Intrinsics.checkParameterIsNotNull(result, "checkResult");
            C13479a.m54772d("StartImportRequesterManagerImplV2", "filter，status = " + ((CheckImportResult) result.data).getJob_status());
            if (((CheckImportResult) result.data).getJob_status() == 0) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$CheckImportResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$g */
    public static final class C6490g<T> implements Consumer<NetService.Result<CheckImportResult>> {

        /* renamed from: a */
        final /* synthetic */ StartImportRequesterManagerImplV2 f17907a;

        C6490g(StartImportRequesterManagerImplV2 startImportRequesterManagerImplV2) {
            this.f17907a = startImportRequesterManagerImplV2;
        }

        /* renamed from: a */
        public final void accept(NetService.Result<CheckImportResult> result) {
            C7128a aVar = this.f17907a.f17918b;
            ImportFileEntity importFileEntity = this.f17907a.f17919c;
            Intrinsics.checkExpressionValueIsNotNull(importFileEntity, "mDriveOpenEntity");
            aVar.mo27895b(importFileEntity.mo27485a(), "check_import_result");
            C7128a aVar2 = this.f17907a.f17918b;
            ImportFileEntity importFileEntity2 = this.f17907a.f17919c;
            Intrinsics.checkExpressionValueIsNotNull(importFileEntity2, "mDriveOpenEntity");
            aVar2.mo27888a("success", "DEC0", importFileEntity2.mo27485a());
            String token = ((CheckImportResult) result.data).getToken();
            C13479a.m54764b("StartImportRequesterManagerImplV2", "checkImportResult token = " + C13721c.m55650d(token));
            this.f17907a.f17921e.mo25887a(((CheckImportResult) result.data).getType(), ((CheckImportResult) result.data).getToken(), ((CheckImportResult) result.data).getUrl());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$h */
    public static final class C6491h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ StartImportRequesterManagerImplV2 f17908a;

        C6491h(StartImportRequesterManagerImplV2 startImportRequesterManagerImplV2) {
            this.f17908a = startImportRequesterManagerImplV2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            ImportFailedType importFailedType;
            C7128a aVar = this.f17908a.f17918b;
            ImportFileEntity importFileEntity = this.f17908a.f17919c;
            Intrinsics.checkExpressionValueIsNotNull(importFileEntity, "mDriveOpenEntity");
            aVar.mo27895b(importFileEntity.mo27485a(), "check_import_result");
            C13479a.m54764b("StartImportRequesterManagerImplV2", "checkImportResult throwable = " + th);
            if (th instanceof NetService.ServerErrorException) {
                importFailedType = C6502a.m26104a(((NetService.ServerErrorException) th).getCode());
                Intrinsics.checkExpressionValueIsNotNull(importFailedType, "ErrorCodeV2.getImportFailedType(throwable.code)");
            } else {
                importFailedType = ImportFailedType.FailedCanRetry;
            }
            this.f17908a.f17921e.mo25885a(importFailedType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/drive/biz/importfile/request/StartImportRequesterManagerImplV2$StartImportResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$k */
    static final class C6494k<T> implements Consumer<StartImportResult> {

        /* renamed from: a */
        final /* synthetic */ StartImportRequesterManagerImplV2 f17911a;

        C6494k(StartImportRequesterManagerImplV2 startImportRequesterManagerImplV2) {
            this.f17911a = startImportRequesterManagerImplV2;
        }

        /* renamed from: a */
        public final void accept(StartImportResult startImportResult) {
            C13479a.m54772d("StartImportRequesterManagerImplV2", "ticket " + startImportResult.getTicket());
            C7128a aVar = this.f17911a.f17918b;
            ImportFileEntity importFileEntity = this.f17911a.f17919c;
            Intrinsics.checkExpressionValueIsNotNull(importFileEntity, "mDriveOpenEntity");
            aVar.mo27885a(importFileEntity.mo27485a(), "check_import_result");
            C7128a aVar2 = this.f17911a.f17918b;
            ImportFileEntity importFileEntity2 = this.f17911a.f17919c;
            Intrinsics.checkExpressionValueIsNotNull(importFileEntity2, "mDriveOpenEntity");
            aVar2.mo27895b(importFileEntity2.mo27485a(), "start_import_file");
            this.f17911a.mo25948a(startImportResult.getTicket(), startImportResult.getJob_timeout());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.importfile.request.StartImportRequesterManagerImplV2$l */
    static final class C6495l<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ StartImportRequesterManagerImplV2 f17912a;

        C6495l(StartImportRequesterManagerImplV2 startImportRequesterManagerImplV2) {
            this.f17912a = startImportRequesterManagerImplV2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            ImportFailedType importFailedType;
            C7128a aVar = this.f17912a.f17918b;
            ImportFileEntity importFileEntity = this.f17912a.f17919c;
            Intrinsics.checkExpressionValueIsNotNull(importFileEntity, "mDriveOpenEntity");
            aVar.mo27895b(importFileEntity.mo27485a(), "start_import_file");
            C13479a.m54764b("StartImportRequesterManagerImplV2", "startImport throwable = " + th);
            if (th instanceof NetService.ServerErrorException) {
                importFailedType = C6502a.m26104a(((NetService.ServerErrorException) th).getCode());
                Intrinsics.checkExpressionValueIsNotNull(importFailedType, "ErrorCodeV2.getImportFailedType(throwable.code)");
            } else {
                importFailedType = ImportFailedType.FailedCanRetry;
            }
            this.f17912a.f17921e.mo25885a(importFailedType);
        }
    }

    /* renamed from: a */
    public final void mo25948a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "ticket");
        this.f17920d.mo237937a(this.f17902g.mo20117a(new CheckImportResultParser()).mo20141a(new NetService.C5077f("/space/api/import/result/" + str)).mo238031g(C6487d.f17903a).mo238016c(new C6488e(i)).mo237998a((AbstractC68322n) C6489f.f17906a).mo238004b(C11678b.m48481e()).mo238001b(new C6490g(this), new C6491h(this)));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.importfile.request.AbstractC6498c
    /* renamed from: a */
    public void mo25940a(String str, String str2, int i) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        C13479a.m54764b("StartImportRequesterManagerImplV2", "startImport");
        int b = C6476a.m26023b(i);
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        if (b != aVar.mo32555b() || !C4211a.m17514a().mo16536a("docx_enabled", false) || !C4211a.m17514a().mo16536a("ccm.suite.docx_import_enabled", false)) {
            str3 = C8275a.m34050a(b);
        } else {
            C8275a aVar2 = C8275a.f22378k;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.DOCX");
            str3 = aVar2.mo32553a();
        }
        NetService.C5077f fVar = new NetService.C5077f("/space/api/import/create/");
        fVar.mo20143a(1);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event_source", "15");
        jsonObject.addProperty("file_extension", (String) CollectionsKt.last(StringsKt.split$default((CharSequence) str2, new String[]{"."}, false, 0, 6, (Object) null)));
        jsonObject.addProperty("file_token", str);
        jsonObject.addProperty(ShareHitPoint.f121869d, str3);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("mount_type", (Number) 1);
        jsonObject2.addProperty("mount_key", "");
        jsonObject.add("point", jsonObject2);
        fVar.mo20153c(jsonObject.toString());
        this.f17920d.mo237937a(this.f17902g.mo20117a(new StartImportResultParser()).mo20141a(fVar).mo238013c(new C6492i(this)).mo238019d(1, TimeUnit.SECONDS).mo238020d(C6493j.f17910a).mo237985a(C11678b.m48481e()).mo238001b(new C6494k(this), new C6495l(this)));
    }
}
