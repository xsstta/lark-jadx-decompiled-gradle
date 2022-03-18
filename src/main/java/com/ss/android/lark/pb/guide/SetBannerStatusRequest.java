package com.ss.android.lark.pb.guide;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetBannerStatusRequest extends Message<SetBannerStatusRequest, C49796a> {
    public static final ProtoAdapter<SetBannerStatusRequest> ADAPTER = new C49797b();
    private static final long serialVersionUID = 0;
    public final String mbanner_key;

    /* renamed from: com.ss.android.lark.pb.guide.SetBannerStatusRequest$b */
    private static final class C49797b extends ProtoAdapter<SetBannerStatusRequest> {
        C49797b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetBannerStatusRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetBannerStatusRequest setBannerStatusRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, setBannerStatusRequest.mbanner_key) + setBannerStatusRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetBannerStatusRequest decode(ProtoReader protoReader) throws IOException {
            C49796a aVar = new C49796a();
            aVar.f124728a = "";
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
                    aVar.f124728a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetBannerStatusRequest setBannerStatusRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setBannerStatusRequest.mbanner_key);
            protoWriter.writeBytes(setBannerStatusRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.guide.SetBannerStatusRequest$a */
    public static final class C49796a extends Message.Builder<SetBannerStatusRequest, C49796a> {

        /* renamed from: a */
        public String f124728a;

        /* renamed from: a */
        public SetBannerStatusRequest build() {
            String str = this.f124728a;
            if (str != null) {
                return new SetBannerStatusRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mbanner_key");
        }

        /* renamed from: a */
        public C49796a mo173337a(String str) {
            this.f124728a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49796a newBuilder() {
        C49796a aVar = new C49796a();
        aVar.f124728a = this.mbanner_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", banner_key=");
        sb.append(this.mbanner_key);
        StringBuilder replace = sb.replace(0, 2, "SetBannerStatusRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetBannerStatusRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SetBannerStatusRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbanner_key = str;
    }
}
