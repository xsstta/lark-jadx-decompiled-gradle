package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAssociatedVideoChatStatusRequest extends Message<GetAssociatedVideoChatStatusRequest, C50605a> {
    public static final ProtoAdapter<GetAssociatedVideoChatStatusRequest> ADAPTER = new C50606b();
    public static final IDType DEFAULT_ID_TYPE = IDType.UNKNOWN_ID_TYPE;
    private static final long serialVersionUID = 0;
    public final String id;
    public final IDType id_type;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatStatusRequest$b */
    private static final class C50606b extends ProtoAdapter<GetAssociatedVideoChatStatusRequest> {
        C50606b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAssociatedVideoChatStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAssociatedVideoChatStatusRequest getAssociatedVideoChatStatusRequest) {
            int i;
            int i2 = 0;
            if (getAssociatedVideoChatStatusRequest.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAssociatedVideoChatStatusRequest.id);
            } else {
                i = 0;
            }
            if (getAssociatedVideoChatStatusRequest.id_type != null) {
                i2 = IDType.ADAPTER.encodedSizeWithTag(2, getAssociatedVideoChatStatusRequest.id_type);
            }
            return i + i2 + getAssociatedVideoChatStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAssociatedVideoChatStatusRequest decode(ProtoReader protoReader) throws IOException {
            C50605a aVar = new C50605a();
            aVar.f126332a = "";
            aVar.f126333b = IDType.UNKNOWN_ID_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126332a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126333b = IDType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAssociatedVideoChatStatusRequest getAssociatedVideoChatStatusRequest) throws IOException {
            if (getAssociatedVideoChatStatusRequest.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAssociatedVideoChatStatusRequest.id);
            }
            if (getAssociatedVideoChatStatusRequest.id_type != null) {
                IDType.ADAPTER.encodeWithTag(protoWriter, 2, getAssociatedVideoChatStatusRequest.id_type);
            }
            protoWriter.writeBytes(getAssociatedVideoChatStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetAssociatedVideoChatStatusRequest$a */
    public static final class C50605a extends Message.Builder<GetAssociatedVideoChatStatusRequest, C50605a> {

        /* renamed from: a */
        public String f126332a;

        /* renamed from: b */
        public IDType f126333b;

        /* renamed from: a */
        public GetAssociatedVideoChatStatusRequest build() {
            return new GetAssociatedVideoChatStatusRequest(this.f126332a, this.f126333b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50605a mo175180a(IDType iDType) {
            this.f126333b = iDType;
            return this;
        }

        /* renamed from: a */
        public C50605a mo175181a(String str) {
            this.f126332a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50605a newBuilder() {
        C50605a aVar = new C50605a();
        aVar.f126332a = this.id;
        aVar.f126333b = this.id_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetAssociatedVideoChatStatusRequest");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.id_type != null) {
            sb.append(", id_type=");
            sb.append(this.id_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAssociatedVideoChatStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAssociatedVideoChatStatusRequest(String str, IDType iDType) {
        this(str, iDType, ByteString.EMPTY);
    }

    public GetAssociatedVideoChatStatusRequest(String str, IDType iDType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.id_type = iDType;
    }
}
