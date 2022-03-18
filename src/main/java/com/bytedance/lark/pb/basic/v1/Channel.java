package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class Channel extends Message<Channel, Builder> {
    public static final ProtoAdapter<Channel> ADAPTER = new C14748a();
    public static final Type DEFAULT_TYPE = Type.CHAT;
    private static final long serialVersionUID = 0;
    public final String id;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        CHAT(1),
        EMAIL(2),
        DOC(3),
        OPENAPP(4),
        SUBSCRIPTION(10);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return CHAT;
            }
            if (i == 2) {
                return EMAIL;
            }
            if (i == 3) {
                return DOC;
            }
            if (i == 4) {
                return OPENAPP;
            }
            if (i != 10) {
                return null;
            }
            return SUBSCRIPTION;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.Channel$a */
    private static final class C14748a extends ProtoAdapter<Channel> {
        C14748a() {
            super(FieldEncoding.LENGTH_DELIMITED, Channel.class);
        }

        /* renamed from: a */
        public int encodedSize(Channel channel) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, channel.id);
            if (channel.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(2, channel.type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + channel.unknownFields().size();
        }

        /* renamed from: a */
        public Channel decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            builder.id = "";
            builder.type = Type.CHAT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.id = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.type = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Channel channel) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, channel.id);
            if (channel.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 2, channel.type);
            }
            protoWriter.writeBytes(channel.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<Channel, Builder> {
        public String id;
        public Type type;

        @Override // com.squareup.wire.Message.Builder
        public Channel build() {
            String str = this.id;
            if (str != null) {
                return new Channel(str, this.type, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        public Builder id(String str) {
            this.id = str;
            return this;
        }

        public Builder type(Type type2) {
            this.type = type2;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.type = this.type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "Channel");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "Channel{");
        replace.append('}');
        return replace.toString();
    }

    public Channel(String str, Type type2) {
        this(str, type2, ByteString.EMPTY);
    }

    public Channel(String str, Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.type = type2;
    }
}
