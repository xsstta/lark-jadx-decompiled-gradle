package com.ss.android.lark.oncall.service;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.Coordinate;
import com.bytedance.lark.pb.helpdesk.v1.CreateOncallChatRequest;
import com.bytedance.lark.pb.helpdesk.v1.CreateOncallChatResponse;
import com.bytedance.lark.pb.helpdesk.v1.GetHomePageOncallsRequest;
import com.bytedance.lark.pb.helpdesk.v1.GetHomePageOncallsResponse;
import com.bytedance.lark.pb.helpdesk.v1.GetOncallsRequest;
import com.bytedance.lark.pb.helpdesk.v1.GetOncallsResponse;
import com.bytedance.lark.pb.helpdesk.v1.PullAllOncallTagsRequest;
import com.bytedance.lark.pb.helpdesk.v1.PullAllOncallTagsResponse;
import com.bytedance.lark.pb.helpdesk.v1.PullOncallByTagsRequest;
import com.bytedance.lark.pb.helpdesk.v1.PullOncallByTagsResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.oncall.entity.OnCallTag;
import com.ss.android.lark.oncall.entity.p2396a.C48709a;
import com.ss.android.lark.oncall.service.dto.PullOnCallsResponse;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/oncall/service/OnCallService;", "", "()V", "Companion", "im_oncall_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.oncall.service.b */
public final class OnCallService {

    /* renamed from: a */
    public static final Companion f122440a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J&\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0016J2\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006H\u0016J<\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006H\u0016J8\u0010\r\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0016J&\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H\u0016J\u001c\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u0006H\u0016J.\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00190\u0006H\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/oncall/service/OnCallService$Companion;", "Lcom/ss/android/lark/oncall/service/IOnCallService;", "()V", "getHomePageOnCall", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/oncall/entity/OnCall;", "getLocalOnCalls", "offset", "", "count", "getOnCallChatId", "userId", "", "onCallId", "oncallId", "extra", "faqId", "userID", "longitude", "", "latitude", "pullAllOnCalls", "Lcom/ss/android/lark/oncall/service/dto/PullOnCallsResponse;", "pullOnCallTags", "Lcom/ss/android/lark/oncall/entity/OnCallTag;", "pullOnCallsByTag", "tagId", "im_oncall_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.oncall.service.b$a */
    public static final class Companion implements AbstractC48711a {
        private Companion() {
        }

