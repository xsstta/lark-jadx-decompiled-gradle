package com.ss.android.lark.pb.im_settings;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class IsAllowedCreateUserCustomStatusResponse extends Message<IsAllowedCreateUserCustomStatusResponse, C49807a> {
    public static final ProtoAdapter<IsAllowedCreateUserCustomStatusResponse> ADAPTER = new C49808b();
    public static final Boolean DEFAULT_IS_ALLOWED = false;
    private static final long serialVersionUID = 0;
    public final Boolean mis_allowed;

    /* renamed from: com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusResponse$b */
    private static final class C49808b extends ProtoAdapter<IsAllowedCreateUserCustomStatusResponse> {
        C49808b() {
            super(FieldEncoding.LENGTH_DELIMITED, IsAllowedCreateUserCustomStatusResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(IsAllowedCreateUserCustomStatusResponse isAllowedCreateUserCustomStatusResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, isAllowedCreateUserCustomStatusResponse.mis_allowed) + isAllowedCreateUserCustomStatusResponse.unknownFields().size();
        }

        /* renamed from: a */
        public IsAllowedCreateUserCustomStatusResponse decode(ProtoReader protoReader) throws IOException {
            C49807a aVar = new C49807a();
            aVar.f124738a = false;
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
                    aVar.f124738a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, IsAllowedCreateUserCustomStatusResponse isAllowedCreateUserCustomStatusResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, isAllowedCreateUserCustomStatusResponse.mis_allowed);
            protoWriter.writeBytes(isAllowedCreateUserCustomStatusResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusResponse$a */
    public static final class C49807a extends Message.Builder<IsAllowedCreateUserCustomStatusResponse, C49807a> {

        /* renamed from: a */
        public Boolean f124738a;

        /* renamed from: a */
        public IsAllowedCreateUserCustomStatusResponse build() {
            Boolean bool = this.f124738a;
            if (bool != null) {
                return new IsAllowedCreateUserCustomStatusResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mis_allowed");
        }
    }

    @Override // com.squareup.wire.Message
    public C49807a newBuilder() {
        C49807a aVar = new C49807a();
        aVar.f124738a = this.mis_allowed;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_allowed=");
        sb.append(this.mis_allowed);
        StringBuilder replace = sb.replace(0, 2, "IsAllowedCreateUserCustomStatusResponse{");
        replace.append('}');
        return replace.toString();
    }

    public IsAllowedCreateUserCustomStatusResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public IsAllowedCreateUserCustomStatusResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mis_allowed = bool;
    }
}
