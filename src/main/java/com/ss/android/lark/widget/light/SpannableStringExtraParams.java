package com.ss.android.lark.widget.light;

import android.content.Context;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u00014B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0016\u0010\u0013\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0016\u0010\u001b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0016\u0010\u001d\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0016\u0010#\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\fR\u0011\u0010'\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\fR\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b)\u0010+R\u0011\u0010,\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u000e\u0010-\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u00100\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b1\u0010+R\u0011\u00102\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\b¨\u00065"}, d2 = {"Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "", "builder", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams$Builder;", "(Lcom/ss/android/lark/widget/light/SpannableStringExtraParams$Builder;)V", "anonymousUserId", "", "getAnonymousUserId", "()Ljava/lang/String;", "atAnonymousTextColor", "", "getAtAnonymousTextColor", "()I", "atGroupBgColor", "getAtGroupBgColor", "atGroupTextColor", "getAtGroupTextColor", "atOtherChatUserTextColor", "getAtOtherChatUserTextColor", "atReadDotColor", "getAtReadDotColor", "atReadUserList", "", "getAtReadUserList", "()Ljava/util/List;", "atSelfBgColor", "getAtSelfBgColor", "atSelfTextColor", "getAtSelfTextColor", "atUnreadDotColor", "getAtUnreadDotColor", "botIdList", "getBotIdList", "currentUserId", "getCurrentUserId", "defaultAtColor", "getDefaultAtColor", "defaultTextSize", "getDefaultTextSize", "emojiSie", "getEmojiSie", "isShowAtDot", "", "()Z", "isUrlShowUnderLine", "mTag", "showStrikeThrough", "getShowStrikeThrough", "translateEmojiCode", "getTranslateEmojiCode", "unClickGroupId", "getUnClickGroupId", "Builder", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.a */
public final class SpannableStringExtraParams {

    /* renamed from: a */
    private final boolean f144086a;

    /* renamed from: b */
    private final List<String> f144087b;

    /* renamed from: c */
    private final List<String> f144088c;

    /* renamed from: d */
    private final boolean f144089d;

    /* renamed from: e */
    private final String f144090e;

    /* renamed from: f */
    private final String f144091f;

    /* renamed from: g */
    private final String f144092g;

    /* renamed from: h */
    private final String f144093h;

    /* renamed from: i */
    private final int f144094i;

    /* renamed from: j */
    private final int f144095j;

    /* renamed from: k */
    private final boolean f144096k;

    /* renamed from: l */
    private final int f144097l;

    /* renamed from: m */
    private final int f144098m;

    /* renamed from: n */
    private final int f144099n;

    /* renamed from: o */
    private final int f144100o;

    /* renamed from: p */
    private final int f144101p;

    /* renamed from: q */
    private final int f144102q;

    /* renamed from: r */
    private final int f144103r;

    /* renamed from: s */
    private final int f144104s;

    /* renamed from: t */
    private final int f144105t;

