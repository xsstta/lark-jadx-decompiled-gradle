package com.ss.android.lark.calendar.impl.rustadapter.parser;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.calendar.v1.EventCreator;
import com.bytedance.lark.pb.calendar.v1.EventVideoMeetingConfig;
import com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationResponse;
import com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomInformation;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomSubscriptionInfo;
import com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchContent;
import com.bytedance.lark.pb.calendar.v1.MultiCalendarSearchResponse;
import com.bytedance.lark.pb.calendar.v1.VideoMeeting;
import com.larksuite.framework.utils.C26249aa;
import com.ss.android.lark.calendar.impl.features.events.detail.videoUrl.entity.VideoType;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MultiCalendarSearchContentData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OtherVideoMeetingConfigs;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.StatusInformation;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/parser/ModelDataParserCalendar;", "", "()V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.a.a */
public final class ModelDataParserCalendar {

    /* renamed from: a */
    public static final Companion f83420a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ(\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0013H\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u000f\u001a\u00020\u0019J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\"J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\b\u0010&\u001a\u0004\u0018\u00010'H\u0007J\u0012\u0010(\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020+H\u0007J\u0012\u0010,\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\b¨\u0006-"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/parser/ModelDataParserCalendar$Companion;", "", "()V", "convertToOtherConfigs", "Lcom/bytedance/lark/pb/calendar/v1/EventVideoMeetingConfig$OtherVideoMeetingConfigs;", "otherVideoMeetingConfigs", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/OtherVideoMeetingConfigs;", "convertToPbVideoMeeting", "Lcom/bytedance/lark/pb/calendar/v1/VideoMeeting;", "videoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/VideoMeeting;", "getEventCreatorMap", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "pbData", "Lcom/bytedance/lark/pb/calendar/v1/EventCreator;", "getGetMeetingRoomsStatusInformationResponse", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetMeetingRoomsStatusInformationResponse;", "Lcom/bytedance/lark/pb/calendar/v1/GetMeetingRoomsStatusInformationResponse;", "getGetResourceCheckInInfoResponse", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetResourceCheckInInfoResponse;", "Lcom/bytedance/lark/pb/calendar/v1/GetResourceCheckInInfoResponse;", "getInstanceInfo", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;", "Lcom/bytedance/lark/pb/calendar/v1/GetResourceCheckInInfoResponse$InstanceInfo;", "getInstanceInfoList", "", "", "getMeetingRoomInformation", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomInformation;", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomInformation;", "getMeetingRoomSubscriptionInfo", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomSubscriptionInfo;", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomSubscriptionInfo;", "getMultiCalendarSearchResponse", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MultiCalendarSearchContentData;", "response", "Lcom/bytedance/lark/pb/calendar/v1/MultiCalendarSearchResponse;", "getOtherVideoMeetingConfigs", "getStatusInformation", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;", "Lcom/bytedance/lark/pb/calendar/v1/GetMeetingRoomsStatusInformationResponse$StatusInformation;", "getVideoMeeting", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final ArrayList<MultiCalendarSearchContentData> mo118808a(MultiCalendarSearchResponse multiCalendarSearchResponse) {
            Map<String, Chatter> map;
            Chatter chatter;
            Map<String, Chatter> map2;
            Chatter chatter2;
            List<MultiCalendarSearchContent> list = multiCalendarSearchResponse != null ? multiCalendarSearchResponse.contents : null;
            ArrayList<MultiCalendarSearchContentData> arrayList = new ArrayList<>();
            if (list != null) {
                for (MultiCalendarSearchContent multiCalendarSearchContent : list) {
                    String str = multiCalendarSearchContent.calendar_id;
                    Intrinsics.checkExpressionValueIsNotNull(str, "content.calendar_id");
                    String str2 = multiCalendarSearchContent.title;
                    String str3 = multiCalendarSearchContent.subtitle;
                    String str4 = multiCalendarSearchContent.avatar_url;
                    Boolean bool = multiCalendarSearchContent.is_private;
                    Intrinsics.checkExpressionValueIsNotNull(bool, "content.is_private");
                    boolean booleanValue = bool.booleanValue();
                    Boolean bool2 = multiCalendarSearchContent.is_member;
                    Intrinsics.checkExpressionValueIsNotNull(bool2, "content.is_member");
                    boolean booleanValue2 = bool2.booleanValue();
                    Boolean bool3 = multiCalendarSearchContent.is_dismissed;
                    Intrinsics.checkExpressionValueIsNotNull(bool3, "content.is_dismissed");
                    boolean booleanValue3 = bool3.booleanValue();
                    Boolean bool4 = multiCalendarSearchContent.is_cross_tenant;
                    Intrinsics.checkExpressionValueIsNotNull(bool4, "content.is_cross_tenant");
                    MultiCalendarSearchContentData rVar = new MultiCalendarSearchContentData(str, str2, str3, str4, booleanValue, booleanValue2, booleanValue3, bool4.booleanValue(), multiCalendarSearchContent.calendar_tenant_id);
                    rVar.mo120192a((multiCalendarSearchResponse != null ? multiCalendarSearchResponse.calendar_chatter_map : null).get(multiCalendarSearchContent.calendar_id));
                    rVar.mo120194b((multiCalendarSearchResponse == null || (map2 = multiCalendarSearchResponse.chatter_map) == null || (chatter2 = map2.get(rVar.mo120191a())) == null) ? null : chatter2.avatar_key);
                    String str5 = (multiCalendarSearchResponse == null || (map = multiCalendarSearchResponse.chatter_map) == null || (chatter = map.get(rVar.mo120191a())) == null) ? null : chatter.localized_name;
                    if (str5 != null) {
                        rVar.mo120196c(str5);
                    }
                    arrayList.add(rVar);
                }
            }
            return arrayList;
        }

