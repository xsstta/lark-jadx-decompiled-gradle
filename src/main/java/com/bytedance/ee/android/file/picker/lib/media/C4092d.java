package com.bytedance.ee.android.file.picker.lib.media;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.loader.content.C1198c;
import androidx.loader.p045a.AbstractC1181a;
import com.bytedance.ee.android.file.picker.lib.dependency.C4048c;
import com.bytedance.ee.android.file.picker.lib.media.C4092d;
import com.bytedance.ee.android.file.picker.lib.utils.FileUtils;
import com.bytedance.ee.android.file.picker.lib.utils.ThreadPool;
import com.bytedance.ee.android.file.picker.lib.utils.UIExecutor;
import com.larksuite.framework.utils.LarkUriUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.bytedance.ee.android.file.picker.lib.media.d */
public class C4092d {

    /* renamed from: com.bytedance.ee.android.file.picker.lib.media.d$b */
    public interface AbstractC4094b {
        /* renamed from: a */
        void mo15980a(List<BaseFileEntry> list);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.media.d$a */
    public static class CallableC4093a implements Callable<Object> {

        /* renamed from: a */
        private final WeakReference<Context> f12410a;

        /* renamed from: b */
        private WeakReference<Cursor> f12411b;

        /* renamed from: c */
        private AbstractC4094b f12412c;

        @Override // java.util.concurrent.Callable
        public Object call() {
            long j;
            Object obj = new Object();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            Cursor cursor = this.f12411b.get();
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            if (mo16032a(cursor) || cursor.getCount() <= 0) {
                m17052a(arrayList);
                return obj;
            }
            try {
                cursor.moveToFirst();
                do {
                    try {
                        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        Context context = this.f12410a.get();
                        if (context != null) {
                            j = LarkUriUtil.m95298a(context, cursor, withAppendedId);
                        } else {
                            j = 0;
                        }
                        String a = LarkUriUtil.m95301a(cursor);
                        int i = cursor.getInt(cursor.getColumnIndexOrThrow("duration"));
                        if (!hashSet.contains(string) || j >= 1) {
                            hashSet.add(string);
                            m17053a(arrayList, a, string, withAppendedId, j, i);
                        }
                        if (mo16032a(cursor)) {
                            break;
                        }
                    } catch (Exception e) {
                        C4048c.m16854a("onLoadFinished error " + e);
                        return obj;
                    }
                } while (cursor.moveToNext());
                Log.m165389i("VideoMediaHelper", "" + (System.currentTimeMillis() - valueOf.longValue()));
                m17052a(arrayList);
                return obj;
            } catch (Exception e2) {
                C4048c.m16854a("onLoadFinished error " + e2);
                return obj;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m17054b(List list) {
            this.f12412c.mo15980a(list);
        }

        /* renamed from: a */
        private void m17052a(List<BaseFileEntry> list) {
            if (this.f12412c != null) {
                UIExecutor.f12485a.mo16120a(new Runnable(list) {
                    /* class com.bytedance.ee.android.file.picker.lib.media.$$Lambda$d$a$eCElPjyJyhwFIM_hC5skFnNOTfo */
                    public final /* synthetic */ List f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C4092d.CallableC4093a.this.m17054b(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        public boolean mo16032a(Cursor cursor) {
            if (cursor == null || cursor.isClosed()) {
                return true;
            }
            return false;
        }

        public CallableC4093a(WeakReference<Context> weakReference, Cursor cursor, AbstractC4094b bVar) {
            this.f12410a = weakReference;
            this.f12411b = new WeakReference<>(cursor);
            this.f12412c = bVar;
        }

        /* renamed from: a */
        private void m17053a(List<BaseFileEntry> list, String str, String str2, Uri uri, long j, int i) {
            VideoEntry videoEntry = new VideoEntry();
            videoEntry.setUri(uri);
            videoEntry.setPath(str2);
            videoEntry.setSize(j);
            videoEntry.setName(str);
            videoEntry.setThumbPath(C4092d.m17050a(this.f12410a.get(), str));
            videoEntry.setDuration(i);
            list.add(videoEntry);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.android.file.picker.lib.media.d$c */
    public static class C4095c implements AbstractC1181a.AbstractC1182a<Cursor> {

        /* renamed from: a */
        public AbstractC4094b f12413a;

        /* renamed from: b */
        private final WeakReference<Context> f12414b;

        /* renamed from: c */
        private Future<Object> f12415c;

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public void mo6054a(C1198c<Cursor> cVar) {
            Future<Object> future = this.f12415c;
            if (future != null) {
                future.cancel(true);
                this.f12415c = null;
            }
        }

        public C4095c(Context context, AbstractC4094b bVar) {
            this.f12413a = bVar;
            this.f12414b = new WeakReference<>(context);
        }

        @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
        /* renamed from: a */
        public C1198c<Cursor> mo6053a(int i, Bundle bundle) {
            Context context = this.f12414b.get();
            if (context != null) {
                return new C4097e(context);
            }
            C4048c.m16854a("context is null before create Loader");
            return null;
        }

        /* renamed from: a */
        public void mo6055a(C1198c<Cursor> cVar, Cursor cursor) {
            if (cursor != null) {
                this.f12415c = ThreadPool.f12482a.mo16118a(new CallableC4093a(this.f12414b, cursor, this.f12413a));
            } else if (this.f12413a != null) {
                UIExecutor.f12485a.mo16120a(new Runnable() {
                    /* class com.bytedance.ee.android.file.picker.lib.media.C4092d.C4095c.RunnableC40961 */

                    public void run() {
                        C4095c.this.f12413a.mo15980a(null);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static String m17050a(Context context, String str) {
        return FileUtils.f12473a.mo16105a(context) + ("video_thumb_" + Math.abs(str.hashCode()));
    }

    /* renamed from: a */
    public static void m17051a(Context context, AbstractC1181a aVar, AbstractC4094b bVar) {
        aVar.mo6046a(R.id.file_picker_loader_video, new Bundle(), new C4095c(context, bVar));
    }
}
