package com.ss.android.lark.widget.richtext;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RichText implements Serializable {
    private List<String> anchorIds;
    private List<String> atIds;
    private List<String> docsIds;
    private List<String> elementIds;
    private RichTextElements elements;
    private boolean hasParsed;
    private List<String> imageIds;
    private String innerText;
    private List<String> mediaIds;
    private int richTextVersion;
    @JSONField(serialize = false)
    private List<String> urls;

    public static class RichTextElements implements Serializable {
        private Map<String, RichTextElement> dictionary = new HashMap();

        public Map<String, RichTextElement> getDictionary() {
            return this.dictionary;
        }

        public void setDictionary(Map<String, RichTextElement> map) {
            this.dictionary = new HashMap(map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RichTextElements)) {
                return false;
            }
            Map<String, RichTextElement> map = this.dictionary;
            Map<String, RichTextElement> map2 = ((RichTextElements) obj).dictionary;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 == null) {
                return true;
            }
            return false;
        }
    }

    public RichText() {
    }

    public List<String> getAnchorIds() {
        return this.anchorIds;
    }

    public List<String> getAtIds() {
        return this.atIds;
    }

    public List<String> getDocsIds() {
        return this.docsIds;
    }

    public List<String> getElementIds() {
        return this.elementIds;
    }

    public RichTextElements getElements() {
        return this.elements;
    }

    public List<String> getImageIds() {
        return this.imageIds;
    }

    public String getInnerText() {
        return this.innerText;
    }

    public List<String> getMediaIds() {
        return this.mediaIds;
    }

    public int getRichTextVersion() {
        return this.richTextVersion;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public boolean hasParsed() {
        return this.hasParsed;
    }

    public void setElements(RichTextElements richTextElements) {
        this.elements = richTextElements;
    }

    public void setHasParsed(boolean z) {
        this.hasParsed = z;
    }

    public void setInnerText(String str) {
        this.innerText = str;
    }

    public void setMediaIds(List<String> list) {
        this.mediaIds = list;
    }

    public void setRichTextVersion(int i) {
        this.richTextVersion = i;
    }

    public void setUrls(List<String> list) {
        this.urls = list;
    }

    public void setAnchorIds(List<String> list) {
        this.anchorIds = new ArrayList(list);
    }

    public void setAtIds(List<String> list) {
        this.atIds = new ArrayList(list);
    }

    public void setDocsIds(List<String> list) {
        this.docsIds = new ArrayList(list);
    }

    public void setElementIds(List<String> list) {
        this.elementIds = new ArrayList(list);
    }

    public void setImageIds(List<String> list) {
        this.imageIds = new ArrayList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RichText richText = (RichText) obj;
        List<String> list = this.elementIds;
        if (list == null ? richText.elementIds != null : !list.equals(richText.elementIds)) {
            return false;
        }
        RichTextElements richTextElements = this.elements;
        RichTextElements richTextElements2 = richText.elements;
        if (richTextElements != null) {
            return richTextElements.equals(richTextElements2);
        }
        if (richTextElements2 == null) {
            return true;
        }
        return false;
    }

    public RichText(RichText richText) {
        RichTextElements richTextElements;
        ArrayList arrayList;
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        String str;
        List<String> list5;
        int i;
        if (richText == null) {
            richTextElements = new RichTextElements();
        } else {
            richTextElements = richText.getElements();
        }
        this.elements = richTextElements;
        if (richText != null) {
            arrayList = new ArrayList(richText.getElementIds());
        }
        this.elementIds = arrayList;
        if (richText == null) {
            list = new ArrayList<>();
        } else {
            list = richText.getAnchorIds();
        }
        this.anchorIds = list;
        if (richText == null) {
            list2 = new ArrayList<>();
        } else {
            list2 = richText.getAtIds();
        }
        this.atIds = list2;
        if (richText == null) {
            list3 = new ArrayList<>();
        } else {
            list3 = richText.getImageIds();
        }
        this.imageIds = list3;
        if (richText == null) {
            list4 = new ArrayList<>();
        } else {
            list4 = richText.getMediaIds();
        }
        this.mediaIds = list4;
        if (richText == null) {
            str = "";
        } else {
            str = richText.getInnerText();
        }
        this.innerText = str;
        if (richText == null) {
            list5 = new ArrayList<>();
        } else {
            list5 = richText.getDocsIds();
        }
        this.docsIds = list5;
        if (richText == null) {
            i = 0;
        } else {
            i = richText.richTextVersion;
        }
        this.richTextVersion = i;
    }
}
