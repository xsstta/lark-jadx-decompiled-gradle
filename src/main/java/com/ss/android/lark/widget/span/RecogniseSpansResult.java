package com.ss.android.lark.widget.span;

import com.larksuite.framework.utils.CollectionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecogniseSpansResult implements Serializable {
    private List<AbbreviationInfo> abbreviationInfos;
    private List<AtInfo> atSpanInfos;
    private List<ChatInfo> chatSpanInfos;
    private List<EmojiconInfo> emojiInfos;
    private List<EmptyHolderInfo> emptyHolderInfos;
    private List<ImageInfo> imageInfos;
    private List<IntentionInfo> intentionInfos;
    private List<MediaInfo> mediaInfos;
    private List<MentionInfo> mentionInfos;
    private List<PhoneInfo> phoneSpanInfos;
    private List<PrefixInfo> prefixInfos;
    private List<SpacingInfo> spacingInfos;
    private List<TextStyleInfo> textStyleInfos;
    private List<UrlInfo> urlSpanInfos;

    public List<AtInfo> getAtSpanInfos() {
        return this.atSpanInfos;
    }

    public List<ChatInfo> getChatSpanInfos() {
        return this.chatSpanInfos;
    }

    public List<EmojiconInfo> getEmojiInfos() {
        return this.emojiInfos;
    }

    public List<ImageInfo> getImageSpanInfos() {
        return this.imageInfos;
    }

    public List<MediaInfo> getMediaInfos() {
        return this.mediaInfos;
    }

    public List<MentionInfo> getMentionInfos() {
        return this.mentionInfos;
    }

    public List<PhoneInfo> getPhoneSpanInfos() {
        return this.phoneSpanInfos;
    }

    public List<TextStyleInfo> getTextStyleInfos() {
        return this.textStyleInfos;
    }

    public List<UrlInfo> getUrlSpanInfos() {
        return this.urlSpanInfos;
    }

    /* renamed from: com.ss.android.lark.widget.span.RecogniseSpansResult$a */
    public static final class C59147a {

        /* renamed from: a */
        private List<UrlInfo> f146786a = new ArrayList();

        /* renamed from: b */
        private List<AtInfo> f146787b = new ArrayList();

        /* renamed from: c */
        private List<PhoneInfo> f146788c = new ArrayList();

        /* renamed from: d */
        private List<ChatInfo> f146789d = new ArrayList();

        /* renamed from: e */
        private List<TextStyleInfo> f146790e = new ArrayList();

        /* renamed from: f */
        private List<AbbreviationInfo> f146791f = new ArrayList();

        /* renamed from: g */
        private List<ImageInfo> f146792g = new ArrayList();

        /* renamed from: h */
        private List<SpacingInfo> f146793h = new ArrayList();

        /* renamed from: i */
        private List<IntentionInfo> f146794i = new ArrayList();

        /* renamed from: j */
        private List<MentionInfo> f146795j = new ArrayList();

        /* renamed from: k */
        private List<MediaInfo> f146796k = new ArrayList();

        /* renamed from: l */
        private List<EmojiconInfo> f146797l = new ArrayList();

        /* renamed from: m */
        private List<PrefixInfo> f146798m = new ArrayList();

        /* renamed from: n */
        private List<EmptyHolderInfo> f146799n = new ArrayList();

        /* renamed from: a */
        public RecogniseSpansResult mo201043a() {
            return new RecogniseSpansResult(this.f146786a, this.f146787b, this.f146788c, this.f146789d, this.f146790e, this.f146791f, this.f146792g, this.f146793h, this.f146794i, this.f146795j, this.f146796k, this.f146797l, this.f146798m, this.f146799n);
        }

        /* renamed from: a */
        public C59147a mo201042a(List<UrlInfo> list) {
            this.f146786a = list;
            return this;
        }

        /* renamed from: b */
        public C59147a mo201044b(List<AtInfo> list) {
            this.f146787b = list;
            return this;
        }

        /* renamed from: c */
        public C59147a mo201045c(List<PhoneInfo> list) {
            this.f146788c = list;
            return this;
        }

        /* renamed from: d */
        public C59147a mo201046d(List<ChatInfo> list) {
            this.f146789d = list;
            return this;
        }

        /* renamed from: e */
        public C59147a mo201047e(List<TextStyleInfo> list) {
            this.f146790e = list;
            return this;
        }

        /* renamed from: f */
        public C59147a mo201048f(List<PrefixInfo> list) {
            this.f146798m = list;
            return this;
        }

        /* renamed from: g */
        public C59147a mo201049g(List<EmptyHolderInfo> list) {
            this.f146799n = list;
            return this;
        }

        /* renamed from: h */
        public C59147a mo201050h(List<AbbreviationInfo> list) {
            this.f146791f = list;
            return this;
        }

        /* renamed from: i */
        public C59147a mo201051i(List<ImageInfo> list) {
            this.f146792g = list;
            return this;
        }

        /* renamed from: j */
        public C59147a mo201052j(List<SpacingInfo> list) {
            this.f146793h = list;
            return this;
        }

        /* renamed from: k */
        public C59147a mo201053k(List<IntentionInfo> list) {
            this.f146794i = list;
            return this;
        }

        /* renamed from: l */
        public C59147a mo201054l(List<MentionInfo> list) {
            this.f146795j = list;
            return this;
        }

        /* renamed from: m */
        public C59147a mo201055m(List<MediaInfo> list) {
            this.f146796k = list;
            return this;
        }

        /* renamed from: n */
        public C59147a mo201056n(List<EmojiconInfo> list) {
            this.f146797l = list;
            return this;
        }
    }

    public List<SpanInfo> getAllSpanInfos() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.urlSpanInfos);
        arrayList.addAll(this.atSpanInfos);
        arrayList.addAll(this.phoneSpanInfos);
        arrayList.addAll(this.chatSpanInfos);
        arrayList.addAll(this.textStyleInfos);
        arrayList.addAll(this.abbreviationInfos);
        arrayList.addAll(this.imageInfos);
        arrayList.addAll(this.spacingInfos);
        arrayList.addAll(this.intentionInfos);
        arrayList.addAll(this.mentionInfos);
        arrayList.addAll(this.mediaInfos);
        arrayList.addAll(this.emojiInfos);
        arrayList.addAll(this.prefixInfos);
        arrayList.addAll(this.emptyHolderInfos);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size <= -1) {
                Collections.sort(arrayList);
                return arrayList;
            } else if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void addAtSpanInfo(AtInfo atInfo) {
        this.atSpanInfos.add(atInfo);
    }

    public void addMentionSpanInfo(MentionInfo mentionInfo) {
        this.mentionInfos.add(mentionInfo);
    }

    public void addPhoneSpanInfo(PhoneInfo phoneInfo) {
        this.phoneSpanInfos.add(phoneInfo);
    }

    public void addTextStyleInfo(TextStyleInfo textStyleInfo) {
        this.textStyleInfos.add(textStyleInfo);
    }

    public void addUrlSpanInfo(UrlInfo urlInfo) {
        this.urlSpanInfos.add(urlInfo);
    }

    public void addAtSpanInfos(List<AtInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.atSpanInfos.addAll(list);
        }
    }

    public void addChatSpanInfos(List<ChatInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.chatSpanInfos.addAll(list);
        }
    }

    public void addPhoneSpanInfos(List<PhoneInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.phoneSpanInfos.addAll(list);
        }
    }

    public void addUrlSpanInfos(List<UrlInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.urlSpanInfos.addAll(list);
        }
    }

    public RecogniseSpansResult(List<UrlInfo> list, List<AtInfo> list2, List<TextStyleInfo> list3, List<EmojiconInfo> list4) {
        this.urlSpanInfos = new ArrayList();
        this.atSpanInfos = new ArrayList();
        this.phoneSpanInfos = new ArrayList();
        this.chatSpanInfos = new ArrayList();
        this.textStyleInfos = new ArrayList();
        this.abbreviationInfos = new ArrayList();
        this.intentionInfos = new ArrayList();
        this.imageInfos = new ArrayList();
        this.spacingInfos = new ArrayList();
        this.mentionInfos = new ArrayList();
        this.mediaInfos = new ArrayList();
        this.emojiInfos = new ArrayList();
        this.prefixInfos = new ArrayList();
        this.emptyHolderInfos = new ArrayList();
        this.urlSpanInfos = list;
        this.atSpanInfos = list2;
        this.textStyleInfos = list3;
        this.emojiInfos = list4;
    }

    public RecogniseSpansResult(List<UrlInfo> list, List<AtInfo> list2, List<PhoneInfo> list3, List<ChatInfo> list4, List<TextStyleInfo> list5, List<AbbreviationInfo> list6, List<ImageInfo> list7, List<SpacingInfo> list8, List<IntentionInfo> list9, List<MentionInfo> list10) {
        this(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
    }

    public RecogniseSpansResult(List<UrlInfo> list, List<AtInfo> list2, List<PhoneInfo> list3, List<ChatInfo> list4, List<TextStyleInfo> list5, List<AbbreviationInfo> list6, List<ImageInfo> list7, List<SpacingInfo> list8, List<IntentionInfo> list9, List<MentionInfo> list10, List<MediaInfo> list11, List<EmojiconInfo> list12, List<PrefixInfo> list13, List<EmptyHolderInfo> list14) {
        this.urlSpanInfos = new ArrayList();
        this.atSpanInfos = new ArrayList();
        this.phoneSpanInfos = new ArrayList();
        this.chatSpanInfos = new ArrayList();
        this.textStyleInfos = new ArrayList();
        this.abbreviationInfos = new ArrayList();
        this.intentionInfos = new ArrayList();
        this.imageInfos = new ArrayList();
        this.spacingInfos = new ArrayList();
        this.mentionInfos = new ArrayList();
        this.mediaInfos = new ArrayList();
        this.emojiInfos = new ArrayList();
        this.prefixInfos = new ArrayList();
        this.emptyHolderInfos = new ArrayList();
        this.urlSpanInfos.addAll(list);
        this.atSpanInfos.addAll(list2);
        this.phoneSpanInfos.addAll(list3);
        this.chatSpanInfos.addAll(list4);
        this.textStyleInfos.addAll(list5);
        this.abbreviationInfos.addAll(list6);
        this.imageInfos.addAll(list7);
        this.spacingInfos.addAll(list8);
        this.intentionInfos.addAll(list9);
        this.mentionInfos.addAll(list10);
        this.mediaInfos.addAll(list11);
        this.emojiInfos.addAll(list12);
        this.prefixInfos.addAll(list13);
        this.emptyHolderInfos.addAll(list14);
    }
}
