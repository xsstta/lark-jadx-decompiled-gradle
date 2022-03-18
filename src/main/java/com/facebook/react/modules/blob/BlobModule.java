package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.C21108a;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.ByteString;

@ReactModule(name = "BlobModule")
public class BlobModule extends ReactContextBaseJavaModule {
    private final Map<String, byte[]> mBlobs = new HashMap();
    private final NetworkingModule.AbstractC21210b mNetworkingRequestBodyHandler = new NetworkingModule.AbstractC21210b() {
        /* class com.facebook.react.modules.blob.BlobModule.C211563 */

        @Override // com.facebook.react.modules.network.NetworkingModule.AbstractC21210b
        /* renamed from: a */
        public boolean mo71913a(ReadableMap readableMap) {
            return readableMap.hasKey("blob");
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.AbstractC21210b
        /* renamed from: a */
        public RequestBody mo71912a(ReadableMap readableMap, String str) {
            if (readableMap.hasKey(ShareHitPoint.f121869d) && !readableMap.getString(ShareHitPoint.f121869d).isEmpty()) {
                str = readableMap.getString(ShareHitPoint.f121869d);
            }
            if (str == null) {
                str = "application/octet-stream";
            }
            ReadableMap map = readableMap.getMap("blob");
            return RequestBody.create(MediaType.parse(str), BlobModule.this.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt("size")));
        }
    };
    private final NetworkingModule.AbstractC21211c mNetworkingResponseHandler = new NetworkingModule.AbstractC21211c() {
        /* class com.facebook.react.modules.blob.BlobModule.C211574 */

        @Override // com.facebook.react.modules.network.NetworkingModule.AbstractC21211c
        /* renamed from: a */
        public boolean mo71915a(String str) {
            return "blob".equals(str);
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.AbstractC21211c
        /* renamed from: a */
        public WritableMap mo71914a(ResponseBody responseBody) throws IOException {
            byte[] bytes = responseBody.bytes();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(bytes));
            createMap.putInt("offset", 0);
            createMap.putInt("size", bytes.length);
            return createMap;
        }
    };
    private final NetworkingModule.AbstractC21212d mNetworkingUriHandler = new NetworkingModule.AbstractC21212d() {
        /* class com.facebook.react.modules.blob.BlobModule.C211552 */

        @Override // com.facebook.react.modules.network.NetworkingModule.AbstractC21212d
        /* renamed from: a */
        public WritableMap mo71910a(Uri uri) throws IOException {
            byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(bytesFromUri));
            createMap.putInt("offset", 0);
            createMap.putInt("size", bytesFromUri.length);
            createMap.putString(ShareHitPoint.f121869d, BlobModule.this.getMimeTypeFromUri(uri));
            createMap.putString("name", BlobModule.this.getNameFromUri(uri));
            createMap.putDouble("lastModified", (double) BlobModule.this.getLastModifiedFromUri(uri));
            return createMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.AbstractC21212d
        /* renamed from: a */
        public boolean mo71911a(Uri uri, String str) {
            boolean z;
            String scheme = uri.getScheme();
            if ("http".equals(scheme) || "https".equals(scheme)) {
                z = true;
            } else {
                z = false;
            }
            if (z || !"blob".equals(str)) {
                return false;
            }
            return true;
        }
    };
    private final WebSocketModule.AbstractC21262a mWebSocketContentHandler = new WebSocketModule.AbstractC21262a() {
        /* class com.facebook.react.modules.blob.BlobModule.C211541 */

        @Override // com.facebook.react.modules.websocket.WebSocketModule.AbstractC21262a
        /* renamed from: a */
        public void mo71908a(String str, WritableMap writableMap) {
            writableMap.putString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.AbstractC21262a
        /* renamed from: a */
        public void mo71909a(ByteString byteString, WritableMap writableMap) {
            byte[] byteArray = byteString.toByteArray();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(byteArray));
            createMap.putInt("offset", 0);
            createMap.putInt("size", byteArray.length);
            writableMap.putMap(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, createMap);
            writableMap.putString(ShareHitPoint.f121869d, "blob");
        }
    };

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BlobModule";
    }

    private WebSocketModule getWebSocketModule() {
        return (WebSocketModule) getReactApplicationContext().getNativeModule(WebSocketModule.class);
    }

    @ReactMethod
    public void addNetworkingHandler() {
        NetworkingModule networkingModule = (NetworkingModule) getReactApplicationContext().getNativeModule(NetworkingModule.class);
        networkingModule.addUriHandler(this.mNetworkingUriHandler);
        networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
        networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return null;
        }
        return C21108a.m76728a("BLOB_URI_SCHEME", "content", "BLOB_URI_HOST", resources.getString(identifier));
    }

    @ReactMethod
    public void release(String str) {
        remove(str);
    }

    public void remove(String str) {
        this.mBlobs.remove(str);
    }

    @ReactMethod
    public void addWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, this.mWebSocketContentHandler);
    }

    @ReactMethod
    public void removeWebSocketHandler(int i) {
        getWebSocketModule().setContentHandler(i, null);
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0;
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public byte[] getBytesFromUri(Uri uri) throws IOException {
        InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } else {
            throw new FileNotFoundException("File not found for " + uri);
        }
    }

    public String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        if (type == null) {
            return "";
        }
        return type;
    }

    public byte[] resolve(Uri uri) {
        int i;
        int i2;
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        if (queryParameter != null) {
            i = Integer.parseInt(queryParameter, 10);
        } else {
            i = 0;
        }
        String queryParameter2 = uri.getQueryParameter("size");
        if (queryParameter2 != null) {
            i2 = Integer.parseInt(queryParameter2, 10);
        } else {
            i2 = -1;
        }
        return resolve(lastPathSegment, i, i2);
    }

    public String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor query = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getString(0);
                }
                query.close();
            } finally {
                query.close();
            }
        }
        return uri.getLastPathSegment();
    }

    public void store(byte[] bArr, String str) {
        this.mBlobs.put(str, bArr);
    }

    @ReactMethod
    public void sendOverSocket(ReadableMap readableMap, int i) {
        byte[] resolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve != null) {
            getWebSocketModule().sendBinary(ByteString.of(resolve), i);
        } else {
            getWebSocketModule().sendBinary((ByteString) null, i);
        }
    }

    @ReactMethod
    public void createFromParts(ReadableArray readableArray, String str) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            String string = map.getString(ShareHitPoint.f121869d);
            string.hashCode();
            if (string.equals("string")) {
                byte[] bytes = map.getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getBytes(Charset.forName("UTF-8"));
                i += bytes.length;
                arrayList.add(i2, bytes);
            } else if (!string.equals("blob")) {
                throw new IllegalArgumentException("Invalid type for blob: " + map.getString(ShareHitPoint.f121869d));
            } else {
                ReadableMap map2 = map.getMap(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                i += map2.getInt("size");
                arrayList.add(i2, resolve(map2));
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put((byte[]) it.next());
        }
        store(allocate.array(), str);
    }

    public byte[] resolve(String str, int i, int i2) {
        byte[] bArr = this.mBlobs.get(str);
        if (bArr == null) {
            return null;
        }
        if (i2 == -1) {
            i2 = bArr.length - i;
        }
        if (i > 0 || i2 != bArr.length) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
        return bArr;
    }
}
