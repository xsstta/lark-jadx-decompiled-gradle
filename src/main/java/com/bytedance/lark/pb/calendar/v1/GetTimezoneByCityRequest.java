package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetTimezoneByCityRequest extends Message<GetTimezoneByCityRequest, C15792a> {
    public static final ProtoAdapter<GetTimezoneByCityRequest> ADAPTER = new C15793b();
    private static final long serialVersionUID = 0;
    public final String city;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityRequest$b */
    private static final class C15793b extends ProtoAdapter<GetTimezoneByCityRequest> {
        C15793b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTimezoneByCityRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTimezoneByCityRequest getTimezoneByCityRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getTimezoneByCityRequest.city) + getTimezoneByCityRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTimezoneByCityRequest decode(ProtoReader protoReader) throws IOException {
            C15792a aVar = new C15792a();
            aVar.f41567a = "";
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
                    aVar.f41567a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTimezoneByCityRequest getTimezoneByCityRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTimezoneByCityRequest.city);
            protoWriter.writeBytes(getTimezoneByCityRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetTimezoneByCityRequest$a */
    public static final class C15792a extends Message.Builder<GetTimezoneByCityRequest, C15792a> {

        /* renamed from: a */
        public String f41567a;

        /* renamed from: a */
        public GetTimezoneByCityRequest build() {
            String str = this.f41567a;
            if (str != null) {
                return new GetTimezoneByCityRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "city");
        }

        /* renamed from: a */
        public C15792a mo57042a(String str) {
            this.f41567a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15792a newBuilder() {
        C15792a aVar = new C15792a();
        aVar.f41567a = this.city;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetTimezoneByCityRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", city=");
        sb.append(this.city);
        StringBuilder replace = sb.replace(0, 2, "GetTimezoneByCityRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTimezoneByCityRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetTimezoneByCityRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.city = str;
    }
}
