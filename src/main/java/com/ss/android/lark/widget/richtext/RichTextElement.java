package com.ss.android.lark.widget.richtext;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONType;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.EditTextLengthFilter;
import com.ss.android.lark.widget.C58377d;
import com.ss.android.lark.widget.richtext.preprocess.ElementExtra;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RichTextElement implements Serializable {
    private List<String> childIds;
    private ElementExtra elementExtra;
    private RichTextProperty property;
    private Map<String, String> style;
    private List<String> styleKeys;
    private RichTextTag tag;

    @JSONType(typeName = "BoldProperty")
    public static class BoldProperty extends TextProperty {
    }

    @JSONType(typeName = "ButtonProperty")
    public static class ButtonProperty extends RichTextProperty {
        private String actionId;
        private boolean active;
        private ConfirmProperty confirm;
        private boolean disable;
        private boolean isShowLoadingIcon;
        private ButtonLoadingProperty loading;
        private String mode;

        public static class ButtonLoadingProperty implements Serializable {
            private String begin;
            private String beginI18NKey;
            private String fail;
            private String failI18NKey;
            private String success;
            private String successI18NKey;

            public String getBegin() {
                return this.begin;
            }

            public String getBeginI18NKey() {
                return this.beginI18NKey;
            }

            public String getFail() {
                return this.fail;
            }

            public String getFailI18NKey() {
                return this.failI18NKey;
            }

            public String getSuccess() {
                return this.success;
            }

            public String getSuccessI18NKey() {
                return this.successI18NKey;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                String str = this.begin;
                int i6 = 0;
                if (str != null) {
                    i = str.hashCode();
                } else {
                    i = 0;
                }
                int i7 = i * 31;
                String str2 = this.success;
                if (str2 != null) {
                    i2 = str2.hashCode();
                } else {
                    i2 = 0;
                }
                int i8 = (i7 + i2) * 31;
                String str3 = this.fail;
                if (str3 != null) {
                    i3 = str3.hashCode();
                } else {
                    i3 = 0;
                }
                int i9 = (i8 + i3) * 31;
                String str4 = this.beginI18NKey;
                if (str4 != null) {
                    i4 = str4.hashCode();
                } else {
                    i4 = 0;
                }
                int i10 = (i9 + i4) * 31;
                String str5 = this.successI18NKey;
                if (str5 != null) {
                    i5 = str5.hashCode();
                } else {
                    i5 = 0;
                }
                int i11 = (i10 + i5) * 31;
                String str6 = this.failI18NKey;
                if (str6 != null) {
                    i6 = str6.hashCode();
                }
                return i11 + i6;
            }

            public void setBegin(String str) {
                this.begin = str;
            }

            public void setBeginI18NKey(String str) {
                this.beginI18NKey = str;
            }

            public void setFail(String str) {
                this.fail = str;
            }

            public void setFailI18NKey(String str) {
                this.failI18NKey = str;
            }

            public void setSuccess(String str) {
                this.success = str;
            }

            public void setSuccessI18NKey(String str) {
                this.successI18NKey = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ButtonLoadingProperty buttonLoadingProperty = (ButtonLoadingProperty) obj;
                if (Objects.equals(this.begin, buttonLoadingProperty.begin) && Objects.equals(this.success, buttonLoadingProperty.success) && Objects.equals(this.fail, buttonLoadingProperty.fail) && Objects.equals(this.beginI18NKey, buttonLoadingProperty.beginI18NKey) && Objects.equals(this.successI18NKey, buttonLoadingProperty.successI18NKey)) {
                    return Objects.equals(this.failI18NKey, buttonLoadingProperty.failI18NKey);
                }
                return false;
            }
        }

        public String getActionId() {
            return this.actionId;
        }

        public ConfirmProperty getConfirm() {
            return this.confirm;
        }

        public ButtonLoadingProperty getLoading() {
            return this.loading;
        }

        public String getMode() {
            return this.mode;
        }

        public boolean isActive() {
            return this.active;
        }

        public boolean isDisable() {
            return this.disable;
        }

        public boolean isShowLoadingIcon() {
            return this.isShowLoadingIcon;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(Integer.valueOf(super.hashCode()), this.actionId, Boolean.valueOf(this.disable), Boolean.valueOf(this.active), this.confirm, this.loading, Boolean.valueOf(this.isShowLoadingIcon), this.mode);
        }

        public void setActionId(String str) {
            this.actionId = str;
        }

        public void setActive(boolean z) {
            this.active = z;
        }

        public void setConfirm(ConfirmProperty confirmProperty) {
            this.confirm = confirmProperty;
        }

        public void setDisable(boolean z) {
            this.disable = z;
        }

        public void setLoading(ButtonLoadingProperty buttonLoadingProperty) {
            this.loading = buttonLoadingProperty;
        }

        public void setMode(String str) {
            this.mode = str;
        }

        public void setShowLoadingIcon(boolean z) {
            this.isShowLoadingIcon = z;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            ButtonProperty buttonProperty = (ButtonProperty) obj;
            if (this.disable != buttonProperty.disable || this.active != buttonProperty.active || this.isShowLoadingIcon != buttonProperty.isShowLoadingIcon || !Objects.equals(this.actionId, buttonProperty.actionId) || !Objects.equals(this.confirm, buttonProperty.confirm) || !Objects.equals(this.loading, buttonProperty.loading) || !Objects.equals(this.mode, buttonProperty.mode)) {
                return false;
            }
            return true;
        }
    }

    @JSONType(typeName = "CodeBlockProperty")
    public static class CodeBlockProperty extends RichTextProperty {
        private static final long serialVersionUID = 1423823212701200062L;
        private String content;
        private Language language;
        private List<Style> styleList = new ArrayList();
        private List<StyleRef> styleRefList = new ArrayList();

        public static class Style implements Serializable {
            private static final long serialVersionUID = 6642406954507876859L;
            public String name;
            public StyleType type;
            public String value;
        }

        public static class StyleRef implements Serializable {
            private static final long serialVersionUID = 6197924159960077625L;
            public int length;
            public int location;
            public List<Integer> styleIds;
        }

        public enum Language {
            JS(0),
            APACHE(1),
            BASH(2),
            CS(3),
            CPLUSPLUS(4),
            COFFE_SCRIPT(5),
            HTML(6),
            XML(7),
            HTTP(8),
            JSON(9),
            JAVA(10),
            MAKEFILE(11),
            MARKDOWN(12),
            NGINX(13),
            OBJC(14),
            PHP(15),
            PERL(16),
            PYTHON(17),
            RUBY(18),
            SQL(19),
            SHELL(20),
            GO(21),
            SCSS(22),
            LUA(23),
            DJANGO(24),
            KOTLIN(25);
            
            private final int value;

            public int getType() {
                return this.value;
            }

            public static Language valueOf(int i) {
                return forType(i);
            }

            public static Language forType(int i) {
                switch (i) {
                    case 0:
                        return JS;
                    case 1:
                        return APACHE;
                    case 2:
                        return BASH;
                    case 3:
                        return CS;
                    case 4:
                        return CPLUSPLUS;
                    case 5:
                        return COFFE_SCRIPT;
                    case 6:
                        return HTML;
                    case 7:
                        return XML;
                    case 8:
                        return HTTP;
                    case 9:
                        return JSON;
                    case 10:
                        return JAVA;
                    case 11:
                        return MAKEFILE;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        return MAKEFILE;
                    case 13:
                        return NGINX;
                    case 14:
                        return OBJC;
                    case 15:
                        return PHP;
                    case 16:
                        return PERL;
                    case 17:
                        return PYTHON;
                    case 18:
                        return RUBY;
                    case 19:
                        return SQL;
                    case 20:
                        return SHELL;
                    case 21:
                        return GO;
                    case 22:
                        return SCSS;
                    case 23:
                        return LUA;
                    case 24:
                        return DJANGO;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                        return KOTLIN;
                    default:
                        return JS;
                }
            }

            private Language(int i) {
                this.value = i;
            }
        }

        public String getContent() {
            return this.content;
        }

        public Language getLanguage() {
            return this.language;
        }

        public List<Style> getStyleList() {
            return this.styleList;
        }

        public List<StyleRef> getStyleRefList() {
            return this.styleRefList;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(Integer.valueOf(super.hashCode()), this.language, this.content, this.styleRefList, this.styleList);
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setLanguage(Language language2) {
            this.language = language2;
        }

        public void setStyleList(List<Style> list) {
            this.styleList = list;
        }

        public void setStyleRefList(List<StyleRef> list) {
            this.styleRefList = list;
        }

        public enum StyleType {
            CUSTOMIZE(0),
            GRAMMAR(1);
            
            private final int value;

            public static StyleType valueOf(int i) {
                return forType(i);
            }

            public static StyleType forType(int i) {
                if (i == 0) {
                    return CUSTOMIZE;
                }
                if (i != 1) {
                    return CUSTOMIZE;
                }
                return GRAMMAR;
            }

            private StyleType(int i) {
                this.value = i;
            }
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            CodeBlockProperty codeBlockProperty = (CodeBlockProperty) obj;
            if (this.language != codeBlockProperty.language || !Objects.equals(this.content, codeBlockProperty.content) || !Objects.equals(this.styleRefList, codeBlockProperty.styleRefList) || !Objects.equals(this.styleList, codeBlockProperty.styleList)) {
                return false;
            }
            return true;
        }
    }

    @JSONType(typeName = "CodeProperty")
    public static class CodeProperty extends RichTextProperty {
        private static final long serialVersionUID = 7115342752232691940L;
    }

    @JSONType(typeName = "DashedProperty")
    public static class DashedProperty extends TextProperty {
        public String chatId;
        public String fullName;
        public String i18nDesc;
        public String id;
        public int intervalOff;
        public int intervalOn;
        public String messageId;
        public String name;
        public int version;
    }

    @JSONType(typeName = "DivProperty")
    public static class DivProperty extends RichTextProperty {
    }

    @JSONType(typeName = "DocsProperty")
    public static class DocsProperty extends RichTextProperty {
        private static final long serialVersionUID = -4610601462567735579L;
    }

    @JSONType(typeName = "FigureProperty")
    public static class FigureProperty extends RichTextProperty {
    }

    @JSONType(typeName = "H1Property")
    public static class H1Property extends RichTextProperty {
        private static final long serialVersionUID = -7221270240730274325L;
    }

    @JSONType(typeName = "H2Property")
    public static class H2Property extends RichTextProperty {
        private static final long serialVersionUID = 5320596073649453277L;
    }

    @JSONType(typeName = "H3Property")
    public static class H3Property extends RichTextProperty {
        private static final long serialVersionUID = -4119339019463435961L;
    }

    @JSONType(typeName = "HRProperty")
    public static class HRProperty extends RichTextProperty {
        private static final long serialVersionUID = -2289408225683192912L;
    }

    @JSONType(typeName = "IntentionDashedProperty")
    public static class IntentionDashedProperty extends TextProperty {
        public String chatId;
        public List<String> chatterIds;
        public long duration;
        public long endTime;
        public boolean isAtAll;
        public boolean isMetting;
        public String messageId;
        public long startTime;
        public String title;
    }

    @JSONType(typeName = "ItalicProperty")
    public static class ItalicProperty extends TextProperty {
    }

    @JSONType(typeName = "LinkProperty")
    public static class LinkProperty extends RichTextProperty {
        private String androidUrl;
        private Source source;
        private String url;

        public enum Source {
            UNKNOWN(0),
            CARD_LINK(1),
            CONTENT_LINK(2),
            FOOTER_LINK(3);
            
            private final int value;

            public int getNumber() {
                return this.value;
            }

            public static Source valueOf(int i) {
                if (i == 1) {
                    return CARD_LINK;
                }
                if (i == 2) {
                    return CONTENT_LINK;
                }
                if (i != 3) {
                    return UNKNOWN;
                }
                return FOOTER_LINK;
            }

            private Source(int i) {
                this.value = i;
            }
        }

        public String getAndroidUrl() {
            return this.androidUrl;
        }

        public Source getSource() {
            return this.source;
        }

        public String getUrl() {
            return this.url;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            int i;
            String str = this.url;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str2 = this.androidUrl;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i3 + i2;
        }

        public void setAndroidUrl(String str) {
            this.androidUrl = str;
        }

        public void setSource(Source source2) {
            this.source = source2;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            LinkProperty linkProperty = (LinkProperty) obj;
            if (!Objects.equals(this.source, linkProperty.source)) {
                return false;
            }
            String str = this.url;
            if (str == null ? linkProperty.url != null : !str.equals(linkProperty.url)) {
                return false;
            }
            String str2 = this.androidUrl;
            String str3 = linkProperty.androidUrl;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }
    }

    @JSONType(typeName = "MediaProperty")
    public static class MediaProperty extends RichTextProperty {
        private String compressPath;
        private String coverPath;
        private int duration;
        private int height;
        private String key;
        private String mime;
        private String name;
        private Image originImage;
        private String originPath;
        private long size;
        private Source source;
        private Image thumbImage;
        private String url;
        private int width;

        public enum Source {
            UNKNOWN(0),
            LARK(1);
            
            private final int value;

            public int getNumber() {
                return this.value;
            }

            public static Source valueOf(int i) {
                return forNumber(i);
            }

            public static Source forNumber(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i != 1) {
                    return UNKNOWN;
                }
                return LARK;
            }

            private Source(int i) {
                this.value = i;
            }
        }

        public String getCompressPath() {
            return this.compressPath;
        }

        public String getCoverPath() {
            return this.coverPath;
        }

        public int getDuration() {
            return this.duration;
        }

        public int getHeight() {
            return this.height;
        }

        public String getKey() {
            return this.key;
        }

        public String getMime() {
            return this.mime;
        }

        public String getName() {
            return this.name;
        }

        public Image getOriginImage() {
            return this.originImage;
        }

        public String getOriginPath() {
            return this.originPath;
        }

        public long getSize() {
            return this.size;
        }

        public Source getSource() {
            return this.source;
        }

        public Image getThumbImage() {
            return this.thumbImage;
        }

        public String getUrl() {
            return this.url;
        }

        public int getWidth() {
            return this.width;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(this.key, this.name, Long.valueOf(this.size), this.mime, this.source, this.originImage, Integer.valueOf(this.duration), this.url, this.originPath, this.compressPath);
        }

        public void setCompressPath(String str) {
            this.compressPath = str;
        }

        public void setCoverPath(String str) {
            this.coverPath = str;
        }

        public void setDuration(int i) {
            this.duration = i;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setMime(String str) {
            this.mime = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setOriginImage(Image image) {
            this.originImage = image;
        }

        public void setOriginPath(String str) {
            this.originPath = str;
        }

        public void setSize(long j) {
            this.size = j;
        }

        public void setSource(Source source2) {
            this.source = source2;
        }

        public void setThumbImage(Image image) {
            this.thumbImage = image;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaProperty) || !super.equals(obj)) {
                return false;
            }
            MediaProperty mediaProperty = (MediaProperty) obj;
            if (this.size != mediaProperty.size || this.duration != mediaProperty.duration || !Objects.equals(this.key, mediaProperty.key) || !Objects.equals(this.name, mediaProperty.name) || !Objects.equals(this.mime, mediaProperty.mime) || this.source != mediaProperty.source || !Objects.equals(this.originImage, mediaProperty.originImage) || !Objects.equals(this.url, mediaProperty.url) || !Objects.equals(this.originPath, mediaProperty.originPath) || !Objects.equals(this.compressPath, mediaProperty.compressPath)) {
                return false;
            }
            return true;
        }
    }

    public static class MentionItem implements Serializable {
        private String id;
        private MentionType type;

        public enum MentionType {
            UNKNOWN_MENTION_TYPE(0),
            HASH_TAG(1);
            
            private final int value;

            public int getNumber() {
                return this.value;
            }

            public static MentionType valueOf(int i) {
                if (i != 1) {
                    return UNKNOWN_MENTION_TYPE;
                }
                return HASH_TAG;
            }

            private MentionType(int i) {
                this.value = i;
            }
        }

        public String getId() {
            return this.id;
        }

        public MentionType getType() {
            return this.type;
        }

        public int hashCode() {
            int i;
            String str = this.id;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            MentionType mentionType = this.type;
            if (mentionType != null) {
                i2 = mentionType.hashCode();
            }
            return i3 + i2;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setType(MentionType mentionType) {
            this.type = mentionType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MentionItem)) {
                return false;
            }
            MentionItem mentionItem = (MentionItem) obj;
            if (Objects.equals(this.id, mentionItem.id) && this.type == mentionItem.type) {
                return true;
            }
            return false;
        }
    }

    @JSONType(typeName = "OLProperty")
    public static class OLProperty extends RichTextProperty {
        private static final long serialVersionUID = 1600401076925651470L;
        private int start = 1;
        private Type type;

        public enum Type {
            NUMBER(0),
            LOWERCASE_A(1),
            UPPERCASE_A(2),
            LOWERCASE_ROMAN(3),
            UPPERCASE_ROMAN(4),
            NONE(5);
            
            private final int value;

            public int getType() {
                return this.value;
            }

            public static Type valueOf(int i) {
                return forType(i);
            }

            public static Type forType(int i) {
                if (i == 0) {
                    return NUMBER;
                }
                if (i == 1) {
                    return LOWERCASE_A;
                }
                if (i == 2) {
                    return UPPERCASE_A;
                }
                if (i == 3) {
                    return LOWERCASE_ROMAN;
                }
                if (i == 4) {
                    return UPPERCASE_ROMAN;
                }
                if (i != 5) {
                    return NUMBER;
                }
                return NONE;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public int getStart() {
            return this.start;
        }

        public Type getType() {
            return this.type;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(Integer.valueOf(super.hashCode()), this.type, Integer.valueOf(this.start));
        }

        public void setStart(int i) {
            this.start = i;
        }

        public void setType(Type type2) {
            this.type = type2;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            OLProperty oLProperty = (OLProperty) obj;
            if (this.start == oLProperty.start && this.type == oLProperty.type) {
                return true;
            }
            return false;
        }
    }

    @JSONType(typeName = "QuoteProperty")
    public static class QuoteProperty extends RichTextProperty {
        private static final long serialVersionUID = 5110524811160634106L;
    }

    @JSONType(typeName = "SelectMenuProperty")
    public static class SelectMenuProperty extends RichTextProperty {
        private String actionId;
        private ConfirmProperty confirm;
        private boolean disable;
        private String initialOption;
        private boolean isLoading;
        private List<MenuOption> options;
        private String placeHolder;
        private String placeHolderI18nKey;
        private Type type;

        public enum Type {
            UNKNOWN(0),
            STATIC(1),
            PERSON(2);
            
            private final int value;

            public int getType() {
                return this.value;
            }

            public static Type valueOf(int i) {
                return forType(i);
            }

            public static Type forType(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return STATIC;
                }
                if (i != 2) {
                    return UNKNOWN;
                }
                return PERSON;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public String getActionId() {
            return this.actionId;
        }

        public ConfirmProperty getConfirm() {
            return this.confirm;
        }

        public String getInitialOption() {
            return this.initialOption;
        }

        public List<MenuOption> getOptions() {
            return this.options;
        }

        public String getPlaceHolder() {
            return this.placeHolder;
        }

        public String getPlaceHolderI18nKey() {
            return this.placeHolderI18nKey;
        }

        public Type getType() {
            return this.type;
        }

        public boolean isDisable() {
            return this.disable;
        }

        public boolean isLoading() {
            return this.isLoading;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(this.type, this.actionId, this.placeHolder, this.placeHolderI18nKey, this.initialOption, this.options, this.confirm, Boolean.valueOf(this.disable), Boolean.valueOf(this.isLoading));
        }

        public void setActionId(String str) {
            this.actionId = str;
        }

        public void setConfirm(ConfirmProperty confirmProperty) {
            this.confirm = confirmProperty;
        }

        public void setDisable(boolean z) {
            this.disable = z;
        }

        public void setInitialOption(String str) {
            this.initialOption = str;
        }

        public void setLoading(boolean z) {
            this.isLoading = z;
        }

        public void setOptions(List<MenuOption> list) {
            this.options = list;
        }

        public void setPlaceHolder(String str) {
            this.placeHolder = str;
        }

        public void setPlaceHolderI18nKey(String str) {
            this.placeHolderI18nKey = str;
        }

        public void setType(Type type2) {
            this.type = type2;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            SelectMenuProperty selectMenuProperty = (SelectMenuProperty) obj;
            if (this.disable != selectMenuProperty.disable || this.isLoading != selectMenuProperty.isLoading || this.type != selectMenuProperty.type || !Objects.equals(this.actionId, selectMenuProperty.actionId) || !Objects.equals(this.placeHolder, selectMenuProperty.placeHolder) || !Objects.equals(this.placeHolderI18nKey, selectMenuProperty.placeHolderI18nKey) || !Objects.equals(this.initialOption, selectMenuProperty.initialOption) || !Objects.equals(this.options, selectMenuProperty.options) || !Objects.equals(this.confirm, selectMenuProperty.confirm)) {
                return false;
            }
            return true;
        }
    }

    @JSONType(typeName = "ULProperty")
    public static class ULProperty extends RichTextProperty {
        private static final long serialVersionUID = 7660246273726402517L;
        private Type type;

        public enum Type {
            DISC(0),
            CIRCLE(1),
            SQUARE(2),
            NONE(3);
            
            private final int value;

            public int getType() {
                return this.value;
            }

            public static Type valueOf(int i) {
                return forType(i);
            }

            public static Type forType(int i) {
                if (i == 0) {
                    return DISC;
                }
                if (i == 1) {
                    return CIRCLE;
                }
                if (i == 2) {
                    return SQUARE;
                }
                if (i != 3) {
                    return DISC;
                }
                return NONE;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        public Type getType() {
            return this.type;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(Integer.valueOf(super.hashCode()), this.type);
        }

        public void setType(Type type2) {
            this.type = type2;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj) || this.type != ((ULProperty) obj).type) {
                return false;
            }
            return true;
        }
    }

    @JSONType(typeName = "UnderlineProperty")
    public static class UnderlineProperty extends TextProperty {
    }

    public void clearElementExtra() {
        this.elementExtra = null;
    }

    @JSONType(ignores = {"localIconRes", "displayTitle", HiAnalyticsConstant.HaKey.BI_KEY_VERSION}, typeName = "AnchorProperty")
    public static class AnchorProperty extends RichTextProperty {
        private String androidHref;
        private String content;
        private String displayTitle;
        private String href;
        private String i18nKey;
        private String iconKey;
        private boolean isUrlPreview;
        private int localGrayIconRes;
        private int localIconRes;
        private int version = -1;

        public String getAndroidHref() {
            return this.androidHref;
        }

        public String getContent() {
            return this.content;
        }

        public String getDisplayTitle() {
            return this.displayTitle;
        }

        public String getHref() {
            return this.href;
        }

        public String getI18nKey() {
            return this.i18nKey;
        }

        public String getIconKey() {
            return this.iconKey;
        }

        public int getLocalGrayIconRes() {
            return this.localGrayIconRes;
        }

        public int getLocalIconRes() {
            return this.localIconRes;
        }

        public int getVersion() {
            return this.version;
        }

        public boolean isUrlPreview() {
            return this.isUrlPreview;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(this.href, this.content, this.androidHref, this.i18nKey, Integer.valueOf(this.localIconRes), this.displayTitle, Boolean.valueOf(this.isUrlPreview));
        }

        public String toString() {
            return "AnchorProperty{href='" + this.href + '\'' + ", content='" + this.content + '\'' + ", androidHref='" + this.androidHref + '\'' + ", i18nKey='" + this.i18nKey + '\'' + ", localIconRes=" + this.localIconRes + ", localGrayIconRes=" + this.localGrayIconRes + ", iconKey='" + this.iconKey + '\'' + ", displayTitle='" + this.displayTitle + '\'' + ", isUrlPreview=" + this.isUrlPreview + ", version=" + this.version + '}';
        }

        public void setAndroidHref(String str) {
            this.androidHref = str;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setDisplayTitle(String str) {
            this.displayTitle = str;
        }

        public void setHref(String str) {
            this.href = str;
        }

        public void setI18nKey(String str) {
            this.i18nKey = str;
        }

        public void setIconKey(String str) {
            this.iconKey = str;
        }

        public void setLocalGrayIconRes(int i) {
            this.localGrayIconRes = i;
        }

        public void setLocalIconRes(int i) {
            this.localIconRes = i;
        }

        public void setUrlPreview(boolean z) {
            this.isUrlPreview = z;
        }

        public void setVersion(int i) {
            this.version = i;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnchorProperty anchorProperty = (AnchorProperty) obj;
            try {
                if (!this.href.equals(anchorProperty.href) || !this.content.equals(anchorProperty.content) || this.localIconRes != anchorProperty.localIconRes || this.isUrlPreview != anchorProperty.isUrlPreview || !TextUtils.equals(this.displayTitle, anchorProperty.displayTitle) || this.version != anchorProperty.version) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    @JSONType(typeName = "AtProperty")
    public static class AtProperty extends RichTextProperty {
        private String content;
        private boolean isAnonymous;
        private boolean isOutChatUser;
        private String userId;

        public String getUserId() {
            return this.userId;
        }

        public boolean isAnonymous() {
            return this.isAnonymous;
        }

        public boolean isOutChatUser() {
            return this.isOutChatUser;
        }

        public String getAtContent() {
            String str = this.content;
            if (str == null) {
                Log.m165383e("RichTextElement", "At content is null");
                return "@";
            } else if (str.startsWith("@")) {
                return this.content;
            } else {
                return "@" + this.content;
            }
        }

        public String getContent() {
            String str = this.content;
            if (str == null || str.startsWith("@")) {
                return this.content;
            }
            return "@" + this.content;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(this.userId, this.content, Boolean.valueOf(this.isOutChatUser), Boolean.valueOf(this.isAnonymous));
        }

        public void setAnonymous(boolean z) {
            this.isAnonymous = z;
        }

        public void setOutChatUser(boolean z) {
            this.isOutChatUser = z;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AtProperty atProperty = (AtProperty) obj;
            if (this.isAnonymous != atProperty.isAnonymous) {
                return false;
            }
            try {
                if (!this.userId.equals(atProperty.userId) || !this.content.equals(atProperty.content)) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public void setContent(String str) {
            boolean z;
            this.content = str;
            String atContent = getAtContent();
            if (TextUtils.isEmpty(this.userId) || !this.userId.equals(C58377d.m226286a().mo102878a()) || EditTextLengthFilter.m224560a(atContent, 0, atContent.length()) <= 18) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.content = ((Object) EditTextLengthFilter.m224561b(atContent, 0, 18)) + "...";
            }
        }
    }

    public static class ConfirmProperty implements Serializable {
        private String confirm;
        private String confirmI18NKey;
        private String dismiss;
        private String dismissI18NKey;
        private String text;
        private String textI18NKey;
        private String title;
        private String titleI18NKey;

        public String getConfirm() {
            return this.confirm;
        }

        public String getConfirmI18NKey() {
            return this.confirmI18NKey;
        }

        public String getDismiss() {
            return this.dismiss;
        }

        public String getDismissI18NKey() {
            return this.dismissI18NKey;
        }

        public String getText() {
            return this.text;
        }

        public String getTextI18NKey() {
            return this.textI18NKey;
        }

        public String getTitle() {
            return this.title;
        }

        public String getTitleI18NKey() {
            return this.titleI18NKey;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            String str = this.title;
            int i8 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i9 = i * 31;
            String str2 = this.text;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i10 = (i9 + i2) * 31;
            String str3 = this.confirm;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i11 = (i10 + i3) * 31;
            String str4 = this.dismiss;
            if (str4 != null) {
                i4 = str4.hashCode();
            } else {
                i4 = 0;
            }
            int i12 = (i11 + i4) * 31;
            String str5 = this.titleI18NKey;
            if (str5 != null) {
                i5 = str5.hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            String str6 = this.textI18NKey;
            if (str6 != null) {
                i6 = str6.hashCode();
            } else {
                i6 = 0;
            }
            int i14 = (i13 + i6) * 31;
            String str7 = this.confirmI18NKey;
            if (str7 != null) {
                i7 = str7.hashCode();
            } else {
                i7 = 0;
            }
            int i15 = (i14 + i7) * 31;
            String str8 = this.dismissI18NKey;
            if (str8 != null) {
                i8 = str8.hashCode();
            }
            return i15 + i8;
        }

        public void setConfirm(String str) {
            this.confirm = str;
        }

        public void setConfirmI18NKey(String str) {
            this.confirmI18NKey = str;
        }

        public void setDismiss(String str) {
            this.dismiss = str;
        }

        public void setDismissI18NKey(String str) {
            this.dismissI18NKey = str;
        }

        public void setText(String str) {
            this.text = str;
        }

        public void setTextI18NKey(String str) {
            this.textI18NKey = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setTitleI18NKey(String str) {
            this.titleI18NKey = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ConfirmProperty confirmProperty = (ConfirmProperty) obj;
            if (Objects.equals(this.title, confirmProperty.title) && Objects.equals(this.text, confirmProperty.text) && Objects.equals(this.confirm, confirmProperty.confirm) && Objects.equals(this.dismiss, confirmProperty.dismiss) && Objects.equals(this.titleI18NKey, confirmProperty.titleI18NKey) && Objects.equals(this.textI18NKey, confirmProperty.textI18NKey) && Objects.equals(this.confirmI18NKey, confirmProperty.confirmI18NKey)) {
                return Objects.equals(this.dismissI18NKey, confirmProperty.dismissI18NKey);
            }
            return false;
        }
    }

    @JSONType(typeName = "DatePickerProperty")
    public static class DatePickerProperty extends RichTextProperty {
        public String actionId;
        public ConfirmProperty confirm;
        public boolean disable;
        public String initialDate;
        public boolean isLoading;
        public String placeHolder;
        public String placeHolderI18nKey;

        public String getActionId() {
            return this.actionId;
        }

        public ConfirmProperty getConfirm() {
            return this.confirm;
        }

        public String getInitialDate() {
            return this.initialDate;
        }

        public String getPlaceHolder() {
            return this.placeHolder;
        }

        public String getPlaceHolderI18nKey() {
            return this.placeHolderI18nKey;
        }

        public boolean isDisable() {
            return this.disable;
        }

        public boolean isLoading() {
            return this.isLoading;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(this.actionId, this.placeHolder, this.placeHolderI18nKey, this.initialDate, this.confirm, Boolean.valueOf(this.disable), Boolean.valueOf(this.isLoading));
        }

        public void setActionId(String str) {
            this.actionId = str;
        }

        public void setConfirm(ConfirmProperty confirmProperty) {
            this.confirm = confirmProperty;
        }

        public void setDisable(boolean z) {
            this.disable = z;
        }

        public void setInitialDate(String str) {
            this.initialDate = str;
        }

        public void setLoading(boolean z) {
            this.isLoading = z;
        }

        public void setPlaceHolder(String str) {
            this.placeHolder = str;
        }

        public void setPlaceHolderI18nKey(String str) {
            this.placeHolderI18nKey = str;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            DatePickerProperty datePickerProperty = (DatePickerProperty) obj;
            if (this.disable != datePickerProperty.disable || this.isLoading != datePickerProperty.isLoading || !Objects.equals(this.actionId, datePickerProperty.actionId) || !Objects.equals(this.placeHolder, datePickerProperty.placeHolder) || !Objects.equals(this.placeHolderI18nKey, datePickerProperty.placeHolderI18nKey) || !Objects.equals(this.initialDate, datePickerProperty.initialDate) || !Objects.equals(this.confirm, datePickerProperty.confirm)) {
                return false;
            }
            return true;
        }
    }

    @JSONType(typeName = "DateTimePickerProperty")
    public static class DateTimePickerProperty extends RichTextProperty {
        private String actionId;
        private ConfirmProperty confirm;
        private boolean disable;
        private String initialDateTime;
        private boolean isLoading;
        private String placeHolder;
        private String placeHolderI18nKey;

        public String getActionId() {
            return this.actionId;
        }

        public ConfirmProperty getConfirm() {
            return this.confirm;
        }

        public String getInitialDateTime() {
            return this.initialDateTime;
        }

        public String getPlaceHolder() {
            return this.placeHolder;
        }

        public String getPlaceHolderI18nKey() {
            return this.placeHolderI18nKey;
        }

        public boolean isDisable() {
            return this.disable;
        }

        public boolean isLoading() {
            return this.isLoading;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(this.actionId, this.placeHolder, this.placeHolderI18nKey, this.initialDateTime, this.confirm, Boolean.valueOf(this.disable), Boolean.valueOf(this.isLoading));
        }

        public void setActionId(String str) {
            this.actionId = str;
        }

        public void setConfirm(ConfirmProperty confirmProperty) {
            this.confirm = confirmProperty;
        }

        public void setDisable(boolean z) {
            this.disable = z;
        }

        public void setInitialDateTime(String str) {
            this.initialDateTime = str;
        }

        public void setLoading(boolean z) {
            this.isLoading = z;
        }

        public void setPlaceHolder(String str) {
            this.placeHolder = str;
        }

        public void setPlaceHolderI18nKey(String str) {
            this.placeHolderI18nKey = str;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            DatePickerProperty datePickerProperty = (DatePickerProperty) obj;
            if (this.disable != datePickerProperty.disable || this.isLoading != datePickerProperty.isLoading || !Objects.equals(this.actionId, datePickerProperty.actionId) || !Objects.equals(this.placeHolder, datePickerProperty.placeHolder) || !Objects.equals(this.placeHolderI18nKey, datePickerProperty.placeHolderI18nKey) || !Objects.equals(this.initialDateTime, datePickerProperty.initialDate) || !Objects.equals(this.confirm, datePickerProperty.confirm)) {
                return false;
            }
            return true;
        }
    }

    @JSONType(typeName = "EmotionProperty")
    public static class EmotionProperty extends RichTextProperty {
        private String key;

        public String getKey() {
            return this.key;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            String str = this.key;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public void setKey(String str) {
            this.key = str;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            String str = this.key;
            String str2 = ((EmotionProperty) obj).key;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }
    }

    @JSONType(typeName = "ImageProperty")
    public static class ImageProperty extends RichTextProperty {
        private String alt;
        private String altI18nKey;
        private boolean imgCanPreview;
        private String intactKey;
        private boolean isOriginSource;
        private String middleKey;
        private int originHeight;
        private String originKey;
        private long originSize;
        private int originWidth;
        private String thumbKey;
        private String token;
        private List<String> urls;

        public String getAlt() {
            return this.alt;
        }

        public String getAltI18nKey() {
            return this.altI18nKey;
        }

        public String getIntactKey() {
            return this.intactKey;
        }

        public String getMiddleKey() {
            return this.middleKey;
        }

        public int getOriginHeight() {
            return this.originHeight;
        }

        public String getOriginKey() {
            return this.originKey;
        }

        public long getOriginSize() {
            return this.originSize;
        }

        public int getOriginWidth() {
            return this.originWidth;
        }

        public String getThumbKey() {
            return this.thumbKey;
        }

        public String getToken() {
            return this.token;
        }

        public List<String> getUrls() {
            return this.urls;
        }

        public boolean isImgCanPreview() {
            return this.imgCanPreview;
        }

        public boolean isOriginSource() {
            return this.isOriginSource;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            int i;
            int i2;
            List<String> list = this.urls;
            int i3 = 0;
            if (list != null) {
                i = list.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str = this.token;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            String str2 = this.originKey;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            return ((((i5 + i3) * 31) + this.originWidth) * 31) + this.originHeight;
        }

        public void setAlt(String str) {
            this.alt = str;
        }

        public void setAltI18nKey(String str) {
            this.altI18nKey = str;
        }

        public void setImgCanPreview(boolean z) {
            this.imgCanPreview = z;
        }

        public void setIntactKey(String str) {
            this.intactKey = str;
        }

        public void setMiddleKey(String str) {
            this.middleKey = str;
        }

        public void setOriginHeight(int i) {
            this.originHeight = i;
        }

        public void setOriginKey(String str) {
            this.originKey = str;
        }

        public void setOriginSize(long j) {
            this.originSize = j;
        }

        public void setOriginSource(boolean z) {
            this.isOriginSource = z;
        }

        public void setOriginWidth(int i) {
            this.originWidth = i;
        }

        public void setThumbKey(String str) {
            this.thumbKey = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setUrls(List<String> list) {
            this.urls = new ArrayList(list);
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageProperty) || !super.equals(obj)) {
                return false;
            }
            ImageProperty imageProperty = (ImageProperty) obj;
            if (this.originWidth != imageProperty.originWidth || this.originHeight != imageProperty.originHeight) {
                return false;
            }
            List<String> list = this.urls;
            if (list == null ? imageProperty.urls != null : !list.equals(imageProperty.urls)) {
                return false;
            }
            String str = this.token;
            if (str == null ? imageProperty.token != null : !str.equals(imageProperty.token)) {
                return false;
            }
            String str2 = this.originKey;
            String str3 = imageProperty.originKey;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }
    }

    @JSONType(typeName = "LIProperty")
    public static class LIProperty extends RichTextProperty {
        private static final long serialVersionUID = 560963231881508837L;
        private int floor;
        private String listNum = "";

        public int getFloor() {
            return this.floor;
        }

        public String getListNum() {
            return this.listNum;
        }

        public void setFloor(int i) {
            this.floor = i;
        }

        public void setListNum(String str) {
            this.listNum = str;
        }
    }

    @JSONType(typeName = "MentionProperty")
    public static class MentionProperty extends RichTextProperty {
        private String content;
        private boolean isAuthorized;
        private MentionItem mentionItem;
        private String redirectUrl;

        public String getContent() {
            return this.content;
        }

        public MentionItem getMentionItem() {
            return this.mentionItem;
        }

        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        public boolean isAuthorized() {
            return this.isAuthorized;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            int i;
            int i2;
            int hashCode = super.hashCode() * 31;
            MentionItem mentionItem2 = this.mentionItem;
            int i3 = 0;
            if (mentionItem2 != null) {
                i = mentionItem2.hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 31;
            String str = this.content;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + (this.isAuthorized ? 1 : 0)) * 31;
            String str2 = this.redirectUrl;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            return i5 + i3;
        }

        public void setAuthorized(boolean z) {
            this.isAuthorized = z;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setMentionItem(MentionItem mentionItem2) {
            this.mentionItem = mentionItem2;
        }

        public void setRedirectUrl(String str) {
            this.redirectUrl = str;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MentionProperty) || !super.equals(obj)) {
                return false;
            }
            MentionProperty mentionProperty = (MentionProperty) obj;
            if (this.isAuthorized == mentionProperty.isAuthorized && Objects.equals(this.mentionItem, mentionProperty.mentionItem) && Objects.equals(this.content, mentionProperty.content)) {
                return Objects.equals(this.redirectUrl, mentionProperty.redirectUrl);
            }
            return false;
        }
    }

    public static class MenuOption implements Serializable {
        private String i18Key;
        private String optionActionId;
        private String text;
        private String value;

        public String getI18Key() {
            return this.i18Key;
        }

        public String getOptionActionId() {
            return this.optionActionId;
        }

        public String getText() {
            return this.text;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return Objects.hash(this.text, this.i18Key, this.value, this.optionActionId);
        }

        public void setI18Key(String str) {
            this.i18Key = str;
        }

        public void setOptionActionId(String str) {
            this.optionActionId = str;
        }

        public void setText(String str) {
            this.text = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MenuOption menuOption = (MenuOption) obj;
            if (!Objects.equals(this.text, menuOption.text) || !Objects.equals(this.i18Key, menuOption.i18Key) || !Objects.equals(this.value, menuOption.value) || !Objects.equals(this.optionActionId, menuOption.optionActionId)) {
                return false;
            }
            return true;
        }
    }

    @JSONType(typeName = "OverflowMenuProperty")
    public static class OverflowMenuProperty extends RichTextProperty {
        private String actionId;
        private ConfirmProperty confirm;
        private boolean disable;
        private boolean isLoading;
        private List<MenuOption> options;

        public String getActionId() {
            return this.actionId;
        }

        public ConfirmProperty getConfirm() {
            return this.confirm;
        }

        public List<MenuOption> getOptions() {
            return this.options;
        }

        public boolean isDisable() {
            return this.disable;
        }

        public boolean isLoading() {
            return this.isLoading;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(this.actionId, this.options, this.confirm, Boolean.valueOf(this.disable), Boolean.valueOf(this.isLoading));
        }

        public void setActionId(String str) {
            this.actionId = str;
        }

        public void setConfirm(ConfirmProperty confirmProperty) {
            this.confirm = confirmProperty;
        }

        public void setDisable(boolean z) {
            this.disable = z;
        }

        public void setLoading(boolean z) {
            this.isLoading = z;
        }

        public void setOptions(List<MenuOption> list) {
            this.options = list;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            OverflowMenuProperty overflowMenuProperty = (OverflowMenuProperty) obj;
            if (this.disable != overflowMenuProperty.disable || this.isLoading != overflowMenuProperty.isLoading || !Objects.equals(this.actionId, overflowMenuProperty.actionId) || !Objects.equals(this.options, overflowMenuProperty.options) || !Objects.equals(this.confirm, overflowMenuProperty.confirm)) {
                return false;
            }
            return true;
        }
    }

    @JSONType(typeName = "ParagraphProperty")
    public static class ParagraphProperty extends RichTextProperty {
        private boolean isNeedEnter = true;

        public boolean getIsNeedEnter() {
            return this.isNeedEnter;
        }

        public void setIsNeedEnter(boolean z) {
            this.isNeedEnter = z;
        }
    }

    @JSONType(typeName = "ProgressSelectOptionProperty")
    public static class ProgressSelectOptionProperty extends RichTextProperty {
        String actionId;
        String actionParamName;
        String actionParamValue;
        String content;
        boolean disable;
        int numberOfSelected;
        int numberOfTotal;
        String optionCase;
        boolean selected;

        public String getActionId() {
            return this.actionId;
        }

        public String getActionParamName() {
            return this.actionParamName;
        }

        public String getActionParamValue() {
            return this.actionParamValue;
        }

        public String getContent() {
            return this.content;
        }

        public int getNumberOfSelected() {
            return this.numberOfSelected;
        }

        public int getNumberOfTotal() {
            return this.numberOfTotal;
        }

        public String getOptionCase() {
            return this.optionCase;
        }

        public boolean isDisable() {
            return this.disable;
        }

        public boolean isSelected() {
            return this.selected;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            String str = this.actionId;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = i * 31;
            String str2 = this.actionParamName;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str3 = this.actionParamValue;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (((((i7 + i3) * 31) + (this.disable ? 1 : 0)) * 31) + (this.selected ? 1 : 0)) * 31;
            String str4 = this.optionCase;
            if (str4 != null) {
                i4 = str4.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            String str5 = this.content;
            if (str5 != null) {
                i5 = str5.hashCode();
            }
            return ((((i9 + i5) * 31) + this.numberOfSelected) * 31) + this.numberOfTotal;
        }

        public void setActionId(String str) {
            this.actionId = str;
        }

        public void setActionParamName(String str) {
            this.actionParamName = str;
        }

        public void setActionParamValue(String str) {
            this.actionParamValue = str;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setDisable(boolean z) {
            this.disable = z;
        }

        public void setNumberOfSelected(int i) {
            this.numberOfSelected = i;
        }

        public void setNumberOfTotal(int i) {
            this.numberOfTotal = i;
        }

        public void setOptionCase(String str) {
            this.optionCase = str;
        }

        public void setSelected(boolean z) {
            this.selected = z;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            ProgressSelectOptionProperty progressSelectOptionProperty = (ProgressSelectOptionProperty) obj;
            if (this.disable != progressSelectOptionProperty.disable || this.selected != progressSelectOptionProperty.selected || this.numberOfSelected != progressSelectOptionProperty.numberOfSelected || this.numberOfTotal != progressSelectOptionProperty.numberOfTotal) {
                return false;
            }
            String str = this.actionId;
            if (str == null ? progressSelectOptionProperty.actionId != null : !str.equals(progressSelectOptionProperty.actionId)) {
                return false;
            }
            String str2 = this.actionParamName;
            if (str2 == null ? progressSelectOptionProperty.actionParamName != null : !str2.equals(progressSelectOptionProperty.actionParamName)) {
                return false;
            }
            String str3 = this.actionParamValue;
            if (str3 == null ? progressSelectOptionProperty.actionParamValue != null : !str3.equals(progressSelectOptionProperty.actionParamValue)) {
                return false;
            }
            String str4 = this.optionCase;
            if (str4 == null ? progressSelectOptionProperty.optionCase != null : !str4.equals(progressSelectOptionProperty.optionCase)) {
                return false;
            }
            String str5 = this.content;
            String str6 = progressSelectOptionProperty.content;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 == null) {
                return true;
            }
            return false;
        }
    }

    public enum RichTextTag {
        UNKNOWN_TAG(0),
        TEXT(1),
        IMG(2),
        PARAGRAPH(3),
        FIGURE(4),
        AT(5),
        ANCHOR(6),
        BOLD(7),
        ITALIC(8),
        UNDERLINE(9),
        EMOTION(10),
        BUTTON(11),
        SELECT(12),
        PROGRESS_SELECT_OPTION(13),
        DIV(14),
        TEXTABLEAREA(15),
        TIME(16),
        LINK(17),
        MEDIA(18),
        SELECTMENU(19),
        OVERFLOWMENU(20),
        DATEPICKER(21),
        DOCS(22),
        H1(23),
        H2(24),
        H3(25),
        UL(26),
        OL(27),
        LI(28),
        QUOTE(29),
        CODE(30),
        CODE_BLOCK(31),
        HR(32),
        TIMEPICKER(33),
        DATETIMEPICKER(34),
        MENTION(36);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static RichTextTag valueOf(int i) {
            return forNumber(i);
        }

        public static RichTextTag forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_TAG;
                case 1:
                    return TEXT;
                case 2:
                    return IMG;
                case 3:
                    return PARAGRAPH;
                case 4:
                    return FIGURE;
                case 5:
                    return AT;
                case 6:
                    return ANCHOR;
                case 7:
                    return BOLD;
                case 8:
                    return ITALIC;
                case 9:
                    return UNDERLINE;
                case 10:
                    return EMOTION;
                case 11:
                    return BUTTON;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return SELECT;
                case 13:
                    return PROGRESS_SELECT_OPTION;
                case 14:
                    return DIV;
                case 15:
                    return TEXTABLEAREA;
                case 16:
                    return TIME;
                case 17:
                    return LINK;
                case 18:
                    return MEDIA;
                case 19:
                    return SELECTMENU;
                case 20:
                    return OVERFLOWMENU;
                case 21:
                    return DATEPICKER;
                case 22:
                    return DOCS;
                case 23:
                    return H1;
                case 24:
                    return H2;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    return H3;
                case 26:
                    return UL;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                    return OL;
                case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                    return LI;
                case 29:
                    return QUOTE;
                case 30:
                    return CODE;
                case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                    return CODE_BLOCK;
                case 32:
                    return HR;
                case 33:
                    return TIMEPICKER;
                case 34:
                    return DATETIMEPICKER;
                case 35:
                default:
                    return UNKNOWN_TAG;
                case 36:
                    return MENTION;
            }
        }

        private RichTextTag(int i) {
            this.value = i;
        }
    }

    @JSONType(typeName = "SelectProperty")
    public static class SelectProperty extends RichTextProperty {
        private int mMaxPickNum;
        private int mMinPickNum;

        public int getMaxPickNum() {
            return this.mMaxPickNum;
        }

        public int getMinPickNum() {
            return this.mMinPickNum;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return (this.mMinPickNum * 31) + this.mMaxPickNum;
        }

        public void setMaxPickNum(int i) {
            this.mMaxPickNum = i;
        }

        public void setMinPickNum(int i) {
            this.mMinPickNum = i;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            SelectProperty selectProperty = (SelectProperty) obj;
            if (this.mMinPickNum == selectProperty.mMinPickNum && this.mMaxPickNum == selectProperty.mMaxPickNum) {
                return true;
            }
            return false;
        }
    }

    @JSONType(typeName = "TextProperty")
    public static class TextProperty extends RichTextProperty {
        protected String content;
        protected String i18nKey;
        protected int numberOfLines;

        public String getContent() {
            return this.content;
        }

        public String getI18nKey() {
            return this.i18nKey;
        }

        public int getNumberOfLines() {
            return this.numberOfLines;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(this.content, this.i18nKey, Integer.valueOf(this.numberOfLines));
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setI18nKey(String str) {
            this.i18nKey = str;
        }

        public void setNumberOfLines(int i) {
            this.numberOfLines = i;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TextProperty textProperty = (TextProperty) obj;
            String str = this.content;
            if (str != null) {
                return str.equals(textProperty.content);
            }
            if (textProperty.content == null) {
                return true;
            }
            return false;
        }
    }

    @JSONType(typeName = "TextableAreaProperty")
    public static class TextableAreaProperty extends RichTextProperty {
        private int numberOfLines;

        public int getNumberOfLines() {
            return this.numberOfLines;
        }

        public void setNumberOfLines(int i) {
            this.numberOfLines = i;
        }
    }

    @JSONType(typeName = "TimePickerProperty")
    public static class TimePickerProperty extends RichTextProperty {
        private String actionId;
        private ConfirmProperty confirm;
        private boolean disable;
        private String initialTime;
        private boolean isLoading;
        private String placeHolder;
        private String placeHolderI18nKey;

        public String getActionId() {
            return this.actionId;
        }

        public ConfirmProperty getConfirm() {
            return this.confirm;
        }

        public String getInitialTime() {
            return this.initialTime;
        }

        public String getPlaceHolder() {
            return this.placeHolder;
        }

        public String getPlaceHolderI18nKey() {
            return this.placeHolderI18nKey;
        }

        public boolean isDisable() {
            return this.disable;
        }

        public boolean isLoading() {
            return this.isLoading;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            return Objects.hash(this.actionId, this.placeHolder, this.placeHolderI18nKey, this.initialTime, this.confirm, Boolean.valueOf(this.disable), Boolean.valueOf(this.isLoading));
        }

        public void setActionId(String str) {
            this.actionId = str;
        }

        public void setConfirm(ConfirmProperty confirmProperty) {
            this.confirm = confirmProperty;
        }

        public void setDisable(boolean z) {
            this.disable = z;
        }

        public void setInitialTime(String str) {
            this.initialTime = str;
        }

        public void setLoading(boolean z) {
            this.isLoading = z;
        }

        public void setPlaceHolder(String str) {
            this.placeHolder = str;
        }

        public void setPlaceHolderI18nKey(String str) {
            this.placeHolderI18nKey = str;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            DatePickerProperty datePickerProperty = (DatePickerProperty) obj;
            if (this.disable != datePickerProperty.disable || this.isLoading != datePickerProperty.isLoading || !Objects.equals(this.actionId, datePickerProperty.actionId) || !Objects.equals(this.placeHolder, datePickerProperty.placeHolder) || !Objects.equals(this.placeHolderI18nKey, datePickerProperty.placeHolderI18nKey) || !Objects.equals(this.initialTime, datePickerProperty.initialDate) || !Objects.equals(this.confirm, datePickerProperty.confirm)) {
                return false;
            }
            return true;
        }
    }

    @JSONType(typeName = "TimeProperty")
    public static class TimeProperty extends RichTextProperty {
        private String format = "YYYY.MM.DD(dddd) HH:mm (GMT)";
        private long millisecondSince1970;

        public String getFormat() {
            return this.format;
        }

        public long getMillisecondSince1970() {
            return this.millisecondSince1970;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public int hashCode() {
            int i;
            long j = this.millisecondSince1970;
            int i2 = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.format;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public void setFormat(String str) {
            this.format = str;
        }

        public void setMillisecondSince1970(long j) {
            this.millisecondSince1970 = j;
        }

        @Override // com.ss.android.lark.widget.richtext.RichTextElement.RichTextProperty
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            TimeProperty timeProperty = (TimeProperty) obj;
            if (this.millisecondSince1970 != timeProperty.millisecondSince1970) {
                return false;
            }
            String str = this.format;
            String str2 = timeProperty.format;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }
    }

    public List<String> getChildIds() {
        return this.childIds;
    }

    public <T extends RichTextProperty> T getProperty() {
        return (T) this.property;
    }

    public Map<String, String> getStyle() {
        return this.style;
    }

    public List<String> getStyleKeys() {
        return this.styleKeys;
    }

    public RichTextTag getTag() {
        return this.tag;
    }

    @JSONType(seeAlso = {ParagraphProperty.class, FigureProperty.class, TextProperty.class, ItalicProperty.class, BoldProperty.class, UnderlineProperty.class, AnchorProperty.class, AtProperty.class, ImageProperty.class, EmotionProperty.class, ButtonProperty.class, SelectProperty.class, ProgressSelectOptionProperty.class, DivProperty.class, TimeProperty.class, LinkProperty.class, MediaProperty.class, SelectMenuProperty.class, OverflowMenuProperty.class, DatePickerProperty.class, DocsProperty.class, H1Property.class, H2Property.class, H3Property.class, ULProperty.class, OLProperty.class, LIProperty.class, QuoteProperty.class, CodeProperty.class, CodeBlockProperty.class, HRProperty.class, TimePickerProperty.class, DateTimePickerProperty.class})
    public static abstract class RichTextProperty implements Serializable {
        public boolean equals(Object obj) {
            return true;
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    public ElementExtra getElementExtra() {
        if (this.elementExtra == null) {
            this.elementExtra = new ElementExtra();
        }
        return this.elementExtra;
    }

    public int hashCode() {
        return Objects.hash(this.tag, this.style, this.property, this.childIds);
    }

    public void setProperty(RichTextProperty richTextProperty) {
        this.property = richTextProperty;
    }

    public void setStyleKeys(List<String> list) {
        this.styleKeys = list;
    }

    public void setTag(RichTextTag richTextTag) {
        this.tag = richTextTag;
    }

    public void setChildIds(List<String> list) {
        this.childIds = new ArrayList(list);
    }

    public void setStyle(Map<String, String> map) {
        this.style = new HashMap(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RichTextElement richTextElement = (RichTextElement) obj;
        if (this.tag != richTextElement.tag) {
            return false;
        }
        RichTextProperty richTextProperty = this.property;
        if (richTextProperty == null ? richTextElement.property != null : !richTextProperty.equals(richTextElement.property)) {
            return false;
        }
        List<String> list = this.childIds;
        List<String> list2 = richTextElement.childIds;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }
}
