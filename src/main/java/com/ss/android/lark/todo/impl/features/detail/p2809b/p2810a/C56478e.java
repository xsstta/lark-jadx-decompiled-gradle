package com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.RichContent;
import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.preview.NetUrlPreviewEntity;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56254i;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.Map;

/* renamed from: com.ss.android.lark.todo.impl.features.detail.b.a.e */
public class C56478e {

    /* renamed from: a */
    private static final AbstractC56254i f139698a = TodoDependencyHolder.f139242a.mo191730a().docDependency();

    /* renamed from: a */
    public static RichText m220168a(RichContent richContent) {
        if (richContent == null) {
            return new RichText();
        }
        RichText a = C56473b.m220117a(richContent.rich_text);
        m220171b(a, C56472a.m220113a(a.getElements(), richContent.doc_entity));
        m220170a(a, ParserUrlPreviewHelper.m220167b(richContent.url_preview_hang_points), ParserUrlPreviewHelper.m220166a(richContent.url_preview_entities));
        return a;
    }

    /* renamed from: a */
    public static void m220169a(RichText richText, Map<String, Doc> map) {
        String str;
        if (!(map == null || map.isEmpty() || richText == null)) {
            for (String str2 : map.keySet()) {
                RichTextElement richTextElement = richText.getElements().getDictionary().get(str2);
                if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty)) {
                    Doc doc = map.get(str2);
                    RichTextElement.AnchorProperty anchorProperty = (RichTextElement.AnchorProperty) richTextElement.getProperty();
                    if (TextUtils.isEmpty(doc.getName())) {
                        str = anchorProperty.getContent();
                    } else {
                        str = doc.getName();
                    }
                    anchorProperty.setDisplayTitle(str);
                    AbstractC56254i iVar = f139698a;
                    anchorProperty.setLocalIconRes(iVar.mo145383a(doc.getDocType()));
                    anchorProperty.setLocalGrayIconRes(iVar.mo145385b(doc.getDocType()));
                    if (doc.getIcon() != null) {
                        anchorProperty.setIconKey(doc.getIcon().getValue());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m220171b(RichText richText, Map<String, Doc> map) {
        String str;
        if (!(map == null || map.isEmpty() || richText == null)) {
            for (Doc doc : map.values()) {
                for (RichTextElement richTextElement : richText.getElements().getDictionary().values()) {
                    if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty) && doc.getUrl().equals(((RichTextElement.AnchorProperty) richTextElement.getProperty()).getHref())) {
                        RichTextElement.AnchorProperty anchorProperty = (RichTextElement.AnchorProperty) richTextElement.getProperty();
                        if (TextUtils.isEmpty(doc.getName())) {
                            str = anchorProperty.getContent();
                        } else {
                            str = doc.getName();
                        }
                        anchorProperty.setDisplayTitle(str);
                        AbstractC56254i iVar = f139698a;
                        anchorProperty.setLocalIconRes(iVar.mo145383a(doc.getDocType()));
                        anchorProperty.setLocalGrayIconRes(iVar.mo145385b(doc.getDocType()));
                        if (doc.getIcon() != null) {
                            anchorProperty.setIconKey(doc.getIcon().getValue());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m220170a(RichText richText, Map<String, UrlPreviewHangPoint> map, Map<String, NetUrlPreviewEntity> map2) {
        UrlPreviewHangPoint urlPreviewHangPoint;
        NetUrlPreviewEntity netUrlPreviewEntity;
        if (!(!TodoDependencyHolder.f139242a.mo191731b().mo191933f() || richText == null || richText.getElements() == null || richText.getElements().getDictionary() == null)) {
            if (CollectionUtils.isEmpty(map) || CollectionUtils.isEmpty(map2)) {
                for (RichTextElement richTextElement : richText.getElements().getDictionary().values()) {
                    if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty)) {
                        RichTextElement.AnchorProperty anchorProperty = (RichTextElement.AnchorProperty) richTextElement.getProperty();
                        if (anchorProperty.getLocalGrayIconRes() == 0) {
                            anchorProperty.setLocalGrayIconRes(R.drawable.ud_icon_link_copy_outlined);
                        }
                    }
                }
                return;
            }
            for (String str : map.keySet()) {
                RichTextElement richTextElement2 = richText.getElements().getDictionary().get(str);
                if (!(richTextElement2 == null || !(richTextElement2.getProperty() instanceof RichTextElement.AnchorProperty) || (urlPreviewHangPoint = map.get(str)) == null || (netUrlPreviewEntity = map2.get(urlPreviewHangPoint.preview_id)) == null)) {
                    RichTextElement.AnchorProperty anchorProperty2 = (RichTextElement.AnchorProperty) richTextElement2.getProperty();
                    NetUrlPreviewEntity netUrlPreviewEntity2 = netUrlPreviewEntity;
                    anchorProperty2.setDisplayTitle(netUrlPreviewEntity2.getNetTitle());
                    anchorProperty2.setHref(netUrlPreviewEntity.getUrl().getUrl());
                    anchorProperty2.setIconKey(netUrlPreviewEntity2.getNetIconKey());
                    anchorProperty2.setLocalGrayIconRes(R.drawable.ud_icon_link_copy_outlined);
                    anchorProperty2.setVersion(netUrlPreviewEntity2.getVersion());
                    anchorProperty2.setUrlPreview(true);
                }
            }
        }
    }
}
