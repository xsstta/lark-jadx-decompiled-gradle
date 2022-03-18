package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ResourceContactPerson extends Message<ResourceContactPerson, C15978a> {
    public static final ProtoAdapter<ResourceContactPerson> ADAPTER = new C15979b();
    public static final ContactPersonType DEFAULT_CONTACT_PERSON_TYPE = ContactPersonType.DEFAULT;
    private static final long serialVersionUID = 0;
    public final EventCreator contact_person;
    public final ContactPersonType contact_person_type;

    public enum ContactPersonType implements WireEnum {
        DEFAULT(0),
        NO_SUBSCRIBER(1),
        RESOURCE_SUBSCRIBER(2),
        ORGANIZER(3),
        SUCCESSOR(4),
        CREATOR(5);
        
        public static final ProtoAdapter<ContactPersonType> ADAPTER = ProtoAdapter.newEnumAdapter(ContactPersonType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ContactPersonType fromValue(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return NO_SUBSCRIBER;
            }
            if (i == 2) {
                return RESOURCE_SUBSCRIBER;
            }
            if (i == 3) {
                return ORGANIZER;
            }
            if (i == 4) {
                return SUCCESSOR;
            }
            if (i != 5) {
                return null;
            }
            return CREATOR;
        }

        private ContactPersonType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ResourceContactPerson$b */
    private static final class C15979b extends ProtoAdapter<ResourceContactPerson> {
        C15979b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResourceContactPerson.class);
        }

        /* renamed from: a */
        public int encodedSize(ResourceContactPerson resourceContactPerson) {
            int i;
            int i2 = 0;
            if (resourceContactPerson.contact_person_type != null) {
                i = ContactPersonType.ADAPTER.encodedSizeWithTag(1, resourceContactPerson.contact_person_type);
            } else {
                i = 0;
            }
            if (resourceContactPerson.contact_person != null) {
                i2 = EventCreator.ADAPTER.encodedSizeWithTag(2, resourceContactPerson.contact_person);
            }
            return i + i2 + resourceContactPerson.unknownFields().size();
        }

        /* renamed from: a */
        public ResourceContactPerson decode(ProtoReader protoReader) throws IOException {
            C15978a aVar = new C15978a();
            aVar.f41979a = ContactPersonType.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f41979a = ContactPersonType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41980b = EventCreator.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResourceContactPerson resourceContactPerson) throws IOException {
            if (resourceContactPerson.contact_person_type != null) {
                ContactPersonType.ADAPTER.encodeWithTag(protoWriter, 1, resourceContactPerson.contact_person_type);
            }
            if (resourceContactPerson.contact_person != null) {
                EventCreator.ADAPTER.encodeWithTag(protoWriter, 2, resourceContactPerson.contact_person);
            }
            protoWriter.writeBytes(resourceContactPerson.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ResourceContactPerson$a */
    public static final class C15978a extends Message.Builder<ResourceContactPerson, C15978a> {

        /* renamed from: a */
        public ContactPersonType f41979a;

        /* renamed from: b */
        public EventCreator f41980b;

        /* renamed from: a */
        public ResourceContactPerson build() {
            return new ResourceContactPerson(this.f41979a, this.f41980b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15978a newBuilder() {
        C15978a aVar = new C15978a();
        aVar.f41979a = this.contact_person_type;
        aVar.f41980b = this.contact_person;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "ResourceContactPerson");
        StringBuilder sb = new StringBuilder();
        if (this.contact_person_type != null) {
            sb.append(", contact_person_type=");
            sb.append(this.contact_person_type);
        }
        if (this.contact_person != null) {
            sb.append(", contact_person=");
            sb.append(this.contact_person);
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceContactPerson{");
        replace.append('}');
        return replace.toString();
    }

    public ResourceContactPerson(ContactPersonType contactPersonType, EventCreator eventCreator) {
        this(contactPersonType, eventCreator, ByteString.EMPTY);
    }

    public ResourceContactPerson(ContactPersonType contactPersonType, EventCreator eventCreator, ByteString byteString) {
        super(ADAPTER, byteString);
        this.contact_person_type = contactPersonType;
        this.contact_person = eventCreator;
    }
}
