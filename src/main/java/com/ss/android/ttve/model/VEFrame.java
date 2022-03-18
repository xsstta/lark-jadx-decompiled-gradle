package com.ss.android.ttve.model;

import android.graphics.Bitmap;
import android.media.Image;
import android.opengl.EGLContext;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.C64082w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class VEFrame implements Parcelable {
    public static final Parcelable.Creator<VEFrame> CREATOR = new Parcelable.Creator<VEFrame>() {
        /* class com.ss.android.ttve.model.VEFrame.C602061 */

        /* renamed from: a */
        public VEFrame[] newArray(int i) {
            return new VEFrame[i];
        }

        /* renamed from: a */
        public VEFrame createFromParcel(Parcel parcel) {
            return new VEFrame(parcel);
        }
    };
    protected ETEPixelFormat format = ETEPixelFormat.TEPixFmt_Count;
    protected boolean fromFrontCamera;
    protected int height;
    protected FrameBase mInternalFrame;
    protected int rotation;
    protected long timeStamp;
    protected int width;

    public enum ETEPixelFormat {
        TEPixFmt_YUV420P,
        TEPixFmt_YUYV422,
        TEPixFmt_YUV422P,
        TEPixFmt_UYVY422,
        TEPixFmt_NV12,
        TEPixFmt_NV21,
        TEPixFmt_GRAY8,
        TEPixFmt_RGB8,
        TEPixFmt_BGR8,
        TEPixFmt_RGB233,
        TEPixFmt_BGR233,
        TEPixFmt_ARGB8,
        TEPixFmt_RGBA8,
        TEPixFmt_BGRA8,
        TEPixFmt_OpenGL_RGB8,
        TEPixFmt_OpenGL_RGBA8,
        TEPIXEL_FORMAT_JPEG,
        TEPIXEL_FORMAT_YUV420,
        TEPixFmt_OpenGL_RGB565,
        TEPixFmt_RGB565,
        TEPixFmt_Count
    }

    public enum Operation {
        OP_SCALE,
        OP_ROTATION,
        OP_CONVERT,
        OP_COPY
    }

    public int describeContents() {
        return 0;
    }

    public static class ByteArrayFrame extends FrameBase {
        byte[] byteArray;

        public byte[] getByteArray() {
            return this.byteArray;
        }

        public ByteArrayFrame(byte[] bArr) {
            this.byteArray = bArr;
        }
    }

    public static class ByteBufferFrame extends FrameBase {
        ByteBuffer byteBuffer;

        public ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        public ByteBufferFrame(ByteBuffer byteBuffer2) {
            this.byteBuffer = byteBuffer2;
        }
    }

    public static class FrameBase implements Parcelable {
        public static final Parcelable.Creator<FrameBase> CREATOR = new Parcelable.Creator<FrameBase>() {
            /* class com.ss.android.ttve.model.VEFrame.FrameBase.C602081 */

            /* renamed from: a */
            public FrameBase[] newArray(int i) {
                return new FrameBase[i];
            }

            /* renamed from: a */
            public FrameBase createFromParcel(Parcel parcel) {
                return new FrameBase(parcel);
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }

        public FrameBase() {
        }

        protected FrameBase(Parcel parcel) {
        }
    }

    public static class IntArrayFrame extends FrameBase {
        int[] intArray;

        public int[] getIntArray() {
            return this.intArray;
        }

        public IntArrayFrame(int[] iArr) {
            this.intArray = iArr;
        }
    }

    public ETEPixelFormat getFormat() {
        return this.format;
    }

    public FrameBase getFrame() {
        return this.mInternalFrame;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isFromFrontCamera() {
        return this.fromFrontCamera;
    }

    public static class YUVPlansFrame extends FrameBase {
        C60214e planes;

        public Image.Plane[] getPlanes() {
            return this.planes.mo205704a();
        }

        public YUVPlansFrame(C60214e eVar) {
            this.planes = eVar;
        }
    }

    public int getFormatOrdinal() {
        return this.format.ordinal();
    }

    /* renamed from: com.ss.android.ttve.model.VEFrame$2 */
    static /* synthetic */ class C602072 {

        /* renamed from: a */
        static final /* synthetic */ int[] f150275a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.ttve.model.VEFrame$ETEPixelFormat[] r0 = com.ss.android.ttve.model.VEFrame.ETEPixelFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.ttve.model.VEFrame.C602072.f150275a = r0
                com.ss.android.ttve.model.VEFrame$ETEPixelFormat r1 = com.ss.android.ttve.model.VEFrame.ETEPixelFormat.TEPIXEL_FORMAT_YUV420     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.ttve.model.VEFrame.C602072.f150275a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.ttve.model.VEFrame$ETEPixelFormat r1 = com.ss.android.ttve.model.VEFrame.ETEPixelFormat.TEPIXEL_FORMAT_JPEG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.model.VEFrame.C602072.<clinit>():void");
        }
    }

    public Image.Plane[] getYUVPlanes() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            C63929ab.m250980d("VEFrame", "get yuv data failed, no internal frame!");
            return null;
        } else if (frameBase instanceof YUVPlansFrame) {
            return ((YUVPlansFrame) frameBase).getPlanes();
        } else {
            return null;
        }
    }

    public byte[] getJpegData() {
        if (this.mInternalFrame == null) {
            C63929ab.m250980d("VEFrame", "get jpeg data failed, no internal frame!");
            return null;
        } else if (this.format != ETEPixelFormat.TEPIXEL_FORMAT_JPEG) {
            C63929ab.m250980d("VEFrame", "get jpeg data failed, internal frame format: " + this.format);
            return null;
        } else {
            FrameBase frameBase = this.mInternalFrame;
            if (frameBase instanceof ByteArrayFrame) {
                return ((ByteArrayFrame) frameBase).getByteArray();
            }
            return null;
        }
    }

    public Bitmap toBitmap() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            return null;
        }
        if ((frameBase instanceof ByteBufferFrame) && this.format == ETEPixelFormat.TEPixFmt_RGBA8 && this.rotation == 0) {
            ByteBuffer byteBuffer = ((ByteBufferFrame) this.mInternalFrame).byteBuffer;
            byteBuffer.rewind();
            Bitmap createBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer);
            return createBitmap;
        }
        throw new UnsupportedOperationException("Conversion to bitmap is not supported!!!");
    }

    public void setFromFrontCamera(boolean z) {
        this.fromFrontCamera = z;
    }

    public static ByteBuffer allocateFrame(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    protected VEFrame(Parcel parcel) {
        ETEPixelFormat eTEPixelFormat;
        boolean z;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            eTEPixelFormat = null;
        } else {
            eTEPixelFormat = ETEPixelFormat.values()[readInt];
        }
        this.format = eTEPixelFormat;
        this.mInternalFrame = (FrameBase) parcel.readParcelable(FrameBase.class.getClassLoader());
        this.rotation = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.timeStamp = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.fromFrontCamera = z;
    }

    public void dumpImageToPath(String str) {
        if (this.mInternalFrame == null) {
            C63929ab.m250980d("VEFrame", "dump image failed! internal frame is null!");
            return;
        }
        String str2 = str + "_VEFrame" + ("_" + this.width + "x" + this.height) + ("_" + System.currentTimeMillis());
        int i = C602072.f150275a[this.format.ordinal()];
        if (i == 1) {
            String str3 = str2 + "_YUV420.yuv";
            C63929ab.m250974a("VEFrame", "Start to dump VEFrame to " + str3);
            C64082w.m251468a(getYUVPlanes(), this.width, this.height, str3);
        } else if (i != 2) {
            C63929ab.m250980d("VEFrame", "unexpected dump image format: " + this.format);
        } else {
            String str4 = str2 + "_JPEG.jpeg";
            C63929ab.m250974a("VEFrame", "Start to dump VEFrame to " + str4);
            C64082w.m251467a(getJpegData(), str4);
        }
    }

    public static class TextureFrame extends FrameBase {

        /* renamed from: a */
        public EGLContext f150276a;

        /* renamed from: b */
        public int f150277b;

        public TextureFrame(EGLContext eGLContext, int i) {
            this.f150276a = eGLContext;
            this.f150277b = i;
        }
    }

    public static VEFrame createByteBufferFrame(Bitmap bitmap, long j) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        ByteBuffer order = ByteBuffer.allocateDirect(bitmap.getByteCount()).order(ByteOrder.LITTLE_ENDIAN);
        bitmap.copyPixelsToBuffer(order);
        VEFrame vEFrame = new VEFrame(bitmap.getWidth(), bitmap.getHeight(), 0, j, ETEPixelFormat.TEPixFmt_RGBA8);
        vEFrame.mInternalFrame = new ByteBufferFrame(order);
        return vEFrame;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        ETEPixelFormat eTEPixelFormat = this.format;
        if (eTEPixelFormat == null) {
            i2 = -1;
        } else {
            i2 = eTEPixelFormat.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.mInternalFrame, i);
        parcel.writeInt(this.rotation);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.timeStamp);
        parcel.writeByte(this.fromFrontCamera ? (byte) 1 : 0);
    }

    public VEFrame(int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.timeStamp = j;
        this.format = eTEPixelFormat;
    }

    private static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, int i4) {
        return createByteBufferFrame(byteBuffer, i, i2, i3, j, ETEPixelFormat.values()[i4]);
    }

    public static VEFrame createByteArrayFrame(byte[] bArr, int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new ByteArrayFrame(bArr);
        return vEFrame;
    }

    public static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new ByteBufferFrame(byteBuffer);
        return vEFrame;
    }

    public static VEFrame createIntArrayFrame(int[] iArr, int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new IntArrayFrame(iArr);
        return vEFrame;
    }

    public static VEFrame createYUVPlanFrame(C60214e eVar, int i, int i2, int i3, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i, i2, i3, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new YUVPlansFrame(eVar);
        return vEFrame;
    }

    public static VEFrame createTextureFrame(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, ETEPixelFormat eTEPixelFormat) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j, eTEPixelFormat);
        vEFrame.mInternalFrame = new TextureFrame(eGLContext, i);
        return vEFrame;
    }
}
