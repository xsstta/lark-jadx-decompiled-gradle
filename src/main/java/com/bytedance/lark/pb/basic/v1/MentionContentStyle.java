package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class MentionContentStyle extends Message<MentionContentStyle, C15055a> {
    public static final ProtoAdapter<MentionContentStyle> ADAPTER = new C15056b();
    public static final Boolean DEFAULT_IS_AVAILABLE = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_available;

    /* renamed from: com.bytedance.lark.pb.basic.v1.MentionContentStyle$b */
    private static final class C15056b extends ProtoAdapter<MentionContentStyle> {
        C15056b() {
            super(FieldEncoding.LENGTH_DELIMITED, MentionContentStyle.class);
        }

        /* renamed from: a */
        public int encodedSize(MentionContentStyle mentionContentStyle) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, mentionContentStyle.is_available) + mentionContentStyle.unknownFields().size();
        }

        /* renamed from: a */
        public MentionContentStyle decode(ProtoReader protoReader) throws IOException {
            C15055a aVar = new C15055a();
            aVar.f39824a = false;
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
                    aVar.f39824a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MentionContentStyle mentionContentStyle) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mentionContentStyle.is_available);
            protoWriter.writeBytes(mentionContentStyle.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.MentionContentStyle$a */
    public static final class C15055a extends Message.Builder<MentionContentStyle, C15055a> {

        /* renamed from: a */
        public Boolean f39824a;

        /* renamed from: a */
        public MentionContentStyle build() {
            Boolean bool = this.f39824a;
            if (bool != null) {
                return new MentionContentStyle(bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "is_available");
        }
    }

    @Override // com.squareup.wire.Message
    public C15055a newBuilder() {
        C15055a aVar = new C15055a();
        aVar.f39824a = this.is_available;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "MentionContentStyle");
        StringBuilder sb = new StringBuilder();
        sb.append(", is_available=");
        sb.append(this.is_available);
        StringBuilder replace = sb.replace(0, 2, "MentionContentStyle{");
        replace.append('}');
        return replace.toString();
    }

    public MentionContentStyle(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public MentionContentStyle(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_available = bool;
    }
}
