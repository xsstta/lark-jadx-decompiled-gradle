package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreateE2EEVoiceCallRequest extends Message<CreateE2EEVoiceCallRequest, C50513a> {
    public static final ProtoAdapter<CreateE2EEVoiceCallRequest> ADAPTER = new C50514b();
    public static final Long DEFAULT_ACTION_START_TIME = 0L;
    public static final Boolean DEFAULT_BYTEDANCE_CHANNEL_AVAILABLE = false;
    public static final ByteString DEFAULT_PUBLIC_KEY = ByteString.EMPTY;
    public static final ByteString DEFAULT_RANDOM_1 = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final Long action_start_time;
    public final Boolean bytedance_channel_available;
    public final String group_id;
    public final ByteString public_key;
    public final ByteString random_1;
    public final String to_user_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceCallRequest$b */
    private static final class C50514b extends ProtoAdapter<CreateE2EEVoiceCallRequest> {
        C50514b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateE2EEVoiceCallRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateE2EEVoiceCallRequest createE2EEVoiceCallRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createE2EEVoiceCallRequest.to_user_id) + ProtoAdapter.BYTES.encodedSizeWithTag(2, createE2EEVoiceCallRequest.public_key);
            int i4 = 0;
            if (createE2EEVoiceCallRequest.random_1 != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(3, createE2EEVoiceCallRequest.random_1);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (createE2EEVoiceCallRequest.bytedance_channel_available != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, createE2EEVoiceCallRequest.bytedance_channel_available);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (createE2EEVoiceCallRequest.action_start_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(5, createE2EEVoiceCallRequest.action_start_time);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (createE2EEVoiceCallRequest.group_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, createE2EEVoiceCallRequest.group_id);
            }
            return i7 + i4 + createE2EEVoiceCallRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateE2EEVoiceCallRequest decode(ProtoReader protoReader) throws IOException {
            C50513a aVar = new C50513a();
            aVar.f126102a = "";
            aVar.f126103b = ByteString.EMPTY;
            aVar.f126104c = ByteString.EMPTY;
            aVar.f126105d = false;
            aVar.f126106e = 0L;
            aVar.f126107f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126102a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126103b = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 3:
                            aVar.f126104c = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126105d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126106e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126107f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, CreateE2EEVoiceCallRequest createE2EEVoiceCallRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createE2EEVoiceCallRequest.to_user_id);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, createE2EEVoiceCallRequest.public_key);
            if (createE2EEVoiceCallRequest.random_1 != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, createE2EEVoiceCallRequest.random_1);
            }
            if (createE2EEVoiceCallRequest.bytedance_channel_available != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, createE2EEVoiceCallRequest.bytedance_channel_available);
            }
            if (createE2EEVoiceCallRequest.action_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, createE2EEVoiceCallRequest.action_start_time);
            }
            if (createE2EEVoiceCallRequest.group_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, createE2EEVoiceCallRequest.group_id);
            }
            protoWriter.writeBytes(createE2EEVoiceCallRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.CreateE2EEVoiceCallRequest$a */
    public static final class C50513a extends Message.Builder<CreateE2EEVoiceCallRequest, C50513a> {

        /* renamed from: a */
        public String f126102a;

        /* renamed from: b */
        public ByteString f126103b;

        /* renamed from: c */
        public ByteString f126104c;

        /* renamed from: d */
        public Boolean f126105d;

        /* renamed from: e */
        public Long f126106e;

        /* renamed from: f */
        public String f126107f;

        /* renamed from: a */
        public CreateE2EEVoiceCallRequest build() {
            ByteString byteString;
            String str = this.f126102a;
            if (str != null && (byteString = this.f126103b) != null) {
                return new CreateE2EEVoiceCallRequest(str, byteString, this.f126104c, this.f126105d, this.f126106e, this.f126107f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "to_user_id", this.f126103b, "public_key");
        }

        /* renamed from: a */
        public C50513a mo174944a(Boolean bool) {
            this.f126105d = bool;
            return this;
        }

        /* renamed from: b */
        public C50513a mo174949b(String str) {
            this.f126107f = str;
            return this;
        }

        /* renamed from: a */
        public C50513a mo174945a(Long l) {
            this.f126106e = l;
            return this;
        }

        /* renamed from: a */
        public C50513a mo174946a(String str) {
            this.f126102a = str;
            return this;
        }

        /* renamed from: a */
        public C50513a mo174947a(ByteString byteString) {
            this.f126103b = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50513a newBuilder() {
        C50513a aVar = new C50513a();
        aVar.f126102a = this.to_user_id;
        aVar.f126103b = this.public_key;
        aVar.f126104c = this.random_1;
        aVar.f126105d = this.bytedance_channel_available;
        aVar.f126106e = this.action_start_time;
        aVar.f126107f = this.group_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "CreateE2EEVoiceCallRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", to_user_id=");
        sb.append(this.to_user_id);
        sb.append(", public_key=");
        sb.append(this.public_key);
        if (this.random_1 != null) {
            sb.append(", random_1=");
            sb.append(this.random_1);
        }
        if (this.bytedance_channel_available != null) {
            sb.append(", bytedance_channel_available=");
            sb.append(this.bytedance_channel_available);
        }
        if (this.action_start_time != null) {
            sb.append(", action_start_time=");
            sb.append(this.action_start_time);
        }
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateE2EEVoiceCallRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateE2EEVoiceCallRequest(String str, ByteString byteString, ByteString byteString2, Boolean bool, Long l, String str2) {
        this(str, byteString, byteString2, bool, l, str2, ByteString.EMPTY);
    }

    public CreateE2EEVoiceCallRequest(String str, ByteString byteString, ByteString byteString2, Boolean bool, Long l, String str2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.to_user_id = str;
        this.public_key = byteString;
        this.random_1 = byteString2;
        this.bytedance_channel_available = bool;
        this.action_start_time = l;
        this.group_id = str2;
    }
}
