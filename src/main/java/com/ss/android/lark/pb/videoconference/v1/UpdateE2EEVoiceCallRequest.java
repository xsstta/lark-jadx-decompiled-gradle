package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.E2EEVoiceCall;
import java.io.IOException;
import okio.ByteString;

public final class UpdateE2EEVoiceCallRequest extends Message<UpdateE2EEVoiceCallRequest, C51126a> {
    public static final ProtoAdapter<UpdateE2EEVoiceCallRequest> ADAPTER = new C51127b();
    public static final Long DEFAULT_ACTION_START_TIME = 0L;
    public static final Boolean DEFAULT_BYTEDANCE_CHANNEL_AVAILABLE = false;
    public static final ByteString DEFAULT_PUBLIC_KEY = ByteString.EMPTY;
    public static final ByteString DEFAULT_RANDOM_2 = ByteString.EMPTY;
    public static final E2EEVoiceCall.Status DEFAULT_STATUS = E2EEVoiceCall.Status.CALLING;
    private static final long serialVersionUID = 0;
    public final Long action_start_time;
    public final Boolean bytedance_channel_available;
    public final String call_id;
    public final ByteString public_key;
    public final ByteString random_2;
    public final E2EEVoiceCall.Status status;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateE2EEVoiceCallRequest$b */
    private static final class C51127b extends ProtoAdapter<UpdateE2EEVoiceCallRequest> {
        C51127b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateE2EEVoiceCallRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateE2EEVoiceCallRequest updateE2EEVoiceCallRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, updateE2EEVoiceCallRequest.call_id) + E2EEVoiceCall.Status.ADAPTER.encodedSizeWithTag(2, updateE2EEVoiceCallRequest.status);
            int i4 = 0;
            if (updateE2EEVoiceCallRequest.random_2 != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(3, updateE2EEVoiceCallRequest.random_2);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (updateE2EEVoiceCallRequest.public_key != null) {
                i2 = ProtoAdapter.BYTES.encodedSizeWithTag(4, updateE2EEVoiceCallRequest.public_key);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (updateE2EEVoiceCallRequest.bytedance_channel_available != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, updateE2EEVoiceCallRequest.bytedance_channel_available);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (updateE2EEVoiceCallRequest.action_start_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(6, updateE2EEVoiceCallRequest.action_start_time);
            }
            return i7 + i4 + updateE2EEVoiceCallRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateE2EEVoiceCallRequest decode(ProtoReader protoReader) throws IOException {
            C51126a aVar = new C51126a();
            aVar.f127236a = "";
            aVar.f127237b = E2EEVoiceCall.Status.CALLING;
            aVar.f127238c = ByteString.EMPTY;
            aVar.f127239d = ByteString.EMPTY;
            aVar.f127240e = false;
            aVar.f127241f = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127236a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f127237b = E2EEVoiceCall.Status.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f127238c = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127239d = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127240e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127241f = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UpdateE2EEVoiceCallRequest updateE2EEVoiceCallRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateE2EEVoiceCallRequest.call_id);
            E2EEVoiceCall.Status.ADAPTER.encodeWithTag(protoWriter, 2, updateE2EEVoiceCallRequest.status);
            if (updateE2EEVoiceCallRequest.random_2 != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, updateE2EEVoiceCallRequest.random_2);
            }
            if (updateE2EEVoiceCallRequest.public_key != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, updateE2EEVoiceCallRequest.public_key);
            }
            if (updateE2EEVoiceCallRequest.bytedance_channel_available != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, updateE2EEVoiceCallRequest.bytedance_channel_available);
            }
            if (updateE2EEVoiceCallRequest.action_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, updateE2EEVoiceCallRequest.action_start_time);
            }
            protoWriter.writeBytes(updateE2EEVoiceCallRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51126a newBuilder() {
        C51126a aVar = new C51126a();
        aVar.f127236a = this.call_id;
        aVar.f127237b = this.status;
        aVar.f127238c = this.random_2;
        aVar.f127239d = this.public_key;
        aVar.f127240e = this.bytedance_channel_available;
        aVar.f127241f = this.action_start_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpdateE2EEVoiceCallRequest$a */
    public static final class C51126a extends Message.Builder<UpdateE2EEVoiceCallRequest, C51126a> {

        /* renamed from: a */
        public String f127236a;

        /* renamed from: b */
        public E2EEVoiceCall.Status f127237b;

        /* renamed from: c */
        public ByteString f127238c;

        /* renamed from: d */
        public ByteString f127239d;

        /* renamed from: e */
        public Boolean f127240e;

        /* renamed from: f */
        public Long f127241f;

        /* renamed from: a */
        public UpdateE2EEVoiceCallRequest build() {
            E2EEVoiceCall.Status status;
            String str = this.f127236a;
            if (str != null && (status = this.f127237b) != null) {
                return new UpdateE2EEVoiceCallRequest(str, status, this.f127238c, this.f127239d, this.f127240e, this.f127241f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "call_id", this.f127237b, UpdateKey.STATUS);
        }

        /* renamed from: a */
        public C51126a mo176412a(E2EEVoiceCall.Status status) {
            this.f127237b = status;
            return this;
        }

        /* renamed from: a */
        public C51126a mo176413a(Boolean bool) {
            this.f127240e = bool;
            return this;
        }

        /* renamed from: a */
        public C51126a mo176414a(Long l) {
            this.f127241f = l;
            return this;
        }

        /* renamed from: a */
        public C51126a mo176415a(String str) {
            this.f127236a = str;
            return this;
        }

        /* renamed from: a */
        public C51126a mo176416a(ByteString byteString) {
            this.f127239d = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpdateE2EEVoiceCallRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", call_id=");
        sb.append(this.call_id);
        sb.append(", status=");
        sb.append(this.status);
        if (this.random_2 != null) {
            sb.append(", random_2=");
            sb.append(this.random_2);
        }
        if (this.public_key != null) {
            sb.append(", public_key=");
            sb.append(this.public_key);
        }
        if (this.bytedance_channel_available != null) {
            sb.append(", bytedance_channel_available=");
            sb.append(this.bytedance_channel_available);
        }
        if (this.action_start_time != null) {
            sb.append(", action_start_time=");
            sb.append(this.action_start_time);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateE2EEVoiceCallRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateE2EEVoiceCallRequest(String str, E2EEVoiceCall.Status status2, ByteString byteString, ByteString byteString2, Boolean bool, Long l) {
        this(str, status2, byteString, byteString2, bool, l, ByteString.EMPTY);
    }

    public UpdateE2EEVoiceCallRequest(String str, E2EEVoiceCall.Status status2, ByteString byteString, ByteString byteString2, Boolean bool, Long l, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.call_id = str;
        this.status = status2;
        this.random_2 = byteString;
        this.public_key = byteString2;
        this.bytedance_channel_available = bool;
        this.action_start_time = l;
    }
}
