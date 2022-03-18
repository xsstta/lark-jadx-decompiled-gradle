package com.google.protobuf;

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

public final class MessageOptions extends Message<MessageOptions, C23078a> {
    public static final ProtoAdapter<MessageOptions> ADAPTER = new C23079b();
    public static final Boolean DEFAULT_DEPRECATED = false;
    public static final Boolean DEFAULT_MAP_ENTRY = false;
    public static final Boolean DEFAULT_MESSAGE_SET_WIRE_FORMAT = false;
    public static final Boolean DEFAULT_NO_STANDARD_DESCRIPTOR_ACCESSOR = false;
    private static final long serialVersionUID = 0;
    public final Boolean deprecated;
    public final Boolean map_entry;
    public final Boolean message_set_wire_format;
    public final Boolean no_standard_descriptor_accessor;
    public final List<UninterpretedOption> uninterpreted_option;

    /* renamed from: com.google.protobuf.MessageOptions$b */
    private static final class C23079b extends ProtoAdapter<MessageOptions> {
        C23079b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageOptions messageOptions) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (messageOptions.message_set_wire_format != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, messageOptions.message_set_wire_format);
            } else {
                i = 0;
            }
            if (messageOptions.no_standard_descriptor_accessor != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, messageOptions.no_standard_descriptor_accessor);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (messageOptions.deprecated != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, messageOptions.deprecated);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (messageOptions.map_entry != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, messageOptions.map_entry);
            }
            return i6 + i4 + UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999, messageOptions.uninterpreted_option) + messageOptions.unknownFields().size();
        }

        /* renamed from: a */
        public MessageOptions decode(ProtoReader protoReader) throws IOException {
            C23078a aVar = new C23078a();
            aVar.f56995a = false;
            aVar.f56996b = false;
            aVar.f56997c = false;
            aVar.f56998d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f56995a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f56996b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f56997c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 7) {
                    aVar.f56998d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 999) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f56999e.add(UninterpretedOption.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MessageOptions messageOptions) throws IOException {
            if (messageOptions.message_set_wire_format != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, messageOptions.message_set_wire_format);
            }
            if (messageOptions.no_standard_descriptor_accessor != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, messageOptions.no_standard_descriptor_accessor);
            }
            if (messageOptions.deprecated != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, messageOptions.deprecated);
            }
            if (messageOptions.map_entry != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, messageOptions.map_entry);
            }
            UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 999, messageOptions.uninterpreted_option);
            protoWriter.writeBytes(messageOptions.unknownFields());
        }
    }

    /* renamed from: com.google.protobuf.MessageOptions$a */
    public static final class C23078a extends Message.Builder<MessageOptions, C23078a> {

        /* renamed from: a */
        public Boolean f56995a;

        /* renamed from: b */
        public Boolean f56996b;

        /* renamed from: c */
        public Boolean f56997c;

        /* renamed from: d */
        public Boolean f56998d;

        /* renamed from: e */
        public List<UninterpretedOption> f56999e = Internal.newMutableList();

        /* renamed from: a */
        public MessageOptions build() {
            return new MessageOptions(this.f56995a, this.f56996b, this.f56997c, this.f56998d, this.f56999e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C23078a mo80177a(Boolean bool) {
            this.f56997c = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C23078a newBuilder() {
        C23078a aVar = new C23078a();
        aVar.f56995a = this.message_set_wire_format;
        aVar.f56996b = this.no_standard_descriptor_accessor;
        aVar.f56997c = this.deprecated;
        aVar.f56998d = this.map_entry;
        aVar.f56999e = Internal.copyOf("uninterpreted_option", this.uninterpreted_option);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("google", "MessageOptions");
        StringBuilder sb = new StringBuilder();
        if (this.message_set_wire_format != null) {
            sb.append(", message_set_wire_format=");
            sb.append(this.message_set_wire_format);
        }
        if (this.no_standard_descriptor_accessor != null) {
            sb.append(", no_standard_descriptor_accessor=");
            sb.append(this.no_standard_descriptor_accessor);
        }
        if (this.deprecated != null) {
            sb.append(", deprecated=");
            sb.append(this.deprecated);
        }
        if (this.map_entry != null) {
            sb.append(", map_entry=");
            sb.append(this.map_entry);
        }
        if (!this.uninterpreted_option.isEmpty()) {
            sb.append(", uninterpreted_option=");
            sb.append(this.uninterpreted_option);
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
        this.message_set_wire_format = bool;
        this.no_standard_descriptor_accessor = bool2;
        this.deprecated = bool3;
        this.map_entry = bool4;
        this.uninterpreted_option = Internal.immutableCopyOf("uninterpreted_option", list);
    }
}
