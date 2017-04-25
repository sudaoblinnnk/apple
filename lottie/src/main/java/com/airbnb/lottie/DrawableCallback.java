package com.airbnb.lottie;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;

public interface DrawableCallback {
  public void invalidateDrawable(@NonNull LottieDrawable who);

  public void scheduleDrawable(@NonNull LottieDrawable who, @NonNull Runnable what, long when);

  public void unscheduleDrawable(@NonNull LottieDrawable who, @NonNull Runnable what);

}
