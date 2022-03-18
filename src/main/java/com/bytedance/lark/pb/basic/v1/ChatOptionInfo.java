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

public final class ChatOptionInfo extends Message<ChatOptionInfo, C14791a> {
    public static final ProtoAdapter<ChatOptionInfo> ADAPTER = new C14792b();
    public static final Boolean DEFAULT_ANNOUNCE = true;
    private static final long serialVersionUID = 0;
    public final Boolean announce;
    public final String id;

    public static final class Config extends Message<Config, C14789a> {
        public static final ProtoAdapter<Config> ADAPTER = new C14790b();
        public static final Boolean DEFAULT_ANNOUNCE = false;
        private static final long serialVersionUID = 0;
        public final Boolean announce;
        public final String id;

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatOptionInfo$Config$b */
        private static final class C14790b extends ProtoAdapter<Config> {
            C14790b() {
                super(FieldEncoding.LENGTH_DELIMITED, Config.class);
            }

            /* renamed from: a */
            public int encodedSize(Config config) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, config.id);
                if (config.announce != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(2, config.announce);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + config.unknownFields().size();
            }

            /* renamed from: a */
            public Config decode(ProtoReader protoReader) throws IOException {
                C14789a aVar = new C14789a();
                aVar.f39081a = "";
                aVar.f39082b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f39081a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f39082b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Config config) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, config.id);
                if (config.announce != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, config.announce);
                }
                protoWriter.writeBytes(config.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.basic.v1.ChatOptionInfo$Config$a */
        public static final class C14789a extends Message.Builder<Config, C14789a> {

            /* renamed from: a */
            public String f39081a;

            /* renamed from: b */
            public Boolean f39082b;

            /* renamed from: a */
            public Config build() {
                String str = this.f39081a;
                if (str != null) {
                    return new Config(str, this.f39082b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "id");
            }
        }

        @Override // com.squareup.wire.Message
        public C14789a newBuilder() {
            C14789a aVar = new C14789a();
            aVar.f39081a = this.id;
            aVar.f39082b = this.announce;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("basic", "Config");
            StringBuilder sb = new StringBuilder();
            sb.append(", id=");
            sb.append(this.id);
            if (this.announce != null) {
                sb.append(", announce=");
                sb.append(this.announce);
            }
            StringBuilder replace = sb.replace(0, 2, "Config{");
            replace.append('}');
            return replace.toString();
        }

        public Config(String str, Boolean bool) {
            this(str, bool, ByteString.EMPTY);
        }

        public Config(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.id = str;
            this.announce = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatOptionInfo$b */
    private static final class C14792b extends ProtoAdapter<ChatOptionInfo> {
        C14792b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatOptionInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatOptionInfo chatOptionInfo) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, chatOptionInfo.id);
            if (chatOptionInfo.announce != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, chatOptionInfo.announce);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + chatOptionInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ChatOptionInfo decode(ProtoReader protoReader) throws IOException {
            C14791a aVar = new C14791a();
            aVar.f39083a = "";
            aVar.f39084b = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39083a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39084b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatOptionInfo chatOptionInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatOptionInfo.id);
            if (chatOptionInfo.announce != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, chatOptionInfo.announce);
            }
            protoWriter.writeBytes(chatOptionInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ChatOptionInfo$a */
    public static final class C14791a extends Message.Builder<ChatOptionInfo, C14791a> {

        /* renamed from: a */
        public String f39083a;

        /* renamed from: b */
        public Boolean f39084b;

        /* renamed from: a */
        public ChatOptionInfo build() {
            String str = this.f39083a;
            if (str != null) {
                return new ChatOptionInfo(str, this.f39084b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C14791a newBuilder() {
        C14791a aVar = new C14791a();
        aVar.f39083a = this.id;
        aVar.f39084b = this.announce;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ChatOptionInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.announce != null) {
            sb.append(", announce=");
            sb.append(this.announce);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatOptionInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ChatOptionInfo(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public ChatOptionInfo(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.announce = bool;
    }
}
