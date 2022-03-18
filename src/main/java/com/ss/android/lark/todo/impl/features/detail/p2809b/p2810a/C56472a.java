package com.ss.android.lark.todo.impl.features.detail.p2809b.p2810a;

import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.DocEntity;
import com.bytedance.lark.pb.basic.v1.Icon;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.todo.impl.features.detail.b.a.a */
public class C56472a {
    /* renamed from: a */
    public static DocEntity m220112a(Map<String, Doc> map) {
        if (CollectionUtils.isEmpty(map)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (str != null) {
                Doc doc = map.get(str);
                hashMap.put(str, new DocEntity.ElementEntity.C14870a().mo54526a(doc.getName()).mo54524a(Doc.Type.fromValue(doc.getDocType().getNumber())).mo54529c(doc.getUrl()).mo54528b(doc.getId()).mo54525a(new Icon.C15007a().mo54841a(Icon.Type.fromValue(doc.getIcon().getType())).mo54842a(doc.getIcon().getValue()).build()).build());
            }
        }
        return new DocEntity.C14872a().mo54533a(hashMap).build();
    }

    /* renamed from: a */
    public static HashMap<String, com.ss.android.lark.doc.entity.Doc> m220113a(RichText.RichTextElements richTextElements, DocEntity docEntity) {
        HashMap<String, com.ss.android.lark.doc.entity.Doc> hashMap = new HashMap<>();
        if (!(docEntity == null || richTextElements == null)) {
            Map<String, RichTextElement> dictionary = richTextElements.getDictionary();
            Map<String, DocEntity.ElementEntity> map = docEntity.element_entity_ref;
            if (!CollectionUtils.isEmpty(dictionary) && !CollectionUtils.isEmpty(map)) {
                for (String str : map.keySet()) {
                    DocEntity.ElementEntity elementEntity = map.get(str);
                    RichTextElement richTextElement = dictionary.get(str);
                    if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty)) {
                        com.ss.android.lark.doc.entity.Doc doc = new com.ss.android.lark.doc.entity.Doc();
                        doc.setId(elementEntity.token);
                        doc.setName(elementEntity.title);
                        doc.setUrl(((RichTextElement.AnchorProperty) richTextElement.getProperty()).getHref());
                        doc.setDocType(DocType.forNumber(elementEntity.doc_type.getValue()));
                        com.ss.android.lark.doc.entity.Icon icon = new com.ss.android.lark.doc.entity.Icon();
                        if (elementEntity.icon != null) {
                            icon.setType(elementEntity.icon.type.getValue());
                            icon.setValue(elementEntity.icon.value);
                        }
                        doc.setIcon(icon);
                        hashMap.put(str, doc);
                    }
                }
                return hashMap;
            }
        }
        return null;
    }
}
