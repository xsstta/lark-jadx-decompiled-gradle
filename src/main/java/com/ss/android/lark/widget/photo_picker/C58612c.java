package com.ss.android.lark.widget.photo_picker;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.ImageFormat;
import com.ss.android.lark.widget.photo_picker.entity.FileState;
import java.io.File;
import okio.ByteString;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.widget.photo_picker.c */
public class C58612c {

    /* renamed from: a */
    static volatile AbstractC58615c f144747a;

    /* renamed from: com.ss.android.lark.widget.photo_picker.c$a */
    public interface AbstractC58613a {
        /* renamed from: a */
        void mo198630a(File file);

        /* renamed from: a */
        void mo198631a(Exception exc);
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.c$b */
    public interface AbstractC58614b {
        /* renamed from: a */
        File mo102871a(File file, boolean z) throws Exception;

        /* renamed from: a */
        void mo102872a(File file, boolean z, AbstractC58613a aVar);

        /* renamed from: a */
        boolean mo102873a();
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.c$c */
    public interface AbstractC58615c {
        /* renamed from: a */
        Context mo102826a();

        /* renamed from: a */
        File mo102827a(IRequestCreator iRequestCreator, String str, String str2, String str3, boolean z, int i);

        /* renamed from: a */
        File mo102828a(IRequestCreator iRequestCreator, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, int i2, ImageFormat imageFormat, int i3, boolean z4);

        /* renamed from: a */
        File mo102829a(IRequestCreator iRequestCreator, String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, boolean z4);

        /* renamed from: a */
        String mo102830a(int i);

        /* renamed from: a */
        String mo102831a(Bitmap bitmap);

        /* renamed from: a */
        ByteString mo102832a(ImageSet imageSet);

        /* renamed from: a */
        void mo102833a(Context context, int i);

        /* renamed from: a */
        void mo102834a(Context context, int i, DialogInterface.OnDismissListener onDismissListener);

        /* renamed from: a */
        void mo102835a(Context context, Fragment fragment, int i, String str, String str2);

        /* renamed from: a */
        void mo102837a(Context context, Fragment fragment, int i, String str, String str2, boolean z, boolean z2, String str3);

        /* renamed from: a */
        void mo102838a(Context context, ImageContent imageContent);

        /* renamed from: a */
        void mo102839a(Context context, String str, DialogInterface.OnDismissListener onDismissListener);

        /* renamed from: a */
        void mo102840a(Context context, String str, StickerContent stickerContent);

        /* renamed from: a */
        void mo102841a(Context context, boolean z, DialogInterface.OnDismissListener onDismissListener);

        /* renamed from: a */
        void mo102842a(MessageIdentity messageIdentity, IGetDataCallback<FileState> iGetDataCallback);

        /* renamed from: a */
        void mo102843a(MessageIdentity messageIdentity, String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo102844a(MessageIdentity messageIdentity, String str, String str2, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);

        /* renamed from: a */
        void mo102845a(AbstractC58616d dVar);

        /* renamed from: a */
        void mo102846a(String str);

        /* renamed from: a */
        void mo102847a(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo102848a(String str, JSONObject jSONObject);

        /* renamed from: a */
        boolean mo102849a(String str, boolean z);

        /* renamed from: b */
        File mo102850b(IRequestCreator iRequestCreator, String str, String str2, String str3, boolean z, int i);

        /* renamed from: b */
        String mo102851b();

        /* renamed from: b */
        void mo102852b(Context context, Fragment fragment, int i, String str, String str2, boolean z, boolean z2, String str3);

        /* renamed from: b */
        void mo102853b(AbstractC58616d dVar);

        /* renamed from: b */
        boolean mo102854b(String str);

        /* renamed from: b */
        boolean mo102855b(String str, boolean z);

        /* renamed from: c */
        Message mo102856c(String str);

        /* renamed from: c */
        boolean mo102857c();

        /* renamed from: d */
        String mo102858d(String str);

        /* renamed from: d */
        boolean mo102859d();

        /* renamed from: e */
        void mo102860e(String str);

        /* renamed from: e */
        boolean mo102861e();

        /* renamed from: f */
        void mo102862f(String str);

        /* renamed from: f */
        boolean mo102863f();

        /* renamed from: g */
        boolean mo102864g();

        /* renamed from: h */
        void mo102865h();

        /* renamed from: i */
        boolean mo102866i();

        /* renamed from: j */
        boolean mo102867j();

        /* renamed from: k */
        int mo102868k();

        /* renamed from: l */
        AbstractC58614b mo102869l();
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.c$d */
    public interface AbstractC58616d {
        /* renamed from: a */
        void mo198632a(String str, int i, long j, long j2);
    }

    /* renamed from: a */
    public static AbstractC58615c m227290a() {
        return f144747a;
    }

    /* renamed from: a */
    public static void m227291a(AbstractC58615c cVar) {
        f144747a = cVar;
    }
}
