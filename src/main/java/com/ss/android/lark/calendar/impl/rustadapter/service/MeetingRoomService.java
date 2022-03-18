package com.ss.android.lark.calendar.impl.rustadapter.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.calendar.v1.CalendarBuilding;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.GetBuildingsRequest;
import com.bytedance.lark.pb.calendar.v1.GetBuildingsResponse;
import com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsInBuildingRequest;
import com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsInBuildingResponse;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.bytedance.lark.pb.calendar.v1.PullAllMeetingRoomsInTenantRequest;
import com.bytedance.lark.pb.calendar.v1.PullAllMeetingRoomsInTenantResponse;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsRequest;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsResponse;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsRequest;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.sdk.SdkSender;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\u00020\u00122\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00050\u0014H\u0007J\u001f\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f0\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J3\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0002\u0010\u0019JO\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010!JW\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010'\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/service/MeetingRoomService;", "", "()V", "getMeetingRoomsInBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/SdkResponse;", "", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "startTime", "", "endTime", "buildingIds", "", "rRule", "meetingRoomFilter", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "(JJLjava/util/List;Ljava/lang/String;Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAllBuilding", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "loadBuildingList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullAllMeetingRoomsInTenantRequest", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMeetingRoomsRequest", "Lcom/bytedance/lark/pb/calendar/v1/SearchMeetingRoomsResponse;", "keywords", "count", "", "needDisabled", "", "(JJLjava/lang/String;ILjava/lang/String;ZLcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMultiMeetingRoomRequest", "Lcom/bytedance/lark/pb/calendar/v1/SearchMeetingRoomsForHierarchicalLevelsResponse;", "keyWord", "needDisabledResource", "cursor", "(JJLjava/lang/String;ILjava/lang/String;ZILcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.h */
public final class MeetingRoomService {

    /* renamed from: a */
    public static final MeetingRoomService f83548a = new MeetingRoomService();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/service/MeetingRoomService$loadBuildingList$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.h$c */
    public static final class C32598c implements SdkSender.IParser<List<? extends CalendarBuilding>> {
        C32598c() {
        }

        /* renamed from: a */
        public List<CalendarBuilding> parse(byte[] bArr) {
            GetBuildingsResponse decode;
            Map<String, CalendarBuilding> map;
            Collection<CalendarBuilding> values;
            if (bArr == null || (decode = GetBuildingsResponse.ADAPTER.decode(bArr)) == null || (map = decode.buildings) == null || (values = map.values()) == null) {
                return null;
            }
            return CollectionsKt.toList(values);
        }
    }

    private MeetingRoomService() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00012\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/bytedance/lark/pb/calendar/v1/CalendarBuilding;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.h$b */
    public static final class C32597b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C32597b f83550a = new C32597b();

        C32597b() {
        }