    /* renamed from: u */
    private final boolean f144106u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\fJ\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\fJ\u0010\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\fJ\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\fJ\u0010\u0010$\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\fJ\u0010\u0010'\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\fJ\u0014\u0010*\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060MJ\u0006\u0010N\u001a\u00020OJ\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0006J\u0010\u0010/\u001a\u00020\u00002\b\b\u0001\u0010L\u001a\u00020\fJ\u000e\u00102\u001a\u00020\u00002\u0006\u0010P\u001a\u00020\fJ\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\fJ\u0014\u0010Q\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060MJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0006J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010=\u001a\u000209J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u000209J\u000e\u0010F\u001a\u00020\u00002\u0006\u0010F\u001a\u000209J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u0006J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u000209R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001e\u0010\u001a\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\u001e\u0010$\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R\u001e\u0010'\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u001a\u0010,\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\u001e\u0010/\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R\u001a\u00102\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000e\"\u0004\b4\u0010\u0010R\u001a\u00105\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\u0010R\u001a\u00108\u001a\u000209X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u000209X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R\u001a\u0010@\u001a\u000209X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R\u001a\u0010C\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\b\"\u0004\bE\u0010\nR\u001a\u0010F\u001a\u000209X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R\u001a\u0010I\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\b\"\u0004\bK\u0010\n¨\u0006T"}, d2 = {"Lcom/ss/android/lark/widget/light/SpannableStringExtraParams$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "anonymousUserId", "", "getAnonymousUserId", "()Ljava/lang/String;", "setAnonymousUserId", "(Ljava/lang/String;)V", "atAnonymousTextColor", "", "getAtAnonymousTextColor", "()I", "setAtAnonymousTextColor", "(I)V", "atGroupBgColor", "getAtGroupBgColor", "setAtGroupBgColor", "atGroupTextColor", "getAtGroupTextColor", "setAtGroupTextColor", "atOtherChatTextColor", "getAtOtherChatTextColor", "setAtOtherChatTextColor", "atReadDotColor", "getAtReadDotColor", "setAtReadDotColor", "atReadUserList", "Ljava/util/ArrayList;", "getAtReadUserList", "()Ljava/util/ArrayList;", "atSelfBgColor", "getAtSelfBgColor", "setAtSelfBgColor", "atSelfTextColor", "getAtSelfTextColor", "setAtSelfTextColor", "atUnreadDotColor", "getAtUnreadDotColor", "setAtUnreadDotColor", "botIdList", "getBotIdList", "currentUserId", "getCurrentUserId", "setCurrentUserId", "defaultAtColor", "getDefaultAtColor", "setDefaultAtColor", "defaultTextSize", "getDefaultTextSize", "setDefaultTextSize", "emojiSize", "getEmojiSize", "setEmojiSize", "isUrlShowUnderLine", "", "()Z", "setUrlShowUnderLine", "(Z)V", "showAtDot", "getShowAtDot", "setShowAtDot", "showStrikeThrough", "getShowStrikeThrough", "setShowStrikeThrough", "tag", "getTag", "setTag", "translateEmojiCode", "getTranslateEmojiCode", "setTranslateEmojiCode", "unClickGroupId", "getUnClickGroupId", "setUnClickGroupId", "colorInt", "", "build", "Lcom/ss/android/lark/widget/light/SpannableStringExtraParams;", "textSizeInPx", "setAtReadUserList", "urlShowUnderLine", "showUnderLine", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.a$a */
    public static final class Builder {

        /* renamed from: a */
        private boolean f144107a = true;

        /* renamed from: b */
        private final ArrayList<String> f144108b = new ArrayList<>();

        /* renamed from: c */
        private final ArrayList<String> f144109c = new ArrayList<>();

        /* renamed from: d */
        private boolean f144110d = true;

        /* renamed from: e */
        private String f144111e = "";

        /* renamed from: f */
        private String f144112f = "";

        /* renamed from: g */
        private String f144113g = "";

        /* renamed from: h */
        private String f144114h = "";

        /* renamed from: i */
        private int f144115i = ((int) UIHelper.sp2px(17.0f));

        /* renamed from: j */
        private int f144116j = ((int) UIHelper.sp2px(19.0f));

        /* renamed from: k */
        private boolean f144117k;

        /* renamed from: l */
        private boolean f144118l;

        /* renamed from: m */
        private int f144119m;

        /* renamed from: n */
        private int f144120n;

        /* renamed from: o */
        private int f144121o;

        /* renamed from: p */
        private int f144122p;

        /* renamed from: q */
        private int f144123q;

        /* renamed from: r */
        private int f144124r;

        /* renamed from: s */
        private int f144125s;

        /* renamed from: t */
        private int f144126t;

        /* renamed from: u */
        private int f144127u;

        /* renamed from: i */
        public final int mo198094i() {
            return this.f144115i;
        }

        /* renamed from: j */
        public final int mo198095j() {
            return this.f144116j;
        }

        /* renamed from: k */
        public final boolean mo198096k() {
            return this.f144117k;
        }

        /* renamed from: l */
        public final boolean mo198097l() {
            return this.f144118l;
        }

        /* renamed from: m */
        public final int mo198098m() {
            return this.f144119m;
        }

        /* renamed from: n */
        public final int mo198099n() {
            return this.f144120n;
        }

        /* renamed from: o */
        public final int mo198100o() {
            return this.f144121o;
        }

        /* renamed from: p */
        public final int mo198101p() {
            return this.f144122p;
        }

        /* renamed from: q */
        public final int mo198102q() {
            return this.f144123q;
        }

        /* renamed from: r */
        public final int mo198103r() {
            return this.f144124r;
        }

        /* renamed from: s */
        public final int mo198104s() {
            return this.f144125s;
        }

        /* renamed from: t */
        public final int mo198105t() {
            return this.f144126t;
        }

        /* renamed from: u */
        public final int mo198106u() {
            return this.f144127u;
        }

        /* renamed from: d */
        public final boolean mo198085d() {
            return this.f144110d;
        }

        /* renamed from: e */
        public final String mo198087e() {
            return this.f144111e;
        }

        /* renamed from: f */
        public final String mo198089f() {
            return this.f144112f;
        }

        /* renamed from: g */
        public final String mo198091g() {
            return this.f144113g;
        }

        /* renamed from: h */
        public final String mo198093h() {
            return this.f144114h;
        }

        /* renamed from: v */
        public final SpannableStringExtraParams mo198107v() {
            return new SpannableStringExtraParams(this, null);
        }

        /* renamed from: c */
        public final ArrayList<String> mo198083c() {
            return this.f144109c;
        }

        /* renamed from: a */
        public final boolean mo198075a() {
            return this.f144107a;
        }

        /* renamed from: b */
        public final ArrayList<String> mo198080b() {
            return this.f144108b;
        }

        /* renamed from: a */
        public final Builder mo198071a(int i) {
            this.f144115i = i;
            return this;
        }

        /* renamed from: b */
        public final Builder mo198076b(int i) {
            this.f144116j = i;
            return this;
        }

        /* renamed from: c */
        public final Builder mo198081c(int i) {
            this.f144119m = i;
            return this;
        }

        /* renamed from: d */
        public final Builder mo198084d(int i) {
            this.f144120n = i;
            return this;
        }

        /* renamed from: e */
        public final Builder mo198086e(int i) {
            this.f144121o = i;
            return this;
        }

        /* renamed from: f */
        public final Builder mo198088f(int i) {
            this.f144122p = i;
            return this;
        }

        /* renamed from: g */
        public final Builder mo198090g(int i) {
            this.f144123q = i;
            return this;
        }

        /* renamed from: h */
        public final Builder mo198092h(int i) {
            this.f144124r = i;
            return this;
        }

        /* renamed from: a */
        public final Builder mo198072a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "currentUserId");
            this.f144112f = str;
            return this;
        }

        /* renamed from: b */
        public final Builder mo198077b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "anonymousUserId");
            this.f144113g = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo198082c(boolean z) {
            this.f144110d = z;
            return this;
        }

        /* renamed from: a */
        public final Builder mo198073a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "atReadUserList");
            CollectionUtils.resetToList(this.f144108b, list);
            return this;
        }

        /* renamed from: b */
        public final Builder mo198078b(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "botIdList");
            CollectionUtils.resetToList(this.f144109c, list);
            return this;
        }

        /* renamed from: a */
        public final void mo198074a(boolean z) {
            this.f144118l = z;
        }

        /* renamed from: b */
        public final Builder mo198079b(boolean z) {
            this.f144107a = z;
            return this;
        }

        public Builder(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f144119m = UIUtils.getColor(context, R.color.text_caption);
            this.f144120n = UIUtils.getColor(context, R.color.static_white);
            this.f144121o = UIUtils.getColor(context, R.color.primary_pri_500);
            this.f144122p = UIUtils.getColor(context, R.color.imtoken_message_text_bubbles_blue);
            this.f144123q = UIUtils.getColor(context, R.color.imtoken_message_icon_read_dot);
            this.f144124r = UIUtils.getColor(context, R.color.imtoken_message_icon_unread_dot);
            this.f144125s = UIUtils.getColor(context, R.color.text_caption);
            this.f144126t = C25653b.m91894a(context, R.color.ud_N600, 0.12f);
            this.f144127u = UIUtils.getColor(context, R.color.text_title);
        }
    }

    /* renamed from: a */
    public final List<String> mo198052a() {
        return this.f144087b;
    }

    /* renamed from: b */
    public final List<String> mo198053b() {
        return this.f144088c;
    }

    /* renamed from: c */
    public final boolean mo198054c() {
        return this.f144089d;
    }

    /* renamed from: d */
    public final String mo198055d() {
        return this.f144090e;
    }

    /* renamed from: e */
    public final String mo198056e() {
        return this.f144091f;
    }

    /* renamed from: f */
    public final String mo198057f() {
        return this.f144092g;
    }

    /* renamed from: g */
    public final int mo198058g() {
        return this.f144094i;
    }

    /* renamed from: h */
    public final int mo198059h() {
        return this.f144095j;
    }

    /* renamed from: i */
    public final boolean mo198060i() {
        return this.f144096k;
    }

    /* renamed from: j */
    public final int mo198061j() {
        return this.f144097l;
    }

    /* renamed from: k */
    public final int mo198062k() {
        return this.f144098m;
    }

    /* renamed from: l */
    public final int mo198063l() {
        return this.f144099n;
    }

    /* renamed from: m */
    public final int mo198064m() {
        return this.f144100o;
    }

    /* renamed from: n */
    public final int mo198065n() {
        return this.f144101p;
    }

    /* renamed from: o */
    public final int mo198066o() {
        return this.f144102q;
    }

    /* renamed from: p */
    public final int mo198067p() {
        return this.f144103r;
    }

    /* renamed from: q */
    public final int mo198068q() {
        return this.f144104s;
    }

    /* renamed from: r */
    public final int mo198069r() {
        return this.f144105t;
    }

    /* renamed from: s */
    public final boolean mo198070s() {
        return this.f144106u;
    }

    private SpannableStringExtraParams(Builder aVar) {
        this.f144086a = aVar.mo198075a();
        this.f144087b = aVar.mo198080b();
        this.f144088c = aVar.mo198083c();
        this.f144089d = aVar.mo198085d();
        this.f144090e = aVar.mo198089f();
        this.f144091f = aVar.mo198091g();
        this.f144092g = aVar.mo198093h();
        this.f144093h = aVar.mo198087e();
        this.f144094i = aVar.mo198094i();
        this.f144095j = aVar.mo198095j();
        this.f144096k = aVar.mo198096k();
        this.f144097l = aVar.mo198098m();
        this.f144099n = aVar.mo198099n();
        this.f144100o = aVar.mo198100o();
        this.f144101p = aVar.mo198101p();
        this.f144102q = aVar.mo198102q();
        this.f144103r = aVar.mo198103r();
        this.f144104s = aVar.mo198104s();
        this.f144105t = aVar.mo198105t();
        this.f144098m = aVar.mo198106u();
        this.f144106u = aVar.mo198097l();
    }

    public /* synthetic */ SpannableStringExtraParams(Builder aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}
