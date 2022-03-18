package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class E2EEVoiceCall extends Message<E2EEVoiceCall, C50533a> {
    public static final ProtoAdapter<E2EEVoiceCall> ADAPTER = new C50534b();
    public static final Long DEFAULT_ACTION_START_TIME = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_PUSH_START_TIME = 0L;
    public static final Long DEFAULT_SEQ_ID = 0L;
    public static final Status DEFAULT_STATUS = Status.CALLING;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long action_start_time;
    public final Long create_time;
    public final Extra extra;
    public final String from_device_id;
    public final String from_user_id;
    public final String id;
    public final Long push_start_time;
    public final Long seq_id;
    public final Status status;
    public final String to_device_id;
    public final String to_user_id;
    public final Map<String, String> track_info;
    public final Long update_time;

    public enum Status implements WireEnum {
        CALLING(1),
        RINGING(2),
        OCCUPIED(3),
        ACCEPTED(4),
        REFUSED(5),
        CANCELLED(6),
        UNAVAILABLE(7),
        ON_THE_CALL(8),
        TERMINATED(9),
        CLIENT_LOW_VERSION(10);
        
        public static final ProtoAdapter<Status> ADAPTER = ProtoAdapter.newEnumAdapter(Status.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Status fromValue(int i) {
            switch (i) {
                case 1:
                    return CALLING;
                case 2:
                    return RINGING;
                case 3:
                    return OCCUPIED;
                case 4:
                    return ACCEPTED;
                case 5:
                    return REFUSED;
                case 6:
                    return CANCELLED;
                case 7:
                    return UNAVAILABLE;
                case 8:
                    return ON_THE_CALL;
                case 9:
                    return TERMINATED;
                case 10:
                    return CLIENT_LOW_VERSION;
                default:
                    return null;
            }
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public static final class Extra extends Message<Extra, C50531a> {
        public static final ProtoAdapter<Extra> ADAPTER = new C50532b();
        public static final Boolean DEFAULT_IS_ENCRYPTED = true;
        public static final ByteString DEFAULT_PUBLIC_KEY = ByteString.EMPTY;
        public static final ByteString DEFAULT_RANDOM_1 = ByteString.EMPTY;
        public static final ByteString DEFAULT_RANDOM_2 = ByteString.EMPTY;
        public static final Boolean DEFAULT_USE_BYTEDANCE_CHANNEL = false;
        private static final long serialVersionUID = 0;
        public final String bytedance_channel_key;
        public final String channel_key;
        public final Boolean is_encrypted;
        public final ByteString public_key;
        public final ByteString random_1;
        public final ByteString random_2;
        public final Boolean use_bytedance_channel;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.E2EEVoiceCall$Extra$b */
        private static final class C50532b extends ProtoAdapter<Extra> {
            C50532b() {
                super(FieldEncoding.LENGTH_DELIMITED, Extra.class);
            }

            /* renamed from: a */
            public int encodedSize(Extra extra) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (extra.channel_key != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, extra.channel_key);
                } else {
                    i = 0;
                }
                if (extra.public_key != null) {
                    i2 = ProtoAdapter.BYTES.encodedSizeWithTag(2, extra.public_key);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (extra.random_1 != null) {
                    i3 = ProtoAdapter.BYTES.encodedSizeWithTag(3, extra.random_1);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (extra.random_2 != null) {
                    i4 = ProtoAdapter.BYTES.encodedSizeWithTag(4, extra.random_2);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (extra.bytedance_channel_key != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, extra.bytedance_channel_key);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (extra.use_bytedance_channel != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, extra.use_bytedance_channel);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (extra.is_encrypted != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, extra.is_encrypted);
                }
                return i12 + i7 + extra.unknownFields().size();
            }

            /* renamed from: a */
            public Extra decode(ProtoReader protoReader) throws IOException {
                C50531a aVar = new C50531a();
                aVar.f126137a = "";
                aVar.f126138b = ByteString.EMPTY;
                aVar.f126139c = ByteString.EMPTY;
                aVar.f126140d = ByteString.EMPTY;
                aVar.f126141e = "";
                aVar.f126142f = false;
                aVar.f126143g = true;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f126137a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f126138b = ProtoAdapter.BYTES.decode(protoReader);
                                break;
                            case 3:
                                aVar.f126139c = ProtoAdapter.BYTES.decode(protoReader);
                                break;
                            case 4:
                                aVar.f126140d = ProtoAdapter.BYTES.decode(protoReader);
                                break;
                            case 5:
                                aVar.f126141e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f126142f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f126143g = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, Extra extra) throws IOException {
                if (extra.channel_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, extra.channel_key);
                }
                if (extra.public_key != null) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, extra.public_key);
                }
                if (extra.random_1 != null) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, extra.random_1);
                }
                if (extra.random_2 != null) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, extra.random_2);
                }
                if (extra.bytedance_channel_key != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, extra.bytedance_channel_key);
                }
                if (extra.use_bytedance_channel != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, extra.use_bytedance_channel);
                }
                if (extra.is_encrypted != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, extra.is_encrypted);
                }
                protoWriter.writeBytes(extra.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.E2EEVoiceCall$Extra$a */
        public static final class C50531a extends Message.Builder<Extra, C50531a> {

            /* renamed from: a */
            public String f126137a;

            /* renamed from: b */
            public ByteString f126138b;

            /* renamed from: c */
            public ByteString f126139c;

            /* renamed from: d */
            public ByteString f126140d;

            /* renamed from: e */
            public String f126141e;

            /* renamed from: f */
            public Boolean f126142f;

            /* renamed from: g */
            public Boolean f126143g;

            /* renamed from: a */
            public Extra build() {
                return new Extra(this.f126137a, this.f126138b, this.f126139c, this.f126140d, this.f126141e, this.f126142f, this.f126143g, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50531a newBuilder() {
            C50531a aVar = new C50531a();
            aVar.f126137a = this.channel_key;
            aVar.f126138b = this.public_key;
            aVar.f126139c = this.random_1;
            aVar.f126140d = this.random_2;
            aVar.f126141e = this.bytedance_channel_key;
            aVar.f126142f = this.use_bytedance_channel;
            aVar.f126143g = this.is_encrypted;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Extra");
            StringBuilder sb = new StringBuilder();
            if (this.channel_key != null) {
                sb.append(", channel_key=");
                sb.append(this.channel_key);
            }
            if (this.public_key != null) {
                sb.append(", public_key=");
                sb.append(this.public_key);
            }
            if (this.random_1 != null) {
                sb.append(", random_1=");
                sb.append(this.random_1);
            }
            if (this.random_2 != null) {
                sb.append(", random_2=");
                sb.append(this.random_2);
            }
            if (this.bytedance_channel_key != null) {
                sb.append(", bytedance_channel_key=");
                sb.append(this.bytedance_channel_key);
            }
            if (this.use_bytedance_channel != null) {
                sb.append(", use_bytedance_channel=");
                sb.append(this.use_bytedance_channel);
            }
            if (this.is_encrypted != null) {
                sb.append(", is_encrypted=");
                sb.append(this.is_encrypted);
            }
            StringBuilder replace = sb.replace(0, 2, "Extra{");
            replace.append('}');
            return replace.toString();
        }

        public Extra(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2, Boolean bool, Boolean bool2) {
            this(str, byteString, byteString2, byteString3, str2, bool, bool2, ByteString.EMPTY);
        }

        public Extra(String str, ByteString byteString, ByteString byteString2, ByteString byteString3, String str2, Boolean bool, Boolean bool2, ByteString byteString4) {
            super(ADAPTER, byteString4);
            this.channel_key = str;
            this.public_key = byteString;
            this.random_1 = byteString2;
            this.random_2 = byteString3;
            this.bytedance_channel_key = str2;
            this.use_bytedance_channel = bool;
            this.is_encrypted = bool2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.E2EEVoiceCall$b */
    private static final class C50534b extends ProtoAdapter<E2EEVoiceCall> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f126157a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C50534b() {
            super(FieldEncoding.LENGTH_DELIMITED, E2EEVoiceCall.class);
        }

        /* renamed from: a */
        public int encodedSize(E2EEVoiceCall e2EEVoiceCall) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, e2EEVoiceCall.id) + Status.ADAPTER.encodedSizeWithTag(2, e2EEVoiceCall.status) + ProtoAdapter.STRING.encodedSizeWithTag(3, e2EEVoiceCall.from_user_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, e2EEVoiceCall.to_user_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, e2EEVoiceCall.create_time);
            int i7 = 0;
            if (e2EEVoiceCall.extra != null) {
                i = Extra.ADAPTER.encodedSizeWithTag(6, e2EEVoiceCall.extra);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (e2EEVoiceCall.update_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(7, e2EEVoiceCall.update_time);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (e2EEVoiceCall.action_start_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(8, e2EEVoiceCall.action_start_time);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (e2EEVoiceCall.push_start_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(9, e2EEVoiceCall.push_start_time);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (e2EEVoiceCall.from_device_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(10, e2EEVoiceCall.from_device_id);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (e2EEVoiceCall.to_device_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(11, e2EEVoiceCall.to_device_id);
            } else {
                i6 = 0;
            }
            int encodedSizeWithTag2 = i12 + i6 + this.f126157a.encodedSizeWithTag(12, e2EEVoiceCall.track_info);
            if (e2EEVoiceCall.seq_id != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(13, e2EEVoiceCall.seq_id);
            }
            return encodedSizeWithTag2 + i7 + e2EEVoiceCall.unknownFields().size();
        }

        /* renamed from: a */
        public E2EEVoiceCall decode(ProtoReader protoReader) throws IOException {
            C50533a aVar = new C50533a();
            aVar.f126144a = "";
            aVar.f126145b = Status.CALLING;
            aVar.f126146c = "";
            aVar.f126147d = "";
            aVar.f126148e = 0L;
            aVar.f126150g = 0L;
            aVar.f126151h = 0L;
            aVar.f126152i = 0L;
            aVar.f126153j = "";
            aVar.f126154k = "";
            aVar.f126156m = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126144a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f126145b = Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f126146c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126147d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126148e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126149f = Extra.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126150g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126151h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f126152i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f126153j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f126154k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f126155l.putAll(this.f126157a.decode(protoReader));
                            break;
                        case 13:
                            aVar.f126156m = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, E2EEVoiceCall e2EEVoiceCall) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, e2EEVoiceCall.id);
            Status.ADAPTER.encodeWithTag(protoWriter, 2, e2EEVoiceCall.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, e2EEVoiceCall.from_user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, e2EEVoiceCall.to_user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, e2EEVoiceCall.create_time);
            if (e2EEVoiceCall.extra != null) {
                Extra.ADAPTER.encodeWithTag(protoWriter, 6, e2EEVoiceCall.extra);
            }
            if (e2EEVoiceCall.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, e2EEVoiceCall.update_time);
            }
            if (e2EEVoiceCall.action_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, e2EEVoiceCall.action_start_time);
            }
            if (e2EEVoiceCall.push_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, e2EEVoiceCall.push_start_time);
            }
            if (e2EEVoiceCall.from_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, e2EEVoiceCall.from_device_id);
            }
            if (e2EEVoiceCall.to_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, e2EEVoiceCall.to_device_id);
            }
            this.f126157a.encodeWithTag(protoWriter, 12, e2EEVoiceCall.track_info);
            if (e2EEVoiceCall.seq_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, e2EEVoiceCall.seq_id);
            }
            protoWriter.writeBytes(e2EEVoiceCall.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.E2EEVoiceCall$a */
    public static final class C50533a extends Message.Builder<E2EEVoiceCall, C50533a> {

        /* renamed from: a */
        public String f126144a;

        /* renamed from: b */
        public Status f126145b;

        /* renamed from: c */
        public String f126146c;

        /* renamed from: d */
        public String f126147d;

        /* renamed from: e */
        public Long f126148e;

        /* renamed from: f */
        public Extra f126149f;

        /* renamed from: g */
        public Long f126150g;

        /* renamed from: h */
        public Long f126151h;

        /* renamed from: i */
        public Long f126152i;

        /* renamed from: j */
        public String f126153j;

        /* renamed from: k */
        public String f126154k;

        /* renamed from: l */
        public Map<String, String> f126155l = Internal.newMutableMap();

        /* renamed from: m */
        public Long f126156m;

        /* renamed from: a */
        public E2EEVoiceCall build() {
            Status status;
            String str;
            String str2;
            Long l;
            String str3 = this.f126144a;
            if (str3 != null && (status = this.f126145b) != null && (str = this.f126146c) != null && (str2 = this.f126147d) != null && (l = this.f126148e) != null) {
                return new E2EEVoiceCall(str3, status, str, str2, l, this.f126149f, this.f126150g, this.f126151h, this.f126152i, this.f126153j, this.f126154k, this.f126155l, this.f126156m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str3, "id", this.f126145b, UpdateKey.STATUS, this.f126146c, "from_user_id", this.f126147d, "to_user_id", this.f126148e, "create_time");
        }
    }

    @Override // com.squareup.wire.Message
    public C50533a newBuilder() {
        C50533a aVar = new C50533a();
        aVar.f126144a = this.id;
        aVar.f126145b = this.status;
        aVar.f126146c = this.from_user_id;
        aVar.f126147d = this.to_user_id;
        aVar.f126148e = this.create_time;
        aVar.f126149f = this.extra;
        aVar.f126150g = this.update_time;
        aVar.f126151h = this.action_start_time;
        aVar.f126152i = this.push_start_time;
        aVar.f126153j = this.from_device_id;
        aVar.f126154k = this.to_device_id;
        aVar.f126155l = Internal.copyOf("track_info", this.track_info);
        aVar.f126156m = this.seq_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "E2EEVoiceCall");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", from_user_id=");
        sb.append(this.from_user_id);
        sb.append(", to_user_id=");
        sb.append(this.to_user_id);
        sb.append(", create_time=");
        sb.append(this.create_time);
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.action_start_time != null) {
            sb.append(", action_start_time=");
            sb.append(this.action_start_time);
        }
        if (this.push_start_time != null) {
            sb.append(", push_start_time=");
            sb.append(this.push_start_time);
        }
        if (this.from_device_id != null) {
            sb.append(", from_device_id=");
            sb.append(this.from_device_id);
        }
        if (this.to_device_id != null) {
            sb.append(", to_device_id=");
            sb.append(this.to_device_id);
        }
        if (!this.track_info.isEmpty()) {
            sb.append(", track_info=");
            sb.append(this.track_info);
        }
        if (this.seq_id != null) {
            sb.append(", seq_id=");
            sb.append(this.seq_id);
        }
        StringBuilder replace = sb.replace(0, 2, "E2EEVoiceCall{");
        replace.append('}');
        return replace.toString();
    }

    public E2EEVoiceCall(String str, Status status2, String str2, String str3, Long l, Extra extra2, Long l2, Long l3, Long l4, String str4, String str5, Map<String, String> map, Long l5) {
        this(str, status2, str2, str3, l, extra2, l2, l3, l4, str4, str5, map, l5, ByteString.EMPTY);
    }

    public E2EEVoiceCall(String str, Status status2, String str2, String str3, Long l, Extra extra2, Long l2, Long l3, Long l4, String str4, String str5, Map<String, String> map, Long l5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.status = status2;
        this.from_user_id = str2;
        this.to_user_id = str3;
        this.create_time = l;
        this.extra = extra2;
        this.update_time = l2;
        this.action_start_time = l3;
        this.push_start_time = l4;
        this.from_device_id = str4;
        this.to_device_id = str5;
        this.track_info = Internal.immutableCopyOf("track_info", map);
        this.seq_id = l5;
    }
}
