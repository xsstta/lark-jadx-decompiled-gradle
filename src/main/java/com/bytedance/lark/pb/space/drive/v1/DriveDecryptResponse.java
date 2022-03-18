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

public final class DriveDecryptResponse extends Message<DriveDecryptResponse, C19357a> {
    public static final ProtoAdapter<DriveDecryptResponse> ADAPTER = new C19358b();
    public static final ByteString DEFAULT_BODY = ByteString.EMPTY;
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final ByteString body;
    public final String error_message;
    public final Boolean success;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DriveDecryptResponse$b */
    private static final class C19358b extends ProtoAdapter<DriveDecryptResponse> {
        C19358b() {
            super(FieldEncoding.LENGTH_DELIMITED, DriveDecryptResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DriveDecryptResponse driveDecryptResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, driveDecryptResponse.success);
            int i2 = 0;
            if (driveDecryptResponse.error_message != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, driveDecryptResponse.error_message);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (driveDecryptResponse.body != null) {
                i2 = ProtoAdapter.BYTES.encodedSizeWithTag(3, driveDecryptResponse.body);
            }
            return i3 + i2 + driveDecryptResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DriveDecryptResponse decode(ProtoReader protoReader) throws IOException {
            C19357a aVar = new C19357a();
            aVar.f47588a = false;
            aVar.f47589b = "";
            aVar.f47590c = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47588a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47589b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47590c = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DriveDecryptResponse driveDecryptResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, driveDecryptResponse.success);
            if (driveDecryptResponse.error_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, driveDecryptResponse.error_message);
            }
            if (driveDecryptResponse.body != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, driveDecryptResponse.body);
            }
            protoWriter.writeBytes(driveDecryptResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19357a newBuilder() {
        C19357a aVar = new C19357a();
        aVar.f47588a = this.success;
        aVar.f47589b = this.error_message;
        aVar.f47590c = this.body;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DriveDecryptResponse$a */
    public static final class C19357a extends Message.Builder<DriveDecryptResponse, C19357a> {

        /* renamed from: a */
        public Boolean f47588a;

        /* renamed from: b */
        public String f47589b;

        /* renamed from: c */
        public ByteString f47590c;

        /* renamed from: a */
        public DriveDecryptResponse build() {
            Boolean bool = this.f47588a;
            if (bool != null) {
                return new DriveDecryptResponse(bool, this.f47589b, this.f47590c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "success");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DriveDecryptResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", success=");
        sb.append(this.success);
        if (this.error_message != null) {
            sb.append(", error_message=");
            sb.append(this.error_message);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        StringBuilder replace = sb.replace(0, 2, "DriveDecryptResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DriveDecryptResponse(Boolean bool, String str, ByteString byteString) {
        this(bool, str, byteString, ByteString.EMPTY);
    }

    public DriveDecryptResponse(Boolean bool, String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.success = bool;
        this.error_message = str;
        this.body = byteString;
    }
}
