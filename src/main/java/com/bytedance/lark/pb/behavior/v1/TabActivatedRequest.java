package com.bytedance.lark.pb.behavior.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class TabActivatedRequest extends Message<TabActivatedRequest, C15460a> {
    public static final ProtoAdapter<TabActivatedRequest> ADAPTER = new C15461b();
    private static final long serialVersionUID = 0;
    public final String tab_key;

    /* renamed from: com.bytedance.lark.pb.behavior.v1.TabActivatedRequest$b */
    private static final class C15461b extends ProtoAdapter<TabActivatedRequest> {
        C15461b() {
            super(FieldEncoding.LENGTH_DELIMITED, TabActivatedRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TabActivatedRequest tabActivatedRequest) {
            int i;
            if (tabActivatedRequest.tab_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, tabActivatedRequest.tab_key);
            } else {
                i = 0;
            }
            return i + tabActivatedRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TabActivatedRequest decode(ProtoReader protoReader) throws IOException {
            C15460a aVar = new C15460a();
            aVar.f40916a = "";
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
                    aVar.f40916a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TabActivatedRequest tabActivatedRequest) throws IOException {
            if (tabActivatedRequest.tab_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tabActivatedRequest.tab_key);
            }
            protoWriter.writeBytes(tabActivatedRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.behavior.v1.TabActivatedRequest$a */
    public static final class C15460a extends Message.Builder<TabActivatedRequest, C15460a> {

        /* renamed from: a */
        public String f40916a;

        /* renamed from: a */
        public TabActivatedRequest build() {
            return new TabActivatedRequest(this.f40916a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15460a mo56025a(String str) {
            this.f40916a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15460a newBuilder() {
        C15460a aVar = new C15460a();
        aVar.f40916a = this.tab_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("behavior", "TabActivatedRequest");
        StringBuilder sb = new StringBuilder();
        if (this.tab_key != null) {
            sb.append(", tab_key=");
            sb.append(this.tab_key);
        }
        StringBuilder replace = sb.replace(0, 2, "TabActivatedRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TabActivatedRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public TabActivatedRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tab_key = str;
    }
}
