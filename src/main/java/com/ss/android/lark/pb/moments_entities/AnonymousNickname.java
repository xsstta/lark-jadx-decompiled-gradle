package com.ss.android.lark.pb.moments_entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AnonymousNickname extends Message<AnonymousNickname, C49954a> {
    public static final ProtoAdapter<AnonymousNickname> ADAPTER = new C49955b();
    public static final Integer DEFAULT_NICKNAME_IDX = 0;
    private static final long serialVersionUID = 0;
    public final String mnickname;
    public final String mnickname_id;
    public final Integer mnickname_idx;

    /* renamed from: com.ss.android.lark.pb.moments_entities.AnonymousNickname$b */
    private static final class C49955b extends ProtoAdapter<AnonymousNickname> {
        C49955b() {
            super(FieldEncoding.LENGTH_DELIMITED, AnonymousNickname.class);
        }

        /* renamed from: a */
        public int encodedSize(AnonymousNickname anonymousNickname) {
            int i;
            int i2;
            int i3 = 0;
            if (anonymousNickname.mnickname_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, anonymousNickname.mnickname_id);
            } else {
                i = 0;
            }
            if (anonymousNickname.mnickname != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, anonymousNickname.mnickname);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (anonymousNickname.mnickname_idx != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, anonymousNickname.mnickname_idx);
            }
            return i4 + i3 + anonymousNickname.unknownFields().size();
        }

        /* renamed from: a */
        public AnonymousNickname decode(ProtoReader protoReader) throws IOException {
            C49954a aVar = new C49954a();
            aVar.f124957a = "";
            aVar.f124958b = "";
            aVar.f124959c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124957a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124958b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124959c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AnonymousNickname anonymousNickname) throws IOException {
            if (anonymousNickname.mnickname_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anonymousNickname.mnickname_id);
            }
            if (anonymousNickname.mnickname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anonymousNickname.mnickname);
            }
            if (anonymousNickname.mnickname_idx != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, anonymousNickname.mnickname_idx);
            }
            protoWriter.writeBytes(anonymousNickname.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments_entities.AnonymousNickname$a */
    public static final class C49954a extends Message.Builder<AnonymousNickname, C49954a> {

        /* renamed from: a */
        public String f124957a;

        /* renamed from: b */
        public String f124958b;

        /* renamed from: c */
        public Integer f124959c;

        /* renamed from: a */
        public AnonymousNickname build() {
            return new AnonymousNickname(this.f124957a, this.f124958b, this.f124959c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49954a newBuilder() {
        C49954a aVar = new C49954a();
        aVar.f124957a = this.mnickname_id;
        aVar.f124958b = this.mnickname;
        aVar.f124959c = this.mnickname_idx;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mnickname_id != null) {
            sb.append(", nickname_id=");
            sb.append(this.mnickname_id);
        }
        if (this.mnickname != null) {
            sb.append(", nickname=");
            sb.append(this.mnickname);
        }
        if (this.mnickname_idx != null) {
            sb.append(", nickname_idx=");
            sb.append(this.mnickname_idx);
        }
        StringBuilder replace = sb.replace(0, 2, "AnonymousNickname{");
        replace.append('}');
        return replace.toString();
    }

    public AnonymousNickname(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public AnonymousNickname(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mnickname_id = str;
        this.mnickname = str2;
        this.mnickname_idx = num;
    }
}
