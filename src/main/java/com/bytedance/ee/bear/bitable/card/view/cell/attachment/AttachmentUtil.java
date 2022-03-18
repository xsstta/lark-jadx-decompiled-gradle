package com.bytedance.ee.bear.bitable.card.view.cell.attachment;

import com.bytedance.ee.util.io.C13675f;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.suite.R;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/AttachmentUtil;", "", "()V", "BOX_AE_FILE_TYPE", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/AttachmentUtil$FileTypeConfig;", "BOX_AI_FILE_TYPE", "BOX_APK_FILE_TYPE", "BOX_ARCHIVE_FILE_TYPE", "BOX_AUDIO_FILE_TYPE", "BOX_EXCEL_FILE_TYPE", "BOX_IMAGE_FILE_TYPE", "BOX_KEY_FILE_TYPE", "BOX_PDF_FILE_TYPE", "BOX_PPT_FILE_TYPE", "BOX_PREVIEWABLE_CODE_FILE_TYPES", "BOX_PSD_FILE_TYPE", "BOX_SKETCH_FILE_TYPE", "BOX_TXT_FILE_TYPE", "BOX_UNKNOWN_FILE_TYPE", "BOX_VIDEO_FILE_TYPE", "BOX_WORD_FILE_TYPE", "boxFileIconLookupList", "", "[Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/AttachmentUtil$FileTypeConfig;", "coverSupportList", "getFileTypeRes", "fileName", "", "isSupportCover", "", "isVideoFile", "FileTypeConfig", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.b */
public final class AttachmentUtil {

    /* renamed from: a */
    public static final AttachmentUtil f13504a = new AttachmentUtil();

    /* renamed from: b */
    private static final FileTypeConfig f13505b;

    /* renamed from: c */
    private static final FileTypeConfig f13506c;

    /* renamed from: d */
    private static final FileTypeConfig f13507d;

    /* renamed from: e */
    private static final FileTypeConfig f13508e;

    /* renamed from: f */
    private static final FileTypeConfig f13509f;

    /* renamed from: g */
    private static final FileTypeConfig f13510g;

    /* renamed from: h */
    private static final FileTypeConfig f13511h;

    /* renamed from: i */
    private static final FileTypeConfig f13512i;

    /* renamed from: j */
    private static final FileTypeConfig f13513j;

    /* renamed from: k */
    private static final FileTypeConfig f13514k;

    /* renamed from: l */
    private static final FileTypeConfig f13515l;

    /* renamed from: m */
    private static final FileTypeConfig f13516m;

    /* renamed from: n */
    private static final FileTypeConfig f13517n;

    /* renamed from: o */
    private static final FileTypeConfig f13518o;

    /* renamed from: p */
    private static final FileTypeConfig f13519p;

    /* renamed from: q */
    private static final FileTypeConfig f13520q;

    /* renamed from: r */
    private static final FileTypeConfig f13521r = new FileTypeConfig(new String[0], R.drawable.ud_icon_file_unknow_colorful, R.color.attachment_box_unknown_file_type_bg);

    /* renamed from: s */
    private static final FileTypeConfig[] f13522s;

