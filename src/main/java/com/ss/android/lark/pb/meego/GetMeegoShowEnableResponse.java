package com.ss.android.lark.pb.meego;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetMeegoShowEnableResponse extends Message<GetMeegoShowEnableResponse, C49839a> {
    public static final ProtoAdapter<GetMeegoShowEnableResponse> ADAPTER = new C49840b();
    public static final Boolean DEFAULT_CANSHOW = false;
    private static final long serialVersionUID = 0;
    public final Boolean mcanShow;

    /* renamed from: com.ss.android.lark.pb.meego.GetMeegoShowEnableResponse$b */
    private static final class C49840b extends ProtoAdapter<GetMeegoShowEnableResponse> {
        C49840b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeegoShowEnableResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeegoShowEnableResponse getMeegoShowEnableResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, getMeegoShowEnableResponse.mcanShow) + getMeegoShowEnableResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeegoShowEnableResponse decode(ProtoReader protoReader) throws IOException {
            C49839a aVar = new C49839a();
            aVar.f124786a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124786a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMeegoShowEnableResponse getMeegoShowEnableResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getMeegoShowEnableResponse.mcanShow);
            protoWriter.writeBytes(getMeegoShowEnableResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.meego.GetMeegoShowEnableResponse$a */
    public static final class C49839a extends Message.Builder<GetMeegoShowEnableResponse, C49839a> {

        /* renamed from: a */
        public Boolean f124786a;

        /* renamed from: a */
        public GetMeegoShowEnableResponse build() {
            Boolean bool = this.f124786a;
            if (bool != null) {
                return new GetMeegoShowEnableResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mcanShow");
        }
    }

    @Override // com.squareup.wire.Message
    public C49839a newBuilder() {
        C49839a aVar = new C49839a();
        aVar.f124786a = this.mcanShow;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", canShow=");
        sb.append(this.mcanShow);
        StringBuilder replace = sb.replace(0, 2, "GetMeegoShowEnableResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeegoShowEnableResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public GetMeegoShowEnableResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcanShow = bool;
    }
}
