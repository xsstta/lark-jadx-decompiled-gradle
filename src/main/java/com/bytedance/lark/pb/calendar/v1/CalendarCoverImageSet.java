package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CalendarCoverImageSet extends Message<CalendarCoverImageSet, C15514a> {
    public static final ProtoAdapter<CalendarCoverImageSet> ADAPTER = new C15515b();
    private static final long serialVersionUID = 0;
    public final String key;
    public final Image middle;
    public final Image origin;
    public final Image thumb;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarCoverImageSet$b */
    private static final class C15515b extends ProtoAdapter<CalendarCoverImageSet> {
        C15515b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarCoverImageSet.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarCoverImageSet calendarCoverImageSet) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (calendarCoverImageSet.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarCoverImageSet.key);
            } else {
                i = 0;
            }
            if (calendarCoverImageSet.thumb != null) {
                i2 = Image.ADAPTER.encodedSizeWithTag(2, calendarCoverImageSet.thumb);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (calendarCoverImageSet.middle != null) {
                i3 = Image.ADAPTER.encodedSizeWithTag(3, calendarCoverImageSet.middle);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (calendarCoverImageSet.origin != null) {
                i4 = Image.ADAPTER.encodedSizeWithTag(4, calendarCoverImageSet.origin);
            }
            return i6 + i4 + calendarCoverImageSet.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarCoverImageSet decode(ProtoReader protoReader) throws IOException {
            C15514a aVar = new C15514a();
            aVar.f41035a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41035a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41036b = Image.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41037c = Image.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41038d = Image.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarCoverImageSet calendarCoverImageSet) throws IOException {
            if (calendarCoverImageSet.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarCoverImageSet.key);
            }
            if (calendarCoverImageSet.thumb != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 2, calendarCoverImageSet.thumb);
            }
            if (calendarCoverImageSet.middle != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 3, calendarCoverImageSet.middle);
            }
            if (calendarCoverImageSet.origin != null) {
                Image.ADAPTER.encodeWithTag(protoWriter, 4, calendarCoverImageSet.origin);
            }
            protoWriter.writeBytes(calendarCoverImageSet.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarCoverImageSet$a */
    public static final class C15514a extends Message.Builder<CalendarCoverImageSet, C15514a> {

        /* renamed from: a */
        public String f41035a;

        /* renamed from: b */
        public Image f41036b;

        /* renamed from: c */
        public Image f41037c;

        /* renamed from: d */
        public Image f41038d;

        /* renamed from: a */
        public CalendarCoverImageSet build() {
            return new CalendarCoverImageSet(this.f41035a, this.f41036b, this.f41037c, this.f41038d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15514a newBuilder() {
        C15514a aVar = new C15514a();
        aVar.f41035a = this.key;
        aVar.f41036b = this.thumb;
        aVar.f41037c = this.middle;
        aVar.f41038d = this.origin;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarCoverImageSet");
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.thumb != null) {
            sb.append(", thumb=");
            sb.append(this.thumb);
        }
        if (this.middle != null) {
            sb.append(", middle=");
            sb.append(this.middle);
        }
        if (this.origin != null) {
            sb.append(", origin=");
            sb.append(this.origin);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarCoverImageSet{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarCoverImageSet(String str, Image image, Image image2, Image image3) {
        this(str, image, image2, image3, ByteString.EMPTY);
    }

    public CalendarCoverImageSet(String str, Image image, Image image2, Image image3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.thumb = image;
        this.middle = image2;
        this.origin = image3;
    }
}
