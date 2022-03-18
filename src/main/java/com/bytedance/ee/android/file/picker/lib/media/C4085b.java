package com.bytedance.ee.android.file.picker.lib.media;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.loader.content.C1198c;
import androidx.loader.p045a.AbstractC1181a;
import com.bytedance.ee.android.file.picker.lib.dependency.C4048c;
import com.bytedance.ee.android.file.picker.lib.media.C4085b;
import com.bytedance.ee.android.file.picker.lib.utils.C4118c;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import com.bytedance.ee.android.file.picker.lib.utils.ThreadPool;
import com.bytedance.ee.android.file.picker.lib.utils.UIExecutor;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: com.bytedance.ee.android.file.picker.lib.media.b */
public class C4085b {

    /* renamed from: a */
    public static final String[] f12397a = {"%.doc", "%.docx", "%.xls", "%.xlsx", "%.ppt", "%.pptx", "%.pdf"};

    /* renamed from: b */
    private static final int[] f12398b = {R.id.file_picker_loader_doc, R.id.file_picker_loader_docx, R.id.file_picker_loader_xls, R.id.file_picker_loader_xlsx, R.id.file_picker_loader_ppt, R.id.file_picker_loader_pptx, R.id.file_picker_loader_pdf};

    /* renamed from: com.bytedance.ee.android.file.picker.lib.media.b$c */
    public interface AbstractC4090c {
        /* renamed from: a */
        void mo15981a(List<BaseFileEntry> list, String str, int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.media.b$a */
    public static class CallableC4086a implements Callable<Object> {

        /* renamed from: a */
        public AbstractC4090c f12399a;

        /* renamed from: b */
        public String f12400b;

        /* renamed from: c */
        private final WeakReference<Context> f12401c;

        /* renamed from: d */
        private WeakReference<Cursor> f12402d;

        /* renamed from: a */
        private void m17042a() {
            if (this.f12399a != null) {
                UIExecutor.f12485a.mo16120a(new Runnable() {
                    /* class com.bytedance.ee.android.file.picker.lib.media.C4085b.CallableC4086a.RunnableC40871 */

                    public void run() {
                        CallableC4086a.this.f12399a.mo15981a(new ArrayList(), CallableC4086a.this.f12400b, 1);
                    }
                });
            }
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            Object obj = new Object();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            Cursor cursor = this.f12402d.get();
            if (!mo16027a(cursor) && cursor.getCount() > 0) {
                cursor.moveToFirst();
            }
            while (true) {
                if (mo16027a(cursor)) {
                    break;
                }
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                    long j = cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
                    if (!hashSet.contains(string)) {
                        hashSet.add(string);
                        if (j >= 1) {
                            int docTypeByFilePath = DocEntry.getDocTypeByFilePath(string);
                            if (DocEntry.isDoc(docTypeByFilePath)) {
                                DocEntry docEntry = new DocEntry();
                                docEntry.setUri(ContentUris.withAppendedId(MediaStore.Files.getContentUri("external"), cursor.getLong(cursor.getColumnIndexOrThrow("_id"))));
                                docEntry.setSize(j);
                                docEntry.setName(FileUtils.f12473a.mo16110c(string));
                                docEntry.setDocType(docTypeByFilePath);
                                docEntry.setPath(string);
                                arrayList.add(docEntry);
                            }
                        }
                    }
                } catch (Exception e) {
                    C4048c.m16854a("onLoadFinished error " + e);
                    m17042a();
                    return obj;
                }
            }
            if (mo16027a(this.f12402d.get())) {
                m17042a();
                return obj;
            }
            Context context = this.f12401c.get();
            if (!(context == null || this.f12399a == null)) {
                C4084a.m17034a(context).mo16026a(this.f12400b, arrayList);
                UIExecutor.f12485a.mo16120a(new Runnable(arrayList) {
                    /* class com.bytedance.ee.android.file.picker.lib.media.$$Lambda$b$a$rfsx8EUB1fH_jNDmk39p1DcFJLw */
                    public final /* synthetic */ List f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C4085b.CallableC4086a.this.m17043a((C4085b.CallableC4086a) this.f$1);
                    }
                });
            }
            return obj;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m17043a(List list) {
            this.f12399a.mo15981a(list, this.f12400b, 1);
        }

        /* renamed from: a */
        public boolean mo16027a(Cursor cursor) {
            if (cursor == null || cursor.isClosed()) {
                return true;
            }
            return false;
        }

        public CallableC4086a(WeakReference<Context> weakReference, Cursor cursor, AbstractC4090c cVar, String str) {
            this.f12401c = weakReference;
            this.f12402d = new WeakReference<>(cursor);
            this.f12399a = cVar;
            this.f12400b = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.media.b$b */
    public static class C4088b implements AbstractC1181a.AbstractC1182a<Cursor> {

        /* renamed from: a */
        public String f12404a;

        /* renamed from: b */
        public AbstractC4090c f12405b;

        /* renamed from: c */
        private final WeakReference<Context> f12406c;

        /* renamed from: d */
        private Future<Object> f12407d;

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public void mo6054a(C1198c<Cursor> cVar) {
            Future<Object> future = this.f12407d;
            if (future != null) {
                future.cancel(true);
                this.f12407d = null;
            }
        }

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public C1198c<Cursor> mo6053a(int i, Bundle bundle) {
            Context context = this.f12406c.get();
            if (context != null) {
                return new C4091c(context, this.f12404a);
            }
            C4048c.m16854a("context is null when get doc loader");
            return null;
        }

        /* renamed from: a */
        public void mo6055a(C1198c<Cursor> cVar, Cursor cursor) {
            if (cursor == null) {
                if (this.f12405b != null) {
                    UIExecutor.f12485a.mo16120a(new Runnable() {
                        /* class com.bytedance.ee.android.file.picker.lib.media.C4085b.C4088b.RunnableC40891 */

                        public void run() {
                            C4088b.this.f12405b.mo15981a(new ArrayList(), C4088b.this.f12404a, 1);
                        }
                    });
                }
                if (this.f12406c.get() != null) {
                    C4084a.m17034a(this.f12406c.get()).mo16026a(this.f12404a, new ArrayList());
                    return;
                }
                return;
            }
            this.f12407d = ThreadPool.f12482a.mo16118a(new CallableC4086a(this.f12406c, cursor, this.f12405b, this.f12404a));
        }

        public C4088b(Context context, AbstractC4090c cVar, String str) {
            this.f12406c = new WeakReference<>(context);
            this.f12405b = cVar;
            this.f12404a = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m17038a(Context context, String str) {
        return C4084a.m17034a(context).mo16025a(str);
    }

    /* renamed from: a */
    private static void m17041a(Context context, AbstractC4090c cVar) {
        int i = 0;
        while (true) {
            String[] strArr = f12397a;
            if (i < strArr.length) {
                String str = strArr[i];
                C4118c.m17122a(new Function0(context, str) {
                    /* class com.bytedance.ee.android.file.picker.lib.media.$$Lambda$b$kiXnW7HmOCzkdB2ZZDaJ9nZponk */
                    public final /* synthetic */ Context f$0;
                    public final /* synthetic */ String f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C4085b.m17038a(this.f$0, this.f$1);
                    }
                }, new Function1(str) {
                    /* class com.bytedance.ee.android.file.picker.lib.media.$$Lambda$b$XuuYUUZ7f8MkaMcEXDi5UKbq24 */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4085b.m17039a(C4085b.AbstractC4090c.this, this.f$1, (List) obj);
                    }
                });
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m17039a(AbstractC4090c cVar, String str, List list) {
        if (list != null) {
            cVar.mo15981a(list, str, 0);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public static void m17040a(Context context, AbstractC1181a aVar, AbstractC4090c cVar) {
        int i = 0;
        while (true) {
            String[] strArr = f12397a;
            if (i < strArr.length) {
                aVar.mo6046a(f12398b[i], new Bundle(), new C4088b(context, cVar, strArr[i]));
                i++;
            } else {
                m17041a(context, cVar);
                return;
            }
        }
    }
}
