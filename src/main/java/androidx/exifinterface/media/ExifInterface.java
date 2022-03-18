package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.util.Log;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class ExifInterface {

    /* renamed from: A */
    private static final C0984c f3695A = new C0984c("JPEGInterchangeFormat", MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID, 4);

    /* renamed from: B */
    private static final C0984c f3696B = new C0984c("JPEGInterchangeFormatLength", MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE, 4);

    /* renamed from: C */
    private static final HashMap<Integer, C0984c>[] f3697C;

    /* renamed from: D */
    private static final HashMap<String, C0984c>[] f3698D;

    /* renamed from: E */
    private static final HashSet<String> f3699E = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));

    /* renamed from: F */
    private static final HashMap<Integer, Integer> f3700F = new HashMap<>();

    /* renamed from: X */
    private static final Pattern f3701X = Pattern.compile(".*[1-9].*");

    /* renamed from: Y */
    private static final Pattern f3702Y = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: a */
    public static final int[] f3703a = {8, 8, 8};

    /* renamed from: b */
    public static final int[] f3704b = {4};

    /* renamed from: c */
    public static final int[] f3705c = {8};

    /* renamed from: d */
    static final byte[] f3706d = {-1, -40, -1};

    /* renamed from: e */
    static final String[] f3707e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: f */
    static final int[] f3708f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: g */
    static final byte[] f3709g = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: h */
    static final C0984c[][] f3710h;

    /* renamed from: i */
    static final Charset f3711i;

    /* renamed from: j */
    static final byte[] f3712j;

    /* renamed from: k */
    private static final List<Integer> f3713k = Arrays.asList(1, 6, 3, 8);

    /* renamed from: l */
    private static final List<Integer> f3714l = Arrays.asList(2, 7, 4, 5);

    /* renamed from: m */
    private static final byte[] f3715m = {79, 76, 89, 77, 80, 0};

    /* renamed from: n */
    private static final byte[] f3716n = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: o */
    private static SimpleDateFormat f3717o;

    /* renamed from: p */
    private static final C0984c[] f3718p;

    /* renamed from: q */
    private static final C0984c[] f3719q;

    /* renamed from: r */
    private static final C0984c[] f3720r;

    /* renamed from: s */
    private static final C0984c[] f3721s;

    /* renamed from: t */
    private static final C0984c[] f3722t;

    /* renamed from: u */
    private static final C0984c f3723u = new C0984c("StripOffsets", 273, 3);

    /* renamed from: v */
    private static final C0984c[] f3724v;

    /* renamed from: w */
    private static final C0984c[] f3725w;

    /* renamed from: x */
    private static final C0984c[] f3726x;

    /* renamed from: y */
    private static final C0984c[] f3727y;

    /* renamed from: z */
    private static final C0984c[] f3728z = {new C0984c("SubIFDPointer", 330, 4), new C0984c("ExifIFDPointer", 34665, 4), new C0984c("GPSInfoIFDPointer", 34853, 4), new C0984c("InteroperabilityIFDPointer", 40965, 4), new C0984c("CameraSettingsIFDPointer", 8224, 1), new C0984c("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: G */
    private final String f3729G;

    /* renamed from: H */
    private final AssetManager.AssetInputStream f3730H;

    /* renamed from: I */
    private int f3731I;

    /* renamed from: J */
    private final HashMap<String, C0983b>[] f3732J;

    /* renamed from: K */
    private Set<Integer> f3733K;

    /* renamed from: L */
    private ByteOrder f3734L = ByteOrder.BIG_ENDIAN;

    /* renamed from: M */
    private boolean f3735M;

    /* renamed from: N */
    private int f3736N;

    /* renamed from: O */
    private int f3737O;

    /* renamed from: P */
    private byte[] f3738P;

    /* renamed from: Q */
    private int f3739Q;

    /* renamed from: R */
    private int f3740R;

    /* renamed from: S */
    private int f3741S;

    /* renamed from: T */
    private int f3742T;

    /* renamed from: U */
    private int f3743U;

    /* renamed from: V */
    private int f3744V;

    /* renamed from: W */
    private boolean f3745W;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IfdType {
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.ExifInterface$a */
    public static class C0982a extends InputStream implements DataInput {

        /* renamed from: c */
        private static final ByteOrder f3746c = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: d */
        private static final ByteOrder f3747d = ByteOrder.BIG_ENDIAN;

        /* renamed from: a */
        final int f3748a;

        /* renamed from: b */
        int f3749b;

        /* renamed from: e */
        private DataInputStream f3750e;

        /* renamed from: f */
        private ByteOrder f3751f;

        /* renamed from: a */
        public int mo4997a() {
            return this.f3749b;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f3750e.available();
        }

        /* renamed from: b */
        public long mo5001b() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f3749b++;
            return this.f3750e.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f3749b++;
            return this.f3750e.readBoolean();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f3749b += 2;
            return this.f3750e.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f3749b += 2;
            return this.f3750e.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f3749b++;
            return this.f3750e.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i = this.f3749b + 1;
            this.f3749b = i;
            if (i <= this.f3748a) {
                int read = this.f3750e.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i = this.f3749b + 4;
            this.f3749b = i;
            if (i <= this.f3748a) {
                int read = this.f3750e.read();
                int read2 = this.f3750e.read();
                int read3 = this.f3750e.read();
                int read4 = this.f3750e.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f3751f;
                    if (byteOrder == f3746c) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f3747d) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f3751f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i = this.f3749b + 2;
            this.f3749b = i;
            if (i <= this.f3748a) {
                int read = this.f3750e.read();
                int read2 = this.f3750e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f3751f;
                    if (byteOrder == f3746c) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f3747d) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f3751f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i = this.f3749b + 2;
            this.f3749b = i;
            if (i <= this.f3748a) {
                int read = this.f3750e.read();
                int read2 = this.f3750e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f3751f;
                    if (byteOrder == f3746c) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f3747d) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f3751f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i = this.f3749b + 8;
            this.f3749b = i;
            if (i <= this.f3748a) {
                int read = this.f3750e.read();
                int read2 = this.f3750e.read();
                int read3 = this.f3750e.read();
                int read4 = this.f3750e.read();
                int read5 = this.f3750e.read();
                int read6 = this.f3750e.read();
                int read7 = this.f3750e.read();
                int read8 = this.f3750e.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f3751f;
                    if (byteOrder == f3746c) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f3747d) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    throw new IOException("Invalid byte order: " + this.f3751f);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        /* renamed from: a */
        public void mo4999a(ByteOrder byteOrder) {
            this.f3751f = byteOrder;
        }

        public C0982a(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }

        public C0982a(InputStream inputStream) throws IOException {
            this.f3751f = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f3750e = dataInputStream;
            int available = dataInputStream.available();
            this.f3748a = available;
            this.f3749b = 0;
            this.f3750e.mark(available);
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f3748a - this.f3749b);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f3750e.skipBytes(min - i2);
            }
            this.f3749b += i2;
            return i2;
        }

        /* renamed from: a */
        public void mo4998a(long j) throws IOException {
            int i = this.f3749b;
            if (((long) i) > j) {
                this.f3749b = 0;
                this.f3750e.reset();
                this.f3750e.mark(this.f3748a);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f3749b + bArr.length;
            this.f3749b = length;
            if (length > this.f3748a) {
                throw new EOFException();
            } else if (this.f3750e.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f3750e.read(bArr, i, i2);
            this.f3749b += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f3749b + i2;
            this.f3749b = i3;
            if (i3 > this.f3748a) {
                throw new EOFException();
            } else if (this.f3750e.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }
    }

    static {
        C0984c[] cVarArr = {new C0984c("NewSubfileType", 254, 4), new C0984c("SubfileType", 255, 4), new C0984c("ImageWidth", DynamicModule.f58006b, 3, 4), new C0984c("ImageLength", 257, 3, 4), new C0984c("BitsPerSample", 258, 3), new C0984c("Compression", 259, 3), new C0984c("PhotometricInterpretation", 262, 3), new C0984c("ImageDescription", 270, 2), new C0984c("Make", 271, 2), new C0984c("Model", 272, 2), new C0984c("StripOffsets", 273, 3, 4), new C0984c("Orientation", 274, 3), new C0984c("SamplesPerPixel", 277, 3), new C0984c("RowsPerStrip", 278, 3, 4), new C0984c("StripByteCounts", 279, 3, 4), new C0984c("XResolution", 282, 5), new C0984c("YResolution", 283, 5), new C0984c("PlanarConfiguration", 284, 3), new C0984c("ResolutionUnit", 296, 3), new C0984c("TransferFunction", 301, 3), new C0984c("Software", 305, 2), new C0984c("DateTime", 306, 2), new C0984c("Artist", 315, 2), new C0984c("WhitePoint", 318, 5), new C0984c("PrimaryChromaticities", 319, 5), new C0984c("SubIFDPointer", 330, 4), new C0984c("JPEGInterchangeFormat", MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID, 4), new C0984c("JPEGInterchangeFormatLength", MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE, 4), new C0984c("YCbCrCoefficients", 529, 5), new C0984c("YCbCrSubSampling", 530, 3), new C0984c("YCbCrPositioning", 531, 3), new C0984c("ReferenceBlackWhite", TTVideoEngine.PLAYER_OPTION_SUB_LANG_IDS, 5), new C0984c("Copyright", 33432, 2), new C0984c("ExifIFDPointer", 34665, 4), new C0984c("GPSInfoIFDPointer", 34853, 4), new C0984c("SensorTopBorder", 4, 4), new C0984c("SensorLeftBorder", 5, 4), new C0984c("SensorBottomBorder", 6, 4), new C0984c("SensorRightBorder", 7, 4), new C0984c("ISO", 23, 3), new C0984c("JpgFromRaw", 46, 7)};
        f3718p = cVarArr;
        C0984c[] cVarArr2 = {new C0984c("ExposureTime", 33434, 5), new C0984c("FNumber", 33437, 5), new C0984c("ExposureProgram", 34850, 3), new C0984c("SpectralSensitivity", 34852, 2), new C0984c("PhotographicSensitivity", 34855, 3), new C0984c("OECF", 34856, 7), new C0984c("ExifVersion", 36864, 2), new C0984c("DateTimeOriginal", 36867, 2), new C0984c("DateTimeDigitized", 36868, 2), new C0984c("ComponentsConfiguration", 37121, 7), new C0984c("CompressedBitsPerPixel", 37122, 5), new C0984c("ShutterSpeedValue", 37377, 10), new C0984c("ApertureValue", 37378, 5), new C0984c("BrightnessValue", 37379, 10), new C0984c("ExposureBiasValue", 37380, 10), new C0984c("MaxApertureValue", 37381, 5), new C0984c("SubjectDistance", 37382, 5), new C0984c("MeteringMode", 37383, 3), new C0984c("LightSource", 37384, 3), new C0984c("Flash", 37385, 3), new C0984c("FocalLength", 37386, 5), new C0984c("SubjectArea", 37396, 3), new C0984c("MakerNote", 37500, 7), new C0984c("UserComment", 37510, 7), new C0984c("SubSecTime", 37520, 2), new C0984c("SubSecTimeOriginal", 37521, 2), new C0984c("SubSecTimeDigitized", 37522, 2), new C0984c("FlashpixVersion", 40960, 7), new C0984c("ColorSpace", 40961, 3), new C0984c("PixelXDimension", 40962, 3, 4), new C0984c("PixelYDimension", 40963, 3, 4), new C0984c("RelatedSoundFile", 40964, 2), new C0984c("InteroperabilityIFDPointer", 40965, 4), new C0984c("FlashEnergy", 41483, 5), new C0984c("SpatialFrequencyResponse", 41484, 7), new C0984c("FocalPlaneXResolution", 41486, 5), new C0984c("FocalPlaneYResolution", 41487, 5), new C0984c("FocalPlaneResolutionUnit", 41488, 3), new C0984c("SubjectLocation", 41492, 3), new C0984c("ExposureIndex", 41493, 5), new C0984c("SensingMethod", 41495, 3), new C0984c("FileSource", 41728, 7), new C0984c("SceneType", 41729, 7), new C0984c("CFAPattern", 41730, 7), new C0984c("CustomRendered", 41985, 3), new C0984c("ExposureMode", 41986, 3), new C0984c("WhiteBalance", 41987, 3), new C0984c("DigitalZoomRatio", 41988, 5), new C0984c("FocalLengthIn35mmFilm", 41989, 3), new C0984c("SceneCaptureType", 41990, 3), new C0984c("GainControl", 41991, 3), new C0984c("Contrast", 41992, 3), new C0984c("Saturation", 41993, 3), new C0984c("Sharpness", 41994, 3), new C0984c("DeviceSettingDescription", 41995, 7), new C0984c("SubjectDistanceRange", 41996, 3), new C0984c("ImageUniqueID", 42016, 2), new C0984c("DNGVersion", 50706, 1), new C0984c("DefaultCropSize", 50720, 3, 4)};
        f3719q = cVarArr2;
        C0984c[] cVarArr3 = {new C0984c("GPSVersionID", 0, 1), new C0984c("GPSLatitudeRef", 1, 2), new C0984c("GPSLatitude", 2, 5), new C0984c("GPSLongitudeRef", 3, 2), new C0984c("GPSLongitude", 4, 5), new C0984c("GPSAltitudeRef", 5, 1), new C0984c("GPSAltitude", 6, 5), new C0984c("GPSTimeStamp", 7, 5), new C0984c("GPSSatellites", 8, 2), new C0984c("GPSStatus", 9, 2), new C0984c("GPSMeasureMode", 10, 2), new C0984c("GPSDOP", 11, 5), new C0984c("GPSSpeedRef", 12, 2), new C0984c("GPSSpeed", 13, 5), new C0984c("GPSTrackRef", 14, 2), new C0984c("GPSTrack", 15, 5), new C0984c("GPSImgDirectionRef", 16, 2), new C0984c("GPSImgDirection", 17, 5), new C0984c("GPSMapDatum", 18, 2), new C0984c("GPSDestLatitudeRef", 19, 2), new C0984c("GPSDestLatitude", 20, 5), new C0984c("GPSDestLongitudeRef", 21, 2), new C0984c("GPSDestLongitude", 22, 5), new C0984c("GPSDestBearingRef", 23, 2), new C0984c("GPSDestBearing", 24, 5), new C0984c("GPSDestDistanceRef", 25, 2), new C0984c("GPSDestDistance", 26, 5), new C0984c("GPSProcessingMethod", 27, 7), new C0984c("GPSAreaInformation", 28, 7), new C0984c("GPSDateStamp", 29, 2), new C0984c("GPSDifferential", 30, 3)};
        f3720r = cVarArr3;
        C0984c[] cVarArr4 = {new C0984c("InteroperabilityIndex", 1, 2)};
        f3721s = cVarArr4;
        C0984c[] cVarArr5 = {new C0984c("NewSubfileType", 254, 4), new C0984c("SubfileType", 255, 4), new C0984c("ThumbnailImageWidth", DynamicModule.f58006b, 3, 4), new C0984c("ThumbnailImageLength", 257, 3, 4), new C0984c("BitsPerSample", 258, 3), new C0984c("Compression", 259, 3), new C0984c("PhotometricInterpretation", 262, 3), new C0984c("ImageDescription", 270, 2), new C0984c("Make", 271, 2), new C0984c("Model", 272, 2), new C0984c("StripOffsets", 273, 3, 4), new C0984c("Orientation", 274, 3), new C0984c("SamplesPerPixel", 277, 3), new C0984c("RowsPerStrip", 278, 3, 4), new C0984c("StripByteCounts", 279, 3, 4), new C0984c("XResolution", 282, 5), new C0984c("YResolution", 283, 5), new C0984c("PlanarConfiguration", 284, 3), new C0984c("ResolutionUnit", 296, 3), new C0984c("TransferFunction", 301, 3), new C0984c("Software", 305, 2), new C0984c("DateTime", 306, 2), new C0984c("Artist", 315, 2), new C0984c("WhitePoint", 318, 5), new C0984c("PrimaryChromaticities", 319, 5), new C0984c("SubIFDPointer", 330, 4), new C0984c("JPEGInterchangeFormat", MediaPlayer.MEDIA_PLAYER_OPTION_MODULE_ID, 4), new C0984c("JPEGInterchangeFormatLength", MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_EXPIRED_LICENSE, 4), new C0984c("YCbCrCoefficients", 529, 5), new C0984c("YCbCrSubSampling", 530, 3), new C0984c("YCbCrPositioning", 531, 3), new C0984c("ReferenceBlackWhite", TTVideoEngine.PLAYER_OPTION_SUB_LANG_IDS, 5), new C0984c("Copyright", 33432, 2), new C0984c("ExifIFDPointer", 34665, 4), new C0984c("GPSInfoIFDPointer", 34853, 4), new C0984c("DNGVersion", 50706, 1), new C0984c("DefaultCropSize", 50720, 3, 4)};
        f3722t = cVarArr5;
        C0984c[] cVarArr6 = {new C0984c("ThumbnailImage", DynamicModule.f58006b, 7), new C0984c("CameraSettingsIFDPointer", 8224, 4), new C0984c("ImageProcessingIFDPointer", 8256, 4)};
        f3724v = cVarArr6;
        C0984c[] cVarArr7 = {new C0984c("PreviewImageStart", 257, 4), new C0984c("PreviewImageLength", 258, 4)};
        f3725w = cVarArr7;
        C0984c[] cVarArr8 = {new C0984c("AspectFrame", 4371, 3)};
        f3726x = cVarArr8;
        C0984c[] cVarArr9 = {new C0984c("ColorSpace", 55, 3)};
        f3727y = cVarArr9;
        C0984c[][] cVarArr10 = {cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, cVarArr6, cVarArr7, cVarArr8, cVarArr9};
        f3710h = cVarArr10;
        f3697C = new HashMap[cVarArr10.length];
        f3698D = new HashMap[cVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f3711i = forName;
        f3712j = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f3717o = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C0984c[][] cVarArr11 = f3710h;
            if (i < cVarArr11.length) {
                f3697C[i] = new HashMap<>();
                f3698D[i] = new HashMap<>();
                C0984c[] cVarArr12 = cVarArr11[i];
                for (C0984c cVar : cVarArr12) {
                    f3697C[i].put(Integer.valueOf(cVar.f3755a), cVar);
                    f3698D[i].put(cVar.f3756b, cVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f3700F;
                C0984c[] cVarArr13 = f3728z;
                hashMap.put(Integer.valueOf(cVarArr13[0].f3755a), 5);
                hashMap.put(Integer.valueOf(cVarArr13[1].f3755a), 1);
                hashMap.put(Integer.valueOf(cVarArr13[2].f3755a), 2);
                hashMap.put(Integer.valueOf(cVarArr13[3].f3755a), 3);
                hashMap.put(Integer.valueOf(cVarArr13[4].f3755a), 7);
                hashMap.put(Integer.valueOf(cVarArr13[5].f3755a), 8);
                return;
            }
        }
    }

    /* renamed from: a */
    public String mo4996a(String str) {
        C0983b b = m4800b(str);
        if (b != null) {
            if (!f3699E.contains(str)) {
                return b.mo5022d(this.f3734L);
            }
            if (!str.equals("GPSTimeStamp")) {
                try {
                    return Double.toString(b.mo5020b(this.f3734L));
                } catch (NumberFormatException unused) {
                }
            } else if (b.f3752a == 5 || b.f3752a == 10) {
                C0985d[] dVarArr = (C0985d[]) b.mo5019a(this.f3734L);
                if (dVarArr == null || dVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) dVarArr[0].f3759a) / ((float) dVarArr[0].f3760b))), Integer.valueOf((int) (((float) dVarArr[1].f3759a) / ((float) dVarArr[1].f3760b))), Integer.valueOf((int) (((float) dVarArr[2].f3759a) / ((float) dVarArr[2].f3760b))));
            } else {
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + b.f3752a);
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int mo4995a(String str, int i) {
        C0983b b = m4800b(str);
        if (b == null) {
            return i;
        }
        try {
            return b.mo5021c(this.f3734L);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f3745W = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        m4788a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4795a(java.io.InputStream r5) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m4795a(java.io.InputStream):void");
    }

    /* renamed from: a */
    private static boolean m4798a(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f3706d;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m4793a(C0982a aVar, HashMap hashMap) throws IOException {
        int i;
        C0983b bVar = (C0983b) hashMap.get("JPEGInterchangeFormat");
        C0983b bVar2 = (C0983b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int c = bVar.mo5021c(this.f3734L);
            int min = Math.min(bVar2.mo5021c(this.f3734L), aVar.available() - c);
            int i2 = this.f3731I;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.f3740R;
            } else {
                if (i2 == 7) {
                    i = this.f3741S;
                }
                if (c > 0 && min > 0) {
                    this.f3735M = true;
                    this.f3736N = c;
                    this.f3737O = min;
                    if (this.f3729G == null && this.f3730H == null) {
                        byte[] bArr = new byte[min];
                        aVar.mo4998a((long) c);
                        aVar.readFully(bArr);
                        this.f3738P = bArr;
                        return;
                    }
                    return;
                }
            }
            c += i;
            if (c > 0) {
            }
        }
    }

    /* renamed from: a */
    private boolean m4797a(HashMap hashMap) throws IOException {
        C0983b bVar;
        C0983b bVar2 = (C0983b) hashMap.get("BitsPerSample");
        if (bVar2 == null) {
            return false;
        }
        int[] iArr = (int[]) bVar2.mo5019a(this.f3734L);
        int[] iArr2 = f3703a;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.f3731I != 3 || (bVar = (C0983b) hashMap.get("PhotometricInterpretation")) == null) {
            return false;
        }
        int c = bVar.mo5021c(this.f3734L);
        if ((c != 1 || !Arrays.equals(iArr, f3705c)) && (c != 6 || !Arrays.equals(iArr, iArr2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static long[] m4799a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.ExifInterface$d */
    public static class C0985d {

        /* renamed from: a */
        public final long f3759a;

        /* renamed from: b */
        public final long f3760b;

        /* renamed from: a */
        public double mo5025a() {
            return ((double) this.f3759a) / ((double) this.f3760b);
        }

        public String toString() {
            return this.f3759a + "/" + this.f3760b;
        }

        C0985d(long j, long j2) {
            if (j2 == 0) {
                this.f3759a = 0;
                this.f3760b = 1;
                return;
            }
            this.f3759a = j;
            this.f3760b = j2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.ExifInterface$b */
    public static class C0983b {

        /* renamed from: a */
        public final int f3752a;

        /* renamed from: b */
        public final int f3753b;

        /* renamed from: c */
        public final byte[] f3754c;

        public String toString() {
            return "(" + ExifInterface.f3707e[this.f3752a] + ", data length:" + this.f3754c.length + ")";
        }

        /* renamed from: a */
        public static C0983b m4824a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.f3711i);
            return new C0983b(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public double mo5020b(ByteOrder byteOrder) {
            Object a = mo5019a(byteOrder);
            if (a == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (a instanceof String) {
                return Double.parseDouble((String) a);
            } else {
                if (a instanceof long[]) {
                    long[] jArr = (long[]) a;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (a instanceof int[]) {
                    int[] iArr = (int[]) a;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (a instanceof double[]) {
                    double[] dArr = (double[]) a;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (a instanceof C0985d[]) {
                    C0985d[] dVarArr = (C0985d[]) a;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].mo5025a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: c */
        public int mo5021c(ByteOrder byteOrder) {
            Object a = mo5019a(byteOrder);
            if (a == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (a instanceof String) {
                return Integer.parseInt((String) a);
            } else {
                if (a instanceof long[]) {
                    long[] jArr = (long[]) a;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (a instanceof int[]) {
                    int[] iArr = (int[]) a;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: d */
        public String mo5022d(ByteOrder byteOrder) {
            Object a = mo5019a(byteOrder);
            if (a == null) {
                return null;
            }
            if (a instanceof String) {
                return (String) a;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (a instanceof long[]) {
                long[] jArr = (long[]) a;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (a instanceof int[]) {
                int[] iArr = (int[]) a;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (a instanceof double[]) {
                double[] dArr = (double[]) a;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(a instanceof C0985d[])) {
                return null;
            } else {
                C0985d[] dVarArr = (C0985d[]) a;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].f3759a);
                    sb.append('/');
                    sb.append(dVarArr[i].f3760b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x019a A[SYNTHETIC, Splitter:B:138:0x019a] */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01a7 A[SYNTHETIC, Splitter:B:146:0x01a7] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo5019a(java.nio.ByteOrder r11) {
            /*
            // Method dump skipped, instructions count: 460
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.C0983b.mo5019a(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: a */
        public static C0983b m4821a(int i, ByteOrder byteOrder) {
            return m4825a(new int[]{i}, byteOrder);
        }

        /* renamed from: a */
        public static C0983b m4822a(long j, ByteOrder byteOrder) {
            return m4826a(new long[]{j}, byteOrder);
        }

        /* renamed from: a */
        public static C0983b m4823a(C0985d dVar, ByteOrder byteOrder) {
            return m4827a(new C0985d[]{dVar}, byteOrder);
        }

        /* renamed from: a */
        public static C0983b m4825a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f3708f[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C0983b(3, iArr.length, wrap.array());
        }

        /* renamed from: a */
        public static C0983b m4826a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f3708f[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C0983b(4, jArr.length, wrap.array());
        }

        /* renamed from: a */
        public static C0983b m4827a(C0985d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.f3708f[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (C0985d dVar : dVarArr) {
                wrap.putInt((int) dVar.f3759a);
                wrap.putInt((int) dVar.f3760b);
            }
            return new C0983b(5, dVarArr.length, wrap.array());
        }

        C0983b(int i, int i2, byte[] bArr) {
            this.f3752a = i;
            this.f3753b = i2;
            this.f3754c = bArr;
        }
    }

    /* renamed from: a */
    private void m4788a() {
        String a = mo4996a("DateTimeOriginal");
        if (a != null && mo4996a("DateTime") == null) {
            this.f3732J[0].put("DateTime", C0983b.m4824a(a));
        }
        if (mo4996a("ImageWidth") == null) {
            this.f3732J[0].put("ImageWidth", C0983b.m4822a(0L, this.f3734L));
        }
        if (mo4996a("ImageLength") == null) {
            this.f3732J[0].put("ImageLength", C0983b.m4822a(0L, this.f3734L));
        }
        if (mo4996a("Orientation") == null) {
            this.f3732J[0].put("Orientation", C0983b.m4822a(0L, this.f3734L));
        }
        if (mo4996a("LightSource") == null) {
            this.f3732J[1].put("LightSource", C0983b.m4822a(0L, this.f3734L));
        }
    }

    /* renamed from: a */
    private static void m4794a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private boolean m4806b(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private boolean m4812d(byte[] bArr) throws IOException {
        C0982a aVar = new C0982a(bArr);
        ByteOrder e = m4813e(aVar);
        this.f3734L = e;
        aVar.mo4999a(e);
        short readShort = aVar.readShort();
        aVar.close();
        if (readShort == 85) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.ExifInterface$c */
    public static class C0984c {

        /* renamed from: a */
        public final int f3755a;

        /* renamed from: b */
        public final String f3756b;

        /* renamed from: c */
        public final int f3757c;

        /* renamed from: d */
        public final int f3758d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5024a(int i) {
            int i2;
            int i3 = this.f3757c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f3758d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        C0984c(String str, int i, int i2) {
            this.f3756b = str;
            this.f3755a = i;
            this.f3757c = i2;
            this.f3758d = -1;
        }

        C0984c(String str, int i, int i2, int i3) {
            this.f3756b = str;
            this.f3755a = i;
            this.f3757c = i2;
            this.f3758d = i3;
        }
    }

    public ExifInterface(InputStream inputStream) throws IOException {
        C0984c[][] cVarArr = f3710h;
        this.f3732J = new HashMap[cVarArr.length];
        this.f3733K = new HashSet(cVarArr.length);
        if (inputStream != null) {
            this.f3729G = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f3730H = (AssetManager.AssetInputStream) inputStream;
            } else {
                this.f3730H = null;
            }
            m4795a(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    /* renamed from: a */
    private int m4787a(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m4798a(bArr)) {
            return 4;
        }
        if (m4806b(bArr)) {
            return 9;
        }
        if (m4809c(bArr)) {
            return 7;
        }
        if (m4812d(bArr)) {
            return 10;
        }
        return 0;
    }

    /* renamed from: b */
    private C0983b m4800b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f3710h.length; i++) {
            C0983b bVar = this.f3732J[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m4810d(C0982a aVar) throws IOException {
        m4790a(aVar);
        if (this.f3732J[0].get("JpgFromRaw") != null) {
            m4792a(aVar, this.f3744V, 5);
        }
        C0983b bVar = this.f3732J[0].get("ISO");
        C0983b bVar2 = this.f3732J[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.f3732J[1].put("PhotographicSensitivity", bVar);
        }
    }

    /* renamed from: e */
    private ByteOrder m4813e(C0982a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: f */
    private void m4814f(C0982a aVar) throws IOException {
        HashMap<String, C0983b> hashMap = this.f3732J[4];
        C0983b bVar = hashMap.get("Compression");
        if (bVar != null) {
            int c = bVar.mo5021c(this.f3734L);
            this.f3739Q = c;
            if (c != 1) {
                if (c == 6) {
                    m4793a(aVar, hashMap);
                    return;
                } else if (c != 7) {
                    return;
                }
            }
            if (m4797a((HashMap) hashMap)) {
                m4803b(aVar, hashMap);
                return;
            }
            return;
        }
        this.f3739Q = 6;
        m4793a(aVar, hashMap);
    }

    public ExifInterface(String str) throws IOException {
        Throwable th;
        C0984c[][] cVarArr = f3710h;
        this.f3732J = new HashMap[cVarArr.length];
        this.f3733K = new HashSet(cVarArr.length);
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f3730H = null;
            this.f3729G = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    m4795a((InputStream) fileInputStream2);
                    m4794a((Closeable) fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    m4794a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                m4794a((Closeable) fileInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    /* renamed from: b */
    private void m4801b(C0982a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m4792a(aVar, i, 5);
        aVar.mo4998a((long) i2);
        aVar.mo4999a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f3723u.f3755a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                C0983b a = C0983b.m4821a((int) readShort, this.f3734L);
                C0983b a2 = C0983b.m4821a((int) readShort2, this.f3734L);
                this.f3732J[0].put("ImageLength", a);
                this.f3732J[0].put("ImageWidth", a2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: c */
    private boolean m4809c(byte[] bArr) throws IOException {
        C0982a aVar = new C0982a(bArr);
        ByteOrder e = m4813e(aVar);
        this.f3734L = e;
        aVar.mo4999a(e);
        short readShort = aVar.readShort();
        aVar.close();
        if (readShort == 20306 || readShort == 21330) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m4807c(C0982a aVar) throws IOException {
        m4790a(aVar);
        C0983b bVar = this.f3732J[1].get("MakerNote");
        if (bVar != null) {
            C0982a aVar2 = new C0982a(bVar.f3754c);
            aVar2.mo4999a(this.f3734L);
            byte[] bArr = f3715m;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.mo4998a(0);
            byte[] bArr3 = f3716n;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.mo4998a(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.mo4998a(12);
            }
            m4802b(aVar2, 6);
            C0983b bVar2 = this.f3732J[7].get("PreviewImageStart");
            C0983b bVar3 = this.f3732J[7].get("PreviewImageLength");
            if (!(bVar2 == null || bVar3 == null)) {
                this.f3732J[5].put("JPEGInterchangeFormat", bVar2);
                this.f3732J[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            C0983b bVar4 = this.f3732J[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.mo5019a(this.f3734L);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    C0983b a = C0983b.m4821a(i, this.f3734L);
                    C0983b a2 = C0983b.m4821a(i2, this.f3734L);
                    this.f3732J[0].put("ImageWidth", a);
                    this.f3732J[0].put("ImageLength", a2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m4790a(C0982a aVar) throws IOException {
        C0983b bVar;
        m4791a(aVar, aVar.available());
        m4802b(aVar, 0);
        m4811d(aVar, 0);
        m4811d(aVar, 5);
        m4811d(aVar, 4);
        m4804b((InputStream) aVar);
        if (this.f3731I == 8 && (bVar = this.f3732J[1].get("MakerNote")) != null) {
            C0982a aVar2 = new C0982a(bVar.f3754c);
            aVar2.mo4999a(this.f3734L);
            aVar2.mo4998a(6);
            m4802b(aVar2, 9);
            C0983b bVar2 = this.f3732J[9].get("ColorSpace");
            if (bVar2 != null) {
                this.f3732J[1].put("ColorSpace", bVar2);
            }
        }
    }

    /* renamed from: b */
    private void m4804b(InputStream inputStream) throws IOException {
        m4789a(0, 5);
        m4789a(0, 4);
        m4789a(5, 4);
        C0983b bVar = this.f3732J[1].get("PixelXDimension");
        C0983b bVar2 = this.f3732J[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.f3732J[0].put("ImageWidth", bVar);
            this.f3732J[0].put("ImageLength", bVar2);
        }
        if (this.f3732J[4].isEmpty() && m4805b(this.f3732J[5])) {
            HashMap<String, C0983b>[] hashMapArr = this.f3732J;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m4805b(this.f3732J[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: b */
    private boolean m4805b(HashMap hashMap) throws IOException {
        C0983b bVar = (C0983b) hashMap.get("ImageLength");
        C0983b bVar2 = (C0983b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        int c = bVar.mo5021c(this.f3734L);
        int c2 = bVar2.mo5021c(this.f3734L);
        if (c > 512 || c2 > 512) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m4796a(byte[] bArr, int i) throws IOException {
        C0982a aVar = new C0982a(bArr);
        m4791a(aVar, bArr.length);
        m4802b(aVar, i);
    }

    /* renamed from: c */
    private void m4808c(C0982a aVar, int i) throws IOException {
        C0983b bVar;
        C0983b bVar2 = this.f3732J[i].get("ImageLength");
        C0983b bVar3 = this.f3732J[i].get("ImageWidth");
        if ((bVar2 == null || bVar3 == null) && (bVar = this.f3732J[i].get("JPEGInterchangeFormat")) != null) {
            m4792a(aVar, bVar.mo5021c(this.f3734L), i);
        }
    }

    /* renamed from: a */
    private void m4789a(int i, int i2) throws IOException {
        if (!this.f3732J[i].isEmpty() && !this.f3732J[i2].isEmpty()) {
            C0983b bVar = this.f3732J[i].get("ImageLength");
            C0983b bVar2 = this.f3732J[i].get("ImageWidth");
            C0983b bVar3 = this.f3732J[i2].get("ImageLength");
            C0983b bVar4 = this.f3732J[i2].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int c = bVar.mo5021c(this.f3734L);
                int c2 = bVar2.mo5021c(this.f3734L);
                int c3 = bVar3.mo5021c(this.f3734L);
                int c4 = bVar4.mo5021c(this.f3734L);
                if (c < c3 && c2 < c4) {
                    HashMap<String, C0983b>[] hashMapArr = this.f3732J;
                    HashMap<String, C0983b> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: b */
    private void m4803b(C0982a aVar, HashMap hashMap) throws IOException {
        C0983b bVar = (C0983b) hashMap.get("StripOffsets");
        C0983b bVar2 = (C0983b) hashMap.get("StripByteCounts");
        if (bVar != null && bVar2 != null) {
            long[] a = m4799a(bVar.mo5019a(this.f3734L));
            long[] a2 = m4799a(bVar2.mo5019a(this.f3734L));
            if (a == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
            } else if (a2 == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
            } else {
                long j = 0;
                for (long j2 : a2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < a.length; i4++) {
                    int i5 = (int) a[i4];
                    int i6 = (int) a2[i4];
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    aVar.mo4998a((long) i7);
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    aVar.read(bArr2);
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f3735M = true;
                this.f3738P = bArr;
                this.f3737O = i;
            }
        }
    }

    /* renamed from: d */
    private void m4811d(C0982a aVar, int i) throws IOException {
        C0983b bVar;
        C0983b bVar2;
        C0983b bVar3 = this.f3732J[i].get("DefaultCropSize");
        C0983b bVar4 = this.f3732J[i].get("SensorTopBorder");
        C0983b bVar5 = this.f3732J[i].get("SensorLeftBorder");
        C0983b bVar6 = this.f3732J[i].get("SensorBottomBorder");
        C0983b bVar7 = this.f3732J[i].get("SensorRightBorder");
        if (bVar3 != null) {
            if (bVar3.f3752a == 5) {
                C0985d[] dVarArr = (C0985d[]) bVar3.mo5019a(this.f3734L);
                if (dVarArr == null || dVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                    return;
                }
                bVar2 = C0983b.m4823a(dVarArr[0], this.f3734L);
                bVar = C0983b.m4823a(dVarArr[1], this.f3734L);
            } else {
                int[] iArr = (int[]) bVar3.mo5019a(this.f3734L);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                bVar2 = C0983b.m4821a(iArr[0], this.f3734L);
                bVar = C0983b.m4821a(iArr[1], this.f3734L);
            }
            this.f3732J[i].put("ImageWidth", bVar2);
            this.f3732J[i].put("ImageLength", bVar);
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            m4808c(aVar, i);
        } else {
            int c = bVar4.mo5021c(this.f3734L);
            int c2 = bVar6.mo5021c(this.f3734L);
            int c3 = bVar7.mo5021c(this.f3734L);
            int c4 = bVar5.mo5021c(this.f3734L);
            if (c2 > c && c3 > c4) {
                C0983b a = C0983b.m4821a(c2 - c, this.f3734L);
                C0983b a2 = C0983b.m4821a(c3 - c4, this.f3734L);
                this.f3732J[i].put("ImageLength", a);
                this.f3732J[i].put("ImageWidth", a2);
            }
        }
    }

    /* renamed from: a */
    private void m4791a(C0982a aVar, int i) throws IOException {
        ByteOrder e = m4813e(aVar);
        this.f3734L = e;
        aVar.mo4999a(e);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.f3731I;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 > 0 && aVar.skipBytes(i3) != i3) {
                throw new IOException("Couldn't jump to first Ifd: " + i3);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4802b(androidx.exifinterface.media.ExifInterface.C0982a r25, int r26) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 808
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m4802b(androidx.exifinterface.media.ExifInterface$a, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4792a(androidx.exifinterface.media.ExifInterface.C0982a r10, int r11, int r12) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m4792a(androidx.exifinterface.media.ExifInterface$a, int, int):void");
    }
}
