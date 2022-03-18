package com.ss.android.lark.inv.export.util;

import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.lark.pb.onboarding.v1.ButtonElementData;
import com.bytedance.lark.pb.onboarding.v1.Element;
import com.bytedance.lark.pb.onboarding.v1.GetDynamicFlowStepResponse;
import com.bytedance.lark.pb.onboarding.v1.PictureElementData;
import com.bytedance.lark.pb.onboarding.v1.Slot;
import com.bytedance.lark.pb.onboarding.v1.TextElementData;
import com.bytedance.lark.pb.onboarding.v1.VideoElementData;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.inv.export.util.n */
public class C40120n {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.inv.export.util.n$a */
    public static class C40123a implements JsonDeserializer<Element> {
        C40123a() {
        }

        /* renamed from: a */
        public Element deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Element.C18576a aVar = new Element.C18576a();
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            aVar.mo64050a(asJsonObject.get("id").getAsString());
            aVar.mo64046a(Element.ElementType.fromValue(asJsonObject.get(ShareHitPoint.f121869d).getAsInt()));
            JsonObject asJsonObject2 = asJsonObject.get("element_data").getAsJsonObject();
            if (aVar.f46073b.equals(Element.ElementType.TEXT)) {
                aVar.mo64048a(new TextElementData.C18622a().mo64156a(asJsonObject2.get("text").getAsString()).mo64155a(TextElementData.TextType.fromValue(asJsonObject2.get("text_type").getAsInt())).build());
            } else if (aVar.f46073b.equals(Element.ElementType.PICTURE)) {
                aVar.mo64047a(new PictureElementData.C18602a().mo64108a(asJsonObject2.get("image_data").getAsString()).mo64107a(PictureElementData.ImageType.fromValue(asJsonObject2.get("image_type").getAsInt())).build());
            } else if (aVar.f46073b.equals(Element.ElementType.VIDEO)) {
                aVar.mo64049a(new VideoElementData.C18630a().mo64173a(asJsonObject2.get("video_url").getAsString()).build());
            } else if (aVar.f46073b.equals(Element.ElementType.BUTTON)) {
                aVar.mo64044a(new ButtonElementData.C18570a().mo64031a(asJsonObject2.get("text").getAsString()).build());
            }
            return aVar.build();
        }
    }

    /* renamed from: a */
    public static GetDynamicFlowStepResponse m159078a(String str) {
        String d = m159086d(str);
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        return (GetDynamicFlowStepResponse) m159080a(d, GetDynamicFlowStepResponse.class);
    }

    /* renamed from: b */
    private static int m159083b(String str) {
        return aj.m224263a().getResources().getIdentifier(str, "string", aj.m224263a().getPackageName());
    }

    /* renamed from: c */
    private static CharSequence m159085c(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    /* renamed from: d */
    private static String m159086d(String str) {
        try {
            return m159081a(aj.m224263a().getAssets().open(str));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static String m159081a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return "";
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
        }
        String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
        try {
            inputStream.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return byteArrayOutputStream2;
    }

    /* renamed from: a */
    public static CharSequence m159079a(TextElementData textElementData, Pair<String, String>... pairArr) {
        if (textElementData == null) {
            return "";
        }
        if (TextElementData.TextType.PLAIN.equals(textElementData.text_type)) {
            return m159084b(textElementData, pairArr);
        }
        if (TextElementData.TextType.HTML.equals(textElementData.text_type)) {
            return m159085c(m159085c(m159084b(textElementData, pairArr)).toString());
        }
        return textElementData.text;
    }

    /* renamed from: b */
    private static String m159084b(TextElementData textElementData, Pair<String, String>[] pairArr) {
        int b = m159083b(textElementData.text);
        if (b == 0) {
            return textElementData.text;
        }
        if (pairArr == null || pairArr.length <= 0) {
            return UIHelper.mustacheFormat(UIHelper.getString(b));
        }
        HashMap hashMap = new HashMap();
        for (Pair<String, String> pair : pairArr) {
            hashMap.put(pair.first, pair.second);
        }
        return UIHelper.mustacheFormat(UIHelper.getString(b), hashMap);
    }

    /* renamed from: a */
    private static <T> T m159080a(String str, Class<T> cls) {
        return (T) new GsonBuilder().serializeNulls().disableHtmlEscaping().registerTypeAdapter(Element.class, new C40123a()).create().fromJson(str, (Class) cls);
    }

    /* renamed from: a */
    public static void m159082a(final String str, final ApiUtils.AbstractC57748a<GetDynamicFlowStepResponse> aVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.inv.export.util.C40120n.RunnableC401211 */

            public void run() {
                final GetDynamicFlowStepResponse a = C40120n.m159078a(str);
                ViewUtils.m224148a(new Runnable() {
                    /* class com.ss.android.lark.inv.export.util.C40120n.RunnableC401211.RunnableC401221 */

                    public void run() {
                        aVar.consume(a);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public static Element m159077a(GetDynamicFlowStepResponse getDynamicFlowStepResponse, String str, Element.ElementType elementType) {
        Slot slot;
        if (getDynamicFlowStepResponse == null || (slot = getDynamicFlowStepResponse.step.slots.get(str)) == null || TextUtils.isEmpty(slot.element_id)) {
            return null;
        }
        Element element = getDynamicFlowStepResponse.elements.get(slot.element_id);
        if (elementType == null) {
            return element;
        }
        if (element == null) {
            return null;
        }
        if (element.type.ordinal() == elementType.ordinal()) {
            return element;
        }
        Log.m165383e("InvitationModule", "Element type is <" + element.type + ">, not <" + elementType + ">");
        return null;
    }
}
