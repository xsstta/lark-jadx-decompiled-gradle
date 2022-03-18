package com.ss.android.lark.widget.photo_picker_impl.model;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.adapter.internal.CommonCode;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AlbumHelper {

    /* renamed from: a */
    public static final Uri f145821a = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: b */
    public static final Uri f145822b = MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI;

    /* renamed from: c */
    public static final Uri f145823c = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: d */
    public static final Uri f145824d = MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI;

    /* renamed from: e */
    public static final int[] f145825e = {4096, 4097, 4098};

    /* renamed from: f */
    private static final String f145826f = "AlbumHelper";

    /* renamed from: g */
    private static HashMap<String, SoftReference<Bitmap>> f145827g = new HashMap<>();

    /* renamed from: h */
    private static String[] f145828h = {"bucket_id", "bucket_display_name", "datetaken", "_data", "_display_name", "count(*)"};

    /* renamed from: i */
    private static String[] f145829i = {"bucket_id", "bucket_display_name", "datetaken", "_data", "_display_name", "count(*)"};

    /* renamed from: j */
    private static String[] f145830j = {"bucket_id", "bucket_display_name", "datetaken", "_data", "_id", "mime_type"};

    /* renamed from: k */
    private static String[] f145831k = {"bucket_id", "bucket_display_name", "datetaken", "_data", "_id", "_display_name", "mime_type"};

    /* renamed from: l */
    private static String[] f145832l = {"_id", "_data", "datetaken", "date_added", "latitude", "longitude", "bucket_display_name", "mime_type", "_size"};

    /* renamed from: m */
    private static String[] f145833m = {"_id", "_data", "image_id"};

    /* renamed from: n */
    private static String[] f145834n = {"_id", "_data", "mime_type", "duration", "_size", CommonCode.MapKey.HAS_RESOLUTION, "datetaken"};

    /* renamed from: o */
    private static String[] f145835o = {"_id", "_data", "video_id"};

    public enum BucketType {
        IMAGE {
            @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.BucketType
            public List<MediaInfo> getBucketData(Context context, int i) {
                return AlbumHelper.m228603a(context, i);
            }
        },
        VIDEO {
            @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.BucketType
            public List<MediaInfo> getBucketData(Context context, int i) {
                return AlbumHelper.m228610b(context, i);
            }
        },
        MEDIA {
            @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.BucketType
            public List<MediaInfo> getBucketData(Context context, int i) {
                return AlbumHelper.m228616c(context, i);
            }
        },
        IMAGE_ALL {
            @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.BucketType
            public List<MediaInfo> getBucketData(Context context, int i) {
                return AlbumHelper.m228602a(context);
            }
        },
        VIDEO_ALL {
            @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.BucketType
            public List<MediaInfo> getBucketData(Context context, int i) {
                return AlbumHelper.m228609b(context);
            }
        },
        MEDIA_ALL {
            @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.BucketType
            public List<MediaInfo> getBucketData(Context context, int i) {
                return AlbumHelper.m228615c(context);
            }
        };

        public abstract List<MediaInfo> getBucketData(Context context, int i);
    }

    public static final class BucketInfo implements Serializable {
        private static final long serialVersionUID = -2232895995725474230L;
        @SerializedName("bucketType")
        private BucketType bucketType = BucketType.MEDIA;
        @SerializedName("count")
        private int count;
        @SerializedName("coverUri")
        public Uri coverUri;
        @SerializedName("dateTaken")
        public long dateTaken;
        @SerializedName("id")
        private int id;
        @SerializedName("imgPath")
        public String imgPath = "";
        @SerializedName("mimeType")
        public String mimeType;
        @SerializedName("name")
        private String name = "";
        @SerializedName("path")
        private String path = "";
        @SerializedName("position")
        private int position = Integer.MAX_VALUE;

        public BucketType getBucketType() {
            return this.bucketType;
        }

        public int getCount() {
            return this.count;
        }

        public int getId() {
            return this.id;
        }

        public String getImgPath() {
            return this.imgPath;
        }

        public String getName() {
            return this.name;
        }

        public String getPath() {
            return this.path;
        }

        public int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return this.id;
        }

        public String toString() {
            return "BucketInfo id=" + this.id + " name=" + this.name + " count=" + this.count + " path=" + this.path + " imgPath=" + this.imgPath;
        }

        public void setBucketType(BucketType bucketType2) {
            this.bucketType = bucketType2;
        }

        public void setCount(int i) {
            this.count = i;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setImgPath(String str) {
            this.imgPath = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public void setPosition(int i) {
            this.position = i;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof BucketInfo) || this.id != ((BucketInfo) obj).getId()) {
                return false;
            }
            return true;
        }
    }

    public static final class ImageInfo extends MediaInfo {
        private static final long serialVersionUID = 5208878923301253439L;
        private String fromImage;
        @SerializedName("imagePath")
        private String imagePath;
        private String originImage;

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public int getMediaType() {
            return 1;
        }

        public String getFromImage() {
            return this.fromImage;
        }

        public String getImagePath() {
            return this.imagePath;
        }

        public String getOriginImage() {
            return this.originImage;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public String getShowImagePath() {
            return getImagePath();
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public Uri getUri() {
            return ContentUris.withAppendedId(AlbumHelper.f145821a, (long) getId());
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public Uri getThumbnailsUri() {
            if (this.thumbId > 0) {
                return ContentUris.withAppendedId(AlbumHelper.f145822b, (long) this.thumbId);
            }
            return getUri();
        }

        public void setFromImage(String str) {
            this.fromImage = str;
        }

        public void setImagePath(String str) {
            this.imagePath = str;
        }

        public void setOriginImage(String str) {
            this.originImage = str;
        }
    }

    public static abstract class MediaInfo implements Serializable, Comparable<MediaInfo> {
        private static final long serialVersionUID = 4768639343898021972L;
        @SerializedName("dateTaken")
        private long dateTaken;
        @SerializedName("extra")
        public String extra;
        @SerializedName("id")
        private int id;
        @SerializedName("imageHeight")
        private int imageHeight;
        @SerializedName("imageWidth")
        private int imageWidth;
        @SerializedName("isSelect")
        private boolean isSelect;
        @SerializedName("isValid")
        private boolean isValid = true;
        @SerializedName("mimeType")
        public String mimeType;
        @SerializedName("isSelect")
        private int position;
        @SerializedName("size")
        public long size;
        @SerializedName("thumbId")
        public int thumbId;
        @SerializedName("thumbImagePath")
        private String thumbImagePath;

        public abstract int getMediaType();

        public abstract String getShowImagePath();

        public abstract Uri getThumbnailsUri();

        public abstract Uri getUri();

        public long getDateTaken() {
            return this.dateTaken;
        }

        public int getId() {
            return this.id;
        }

        public int getImageHeight() {
            return this.imageHeight;
        }

        public int getImageWidth() {
            return this.imageWidth;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public int getPosition() {
            return this.position;
        }

        public long getSize() {
            return this.size;
        }

        public String getThumbImagePath() {
            return this.thumbImagePath;
        }

        public boolean isSelect() {
            return this.isSelect;
        }

        public boolean isValid() {
            return this.isValid;
        }

        public void setDateTaken(long j) {
            this.dateTaken = j;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setImageHeight(int i) {
            this.imageHeight = i;
        }

        public void setImageWidth(int i) {
            this.imageWidth = i;
        }

        public void setMimeType(String str) {
            this.mimeType = str;
        }

        public void setPosition(int i) {
            this.position = i;
        }

        public void setSelect(boolean z) {
            this.isSelect = z;
        }

        public void setSize(long j) {
            this.size = j;
        }

        public void setThumbImagePath(String str) {
            this.thumbImagePath = str;
        }

        public void setValid(boolean z) {
            this.isValid = z;
        }

        public int compareTo(MediaInfo mediaInfo) {
            if (mediaInfo.getDateTaken() > this.dateTaken) {
                return 1;
            }
            if (mediaInfo.getDateTaken() < this.dateTaken) {
                return -1;
            }
            return 0;
        }
    }

    public static final class VideoInfo extends MediaInfo {
        private static final long serialVersionUID = 545412099904598687L;
        @SerializedName("duration")
        private long duration;
        @SerializedName("isValid")
        private boolean isValid;
        @SerializedName(CommonCode.MapKey.HAS_RESOLUTION)
        private String resolution;
        @SerializedName("videoPath")
        public String videoPath;

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public int getMediaType() {
            return 2;
        }

        public long getDuration() {
            return this.duration;
        }

        public String getResolution() {
            return this.resolution;
        }

        public String getVideoPath() {
            return this.videoPath;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public boolean isValid() {
            return this.isValid;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public String getShowImagePath() {
            return getVideoPath();
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public Uri getUri() {
            return ContentUris.withAppendedId(AlbumHelper.f145823c, (long) getId());
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public Uri getThumbnailsUri() {
            if (this.thumbId > 0) {
                return ContentUris.withAppendedId(AlbumHelper.f145824d, (long) this.thumbId);
            }
            return getUri();
        }

        public void setDuration(long j) {
            this.duration = j;
        }

        public void setResolution(String str) {
            this.resolution = str;
        }

        @Override // com.ss.android.lark.widget.photo_picker_impl.model.AlbumHelper.MediaInfo
        public void setValid(boolean z) {
            this.isValid = z;
        }

        public void setVideoPath(String str) {
            this.videoPath = str;
        }
    }

    /* renamed from: a */
    public static List<MediaInfo> m228602a(Context context) {
        return m228604a(context, 0, true);
    }

    /* renamed from: b */
    public static List<MediaInfo> m228609b(Context context) {
        return m228611b(context, 0, true);
    }

    /* renamed from: a */
    public static boolean m228606a(String str) {
        if (TextUtils.isEmpty(str) || !m228613b(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m228613b(String str) {
        return new File(str).exists();
    }

    /* renamed from: c */
    public static List<MediaInfo> m228615c(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m228602a(context));
        arrayList.addAll(m228609b(context));
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    private static BucketInfo m228608b(Cursor cursor) {
        BucketInfo bucketInfo = new BucketInfo();
        try {
            bucketInfo.setId(cursor.getInt(cursor.getColumnIndex("bucket_id")));
            bucketInfo.setName(cursor.getString(cursor.getColumnIndex("bucket_display_name")));
            int i = cursor.getInt(cursor.getColumnIndex("_id"));
            if (i > 0) {
                bucketInfo.coverUri = ContentUris.withAppendedId(f145821a, (long) i);
            }
            bucketInfo.dateTaken = cursor.getLong(cursor.getColumnIndex("datetaken"));
            bucketInfo.mimeType = cursor.getString(cursor.getColumnIndex("mime_type"));
            bucketInfo.setImgPath(cursor.getString(cursor.getColumnIndex("_data")));
        } catch (Exception unused) {
        }
        return bucketInfo;
    }

    /* renamed from: c */
    private static BucketInfo m228614c(Cursor cursor) {
        BucketInfo bucketInfo = new BucketInfo();
        try {
            bucketInfo.setId(cursor.getInt(cursor.getColumnIndex("bucket_id")));
            bucketInfo.setName(cursor.getString(cursor.getColumnIndex("bucket_display_name")));
            int i = cursor.getInt(cursor.getColumnIndex("_id"));
            if (i > 0) {
                bucketInfo.coverUri = ContentUris.withAppendedId(f145823c, (long) i);
            }
            bucketInfo.dateTaken = cursor.getLong(cursor.getColumnIndex("datetaken"));
            bucketInfo.mimeType = cursor.getString(cursor.getColumnIndex("mime_type"));
            bucketInfo.setImgPath(cursor.getString(cursor.getColumnIndex("_data")));
        } catch (Exception unused) {
        }
        return bucketInfo;
    }

    /* renamed from: a */
    private static VideoInfo m228601a(Cursor cursor) {
        VideoInfo videoInfo = new VideoInfo();
        try {
            videoInfo.setId(cursor.getInt(cursor.getColumnIndex("_id")));
            videoInfo.setVideoPath(cursor.getString(cursor.getColumnIndex("_data")));
            videoInfo.setMimeType(cursor.getString(cursor.getColumnIndex("mime_type")));
            videoInfo.setDuration(cursor.getLong(cursor.getColumnIndex("duration")));
            videoInfo.setSize(cursor.getLong(cursor.getColumnIndex("_size")));
            videoInfo.setResolution(cursor.getString(cursor.getColumnIndex(CommonCode.MapKey.HAS_RESOLUTION)));
            videoInfo.setDateTaken(cursor.getLong(cursor.getColumnIndex("datetaken")));
            if (Build.VERSION.SDK_INT > 16) {
                videoInfo.setImageWidth(cursor.getInt(cursor.getColumnIndex("width")));
                videoInfo.setImageHeight(cursor.getInt(cursor.getColumnIndex("height")));
            }
        } catch (Exception unused) {
        }
        return videoInfo;
    }

    /* renamed from: a */
    public static List<MediaInfo> m228603a(Context context, int i) {
        return m228604a(context, i, false);
    }

    /* renamed from: b */
    public static List<MediaInfo> m228610b(Context context, int i) {
        return m228611b(context, i, false);
    }

    /* renamed from: c */
    public static List<MediaInfo> m228616c(Context context, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m228603a(context, i));
        arrayList.addAll(m228610b(context, i));
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static List<BucketInfo> m228612b(Context context, boolean z) {
        Cursor cursor;
        List<BucketInfo> list;
        try {
            cursor = context.getContentResolver().query(f145823c, f145831k, null, null, null);
        } catch (SQLiteException unused) {
            cursor = null;
        }
        if (cursor != null) {
            list = new ArrayList<>(cursor.getCount());
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                BucketInfo c = m228614c(cursor);
                if (z) {
                    c.setBucketType(BucketType.VIDEO);
                }
                list.add(c);
                cursor.moveToNext();
            }
            cursor.close();
        } else {
            list = Collections.emptyList();
        }
        if (z) {
            BucketInfo bucketInfo = new BucketInfo();
            bucketInfo.setBucketType(BucketType.VIDEO_ALL);
            bucketInfo.setName(context.getResources().getString(R.string.Lark_Legacy_PickerAllImage));
            int i = 0;
            for (BucketInfo bucketInfo2 : list) {
                i += bucketInfo2.getCount();
            }
            bucketInfo.setCount(i);
            if (list.size() > 0) {
                BucketInfo bucketInfo3 = list.get(0);
                bucketInfo.imgPath = bucketInfo3.imgPath;
                bucketInfo.dateTaken = bucketInfo3.dateTaken;
                bucketInfo.coverUri = bucketInfo3.coverUri;
                bucketInfo.mimeType = bucketInfo3.mimeType;
            }
            bucketInfo.setId(4097);
            list.add(0, bucketInfo);
        }
        return list;
    }

    /* renamed from: c */
    public static List<BucketInfo> m228617c(Context context, boolean z) {
        List<BucketInfo> a = m228605a(context, false);
        List<BucketInfo> b = m228612b(context, false);
        ArrayList<BucketInfo> arrayList = new ArrayList(a);
        arrayList.addAll(b);
        int i = 0;
        for (BucketInfo bucketInfo : arrayList) {
            i += bucketInfo.getCount();
        }
        BucketInfo bucketInfo2 = null;
        BucketInfo b2 = m228607b(context, i, arrayList.size() > 0 ? (BucketInfo) arrayList.get(0) : null);
        if (z) {
            arrayList.add(0, b2);
        }
        int i2 = 0;
        for (BucketInfo bucketInfo3 : b) {
            i2 += bucketInfo3.getCount();
        }
        if (b != null && b.size() > 0) {
            bucketInfo2 = b.get(0);
        }
        BucketInfo a2 = m228599a(context, i2, bucketInfo2);
        if (z) {
            arrayList.add(1, a2);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<BucketInfo> m228605a(Context context, boolean z) {
        Cursor cursor;
        ArrayList<BucketInfo> arrayList;
        try {
            cursor = context.getContentResolver().query(f145821a, f145830j, null, null, null);
        } catch (SQLiteException unused) {
            cursor = null;
        }
        if (cursor != null) {
            arrayList = new ArrayList(cursor.getCount());
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                BucketInfo b = m228608b(cursor);
                if (z) {
                    b.setBucketType(BucketType.IMAGE);
                }
                arrayList.add(b);
                cursor.moveToNext();
            }
            cursor.close();
        } else {
            arrayList = new ArrayList();
        }
        if (z) {
            BucketInfo bucketInfo = new BucketInfo();
            bucketInfo.setBucketType(BucketType.IMAGE_ALL);
            bucketInfo.setName(context.getResources().getString(R.string.Lark_Legacy_PickerAllImage));
            int i = 0;
            for (BucketInfo bucketInfo2 : arrayList) {
                i += bucketInfo2.getCount();
            }
            bucketInfo.setCount(i);
            if (arrayList.size() > 0) {
                BucketInfo bucketInfo3 = arrayList.get(0);
                bucketInfo.imgPath = bucketInfo3.imgPath;
                bucketInfo.dateTaken = bucketInfo3.dateTaken;
                bucketInfo.coverUri = bucketInfo3.coverUri;
                bucketInfo.mimeType = bucketInfo3.mimeType;
            }
            bucketInfo.setId(4098);
            arrayList.add(0, bucketInfo);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static BucketInfo m228599a(Context context, int i, BucketInfo bucketInfo) {
        BucketInfo bucketInfo2 = new BucketInfo();
        bucketInfo2.setBucketType(BucketType.VIDEO_ALL);
        bucketInfo2.setName(context.getResources().getString(R.string.Lark_Legacy_PickerAllImage));
        if (bucketInfo != null) {
            bucketInfo2.coverUri = bucketInfo.coverUri;
            bucketInfo2.dateTaken = bucketInfo.dateTaken;
            bucketInfo2.imgPath = bucketInfo.imgPath;
            bucketInfo2.mimeType = bucketInfo.mimeType;
        }
        bucketInfo2.setId(4097);
        bucketInfo2.setCount(i);
        return bucketInfo2;
    }

    /* renamed from: b */
    private static BucketInfo m228607b(Context context, int i, BucketInfo bucketInfo) {
        BucketInfo bucketInfo2 = new BucketInfo();
        bucketInfo2.setBucketType(BucketType.MEDIA_ALL);
        bucketInfo2.setName(context.getResources().getString(R.string.Lark_Legacy_PickerAllImage));
        if (bucketInfo != null) {
            bucketInfo2.coverUri = bucketInfo.coverUri;
            bucketInfo2.dateTaken = bucketInfo.dateTaken;
            bucketInfo2.imgPath = bucketInfo.imgPath;
            bucketInfo2.mimeType = bucketInfo.mimeType;
        }
        bucketInfo2.setId(4096);
        bucketInfo2.setCount(i);
        return bucketInfo2;
    }

    /* renamed from: a */
    private static ImageInfo m228600a(Context context, Cursor cursor, int i) {
        ImageInfo imageInfo = new ImageInfo();
        try {
            imageInfo.setId(cursor.getInt(cursor.getColumnIndex("_id")));
            imageInfo.setImagePath(cursor.getString(cursor.getColumnIndex("_data")));
            imageInfo.setDateTaken(cursor.getLong(cursor.getColumnIndex("datetaken")));
            imageInfo.setMimeType(cursor.getString(cursor.getColumnIndex("mime_type")));
            imageInfo.setSize(cursor.getLong(cursor.getColumnIndex("_size")));
        } catch (Exception unused) {
        }
        return imageInfo;
    }

    /* renamed from: a */
    private static List<MediaInfo> m228604a(Context context, int i, boolean z) {
        String str;
        Cursor cursor;
        if (context == null) {
            return new ArrayList();
        }
        if (z) {
            str = null;
        } else {
            str = "bucket_id = ?";
        }
        String[] strArr = z ? null : new String[]{String.valueOf(i)};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Cursor query = context.getContentResolver().query(f145822b, f145833m, null, null, null);
            if (query != null) {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    int i2 = query.getInt(query.getColumnIndex("image_id"));
                    int i3 = query.getInt(query.getColumnIndex("_id"));
                    hashMap.put(Integer.valueOf(i2), query.getString(query.getColumnIndex("_data")));
                    hashMap2.put(Integer.valueOf(i2), Integer.valueOf(i3));
                    query.moveToNext();
                }
                query.close();
                Logger.m15167d(f145826f, "ThumbImage isAll = true, image num = " + query.getCount() + ", spend time = " + (System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (Exception unused) {
            Logger.m15167d(f145826f, "ThumbImage isAll = true, image num = " + hashMap.size() + ", spend time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            cursor = context.getContentResolver().query(f145821a, f145832l, str, strArr, "date_modified DESC");
        } catch (SQLiteException unused2) {
            cursor = null;
        }
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            cursor.moveToFirst();
            int i4 = 0;
            while (!cursor.isAfterLast()) {
                int i5 = i4 + 1;
                ImageInfo a = m228600a(context, cursor, i4);
                if (m228606a(a.getShowImagePath())) {
                    arrayList.add(a);
                }
                cursor.moveToNext();
                i4 = i5;
            }
            Logger.m15167d(f145826f, "Image isAll = " + z + ", image num = " + cursor.getCount() + ", spend time = " + (System.currentTimeMillis() - currentTimeMillis2));
            cursor.close();
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            try {
                MediaInfo mediaInfo = (MediaInfo) arrayList.get(i6);
                int id = mediaInfo.getId();
                mediaInfo.setThumbImagePath((String) hashMap.get(Integer.valueOf(id)));
                Integer num = (Integer) hashMap2.get(Integer.valueOf(id));
                if (num != null) {
                    mediaInfo.thumbId = num.intValue();
                }
            } catch (Exception unused3) {
                Log.m165383e(f145826f, "get image exception");
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static List<MediaInfo> m228611b(Context context, int i, boolean z) {
        List<MediaInfo> list;
        if (context == null) {
            return new ArrayList();
        }
        Cursor cursor = null;
        String str = z ? null : "bucket_id = ?";
        String[] strArr = z ? null : new String[]{String.valueOf(i)};
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            Cursor query = context.getContentResolver().query(f145824d, f145835o, null, null, null);
            if (query != null) {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    int i2 = query.getInt(query.getColumnIndex("video_id"));
                    int i3 = query.getInt(query.getColumnIndex("_id"));
                    hashMap.put(Integer.valueOf(i2), query.getString(query.getColumnIndex("_data")));
                    hashMap2.put(Integer.valueOf(i2), Integer.valueOf(i3));
                    query.moveToNext();
                }
                query.close();
            }
        } catch (Exception unused) {
            Log.m165383e(f145826f, "thumbCursor exception");
        }
        try {
            if (Build.VERSION.SDK_INT >= 16) {
                cursor = context.getContentResolver().query(f145823c, new String[]{"_id", "_data", "mime_type", "duration", "_size", CommonCode.MapKey.HAS_RESOLUTION, "datetaken", "width", "height"}, str, strArr, "date_modified DESC");
            } else {
                cursor = context.getContentResolver().query(f145823c, f145834n, str, strArr, "date_modified DESC");
            }
        } catch (SQLiteException unused2) {
            Log.m165383e(f145826f, "database is locked");
        }
        if (cursor != null) {
            list = new ArrayList<>(cursor.getCount());
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                VideoInfo a = m228601a(cursor);
                if (a.videoPath != null && m228613b(a.videoPath)) {
                    list.add(a);
                }
                cursor.moveToNext();
            }
            cursor.close();
        } else {
            list = Collections.emptyList();
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            try {
                MediaInfo mediaInfo = list.get(i4);
                int id = mediaInfo.getId();
                mediaInfo.setThumbImagePath((String) hashMap.get(Integer.valueOf(id)));
                Integer num = (Integer) hashMap2.get(Integer.valueOf(id));
                if (num != null) {
                    mediaInfo.thumbId = num.intValue();
                }
            } catch (Exception unused3) {
                Log.m165383e(f145826f, "video cursor exception");
            }
        }
        return list;
    }
}
