package as_setting;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetUserASSettingResponse extends Message<GetUserASSettingResponse, C1635a> {
    public static final ProtoAdapter<GetUserASSettingResponse> ADAPTER = new C1636b();
    private static final long serialVersionUID = 0;
    public final UserASSetting setting;

    /* renamed from: as_setting.GetUserASSettingResponse$b */
    private static final class C1636b extends ProtoAdapter<GetUserASSettingResponse> {
        C1636b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserASSettingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserASSettingResponse getUserASSettingResponse) {
            return UserASSetting.ADAPTER.encodedSizeWithTag(1, getUserASSettingResponse.setting) + getUserASSettingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserASSettingResponse decode(ProtoReader protoReader) throws IOException {
            C1635a aVar = new C1635a();
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
                    aVar.f5617a = UserASSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserASSettingResponse getUserASSettingResponse) throws IOException {
            UserASSetting.ADAPTER.encodeWithTag(protoWriter, 1, getUserASSettingResponse.setting);
            protoWriter.writeBytes(getUserASSettingResponse.unknownFields());
        }
    }

    /* renamed from: as_setting.GetUserASSettingResponse$a */
    public static final class C1635a extends Message.Builder<GetUserASSettingResponse, C1635a> {

        /* renamed from: a */
        public UserASSetting f5617a;

        /* renamed from: a */
        public GetUserASSettingResponse build() {
            UserASSetting userASSetting = this.f5617a;
            if (userASSetting != null) {
                return new GetUserASSettingResponse(userASSetting, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userASSetting, "setting");
        }
    }

    @Override // com.squareup.wire.Message
    public C1635a newBuilder() {
        C1635a aVar = new C1635a();
        aVar.f5617a = this.setting;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("as_setting", "GetUserASSettingResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", setting=");
        sb.append(this.setting);
        StringBuilder replace = sb.replace(0, 2, "GetUserASSettingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserASSettingResponse(UserASSetting userASSetting) {
        this(userASSetting, ByteString.EMPTY);
    }

    public GetUserASSettingResponse(UserASSetting userASSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.setting = userASSetting;
    }
}
