package com.ss.android.lark.optrace.extension.clientduration;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.extension.TracingExtension;
import com.ss.android.lark.optrace.p2413c.C48936b;
import java.util.HashMap;
import java.util.Map;

public class TracingClientDurationExtensionImpl extends TracingClientDurationExtension implements Parcelable {
    public static final Parcelable.Creator<TracingClientDurationExtensionImpl> CREATOR = new Parcelable.Creator<TracingClientDurationExtensionImpl>() {
        /* class com.ss.android.lark.optrace.extension.clientduration.TracingClientDurationExtensionImpl.C489421 */

        /* renamed from: a */
        public TracingClientDurationExtensionImpl[] newArray(int i) {
            return new TracingClientDurationExtensionImpl[i];
        }

        /* renamed from: a */
        public TracingClientDurationExtensionImpl createFromParcel(Parcel parcel) {
            return new TracingClientDurationExtensionImpl(parcel);
        }
    };

    public int describeContents() {
        return 0;
    }

    public TracingClientDurationExtensionImpl() {
    }

    @Override // com.ss.android.lark.optrace.extension.clientduration.TracingClientDurationExtension
    public void endAll() {
        if (this.eventStartMap != null) {
            for (String str : this.eventStartMap.keySet()) {
                Log.m165379d("TracingClientDurationEx", "end key:" + str);
                end(str);
            }
        }
    }

    protected TracingClientDurationExtensionImpl(Parcel parcel) {
        this.eventStartMap = new HashMap();
        parcel.readMap(this.eventStartMap, getClass().getClassLoader());
    }

    @Override // com.ss.android.lark.optrace.extension.clientduration.TracingClientDurationExtension
    public long duration(String str) {
        TracingClientDurationEvent tracingClientDurationEvent = (TracingClientDurationEvent) this.eventStartMap.get(str);
        if (tracingClientDurationEvent != null) {
            return tracingClientDurationEvent.duration();
        }
        String str2 = "this key not start! key=" + str;
        Log.m165389i("TracingClientDurationEx", str2);
        C48936b.m192783a(str2);
        return -1;
    }

    @Override // com.ss.android.lark.optrace.extension.clientduration.TracingClientDurationExtension
    public void start(String str) {
        if (this.eventStartMap.containsKey(str)) {
            String str2 = "this key has already started! key = " + str;
            Log.m165397w("TracingClientDurationEx", str2);
            C48936b.m192783a(str2);
            return;
        }
        this.eventStartMap.put(str, new TracingClientDurationEvent());
    }

    @Override // com.ss.android.lark.optrace.extension.clientduration.TracingClientDurationExtension
    public long end(String str) {
        TracingClientDurationEvent tracingClientDurationEvent = (TracingClientDurationEvent) this.eventStartMap.get(str);
        if (tracingClientDurationEvent == null) {
            String str2 = "this key not start! key=" + str;
            Log.m165389i("TracingClientDurationEx", str2);
            C48936b.m192783a(str2);
            return -1;
        }
        if (tracingClientDurationEvent.isFinished()) {
            Log.m165389i("TracingClientDurationEx", "this key finished! key=" + str);
        } else {
            tracingClientDurationEvent.finish();
        }
        return tracingClientDurationEvent.duration();
    }

    @Override // com.ss.android.lark.optrace.extension.TracingExtension
    public TracingExtension mergeExtension(TracingExtension tracingExtension) {
        if (tracingExtension == null) {
            Log.m165383e("TracingClientDurationEx", "linkExtension is Null !!!");
            return this;
        } else if (!(tracingExtension instanceof TracingClientDurationExtension)) {
            Log.m165383e("TracingClientDurationEx", "linkExtension is not clientDurationExtension !!!");
            return this;
        } else {
            Map<String, TracingClientDurationEvent> map = ((TracingClientDurationExtension) tracingExtension).eventStartMap;
            if (map.isEmpty()) {
                Log.m165389i("TracingClientDurationEx", "link client duration extension eventStartMap is empty!!");
                return this;
            }
            for (String str : map.keySet()) {
                TracingClientDurationEvent tracingClientDurationEvent = map.get(str);
                if (tracingClientDurationEvent == null) {
                    Log.m165383e("TracingClientDurationEx", "linkClientDurationEvent is null, key =" + str);
                } else if (tracingClientDurationEvent.isFinished()) {
                    Log.m165379d("TracingClientDurationEx", "this key finished, key = " + str);
                } else {
                    TracingClientDurationEvent tracingClientDurationEvent2 = (TracingClientDurationEvent) this.eventStartMap.get(str);
                    if (tracingClientDurationEvent2 == null) {
                        this.eventStartMap.put(str, tracingClientDurationEvent);
                        Log.m165397w("TracingClientDurationEx", "add event key = " + str + " linkClientDurationEvent:" + tracingClientDurationEvent.toString());
                    } else if (!tracingClientDurationEvent2.isFinished()) {
                        String str2 = "duplicate key =" + str + " not finished!";
                        Log.m165383e("TracingClientDurationEx", str2);
                        C48936b.m192783a(str2);
                    } else {
                        Log.m165389i("TracingClientDurationEx", "duplicate key = " + str + " finished, not merge!");
                    }
                }
            }
            return this;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.eventStartMap);
    }
}
