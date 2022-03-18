package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SmartInboxPreviewCard extends Message<SmartInboxPreviewCard, C16988a> {
    public static final ProtoAdapter<SmartInboxPreviewCard> ADAPTER = new C16989b();
    private static final long serialVersionUID = 0;
    public final List<String> sender_names;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SmartInboxPreviewCard$b */
    private static final class C16989b extends ProtoAdapter<SmartInboxPreviewCard> {
        C16989b() {
            super(FieldEncoding.LENGTH_DELIMITED, SmartInboxPreviewCard.class);
        }

        /* renamed from: a */
        public int encodedSize(SmartInboxPreviewCard smartInboxPreviewCard) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, smartInboxPreviewCard.sender_names) + smartInboxPreviewCard.unknownFields().size();
        }

        /* renamed from: a */
        public SmartInboxPreviewCard decode(ProtoReader protoReader) throws IOException {
            C16988a aVar = new C16988a();
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
                    aVar.f43594a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SmartInboxPreviewCard smartInboxPreviewCard) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, smartInboxPreviewCard.sender_names);
            protoWriter.writeBytes(smartInboxPreviewCard.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.SmartInboxPreviewCard$a */
    public static final class C16988a extends Message.Builder<SmartInboxPreviewCard, C16988a> {

        /* renamed from: a */
        public List<String> f43594a = Internal.newMutableList();

        /* renamed from: a */
        public SmartInboxPreviewCard build() {
            return new SmartInboxPreviewCard(this.f43594a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16988a newBuilder() {
        C16988a aVar = new C16988a();
        aVar.f43594a = Internal.copyOf("sender_names", this.sender_names);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "SmartInboxPreviewCard");
        StringBuilder sb = new StringBuilder();
        if (!this.sender_names.isEmpty()) {
            sb.append(", sender_names=");
            sb.append(this.sender_names);
        }
        StringBuilder replace = sb.replace(0, 2, "SmartInboxPreviewCard{");
        replace.append('}');
        return replace.toString();
    }

    public SmartInboxPreviewCard(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public SmartInboxPreviewCard(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sender_names = Internal.immutableCopyOf("sender_names", list);
    }
}
