package com.ss.android.lark.calendar.impl.utils;

import android.text.TextUtils;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.lark.calendar.impl.utils.q */
public class C32664q {
    /* renamed from: a */
    public static int m125355a() {
        return EnumC32665a.TYPE_UNKNOWN.resIdArray[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.utils.q$a */
    public enum EnumC32665a {
        TYPE_PDF(new String[]{".pdf"}, new int[]{R.drawable.ud_icon_file_pdf_colorful}),
        TYPE_PPT(new String[]{".ppt", ".pptx", ".pps", ".ppsx", ".pot", ".potx"}, new int[]{R.drawable.ud_icon_file_ppt_colorful}),
        TYPE_DOC(new String[]{".doc", ".docx", ".dot", ".dotx"}, new int[]{R.drawable.ud_icon_file_word_colorful}),
        TYPE_XLS(new String[]{".xls", ".xlsx", ".xlsm", ".csv"}, new int[]{R.drawable.ud_icon_file_excel_colorful}),
        TYPE_ZIP(new String[]{".zip", ".rar", ".7z", ".tar"}, new int[]{R.drawable.ud_icon_file_zip_colorful}),
        TYPE_PSD(new String[]{".psd"}, new int[]{R.drawable.ud_icon_file_ps_colorful}),
        TYPE_IMG(new String[]{".jpg", ".jpeg", ".png", ".bmp", ".gif", ".tif", ".tiff", ".svg", ".raw"}, new int[]{R.drawable.ud_icon_file_image_colorful}),
        TYPE_VIDEO(new String[]{".mp4", ".mov", ".wmv", ".m4v", ".avi", ".mpg", ".mpeg", ".rm", ".rmvb", ".flv", ".mkv", ".ogv"}, new int[]{R.drawable.ud_icon_file_video_colorful}),
        TYPE_AUDIO(new String[]{".mp3", ".wav", ".m4a", ".wma", ".amr", ".aac", ".au", ".flac", ".oga", ".ogg"}, new int[]{R.drawable.ud_icon_file_audio_colorful}),
        TYPE_TXT(new String[]{".txt", ".rtf"}, new int[]{R.drawable.ud_icon_file_text_colorful}),
        TYPE_APK(new String[]{".apk"}, new int[]{R.drawable.ud_icon_file_android_colorful}),
        TYPE_AI(new String[]{".ai"}, new int[]{R.drawable.ud_icon_file_ai_colorful}),
        TYPE_SKETCH(new String[]{".sketch"}, new int[]{R.drawable.ud_icon_file_sketch_colorful}),
        TYPE_AE(new String[]{".aep"}, new int[]{R.drawable.ud_icon_file_ae_colorful}),
        TYPE_KEYNOTE(new String[]{".key"}, new int[]{R.drawable.ud_icon_file_keynote_colorful}),
        TYPE_CODE(new String[]{".m", ".pch", ".strings", ".plist", ".xcworkspacedata", ".java", ".c", ".kt", ".cpp", ".sh", ".py", ".h", ".cc", ".mk", ".xml", ".rc", ".conf", ".js", ".html", ".shtml", ".aidl", ".css", ".php", ".gradle", ".properties"}, new int[]{R.drawable.ud_icon_file_code_colorful}),
        TYPE_UNKNOWN(new String[0], new int[]{R.drawable.ud_icon_file_unknow_colorful});
        
        public int[] resIdArray;
        private Set<String> suffixSet;

        public boolean isSuffixMatch(String str) {
            return this.suffixSet.contains(str);
        }

        private EnumC32665a(String[] strArr, int[] iArr) {
            this.suffixSet = new HashSet(Arrays.asList(strArr));
            this.resIdArray = iArr;
        }
    }

    /* renamed from: a */
    public static int m125356a(String str) {
        if (TextUtils.isEmpty(str)) {
            return EnumC32665a.TYPE_UNKNOWN.resIdArray[0];
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf < 0 || lastIndexOf >= str.length()) {
            return EnumC32665a.TYPE_UNKNOWN.resIdArray[0];
        }
        String substring = str.substring(lastIndexOf);
        if (TextUtils.isEmpty(substring)) {
            return EnumC32665a.TYPE_UNKNOWN.resIdArray[0];
        }
        String lowerCase = substring.toLowerCase();
        EnumC32665a[] values = EnumC32665a.values();
        for (EnumC32665a aVar : values) {
            if (aVar.isSuffixMatch(lowerCase)) {
                return aVar.resIdArray[0];
            }
        }
        return EnumC32665a.TYPE_UNKNOWN.resIdArray[0];
    }
}
