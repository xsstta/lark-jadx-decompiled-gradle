package com.ss.android.lark.pb.meego;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetMeegoShowEnableRequest extends Message<GetMeegoShowEnableRequest, C49837a> {
    public static final ProtoAdapter<GetMeegoShowEnableRequest> ADAPTER = new C49838b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.meego.GetMeegoShowEnableRequest$b */
    private static final class C49838b extends ProtoAdapter<GetMeegoShowEnableRequest> {
        C49838b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMeegoShowEnableRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMeegoShowEnableRequest getMeegoShowEnableRequest) {
            return getMeegoShowEnableRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMeegoShowEnableRequest decode(ProtoReader protoReader) throws IOException {
            C49837a aVar = new C49837a();
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
        public void encode(ProtoWriter protoWriter, GetMeegoShowEnableRequest getMeegoShowEnableRequest) throws IOException {
            protoWriter.writeBytes(getMeegoShowEnableRequest.unknownFields());
        }
    }

    public GetMeegoShowEnableRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.meego.GetMeegoShowEnableRequest$a */
    public static final class C49837a extends Message.Builder<GetMeegoShowEnableRequest, C49837a> {
        /* renamed from: a */
        public GetMeegoShowEnableRequest build() {
            return new GetMeegoShowEnableRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49837a newBuilder() {
        C49837a aVar = new C49837a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetMeegoShowEnableRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMeegoShowEnableRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
