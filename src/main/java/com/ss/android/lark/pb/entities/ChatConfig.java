package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ChatConfig extends Message<ChatConfig, C49656a> {
    public static final ProtoAdapter<ChatConfig> ADAPTER = new C49657b();
    public static final Boolean DEFAULT_CHATABLE = true;
    public static final Boolean DEFAULT_IN_TOTAL_BADGE = true;
    public static final Boolean DEFAULT_MUTEABLE = true;
    private static final long serialVersionUID = 0;
    public final Boolean mchatable;
    public final Boolean min_total_badge;
    public final Boolean mmuteable;

    /* renamed from: com.ss.android.lark.pb.entities.ChatConfig$b */
    private static final class C49657b extends ProtoAdapter<ChatConfig> {
        C49657b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatConfig chatConfig) {
            int i;
            int i2;
            int i3 = 0;
            if (chatConfig.mchatable != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, chatConfig.mchatable);
            } else {
                i = 0;
            }
            if (chatConfig.mmuteable != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, chatConfig.mmuteable);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (chatConfig.min_total_badge != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, chatConfig.min_total_badge);
            }
            return i4 + i3 + chatConfig.unknownFields().size();
        }

        /* renamed from: a */
        public ChatConfig decode(ProtoReader protoReader) throws IOException {
            C49656a aVar = new C49656a();
            aVar.f124387a = true;
            aVar.f124388b = true;
            aVar.f124389c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124387a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124388b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124389c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatConfig chatConfig) throws IOException {
            if (chatConfig.mchatable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, chatConfig.mchatable);
            }
            if (chatConfig.mmuteable != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, chatConfig.mmuteable);
            }
            if (chatConfig.min_total_badge != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, chatConfig.min_total_badge);
            }
            protoWriter.writeBytes(chatConfig.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ChatConfig$a */
    public static final class C49656a extends Message.Builder<ChatConfig, C49656a> {

        /* renamed from: a */
        public Boolean f124387a;

        /* renamed from: b */
        public Boolean f124388b;

        /* renamed from: c */
        public Boolean f124389c;

        /* renamed from: a */
        public ChatConfig build() {
            return new ChatConfig(this.f124387a, this.f124388b, this.f124389c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49656a newBuilder() {
        C49656a aVar = new C49656a();
        aVar.f124387a = this.mchatable;
        aVar.f124388b = this.mmuteable;
        aVar.f124389c = this.min_total_badge;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mchatable != null) {
            sb.append(", chatable=");
            sb.append(this.mchatable);
        }
        if (this.mmuteable != null) {
            sb.append(", muteable=");
            sb.append(this.mmuteable);
        }
        if (this.min_total_badge != null) {
            sb.append(", in_total_badge=");
            sb.append(this.min_total_badge);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatConfig{");
        replace.append('}');
        return replace.toString();
    }

    public ChatConfig(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public ChatConfig(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchatable = bool;
        this.mmuteable = bool2;
        this.min_total_badge = bool3;
    }
}