        @JvmStatic
        /* renamed from: a */
        public final StatusInformation mo118807a(GetMeetingRoomsStatusInformationResponse.StatusInformation statusInformation) {
            Intrinsics.checkParameterIsNotNull(statusInformation, "pbData");
            StatusInformation zVar = new StatusInformation(null, null, null, null, 15, null);
            zVar.mo120257a(statusInformation.status);
            zVar.mo120258a(statusInformation.unusable_reasons);
            MeetingRoomInformation meetingRoomInformation = statusInformation.information;
            if (meetingRoomInformation != null) {
                Companion aVar = ModelDataParserCalendar.f83420a;
                Intrinsics.checkExpressionValueIsNotNull(meetingRoomInformation, "it");
                zVar.mo120259a(aVar.mo118804a(meetingRoomInformation));
            }
            MeetingRoomSubscriptionInfo meetingRoomSubscriptionInfo = statusInformation.subscription_info;
            if (meetingRoomSubscriptionInfo != null) {
                Companion aVar2 = ModelDataParserCalendar.f83420a;
                Intrinsics.checkExpressionValueIsNotNull(meetingRoomSubscriptionInfo, "it");
                zVar.mo120260a(aVar2.mo118805a(meetingRoomSubscriptionInfo));
            }
            return zVar;
        }

        /* renamed from: a */
        public final Map<String, CalendarEventCreator> mo118810a(Map<String, EventCreator> map) {
            Map<String, CalendarEventCreator> a = C26249aa.m94985a(map, C32511a.f83421a);
            Intrinsics.checkExpressionValueIsNotNull(a, "ParseUtils.parseMapFromO…Creator(it)\n            }");
            return a;
        }

