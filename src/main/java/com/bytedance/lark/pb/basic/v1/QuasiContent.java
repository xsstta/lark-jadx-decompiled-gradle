package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.basic.v1.MediaContent;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class QuasiContent extends Message<QuasiContent, C15137a> {
    public static final ProtoAdapter<QuasiContent> ADAPTER = new C15138b();
    public static final ByteString DEFAULT_AUDIO = ByteString.EMPTY;
    public static final Integer DEFAULT_DURATION = 0;
    public static final Long DEFAULT_FILE_HANDLE = 0L;
    public static final File.Source DEFAULT_FILE_SOURCE = File.Source.LARK_SERVER;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final ByteString DEFAULT_IMAGE = ByteString.EMPTY;
    public static final Boolean DEFAULT_IS_GROUP_ANNOUNCEMENT = false;
    public static final Boolean DEFAULT_IS_ORIGIN_SOURCE = false;
    public static final Boolean DEFAULT_IS_TRY_USE_LAN_TRANS = false;
    public static final TransStatus DEFAULT_LAN_TRANS_STATUS = TransStatus.PENDING;
    public static final MediaContent.Source DEFAULT_MEDIA_SOURCE = MediaContent.Source.LARK;
    public static final Long DEFAULT_SIZE_BYTES = 0L;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final List<File> attachments;
    public final ByteString audio;
    public final CardContent card_content;
    public final String compress_path;
    public final Integer duration;
    public final Long file_handle;
    public final File.Source file_source;
    public final String file_uri;
    public final Integer height;
    public final ByteString image;
    public final String image_path;
    public final Boolean is_group_announcement;
    public final Boolean is_origin_source;
    public final Boolean is_try_use_lan_trans;
    public final String key;
    public final TransStatus lan_trans_status;
    public final LocationContent location_content;
    public final MediaContent.Source media_source;
    public final String mime;
    public final String name;
    public final String path;
    public final RichText rich_text;
    public final String share_chat_id;
    public final String share_chatter_id;
    public final Long size_bytes;
    public final String sticker_id;
    public final String sticker_set_id;
    public final String text;
    public final String title;
    public final Integer width;

    /* renamed from: com.bytedance.lark.pb.basic.v1.QuasiContent$a */
    public static final class C15137a extends Message.Builder<QuasiContent, C15137a> {

        /* renamed from: A */
        public Boolean f40125A;

        /* renamed from: B */
        public String f40126B;

        /* renamed from: C */
        public String f40127C;

        /* renamed from: D */
        public String f40128D;

        /* renamed from: a */
        public String f40129a;

        /* renamed from: b */
        public String f40130b;

        /* renamed from: c */
        public ByteString f40131c;

        /* renamed from: d */
        public Boolean f40132d;

        /* renamed from: e */
        public String f40133e;

        /* renamed from: f */
        public ByteString f40134f;

        /* renamed from: g */
        public Integer f40135g;

        /* renamed from: h */
        public String f40136h;

        /* renamed from: i */
        public List<File> f40137i = Internal.newMutableList();

        /* renamed from: j */
        public String f40138j;

        /* renamed from: k */
        public String f40139k;

        /* renamed from: l */
        public Integer f40140l;

        /* renamed from: m */
        public Integer f40141m;

        /* renamed from: n */
        public RichText f40142n;

        /* renamed from: o */
        public CardContent f40143o;

        /* renamed from: p */
        public LocationContent f40144p;

        /* renamed from: q */
        public String f40145q;

        /* renamed from: r */
        public String f40146r;

        /* renamed from: s */
        public Long f40147s;

        /* renamed from: t */
        public File.Source f40148t;

        /* renamed from: u */
        public TransStatus f40149u;

        /* renamed from: v */
        public Boolean f40150v;

        /* renamed from: w */
        public Long f40151w;

        /* renamed from: x */
        public String f40152x;

        /* renamed from: y */
        public MediaContent.Source f40153y;

        /* renamed from: z */
        public String f40154z;

        /* renamed from: a */
        public QuasiContent build() {
            return new QuasiContent(this.f40129a, this.f40130b, this.f40131c, this.f40132d, this.f40133e, this.f40134f, this.f40135g, this.f40136h, this.f40137i, this.f40138j, this.f40139k, this.f40140l, this.f40141m, this.f40142n, this.f40143o, this.f40144p, this.f40145q, this.f40146r, this.f40147s, this.f40148t, this.f40149u, this.f40150v, this.f40151w, this.f40152x, this.f40153y, this.f40154z, this.f40125A, this.f40126B, this.f40127C, this.f40128D, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15137a mo55172a(CardContent cardContent) {
            this.f40143o = cardContent;
            return this;
        }

        /* renamed from: b */
        public C15137a mo55183b(Boolean bool) {
            this.f40125A = bool;
            return this;
        }

        /* renamed from: c */
        public C15137a mo55188c(Integer num) {
            this.f40141m = num;
            return this;
        }

        /* renamed from: d */
        public C15137a mo55190d(String str) {
            this.f40138j = str;
            return this;
        }

        /* renamed from: e */
        public C15137a mo55191e(String str) {
            this.f40139k = str;
            return this;
        }

        /* renamed from: f */
        public C15137a mo55192f(String str) {
            this.f40145q = str;
            return this;
        }

        /* renamed from: g */
        public C15137a mo55193g(String str) {
            this.f40146r = str;
            return this;
        }

        /* renamed from: h */
        public C15137a mo55194h(String str) {
            this.f40152x = str;
            return this;
        }

        /* renamed from: i */
        public C15137a mo55195i(String str) {
            this.f40154z = str;
            return this;
        }

        /* renamed from: j */
        public C15137a mo55196j(String str) {
            this.f40126B = str;
            return this;
        }

        /* renamed from: k */
        public C15137a mo55197k(String str) {
            this.f40127C = str;
            return this;
        }

        /* renamed from: l */
        public C15137a mo55198l(String str) {
            this.f40128D = str;
            return this;
        }

        /* renamed from: a */
        public C15137a mo55173a(File.Source source) {
            this.f40148t = source;
            return this;
        }

        /* renamed from: b */
        public C15137a mo55184b(Integer num) {
            this.f40140l = num;
            return this;
        }

        /* renamed from: c */
        public C15137a mo55189c(String str) {
            this.f40133e = str;
            return this;
        }

        /* renamed from: a */
        public C15137a mo55174a(LocationContent locationContent) {
            this.f40144p = locationContent;
            return this;
        }

        /* renamed from: b */
        public C15137a mo55185b(Long l) {
            this.f40151w = l;
            return this;
        }

        /* renamed from: a */
        public C15137a mo55175a(MediaContent.Source source) {
            this.f40153y = source;
            return this;
        }

        /* renamed from: b */
        public C15137a mo55186b(String str) {
            this.f40130b = str;
            return this;
        }

        /* renamed from: a */
        public C15137a mo55176a(RichText richText) {
            this.f40142n = richText;
            return this;
        }

        /* renamed from: b */
        public C15137a mo55187b(ByteString byteString) {
            this.f40134f = byteString;
            return this;
        }

        /* renamed from: a */
        public C15137a mo55177a(Boolean bool) {
            this.f40132d = bool;
            return this;
        }

        /* renamed from: a */
        public C15137a mo55178a(Integer num) {
            this.f40135g = num;
            return this;
        }

        /* renamed from: a */
        public C15137a mo55179a(Long l) {
            this.f40147s = l;
            return this;
        }

        /* renamed from: a */
        public C15137a mo55180a(String str) {
            this.f40129a = str;
            return this;
        }

        /* renamed from: a */
        public C15137a mo55181a(ByteString byteString) {
            this.f40131c = byteString;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.QuasiContent$b */
    private static final class C15138b extends ProtoAdapter<QuasiContent> {
        C15138b() {
            super(FieldEncoding.LENGTH_DELIMITED, QuasiContent.class);
        }

        /* renamed from: a */
        public int encodedSize(QuasiContent quasiContent) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29 = 0;
            if (quasiContent.title != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, quasiContent.title);
            } else {
                i = 0;
            }
            if (quasiContent.text != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, quasiContent.text);
            } else {
                i2 = 0;
            }
            int i30 = i + i2;
            if (quasiContent.image != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(3, quasiContent.image);
            } else {
                i3 = 0;
            }
            int i31 = i30 + i3;
            if (quasiContent.is_origin_source != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(9, quasiContent.is_origin_source);
            } else {
                i4 = 0;
            }
            int i32 = i31 + i4;
            if (quasiContent.path != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(4, quasiContent.path);
            } else {
                i5 = 0;
            }
            int i33 = i32 + i5;
            if (quasiContent.audio != null) {
                i6 = ProtoAdapter.BYTES.encodedSizeWithTag(5, quasiContent.audio);
            } else {
                i6 = 0;
            }
            int i34 = i33 + i6;
            if (quasiContent.duration != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(6, quasiContent.duration);
            } else {
                i7 = 0;
            }
            int i35 = i34 + i7;
            if (quasiContent.image_path != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(7, quasiContent.image_path);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag = i35 + i8 + File.ADAPTER.asRepeated().encodedSizeWithTag(20, quasiContent.attachments);
            if (quasiContent.share_chat_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(30, quasiContent.share_chat_id);
            } else {
                i9 = 0;
            }
            int i36 = encodedSizeWithTag + i9;
            if (quasiContent.key != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(40, quasiContent.key);
            } else {
                i10 = 0;
            }
            int i37 = i36 + i10;
            if (quasiContent.width != null) {
                i11 = ProtoAdapter.INT32.encodedSizeWithTag(41, quasiContent.width);
            } else {
                i11 = 0;
            }
            int i38 = i37 + i11;
            if (quasiContent.height != null) {
                i12 = ProtoAdapter.INT32.encodedSizeWithTag(42, quasiContent.height);
            } else {
                i12 = 0;
            }
            int i39 = i38 + i12;
            if (quasiContent.rich_text != null) {
                i13 = RichText.ADAPTER.encodedSizeWithTag(50, quasiContent.rich_text);
            } else {
                i13 = 0;
            }
            int i40 = i39 + i13;
            if (quasiContent.card_content != null) {
                i14 = CardContent.ADAPTER.encodedSizeWithTag(60, quasiContent.card_content);
            } else {
                i14 = 0;
            }
            int i41 = i40 + i14;
            if (quasiContent.location_content != null) {
                i15 = LocationContent.ADAPTER.encodedSizeWithTag(70, quasiContent.location_content);
            } else {
                i15 = 0;
            }
            int i42 = i41 + i15;
            if (quasiContent.name != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(100, quasiContent.name);
            } else {
                i16 = 0;
            }
            int i43 = i42 + i16;
            if (quasiContent.mime != null) {
                i17 = ProtoAdapter.STRING.encodedSizeWithTag(101, quasiContent.mime);
            } else {
                i17 = 0;
            }
            int i44 = i43 + i17;
            if (quasiContent.size_bytes != null) {
                i18 = ProtoAdapter.INT64.encodedSizeWithTag(102, quasiContent.size_bytes);
            } else {
                i18 = 0;
            }
            int i45 = i44 + i18;
            if (quasiContent.file_source != null) {
                i19 = File.Source.ADAPTER.encodedSizeWithTag(103, quasiContent.file_source);
            } else {
                i19 = 0;
            }
            int i46 = i45 + i19;
            if (quasiContent.lan_trans_status != null) {
                i20 = TransStatus.ADAPTER.encodedSizeWithTag(104, quasiContent.lan_trans_status);
            } else {
                i20 = 0;
            }
            int i47 = i46 + i20;
            if (quasiContent.is_try_use_lan_trans != null) {
                i21 = ProtoAdapter.BOOL.encodedSizeWithTag(LocationRequest.PRIORITY_NO_POWER, quasiContent.is_try_use_lan_trans);
            } else {
                i21 = 0;
            }
            int i48 = i47 + i21;
            if (quasiContent.file_handle != null) {
                i22 = ProtoAdapter.INT64.encodedSizeWithTag(106, quasiContent.file_handle);
            } else {
                i22 = 0;
            }
            int i49 = i48 + i22;
            if (quasiContent.file_uri != null) {
                i23 = ProtoAdapter.STRING.encodedSizeWithTag(ActivityIdentificationData.WALKING, quasiContent.file_uri);
            } else {
                i23 = 0;
            }
            int i50 = i49 + i23;
            if (quasiContent.media_source != null) {
                i24 = MediaContent.Source.ADAPTER.encodedSizeWithTag(SmEvents.EVENT_NW, quasiContent.media_source);
            } else {
                i24 = 0;
            }
            int i51 = i50 + i24;
            if (quasiContent.compress_path != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(SmActions.ACTION_INIT_ENTRY, quasiContent.compress_path);
            } else {
                i25 = 0;
            }
            int i52 = i51 + i25;
            if (quasiContent.is_group_announcement != null) {
                i26 = ProtoAdapter.BOOL.encodedSizeWithTag(150, quasiContent.is_group_announcement);
            } else {
                i26 = 0;
            }
            int i53 = i52 + i26;
            if (quasiContent.sticker_set_id != null) {
                i27 = ProtoAdapter.STRING.encodedSizeWithTag(LocationRequest.PRIORITY_HD_ACCURACY, quasiContent.sticker_set_id);
            } else {
                i27 = 0;
            }
            int i54 = i53 + i27;
            if (quasiContent.sticker_id != null) {
                i28 = ProtoAdapter.STRING.encodedSizeWithTag(201, quasiContent.sticker_id);
            } else {
                i28 = 0;
            }
            int i55 = i54 + i28;
            if (quasiContent.share_chatter_id != null) {
                i29 = ProtoAdapter.STRING.encodedSizeWithTag(220, quasiContent.share_chatter_id);
            }
            return i55 + i29 + quasiContent.unknownFields().size();
        }

        /* renamed from: a */
        public QuasiContent decode(ProtoReader protoReader) throws IOException {
            C15137a aVar = new C15137a();
            aVar.f40129a = "";
            aVar.f40130b = "";
            aVar.f40131c = ByteString.EMPTY;
            aVar.f40132d = false;
            aVar.f40133e = "";
            aVar.f40134f = ByteString.EMPTY;
            aVar.f40135g = 0;
            aVar.f40136h = "";
            aVar.f40138j = "";
            aVar.f40139k = "";
            aVar.f40140l = 0;
            aVar.f40141m = 0;
            aVar.f40145q = "";
            aVar.f40146r = "";
            aVar.f40147s = 0L;
            aVar.f40148t = File.Source.LARK_SERVER;
            aVar.f40149u = TransStatus.PENDING;
            aVar.f40150v = false;
            aVar.f40151w = 0L;
            aVar.f40152x = "";
            aVar.f40153y = MediaContent.Source.LARK;
            aVar.f40154z = "";
            aVar.f40125A = false;
            aVar.f40126B = "";
            aVar.f40127C = "";
            aVar.f40128D = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 9) {
                    aVar.f40132d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 20) {
                    aVar.f40137i.add(File.ADAPTER.decode(protoReader));
                } else if (nextTag == 30) {
                    aVar.f40138j = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 50) {
                    aVar.f40142n = RichText.ADAPTER.decode(protoReader);
                } else if (nextTag == 60) {
                    aVar.f40143o = CardContent.ADAPTER.decode(protoReader);
                } else if (nextTag == 70) {
                    aVar.f40144p = LocationContent.ADAPTER.decode(protoReader);
                } else if (nextTag == 150) {
                    aVar.f40125A = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 220) {
                    aVar.f40128D = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 120) {
                    try {
                        aVar.f40153y = MediaContent.Source.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 121) {
                    aVar.f40154z = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 200) {
                    aVar.f40126B = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 201) {
                    switch (nextTag) {
                        case 1:
                            aVar.f40129a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f40130b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f40131c = ProtoAdapter.BYTES.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f40133e = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f40134f = ProtoAdapter.BYTES.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f40135g = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f40136h = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 40:
                                    aVar.f40139k = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 41:
                                    aVar.f40140l = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                case 42:
                                    aVar.f40141m = ProtoAdapter.INT32.decode(protoReader);
                                    continue;
                                default:
                                    switch (nextTag) {
                                        case 100:
                                            aVar.f40145q = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 101:
                                            aVar.f40146r = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        case 102:
                                            aVar.f40147s = ProtoAdapter.INT64.decode(protoReader);
                                            continue;
                                        case 103:
                                            try {
                                                aVar.f40148t = File.Source.ADAPTER.decode(protoReader);
                                                continue;
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                                break;
                                            }
                                        case 104:
                                            try {
                                                aVar.f40149u = TransStatus.ADAPTER.decode(protoReader);
                                                continue;
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                                break;
                                            }
                                        case LocationRequest.PRIORITY_NO_POWER /*{ENCODED_INT: 105}*/:
                                            aVar.f40150v = ProtoAdapter.BOOL.decode(protoReader);
                                            continue;
                                        case 106:
                                            aVar.f40151w = ProtoAdapter.INT64.decode(protoReader);
                                            continue;
                                        case ActivityIdentificationData.WALKING /*{ENCODED_INT: 107}*/:
                                            aVar.f40152x = ProtoAdapter.STRING.decode(protoReader);
                                            continue;
                                        default:
                                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            continue;
                                            continue;
                                            continue;
                                    }
                            }
                    }
                } else {
                    aVar.f40127C = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, QuasiContent quasiContent) throws IOException {
            if (quasiContent.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, quasiContent.title);
            }
            if (quasiContent.text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, quasiContent.text);
            }
            if (quasiContent.image != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, quasiContent.image);
            }
            if (quasiContent.is_origin_source != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, quasiContent.is_origin_source);
            }
            if (quasiContent.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, quasiContent.path);
            }
            if (quasiContent.audio != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 5, quasiContent.audio);
            }
            if (quasiContent.duration != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, quasiContent.duration);
            }
            if (quasiContent.image_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, quasiContent.image_path);
            }
            File.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, quasiContent.attachments);
            if (quasiContent.share_chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, quasiContent.share_chat_id);
            }
            if (quasiContent.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 40, quasiContent.key);
            }
            if (quasiContent.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 41, quasiContent.width);
            }
            if (quasiContent.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 42, quasiContent.height);
            }
            if (quasiContent.rich_text != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 50, quasiContent.rich_text);
            }
            if (quasiContent.card_content != null) {
                CardContent.ADAPTER.encodeWithTag(protoWriter, 60, quasiContent.card_content);
            }
            if (quasiContent.location_content != null) {
                LocationContent.ADAPTER.encodeWithTag(protoWriter, 70, quasiContent.location_content);
            }
            if (quasiContent.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 100, quasiContent.name);
            }
            if (quasiContent.mime != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 101, quasiContent.mime);
            }
            if (quasiContent.size_bytes != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 102, quasiContent.size_bytes);
            }
            if (quasiContent.file_source != null) {
                File.Source.ADAPTER.encodeWithTag(protoWriter, 103, quasiContent.file_source);
            }
            if (quasiContent.lan_trans_status != null) {
                TransStatus.ADAPTER.encodeWithTag(protoWriter, 104, quasiContent.lan_trans_status);
            }
            if (quasiContent.is_try_use_lan_trans != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, LocationRequest.PRIORITY_NO_POWER, quasiContent.is_try_use_lan_trans);
            }
            if (quasiContent.file_handle != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 106, quasiContent.file_handle);
            }
            if (quasiContent.file_uri != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, ActivityIdentificationData.WALKING, quasiContent.file_uri);
            }
            if (quasiContent.media_source != null) {
                MediaContent.Source.ADAPTER.encodeWithTag(protoWriter, SmEvents.EVENT_NW, quasiContent.media_source);
            }
            if (quasiContent.compress_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, SmActions.ACTION_INIT_ENTRY, quasiContent.compress_path);
            }
            if (quasiContent.is_group_announcement != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 150, quasiContent.is_group_announcement);
            }
            if (quasiContent.sticker_set_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, LocationRequest.PRIORITY_HD_ACCURACY, quasiContent.sticker_set_id);
            }
            if (quasiContent.sticker_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 201, quasiContent.sticker_id);
            }
            if (quasiContent.share_chatter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 220, quasiContent.share_chatter_id);
            }
            protoWriter.writeBytes(quasiContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15137a newBuilder() {
        C15137a aVar = new C15137a();
        aVar.f40129a = this.title;
        aVar.f40130b = this.text;
        aVar.f40131c = this.image;
        aVar.f40132d = this.is_origin_source;
        aVar.f40133e = this.path;
        aVar.f40134f = this.audio;
        aVar.f40135g = this.duration;
        aVar.f40136h = this.image_path;
        aVar.f40137i = Internal.copyOf("attachments", this.attachments);
        aVar.f40138j = this.share_chat_id;
        aVar.f40139k = this.key;
        aVar.f40140l = this.width;
        aVar.f40141m = this.height;
        aVar.f40142n = this.rich_text;
        aVar.f40143o = this.card_content;
        aVar.f40144p = this.location_content;
        aVar.f40145q = this.name;
        aVar.f40146r = this.mime;
        aVar.f40147s = this.size_bytes;
        aVar.f40148t = this.file_source;
        aVar.f40149u = this.lan_trans_status;
        aVar.f40150v = this.is_try_use_lan_trans;
        aVar.f40151w = this.file_handle;
        aVar.f40152x = this.file_uri;
        aVar.f40153y = this.media_source;
        aVar.f40154z = this.compress_path;
        aVar.f40125A = this.is_group_announcement;
        aVar.f40126B = this.sticker_set_id;
        aVar.f40127C = this.sticker_id;
        aVar.f40128D = this.share_chatter_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "QuasiContent");
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.is_origin_source != null) {
            sb.append(", is_origin_source=");
            sb.append(this.is_origin_source);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        if (this.audio != null) {
            sb.append(", audio=");
            sb.append(this.audio);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.image_path != null) {
            sb.append(", image_path=");
            sb.append(this.image_path);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (this.share_chat_id != null) {
            sb.append(", share_chat_id=");
            sb.append(this.share_chat_id);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.rich_text != null) {
            sb.append(", rich_text=");
            sb.append(this.rich_text);
        }
        if (this.card_content != null) {
            sb.append(", card_content=");
            sb.append(this.card_content);
        }
        if (this.location_content != null) {
            sb.append(", location_content=");
            sb.append(this.location_content);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.mime != null) {
            sb.append(", mime=");
            sb.append(this.mime);
        }
        if (this.size_bytes != null) {
            sb.append(", size_bytes=");
            sb.append(this.size_bytes);
        }
        if (this.file_source != null) {
            sb.append(", file_source=");
            sb.append(this.file_source);
        }
        if (this.lan_trans_status != null) {
            sb.append(", lan_trans_status=");
            sb.append(this.lan_trans_status);
        }
        if (this.is_try_use_lan_trans != null) {
            sb.append(", is_try_use_lan_trans=");
            sb.append(this.is_try_use_lan_trans);
        }
        if (this.file_handle != null) {
            sb.append(", file_handle=");
            sb.append(this.file_handle);
        }
        if (this.file_uri != null) {
            sb.append(", file_uri=");
            sb.append(this.file_uri);
        }
        if (this.media_source != null) {
            sb.append(", media_source=");
            sb.append(this.media_source);
        }
        if (this.compress_path != null) {
            sb.append(", compress_path=");
            sb.append(this.compress_path);
        }
        if (this.is_group_announcement != null) {
            sb.append(", is_group_announcement=");
            sb.append(this.is_group_announcement);
        }
        if (this.sticker_set_id != null) {
            sb.append(", sticker_set_id=");
            sb.append(this.sticker_set_id);
        }
        if (this.sticker_id != null) {
            sb.append(", sticker_id=");
            sb.append(this.sticker_id);
        }
        if (this.share_chatter_id != null) {
            sb.append(", share_chatter_id=");
            sb.append(this.share_chatter_id);
        }
        StringBuilder replace = sb.replace(0, 2, "QuasiContent{");
        replace.append('}');
        return replace.toString();
    }

    public QuasiContent(String str, String str2, ByteString byteString, Boolean bool, String str3, ByteString byteString2, Integer num, String str4, List<File> list, String str5, String str6, Integer num2, Integer num3, RichText richText, CardContent cardContent, LocationContent locationContent, String str7, String str8, Long l, File.Source source, TransStatus transStatus, Boolean bool2, Long l2, String str9, MediaContent.Source source2, String str10, Boolean bool3, String str11, String str12, String str13) {
        this(str, str2, byteString, bool, str3, byteString2, num, str4, list, str5, str6, num2, num3, richText, cardContent, locationContent, str7, str8, l, source, transStatus, bool2, l2, str9, source2, str10, bool3, str11, str12, str13, ByteString.EMPTY);
    }

    public QuasiContent(String str, String str2, ByteString byteString, Boolean bool, String str3, ByteString byteString2, Integer num, String str4, List<File> list, String str5, String str6, Integer num2, Integer num3, RichText richText, CardContent cardContent, LocationContent locationContent, String str7, String str8, Long l, File.Source source, TransStatus transStatus, Boolean bool2, Long l2, String str9, MediaContent.Source source2, String str10, Boolean bool3, String str11, String str12, String str13, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.title = str;
        this.text = str2;
        this.image = byteString;
        this.is_origin_source = bool;
        this.path = str3;
        this.audio = byteString2;
        this.duration = num;
        this.image_path = str4;
        this.attachments = Internal.immutableCopyOf("attachments", list);
        this.share_chat_id = str5;
        this.key = str6;
        this.width = num2;
        this.height = num3;
        this.rich_text = richText;
        this.card_content = cardContent;
        this.location_content = locationContent;
        this.name = str7;
        this.mime = str8;
        this.size_bytes = l;
        this.file_source = source;
        this.lan_trans_status = transStatus;
        this.is_try_use_lan_trans = bool2;
        this.file_handle = l2;
        this.file_uri = str9;
        this.media_source = source2;
        this.compress_path = str10;
        this.is_group_announcement = bool3;
        this.sticker_set_id = str11;
        this.sticker_id = str12;
        this.share_chatter_id = str13;
    }
}
