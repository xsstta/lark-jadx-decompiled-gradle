package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.videoconference.v1.VideoChatInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CreateVideoChatRequest extends Message<CreateVideoChatRequest, C50521a> {
    public static final ProtoAdapter<CreateVideoChatRequest> ADAPTER = new C50522b();
    public static final Boolean DEFAULT_FORCE = false;
    public static final Boolean DEFAULT_IS_VOICE_CALL = false;
    public static final Boolean DEFAULT_PUSH_HOST = false;
    public static final Boolean DEFAULT_SHARE = false;
    public static final VideoChatInfo.Type DEFAULT_TYPE = VideoChatInfo.Type.UNKNOWN;
    public static final VideoChatInfo.VendorType DEFAULT_VENDOR_TYPE = VideoChatInfo.VendorType.UNKNOWN_VENDOR_TYPE;
    private static final long serialVersionUID = 0;
    public final ActionTime action_time;
    public final FeatureConfig feature_config;
    public final Boolean force;
    public final String group_id;
    public final ParticipantSettings host_settings;
    public final Boolean is_voice_call;
    public final VideoChatSettings meeting_settings;
    public final List<String> participant_ids;
    public final Boolean push_host;
    public final String reservation_id;
    public final List<String> room_ids;
    public final Boolean share;
    public final String topic;
    public final VideoChatInfo.Type type;
    public final VideoChatInfo.VendorType vendor_type;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateVideoChatRequest$b */
    private static final class C50522b extends ProtoAdapter<CreateVideoChatRequest> {
        C50522b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateVideoChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateVideoChatRequest createVideoChatRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, createVideoChatRequest.participant_ids) + VideoChatInfo.Type.ADAPTER.encodedSizeWithTag(2, createVideoChatRequest.type);
            int i12 = 0;
            if (createVideoChatRequest.topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, createVideoChatRequest.topic);
            } else {
                i = 0;
            }
            int i13 = encodedSizeWithTag + i;
            if (createVideoChatRequest.group_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, createVideoChatRequest.group_id);
            } else {
                i2 = 0;
            }
            int i14 = i13 + i2;
            if (createVideoChatRequest.force != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, createVideoChatRequest.force);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (createVideoChatRequest.push_host != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(6, createVideoChatRequest.push_host);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (createVideoChatRequest.share != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(7, createVideoChatRequest.share);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (createVideoChatRequest.action_time != null) {
                i6 = ActionTime.ADAPTER.encodedSizeWithTag(8, createVideoChatRequest.action_time);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (createVideoChatRequest.meeting_settings != null) {
                i7 = VideoChatSettings.ADAPTER.encodedSizeWithTag(9, createVideoChatRequest.meeting_settings);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (createVideoChatRequest.host_settings != null) {
                i8 = ParticipantSettings.ADAPTER.encodedSizeWithTag(10, createVideoChatRequest.host_settings);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (createVideoChatRequest.vendor_type != null) {
                i9 = VideoChatInfo.VendorType.ADAPTER.encodedSizeWithTag(11, createVideoChatRequest.vendor_type);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag2 = i20 + i9 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, createVideoChatRequest.room_ids);
            if (createVideoChatRequest.is_voice_call != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(13, createVideoChatRequest.is_voice_call);
            } else {
                i10 = 0;
            }
            int i21 = encodedSizeWithTag2 + i10;
            if (createVideoChatRequest.feature_config != null) {
                i11 = FeatureConfig.ADAPTER.encodedSizeWithTag(15, createVideoChatRequest.feature_config);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (createVideoChatRequest.reservation_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(16, createVideoChatRequest.reservation_id);
            }
            return i22 + i12 + createVideoChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateVideoChatRequest decode(ProtoReader protoReader) throws IOException {
            C50521a aVar = new C50521a();
            aVar.f126112b = VideoChatInfo.Type.UNKNOWN;
            aVar.f126113c = "";
            aVar.f126114d = "";
            aVar.f126115e = false;
            aVar.f126116f = false;
            aVar.f126117g = false;
            aVar.f126121k = VideoChatInfo.VendorType.UNKNOWN_VENDOR_TYPE;
            aVar.f126123m = false;
            aVar.f126125o = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126111a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            try {
                                aVar.f126112b = VideoChatInfo.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f126113c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126114d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126115e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126116f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126117g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126118h = ActionTime.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f126119i = VideoChatSettings.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f126120j = ParticipantSettings.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            try {
                                aVar.f126121k = VideoChatInfo.VendorType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126122l.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            aVar.f126123m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 15:
                            aVar.f126124n = FeatureConfig.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            aVar.f126125o = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateVideoChatRequest createVideoChatRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, createVideoChatRequest.participant_ids);
            VideoChatInfo.Type.ADAPTER.encodeWithTag(protoWriter, 2, createVideoChatRequest.type);
            if (createVideoChatRequest.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, createVideoChatRequest.topic);
            }
            if (createVideoChatRequest.group_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createVideoChatRequest.group_id);
            }
            if (createVideoChatRequest.force != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, createVideoChatRequest.force);
            }
            if (createVideoChatRequest.push_host != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, createVideoChatRequest.push_host);
            }
            if (createVideoChatRequest.share != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, createVideoChatRequest.share);
            }
            if (createVideoChatRequest.action_time != null) {
                ActionTime.ADAPTER.encodeWithTag(protoWriter, 8, createVideoChatRequest.action_time);
            }
            if (createVideoChatRequest.meeting_settings != null) {
                VideoChatSettings.ADAPTER.encodeWithTag(protoWriter, 9, createVideoChatRequest.meeting_settings);
            }
            if (createVideoChatRequest.host_settings != null) {
                ParticipantSettings.ADAPTER.encodeWithTag(protoWriter, 10, createVideoChatRequest.host_settings);
            }
            if (createVideoChatRequest.vendor_type != null) {
                VideoChatInfo.VendorType.ADAPTER.encodeWithTag(protoWriter, 11, createVideoChatRequest.vendor_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 12, createVideoChatRequest.room_ids);
            if (createVideoChatRequest.is_voice_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, createVideoChatRequest.is_voice_call);
            }
            if (createVideoChatRequest.feature_config != null) {
                FeatureConfig.ADAPTER.encodeWithTag(protoWriter, 15, createVideoChatRequest.feature_config);
            }
            if (createVideoChatRequest.reservation_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, createVideoChatRequest.reservation_id);
            }
            protoWriter.writeBytes(createVideoChatRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50521a newBuilder() {
        C50521a aVar = new C50521a();
        aVar.f126111a = Internal.copyOf("participant_ids", this.participant_ids);
        aVar.f126112b = this.type;
        aVar.f126113c = this.topic;
        aVar.f126114d = this.group_id;
        aVar.f126115e = this.force;
        aVar.f126116f = this.push_host;
        aVar.f126117g = this.share;
        aVar.f126118h = this.action_time;
        aVar.f126119i = this.meeting_settings;
        aVar.f126120j = this.host_settings;
        aVar.f126121k = this.vendor_type;
        aVar.f126122l = Internal.copyOf("room_ids", this.room_ids);
        aVar.f126123m = this.is_voice_call;
        aVar.f126124n = this.feature_config;
        aVar.f126125o = this.reservation_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CreateVideoChatRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.participant_ids.isEmpty()) {
            sb.append(", participant_ids=");
            sb.append(this.participant_ids);
        }
        sb.append(", type=");
        sb.append(this.type);
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (this.force != null) {
            sb.append(", force=");
            sb.append(this.force);
        }
        if (this.push_host != null) {
            sb.append(", push_host=");
            sb.append(this.push_host);
        }
        if (this.share != null) {
            sb.append(", share=");
            sb.append(this.share);
        }
        if (this.action_time != null) {
            sb.append(", action_time=");
            sb.append(this.action_time);
        }
        if (this.meeting_settings != null) {
            sb.append(", meeting_settings=");
            sb.append(this.meeting_settings);
        }
        if (this.host_settings != null) {
            sb.append(", host_settings=");
            sb.append(this.host_settings);
        }
        if (this.vendor_type != null) {
            sb.append(", vendor_type=");
            sb.append(this.vendor_type);
        }
        if (!this.room_ids.isEmpty()) {
            sb.append(", room_ids=");
            sb.append(this.room_ids);
        }
        if (this.is_voice_call != null) {
            sb.append(", is_voice_call=");
            sb.append(this.is_voice_call);
        }
        if (this.feature_config != null) {
            sb.append(", feature_config=");
            sb.append(this.feature_config);
        }
        if (this.reservation_id != null) {
            sb.append(", reservation_id=");
            sb.append(this.reservation_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateVideoChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateVideoChatRequest$a */
    public static final class C50521a extends Message.Builder<CreateVideoChatRequest, C50521a> {

        /* renamed from: a */
        public List<String> f126111a = Internal.newMutableList();

        /* renamed from: b */
        public VideoChatInfo.Type f126112b;

        /* renamed from: c */
        public String f126113c;

        /* renamed from: d */
        public String f126114d;

        /* renamed from: e */
        public Boolean f126115e;

        /* renamed from: f */
        public Boolean f126116f;

        /* renamed from: g */
        public Boolean f126117g;

        /* renamed from: h */
        public ActionTime f126118h;

        /* renamed from: i */
        public VideoChatSettings f126119i;

        /* renamed from: j */
        public ParticipantSettings f126120j;

        /* renamed from: k */
        public VideoChatInfo.VendorType f126121k;

        /* renamed from: l */
        public List<String> f126122l = Internal.newMutableList();

        /* renamed from: m */
        public Boolean f126123m;

        /* renamed from: n */
        public FeatureConfig f126124n;

        /* renamed from: o */
        public String f126125o;

        /* renamed from: a */
        public CreateVideoChatRequest build() {
            VideoChatInfo.Type type = this.f126112b;
            if (type != null) {
                return new CreateVideoChatRequest(this.f126111a, type, this.f126113c, this.f126114d, this.f126115e, this.f126116f, this.f126117g, this.f126118h, this.f126119i, this.f126120j, this.f126121k, this.f126122l, this.f126123m, this.f126124n, this.f126125o, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C50521a mo174966a(ActionTime actionTime) {
            this.f126118h = actionTime;
            return this;
        }

        /* renamed from: b */
        public C50521a mo174975b(Boolean bool) {
            this.f126123m = bool;
            return this;
        }

        /* renamed from: c */
        public C50521a mo174977c(String str) {
            this.f126125o = str;
            return this;
        }

        /* renamed from: a */
        public C50521a mo174967a(ParticipantSettings participantSettings) {
            this.f126120j = participantSettings;
            return this;
        }

        /* renamed from: b */
        public C50521a mo174976b(String str) {
            this.f126114d = str;
            return this;
        }

        /* renamed from: a */
        public C50521a mo174968a(VideoChatInfo.Type type) {
            this.f126112b = type;
            return this;
        }

        /* renamed from: a */
        public C50521a mo174969a(VideoChatInfo.VendorType vendorType) {
            this.f126121k = vendorType;
            return this;
        }

        /* renamed from: a */
        public C50521a mo174970a(VideoChatSettings videoChatSettings) {
            this.f126119i = videoChatSettings;
            return this;
        }

        /* renamed from: a */
        public C50521a mo174971a(Boolean bool) {
            this.f126117g = bool;
            return this;
        }

        /* renamed from: a */
        public C50521a mo174972a(String str) {
            this.f126113c = str;
            return this;
        }

        /* renamed from: a */
        public C50521a mo174973a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f126111a = list;
            return this;
        }
    }

    public CreateVideoChatRequest(List<String> list, VideoChatInfo.Type type2, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, ActionTime actionTime, VideoChatSettings videoChatSettings, ParticipantSettings participantSettings, VideoChatInfo.VendorType vendorType, List<String> list2, Boolean bool4, FeatureConfig featureConfig, String str3) {
        this(list, type2, str, str2, bool, bool2, bool3, actionTime, videoChatSettings, participantSettings, vendorType, list2, bool4, featureConfig, str3, ByteString.EMPTY);
    }

    public CreateVideoChatRequest(List<String> list, VideoChatInfo.Type type2, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, ActionTime actionTime, VideoChatSettings videoChatSettings, ParticipantSettings participantSettings, VideoChatInfo.VendorType vendorType, List<String> list2, Boolean bool4, FeatureConfig featureConfig, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participant_ids = Internal.immutableCopyOf("participant_ids", list);
        this.type = type2;
        this.topic = str;
        this.group_id = str2;
        this.force = bool;
        this.push_host = bool2;
        this.share = bool3;
        this.action_time = actionTime;
        this.meeting_settings = videoChatSettings;
        this.host_settings = participantSettings;
        this.vendor_type = vendorType;
        this.room_ids = Internal.immutableCopyOf("room_ids", list2);
        this.is_voice_call = bool4;
        this.feature_config = featureConfig;
        this.reservation_id = str3;
    }
}