        /* renamed from: a */
        public final Map<String, CalendarBuilding> parse(byte[] bArr) {
            return GetBuildingsResponse.ADAPTER.decode(bArr).buildings;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/calendar/v1/SearchMeetingRoomsResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.h$e */
    static final class C32600e<T> implements SdkSender.IParser<SearchMeetingRoomsResponse> {

        /* renamed from: a */
        public static final C32600e f83552a = new C32600e();

        C32600e() {
        }

        /* renamed from: a */
        public final SearchMeetingRoomsResponse parse(byte[] bArr) {
            return SearchMeetingRoomsResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/calendar/v1/SearchMeetingRoomsForHierarchicalLevelsResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.h$f */
    static final class C32601f<T> implements SdkSender.IParser<SearchMeetingRoomsForHierarchicalLevelsResponse> {

        /* renamed from: a */
        public static final C32601f f83553a = new C32601f();

        C32601f() {
        }

        /* renamed from: a */
        public final SearchMeetingRoomsForHierarchicalLevelsResponse parse(byte[] bArr) {
            return SearchMeetingRoomsForHierarchicalLevelsResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001aD\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u0001 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00012\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.h$a */
    static final class C32596a<T> implements SdkSender.IParser<Map<String, ? extends CalendarResource>> {

        /* renamed from: a */
        public static final C32596a f83549a = new C32596a();

        C32596a() {
        }

        /* renamed from: a */
        public final Map<String, CalendarResource> parse(byte[] bArr) {
            GetMeetingRoomsInBuildingResponse decode;
            if (bArr == null || (decode = GetMeetingRoomsInBuildingResponse.ADAPTER.decode(bArr)) == null) {
                return null;
            }
            return decode.resources;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001aD\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u0001 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00012\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.h$d */
    static final class C32599d<T> implements SdkSender.IParser<Map<String, ? extends CalendarResource>> {

        /* renamed from: a */
        public static final C32599d f83551a = new C32599d();

        C32599d() {
        }

        /* renamed from: a */
        public final Map<String, CalendarResource> parse(byte[] bArr) {
            PullAllMeetingRoomsInTenantResponse decode;
            if (bArr == null || (decode = PullAllMeetingRoomsInTenantResponse.ADAPTER.decode(bArr)) == null) {
                return null;
            }
            return decode.resources;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124891a(IGetDataCallback<Map<String, CalendarBuilding>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.asynSendRequestNonWrap(Command.GET_BUILDINGS, new GetBuildingsRequest.C15648a(), iGetDataCallback, C32597b.f83550a);
    }

    /* renamed from: a */
    public final Object mo119069a(Continuation<? super SdkResponse<List<CalendarBuilding>>> cVar) {
        return CalendarSDKService.f83473a.mo118917a(Command.GET_BUILDINGS, new GetBuildingsRequest.C15648a(), new C32598c(), cVar);
    }

    /* renamed from: a */
    public final Object mo119068a(long j, long j2, Continuation<? super SdkResponse<Map<String, CalendarResource>>> cVar) {
        PullAllMeetingRoomsInTenantRequest.C15912a b = new PullAllMeetingRoomsInTenantRequest.C15912a().mo57363a(C69089a.m265840a(j)).mo57365b(C69089a.m265840a(j2));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        Command command = Command.PULL_ALL_MEETING_ROOMS_IN_TENANT;
        Intrinsics.checkExpressionValueIsNotNull(b, "builder");
        return aVar.mo118917a(command, b, C32599d.f83551a, cVar);
    }

    /* renamed from: a */
    public final Object mo119067a(long j, long j2, List<String> list, String str, MeetingRoomFilter meetingRoomFilter, Continuation<? super SdkResponse<Map<String, CalendarResource>>> cVar) {
        GetMeetingRoomsInBuildingRequest.C15736a a = new GetMeetingRoomsInBuildingRequest.C15736a().mo56905a(C69089a.m265840a(j)).mo56909b(C69089a.m265840a(j2)).mo56906a(str).mo56907a(list).mo56904a(C69089a.m265837a(false)).mo56903a(meetingRoomFilter);
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        Command command = Command.GET_MEETING_ROOMS_IN_BUILDING;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return aVar.mo118917a(command, a, C32596a.f83549a, cVar);
    }

    /* renamed from: a */
    public final Object mo119066a(long j, long j2, String str, int i, String str2, boolean z, MeetingRoomFilter meetingRoomFilter, Continuation<? super SdkResponse<SearchMeetingRoomsResponse>> cVar) {
        SearchMeetingRoomsRequest.C16028a a = new SearchMeetingRoomsRequest.C16028a().mo57659a(C69089a.m265840a(j)).mo57662b(C69089a.m265840a(j2)).mo57660a(str).mo57658a(C69089a.m265839a(i)).mo57663b(str2).mo57657a(C69089a.m265837a(z)).mo57656a(meetingRoomFilter);
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        Command command = Command.SEARCH_MEETING_ROOMS;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return aVar.mo118917a(command, a, C32600e.f83552a, cVar);
    }

    /* renamed from: a */
    public final Object mo119065a(long j, long j2, String str, int i, String str2, boolean z, int i2, MeetingRoomFilter meetingRoomFilter, Continuation<? super SdkResponse<SearchMeetingRoomsForHierarchicalLevelsResponse>> cVar) {
        SearchMeetingRoomsForHierarchicalLevelsRequest.C16024a a = new SearchMeetingRoomsForHierarchicalLevelsRequest.C16024a().mo57643a(C69089a.m265840a(j)).mo57647b(C69089a.m265840a(j2)).mo57644a(str).mo57642a(C69089a.m265839a(i)).mo57648b(str2).mo57641a(C69089a.m265837a(z)).mo57646b(C69089a.m265839a(i2)).mo57640a(meetingRoomFilter);
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        Command command = Command.SEARCH_MEETING_ROOMS_FOR_HIERARCHICAL_LEVELS;
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        return aVar.mo118917a(command, a, C32601f.f83553a, cVar);
    }
}
