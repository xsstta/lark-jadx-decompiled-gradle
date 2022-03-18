package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserASSettingResponse extends Message<GetUserASSettingResponse, C49485a> {
    public static final ProtoAdapter<GetUserASSettingResponse> ADAPTER = new C49486b();
    private static final long serialVersionUID = 0;
    public final UserASSetting msetting;

    /* renamed from: com.ss.android.lark.pb.ai.GetUserASSettingResponse$b */
    private static final class C49486b extends ProtoAdapter<GetUserASSettingResponse> {
        C49486b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserASSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserASSettingResponse getUserASSettingResponse) {
            return UserASSetting.ADAPTER.encodedSizeWithTag(1, getUserASSettingResponse.msetting) + getUserASSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserASSettingResponse decode(ProtoReader protoReader) throws IOException {
            C49485a aVar = new C49485a();
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
                    aVar.f124079a = UserASSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserASSettingResponse getUserASSettingResponse) throws IOException {
            UserASSetting.ADAPTER.encodeWithTag(protoWriter, 1, getUserASSettingResponse.msetting);
            protoWriter.writeBytes(getUserASSettingResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.GetUserASSettingResponse$a */
    public static final class C49485a extends Message.Builder<GetUserASSettingResponse, C49485a> {

        /* renamed from: a */
        public UserASSetting f124079a;

        /* renamed from: a */
        public GetUserASSettingResponse build() {
            UserASSetting userASSetting = this.f124079a;
            if (userASSetting != null) {
                return new GetUserASSettingResponse(userASSetting, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userASSetting, "msetting");
        }
    }

    @Override // com.squareup.wire.Message
    public C49485a newBuilder() {
        C49485a aVar = new C49485a();
        aVar.f124079a = this.msetting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", setting=");
        sb.append(this.msetting);
        StringBuilder replace = sb.replace(0, 2, "GetUserASSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserASSettingResponse(UserASSetting userASSetting) {
        this(userASSetting, ByteString.EMPTY);
    }

    public GetUserASSettingResponse(UserASSetting userASSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msetting = userASSetting;
    }
}
