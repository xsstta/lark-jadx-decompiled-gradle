package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class JudgeSecureLinkResponse extends Message<JudgeSecureLinkResponse, C17795a> {
    public static final ProtoAdapter<JudgeSecureLinkResponse> ADAPTER = new C17796b();
    public static final Boolean DEFAULT_IS_SAFE = false;
    public static final Long DEFAULT_RISK_TYPE = 0L;
    private static final long serialVersionUID = 0;
    public final Boolean is_safe;
    public final Long risk_type;

    /* renamed from: com.bytedance.lark.pb.im.v1.JudgeSecureLinkResponse$b */
    private static final class C17796b extends ProtoAdapter<JudgeSecureLinkResponse> {
        C17796b() {
            super(FieldEncoding.LENGTH_DELIMITED, JudgeSecureLinkResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(JudgeSecureLinkResponse judgeSecureLinkResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, judgeSecureLinkResponse.is_safe);
            if (judgeSecureLinkResponse.risk_type != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, judgeSecureLinkResponse.risk_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + judgeSecureLinkResponse.unknownFields().size();
        }

        /* renamed from: a */
        public JudgeSecureLinkResponse decode(ProtoReader protoReader) throws IOException {
            C17795a aVar = new C17795a();
            aVar.f44838a = false;
            aVar.f44839b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44838a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44839b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JudgeSecureLinkResponse judgeSecureLinkResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, judgeSecureLinkResponse.is_safe);
            if (judgeSecureLinkResponse.risk_type != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, judgeSecureLinkResponse.risk_type);
            }
            protoWriter.writeBytes(judgeSecureLinkResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.JudgeSecureLinkResponse$a */
    public static final class C17795a extends Message.Builder<JudgeSecureLinkResponse, C17795a> {

        /* renamed from: a */
        public Boolean f44838a;

        /* renamed from: b */
        public Long f44839b;

        /* renamed from: a */
        public JudgeSecureLinkResponse build() {
            Boolean bool = this.f44838a;
            if (bool != null) {
                return new JudgeSecureLinkResponse(bool, this.f44839b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_safe");
        }
    }

    @Override // com.squareup.wire.Message
    public C17795a newBuilder() {
        C17795a aVar = new C17795a();
        aVar.f44838a = this.is_safe;
        aVar.f44839b = this.risk_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "JudgeSecureLinkResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_safe=");
        sb.append(this.is_safe);
        if (this.risk_type != null) {
            sb.append(", risk_type=");
            sb.append(this.risk_type);
        }
        StringBuilder replace = sb.replace(0, 2, "JudgeSecureLinkResponse{");
        replace.append('}');
        return replace.toString();
    }

    public JudgeSecureLinkResponse(Boolean bool, Long l) {
        this(bool, l, ByteString.EMPTY);
    }

    public JudgeSecureLinkResponse(Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_safe = bool;
        this.risk_type = l;
    }
}
