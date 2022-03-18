package com.ss.android.lark.pb.im_settings;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class IsAllowedCreateUserCustomStatusRequest extends Message<IsAllowedCreateUserCustomStatusRequest, C49805a> {
    public static final ProtoAdapter<IsAllowedCreateUserCustomStatusRequest> ADAPTER = new C49806b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusRequest$b */
    private static final class C49806b extends ProtoAdapter<IsAllowedCreateUserCustomStatusRequest> {
        C49806b() {
            super(FieldEncoding.LENGTH_DELIMITED, IsAllowedCreateUserCustomStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(IsAllowedCreateUserCustomStatusRequest isAllowedCreateUserCustomStatusRequest) {
            return isAllowedCreateUserCustomStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public IsAllowedCreateUserCustomStatusRequest decode(ProtoReader protoReader) throws IOException {
            C49805a aVar = new C49805a();
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
        public void encode(ProtoWriter protoWriter, IsAllowedCreateUserCustomStatusRequest isAllowedCreateUserCustomStatusRequest) throws IOException {
            protoWriter.writeBytes(isAllowedCreateUserCustomStatusRequest.unknownFields());
        }
    }

    public IsAllowedCreateUserCustomStatusRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.im_settings.IsAllowedCreateUserCustomStatusRequest$a */
    public static final class C49805a extends Message.Builder<IsAllowedCreateUserCustomStatusRequest, C49805a> {
        /* renamed from: a */
        public IsAllowedCreateUserCustomStatusRequest build() {
            return new IsAllowedCreateUserCustomStatusRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49805a newBuilder() {
        C49805a aVar = new C49805a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "IsAllowedCreateUserCustomStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public IsAllowedCreateUserCustomStatusRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
