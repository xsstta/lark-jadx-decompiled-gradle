package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ChatSecurityConfig extends Message<ChatSecurityConfig, C49686a> {
    public static final ProtoAdapter<ChatSecurityConfig> ADAPTER = new C49687b();
    public static final Integer DEFAULT_LIMIT = 0;
    public static final Boolean DEFAULT_OPEN_SECURITY = false;
    private static final long serialVersionUID = 0;
    public final Integer mlimit;
    public final Boolean mopen_security;
    public final Read mread;

    public static final class Read extends Message<Read, C49684a> {
        public static final ProtoAdapter<Read> ADAPTER = new C49685b();
        public static final Integer DEFAULT_LIMIT = 0;
        private static final long serialVersionUID = 0;
        public final Integer mlimit;
        public final ReadShowType mread_show_type;

        public enum ReadShowType implements WireEnum {
            UNKNOWN(0),
            NO_LIMIT(1),
            TWO_COLUMN_WITH_LIMIT(2),
            ONE_COLUMN_WITH_LIMIT(3);
            
            public static final ProtoAdapter<ReadShowType> ADAPTER = ProtoAdapter.newEnumAdapter(ReadShowType.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static ReadShowType fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return NO_LIMIT;
                }
                if (i == 2) {
                    return TWO_COLUMN_WITH_LIMIT;
                }
                if (i != 3) {
                    return null;
                }
                return ONE_COLUMN_WITH_LIMIT;
            }

            private ReadShowType(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatSecurityConfig$Read$b */
        private static final class C49685b extends ProtoAdapter<Read> {
            C49685b() {
                super(FieldEncoding.LENGTH_DELIMITED, Read.class);
            }

            /* renamed from: a */
            public int encodedSize(Read read) {
                int i;
                int i2 = 0;
                if (read.mread_show_type != null) {
                    i = ReadShowType.ADAPTER.encodedSizeWithTag(1, read.mread_show_type);
                } else {
                    i = 0;
                }
                if (read.mlimit != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, read.mlimit);
                }
                return i + i2 + read.unknownFields().size();
            }

            /* renamed from: a */
            public Read decode(ProtoReader protoReader) throws IOException {
                C49684a aVar = new C49684a();
                aVar.f124406b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f124405a = ReadShowType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124406b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Read read) throws IOException {
                if (read.mread_show_type != null) {
                    ReadShowType.ADAPTER.encodeWithTag(protoWriter, 1, read.mread_show_type);
                }
                if (read.mlimit != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, read.mlimit);
                }
                protoWriter.writeBytes(read.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.entities.ChatSecurityConfig$Read$a */
        public static final class C49684a extends Message.Builder<Read, C49684a> {

            /* renamed from: a */
            public ReadShowType f124405a;

            /* renamed from: b */
            public Integer f124406b;

            /* renamed from: a */
            public Read build() {
                return new Read(this.f124405a, this.f124406b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49684a newBuilder() {
            C49684a aVar = new C49684a();
            aVar.f124405a = this.mread_show_type;
            aVar.f124406b = this.mlimit;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mread_show_type != null) {
                sb.append(", read_show_type=");
                sb.append(this.mread_show_type);
            }
            if (this.mlimit != null) {
                sb.append(", limit=");
                sb.append(this.mlimit);
            }
            StringBuilder replace = sb.replace(0, 2, "Read{");
            replace.append('}');
            return replace.toString();
        }

        public Read(ReadShowType readShowType, Integer num) {
            this(readShowType, num, ByteString.EMPTY);
        }

        public Read(ReadShowType readShowType, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mread_show_type = readShowType;
            this.mlimit = num;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ChatSecurityConfig$b */
    private static final class C49687b extends ProtoAdapter<ChatSecurityConfig> {
        C49687b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatSecurityConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatSecurityConfig chatSecurityConfig) {
            int i;
            int i2;
            int i3 = 0;
            if (chatSecurityConfig.mopen_security != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, chatSecurityConfig.mopen_security);
            } else {
                i = 0;
            }
            if (chatSecurityConfig.mlimit != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, chatSecurityConfig.mlimit);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (chatSecurityConfig.mread != null) {
                i3 = Read.ADAPTER.encodedSizeWithTag(3, chatSecurityConfig.mread);
            }
            return i4 + i3 + chatSecurityConfig.unknownFields().size();
        }

        /* renamed from: a */
        public ChatSecurityConfig decode(ProtoReader protoReader) throws IOException {
            C49686a aVar = new C49686a();
            aVar.f124407a = false;
            aVar.f124408b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124407a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124408b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124409c = Read.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ChatSecurityConfig chatSecurityConfig) throws IOException {
            if (chatSecurityConfig.mopen_security != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, chatSecurityConfig.mopen_security);
            }
            if (chatSecurityConfig.mlimit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, chatSecurityConfig.mlimit);
            }
            if (chatSecurityConfig.mread != null) {
                Read.ADAPTER.encodeWithTag(protoWriter, 3, chatSecurityConfig.mread);
            }
            protoWriter.writeBytes(chatSecurityConfig.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ChatSecurityConfig$a */
    public static final class C49686a extends Message.Builder<ChatSecurityConfig, C49686a> {

        /* renamed from: a */
        public Boolean f124407a;

        /* renamed from: b */
        public Integer f124408b;

        /* renamed from: c */
        public Read f124409c;

        /* renamed from: a */
        public ChatSecurityConfig build() {
            return new ChatSecurityConfig(this.f124407a, this.f124408b, this.f124409c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49686a newBuilder() {
        C49686a aVar = new C49686a();
        aVar.f124407a = this.mopen_security;
        aVar.f124408b = this.mlimit;
        aVar.f124409c = this.mread;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mopen_security != null) {
            sb.append(", open_security=");
            sb.append(this.mopen_security);
        }
        if (this.mlimit != null) {
            sb.append(", limit=");
            sb.append(this.mlimit);
        }
        if (this.mread != null) {
            sb.append(", read=");
            sb.append(this.mread);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatSecurityConfig{");
        replace.append('}');
        return replace.toString();
    }

    public ChatSecurityConfig(Boolean bool, Integer num, Read read) {
        this(bool, num, read, ByteString.EMPTY);
    }

    public ChatSecurityConfig(Boolean bool, Integer num, Read read, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mopen_security = bool;
        this.mlimit = num;
        this.mread = read;
    }
}
