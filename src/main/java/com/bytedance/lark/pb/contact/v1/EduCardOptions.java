package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class EduCardOptions extends Message<EduCardOptions, C16168a> {
    public static final ProtoAdapter<EduCardOptions> ADAPTER = new C16169b();
    public static final InvitationSource DEFAULT_INVITATION_SOURCE = InvitationSource.AddressBook;
    private static final long serialVersionUID = 0;
    public final String department_id;
    public final InvitationSource invitation_source;

    public enum InvitationSource implements WireEnum {
        AddressBook(0),
        Group(1);
        
        public static final ProtoAdapter<InvitationSource> ADAPTER = ProtoAdapter.newEnumAdapter(InvitationSource.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static InvitationSource fromValue(int i) {
            if (i == 0) {
                return AddressBook;
            }
            if (i != 1) {
                return null;
            }
            return Group;
        }

        private InvitationSource(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.EduCardOptions$b */
    private static final class C16169b extends ProtoAdapter<EduCardOptions> {
        C16169b() {
            super(FieldEncoding.LENGTH_DELIMITED, EduCardOptions.class);
        }

        /* renamed from: a */
        public int encodedSize(EduCardOptions eduCardOptions) {
            int i;
            int i2 = 0;
            if (eduCardOptions.department_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, eduCardOptions.department_id);
            } else {
                i = 0;
            }
            if (eduCardOptions.invitation_source != null) {
                i2 = InvitationSource.ADAPTER.encodedSizeWithTag(2, eduCardOptions.invitation_source);
            }
            return i + i2 + eduCardOptions.unknownFields().size();
        }

        /* renamed from: a */
        public EduCardOptions decode(ProtoReader protoReader) throws IOException {
            C16168a aVar = new C16168a();
            aVar.f42292a = "";
            aVar.f42293b = InvitationSource.AddressBook;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42292a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42293b = InvitationSource.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EduCardOptions eduCardOptions) throws IOException {
            if (eduCardOptions.department_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, eduCardOptions.department_id);
            }
            if (eduCardOptions.invitation_source != null) {
                InvitationSource.ADAPTER.encodeWithTag(protoWriter, 2, eduCardOptions.invitation_source);
            }
            protoWriter.writeBytes(eduCardOptions.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.EduCardOptions$a */
    public static final class C16168a extends Message.Builder<EduCardOptions, C16168a> {

        /* renamed from: a */
        public String f42292a;

        /* renamed from: b */
        public InvitationSource f42293b;

        /* renamed from: a */
        public EduCardOptions build() {
            return new EduCardOptions(this.f42292a, this.f42293b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16168a mo58003a(InvitationSource invitationSource) {
            this.f42293b = invitationSource;
            return this;
        }

        /* renamed from: a */
        public C16168a mo58004a(String str) {
            this.f42292a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16168a newBuilder() {
        C16168a aVar = new C16168a();
        aVar.f42292a = this.department_id;
        aVar.f42293b = this.invitation_source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "EduCardOptions");
        StringBuilder sb = new StringBuilder();
        if (this.department_id != null) {
            sb.append(", department_id=");
            sb.append(this.department_id);
        }
        if (this.invitation_source != null) {
            sb.append(", invitation_source=");
            sb.append(this.invitation_source);
        }
        StringBuilder replace = sb.replace(0, 2, "EduCardOptions{");
        replace.append('}');
        return replace.toString();
    }

    public EduCardOptions(String str, InvitationSource invitationSource) {
        this(str, invitationSource, ByteString.EMPTY);
    }

    public EduCardOptions(String str, InvitationSource invitationSource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_id = str;
        this.invitation_source = invitationSource;
    }
}
