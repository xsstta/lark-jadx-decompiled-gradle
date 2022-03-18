package com.ss.android.lark.pb.flow;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.entities.PlatformType;
import java.io.IOException;
import okio.ByteString;

public final class GetLDRServiceAppLinkRequest extends Message<GetLDRServiceAppLinkRequest, C49756a> {
    public static final ProtoAdapter<GetLDRServiceAppLinkRequest> ADAPTER = new C49757b();
    private static final long serialVersionUID = 0;
    public final PlatformType mplatform_type;

    /* renamed from: com.ss.android.lark.pb.flow.GetLDRServiceAppLinkRequest$b */
    private static final class C49757b extends ProtoAdapter<GetLDRServiceAppLinkRequest> {
        C49757b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetLDRServiceAppLinkRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetLDRServiceAppLinkRequest getLDRServiceAppLinkRequest) {
            int i;
            if (getLDRServiceAppLinkRequest.mplatform_type != null) {
                i = PlatformType.ADAPTER.encodedSizeWithTag(1, getLDRServiceAppLinkRequest.mplatform_type);
            } else {
                i = 0;
            }
            return i + getLDRServiceAppLinkRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetLDRServiceAppLinkRequest decode(ProtoReader protoReader) throws IOException {
            C49756a aVar = new C49756a();
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
                        aVar.f124628a = PlatformType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetLDRServiceAppLinkRequest getLDRServiceAppLinkRequest) throws IOException {
            if (getLDRServiceAppLinkRequest.mplatform_type != null) {
                PlatformType.ADAPTER.encodeWithTag(protoWriter, 1, getLDRServiceAppLinkRequest.mplatform_type);
            }
            protoWriter.writeBytes(getLDRServiceAppLinkRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.flow.GetLDRServiceAppLinkRequest$a */
    public static final class C49756a extends Message.Builder<GetLDRServiceAppLinkRequest, C49756a> {

        /* renamed from: a */
        public PlatformType f124628a;

        /* renamed from: a */
        public GetLDRServiceAppLinkRequest build() {
            return new GetLDRServiceAppLinkRequest(this.f124628a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49756a mo173250a(PlatformType platformType) {
            this.f124628a = platformType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49756a newBuilder() {
        C49756a aVar = new C49756a();
        aVar.f124628a = this.mplatform_type;
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
        StringBuilder replace = sb.replace(0, 2, "GetLDRServiceAppLinkRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetLDRServiceAppLinkRequest(PlatformType platformType) {
        this(platformType, ByteString.EMPTY);
    }

    public GetLDRServiceAppLinkRequest(PlatformType platformType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mplatform_type = platformType;
    }
}
