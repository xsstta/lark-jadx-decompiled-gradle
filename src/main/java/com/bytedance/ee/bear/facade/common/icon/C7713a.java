package com.bytedance.ee.bear.facade.common.icon;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ee.bear.facade.common.icon.p381a.C7714b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.io.AbstractC13673d;
import com.bytedance.ee.util.io.C13672c;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.bear.facade.common.icon.a */
public class C7713a {
    /* renamed from: a */
    public static int m30836a() {
        return R.drawable.ud_icon_file_sharefolder_colorful;
    }

    /* renamed from: a */
    public static int m30837a(int i) {
        return m30838a(i, IconSize.SIZE_48);
    }

    /* renamed from: b */
    public static int m30846b(int i) {
        return m30847b(i, IconSize.SIZE_48);
    }

    /* renamed from: a */
    public static int m30841a(String str) {
        return m30842a(str, IconSize.SIZE_48);
    }

    /* renamed from: c */
    public static int m30851c(String str) {
        if (str != null) {
            str = str.toLowerCase();
        }
        for (String str2 : AbstractC13673d.f35862a) {
            if (TextUtils.equals(str, str2)) {
                return R.drawable.ic_icon_wiki_file_round_image_colorful;
            }
        }
        for (String str3 : AbstractC13673d.f35863b) {
            if (TextUtils.equals(str, str3)) {
                return R.drawable.ic_icon_wiki_file_round_video_colorful;
            }
        }
        if (TextUtils.equals(str, "pdf")) {
            return R.drawable.ic_icon_wiki_file_round_pdf_colorful;
        }
        for (String str4 : AbstractC13673d.f35867f) {
            if (TextUtils.equals(str4, str)) {
                return R.drawable.ic_icon_wiki_file_round_word_colorful;
            }
        }
        for (String str5 : AbstractC13673d.f35868g) {
            if (TextUtils.equals(str5, str)) {
                return R.drawable.ic_icon_wiki_file_round_excel_colorful;
            }
        }
        for (String str6 : AbstractC13673d.f35869h) {
            if (TextUtils.equals(str6, str)) {
                return R.drawable.ic_icon_wiki_file_round_ppt_colorful;
            }
        }
        for (String str7 : AbstractC13673d.f35865d) {
            if (TextUtils.equals(str7, str)) {
                return R.drawable.ic_icon_wiki_file_round_text_colorful;
            }
        }
        for (String str8 : AbstractC13673d.f35871j) {
            if (TextUtils.equals(str8, str)) {
                return R.drawable.ic_icon_wiki_file_round_zip_colorful;
            }
        }
        return R.drawable.ud_icon_wiki_unknow_circle_colorful;
    }

