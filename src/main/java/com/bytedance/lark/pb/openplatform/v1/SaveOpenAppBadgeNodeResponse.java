package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SaveOpenAppBadgeNodeResponse extends Message<SaveOpenAppBadgeNodeResponse, C18701a> {
    public static final ProtoAdapter<SaveOpenAppBadgeNodeResponse> ADAPTER = new C18702b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SaveOpenAppBadgeNodeResponse$b */
    private static final class C18702b extends ProtoAdapter<SaveOpenAppBadgeNodeResponse> {
        C18702b() {
            super(FieldEncoding.LENGTH_DELIMITED, SaveOpenAppBadgeNodeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SaveOpenAppBadgeNodeResponse saveOpenAppBadgeNodeResponse) {
            return saveOpenAppBadgeNodeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SaveOpenAppBadgeNodeResponse decode(ProtoReader protoReader) throws IOException {
            C18701a aVar = new C18701a();
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
        public void encode(ProtoWriter protoWriter, SaveOpenAppBadgeNodeResponse saveOpenAppBadgeNodeResponse) throws IOException {
            protoWriter.writeBytes(saveOpenAppBadgeNodeResponse.unknownFields());
        }
    }

    public SaveOpenAppBadgeNodeResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SaveOpenAppBadgeNodeResponse$a */
    public static final class C18701a extends Message.Builder<SaveOpenAppBadgeNodeResponse, C18701a> {
        /* renamed from: a */
        public SaveOpenAppBadgeNodeResponse build() {
            return new SaveOpenAppBadgeNodeResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18701a newBuilder() {
        C18701a aVar = new C18701a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "SaveOpenAppBadgeNodeResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SaveOpenAppBadgeNodeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SaveOpenAppBadgeNodeResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
