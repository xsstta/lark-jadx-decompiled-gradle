package com.ss.android.lark.utils;

import android.text.TextUtils;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum FileType {
    TYPE_PDF(new String[0], new String[]{".pdf"}, new int[]{R.drawable.icon_file_pdf_v2, R.drawable.ud_icon_file_pdf_colorful, R.drawable.icon_file_pdf_v2, R.drawable.icon_file_pdf_rectangle}),
    TYPE_PPT(new String[]{"ms-powerpoint", "presentationml", "ms-works"}, new String[]{".ppt", ".pptx", ".pps", ".ppsx", ".pot", ".potx"}, new int[]{R.drawable.icon_file_ppt_v2, R.drawable.ud_icon_file_ppt_colorful, R.drawable.icon_file_ppt_v2, R.drawable.icon_file_ppt_rectangle}),
    TYPE_DOC(new String[]{"rtf", "msword", "wordprocessingml"}, new String[]{".doc", ".docx", ".dot", ".dotx"}, new int[]{R.drawable.icon_file_doc_v2, R.drawable.ud_icon_file_word_colorful, R.drawable.icon_file_doc_v2, R.drawable.icon_file_doc_rectangle}),
    TYPE_XLS(new String[]{"ms-excel", "spreadsheetml"}, new String[]{".xls", ".xlsx", ".xlsm", ".csv"}, new int[]{R.drawable.icon_file_xls_v2, R.drawable.ud_icon_file_excel_colorful, R.drawable.icon_file_xls_v2, R.drawable.icon_file_xls_rectangle}),
    TYPE_ZIP(new String[]{"zip", "rar", "compress", "tar"}, new String[]{".zip", ".rar", ".7z", ".tar"}, new int[]{R.drawable.icon_file_zip_v2, R.drawable.ud_icon_file_zip_colorful, R.drawable.icon_file_zip_v2, R.drawable.icon_file_zip_rectangle}),
    TYPE_PSD(new String[]{"vnd.adobe.photoshop"}, new String[]{".psd"}, new int[]{R.drawable.icon_file_psd_v2, R.drawable.ud_icon_file_ps_colorful, R.drawable.icon_file_psd_v2, R.drawable.icon_file_psd_rectangle}),
    TYPE_IMG(new String[]{"image", "jpeg", "png"}, new String[]{".jpg", ".jpeg", ".png", ".bmp", ".gif", ".tif", ".tiff", ".svg", ".raw"}, new int[]{R.drawable.icon_file_picture_v2, R.drawable.ud_icon_file_image_colorful, R.drawable.icon_file_picture_v2, R.drawable.icon_file_picture_rectangle}),
    TYPE_VIDEO(new String[]{"video"}, new String[]{".mp4", ".mov", ".wmv", ".m4v", ".avi", ".mpg", ".mpeg", ".rm", ".rmvb", ".flv", ".mkv", ".ogv"}, new int[]{R.drawable.icon_file_video_v2, R.drawable.ud_icon_file_video_colorful, R.drawable.icon_file_video_v2, R.drawable.icon_file_video_rectangle}),
    TYPE_AUDIO(new String[]{"audio"}, new String[]{".mp3", ".wav", ".m4a", ".wma", ".amr", ".aac", ".au", ".flac", ".oga", ".ogg"}, new int[]{R.drawable.icon_file_audio_v2, R.drawable.ud_icon_file_audio_colorful, R.drawable.icon_file_audio_v2, R.drawable.icon_file_audio_rectangle}),
    TYPE_TXT(new String[]{"text/plain"}, new String[]{".txt", ".rtf"}, new int[]{R.drawable.icon_file_txt_v2, R.drawable.ud_icon_file_text_colorful, R.drawable.icon_file_txt_v2, R.drawable.icon_file_txt_rectangle}),
    TYPE_APK(new String[]{"application/vnd.android.package-archive"}, new String[]{".apk"}, new int[]{R.drawable.icon_file_apk_v2, R.drawable.ud_icon_file_android_colorful, R.drawable.icon_file_apk_v2, R.drawable.icon_file_apk_rectangle}),
    TYPE_AI(new String[]{"postscript"}, new String[]{".ai"}, new int[]{R.drawable.icon_file_ai_v2, R.drawable.ud_icon_file_ai_colorful, R.drawable.icon_file_ai_v2, R.drawable.icon_file_ai_rectangle}),
    TYPE_SKETCH(new String[0], new String[]{".sketch"}, new int[]{R.drawable.icon_file_sketch_v2, R.drawable.ud_icon_file_sketch_colorful, R.drawable.icon_file_sketch_v2, R.drawable.icon_file_sketch_rectangle}),
    TYPE_AE(new String[0], new String[]{".aep"}, new int[]{R.drawable.icon_file_ae_v2, R.drawable.ud_icon_file_ae_colorful, R.drawable.icon_file_ae_v2, R.drawable.icon_file_ae_rectangle}),
    TYPE_KEYNOTE(new String[0], new String[]{".key"}, new int[]{R.drawable.icon_file_keynote_v2, R.drawable.ud_icon_file_keynote_colorful, R.drawable.icon_file_keynote_v2, R.drawable.icon_file_keynote_rectangle}),
    TYPE_UNKNOWN(new String[0], new String[0], new int[]{R.drawable.icon_file_default_v2, R.drawable.ud_icon_file_unknow_colorful, R.drawable.icon_file_default_v2, R.drawable.icon_file_default_rectangle}),
    TYPE_FOLDER(new String[0], new String[0], new int[]{R.drawable.icon_folder_avatar, R.drawable.ud_icon_file_folder_colorful});
    
    private String[] mimeArray;
    private int[] resIdArray;
    private Set<String> suffixSet;

    public int getDocFileResId() {
        int[] iArr = this.resIdArray;
        if (iArr == null || iArr.length <= 2) {
            return R.drawable.icon_file_default_v2;
        }
        return iArr[2];
    }

    public boolean isSuffixMatch(String str) {
        return this.suffixSet.contains(str);
    }

    public int getResId(boolean z) {
        int[] iArr = this.resIdArray;
        if (iArr != null && iArr.length > 1) {
            return iArr[z ? 1 : 0];
        }
        if (!z) {
            return R.drawable.icon_file_default_v2;
        }
        return R.drawable.icon_file_message_default_v2;
    }

    public boolean isMimeMatch(String str) {
        for (String str2 : this.mimeArray) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static FileType getFileTypeByMime(String str) {
        if (TextUtils.isEmpty(str)) {
            return TYPE_UNKNOWN;
        }
        String lowerCase = str.toLowerCase();
        FileType[] values = values();
        for (FileType fileType : values) {
            if (fileType.isMimeMatch(lowerCase)) {
                return fileType;
            }
        }
        return TYPE_UNKNOWN;
    }

    public static FileType getFileTypeBySuffix(String str) {
        if (TextUtils.isEmpty(str)) {
            return TYPE_UNKNOWN;
        }
        String lowerCase = str.toLowerCase();
        FileType[] values = values();
        for (FileType fileType : values) {
            if (fileType.isSuffixMatch(lowerCase)) {
                return fileType;
            }
        }
        return TYPE_UNKNOWN;
    }

    public int getResId(int i) {
        int[] iArr = this.resIdArray;
        if (iArr != null && iArr.length > i) {
            return iArr[i];
        }
        if (i == 0) {
            return R.drawable.icon_file_default_v2;
        }
        if (i == 1) {
            return R.drawable.ud_icon_file_unknow_colorful;
        }
        if (i == 2) {
            return R.drawable.icon_file_default_v2;
        }
        if (i != 3) {
            return R.drawable.icon_file_message_default_v2;
        }
        return R.drawable.icon_file_default_rectangle;
    }

    private FileType(String[] strArr, String[] strArr2, int[] iArr) {
        this.mimeArray = strArr;
        this.suffixSet = new HashSet(Arrays.asList(strArr2));
        this.resIdArray = iArr;
    }
}