    /* renamed from: b */
    public static int m30848b(String str) {
        if (str != null) {
            str = str.toLowerCase();
        }
        for (String str2 : AbstractC13673d.f35862a) {
            if (TextUtils.equals(str2, str)) {
                return R.drawable.ud_icon_file_image_colorful;
            }
        }
        for (String str3 : AbstractC13673d.f35863b) {
            if (TextUtils.equals(str3, str)) {
                return R.drawable.ud_icon_file_video_colorful;
            }
        }
        for (String str4 : AbstractC13673d.f35864c) {
            if (TextUtils.equals(str4, str)) {
                return R.drawable.ud_icon_file_audio_colorful;
            }
        }
        if (TextUtils.equals("pdf", str)) {
            return R.drawable.ud_icon_file_pdf_colorful;
        }
        for (String str5 : AbstractC13673d.f35865d) {
            if (TextUtils.equals(str5, str)) {
                return R.drawable.ud_icon_file_text_colorful;
            }
        }
        for (String str6 : AbstractC13673d.f35866e) {
            if (TextUtils.equals(str6, str)) {
                return R.drawable.ud_icon_file_code_colorful;
            }
        }
        for (String str7 : AbstractC13673d.f35867f) {
            if (TextUtils.equals(str7, str)) {
                return R.drawable.ud_icon_file_word_colorful;
            }
        }
        for (String str8 : AbstractC13673d.f35868g) {
            if (TextUtils.equals(str8, str)) {
                return R.drawable.ud_icon_file_excel_colorful;
            }
        }
        for (String str9 : AbstractC13673d.f35869h) {
            if (TextUtils.equals(str9, str)) {
                return R.drawable.ud_icon_file_ppt_colorful;
            }
        }
        if (TextUtils.equals("pages", str)) {
            return R.drawable.ud_icon_file_pages_colorful;
        }
        if (TextUtils.equals("numbers", str)) {
            return R.drawable.ud_icon_file_numbers_colorful;
        }
        for (String str10 : AbstractC13673d.f35870i) {
            if (TextUtils.equals(str10, str)) {
                return R.drawable.ud_icon_file_keynote_colorful;
            }
        }
        for (String str11 : AbstractC13673d.f35871j) {
            if (TextUtils.equals(str11, str)) {
                return R.drawable.ud_icon_file_zip_colorful;
            }
        }
        if (TextUtils.equals("apk", str)) {
            return R.drawable.ud_icon_file_android_colorful;
        }
        if (TextUtils.equals("psd", str)) {
            return R.drawable.ud_icon_file_ps_colorful;
        }
        if (TextUtils.equals("aep", str)) {
            return R.drawable.ud_icon_file_ae_colorful;
        }
        if (TextUtils.equals("ai", str)) {
            return R.drawable.ud_icon_file_ai_colorful;
        }
        if (TextUtils.equals("sketch", str)) {
            return R.drawable.ud_icon_file_sketch_colorful;
        }
        return R.drawable.ud_icon_file_unknow_colorful;
    }

    /* renamed from: a */
    public static int m30839a(int i, String str) {
        String a = C7714b.m30853a(str);
        if (i == C8275a.f22375h.mo32555b()) {
            return m30851c(C13672c.m55481b(a));
        }
        return m30846b(i);
    }

    /* renamed from: a */
    public static Pair<Integer, String> m30843a(Resources resources, int i) {
        try {
            int a = m30837a(i);
            String resourceEntryName = resources.getResourceEntryName(a);
            Log.m165389i("IconHelper", "getMultiTaskIcon()...type = " + i + ", name = " + resourceEntryName);
            return Pair.create(Integer.valueOf(a), resources.getResourceEntryName(a));
        } catch (Exception e) {
            Log.m165383e("IconHelper", "getMultiTaskIcon err = " + e);
            return Pair.create(Integer.valueOf((int) R.drawable.icon_file_other_nor), "icon_file_other_nor");
        }
    }

