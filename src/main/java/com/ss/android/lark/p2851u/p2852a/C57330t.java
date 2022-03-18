package com.ss.android.lark.p2851u.p2852a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.u.a.t */
public class C57330t {

    /* renamed from: a */
    private static AbstractC36509x f141188a = C29990c.m110930b().mo134597y();

    /* renamed from: a */
    public static RichTextElement.TextProperty m222220a(RichTextElement.TextProperty textProperty) throws Exception {
        String str;
        RichTextElement.TextProperty textProperty2 = new RichTextElement.TextProperty();
        String str2 = "";
        if (textProperty == null) {
            str = str2;
        } else {
            str = textProperty.content;
        }
        textProperty2.setContent(str);
        if (textProperty != null) {
            str2 = textProperty.i18n_key;
        }
        textProperty2.setI18nKey(str2);
        textProperty2.setNumberOfLines((textProperty == null || textProperty.numberOfLines == null) ? 0 : textProperty.numberOfLines.intValue());
        return textProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.ImageProperty m222206a(RichTextElement.ImageProperty imageProperty) throws Exception {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        boolean z;
        long j;
        RichTextElement.ImageProperty imageProperty2 = new RichTextElement.ImageProperty();
        imageProperty2.setUrls(imageProperty == null ? new ArrayList<>() : imageProperty.urls);
        String str4 = "";
        if (imageProperty == null) {
            str = str4;
        } else {
            str = imageProperty.token;
        }
        imageProperty2.setToken(str);
        if (!(imageProperty == null || imageProperty.intact == null || imageProperty.intact.exif_orientation.intValue() <= 0)) {
            imageProperty2.setIntactKey(imageProperty.intact.key);
        }
        if (imageProperty == null) {
            str2 = str4;
        } else {
            str2 = imageProperty.origin_key;
        }
        imageProperty2.setOriginKey(str2);
        boolean z2 = false;
        if (imageProperty == null) {
            i = 0;
        } else {
            i = imageProperty.origin_width.intValue();
        }
        imageProperty2.setOriginWidth(i);
        if (imageProperty == null) {
            i2 = 0;
        } else {
            i2 = imageProperty.origin_height.intValue();
        }
        imageProperty2.setOriginHeight(i2);
        imageProperty2.setMiddleKey(f141188a.mo134740b(imageProperty));
        imageProperty2.setThumbKey(f141188a.mo134734a(imageProperty));
        if (imageProperty == null) {
            str3 = str4;
        } else {
            str3 = imageProperty.alt;
        }
        imageProperty2.setAlt(str3);
        if (imageProperty != null) {
            str4 = imageProperty.alt_i18n_key;
        }
        imageProperty2.setAltI18nKey(str4);
        if (imageProperty == null) {
            z = false;
        } else {
            z = imageProperty.img_can_preview.booleanValue();
        }
        imageProperty2.setImgCanPreview(z);
        if (imageProperty != null) {
            z2 = imageProperty.is_origin_source.booleanValue();
        }
        imageProperty2.setOriginSource(z2);
        if (imageProperty == null) {
            j = 0;
        } else {
            j = imageProperty.origin_size.longValue();
        }
        imageProperty2.setOriginSize(j);
        return imageProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.ParagraphProperty m222215a(RichTextElement.ParagraphProperty paragraphProperty) throws Exception {
        return new RichTextElement.ParagraphProperty();
    }

    /* renamed from: a */
    public static RichTextElement.FigureProperty m222201a(RichTextElement.FigureProperty figureProperty) throws Exception {
        return new RichTextElement.FigureProperty();
    }

    /* renamed from: a */
    public static RichTextElement.ItalicProperty m222207a(RichTextElement.ItalicProperty italicProperty) throws Exception {
        String str;
        RichTextElement.ItalicProperty italicProperty2 = new RichTextElement.ItalicProperty();
        String str2 = "";
        if (italicProperty == null) {
            str = str2;
        } else {
            str = italicProperty.content;
        }
        italicProperty2.setContent(str);
        if (italicProperty != null) {
            str2 = italicProperty.i18n_key;
        }
        italicProperty2.setContent(str2);
        return italicProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.UnderlineProperty m222225a(RichTextElement.UnderlineProperty underlineProperty) throws Exception {
        String str;
        RichTextElement.UnderlineProperty underlineProperty2 = new RichTextElement.UnderlineProperty();
        String str2 = "";
        if (underlineProperty == null) {
            str = str2;
        } else {
            str = underlineProperty.content;
        }
        underlineProperty2.setContent(str);
        if (underlineProperty != null) {
            str2 = underlineProperty.i18n_key;
        }
        underlineProperty2.setI18nKey(str2);
        return underlineProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.EmotionProperty m222200a(RichTextElement.EmotionProperty emotionProperty) throws Exception {
        String str;
        RichTextElement.EmotionProperty emotionProperty2 = new RichTextElement.EmotionProperty();
        if (emotionProperty == null) {
            str = "";
        } else {
            str = emotionProperty.key;
        }
        emotionProperty2.setKey(str);
        return emotionProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.SelectProperty m222219a(RichTextElement.SelectProperty selectProperty) throws Exception {
        int i;
        RichTextElement.SelectProperty selectProperty2 = new RichTextElement.SelectProperty();
        int i2 = 0;
        if (selectProperty == null) {
            i = 0;
        } else {
            i = selectProperty.min_pick_num.intValue();
        }
        selectProperty2.setMinPickNum(i);
        if (selectProperty != null) {
            i2 = selectProperty.max_pick_num.intValue();
        }
        selectProperty2.setMaxPickNum(i2);
        return selectProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.ProgressSelectOptionProperty m222216a(RichTextElement.ProgressSelectOptionProperty progressSelectOptionProperty) throws Exception {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        String str4;
        int i;
        RichTextElement.ProgressSelectOptionProperty progressSelectOptionProperty2 = new RichTextElement.ProgressSelectOptionProperty();
        String str5 = "";
        if (progressSelectOptionProperty == null) {
            str = str5;
        } else {
            str = progressSelectOptionProperty.action_id;
        }
        progressSelectOptionProperty2.setActionId(str);
        if (progressSelectOptionProperty == null) {
            str2 = str5;
        } else {
            str2 = progressSelectOptionProperty.action_param_name;
        }
        progressSelectOptionProperty2.setActionParamName(str2);
        if (progressSelectOptionProperty == null) {
            str3 = str5;
        } else {
            str3 = progressSelectOptionProperty.action_param_value;
        }
        progressSelectOptionProperty2.setActionParamValue(str3);
        int i2 = 0;
        if (progressSelectOptionProperty == null) {
            z = false;
        } else {
            z = progressSelectOptionProperty.disable.booleanValue();
        }
        progressSelectOptionProperty2.setDisable(z);
        if (progressSelectOptionProperty == null) {
            z2 = false;
        } else {
            z2 = progressSelectOptionProperty.selected.booleanValue();
        }
        progressSelectOptionProperty2.setSelected(z2);
        if (progressSelectOptionProperty == null) {
            str4 = str5;
        } else {
            str4 = progressSelectOptionProperty.option_case;
        }
        progressSelectOptionProperty2.setOptionCase(str4);
        if (progressSelectOptionProperty != null) {
            str5 = progressSelectOptionProperty.content;
        }
        progressSelectOptionProperty2.setContent(str5);
        if (progressSelectOptionProperty == null) {
            i = 0;
        } else {
            i = progressSelectOptionProperty.number_of_selected.intValue();
        }
        progressSelectOptionProperty2.setNumberOfSelected(i);
        if (progressSelectOptionProperty != null) {
            i2 = progressSelectOptionProperty.number_of_total.intValue();
        }
        progressSelectOptionProperty2.setNumberOfTotal(i2);
        return progressSelectOptionProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.TextableAreaProperty m222221a(RichTextElement.TextableAreaProperty textableAreaProperty) throws Exception {
        int i;
        RichTextElement.TextableAreaProperty textableAreaProperty2 = new RichTextElement.TextableAreaProperty();
        if (textableAreaProperty == null) {
            i = 0;
        } else {
            i = textableAreaProperty.numberOfLines.intValue();
        }
        textableAreaProperty2.setNumberOfLines(i);
        return textableAreaProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.TimeProperty m222223a(RichTextElement.TimeProperty timeProperty) throws Exception {
        long j;
        String str;
        RichTextElement.TimeProperty timeProperty2 = new RichTextElement.TimeProperty();
        if (timeProperty == null) {
            j = 0;
        } else {
            j = timeProperty.millisecond_since1970.longValue();
        }
        timeProperty2.setMillisecondSince1970(j);
        if (timeProperty == null) {
            str = "";
        } else {
            str = timeProperty.format;
        }
        timeProperty2.setFormat(str);
        return timeProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.LinkProperty m222209a(RichTextElement.LinkProperty linkProperty) throws Exception {
        String str;
        RichTextElement.LinkProperty.Source source;
        RichTextElement.LinkProperty linkProperty2 = new RichTextElement.LinkProperty();
        String str2 = "";
        if (linkProperty == null) {
            str = str2;
        } else {
            str = linkProperty.android_url;
        }
        linkProperty2.setAndroidUrl(str);
        if (linkProperty != null) {
            str2 = linkProperty.url;
        }
        linkProperty2.setUrl(str2);
        if (linkProperty == null || linkProperty.scene == null) {
            source = RichTextElement.LinkProperty.Source.UNKNOWN;
        } else {
            source = RichTextElement.LinkProperty.Source.valueOf(linkProperty.scene.getValue());
        }
        linkProperty2.setSource(source);
        return linkProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.MediaProperty m222210a(RichTextElement.MediaProperty mediaProperty) throws Exception {
        String str;
        String str2;
        long j;
        String str3;
        RichTextElement.MediaProperty.Source source;
        int i;
        String str4;
        String str5;
        RichTextElement.MediaProperty mediaProperty2 = new RichTextElement.MediaProperty();
        String str6 = "";
        if (mediaProperty == null) {
            str = str6;
        } else {
            str = mediaProperty.key;
        }
        mediaProperty2.setKey(str);
        if (mediaProperty == null) {
            str2 = str6;
        } else {
            str2 = mediaProperty.name;
        }
        mediaProperty2.setName(str2);
        if (mediaProperty == null) {
            j = 0;
        } else {
            j = mediaProperty.size.longValue();
        }
        mediaProperty2.setSize(j);
        if (mediaProperty == null) {
            str3 = str6;
        } else {
            str3 = mediaProperty.mime;
        }
        mediaProperty2.setMime(str3);
        if (mediaProperty == null) {
            source = RichTextElement.MediaProperty.Source.UNKNOWN;
        } else {
            source = RichTextElement.MediaProperty.Source.forNumber(mediaProperty.source.getValue());
        }
        mediaProperty2.setSource(source);
        Image image = null;
        mediaProperty2.setOriginImage((mediaProperty == null || mediaProperty.image == null) ? null : m222188a(mediaProperty.image.origin));
        if (!(mediaProperty == null || mediaProperty.image == null)) {
            image = m222189a(mediaProperty.image);
        }
        mediaProperty2.setThumbImage(image);
        if (mediaProperty == null) {
            i = 0;
        } else {
            i = mediaProperty.duration.intValue();
        }
        mediaProperty2.setDuration(i);
        if (mediaProperty == null) {
            str4 = str6;
        } else {
            str4 = mediaProperty.url;
        }
        mediaProperty2.setUrl(str4);
        if (mediaProperty == null) {
            str5 = str6;
        } else {
            str5 = mediaProperty.compress_path;
        }
        mediaProperty2.setCompressPath(str5);
        if (mediaProperty != null) {
            str6 = mediaProperty.origin_path;
        }
        mediaProperty2.setOriginPath(str6);
        return mediaProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.SelectMenuProperty m222218a(RichTextElement.SelectMenuProperty selectMenuProperty) throws Exception {
        String str;
        String str2;
        RichTextElement.SelectMenuProperty.Type type;
        String str3;
        boolean z;
        RichTextElement.SelectMenuProperty selectMenuProperty2 = new RichTextElement.SelectMenuProperty();
        String str4 = "";
        if (selectMenuProperty == null) {
            str = str4;
        } else {
            str = selectMenuProperty.action_id;
        }
        selectMenuProperty2.setActionId(str);
        if (selectMenuProperty == null) {
            str2 = str4;
        } else {
            str2 = selectMenuProperty.place_holder;
        }
        selectMenuProperty2.setPlaceHolder(str2);
        if (selectMenuProperty == null) {
            type = RichTextElement.SelectMenuProperty.Type.UNKNOWN;
        } else {
            type = RichTextElement.SelectMenuProperty.Type.forType(selectMenuProperty.type.getValue());
        }
        selectMenuProperty2.setType(type);
        if (selectMenuProperty == null) {
            str3 = str4;
        } else {
            str3 = selectMenuProperty.place_holder_i18n_key;
        }
        selectMenuProperty2.setPlaceHolderI18nKey(str3);
        if (selectMenuProperty != null) {
            str4 = selectMenuProperty.initial_option;
        }
        selectMenuProperty2.setInitialOption(str4);
        boolean z2 = false;
        if (selectMenuProperty == null) {
            z = false;
        } else {
            z = selectMenuProperty.disable.booleanValue();
        }
        selectMenuProperty2.setDisable(z);
        if (selectMenuProperty != null) {
            z2 = selectMenuProperty.is_loading.booleanValue();
        }
        selectMenuProperty2.setLoading(z2);
        if (selectMenuProperty != null) {
            if (selectMenuProperty.options != null && selectMenuProperty.options.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (RichTextElement.MenuOption menuOption : selectMenuProperty.options) {
                    RichTextElement.MenuOption menuOption2 = new RichTextElement.MenuOption();
                    menuOption2.setText(menuOption.text);
                    menuOption2.setI18Key(menuOption.text_i18n_key);
                    menuOption2.setValue(menuOption.value);
                    arrayList.add(menuOption2);
                }
                selectMenuProperty2.setOptions(arrayList);
            }
            if (selectMenuProperty.confirm != null && !TextUtils.isEmpty(selectMenuProperty.confirm.title) && !TextUtils.isEmpty(selectMenuProperty.confirm.text) && !TextUtils.isEmpty(selectMenuProperty.confirm.confirm) && !TextUtils.isEmpty(selectMenuProperty.confirm.dismiss)) {
                RichTextElement.ConfirmProperty confirmProperty = new RichTextElement.ConfirmProperty();
                confirmProperty.setTitle(selectMenuProperty.confirm.title);
                confirmProperty.setTitleI18NKey(selectMenuProperty.confirm.title_i18n_key);
                confirmProperty.setText(selectMenuProperty.confirm.text);
                confirmProperty.setTextI18NKey(selectMenuProperty.confirm.text_i18n_key);
                confirmProperty.setConfirm(selectMenuProperty.confirm.confirm);
                confirmProperty.setConfirmI18NKey(selectMenuProperty.confirm.confirm_i18n_key);
                confirmProperty.setDismiss(selectMenuProperty.confirm.dismiss);
                confirmProperty.setDismissI18NKey(selectMenuProperty.confirm.dismiss_i18n_key);
                selectMenuProperty2.setConfirm(confirmProperty);
            }
        }
        return selectMenuProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.OverflowMenuProperty m222213a(RichTextElement.OverflowMenuProperty overflowMenuProperty) throws Exception {
        String str;
        boolean z;
        RichTextElement.OverflowMenuProperty overflowMenuProperty2 = new RichTextElement.OverflowMenuProperty();
        if (overflowMenuProperty == null) {
            str = "";
        } else {
            str = overflowMenuProperty.action_id;
        }
        overflowMenuProperty2.setActionId(str);
        boolean z2 = false;
        if (overflowMenuProperty == null) {
            z = false;
        } else {
            z = overflowMenuProperty.disable.booleanValue();
        }
        overflowMenuProperty2.setDisable(z);
        if (overflowMenuProperty != null) {
            z2 = overflowMenuProperty.is_loading.booleanValue();
        }
        overflowMenuProperty2.setLoading(z2);
        if (overflowMenuProperty != null) {
            if (overflowMenuProperty.options != null && overflowMenuProperty.options.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (RichTextElement.MenuOption menuOption : overflowMenuProperty.options) {
                    RichTextElement.MenuOption menuOption2 = new RichTextElement.MenuOption();
                    menuOption2.setText(menuOption.text);
                    menuOption2.setI18Key(menuOption.text_i18n_key);
                    menuOption2.setValue(menuOption.value);
                    menuOption2.setOptionActionId(menuOption.option_action_id);
                    arrayList.add(menuOption2);
                }
                overflowMenuProperty2.setOptions(arrayList);
            }
            if (overflowMenuProperty.confirm != null && !TextUtils.isEmpty(overflowMenuProperty.confirm.title) && !TextUtils.isEmpty(overflowMenuProperty.confirm.text) && !TextUtils.isEmpty(overflowMenuProperty.confirm.confirm) && !TextUtils.isEmpty(overflowMenuProperty.confirm.dismiss)) {
                RichTextElement.ConfirmProperty confirmProperty = new RichTextElement.ConfirmProperty();
                confirmProperty.setTitle(overflowMenuProperty.confirm.title);
                confirmProperty.setTitleI18NKey(overflowMenuProperty.confirm.title_i18n_key);
                confirmProperty.setText(overflowMenuProperty.confirm.text);
                confirmProperty.setTextI18NKey(overflowMenuProperty.confirm.text_i18n_key);
                confirmProperty.setConfirm(overflowMenuProperty.confirm.confirm);
                confirmProperty.setConfirmI18NKey(overflowMenuProperty.confirm.confirm_i18n_key);
                confirmProperty.setDismiss(overflowMenuProperty.confirm.dismiss);
                confirmProperty.setDismissI18NKey(overflowMenuProperty.confirm.dismiss_i18n_key);
                overflowMenuProperty2.setConfirm(confirmProperty);
            }
        }
        return overflowMenuProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.DatePickerProperty m222196a(RichTextElement.DatePickerProperty datePickerProperty) throws Exception {
        String str;
        String str2;
        String str3;
        boolean z;
        RichTextElement.DatePickerProperty datePickerProperty2 = new RichTextElement.DatePickerProperty();
        String str4 = "";
        if (datePickerProperty == null) {
            str = str4;
        } else {
            str = datePickerProperty.action_id;
        }
        datePickerProperty2.setActionId(str);
        if (datePickerProperty == null) {
            str2 = str4;
        } else {
            str2 = datePickerProperty.place_holder;
        }
        datePickerProperty2.setPlaceHolder(str2);
        if (datePickerProperty == null) {
            str3 = str4;
        } else {
            str3 = datePickerProperty.initial_date;
        }
        datePickerProperty2.setInitialDate(str3);
        if (datePickerProperty != null) {
            str4 = datePickerProperty.place_holder_i18n_key;
        }
        datePickerProperty2.setPlaceHolderI18nKey(str4);
        boolean z2 = false;
        if (datePickerProperty == null) {
            z = false;
        } else {
            z = datePickerProperty.disable.booleanValue();
        }
        datePickerProperty2.setDisable(z);
        if (datePickerProperty != null) {
            z2 = datePickerProperty.is_loading.booleanValue();
        }
        datePickerProperty2.setLoading(z2);
        if (datePickerProperty != null && datePickerProperty.confirm != null && !TextUtils.isEmpty(datePickerProperty.confirm.title) && !TextUtils.isEmpty(datePickerProperty.confirm.text) && !TextUtils.isEmpty(datePickerProperty.confirm.confirm) && !TextUtils.isEmpty(datePickerProperty.confirm.dismiss)) {
            RichTextElement.ConfirmProperty confirmProperty = new RichTextElement.ConfirmProperty();
            confirmProperty.setTitle(datePickerProperty.confirm.title);
            confirmProperty.setTitleI18NKey(datePickerProperty.confirm.title_i18n_key);
            confirmProperty.setText(datePickerProperty.confirm.text);
            confirmProperty.setTextI18NKey(datePickerProperty.confirm.text_i18n_key);
            confirmProperty.setConfirm(datePickerProperty.confirm.confirm);
            confirmProperty.setConfirmI18NKey(datePickerProperty.confirm.confirm_i18n_key);
            confirmProperty.setDismiss(datePickerProperty.confirm.dismiss);
            confirmProperty.setDismissI18NKey(datePickerProperty.confirm.dismiss_i18n_key);
            datePickerProperty2.setConfirm(confirmProperty);
        }
        return datePickerProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.TimePickerProperty m222222a(RichTextElement.TimePickerProperty timePickerProperty) throws Exception {
        String str;
        String str2;
        String str3;
        boolean z;
        RichTextElement.TimePickerProperty timePickerProperty2 = new RichTextElement.TimePickerProperty();
        String str4 = "";
        if (timePickerProperty == null) {
            str = str4;
        } else {
            str = timePickerProperty.action_id;
        }
        timePickerProperty2.setActionId(str);
        if (timePickerProperty == null) {
            str2 = str4;
        } else {
            str2 = timePickerProperty.place_holder;
        }
        timePickerProperty2.setPlaceHolder(str2);
        if (timePickerProperty == null) {
            str3 = str4;
        } else {
            str3 = timePickerProperty.initial_time;
        }
        timePickerProperty2.setInitialTime(str3);
        if (timePickerProperty != null) {
            str4 = timePickerProperty.place_holder_i18n_key;
        }
        timePickerProperty2.setPlaceHolderI18nKey(str4);
        boolean z2 = false;
        if (timePickerProperty == null) {
            z = false;
        } else {
            z = timePickerProperty.disable.booleanValue();
        }
        timePickerProperty2.setDisable(z);
        if (timePickerProperty != null) {
            z2 = timePickerProperty.is_loading.booleanValue();
        }
        timePickerProperty2.setLoading(z2);
        if (timePickerProperty != null && timePickerProperty.confirm != null && !TextUtils.isEmpty(timePickerProperty.confirm.title) && !TextUtils.isEmpty(timePickerProperty.confirm.text) && !TextUtils.isEmpty(timePickerProperty.confirm.confirm) && !TextUtils.isEmpty(timePickerProperty.confirm.dismiss)) {
            RichTextElement.ConfirmProperty confirmProperty = new RichTextElement.ConfirmProperty();
            confirmProperty.setTitle(timePickerProperty.confirm.title);
            confirmProperty.setTitleI18NKey(timePickerProperty.confirm.title_i18n_key);
            confirmProperty.setText(timePickerProperty.confirm.text);
            confirmProperty.setTextI18NKey(timePickerProperty.confirm.text_i18n_key);
            confirmProperty.setConfirm(timePickerProperty.confirm.confirm);
            confirmProperty.setConfirmI18NKey(timePickerProperty.confirm.confirm_i18n_key);
            confirmProperty.setDismiss(timePickerProperty.confirm.dismiss);
            confirmProperty.setDismissI18NKey(timePickerProperty.confirm.dismiss_i18n_key);
            timePickerProperty2.setConfirm(confirmProperty);
        }
        return timePickerProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.DateTimePickerProperty m222197a(RichTextElement.DatetimePickerProperty datetimePickerProperty) throws Exception {
        String str;
        String str2;
        String str3;
        boolean z;
        RichTextElement.DateTimePickerProperty dateTimePickerProperty = new RichTextElement.DateTimePickerProperty();
        String str4 = "";
        if (datetimePickerProperty == null) {
            str = str4;
        } else {
            str = datetimePickerProperty.action_id;
        }
        dateTimePickerProperty.setActionId(str);
        if (datetimePickerProperty == null) {
            str2 = str4;
        } else {
            str2 = datetimePickerProperty.place_holder;
        }
        dateTimePickerProperty.setPlaceHolder(str2);
        if (datetimePickerProperty == null) {
            str3 = str4;
        } else {
            str3 = datetimePickerProperty.initial_datetime;
        }
        dateTimePickerProperty.setInitialDateTime(str3);
        if (datetimePickerProperty != null) {
            str4 = datetimePickerProperty.place_holder_i18n_key;
        }
        dateTimePickerProperty.setPlaceHolderI18nKey(str4);
        boolean z2 = false;
        if (datetimePickerProperty == null) {
            z = false;
        } else {
            z = datetimePickerProperty.disable.booleanValue();
        }
        dateTimePickerProperty.setDisable(z);
        if (datetimePickerProperty != null) {
            z2 = datetimePickerProperty.is_loading.booleanValue();
        }
        dateTimePickerProperty.setLoading(z2);
        if (datetimePickerProperty != null && datetimePickerProperty.confirm != null && !TextUtils.isEmpty(datetimePickerProperty.confirm.title) && !TextUtils.isEmpty(datetimePickerProperty.confirm.text) && !TextUtils.isEmpty(datetimePickerProperty.confirm.confirm) && !TextUtils.isEmpty(datetimePickerProperty.confirm.dismiss)) {
            RichTextElement.ConfirmProperty confirmProperty = new RichTextElement.ConfirmProperty();
            confirmProperty.setTitle(datetimePickerProperty.confirm.title);
            confirmProperty.setTitleI18NKey(datetimePickerProperty.confirm.title_i18n_key);
            confirmProperty.setText(datetimePickerProperty.confirm.text);
            confirmProperty.setTextI18NKey(datetimePickerProperty.confirm.text_i18n_key);
            confirmProperty.setConfirm(datetimePickerProperty.confirm.confirm);
            confirmProperty.setConfirmI18NKey(datetimePickerProperty.confirm.confirm_i18n_key);
            confirmProperty.setDismiss(datetimePickerProperty.confirm.dismiss);
            confirmProperty.setDismissI18NKey(datetimePickerProperty.confirm.dismiss_i18n_key);
            dateTimePickerProperty.setConfirm(confirmProperty);
        }
        return dateTimePickerProperty;
    }

    /* renamed from: a */
    public static RichTextElement.ParagraphProperty m222214a() {
        return new RichTextElement.ParagraphProperty();
    }

    /* renamed from: a */
    public static RichTextElement.DocsProperty m222199a(RichTextElement.DocsProperty docsProperty) {
        return new RichTextElement.DocsProperty();
    }

    /* renamed from: a */
    public static RichTextElement.H1Property m222202a(RichTextElement.H1Property h1Property) {
        return new RichTextElement.H1Property();
    }

    /* renamed from: a */
    public static RichTextElement.H2Property m222203a(RichTextElement.H2Property h2Property) {
        return new RichTextElement.H2Property();
    }

    /* renamed from: a */
    public static RichTextElement.H3Property m222204a(RichTextElement.H3Property h3Property) {
        return new RichTextElement.H3Property();
    }

    /* renamed from: a */
    public static RichTextElement.ULProperty m222224a(RichTextElement.ULProperty uLProperty) {
        RichTextElement.ULProperty.Type type;
        RichTextElement.ULProperty uLProperty2 = new RichTextElement.ULProperty();
        if (uLProperty == null) {
            type = RichTextElement.ULProperty.Type.DISC;
        } else {
            type = RichTextElement.ULProperty.Type.forType(uLProperty.type.getValue());
        }
        uLProperty2.setType(type);
        return uLProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.OLProperty m222212a(RichTextElement.OLProperty oLProperty) {
        RichTextElement.OLProperty.Type type;
        int i;
        RichTextElement.OLProperty oLProperty2 = new RichTextElement.OLProperty();
        if (oLProperty == null) {
            type = RichTextElement.OLProperty.Type.NUMBER;
        } else {
            type = RichTextElement.OLProperty.Type.forType(oLProperty.type.getValue());
        }
        oLProperty2.setType(type);
        if (oLProperty == null) {
            i = 0;
        } else {
            i = oLProperty.start.intValue();
        }
        oLProperty2.setStart(i);
        return oLProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.LIProperty m222208a(RichTextElement.LIProperty lIProperty) {
        return new RichTextElement.LIProperty();
    }

    /* renamed from: a */
    public static RichTextElement.QuoteProperty m222217a(RichTextElement.QuoteProperty quoteProperty) {
        return new RichTextElement.QuoteProperty();
    }

    /* renamed from: a */
    public static RichTextElement.HRProperty m222205a(RichTextElement.HRProperty hRProperty) {
        return new RichTextElement.HRProperty();
    }

    /* renamed from: a */
    public static RichTextElement.MentionProperty m222211a(RichTextElement.MentionProperty mentionProperty) {
        RichTextElement.MentionProperty mentionProperty2 = new RichTextElement.MentionProperty();
        mentionProperty2.setContent(mentionProperty != null ? mentionProperty.content : "");
        RichTextElement.MentionItem mentionItem = new RichTextElement.MentionItem();
        if (!(mentionProperty == null || mentionProperty.item == null)) {
            mentionItem.setId(mentionProperty.item.id);
            mentionItem.setType(RichTextElement.MentionItem.MentionType.valueOf(mentionProperty.item.type.getValue()));
        }
        mentionProperty2.setMentionItem(mentionItem);
        return mentionProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.CodeProperty m222195a(RichTextElement.CodeProperty codeProperty) {
        return new RichTextElement.CodeProperty();
    }

    /* renamed from: a */
    public static RichTextElement.DivProperty m222198a(RichTextElement.DivProperty divProperty) throws Exception {
        return new RichTextElement.DivProperty();
    }

    /* renamed from: a */
    public static RichTextElement.BoldProperty m222192a(RichTextElement.BoldProperty boldProperty) throws Exception {
        String str;
        RichTextElement.BoldProperty boldProperty2 = new RichTextElement.BoldProperty();
        String str2 = "";
        if (boldProperty == null) {
            str = str2;
        } else {
            str = boldProperty.content;
        }
        boldProperty2.setContent(str);
        if (boldProperty != null) {
            str2 = boldProperty.i18n_key;
        }
        boldProperty2.setI18nKey(str2);
        return boldProperty2;
    }

    /* renamed from: a */
    private static Image m222188a(com.bytedance.lark.pb.basic.v1.Image image) {
        if (image == null) {
            return null;
        }
        Image image2 = new Image();
        image2.setKey(image.key);
        image2.setWidth(image.width.intValue());
        image2.setHeight(image.height.intValue());
        image2.setUrls(image.urls);
        return image2;
    }

    /* renamed from: a */
    private static Image m222189a(ImageSet imageSet) {
        com.ss.android.lark.image.entity.Image a = f141188a.mo134732a(imageSet);
        if (a == null) {
            return null;
        }
        Image image = new Image();
        image.setKey(a.getKey());
        image.setWidth(a.getWidth());
        image.setHeight(a.getHeight());
        image.setUrls(a.getUrls());
        return image;
    }

    /* renamed from: a */
    public static RichTextElement.AnchorProperty m222190a(RichTextElement.AnchorProperty anchorProperty) throws Exception {
        String str;
        RichTextElement.AnchorProperty anchorProperty2 = new RichTextElement.AnchorProperty();
        if (anchorProperty != null) {
            anchorProperty2.setHref(anchorProperty.href);
            if (TextUtils.isEmpty(anchorProperty.text_content)) {
                str = anchorProperty.content;
            } else {
                str = anchorProperty.text_content;
            }
            anchorProperty2.setContent(str);
            anchorProperty2.setAndroidHref(anchorProperty.android_href);
            anchorProperty2.setI18nKey(anchorProperty.i18n_key);
        } else {
            anchorProperty2.setHref("");
            anchorProperty2.setContent("");
            anchorProperty2.setAndroidHref("");
            anchorProperty2.setI18nKey("");
        }
        return anchorProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.AtProperty m222191a(RichTextElement.AtProperty atProperty) throws Exception {
        String str;
        boolean z;
        RichTextElement.AtProperty atProperty2 = new RichTextElement.AtProperty();
        String str2 = "";
        if (atProperty == null) {
            str = str2;
        } else {
            str = atProperty.user_id;
        }
        atProperty2.setUserId(str);
        if (atProperty != null) {
            str2 = atProperty.content;
        }
        atProperty2.setContent(str2);
        boolean z2 = false;
        if (atProperty == null) {
            z = false;
        } else {
            z = atProperty.is_outer.booleanValue();
        }
        atProperty2.setOutChatUser(z);
        if (atProperty != null) {
            z2 = atProperty.is_anonymous.booleanValue();
        }
        atProperty2.setAnonymous(z2);
        return atProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.ButtonProperty m222193a(RichTextElement.ButtonProperty buttonProperty) throws Exception {
        String str;
        boolean z;
        boolean z2;
        String str2;
        RichTextElement.ButtonProperty buttonProperty2 = new RichTextElement.ButtonProperty();
        if (buttonProperty == null) {
            str = "";
        } else {
            str = buttonProperty.action_id;
        }
        buttonProperty2.setActionId(str);
        boolean z3 = false;
        if (buttonProperty == null) {
            z = false;
        } else {
            z = buttonProperty.active.booleanValue();
        }
        buttonProperty2.setActive(z);
        if (buttonProperty == null) {
            z2 = true;
        } else {
            z2 = buttonProperty.disable.booleanValue();
        }
        buttonProperty2.setDisable(z2);
        if (buttonProperty != null) {
            z3 = buttonProperty.is_loading.booleanValue();
        }
        buttonProperty2.setShowLoadingIcon(z3);
        if (buttonProperty == null) {
            str2 = "default";
        } else {
            str2 = buttonProperty.mode;
        }
        buttonProperty2.setMode(str2);
        if (buttonProperty != null) {
            if (buttonProperty.confirm != null && !TextUtils.isEmpty(buttonProperty.confirm.title) && !TextUtils.isEmpty(buttonProperty.confirm.text) && !TextUtils.isEmpty(buttonProperty.confirm.confirm) && !TextUtils.isEmpty(buttonProperty.confirm.dismiss)) {
                RichTextElement.ConfirmProperty confirmProperty = new RichTextElement.ConfirmProperty();
                confirmProperty.setTitle(buttonProperty.confirm.title);
                confirmProperty.setTitleI18NKey(buttonProperty.confirm.title_i18n_key);
                confirmProperty.setText(buttonProperty.confirm.text);
                confirmProperty.setTextI18NKey(buttonProperty.confirm.text_i18n_key);
                confirmProperty.setConfirm(buttonProperty.confirm.confirm);
                confirmProperty.setConfirmI18NKey(buttonProperty.confirm.confirm_i18n_key);
                confirmProperty.setDismiss(buttonProperty.confirm.dismiss);
                confirmProperty.setDismissI18NKey(buttonProperty.confirm.dismiss_i18n_key);
                buttonProperty2.setConfirm(confirmProperty);
            }
            if (buttonProperty.loading != null && !TextUtils.isEmpty(buttonProperty.loading.begin) && !TextUtils.isEmpty(buttonProperty.loading.success) && !TextUtils.isEmpty(buttonProperty.loading.fail)) {
                RichTextElement.ButtonProperty.ButtonLoadingProperty buttonLoadingProperty = new RichTextElement.ButtonProperty.ButtonLoadingProperty();
                buttonLoadingProperty.setBegin(buttonProperty.loading.begin);
                buttonLoadingProperty.setBeginI18NKey(buttonProperty.loading.begin_i18n_key);
                buttonLoadingProperty.setSuccess(buttonProperty.loading.success);
                buttonLoadingProperty.setSuccessI18NKey(buttonProperty.loading.success_i18n_key);
                buttonLoadingProperty.setFail(buttonProperty.loading.fail);
                buttonLoadingProperty.setFailI18NKey(buttonProperty.loading.fail_i18n_key);
                buttonProperty2.setLoading(buttonLoadingProperty);
            }
        }
        return buttonProperty2;
    }

    /* renamed from: a */
    public static RichTextElement.CodeBlockProperty m222194a(RichTextElement.CodeBlockProperty codeBlockProperty) {
        RichTextElement.CodeBlockProperty.Language language;
        String str;
        RichTextElement.CodeBlockProperty codeBlockProperty2 = new RichTextElement.CodeBlockProperty();
        if (codeBlockProperty == null) {
            language = RichTextElement.CodeBlockProperty.Language.JS;
        } else {
            language = RichTextElement.CodeBlockProperty.Language.forType(codeBlockProperty.language.getValue());
        }
        codeBlockProperty2.setLanguage(language);
        if (codeBlockProperty == null) {
            str = "";
        } else {
            str = codeBlockProperty.content;
        }
        codeBlockProperty2.setContent(str);
        if (codeBlockProperty != null) {
            if (CollectionUtils.isNotEmpty(codeBlockProperty.style_refs)) {
                ArrayList arrayList = new ArrayList();
                for (RichTextElement.CodeBlockProperty.StyleRef styleRef : codeBlockProperty.style_refs) {
                    RichTextElement.CodeBlockProperty.StyleRef styleRef2 = new RichTextElement.CodeBlockProperty.StyleRef();
                    styleRef2.length = styleRef.length.intValue();
                    styleRef2.location = styleRef.location.intValue();
                    styleRef2.styleIds = new ArrayList(styleRef.style_ids);
                    arrayList.add(styleRef2);
                }
                codeBlockProperty2.setStyleRefList(arrayList);
            }
            if (CollectionUtils.isNotEmpty(codeBlockProperty.styles)) {
                ArrayList arrayList2 = new ArrayList();
                for (RichTextElement.CodeBlockProperty.Style style : codeBlockProperty.styles) {
                    RichTextElement.CodeBlockProperty.Style style2 = new RichTextElement.CodeBlockProperty.Style();
                    style2.type = RichTextElement.CodeBlockProperty.StyleType.forType(style.type.getValue());
                    style2.name = style.name;
                    style2.value = style.value;
                    arrayList2.add(style2);
                }
                codeBlockProperty2.setStyleList(arrayList2);
            }
        }
        return codeBlockProperty2;
    }
}
