package com.ss.android.lark.calendar.impl.rustadapter.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarSaveInfo;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import com.bytedance.lark.pb.calendar.v1.CreateCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.CreateCalendarResponse;
import com.bytedance.lark.pb.calendar.v1.DeleteCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.FetchCalendarsRequest;
import com.bytedance.lark.pb.calendar.v1.FetchCalendarsResponse;
import com.bytedance.lark.pb.calendar.v1.PatchCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.PatchCalendarResponse;
import com.bytedance.lark.pb.calendar.v1.PullCalendarInstancesRequest;
import com.bytedance.lark.pb.calendar.v1.PullCalendarInstancesResponse;
import com.bytedance.lark.pb.calendar.v1.SubscribeCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.UnsubscribeCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.UploadCalendarCoverImageRequest;
import com.bytedance.lark.pb.calendar.v1.UploadCalendarCoverImageResponse;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.p1576d.C32602a;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.pb.calendars.GetCalendarIDByShareTokenRequest;
import com.ss.android.lark.pb.calendars.GetCalendarIDByShareTokenResponse;
import com.ss.android.lark.sdk.SdkSender;
import java.io.File;
import java.util.List;
import java.util.TimeZone;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okio.ByteString;
import okio.C69705k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\f2\u0006\u0010\r\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\u0006\u0010\u0012\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\f2\u0006\u0010\u0012\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J!\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\f2\u0006\u0010\u0018\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u0014JE\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020#J\u0011\u0010$\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0011\u0010&\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0002\u0010%J!\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\f2\u0006\u0010\r\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ!\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\u0006\u0010\u0012\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J!\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f2\u0006\u0010\u0012\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J!\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\f2\u0006\u0010-\u001a\u00020.H@ø\u0001\u0000¢\u0006\u0002\u0010/R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarDetailService;", "", "()V", "defaultShareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "getDefaultShareOption", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "emptyCalendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "getEmptyCalendar", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "createCalendar", "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "saveInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarSaveInfo;", "(Lcom/bytedance/lark/pb/calendar/v1/CalendarSaveInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCalendar", "", "calServerId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCalendarById", "Lcom/bytedance/lark/pb/calendar/v1/FetchCalendarsResponse;", "getCalendarIdByToken", "shareToken", "getCalendarInstances", "Lcom/bytedance/lark/pb/calendar/v1/PullCalendarInstancesResponse;", "beginTimeSecond", "", "loadFuture", "lastMinTimeSpan", "", "lastEventId", "(Ljava/lang/String;JZLjava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentCalendarTenantInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;", "getNewCalendar", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSettings", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "patchCalendar", "subscribeCalendar", "unsubscribeCalendar", "uploadCalendarCover", "Lcom/bytedance/lark/pb/calendar/v1/UploadCalendarCoverImageResponse;", "cover", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.a */
public final class CalendarDetailService {

    /* renamed from: a */
    public static final CalendarDetailService f83432a = new CalendarDetailService();

    /* renamed from: b */
    private static final Calendar.CalendarShareOptions f83433b;

    /* renamed from: c */
    private static final Calendar f83434c;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"getNewCalendar", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.rustadapter.service.CalendarDetailService", mo239173f = "CalendarDetailService.kt", mo239174i = {0}, mo239175l = {87}, mo239176m = "getNewCalendar", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.a$c */
    public static final class C32529c extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CalendarDetailService this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32529c(CalendarDetailService aVar, Continuation cVar) {
            super(cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo118840b(this);
        }
    }

    private CalendarDetailService() {
    }

    /* renamed from: a */
    public final Calendar.CalendarShareOptions mo118831a() {
        return f83433b;
    }

