package com.ss.android.lark.integrator.meego.p2042a;

import android.text.TextUtils;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.FileContentVO;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chat.base.view.vo.message.MediaContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.p1660e.C33973b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.linked_emojicon.base.EmojiHandler;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.meego.a.d */
public final class C39855d {
    /* renamed from: a */
    public static <M extends AbsMessageVO<?>> JSONObject m158232a(M m) {
        JSONObject jSONObject;
        Message.Type r = m.mo121710r();
        ContentVO g = m.mo121699g();
        if (r == Message.Type.TEXT) {
            jSONObject = m158231a((TextContentVO) g);
        } else if (r == Message.Type.IMAGE) {
            jSONObject = m158228a((ImageContentVO) g);
        } else if (r == Message.Type.MEDIA) {
            jSONObject = m158229a((MediaContentVO) g);
        } else if (r == Message.Type.AUDIO) {
            jSONObject = m158226a((AudioContentVO) g);
        } else if (r == Message.Type.FILE) {
            jSONObject = m158227a((FileContentVO) g);
        } else if (r != Message.Type.POST) {
            return null;
        } else {
            jSONObject = m158230a((PostContentVO) g);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            C33973b C = m.mo121657C();
            if (C != null) {
                jSONObject2.put("sender_name", C.mo124198b());
            }
            jSONObject2.put("time", m.mo121716x());
            jSONObject2.put(ShareHitPoint.f121869d, r.name().toLowerCase());
            jSONObject2.put("content", jSONObject);
        } catch (JSONException e) {
            Log.m165384e("MessageToMeegoParser", "createMessage json error", e);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.meego.a.d$a */
    public static class C39856a {
        /* renamed from: a */
        public static JSONArray m158234a(List<RichTextElement> list) {
            JSONArray jSONArray = new JSONArray();
            for (RichTextElement richTextElement : list) {
                try {
                    JSONObject a = m158235a(richTextElement);
                    if (a != null) {
                        jSONArray.put(a);
                    }
                } catch (JSONException e) {
                    Log.m165384e("MessageToMeegoParser", "parseElement, json error", e);
                }
            }
            return jSONArray;
        }

        /* renamed from: a */
        private static JSONObject m158235a(RichTextElement richTextElement) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (richTextElement.getTag() == RichTextElement.RichTextTag.TEXT) {
                jSONObject.put("content", ((RichTextElement.TextProperty) richTextElement.getProperty()).getContent());
                jSONObject.put(ShareHitPoint.f121869d, "text");
            } else if (richTextElement.getTag() == RichTextElement.RichTextTag.ITALIC) {
                jSONObject.put("content", ((RichTextElement.ItalicProperty) richTextElement.getProperty()).getContent());
                jSONObject.put(ShareHitPoint.f121869d, "text");
            } else if (richTextElement.getTag() == RichTextElement.RichTextTag.BOLD) {
                jSONObject.put("content", ((RichTextElement.BoldProperty) richTextElement.getProperty()).getContent());
                jSONObject.put(ShareHitPoint.f121869d, "text");
            } else if (richTextElement.getTag() == RichTextElement.RichTextTag.UNDERLINE) {
                jSONObject.put("content", ((RichTextElement.UnderlineProperty) richTextElement.getProperty()).getContent());
                jSONObject.put(ShareHitPoint.f121869d, "text");
            } else if (richTextElement.getTag() == RichTextElement.RichTextTag.AT) {
                jSONObject.put("content", ((RichTextElement.AtProperty) richTextElement.getProperty()).getContent());
                jSONObject.put(ShareHitPoint.f121869d, "text");
            } else if (richTextElement.getTag() == RichTextElement.RichTextTag.EMOTION) {
                jSONObject.put("content", EmojiHandler.m226949b(((RichTextElement.EmotionProperty) richTextElement.getProperty()).getKey()));
                jSONObject.put(ShareHitPoint.f121869d, "text");
            } else if (richTextElement.getTag() == RichTextElement.RichTextTag.IMG) {
                RichTextElement.ImageProperty imageProperty = (RichTextElement.ImageProperty) richTextElement.getProperty();
                jSONObject.put("key", imageProperty.getOriginKey());
                jSONObject.put("width", imageProperty.getOriginWidth());
                jSONObject.put("height", imageProperty.getOriginHeight());
                jSONObject.put(ShareHitPoint.f121869d, "image");
            } else if (richTextElement.getTag() == RichTextElement.RichTextTag.LINK) {
                jSONObject.put("url", ((RichTextElement.LinkProperty) richTextElement.getProperty()).getUrl());
                jSONObject.put(ShareHitPoint.f121869d, "link");
            } else if (richTextElement.getTag() == RichTextElement.RichTextTag.ANCHOR) {
                jSONObject.put("url", ((RichTextElement.AnchorProperty) richTextElement.getProperty()).getContent());
                jSONObject.put(ShareHitPoint.f121869d, "link");
            } else if (richTextElement.getTag() != RichTextElement.RichTextTag.MEDIA) {
                return null;
            } else {
                RichTextElement.MediaProperty mediaProperty = (RichTextElement.MediaProperty) richTextElement.getProperty();
                String key = mediaProperty.getKey();
                if (!TextUtils.isEmpty(key) && key.contains("origin:")) {
                    key = key.replace("origin:", "");
                }
                jSONObject.put("key", key);
                jSONObject.put("width", mediaProperty.getOriginImage().getWidth());
                jSONObject.put("height", mediaProperty.getOriginImage().getHeight());
                jSONObject.put(ShareHitPoint.f121869d, "media");
            }
            return jSONObject;
        }

        /* renamed from: a */
        public static List<RichTextElement> m158233a(List<String> list, Map<String, RichTextElement> map) {
            ArrayList arrayList = new ArrayList();
            Iterator it = new ArrayList(list).iterator();
            while (it.hasNext()) {
                RichTextElement richTextElement = map.get((String) it.next());
                if (richTextElement != null) {
                    if (richTextElement.getChildIds() == null || richTextElement.getChildIds().size() <= 0) {
                        arrayList.add(richTextElement);
                    } else {
                        arrayList.addAll(m158233a(richTextElement.getChildIds(), map));
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static <M extends AbsMessageVO<?>> JSONArray m158225a(List<M> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            JSONObject a = m158232a((AbsMessageVO) it.next());
            if (a != null) {
                jSONArray.put(a);
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static JSONObject m158226a(AudioContentVO bVar) {
        String a = bVar.mo121801a();
        long b = bVar.mo121807b();
        if (b == 0) {
            b = ((AudioContent) bVar.mo126168z()).getSize();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", a);
            jSONObject.put("size", String.valueOf(b));
        } catch (JSONException e) {
            Log.m165384e("MessageToMeegoParser", "parseAudioContextVO, json error", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m158227a(FileContentVO dVar) {
        String a = dVar.mo121820a();
        String b = dVar.mo121825b();
        String o = dVar.mo121838o();
        long c = dVar.mo121826c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", b);
            jSONObject.put("key", a);
            jSONObject.put("mine", o);
            jSONObject.put("size", String.valueOf(c));
        } catch (JSONException e) {
            Log.m165384e("MessageToMeegoParser", "parseFileContextVO, json error", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m158228a(ImageContentVO fVar) {
        int i;
        String str;
        int i2;
        Image b = fVar.mo121844b();
        if (b != null) {
            str = b.getKey();
            i = b.getWidth();
            i2 = b.getHeight();
        } else {
            str = null;
            i2 = 0;
            i = 0;
        }
        if (TextUtils.isEmpty(str)) {
            fVar.mo121842a();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", str);
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
        } catch (JSONException e) {
            Log.m165384e("MessageToMeegoParser", "parseImageContextVO, json error", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m158229a(MediaContentVO gVar) {
        String a = gVar.mo121854a();
        String b = gVar.mo121859b();
        long c = gVar.mo121860c();
        if (c == 0) {
            c = ((MediaContent) gVar.mo126168z()).getSize();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", b);
            jSONObject.put("key", a);
            jSONObject.put("size", String.valueOf(c));
        } catch (JSONException e) {
            Log.m165384e("MessageToMeegoParser", "handleMediaContextVO, json error", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m158230a(PostContentVO iVar) {
        RichText a = iVar.mo121772a();
        if (a == null) {
            return null;
        }
        JSONArray a2 = C39856a.m158234a(C39856a.m158233a(a.getElementIds(), a.getElements().getDictionary()));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title", iVar.mo121881m());
            jSONObject.put("elements", a2);
        } catch (JSONException e) {
            Log.m165384e("MessageToMeegoParser", "parsePostContentVO, json error", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m158231a(TextContentVO mVar) {
        String str;
        TextContent textContent = (TextContent) mVar.mo126168z();
        String str2 = "";
        if (textContent != null) {
            str = textContent.getTextInMemory();
            if (TextUtils.isEmpty(str) && textContent.getRichText() != null) {
                str = C59035h.m229212c(textContent.getRichText());
            }
        } else {
            str = str2;
        }
        if (str != null) {
            str2 = str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("text", str2);
        } catch (JSONException e) {
            Log.m165384e("MessageToMeegoParser", "parseTextContentVO, json error", e);
        }
        return jSONObject;
    }
}
