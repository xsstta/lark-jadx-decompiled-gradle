package com.bytedance.ee.bear.drive.mimetype;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.bytedance.common.utility.Lists;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.ArchiveTreeProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.NoDownloadProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.NotSupportProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.OggFileProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.PdfStreamingProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.ProgressiveImageProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.SimilarFileProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.TransDownloadProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.TransHtmlProcessor;
import com.bytedance.ee.bear.drive.loader.download.platform.processor.VideoStreamingProcessor;
import com.bytedance.ee.bear.drive.view.preview.archive.ArchivePreviewView;
import com.bytedance.ee.bear.drive.view.preview.loadingview.ApkLoadingView;
import com.bytedance.ee.bear.drive.view.preview.loadingview.AudioLoadingView;
import com.bytedance.ee.bear.drive.view.preview.loadingview.DocumentLoadingView;
import com.bytedance.ee.bear.drive.view.preview.loadingview.ImageLoadingView;
import com.bytedance.ee.bear.drive.view.preview.loadingview.NotSupportLoadingView;
import com.bytedance.ee.bear.drive.view.preview.loadingview.PdfLoadingView;
import com.bytedance.ee.bear.drive.view.preview.loadingview.VideoViewLoadingView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ApkPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AudioPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.DocumentPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ImagePreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.NotSupportPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.PdfPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.VideoPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.WpsPreviewView;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.mimetype.d */
public class C7096d {

    /* renamed from: a */
    private static final SparseArray<String> f19121a;

    /* renamed from: b */
    private static final SparseArray<Class> f19122b;

    /* renamed from: c */
    private static final SparseArray<Class> f19123c;

    /* renamed from: d */
    private static final SparseArray<Class> f19124d;

    /* renamed from: e */
    private static final SparseIntArray f19125e;

    /* renamed from: f */
    private static final SparseIntArray f19126f = new SparseIntArray(6);

    /* renamed from: a */
    public static int m28340a() {
        return 1;
    }

    /* renamed from: b */
    public static int m28345b() {
        return 1;
    }

    /* renamed from: c */
    public static int m28348c() {
        return 1;
    }

    /* renamed from: d */
    public static int m28350d() {
        return 1;
    }

    /* renamed from: e */
    public static int m28352e(int i) {
        if (i == 0) {
            return 9;
        }
        return i;
    }

    /* renamed from: e */
    public static List<Integer> m28353e() {
        return Collections.singletonList(-1);
    }

    /* renamed from: f */
    public static List<Integer> m28354f() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(-3);
        return arrayList;
    }

    /* renamed from: g */
    public static List<Integer> m28355g() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(-3);
        arrayList.add(-2);
        arrayList.add(-1);
        return arrayList;
    }

    /* renamed from: h */
    public static List<Integer> m28356h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(9);
        return arrayList;
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>(10);
        f19121a = sparseArray;
        SparseArray<Class> sparseArray2 = new SparseArray<>(6);
        f19122b = sparseArray2;
        SparseArray<Class> sparseArray3 = new SparseArray<>(6);
        f19123c = sparseArray3;
        SparseArray<Class> sparseArray4 = new SparseArray<>(6);
        f19124d = sparseArray4;
        SparseIntArray sparseIntArray = new SparseIntArray(6);
        f19125e = sparseIntArray;
        sparseArray2.put(9, PdfStreamingProcessor.class);
        sparseArray2.put(3, VideoStreamingProcessor.class);
        sparseArray2.put(0, TransDownloadProcessor.class);
        sparseArray2.put(1, TransDownloadProcessor.class);
        sparseArray2.put(7, TransDownloadProcessor.class);
        sparseArray2.put(2, TransDownloadProcessor.class);
        sparseArray2.put(8, TransHtmlProcessor.class);
        sparseArray2.put(-3, NoDownloadProcessor.class);
        sparseArray2.put(-2, SimilarFileProcessor.class);
        sparseArray2.put(-1, NotSupportProcessor.class);
        sparseArray2.put(11, ProgressiveImageProcessor.class);
        sparseArray2.put(13, ArchiveTreeProcessor.class);
        sparseArray2.put(14, TransDownloadProcessor.class);
        sparseArray2.put(20, OggFileProcessor.class);
        sparseArray.put(9, "PDF");
        sparseArray.put(0, "PDF");
        sparseArray.put(1, "PNG");
        sparseArray.put(7, "JPG");
        sparseArray.put(2, "PAGES");
        sparseArray.put(8, "HTML");
        sparseArray.put(3, "MP4");
        sparseArray.put(14, "TXT");
        sparseArray3.put(1, NotSupportPreviewView.class);
        sparseArray3.put(2, DocumentPreviewView.class);
        sparseArray3.put(3, ImagePreviewView.class);
        sparseArray3.put(4, AudioPreviewView.class);
        sparseArray3.put(5, VideoPreviewView.class);
        sparseArray3.put(6, PdfPreviewView.class);
        sparseArray3.put(7, ApkPreviewView.class);
        sparseArray3.put(8, ArchivePreviewView.class);
        sparseArray3.put(9, WpsPreviewView.class);
        sparseArray4.put(1, NotSupportLoadingView.class);
        sparseArray4.put(2, DocumentLoadingView.class);
        sparseArray4.put(3, ImageLoadingView.class);
        sparseArray4.put(4, AudioLoadingView.class);
        sparseArray4.put(5, VideoViewLoadingView.class);
        sparseArray4.put(6, PdfLoadingView.class);
        sparseArray4.put(7, ApkLoadingView.class);
        sparseIntArray.put(1, R.string.Drive_Drive_DefaultFileType);
        sparseIntArray.put(2, R.string.Drive_Drive_DocumentType);
        sparseIntArray.put(3, R.string.Drive_Drive_ImageType);
        sparseIntArray.put(4, R.string.Drive_Drive_AudioType);
        sparseIntArray.put(5, R.string.Drive_Drive_VideoType);
        sparseIntArray.put(6, R.string.Drive_Drive_PdfType);
        sparseIntArray.put(7, R.string.Drive_Drive_ApkType);
    }

    /* renamed from: a */
    public static int m28341a(String str) {
        return C7713a.m30841a(str);
    }

    /* renamed from: a */
    public static Class m28342a(int i) {
        return f19123c.get(i);
    }

    /* renamed from: b */
    public static Class m28346b(int i) {
        return f19124d.get(i);
    }

    /* renamed from: c */
    public static int m28349c(int i) {
        return f19125e.get(i, R.string.Drive_Drive_DefaultFileType);
    }

    /* renamed from: d */
    public static Class m28351d(int i) {
        return f19122b.get(i, NotSupportProcessor.class);
    }

    /* renamed from: a */
    public static boolean m28344a(List<Integer> list) {
        return Lists.deepEquals(m28353e(), list);
    }

    /* renamed from: a */
    public static String m28343a(int i, String str) {
        SparseArray<String> sparseArray = f19121a;
        if (TextUtils.isEmpty(str)) {
            str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        return sparseArray.get(i, str);
    }

    /* renamed from: b */
    public static String m28347b(int i, String str) {
        if (i == 11) {
            return "JPG";
        }
        if (i == 12) {
            return "PNG";
        }
        if (i == 20) {
            return str;
        }
        return f19121a.get(i, null);
    }
}
