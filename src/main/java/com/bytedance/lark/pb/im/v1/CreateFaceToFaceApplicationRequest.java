package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.LocationContent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreateFaceToFaceApplicationRequest extends Message<CreateFaceToFaceApplicationRequest, C17356a> {
    public static final ProtoAdapter<CreateFaceToFaceApplicationRequest> ADAPTER = new C17357b();
    public static final Integer DEFAULT_MATCH_CODE = 0;
    private static final long serialVersionUID = 0;
    public final LocationContent location;
    public final Integer match_code;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateFaceToFaceApplicationRequest$b */
    private static final class C17357b extends ProtoAdapter<CreateFaceToFaceApplicationRequest> {
        C17357b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateFaceToFaceApplicationRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateFaceToFaceApplicationRequest createFaceToFaceApplicationRequest) {
            return LocationContent.ADAPTER.encodedSizeWithTag(1, createFaceToFaceApplicationRequest.location) + ProtoAdapter.INT32.encodedSizeWithTag(2, createFaceToFaceApplicationRequest.match_code) + createFaceToFaceApplicationRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateFaceToFaceApplicationRequest decode(ProtoReader protoReader) throws IOException {
            C17356a aVar = new C17356a();
            aVar.f44236b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44235a = LocationContent.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44236b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateFaceToFaceApplicationRequest createFaceToFaceApplicationRequest) throws IOException {
            LocationContent.ADAPTER.encodeWithTag(protoWriter, 1, createFaceToFaceApplicationRequest.location);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, createFaceToFaceApplicationRequest.match_code);
            protoWriter.writeBytes(createFaceToFaceApplicationRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17356a newBuilder() {
        C17356a aVar = new C17356a();
        aVar.f44235a = this.location;
        aVar.f44236b = this.match_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateFaceToFaceApplicationRequest$a */
    public static final class C17356a extends Message.Builder<CreateFaceToFaceApplicationRequest, C17356a> {

        /* renamed from: a */
        public LocationContent f44235a;

        /* renamed from: b */
        public Integer f44236b;

        /* renamed from: a */
        public CreateFaceToFaceApplicationRequest build() {
            Integer num;
            LocationContent locationContent = this.f44235a;
            if (locationContent != null && (num = this.f44236b) != null) {
                return new CreateFaceToFaceApplicationRequest(locationContent, num, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(locationContent, "location", this.f44236b, "match_code");
        }

        /* renamed from: a */
        public C17356a mo60931a(LocationContent locationContent) {
            this.f44235a = locationContent;
            return this;
        }

        /* renamed from: a */
        public C17356a mo60932a(Integer num) {
            this.f44236b = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateFaceToFaceApplicationRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", match_code=");
        sb.append(this.match_code);
        StringBuilder replace = sb.replace(0, 2, "CreateFaceToFaceApplicationRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateFaceToFaceApplicationRequest(LocationContent locationContent, Integer num) {
        this(locationContent, num, ByteString.EMPTY);
    }

    public CreateFaceToFaceApplicationRequest(LocationContent locationContent, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.location = locationContent;
        this.match_code = num;
    }
}
