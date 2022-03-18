package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetContactEntriesResponse extends Message<GetContactEntriesResponse, C16452a> {
    public static final ProtoAdapter<GetContactEntriesResponse> ADAPTER = new C16453b();
    private static final long serialVersionUID = 0;
    public final List<ContactEntry> entries;

    public enum Type implements WireEnum {
        Unknown(0),
        Organization(1),
        ExternalContacts(2),
        NewContacts(3),
        ChatGroups(4),
        HelpDesks(5),
        EduContacts(6),
        RelatedOrganizations(7),
        SpecialFocus(8);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return Unknown;
                case 1:
                    return Organization;
                case 2:
                    return ExternalContacts;
                case 3:
                    return NewContacts;
                case 4:
                    return ChatGroups;
                case 5:
                    return HelpDesks;
                case 6:
                    return EduContacts;
                case 7:
                    return RelatedOrganizations;
                case 8:
                    return SpecialFocus;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class ContactEntry extends Message<ContactEntry, C16450a> {
        public static final ProtoAdapter<ContactEntry> ADAPTER = new C16451b();
        public static final Boolean DEFAULT_IS_VISIBLE = true;
        public static final Type DEFAULT_TYPE = Type.Unknown;
        private static final long serialVersionUID = 0;
        public final Boolean is_visible;
        public final Type type;

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetContactEntriesResponse$ContactEntry$b */
        private static final class C16451b extends ProtoAdapter<ContactEntry> {
            C16451b() {
                super(FieldEncoding.LENGTH_DELIMITED, ContactEntry.class);
            }

            /* renamed from: a */
            public int encodedSize(ContactEntry contactEntry) {
                int i;
                int i2 = 0;
                if (contactEntry.type != null) {
                    i = Type.ADAPTER.encodedSizeWithTag(1, contactEntry.type);
                } else {
                    i = 0;
                }
                if (contactEntry.is_visible != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, contactEntry.is_visible);
                }
                return i + i2 + contactEntry.unknownFields().size();
            }

            /* renamed from: a */
            public ContactEntry decode(ProtoReader protoReader) throws IOException {
                C16450a aVar = new C16450a();
                aVar.f42746a = Type.Unknown;
                aVar.f42747b = true;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f42746a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42747b = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ContactEntry contactEntry) throws IOException {
                if (contactEntry.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, contactEntry.type);
                }
                if (contactEntry.is_visible != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, contactEntry.is_visible);
                }
                protoWriter.writeBytes(contactEntry.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.contact.v2.GetContactEntriesResponse$ContactEntry$a */
        public static final class C16450a extends Message.Builder<ContactEntry, C16450a> {

            /* renamed from: a */
            public Type f42746a;

            /* renamed from: b */
            public Boolean f42747b;

            /* renamed from: a */
            public ContactEntry build() {
                return new ContactEntry(this.f42746a, this.f42747b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16450a newBuilder() {
            C16450a aVar = new C16450a();
            aVar.f42746a = this.type;
            aVar.f42747b = this.is_visible;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("contact", "ContactEntry");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.is_visible != null) {
                sb.append(", is_visible=");
                sb.append(this.is_visible);
            }
            StringBuilder replace = sb.replace(0, 2, "ContactEntry{");
            replace.append('}');
            return replace.toString();
        }

        public ContactEntry(Type type2, Boolean bool) {
            this(type2, bool, ByteString.EMPTY);
        }

        public ContactEntry(Type type2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
            this.is_visible = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetContactEntriesResponse$b */
    private static final class C16453b extends ProtoAdapter<GetContactEntriesResponse> {
        C16453b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetContactEntriesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetContactEntriesResponse getContactEntriesResponse) {
            return ContactEntry.ADAPTER.asRepeated().encodedSizeWithTag(1, getContactEntriesResponse.entries) + getContactEntriesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetContactEntriesResponse decode(ProtoReader protoReader) throws IOException {
            C16452a aVar = new C16452a();
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
                    aVar.f42748a.add(ContactEntry.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetContactEntriesResponse getContactEntriesResponse) throws IOException {
            ContactEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getContactEntriesResponse.entries);
            protoWriter.writeBytes(getContactEntriesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetContactEntriesResponse$a */
    public static final class C16452a extends Message.Builder<GetContactEntriesResponse, C16452a> {

        /* renamed from: a */
        public List<ContactEntry> f42748a = Internal.newMutableList();

        /* renamed from: a */
        public GetContactEntriesResponse build() {
            return new GetContactEntriesResponse(this.f42748a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16452a newBuilder() {
        C16452a aVar = new C16452a();
        aVar.f42748a = Internal.copyOf("entries", this.entries);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetContactEntriesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.entries.isEmpty()) {
            sb.append(", entries=");
            sb.append(this.entries);
        }
        StringBuilder replace = sb.replace(0, 2, "GetContactEntriesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetContactEntriesResponse(List<ContactEntry> list) {
        this(list, ByteString.EMPTY);
    }

    public GetContactEntriesResponse(List<ContactEntry> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entries = Internal.immutableCopyOf("entries", list);
    }
}
