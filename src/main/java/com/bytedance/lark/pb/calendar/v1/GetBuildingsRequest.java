package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetBuildingsRequest extends Message<GetBuildingsRequest, C15648a> {
    public static final ProtoAdapter<GetBuildingsRequest> ADAPTER = new C15649b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetBuildingsRequest$b */
    private static final class C15649b extends ProtoAdapter<GetBuildingsRequest> {
        C15649b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBuildingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBuildingsRequest getBuildingsRequest) {
            return getBuildingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetBuildingsRequest decode(ProtoReader protoReader) throws IOException {
            C15648a aVar = new C15648a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBuildingsRequest getBuildingsRequest) throws IOException {
            protoWriter.writeBytes(getBuildingsRequest.unknownFields());
        }
    }

    public GetBuildingsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetBuildingsRequest$a */
    public static final class C15648a extends Message.Builder<GetBuildingsRequest, C15648a> {
        /* renamed from: a */
        public GetBuildingsRequest build() {
            return new GetBuildingsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15648a newBuilder() {
        C15648a aVar = new C15648a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetBuildingsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetBuildingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetBuildingsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
