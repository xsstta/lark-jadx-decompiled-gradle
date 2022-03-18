package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetSIPDomainByUniqueIDRequest extends Message<GetSIPDomainByUniqueIDRequest, C50350a> {
    public static final ProtoAdapter<GetSIPDomainByUniqueIDRequest> ADAPTER = new C50351b();
    public static final Long DEFAULT_UNIQUE_ID = 0L;
    private static final long serialVersionUID = 0;
    public final String mmeeting_number;
    public final Long munique_id;

    /* renamed from: com.ss.android.lark.pb.videochat.GetSIPDomainByUniqueIDRequest$b */
    private static final class C50351b extends ProtoAdapter<GetSIPDomainByUniqueIDRequest> {
        C50351b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetSIPDomainByUniqueIDRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetSIPDomainByUniqueIDRequest getSIPDomainByUniqueIDRequest) {
            int i;
            int i2 = 0;
            if (getSIPDomainByUniqueIDRequest.munique_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getSIPDomainByUniqueIDRequest.munique_id);
            } else {
                i = 0;
            }
            if (getSIPDomainByUniqueIDRequest.mmeeting_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getSIPDomainByUniqueIDRequest.mmeeting_number);
            }
            return i + i2 + getSIPDomainByUniqueIDRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetSIPDomainByUniqueIDRequest decode(ProtoReader protoReader) throws IOException {
            C50350a aVar = new C50350a();
            aVar.f125735a = 0L;
            aVar.f125736b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125735a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125736b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetSIPDomainByUniqueIDRequest getSIPDomainByUniqueIDRequest) throws IOException {
            if (getSIPDomainByUniqueIDRequest.munique_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getSIPDomainByUniqueIDRequest.munique_id);
            }
            if (getSIPDomainByUniqueIDRequest.mmeeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getSIPDomainByUniqueIDRequest.mmeeting_number);
            }
            protoWriter.writeBytes(getSIPDomainByUniqueIDRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetSIPDomainByUniqueIDRequest$a */
    public static final class C50350a extends Message.Builder<GetSIPDomainByUniqueIDRequest, C50350a> {

        /* renamed from: a */
        public Long f125735a;

        /* renamed from: b */
        public String f125736b;

        /* renamed from: a */
        public GetSIPDomainByUniqueIDRequest build() {
            return new GetSIPDomainByUniqueIDRequest(this.f125735a, this.f125736b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50350a mo174589a(Long l) {
            this.f125735a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50350a newBuilder() {
        C50350a aVar = new C50350a();
        aVar.f125735a = this.munique_id;
        aVar.f125736b = this.mmeeting_number;
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
        StringBuilder replace = sb.replace(0, 2, "GetSIPDomainByUniqueIDRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetSIPDomainByUniqueIDRequest(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public GetSIPDomainByUniqueIDRequest(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.munique_id = l;
        this.mmeeting_number = str;
    }
}
