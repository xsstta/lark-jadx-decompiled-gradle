package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatInfoExtraCommand extends Message<VideoChatInfoExtraCommand, C50425a> {
    public static final ProtoAdapter<VideoChatInfoExtraCommand> ADAPTER = new C50426b();
    private static final long serialVersionUID = 0;
    public final Type mtype;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        LEAVE_MEETING(1);
        
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
            if (i != 1) {
                return null;
            }
            return LEAVE_MEETING;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatInfoExtraCommand$b */
    private static final class C50426b extends ProtoAdapter<VideoChatInfoExtraCommand> {
        C50426b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatInfoExtraCommand.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatInfoExtraCommand videoChatInfoExtraCommand) {
            return Type.ADAPTER.encodedSizeWithTag(1, videoChatInfoExtraCommand.mtype) + videoChatInfoExtraCommand.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatInfoExtraCommand decode(ProtoReader protoReader) throws IOException {
            C50425a aVar = new C50425a();
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
                    try {
                        aVar.f125933a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatInfoExtraCommand videoChatInfoExtraCommand) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, videoChatInfoExtraCommand.mtype);
            protoWriter.writeBytes(videoChatInfoExtraCommand.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatInfoExtraCommand$a */
    public static final class C50425a extends Message.Builder<VideoChatInfoExtraCommand, C50425a> {

        /* renamed from: a */
        public Type f125933a;

        /* renamed from: a */
        public VideoChatInfoExtraCommand build() {
            Type type = this.f125933a;
            if (type != null) {
                return new VideoChatInfoExtraCommand(type, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, "mtype");
        }
    }

    @Override // com.squareup.wire.Message
    public C50425a newBuilder() {
        C50425a aVar = new C50425a();
        aVar.f125933a = this.mtype;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.mtype);
        StringBuilder replace = sb.replace(0, 2, "VideoChatInfoExtraCommand{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatInfoExtraCommand(Type type) {
        this(type, ByteString.EMPTY);
    }

    public VideoChatInfoExtraCommand(Type type, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = type;
    }
}
