package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetAssociatedVideoChatStatusResponse extends Message<GetAssociatedVideoChatStatusResponse, C50607a> {
    public static final ProtoAdapter<GetAssociatedVideoChatStatusResponse> ADAPTER = new C50608b();
    public static final Boolean DEFAULT_HAS_ACTIVE_CHAT_ROOM = false;
    public static final Boolean DEFAULT_HAS_ACTIVE_MEETING = false;
    public static final IDType DEFAULT_ID_TYPE = IDType.UNKNOWN_ID_TYPE;
    public static final Long DEFAULT_SEQ_ID = 0L;
    private static final long serialVersionUID = 0;
    public final List<String> active_meeting_ids;
    public final VCMeetingAbbrInfo chat_room_info;
    public final Boolean has_active_chat_room;
    public final Boolean has_active_meeting;
    public final String id;
    public final IDType id_type;
    public final VCMeetingAbbrInfo meeting_info;
    public final String push_sid;
    public final Long seq_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatStatusResponse$b */
    private static final class C50608b extends ProtoAdapter<GetAssociatedVideoChatStatusResponse> {
        C50608b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAssociatedVideoChatStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAssociatedVideoChatStatusResponse getAssociatedVideoChatStatusResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (getAssociatedVideoChatStatusResponse.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAssociatedVideoChatStatusResponse.id);
            } else {
                i = 0;
            }
            if (getAssociatedVideoChatStatusResponse.id_type != null) {
                i2 = IDType.ADAPTER.encodedSizeWithTag(2, getAssociatedVideoChatStatusResponse.id_type);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, getAssociatedVideoChatStatusResponse.active_meeting_ids);
            if (getAssociatedVideoChatStatusResponse.has_active_meeting != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getAssociatedVideoChatStatusResponse.has_active_meeting);
            } else {
                i3 = 0;
            }
            int i9 = encodedSizeWithTag + i3;
            if (getAssociatedVideoChatStatusResponse.meeting_info != null) {
                i4 = VCMeetingAbbrInfo.ADAPTER.encodedSizeWithTag(5, getAssociatedVideoChatStatusResponse.meeting_info);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (getAssociatedVideoChatStatusResponse.has_active_chat_room != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, getAssociatedVideoChatStatusResponse.has_active_chat_room);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (getAssociatedVideoChatStatusResponse.chat_room_info != null) {
                i6 = VCMeetingAbbrInfo.ADAPTER.encodedSizeWithTag(7, getAssociatedVideoChatStatusResponse.chat_room_info);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (getAssociatedVideoChatStatusResponse.seq_id != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(8, getAssociatedVideoChatStatusResponse.seq_id);
            } else {
                i7 = 0;
            }
            int i13 = i12 + i7;
            if (getAssociatedVideoChatStatusResponse.push_sid != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, getAssociatedVideoChatStatusResponse.push_sid);
            }
            return i13 + i8 + getAssociatedVideoChatStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAssociatedVideoChatStatusResponse decode(ProtoReader protoReader) throws IOException {
            C50607a aVar = new C50607a();
            aVar.f126334a = "";
            aVar.f126335b = IDType.UNKNOWN_ID_TYPE;
            aVar.f126337d = false;
            aVar.f126339f = false;
            aVar.f126341h = 0L;
            aVar.f126342i = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126334a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f126335b = IDType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f126336c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f126337d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126338e = VCMeetingAbbrInfo.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126339f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126340g = VCMeetingAbbrInfo.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126341h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f126342i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAssociatedVideoChatStatusResponse getAssociatedVideoChatStatusResponse) throws IOException {
            if (getAssociatedVideoChatStatusResponse.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAssociatedVideoChatStatusResponse.id);
            }
            if (getAssociatedVideoChatStatusResponse.id_type != null) {
                IDType.ADAPTER.encodeWithTag(protoWriter, 2, getAssociatedVideoChatStatusResponse.id_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, getAssociatedVideoChatStatusResponse.active_meeting_ids);
            if (getAssociatedVideoChatStatusResponse.has_active_meeting != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getAssociatedVideoChatStatusResponse.has_active_meeting);
            }
            if (getAssociatedVideoChatStatusResponse.meeting_info != null) {
                VCMeetingAbbrInfo.ADAPTER.encodeWithTag(protoWriter, 5, getAssociatedVideoChatStatusResponse.meeting_info);
            }
            if (getAssociatedVideoChatStatusResponse.has_active_chat_room != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, getAssociatedVideoChatStatusResponse.has_active_chat_room);
            }
            if (getAssociatedVideoChatStatusResponse.chat_room_info != null) {
                VCMeetingAbbrInfo.ADAPTER.encodeWithTag(protoWriter, 7, getAssociatedVideoChatStatusResponse.chat_room_info);
            }
            if (getAssociatedVideoChatStatusResponse.seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, getAssociatedVideoChatStatusResponse.seq_id);
            }
            if (getAssociatedVideoChatStatusResponse.push_sid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, getAssociatedVideoChatStatusResponse.push_sid);
            }
            protoWriter.writeBytes(getAssociatedVideoChatStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatStatusResponse$a */
    public static final class C50607a extends Message.Builder<GetAssociatedVideoChatStatusResponse, C50607a> {

        /* renamed from: a */
        public String f126334a;

        /* renamed from: b */
        public IDType f126335b;

        /* renamed from: c */
        public List<String> f126336c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f126337d;

        /* renamed from: e */
        public VCMeetingAbbrInfo f126338e;

        /* renamed from: f */
        public Boolean f126339f;

        /* renamed from: g */
        public VCMeetingAbbrInfo f126340g;

        /* renamed from: h */
        public Long f126341h;

        /* renamed from: i */
        public String f126342i;

        /* renamed from: a */
        public GetAssociatedVideoChatStatusResponse build() {
            return new GetAssociatedVideoChatStatusResponse(this.f126334a, this.f126335b, this.f126336c, this.f126337d, this.f126338e, this.f126339f, this.f126340g, this.f126341h, this.f126342i, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50607a newBuilder() {
        C50607a aVar = new C50607a();
        aVar.f126334a = this.id;
        aVar.f126335b = this.id_type;
        aVar.f126336c = Internal.copyOf("active_meeting_ids", this.active_meeting_ids);
        aVar.f126337d = this.has_active_meeting;
        aVar.f126338e = this.meeting_info;
        aVar.f126339f = this.has_active_chat_room;
        aVar.f126340g = this.chat_room_info;
        aVar.f126341h = this.seq_id;
        aVar.f126342i = this.push_sid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetAssociatedVideoChatStatusResponse");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.id_type != null) {
            sb.append(", id_type=");
            sb.append(this.id_type);
        }
        if (!this.active_meeting_ids.isEmpty()) {
            sb.append(", active_meeting_ids=");
            sb.append(this.active_meeting_ids);
        }
        if (this.has_active_meeting != null) {
            sb.append(", has_active_meeting=");
            sb.append(this.has_active_meeting);
        }
        if (this.meeting_info != null) {
            sb.append(", meeting_info=");
            sb.append(this.meeting_info);
        }
        if (this.has_active_chat_room != null) {
            sb.append(", has_active_chat_room=");
            sb.append(this.has_active_chat_room);
        }
        if (this.chat_room_info != null) {
            sb.append(", chat_room_info=");
            sb.append(this.chat_room_info);
        }
        if (this.seq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.seq_id);
        }
        if (this.push_sid != null) {
            sb.append(", push_sid=");
            sb.append(this.push_sid);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAssociatedVideoChatStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAssociatedVideoChatStatusResponse(String str, IDType iDType, List<String> list, Boolean bool, VCMeetingAbbrInfo vCMeetingAbbrInfo, Boolean bool2, VCMeetingAbbrInfo vCMeetingAbbrInfo2, Long l, String str2) {
        this(str, iDType, list, bool, vCMeetingAbbrInfo, bool2, vCMeetingAbbrInfo2, l, str2, ByteString.EMPTY);
    }

    public GetAssociatedVideoChatStatusResponse(String str, IDType iDType, List<String> list, Boolean bool, VCMeetingAbbrInfo vCMeetingAbbrInfo, Boolean bool2, VCMeetingAbbrInfo vCMeetingAbbrInfo2, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.id_type = iDType;
        this.active_meeting_ids = Internal.immutableCopyOf("active_meeting_ids", list);
        this.has_active_meeting = bool;
        this.meeting_info = vCMeetingAbbrInfo;
        this.has_active_chat_room = bool2;
        this.chat_room_info = vCMeetingAbbrInfo2;
        this.seq_id = l;
        this.push_sid = str2;
    }
}
