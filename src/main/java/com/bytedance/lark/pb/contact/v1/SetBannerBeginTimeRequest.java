package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetBannerBeginTimeRequest extends Message<SetBannerBeginTimeRequest, C16384a> {
    public static final ProtoAdapter<SetBannerBeginTimeRequest> ADAPTER = new C16385b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetBannerBeginTimeRequest$b */
    private static final class C16385b extends ProtoAdapter<SetBannerBeginTimeRequest> {
        C16385b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetBannerBeginTimeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetBannerBeginTimeRequest setBannerBeginTimeRequest) {
            return setBannerBeginTimeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetBannerBeginTimeRequest decode(ProtoReader protoReader) throws IOException {
            C16384a aVar = new C16384a();
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
        public void encode(ProtoWriter protoWriter, SetBannerBeginTimeRequest setBannerBeginTimeRequest) throws IOException {
            protoWriter.writeBytes(setBannerBeginTimeRequest.unknownFields());
        }
    }

    public SetBannerBeginTimeRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetBannerBeginTimeRequest$a */
    public static final class C16384a extends Message.Builder<SetBannerBeginTimeRequest, C16384a> {
        /* renamed from: a */
        public SetBannerBeginTimeRequest build() {
            return new SetBannerBeginTimeRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16384a newBuilder() {
        C16384a aVar = new C16384a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetBannerBeginTimeRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SetBannerBeginTimeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetBannerBeginTimeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
