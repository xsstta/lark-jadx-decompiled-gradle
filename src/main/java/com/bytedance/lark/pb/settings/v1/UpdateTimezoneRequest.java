package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdateTimezoneRequest extends Message<UpdateTimezoneRequest, C19221a> {
    public static final ProtoAdapter<UpdateTimezoneRequest> ADAPTER = new C19222b();
    private static final long serialVersionUID = 0;
    public final String timezone;

    /* renamed from: com.bytedance.lark.pb.settings.v1.UpdateTimezoneRequest$b */
    private static final class C19222b extends ProtoAdapter<UpdateTimezoneRequest> {
        C19222b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateTimezoneRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateTimezoneRequest updateTimezoneRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateTimezoneRequest.timezone) + updateTimezoneRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateTimezoneRequest decode(ProtoReader protoReader) throws IOException {
            C19221a aVar = new C19221a();
            aVar.f47394a = "";
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
                    aVar.f47394a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateTimezoneRequest updateTimezoneRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateTimezoneRequest.timezone);
            protoWriter.writeBytes(updateTimezoneRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.UpdateTimezoneRequest$a */
    public static final class C19221a extends Message.Builder<UpdateTimezoneRequest, C19221a> {

        /* renamed from: a */
        public String f47394a;

        /* renamed from: a */
        public UpdateTimezoneRequest build() {
            String str = this.f47394a;
            if (str != null) {
                return new UpdateTimezoneRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "timezone");
        }

        /* renamed from: a */
        public C19221a mo65624a(String str) {
            this.f47394a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19221a newBuilder() {
        C19221a aVar = new C19221a();
        aVar.f47394a = this.timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "UpdateTimezoneRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", timezone=");
        sb.append(this.timezone);
        StringBuilder replace = sb.replace(0, 2, "UpdateTimezoneRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateTimezoneRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public UpdateTimezoneRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.timezone = str;
    }
}
