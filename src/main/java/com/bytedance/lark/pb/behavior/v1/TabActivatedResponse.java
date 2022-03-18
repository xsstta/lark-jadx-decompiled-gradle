package com.bytedance.lark.pb.behavior.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TabActivatedResponse extends Message<TabActivatedResponse, C15462a> {
    public static final ProtoAdapter<TabActivatedResponse> ADAPTER = new C15463b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.behavior.v1.TabActivatedResponse$b */
    private static final class C15463b extends ProtoAdapter<TabActivatedResponse> {
        C15463b() {
            super(FieldEncoding.LENGTH_DELIMITED, TabActivatedResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(TabActivatedResponse tabActivatedResponse) {
            return tabActivatedResponse.unknownFields().size();
        }

        /* renamed from: a */
        public TabActivatedResponse decode(ProtoReader protoReader) throws IOException {
            C15462a aVar = new C15462a();
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
        public void encode(ProtoWriter protoWriter, TabActivatedResponse tabActivatedResponse) throws IOException {
            protoWriter.writeBytes(tabActivatedResponse.unknownFields());
        }
    }

    public TabActivatedResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.behavior.v1.TabActivatedResponse$a */
    public static final class C15462a extends Message.Builder<TabActivatedResponse, C15462a> {
        /* renamed from: a */
        public TabActivatedResponse build() {
            return new TabActivatedResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15462a newBuilder() {
        C15462a aVar = new C15462a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("behavior", "TabActivatedResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "TabActivatedResponse{");
        replace.append('}');
        return replace.toString();
    }

    public TabActivatedResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
