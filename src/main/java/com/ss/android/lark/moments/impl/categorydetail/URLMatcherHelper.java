package com.ss.android.lark.moments.impl.categorydetail;

import com.ss.android.lark.widget.span.UrlInfo;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/categorydetail/URLMatcherHelper;", "", "()V", "PATTERN_STR", "", "pattern", "Ljava/util/regex/Pattern;", "getPattern", "()Ljava/util/regex/Pattern;", "pattern$delegate", "Lkotlin/Lazy;", "parseUrlSpan", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/widget/span/UrlInfo;", "Lkotlin/collections/ArrayList;", "description", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.categorydetail.l */
public final class URLMatcherHelper {

    /* renamed from: a */
    public static final URLMatcherHelper f119187a = new URLMatcherHelper();

    /* renamed from: b */
    private static final Lazy f119188b = LazyKt.lazy(C47254a.INSTANCE);

    /* renamed from: a */
    private final Pattern m187147a() {
        return (Pattern) f119188b.getValue();
    }

    private URLMatcherHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.categorydetail.l$a */
    static final class C47254a extends Lambda implements Function0<Pattern> {
        public static final C47254a INSTANCE = new C47254a();

        C47254a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Pattern invoke() {
            return Pattern.compile("((http|https|ftp|ftps)://([A-Za-z0-9_][-[A-Za-z0-9_]~.]{0,30}(:[A-Za-z0-9_][-[A-Za-z0-9_]~.!$*+]{0,50})?@)?(([-[A-Za-z0-9_]~]){1,30}\\.){1,5}[a-z]{2,15}|(([-[A-Za-z0-9_]~])+\\.){1,5}(zw|zm|za|yt|ye|xyz|xxx|xin|wtf|ws|work|wf|wang|vu|vn|vip|vi|vg|ve|vc|va|uz|uy|us|um|uk|ug|ua|tz|tw|tv|tt|tr|tp|top|to|tn|tm|tl|tk|tj|th|tg|tf|td|tc|sz|sy|sx|sv|su|st|ss|sr|so|sn|sm|sl|sk|sj|site|si|shop|sh|sg|se|sd|sc|sb|sa|rw|ru|rs|ro|red|re|qa|py|pw|pt|ps|pro|pr|pn|pm|pl|pk|ph|pg|pf|pe|pa|org|one|om|nz|nu|nr|np|no|nl|ni|ng|nf|net|ne|nc|name|na|mz|my|mx|mw|mv|mu|mt|ms|mr|mq|mp|mobi|mo|mn|mm|ml|mk|mil|mh|mg|mf|me|md|mc|ma|ly|lv|lu|ltd|lt|ls|lr|lk|link|li|lc|lb|land|la|kz|ky|kw|kr|kp|kn|km|kim|ki|kh|kg|ke|jp|jo|jm|it|is|ir|iq|io|int|ink|info|in|im|il|ie|id|hu|ht|hr|hn|hm|hk|help|gy|gw|gu|gt|gs|group|gr|gp|gov|gn|gm|gl|gi|gh|gf|ge|gd|gb|ga|fr|fo|fm|fk|fj|fi|eu|et|es|er|engineering|eh|eg|ee|edu|ec|dz|do|dm|dk|dj|de|cz|cy|cx|cw|cv|cu|cr|com|co|cn|cm|club|cloud|cl|ck|ci|ch|cg|cf|cc|ca|bz|by|bw|bv|bt|bs|br|bo|bn|bm|bj|biz|bi|bh|bg|bf|be|bd|bb|ba|az|ax|aw|au|at|as|ar|aq|ao|an|am|al|ai|ag|af|ae|ad|ac))(:[1-9]\\d{1,4})?(/[-[A-Za-z0-9_].~:\\[\\]@!%$()*+,;=]{1,500})*/?(\\?([[A-Za-z0-9_]%]{1,100}(=[[A-Za-z0-9_]\\-_.~:/\\[\\]()'*+,;%]{0,1000})?&?)*)?(#([-[A-Za-z0-9_].~:@$()+=&]{0,100}))?", 2);
        }
    }

    /* renamed from: a */
    public final ArrayList<UrlInfo> mo166087a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "description");
        ArrayList<UrlInfo> arrayList = new ArrayList<>();
        Matcher matcher = m187147a().matcher(str);
        while (matcher.find()) {
            UrlInfo urlInfo = new UrlInfo();
            urlInfo.start = matcher.start();
            urlInfo.end = matcher.end();
            urlInfo.text = matcher.group();
            urlInfo.href = matcher.group();
            urlInfo.type = 1;
            arrayList.add(urlInfo);
        }
        return arrayList;
    }
}
