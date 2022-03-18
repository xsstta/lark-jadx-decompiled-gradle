package com.ss.android.lark.calendar.impl.rustadapter.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.calendar.v1.AdvanceSearchCalendarEventRequest;
import com.bytedance.lark.pb.calendar.v1.CalendarEventInstanceTime;
import com.bytedance.lark.pb.calendar.v1.CalendarSaveInfo;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import com.bytedance.lark.pb.calendar.v1.DeleteCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.DisplayTransferChatScrollCheckRequest;
import com.bytedance.lark.pb.calendar.v1.DisplayTransferChatScrollCheckResponse;
import com.bytedance.lark.pb.calendar.v1.EventFilter;
import com.bytedance.lark.pb.calendar.v1.FetchCalendarsRequest;
import com.bytedance.lark.pb.calendar.v1.FetchCalendarsResponse;
import com.bytedance.lark.pb.calendar.v1.GetAllMeetingRoomsAndLevelsRequest;
import com.bytedance.lark.pb.calendar.v1.GetAllMeetingRoomsAndLevelsResponse;
import com.bytedance.lark.pb.calendar.v1.GetBuildingsRequest;
import com.bytedance.lark.pb.calendar.v1.GetBuildingsResponse;
import com.bytedance.lark.pb.calendar.v1.GetCalendarEventShareLinkRequest;
import com.bytedance.lark.pb.calendar.v1.GetCalendarEventShareLinkResponse;
import com.bytedance.lark.pb.calendar.v1.GetCalendarMembersByIdsRequest;
import com.bytedance.lark.pb.calendar.v1.GetCalendarMembersByIdsResponse;
import com.bytedance.lark.pb.calendar.v1.GetCanRenewExpiredVideoMeetingNumberRequest;
import com.bytedance.lark.pb.calendar.v1.GetCanRenewExpiredVideoMeetingNumberResponse;
import com.bytedance.lark.pb.calendar.v1.GetChatFreeBusyFavorRequest;
import com.bytedance.lark.pb.calendar.v1.GetChatFreeBusyFavorResponse;
import com.bytedance.lark.pb.calendar.v1.GetEventInfoByVideoMeetingIdRequest;
import com.bytedance.lark.pb.calendar.v1.GetEventInfoByVideoMeetingIdResponse;
import com.bytedance.lark.pb.calendar.v1.GetGoogleAuthURLRequest;
import com.bytedance.lark.pb.calendar.v1.GetGoogleAuthURLResponse;
import com.bytedance.lark.pb.calendar.v1.GetHasMeetingEventRequest;
import com.bytedance.lark.pb.calendar.v1.GetHasMeetingEventResponse;
import com.bytedance.lark.pb.calendar.v1.GetLocalRoomViewResourceDataRequest;
import com.bytedance.lark.pb.calendar.v1.GetLocalRoomViewResourceDataResponse;
import com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationRequest;
import com.bytedance.lark.pb.calendar.v1.GetPrimaryCalendarLoadingStatusRequest;
import com.bytedance.lark.pb.calendar.v1.GetPrimaryCalendarLoadingStatusResponse;
import com.bytedance.lark.pb.calendar.v1.GetRecentTimezonesRequest;
import com.bytedance.lark.pb.calendar.v1.GetRecentTimezonesResponse;
import com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoRequest;
import com.bytedance.lark.pb.calendar.v1.GetResourceEquipmentsRequest;
import com.bytedance.lark.pb.calendar.v1.GetResourceEquipmentsResponse;
import com.bytedance.lark.pb.calendar.v1.GetResourceWithTokenRequest;
import com.bytedance.lark.pb.calendar.v1.GetResourceWithTokenResponse;
import com.bytedance.lark.pb.calendar.v1.GetRoomViewInstancesRequest;
import com.bytedance.lark.pb.calendar.v1.GetRoomViewInstancesResponse;
import com.bytedance.lark.pb.calendar.v1.GetThirdPartyCalendarSettingsRequest;
import com.bytedance.lark.pb.calendar.v1.GetThirdPartyCalendarSettingsResponse;
import com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityRequest;
import com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityResponse;
import com.bytedance.lark.pb.calendar.v1.GetVideoMeetingByEventRequest;
import com.bytedance.lark.pb.calendar.v1.GetVideoMeetingByEventResponse;
import com.bytedance.lark.pb.calendar.v1.JudgeEventAttendeesChangeAffectRequest;
import com.bytedance.lark.pb.calendar.v1.JudgeEventAttendeesChangeAffectResponse;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.MGetCalendarsWithIDsRequest;
import com.bytedance.lark.pb.calendar.v1.MGetCalendarsWithIDsResponse;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchRequest;
import com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchResponse;
import com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationRequest;
import com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationResponse;
import com.bytedance.lark.pb.calendar.v1.PatchCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.PullAllMeetingRoomsInTenantRequest;
import com.bytedance.lark.pb.calendar.v1.PullAllMeetingRoomsInTenantResponse;
import com.bytedance.lark.pb.calendar.v1.PullEventIndividualAttendeesRequest;
import com.bytedance.lark.pb.calendar.v1.QuickSearchCalendarEventRequest;
import com.bytedance.lark.pb.calendar.v1.QuickSearchCalendarEventResponse;
import com.bytedance.lark.pb.calendar.v1.RecallGoogleTokenRequest;
import com.bytedance.lark.pb.calendar.v1.RevokeExchangeAccountRequest;
import com.bytedance.lark.pb.calendar.v1.RevokeExchangeAccountResponse;
import com.bytedance.lark.pb.calendar.v1.RoomViewFilterConfigs;
import com.bytedance.lark.pb.calendar.v1.SaveCalendarWithMembersRequest;
import com.bytedance.lark.pb.calendar.v1.SaveThirdPartyCalendarSettingsRequest;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsRequest;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsResponse;
import com.bytedance.lark.pb.calendar.v1.SeizeResourceRequest;
import com.bytedance.lark.pb.calendar.v1.SeizeResourceResponse;
import com.bytedance.lark.pb.calendar.v1.SetChatFreeBusyFavorRequest;
import com.bytedance.lark.pb.calendar.v1.SetMobileNormalViewTimezoneRequest;
import com.bytedance.lark.pb.calendar.v1.SetSeizeResourceWhetherNeedPopUpRequest;
import com.bytedance.lark.pb.calendar.v1.ShareCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.SortChattersInChatRequest;
import com.bytedance.lark.pb.calendar.v1.SortChattersInChatResponse;
import com.bytedance.lark.pb.calendar.v1.SubscribeCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.SubscribeCalendarResponse;
import com.bytedance.lark.pb.calendar.v1.ThirdPartyCalendarSetting;
import com.bytedance.lark.pb.calendar.v1.UnsubscribeCalendarRequest;
import com.bytedance.lark.pb.calendar.v1.UpdateRecentTimezonesRequest;
import com.bytedance.lark.pb.calendar.v1.UpdateRoomViewResourceDataRequest;
import com.bytedance.lark.pb.calendar.v1.UpdateRoomViewResourceDataResponse;
import com.bytedance.lark.pb.calendar.v1.UpgradeToChatRequest;
import com.bytedance.lark.pb.calendar.v1.VideoMeeting;
import com.bytedance.lark.pb.settings.v1.GetSettingsRequest;
import com.bytedance.lark.pb.settings.v1.GetSettingsResponse;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26249aa;
import com.larksuite.framework.utils.CollectionUtils;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimeZoneItemData;
import com.ss.android.lark.calendar.impl.features.events.detail.share.util.ImageUtil;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.preempt.model.GetResourceWithTokenUnit;
import com.ss.android.lark.calendar.impl.features.search.SearchCalendarEventResult;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventShareLink;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWithMembers;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ChatFreeBusyFavor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoStartEndTime;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeeting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DoVideoMeetingEventInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.FetchCalendarData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetMeetingRoomsStatusInformationResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetResourceCheckInInfoResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MultiCalendarSearchContentData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.PullEventIndividualAttendeesResponse;
import com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b;
import com.ss.android.lark.calendar.impl.rustadapter.p1576d.C32602a;
import com.ss.android.lark.calendar.impl.rustadapter.parser.ModelDataParserCalendar;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.calendarevents.CheckInByQRCodeRequest;
import com.ss.android.lark.pb.calendarevents.CheckInByQRCodeResponse;
import com.ss.android.lark.pb.videoconference.v1.AssociatedLiveStatus;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedLiveStatusWithEventIDRequest;
import com.ss.android.lark.pb.videoconference.v1.GetAssociatedLiveStatusWithEventIDResponse;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService;", "", "()V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c */
public final class CalendarSDKService {