    /* renamed from: b */
    public static int m30847b(int i, IconSize iconSize) {
        if (i == C8275a.f22371d.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_wiki_doc_circle_colorful;
            }
            return R.drawable.ic_icon_wiki_doc_circle;
        } else if (i == C8275a.f22372e.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_wiki_sheet_circle_colorful;
            }
            return R.drawable.ic_icon_wiki_sheet_circle;
        } else if (i == C8275a.f22374g.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_wiki_mindnote_circle_colorful;
            }
            return R.drawable.ic_icon_wiki_mindnote_circle;
        } else if (i == C8275a.f22373f.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_wiki_bitable_circle_colorful;
            }
            return R.drawable.ic_icon_wiki_bitable_circle;
        } else if (i == C8275a.f22378k.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_wiki_docx_circle_colorful;
            }
            return R.drawable.ic_icon_wiki_docx_circle;
        } else if (iconSize == IconSize.SIZE_24) {
            return R.drawable.ud_icon_wiki_unknow_circle_colorful;
        } else {
            return R.drawable.ic_icon_wiki_unknow_circle;
        }
    }

    /* renamed from: a */
    public static int m30838a(int i, IconSize iconSize) {
        if (i == C8275a.f22371d.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_file_round_doc_colorful;
            }
            return R.drawable.icon_file_doc_nor;
        } else if (i == C8275a.f22372e.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_file_round_sheet_colorful;
            }
            return R.drawable.icon_file_sheet_nor;
        } else if (i == C8275a.f22373f.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_file_round_bitable_colorful;
            }
            return R.drawable.icon_file_bitable_nor;
        } else if (i == C8275a.f22374g.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_file_round_mindnote_colorful;
            }
            return R.drawable.icon_file_mindnote_nor;
        } else if (i == C8275a.f22376i.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_file_round_slide_colorful;
            }
            return R.drawable.icon_file_slide_nor;
        } else if (i == C8275a.f22378k.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_file_round_docx_colorful;
            }
            return R.drawable.ic_icon_file_docx_nor;
        } else if (i == C8275a.f22370c.mo32555b()) {
            if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_file_folder_colorful;
            }
            return R.drawable.icon_file_folder_nor;
        } else if (iconSize == IconSize.SIZE_24) {
            return R.drawable.ud_icon_file_round_unknow_colorful;
        } else {
            return R.drawable.icon_file_other_nor;
        }
    }

    /* renamed from: b */
    public static Pair<Integer, String> m30849b(Resources resources, int i) {
        try {
            int b = m30846b(i);
            String resourceEntryName = resources.getResourceEntryName(b);
            Log.m165389i("IconHelper", "getMultiTaskWikiDocumentIcon()...type = " + i + ", name = " + resourceEntryName);
            return Pair.create(Integer.valueOf(b), resources.getResourceEntryName(b));
        } catch (Exception e) {
            Log.m165384e("IconHelper", "getMultiTaskWikiDocumentIcon err. ", e);
            return Pair.create(Integer.valueOf((int) R.drawable.ic_icon_wiki_unknow_circle), "ic_icon_wiki_unknow_circle");
        }
    }

    /* renamed from: a */
    public static int m30842a(String str, IconSize iconSize) {
        if (str != null) {
            str = str.toLowerCase();
        }
        for (String str2 : AbstractC13673d.f35862a) {
            if (TextUtils.equals(str2, str)) {
                if (iconSize == IconSize.SIZE_24) {
                    return R.drawable.ud_icon_file_round_image_colorful;
                } else {
                    return R.drawable.icon_file_image_nor;
                }
            }
        }
        for (String str3 : AbstractC13673d.f35863b) {
            if (TextUtils.equals(str3, str)) {
                if (iconSize == IconSize.SIZE_24) {
                    return R.drawable.ud_icon_file_round_video_colorful;
                } else {
                    return R.drawable.icon_file_video_nor;
                }
            }
        }
        for (String str4 : AbstractC13673d.f35864c) {
            if (TextUtils.equals(str4, str)) {
                if (iconSize == IconSize.SIZE_24) {
                    return R.drawable.ud_icon_file_round_audio_colorful;
                } else {
                    return R.drawable.icon_file_music_nor;
                }
            }
        }
        if (!TextUtils.equals("pdf", str)) {
            for (String str5 : AbstractC13673d.f35865d) {
                if (TextUtils.equals(str5, str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_text_colorful;
                    } else {
                        return R.drawable.icon_file_txt_nor;
                    }
                }
            }
            for (String str6 : AbstractC13673d.f35866e) {
                if (TextUtils.equals(str6, str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_code_colorful;
                    } else {
                        return R.drawable.icon_file_code_nor;
                    }
                }
            }
            for (String str7 : AbstractC13673d.f35867f) {
                if (TextUtils.equals(str7, str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_word_colorful;
                    } else {
                        return R.drawable.icon_file_word_nor;
                    }
                }
            }
            for (String str8 : AbstractC13673d.f35868g) {
                if (TextUtils.equals(str8, str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_excel_colorful;
                    } else {
                        return R.drawable.icon_file_excel_nor;
                    }
                }
            }
            for (String str9 : AbstractC13673d.f35869h) {
                if (TextUtils.equals(str9, str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_ppt_colorful;
                    } else {
                        return R.drawable.icon_file_ppt_nor;
                    }
                }
            }
            if (TextUtils.equals("pages", str)) {
                if (iconSize == IconSize.SIZE_24) {
                    return R.drawable.ud_icon_file_round_pages_colorful;
                }
                return R.drawable.icon_feed_pages_nor;
            } else if (!TextUtils.equals("numbers", str)) {
                for (String str10 : AbstractC13673d.f35870i) {
                    if (TextUtils.equals(str10, str)) {
                        if (iconSize == IconSize.SIZE_24) {
                            return R.drawable.ud_icon_file_round_keynote_colorful;
                        } else {
                            return R.drawable.icon_file_keynote_nor;
                        }
                    }
                }
                for (String str11 : AbstractC13673d.f35871j) {
                    if (TextUtils.equals(str11, str)) {
                        if (iconSize == IconSize.SIZE_24) {
                            return R.drawable.ud_icon_file_round_zip_colorful;
                        } else {
                            return R.drawable.icon_file_zip_nor;
                        }
                    }
                }
                if (TextUtils.equals("apk", str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_android_colorful;
                    }
                    return R.drawable.icon_file_apk_nor;
                } else if (TextUtils.equals("psd", str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_ps_colorful;
                    }
                    return R.drawable.icon_file_ps_nor;
                } else if (TextUtils.equals("aep", str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_ae_colorful;
                    }
                    return R.drawable.icon_file_ae_nor;
                } else if (TextUtils.equals("ai", str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_ai_colorful;
                    }
                    return R.drawable.icon_file_ai_nor;
                } else if (TextUtils.equals("sketch", str)) {
                    if (iconSize == IconSize.SIZE_24) {
                        return R.drawable.ud_icon_file_round_sketch_colorful;
                    }
                    return R.drawable.icon_file_sketch_nor;
                } else if (iconSize == IconSize.SIZE_24) {
                    return R.drawable.ud_icon_file_round_unknow_colorful;
                } else {
                    return R.drawable.icon_file_other_nor;
                }
            } else if (iconSize == IconSize.SIZE_24) {
                return R.drawable.ud_icon_file_round_numbers_colorful;
            } else {
                return R.drawable.icon_feed_numbers_nor;
            }
        } else if (iconSize == IconSize.SIZE_24) {
            return R.drawable.ud_icon_file_round_pdf_colorful;
        } else {
            return R.drawable.icon_file_pdf_nor;
        }
    }

    /* renamed from: b */
    public static Pair<Integer, String> m30850b(Resources resources, String str) {
        try {
            int c = m30851c(str);
            String resourceEntryName = resources.getResourceEntryName(c);
            Log.m165389i("IconHelper", "getMultiTaskWikiFileIcon()...type = " + str + ", name = " + resourceEntryName);
            return Pair.create(Integer.valueOf(c), resources.getResourceEntryName(c));
        } catch (Exception e) {
            Log.m165384e("IconHelper", "getMultiTaskWikiFileIcon err. ", e);
            return Pair.create(Integer.valueOf((int) R.drawable.ic_icon_wiki_unknow_circle), "ic_icon_wiki_unknow_circle");
        }
    }

    /* renamed from: a */
    public static Pair<Integer, String> m30845a(Resources resources, String str) {
        try {
            int a = m30841a(str);
            String resourceEntryName = resources.getResourceEntryName(a);
            Log.m165389i("IconHelper", "getMultiTaskFileIcon()...type = " + str + ", name = " + resourceEntryName);
            return Pair.create(Integer.valueOf(a), resources.getResourceEntryName(a));
        } catch (Exception e) {
            Log.m165383e("IconHelper", "getMultiTaskFileIcon err = " + e);
            return Pair.create(Integer.valueOf((int) R.drawable.icon_file_other_nor), "icon_file_other_nor");
        }
    }

    /* renamed from: a */
    public static int m30840a(int i, String str, IconSize iconSize) {
        if (i == C8275a.f22375h.mo32555b()) {
            return m30851c(C13672c.m55481b(str));
        }
        return m30847b(i, iconSize);
    }

    /* renamed from: a */
    public static Pair<Integer, String> m30844a(Resources resources, int i, String str) {
        if (i == C8275a.f22375h.mo32555b()) {
            return m30850b(resources, C13672c.m55481b(str));
        }
        return m30849b(resources, i);
    }
}
