package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetH323AccessInfoByUniqueIDRequest extends Message<GetH323AccessInfoByUniqueIDRequest, C50322a> {
    public static final ProtoAdapter<GetH323AccessInfoByUniqueIDRequest> ADAPTER = new C50323b();
    public static final Long DEFAULT_UNIQUE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String mmeeting_number;
    public final Long munique_id;

    /* renamed from: com.ss.android.lark.pb.videochat.GetH323AccessInfoByUniqueIDRequest$b */
    private static final class C50323b extends ProtoAdapter<GetH323AccessInfoByUniqueIDRequest> {
        C50323b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetH323AccessInfoByUniqueIDRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetH323AccessInfoByUniqueIDRequest getH323AccessInfoByUniqueIDRequest) {
            int i;
            int i2 = 0;
            if (getH323AccessInfoByUniqueIDRequest.munique_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getH323AccessInfoByUniqueIDRequest.munique_id);
            } else {
                i = 0;
            }
            if (getH323AccessInfoByUniqueIDRequest.mmeeting_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getH323AccessInfoByUniqueIDRequest.mmeeting_number);
            }
            return i + i2 + getH323AccessInfoByUniqueIDRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetH323AccessInfoByUniqueIDRequest decode(ProtoReader protoReader) throws IOException {
            C50322a aVar = new C50322a();
            aVar.f125702a = 0L;
            aVar.f125703b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125702a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125703b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetH323AccessInfoByUniqueIDRequest getH323AccessInfoByUniqueIDRequest) throws IOException {
            if (getH323AccessInfoByUniqueIDRequest.munique_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getH323AccessInfoByUniqueIDRequest.munique_id);
            }
            if (getH323AccessInfoByUniqueIDRequest.mmeeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getH323AccessInfoByUniqueIDRequest.mmeeting_number);
            }
            protoWriter.writeBytes(getH323AccessInfoByUniqueIDRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetH323AccessInfoByUniqueIDRequest$a */
    public static final class C50322a extends Message.Builder<GetH323AccessInfoByUniqueIDRequest, C50322a> {

        /* renamed from: a */
        public Long f125702a;

        /* renamed from: b */
        public String f125703b;

        /* renamed from: a */
        public GetH323AccessInfoByUniqueIDRequest build() {
            return new GetH323AccessInfoByUniqueIDRequest(this.f125702a, this.f125703b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50322a mo174524a(Long l) {
            this.f125702a = l;
            return this;
        }

        /* renamed from: a */
        public C50322a mo174525a(String str) {
            this.f125703b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50322a newBuilder() {
        C50322a aVar = new C50322a();
        aVar.f125702a = this.munique_id;
        aVar.f125703b = this.mmeeting_number;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.munique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.munique_id);
        }
        if (this.mmeeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.mmeeting_number);
        }
        StringBuilder replace = sb.replace(0, 2, "GetH323AccessInfoByUniqueIDRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetH323AccessInfoByUniqueIDRequest(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public GetH323AccessInfoByUniqueIDRequest(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.munique_id = l;
        this.mmeeting_number = str;
    }
}