        /* renamed from: a */
        public void mo169959a(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(str2, "oncallId");
            CreateOncallChatRequest.C17254a b = new CreateOncallChatRequest.C17254a().mo60663a(str).mo60665b(str2);
            CreateOncallChatRequest.AdditionalData.C17252a aVar = new CreateOncallChatRequest.AdditionalData.C17252a();
            if (!TextUtils.isEmpty(str3)) {
                aVar.mo60656a(str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                aVar.mo60658b(str4);
            }
            b.mo60662a(aVar.build());
            SdkSender.asynSendRequestNonWrap(Command.CREATE_ONCALL_CHAT, b, iGetDataCallback, C48714c.f122443a);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/oncall/entity/OnCall;", "kotlin.jvm.PlatformType", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.oncall.service.b$a$a */
        public static final class C48712a<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C48712a f122441a = new C48712a();

            C48712a() {
            }

            /* renamed from: a */
            public final List<OnCall> parse(byte[] bArr) {
                return C48709a.m191938a(GetHomePageOncallsResponse.ADAPTER.decode(bArr).oncalls);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/oncall/entity/OnCall;", "kotlin.jvm.PlatformType", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.oncall.service.b$a$b */
        static final class C48713b<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C48713b f122442a = new C48713b();

            C48713b() {
            }

            /* renamed from: a */
            public final List<OnCall> parse(byte[] bArr) {
                return C48709a.m191938a(GetOncallsResponse.ADAPTER.decode(bArr).oncalls);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.oncall.service.b$a$c */
        public static final class C48714c<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C48714c f122443a = new C48714c();

            C48714c() {
            }

            /* renamed from: a */
            public final String parse(byte[] bArr) {
                return CreateOncallChatResponse.ADAPTER.decode(bArr).chat_id;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.oncall.service.b$a$d */
        public static final class C48715d<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C48715d f122444a = new C48715d();

            C48715d() {
            }

            /* renamed from: a */
            public final String parse(byte[] bArr) {
                return CreateOncallChatResponse.ADAPTER.decode(bArr).chat_id;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/oncall/entity/OnCallTag;", "kotlin.jvm.PlatformType", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.oncall.service.b$a$f */
        static final class C48717f<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C48717f f122446a = new C48717f();

            C48717f() {
            }

            /* renamed from: a */
            public final List<OnCallTag> parse(byte[] bArr) {
                return C48709a.m191939b(PullAllOncallTagsResponse.ADAPTER.decode(bArr).tags);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/oncall/service/dto/PullOnCallsResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.oncall.service.b$a$e */
        static final class C48716e<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C48716e f122445a = new C48716e();

            C48716e() {
            }

            /* renamed from: a */
            public final PullOnCallsResponse parse(byte[] bArr) {
                GetOncallsResponse decode = GetOncallsResponse.ADAPTER.decode(bArr);
                List<OnCall> a = C48709a.m191938a(decode.oncalls);
                Boolean bool = decode.has_more;
                Intrinsics.checkExpressionValueIsNotNull(bool, "hasMore");
                return new PullOnCallsResponse(a, bool.booleanValue());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/oncall/service/dto/PullOnCallsResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.oncall.service.b$a$g */
        static final class C48718g<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C48718g f122447a = new C48718g();

            C48718g() {
            }

            /* renamed from: a */
            public final PullOnCallsResponse parse(byte[] bArr) {
                PullOncallByTagsResponse decode = PullOncallByTagsResponse.ADAPTER.decode(bArr);
                List<OnCall> a = C48709a.m191938a(decode.oncalls);
                Boolean bool = decode.has_more;
                Intrinsics.checkExpressionValueIsNotNull(bool, "pbResponse.has_more");
                return new PullOnCallsResponse(a, bool.booleanValue());
            }
        }

        @Override // com.ss.android.lark.oncall.service.AbstractC48711a
        /* renamed from: a */
        public void mo169954a(IGetDataCallback<List<OnCallTag>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.PULL_ALL_ONCALL_TAGS, new PullAllOncallTagsRequest.C17268a(), iGetDataCallback, C48717f.f122446a);
        }

        /* renamed from: b */
        public void mo169960b(IGetDataCallback<List<OnCall>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_HOME_PAGE_ONCALLS, new GetHomePageOncallsRequest.C17258a(), iGetDataCallback, C48712a.f122441a);
        }

        @Override // com.ss.android.lark.oncall.service.AbstractC48711a
        /* renamed from: a */
        public List<OnCall> mo169952a(int i, int i2) {
            Object syncSend = SdkSender.syncSend(Command.GET_ONCALLS, new GetOncallsRequest.C17262a().mo60683b(Integer.valueOf(i)).mo60681a(Integer.valueOf(i2)), C48713b.f122442a);
            Intrinsics.checkExpressionValueIsNotNull(syncSend, "SdkSender.syncSend<List<…se.oncalls)\n            }");
            return (List) syncSend;
        }

        @Override // com.ss.android.lark.oncall.service.AbstractC48711a
        /* renamed from: a */
        public void mo169953a(int i, int i2, IGetDataCallback<PullOnCallsResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_ONCALLS, new GetOncallsRequest.C17262a().mo60683b(Integer.valueOf(i)).mo60681a(Integer.valueOf(i2)), iGetDataCallback, C48716e.f122445a);
        }

        @Override // com.ss.android.lark.oncall.service.AbstractC48711a
        /* renamed from: a */
        public void mo169956a(String str, String str2, IGetDataCallback<String> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(str2, "onCallId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            mo169958a(str, str2, (String) null, iGetDataCallback);
        }

        @Override // com.ss.android.lark.oncall.service.AbstractC48711a
        /* renamed from: a */
        public void mo169955a(String str, int i, int i2, IGetDataCallback<PullOnCallsResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "tagId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            SdkSender.asynSendRequestNonWrap(Command.PULL_ONCALL_BY_TAGS, new PullOncallByTagsRequest.C17272a().mo60704a(arrayList).mo60703a(Integer.valueOf(i)).mo60706b(Integer.valueOf(i2)), iGetDataCallback, C48718g.f122447a);
        }

        /* renamed from: a */
        public void mo169958a(String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "userId");
            Intrinsics.checkParameterIsNotNull(str2, "oncallId");
            mo169959a(str, str2, str3, (String) null, iGetDataCallback);
        }

        /* renamed from: a */
        public void mo169957a(String str, String str2, float f, float f2, IGetDataCallback<String> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "userID");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.CREATE_ONCALL_CHAT, new CreateOncallChatRequest.C17254a().mo60665b(str2).mo60663a(str).mo60662a(new CreateOncallChatRequest.AdditionalData.C17252a().mo60653a(new Coordinate.C14858a().mo54497b(Float.valueOf(f2)).mo54495a(Float.valueOf(f)).build()).build()), iGetDataCallback, C48715d.f122444a);
        }
    }
}
