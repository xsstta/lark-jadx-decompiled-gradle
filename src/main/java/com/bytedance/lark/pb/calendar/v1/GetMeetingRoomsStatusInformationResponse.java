package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetMeetingRoomsStatusInformationResponse extends Message<GetMeetingRoomsStatusInformationResponse, C15744a> {
    public static final ProtoAdapter<GetMeetingRoomsStatusInformationResponse> ADAPTER = new C15745b();
    private static final long serialVersionUID = 0;
    public final Map<String, StatusInformation> status_information;

    public static final class StatusInformation extends Message<StatusInformation, C15742a> {
        public static final ProtoAdapter<StatusInformation> ADAPTER = new C15743b();
        public static final MeetingRoomStatus DEFAULT_STATUS = MeetingRoomStatus.CAN_NOT_RESERVE;
        private static final long serialVersionUID = 0;
        public final MeetingRoomInformation information;
        public final MeetingRoomStatus status;
        public final MeetingRoomSubscriptionInfo subscription_info;
        public final MeetingRoomUnusableReasons unusable_reasons;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationResponse$StatusInformation$b */
        private static final class C15743b extends ProtoAdapter<StatusInformation> {
            C15743b() {
                super(FieldEncoding.LENGTH_DELIMITED, StatusInformation.class);
            }

            /* renamed from: a */
            public int encodedSize(StatusInformation statusInformation) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (statusInformation.status != null) {
                    i = MeetingRoomStatus.ADAPTER.encodedSizeWithTag(1, statusInformation.status);
                } else {
                    i = 0;
                }
                if (statusInformation.information != null) {
                    i2 = MeetingRoomInformation.ADAPTER.encodedSizeWithTag(2, statusInformation.information);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (statusInformation.subscription_info != null) {
                    i3 = MeetingRoomSubscriptionInfo.ADAPTER.encodedSizeWithTag(3, statusInformation.subscription_info);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (statusInformation.unusable_reasons != null) {
                    i4 = MeetingRoomUnusableReasons.ADAPTER.encodedSizeWithTag(4, statusInformation.unusable_reasons);
                }
                return i6 + i4 + statusInformation.unknownFields().size();
            }

            /* renamed from: a */
            public StatusInformation decode(ProtoReader protoReader) throws IOException {
                C15742a aVar = new C15742a();
                aVar.f41510a = MeetingRoomStatus.CAN_NOT_RESERVE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f41510a = MeetingRoomStatus.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f41511b = MeetingRoomInformation.ADAPTER.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f41512c = MeetingRoomSubscriptionInfo.ADAPTER.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f41513d = MeetingRoomUnusableReasons.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, StatusInformation statusInformation) throws IOException {
                if (statusInformation.status != null) {
                    MeetingRoomStatus.ADAPTER.encodeWithTag(protoWriter, 1, statusInformation.status);
                }
                if (statusInformation.information != null) {
                    MeetingRoomInformation.ADAPTER.encodeWithTag(protoWriter, 2, statusInformation.information);
                }
                if (statusInformation.subscription_info != null) {
                    MeetingRoomSubscriptionInfo.ADAPTER.encodeWithTag(protoWriter, 3, statusInformation.subscription_info);
                }
                if (statusInformation.unusable_reasons != null) {
                    MeetingRoomUnusableReasons.ADAPTER.encodeWithTag(protoWriter, 4, statusInformation.unusable_reasons);
                }
                protoWriter.writeBytes(statusInformation.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationResponse$StatusInformation$a */
        public static final class C15742a extends Message.Builder<StatusInformation, C15742a> {

            /* renamed from: a */
            public MeetingRoomStatus f41510a;

            /* renamed from: b */
            public MeetingRoomInformation f41511b;

            /* renamed from: c */
            public MeetingRoomSubscriptionInfo f41512c;

            /* renamed from: d */
            public MeetingRoomUnusableReasons f41513d;

            /* renamed from: a */
            public StatusInformation build() {
                return new StatusInformation(this.f41510a, this.f41511b, this.f41512c, this.f41513d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C15742a newBuilder() {
            C15742a aVar = new C15742a();
            aVar.f41510a = this.status;
            aVar.f41511b = this.information;
            aVar.f41512c = this.subscription_info;
            aVar.f41513d = this.unusable_reasons;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "StatusInformation");
            StringBuilder sb = new StringBuilder();
            if (this.status != null) {
                sb.append(", status=");
                sb.append(this.status);
            }
            if (this.information != null) {
                sb.append(", information=");
                sb.append(this.information);
            }
            if (this.subscription_info != null) {
                sb.append(", subscription_info=");
                sb.append(this.subscription_info);
            }
            if (this.unusable_reasons != null) {
                sb.append(", unusable_reasons=");
                sb.append(this.unusable_reasons);
            }
            StringBuilder replace = sb.replace(0, 2, "StatusInformation{");
            replace.append('}');
            return replace.toString();
        }

        public StatusInformation(MeetingRoomStatus meetingRoomStatus, MeetingRoomInformation meetingRoomInformation, MeetingRoomSubscriptionInfo meetingRoomSubscriptionInfo, MeetingRoomUnusableReasons meetingRoomUnusableReasons) {
            this(meetingRoomStatus, meetingRoomInformation, meetingRoomSubscriptionInfo, meetingRoomUnusableReasons, ByteString.EMPTY);
        }

        public StatusInformation(MeetingRoomStatus meetingRoomStatus, MeetingRoomInformation meetingRoomInformation, MeetingRoomSubscriptionInfo meetingRoomSubscriptionInfo, MeetingRoomUnusableReasons meetingRoomUnusableReasons, ByteString byteString) {
            super(ADAPTER, byteString);
            this.status = meetingRoomStatus;
            this.information = meetingRoomInformation;
            this.subscription_info = meetingRoomSubscriptionInfo;
            this.unusable_reasons = meetingRoomUnusableReasons;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationResponse$a */
    public static final class C15744a extends Message.Builder<GetMeetingRoomsStatusInformationResponse, C15744a> {

        /* renamed from: a */
        public Map<String, StatusInformation> f41514a = Internal.newMutableMap();

        /* renamed from: a */
        public GetMeetingRoomsStatusInformationResponse build() {
            return new GetMeetingRoomsStatusInformationResponse(this.f41514a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetMeetingRoomsStatusInformationResponse$b */
    private static final class C15745b extends ProtoAdapter<GetMeetingRoomsStatusInformationResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, StatusInformation>> f41515a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, StatusInformation.ADAPTER);

        C15745b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeetingRoomsStatusInformationResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeetingRoomsStatusInformationResponse getMeetingRoomsStatusInformationResponse) {
            return this.f41515a.encodedSizeWithTag(1, getMeetingRoomsStatusInformationResponse.status_information) + getMeetingRoomsStatusInformationResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeetingRoomsStatusInformationResponse decode(ProtoReader protoReader) throws IOException {
            C15744a aVar = new C15744a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41514a.putAll(this.f41515a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeetingRoomsStatusInformationResponse getMeetingRoomsStatusInformationResponse) throws IOException {
            this.f41515a.encodeWithTag(protoWriter, 1, getMeetingRoomsStatusInformationResponse.status_information);
            protoWriter.writeBytes(getMeetingRoomsStatusInformationResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15744a newBuilder() {
        C15744a aVar = new C15744a();
        aVar.f41514a = Internal.copyOf("status_information", this.status_information);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetMeetingRoomsStatusInformationResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.status_information.isEmpty()) {
            sb.append(", status_information=");
            sb.append(this.status_information);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMeetingRoomsStatusInformationResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeetingRoomsStatusInformationResponse(Map<String, StatusInformation> map) {
        this(map, ByteString.EMPTY);
    }

    public GetMeetingRoomsStatusInformationResponse(Map<String, StatusInformation> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_information = Internal.immutableCopyOf("status_information", map);
    }
}
