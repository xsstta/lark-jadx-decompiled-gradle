package com.ss.android.lark.invitation.v2.feat.member.welcome.util;

import android.app.Application;
import android.content.res.AssetManager;
import com.alibaba.fastjson.JSONArray;
import com.ss.android.lark.inv.export.dependency.IInvitationModuleDependency;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.welcome.dto.GroupScale;
import com.ss.android.lark.invitation.v2.feat.member.welcome.dto.IndustryInfo;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.p3493a.C69753g;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nH\u0007J\u000e\u0010\u000e\u001a\u00020\u0004*\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/welcome/util/JSONAssetParser;", "", "()V", "EN_TAG", "", "TAG", "locale", "getLocale", "()Ljava/lang/String;", "parseGroupScale", "", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/dto/GroupScale;", "parseIndustry", "Lcom/ss/android/lark/invitation/v2/feat/member/welcome/dto/IndustryInfo;", "getTag", "Ljava/util/Locale;", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.member.welcome.a.a */
public final class JSONAssetParser {

    /* renamed from: a */
    public static final JSONAssetParser f102896a = new JSONAssetParser();

    private JSONAssetParser() {
    }

    /* renamed from: c */
    private final String m160295c() {
        IInvitationModuleDependency a = C40147z.m159160a();
        Intrinsics.checkExpressionValueIsNotNull(a, "InvUtils.getDep()");
        return m160292a(a.getLocale());
    }

    @JvmStatic
    /* renamed from: b */
    public static final List<GroupScale> m160294b() {
        try {
            Application application = LarkContext.getApplication();
            Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
            AssetManager assets = application.getAssets();
            InputStream open = assets.open("scale/" + f102896a.m160295c() + ".json");
            Intrinsics.checkExpressionValueIsNotNull(open, "LarkContext.getApplicati…pen(\"scale/$locale.json\")");
            byte[] a = C69753g.m267725a(open);
            Intrinsics.checkExpressionValueIsNotNull(a, "IOUtils.toByteArray(inputStream)");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkExpressionValueIsNotNull(charset, "StandardCharsets.UTF_8");
            String str = new String(a, charset);
            open.close();
            return JSONArray.parseArray(str, GroupScale.class);
        } catch (Exception e) {
            Log.m165384e("JSONAssetParser", "parseGroupScale error", e);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<IndustryInfo> m160293a() {
        try {
            Application application = LarkContext.getApplication();
            Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
            AssetManager assets = application.getAssets();
            InputStream open = assets.open("industry/" + f102896a.m160295c() + ".json");
            Intrinsics.checkExpressionValueIsNotNull(open, "LarkContext.getApplicati…(\"industry/$locale.json\")");
            byte[] a = C69753g.m267725a(open);
            Intrinsics.checkExpressionValueIsNotNull(a, "IOUtils.toByteArray(inputStream)");
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkExpressionValueIsNotNull(charset, "StandardCharsets.UTF_8");
            String str = new String(a, charset);
            open.close();
            return JSONArray.parseArray(str, IndustryInfo.class);
        } catch (Exception e) {
            Log.m165384e("JSONAssetParser", "parseIndustry error", e);
            return null;
        }
    }

    /* renamed from: a */
    private final String m160292a(Locale locale) {
        if (locale == null) {
            return "en-US";
        }
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language, "language");
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.ROOT");
        if (language != null) {
            String lowerCase = language.toLowerCase(locale2);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append('-');
            String country = locale.getCountry();
            Intrinsics.checkExpressionValueIsNotNull(country, "country");
            Locale locale3 = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale3, "Locale.ROOT");
            if (country != null) {
                String upperCase = country.toUpperCase(locale3);
                Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                sb.append(upperCase);
                return sb.toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
