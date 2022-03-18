package com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import java.util.Locale;

public enum MailTxtAttrId implements ItemId {
    FontSmall(0, 12),
    FontNormal(0, 16),
    FontLarge(0, 20),
    FontHuge(0, 24),
    System((int) R.string.Mail_TextFont_SystemDefault),
    SourceHanSans((int) R.string.Mail_TextFont_SourceHanSans),
    SourceHanSerif((int) R.string.Mail_TextFont_SourceHanSerif),
    Arial((int) R.string.Mail_TextFont_Arial),
    ArialBlack((int) R.string.Mail_TextFont_ArialBlack),
    Calibri((int) R.string.Mail_TextFont_Calibri),
    ComicSansMS((int) R.string.Mail_TextFont_ComicSansMS),
    SansSerif((int) R.string.Mail_TextFont_SansSerif),
    Serif((int) R.string.Mail_TextFont_Serif),
    TimesNewRoman((int) R.string.Mail_TextFont_TimesNewRoman),
    Tahoma((int) R.string.Mail_TextFont_Tahoma),
    TrebuchetMS((int) R.string.Mail_TextFont_TrebuchetMS),
    Verdana((int) R.string.Mail_TextFont_Verdana),
    Georgia((int) R.string.Mail_TextFont_Georgia),
    Garamond((int) R.string.Mail_TextFont_Garamond),
    FixedWidth("Fixed width"),
    WideFont("Wide font"),
    NarrowFont("Narrow font"),
    bold,
    italic,
    underline,
    strikethrough,
    alignLeft,
    alignCenter,
    alignRight,
    unorderedList,
    orderedList;
    
    private String fontName;
    private int fontNameResId;
    private int fontSize;

    @Override // com.bytedance.ee.bear.document.toolbar.ItemId
    public ItemId[] children() {
        return null;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public static MailTxtAttrId getDefaultFont() {
        if (C41970e.m166941d().mo150954c()) {
            return System;
        }
        return SansSerif;
    }

    public String getFontName() {
        int i = this.fontNameResId;
        if (i != 0) {
            return C43819s.m173684a(i);
        }
        return this.fontName;
    }

    public boolean isFontOrSize() {
        if (this.fontSize > 0 || !TextUtils.isEmpty(getFontName())) {
            return true;
        }
        return false;
    }

    public static MailTxtAttrId[] getOldFontList() {
        return new MailTxtAttrId[]{FixedWidth, WideFont, NarrowFont, SansSerif, ComicSansMS, Garamond, Georgia, Tahoma, TrebuchetMS, Verdana, Serif};
    }

    public static MailTxtAttrId[] getCNFontList() {
        return new MailTxtAttrId[]{System, SourceHanSans, SourceHanSerif, Arial, ArialBlack, Calibri, ComicSansMS, SansSerif, Serif, TimesNewRoman, Tahoma, TrebuchetMS, Verdana, Georgia, Garamond};
    }

    public static MailTxtAttrId[] getENFontList() {
        return new MailTxtAttrId[]{System, Arial, ArialBlack, Calibri, ComicSansMS, SansSerif, Serif, TimesNewRoman, Tahoma, TrebuchetMS, Verdana, Georgia, Garamond};
    }

    public static MailTxtAttrId[] getFontList() {
        String str;
        if (!C41970e.m166941d().mo150954c()) {
            return getOldFontList();
        }
        Locale m = C41816b.m166115a().mo150146m();
        if (m == null || TextUtils.isEmpty(m.getLanguage())) {
            str = "en";
        } else {
            str = m.getLanguage().toLowerCase();
        }
        str.hashCode();
        if (str.equals("ja")) {
            return getJAFontList();
        }
        if (!str.equals("zh")) {
            return getENFontList();
        }
        return getCNFontList();
    }

    public static MailTxtAttrId[] getJAFontList() {
        return new MailTxtAttrId[]{System, Arial, ArialBlack, Calibri, ComicSansMS, SansSerif, Serif, TimesNewRoman, Tahoma, TrebuchetMS, Verdana, Georgia, Garamond};
    }

    public static boolean isFont(MailTxtAttrId mailTxtAttrId) {
        if (mailTxtAttrId == null || mailTxtAttrId.ordinal() < System.ordinal() || mailTxtAttrId.ordinal() > NarrowFont.ordinal()) {
            return false;
        }
        return true;
    }

    private MailTxtAttrId() {
        this(0);
    }

    private MailTxtAttrId(int i) {
        this(i, 0);
    }

    private MailTxtAttrId(String str) {
        this.fontName = str;
    }

    private MailTxtAttrId(int i, int i2) {
        if (i != 0) {
            this.fontNameResId = i;
            this.fontName = C43819s.m173684a(i);
        }
        this.fontSize = i2;
    }
}
