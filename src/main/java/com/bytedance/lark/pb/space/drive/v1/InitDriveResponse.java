package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class InitDriveResponse extends Message<InitDriveResponse, C19367a> {
    public static final ProtoAdapter<InitDriveResponse> ADAPTER = new C19368b();
    public static final Boolean DEFAULT_RESULT = false;
    private static final long serialVersionUID = 0;
    public final Boolean result;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.InitDriveResponse$b */
    private static final class C19368b extends ProtoAdapter<InitDriveResponse> {
        C19368b() {
            super(FieldEncoding.LENGTH_DELIMITED, InitDriveResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(InitDriveResponse initDriveResponse) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, initDriveResponse.result) + initDriveResponse.unknownFields().size();
        }

        /* renamed from: a */
        public InitDriveResponse decode(ProtoReader protoReader) throws IOException {
            C19367a aVar = new C19367a();
            aVar.f47630a = false;
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
                    aVar.f47630a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InitDriveResponse initDriveResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, initDriveResponse.result);
            protoWriter.writeBytes(initDriveResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.InitDriveResponse$a */
    public static final class C19367a extends Message.Builder<InitDriveResponse, C19367a> {

        /* renamed from: a */
        public Boolean f47630a;

        /* renamed from: a */
        public InitDriveResponse build() {
            Boolean bool = this.f47630a;
            if (bool != null) {
                return new InitDriveResponse(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "result");
        }
    }

    @Override // com.squareup.wire.Message
    public C19367a newBuilder() {
        C19367a aVar = new C19367a();
        aVar.f47630a = this.result;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "InitDriveResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", result=");
        sb.append(this.result);
        StringBuilder replace = sb.replace(0, 2, "InitDriveResponse{");
        replace.append('}');
        return replace.toString();
    }

    public InitDriveResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public InitDriveResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.result = bool;
    }
}
