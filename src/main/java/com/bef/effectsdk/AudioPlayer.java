package com.bef.effectsdk;

import android.media.MediaPlayer;
import android.util.Log;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class AudioPlayer {

    /* renamed from: a */
    public static final String f7075a = "AudioPlayer";

    /* renamed from: b */
    public MediaPlayer f7076b;

    /* renamed from: c */
    public boolean f7077c;

    /* renamed from: d */
    public long f7078d;

    /* renamed from: e */
    private String f7079e;

    public native void nativeOnCompletion(long j);

    public native void nativeOnError(long j, int i, int i2);

    public native void nativeOnInfo(long j, int i, int i2);

    public native void nativeOnPrepared(long j);

    public float getCurrentPlayTime() {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer != null) {
            return ((float) mediaPlayer.getCurrentPosition()) / 1000.0f;
        }
        Log.e(f7075a, "MediaPlayer is null!");
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getTotalPlayTime() {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer != null) {
            return ((float) mediaPlayer.getDuration()) / 1000.0f;
        }
        Log.e(f7075a, "MediaPlayer is null!");
        return BitmapDescriptorFactory.HUE_RED;
    }

    public boolean pause() {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer == null) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else if (!this.f7077c) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else {
            mediaPlayer.pause();
            return true;
        }
    }

    public boolean resume() {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer == null) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else if (!this.f7077c) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else {
            mediaPlayer.start();
            return true;
        }
    }

    public int init() {
        this.f7077c = false;
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f7076b.release();
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.f7076b = mediaPlayer2;
        mediaPlayer2.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            /* class com.bef.effectsdk.AudioPlayer.C20601 */

            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                String str = AudioPlayer.f7075a;
                Log.i(str, "MediaPlayer onInfo: [what, extra] = [" + i + ", " + i2 + "]");
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnInfo(audioPlayer.f7078d, i, i2);
                return false;
            }
        });
        this.f7076b.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            /* class com.bef.effectsdk.AudioPlayer.C20612 */

            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                String str = AudioPlayer.f7075a;
                Log.d(str, "MediaPlayer onError: [what, extra] = [" + i + ", " + i2 + "]");
                try {
                    AudioPlayer.this.f7076b.stop();
                    AudioPlayer.this.f7076b.release();
                } catch (Exception e) {
                    e.printStackTrace();
                    String str2 = AudioPlayer.f7075a;
                    Log.e(str2, "MediaPlayer stop exception on error " + e.toString());
                }
                AudioPlayer.this.f7076b = null;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnError(audioPlayer.f7078d, i, i2);
                return false;
            }
        });
        this.f7076b.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            /* class com.bef.effectsdk.AudioPlayer.C20623 */

            public void onPrepared(MediaPlayer mediaPlayer) {
                Log.i(AudioPlayer.f7075a, "MediaPlayer onPrepared...");
                AudioPlayer.this.f7077c = true;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnPrepared(audioPlayer.f7078d);
            }
        });
        this.f7076b.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            /* class com.bef.effectsdk.AudioPlayer.C20634 */

            public void onCompletion(MediaPlayer mediaPlayer) {
                Log.i(AudioPlayer.f7075a, "MediaPlayer onCompletion...");
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnCompletion(audioPlayer.f7078d);
            }
        });
        return 0;
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer == null) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else if (!this.f7077c) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else {
            try {
                return mediaPlayer.isPlaying();
            } catch (Exception e) {
                e.printStackTrace();
                String str = f7075a;
                Log.e(str, "MediaPlayer isPlaying exception. " + e.toString());
                return false;
            }
        }
    }

    public int release() {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer == null) {
            return 0;
        }
        try {
            mediaPlayer.stop();
            this.f7076b.release();
        } catch (Exception e) {
            e.printStackTrace();
            String str = f7075a;
            Log.e(str, "MediaPlayer stop exception on release " + e.toString());
        }
        this.f7076b = null;
        return 0;
    }

    public void startPlay() {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer != null) {
            try {
                if (!this.f7077c) {
                    mediaPlayer.prepare();
                    this.f7077c = true;
                }
                this.f7076b.start();
            } catch (Exception e) {
                e.printStackTrace();
                String str = f7075a;
                Log.e(str, "MediaPlayer setDataSource exception. " + e.toString());
            }
        }
    }

    public void stopPlay() {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer == null) {
            Log.e(f7075a, "MediaPlayer is null!");
        } else if (this.f7077c) {
            try {
                mediaPlayer.stop();
                this.f7076b.release();
            } catch (Exception e) {
                e.printStackTrace();
                String str = f7075a;
                Log.e(str, "MediaPlayer stop exception on stop " + e.toString());
            }
            this.f7076b = null;
            this.f7077c = false;
        }
    }

    public void setNativePtr(long j) {
        this.f7078d = j;
    }

    public boolean setVolume(float f) {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer == null) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else if (!this.f7077c) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else {
            mediaPlayer.setVolume(f, f);
            return true;
        }
    }

    public boolean seek(int i) {
        MediaPlayer mediaPlayer = this.f7076b;
        if (mediaPlayer == null) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else if (!this.f7077c) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        } else {
            try {
                mediaPlayer.seekTo(i);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                String str = f7075a;
                Log.e(str, "MediaPlayer seek exception. " + e.toString());
                return true;
            }
        }
    }

    public boolean setLoop(boolean z) {
        if (this.f7076b == null) {
            Log.e(f7075a, "MediaPlayer is null!");
            return false;
        }
        String str = f7075a;
        Log.i(str, "set isLoop " + z);
        this.f7076b.setLooping(z);
        return true;
    }

    public void setDataSource(String str) {
        if (this.f7076b == null) {
            init();
        }
        if (!str.equals(this.f7079e) || !this.f7077c || !this.f7076b.isPlaying()) {
            try {
                this.f7076b.reset();
                this.f7076b.setDataSource(str);
            } catch (Exception e) {
                e.printStackTrace();
                String str2 = f7075a;
                Log.e(str2, "MediaPlayer setDataSource exception. " + e.toString());
            }
            this.f7079e = str;
        }
    }
}
