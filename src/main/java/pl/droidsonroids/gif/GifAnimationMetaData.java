package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Locale;

public class GifAnimationMetaData implements Parcelable, Serializable {
    public static final Parcelable.Creator<GifAnimationMetaData> CREATOR = new Parcelable.Creator<GifAnimationMetaData>() {
        /* class pl.droidsonroids.gif.GifAnimationMetaData.C701401 */

        /* renamed from: a */
        public GifAnimationMetaData[] newArray(int i) {
            return new GifAnimationMetaData[i];
        }

        /* renamed from: a */
        public GifAnimationMetaData createFromParcel(Parcel parcel) {
            return new GifAnimationMetaData(parcel);
        }
    };
    private static final long serialVersionUID = 5692363926580237325L;
    private final int mDuration;
    private final int mHeight;
    private final int mImageCount;
    private final int mLoopCount;
    private final long mMetadataBytesCount;
    private final long mPixelsBytesCount;
    private final int mWidth;

    public int describeContents() {
        return 0;
    }

    public long getAllocationByteCount() {
        return this.mPixelsBytesCount;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getLoopCount() {
        return this.mLoopCount;
    }

    public long getMetadataAllocationByteCount() {
        return this.mMetadataBytesCount;
    }

    public int getNumberOfFrames() {
        return this.mImageCount;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public GifAnimationMetaData(byte[] bArr) throws IOException {
        this(new GifInfoHandle(bArr));
    }

    public GifAnimationMetaData(ByteBuffer byteBuffer) throws IOException {
        this(new GifInfoHandle(byteBuffer));
    }

    private GifAnimationMetaData(GifInfoHandle gifInfoHandle) {
        this.mLoopCount = gifInfoHandle.mo247206e();
        this.mDuration = gifInfoHandle.mo247209g();
        this.mWidth = gifInfoHandle.mo247218p();
        this.mHeight = gifInfoHandle.mo247219q();
        this.mImageCount = gifInfoHandle.mo247220r();
        this.mMetadataBytesCount = gifInfoHandle.mo247214l();
        this.mPixelsBytesCount = gifInfoHandle.mo247213k();
        gifInfoHandle.mo247197a();
    }

    public boolean isAnimated() {
        if (this.mImageCount <= 1 || this.mDuration <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        int i = this.mLoopCount;
        if (i == 0) {
            str = "Infinity";
        } else {
            str = Integer.toString(i);
        }
        String format = String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d", Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.mImageCount), str, Integer.valueOf(this.mDuration));
        if (!isAnimated()) {
            return format;
        }
        return "Animated " + format;
    }

    public GifAnimationMetaData(AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor));
    }

    private GifAnimationMetaData(Parcel parcel) {
        this.mLoopCount = parcel.readInt();
        this.mDuration = parcel.readInt();
        this.mHeight = parcel.readInt();
        this.mWidth = parcel.readInt();
        this.mImageCount = parcel.readInt();
        this.mMetadataBytesCount = parcel.readLong();
        this.mPixelsBytesCount = parcel.readLong();
    }

    public GifAnimationMetaData(File file) throws IOException {
        this(file.getPath());
    }

    public GifAnimationMetaData(FileDescriptor fileDescriptor) throws IOException {
        this(new GifInfoHandle(fileDescriptor));
    }

    public GifAnimationMetaData(InputStream inputStream) throws IOException {
        this(new GifInfoHandle(inputStream));
    }

    public GifAnimationMetaData(String str) throws IOException {
        this(new GifInfoHandle(str));
    }

    public GifAnimationMetaData(ContentResolver contentResolver, Uri uri) throws IOException {
        this(GifInfoHandle.m268882a(contentResolver, uri));
    }

    public GifAnimationMetaData(AssetManager assetManager, String str) throws IOException {
        this(assetManager.openFd(str));
    }

    public GifAnimationMetaData(Resources resources, int i) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mLoopCount);
        parcel.writeInt(this.mDuration);
        parcel.writeInt(this.mHeight);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mImageCount);
        parcel.writeLong(this.mMetadataBytesCount);
        parcel.writeLong(this.mPixelsBytesCount);
    }

    public long getDrawableAllocationByteCount(C70149c cVar, int i) {
        int i2;
        if (i < 1 || i > 65535) {
            throw new IllegalStateException("Sample size " + i + " out of range <1, " + (char) 65535 + ">");
        }
        int i3 = i * i;
        if (cVar == null || cVar.f175252e.isRecycled()) {
            i2 = ((this.mWidth * this.mHeight) * 4) / i3;
        } else if (Build.VERSION.SDK_INT >= 19) {
            i2 = cVar.f175252e.getAllocationByteCount();
        } else {
            i2 = cVar.mo247280e();
        }
        return (this.mPixelsBytesCount / ((long) i3)) + ((long) i2);
    }
}