    /* renamed from: b */
    public final CalendarTenantInfo mo118837b() {
        CalendarTenantInfo.C15568a aVar = new CalendarTenantInfo.C15568a();
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        CalendarTenantInfo.C15568a a = aVar.mo56487a(loginDependency.mo108271c());
        AbstractC30054s loginDependency2 = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency2, "CalendarDependencyHolder…endency.loginDependency()");
        CalendarTenantInfo a2 = a.mo56489b(loginDependency2.mo108272d()).build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarTenantInfo.Build…ame)\n            .build()");
        return a2;
    }

    static {
        Calendar.CalendarShareOptions a = new Calendar.CalendarShareOptions.C15506a().mo56122a(Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER).mo56124b(Calendar.ShareOption.SHARE_OPT_FREE_BUSY_READER).mo56125c(Calendar.ShareOption.SHARE_OPT_READER).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "Calendar.CalendarShareOp…DER)\n            .build()");
        f83433b = a;
        Calendar a2 = new Calendar.C15508a().mo56141a("").mo56148b("").mo56154d("").mo56156e("").mo56164i("").mo56158f("").mo56155e(Calendar.DEFAULT_IS_PUBLIC).mo56132a(a).build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "Calendar.Builder()\n     …ion)\n            .build()");
        f83434c = a2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.a$b */
    static final class C32528b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C32528b f83436a = new C32528b();

        C32528b() {
        }

        /* renamed from: a */
        public final String parse(byte[] bArr) {
            return GetCalendarIDByShareTokenResponse.ADAPTER.decode(bArr).mcalendar_id;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.a$d */
    public static final class C32530d implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ Continuation f83437a;

        C32530d(Continuation cVar) {
            this.f83437a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Continuation cVar = this.f83437a;
            Result.Companion aVar = Result.Companion;
            cVar.resumeWith(Result.m271569constructorimpl(calendarSetting));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.a$a */
    static final class C32527a<T> implements SdkSender.IParser<Calendar> {

        /* renamed from: a */
        public static final C32527a f83435a = new C32527a();

        C32527a() {
        }

        /* renamed from: a */
        public final Calendar parse(byte[] bArr) {
            List<Calendar> list = CreateCalendarResponse.ADAPTER.decode(bArr).calendars;
            Intrinsics.checkExpressionValueIsNotNull(list, "CreateCalendarResponse.A…PTER.decode(it).calendars");
            return (Calendar) CollectionsKt.firstOrNull((List) list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.a$e */
    static final class C32531e<T> implements SdkSender.IParser<Calendar> {

        /* renamed from: a */
        public static final C32531e f83438a = new C32531e();

        C32531e() {
        }

        /* renamed from: a */
        public final Calendar parse(byte[] bArr) {
            List<Calendar> list = PatchCalendarResponse.ADAPTER.decode(bArr).calendars;
            Intrinsics.checkExpressionValueIsNotNull(list, "PatchCalendarResponse.ADAPTER.decode(it).calendars");
            return (Calendar) CollectionsKt.firstOrNull((List) list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "Lcom/bytedance/lark/pb/calendar/v1/UploadCalendarCoverImageResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.rustadapter.service.CalendarDetailService$uploadCalendarCover$2", mo239173f = "CalendarDetailService.kt", mo239174i = {0, 0}, mo239175l = {156}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext", "image"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.a$f */
    static final class C32532f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SdkSender.C53233d<UploadCalendarCoverImageResponse>>, Object> {
        final /* synthetic */ File $cover;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32532f(File file, Continuation cVar) {
            super(2, cVar);
            this.$cover = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C32532f fVar = new C32532f(this.$cover, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super SdkSender.C53233d<UploadCalendarCoverImageResponse>> cVar) {
            return ((C32532f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                ByteString readByteString = C69705k.m267590a(C69705k.m267595a(this.$cover)).readByteString();
                Command command = Command.UPLOAD_CALENDAR_COVER_IMAGE;
                UploadCalendarCoverImageRequest.C16108a a2 = new UploadCalendarCoverImageRequest.C16108a().mo57866a(readByteString);
                Intrinsics.checkExpressionValueIsNotNull(a2, "UploadCalendarCoverImage…st.Builder().image(image)");
                ProtoAdapter<UploadCalendarCoverImageResponse> protoAdapter = UploadCalendarCoverImageResponse.ADAPTER;
                Intrinsics.checkExpressionValueIsNotNull(protoAdapter, "UploadCalendarCoverImageResponse.ADAPTER");
                this.L$0 = ahVar;
                this.L$1 = readByteString;
                this.label = 1;
                obj = C32602a.m124912a(command, a2, protoAdapter, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                ByteString byteString = (ByteString) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo118840b(kotlin.coroutines.Continuation<? super com.bytedance.lark.pb.calendar.v1.Calendar> r6) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.rustadapter.service.CalendarDetailService.mo118840b(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo118836a(Continuation<? super CalendarSetting> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        C30022a.f74884c.mo108450a(new C32530d(gVar));
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }

    /* renamed from: a */
    public final Object mo118832a(CalendarSaveInfo calendarSaveInfo, Continuation<? super SdkSender.C53233d<Calendar>> cVar) {
        Command command = Command.CREATE_CALENDAR;
        CreateCalendarRequest.C15576a a = new CreateCalendarRequest.C15576a().mo56510a(CollectionsKt.listOf(calendarSaveInfo));
        Intrinsics.checkExpressionValueIsNotNull(a, "CreateCalendarRequest.Bu…e_infos(listOf(saveInfo))");
        return C32602a.m124913a(command, a, C32527a.f83435a, cVar);
    }

    /* renamed from: b */
    public final Object mo118838b(CalendarSaveInfo calendarSaveInfo, Continuation<? super SdkSender.C53233d<Calendar>> cVar) {
        Command command = Command.PATCH_CALENDAR;
        PatchCalendarRequest.C15904a a = new PatchCalendarRequest.C15904a().mo57345a(CollectionsKt.listOf(calendarSaveInfo));
        Intrinsics.checkExpressionValueIsNotNull(a, "PatchCalendarRequest.Bui…e_infos(listOf(saveInfo))");
        return C32602a.m124913a(command, a, C32531e.f83438a, cVar);
    }

    /* renamed from: c */
    public final Object mo118841c(String str, Continuation<? super SdkSender.C53233d<Boolean>> cVar) {
        Command command = Command.SUBSCRIBE_CALENDAR;
        SubscribeCalendarRequest.C16068a a = new SubscribeCalendarRequest.C16068a().mo57765a(str);
        Intrinsics.checkExpressionValueIsNotNull(a, "SubscribeCalendarRequest….calendar_id(calServerId)");
        return C32602a.m124913a(command, a, C32602a.m124908a(false, 1, null), cVar);
    }

    /* renamed from: d */
    public final Object mo118842d(String str, Continuation<? super SdkSender.C53233d<Boolean>> cVar) {
        Command command = Command.UNSUBSCRIBE_CALENDAR;
        UnsubscribeCalendarRequest.C16088a a = new UnsubscribeCalendarRequest.C16088a().mo57815a(str);
        Intrinsics.checkExpressionValueIsNotNull(a, "UnsubscribeCalendarReque….calendar_id(calServerId)");
        return C32602a.m124913a(command, a, C32602a.m124908a(false, 1, null), cVar);
    }

    /* renamed from: e */
    public final Object mo118843e(String str, Continuation<? super SdkSender.C53233d<Boolean>> cVar) {
        Command command = Command.DELETE_CALENDAR;
        DeleteCalendarRequest.C15592a a = new DeleteCalendarRequest.C15592a().mo56549a(str);
        Intrinsics.checkExpressionValueIsNotNull(a, "DeleteCalendarRequest.Builder().id(calServerId)");
        return C32602a.m124913a(command, a, C32602a.m124908a(false, 1, null), cVar);
    }

    /* renamed from: a */
    public final Object mo118833a(File file, Continuation<? super SdkSender.C53233d<UploadCalendarCoverImageResponse>> cVar) {
        return C69388e.m266829a(Dispatchers.m266326d(), new C32532f(file, null), cVar);
    }

    /* renamed from: b */
    public final Object mo118839b(String str, Continuation<? super SdkSender.C53233d<String>> cVar) {
        SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.GET_CALENDAR_ID_BY_SHARE_TOKEN, new GetCalendarIDByShareTokenRequest.C49570a().mo172854a(str), C32602a.m124905a((Continuation) gVar), C32528b.f83436a);
        Object a = gVar.mo239163a();
        if (a == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return a;
    }

    /* renamed from: a */
    public final Object mo118835a(String str, Continuation<? super SdkSender.C53233d<FetchCalendarsResponse>> cVar) {
        Command command = Command.FETCH_CALENDARS;
        FetchCalendarsRequest.C15624a a = new FetchCalendarsRequest.C15624a().mo56634a(CollectionsKt.listOf(str));
        Intrinsics.checkExpressionValueIsNotNull(a, "FetchCalendarsRequest.Bu…_ids(listOf(calServerId))");
        ProtoAdapter<FetchCalendarsResponse> protoAdapter = FetchCalendarsResponse.ADAPTER;
        Intrinsics.checkExpressionValueIsNotNull(protoAdapter, "FetchCalendarsResponse.ADAPTER");
        return C32602a.m124912a(command, a, protoAdapter, cVar);
    }

    /* renamed from: a */
    public final Object mo118834a(String str, long j, boolean z, Integer num, String str2, Continuation<? super SdkSender.C53233d<PullCalendarInstancesResponse>> cVar) {
        PullCalendarInstancesRequest.PullType pullType;
        Command command = Command.PULL_CALENDAR_INSTANCES;
        PullCalendarInstancesRequest.C15922a a = new PullCalendarInstancesRequest.C15922a().mo57389a(str);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        PullCalendarInstancesRequest.C15922a a2 = a.mo57391b(timeZone.getID()).mo57388a(C69089a.m265840a(j));
        if (z) {
            pullType = PullCalendarInstancesRequest.PullType.FutureTime;
        } else {
            pullType = PullCalendarInstancesRequest.PullType.PastTime;
        }
        PullCalendarInstancesRequest.C15922a c = a2.mo57386a(pullType).mo57387a(num).mo57392c(str2);
        Intrinsics.checkExpressionValueIsNotNull(c, "PullCalendarInstancesReq…ast_event_id(lastEventId)");
        ProtoAdapter<PullCalendarInstancesResponse> protoAdapter = PullCalendarInstancesResponse.ADAPTER;
        Intrinsics.checkExpressionValueIsNotNull(protoAdapter, "PullCalendarInstancesResponse.ADAPTER");
        return C32602a.m124912a(command, c, protoAdapter, cVar);
    }
}
