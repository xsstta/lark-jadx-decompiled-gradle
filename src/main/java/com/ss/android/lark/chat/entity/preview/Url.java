package com.ss.android.lark.chat.entity.preview;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u001e\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Url;", "Ljava/io/Serializable;", "Lcom/larksuite/framework/utils/diff/Diffable;", "url", "", "iosUrl", "androidUrl", "pcUrl", "webUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidUrl", "()Ljava/lang/String;", "getIosUrl", "getPcUrl", "getUrl", "getWebUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "isContentSame", "diffable", "isItemSame", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Url implements AbstractC26248b<Url>, Serializable {
    private final String androidUrl;
    private final String iosUrl;
    private final String pcUrl;
    private final String url;
    private final String webUrl;

    public static /* synthetic */ Url copy$default(Url url2, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = url2.url;
        }
        if ((i & 2) != 0) {
            str2 = url2.iosUrl;
        }
        if ((i & 4) != 0) {
            str3 = url2.androidUrl;
        }
        if ((i & 8) != 0) {
            str4 = url2.pcUrl;
        }
        if ((i & 16) != 0) {
            str5 = url2.webUrl;
        }
        return url2.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.iosUrl;
    }

    public final String component3() {
        return this.androidUrl;
    }

    public final String component4() {
        return this.pcUrl;
    }

    public final String component5() {
        return this.webUrl;
    }

    public final Url copy(String str, String str2, String str3, String str4, String str5) {
        return new Url(str, str2, str3, str4, str5);
    }

    public String toString() {
        return "Url(url=" + this.url + ", iosUrl=" + this.iosUrl + ", androidUrl=" + this.androidUrl + ", pcUrl=" + this.pcUrl + ", webUrl=" + this.webUrl + ")";
    }

    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    public final String getIosUrl() {
        return this.iosUrl;
    }

    public final String getPcUrl() {
        return this.pcUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.url;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.iosUrl;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.androidUrl;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.pcUrl;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.webUrl;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }

    public boolean isContentSame(Url url2) {
        return equals(url2);
    }

    public boolean isItemSame(Url url2) {
        return equals(url2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Url)) {
            return false;
        }
        Url url2 = (Url) obj;
        if (!(!Intrinsics.areEqual(this.url, url2.url)) && !(!Intrinsics.areEqual(this.iosUrl, url2.iosUrl)) && !(!Intrinsics.areEqual(this.androidUrl, url2.androidUrl)) && !(!Intrinsics.areEqual(this.pcUrl, url2.pcUrl)) && !(!Intrinsics.areEqual(this.webUrl, url2.webUrl))) {
            return true;
        }
        return false;
    }

    public Url(String str, String str2, String str3, String str4, String str5) {
        this.url = str;
        this.iosUrl = str2;
        this.androidUrl = str3;
        this.pcUrl = str4;
        this.webUrl = str5;
    }
}
