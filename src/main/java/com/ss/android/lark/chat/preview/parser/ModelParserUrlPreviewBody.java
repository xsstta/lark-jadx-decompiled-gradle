package com.ss.android.lark.chat.preview.parser;

import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.basic.v1.URLPreviewBody;
import com.bytedance.lark.pb.basic.v1.URLPreviewComponent;
import com.bytedance.lark.pb.basic.v1.URLPreviewComponents;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.FontLevel;
import com.ss.android.lark.chat.entity.preview.FontType;
import com.ss.android.lark.chat.entity.preview.Gradient;
import com.ss.android.lark.chat.entity.preview.SizeLevel;
import com.ss.android.lark.chat.entity.preview.Style;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.entity.preview.UrlPreviewBody;
import com.ss.android.lark.chat.entity.preview.UrlPreviewComponent;
import com.ss.android.lark.chat.entity.preview.UrlPreviewComponents;
import com.ss.android.lark.chat.preview.ChatPreviewInit;
import com.ss.android.lark.chat.preview.entity.component.Align;
import com.ss.android.lark.chat.preview.entity.component.Direction;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.chat.preview.entity.component.Item;
import com.ss.android.lark.chat.preview.entity.component.Justify;
import com.ss.android.lark.chat.preview.entity.component.Orientation;
import com.ss.android.lark.chat.preview.entity.component.Tag;
import com.ss.android.lark.chat.preview.entity.component.Theme;
import com.ss.android.lark.chat.preview.entity.component.property.AvatarProperty;
import com.ss.android.lark.chat.preview.entity.component.property.ButtonProperty;
import com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty;
import com.ss.android.lark.chat.preview.entity.component.property.EmptyProperty;
import com.ss.android.lark.chat.preview.entity.component.property.IGProperty;
import com.ss.android.lark.chat.preview.entity.component.property.ImageProperty;
import com.ss.android.lark.chat.preview.entity.component.property.LinearLayoutProperty;
import com.ss.android.lark.chat.preview.entity.component.property.PreviewHeaderProperty;
import com.ss.android.lark.chat.preview.entity.component.property.RichTextProperty;
import com.ss.android.lark.chat.preview.entity.component.property.SpinButtonProperty;
import com.ss.android.lark.chat.preview.entity.component.property.TagListProperty;
import com.ss.android.lark.chat.preview.entity.component.property.TextViewProperty;
import com.ss.android.lark.chat.preview.entity.component.property.TimeProperty;
import com.ss.android.lark.chat.preview.entity.component.property.VideoProperty;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.tangram.base.style.Value;
import com.ss.android.lark.tangram.base.style.ValueType;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0002J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0012\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0003J\u0012\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0002J\u0012\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J\u0012\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002J\u0012\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0002J\u0012\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J\u0012\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0014\u0010U\u001a\u0004\u0018\u00010T2\b\u0010V\u001a\u0004\u0018\u00010WH\u0007J\u0010\u0010X\u001a\u00020Y2\u0006\u0010=\u001a\u00020>H\u0007J\u0014\u0010Z\u001a\u0004\u0018\u00010\u00112\b\u0010[\u001a\u0004\u0018\u00010\\H\u0007J\u0012\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010`H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lcom/ss/android/lark/chat/preview/parser/ModelParserUrlPreviewBody;", "", "()V", "BG_FLOAT_OVERLAY", "", "CARD_BG_BODY_TOKEN", "CARD_LAYOUT", "CONTENT_LAYOUT", "COVER", "DESCRIPTION", "HEADER", "ROOT", "ROOT_LAYOUT", "TEXT_CAPTION", "TEXT_TITLE", "TITLE", "buildUrlPreviewComponents", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponents;", "pbUrlPreviewEntity", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewEntity;", "parseAvatarPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/AvatarProperty;", "pbAvatarProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$AvatarProperty;", "parseButtonPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/ButtonProperty;", "pbButtonProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$ButtonProperty;", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$IconButtonProperty;", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$TextButtonProperty;", "parseChatterInfoFromPb", "", "Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty$ChatterInfo;", "pbChatterInfoList", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$ChattersPreviewProperty$ChatterInfo;", "parseChatterPreviewPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty;", "pbChattersPreviewProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$ChattersPreviewProperty;", "parseEmptyPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/EmptyProperty;", "pbEmptyProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$EmptyProperty;", "parseHeaderLayoutPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/PreviewHeaderProperty;", "pbHeaderProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$PreviewHeaderProperty;", "parseIGPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/IGProperty;", "pbIGProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$CardContainerProperty;", "parseImagePropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/ImageProperty;", "pbImageProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$ImageProperty;", "parseLinearLayoutPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/LinearLayoutProperty;", "pbLinearLayoutProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$LinearLayoutProperty;", "parsePreviewPropertyFromPb", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "pbUrlPreviewComponent", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent;", "parseRichTextPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/RichTextProperty;", "pbRichTextProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$RichTextProperty;", "parseSpinButtonPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/SpinButtonProperty;", "pbSpinButtonProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$SpinButtonProperty;", "parseTagListPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/TagListProperty;", "pbTagListProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$TagListProperty;", "parseTextViewPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/TextViewProperty;", "pbTextProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$TextProperty;", "parseTimePropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/TimeProperty;", "pbTimeProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$TimeProperty;", "parseURLPreviewBodyFromSdkPb", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewBody;", "parseUrlPreviewBodyFromPb", "pbUrlPreviewBody", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewBody;", "parseUrlPreviewComponentFromPb", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewComponent;", "parseUrlPreviewComponentsFromPb", "pbUrlPreviewComponents", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponents;", "parseVideoPropertyFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/property/VideoProperty;", "pbVideoProperty", "Lcom/bytedance/lark/pb/basic/v1/URLPreviewComponent$VideoProperty;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.c.c */
public final class ModelParserUrlPreviewBody {

    /* renamed from: a */
    public static final ModelParserUrlPreviewBody f88127a = new ModelParserUrlPreviewBody();

    private ModelParserUrlPreviewBody() {
    }

    /* renamed from: a */
    private final VideoProperty m132291a(URLPreviewComponent.VideoProperty videoProperty) {
        if (videoProperty == null) {
            return new VideoProperty(VideoProperty.Site.UNKNOWN, null, 0, "", "", "");
        }
        VideoProperty.Site.Companion aVar = VideoProperty.Site.Companion;
        URLPreviewComponent.VideoProperty.Site site = videoProperty.site;
        Intrinsics.checkExpressionValueIsNotNull(site, "pbVideoProperty.site");
        VideoProperty.Site a = aVar.mo126534a(site.getValue());
        ImageSet a2 = ModelParserImage.m132266a(videoProperty.cover_image);
        Long l = videoProperty.duration;
        Intrinsics.checkExpressionValueIsNotNull(l, "pbVideoProperty.duration");
        long longValue = l.longValue();
        String str = videoProperty.src_url;
        Intrinsics.checkExpressionValueIsNotNull(str, "pbVideoProperty.src_url");
        String str2 = videoProperty.vid;
        Intrinsics.checkExpressionValueIsNotNull(str2, "pbVideoProperty.vid");
        String str3 = videoProperty.iframe_url;
        Intrinsics.checkExpressionValueIsNotNull(str3, "pbVideoProperty.iframe_url");
        return new VideoProperty(a, a2, longValue, str, str2, str3);
    }

    /* renamed from: a */
    private final SpinButtonProperty m132287a(URLPreviewComponent.SpinButtonProperty spinButtonProperty) {
        URLPreviewComponent.Direction direction;
        List<URLPreviewComponent.Item> list;
        ArrayList arrayList = new ArrayList();
        if (!(spinButtonProperty == null || (list = spinButtonProperty.items) == null)) {
            for (T t : list) {
                arrayList.add(new Item(t.action_id, t.text));
            }
        }
        Long l = null;
        ImageSet a = ModelParserImage.m132266a(spinButtonProperty != null ? spinButtonProperty.icon : null);
        ArrayList arrayList2 = arrayList;
        if (spinButtonProperty != null) {
            l = spinButtonProperty.selected_index;
        }
        return new SpinButtonProperty(a, arrayList2, l, Direction.Companion.mo126395a((spinButtonProperty == null || (direction = spinButtonProperty.direction) == null) ? Direction.LTR.getValue() : direction.getValue()));
    }

    /* renamed from: a */
    private final TextViewProperty m132289a(URLPreviewComponent.TextProperty textProperty) {
        if (textProperty == null) {
            return new TextViewProperty("", 0);
        }
        String str = textProperty.text;
        Intrinsics.checkExpressionValueIsNotNull(str, "it.text");
        Integer num = textProperty.number_of_lines;
        Intrinsics.checkExpressionValueIsNotNull(num, "it.number_of_lines");
        return new TextViewProperty(str, num.intValue());
    }

    /* renamed from: a */
    private final IGProperty m132282a(URLPreviewComponent.CardContainerProperty cardContainerProperty) {
        return new IGProperty(Type.CARD_CONTAINER, ModelParserUrlPreviewStyle.m132299a(cardContainerProperty != null ? cardContainerProperty.mask_color : null));
    }

    /* renamed from: a */
    private final LinearLayoutProperty m132284a(URLPreviewComponent.LinearLayoutProperty linearLayoutProperty) {
        if (linearLayoutProperty == null) {
            return new LinearLayoutProperty(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 63, null);
        }
        Orientation.Companion aVar = Orientation.Companion;
        URLPreviewComponent.Orientation orientation = linearLayoutProperty.orientation;
        Intrinsics.checkExpressionValueIsNotNull(orientation, "pbLinearLayoutProperty.orientation");
        Orientation a = aVar.mo126430a(orientation.getValue());
        Float f = linearLayoutProperty.spacing;
        Intrinsics.checkExpressionValueIsNotNull(f, "pbLinearLayoutProperty.spacing");
        float floatValue = f.floatValue();
        Float f2 = linearLayoutProperty.wrap_width;
        Intrinsics.checkExpressionValueIsNotNull(f2, "pbLinearLayoutProperty.wrap_width");
        float floatValue2 = f2.floatValue();
        Float f3 = linearLayoutProperty.padding;
        Intrinsics.checkExpressionValueIsNotNull(f3, "pbLinearLayoutProperty.padding");
        float floatValue3 = f3.floatValue();
        Justify.Companion aVar2 = Justify.Companion;
        URLPreviewComponent.Justify justify = linearLayoutProperty.main_axis_justify;
        Intrinsics.checkExpressionValueIsNotNull(justify, "pbLinearLayoutProperty.main_axis_justify");
        Justify a2 = aVar2.mo126427a(justify.getValue());
        Align.Companion aVar3 = Align.Companion;
        URLPreviewComponent.Align align = linearLayoutProperty.cross_axis_align;
        Intrinsics.checkExpressionValueIsNotNull(align, "pbLinearLayoutProperty.cross_axis_align");
        return new LinearLayoutProperty(a, floatValue, floatValue2, floatValue3, a2, aVar3.mo126392a(align.getValue()));
    }

    /* renamed from: a */
    private final PreviewHeaderProperty m132285a(URLPreviewComponent.PreviewHeaderProperty previewHeaderProperty) {
        if (previewHeaderProperty == null) {
            return new PreviewHeaderProperty(null, null, null, null, null, null, null, null, null, null, null, "", null, 4096, null);
        }
        ImageSet a = ModelParserImage.m132266a(previewHeaderProperty.icon_key);
        String str = previewHeaderProperty.title;
        Tag.Companion aVar = Tag.Companion;
        com.bytedance.lark.pb.basic.v1.Tag tag = previewHeaderProperty.lark_tag;
        Intrinsics.checkExpressionValueIsNotNull(tag, "pbHeaderProperty.lark_tag");
        Tag a2 = aVar.mo126433a(tag.getValue());
        String str2 = previewHeaderProperty.child_component_id;
        Boolean bool = previewHeaderProperty.is_need_copy_link;
        Boolean bool2 = previewHeaderProperty.is_need_close;
        Theme.Companion aVar2 = Theme.Companion;
        URLPreviewComponent.Theme theme = previewHeaderProperty.theme;
        Intrinsics.checkExpressionValueIsNotNull(theme, "pbHeaderProperty.theme");
        Theme a3 = aVar2.mo126436a(theme.getValue());
        PreviewHeaderProperty.HeaderType.Companion aVar3 = PreviewHeaderProperty.HeaderType.Companion;
        URLPreviewComponent.PreviewHeaderProperty.Type type = previewHeaderProperty.type;
        Intrinsics.checkExpressionValueIsNotNull(type, "pbHeaderProperty.type");
        return new PreviewHeaderProperty(a, str, a2, str2, bool, bool2, a3, aVar3.mo126509a(type.getValue()), ModelParserUrlPreviewStyle.m132299a(previewHeaderProperty.tag_color), ModelParserUrlPreviewStyle.m132299a(previewHeaderProperty.tag_text_color), previewHeaderProperty.header_tag, previewHeaderProperty.favicon_url, ModelParserUrlPreviewStyle.m132299a(previewHeaderProperty.icon_color));
    }

    /* renamed from: a */
    private final RichTextProperty m132286a(URLPreviewComponent.RichTextProperty richTextProperty) {
        ChatPreviewInit.IChatPreviewModuleDependency a = ChatPreviewInit.f88086a.mo126246a();
        RichText richText = null;
        if (a == null) {
            return new RichTextProperty(null);
        }
        ChatPreviewInit.IChatPreviewModuleDependency.IRichTextDependency a2 = a.mo102697a();
        if (richTextProperty != null) {
            richText = richTextProperty.richtext;
        }
        return new RichTextProperty(a2.mo102712a(richText));
    }

    /* renamed from: a */
    private final ImageProperty m132283a(URLPreviewComponent.ImageProperty imageProperty) {
        String str = null;
        ImageSet a = ModelParserImage.m132266a(imageProperty != null ? imageProperty.image : null);
        if (imageProperty != null) {
            str = imageProperty.alt;
        }
        return new ImageProperty(a, str);
    }

    /* renamed from: a */
    private final ChattersPreviewProperty m132280a(URLPreviewComponent.ChattersPreviewProperty chattersPreviewProperty) {
        if (chattersPreviewProperty == null) {
            return new ChattersPreviewProperty(null, null, null, null);
        }
        Theme.Companion aVar = Theme.Companion;
        URLPreviewComponent.Theme theme = chattersPreviewProperty.theme;
        Intrinsics.checkExpressionValueIsNotNull(theme, "pbChattersPreviewProperty.theme");
        Theme a = aVar.mo126436a(theme.getValue());
        Integer num = chattersPreviewProperty.chatters_count;
        ModelParserUrlPreviewBody cVar = f88127a;
        List<URLPreviewComponent.ChattersPreviewProperty.ChatterInfo> list = chattersPreviewProperty.chatter_infos;
        Intrinsics.checkExpressionValueIsNotNull(list, "pbChattersPreviewProperty.chatter_infos");
        return new ChattersPreviewProperty(a, num, cVar.m132292a(list), chattersPreviewProperty.max_show_count);
    }

    /* renamed from: a */
    private final List<ChattersPreviewProperty.ChatterInfo> m132292a(List<URLPreviewComponent.ChattersPreviewProperty.ChatterInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            arrayList.add(new ChattersPreviewProperty.ChatterInfo(t.avatar_key, t.chatter_id));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final ButtonProperty m132279a(URLPreviewComponent.TextButtonProperty textButtonProperty) {
        if (textButtonProperty != null) {
            return new ButtonProperty(null, textButtonProperty.text, null, textButtonProperty.action_id, textButtonProperty.is_disable);
        }
        return new ButtonProperty(null, null, null, null, null);
    }

    /* renamed from: a */
    private final TimeProperty m132290a(URLPreviewComponent.TimeProperty timeProperty) {
        if (timeProperty != null) {
            return new TimeProperty(timeProperty.start_time_stamp, timeProperty.is_countdown, timeProperty.ntp_action_id, timeProperty.is_end, timeProperty.end_time_stamp);
        }
        return new TimeProperty(0L, false, null, null, 0L);
    }

    /* renamed from: a */
    private final EmptyProperty m132281a(URLPreviewComponent.EmptyProperty emptyProperty) {
        return new EmptyProperty(Type.EMPTY);
    }

    /* renamed from: a */
    private final TagListProperty m132288a(URLPreviewComponent.TagListProperty tagListProperty) {
        List<String> list;
        if (tagListProperty != null) {
            list = tagListProperty.tags;
        } else {
            list = null;
        }
        return new TagListProperty(list);
    }

    @JvmStatic
    /* renamed from: a */
    public static final UrlPreviewBody m132272a(URLPreviewBody uRLPreviewBody) {
        if (uRLPreviewBody == null) {
            return null;
        }
        return new UrlPreviewBody(m132275a(uRLPreviewBody.components), ModelParserUrlPreviewAction.m132271a(uRLPreviewBody.actions), ModelParserUrlPreviewAction.m132269a(uRLPreviewBody.card_url));
    }

    @JvmStatic
    /* renamed from: a */
    public static final UrlPreviewBody m132273a(UrlPreviewEntity urlPreviewEntity) {
        Intrinsics.checkParameterIsNotNull(urlPreviewEntity, "pbUrlPreviewEntity");
        return new UrlPreviewBody(f88127a.m132294b(urlPreviewEntity), null, ModelParserUrlPreviewAction.m132269a(urlPreviewEntity.url));
    }

    @JvmStatic
    /* renamed from: a */
    public static final UrlPreviewComponent m132274a(URLPreviewComponent uRLPreviewComponent) {
        Intrinsics.checkParameterIsNotNull(uRLPreviewComponent, "pbUrlPreviewComponent");
        Type.Companion aVar = Type.Companion;
        URLPreviewComponent.Type type = uRLPreviewComponent.type;
        Intrinsics.checkExpressionValueIsNotNull(type, "pbUrlPreviewComponent.type");
        return new UrlPreviewComponent(aVar.mo125798a(type.getValue()), uRLPreviewComponent.can_skip_when_unknown, ModelParserUrlPreviewStyle.m132298a(uRLPreviewComponent.style), uRLPreviewComponent.child_ids, uRLPreviewComponent.is_font_zoomable, m132293b(uRLPreviewComponent));
    }

    @JvmStatic
    /* renamed from: a */
    public static final UrlPreviewComponents m132275a(URLPreviewComponents uRLPreviewComponents) {
        if (uRLPreviewComponents == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, URLPreviewComponent> map = uRLPreviewComponents.elements;
        Intrinsics.checkExpressionValueIsNotNull(map, "elements");
        for (Map.Entry<String, URLPreviewComponent> entry : map.entrySet()) {
            String key = entry.getKey();
            URLPreviewComponent value = entry.getValue();
            Intrinsics.checkExpressionValueIsNotNull(value, "entry.value");
            linkedHashMap.put(key, m132274a(value));
        }
        List<String> list = uRLPreviewComponents.root_ids;
        Intrinsics.checkExpressionValueIsNotNull(list, "root_ids");
        List<String> list2 = uRLPreviewComponents.image_ids;
        Intrinsics.checkExpressionValueIsNotNull(list2, "image_ids");
        List<String> list3 = uRLPreviewComponents.button_ids;
        Intrinsics.checkExpressionValueIsNotNull(list3, "button_ids");
        List<String> list4 = uRLPreviewComponents.richtext_ids;
        Intrinsics.checkExpressionValueIsNotNull(list4, "richtext_ids");
        return new UrlPreviewComponents(list, linkedHashMap, list2, list3, list4);
    }

    @JvmStatic
    /* renamed from: b */
    private static final BaseProperty m132293b(URLPreviewComponent uRLPreviewComponent) {
        URLPreviewComponent.Type type = uRLPreviewComponent.type;
        if (type != null) {
            switch (C34089d.f88128a[type.ordinal()]) {
                case 1:
                    return f88127a.m132281a(uRLPreviewComponent.empty);
                case 2:
                    return f88127a.m132282a(uRLPreviewComponent.card_container);
                case 3:
                    return f88127a.m132284a(uRLPreviewComponent.linear_layout);
                case 4:
                    return f88127a.m132285a(uRLPreviewComponent.header);
                case 5:
                    return f88127a.m132286a(uRLPreviewComponent.richtext);
                case 6:
                    return f88127a.m132283a(uRLPreviewComponent.image);
                case 7:
                    return f88127a.m132280a(uRLPreviewComponent.chatters_preview);
                case 8:
                    ModelParserUrlPreviewBody cVar = f88127a;
                    URLPreviewComponent.ButtonProperty buttonProperty = uRLPreviewComponent.button;
                    Intrinsics.checkExpressionValueIsNotNull(buttonProperty, "pbUrlPreviewComponent.button");
                    return cVar.m132277a(buttonProperty);
                case 9:
                    return f88127a.m132278a(uRLPreviewComponent.icon_button);
                case 10:
                    return f88127a.m132279a(uRLPreviewComponent.text_button);
                case 11:
                    return f88127a.m132290a(uRLPreviewComponent.time);
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return f88127a.m132289a(uRLPreviewComponent.text);
                case 13:
                    return f88127a.m132288a(uRLPreviewComponent.tag_list);
                case 14:
                    return f88127a.m132287a(uRLPreviewComponent.spin_button);
                case 15:
                    return f88127a.m132276a(uRLPreviewComponent.avatar);
                case 16:
                    return f88127a.m132291a(uRLPreviewComponent.video);
            }
        }
        return new EmptyProperty(Type.UNKNOWN);
    }

    /* renamed from: a */
    private final AvatarProperty m132276a(URLPreviewComponent.AvatarProperty avatarProperty) {
        String str;
        URLPreviewComponent.AvatarProperty.ChatterInfo chatterInfo;
        URLPreviewComponent.AvatarProperty.ChatterInfo chatterInfo2;
        String str2 = null;
        if (avatarProperty == null || (chatterInfo2 = avatarProperty.chatter_info) == null) {
            str = null;
        } else {
            str = chatterInfo2.avatar_key;
        }
        if (!(avatarProperty == null || (chatterInfo = avatarProperty.chatter_info) == null)) {
            str2 = chatterInfo.chatter_id;
        }
        return new AvatarProperty(new ChattersPreviewProperty.ChatterInfo(str, str2));
    }

    /* renamed from: a */
    private final ButtonProperty m132277a(URLPreviewComponent.ButtonProperty buttonProperty) {
        if (buttonProperty == null) {
            return new ButtonProperty(null, null, null, null, null);
        }
        ImageSet a = ModelParserImage.m132266a(buttonProperty.icon);
        String str = buttonProperty.text;
        Direction.Companion aVar = Direction.Companion;
        URLPreviewComponent.Direction direction = buttonProperty.direction;
        Intrinsics.checkExpressionValueIsNotNull(direction, "pbButtonProperty.direction");
        return new ButtonProperty(a, str, aVar.mo126395a(direction.getValue()), buttonProperty.action_id, buttonProperty.is_disable);
    }

    /* renamed from: b */
    private final UrlPreviewComponents m132294b(UrlPreviewEntity urlPreviewEntity) {
        boolean z;
        boolean z2;
        Integer num;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList.add("root");
        boolean z4 = true;
        HashMap hashMap2 = hashMap;
        hashMap2.put("root", new UrlPreviewComponent(Type.EMPTY, true, new Style(SizeLevel.NORMAL, null, null, null, new Gradient(Gradient.Type.LINEAR, new Gradient.Linear(0, CollectionsKt.listOf(new ThemeColor("imtoken_message_card_bg_body_embed", 0, new ThemeColor.Key(null, null, 0, 4, null))))), null, null, null, null, null, null, 0, 0, 8168, null), CollectionsKt.listOf("rootLayout"), true, new EmptyProperty(Type.EMPTY)));
        ArrayList arrayList5 = new ArrayList();
        String str = urlPreviewEntity.sdk_icon_url;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList5.add("cover");
        }
        arrayList5.add("cardLayout");
        hashMap2.put("rootLayout", new UrlPreviewComponent(Type.LINEAR_LAYOUT, true, new Style(SizeLevel.NORMAL, null, null, null, null, null, null, null, null, new Value(ValueType.POINT, Float.valueOf(600.0f)), null, 0, 0, 7678, null), arrayList5, true, new LinearLayoutProperty(Orientation.ROW, BitmapDescriptorFactory.HUE_RED, 325.0f, BitmapDescriptorFactory.HUE_RED, Justify.START, Align.STRETCH)));
        String str2 = urlPreviewEntity.sdk_icon_url;
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Image image = new Image();
            image.setKey(urlPreviewEntity.sdk_icon_url);
            image.setWidth(SmEvents.EVENT_NW);
            image.setHeight(SmEvents.EVENT_NW);
            Unit unit = Unit.INSTANCE;
            num = 0;
            hashMap2.put("cover", new UrlPreviewComponent(Type.IMAGE, true, new Style(null, null, null, null, new Gradient(Gradient.Type.LINEAR, new Gradient.Linear(null, CollectionsKt.listOf(new ThemeColor("bg/float-overlay", null, new ThemeColor.Key(null, null, 0, 7, null))))), new Value(ValueType.POINT, Float.valueOf(120.0f)), new Value(ValueType.POINT, Float.valueOf(120.0f)), null, null, null, null, 0, 0, 8079, null), CollectionsKt.emptyList(), true, new ImageProperty(null, urlPreviewEntity.sdk_icon_url)));
            arrayList2.add("cover");
        } else {
            num = 0;
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add("header");
        arrayList6.add("contentLayout");
        hashMap2.put("cardLayout", new UrlPreviewComponent(Type.LINEAR_LAYOUT, true, new Style(SizeLevel.NORMAL, null, null, null, null, null, null, null, null, null, null, 1, 1, 2046, null), arrayList6, true, new LinearLayoutProperty(Orientation.COLUMN, 8.0f, BitmapDescriptorFactory.HUE_RED, 12.0f, null, null, 48, null)));
        hashMap2.put("header", new UrlPreviewComponent(Type.HEADER, true, new Style(null, null, new ThemeColor("text_caption", null, null, 6, null), null, null, null, null, null, null, null, null, 0, 0, 8187, null), CollectionsKt.emptyList(), true, new PreviewHeaderProperty(null, urlPreviewEntity.sdk_domain, null, null, null, null, null, null, null, null, null, urlPreviewEntity.sdk_favicon_url, null, 6141, null)));
        ArrayList arrayList7 = new ArrayList();
        hashMap2.put("contentLayout", new UrlPreviewComponent(Type.LINEAR_LAYOUT, true, new Style(null, null, null, null, null, null, null, null, null, null, null, 0, 1, 4095, null), arrayList7, true, new LinearLayoutProperty(Orientation.COLUMN, 4.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 60, null)));
        String str3 = urlPreviewEntity.sdk_title;
        if (str3 == null || str3.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            Type type = Type.TEXT;
            Style style = new Style(null, new FontLevel(FontType.HEADLINE, 0, 2, null), new ThemeColor("text_title", num, new ThemeColor.Key(null, null, 0, 7, null)), null, null, null, null, null, null, null, null, 0, 0, 8185, null);
            List emptyList = CollectionsKt.emptyList();
            String str4 = urlPreviewEntity.sdk_title;
            Intrinsics.checkExpressionValueIsNotNull(str4, "pbUrlPreviewEntity.sdk_title");
            hashMap2.put("title", new UrlPreviewComponent(type, true, style, emptyList, true, new TextViewProperty(str4, 2)));
            arrayList7.add("title");
        }
        String str5 = urlPreviewEntity.sdk_description;
        if (!(str5 == null || str5.length() == 0)) {
            z4 = false;
        }
        if (!z4) {
            Type type2 = Type.TEXT;
            Style style2 = new Style(null, new FontLevel(FontType.BODY, 2), new ThemeColor("text_caption", num, new ThemeColor.Key(null, null, 0, 7, null)), null, null, null, null, null, null, null, null, 0, 1, 4089, null);
            List emptyList2 = CollectionsKt.emptyList();
            String str6 = urlPreviewEntity.sdk_description;
            Intrinsics.checkExpressionValueIsNotNull(str6, "pbUrlPreviewEntity.sdk_description");
            hashMap2.put("description", new UrlPreviewComponent(type2, true, style2, emptyList2, true, new TextViewProperty(str6, 2)));
            arrayList7.add("description");
        }
        return new UrlPreviewComponents(arrayList, hashMap2, arrayList2, arrayList3, arrayList4);
    }

    /* renamed from: a */
    private final ButtonProperty m132278a(URLPreviewComponent.IconButtonProperty iconButtonProperty) {
        if (iconButtonProperty != null) {
            return new ButtonProperty(ModelParserImage.m132266a(iconButtonProperty.icon), null, null, iconButtonProperty.action_id, iconButtonProperty.is_disable);
        }
        return new ButtonProperty(null, null, null, null, null);
    }
}
