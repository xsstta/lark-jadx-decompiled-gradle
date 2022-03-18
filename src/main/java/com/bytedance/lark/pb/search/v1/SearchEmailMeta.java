package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Email;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SearchEmailMeta extends Message<SearchEmailMeta, C18871a> {
    public static final ProtoAdapter<SearchEmailMeta> ADAPTER = new C18872b();
    public static final Boolean DEFAULT_IS_DELAYED = false;
    public static final Integer DEFAULT_NEW_MESSAGE_COUNT = 0;
    public static final Email.Role DEFAULT_ROLE = Email.Role.TO;
    private static final long serialVersionUID = 0;
    public final String id;
    public final Boolean is_delayed;
    public final Integer new_message_count;
    public final Email.Role role;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchEmailMeta$b */
    private static final class C18872b extends ProtoAdapter<SearchEmailMeta> {
        C18872b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchEmailMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchEmailMeta searchEmailMeta) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchEmailMeta.id);
            int i3 = 0;
            if (searchEmailMeta.new_message_count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, searchEmailMeta.new_message_count);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (searchEmailMeta.role != null) {
                i2 = Email.Role.ADAPTER.encodedSizeWithTag(3, searchEmailMeta.role);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (searchEmailMeta.is_delayed != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, searchEmailMeta.is_delayed);
            }
            return i5 + i3 + searchEmailMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchEmailMeta decode(ProtoReader protoReader) throws IOException {
            C18871a aVar = new C18871a();
            aVar.f46660a = "";
            aVar.f46661b = 0;
            aVar.f46662c = Email.Role.TO;
            aVar.f46663d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46660a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46661b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f46662c = Email.Role.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46663d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchEmailMeta searchEmailMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchEmailMeta.id);
            if (searchEmailMeta.new_message_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchEmailMeta.new_message_count);
            }
            if (searchEmailMeta.role != null) {
                Email.Role.ADAPTER.encodeWithTag(protoWriter, 3, searchEmailMeta.role);
            }
            if (searchEmailMeta.is_delayed != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, searchEmailMeta.is_delayed);
            }
            protoWriter.writeBytes(searchEmailMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18871a newBuilder() {
        C18871a aVar = new C18871a();
        aVar.f46660a = this.id;
        aVar.f46661b = this.new_message_count;
        aVar.f46662c = this.role;
        aVar.f46663d = this.is_delayed;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchEmailMeta$a */
    public static final class C18871a extends Message.Builder<SearchEmailMeta, C18871a> {

        /* renamed from: a */
        public String f46660a;

        /* renamed from: b */
        public Integer f46661b;

        /* renamed from: c */
        public Email.Role f46662c;

        /* renamed from: d */
        public Boolean f46663d;

        /* renamed from: a */
        public SearchEmailMeta build() {
            String str = this.f46660a;
            if (str != null) {
                return new SearchEmailMeta(str, this.f46661b, this.f46662c, this.f46663d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchEmailMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.new_message_count != null) {
            sb.append(", new_message_count=");
            sb.append(this.new_message_count);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.is_delayed != null) {
            sb.append(", is_delayed=");
            sb.append(this.is_delayed);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchEmailMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchEmailMeta(String str, Integer num, Email.Role role2, Boolean bool) {
        this(str, num, role2, bool, ByteString.EMPTY);
    }

    public SearchEmailMeta(String str, Integer num, Email.Role role2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.new_message_count = num;
        this.role = role2;
        this.is_delayed = bool;
    }
}
