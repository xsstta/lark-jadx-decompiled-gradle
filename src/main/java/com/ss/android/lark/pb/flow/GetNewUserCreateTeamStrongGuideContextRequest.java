package com.ss.android.lark.pb.flow;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.entities.PlatformType;
import java.io.IOException;
import okio.ByteString;

public final class GetNewUserCreateTeamStrongGuideContextRequest extends Message<GetNewUserCreateTeamStrongGuideContextRequest, C49760a> {
    public static final ProtoAdapter<GetNewUserCreateTeamStrongGuideContextRequest> ADAPTER = new C49761b();
    private static final long serialVersionUID = 0;
    public final PlatformType mplatform_type;

    /* renamed from: com.ss.android.lark.pb.flow.GetNewUserCreateTeamStrongGuideContextRequest$b */
    private static final class C49761b extends ProtoAdapter<GetNewUserCreateTeamStrongGuideContextRequest> {
        C49761b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNewUserCreateTeamStrongGuideContextRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNewUserCreateTeamStrongGuideContextRequest getNewUserCreateTeamStrongGuideContextRequest) {
            int i;
            if (getNewUserCreateTeamStrongGuideContextRequest.mplatform_type != null) {
                i = PlatformType.ADAPTER.encodedSizeWithTag(1, getNewUserCreateTeamStrongGuideContextRequest.mplatform_type);
            } else {
                i = 0;
            }
            return i + getNewUserCreateTeamStrongGuideContextRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNewUserCreateTeamStrongGuideContextRequest decode(ProtoReader protoReader) throws IOException {
            C49760a aVar = new C49760a();
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
                    try {
                        aVar.f124638a = PlatformType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNewUserCreateTeamStrongGuideContextRequest getNewUserCreateTeamStrongGuideContextRequest) throws IOException {
            if (getNewUserCreateTeamStrongGuideContextRequest.mplatform_type != null) {
                PlatformType.ADAPTER.encodeWithTag(protoWriter, 1, getNewUserCreateTeamStrongGuideContextRequest.mplatform_type);
            }
            protoWriter.writeBytes(getNewUserCreateTeamStrongGuideContextRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.flow.GetNewUserCreateTeamStrongGuideContextRequest$a */
    public static final class C49760a extends Message.Builder<GetNewUserCreateTeamStrongGuideContextRequest, C49760a> {

        /* renamed from: a */
        public PlatformType f124638a;

        /* renamed from: a */
        public GetNewUserCreateTeamStrongGuideContextRequest build() {
            return new GetNewUserCreateTeamStrongGuideContextRequest(this.f124638a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49760a mo173259a(PlatformType platformType) {
            this.f124638a = platformType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49760a newBuilder() {
        C49760a aVar = new C49760a();
        aVar.f124638a = this.mplatform_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mplatform_type != null) {
            sb.append(", platform_type=");
            sb.append(this.mplatform_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNewUserCreateTeamStrongGuideContextRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNewUserCreateTeamStrongGuideContextRequest(PlatformType platformType) {
        this(platformType, ByteString.EMPTY);
    }

    public GetNewUserCreateTeamStrongGuideContextRequest(PlatformType platformType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mplatform_type = platformType;
    }
}
