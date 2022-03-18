package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAssociatedVideoChatRequest extends Message<GetAssociatedVideoChatRequest, C50601a> {
    public static final ProtoAdapter<GetAssociatedVideoChatRequest> ADAPTER = new C50602b();
    public static final IDType DEFAULT_ID_TYPE = IDType.UNKNOWN_ID_TYPE;
    public static final Boolean DEFAULT_IS_NEED_TOPIC = false;
    private static final long serialVersionUID = 0;
    public final String id;
    public final IDType id_type;
    public final Boolean is_need_topic;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatRequest$b */
    private static final class C50602b extends ProtoAdapter<GetAssociatedVideoChatRequest> {
        C50602b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAssociatedVideoChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAssociatedVideoChatRequest getAssociatedVideoChatRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getAssociatedVideoChatRequest.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAssociatedVideoChatRequest.id);
            } else {
                i = 0;
            }
            if (getAssociatedVideoChatRequest.id_type != null) {
                i2 = IDType.ADAPTER.encodedSizeWithTag(2, getAssociatedVideoChatRequest.id_type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getAssociatedVideoChatRequest.is_need_topic != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getAssociatedVideoChatRequest.is_need_topic);
            }
            return i4 + i3 + getAssociatedVideoChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAssociatedVideoChatRequest decode(ProtoReader protoReader) throws IOException {
            C50601a aVar = new C50601a();
            aVar.f126325a = "";
            aVar.f126326b = IDType.UNKNOWN_ID_TYPE;
            aVar.f126327c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126325a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f126326b = IDType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126327c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAssociatedVideoChatRequest getAssociatedVideoChatRequest) throws IOException {
            if (getAssociatedVideoChatRequest.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAssociatedVideoChatRequest.id);
            }
            if (getAssociatedVideoChatRequest.id_type != null) {
                IDType.ADAPTER.encodeWithTag(protoWriter, 2, getAssociatedVideoChatRequest.id_type);
            }
            if (getAssociatedVideoChatRequest.is_need_topic != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getAssociatedVideoChatRequest.is_need_topic);
            }
            protoWriter.writeBytes(getAssociatedVideoChatRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatRequest$a */
    public static final class C50601a extends Message.Builder<GetAssociatedVideoChatRequest, C50601a> {

        /* renamed from: a */
        public String f126325a;

        /* renamed from: b */
        public IDType f126326b;

        /* renamed from: c */
        public Boolean f126327c;

        /* renamed from: a */
        public GetAssociatedVideoChatRequest build() {
            return new GetAssociatedVideoChatRequest(this.f126325a, this.f126326b, this.f126327c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50601a mo175169a(IDType iDType) {
            this.f126326b = iDType;
            return this;
        }

        /* renamed from: a */
        public C50601a mo175170a(Boolean bool) {
            this.f126327c = bool;
            return this;
        }

        /* renamed from: a */
        public C50601a mo175171a(String str) {
            this.f126325a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50601a newBuilder() {
        C50601a aVar = new C50601a();
        aVar.f126325a = this.id;
        aVar.f126326b = this.id_type;
        aVar.f126327c = this.is_need_topic;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetAssociatedVideoChatRequest");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.id_type != null) {
            sb.append(", id_type=");
            sb.append(this.id_type);
        }
        if (this.is_need_topic != null) {
            sb.append(", is_need_topic=");
            sb.append(this.is_need_topic);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAssociatedVideoChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAssociatedVideoChatRequest(String str, IDType iDType, Boolean bool) {
        this(str, iDType, bool, ByteString.EMPTY);
    }

    public GetAssociatedVideoChatRequest(String str, IDType iDType, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.id_type = iDType;
        this.is_need_topic = bool;
    }
}
