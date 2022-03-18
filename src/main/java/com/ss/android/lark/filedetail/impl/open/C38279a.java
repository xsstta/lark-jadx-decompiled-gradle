package com.ss.android.lark.filedetail.impl.open;

import android.content.Context;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.filedetail.impl.open.audio.OpenAudioFileActivity;
import com.ss.android.lark.filedetail.impl.open.textfile.OpenTextFileActivity;
import com.ss.android.lark.utils.C57881t;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.filedetail.impl.open.a */
public class C38279a {

    /* renamed from: a */
    private static final HashMap<String, AbstractC38283c> f98311a = new HashMap<String, AbstractC38283c>() {
        /* class com.ss.android.lark.filedetail.impl.open.C38279a.C382801 */

        {
            put("text/plain", new C38284d());
            put("audio/mpeg", new C38281a());
            put("audio/x-mpeg", new C38281a());
            put("audio/x-wav", new C38281a());
            put("audio/wav", new C38281a());
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.filedetail.impl.open.a$b */
    public static final class C38282b {

        /* renamed from: a */
        public static final C38279a f98312a = new C38279a();
    }

    /* renamed from: com.ss.android.lark.filedetail.impl.open.a$c */
    public interface AbstractC38283c {
        /* renamed from: a */
        void mo140047a(Context context, OpenFileParams openFileParams);
    }

    /* renamed from: com.ss.android.lark.filedetail.impl.open.a$a */
    private static class C38281a implements AbstractC38283c {
        private C38281a() {
        }

        @Override // com.ss.android.lark.filedetail.impl.open.C38279a.AbstractC38283c
        /* renamed from: a */
        public void mo140047a(Context context, OpenFileParams openFileParams) {
            OpenAudioFileActivity.m150673a(context, openFileParams);
        }
    }

    /* renamed from: com.ss.android.lark.filedetail.impl.open.a$d */
    private static class C38284d implements AbstractC38283c {
        private C38284d() {
        }

        @Override // com.ss.android.lark.filedetail.impl.open.C38279a.AbstractC38283c
        /* renamed from: a */
        public void mo140047a(Context context, OpenFileParams openFileParams) {
            OpenTextFileActivity.m150766a(context, openFileParams);
        }
    }

    private C38279a() {
    }

    /* renamed from: a */
    public static C38279a m150665a() {
        return C38282b.f98312a;
    }

    /* renamed from: a */
    public boolean mo140046a(FileContent fileContent) {
        if (fileContent == null) {
            return false;
        }
        if (f98311a.get(fileContent.getMime()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo140045a(Context context, FileContent fileContent, OpenFileParams openFileParams) {
        AbstractC38283c cVar;
        if (fileContent == null || !C57881t.m224633e(fileContent.getFilePath(), fileContent.getName()) || (cVar = f98311a.get(fileContent.getMime())) == null) {
            return false;
        }
        cVar.mo140047a(context, openFileParams);
        return true;
    }
}