    /* renamed from: t */
    private static final FileTypeConfig[] f13523t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/AttachmentUtil$FileTypeConfig;", "", "typeList", "", "", "iconResId", "", "backgroundColorResId", "([Ljava/lang/String;II)V", "getBackgroundColorResId", "()I", "setBackgroundColorResId", "(I)V", "getIconResId", "setIconResId", "getTypeList", "()[Ljava/lang/String;", "setTypeList", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.b$a */
    public static final class FileTypeConfig {

        /* renamed from: a */
        private String[] f13524a;

        /* renamed from: b */
        private int f13525b;

        /* renamed from: c */
        private int f13526c;

        /* renamed from: a */
        public final String[] mo18021a() {
            return this.f13524a;
        }

        /* renamed from: b */
        public final int mo18022b() {
            return this.f13525b;
        }

        /* renamed from: c */
        public final int mo18023c() {
            return this.f13526c;
        }

        public FileTypeConfig(String[] strArr, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(strArr, "typeList");
            this.f13524a = strArr;
            this.f13525b = i;
            this.f13526c = i2;
        }
    }

    private AttachmentUtil() {
    }

    static {
        FileTypeConfig aVar = new FileTypeConfig(new String[]{"bmp", "gif", "ico", "jpeg", "jpg", "png", "raw", "svg", "tif", "tiff", "webp", "sketch", "heic", "heif", "3fr", "arw", "cr2", "crw", "dcr", "dcs", "dng", "dwg", "erf", "kdc", "mef", "mos", "mrw", "nef", "nrw", "orf", "pef", "ppm", "r3d", "raf", "rw2", "rwl", "sr2", "svgz", "wbmp", "x3f", "ai", "psd", "psb"}, R.drawable.ud_icon_file_image_colorful, R.color.ud_Y100);
        f13505b = aVar;
        FileTypeConfig aVar2 = new FileTypeConfig(new String[]{"3gp", "3gpp", "3gpp2", "asf", "avi", "dv", "f4v", "flv", "m2t", "m4v", "mkv", "mov", "mp4", "mpe", "mpeg", "mpg", "mts", "mxf", "ogv", "rm", "rmvb", "vob", "webm", "wmv", "ts"}, R.drawable.ud_icon_file_video_colorful, R.color.ud_B100);
        f13506c = aVar2;
        FileTypeConfig aVar3 = new FileTypeConfig(new String[]{"aac", "amr", "au", "cda", "flac", "m4a", "mp3", "oga", "ogg", "wav", "wma", "m4r", "air", "aiff"}, R.drawable.ud_icon_file_audio_colorful, R.color.ud_G100);
        f13507d = aVar3;
        FileTypeConfig aVar4 = new FileTypeConfig(new String[]{"rtf", "txt"}, R.drawable.ud_icon_file_text_colorful, R.color.ud_B100);
        f13508e = aVar4;
        FileTypeConfig aVar5 = new FileTypeConfig(new String[]{"docx", "doc", "dotx", "dot", "dotm"}, R.drawable.ud_icon_file_word_colorful, R.color.ud_B100);
        f13509f = aVar5;
        FileTypeConfig aVar6 = new FileTypeConfig(new String[]{"xlsx", "xls", "xlsm", "xlm", "xlsb", "csv"}, R.drawable.ud_icon_file_excel_colorful, R.color.ud_G100);
        f13510g = aVar6;
        FileTypeConfig aVar7 = new FileTypeConfig(new String[]{"pptx", "ppt", "pps", "ppsx", "potx", "pot", "pptm", "potm", "ppsm"}, R.drawable.ud_icon_file_ppt_colorful, R.color.ud_O100);
        f13511h = aVar7;
        FileTypeConfig aVar8 = new FileTypeConfig(new String[]{"7z", "rar", "tar", "gz", "zip", "bz2", "cab", "zipx", "jar", "ace", "arj", "lzh", "z", "bz", "cpio", "iso", "lha", "lz", "lzma", "tbz", "taz", "tbz2", "tgz", "tlz", "txz", "tz", "xar", "xz"}, R.drawable.ud_icon_file_zip_colorful, R.color.ud_B100);
        f13512i = aVar8;
        FileTypeConfig aVar9 = new FileTypeConfig(new String[]{C60375c.f150914a, C14002h.f36692e, "m", "cpp", "swift", "html", "htm", "css", "js", "java", "py", "php", "xml", "go", "rb", "cs", "sh", "bash", "sql", "scss", "less", "tsx", "jsx", "log", "ejs", "jsp", "kt", "vue", "r", "scala", "pl", "hs", "lua", "dart", "conf", "coffee", "rs", "json", "url", "webloc", "website", "as", "as3", "asm", "aspx", "asp", "bat", "cc", "cmake", "cxx", "diff", "erb", "erl", "groovy", "gvy", "haml", "hh", "hpp", "hxx", "lst", "make", "ml", "mm", "out", "patch", "plist", "properties", "sass", "script", "scm", "sml", "vb", "vi", "vim", "xhtml", "xsd", "xsl", "yaml", "yml", "md", "markdown", "mdown", "mkdn"}, R.drawable.icon_file_code_colorful, R.color.ud_B100);
        f13513j = aVar9;
        FileTypeConfig aVar10 = new FileTypeConfig(new String[]{"pdf"}, R.drawable.ud_icon_file_pdf_colorful, R.color.ud_R100);
        f13514k = aVar10;
        FileTypeConfig aVar11 = new FileTypeConfig(new String[]{"ae"}, R.drawable.ud_icon_file_ae_colorful, R.color.ud_V100);
        f13515l = aVar11;
        FileTypeConfig aVar12 = new FileTypeConfig(new String[]{"ai"}, R.drawable.ud_icon_file_ai_colorful, R.color.ud_O100);
        f13516m = aVar12;
        FileTypeConfig aVar13 = new FileTypeConfig(new String[]{"psd"}, R.drawable.ud_icon_file_ps_colorful, R.color.ud_B100);
        f13517n = aVar13;
        FileTypeConfig aVar14 = new FileTypeConfig(new String[]{"apk"}, R.drawable.ud_icon_file_android_colorful, R.color.ud_G100);
        f13518o = aVar14;
        FileTypeConfig aVar15 = new FileTypeConfig(new String[]{"key"}, R.drawable.ud_icon_file_keynote_colorful, R.color.ud_B100);
        f13519p = aVar15;
        FileTypeConfig aVar16 = new FileTypeConfig(new String[]{"sketch"}, R.drawable.ud_icon_file_sketch_colorful, R.color.ud_I100);
        f13520q = aVar16;
        f13522s = new FileTypeConfig[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16};
        f13523t = new FileTypeConfig[]{aVar, aVar2, aVar5, aVar6, aVar7, aVar10, aVar11, aVar12, aVar13, aVar16};
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m19035c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        String c = C13675f.m55521c(str);
        String[] a = f13506c.mo18021a();
        Intrinsics.checkExpressionValueIsNotNull(c, "fileType");
        if (c != null) {
            String lowerCase = c.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            return C69043h.m265767b(a, lowerCase);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m19033a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        String c = C13675f.m55521c(str);
        FileTypeConfig[] aVarArr = f13523t;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (FileTypeConfig aVar : aVarArr) {
            String[] a = aVar.mo18021a();
            Intrinsics.checkExpressionValueIsNotNull(c, "fileType");
            if (c != null) {
                String lowerCase = c.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (C69043h.m265767b(a, lowerCase)) {
                    return true;
                }
                arrayList.add(Unit.INSTANCE);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    @JvmStatic
    /* renamed from: b */
    public static final FileTypeConfig m19034b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fileName");
        String c = C13675f.m55521c(str);
        FileTypeConfig[] aVarArr = f13522s;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (FileTypeConfig aVar : aVarArr) {
            String[] a = aVar.mo18021a();
            Intrinsics.checkExpressionValueIsNotNull(c, "fileType");
            if (c != null) {
                String lowerCase = c.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (C69043h.m265767b(a, lowerCase)) {
                    return aVar;
                }
                arrayList.add(Unit.INSTANCE);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return f13521r;
    }
}