    /* renamed from: a */
    public static final Companion f83473a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jo\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0002\u0010\u0013J8\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0011H\u0007J\u001c\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011J \u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0011H\u0007JB\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001c2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#0\"0\u0011H\u0007J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010 \u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010'J7\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0002\u0010(J \u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u0011H\u0007J\u0019\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-H@ø\u0001\u0000¢\u0006\u0002\u0010/J\"\u00100\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002010\u0011J6\u00102\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002050\u0011H\u0007J>\u00106\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\t0\u0011J.\u00109\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007J$\u0010<\u001a\u00020\u00062\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040>2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020?0\u0011H\u0007J\u0019\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0-H@ø\u0001\u0000¢\u0006\u0002\u0010/J*\u0010B\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007JN\u0010C\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020I0\u0011H\u0007J(\u0010J\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0\u0011H\u0007J2\u0010N\u001a\u00020\u00062(\u0010\u0010\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0Oj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c`P0\u0011H\u0007J\u0014\u0010Q\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u0019\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0-H@ø\u0001\u0000¢\u0006\u0002\u0010/J%\u0010T\u001a\b\u0012\u0004\u0012\u00020U0%2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040\tH@ø\u0001\u0000¢\u0006\u0002\u0010WJE\u0010T\u001a\b\u0012\u0004\u0012\u00020U0%2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001cH@ø\u0001\u0000¢\u0006\u0002\u0010YJ<\u0010Z\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010[\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\\0\u0011H\u0007J>\u0010]\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0\t0\u0011J\u0016\u0010_\u001a\u00020\u00062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007J&\u0010a\u001a\u00020\u00062\u001c\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040bj\b\u0012\u0004\u0012\u00020\u0004`c0\u0011H\u0007J&\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u00042\u0006\u0010f\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020g0\u0011H\u0007J\u001c\u0010h\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0\t0\u0011H\u0007J.\u0010j\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020k0\u0011H\u0007J?\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010m0-2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010n\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010oJ!\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010q0-2\u0006\u0010r\u001a\u00020sH@ø\u0001\u0000¢\u0006\u0002\u0010tJ\u001e\u0010u\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007J8\u0010w\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010x\u001a\u00020\u001c2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010y0\u0011H\u0007J\u0018\u0010z\u001a\u00020\u001c2\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020|H\u0007J6\u0010z\u001a\u00020\u00062\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020|2\u000e\u0010~\u001a\n\u0012\u0004\u0012\u00020\u0018\u00010\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007J \u0010\u0001\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u00042\r\u0010\u0010\u001a\t\u0012\u0005\u0012\u00030\u00010\u0011H\u0007J/\u0010\u0001\u001a\u00020?2\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010\t2\u0014\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u00010\"H\u0007J0\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020|0\u0011H\u0007J4\u0010\u0001\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0019\u0010\u0010\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u00010\"0\u0011H\u0007J\u001f\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007J\u001e\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011J\u001c\u0010\u0001\u001a\u00020\u00062\u0011\u0010\u0010\u001a\r\u0012\u0007\u0012\u0005\u0018\u00010\u0001\u0018\u00010\u0011H\u0007J&\u0010\u0001\u001a\u00020\u00062\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007J.\u0010\u0001\u001a\u00020\u00062\b\u0010\u0001\u001a\u00030\u00012\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002080\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011JC\u0010\u0001\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u00042\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00040bj\b\u0012\u0004\u0012\u00020\u0004`c2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00040bj\b\u0012\u0004\u0012\u00020\u0004`cH\u0007J \u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007JP\u0010\u0001\u001a\t\u0012\u0005\u0012\u0003H\u00010-\"\u0005\b\u0000\u0010\u00012\b\u0010\u0001\u001a\u00030\u00012\u0010\u0010\u0001\u001a\u000b\u0012\u0002\b\u0003\u0012\u0002\b\u00030 \u00012\u0011\u0010¡\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u0001H\u00010¢\u0001H@ø\u0001\u0000¢\u0006\u0003\u0010£\u0001J^\u0010¤\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020\u00042\u0007\u0010¦\u0001\u001a\u00020F2\u0006\u0010E\u001a\u00020F2\u0007\u0010§\u0001\u001a\u00020\u001c2\u0007\u0010¨\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u00020\u001c2\u001e\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0005\u0012\u00030ª\u00010bj\t\u0012\u0005\u0012\u00030ª\u0001`c0\u0011H\u0007J^\u0010«\u0001\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0007\u0010¬\u0001\u001a\u00020\u00042\u0007\u0010­\u0001\u001a\u00020F2\u0007\u0010®\u0001\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001c2\u0007\u0010¯\u0001\u001a\u00020F2\b\u0010°\u0001\u001a\u00030±\u00012\r\u0010\u0010\u001a\t\u0012\u0005\u0012\u00030²\u00010\u0011H\u0007J2\u0010³\u0001\u001a\u00020\u00062\u0007\u0010´\u0001\u001a\u00020\u00042\u001e\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0005\u0012\u00030µ\u00010bj\t\u0012\u0005\u0012\u00030µ\u0001`c0\u0011H\u0007J!\u0010¶\u0001\u001a\u00020\u00062\b\u0010·\u0001\u001a\u00030¸\u00012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J>\u0010¹\u0001\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\r\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0007J(\u0010»\u0001\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u00042\u0007\u0010¼\u0001\u001a\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007J>\u0010½\u0001\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u00042\u0017\u0010¾\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00040bj\b\u0012\u0004\u0012\u00020\u0004`c2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0011H\u0007J \u0010¿\u0001\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\r\u0010\u0010\u001a\t\u0012\u0005\u0012\u00030\u00010\u0011H\u0007J\u001f\u0010À\u0001\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007J.\u0010Á\u0001\u001a\u00020\u00062#\u0010Â\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c0Oj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001c`PH\u0007J5\u0010Ã\u0001\u001a\u00020\u00062\r\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\r\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007J\u001f\u0010Æ\u0001\u001a\u00020\u00062\u0006\u0010v\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006Ç\u0001"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService$Companion;", "", "()V", "TAG", "", "advanceSearchCalendarEvent", "", "key", "calendarIds", "", "attendeeCalendarIds", "resourceCalendarIds", "chatIds", "startTime", "", "endTime", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "checkInByQRCodeRequest", "resourceId", "eventRefId", "eventStartTime", "eventEndTime", "Lcom/ss/android/lark/pb/calendarevents/CheckInByQRCodeResponse;", "deleteCalendarRequest", "calendarId", "", "fetchCalendarById", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/FetchCalendarData;", "getAllMeetingRoomsAndLevels", "levelId", "needDisabledResource", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "getAllMeetingRoomsAndLevelsRequest", "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "Lcom/bytedance/lark/pb/calendar/v1/GetAllMeetingRoomsAndLevelsResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;JJZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAssociatedLiveStatusWithEventId", "associatedEventId", "Lcom/ss/android/lark/pb/videoconference/v1/AssociatedLiveStatus;", "getBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/SdkResponse;", "Lcom/bytedance/lark/pb/calendar/v1/GetBuildingsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCalendarAndMembersWithIds", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWithMembers;", "getCalendarEventShareLinkRequest", "originTime", "needImage", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventShareLink;", "getCalendarMembersByIdsRequest", "userIds", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "getCanRenewExpiredVideoMeetingNumber", "eventKey", "originalTime", "getCustomizedConfigurationChatters", "contactIds", "", "Lcom/bytedance/lark/pb/calendar/v1/ParseCustomizedConfigurationResponse;", "getEquipments", "Lcom/bytedance/lark/pb/calendar/v1/GetResourceEquipmentsResponse;", "getEventHasMeeting", "getEventIndividualAttendeesRequest", "eventVersion", "pageSize", "", "pageToken", "needsAllAttendees", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventIndividualAttendeesResponse;", "getEventInfoByVideoMeetingId", "videoMeetingId", "videoStartTime", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeetingEventInfo;", "getGoogleAccountSetting", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getGoogleAuthUrl", "getLocalRoomViewResourceData", "Lcom/bytedance/lark/pb/calendar/v1/GetLocalRoomViewResourceDataResponse;", "getMeetingRoomsAndLevels", "Lcom/bytedance/lark/pb/calendar/v1/MGetMeetingRoomsAndLevelsResponse;", "levelIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RRule", "(Ljava/util/List;JJLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMeetingRoomsStatusInformationRequest", "eventRule", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetMeetingRoomsStatusInformationResponse;", "getPbCalendarMembersByIdsRequest", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "getPrimaryCalendarLoadingStatus", "callBack", "getRecentSelectedTimeZoneIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getResourceCheckInInfoRequest", "resourceCheckInToken", "timeZoneId", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetResourceCheckInInfoResponse;", "getResourceEquipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "getResourceWithToken", "Lcom/ss/android/lark/calendar/impl/features/preempt/model/GetResourceWithTokenUnit;", "getRoomViewInstances", "Lcom/bytedance/lark/pb/calendar/v1/GetRoomViewInstancesResponse;", "timezoneId", "(Ljava/util/List;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getServerRoomViewResourceData", "Lcom/bytedance/lark/pb/calendar/v1/UpdateRoomViewResourceDataResponse;", "filterConfigs", "Lcom/bytedance/lark/pb/calendar/v1/RoomViewFilterConfigs;", "(Lcom/bytedance/lark/pb/calendar/v1/RoomViewFilterConfigs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransferChatShowScroll", "chatId", "getVideoMeetingByEvent", "forceRenew", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", "isEventAttendeeChangeAffect", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "originalEvent", "originalAttendees", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "loadChatFreeBusyFavor", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/ChatFreeBusyFavor;", "parseCustomizedConfiguration", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$CustomizationData;", "userInputs", "Lcom/bytedance/lark/pb/calendar/v1/ParseCustomizedConfigurationRequest$SelectedKeys;", "preemptResource", "resourceCalendarId", "pullAllMeetingRoomsInTenantRequest", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "quickSearchCalendarEvent", "recallGoogleTokenRequest", "account", "requestExchangeServerHelperUrl", "Lorg/json/JSONObject;", "revokeExchangeAccount", "accounts", "saveCalendarWithMemberRequest", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "members", "saveChatFreeBusyFavor", "orderedFavorChatterIds", "selectedFavorChatterIds", "saveSeizeResourceWethereNeedPopUp", "needPopUp", "sdkRequestWithErr", "T", "command", "Lcom/bytedance/lark/pb/basic/v1/Command;", "builder", "Lcom/squareup/wire/Message$Builder;", "iParser", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "(Lcom/bytedance/lark/pb/basic/v1/Command;Lcom/squareup/wire/Message$Builder;Lcom/ss/android/lark/sdk/SdkSender$IParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchCalendars", SearchIntents.EXTRA_QUERY, "offset", "searchMeetingRoom", "searchShareCalendar", "searchExternalContact", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MultiCalendarSearchContentData;", "searchMultiMeetingRoomRequest", "keyWord", "count", "rrule", "cursor", "meetingRoomFilter", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "Lcom/bytedance/lark/pb/calendar/v1/SearchMeetingRoomsForHierarchicalLevelsResponse;", "searchTimeZoneByCity", "searchCity", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "sendPatchCalendarRequest", "calendarSaveInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarSaveInfo;", "sendShareCalendarRequest", "groupIds", "setMobileNormalViewTimezone", "isUseSystemTimezone", "sortChattersInChat", "selectedChatterIds", "subscribeCalendar", "unsubscribeCalendar", "updateGoogleAccountSetting", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "updateRecentTimeZones", "addTimeZoneIds", "deleteTimeZoneIds", "upgradeMeetingToChat", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "byte", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$au */
        static final class au<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final au f83494a = new au();

