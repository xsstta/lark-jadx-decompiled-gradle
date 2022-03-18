package com.google.protobuf.server;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MessageOptions extends Message<MessageOptions, C23167a> {
    public static final ProtoAdapter<MessageOptions> ADAPTER = new C23168b();
    public static final Boolean DEFAULT_DEPRECATED = false;
    public static final Boolean DEFAULT_MAP_ENTRY = false;
    public static final Boolean DEFAULT_MESSAGE_SET_WIRE_FORMAT = false;
    public static final Boolean DEFAULT_NO_STANDARD_DESCRIPTOR_ACCESSOR = false;
    private static final long serialVersionUID = 0;
    public final Boolean mdeprecated;
    public final Boolean mmap_entry;
    public final Boolean mmessage_set_wire_format;
    public final Boolean mno_standard_descriptor_accessor;
    public final List<UninterpretedOption> muninterpreted_option;

    /* renamed from: com.google.protobuf.server.MessageOptions$b */
    private static final class C23168b extends ProtoAdapter<MessageOptions> {
        C23168b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageOptions messageOptions) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (messageOptions.mmessage_set_wire_format != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, messageOptions.mmessage_set_wire_format);
            } else {
                i = 0;
            }
            if (messageOptions.mno_standard_descriptor_accessor != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, messageOptions.mno_standard_descriptor_accessor);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (messageOptions.mdeprecated != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, messageOptions.mdeprecated);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (messageOptions.mmap_entry != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, messageOptions.mmap_entry);
            }
            return i6 + i4 + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, messageOptions.muninterpreted_option) + messageOptions.unknownFields().size();
        }

        /* renamed from: a */
        public MessageOptions decode(ProtoReader protoReader) throws IOException {
            C23167a aVar = new C23167a();
            aVar.f57169a = false;
            aVar.f57170b = false;
            aVar.f57171c = false;
            aVar.f57172d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f57169a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f57170b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f57171c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 7) {
                    aVar.f57172d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f57173e.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MessageOptions messageOptions) throws IOException {
            if (messageOptions.mmessage_set_wire_format != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, messageOptions.mmessage_set_wire_format);
            }
            if (messageOptions.mno_standard_descriptor_accessor != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, messageOptions.mno_standard_descriptor_accessor);
            }
            if (messageOptions.mdeprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, messageOptions.mdeprecated);
            }
            if (messageOptions.mmap_entry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, messageOptions.mmap_entry);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, messageOptions.muninterpreted_option);
            protoWriter.writeBytes(messageOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.server.MessageOptions$a */
    public static final class C23167a extends Message.Builder<MessageOptions, C23167a> {

        /* renamed from: a */
        public Boolean f57169a;

        /* renamed from: b */
        public Boolean f57170b;

        /* renamed from: c */
        public Boolean f57171c;

        /* renamed from: d */
        public Boolean f57172d;

        /* renamed from: e */
        public List<UninterpretedOption> f57173e = Internal.newMutableList();

        /* renamed from: a */
        public MessageOptions build() {
            return new MessageOptions(this.f57169a, this.f57170b, this.f57171c, this.f57172d, this.f57173e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C23167a newBuilder() {
        C23167a aVar = new C23167a();
        aVar.f57169a = this.mmessage_set_wire_format;
        aVar.f57170b = this.mno_standard_descriptor_accessor;
        aVar.f57171c = this.mdeprecated;
        aVar.f57172d = this.mmap_entry;
        aVar.f57173e = Internal.copyOf("muninterpreted_option", this.muninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mmessage_set_wire_format != null) {
            sb.append(", message_set_wire_format=");
            sb.append(this.mmessage_set_wire_format);
        }
        if (this.mno_standard_descriptor_accessor != null) {
            sb.append(", no_standard_descriptor_accessor=");
            sb.append(this.mno_standard_descriptor_accessor);
        }
        if (this.mdeprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.mdeprecated);
        }
        if (this.mmap_entry != null) {
            sb.append(", map_entry=");
            sb.append(this.mmap_entry);
        }
        if (!this.muninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.muninterpreted_option);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageOptions{");
        replace.append('}');
        return replace.toString();
    }

    public MessageOptions(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<UninterpretedOption> list) {
        this(bool, bool2, bool3, bool4, list, ByteString.EMPTY);
    }

    public MessageOptions(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<UninterpretedOption> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmessage_set_wire_format = bool;
        this.mno_standard_descriptor_accessor = bool2;
        this.mdeprecated = bool3;
        this.mmap_entry = bool4;
        this.muninterpreted_option = Internal.immutableCopyOf("muninterpreted_option", list);
    }
}