        /* renamed from: a */
        public final OtherVideoMeetingConfigs mo118806a(EventVideoMeetingConfig.OtherVideoMeetingConfigs otherVideoMeetingConfigs) {
            if (otherVideoMeetingConfigs == null) {
                return null;
            }
            OtherVideoMeetingConfigs tVar = new OtherVideoMeetingConfigs(null, null, 3, null);
            String str = otherVideoMeetingConfigs.customized_description;
            Intrinsics.checkExpressionValueIsNotNull(str, "pbData.customized_description");
            tVar.mo120215a(str);
            EventVideoMeetingConfig.OtherVideoMeetingConfigs.IconType iconType = otherVideoMeetingConfigs.icon;
            Intrinsics.checkExpressionValueIsNotNull(iconType, "pbData.icon");
            tVar.mo120214a(iconType);
            return tVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/lark/pb/calendar/v1/EventCreator;", "get"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.a.a$a$a */
        public static final class C32511a<S, R> implements C26249aa.AbstractC26250a<S, R> {

            /* renamed from: a */
            public static final C32511a f83421a = new C32511a();

            C32511a() {
            }

            /* renamed from: a */
            public final CalendarEventCreator get(EventCreator eventCreator) {
                return C32514b.m124514a(eventCreator);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;", "it", "Lcom/bytedance/lark/pb/calendar/v1/GetMeetingRoomsStatusInformationResponse$StatusInformation;", "kotlin.jvm.PlatformType", "get"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.a.a$a$b */
        public static final class C32512b<S, R> implements C26249aa.AbstractC26250a<S, R> {

            /* renamed from: a */
            public static final C32512b f83422a = new C32512b();

            C32512b() {
            }

            /* renamed from: a */
            public final StatusInformation get(GetMeetingRoomsStatusInformationResponse.StatusInformation statusInformation) {
                Companion aVar = ModelDataParserCalendar.f83420a;
                Intrinsics.checkExpressionValueIsNotNull(statusInformation, "it");
                return aVar.mo118807a(statusInformation);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;", "it", "Lcom/bytedance/lark/pb/calendar/v1/GetResourceCheckInInfoResponse$InstanceInfo;", "kotlin.jvm.PlatformType", "get"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.a.a$a$c */
        public static final class C32513c<S, R> implements C26249aa.AbstractC26250a<S, R> {

            /* renamed from: a */
            public static final C32513c f83423a = new C32513c();

            C32513c() {
            }

            /* renamed from: a */
            public final InstanceInfo get(GetResourceCheckInInfoResponse.InstanceInfo instanceInfo) {
                Companion aVar = ModelDataParserCalendar.f83420a;
                Intrinsics.checkExpressionValueIsNotNull(instanceInfo, "it");
                return aVar.mo118803a(instanceInfo);
            }
        }

        /* renamed from: a */
        public final List<InstanceInfo> mo118809a(List<GetResourceCheckInInfoResponse.InstanceInfo> list) {
            List<InstanceInfo> a = C26249aa.m94984a(list, C32513c.f83423a);
            Intrinsics.checkExpressionValueIsNotNull(a, "ParseUtils.parseListFrom…nceInfo(it)\n            }");
            return a;
        }

        /* renamed from: a */
        public final EventVideoMeetingConfig.OtherVideoMeetingConfigs mo118798a(OtherVideoMeetingConfigs tVar) {
            if (tVar == null) {
                return null;
            }
            EventVideoMeetingConfig.OtherVideoMeetingConfigs.C15620a aVar = new EventVideoMeetingConfig.OtherVideoMeetingConfigs.C15620a();
            aVar.mo56623a(tVar.mo120213a());
            aVar.mo56622a(tVar.mo120216b());
            return aVar.build();
        }

        @JvmStatic
        /* renamed from: a */
        public final com.ss.android.lark.calendar.impl.rustadapter.doentity.GetMeetingRoomsStatusInformationResponse mo118801a(GetMeetingRoomsStatusInformationResponse getMeetingRoomsStatusInformationResponse) {
            Intrinsics.checkParameterIsNotNull(getMeetingRoomsStatusInformationResponse, "pbData");
            com.ss.android.lark.calendar.impl.rustadapter.doentity.GetMeetingRoomsStatusInformationResponse iVar = new com.ss.android.lark.calendar.impl.rustadapter.doentity.GetMeetingRoomsStatusInformationResponse(null, 1, null);
            iVar.mo120091a(C26249aa.m94985a(getMeetingRoomsStatusInformationResponse.status_information, C32512b.f83422a));
            return iVar;
        }

        /* renamed from: a */
        public final VideoMeeting mo118799a(com.ss.android.lark.calendar.impl.rustadapter.doentity.VideoMeeting aaVar) {
            if (aaVar == null) {
                return null;
            }
            VideoMeeting.C16118a aVar = new VideoMeeting.C16118a();
            aVar.mo57893a(aaVar.mo120044a());
            aVar.mo57895b(aaVar.mo120049b());
            aVar.mo57892a(aaVar.mo120051c());
            aVar.mo57896c(aaVar.mo120053d());
            aVar.mo57891a(VideoMeeting.VideoMeetingType.fromValue(aaVar.mo120054e().getNumber()));
            aVar.mo57890a(ModelDataParserCalendar.f83420a.mo118798a(aaVar.mo120056f()));
            return aVar.build();
        }

        /* renamed from: a */
        public final com.ss.android.lark.calendar.impl.rustadapter.doentity.VideoMeeting mo118800a(VideoMeeting videoMeeting) {
            if (videoMeeting == null) {
                return null;
            }
            com.ss.android.lark.calendar.impl.rustadapter.doentity.VideoMeeting aaVar = new com.ss.android.lark.calendar.impl.rustadapter.doentity.VideoMeeting(null, null, null, null, null, null, 63, null);
            String str = videoMeeting.unique_id;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            aaVar.mo120048a(str);
            String str3 = videoMeeting.meeting_number;
            if (str3 == null) {
                str3 = str2;
            }
            aaVar.mo120050b(str3);
            aaVar.mo120047a(videoMeeting.is_expired);
            String str4 = videoMeeting.meeting_url;
            if (str4 != null) {
                str2 = str4;
            }
            aaVar.mo120052c(str2);
            VideoMeeting.VideoMeetingType videoMeetingType = videoMeeting.video_meeting_type;
            if (videoMeetingType != null) {
                aaVar.mo120045a(VideoType.Companion.mo114049a(videoMeetingType.getValue()));
            }
            aaVar.mo120046a(ModelDataParserCalendar.f83420a.mo118806a(videoMeeting.other_configs));
            return aaVar;
        }

        /* renamed from: a */
        public final com.ss.android.lark.calendar.impl.rustadapter.doentity.GetResourceCheckInInfoResponse mo118802a(GetResourceCheckInInfoResponse getResourceCheckInInfoResponse) {
            Intrinsics.checkParameterIsNotNull(getResourceCheckInInfoResponse, "pbData");
            com.ss.android.lark.calendar.impl.rustadapter.doentity.GetResourceCheckInInfoResponse jVar = new com.ss.android.lark.calendar.impl.rustadapter.doentity.GetResourceCheckInInfoResponse(null, null, 0, null, null, null, null, SmActions.ACTION_ONTHECALL_ENTRY, null);
            CalendarResource a = C32514b.m124521a(getResourceCheckInInfoResponse.resource);
            if (a != null) {
                jVar.mo120100a(a);
            }
            CalendarBuilding a2 = C32514b.m124511a(getResourceCheckInInfoResponse.building);
            if (a2 != null) {
                jVar.mo120099a(a2);
            }
            Long l = getResourceCheckInInfoResponse.current_timestamp_second;
            Intrinsics.checkExpressionValueIsNotNull(l, "pbData.current_timestamp_second");
            jVar.mo120096a(l.longValue());
            jVar.mo120097a(getResourceCheckInInfoResponse.auth_create_event);
            Companion aVar = this;
            jVar.mo120101a(aVar.mo118809a(getResourceCheckInInfoResponse.instance_infos));
            jVar.mo120098a(getResourceCheckInInfoResponse.resource_check_in_strategy);
            jVar.mo120102a(aVar.mo118810a(getResourceCheckInInfoResponse.chatters));
            return jVar;
        }

        /* renamed from: a */
        public final InstanceInfo mo118803a(GetResourceCheckInInfoResponse.InstanceInfo instanceInfo) {
            Intrinsics.checkParameterIsNotNull(instanceInfo, "pbData");
            CalendarEventInstance a = C32514b.m124516a(instanceInfo.instance);
            if (a != null) {
                return new InstanceInfo(a, instanceInfo.instance_check_in_info);
            }
            return null;
        }

        /* renamed from: a */
        public final com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomInformation mo118804a(MeetingRoomInformation meetingRoomInformation) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(meetingRoomInformation, "pbData");
            com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomInformation pVar = new com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomInformation(null, null, null, null, 0, null, false, null, null, null, null, false, null, false, 16383, null);
            String str = meetingRoomInformation.floor_name;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            pVar.mo120146a(str);
            String str3 = meetingRoomInformation.name;
            if (str3 == null) {
                str3 = str2;
            }
            pVar.mo120150b(str3);
            String str4 = meetingRoomInformation.city_name;
            if (str4 == null) {
                str4 = str2;
            }
            pVar.mo120153c(str4);
            String str5 = meetingRoomInformation.building_name;
            if (str5 == null) {
                str5 = str2;
            }
            pVar.mo120156d(str5);
            Long l = meetingRoomInformation.capacity;
            Intrinsics.checkExpressionValueIsNotNull(l, "pbData.capacity");
            pVar.mo120142a(l.longValue());
            pVar.mo120147a(meetingRoomInformation.equipment_lists);
            Boolean bool = meetingRoomInformation.is_approval;
            Intrinsics.checkExpressionValueIsNotNull(bool, "pbData.is_approval");
            pVar.mo120148a(bool.booleanValue());
            String str6 = meetingRoomInformation.remark;
            if (str6 == null) {
                str6 = str2;
            }
            pVar.mo120158e(str6);
            String str7 = meetingRoomInformation.picture;
            if (str7 != null) {
                str2 = str7;
            }
            pVar.mo120161f(str2);
            pVar.mo120145a(meetingRoomInformation.resource_strategy);
            pVar.mo120144a(meetingRoomInformation.resource_requisition);
            Boolean bool2 = meetingRoomInformation.is_customized;
            boolean z2 = false;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            pVar.mo120151b(z);
            pVar.mo120143a(meetingRoomInformation.trigger);
            Boolean bool3 = meetingRoomInformation.should_show_summary;
            if (bool3 != null) {
                z2 = bool3.booleanValue();
            }
            pVar.mo120154c(z2);
            return pVar;
        }

        /* renamed from: a */
        public final com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomSubscriptionInfo mo118805a(MeetingRoomSubscriptionInfo meetingRoomSubscriptionInfo) {
            Intrinsics.checkParameterIsNotNull(meetingRoomSubscriptionInfo, "pbData");
            com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomSubscriptionInfo qVar = new com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomSubscriptionInfo(false, null, null, null, 0, 0, false, null, null, null, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
            Boolean bool = meetingRoomSubscriptionInfo.is_public;
            Intrinsics.checkExpressionValueIsNotNull(bool, "pbData.is_public");
            qVar.mo120176a(bool.booleanValue());
            String str = meetingRoomSubscriptionInfo.summary;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            qVar.mo120175a(str);
            String str3 = meetingRoomSubscriptionInfo.event_id;
            if (str3 == null) {
                str3 = str2;
            }
            qVar.mo120180b(str3);
            String str4 = meetingRoomSubscriptionInfo.calendar_id;
            if (str4 != null) {
                str2 = str4;
            }
            qVar.mo120183c(str2);
            Long l = meetingRoomSubscriptionInfo.start_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "pbData.start_time");
            qVar.mo120173a(l.longValue());
            Long l2 = meetingRoomSubscriptionInfo.end_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "pbData.end_time");
            qVar.mo120178b(l2.longValue());
            Boolean bool2 = meetingRoomSubscriptionInfo.is_all_day;
            Intrinsics.checkExpressionValueIsNotNull(bool2, "pbData.is_all_day");
            qVar.mo120181b(bool2.booleanValue());
            qVar.mo120174a(C32514b.m124514a(meetingRoomSubscriptionInfo.original_event_creator));
            qVar.mo120179b(C32514b.m124514a(meetingRoomSubscriptionInfo.creator));
            qVar.mo120182c(C32514b.m124514a(meetingRoomSubscriptionInfo.event_organizer));
            return qVar;
        }
    }
}