            au() {
            }

            /* renamed from: a */
            public final Void parse(byte[] bArr) {
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$av */
        static final class av<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final av f83495a = new av();

            av() {
            }

            /* renamed from: a */
            public final Void parse(byte[] bArr) {
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService$Companion$getRoomViewInstances$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/calendar/v1/GetRoomViewInstancesResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$aa */
        public static final class C32545aa implements SdkSender.IParser<GetRoomViewInstancesResponse> {
            C32545aa() {
            }

            /* renamed from: a */
            public GetRoomViewInstancesResponse parse(byte[] bArr) {
                if (bArr != null) {
                    return GetRoomViewInstancesResponse.ADAPTER.decode(bArr);
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService$Companion$getServerRoomViewResourceData$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/calendar/v1/UpdateRoomViewResourceDataResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ab */
        public static final class C32546ab implements SdkSender.IParser<UpdateRoomViewResourceDataResponse> {
            C32546ab() {
            }

            /* renamed from: a */
            public UpdateRoomViewResourceDataResponse parse(byte[] bArr) {
                if (bArr != null) {
                    return UpdateRoomViewResourceDataResponse.ADAPTER.decode(bArr);
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService$Companion$isEventAttendeeChangeAffect$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)Ljava/lang/Boolean;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ae */
        public static final class C32549ae implements SdkSender.IParser<Boolean> {
            C32549ae() {
            }

            /* renamed from: a */
            public Boolean parse(byte[] bArr) {
                JudgeEventAttendeesChangeAffectResponse.EventAttendeeChangeAffect eventAttendeeChangeAffect;
                Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                JudgeEventAttendeesChangeAffectResponse decode = JudgeEventAttendeesChangeAffectResponse.ADAPTER.decode(bArr);
                if (decode != null) {
                    eventAttendeeChangeAffect = decode.affect;
                } else {
                    eventAttendeeChangeAffect = null;
                }
                if (eventAttendeeChangeAffect == JudgeEventAttendeesChangeAffectResponse.EventAttendeeChangeAffect.NEW_ATTENDEE_CANNOT_ENTER_MEETING_GROUP) {
                    return true;
                }
                return false;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService$Companion$getBuilding$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/calendar/v1/GetBuildingsResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$g */
        public static final class C32560g implements SdkSender.IParser<GetBuildingsResponse> {
            C32560g() {
            }

            /* renamed from: a */
            public GetBuildingsResponse parse(byte[] bArr) {
                if (bArr != null) {
                    return GetBuildingsResponse.ADAPTER.decode(bArr);
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService$Companion$getCanRenewExpiredVideoMeetingNumber$1", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)Ljava/lang/Boolean;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$k */
        public static final class C32564k implements SdkSender.IParser<Boolean> {
            C32564k() {
            }

            /* renamed from: a */
            public Boolean parse(byte[] bArr) {
                boolean z;
                Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                Boolean bool = GetCanRenewExpiredVideoMeetingNumberResponse.ADAPTER.decode(bArr).can_renew;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService$Companion$getEquipments$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/calendar/v1/GetResourceEquipmentsResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$m */
        public static final class C32566m implements SdkSender.IParser<GetResourceEquipmentsResponse> {
            C32566m() {
            }

            /* renamed from: a */
            public GetResourceEquipmentsResponse parse(byte[] bArr) {
                if (bArr != null) {
                    return GetResourceEquipmentsResponse.ADAPTER.decode(bArr);
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService$Companion$getLocalRoomViewResourceData$2", "Lcom/ss/android/lark/sdk/SdkSender$IParser;", "Lcom/bytedance/lark/pb/calendar/v1/GetLocalRoomViewResourceDataResponse;", "parse", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$s */
        public static final class C32573s implements SdkSender.IParser<GetLocalRoomViewResourceDataResponse> {
            C32573s() {
            }

            /* renamed from: a */
            public GetLocalRoomViewResourceDataResponse parse(byte[] bArr) {
                if (bArr != null) {
                    return GetLocalRoomViewResourceDataResponse.ADAPTER.decode(bArr);
                }
                return null;
            }
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118930a(String str, int i, int i2, boolean z, boolean z2, boolean z3, IGetDataCallback<ArrayList<MultiCalendarSearchContentData>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            MultiCalendarSearchRequest.C15882a aVar = new MultiCalendarSearchRequest.C15882a();
            aVar.f41741a = str;
            aVar.f41742b = Integer.valueOf(i);
            aVar.f41743c = Integer.valueOf(i2);
            aVar.f41744d = Boolean.valueOf(z);
            aVar.f41745e = Boolean.valueOf(z2);
            aVar.f41747g = Boolean.valueOf(z3);
            SdkSender.asynSendRequestNonWrap(Command.MULTI_CALENDAR_SEARCH, aVar, iGetDataCallback, ar.f83491a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118934a(String str, IGetDataCallback<Calendar> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SubscribeCalendarRequest.C16068a aVar = new SubscribeCalendarRequest.C16068a();
            aVar.f42158a = str;
            SdkSender.asynSendRequestNonWrap(Command.SUBSCRIBE_CALENDAR, aVar, iGetDataCallback, ay.f83498a);
        }

        /* renamed from: a */
        public final void mo118927a(IGetDataCallback<String> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_GOOGLE_AUTH_URL, new GetGoogleAuthURLRequest.C15708a(), iGetDataCallback, C32572r.f83517a);
        }

        /* renamed from: a */
        public final void mo118928a(Calendar calendar, List<? extends CalendarMember> list, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(calendar, "calendar");
            Intrinsics.checkParameterIsNotNull(list, "members");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SaveCalendarWithMembersRequest.C15988a aVar = new SaveCalendarWithMembersRequest.C15988a();
            aVar.mo57547a(C32514b.m124490a(calendar));
            if (CollectionUtils.isNotEmpty(list)) {
                aVar.mo57548a(C32514b.m124562j(list));
            }
            SdkSender.asynSendRequestNonWrap(Command.SAVE_CALENDAR_WITH_MEMBERS, aVar, iGetDataCallback, an.f83485a);
        }

        /* renamed from: a */
        public final void mo118942a(String str, List<String> list, List<String> list2, IGetDataCallback<List<CalendarMember>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(list, "userIds");
            Intrinsics.checkParameterIsNotNull(list2, "chatIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            GetCalendarMembersByIdsRequest.C15664a aVar = new GetCalendarMembersByIdsRequest.C15664a();
            aVar.mo56732a(str);
            aVar.mo56733a(list);
            aVar.mo56735b(list2);
            SdkSender.asynSendRequestNonWrap(Command.GET_CALENDAR_MEMBERS_BY_IDS, aVar, iGetDataCallback, C32563j.f83510a);
        }

        /* renamed from: a */
        public final void mo118946a(List<String> list, IGetDataCallback<CalendarWithMembers> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(list, "calendarIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            MGetCalendarsWithIDsRequest.C15836a aVar = new MGetCalendarsWithIDsRequest.C15836a();
            aVar.mo57170a(list);
            SdkSender.asynSendRequestNonWrap(Command.MGET_CALENDARS_WITH_IDS, aVar, iGetDataCallback, C32561h.f83508a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118929a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, List<? extends CalendarEventAttendee> list, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
            Intrinsics.checkParameterIsNotNull(calendarEvent2, "originalEvent");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            com.bytedance.lark.pb.calendar.v1.CalendarEvent a = C32514b.m124491a(calendarEvent);
            com.bytedance.lark.pb.calendar.v1.CalendarEvent a2 = C32514b.m124491a(calendarEvent2);
            JudgeEventAttendeesChangeAffectRequest.C15824a aVar = new JudgeEventAttendeesChangeAffectRequest.C15824a();
            ArrayList arrayList = new ArrayList();
            aVar.mo57131a(a).mo57135b(a2);
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C32514b.m124492a((CalendarEventAttendee) it.next()));
                }
            }
            if (CollectionUtils.isNotEmpty(list)) {
                aVar.mo57132a((Boolean) true).mo57133a(arrayList);
            }
            SdkSender.asynSendRequestNonWrap(Command.JUDGE_EVENT_ATTENDEES_CHANGE_AFFECT, aVar, iGetDataCallback, new C32549ae());
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118931a(String str, long j, long j2, IGetDataCallback<GetResourceWithTokenUnit> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "resourceId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_RESOURCE_WITH_TOKEN, new GetResourceWithTokenRequest.C15776a().mo56999a(str).mo56998a(Long.valueOf(j)).mo57001b(Long.valueOf(j2)), iGetDataCallback, C32580z.f83524a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118948a(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SetSeizeResourceWhetherNeedPopUpRequest.C16046a aVar = new SetSeizeResourceWhetherNeedPopUpRequest.C16046a();
            aVar.mo57708a(Boolean.valueOf(z));
            SdkSender.asynSendRequestNonWrap(Command.SET_SEIZE_RESOURCE_WHETHER_NEED_POPUP, aVar, iGetDataCallback, ap.f83487a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118938a(String str, String str2, long j, boolean z, IGetDataCallback<DoVideoMeeting> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(str2, "eventKey");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_VIDEO_MEETING_BY_EVENT, new GetVideoMeetingByEventRequest.C15808a().mo57085a(str).mo57087b(str2).mo57084a(Long.valueOf(j)).mo57083a(Boolean.valueOf(z)), iGetDataCallback, C32548ad.f83476a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118933a(String str, long j, IGetDataCallback<DoVideoMeetingEventInfo> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "videoMeetingId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_EVENT_INFO_BY_VIDEO_MEETING_ID, new GetEventInfoByVideoMeetingIdRequest.C15696a().mo56806a(str).mo56805a(Long.valueOf(j)), iGetDataCallback, C32570p.f83515a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118936a(String str, String str2, long j, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(str2, "eventKey");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_CAN_RENEW_EXPIRED_VIDEO_MEETING_NUMBER, new GetCanRenewExpiredVideoMeetingNumberRequest.C15676a().mo56761a(str).mo56763b(str2).mo56760a(Long.valueOf(j)), iGetDataCallback, new C32564k());
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118943a(String str, List<String> list, List<String> list2, List<String> list3, List<String> list4, Long l, Long l2, IGetDataCallback<SearchCalendarEventResult> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(list, "calendarIds");
            Intrinsics.checkParameterIsNotNull(list2, "attendeeCalendarIds");
            Intrinsics.checkParameterIsNotNull(list3, "resourceCalendarIds");
            Intrinsics.checkParameterIsNotNull(list4, "chatIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.ADVANCE_SEARCH_CALENDAR_EVENT, new AdvanceSearchCalendarEventRequest.C15496a().mo56099a(str).mo56098a(new EventFilter(list, list2, list3, list4, l, l2)), iGetDataCallback, C32544a.f83474a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118940a(String str, ArrayList<String> arrayList, IGetDataCallback<List<String>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(arrayList, "selectedChatterIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.SORT_CHATTERS_IN_CHAT, new SortChattersInChatRequest.C16064a().mo57755a(str).mo57756a(arrayList), iGetDataCallback, ax.f83497a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118941a(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(arrayList, "orderedFavorChatterIds");
            Intrinsics.checkParameterIsNotNull(arrayList2, "selectedFavorChatterIds");
            SdkSender.asynSendRequestNonWrap(Command.SET_CHAT_FREE_BUSY_FAVOR, new SetChatFreeBusyFavorRequest.C16042a().mo57695a(str).mo57696a(arrayList).mo57698b(arrayList2), null, ao.f83486a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118939a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            GetHasMeetingEventRequest.C15712a aVar = new GetHasMeetingEventRequest.C15712a();
            if (str == null) {
                str = "";
            }
            GetHasMeetingEventRequest.C15712a a = aVar.mo56844a(str);
            if (str2 == null) {
                str2 = "";
            }
            SdkSender.asynSendRequestNonWrap(Command.GET_HAS_MEETING_EVENT, a.mo56846b(str2), iGetDataCallback, C32567n.f83512a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118947a(List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(list, "addTimeZoneIds");
            Intrinsics.checkParameterIsNotNull(list2, "deleteTimeZoneIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.UPDATE_RECENT_TIMEZONES, new UpdateRecentTimezonesRequest.C16096a().mo57834a(list).mo57836b(list2), iGetDataCallback, bb.f83502a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118944a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.SET_MOBILE_NORMAL_VIEW_TIMEZONE, new SetMobileNormalViewTimezoneRequest.C16044a().mo57703a(str).mo57702a(Boolean.valueOf(z)), iGetDataCallback, aw.f83496a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118945a(HashMap<String, Boolean> hashMap) {
            Intrinsics.checkParameterIsNotNull(hashMap, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (hashMap.size() != 0) {
                SaveThirdPartyCalendarSettingsRequest.C15994a aVar = new SaveThirdPartyCalendarSettingsRequest.C15994a();
                Set<Map.Entry<String, Boolean>> entrySet = hashMap.entrySet();
                Intrinsics.checkExpressionValueIsNotNull(entrySet, "data.entries");
                for (T t : entrySet) {
                    aVar.f42015a.add(new ThirdPartyCalendarSetting((String) t.getKey(), (Boolean) t.getValue()));
                }
                SdkSender.asynSendRequestNonWrap(Command.SAVE_THIRD_PARTY_CALENDAR_SETTINGS, aVar, null, ba.f83501a);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118925a(long j, long j2, List<String> list, String str, IGetDataCallback<GetMeetingRoomsStatusInformationResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(list, "calendarIds");
            Intrinsics.checkParameterIsNotNull(str, "eventRule");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_MEETING_ROOMS_STATUS_INFORMATION, new GetMeetingRoomsStatusInformationRequest.C15740a().mo56917a(Long.valueOf(j)).mo56921b(Long.valueOf(j2)).mo56918a(str).mo56919a(list), iGetDataCallback, C32574t.f83518a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118935a(String str, String str2, long j, long j2, IGetDataCallback<CheckInByQRCodeResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "resourceId");
            Intrinsics.checkParameterIsNotNull(str2, "eventRefId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.CHECK_IN_BY_QR_CODE, new CheckInByQRCodeRequest.C49562a().mo172832a(str).mo172835b(str2).mo172831a(Long.valueOf(j)).mo172834b(Long.valueOf(j2)), iGetDataCallback, C32555b.f83500a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118937a(String str, String str2, long j, String str3, int i, String str4, boolean z, IGetDataCallback<PullEventIndividualAttendeesResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(str2, "key");
            Intrinsics.checkParameterIsNotNull(str3, "eventVersion");
            Intrinsics.checkParameterIsNotNull(str4, "pageToken");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            PullEventIndividualAttendeesRequest.C15934a aVar = new PullEventIndividualAttendeesRequest.C15934a();
            aVar.mo57429a(str);
            aVar.mo57431b(str2);
            aVar.mo57428a(Long.valueOf(j));
            aVar.mo57432c(str3);
            aVar.mo57427a(Integer.valueOf(i));
            aVar.mo57433d(str4);
            aVar.mo57426a(Boolean.valueOf(z));
            SdkSender.asynSendRequestNonWrap(Command.PULL_EVENT_INDIVIDUAL_ATTENDEES, aVar, iGetDataCallback, C32568o.f83513a);
        }

        /* renamed from: a */
        public final void mo118926a(CalendarSaveInfo calendarSaveInfo, IGetDataCallback<Object> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(calendarSaveInfo, "calendarSaveInfo");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.PATCH_CALENDAR, new PatchCalendarRequest.C15904a().mo57345a(CollectionsKt.listOf(calendarSaveInfo)), iGetDataCallback, au.f83494a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118932a(String str, long j, long j2, boolean z, IGetDataCallback<Map<String, LevelRelatedInfo>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "levelId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_ALL_MEETING_ROOMS_AND_LEVELS, new GetAllMeetingRoomsAndLevelsRequest.C15636a().mo56661a(str).mo56660a(Long.valueOf(j)).mo56663b(Long.valueOf(j2)).mo56659a(Boolean.valueOf(z)), iGetDataCallback, C32558e.f83506a);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventIndividualAttendeesResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$o */
        static final class C32568o<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32568o f83513a = new C32568o();

            C32568o() {
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "kotlin.jvm.PlatformType", "entity", "Lcom/bytedance/lark/pb/calendar/v1/CalendarEventAttendee;", "get"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$o$a */
            public static final class C32569a<S, R> implements C26249aa.AbstractC26250a<S, R> {

                /* renamed from: a */
                public static final C32569a f83514a = new C32569a();

                C32569a() {
                }

                /* renamed from: a */
                public final CalendarEventAttendee get(com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee calendarEventAttendee) {
                    return C32514b.m124513a(calendarEventAttendee);
                }
            }

            /* renamed from: a */
            public final PullEventIndividualAttendeesResponse parse(byte[] bArr) {
                com.bytedance.lark.pb.calendar.v1.PullEventIndividualAttendeesResponse decode = com.bytedance.lark.pb.calendar.v1.PullEventIndividualAttendeesResponse.ADAPTER.decode(bArr);
                List a = C26249aa.m94984a(decode.attendees, C32569a.f83514a);
                String str = decode.next_page_token;
                Boolean bool = decode.has_more;
                Intrinsics.checkExpressionValueIsNotNull(bool, "response.has_more");
                return new PullEventIndividualAttendeesResponse(str, bool.booleanValue(), a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ao */
        static final class ao<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final ao f83486a = new ao();

            ao() {
            }

            /* renamed from: a */
            public final void mo118988a(byte[] bArr) {
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                mo118988a(bArr);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ba */
        static final class ba<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final ba f83501a = new ba();

            ba() {
            }

            /* renamed from: a */
            public final void mo119000a(byte[] bArr) {
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                mo119000a(bArr);
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$a */
        static final class C32544a<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32544a f83474a = new C32544a();

            C32544a() {
            }

            /* renamed from: a */
            public final SearchCalendarEventResult parse(byte[] bArr) {
                return C32514b.m124509a(QuickSearchCalendarEventResponse.ADAPTER.decode(bArr).result);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse", "([B)Ljava/lang/Boolean;"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ac */
        public static final class C32547ac<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32547ac f83475a = new C32547ac();

            C32547ac() {
            }

            /* renamed from: a */
            public final Boolean parse(byte[] bArr) {
                return DisplayTransferChatScrollCheckResponse.ADAPTER.decode(bArr).should_show_scroll;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/ChatFreeBusyFavor;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$af */
        static final class C32550af<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32550af f83477a = new C32550af();

            C32550af() {
            }

            /* renamed from: a */
            public final ChatFreeBusyFavor parse(byte[] bArr) {
                return C32514b.m124537a(GetChatFreeBusyFavorResponse.ADAPTER.decode(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/calendar/v1/ParseCustomizedConfigurationResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ag */
        static final class C32551ag<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32551ag f83478a = new C32551ag();

            C32551ag() {
            }

            /* renamed from: a */
            public final ParseCustomizedConfigurationResponse parse(byte[] bArr) {
                ParseCustomizedConfigurationResponse decode = ParseCustomizedConfigurationResponse.ADAPTER.decode(bArr);
                Intrinsics.checkExpressionValueIsNotNull(decode, "ParseCustomizedConfigura…onse.ADAPTER.decode(data)");
                return decode;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ah */
        static final class C32552ah<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32552ah f83479a = new C32552ah();

            C32552ah() {
            }

            /* renamed from: a */
            public final CalendarEvent parse(byte[] bArr) {
                return C32514b.m124512a(SeizeResourceResponse.ADAPTER.decode(bArr).event);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00012\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ai */
        static final class C32553ai<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32553ai f83480a = new C32553ai();

            C32553ai() {
            }

            /* renamed from: a */
            public final Map<String, CalendarResource> parse(byte[] bArr) {
                return C32514b.m124554d(PullAllMeetingRoomsInTenantResponse.ADAPTER.decode(bArr).resources);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$aj */
        public static final class aj<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final aj f83481a = new aj();

            aj() {
            }

            /* renamed from: a */
            public final SearchCalendarEventResult parse(byte[] bArr) {
                return C32514b.m124509a(QuickSearchCalendarEventResponse.ADAPTER.decode(bArr).result);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ak */
        static final class ak<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final ak f83482a = new ak();

            ak() {
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo118984a(bArr));
            }

            /* renamed from: a */
            public final boolean mo118984a(byte[] bArr) {
                return !GetGoogleAuthURLResponse.ADAPTER.decode(bArr).token_exist.booleanValue();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$am */
        static final class am<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final am f83484a = new am();

            am() {
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo118986a(bArr));
            }

            /* renamed from: a */
            public final boolean mo118986a(byte[] bArr) {
                if (RevokeExchangeAccountResponse.ADAPTER.decode(bArr).resp_state == RevokeExchangeAccountResponse.State.REVOKE_SUCCESS) {
                    return true;
                }
                return false;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$an */
        static final class an<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final an f83485a = new an();

            an() {
            }

            /* renamed from: a */
            public final boolean mo118987a(byte[] bArr) {
                return true;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo118987a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ap */
        static final class ap<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final ap f83487a = new ap();

            ap() {
            }

            /* renamed from: a */
            public final boolean mo118989a(byte[] bArr) {
                return true;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo118989a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MultiCalendarSearchContentData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ar */
        static final class ar<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final ar f83491a = new ar();

            ar() {
            }

            /* renamed from: a */
            public final ArrayList<MultiCalendarSearchContentData> parse(byte[] bArr) {
                return ModelDataParserCalendar.f83420a.mo118808a(MultiCalendarSearchResponse.ADAPTER.decode(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/calendar/v1/SearchMeetingRoomsForHierarchicalLevelsResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$as */
        static final class as<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final as f83492a = new as();

            as() {
            }

            /* renamed from: a */
            public final SearchMeetingRoomsForHierarchicalLevelsResponse parse(byte[] bArr) {
                return SearchMeetingRoomsForHierarchicalLevelsResponse.ADAPTER.decode(bArr);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$aw */
        static final class aw<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final aw f83496a = new aw();

            aw() {
            }

            /* renamed from: a */
            public final boolean mo118995a(byte[] bArr) {
                return true;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo118995a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ax */
        static final class ax<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final ax f83497a = new ax();

            ax() {
            }

            /* renamed from: a */
            public final List<String> parse(byte[] bArr) {
                return SortChattersInChatResponse.ADAPTER.decode(bArr).chatter_ids;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$az */
        static final class az<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final az f83499a = new az();

            az() {
            }

            /* renamed from: a */
            public final boolean mo118998a(byte[] bArr) {
                return true;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo118998a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/calendarevents/CheckInByQRCodeResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$b */
        static final class C32555b<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32555b f83500a = new C32555b();

            C32555b() {
            }

            /* renamed from: a */
            public final CheckInByQRCodeResponse parse(byte[] bArr) {
                return CheckInByQRCodeResponse.ADAPTER.decode(bArr);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$bb */
        static final class bb<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final bb f83502a = new bb();

            bb() {
            }

            /* renamed from: a */
            public final boolean mo119001a(byte[] bArr) {
                return true;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo119001a(bArr));
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$bc */
        public static final class bc<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final bc f83503a = new bc();

            bc() {
            }

            /* renamed from: a */
            public final boolean mo119002a(byte[] bArr) {
                return true;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo119002a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$c */
        static final class C32556c<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32556c f83504a = new C32556c();

            C32556c() {
            }

            /* renamed from: a */
            public final boolean mo119003a(byte[] bArr) {
                return true;
            }

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public /* synthetic */ Object parse(byte[] bArr) {
                return Boolean.valueOf(mo119003a(bArr));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00012\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$e */
        static final class C32558e<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32558e f83506a = new C32558e();

            C32558e() {
            }

            /* renamed from: a */
            public final Map<String, LevelRelatedInfo> parse(byte[] bArr) {
                return GetAllMeetingRoomsAndLevelsResponse.ADAPTER.decode(bArr).level_info;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/videoconference/v1/AssociatedLiveStatus;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$f */
        static final class C32559f<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32559f f83507a = new C32559f();

            C32559f() {
            }

            /* renamed from: a */
            public final AssociatedLiveStatus parse(byte[] bArr) {
                GetAssociatedLiveStatusWithEventIDResponse decode = GetAssociatedLiveStatusWithEventIDResponse.ADAPTER.decode(bArr);
                if (decode != null) {
                    return decode.status;
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "kotlin.jvm.PlatformType", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$j */
        static final class C32563j<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32563j f83510a = new C32563j();

            C32563j() {
            }

            /* renamed from: a */
            public final List<CalendarMember> parse(byte[] bArr) {
                return C32514b.m124559g(GetCalendarMembersByIdsResponse.ADAPTER.decode(bArr).members);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/calendar/v1/ParseCustomizedConfigurationResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$l */
        static final class C32565l<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32565l f83511a = new C32565l();

            C32565l() {
            }

            /* renamed from: a */
            public final ParseCustomizedConfigurationResponse parse(byte[] bArr) {
                return ParseCustomizedConfigurationResponse.ADAPTER.decode(bArr);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse", "([B)Ljava/lang/Boolean;"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$n */
        static final class C32567n<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32567n f83512a = new C32567n();

            C32567n() {
            }

            /* renamed from: a */
            public final Boolean parse(byte[] bArr) {
                return GetHasMeetingEventResponse.ADAPTER.decode(bArr).has_meeting_event;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$r */
        static final class C32572r<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32572r f83517a = new C32572r();

            C32572r() {
            }

            /* renamed from: a */
            public final String parse(byte[] bArr) {
                return GetGoogleAuthURLResponse.ADAPTER.decode(bArr).auth_url;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "kotlin.jvm.PlatformType", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$u */
        static final class C32575u<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32575u f83519a = new C32575u();

            C32575u() {
            }

            /* renamed from: a */
            public final List<com.bytedance.lark.pb.calendar.v1.CalendarMember> parse(byte[] bArr) {
                return GetCalendarMembersByIdsResponse.ADAPTER.decode(bArr).members;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse", "([B)Ljava/lang/Boolean;"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$v */
        static final class C32576v<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32576v f83520a = new C32576v();

            C32576v() {
            }

            /* renamed from: a */
            public final Boolean parse(byte[] bArr) {
                return GetPrimaryCalendarLoadingStatusResponse.ADAPTER.decode(bArr).is_loading;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeeting;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ad */
        static final class C32548ad<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32548ad f83476a = new C32548ad();

            C32548ad() {
            }

            /* renamed from: a */
            public final DoVideoMeeting parse(byte[] bArr) {
                VideoMeeting videoMeeting;
                GetVideoMeetingByEventResponse decode = GetVideoMeetingByEventResponse.ADAPTER.decode(bArr);
                if (decode == null || (videoMeeting = decode.video_meeting) == null) {
                    return null;
                }
                Intrinsics.checkExpressionValueIsNotNull(videoMeeting, "it");
                return new DoVideoMeeting(videoMeeting);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "Lkotlin/collections/ArrayList;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$at */
        static final class C32554at<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32554at f83493a = new C32554at();

            C32554at() {
            }

            /* renamed from: a */
            public final ArrayList<TimeZoneItemData> parse(byte[] bArr) {
                ArrayList<TimeZoneItemData> a = C32514b.m124542a(GetTimezoneByCityResponse.ADAPTER.decode(bArr));
                Intrinsics.checkExpressionValueIsNotNull(a, "ModelParserCalendar.getS…                response)");
                return a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$ay */
        static final class ay<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final ay f83498a = new ay();

            ay() {
            }

            /* renamed from: a */
            public final Calendar parse(byte[] bArr) {
                Calendar a = C32514b.m124510a(SubscribeCalendarResponse.ADAPTER.decode(bArr).calendar);
                if (a != null) {
                    return a;
                }
                throw new IOException("no valid calendar!");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetMeetingRoomsStatusInformationResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$t */
        static final class C32574t<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32574t f83518a = new C32574t();

            C32574t() {
            }

            /* renamed from: a */
            public final GetMeetingRoomsStatusInformationResponse parse(byte[] bArr) {
                com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationResponse decode = com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationResponse.ADAPTER.decode(bArr);
                ModelDataParserCalendar.Companion aVar = ModelDataParserCalendar.f83420a;
                Intrinsics.checkExpressionValueIsNotNull(decode, "response");
                return aVar.mo118801a(decode);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$w */
        static final class C32577w<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32577w f83521a = new C32577w();

            C32577w() {
            }

            /* renamed from: a */
            public final ArrayList<String> parse(byte[] bArr) {
                ArrayList<String> a = C32514b.m124541a(GetRecentTimezonesResponse.ADAPTER.decode(bArr));
                Intrinsics.checkExpressionValueIsNotNull(a, "ModelParserCalendar.getR…                response)");
                return a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetResourceCheckInInfoResponse;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$x */
        static final class C32578x<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32578x f83522a = new C32578x();

            C32578x() {
            }

            /* renamed from: a */
            public final GetResourceCheckInInfoResponse parse(byte[] bArr) {
                com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse decode = com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse.ADAPTER.decode(bArr);
                ModelDataParserCalendar.Companion aVar = ModelDataParserCalendar.f83420a;
                Intrinsics.checkExpressionValueIsNotNull(decode, "response");
                return aVar.mo118802a(decode);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final Object mo118922a(Continuation<? super SdkResponse<GetLocalRoomViewResourceDataResponse>> cVar) {
            return mo118917a(Command.GET_LOCAL_ROOM_VIEW_RESOURCE_DATA, new GetLocalRoomViewResourceDataRequest.C15724a(), new C32573s(), cVar);
        }

        @JvmStatic
        /* renamed from: b */
        public final Object mo118949b(Continuation<? super SdkResponse<GetBuildingsResponse>> cVar) {
            return mo118917a(Command.GET_BUILDINGS, new GetBuildingsRequest.C15648a(), new C32560g(), cVar);
        }

        @JvmStatic
        /* renamed from: c */
        public final Object mo118957c(Continuation<? super SdkResponse<GetResourceEquipmentsResponse>> cVar) {
            return mo118917a(Command.GET_RESOURCE_EQUIPMENTS, new GetResourceEquipmentsRequest.C15772a(), new C32566m(), cVar);
        }

        @JvmStatic
        /* renamed from: d */
        public final void mo118962d(IGetDataCallback<HashMap<String, Boolean>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_THIRD_PARTY_CALENDAR_SETTINGS, new GetThirdPartyCalendarSettingsRequest.C15788a(), iGetDataCallback, C32571q.f83516a);
        }

        @JvmStatic
        /* renamed from: e */
        public final void mo118964e(IGetDataCallback<List<EquipmentData>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_RESOURCE_EQUIPMENTS, new GetResourceEquipmentsRequest.C15772a(), iGetDataCallback, C32579y.f83523a);
        }

        @JvmStatic
        /* renamed from: f */
        public final void mo118966f(IGetDataCallback<JSONObject> iGetDataCallback) {
            SdkSender.asynSendRequestNonWrap(Command.GET_SETTINGS, new GetSettingsRequest.C19155a().mo65459a(CollectionsKt.listOf("calendar_config")), iGetDataCallback, new al("calendar_config"));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lorg/json/JSONObject;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$al */
        static final class al<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            final /* synthetic */ String f83483a;

            al(String str) {
                this.f83483a = str;
            }

            /* renamed from: a */
            public final JSONObject parse(byte[] bArr) {
                try {
                    return new JSONObject(GetSettingsResponse.ADAPTER.decode(bArr).field_groups.get(this.f83483a));
                } catch (JSONException unused) {
                    throw new IOException("not valid json!");
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/rustadapter/service/CalendarSDKService$Companion$sdkRequestWithErr$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$aq */
        public static final class aq implements IGetDataCallback<T> {

            /* renamed from: a */
            final /* synthetic */ String f83488a;

            /* renamed from: b */
            final /* synthetic */ String f83489b;

            /* renamed from: c */
            final /* synthetic */ Continuation f83490c;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("CalendarSDKService", C32673y.m125370a(this.f83488a, this.f83489b, errorResult));
                Continuation cVar = this.f83490c;
                SdkResponse iVar = new SdkResponse(null, errorResult);
                Result.Companion aVar = Result.Companion;
                cVar.resumeWith(Result.m271569constructorimpl(iVar));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(T t) {
                Log.m165389i("CalendarSDKService", C32673y.m125373a(this.f83488a, this.f83489b, new String[0]));
                Continuation cVar = this.f83490c;
                SdkResponse iVar = new SdkResponse(t, null);
                Result.Companion aVar = Result.Companion;
                cVar.resumeWith(Result.m271569constructorimpl(iVar));
            }

            aq(String str, String str2, Continuation cVar) {
                this.f83488a = str;
                this.f83489b = str2;
                this.f83490c = cVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/FetchCalendarData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$d */
        static final class C32557d<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            final /* synthetic */ String f83505a;

            C32557d(String str) {
                this.f83505a = str;
            }

            /* renamed from: a */
            public final FetchCalendarData parse(byte[] bArr) {
                CalendarTenantInfo calendarTenantInfo;
                FetchCalendarsResponse decode = FetchCalendarsResponse.ADAPTER.decode(bArr);
                com.bytedance.lark.pb.calendar.v1.Calendar calendar = decode.calendars.get(this.f83505a);
                ArrayList arrayList = new ArrayList(decode.calendar_with_members.get(0).calendar_members);
                Map<String, CalendarTenantInfo> map = decode.calendar_tenant_info_map;
                if (map != null) {
                    calendarTenantInfo = map.get(this.f83505a);
                } else {
                    calendarTenantInfo = null;
                }
                return new FetchCalendarData(calendar, arrayList, calendarTenantInfo);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWithMembers;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$h */
        static final class C32561h<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32561h f83508a = new C32561h();

            C32561h() {
            }

            /* renamed from: a */
            public final CalendarWithMembers parse(byte[] bArr) {
                MGetCalendarsWithIDsResponse decode = MGetCalendarsWithIDsResponse.ADAPTER.decode(bArr);
                CalendarWithMembers cVar = new CalendarWithMembers(null, null, 3, null);
                cVar.mo120066a(C32514b.m124510a(decode.calendars.get(decode.calendar_with_members.get(0).calendar_id)));
                List<CalendarMember> g = C32514b.m124559g(decode.calendar_with_members.get(0).calendar_members);
                Intrinsics.checkExpressionValueIsNotNull(g, "ModelParserCalendar.getC…bers[0].calendar_members)");
                cVar.mo120067a(g);
                return cVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventShareLink;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$i */
        static final class C32562i<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32562i f83509a = new C32562i();

            C32562i() {
            }

            /* renamed from: a */
            public final CalendarEventShareLink parse(byte[] bArr) {
                byte[] bArr2;
                GetCalendarEventShareLinkResponse decode = GetCalendarEventShareLinkResponse.ADAPTER.decode(bArr);
                CalendarEventShareLink aVar = new CalendarEventShareLink(null, null, null, 7, null);
                String str = decode.share_copy;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                aVar.mo120039b(str);
                String str3 = decode.link_address;
                if (str3 != null) {
                    str2 = str3;
                }
                aVar.mo120037a(str2);
                ByteString byteString = decode.image_data;
                if (byteString == null || (bArr2 = byteString.toByteArray()) == null) {
                    bArr2 = new byte[0];
                }
                aVar.mo120036a(ImageUtil.f79500a.mo113951a(bArr2));
                return aVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/DoVideoMeetingEventInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$p */
        static final class C32570p<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32570p f83515a = new C32570p();

            C32570p() {
            }

            /* renamed from: a */
            public final DoVideoMeetingEventInfo parse(byte[] bArr) {
                com.bytedance.lark.pb.calendar.v1.CalendarEvent calendarEvent;
                CalendarEventInstanceTime calendarEventInstanceTime;
                GetEventInfoByVideoMeetingIdResponse decode = GetEventInfoByVideoMeetingIdResponse.ADAPTER.decode(bArr);
                DoStartEndTime fVar = null;
                if (decode != null) {
                    calendarEvent = decode.event;
                } else {
                    calendarEvent = null;
                }
                CalendarEvent a = C32514b.m124512a(calendarEvent);
                if (a == null) {
                    return null;
                }
                if (!(decode == null || (calendarEventInstanceTime = decode.instance_start_end_time) == null)) {
                    Intrinsics.checkExpressionValueIsNotNull(calendarEventInstanceTime, "it");
                    fVar = new DoStartEndTime(calendarEventInstanceTime);
                }
                return new DoVideoMeetingEventInfo(a, fVar);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u00042\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$q */
        static final class C32571q<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32571q f83516a = new C32571q();

            C32571q() {
            }

            /* renamed from: a */
            public final HashMap<String, Boolean> parse(byte[] bArr) {
                HashMap<String, Boolean> hashMap = new HashMap<>();
                List<ThirdPartyCalendarSetting> list = GetThirdPartyCalendarSettingsResponse.ADAPTER.decode(bArr).third_party_calendar_settings;
                Intrinsics.checkExpressionValueIsNotNull(list, "res.third_party_calendar_settings");
                for (T t : list) {
                    String str = t.email;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.email");
                    Boolean bool = t.visible;
                    Intrinsics.checkExpressionValueIsNotNull(bool, "it.visible");
                    hashMap.put(str, bool);
                }
                return hashMap;
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo118950b(IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callBack");
            SdkSender.asynSendRequestNonWrap(Command.GET_PRIMARY_CALENDAR_LOADING_STATUS, new GetPrimaryCalendarLoadingStatusRequest.C15754a(), iGetDataCallback, C32576v.f83520a);
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo118958c(IGetDataCallback<ArrayList<String>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_RECENT_TIMEZONES, new GetRecentTimezonesRequest.C15758a(), iGetDataCallback, C32577w.f83521a);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "Lkotlin/collections/ArrayList;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$y */
        public static final class C32579y<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32579y f83523a = new C32579y();

            C32579y() {
            }

            /* renamed from: a */
            public final ArrayList<EquipmentData> parse(byte[] bArr) {
                List<String> list;
                MeetingRoomEquipment meetingRoomEquipment;
                GetResourceEquipmentsResponse decode = GetResourceEquipmentsResponse.ADAPTER.decode(bArr);
                ArrayList<EquipmentData> arrayList = new ArrayList<>();
                if (!(decode == null || (list = decode.equipment_ids) == null)) {
                    for (T t : list) {
                        Map<String, MeetingRoomEquipment> map = decode.equipment_lists;
                        if (map != null) {
                            meetingRoomEquipment = map.get(t);
                        } else {
                            meetingRoomEquipment = null;
                        }
                        if (meetingRoomEquipment != null) {
                            Intrinsics.checkExpressionValueIsNotNull(t, "id");
                            String str = meetingRoomEquipment.i18n_name;
                            Intrinsics.checkExpressionValueIsNotNull(str, "it.i18n_name");
                            String str2 = meetingRoomEquipment.equipment_type;
                            Intrinsics.checkExpressionValueIsNotNull(str2, "it.equipment_type");
                            arrayList.add(new EquipmentData(t, str, str2, false, 8, null));
                        }
                    }
                }
                return arrayList;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/preempt/model/GetResourceWithTokenUnit;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.c$a$z */
        static final class C32580z<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C32580z f83524a = new C32580z();

            C32580z() {
            }

            /* renamed from: a */
            public final GetResourceWithTokenUnit parse(byte[] bArr) {
                GetResourceWithTokenResponse decode = GetResourceWithTokenResponse.ADAPTER.decode(bArr);
                GetResourceWithTokenUnit aVar = new GetResourceWithTokenUnit();
                CalendarResource a = C32514b.m124521a(decode.resource);
                Intrinsics.checkExpressionValueIsNotNull(a, "ModelParserCalendar.getC…source(response.resource)");
                aVar.mo117861a(a);
                CalendarBuilding a2 = C32514b.m124511a(decode.building);
                Intrinsics.checkExpressionValueIsNotNull(a2, "ModelParserCalendar.getC…ilding(response.building)");
                aVar.mo117860a(a2);
                List<CalendarEventInstance> b = C32514b.m124549b(decode.event_instances);
                Intrinsics.checkExpressionValueIsNotNull(b, "ModelParserCalendar.getC…response.event_instances)");
                aVar.mo117862a(b);
                Long l = decode.seize_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "response.seize_time");
                aVar.mo117859a(l.longValue());
                Long l2 = decode.current_timestamp;
                Intrinsics.checkExpressionValueIsNotNull(l2, "response.current_timestamp");
                aVar.mo117865b(l2.longValue());
                Boolean bool = decode.need_popover;
                Intrinsics.checkExpressionValueIsNotNull(bool, "response.need_popover");
                aVar.mo117863a(bool.booleanValue());
                return aVar;
            }
        }

        /* renamed from: a */
        public final Object mo118920a(String str, Continuation<? super SdkSender.C53233d<GetAllMeetingRoomsAndLevelsResponse>> cVar) {
            return mo118919a(str, 0L, 0L, false, cVar);
        }

        @JvmStatic
        /* renamed from: g */
        public final void mo118968g(String str, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.DISPLAY_TRANSFER_CHAT_SCROLL_CHECK, new DisplayTransferChatScrollCheckRequest.C15598a().mo56565a(str), iGetDataCallback, C32547ac.f83475a);
        }

        @JvmStatic
        /* renamed from: h */
        public final void mo118969h(String str, IGetDataCallback<SearchCalendarEventResult> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.QUICK_SEARCH_CALENDAR_EVENT, new QuickSearchCalendarEventRequest.C15968a().mo57502a(str), iGetDataCallback, aj.f83481a);
        }

        @JvmStatic
        /* renamed from: i */
        public final void mo118970i(String str, IGetDataCallback<ChatFreeBusyFavor> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_CHAT_FREE_BUSY_FAVOR, new GetChatFreeBusyFavorRequest.C15680a().mo56771a(str), iGetDataCallback, C32550af.f83477a);
        }

        @JvmStatic
        /* renamed from: j */
        public final void mo118971j(String str, IGetDataCallback<ArrayList<TimeZoneItemData>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "searchCity");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_TIMEZONE_BY_CITY, new GetTimezoneByCityRequest.C15792a().mo57042a(str), iGetDataCallback, C32554at.f83493a);
        }

        @JvmStatic
        /* renamed from: a */
        public final ParseCustomizedConfigurationResponse mo118916a(List<SchemaExtraData.CustomizationData> list, Map<String, ParseCustomizedConfigurationRequest.SelectedKeys> map) {
            Intrinsics.checkParameterIsNotNull(list, "resourceCustomization");
            Intrinsics.checkParameterIsNotNull(map, "userInputs");
            Object syncSend = SdkSender.syncSend(Command.PARSE_CUSTOMIZED_CONFIGURATION, new ParseCustomizedConfigurationRequest.C15900a().mo57334a(list).mo57335a(map), C32551ag.f83478a);
            Intrinsics.checkExpressionValueIsNotNull(syncSend, "SdkSender.syncSend(Comma…ecode(data)\n            }");
            return (ParseCustomizedConfigurationResponse) syncSend;
        }

        /* renamed from: d */
        public final void mo118963d(String str, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            DeleteCalendarRequest.C15592a aVar = new DeleteCalendarRequest.C15592a();
            aVar.mo56549a(str);
            SdkSender.asynSendRequestNonWrap(Command.DELETE_CALENDAR, aVar, iGetDataCallback, C32556c.f83504a);
        }

        @JvmStatic
        /* renamed from: e */
        public final void mo118965e(String str, IGetDataCallback<AssociatedLiveStatus> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "associatedEventId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_ASSOCIATED_LIVE_STATUS_WITH_EVENT_ID, new GetAssociatedLiveStatusWithEventIDRequest.C50597a().mo175160a(str), iGetDataCallback, C32559f.f83507a);
        }

        @JvmStatic
        /* renamed from: f */
        public final void mo118967f(String str, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.UPGRADE_TO_CHAT, new UpgradeToChatRequest.C16102a().mo57849a(str), iGetDataCallback, bc.f83503a);
        }

        @JvmStatic
        /* renamed from: k */
        public final void mo118972k(String str, IGetDataCallback<FetchCalendarData> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            SdkSender.asynSendRequestNonWrap(Command.FETCH_CALENDARS, new FetchCalendarsRequest.C15624a().mo56634a(arrayList), iGetDataCallback, new C32557d(str));
        }

        /* renamed from: c */
        public final void mo118959c(String str, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "account");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            RecallGoogleTokenRequest.C15972a aVar = new RecallGoogleTokenRequest.C15972a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            aVar.mo57511a(arrayList);
            SdkSender.asynSendRequestNonWrap(Command.RECALL_GOOGLE_TOKEN, aVar, iGetDataCallback, ak.f83482a);
        }

        @JvmStatic
        /* renamed from: a */
        public final Object mo118918a(RoomViewFilterConfigs roomViewFilterConfigs, Continuation<? super SdkResponse<UpdateRoomViewResourceDataResponse>> cVar) {
            UpdateRoomViewResourceDataRequest.C16098a a = new UpdateRoomViewResourceDataRequest.C16098a().mo57840a(roomViewFilterConfigs);
            Command command = Command.UPDATE_ROOM_VIEW_RESOURCE_DATA;
            Intrinsics.checkExpressionValueIsNotNull(a, "builder");
            return mo118917a(command, a, new C32546ab(), cVar);
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo118952b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            UnsubscribeCalendarRequest.C16088a aVar = new UnsubscribeCalendarRequest.C16088a();
            aVar.f42176a = str;
            SdkSender.asynSendRequestNonWrap(Command.UNSUBSCRIBE_CALENDAR, aVar, iGetDataCallback, az.f83499a);
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo118961c(List<String> list, IGetDataCallback<ParseCustomizedConfigurationResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(list, "contactIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.PARSE_CUSTOMIZED_CONFIGURATION, new ParseCustomizedConfigurationRequest.C15900a().mo57337b(list), iGetDataCallback, C32565l.f83511a);
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo118956b(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(list, "accounts");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.REVOKE_EXCHANGE_ACCOUNT, new RevokeExchangeAccountRequest.C15980a().mo57528a(list), iGetDataCallback, am.f83484a);
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo118954b(String str, String str2, IGetDataCallback<GetResourceCheckInInfoResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCheckInToken");
            Intrinsics.checkParameterIsNotNull(str2, "timeZoneId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.GET_RESOURCE_CHECK_IN_INFO, new GetResourceCheckInInfoRequest.C15766a().mo56976a(str).mo56978b(str2), iGetDataCallback, C32578x.f83522a);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118923a(long j, long j2, IGetDataCallback<Map<String, CalendarResource>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.PULL_ALL_MEETING_ROOMS_IN_TENANT, new PullAllMeetingRoomsInTenantRequest.C15912a().mo57363a(Long.valueOf(j)).mo57365b(Long.valueOf(j2)), iGetDataCallback, C32553ai.f83480a);
        }

        @JvmStatic
        /* renamed from: a */
        public final <T> Object mo118917a(Command command, Message.Builder<?, ?> builder, SdkSender.IParser<T> iParser, Continuation<? super SdkResponse<T>> cVar) {
            SafeContinuation gVar = new SafeContinuation(C69086a.m265825a(cVar));
            String valueOf = String.valueOf(new Date().getTime());
            String name = command.name();
            Log.m165389i("CalendarSDKService", C32673y.m125376b(valueOf, name, new String[0]));
            SdkSender.asynSendRequestNonWrap(command, builder, new aq(valueOf, name, gVar), iParser);
            Object a = gVar.mo239163a();
            if (a == C69086a.m265828a()) {
                C69091e.m265847c(cVar);
            }
            return a;
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo118951b(String str, long j, long j2, IGetDataCallback<CalendarEvent> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.SEIZE_RESOURCE, new SeizeResourceRequest.C16032a().mo57672a(str).mo57671a(Long.valueOf(j)).mo57674b(Long.valueOf(j2)), iGetDataCallback, C32552ah.f83479a);
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo118960c(String str, List<String> list, List<String> list2, IGetDataCallback<Object> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(list, "userIds");
            Intrinsics.checkParameterIsNotNull(list2, "groupIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.SHARE_CALENDAR, new ShareCalendarRequest.C16054a().mo57729a(str).mo57730a(list).mo57732b(list2), iGetDataCallback, av.f83495a);
        }

        /* renamed from: b */
        public final void mo118955b(String str, List<String> list, List<String> list2, IGetDataCallback<List<com.bytedance.lark.pb.calendar.v1.CalendarMember>> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(list, "userIds");
            Intrinsics.checkParameterIsNotNull(list2, "chatIds");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            GetCalendarMembersByIdsRequest.C15664a aVar = new GetCalendarMembersByIdsRequest.C15664a();
            aVar.mo56732a(str);
            aVar.mo56733a(list);
            aVar.mo56735b(list2);
            SdkSender.asynSendRequestNonWrap(Command.GET_CALENDAR_MEMBERS_BY_IDS, aVar, iGetDataCallback, C32575u.f83519a);
        }

        /* renamed from: a */
        public final Object mo118919a(String str, long j, long j2, boolean z, Continuation<? super SdkSender.C53233d<GetAllMeetingRoomsAndLevelsResponse>> cVar) {
            Command command = Command.GET_ALL_MEETING_ROOMS_AND_LEVELS;
            GetAllMeetingRoomsAndLevelsRequest.C15636a a = new GetAllMeetingRoomsAndLevelsRequest.C15636a().mo56661a(str).mo56660a(C69089a.m265840a(j)).mo56663b(C69089a.m265840a(j2)).mo56659a(C69089a.m265837a(z));
            Intrinsics.checkExpressionValueIsNotNull(a, "GetAllMeetingRoomsAndLev…rce(needDisabledResource)");
            ProtoAdapter<GetAllMeetingRoomsAndLevelsResponse> protoAdapter = GetAllMeetingRoomsAndLevelsResponse.ADAPTER;
            Intrinsics.checkExpressionValueIsNotNull(protoAdapter, "GetAllMeetingRoomsAndLevelsResponse.ADAPTER");
            return C32602a.m124912a(command, a, protoAdapter, cVar);
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo118953b(String str, String str2, long j, boolean z, IGetDataCallback<CalendarEventShareLink> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(str2, "key");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            GetCalendarEventShareLinkRequest.C15660a aVar = new GetCalendarEventShareLinkRequest.C15660a();
            aVar.mo56722a(str).mo56724b(str2).mo56721a(Long.valueOf(j)).mo56720a(Boolean.valueOf(z));
            SdkSender.asynSendRequestNonWrap(Command.GET_EVENT_SHARE_LINK, aVar, iGetDataCallback, C32562i.f83509a);
        }

        @JvmStatic
        /* renamed from: a */
        public final Object mo118921a(List<String> list, long j, long j2, String str, Continuation<? super SdkResponse<GetRoomViewInstancesResponse>> cVar) {
            GetRoomViewInstancesRequest.C15780a a = new GetRoomViewInstancesRequest.C15780a().mo57011a(list).mo57009a(C69089a.m265840a(j)).mo57013b(C69089a.m265840a(j2)).mo57010a(str);
            Command command = Command.GET_ROOM_VIEW_INSTANCES;
            Intrinsics.checkExpressionValueIsNotNull(a, "builder");
            return mo118917a(command, a, new C32545aa(), cVar);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo118924a(long j, long j2, String str, int i, String str2, boolean z, int i2, MeetingRoomFilter meetingRoomFilter, IGetDataCallback<SearchMeetingRoomsForHierarchicalLevelsResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "keyWord");
            Intrinsics.checkParameterIsNotNull(str2, "rrule");
            Intrinsics.checkParameterIsNotNull(meetingRoomFilter, "meetingRoomFilter");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            SdkSender.asynSendRequestNonWrap(Command.SEARCH_MEETING_ROOMS_FOR_HIERARCHICAL_LEVELS, new SearchMeetingRoomsForHierarchicalLevelsRequest.C16024a().mo57643a(Long.valueOf(j)).mo57647b(Long.valueOf(j2)).mo57644a(str).mo57642a(Integer.valueOf(i)).mo57648b(str2).mo57641a(Boolean.valueOf(z)).mo57646b(Integer.valueOf(i2)).mo57640a(meetingRoomFilter), iGetDataCallback, as.f83492a);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124698a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        f83473a.mo118967f(str, iGetDataCallback);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124699b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        f83473a.mo118968g(str, iGetDataCallback);
    }
}
